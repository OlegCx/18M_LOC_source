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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConditionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConditionMarshaller {

    private static final MarshallingInfo<List> EQ_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eq").build();
    private static final MarshallingInfo<List> NEQ_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("neq").build();
    private static final MarshallingInfo<Integer> GT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gt").build();
    private static final MarshallingInfo<Integer> GTE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gte").build();
    private static final MarshallingInfo<Integer> LT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lt").build();
    private static final MarshallingInfo<Integer> LTE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lte").build();
    private static final MarshallingInfo<List> EQUALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("equals").build();
    private static final MarshallingInfo<List> NOTEQUALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("notEquals").build();
    private static final MarshallingInfo<Long> GREATERTHAN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("greaterThan").build();
    private static final MarshallingInfo<Long> GREATERTHANOREQUAL_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("greaterThanOrEqual").build();
    private static final MarshallingInfo<Long> LESSTHAN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lessThan").build();
    private static final MarshallingInfo<Long> LESSTHANOREQUAL_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lessThanOrEqual").build();

    private static final ConditionMarshaller instance = new ConditionMarshaller();

    public static ConditionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Condition condition, ProtocolMarshaller protocolMarshaller) {

        if (condition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(condition.getEq(), EQ_BINDING);
            protocolMarshaller.marshall(condition.getNeq(), NEQ_BINDING);
            protocolMarshaller.marshall(condition.getGt(), GT_BINDING);
            protocolMarshaller.marshall(condition.getGte(), GTE_BINDING);
            protocolMarshaller.marshall(condition.getLt(), LT_BINDING);
            protocolMarshaller.marshall(condition.getLte(), LTE_BINDING);
            protocolMarshaller.marshall(condition.getEquals(), EQUALS_BINDING);
            protocolMarshaller.marshall(condition.getNotEquals(), NOTEQUALS_BINDING);
            protocolMarshaller.marshall(condition.getGreaterThan(), GREATERTHAN_BINDING);
            protocolMarshaller.marshall(condition.getGreaterThanOrEqual(), GREATERTHANOREQUAL_BINDING);
            protocolMarshaller.marshall(condition.getLessThan(), LESSTHAN_BINDING);
            protocolMarshaller.marshall(condition.getLessThanOrEqual(), LESSTHANOREQUAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
