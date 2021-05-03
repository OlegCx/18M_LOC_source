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
package com.amazonaws.services.sagemakerruntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakerruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InvokeEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InvokeEndpointRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> BODY_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("Content-Type").build();
    private static final MarshallingInfo<String> ACCEPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("Accept").build();
    private static final MarshallingInfo<String> CUSTOMATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-Custom-Attributes").build();
    private static final MarshallingInfo<String> TARGETMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-Target-Model").build();
    private static final MarshallingInfo<String> TARGETVARIANT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-Target-Variant").build();
    private static final MarshallingInfo<String> TARGETCONTAINERHOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-Target-Container-Hostname").build();
    private static final MarshallingInfo<String> INFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-Inference-Id").build();

    private static final InvokeEndpointRequestMarshaller instance = new InvokeEndpointRequestMarshaller();

    public static InvokeEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InvokeEndpointRequest invokeEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (invokeEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(invokeEndpointRequest.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(invokeEndpointRequest.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(invokeEndpointRequest.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(invokeEndpointRequest.getAccept(), ACCEPT_BINDING);
            protocolMarshaller.marshall(invokeEndpointRequest.getCustomAttributes(), CUSTOMATTRIBUTES_BINDING);
            protocolMarshaller.marshall(invokeEndpointRequest.getTargetModel(), TARGETMODEL_BINDING);
            protocolMarshaller.marshall(invokeEndpointRequest.getTargetVariant(), TARGETVARIANT_BINDING);
            protocolMarshaller.marshall(invokeEndpointRequest.getTargetContainerHostname(), TARGETCONTAINERHOSTNAME_BINDING);
            protocolMarshaller.marshall(invokeEndpointRequest.getInferenceId(), INFERENCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
