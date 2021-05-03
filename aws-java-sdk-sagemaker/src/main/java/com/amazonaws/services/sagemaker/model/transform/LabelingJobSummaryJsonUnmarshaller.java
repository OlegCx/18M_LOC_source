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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LabelingJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobSummaryJsonUnmarshaller implements Unmarshaller<LabelingJobSummary, JsonUnmarshallerContext> {

    public LabelingJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        LabelingJobSummary labelingJobSummary = new LabelingJobSummary();

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
                if (context.testExpression("LabelingJobName", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setLabelingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelingJobArn", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setLabelingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LabelingJobStatus", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setLabelingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelCounters", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setLabelCounters(LabelCountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WorkteamArn", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setWorkteamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreHumanTaskLambdaArn", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setPreHumanTaskLambdaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AnnotationConsolidationLambdaArn", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setAnnotationConsolidationLambdaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelingJobOutput", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setLabelingJobOutput(LabelingJobOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputConfig", targetDepth)) {
                    context.nextToken();
                    labelingJobSummary.setInputConfig(LabelingJobInputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return labelingJobSummary;
    }

    private static LabelingJobSummaryJsonUnmarshaller instance;

    public static LabelingJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobSummaryJsonUnmarshaller();
        return instance;
    }
}
