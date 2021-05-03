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
package com.amazonaws.services.dlm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScheduleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduleMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Boolean> COPYTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTags").build();
    private static final MarshallingInfo<List> TAGSTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagsToAdd").build();
    private static final MarshallingInfo<List> VARIABLETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VariableTags").build();
    private static final MarshallingInfo<StructuredPojo> CREATERULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateRule").build();
    private static final MarshallingInfo<StructuredPojo> RETAINRULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetainRule").build();
    private static final MarshallingInfo<StructuredPojo> FASTRESTORERULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FastRestoreRule").build();
    private static final MarshallingInfo<List> CROSSREGIONCOPYRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrossRegionCopyRules").build();
    private static final MarshallingInfo<List> SHARERULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ShareRules").build();

    private static final ScheduleMarshaller instance = new ScheduleMarshaller();

    public static ScheduleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Schedule schedule, ProtocolMarshaller protocolMarshaller) {

        if (schedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(schedule.getName(), NAME_BINDING);
            protocolMarshaller.marshall(schedule.getCopyTags(), COPYTAGS_BINDING);
            protocolMarshaller.marshall(schedule.getTagsToAdd(), TAGSTOADD_BINDING);
            protocolMarshaller.marshall(schedule.getVariableTags(), VARIABLETAGS_BINDING);
            protocolMarshaller.marshall(schedule.getCreateRule(), CREATERULE_BINDING);
            protocolMarshaller.marshall(schedule.getRetainRule(), RETAINRULE_BINDING);
            protocolMarshaller.marshall(schedule.getFastRestoreRule(), FASTRESTORERULE_BINDING);
            protocolMarshaller.marshall(schedule.getCrossRegionCopyRules(), CROSSREGIONCOPYRULES_BINDING);
            protocolMarshaller.marshall(schedule.getShareRules(), SHARERULES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
