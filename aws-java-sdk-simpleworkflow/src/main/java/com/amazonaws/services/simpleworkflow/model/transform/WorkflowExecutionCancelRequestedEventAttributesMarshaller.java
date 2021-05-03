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
 * WorkflowExecutionCancelRequestedEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkflowExecutionCancelRequestedEventAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> EXTERNALWORKFLOWEXECUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalWorkflowExecution").build();
    private static final MarshallingInfo<Long> EXTERNALINITIATEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalInitiatedEventId").build();
    private static final MarshallingInfo<String> CAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cause").build();

    private static final WorkflowExecutionCancelRequestedEventAttributesMarshaller instance = new WorkflowExecutionCancelRequestedEventAttributesMarshaller();

    public static WorkflowExecutionCancelRequestedEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkflowExecutionCancelRequestedEventAttributes workflowExecutionCancelRequestedEventAttributes, ProtocolMarshaller protocolMarshaller) {

        if (workflowExecutionCancelRequestedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workflowExecutionCancelRequestedEventAttributes.getExternalWorkflowExecution(), EXTERNALWORKFLOWEXECUTION_BINDING);
            protocolMarshaller.marshall(workflowExecutionCancelRequestedEventAttributes.getExternalInitiatedEventId(), EXTERNALINITIATEDEVENTID_BINDING);
            protocolMarshaller.marshall(workflowExecutionCancelRequestedEventAttributes.getCause(), CAUSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
