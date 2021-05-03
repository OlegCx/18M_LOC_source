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
 * UpdateProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateProfileRequestMarshaller {

    private static final MarshallingInfo<String> PROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileArn").build();
    private static final MarshallingInfo<String> PROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileName").build();
    private static final MarshallingInfo<Boolean> ISDEFAULT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsDefault").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timezone").build();
    private static final MarshallingInfo<String> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address").build();
    private static final MarshallingInfo<String> DISTANCEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DistanceUnit").build();
    private static final MarshallingInfo<String> TEMPERATUREUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemperatureUnit").build();
    private static final MarshallingInfo<String> WAKEWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WakeWord").build();
    private static final MarshallingInfo<String> LOCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Locale").build();
    private static final MarshallingInfo<Boolean> SETUPMODEDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SetupModeDisabled").build();
    private static final MarshallingInfo<Integer> MAXVOLUMELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxVolumeLimit").build();
    private static final MarshallingInfo<Boolean> PSTNENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PSTNEnabled").build();
    private static final MarshallingInfo<Boolean> DATARETENTIONOPTIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRetentionOptIn").build();
    private static final MarshallingInfo<StructuredPojo> MEETINGROOMCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeetingRoomConfiguration").build();

    private static final UpdateProfileRequestMarshaller instance = new UpdateProfileRequestMarshaller();

    public static UpdateProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateProfileRequest updateProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateProfileRequest.getProfileArn(), PROFILEARN_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getProfileName(), PROFILENAME_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getIsDefault(), ISDEFAULT_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getTimezone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getDistanceUnit(), DISTANCEUNIT_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getTemperatureUnit(), TEMPERATUREUNIT_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getWakeWord(), WAKEWORD_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getLocale(), LOCALE_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getSetupModeDisabled(), SETUPMODEDISABLED_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getMaxVolumeLimit(), MAXVOLUMELIMIT_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getPSTNEnabled(), PSTNENABLED_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getDataRetentionOptIn(), DATARETENTIONOPTIN_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getMeetingRoomConfiguration(), MEETINGROOMCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
