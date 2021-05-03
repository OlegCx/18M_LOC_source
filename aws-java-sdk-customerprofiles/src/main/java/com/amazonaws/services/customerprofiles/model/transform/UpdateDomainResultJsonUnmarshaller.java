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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateDomainResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainResultJsonUnmarshaller implements Unmarshaller<UpdateDomainResult, JsonUnmarshallerContext> {

    public UpdateDomainResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateDomainResult updateDomainResult = new UpdateDomainResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateDomainResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    updateDomainResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultExpirationDays", targetDepth)) {
                    context.nextToken();
                    updateDomainResult.setDefaultExpirationDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DefaultEncryptionKey", targetDepth)) {
                    context.nextToken();
                    updateDomainResult.setDefaultEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeadLetterQueueUrl", targetDepth)) {
                    context.nextToken();
                    updateDomainResult.setDeadLetterQueueUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Matching", targetDepth)) {
                    context.nextToken();
                    updateDomainResult.setMatching(MatchingResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    updateDomainResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    updateDomainResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    updateDomainResult
                            .setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return updateDomainResult;
    }

    private static UpdateDomainResultJsonUnmarshaller instance;

    public static UpdateDomainResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDomainResultJsonUnmarshaller();
        return instance;
    }
}
