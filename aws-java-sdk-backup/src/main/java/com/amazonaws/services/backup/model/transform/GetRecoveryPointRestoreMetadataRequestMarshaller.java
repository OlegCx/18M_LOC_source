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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetRecoveryPointRestoreMetadataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetRecoveryPointRestoreMetadataRequestMarshaller {

    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("backupVaultName").build();
    private static final MarshallingInfo<String> RECOVERYPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("recoveryPointArn").build();

    private static final GetRecoveryPointRestoreMetadataRequestMarshaller instance = new GetRecoveryPointRestoreMetadataRequestMarshaller();

    public static GetRecoveryPointRestoreMetadataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetRecoveryPointRestoreMetadataRequest getRecoveryPointRestoreMetadataRequest, ProtocolMarshaller protocolMarshaller) {

        if (getRecoveryPointRestoreMetadataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getRecoveryPointRestoreMetadataRequest.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(getRecoveryPointRestoreMetadataRequest.getRecoveryPointArn(), RECOVERYPOINTARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
