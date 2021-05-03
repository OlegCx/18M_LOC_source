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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ChapInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChapInfoJsonUnmarshaller implements Unmarshaller<ChapInfo, JsonUnmarshallerContext> {

    public ChapInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChapInfo chapInfo = new ChapInfo();

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
                if (context.testExpression("TargetARN", targetDepth)) {
                    context.nextToken();
                    chapInfo.setTargetARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretToAuthenticateInitiator", targetDepth)) {
                    context.nextToken();
                    chapInfo.setSecretToAuthenticateInitiator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitiatorName", targetDepth)) {
                    context.nextToken();
                    chapInfo.setInitiatorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretToAuthenticateTarget", targetDepth)) {
                    context.nextToken();
                    chapInfo.setSecretToAuthenticateTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return chapInfo;
    }

    private static ChapInfoJsonUnmarshaller instance;

    public static ChapInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChapInfoJsonUnmarshaller();
        return instance;
    }
}
