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
package com.amazonaws.services.devicefarm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Counters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CountersJsonUnmarshaller implements Unmarshaller<Counters, JsonUnmarshallerContext> {

    public Counters unmarshall(JsonUnmarshallerContext context) throws Exception {
        Counters counters = new Counters();

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
                if (context.testExpression("total", targetDepth)) {
                    context.nextToken();
                    counters.setTotal(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("passed", targetDepth)) {
                    context.nextToken();
                    counters.setPassed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("failed", targetDepth)) {
                    context.nextToken();
                    counters.setFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("warned", targetDepth)) {
                    context.nextToken();
                    counters.setWarned(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("errored", targetDepth)) {
                    context.nextToken();
                    counters.setErrored(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("stopped", targetDepth)) {
                    context.nextToken();
                    counters.setStopped(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("skipped", targetDepth)) {
                    context.nextToken();
                    counters.setSkipped(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return counters;
    }

    private static CountersJsonUnmarshaller instance;

    public static CountersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CountersJsonUnmarshaller();
        return instance;
    }
}
