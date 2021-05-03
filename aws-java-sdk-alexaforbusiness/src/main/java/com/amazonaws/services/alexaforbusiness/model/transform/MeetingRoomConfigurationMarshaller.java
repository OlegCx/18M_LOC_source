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
package com.amazonaws.services.alexaforbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MeetingRoomConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MeetingRoomConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> ROOMUTILIZATIONMETRICSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoomUtilizationMetricsEnabled").build();
    private static final MarshallingInfo<StructuredPojo> ENDOFMEETINGREMINDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndOfMeetingReminder").build();
    private static final MarshallingInfo<StructuredPojo> INSTANTBOOKING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstantBooking").build();
    private static final MarshallingInfo<StructuredPojo> REQUIRECHECKIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireCheckIn").build();

    private static final MeetingRoomConfigurationMarshaller instance = new MeetingRoomConfigurationMarshaller();

    public static MeetingRoomConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MeetingRoomConfiguration meetingRoomConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (meetingRoomConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(meetingRoomConfiguration.getRoomUtilizationMetricsEnabled(), ROOMUTILIZATIONMETRICSENABLED_BINDING);
            protocolMarshaller.marshall(meetingRoomConfiguration.getEndOfMeetingReminder(), ENDOFMEETINGREMINDER_BINDING);
            protocolMarshaller.marshall(meetingRoomConfiguration.getInstantBooking(), INSTANTBOOKING_BINDING);
            protocolMarshaller.marshall(meetingRoomConfiguration.getRequireCheckIn(), REQUIRECHECKIN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
