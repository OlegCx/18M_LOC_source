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
package com.amazonaws.services.cognitosync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetIdentityPoolConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityPoolConfigurationResultJsonUnmarshaller implements Unmarshaller<GetIdentityPoolConfigurationResult, JsonUnmarshallerContext> {

    public GetIdentityPoolConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIdentityPoolConfigurationResult getIdentityPoolConfigurationResult = new GetIdentityPoolConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getIdentityPoolConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IdentityPoolId", targetDepth)) {
                    context.nextToken();
                    getIdentityPoolConfigurationResult.setIdentityPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PushSync", targetDepth)) {
                    context.nextToken();
                    getIdentityPoolConfigurationResult.setPushSync(PushSyncJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CognitoStreams", targetDepth)) {
                    context.nextToken();
                    getIdentityPoolConfigurationResult.setCognitoStreams(CognitoStreamsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getIdentityPoolConfigurationResult;
    }

    private static GetIdentityPoolConfigurationResultJsonUnmarshaller instance;

    public static GetIdentityPoolConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdentityPoolConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
