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
package com.amazonaws.services.shield.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.shield.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubscriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubscriptionMarshaller {

    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> TIMECOMMITMENTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeCommitmentInSeconds").build();
    private static final MarshallingInfo<String> AUTORENEW_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AutoRenew").build();
    private static final MarshallingInfo<List> LIMITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limits").build();
    private static final MarshallingInfo<String> PROACTIVEENGAGEMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProactiveEngagementStatus").build();
    private static final MarshallingInfo<StructuredPojo> SUBSCRIPTIONLIMITS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionLimits").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionArn").build();

    private static final SubscriptionMarshaller instance = new SubscriptionMarshaller();

    public static SubscriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Subscription subscription, ProtocolMarshaller protocolMarshaller) {

        if (subscription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subscription.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(subscription.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(subscription.getTimeCommitmentInSeconds(), TIMECOMMITMENTINSECONDS_BINDING);
            protocolMarshaller.marshall(subscription.getAutoRenew(), AUTORENEW_BINDING);
            protocolMarshaller.marshall(subscription.getLimits(), LIMITS_BINDING);
            protocolMarshaller.marshall(subscription.getProactiveEngagementStatus(), PROACTIVEENGAGEMENTSTATUS_BINDING);
            protocolMarshaller.marshall(subscription.getSubscriptionLimits(), SUBSCRIPTIONLIMITS_BINDING);
            protocolMarshaller.marshall(subscription.getSubscriptionArn(), SUBSCRIPTIONARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
