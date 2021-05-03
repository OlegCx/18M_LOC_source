/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import static com.amazonaws.SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.amazonaws.util.EC2MetadataUtils;

/**
 * Mock server for imitating the Amazon EC2 Instance Metadata Service. Tests can
 * use this class to start up a server on a localhost port, and control what
 * response the server will send when a connection is made.
 */
public class EC2MetadataServiceMock {

    private EC2MockMetadataServiceListenerThread hosmMockServerThread;
    private boolean tokenEnabled;

    public EC2MetadataServiceMock(boolean tokenEnabled) {
        this.tokenEnabled = tokenEnabled;
    }

    private static final String OUTPUT_HEADERS = "HTTP/1.1 200 OK\r\n" +
                                                 "Content-Type: text/html\r\n" +
                                                 "Content-Length: ";

    private static final String OUTPUT_END_OF_HEADERS = "\r\n\r\n";

    /**
     * Sets the content that should be sent back as the response from this mock server.
     */
    public void setResponseContent(String responseContent) {
        hosmMockServerThread.setResponseContent(responseContent);
    }

    /**
     * Accepts a newline delimited list of security credential names that the
     * mock metadata service should advertise as available.
     *
     * @param securityCredentialNames
     *            A newline delimited list of security credentials that the
     *            metadata service will advertise as available.
     */
    public void setAvailableSecurityCredentials(String securityCredentialNames) {
        hosmMockServerThread.setAvailableSecurityCredentials(securityCredentialNames);
    }

    public void start() throws IOException {
        hosmMockServerThread = new EC2MockMetadataServiceListenerThread(startServerSocket(), tokenEnabled);
        hosmMockServerThread.start();
    }

    public void stop() {
        hosmMockServerThread.stopServer();
    }

    private ServerSocket startServerSocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(0);

            System.setProperty(EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY, "http://localhost:" + serverSocket.getLocalPort());
            System.out.println("Started mock metadata service at: " + System.getProperty(EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY));

            return serverSocket;
        } catch (IOException ioe) {
            throw new RuntimeException("Unable to start mock EC2 metadata server", ioe);
        }
    }

    /**
     * Thread subclass that listens for connections on an opened server socket
     * and response with a predefined response file.
     */
    private static class EC2MockMetadataServiceListenerThread extends Thread {
        private ServerSocket serverSocket;
        private String responseContent;
        private String securityCredentialNames;
        private boolean tokenEnabled;

        public EC2MockMetadataServiceListenerThread(ServerSocket serverSocket, boolean tokenEnabled) {
            this.serverSocket = serverSocket;
            this.tokenEnabled = tokenEnabled;
        }

        public void setResponseContent(String responseContent) {
            this.responseContent = responseContent;
        }

        public void setAvailableSecurityCredentials(String securityCredentialNames) {
            this.securityCredentialNames = securityCredentialNames;
        }

        @Override
        public void run() {
            while (true) {
                Socket socket = null;
                try {
                    socket = serverSocket.accept();
                } catch (IOException e) {
                    // Just exit if the socket gets shut down while we're waiting
                    return;
                }

                OutputStream outputStream = null;
                try {
                    outputStream = socket.getOutputStream();
                    InputStream inputStream = socket.getInputStream();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    String requestLine = reader.readLine();

                    String[] strings = requestLine.split(" ");
                    String resourcePath = strings[1];


                    String httpResponse = null;

                    if (resourcePath.equals("/latest/api/token")) {

                        httpResponse = formTokenHttpResponse();
                        outputStream.write(httpResponse.getBytes());

                    } else if (resourcePath.equals(EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE)) {

                        httpResponse = formHttpResponse(securityCredentialNames);
                        outputStream.write(httpResponse.getBytes());

                    } else if (resourcePath.equals(EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE + securityCredentialNames)) {

                        System.out.println("Serving: " + responseContent);
                        httpResponse = formHttpResponse(responseContent);
                        outputStream.write(httpResponse.getBytes());

                    } else {
                        throw new RuntimeException("Unknown resource requested: " + resourcePath);
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Unable to respond to request", e);
                } finally {
                    try {outputStream.close();} catch (Exception e) {}
                }
            }
        }

        private String formHttpResponse(String content){

            StringBuilder outputStringToWrite = new StringBuilder(OUTPUT_HEADERS);
            outputStringToWrite.append(content.length());
            outputStringToWrite.append(OUTPUT_END_OF_HEADERS);
            outputStringToWrite.append(content);
            return outputStringToWrite.toString();
        }

        private String formTokenHttpResponse() {
            String token = "123456";
            StringBuilder sb = new StringBuilder();
            if (tokenEnabled) {
                sb.append(OUTPUT_HEADERS);
                sb.append(token.length());
                sb.append(OUTPUT_END_OF_HEADERS);
                sb.append(token);
            } else {
                sb.append("HTTP/1.1 404 Not Found\n");
                sb.append(OUTPUT_END_OF_HEADERS);
            }
            return sb.toString();
        }

        public void stopServer() {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException("Unable to stop server", e);
                }
            }
        }
    }
}
