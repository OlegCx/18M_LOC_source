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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BehaviorCriteria JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BehaviorCriteriaJsonUnmarshaller implements Unmarshaller<BehaviorCriteria, JsonUnmarshallerContext> {

    public BehaviorCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        BehaviorCriteria behaviorCriteria = new BehaviorCriteria();

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
                if (context.testExpression("comparisonOperator", targetDepth)) {
                    context.nextToken();
                    behaviorCriteria.setComparisonOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("value", targetDepth)) {
                    context.nextToken();
                    behaviorCriteria.setValue(MetricValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("durationSeconds", targetDepth)) {
                    context.nextToken();
                    behaviorCriteria.setDurationSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("consecutiveDatapointsToAlarm", targetDepth)) {
                    context.nextToken();
                    behaviorCriteria.setConsecutiveDatapointsToAlarm(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("consecutiveDatapointsToClear", targetDepth)) {
                    context.nextToken();
                    behaviorCriteria.setConsecutiveDatapointsToClear(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("statisticalThreshold", targetDepth)) {
                    context.nextToken();
                    behaviorCriteria.setStatisticalThreshold(StatisticalThresholdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mlDetectionConfig", targetDepth)) {
                    context.nextToken();
                    behaviorCriteria.setMlDetectionConfig(MachineLearningDetectionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return behaviorCriteria;
    }

    private static BehaviorCriteriaJsonUnmarshaller instance;

    public static BehaviorCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BehaviorCriteriaJsonUnmarshaller();
        return instance;
    }
}
