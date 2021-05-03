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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DashIsoGroupSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashIsoGroupSettingsJsonUnmarshaller implements Unmarshaller<DashIsoGroupSettings, JsonUnmarshallerContext> {

    public DashIsoGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        DashIsoGroupSettings dashIsoGroupSettings = new DashIsoGroupSettings();

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
                if (context.testExpression("additionalManifests", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setAdditionalManifests(new ListUnmarshaller<DashAdditionalManifest>(DashAdditionalManifestJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("audioChannelConfigSchemeIdUri", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setAudioChannelConfigSchemeIdUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("baseUrl", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setBaseUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setDestination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationSettings", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setDestinationSettings(DestinationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryption", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setEncryption(DashIsoEncryptionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fragmentLength", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setFragmentLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hbbtvCompliance", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setHbbtvCompliance(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minBufferTime", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setMinBufferTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minFinalSegmentLength", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setMinFinalSegmentLength(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("mpdProfile", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setMpdProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ptsOffsetHandlingForBFrames", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setPtsOffsetHandlingForBFrames(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentControl", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setSegmentControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentLength", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setSegmentLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("writeSegmentTimelineInRepresentation", targetDepth)) {
                    context.nextToken();
                    dashIsoGroupSettings.setWriteSegmentTimelineInRepresentation(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dashIsoGroupSettings;
    }

    private static DashIsoGroupSettingsJsonUnmarshaller instance;

    public static DashIsoGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DashIsoGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
