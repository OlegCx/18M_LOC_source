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
 * GraphqlApi JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GraphqlApiJsonUnmarshaller implements Unmarshaller<GraphqlApi, JsonUnmarshallerContext> {

    public GraphqlApi unmarshall(JsonUnmarshallerContext context) throws Exception {
        GraphqlApi graphqlApi = new GraphqlApi();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiId", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setApiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authenticationType", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setAuthenticationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logConfig", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setLogConfig(LogConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("userPoolConfig", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setUserPoolConfig(UserPoolConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("openIDConnectConfig", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setOpenIDConnectConfig(OpenIDConnectConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uris", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setUris(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("additionalAuthenticationProviders", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setAdditionalAuthenticationProviders(new ListUnmarshaller<AdditionalAuthenticationProvider>(
                            AdditionalAuthenticationProviderJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("xrayEnabled", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setXrayEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("wafWebAclArn", targetDepth)) {
                    context.nextToken();
                    graphqlApi.setWafWebAclArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return graphqlApi;
    }

    private static GraphqlApiJsonUnmarshaller instance;

    public static GraphqlApiJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GraphqlApiJsonUnmarshaller();
        return instance;
    }
}
