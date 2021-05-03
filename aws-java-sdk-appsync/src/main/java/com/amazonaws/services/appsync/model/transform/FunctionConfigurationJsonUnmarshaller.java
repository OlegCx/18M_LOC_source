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
package com.amazonaws.services.appsync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appsync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FunctionConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionConfigurationJsonUnmarshaller implements Unmarshaller<FunctionConfiguration, JsonUnmarshallerContext> {

    public FunctionConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        FunctionConfiguration functionConfiguration = new FunctionConfiguration();

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
                if (context.testExpression("functionId", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setFunctionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("functionArn", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSourceName", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setDataSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestMappingTemplate", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setRequestMappingTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("responseMappingTemplate", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setResponseMappingTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("functionVersion", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setFunctionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("syncConfig", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setSyncConfig(SyncConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return functionConfiguration;
    }

    private static FunctionConfigurationJsonUnmarshaller instance;

    public static FunctionConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FunctionConfigurationJsonUnmarshaller();
        return instance;
    }
}
