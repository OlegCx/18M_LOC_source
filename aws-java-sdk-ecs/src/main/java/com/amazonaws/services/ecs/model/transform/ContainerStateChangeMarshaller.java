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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerStateChangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerStateChangeMarshaller {

    private static final MarshallingInfo<String> CONTAINERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerName").build();
    private static final MarshallingInfo<String> IMAGEDIGEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageDigest").build();
    private static final MarshallingInfo<String> RUNTIMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runtimeId").build();
    private static final MarshallingInfo<Integer> EXITCODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exitCode").build();
    private static final MarshallingInfo<List> NETWORKBINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkBindings").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final ContainerStateChangeMarshaller instance = new ContainerStateChangeMarshaller();

    public static ContainerStateChangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerStateChange containerStateChange, ProtocolMarshaller protocolMarshaller) {

        if (containerStateChange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerStateChange.getContainerName(), CONTAINERNAME_BINDING);
            protocolMarshaller.marshall(containerStateChange.getImageDigest(), IMAGEDIGEST_BINDING);
            protocolMarshaller.marshall(containerStateChange.getRuntimeId(), RUNTIMEID_BINDING);
            protocolMarshaller.marshall(containerStateChange.getExitCode(), EXITCODE_BINDING);
            protocolMarshaller.marshall(containerStateChange.getNetworkBindings(), NETWORKBINDINGS_BINDING);
            protocolMarshaller.marshall(containerStateChange.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(containerStateChange.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
