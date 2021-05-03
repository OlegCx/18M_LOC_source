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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RemediationConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemediationConfigurationJsonUnmarshaller implements Unmarshaller<RemediationConfiguration, JsonUnmarshallerContext> {

    public RemediationConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        RemediationConfiguration remediationConfiguration = new RemediationConfiguration();

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
                if (context.testExpression("ConfigRuleName", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setConfigRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetType", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setTargetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetId", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setTargetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetVersion", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setTargetVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setParameters(new MapUnmarshaller<String, RemediationParameterValue>(context.getUnmarshaller(String.class),
                            RemediationParameterValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Automatic", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setAutomatic(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionControls", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setExecutionControls(ExecutionControlsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumAutomaticAttempts", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setMaximumAutomaticAttempts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RetryAttemptSeconds", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setRetryAttemptSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedByService", targetDepth)) {
                    context.nextToken();
                    remediationConfiguration.setCreatedByService(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return remediationConfiguration;
    }

    private static RemediationConfigurationJsonUnmarshaller instance;

    public static RemediationConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemediationConfigurationJsonUnmarshaller();
        return instance;
    }
}
