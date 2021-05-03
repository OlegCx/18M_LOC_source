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
package com.amazonaws.services.codeguruprofiler.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codeguruprofiler.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchGetFrameMetricDataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFrameMetricDataResultJsonUnmarshaller implements Unmarshaller<BatchGetFrameMetricDataResult, JsonUnmarshallerContext> {

    public BatchGetFrameMetricDataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetFrameMetricDataResult batchGetFrameMetricDataResult = new BatchGetFrameMetricDataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchGetFrameMetricDataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    batchGetFrameMetricDataResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("endTimes", targetDepth)) {
                    context.nextToken();
                    batchGetFrameMetricDataResult.setEndTimes(new ListUnmarshaller<TimestampStructure>(TimestampStructureJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("frameMetricData", targetDepth)) {
                    context.nextToken();
                    batchGetFrameMetricDataResult.setFrameMetricData(new ListUnmarshaller<FrameMetricDatum>(FrameMetricDatumJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resolution", targetDepth)) {
                    context.nextToken();
                    batchGetFrameMetricDataResult.setResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    batchGetFrameMetricDataResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("unprocessedEndTimes", targetDepth)) {
                    context.nextToken();
                    batchGetFrameMetricDataResult.setUnprocessedEndTimes(new MapUnmarshaller<String, java.util.List<TimestampStructure>>(context
                            .getUnmarshaller(String.class), new ListUnmarshaller<TimestampStructure>(TimestampStructureJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchGetFrameMetricDataResult;
    }

    private static BatchGetFrameMetricDataResultJsonUnmarshaller instance;

    public static BatchGetFrameMetricDataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetFrameMetricDataResultJsonUnmarshaller();
        return instance;
    }
}
