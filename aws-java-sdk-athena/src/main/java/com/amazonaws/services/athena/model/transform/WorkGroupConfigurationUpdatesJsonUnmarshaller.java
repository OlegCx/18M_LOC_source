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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkGroupConfigurationUpdates JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkGroupConfigurationUpdatesJsonUnmarshaller implements Unmarshaller<WorkGroupConfigurationUpdates, JsonUnmarshallerContext> {

    public WorkGroupConfigurationUpdates unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkGroupConfigurationUpdates workGroupConfigurationUpdates = new WorkGroupConfigurationUpdates();

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
                if (context.testExpression("EnforceWorkGroupConfiguration", targetDepth)) {
                    context.nextToken();
                    workGroupConfigurationUpdates.setEnforceWorkGroupConfiguration(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ResultConfigurationUpdates", targetDepth)) {
                    context.nextToken();
                    workGroupConfigurationUpdates.setResultConfigurationUpdates(ResultConfigurationUpdatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PublishCloudWatchMetricsEnabled", targetDepth)) {
                    context.nextToken();
                    workGroupConfigurationUpdates.setPublishCloudWatchMetricsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("BytesScannedCutoffPerQuery", targetDepth)) {
                    context.nextToken();
                    workGroupConfigurationUpdates.setBytesScannedCutoffPerQuery(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("RemoveBytesScannedCutoffPerQuery", targetDepth)) {
                    context.nextToken();
                    workGroupConfigurationUpdates.setRemoveBytesScannedCutoffPerQuery(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequesterPaysEnabled", targetDepth)) {
                    context.nextToken();
                    workGroupConfigurationUpdates.setRequesterPaysEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    workGroupConfigurationUpdates.setEngineVersion(EngineVersionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workGroupConfigurationUpdates;
    }

    private static WorkGroupConfigurationUpdatesJsonUnmarshaller instance;

    public static WorkGroupConfigurationUpdatesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkGroupConfigurationUpdatesJsonUnmarshaller();
        return instance;
    }
}
