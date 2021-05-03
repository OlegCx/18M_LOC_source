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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Condition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionJsonUnmarshaller implements Unmarshaller<Condition, JsonUnmarshallerContext> {

    public Condition unmarshall(JsonUnmarshallerContext context) throws Exception {
        Condition condition = new Condition();

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
                if (context.testExpression("eq", targetDepth)) {
                    context.nextToken();
                    condition.setEq(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("neq", targetDepth)) {
                    context.nextToken();
                    condition.setNeq(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("gt", targetDepth)) {
                    context.nextToken();
                    condition.setGt(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gte", targetDepth)) {
                    context.nextToken();
                    condition.setGte(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lt", targetDepth)) {
                    context.nextToken();
                    condition.setLt(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lte", targetDepth)) {
                    context.nextToken();
                    condition.setLte(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("equals", targetDepth)) {
                    context.nextToken();
                    condition.setEquals(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("notEquals", targetDepth)) {
                    context.nextToken();
                    condition.setNotEquals(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("greaterThan", targetDepth)) {
                    context.nextToken();
                    condition.setGreaterThan(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("greaterThanOrEqual", targetDepth)) {
                    context.nextToken();
                    condition.setGreaterThanOrEqual(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lessThan", targetDepth)) {
                    context.nextToken();
                    condition.setLessThan(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lessThanOrEqual", targetDepth)) {
                    context.nextToken();
                    condition.setLessThanOrEqual(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return condition;
    }

    private static ConditionJsonUnmarshaller instance;

    public static ConditionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConditionJsonUnmarshaller();
        return instance;
    }
}
