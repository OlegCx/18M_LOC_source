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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsDynamoDbTableReplicaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsDynamoDbTableReplicaMarshaller {

    private static final MarshallingInfo<List> GLOBALSECONDARYINDEXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalSecondaryIndexes").build();
    private static final MarshallingInfo<String> KMSMASTERKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KmsMasterKeyId").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONEDTHROUGHPUTOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedThroughputOverride").build();
    private static final MarshallingInfo<String> REGIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegionName").build();
    private static final MarshallingInfo<String> REPLICASTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaStatus").build();
    private static final MarshallingInfo<String> REPLICASTATUSDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaStatusDescription").build();

    private static final AwsDynamoDbTableReplicaMarshaller instance = new AwsDynamoDbTableReplicaMarshaller();

    public static AwsDynamoDbTableReplicaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsDynamoDbTableReplica awsDynamoDbTableReplica, ProtocolMarshaller protocolMarshaller) {

        if (awsDynamoDbTableReplica == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsDynamoDbTableReplica.getGlobalSecondaryIndexes(), GLOBALSECONDARYINDEXES_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableReplica.getKmsMasterKeyId(), KMSMASTERKEYID_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableReplica.getProvisionedThroughputOverride(), PROVISIONEDTHROUGHPUTOVERRIDE_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableReplica.getRegionName(), REGIONNAME_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableReplica.getReplicaStatus(), REPLICASTATUS_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableReplica.getReplicaStatusDescription(), REPLICASTATUSDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
