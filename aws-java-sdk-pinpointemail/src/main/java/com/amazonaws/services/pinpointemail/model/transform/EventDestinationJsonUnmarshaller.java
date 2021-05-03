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
package com.amazonaws.services.pinpointemail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointemail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EventDestination JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDestinationJsonUnmarshaller implements Unmarshaller<EventDestination, JsonUnmarshallerContext> {

    public EventDestination unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventDestination eventDestination = new EventDestination();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    eventDestination.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    eventDestination.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MatchingEventTypes", targetDepth)) {
                    context.nextToken();
                    eventDestination.setMatchingEventTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("KinesisFirehoseDestination", targetDepth)) {
                    context.nextToken();
                    eventDestination.setKinesisFirehoseDestination(KinesisFirehoseDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchDestination", targetDepth)) {
                    context.nextToken();
                    eventDestination.setCloudWatchDestination(CloudWatchDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnsDestination", targetDepth)) {
                    context.nextToken();
                    eventDestination.setSnsDestination(SnsDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PinpointDestination", targetDepth)) {
                    context.nextToken();
                    eventDestination.setPinpointDestination(PinpointDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eventDestination;
    }

    private static EventDestinationJsonUnmarshaller instance;

    public static EventDestinationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventDestinationJsonUnmarshaller();
        return instance;
    }
}
