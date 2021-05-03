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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ParameterConstraints JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterConstraintsJsonUnmarshaller implements Unmarshaller<ParameterConstraints, JsonUnmarshallerContext> {

    public ParameterConstraints unmarshall(JsonUnmarshallerContext context) throws Exception {
        ParameterConstraints parameterConstraints = new ParameterConstraints();

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
                if (context.testExpression("AllowedValues", targetDepth)) {
                    context.nextToken();
                    parameterConstraints.setAllowedValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AllowedPattern", targetDepth)) {
                    context.nextToken();
                    parameterConstraints.setAllowedPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConstraintDescription", targetDepth)) {
                    context.nextToken();
                    parameterConstraints.setConstraintDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxLength", targetDepth)) {
                    context.nextToken();
                    parameterConstraints.setMaxLength(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinLength", targetDepth)) {
                    context.nextToken();
                    parameterConstraints.setMinLength(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxValue", targetDepth)) {
                    context.nextToken();
                    parameterConstraints.setMaxValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinValue", targetDepth)) {
                    context.nextToken();
                    parameterConstraints.setMinValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return parameterConstraints;
    }

    private static ParameterConstraintsJsonUnmarshaller instance;

    public static ParameterConstraintsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParameterConstraintsJsonUnmarshaller();
        return instance;
    }
}
