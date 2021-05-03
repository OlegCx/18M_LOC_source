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
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JsonBody JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonBodyJsonUnmarshaller implements Unmarshaller<JsonBody, JsonUnmarshallerContext> {

    public JsonBody unmarshall(JsonUnmarshallerContext context) throws Exception {
        JsonBody jsonBody = new JsonBody();

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
                if (context.testExpression("MatchPattern", targetDepth)) {
                    context.nextToken();
                    jsonBody.setMatchPattern(JsonMatchPatternJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MatchScope", targetDepth)) {
                    context.nextToken();
                    jsonBody.setMatchScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvalidFallbackBehavior", targetDepth)) {
                    context.nextToken();
                    jsonBody.setInvalidFallbackBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jsonBody;
    }

    private static JsonBodyJsonUnmarshaller instance;

    public static JsonBodyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JsonBodyJsonUnmarshaller();
        return instance;
    }
}
