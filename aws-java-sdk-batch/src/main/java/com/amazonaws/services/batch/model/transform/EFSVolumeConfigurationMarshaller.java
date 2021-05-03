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
package com.amazonaws.services.batch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EFSVolumeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EFSVolumeConfigurationMarshaller {

    private static final MarshallingInfo<String> FILESYSTEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSystemId").build();
    private static final MarshallingInfo<String> ROOTDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rootDirectory").build();
    private static final MarshallingInfo<String> TRANSITENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transitEncryption").build();
    private static final MarshallingInfo<Integer> TRANSITENCRYPTIONPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transitEncryptionPort").build();
    private static final MarshallingInfo<StructuredPojo> AUTHORIZATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizationConfig").build();

    private static final EFSVolumeConfigurationMarshaller instance = new EFSVolumeConfigurationMarshaller();

    public static EFSVolumeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EFSVolumeConfiguration eFSVolumeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (eFSVolumeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eFSVolumeConfiguration.getFileSystemId(), FILESYSTEMID_BINDING);
            protocolMarshaller.marshall(eFSVolumeConfiguration.getRootDirectory(), ROOTDIRECTORY_BINDING);
            protocolMarshaller.marshall(eFSVolumeConfiguration.getTransitEncryption(), TRANSITENCRYPTION_BINDING);
            protocolMarshaller.marshall(eFSVolumeConfiguration.getTransitEncryptionPort(), TRANSITENCRYPTIONPORT_BINDING);
            protocolMarshaller.marshall(eFSVolumeConfiguration.getAuthorizationConfig(), AUTHORIZATIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
