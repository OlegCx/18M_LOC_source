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
 * ConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> IAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamRole").build();
    private static final MarshallingInfo<StructuredPojo> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kmsKey").build();
    private static final MarshallingInfo<StructuredPojo> S3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3Bucket").build();
    private static final MarshallingInfo<StructuredPojo> SECRETSMANAGERSECRET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secretsManagerSecret").build();
    private static final MarshallingInfo<StructuredPojo> SQSQUEUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sqsQueue").build();

    private static final ConfigurationMarshaller instance = new ConfigurationMarshaller();

    public static ConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Configuration configuration, ProtocolMarshaller protocolMarshaller) {

        if (configuration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configuration.getIamRole(), IAMROLE_BINDING);
            protocolMarshaller.marshall(configuration.getKmsKey(), KMSKEY_BINDING);
            protocolMarshaller.marshall(configuration.getS3Bucket(), S3BUCKET_BINDING);
            protocolMarshaller.marshall(configuration.getSecretsManagerSecret(), SECRETSMANAGERSECRET_BINDING);
            protocolMarshaller.marshall(configuration.getSqsQueue(), SQSQUEUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
