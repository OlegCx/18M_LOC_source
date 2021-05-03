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
package com.amazonaws.services.health.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OrganizationEventFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationEventFilterJsonUnmarshaller implements Unmarshaller<OrganizationEventFilter, JsonUnmarshallerContext> {

    public OrganizationEventFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrganizationEventFilter organizationEventFilter = new OrganizationEventFilter();

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
                if (context.testExpression("eventTypeCodes", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setEventTypeCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("awsAccountIds", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setAwsAccountIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("services", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setServices(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("regions", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setStartTime(DateTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setEndTime(DateTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setLastUpdatedTime(DateTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("entityArns", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setEntityArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("entityValues", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setEntityValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("eventTypeCategories", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setEventTypeCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("eventStatusCodes", targetDepth)) {
                    context.nextToken();
                    organizationEventFilter.setEventStatusCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return organizationEventFilter;
    }

    private static OrganizationEventFilterJsonUnmarshaller instance;

    public static OrganizationEventFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationEventFilterJsonUnmarshaller();
        return instance;
    }
}
