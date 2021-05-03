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
 * AncillarySourceSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AncillarySourceSettingsMarshaller {

    private static final MarshallingInfo<String> CONVERT608TO708_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("convert608To708").build();
    private static final MarshallingInfo<Integer> SOURCEANCILLARYCHANNELNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceAncillaryChannelNumber").build();
    private static final MarshallingInfo<String> TERMINATECAPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("terminateCaptions").build();

    private static final AncillarySourceSettingsMarshaller instance = new AncillarySourceSettingsMarshaller();

    public static AncillarySourceSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AncillarySourceSettings ancillarySourceSettings, ProtocolMarshaller protocolMarshaller) {

        if (ancillarySourceSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ancillarySourceSettings.getConvert608To708(), CONVERT608TO708_BINDING);
            protocolMarshaller.marshall(ancillarySourceSettings.getSourceAncillaryChannelNumber(), SOURCEANCILLARYCHANNELNUMBER_BINDING);
            protocolMarshaller.marshall(ancillarySourceSettings.getTerminateCaptions(), TERMINATECAPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
