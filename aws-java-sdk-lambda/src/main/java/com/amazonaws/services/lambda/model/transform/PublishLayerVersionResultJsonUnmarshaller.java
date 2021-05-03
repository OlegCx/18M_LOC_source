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
package com.amazonaws.services.lambda.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PublishLayerVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishLayerVersionResultJsonUnmarshaller implements Unmarshaller<PublishLayerVersionResult, JsonUnmarshallerContext> {

    public PublishLayerVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PublishLayerVersionResult publishLayerVersionResult = new PublishLayerVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return publishLayerVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    publishLayerVersionResult.setContent(LayerVersionContentOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LayerArn", targetDepth)) {
                    context.nextToken();
                    publishLayerVersionResult.setLayerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LayerVersionArn", targetDepth)) {
                    context.nextToken();
                    publishLayerVersionResult.setLayerVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    publishLayerVersionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    publishLayerVersionResult.setCreatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    publishLayerVersionResult.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CompatibleRuntimes", targetDepth)) {
                    context.nextToken();
                    publishLayerVersionResult.setCompatibleRuntimes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("LicenseInfo", targetDepth)) {
                    context.nextToken();
                    publishLayerVersionResult.setLicenseInfo(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return publishLayerVersionResult;
    }

    private static PublishLayerVersionResultJsonUnmarshaller instance;

    public static PublishLayerVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublishLayerVersionResultJsonUnmarshaller();
        return instance;
    }
}
