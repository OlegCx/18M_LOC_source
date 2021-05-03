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
package com.amazonaws.services.codepipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StopPipelineExecutionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StopPipelineExecutionRequestMarshaller {

    private static final MarshallingInfo<String> PIPELINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineName").build();
    private static final MarshallingInfo<String> PIPELINEEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineExecutionId").build();
    private static final MarshallingInfo<Boolean> ABANDON_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("abandon").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();

    private static final StopPipelineExecutionRequestMarshaller instance = new StopPipelineExecutionRequestMarshaller();

    public static StopPipelineExecutionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StopPipelineExecutionRequest stopPipelineExecutionRequest, ProtocolMarshaller protocolMarshaller) {

        if (stopPipelineExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stopPipelineExecutionRequest.getPipelineName(), PIPELINENAME_BINDING);
            protocolMarshaller.marshall(stopPipelineExecutionRequest.getPipelineExecutionId(), PIPELINEEXECUTIONID_BINDING);
            protocolMarshaller.marshall(stopPipelineExecutionRequest.getAbandon(), ABANDON_BINDING);
            protocolMarshaller.marshall(stopPipelineExecutionRequest.getReason(), REASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
