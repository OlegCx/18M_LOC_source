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
package com.amazonaws.services.dlm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RetainRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RetainRuleMarshaller {

    private static final MarshallingInfo<Integer> COUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Count").build();
    private static final MarshallingInfo<Integer> INTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Interval").build();
    private static final MarshallingInfo<String> INTERVALUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntervalUnit").build();

    private static final RetainRuleMarshaller instance = new RetainRuleMarshaller();

    public static RetainRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RetainRule retainRule, ProtocolMarshaller protocolMarshaller) {

        if (retainRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(retainRule.getCount(), COUNT_BINDING);
            protocolMarshaller.marshall(retainRule.getInterval(), INTERVAL_BINDING);
            protocolMarshaller.marshall(retainRule.getIntervalUnit(), INTERVALUNIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
