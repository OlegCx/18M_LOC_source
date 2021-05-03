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
package com.amazonaws.services.iotanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChannelSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChannelSummaryMarshaller {

    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channelName").build();
    private static final MarshallingInfo<StructuredPojo> CHANNELSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channelStorage").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMESSAGEARRIVALTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastMessageArrivalTime").timestampFormat("unixTimestamp").build();

    private static final ChannelSummaryMarshaller instance = new ChannelSummaryMarshaller();

    public static ChannelSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChannelSummary channelSummary, ProtocolMarshaller protocolMarshaller) {

        if (channelSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(channelSummary.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(channelSummary.getChannelStorage(), CHANNELSTORAGE_BINDING);
            protocolMarshaller.marshall(channelSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(channelSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(channelSummary.getLastUpdateTime(), LASTUPDATETIME_BINDING);
            protocolMarshaller.marshall(channelSummary.getLastMessageArrivalTime(), LASTMESSAGEARRIVALTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
