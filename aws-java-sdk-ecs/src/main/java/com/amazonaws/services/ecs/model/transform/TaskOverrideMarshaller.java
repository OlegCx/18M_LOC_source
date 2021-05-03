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
 * TaskOverrideMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskOverrideMarshaller {

    private static final MarshallingInfo<List> CONTAINEROVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerOverrides").build();
    private static final MarshallingInfo<String> CPU_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpu").build();
    private static final MarshallingInfo<List> INFERENCEACCELERATOROVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inferenceAcceleratorOverrides").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRoleArn").build();
    private static final MarshallingInfo<String> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<String> TASKROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> EPHEMERALSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ephemeralStorage").build();

    private static final TaskOverrideMarshaller instance = new TaskOverrideMarshaller();

    public static TaskOverrideMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskOverride taskOverride, ProtocolMarshaller protocolMarshaller) {

        if (taskOverride == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskOverride.getContainerOverrides(), CONTAINEROVERRIDES_BINDING);
            protocolMarshaller.marshall(taskOverride.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(taskOverride.getInferenceAcceleratorOverrides(), INFERENCEACCELERATOROVERRIDES_BINDING);
            protocolMarshaller.marshall(taskOverride.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(taskOverride.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(taskOverride.getTaskRoleArn(), TASKROLEARN_BINDING);
            protocolMarshaller.marshall(taskOverride.getEphemeralStorage(), EPHEMERALSTORAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
