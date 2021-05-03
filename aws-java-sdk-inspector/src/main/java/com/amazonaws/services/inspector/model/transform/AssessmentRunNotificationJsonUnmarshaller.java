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
package com.amazonaws.services.inspector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssessmentRunNotification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentRunNotificationJsonUnmarshaller implements Unmarshaller<AssessmentRunNotification, JsonUnmarshallerContext> {

    public AssessmentRunNotification unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentRunNotification assessmentRunNotification = new AssessmentRunNotification();

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
                if (context.testExpression("date", targetDepth)) {
                    context.nextToken();
                    assessmentRunNotification.setDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("event", targetDepth)) {
                    context.nextToken();
                    assessmentRunNotification.setEvent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    assessmentRunNotification.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    context.nextToken();
                    assessmentRunNotification.setError(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("snsTopicArn", targetDepth)) {
                    context.nextToken();
                    assessmentRunNotification.setSnsTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snsPublishStatusCode", targetDepth)) {
                    context.nextToken();
                    assessmentRunNotification.setSnsPublishStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessmentRunNotification;
    }

    private static AssessmentRunNotificationJsonUnmarshaller instance;

    public static AssessmentRunNotificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentRunNotificationJsonUnmarshaller();
        return instance;
    }
}
