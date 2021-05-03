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
 * H264ColorSpaceSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class H264ColorSpaceSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> COLORSPACEPASSTHROUGHSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorSpacePassthroughSettings").build();
    private static final MarshallingInfo<StructuredPojo> REC601SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rec601Settings").build();
    private static final MarshallingInfo<StructuredPojo> REC709SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rec709Settings").build();

    private static final H264ColorSpaceSettingsMarshaller instance = new H264ColorSpaceSettingsMarshaller();

    public static H264ColorSpaceSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(H264ColorSpaceSettings h264ColorSpaceSettings, ProtocolMarshaller protocolMarshaller) {

        if (h264ColorSpaceSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(h264ColorSpaceSettings.getColorSpacePassthroughSettings(), COLORSPACEPASSTHROUGHSETTINGS_BINDING);
            protocolMarshaller.marshall(h264ColorSpaceSettings.getRec601Settings(), REC601SETTINGS_BINDING);
            protocolMarshaller.marshall(h264ColorSpaceSettings.getRec709Settings(), REC709SETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
