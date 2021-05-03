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
package com.amazonaws.services.textract.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.textract.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HumanLoopActivationOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HumanLoopActivationOutputMarshaller {

    private static final MarshallingInfo<String> HUMANLOOPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanLoopArn").build();
    private static final MarshallingInfo<List> HUMANLOOPACTIVATIONREASONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanLoopActivationReasons").build();
    private static final MarshallingInfo<String> HUMANLOOPACTIVATIONCONDITIONSEVALUATIONRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.JSON_VALUE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanLoopActivationConditionsEvaluationResults").build();

    private static final HumanLoopActivationOutputMarshaller instance = new HumanLoopActivationOutputMarshaller();

    public static HumanLoopActivationOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HumanLoopActivationOutput humanLoopActivationOutput, ProtocolMarshaller protocolMarshaller) {

        if (humanLoopActivationOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(humanLoopActivationOutput.getHumanLoopArn(), HUMANLOOPARN_BINDING);
            protocolMarshaller.marshall(humanLoopActivationOutput.getHumanLoopActivationReasons(), HUMANLOOPACTIVATIONREASONS_BINDING);
            protocolMarshaller.marshall(humanLoopActivationOutput.getHumanLoopActivationConditionsEvaluationResults(),
                    HUMANLOOPACTIVATIONCONDITIONSEVALUATIONRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
