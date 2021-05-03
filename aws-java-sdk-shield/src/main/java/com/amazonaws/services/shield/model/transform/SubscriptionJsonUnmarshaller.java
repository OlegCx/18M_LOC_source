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
package com.amazonaws.services.shield.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Subscription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriptionJsonUnmarshaller implements Unmarshaller<Subscription, JsonUnmarshallerContext> {

    public Subscription unmarshall(JsonUnmarshallerContext context) throws Exception {
        Subscription subscription = new Subscription();

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
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    subscription.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    subscription.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TimeCommitmentInSeconds", targetDepth)) {
                    context.nextToken();
                    subscription.setTimeCommitmentInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AutoRenew", targetDepth)) {
                    context.nextToken();
                    subscription.setAutoRenew(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Limits", targetDepth)) {
                    context.nextToken();
                    subscription.setLimits(new ListUnmarshaller<Limit>(LimitJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProactiveEngagementStatus", targetDepth)) {
                    context.nextToken();
                    subscription.setProactiveEngagementStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionLimits", targetDepth)) {
                    context.nextToken();
                    subscription.setSubscriptionLimits(SubscriptionLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SubscriptionArn", targetDepth)) {
                    context.nextToken();
                    subscription.setSubscriptionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return subscription;
    }

    private static SubscriptionJsonUnmarshaller instance;

    public static SubscriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubscriptionJsonUnmarshaller();
        return instance;
    }
}
