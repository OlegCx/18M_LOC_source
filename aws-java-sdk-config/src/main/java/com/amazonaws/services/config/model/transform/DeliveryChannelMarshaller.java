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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeliveryChannelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeliveryChannelMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketName").build();
    private static final MarshallingInfo<String> S3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3KeyPrefix").build();
    private static final MarshallingInfo<String> S3KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3KmsKeyArn").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snsTopicARN").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGSNAPSHOTDELIVERYPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configSnapshotDeliveryProperties").build();

    private static final DeliveryChannelMarshaller instance = new DeliveryChannelMarshaller();

    public static DeliveryChannelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeliveryChannel deliveryChannel, ProtocolMarshaller protocolMarshaller) {

        if (deliveryChannel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deliveryChannel.getName(), NAME_BINDING);
            protocolMarshaller.marshall(deliveryChannel.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(deliveryChannel.getS3KeyPrefix(), S3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(deliveryChannel.getS3KmsKeyArn(), S3KMSKEYARN_BINDING);
            protocolMarshaller.marshall(deliveryChannel.getSnsTopicARN(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(deliveryChannel.getConfigSnapshotDeliveryProperties(), CONFIGSNAPSHOTDELIVERYPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
