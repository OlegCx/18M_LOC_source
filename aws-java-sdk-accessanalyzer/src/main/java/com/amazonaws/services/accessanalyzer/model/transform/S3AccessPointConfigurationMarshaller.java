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
 * S3AccessPointConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3AccessPointConfigurationMarshaller {

    private static final MarshallingInfo<String> ACCESSPOINTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessPointPolicy").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKORIGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkOrigin").build();
    private static final MarshallingInfo<StructuredPojo> PUBLICACCESSBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicAccessBlock").build();

    private static final S3AccessPointConfigurationMarshaller instance = new S3AccessPointConfigurationMarshaller();

    public static S3AccessPointConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3AccessPointConfiguration s3AccessPointConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (s3AccessPointConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3AccessPointConfiguration.getAccessPointPolicy(), ACCESSPOINTPOLICY_BINDING);
            protocolMarshaller.marshall(s3AccessPointConfiguration.getNetworkOrigin(), NETWORKORIGIN_BINDING);
            protocolMarshaller.marshall(s3AccessPointConfiguration.getPublicAccessBlock(), PUBLICACCESSBLOCK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
