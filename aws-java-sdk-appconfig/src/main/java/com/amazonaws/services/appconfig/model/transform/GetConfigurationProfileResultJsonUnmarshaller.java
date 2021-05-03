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
package com.amazonaws.services.appconfig.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetConfigurationProfileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationProfileResultJsonUnmarshaller implements Unmarshaller<GetConfigurationProfileResult, JsonUnmarshallerContext> {

    public GetConfigurationProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetConfigurationProfileResult getConfigurationProfileResult = new GetConfigurationProfileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getConfigurationProfileResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    getConfigurationProfileResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    getConfigurationProfileResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getConfigurationProfileResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getConfigurationProfileResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationUri", targetDepth)) {
                    context.nextToken();
                    getConfigurationProfileResult.setLocationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetrievalRoleArn", targetDepth)) {
                    context.nextToken();
                    getConfigurationProfileResult.setRetrievalRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Validators", targetDepth)) {
                    context.nextToken();
                    getConfigurationProfileResult.setValidators(new ListUnmarshaller<Validator>(ValidatorJsonUnmarshaller.getInstance())

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

        return getConfigurationProfileResult;
    }

    private static GetConfigurationProfileResultJsonUnmarshaller instance;

    public static GetConfigurationProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetConfigurationProfileResultJsonUnmarshaller();
        return instance;
    }
}
