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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WriteSegmentRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteSegmentRequestJsonUnmarshaller implements Unmarshaller<WriteSegmentRequest, JsonUnmarshallerContext> {

    public WriteSegmentRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        WriteSegmentRequest writeSegmentRequest = new WriteSegmentRequest();

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
                if (context.testExpression("Dimensions", targetDepth)) {
                    context.nextToken();
                    writeSegmentRequest.setDimensions(SegmentDimensionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    writeSegmentRequest.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SegmentGroups", targetDepth)) {
                    context.nextToken();
                    writeSegmentRequest.setSegmentGroups(SegmentGroupListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    writeSegmentRequest.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return writeSegmentRequest;
    }

    private static WriteSegmentRequestJsonUnmarshaller instance;

    public static WriteSegmentRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WriteSegmentRequestJsonUnmarshaller();
        return instance;
    }
}
