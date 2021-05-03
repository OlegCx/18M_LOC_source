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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoMLCandidateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoMLCandidateMarshaller {

    private static final MarshallingInfo<String> CANDIDATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CandidateName").build();
    private static final MarshallingInfo<StructuredPojo> FINALAUTOMLJOBOBJECTIVEMETRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinalAutoMLJobObjectiveMetric").build();
    private static final MarshallingInfo<String> OBJECTIVESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectiveStatus").build();
    private static final MarshallingInfo<List> CANDIDATESTEPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CandidateSteps").build();
    private static final MarshallingInfo<String> CANDIDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CandidateStatus").build();
    private static final MarshallingInfo<List> INFERENCECONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceContainers").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<StructuredPojo> CANDIDATEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CandidateProperties").build();

    private static final AutoMLCandidateMarshaller instance = new AutoMLCandidateMarshaller();

    public static AutoMLCandidateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoMLCandidate autoMLCandidate, ProtocolMarshaller protocolMarshaller) {

        if (autoMLCandidate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoMLCandidate.getCandidateName(), CANDIDATENAME_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getFinalAutoMLJobObjectiveMetric(), FINALAUTOMLJOBOBJECTIVEMETRIC_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getObjectiveStatus(), OBJECTIVESTATUS_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getCandidateSteps(), CANDIDATESTEPS_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getCandidateStatus(), CANDIDATESTATUS_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getInferenceContainers(), INFERENCECONTAINERS_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(autoMLCandidate.getCandidateProperties(), CANDIDATEPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
