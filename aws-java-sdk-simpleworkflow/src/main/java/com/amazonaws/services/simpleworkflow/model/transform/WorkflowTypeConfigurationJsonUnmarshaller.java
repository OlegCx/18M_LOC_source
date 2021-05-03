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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkflowTypeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowTypeConfigurationJsonUnmarshaller implements Unmarshaller<WorkflowTypeConfiguration, JsonUnmarshallerContext> {

    public WorkflowTypeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowTypeConfiguration workflowTypeConfiguration = new WorkflowTypeConfiguration();

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
                if (context.testExpression("defaultTaskStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    workflowTypeConfiguration.setDefaultTaskStartToCloseTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultExecutionStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    workflowTypeConfiguration.setDefaultExecutionStartToCloseTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultTaskList", targetDepth)) {
                    context.nextToken();
                    workflowTypeConfiguration.setDefaultTaskList(TaskListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("defaultTaskPriority", targetDepth)) {
                    context.nextToken();
                    workflowTypeConfiguration.setDefaultTaskPriority(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultChildPolicy", targetDepth)) {
                    context.nextToken();
                    workflowTypeConfiguration.setDefaultChildPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultLambdaRole", targetDepth)) {
                    context.nextToken();
                    workflowTypeConfiguration.setDefaultLambdaRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workflowTypeConfiguration;
    }

    private static WorkflowTypeConfigurationJsonUnmarshaller instance;

    public static WorkflowTypeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowTypeConfigurationJsonUnmarshaller();
        return instance;
    }
}
