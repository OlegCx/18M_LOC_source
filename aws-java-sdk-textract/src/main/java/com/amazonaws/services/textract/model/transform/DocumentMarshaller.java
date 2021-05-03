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
package com.amazonaws.services.textract.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.textract.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DocumentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DocumentMarshaller {

    private static final MarshallingInfo<java.nio.ByteBuffer> BYTES_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Bytes").build();
    private static final MarshallingInfo<StructuredPojo> S3OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Object").build();

    private static final DocumentMarshaller instance = new DocumentMarshaller();

    public static DocumentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Document document, ProtocolMarshaller protocolMarshaller) {

        if (document == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(document.getBytes(), BYTES_BINDING);
            protocolMarshaller.marshall(document.getS3Object(), S3OBJECT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
