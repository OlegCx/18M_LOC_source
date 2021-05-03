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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoTuneMaintenanceScheduleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoTuneMaintenanceScheduleMarshaller {

    private static final MarshallingInfo<java.util.Date> STARTAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Duration").build();
    private static final MarshallingInfo<String> CRONEXPRESSIONFORRECURRENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CronExpressionForRecurrence").build();

    private static final AutoTuneMaintenanceScheduleMarshaller instance = new AutoTuneMaintenanceScheduleMarshaller();

    public static AutoTuneMaintenanceScheduleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoTuneMaintenanceSchedule autoTuneMaintenanceSchedule, ProtocolMarshaller protocolMarshaller) {

        if (autoTuneMaintenanceSchedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoTuneMaintenanceSchedule.getStartAt(), STARTAT_BINDING);
            protocolMarshaller.marshall(autoTuneMaintenanceSchedule.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(autoTuneMaintenanceSchedule.getCronExpressionForRecurrence(), CRONEXPRESSIONFORRECURRENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
