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
 * HlsSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> AUDIOONLYHLSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioOnlyHlsSettings").build();
    private static final MarshallingInfo<StructuredPojo> FMP4HLSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fmp4HlsSettings").build();
    private static final MarshallingInfo<StructuredPojo> FRAMECAPTUREHLSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frameCaptureHlsSettings").build();
    private static final MarshallingInfo<StructuredPojo> STANDARDHLSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("standardHlsSettings").build();

    private static final HlsSettingsMarshaller instance = new HlsSettingsMarshaller();

    public static HlsSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsSettings hlsSettings, ProtocolMarshaller protocolMarshaller) {

        if (hlsSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsSettings.getAudioOnlyHlsSettings(), AUDIOONLYHLSSETTINGS_BINDING);
            protocolMarshaller.marshall(hlsSettings.getFmp4HlsSettings(), FMP4HLSSETTINGS_BINDING);
            protocolMarshaller.marshall(hlsSettings.getFrameCaptureHlsSettings(), FRAMECAPTUREHLSSETTINGS_BINDING);
            protocolMarshaller.marshall(hlsSettings.getStandardHlsSettings(), STANDARDHLSSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
