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
 * GetUserResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserResultJsonUnmarshaller implements Unmarshaller<GetUserResult, JsonUnmarshallerContext> {

    public GetUserResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetUserResult getUserResult = new GetUserResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getUserResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    getUserResult.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserAttributes", targetDepth)) {
                    context.nextToken();
                    getUserResult.setUserAttributes(new ListUnmarshaller<AttributeType>(AttributeTypeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MFAOptions", targetDepth)) {
                    context.nextToken();
                    getUserResult.setMFAOptions(new ListUnmarshaller<MFAOptionType>(MFAOptionTypeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PreferredMfaSetting", targetDepth)) {
                    context.nextToken();
                    getUserResult.setPreferredMfaSetting(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserMFASettingList", targetDepth)) {
                    context.nextToken();
                    getUserResult.setUserMFASettingList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return getUserResult;
    }

    private static GetUserResultJsonUnmarshaller instance;

    public static GetUserResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetUserResultJsonUnmarshaller();
        return instance;
    }
}
