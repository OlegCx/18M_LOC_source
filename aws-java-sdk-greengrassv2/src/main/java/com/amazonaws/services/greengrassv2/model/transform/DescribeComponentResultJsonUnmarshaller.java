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
package com.amazonaws.services.greengrassv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrassv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeComponentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeComponentResultJsonUnmarshaller implements Unmarshaller<DescribeComponentResult, JsonUnmarshallerContext> {

    public DescribeComponentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeComponentResult describeComponentResult = new DescribeComponentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeComponentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("componentName", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("componentVersion", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setComponentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("publisher", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setPublisher(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setStatus(CloudComponentStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("platforms", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setPlatforms(new ListUnmarshaller<ComponentPlatform>(ComponentPlatformJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeComponentResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return describeComponentResult;
    }

    private static DescribeComponentResultJsonUnmarshaller instance;

    public static DescribeComponentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeComponentResultJsonUnmarshaller();
        return instance;
    }
}
