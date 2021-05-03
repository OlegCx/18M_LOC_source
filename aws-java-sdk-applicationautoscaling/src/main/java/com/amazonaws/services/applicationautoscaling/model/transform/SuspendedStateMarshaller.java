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
package com.amazonaws.services.applicationautoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationautoscaling.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SuspendedStateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SuspendedStateMarshaller {

    private static final MarshallingInfo<Boolean> DYNAMICSCALINGINSUSPENDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamicScalingInSuspended").build();
    private static final MarshallingInfo<Boolean> DYNAMICSCALINGOUTSUSPENDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamicScalingOutSuspended").build();
    private static final MarshallingInfo<Boolean> SCHEDULEDSCALINGSUSPENDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledScalingSuspended").build();

    private static final SuspendedStateMarshaller instance = new SuspendedStateMarshaller();

    public static SuspendedStateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SuspendedState suspendedState, ProtocolMarshaller protocolMarshaller) {

        if (suspendedState == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(suspendedState.getDynamicScalingInSuspended(), DYNAMICSCALINGINSUSPENDED_BINDING);
            protocolMarshaller.marshall(suspendedState.getDynamicScalingOutSuspended(), DYNAMICSCALINGOUTSUSPENDED_BINDING);
            protocolMarshaller.marshall(suspendedState.getScheduledScalingSuspended(), SCHEDULEDSCALINGSUSPENDED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
