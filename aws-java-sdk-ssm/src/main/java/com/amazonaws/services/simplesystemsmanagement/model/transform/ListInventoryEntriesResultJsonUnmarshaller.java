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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListInventoryEntriesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInventoryEntriesResultJsonUnmarshaller implements Unmarshaller<ListInventoryEntriesResult, JsonUnmarshallerContext> {

    public ListInventoryEntriesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListInventoryEntriesResult listInventoryEntriesResult = new ListInventoryEntriesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listInventoryEntriesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TypeName", targetDepth)) {
                    context.nextToken();
                    listInventoryEntriesResult.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    listInventoryEntriesResult.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaVersion", targetDepth)) {
                    context.nextToken();
                    listInventoryEntriesResult.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaptureTime", targetDepth)) {
                    context.nextToken();
                    listInventoryEntriesResult.setCaptureTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Entries", targetDepth)) {
                    context.nextToken();
                    listInventoryEntriesResult.setEntries(new ListUnmarshaller<java.util.Map<String, String>>(new MapUnmarshaller<String, String>(context
                            .getUnmarshaller(String.class), context.getUnmarshaller(String.class)))

                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listInventoryEntriesResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listInventoryEntriesResult;
    }

    private static ListInventoryEntriesResultJsonUnmarshaller instance;

    public static ListInventoryEntriesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListInventoryEntriesResultJsonUnmarshaller();
        return instance;
    }
}
