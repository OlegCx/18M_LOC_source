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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterPatchBaselineForPatchGroupRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterPatchBaselineForPatchGroupRequestProtocolMarshaller implements
        Marshaller<Request<RegisterPatchBaselineForPatchGroupRequest>, RegisterPatchBaselineForPatchGroupRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.AWS_JSON).requestUri("/")
            .httpMethodName(HttpMethodName.POST).hasExplicitPayloadMember(false).hasPayloadMembers(true)
            .operationIdentifier("AmazonSSM.RegisterPatchBaselineForPatchGroup").serviceName("AWSSimpleSystemsManagement").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public RegisterPatchBaselineForPatchGroupRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterPatchBaselineForPatchGroupRequest> marshall(RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest) {

        if (registerPatchBaselineForPatchGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<RegisterPatchBaselineForPatchGroupRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, registerPatchBaselineForPatchGroupRequest);

            protocolMarshaller.startMarshalling();
            RegisterPatchBaselineForPatchGroupRequestMarshaller.getInstance().marshall(registerPatchBaselineForPatchGroupRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
