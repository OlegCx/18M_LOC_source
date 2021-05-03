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
package com.amazonaws.services.mediatailor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScheduleEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduleEntryMarshaller {

    private static final MarshallingInfo<Long> APPROXIMATEDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApproximateDurationSeconds").build();
    private static final MarshallingInfo<java.util.Date> APPROXIMATESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApproximateStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelName").build();
    private static final MarshallingInfo<String> PROGRAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgramName").build();
    private static final MarshallingInfo<String> SOURCELOCATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceLocationName").build();
    private static final MarshallingInfo<String> VODSOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VodSourceName").build();

    private static final ScheduleEntryMarshaller instance = new ScheduleEntryMarshaller();

    public static ScheduleEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScheduleEntry scheduleEntry, ProtocolMarshaller protocolMarshaller) {

        if (scheduleEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scheduleEntry.getApproximateDurationSeconds(), APPROXIMATEDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(scheduleEntry.getApproximateStartTime(), APPROXIMATESTARTTIME_BINDING);
            protocolMarshaller.marshall(scheduleEntry.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(scheduleEntry.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(scheduleEntry.getProgramName(), PROGRAMNAME_BINDING);
            protocolMarshaller.marshall(scheduleEntry.getSourceLocationName(), SOURCELOCATIONNAME_BINDING);
            protocolMarshaller.marshall(scheduleEntry.getVodSourceName(), VODSOURCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
