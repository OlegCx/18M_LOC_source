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
 * LabelingJobForWorkteamSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobForWorkteamSummaryJsonUnmarshaller implements Unmarshaller<LabelingJobForWorkteamSummary, JsonUnmarshallerContext> {

    public LabelingJobForWorkteamSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        LabelingJobForWorkteamSummary labelingJobForWorkteamSummary = new LabelingJobForWorkteamSummary();

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
                    labelingJobForWorkteamSummary.setLabelingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobReferenceCode", targetDepth)) {
                    context.nextToken();
                    labelingJobForWorkteamSummary.setJobReferenceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkRequesterAccountId", targetDepth)) {
                    context.nextToken();
                    labelingJobForWorkteamSummary.setWorkRequesterAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    labelingJobForWorkteamSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LabelCounters", targetDepth)) {
                    context.nextToken();
                    labelingJobForWorkteamSummary.setLabelCounters(LabelCountersForWorkteamJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NumberOfHumanWorkersPerDataObject", targetDepth)) {
                    context.nextToken();
                    labelingJobForWorkteamSummary.setNumberOfHumanWorkersPerDataObject(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return labelingJobForWorkteamSummary;
    }

    private static LabelingJobForWorkteamSummaryJsonUnmarshaller instance;

    public static LabelingJobForWorkteamSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobForWorkteamSummaryJsonUnmarshaller();
        return instance;
    }
}
