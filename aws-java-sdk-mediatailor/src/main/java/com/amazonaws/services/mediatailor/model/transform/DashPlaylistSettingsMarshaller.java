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
 * DashPlaylistSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DashPlaylistSettingsMarshaller {

    private static final MarshallingInfo<Integer> MANIFESTWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestWindowSeconds").build();
    private static final MarshallingInfo<Integer> MINBUFFERTIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinBufferTimeSeconds").build();
    private static final MarshallingInfo<Integer> MINUPDATEPERIODSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinUpdatePeriodSeconds").build();
    private static final MarshallingInfo<Integer> SUGGESTEDPRESENTATIONDELAYSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuggestedPresentationDelaySeconds").build();

    private static final DashPlaylistSettingsMarshaller instance = new DashPlaylistSettingsMarshaller();

    public static DashPlaylistSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DashPlaylistSettings dashPlaylistSettings, ProtocolMarshaller protocolMarshaller) {

        if (dashPlaylistSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dashPlaylistSettings.getManifestWindowSeconds(), MANIFESTWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(dashPlaylistSettings.getMinBufferTimeSeconds(), MINBUFFERTIMESECONDS_BINDING);
            protocolMarshaller.marshall(dashPlaylistSettings.getMinUpdatePeriodSeconds(), MINUPDATEPERIODSECONDS_BINDING);
            protocolMarshaller.marshall(dashPlaylistSettings.getSuggestedPresentationDelaySeconds(), SUGGESTEDPRESENTATIONDELAYSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
