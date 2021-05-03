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
package com.amazonaws.services.simpleemailv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteContactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteContactRequestMarshaller {

    private static final MarshallingInfo<String> CONTACTLISTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ContactListName").build();
    private static final MarshallingInfo<String> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("EmailAddress").build();

    private static final DeleteContactRequestMarshaller instance = new DeleteContactRequestMarshaller();

    public static DeleteContactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteContactRequest deleteContactRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteContactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteContactRequest.getContactListName(), CONTACTLISTNAME_BINDING);
            protocolMarshaller.marshall(deleteContactRequest.getEmailAddress(), EMAILADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
