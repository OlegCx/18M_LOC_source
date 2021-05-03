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
 * TranscriptionJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptionJobSummaryJsonUnmarshaller implements Unmarshaller<TranscriptionJobSummary, JsonUnmarshallerContext> {

    public TranscriptionJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TranscriptionJobSummary transcriptionJobSummary = new TranscriptionJobSummary();

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
                if (context.testExpression("TranscriptionJobName", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setTranscriptionJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TranscriptionJobStatus", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setTranscriptionJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputLocationType", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setOutputLocationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentRedaction", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setContentRedaction(ContentRedactionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelSettings", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setModelSettings(ModelSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IdentifyLanguage", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setIdentifyLanguage(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IdentifiedLanguageScore", targetDepth)) {
                    context.nextToken();
                    transcriptionJobSummary.setIdentifiedLanguageScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return transcriptionJobSummary;
    }

    private static TranscriptionJobSummaryJsonUnmarshaller instance;

    public static TranscriptionJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptionJobSummaryJsonUnmarshaller();
        return instance;
    }
}
