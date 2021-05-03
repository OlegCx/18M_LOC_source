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
package com.amazonaws.services.applicationautoscaling.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScalingActivity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingActivityJsonUnmarshaller implements Unmarshaller<ScalingActivity, JsonUnmarshallerContext> {

    public ScalingActivity unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScalingActivity scalingActivity = new ScalingActivity();

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
                if (context.testExpression("ActivityId", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setActivityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceNamespace", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setServiceNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScalableDimension", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setScalableDimension(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Cause", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setCause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StatusCode", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Details", targetDepth)) {
                    context.nextToken();
                    scalingActivity.setDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scalingActivity;
    }

    private static ScalingActivityJsonUnmarshaller instance;

    public static ScalingActivityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScalingActivityJsonUnmarshaller();
        return instance;
    }
}
