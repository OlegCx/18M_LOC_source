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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicaAutoScalingUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicaAutoScalingUpdateMarshaller {

    private static final MarshallingInfo<String> REGIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegionName").build();
    private static final MarshallingInfo<List> REPLICAGLOBALSECONDARYINDEXUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaGlobalSecondaryIndexUpdates").build();
    private static final MarshallingInfo<StructuredPojo> REPLICAPROVISIONEDREADCAPACITYAUTOSCALINGUPDATE_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReplicaProvisionedReadCapacityAutoScalingUpdate").build();

    private static final ReplicaAutoScalingUpdateMarshaller instance = new ReplicaAutoScalingUpdateMarshaller();

    public static ReplicaAutoScalingUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicaAutoScalingUpdate replicaAutoScalingUpdate, ProtocolMarshaller protocolMarshaller) {

        if (replicaAutoScalingUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicaAutoScalingUpdate.getRegionName(), REGIONNAME_BINDING);
            protocolMarshaller.marshall(replicaAutoScalingUpdate.getReplicaGlobalSecondaryIndexUpdates(), REPLICAGLOBALSECONDARYINDEXUPDATES_BINDING);
            protocolMarshaller.marshall(replicaAutoScalingUpdate.getReplicaProvisionedReadCapacityAutoScalingUpdate(),
                    REPLICAPROVISIONEDREADCAPACITYAUTOSCALINGUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
