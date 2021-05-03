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
 * InputAttachmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputAttachmentMarshaller {

    private static final MarshallingInfo<StructuredPojo> AUTOMATICINPUTFAILOVERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("automaticInputFailoverSettings").build();
    private static final MarshallingInfo<String> INPUTATTACHMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputAttachmentName").build();
    private static final MarshallingInfo<String> INPUTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputId").build();
    private static final MarshallingInfo<StructuredPojo> INPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputSettings").build();

    private static final InputAttachmentMarshaller instance = new InputAttachmentMarshaller();

    public static InputAttachmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputAttachment inputAttachment, ProtocolMarshaller protocolMarshaller) {

        if (inputAttachment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputAttachment.getAutomaticInputFailoverSettings(), AUTOMATICINPUTFAILOVERSETTINGS_BINDING);
            protocolMarshaller.marshall(inputAttachment.getInputAttachmentName(), INPUTATTACHMENTNAME_BINDING);
            protocolMarshaller.marshall(inputAttachment.getInputId(), INPUTID_BINDING);
            protocolMarshaller.marshall(inputAttachment.getInputSettings(), INPUTSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
