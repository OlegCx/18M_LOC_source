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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateAuthorizerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAuthorizerResultJsonUnmarshaller implements Unmarshaller<CreateAuthorizerResult, JsonUnmarshallerContext> {

    public CreateAuthorizerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAuthorizerResult createAuthorizerResult = new CreateAuthorizerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createAuthorizerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("providerARNs", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setProviderARNs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("authType", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setAuthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerUri", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setAuthorizerUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerCredentials", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setAuthorizerCredentials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("identitySource", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setIdentitySource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("identityValidationExpression", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setIdentityValidationExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerResultTtlInSeconds", targetDepth)) {
                    context.nextToken();
                    createAuthorizerResult.setAuthorizerResultTtlInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createAuthorizerResult;
    }

    private static CreateAuthorizerResultJsonUnmarshaller instance;

    public static CreateAuthorizerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAuthorizerResultJsonUnmarshaller();
        return instance;
    }
}
