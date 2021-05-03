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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduleActionStartSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleActionStartSettingsJsonUnmarshaller implements Unmarshaller<ScheduleActionStartSettings, JsonUnmarshallerContext> {

    public ScheduleActionStartSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduleActionStartSettings scheduleActionStartSettings = new ScheduleActionStartSettings();

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
                if (context.testExpression("fixedModeScheduleActionStartSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionStartSettings.setFixedModeScheduleActionStartSettings(FixedModeScheduleActionStartSettingsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("followModeScheduleActionStartSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionStartSettings.setFollowModeScheduleActionStartSettings(FollowModeScheduleActionStartSettingsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("immediateModeScheduleActionStartSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionStartSettings.setImmediateModeScheduleActionStartSettings(ImmediateModeScheduleActionStartSettingsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scheduleActionStartSettings;
    }

    private static ScheduleActionStartSettingsJsonUnmarshaller instance;

    public static ScheduleActionStartSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleActionStartSettingsJsonUnmarshaller();
        return instance;
    }
}
