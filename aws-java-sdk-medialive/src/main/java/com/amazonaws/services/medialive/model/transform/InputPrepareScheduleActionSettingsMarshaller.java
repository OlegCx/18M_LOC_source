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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputPrepareScheduleActionSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputPrepareScheduleActionSettingsMarshaller {

    private static final MarshallingInfo<String> INPUTATTACHMENTNAMEREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputAttachmentNameReference").build();
    private static final MarshallingInfo<StructuredPojo> INPUTCLIPPINGSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputClippingSettings").build();
    private static final MarshallingInfo<List> URLPATH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("urlPath").build();

    private static final InputPrepareScheduleActionSettingsMarshaller instance = new InputPrepareScheduleActionSettingsMarshaller();

    public static InputPrepareScheduleActionSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputPrepareScheduleActionSettings inputPrepareScheduleActionSettings, ProtocolMarshaller protocolMarshaller) {

        if (inputPrepareScheduleActionSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputPrepareScheduleActionSettings.getInputAttachmentNameReference(), INPUTATTACHMENTNAMEREFERENCE_BINDING);
            protocolMarshaller.marshall(inputPrepareScheduleActionSettings.getInputClippingSettings(), INPUTCLIPPINGSETTINGS_BINDING);
            protocolMarshaller.marshall(inputPrepareScheduleActionSettings.getUrlPath(), URLPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
