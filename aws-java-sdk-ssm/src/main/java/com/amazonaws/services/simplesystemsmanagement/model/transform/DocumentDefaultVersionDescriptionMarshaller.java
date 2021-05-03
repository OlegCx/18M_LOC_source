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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DocumentDefaultVersionDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DocumentDefaultVersionDescriptionMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DEFAULTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultVersion").build();
    private static final MarshallingInfo<String> DEFAULTVERSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultVersionName").build();

    private static final DocumentDefaultVersionDescriptionMarshaller instance = new DocumentDefaultVersionDescriptionMarshaller();

    public static DocumentDefaultVersionDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DocumentDefaultVersionDescription documentDefaultVersionDescription, ProtocolMarshaller protocolMarshaller) {

        if (documentDefaultVersionDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(documentDefaultVersionDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(documentDefaultVersionDescription.getDefaultVersion(), DEFAULTVERSION_BINDING);
            protocolMarshaller.marshall(documentDefaultVersionDescription.getDefaultVersionName(), DEFAULTVERSIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
