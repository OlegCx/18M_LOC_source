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
package com.amazonaws.services.wafv2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateRuleGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRuleGroupRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Scope").build();
    private static final MarshallingInfo<Long> CAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Capacity").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> RULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rules").build();
    private static final MarshallingInfo<StructuredPojo> VISIBILITYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisibilityConfig").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<Map> CUSTOMRESPONSEBODIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomResponseBodies").build();

    private static final CreateRuleGroupRequestMarshaller instance = new CreateRuleGroupRequestMarshaller();

    public static CreateRuleGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRuleGroupRequest createRuleGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRuleGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRuleGroupRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getScope(), SCOPE_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getCapacity(), CAPACITY_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getRules(), RULES_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getVisibilityConfig(), VISIBILITYCONFIG_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getCustomResponseBodies(), CUSTOMRESPONSEBODIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
