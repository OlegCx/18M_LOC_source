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
package com.amazonaws.services.mediapackagevod.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagevod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreatePackagingGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackagingGroupResultJsonUnmarshaller implements Unmarshaller<CreatePackagingGroupResult, JsonUnmarshallerContext> {

    public CreatePackagingGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePackagingGroupResult createPackagingGroupResult = new CreatePackagingGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createPackagingGroupResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createPackagingGroupResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorization", targetDepth)) {
                    context.nextToken();
                    createPackagingGroupResult.setAuthorization(AuthorizationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("domainName", targetDepth)) {
                    context.nextToken();
                    createPackagingGroupResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("egressAccessLogs", targetDepth)) {
                    context.nextToken();
                    createPackagingGroupResult.setEgressAccessLogs(EgressAccessLogsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createPackagingGroupResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createPackagingGroupResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createPackagingGroupResult;
    }

    private static CreatePackagingGroupResultJsonUnmarshaller instance;

    public static CreatePackagingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePackagingGroupResultJsonUnmarshaller();
        return instance;
    }
}
