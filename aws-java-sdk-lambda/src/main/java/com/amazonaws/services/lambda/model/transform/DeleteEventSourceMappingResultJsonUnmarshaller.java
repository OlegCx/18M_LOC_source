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
 * DeleteEventSourceMappingResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEventSourceMappingResultJsonUnmarshaller implements Unmarshaller<DeleteEventSourceMappingResult, JsonUnmarshallerContext> {

    public DeleteEventSourceMappingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteEventSourceMappingResult deleteEventSourceMappingResult = new DeleteEventSourceMappingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteEventSourceMappingResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPosition", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setStartingPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPositionTimestamp", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setStartingPositionTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setBatchSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaximumBatchingWindowInSeconds", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setMaximumBatchingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParallelizationFactor", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setParallelizationFactor(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setEventSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastProcessingResult", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setLastProcessingResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateTransitionReason", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setStateTransitionReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationConfig", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setDestinationConfig(DestinationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Topics", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setTopics(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Queues", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setQueues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SourceAccessConfigurations", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setSourceAccessConfigurations(new ListUnmarshaller<SourceAccessConfiguration>(
                            SourceAccessConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SelfManagedEventSource", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setSelfManagedEventSource(SelfManagedEventSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumRecordAgeInSeconds", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setMaximumRecordAgeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BisectBatchOnFunctionError", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setBisectBatchOnFunctionError(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaximumRetryAttempts", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setMaximumRetryAttempts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TumblingWindowInSeconds", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setTumblingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FunctionResponseTypes", targetDepth)) {
                    context.nextToken();
                    deleteEventSourceMappingResult.setFunctionResponseTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return deleteEventSourceMappingResult;
    }

    private static DeleteEventSourceMappingResultJsonUnmarshaller instance;

    public static DeleteEventSourceMappingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteEventSourceMappingResultJsonUnmarshaller();
        return instance;
    }
}
