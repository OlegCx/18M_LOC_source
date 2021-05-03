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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WindowSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WindowSummaryJsonUnmarshaller implements Unmarshaller<WindowSummary, JsonUnmarshallerContext> {

    public WindowSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        WindowSummary windowSummary = new WindowSummary();

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
                if (context.testExpression("TestWindowStart", targetDepth)) {
                    context.nextToken();
                    windowSummary.setTestWindowStart(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TestWindowEnd", targetDepth)) {
                    context.nextToken();
                    windowSummary.setTestWindowEnd(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ItemCount", targetDepth)) {
                    context.nextToken();
                    windowSummary.setItemCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationType", targetDepth)) {
                    context.nextToken();
                    windowSummary.setEvaluationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    windowSummary.setMetrics(MetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return windowSummary;
    }

    private static WindowSummaryJsonUnmarshaller instance;

    public static WindowSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WindowSummaryJsonUnmarshaller();
        return instance;
    }
}
