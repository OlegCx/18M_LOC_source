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
package com.amazonaws.services.glacier.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CompleteMultipartUploadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CompleteMultipartUploadRequestMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("accountId").defaultValueSupplier(DefaultAccountIdSupplier.getInstance()).build();
    private static final MarshallingInfo<String> VAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("vaultName").build();
    private static final MarshallingInfo<String> UPLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("uploadId").build();
    private static final MarshallingInfo<String> ARCHIVESIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-archive-size").build();
    private static final MarshallingInfo<String> CHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("x-amz-sha256-tree-hash").build();

    private static final CompleteMultipartUploadRequestMarshaller instance = new CompleteMultipartUploadRequestMarshaller();

    public static CompleteMultipartUploadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CompleteMultipartUploadRequest completeMultipartUploadRequest, ProtocolMarshaller protocolMarshaller) {

        if (completeMultipartUploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(completeMultipartUploadRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(completeMultipartUploadRequest.getVaultName(), VAULTNAME_BINDING);
            protocolMarshaller.marshall(completeMultipartUploadRequest.getUploadId(), UPLOADID_BINDING);
            protocolMarshaller.marshall(completeMultipartUploadRequest.getArchiveSize(), ARCHIVESIZE_BINDING);
            protocolMarshaller.marshall(completeMultipartUploadRequest.getChecksum(), CHECKSUM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
