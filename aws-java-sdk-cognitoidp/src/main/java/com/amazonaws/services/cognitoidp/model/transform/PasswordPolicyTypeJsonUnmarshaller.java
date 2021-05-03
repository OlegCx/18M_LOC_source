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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PasswordPolicyType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PasswordPolicyTypeJsonUnmarshaller implements Unmarshaller<PasswordPolicyType, JsonUnmarshallerContext> {

    public PasswordPolicyType unmarshall(JsonUnmarshallerContext context) throws Exception {
        PasswordPolicyType passwordPolicyType = new PasswordPolicyType();

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
                if (context.testExpression("MinimumLength", targetDepth)) {
                    context.nextToken();
                    passwordPolicyType.setMinimumLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RequireUppercase", targetDepth)) {
                    context.nextToken();
                    passwordPolicyType.setRequireUppercase(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireLowercase", targetDepth)) {
                    context.nextToken();
                    passwordPolicyType.setRequireLowercase(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireNumbers", targetDepth)) {
                    context.nextToken();
                    passwordPolicyType.setRequireNumbers(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireSymbols", targetDepth)) {
                    context.nextToken();
                    passwordPolicyType.setRequireSymbols(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TemporaryPasswordValidityDays", targetDepth)) {
                    context.nextToken();
                    passwordPolicyType.setTemporaryPasswordValidityDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return passwordPolicyType;
    }

    private static PasswordPolicyTypeJsonUnmarshaller instance;

    public static PasswordPolicyTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PasswordPolicyTypeJsonUnmarshaller();
        return instance;
    }
}
