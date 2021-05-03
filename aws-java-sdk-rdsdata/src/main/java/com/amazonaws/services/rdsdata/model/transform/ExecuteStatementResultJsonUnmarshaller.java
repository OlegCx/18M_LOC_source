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
package com.amazonaws.services.rdsdata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rdsdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExecuteStatementResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementResultJsonUnmarshaller implements Unmarshaller<ExecuteStatementResult, JsonUnmarshallerContext> {

    public ExecuteStatementResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExecuteStatementResult executeStatementResult = new ExecuteStatementResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return executeStatementResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("columnMetadata", targetDepth)) {
                    context.nextToken();
                    executeStatementResult.setColumnMetadata(new ListUnmarshaller<ColumnMetadata>(ColumnMetadataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("generatedFields", targetDepth)) {
                    context.nextToken();
                    executeStatementResult.setGeneratedFields(new ListUnmarshaller<Field>(FieldJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("numberOfRecordsUpdated", targetDepth)) {
                    context.nextToken();
                    executeStatementResult.setNumberOfRecordsUpdated(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("records", targetDepth)) {
                    context.nextToken();
                    executeStatementResult.setRecords(new ListUnmarshaller<java.util.List<Field>>(new ListUnmarshaller<Field>(FieldJsonUnmarshaller
                            .getInstance())

                    )

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return executeStatementResult;
    }

    private static ExecuteStatementResultJsonUnmarshaller instance;

    public static ExecuteStatementResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExecuteStatementResultJsonUnmarshaller();
        return instance;
    }
}
