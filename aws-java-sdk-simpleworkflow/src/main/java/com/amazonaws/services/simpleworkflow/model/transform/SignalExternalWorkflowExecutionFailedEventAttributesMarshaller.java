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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SignalExternalWorkflowExecutionFailedEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SignalExternalWorkflowExecutionFailedEventAttributesMarshaller {

    private static final MarshallingInfo<String> WORKFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowId").build();
    private static final MarshallingInfo<String> RUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runId").build();
    private static final MarshallingInfo<String> CAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cause").build();
    private static final MarshallingInfo<Long> INITIATEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initiatedEventId").build();
    private static final MarshallingInfo<Long> DECISIONTASKCOMPLETEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionTaskCompletedEventId").build();
    private static final MarshallingInfo<String> CONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("control").build();

    private static final SignalExternalWorkflowExecutionFailedEventAttributesMarshaller instance = new SignalExternalWorkflowExecutionFailedEventAttributesMarshaller();

    public static SignalExternalWorkflowExecutionFailedEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SignalExternalWorkflowExecutionFailedEventAttributes signalExternalWorkflowExecutionFailedEventAttributes,
            ProtocolMarshaller protocolMarshaller) {

        if (signalExternalWorkflowExecutionFailedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(signalExternalWorkflowExecutionFailedEventAttributes.getWorkflowId(), WORKFLOWID_BINDING);
            protocolMarshaller.marshall(signalExternalWorkflowExecutionFailedEventAttributes.getRunId(), RUNID_BINDING);
            protocolMarshaller.marshall(signalExternalWorkflowExecutionFailedEventAttributes.getCause(), CAUSE_BINDING);
            protocolMarshaller.marshall(signalExternalWorkflowExecutionFailedEventAttributes.getInitiatedEventId(), INITIATEDEVENTID_BINDING);
            protocolMarshaller.marshall(signalExternalWorkflowExecutionFailedEventAttributes.getDecisionTaskCompletedEventId(),
                    DECISIONTASKCOMPLETEDEVENTID_BINDING);
            protocolMarshaller.marshall(signalExternalWorkflowExecutionFailedEventAttributes.getControl(), CONTROL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
