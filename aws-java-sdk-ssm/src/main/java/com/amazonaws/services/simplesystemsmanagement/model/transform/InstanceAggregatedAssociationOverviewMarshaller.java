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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceAggregatedAssociationOverviewMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceAggregatedAssociationOverviewMarshaller {

    private static final MarshallingInfo<String> DETAILEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetailedStatus").build();
    private static final MarshallingInfo<Map> INSTANCEASSOCIATIONSTATUSAGGREGATEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceAssociationStatusAggregatedCount").build();

    private static final InstanceAggregatedAssociationOverviewMarshaller instance = new InstanceAggregatedAssociationOverviewMarshaller();

    public static InstanceAggregatedAssociationOverviewMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceAggregatedAssociationOverview instanceAggregatedAssociationOverview, ProtocolMarshaller protocolMarshaller) {

        if (instanceAggregatedAssociationOverview == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceAggregatedAssociationOverview.getDetailedStatus(), DETAILEDSTATUS_BINDING);
            protocolMarshaller.marshall(instanceAggregatedAssociationOverview.getInstanceAssociationStatusAggregatedCount(),
                    INSTANCEASSOCIATIONSTATUSAGGREGATEDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
