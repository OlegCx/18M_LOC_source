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
 * ImportApiResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportApiResultJsonUnmarshaller implements Unmarshaller<ImportApiResult, JsonUnmarshallerContext> {

    public ImportApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportApiResult importApiResult = new ImportApiResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return importApiResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("apiEndpoint", targetDepth)) {
                    context.nextToken();
                    importApiResult.setApiEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiGatewayManaged", targetDepth)) {
                    context.nextToken();
                    importApiResult.setApiGatewayManaged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("apiId", targetDepth)) {
                    context.nextToken();
                    importApiResult.setApiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiKeySelectionExpression", targetDepth)) {
                    context.nextToken();
                    importApiResult.setApiKeySelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("corsConfiguration", targetDepth)) {
                    context.nextToken();
                    importApiResult.setCorsConfiguration(CorsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    importApiResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    importApiResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("disableSchemaValidation", targetDepth)) {
                    context.nextToken();
                    importApiResult.setDisableSchemaValidation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("disableExecuteApiEndpoint", targetDepth)) {
                    context.nextToken();
                    importApiResult.setDisableExecuteApiEndpoint(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("importInfo", targetDepth)) {
                    context.nextToken();
                    importApiResult.setImportInfo(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    importApiResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("protocolType", targetDepth)) {
                    context.nextToken();
                    importApiResult.setProtocolType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeSelectionExpression", targetDepth)) {
                    context.nextToken();
                    importApiResult.setRouteSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    importApiResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    importApiResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("warnings", targetDepth)) {
                    context.nextToken();
                    importApiResult.setWarnings(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return importApiResult;
    }

    private static ImportApiResultJsonUnmarshaller instance;

    public static ImportApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportApiResultJsonUnmarshaller();
        return instance;
    }
}
