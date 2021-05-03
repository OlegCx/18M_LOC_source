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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DatasetExportJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetExportJobJsonUnmarshaller implements Unmarshaller<DatasetExportJob, JsonUnmarshallerContext> {

    public DatasetExportJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        DatasetExportJob datasetExportJob = new DatasetExportJob();

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
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetExportJobArn", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setDatasetExportJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetArn", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ingestionMode", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setIngestionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobOutput", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setJobOutput(DatasetExportJobOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    datasetExportJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return datasetExportJob;
    }

    private static DatasetExportJobJsonUnmarshaller instance;

    public static DatasetExportJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetExportJobJsonUnmarshaller();
        return instance;
    }
}
