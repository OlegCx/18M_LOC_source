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
package com.amazonaws.services.greengrass.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSubscriptionDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSubscriptionDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> AMZNCLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-Client-Token").build();
    private static final MarshallingInfo<StructuredPojo> INITIALVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitialVersion").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateSubscriptionDefinitionRequestMarshaller instance = new CreateSubscriptionDefinitionRequestMarshaller();

    public static CreateSubscriptionDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSubscriptionDefinitionRequest createSubscriptionDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSubscriptionDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSubscriptionDefinitionRequest.getAmznClientToken(), AMZNCLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createSubscriptionDefinitionRequest.getInitialVersion(), INITIALVERSION_BINDING);
            protocolMarshaller.marshall(createSubscriptionDefinitionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createSubscriptionDefinitionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
