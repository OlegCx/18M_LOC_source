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
 * ReplicaSettingsUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicaSettingsUpdateMarshaller {

    private static final MarshallingInfo<String> REGIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegionName").build();
    private static final MarshallingInfo<Long> REPLICAPROVISIONEDREADCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaProvisionedReadCapacityUnits").build();
    private static final MarshallingInfo<StructuredPojo> REPLICAPROVISIONEDREADCAPACITYAUTOSCALINGSETTINGSUPDATE_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate").build();
    private static final MarshallingInfo<List> REPLICAGLOBALSECONDARYINDEXSETTINGSUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaGlobalSecondaryIndexSettingsUpdate").build();

    private static final ReplicaSettingsUpdateMarshaller instance = new ReplicaSettingsUpdateMarshaller();

    public static ReplicaSettingsUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicaSettingsUpdate replicaSettingsUpdate, ProtocolMarshaller protocolMarshaller) {

        if (replicaSettingsUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicaSettingsUpdate.getRegionName(), REGIONNAME_BINDING);
            protocolMarshaller.marshall(replicaSettingsUpdate.getReplicaProvisionedReadCapacityUnits(), REPLICAPROVISIONEDREADCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(replicaSettingsUpdate.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(),
                    REPLICAPROVISIONEDREADCAPACITYAUTOSCALINGSETTINGSUPDATE_BINDING);
            protocolMarshaller
                    .marshall(replicaSettingsUpdate.getReplicaGlobalSecondaryIndexSettingsUpdate(), REPLICAGLOBALSECONDARYINDEXSETTINGSUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
