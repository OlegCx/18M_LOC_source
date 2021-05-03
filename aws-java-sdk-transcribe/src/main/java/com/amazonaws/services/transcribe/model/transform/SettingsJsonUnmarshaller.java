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
package com.amazonaws.services.transcribe.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SettingsJsonUnmarshaller implements Unmarshaller<Settings, JsonUnmarshallerContext> {

    public Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Settings settings = new Settings();

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
                if (context.testExpression("VocabularyName", targetDepth)) {
                    context.nextToken();
                    settings.setVocabularyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShowSpeakerLabels", targetDepth)) {
                    context.nextToken();
                    settings.setShowSpeakerLabels(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaxSpeakerLabels", targetDepth)) {
                    context.nextToken();
                    settings.setMaxSpeakerLabels(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ChannelIdentification", targetDepth)) {
                    context.nextToken();
                    settings.setChannelIdentification(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ShowAlternatives", targetDepth)) {
                    context.nextToken();
                    settings.setShowAlternatives(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaxAlternatives", targetDepth)) {
                    context.nextToken();
                    settings.setMaxAlternatives(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterName", targetDepth)) {
                    context.nextToken();
                    settings.setVocabularyFilterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterMethod", targetDepth)) {
                    context.nextToken();
                    settings.setVocabularyFilterMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return settings;
    }

    private static SettingsJsonUnmarshaller instance;

    public static SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SettingsJsonUnmarshaller();
        return instance;
    }
}
