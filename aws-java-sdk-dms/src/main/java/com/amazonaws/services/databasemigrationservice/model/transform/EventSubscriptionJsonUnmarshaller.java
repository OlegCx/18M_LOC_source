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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EventSubscription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSubscriptionJsonUnmarshaller implements Unmarshaller<EventSubscription, JsonUnmarshallerContext> {

    public EventSubscription unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventSubscription eventSubscription = new EventSubscription();

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
                if (context.testExpression("CustomerAwsId", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setCustomerAwsId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustSubscriptionId", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setCustSubscriptionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicArn", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setSnsTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionCreationTime", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setSubscriptionCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceType", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceIdsList", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setSourceIdsList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("EventCategoriesList", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setEventCategoriesList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    eventSubscription.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eventSubscription;
    }

    private static EventSubscriptionJsonUnmarshaller instance;

    public static EventSubscriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventSubscriptionJsonUnmarshaller();
        return instance;
    }
}
