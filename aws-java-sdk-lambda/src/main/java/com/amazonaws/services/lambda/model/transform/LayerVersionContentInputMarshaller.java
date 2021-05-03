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
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LayerVersionContentInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LayerVersionContentInputMarshaller {

    private static final MarshallingInfo<String> S3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Bucket").build();
    private static final MarshallingInfo<String> S3KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Key").build();
    private static final MarshallingInfo<String> S3OBJECTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ObjectVersion").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> ZIPFILE_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ZipFile").build();

    private static final LayerVersionContentInputMarshaller instance = new LayerVersionContentInputMarshaller();

    public static LayerVersionContentInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LayerVersionContentInput layerVersionContentInput, ProtocolMarshaller protocolMarshaller) {

        if (layerVersionContentInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(layerVersionContentInput.getS3Bucket(), S3BUCKET_BINDING);
            protocolMarshaller.marshall(layerVersionContentInput.getS3Key(), S3KEY_BINDING);
            protocolMarshaller.marshall(layerVersionContentInput.getS3ObjectVersion(), S3OBJECTVERSION_BINDING);
            protocolMarshaller.marshall(layerVersionContentInput.getZipFile(), ZIPFILE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
