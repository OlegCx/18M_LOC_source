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
 * CreateReplicationGroupMemberActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateReplicationGroupMemberActionMarshaller {

    private static final MarshallingInfo<String> REGIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegionName").build();
    private static final MarshallingInfo<String> KMSMASTERKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KMSMasterKeyId").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONEDTHROUGHPUTOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedThroughputOverride").build();
    private static final MarshallingInfo<List> GLOBALSECONDARYINDEXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalSecondaryIndexes").build();

    private static final CreateReplicationGroupMemberActionMarshaller instance = new CreateReplicationGroupMemberActionMarshaller();

    public static CreateReplicationGroupMemberActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateReplicationGroupMemberAction createReplicationGroupMemberAction, ProtocolMarshaller protocolMarshaller) {

        if (createReplicationGroupMemberAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createReplicationGroupMemberAction.getRegionName(), REGIONNAME_BINDING);
            protocolMarshaller.marshall(createReplicationGroupMemberAction.getKMSMasterKeyId(), KMSMASTERKEYID_BINDING);
            protocolMarshaller.marshall(createReplicationGroupMemberAction.getProvisionedThroughputOverride(), PROVISIONEDTHROUGHPUTOVERRIDE_BINDING);
            protocolMarshaller.marshall(createReplicationGroupMemberAction.getGlobalSecondaryIndexes(), GLOBALSECONDARYINDEXES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
