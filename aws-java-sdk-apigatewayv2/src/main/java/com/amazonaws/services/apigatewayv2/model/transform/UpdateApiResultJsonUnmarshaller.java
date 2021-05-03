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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateApiResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApiResultJsonUnmarshaller implements Unmarshaller<UpdateApiResult, JsonUnmarshallerContext> {

    public UpdateApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateApiResult updateApiResult = new UpdateApiResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateApiResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("apiEndpoint", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setApiEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiGatewayManaged", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setApiGatewayManaged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("apiId", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setApiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiKeySelectionExpression", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setApiKeySelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("corsConfiguration", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setCorsConfiguration(CorsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("disableSchemaValidation", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setDisableSchemaValidation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("disableExecuteApiEndpoint", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setDisableExecuteApiEndpoint(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("importInfo", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setImportInfo(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("protocolType", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setProtocolType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeSelectionExpression", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setRouteSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("warnings", targetDepth)) {
                    context.nextToken();
                    updateApiResult.setWarnings(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateApiResult;
    }

    private static UpdateApiResultJsonUnmarshaller instance;

    public static UpdateApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateApiResultJsonUnmarshaller();
        return instance;
    }
}
