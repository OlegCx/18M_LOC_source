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
 * ScheduleActivityTaskDecisionAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduleActivityTaskDecisionAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTIVITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityType").build();
    private static final MarshallingInfo<String> ACTIVITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityId").build();
    private static final MarshallingInfo<String> CONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("control").build();
    private static final MarshallingInfo<String> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("input").build();
    private static final MarshallingInfo<String> SCHEDULETOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleToCloseTimeout").build();
    private static final MarshallingInfo<StructuredPojo> TASKLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskList").build();
    private static final MarshallingInfo<String> TASKPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskPriority").build();
    private static final MarshallingInfo<String> SCHEDULETOSTARTTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleToStartTimeout").build();
    private static final MarshallingInfo<String> STARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startToCloseTimeout").build();
    private static final MarshallingInfo<String> HEARTBEATTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("heartbeatTimeout").build();

    private static final ScheduleActivityTaskDecisionAttributesMarshaller instance = new ScheduleActivityTaskDecisionAttributesMarshaller();

    public static ScheduleActivityTaskDecisionAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes, ProtocolMarshaller protocolMarshaller) {

        if (scheduleActivityTaskDecisionAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getActivityType(), ACTIVITYTYPE_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getActivityId(), ACTIVITYID_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getControl(), CONTROL_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getScheduleToCloseTimeout(), SCHEDULETOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getTaskList(), TASKLIST_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getTaskPriority(), TASKPRIORITY_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getScheduleToStartTimeout(), SCHEDULETOSTARTTIMEOUT_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getStartToCloseTimeout(), STARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(scheduleActivityTaskDecisionAttributes.getHeartbeatTimeout(), HEARTBEATTIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
