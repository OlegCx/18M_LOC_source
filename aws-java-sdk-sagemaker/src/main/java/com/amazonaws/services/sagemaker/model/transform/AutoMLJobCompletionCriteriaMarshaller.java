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
 * AutoMLJobCompletionCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoMLJobCompletionCriteriaMarshaller {

    private static final MarshallingInfo<Integer> MAXCANDIDATES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCandidates").build();
    private static final MarshallingInfo<Integer> MAXRUNTIMEPERTRAININGJOBINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRuntimePerTrainingJobInSeconds").build();
    private static final MarshallingInfo<Integer> MAXAUTOMLJOBRUNTIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAutoMLJobRuntimeInSeconds").build();

    private static final AutoMLJobCompletionCriteriaMarshaller instance = new AutoMLJobCompletionCriteriaMarshaller();

    public static AutoMLJobCompletionCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoMLJobCompletionCriteria autoMLJobCompletionCriteria, ProtocolMarshaller protocolMarshaller) {

        if (autoMLJobCompletionCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoMLJobCompletionCriteria.getMaxCandidates(), MAXCANDIDATES_BINDING);
            protocolMarshaller.marshall(autoMLJobCompletionCriteria.getMaxRuntimePerTrainingJobInSeconds(), MAXRUNTIMEPERTRAININGJOBINSECONDS_BINDING);
            protocolMarshaller.marshall(autoMLJobCompletionCriteria.getMaxAutoMLJobRuntimeInSeconds(), MAXAUTOMLJOBRUNTIMEINSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
