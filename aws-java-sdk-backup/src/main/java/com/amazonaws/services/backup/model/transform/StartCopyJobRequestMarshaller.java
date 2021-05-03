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
 * StartCopyJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartCopyJobRequestMarshaller {

    private static final MarshallingInfo<String> RECOVERYPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryPointArn").build();
    private static final MarshallingInfo<String> SOURCEBACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceBackupVaultName").build();
    private static final MarshallingInfo<String> DESTINATIONBACKUPVAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationBackupVaultArn").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdempotencyToken").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Lifecycle").build();

    private static final StartCopyJobRequestMarshaller instance = new StartCopyJobRequestMarshaller();

    public static StartCopyJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartCopyJobRequest startCopyJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startCopyJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startCopyJobRequest.getRecoveryPointArn(), RECOVERYPOINTARN_BINDING);
            protocolMarshaller.marshall(startCopyJobRequest.getSourceBackupVaultName(), SOURCEBACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(startCopyJobRequest.getDestinationBackupVaultArn(), DESTINATIONBACKUPVAULTARN_BINDING);
            protocolMarshaller.marshall(startCopyJobRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(startCopyJobRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
            protocolMarshaller.marshall(startCopyJobRequest.getLifecycle(), LIFECYCLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
