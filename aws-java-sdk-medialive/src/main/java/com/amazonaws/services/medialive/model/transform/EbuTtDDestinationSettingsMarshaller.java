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
 * EbuTtDDestinationSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EbuTtDDestinationSettingsMarshaller {

    private static final MarshallingInfo<String> COPYRIGHTHOLDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("copyrightHolder").build();
    private static final MarshallingInfo<String> FILLLINEGAP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fillLineGap").build();
    private static final MarshallingInfo<String> FONTFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fontFamily").build();
    private static final MarshallingInfo<String> STYLECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("styleControl").build();

    private static final EbuTtDDestinationSettingsMarshaller instance = new EbuTtDDestinationSettingsMarshaller();

    public static EbuTtDDestinationSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EbuTtDDestinationSettings ebuTtDDestinationSettings, ProtocolMarshaller protocolMarshaller) {

        if (ebuTtDDestinationSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ebuTtDDestinationSettings.getCopyrightHolder(), COPYRIGHTHOLDER_BINDING);
            protocolMarshaller.marshall(ebuTtDDestinationSettings.getFillLineGap(), FILLLINEGAP_BINDING);
            protocolMarshaller.marshall(ebuTtDDestinationSettings.getFontFamily(), FONTFAMILY_BINDING);
            protocolMarshaller.marshall(ebuTtDDestinationSettings.getStyleControl(), STYLECONTROL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
