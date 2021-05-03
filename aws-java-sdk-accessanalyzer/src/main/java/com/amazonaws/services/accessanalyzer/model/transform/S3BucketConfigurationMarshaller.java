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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3BucketConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3BucketConfigurationMarshaller {

    private static final MarshallingInfo<Map> ACCESSPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accessPoints").build();
    private static final MarshallingInfo<List> BUCKETACLGRANTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketAclGrants").build();
    private static final MarshallingInfo<String> BUCKETPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketPolicy").build();
    private static final MarshallingInfo<StructuredPojo> BUCKETPUBLICACCESSBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketPublicAccessBlock").build();

    private static final S3BucketConfigurationMarshaller instance = new S3BucketConfigurationMarshaller();

    public static S3BucketConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3BucketConfiguration s3BucketConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (s3BucketConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3BucketConfiguration.getAccessPoints(), ACCESSPOINTS_BINDING);
            protocolMarshaller.marshall(s3BucketConfiguration.getBucketAclGrants(), BUCKETACLGRANTS_BINDING);
            protocolMarshaller.marshall(s3BucketConfiguration.getBucketPolicy(), BUCKETPOLICY_BINDING);
            protocolMarshaller.marshall(s3BucketConfiguration.getBucketPublicAccessBlock(), BUCKETPUBLICACCESSBLOCK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
