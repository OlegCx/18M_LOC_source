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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchRecordMarshaller {

    private static final MarshallingInfo<StructuredPojo> TRAININGJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJob").build();
    private static final MarshallingInfo<StructuredPojo> EXPERIMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Experiment").build();
    private static final MarshallingInfo<StructuredPojo> TRIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Trial").build();
    private static final MarshallingInfo<StructuredPojo> TRIALCOMPONENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrialComponent").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Endpoint").build();
    private static final MarshallingInfo<StructuredPojo> MODELPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackage").build();
    private static final MarshallingInfo<StructuredPojo> MODELPACKAGEGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageGroup").build();
    private static final MarshallingInfo<StructuredPojo> PIPELINE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Pipeline").build();
    private static final MarshallingInfo<StructuredPojo> PIPELINEEXECUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineExecution").build();
    private static final MarshallingInfo<StructuredPojo> FEATUREGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureGroup").build();

    private static final SearchRecordMarshaller instance = new SearchRecordMarshaller();

    public static SearchRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchRecord searchRecord, ProtocolMarshaller protocolMarshaller) {

        if (searchRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchRecord.getTrainingJob(), TRAININGJOB_BINDING);
            protocolMarshaller.marshall(searchRecord.getExperiment(), EXPERIMENT_BINDING);
            protocolMarshaller.marshall(searchRecord.getTrial(), TRIAL_BINDING);
            protocolMarshaller.marshall(searchRecord.getTrialComponent(), TRIALCOMPONENT_BINDING);
            protocolMarshaller.marshall(searchRecord.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(searchRecord.getModelPackage(), MODELPACKAGE_BINDING);
            protocolMarshaller.marshall(searchRecord.getModelPackageGroup(), MODELPACKAGEGROUP_BINDING);
            protocolMarshaller.marshall(searchRecord.getPipeline(), PIPELINE_BINDING);
            protocolMarshaller.marshall(searchRecord.getPipelineExecution(), PIPELINEEXECUTION_BINDING);
            protocolMarshaller.marshall(searchRecord.getFeatureGroup(), FEATUREGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
