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
package com.amazonaws.services.lambda.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateEventSourceMappingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateEventSourceMappingRequestMarshaller {

    private static final MarshallingInfo<String> EVENTSOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSourceArn").build();
    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionName").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<Integer> BATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchSize").build();
    private static final MarshallingInfo<Integer> MAXIMUMBATCHINGWINDOWINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumBatchingWindowInSeconds").build();
    private static final MarshallingInfo<Integer> PARALLELIZATIONFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelizationFactor").build();
    private static final MarshallingInfo<String> STARTINGPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingPosition").build();
    private static final MarshallingInfo<java.util.Date> STARTINGPOSITIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingPositionTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationConfig").build();
    private static final MarshallingInfo<Integer> MAXIMUMRECORDAGEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumRecordAgeInSeconds").build();
    private static final MarshallingInfo<Boolean> BISECTBATCHONFUNCTIONERROR_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BisectBatchOnFunctionError").build();
    private static final MarshallingInfo<Integer> MAXIMUMRETRYATTEMPTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumRetryAttempts").build();
    private static final MarshallingInfo<Integer> TUMBLINGWINDOWINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TumblingWindowInSeconds").build();
    private static final MarshallingInfo<List> TOPICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Topics").build();
    private static final MarshallingInfo<List> QUEUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Queues").build();
    private static final MarshallingInfo<List> SOURCEACCESSCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceAccessConfigurations").build();
    private static final MarshallingInfo<StructuredPojo> SELFMANAGEDEVENTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelfManagedEventSource").build();
    private static final MarshallingInfo<List> FUNCTIONRESPONSETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionResponseTypes").build();

    private static final CreateEventSourceMappingRequestMarshaller instance = new CreateEventSourceMappingRequestMarshaller();

    public static CreateEventSourceMappingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateEventSourceMappingRequest createEventSourceMappingRequest, ProtocolMarshaller protocolMarshaller) {

        if (createEventSourceMappingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createEventSourceMappingRequest.getEventSourceArn(), EVENTSOURCEARN_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getBatchSize(), BATCHSIZE_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getMaximumBatchingWindowInSeconds(), MAXIMUMBATCHINGWINDOWINSECONDS_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getParallelizationFactor(), PARALLELIZATIONFACTOR_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getStartingPosition(), STARTINGPOSITION_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getStartingPositionTimestamp(), STARTINGPOSITIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getDestinationConfig(), DESTINATIONCONFIG_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getMaximumRecordAgeInSeconds(), MAXIMUMRECORDAGEINSECONDS_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getBisectBatchOnFunctionError(), BISECTBATCHONFUNCTIONERROR_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getMaximumRetryAttempts(), MAXIMUMRETRYATTEMPTS_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getTumblingWindowInSeconds(), TUMBLINGWINDOWINSECONDS_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getTopics(), TOPICS_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getQueues(), QUEUES_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getSourceAccessConfigurations(), SOURCEACCESSCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getSelfManagedEventSource(), SELFMANAGEDEVENTSOURCE_BINDING);
            protocolMarshaller.marshall(createEventSourceMappingRequest.getFunctionResponseTypes(), FUNCTIONRESPONSETYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
