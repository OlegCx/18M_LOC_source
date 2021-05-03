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
 * Fmp4HlsSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Fmp4HlsSettingsMarshaller {

    private static final MarshallingInfo<String> AUDIORENDITIONSETS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioRenditionSets").build();
    private static final MarshallingInfo<String> NIELSENID3BEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nielsenId3Behavior").build();
    private static final MarshallingInfo<String> TIMEDMETADATABEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataBehavior").build();

    private static final Fmp4HlsSettingsMarshaller instance = new Fmp4HlsSettingsMarshaller();

    public static Fmp4HlsSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Fmp4HlsSettings fmp4HlsSettings, ProtocolMarshaller protocolMarshaller) {

        if (fmp4HlsSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fmp4HlsSettings.getAudioRenditionSets(), AUDIORENDITIONSETS_BINDING);
            protocolMarshaller.marshall(fmp4HlsSettings.getNielsenId3Behavior(), NIELSENID3BEHAVIOR_BINDING);
            protocolMarshaller.marshall(fmp4HlsSettings.getTimedMetadataBehavior(), TIMEDMETADATABEHAVIOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
