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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeConfigurationRecorderStatusRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeConfigurationRecorderStatusRequestProtocolMarshaller implements
        Marshaller<Request<DescribeConfigurationRecorderStatusRequest>, DescribeConfigurationRecorderStatusRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.AWS_JSON).requestUri("/")
            .httpMethodName(HttpMethodName.POST).hasExplicitPayloadMember(false).hasPayloadMembers(true)
            .operationIdentifier("StarlingDoveService.DescribeConfigurationRecorderStatus").serviceName("AmazonConfig").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public DescribeConfigurationRecorderStatusRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeConfigurationRecorderStatusRequest> marshall(DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest) {

        if (describeConfigurationRecorderStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<DescribeConfigurationRecorderStatusRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, describeConfigurationRecorderStatusRequest);

            protocolMarshaller.startMarshalling();
            DescribeConfigurationRecorderStatusRequestMarshaller.getInstance().marshall(describeConfigurationRecorderStatusRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
