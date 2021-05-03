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
 * HlsOutputSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsOutputSettingsMarshaller {

    private static final MarshallingInfo<String> H265PACKAGINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("h265PackagingType").build();
    private static final MarshallingInfo<StructuredPojo> HLSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsSettings").build();
    private static final MarshallingInfo<String> NAMEMODIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nameModifier").build();
    private static final MarshallingInfo<String> SEGMENTMODIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentModifier").build();

    private static final HlsOutputSettingsMarshaller instance = new HlsOutputSettingsMarshaller();

    public static HlsOutputSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsOutputSettings hlsOutputSettings, ProtocolMarshaller protocolMarshaller) {

        if (hlsOutputSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsOutputSettings.getH265PackagingType(), H265PACKAGINGTYPE_BINDING);
            protocolMarshaller.marshall(hlsOutputSettings.getHlsSettings(), HLSSETTINGS_BINDING);
            protocolMarshaller.marshall(hlsOutputSettings.getNameModifier(), NAMEMODIFIER_BINDING);
            protocolMarshaller.marshall(hlsOutputSettings.getSegmentModifier(), SEGMENTMODIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
