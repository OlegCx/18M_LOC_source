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
package com.amazonaws.services.datapipeline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datapipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ValidatePipelineDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ValidatePipelineDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> PIPELINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineId").build();
    private static final MarshallingInfo<List> PIPELINEOBJECTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineObjects").build();
    private static final MarshallingInfo<List> PARAMETEROBJECTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterObjects").build();
    private static final MarshallingInfo<List> PARAMETERVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterValues").build();

    private static final ValidatePipelineDefinitionRequestMarshaller instance = new ValidatePipelineDefinitionRequestMarshaller();

    public static ValidatePipelineDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (validatePipelineDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(validatePipelineDefinitionRequest.getPipelineId(), PIPELINEID_BINDING);
            protocolMarshaller.marshall(validatePipelineDefinitionRequest.getPipelineObjects(), PIPELINEOBJECTS_BINDING);
            protocolMarshaller.marshall(validatePipelineDefinitionRequest.getParameterObjects(), PARAMETEROBJECTS_BINDING);
            protocolMarshaller.marshall(validatePipelineDefinitionRequest.getParameterValues(), PARAMETERVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
