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
package com.amazonaws.services.kinesis.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRecordsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecordsResultJsonUnmarshaller implements Unmarshaller<GetRecordsResult, JsonUnmarshallerContext> {

    public GetRecordsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRecordsResult getRecordsResult = new GetRecordsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRecordsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Records", targetDepth)) {
                    context.nextToken();
                    getRecordsResult.setRecords(new ListUnmarshaller<Record>(RecordJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NextShardIterator", targetDepth)) {
                    context.nextToken();
                    getRecordsResult.setNextShardIterator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MillisBehindLatest", targetDepth)) {
                    context.nextToken();
                    getRecordsResult.setMillisBehindLatest(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ChildShards", targetDepth)) {
                    context.nextToken();
                    getRecordsResult.setChildShards(new ListUnmarshaller<ChildShard>(ChildShardJsonUnmarshaller.getInstance())

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

        return getRecordsResult;
    }

    private static GetRecordsResultJsonUnmarshaller instance;

    public static GetRecordsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRecordsResultJsonUnmarshaller();
        return instance;
    }
}
