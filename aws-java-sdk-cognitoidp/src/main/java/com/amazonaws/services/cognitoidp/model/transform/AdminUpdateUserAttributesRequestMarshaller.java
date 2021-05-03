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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AdminUpdateUserAttributesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AdminUpdateUserAttributesRequestMarshaller {

    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<List> USERATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserAttributes").build();
    private static final MarshallingInfo<Map> CLIENTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientMetadata").build();

    private static final AdminUpdateUserAttributesRequestMarshaller instance = new AdminUpdateUserAttributesRequestMarshaller();

    public static AdminUpdateUserAttributesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest, ProtocolMarshaller protocolMarshaller) {

        if (adminUpdateUserAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(adminUpdateUserAttributesRequest.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(adminUpdateUserAttributesRequest.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(adminUpdateUserAttributesRequest.getUserAttributes(), USERATTRIBUTES_BINDING);
            protocolMarshaller.marshall(adminUpdateUserAttributesRequest.getClientMetadata(), CLIENTMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
