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
package com.amazonaws.services.appmesh.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListenerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListenerMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONNECTIONPOOL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionPool").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthCheck").build();
    private static final MarshallingInfo<StructuredPojo> OUTLIERDETECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outlierDetection").build();
    private static final MarshallingInfo<StructuredPojo> PORTMAPPING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portMapping").build();
    private static final MarshallingInfo<StructuredPojo> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeout").build();
    private static final MarshallingInfo<StructuredPojo> TLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tls").build();

    private static final ListenerMarshaller instance = new ListenerMarshaller();

    public static ListenerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Listener listener, ProtocolMarshaller protocolMarshaller) {

        if (listener == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listener.getConnectionPool(), CONNECTIONPOOL_BINDING);
            protocolMarshaller.marshall(listener.getHealthCheck(), HEALTHCHECK_BINDING);
            protocolMarshaller.marshall(listener.getOutlierDetection(), OUTLIERDETECTION_BINDING);
            protocolMarshaller.marshall(listener.getPortMapping(), PORTMAPPING_BINDING);
            protocolMarshaller.marshall(listener.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(listener.getTls(), TLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
