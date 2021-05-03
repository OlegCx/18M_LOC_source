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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InfrastructureConfigurationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InfrastructureConfigurationSummaryJsonUnmarshaller implements Unmarshaller<InfrastructureConfigurationSummary, JsonUnmarshallerContext> {

    public InfrastructureConfigurationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        InfrastructureConfigurationSummary infrastructureConfigurationSummary = new InfrastructureConfigurationSummary();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateUpdated", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setDateUpdated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceTags", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setResourceTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("instanceTypes", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("instanceProfileName", targetDepth)) {
                    context.nextToken();
                    infrastructureConfigurationSummary.setInstanceProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return infrastructureConfigurationSummary;
    }

    private static InfrastructureConfigurationSummaryJsonUnmarshaller instance;

    public static InfrastructureConfigurationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InfrastructureConfigurationSummaryJsonUnmarshaller();
        return instance;
    }
}
