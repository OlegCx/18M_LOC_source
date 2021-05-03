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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Thumbnails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThumbnailsJsonUnmarshaller implements Unmarshaller<Thumbnails, JsonUnmarshallerContext> {

    public Thumbnails unmarshall(JsonUnmarshallerContext context) throws Exception {
        Thumbnails thumbnails = new Thumbnails();

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
                if (context.testExpression("Format", targetDepth)) {
                    context.nextToken();
                    thumbnails.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Interval", targetDepth)) {
                    context.nextToken();
                    thumbnails.setInterval(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Resolution", targetDepth)) {
                    context.nextToken();
                    thumbnails.setResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AspectRatio", targetDepth)) {
                    context.nextToken();
                    thumbnails.setAspectRatio(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxWidth", targetDepth)) {
                    context.nextToken();
                    thumbnails.setMaxWidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxHeight", targetDepth)) {
                    context.nextToken();
                    thumbnails.setMaxHeight(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SizingPolicy", targetDepth)) {
                    context.nextToken();
                    thumbnails.setSizingPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaddingPolicy", targetDepth)) {
                    context.nextToken();
                    thumbnails.setPaddingPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return thumbnails;
    }

    private static ThumbnailsJsonUnmarshaller instance;

    public static ThumbnailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThumbnailsJsonUnmarshaller();
        return instance;
    }
}
