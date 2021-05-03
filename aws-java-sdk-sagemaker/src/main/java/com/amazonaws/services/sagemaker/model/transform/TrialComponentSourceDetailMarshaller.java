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
 * TrialComponentSourceDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrialComponentSourceDetailMarshaller {

    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceArn").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJob").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingJob").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformJob").build();

    private static final TrialComponentSourceDetailMarshaller instance = new TrialComponentSourceDetailMarshaller();

    public static TrialComponentSourceDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrialComponentSourceDetail trialComponentSourceDetail, ProtocolMarshaller protocolMarshaller) {

        if (trialComponentSourceDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trialComponentSourceDetail.getSourceArn(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(trialComponentSourceDetail.getTrainingJob(), TRAININGJOB_BINDING);
            protocolMarshaller.marshall(trialComponentSourceDetail.getProcessingJob(), PROCESSINGJOB_BINDING);
            protocolMarshaller.marshall(trialComponentSourceDetail.getTransformJob(), TRANSFORMJOB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
