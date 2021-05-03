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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectionPasswordEncryptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectionPasswordEncryptionMarshaller {

    private static final MarshallingInfo<Boolean> RETURNCONNECTIONPASSWORDENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReturnConnectionPasswordEncrypted").build();
    private static final MarshallingInfo<String> AWSKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsKmsKeyId").build();

    private static final ConnectionPasswordEncryptionMarshaller instance = new ConnectionPasswordEncryptionMarshaller();

    public static ConnectionPasswordEncryptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectionPasswordEncryption connectionPasswordEncryption, ProtocolMarshaller protocolMarshaller) {

        if (connectionPasswordEncryption == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectionPasswordEncryption.getReturnConnectionPasswordEncrypted(), RETURNCONNECTIONPASSWORDENCRYPTED_BINDING);
            protocolMarshaller.marshall(connectionPasswordEncryption.getAwsKmsKeyId(), AWSKMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
