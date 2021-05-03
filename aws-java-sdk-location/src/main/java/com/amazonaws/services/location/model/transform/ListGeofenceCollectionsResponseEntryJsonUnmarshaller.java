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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListGeofenceCollectionsResponseEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGeofenceCollectionsResponseEntryJsonUnmarshaller implements Unmarshaller<ListGeofenceCollectionsResponseEntry, JsonUnmarshallerContext> {

    public ListGeofenceCollectionsResponseEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListGeofenceCollectionsResponseEntry listGeofenceCollectionsResponseEntry = new ListGeofenceCollectionsResponseEntry();

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
                if (context.testExpression("CollectionName", targetDepth)) {
                    context.nextToken();
                    listGeofenceCollectionsResponseEntry.setCollectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    listGeofenceCollectionsResponseEntry.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    listGeofenceCollectionsResponseEntry.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PricingPlan", targetDepth)) {
                    context.nextToken();
                    listGeofenceCollectionsResponseEntry.setPricingPlan(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PricingPlanDataSource", targetDepth)) {
                    context.nextToken();
                    listGeofenceCollectionsResponseEntry.setPricingPlanDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    context.nextToken();
                    listGeofenceCollectionsResponseEntry.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listGeofenceCollectionsResponseEntry;
    }

    private static ListGeofenceCollectionsResponseEntryJsonUnmarshaller instance;

    public static ListGeofenceCollectionsResponseEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListGeofenceCollectionsResponseEntryJsonUnmarshaller();
        return instance;
    }
}