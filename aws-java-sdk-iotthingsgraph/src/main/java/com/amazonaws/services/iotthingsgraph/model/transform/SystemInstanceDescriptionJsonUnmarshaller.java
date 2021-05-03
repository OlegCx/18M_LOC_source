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
package com.amazonaws.services.iotthingsgraph.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotthingsgraph.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SystemInstanceDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemInstanceDescriptionJsonUnmarshaller implements Unmarshaller<SystemInstanceDescription, JsonUnmarshallerContext> {

    public SystemInstanceDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        SystemInstanceDescription systemInstanceDescription = new SystemInstanceDescription();

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
                if (context.testExpression("summary", targetDepth)) {
                    context.nextToken();
                    systemInstanceDescription.setSummary(SystemInstanceSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("definition", targetDepth)) {
                    context.nextToken();
                    systemInstanceDescription.setDefinition(DefinitionDocumentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("s3BucketName", targetDepth)) {
                    context.nextToken();
                    systemInstanceDescription.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metricsConfiguration", targetDepth)) {
                    context.nextToken();
                    systemInstanceDescription.setMetricsConfiguration(MetricsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("validatedNamespaceVersion", targetDepth)) {
                    context.nextToken();
                    systemInstanceDescription.setValidatedNamespaceVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("validatedDependencyRevisions", targetDepth)) {
                    context.nextToken();
                    systemInstanceDescription.setValidatedDependencyRevisions(new ListUnmarshaller<DependencyRevision>(DependencyRevisionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("flowActionsRoleArn", targetDepth)) {
                    context.nextToken();
                    systemInstanceDescription.setFlowActionsRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return systemInstanceDescription;
    }

    private static SystemInstanceDescriptionJsonUnmarshaller instance;

    public static SystemInstanceDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SystemInstanceDescriptionJsonUnmarshaller();
        return instance;
    }
}
