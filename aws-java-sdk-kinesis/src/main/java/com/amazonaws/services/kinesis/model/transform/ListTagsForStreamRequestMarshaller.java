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
 * ListTagsForStreamRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListTagsForStreamRequestMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> EXCLUSIVESTARTTAGKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusiveStartTagKey").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();

    private static final ListTagsForStreamRequestMarshaller instance = new ListTagsForStreamRequestMarshaller();

    public static ListTagsForStreamRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListTagsForStreamRequest listTagsForStreamRequest, ProtocolMarshaller protocolMarshaller) {

        if (listTagsForStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listTagsForStreamRequest.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(listTagsForStreamRequest.getExclusiveStartTagKey(), EXCLUSIVESTARTTAGKEY_BINDING);
            protocolMarshaller.marshall(listTagsForStreamRequest.getLimit(), LIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
