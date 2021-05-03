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
package com.amazonaws.services.datasync.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLocationObjectStorageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLocationObjectStorageRequestMarshaller {

    private static final MarshallingInfo<String> LOCATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocationArn").build();
    private static final MarshallingInfo<Integer> SERVERPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerPort").build();
    private static final MarshallingInfo<String> SERVERPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerProtocol").build();
    private static final MarshallingInfo<String> SUBDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subdirectory").build();
    private static final MarshallingInfo<String> ACCESSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccessKey").build();
    private static final MarshallingInfo<String> SECRETKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretKey").build();
    private static final MarshallingInfo<List> AGENTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AgentArns").build();

    private static final UpdateLocationObjectStorageRequestMarshaller instance = new UpdateLocationObjectStorageRequestMarshaller();

    public static UpdateLocationObjectStorageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLocationObjectStorageRequest updateLocationObjectStorageRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLocationObjectStorageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLocationObjectStorageRequest.getLocationArn(), LOCATIONARN_BINDING);
            protocolMarshaller.marshall(updateLocationObjectStorageRequest.getServerPort(), SERVERPORT_BINDING);
            protocolMarshaller.marshall(updateLocationObjectStorageRequest.getServerProtocol(), SERVERPROTOCOL_BINDING);
            protocolMarshaller.marshall(updateLocationObjectStorageRequest.getSubdirectory(), SUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(updateLocationObjectStorageRequest.getAccessKey(), ACCESSKEY_BINDING);
            protocolMarshaller.marshall(updateLocationObjectStorageRequest.getSecretKey(), SECRETKEY_BINDING);
            protocolMarshaller.marshall(updateLocationObjectStorageRequest.getAgentArns(), AGENTARNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
