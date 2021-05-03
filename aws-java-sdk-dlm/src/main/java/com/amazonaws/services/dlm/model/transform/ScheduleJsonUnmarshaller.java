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
package com.amazonaws.services.dlm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Schedule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleJsonUnmarshaller implements Unmarshaller<Schedule, JsonUnmarshallerContext> {

    public Schedule unmarshall(JsonUnmarshallerContext context) throws Exception {
        Schedule schedule = new Schedule();

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
                    schedule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyTags", targetDepth)) {
                    context.nextToken();
                    schedule.setCopyTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TagsToAdd", targetDepth)) {
                    context.nextToken();
                    schedule.setTagsToAdd(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VariableTags", targetDepth)) {
                    context.nextToken();
                    schedule.setVariableTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreateRule", targetDepth)) {
                    context.nextToken();
                    schedule.setCreateRule(CreateRuleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RetainRule", targetDepth)) {
                    context.nextToken();
                    schedule.setRetainRule(RetainRuleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FastRestoreRule", targetDepth)) {
                    context.nextToken();
                    schedule.setFastRestoreRule(FastRestoreRuleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CrossRegionCopyRules", targetDepth)) {
                    context.nextToken();
                    schedule.setCrossRegionCopyRules(new ListUnmarshaller<CrossRegionCopyRule>(CrossRegionCopyRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ShareRules", targetDepth)) {
                    context.nextToken();
                    schedule.setShareRules(new ListUnmarshaller<ShareRule>(ShareRuleJsonUnmarshaller.getInstance())

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

        return schedule;
    }

    private static ScheduleJsonUnmarshaller instance;

    public static ScheduleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleJsonUnmarshaller();
        return instance;
    }
}
