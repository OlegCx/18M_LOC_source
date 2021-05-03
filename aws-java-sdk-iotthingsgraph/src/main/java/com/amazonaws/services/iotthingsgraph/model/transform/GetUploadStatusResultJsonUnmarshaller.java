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
package com.amazonaws.services.iotthingsgraph.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotthingsgraph.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetUploadStatusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUploadStatusResultJsonUnmarshaller implements Unmarshaller<GetUploadStatusResult, JsonUnmarshallerContext> {

    public GetUploadStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetUploadStatusResult getUploadStatusResult = new GetUploadStatusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getUploadStatusResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("uploadId", targetDepth)) {
                    context.nextToken();
                    getUploadStatusResult.setUploadId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uploadStatus", targetDepth)) {
                    context.nextToken();
                    getUploadStatusResult.setUploadStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceArn", targetDepth)) {
                    context.nextToken();
                    getUploadStatusResult.setNamespaceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceName", targetDepth)) {
                    context.nextToken();
                    getUploadStatusResult.setNamespaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceVersion", targetDepth)) {
                    context.nextToken();
                    getUploadStatusResult.setNamespaceVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    getUploadStatusResult.setFailureReason(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    getUploadStatusResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getUploadStatusResult;
    }

    private static GetUploadStatusResultJsonUnmarshaller instance;

    public static GetUploadStatusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetUploadStatusResultJsonUnmarshaller();
        return instance;
    }
}
