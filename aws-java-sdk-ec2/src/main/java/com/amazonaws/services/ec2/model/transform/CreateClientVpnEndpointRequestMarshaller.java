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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateClientVpnEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClientVpnEndpointRequestMarshaller implements Marshaller<Request<CreateClientVpnEndpointRequest>, CreateClientVpnEndpointRequest> {

    public Request<CreateClientVpnEndpointRequest> marshall(CreateClientVpnEndpointRequest createClientVpnEndpointRequest) {

        if (createClientVpnEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateClientVpnEndpointRequest> request = new DefaultRequest<CreateClientVpnEndpointRequest>(createClientVpnEndpointRequest, "AmazonEC2");
        request.addParameter("Action", "CreateClientVpnEndpoint");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createClientVpnEndpointRequest.getClientCidrBlock() != null) {
            request.addParameter("ClientCidrBlock", StringUtils.fromString(createClientVpnEndpointRequest.getClientCidrBlock()));
        }

        if (createClientVpnEndpointRequest.getServerCertificateArn() != null) {
            request.addParameter("ServerCertificateArn", StringUtils.fromString(createClientVpnEndpointRequest.getServerCertificateArn()));
        }

        com.amazonaws.internal.SdkInternalList<ClientVpnAuthenticationRequest> createClientVpnEndpointRequestAuthenticationOptionsList = (com.amazonaws.internal.SdkInternalList<ClientVpnAuthenticationRequest>) createClientVpnEndpointRequest
                .getAuthenticationOptions();
        if (!createClientVpnEndpointRequestAuthenticationOptionsList.isEmpty() || !createClientVpnEndpointRequestAuthenticationOptionsList.isAutoConstruct()) {
            int authenticationOptionsListIndex = 1;

            for (ClientVpnAuthenticationRequest createClientVpnEndpointRequestAuthenticationOptionsListValue : createClientVpnEndpointRequestAuthenticationOptionsList) {

                if (createClientVpnEndpointRequestAuthenticationOptionsListValue.getType() != null) {
                    request.addParameter("Authentication." + authenticationOptionsListIndex + ".Type",
                            StringUtils.fromString(createClientVpnEndpointRequestAuthenticationOptionsListValue.getType()));
                }

                DirectoryServiceAuthenticationRequest activeDirectory = createClientVpnEndpointRequestAuthenticationOptionsListValue.getActiveDirectory();
                if (activeDirectory != null) {

                    if (activeDirectory.getDirectoryId() != null) {
                        request.addParameter("Authentication." + authenticationOptionsListIndex + ".ActiveDirectory.DirectoryId",
                                StringUtils.fromString(activeDirectory.getDirectoryId()));
                    }
                }

                CertificateAuthenticationRequest mutualAuthentication = createClientVpnEndpointRequestAuthenticationOptionsListValue.getMutualAuthentication();
                if (mutualAuthentication != null) {

                    if (mutualAuthentication.getClientRootCertificateChainArn() != null) {
                        request.addParameter("Authentication." + authenticationOptionsListIndex + ".MutualAuthentication.ClientRootCertificateChainArn",
                                StringUtils.fromString(mutualAuthentication.getClientRootCertificateChainArn()));
                    }
                }

                FederatedAuthenticationRequest federatedAuthentication = createClientVpnEndpointRequestAuthenticationOptionsListValue
                        .getFederatedAuthentication();
                if (federatedAuthentication != null) {

                    if (federatedAuthentication.getSAMLProviderArn() != null) {
                        request.addParameter("Authentication." + authenticationOptionsListIndex + ".FederatedAuthentication.SAMLProviderArn",
                                StringUtils.fromString(federatedAuthentication.getSAMLProviderArn()));
                    }

                    if (federatedAuthentication.getSelfServiceSAMLProviderArn() != null) {
                        request.addParameter("Authentication." + authenticationOptionsListIndex + ".FederatedAuthentication.SelfServiceSAMLProviderArn",
                                StringUtils.fromString(federatedAuthentication.getSelfServiceSAMLProviderArn()));
                    }
                }
                authenticationOptionsListIndex++;
            }
        }

        ConnectionLogOptions connectionLogOptions = createClientVpnEndpointRequest.getConnectionLogOptions();
        if (connectionLogOptions != null) {

            if (connectionLogOptions.getEnabled() != null) {
                request.addParameter("ConnectionLogOptions.Enabled", StringUtils.fromBoolean(connectionLogOptions.getEnabled()));
            }

            if (connectionLogOptions.getCloudwatchLogGroup() != null) {
                request.addParameter("ConnectionLogOptions.CloudwatchLogGroup", StringUtils.fromString(connectionLogOptions.getCloudwatchLogGroup()));
            }

            if (connectionLogOptions.getCloudwatchLogStream() != null) {
                request.addParameter("ConnectionLogOptions.CloudwatchLogStream", StringUtils.fromString(connectionLogOptions.getCloudwatchLogStream()));
            }
        }

        com.amazonaws.internal.SdkInternalList<String> createClientVpnEndpointRequestDnsServersList = (com.amazonaws.internal.SdkInternalList<String>) createClientVpnEndpointRequest
                .getDnsServers();
        if (!createClientVpnEndpointRequestDnsServersList.isEmpty() || !createClientVpnEndpointRequestDnsServersList.isAutoConstruct()) {
            int dnsServersListIndex = 1;

            for (String createClientVpnEndpointRequestDnsServersListValue : createClientVpnEndpointRequestDnsServersList) {
                if (createClientVpnEndpointRequestDnsServersListValue != null) {
                    request.addParameter("DnsServers." + dnsServersListIndex, StringUtils.fromString(createClientVpnEndpointRequestDnsServersListValue));
                }
                dnsServersListIndex++;
            }
        }

        if (createClientVpnEndpointRequest.getTransportProtocol() != null) {
            request.addParameter("TransportProtocol", StringUtils.fromString(createClientVpnEndpointRequest.getTransportProtocol()));
        }

        if (createClientVpnEndpointRequest.getVpnPort() != null) {
            request.addParameter("VpnPort", StringUtils.fromInteger(createClientVpnEndpointRequest.getVpnPort()));
        }

        if (createClientVpnEndpointRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createClientVpnEndpointRequest.getDescription()));
        }

        if (createClientVpnEndpointRequest.getSplitTunnel() != null) {
            request.addParameter("SplitTunnel", StringUtils.fromBoolean(createClientVpnEndpointRequest.getSplitTunnel()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createClientVpnEndpointRequest.getClientToken()));

        com.amazonaws.internal.SdkInternalList<TagSpecification> createClientVpnEndpointRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createClientVpnEndpointRequest
                .getTagSpecifications();
        if (!createClientVpnEndpointRequestTagSpecificationsList.isEmpty() || !createClientVpnEndpointRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createClientVpnEndpointRequestTagSpecificationsListValue : createClientVpnEndpointRequestTagSpecificationsList) {

                if (createClientVpnEndpointRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createClientVpnEndpointRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createClientVpnEndpointRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> createClientVpnEndpointRequestSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createClientVpnEndpointRequest
                .getSecurityGroupIds();
        if (!createClientVpnEndpointRequestSecurityGroupIdsList.isEmpty() || !createClientVpnEndpointRequestSecurityGroupIdsList.isAutoConstruct()) {
            int securityGroupIdsListIndex = 1;

            for (String createClientVpnEndpointRequestSecurityGroupIdsListValue : createClientVpnEndpointRequestSecurityGroupIdsList) {
                if (createClientVpnEndpointRequestSecurityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupId." + securityGroupIdsListIndex,
                            StringUtils.fromString(createClientVpnEndpointRequestSecurityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (createClientVpnEndpointRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(createClientVpnEndpointRequest.getVpcId()));
        }

        if (createClientVpnEndpointRequest.getSelfServicePortal() != null) {
            request.addParameter("SelfServicePortal", StringUtils.fromString(createClientVpnEndpointRequest.getSelfServicePortal()));
        }

        ClientConnectOptions clientConnectOptions = createClientVpnEndpointRequest.getClientConnectOptions();
        if (clientConnectOptions != null) {

            if (clientConnectOptions.getEnabled() != null) {
                request.addParameter("ClientConnectOptions.Enabled", StringUtils.fromBoolean(clientConnectOptions.getEnabled()));
            }

            if (clientConnectOptions.getLambdaFunctionArn() != null) {
                request.addParameter("ClientConnectOptions.LambdaFunctionArn", StringUtils.fromString(clientConnectOptions.getLambdaFunctionArn()));
            }
        }

        return request;
    }

}
