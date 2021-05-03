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
package com.amazonaws.services.kinesis.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ShardMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ShardMarshaller {

    private static final MarshallingInfo<String> SHARDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ShardId").build();
    private static final MarshallingInfo<String> PARENTSHARDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentShardId").build();
    private static final MarshallingInfo<String> ADJACENTPARENTSHARDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdjacentParentShardId").build();
    private static final MarshallingInfo<StructuredPojo> HASHKEYRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HashKeyRange").build();
    private static final MarshallingInfo<StructuredPojo> SEQUENCENUMBERRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SequenceNumberRange").build();

    private static final ShardMarshaller instance = new ShardMarshaller();

    public static ShardMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Shard shard, ProtocolMarshaller protocolMarshaller) {

        if (shard == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(shard.getShardId(), SHARDID_BINDING);
            protocolMarshaller.marshall(shard.getParentShardId(), PARENTSHARDID_BINDING);
            protocolMarshaller.marshall(shard.getAdjacentParentShardId(), ADJACENTPARENTSHARDID_BINDING);
            protocolMarshaller.marshall(shard.getHashKeyRange(), HASHKEYRANGE_BINDING);
            protocolMarshaller.marshall(shard.getSequenceNumberRange(), SEQUENCENUMBERRANGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
