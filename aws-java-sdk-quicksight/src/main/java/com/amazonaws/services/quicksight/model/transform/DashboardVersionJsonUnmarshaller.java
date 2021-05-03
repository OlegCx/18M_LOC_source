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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DashboardVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardVersionJsonUnmarshaller implements Unmarshaller<DashboardVersion, JsonUnmarshallerContext> {

    public DashboardVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        DashboardVersion dashboardVersion = new DashboardVersion();

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
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Errors", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setErrors(new ListUnmarshaller<DashboardError>(DashboardErrorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VersionNumber", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceEntityArn", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setSourceEntityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSetArns", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setDataSetArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThemeArn", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setThemeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sheets", targetDepth)) {
                    context.nextToken();
                    dashboardVersion.setSheets(new ListUnmarshaller<Sheet>(SheetJsonUnmarshaller.getInstance())

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

        return dashboardVersion;
    }

    private static DashboardVersionJsonUnmarshaller instance;

    public static DashboardVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DashboardVersionJsonUnmarshaller();
        return instance;
    }
}
