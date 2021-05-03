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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UploadSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UploadSettingsMarshaller {

    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<Integer> STARTFROMROW_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartFromRow").build();
    private static final MarshallingInfo<Boolean> CONTAINSHEADER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainsHeader").build();
    private static final MarshallingInfo<String> TEXTQUALIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextQualifier").build();
    private static final MarshallingInfo<String> DELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Delimiter").build();

    private static final UploadSettingsMarshaller instance = new UploadSettingsMarshaller();

    public static UploadSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UploadSettings uploadSettings, ProtocolMarshaller protocolMarshaller) {

        if (uploadSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(uploadSettings.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(uploadSettings.getStartFromRow(), STARTFROMROW_BINDING);
            protocolMarshaller.marshall(uploadSettings.getContainsHeader(), CONTAINSHEADER_BINDING);
            protocolMarshaller.marshall(uploadSettings.getTextQualifier(), TEXTQUALIFIER_BINDING);
            protocolMarshaller.marshall(uploadSettings.getDelimiter(), DELIMITER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
