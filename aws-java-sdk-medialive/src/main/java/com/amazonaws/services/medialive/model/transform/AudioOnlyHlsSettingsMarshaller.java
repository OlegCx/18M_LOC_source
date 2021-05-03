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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AudioOnlyHlsSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudioOnlyHlsSettingsMarshaller {

    private static final MarshallingInfo<String> AUDIOGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioGroupId").build();
    private static final MarshallingInfo<StructuredPojo> AUDIOONLYIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioOnlyImage").build();
    private static final MarshallingInfo<String> AUDIOTRACKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioTrackType").build();
    private static final MarshallingInfo<String> SEGMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentType").build();

    private static final AudioOnlyHlsSettingsMarshaller instance = new AudioOnlyHlsSettingsMarshaller();

    public static AudioOnlyHlsSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudioOnlyHlsSettings audioOnlyHlsSettings, ProtocolMarshaller protocolMarshaller) {

        if (audioOnlyHlsSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audioOnlyHlsSettings.getAudioGroupId(), AUDIOGROUPID_BINDING);
            protocolMarshaller.marshall(audioOnlyHlsSettings.getAudioOnlyImage(), AUDIOONLYIMAGE_BINDING);
            protocolMarshaller.marshall(audioOnlyHlsSettings.getAudioTrackType(), AUDIOTRACKTYPE_BINDING);
            protocolMarshaller.marshall(audioOnlyHlsSettings.getSegmentType(), SEGMENTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
