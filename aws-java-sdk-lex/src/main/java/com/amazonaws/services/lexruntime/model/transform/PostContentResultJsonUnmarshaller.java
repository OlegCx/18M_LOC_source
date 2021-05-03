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
package com.amazonaws.services.lexruntime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexruntime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostContentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostContentResultJsonUnmarshaller implements Unmarshaller<PostContentResult, JsonUnmarshallerContext> {

    public PostContentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostContentResult postContentResult = new PostContentResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                postContentResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-intent-name") != null) {
                context.setCurrentHeader("x-amz-lex-intent-name");
                postContentResult.setIntentName(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-nlu-intent-confidence") != null) {
                context.setCurrentHeader("x-amz-lex-nlu-intent-confidence");
                postContentResult.setNluIntentConfidence(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(
                        context));
            }
            if (context.getHeader("x-amz-lex-alternative-intents") != null) {
                context.setCurrentHeader("x-amz-lex-alternative-intents");
                postContentResult.setAlternativeIntents(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(
                        context));
            }
            if (context.getHeader("x-amz-lex-slots") != null) {
                context.setCurrentHeader("x-amz-lex-slots");
                postContentResult.setSlots(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-session-attributes") != null) {
                context.setCurrentHeader("x-amz-lex-session-attributes");
                postContentResult.setSessionAttributes(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(
                        context));
            }
            if (context.getHeader("x-amz-lex-sentiment") != null) {
                context.setCurrentHeader("x-amz-lex-sentiment");
                postContentResult.setSentimentResponse(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-message") != null) {
                context.setCurrentHeader("x-amz-lex-message");
                postContentResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-encoded-message") != null) {
                context.setCurrentHeader("x-amz-lex-encoded-message");
                postContentResult.setEncodedMessage(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-message-format") != null) {
                context.setCurrentHeader("x-amz-lex-message-format");
                postContentResult.setMessageFormat(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-dialog-state") != null) {
                context.setCurrentHeader("x-amz-lex-dialog-state");
                postContentResult.setDialogState(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-slot-to-elicit") != null) {
                context.setCurrentHeader("x-amz-lex-slot-to-elicit");
                postContentResult.setSlotToElicit(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-input-transcript") != null) {
                context.setCurrentHeader("x-amz-lex-input-transcript");
                postContentResult.setInputTranscript(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-encoded-input-transcript") != null) {
                context.setCurrentHeader("x-amz-lex-encoded-input-transcript");
                postContentResult.setEncodedInputTranscript(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-bot-version") != null) {
                context.setCurrentHeader("x-amz-lex-bot-version");
                postContentResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-session-id") != null) {
                context.setCurrentHeader("x-amz-lex-session-id");
                postContentResult.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-active-contexts") != null) {
                context.setCurrentHeader("x-amz-lex-active-contexts");
                postContentResult.setActiveContexts(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(
                        context));
            }
        }

        postContentResult.setAudioStream(context.getHttpResponse().getContent());

        return postContentResult;
    }

    private static PostContentResultJsonUnmarshaller instance;

    public static PostContentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostContentResultJsonUnmarshaller();
        return instance;
    }
}
