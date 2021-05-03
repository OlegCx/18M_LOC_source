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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3PublicAccessBlockConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3PublicAccessBlockConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> IGNOREPUBLICACLS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ignorePublicAcls").build();
    private static final MarshallingInfo<Boolean> RESTRICTPUBLICBUCKETS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("restrictPublicBuckets").build();

    private static final S3PublicAccessBlockConfigurationMarshaller instance = new S3PublicAccessBlockConfigurationMarshaller();

    public static S3PublicAccessBlockConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3PublicAccessBlockConfiguration s3PublicAccessBlockConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (s3PublicAccessBlockConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3PublicAccessBlockConfiguration.getIgnorePublicAcls(), IGNOREPUBLICACLS_BINDING);
            protocolMarshaller.marshall(s3PublicAccessBlockConfiguration.getRestrictPublicBuckets(), RESTRICTPUBLICBUCKETS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
