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
package com.amazonaws.services.personalizeevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalizeevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Event JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventJsonUnmarshaller implements Unmarshaller<Event, JsonUnmarshallerContext> {

    public Event unmarshall(JsonUnmarshallerContext context) throws Exception {
        Event event = new Event();

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
                if (context.testExpression("eventId", targetDepth)) {
                    context.nextToken();
                    event.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventType", targetDepth)) {
                    context.nextToken();
                    event.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventValue", targetDepth)) {
                    context.nextToken();
                    event.setEventValue(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("itemId", targetDepth)) {
                    context.nextToken();
                    event.setItemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("properties", targetDepth)) {
                    context.nextToken();
                    event.setProperties(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(context));
                }
                if (context.testExpression("sentAt", targetDepth)) {
                    context.nextToken();
                    event.setSentAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("recommendationId", targetDepth)) {
                    context.nextToken();
                    event.setRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("impression", targetDepth)) {
                    context.nextToken();
                    event.setImpression(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return event;
    }

    private static EventJsonUnmarshaller instance;

    public static EventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventJsonUnmarshaller();
        return instance;
    }
}
