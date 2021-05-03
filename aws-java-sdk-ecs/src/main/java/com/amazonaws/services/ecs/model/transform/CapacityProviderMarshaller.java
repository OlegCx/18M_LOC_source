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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CapacityProviderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CapacityProviderMarshaller {

    private static final MarshallingInfo<String> CAPACITYPROVIDERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capacityProviderArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> AUTOSCALINGGROUPPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingGroupProvider").build();
    private static final MarshallingInfo<String> UPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateStatus").build();
    private static final MarshallingInfo<String> UPDATESTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateStatusReason").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CapacityProviderMarshaller instance = new CapacityProviderMarshaller();

    public static CapacityProviderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CapacityProvider capacityProvider, ProtocolMarshaller protocolMarshaller) {

        if (capacityProvider == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(capacityProvider.getCapacityProviderArn(), CAPACITYPROVIDERARN_BINDING);
            protocolMarshaller.marshall(capacityProvider.getName(), NAME_BINDING);
            protocolMarshaller.marshall(capacityProvider.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(capacityProvider.getAutoScalingGroupProvider(), AUTOSCALINGGROUPPROVIDER_BINDING);
            protocolMarshaller.marshall(capacityProvider.getUpdateStatus(), UPDATESTATUS_BINDING);
            protocolMarshaller.marshall(capacityProvider.getUpdateStatusReason(), UPDATESTATUSREASON_BINDING);
            protocolMarshaller.marshall(capacityProvider.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
