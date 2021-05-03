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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SolutionVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SolutionVersionJsonUnmarshaller implements Unmarshaller<SolutionVersion, JsonUnmarshallerContext> {

    public SolutionVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        SolutionVersion solutionVersion = new SolutionVersion();

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
                if (context.testExpression("solutionVersionArn", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setSolutionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionArn", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setSolutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("performHPO", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setPerformHPO(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("performAutoML", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setPerformAutoML(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("recipeArn", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setRecipeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventType", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetGroupArn", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setDatasetGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionConfig", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setSolutionConfig(SolutionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("trainingHours", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setTrainingHours(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("trainingMode", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setTrainingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tunedHPOParams", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setTunedHPOParams(TunedHPOParamsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    solutionVersion.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return solutionVersion;
    }

    private static SolutionVersionJsonUnmarshaller instance;

    public static SolutionVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SolutionVersionJsonUnmarshaller();
        return instance;
    }
}
