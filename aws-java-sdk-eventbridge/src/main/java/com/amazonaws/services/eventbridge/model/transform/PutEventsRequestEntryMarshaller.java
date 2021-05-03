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
package com.amazonaws.services.eventbridge.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eventbridge.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutEventsRequestEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutEventsRequestEntryMarshaller {

    private static final MarshallingInfo<java.util.Date> TIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Time").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Source").build();
    private static final MarshallingInfo<List> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Resources").build();
    private static final MarshallingInfo<String> DETAILTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetailType").build();
    private static final MarshallingInfo<String> DETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Detail").build();
    private static final MarshallingInfo<String> EVENTBUSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventBusName").build();
    private static final MarshallingInfo<String> TRACEHEADER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TraceHeader").build();

    private static final PutEventsRequestEntryMarshaller instance = new PutEventsRequestEntryMarshaller();

    public static PutEventsRequestEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutEventsRequestEntry putEventsRequestEntry, ProtocolMarshaller protocolMarshaller) {

        if (putEventsRequestEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putEventsRequestEntry.getTime(), TIME_BINDING);
            protocolMarshaller.marshall(putEventsRequestEntry.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(putEventsRequestEntry.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(putEventsRequestEntry.getDetailType(), DETAILTYPE_BINDING);
            protocolMarshaller.marshall(putEventsRequestEntry.getDetail(), DETAIL_BINDING);
            protocolMarshaller.marshall(putEventsRequestEntry.getEventBusName(), EVENTBUSNAME_BINDING);
            protocolMarshaller.marshall(putEventsRequestEntry.getTraceHeader(), TRACEHEADER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
