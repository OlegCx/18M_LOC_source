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
package com.amazonaws.services.personalize.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBatchInferenceJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBatchInferenceJobRequestMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> SOLUTIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("solutionVersionArn").build();
    private static final MarshallingInfo<String> FILTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filterArn").build();
    private static final MarshallingInfo<Integer> NUMRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numResults").build();
    private static final MarshallingInfo<StructuredPojo> JOBINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobInput").build();
    private static final MarshallingInfo<StructuredPojo> JOBOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobOutput").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<StructuredPojo> BATCHINFERENCEJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("batchInferenceJobConfig").build();

    private static final CreateBatchInferenceJobRequestMarshaller instance = new CreateBatchInferenceJobRequestMarshaller();

    public static CreateBatchInferenceJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBatchInferenceJobRequest createBatchInferenceJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBatchInferenceJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBatchInferenceJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(createBatchInferenceJobRequest.getSolutionVersionArn(), SOLUTIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(createBatchInferenceJobRequest.getFilterArn(), FILTERARN_BINDING);
            protocolMarshaller.marshall(createBatchInferenceJobRequest.getNumResults(), NUMRESULTS_BINDING);
            protocolMarshaller.marshall(createBatchInferenceJobRequest.getJobInput(), JOBINPUT_BINDING);
            protocolMarshaller.marshall(createBatchInferenceJobRequest.getJobOutput(), JOBOUTPUT_BINDING);
            protocolMarshaller.marshall(createBatchInferenceJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createBatchInferenceJobRequest.getBatchInferenceJobConfig(), BATCHINFERENCEJOBCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
