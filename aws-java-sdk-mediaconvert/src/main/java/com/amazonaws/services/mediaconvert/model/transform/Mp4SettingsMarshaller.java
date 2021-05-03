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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Mp4SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Mp4SettingsMarshaller {

    private static final MarshallingInfo<String> AUDIODURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioDuration").build();
    private static final MarshallingInfo<String> CSLGATOM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cslgAtom").build();
    private static final MarshallingInfo<Integer> CTTSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cttsVersion").build();
    private static final MarshallingInfo<String> FREESPACEBOX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("freeSpaceBox").build();
    private static final MarshallingInfo<String> MOOVPLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("moovPlacement").build();
    private static final MarshallingInfo<String> MP4MAJORBRAND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mp4MajorBrand").build();

    private static final Mp4SettingsMarshaller instance = new Mp4SettingsMarshaller();

    public static Mp4SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Mp4Settings mp4Settings, ProtocolMarshaller protocolMarshaller) {

        if (mp4Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mp4Settings.getAudioDuration(), AUDIODURATION_BINDING);
            protocolMarshaller.marshall(mp4Settings.getCslgAtom(), CSLGATOM_BINDING);
            protocolMarshaller.marshall(mp4Settings.getCttsVersion(), CTTSVERSION_BINDING);
            protocolMarshaller.marshall(mp4Settings.getFreeSpaceBox(), FREESPACEBOX_BINDING);
            protocolMarshaller.marshall(mp4Settings.getMoovPlacement(), MOOVPLACEMENT_BINDING);
            protocolMarshaller.marshall(mp4Settings.getMp4MajorBrand(), MP4MAJORBRAND_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
