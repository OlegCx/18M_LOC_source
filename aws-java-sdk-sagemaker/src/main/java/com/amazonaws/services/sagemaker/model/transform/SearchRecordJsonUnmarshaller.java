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
 * SearchRecord JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRecordJsonUnmarshaller implements Unmarshaller<SearchRecord, JsonUnmarshallerContext> {

    public SearchRecord unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchRecord searchRecord = new SearchRecord();

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
                if (context.testExpression("TrainingJob", targetDepth)) {
                    context.nextToken();
                    searchRecord.setTrainingJob(TrainingJobJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Experiment", targetDepth)) {
                    context.nextToken();
                    searchRecord.setExperiment(ExperimentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Trial", targetDepth)) {
                    context.nextToken();
                    searchRecord.setTrial(TrialJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrialComponent", targetDepth)) {
                    context.nextToken();
                    searchRecord.setTrialComponent(TrialComponentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    searchRecord.setEndpoint(EndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelPackage", targetDepth)) {
                    context.nextToken();
                    searchRecord.setModelPackage(ModelPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelPackageGroup", targetDepth)) {
                    context.nextToken();
                    searchRecord.setModelPackageGroup(ModelPackageGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Pipeline", targetDepth)) {
                    context.nextToken();
                    searchRecord.setPipeline(PipelineJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PipelineExecution", targetDepth)) {
                    context.nextToken();
                    searchRecord.setPipelineExecution(PipelineExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FeatureGroup", targetDepth)) {
                    context.nextToken();
                    searchRecord.setFeatureGroup(FeatureGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return searchRecord;
    }

    private static SearchRecordJsonUnmarshaller instance;

    public static SearchRecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchRecordJsonUnmarshaller();
        return instance;
    }
}
