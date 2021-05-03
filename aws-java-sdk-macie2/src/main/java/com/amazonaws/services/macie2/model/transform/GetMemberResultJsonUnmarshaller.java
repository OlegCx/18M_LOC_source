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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMemberResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMemberResultJsonUnmarshaller implements Unmarshaller<GetMemberResult, JsonUnmarshallerContext> {

    public GetMemberResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMemberResult getMemberResult = new GetMemberResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMemberResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("administratorAccountId", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setAdministratorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("email", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("invitedAt", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setInvitedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("masterAccountId", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setMasterAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("relationshipStatus", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setRelationshipStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getMemberResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMemberResult;
    }

    private static GetMemberResultJsonUnmarshaller instance;

    public static GetMemberResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMemberResultJsonUnmarshaller();
        return instance;
    }
}
