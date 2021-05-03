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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListDocumentMetadataHistoryResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDocumentMetadataHistoryResultJsonUnmarshaller implements Unmarshaller<ListDocumentMetadataHistoryResult, JsonUnmarshallerContext> {

    public ListDocumentMetadataHistoryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListDocumentMetadataHistoryResult listDocumentMetadataHistoryResult = new ListDocumentMetadataHistoryResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listDocumentMetadataHistoryResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    listDocumentMetadataHistoryResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    listDocumentMetadataHistoryResult.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Author", targetDepth)) {
                    context.nextToken();
                    listDocumentMetadataHistoryResult.setAuthor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metadata", targetDepth)) {
                    context.nextToken();
                    listDocumentMetadataHistoryResult.setMetadata(DocumentMetadataResponseInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listDocumentMetadataHistoryResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listDocumentMetadataHistoryResult;
    }

    private static ListDocumentMetadataHistoryResultJsonUnmarshaller instance;

    public static ListDocumentMetadataHistoryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListDocumentMetadataHistoryResultJsonUnmarshaller();
        return instance;
    }
}
