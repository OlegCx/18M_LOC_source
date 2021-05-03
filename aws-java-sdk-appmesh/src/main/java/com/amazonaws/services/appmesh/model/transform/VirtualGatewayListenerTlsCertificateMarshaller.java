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
 * VirtualGatewayListenerTlsCertificateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VirtualGatewayListenerTlsCertificateMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acm").build();
    private static final MarshallingInfo<StructuredPojo> FILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("file").build();
    private static final MarshallingInfo<StructuredPojo> SDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sds").build();

    private static final VirtualGatewayListenerTlsCertificateMarshaller instance = new VirtualGatewayListenerTlsCertificateMarshaller();

    public static VirtualGatewayListenerTlsCertificateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VirtualGatewayListenerTlsCertificate virtualGatewayListenerTlsCertificate, ProtocolMarshaller protocolMarshaller) {

        if (virtualGatewayListenerTlsCertificate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(virtualGatewayListenerTlsCertificate.getAcm(), ACM_BINDING);
            protocolMarshaller.marshall(virtualGatewayListenerTlsCertificate.getFile(), FILE_BINDING);
            protocolMarshaller.marshall(virtualGatewayListenerTlsCertificate.getSds(), SDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
