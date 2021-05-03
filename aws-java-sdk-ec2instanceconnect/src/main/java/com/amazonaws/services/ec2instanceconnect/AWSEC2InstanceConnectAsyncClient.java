/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2instanceconnect;

import javax.annotation.Generated;

import com.amazonaws.services.ec2instanceconnect.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing EC2 Instance Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EC2 Instance Connect enables system administrators to publish one-time use SSH public keys to EC2, providing
 * users a simple and secure way to connect to their instances.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSEC2InstanceConnectAsyncClient extends AWSEC2InstanceConnectClient implements AWSEC2InstanceConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSEC2InstanceConnectAsyncClientBuilder asyncBuilder() {
        return AWSEC2InstanceConnectAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EC2 Instance Connect using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSEC2InstanceConnectAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EC2 Instance Connect using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSEC2InstanceConnectAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<SendSSHPublicKeyResult> sendSSHPublicKeyAsync(SendSSHPublicKeyRequest request) {

        return sendSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendSSHPublicKeyResult> sendSSHPublicKeyAsync(final SendSSHPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendSSHPublicKeyRequest, SendSSHPublicKeyResult> asyncHandler) {
        final SendSSHPublicKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendSSHPublicKeyResult>() {
            @Override
            public SendSSHPublicKeyResult call() throws Exception {
                SendSSHPublicKeyResult result = null;

                try {
                    result = executeSendSSHPublicKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendSerialConsoleSSHPublicKeyResult> sendSerialConsoleSSHPublicKeyAsync(SendSerialConsoleSSHPublicKeyRequest request) {

        return sendSerialConsoleSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendSerialConsoleSSHPublicKeyResult> sendSerialConsoleSSHPublicKeyAsync(
            final SendSerialConsoleSSHPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendSerialConsoleSSHPublicKeyRequest, SendSerialConsoleSSHPublicKeyResult> asyncHandler) {
        final SendSerialConsoleSSHPublicKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendSerialConsoleSSHPublicKeyResult>() {
            @Override
            public SendSerialConsoleSSHPublicKeyResult call() throws Exception {
                SendSerialConsoleSSHPublicKeyResult result = null;

                try {
                    result = executeSendSerialConsoleSSHPublicKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
