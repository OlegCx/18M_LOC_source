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
 * EventSourceMappingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventSourceMappingConfigurationMarshaller {

    private static final MarshallingInfo<String> UUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UUID").build();
    private static final MarshallingInfo<String> STARTINGPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingPosition").build();
    private static final MarshallingInfo<java.util.Date> STARTINGPOSITIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingPositionTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> BATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchSize").build();
    private static final MarshallingInfo<Integer> MAXIMUMBATCHINGWINDOWINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumBatchingWindowInSeconds").build();
    private static final MarshallingInfo<Integer> PARALLELIZATIONFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelizationFactor").build();
    private static final MarshallingInfo<String> EVENTSOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSourceArn").build();
    private static final MarshallingInfo<String> FUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionArn").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModified").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTPROCESSINGRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastProcessingResult").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> STATETRANSITIONREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateTransitionReason").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationConfig").build();
    private static final MarshallingInfo<List> TOPICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Topics").build();
    private static final MarshallingInfo<List> QUEUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Queues").build();
    private static final MarshallingInfo<List> SOURCEACCESSCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceAccessConfigurations").build();
    private static final MarshallingInfo<StructuredPojo> SELFMANAGEDEVENTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelfManagedEventSource").build();
    private static final MarshallingInfo<Integer> MAXIMUMRECORDAGEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumRecordAgeInSeconds").build();
    private static final MarshallingInfo<Boolean> BISECTBATCHONFUNCTIONERROR_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BisectBatchOnFunctionError").build();
    private static final MarshallingInfo<Integer> MAXIMUMRETRYATTEMPTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumRetryAttempts").build();
    private static final MarshallingInfo<Integer> TUMBLINGWINDOWINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TumblingWindowInSeconds").build();
    private static final MarshallingInfo<List> FUNCTIONRESPONSETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionResponseTypes").build();

    private static final EventSourceMappingConfigurationMarshaller instance = new EventSourceMappingConfigurationMarshaller();

    public static EventSourceMappingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventSourceMappingConfiguration eventSourceMappingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (eventSourceMappingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getUUID(), UUID_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getStartingPosition(), STARTINGPOSITION_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getStartingPositionTimestamp(), STARTINGPOSITIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getBatchSize(), BATCHSIZE_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getMaximumBatchingWindowInSeconds(), MAXIMUMBATCHINGWINDOWINSECONDS_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getParallelizationFactor(), PARALLELIZATIONFACTOR_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getEventSourceArn(), EVENTSOURCEARN_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getFunctionArn(), FUNCTIONARN_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getLastModified(), LASTMODIFIED_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getLastProcessingResult(), LASTPROCESSINGRESULT_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getState(), STATE_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getStateTransitionReason(), STATETRANSITIONREASON_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getDestinationConfig(), DESTINATIONCONFIG_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getTopics(), TOPICS_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getQueues(), QUEUES_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getSourceAccessConfigurations(), SOURCEACCESSCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getSelfManagedEventSource(), SELFMANAGEDEVENTSOURCE_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getMaximumRecordAgeInSeconds(), MAXIMUMRECORDAGEINSECONDS_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getBisectBatchOnFunctionError(), BISECTBATCHONFUNCTIONERROR_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getMaximumRetryAttempts(), MAXIMUMRETRYATTEMPTS_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getTumblingWindowInSeconds(), TUMBLINGWINDOWINSECONDS_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getFunctionResponseTypes(), FUNCTIONRESPONSETYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
