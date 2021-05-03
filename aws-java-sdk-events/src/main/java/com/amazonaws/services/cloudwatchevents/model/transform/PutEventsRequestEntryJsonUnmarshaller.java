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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutEventsRequestEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventsRequestEntryJsonUnmarshaller implements Unmarshaller<PutEventsRequestEntry, JsonUnmarshallerContext> {

    public PutEventsRequestEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutEventsRequestEntry putEventsRequestEntry = new PutEventsRequestEntry();

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
                if (context.testExpression("Time", targetDepth)) {
                    context.nextToken();
                    putEventsRequestEntry.setTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    context.nextToken();
                    putEventsRequestEntry.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Resources", targetDepth)) {
                    context.nextToken();
                    putEventsRequestEntry.setResources(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DetailType", targetDepth)) {
                    context.nextToken();
                    putEventsRequestEntry.setDetailType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Detail", targetDepth)) {
                    context.nextToken();
                    putEventsRequestEntry.setDetail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventBusName", targetDepth)) {
                    context.nextToken();
                    putEventsRequestEntry.setEventBusName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TraceHeader", targetDepth)) {
                    context.nextToken();
                    putEventsRequestEntry.setTraceHeader(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return putEventsRequestEntry;
    }

    private static PutEventsRequestEntryJsonUnmarshaller instance;

    public static PutEventsRequestEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutEventsRequestEntryJsonUnmarshaller();
        return instance;
    }
}
