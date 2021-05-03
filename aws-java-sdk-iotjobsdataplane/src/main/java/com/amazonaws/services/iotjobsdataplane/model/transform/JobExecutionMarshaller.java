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
package com.amazonaws.services.iotjobsdataplane.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotjobsdataplane.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobExecutionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobExecutionMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> THINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("thingName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> STATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("statusDetails").build();
    private static final MarshallingInfo<Long> QUEUEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("queuedAt").build();
    private static final MarshallingInfo<Long> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startedAt").build();
    private static final MarshallingInfo<Long> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lastUpdatedAt").build();
    private static final MarshallingInfo<Long> APPROXIMATESECONDSBEFORETIMEDOUT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approximateSecondsBeforeTimedOut").build();
    private static final MarshallingInfo<Long> VERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("versionNumber").build();
    private static final MarshallingInfo<Long> EXECUTIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionNumber").build();
    private static final MarshallingInfo<String> JOBDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobDocument").build();

    private static final JobExecutionMarshaller instance = new JobExecutionMarshaller();

    public static JobExecutionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobExecution jobExecution, ProtocolMarshaller protocolMarshaller) {

        if (jobExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobExecution.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(jobExecution.getThingName(), THINGNAME_BINDING);
            protocolMarshaller.marshall(jobExecution.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(jobExecution.getStatusDetails(), STATUSDETAILS_BINDING);
            protocolMarshaller.marshall(jobExecution.getQueuedAt(), QUEUEDAT_BINDING);
            protocolMarshaller.marshall(jobExecution.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(jobExecution.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(jobExecution.getApproximateSecondsBeforeTimedOut(), APPROXIMATESECONDSBEFORETIMEDOUT_BINDING);
            protocolMarshaller.marshall(jobExecution.getVersionNumber(), VERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(jobExecution.getExecutionNumber(), EXECUTIONNUMBER_BINDING);
            protocolMarshaller.marshall(jobExecution.getJobDocument(), JOBDOCUMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
