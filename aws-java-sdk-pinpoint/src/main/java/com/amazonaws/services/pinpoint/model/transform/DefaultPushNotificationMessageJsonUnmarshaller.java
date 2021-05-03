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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DefaultPushNotificationMessage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultPushNotificationMessageJsonUnmarshaller implements Unmarshaller<DefaultPushNotificationMessage, JsonUnmarshallerContext> {

    public DefaultPushNotificationMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        DefaultPushNotificationMessage defaultPushNotificationMessage = new DefaultPushNotificationMessage();

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
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    defaultPushNotificationMessage.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Body", targetDepth)) {
                    context.nextToken();
                    defaultPushNotificationMessage.setBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Data", targetDepth)) {
                    context.nextToken();
                    defaultPushNotificationMessage.setData(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SilentPush", targetDepth)) {
                    context.nextToken();
                    defaultPushNotificationMessage.setSilentPush(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Substitutions", targetDepth)) {
                    context.nextToken();
                    defaultPushNotificationMessage.setSubstitutions(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    defaultPushNotificationMessage.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    defaultPushNotificationMessage.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return defaultPushNotificationMessage;
    }

    private static DefaultPushNotificationMessageJsonUnmarshaller instance;

    public static DefaultPushNotificationMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DefaultPushNotificationMessageJsonUnmarshaller();
        return instance;
    }
}
