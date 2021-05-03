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
package com.amazonaws.services.mediaconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransportMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransportMarshaller {

    private static final MarshallingInfo<List> CIDRALLOWLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cidrAllowList").build();
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
    private static final MarshallingInfo<Integer> MAXLATENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxLatency").build();
    private static final MarshallingInfo<Integer> MINLATENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minLatency").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<String> REMOTEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("remoteId").build();
    private static final MarshallingInfo<Integer> SMOOTHINGLATENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("smoothingLatency").build();
    private static final MarshallingInfo<String> STREAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("streamId").build();

    private static final TransportMarshaller instance = new TransportMarshaller();

    public static TransportMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Transport transport, ProtocolMarshaller protocolMarshaller) {

        if (transport == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transport.getCidrAllowList(), CIDRALLOWLIST_BINDING);
            protocolMarshaller.marshall(transport.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(transport.getMaxLatency(), MAXLATENCY_BINDING);
            protocolMarshaller.marshall(transport.getMinLatency(), MINLATENCY_BINDING);
            protocolMarshaller.marshall(transport.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(transport.getRemoteId(), REMOTEID_BINDING);
            protocolMarshaller.marshall(transport.getSmoothingLatency(), SMOOTHINGLATENCY_BINDING);
            protocolMarshaller.marshall(transport.getStreamId(), STREAMID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
