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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EventSourceMappingConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSourceMappingConfigurationJsonUnmarshaller implements Unmarshaller<EventSourceMappingConfiguration, JsonUnmarshallerContext> {

    public EventSourceMappingConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventSourceMappingConfiguration eventSourceMappingConfiguration = new EventSourceMappingConfiguration();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPosition", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setStartingPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPositionTimestamp", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setStartingPositionTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setBatchSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaximumBatchingWindowInSeconds", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setMaximumBatchingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParallelizationFactor", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setParallelizationFactor(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setEventSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastProcessingResult", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setLastProcessingResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateTransitionReason", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setStateTransitionReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationConfig", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setDestinationConfig(DestinationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Topics", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setTopics(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Queues", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setQueues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SourceAccessConfigurations", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setSourceAccessConfigurations(new ListUnmarshaller<SourceAccessConfiguration>(
                            SourceAccessConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SelfManagedEventSource", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setSelfManagedEventSource(SelfManagedEventSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumRecordAgeInSeconds", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setMaximumRecordAgeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BisectBatchOnFunctionError", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setBisectBatchOnFunctionError(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaximumRetryAttempts", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setMaximumRetryAttempts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TumblingWindowInSeconds", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setTumblingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FunctionResponseTypes", targetDepth)) {
                    context.nextToken();
                    eventSourceMappingConfiguration.setFunctionResponseTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eventSourceMappingConfiguration;
    }

    private static EventSourceMappingConfigurationJsonUnmarshaller instance;

    public static EventSourceMappingConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventSourceMappingConfigurationJsonUnmarshaller();
        return instance;
    }
}
