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
 * CmfcSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CmfcSettingsMarshaller {

    private static final MarshallingInfo<String> AUDIODURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioDuration").build();
    private static final MarshallingInfo<String> AUDIOGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioGroupId").build();
    private static final MarshallingInfo<String> AUDIORENDITIONSETS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioRenditionSets").build();
    private static final MarshallingInfo<String> AUDIOTRACKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioTrackType").build();
    private static final MarshallingInfo<String> DESCRIPTIVEVIDEOSERVICEFLAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("descriptiveVideoServiceFlag").build();
    private static final MarshallingInfo<String> IFRAMEONLYMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iFrameOnlyManifest").build();
    private static final MarshallingInfo<String> SCTE35ESAM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Esam").build();
    private static final MarshallingInfo<String> SCTE35SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Source").build();

    private static final CmfcSettingsMarshaller instance = new CmfcSettingsMarshaller();

    public static CmfcSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CmfcSettings cmfcSettings, ProtocolMarshaller protocolMarshaller) {

        if (cmfcSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cmfcSettings.getAudioDuration(), AUDIODURATION_BINDING);
            protocolMarshaller.marshall(cmfcSettings.getAudioGroupId(), AUDIOGROUPID_BINDING);
            protocolMarshaller.marshall(cmfcSettings.getAudioRenditionSets(), AUDIORENDITIONSETS_BINDING);
            protocolMarshaller.marshall(cmfcSettings.getAudioTrackType(), AUDIOTRACKTYPE_BINDING);
            protocolMarshaller.marshall(cmfcSettings.getDescriptiveVideoServiceFlag(), DESCRIPTIVEVIDEOSERVICEFLAG_BINDING);
            protocolMarshaller.marshall(cmfcSettings.getIFrameOnlyManifest(), IFRAMEONLYMANIFEST_BINDING);
            protocolMarshaller.marshall(cmfcSettings.getScte35Esam(), SCTE35ESAM_BINDING);
            protocolMarshaller.marshall(cmfcSettings.getScte35Source(), SCTE35SOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
