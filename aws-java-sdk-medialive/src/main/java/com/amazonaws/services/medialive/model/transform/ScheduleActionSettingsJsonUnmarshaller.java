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
 * ScheduleActionSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleActionSettingsJsonUnmarshaller implements Unmarshaller<ScheduleActionSettings, JsonUnmarshallerContext> {

    public ScheduleActionSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduleActionSettings scheduleActionSettings = new ScheduleActionSettings();

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
                if (context.testExpression("hlsId3SegmentTaggingSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setHlsId3SegmentTaggingSettings(HlsId3SegmentTaggingScheduleActionSettingsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("hlsTimedMetadataSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings
                            .setHlsTimedMetadataSettings(HlsTimedMetadataScheduleActionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputPrepareSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setInputPrepareSettings(InputPrepareScheduleActionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputSwitchSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setInputSwitchSettings(InputSwitchScheduleActionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("motionGraphicsImageActivateSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setMotionGraphicsImageActivateSettings(MotionGraphicsActivateScheduleActionSettingsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("motionGraphicsImageDeactivateSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setMotionGraphicsImageDeactivateSettings(MotionGraphicsDeactivateScheduleActionSettingsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("pauseStateSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setPauseStateSettings(PauseStateScheduleActionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scte35ReturnToNetworkSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setScte35ReturnToNetworkSettings(Scte35ReturnToNetworkScheduleActionSettingsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("scte35SpliceInsertSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setScte35SpliceInsertSettings(Scte35SpliceInsertScheduleActionSettingsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("scte35TimeSignalSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings
                            .setScte35TimeSignalSettings(Scte35TimeSignalScheduleActionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("staticImageActivateSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setStaticImageActivateSettings(StaticImageActivateScheduleActionSettingsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("staticImageDeactivateSettings", targetDepth)) {
                    context.nextToken();
                    scheduleActionSettings.setStaticImageDeactivateSettings(StaticImageDeactivateScheduleActionSettingsJsonUnmarshaller.getInstance()
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

        return scheduleActionSettings;
    }

    private static ScheduleActionSettingsJsonUnmarshaller instance;

    public static ScheduleActionSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleActionSettingsJsonUnmarshaller();
        return instance;
    }
}
