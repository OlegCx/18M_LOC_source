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
 * ScalingPolicy JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPolicyJsonUnmarshaller implements Unmarshaller<ScalingPolicy, JsonUnmarshallerContext> {

    public ScalingPolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScalingPolicy scalingPolicy = new ScalingPolicy();

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
                if (context.testExpression("PolicyARN", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setPolicyARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyName", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setPolicyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceNamespace", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setServiceNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScalableDimension", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setScalableDimension(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyType", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setPolicyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StepScalingPolicyConfiguration", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setStepScalingPolicyConfiguration(StepScalingPolicyConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TargetTrackingScalingPolicyConfiguration", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setTargetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Alarms", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setAlarms(new ListUnmarshaller<Alarm>(AlarmJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scalingPolicy;
    }

    private static ScalingPolicyJsonUnmarshaller instance;

    public static ScalingPolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScalingPolicyJsonUnmarshaller();
        return instance;
    }
}
