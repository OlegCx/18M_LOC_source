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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalyticsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3ApplicationCodeLocationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ApplicationCodeLocationDescriptionJsonUnmarshaller implements Unmarshaller<S3ApplicationCodeLocationDescription, JsonUnmarshallerContext> {

    public S3ApplicationCodeLocationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3ApplicationCodeLocationDescription s3ApplicationCodeLocationDescription = new S3ApplicationCodeLocationDescription();

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
                if (context.testExpression("BucketARN", targetDepth)) {
                    context.nextToken();
                    s3ApplicationCodeLocationDescription.setBucketARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileKey", targetDepth)) {
                    context.nextToken();
                    s3ApplicationCodeLocationDescription.setFileKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ObjectVersion", targetDepth)) {
                    context.nextToken();
                    s3ApplicationCodeLocationDescription.setObjectVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3ApplicationCodeLocationDescription;
    }

    private static S3ApplicationCodeLocationDescriptionJsonUnmarshaller instance;

    public static S3ApplicationCodeLocationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ApplicationCodeLocationDescriptionJsonUnmarshaller();
        return instance;
    }
}
