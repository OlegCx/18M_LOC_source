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
package com.amazonaws.services.lookoutforvision.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutforvision.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProjectDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectDescriptionJsonUnmarshaller implements Unmarshaller<ProjectDescription, JsonUnmarshallerContext> {

    public ProjectDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProjectDescription projectDescription = new ProjectDescription();

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
                if (context.testExpression("ProjectArn", targetDepth)) {
                    context.nextToken();
                    projectDescription.setProjectArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProjectName", targetDepth)) {
                    context.nextToken();
                    projectDescription.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTimestamp", targetDepth)) {
                    context.nextToken();
                    projectDescription.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Datasets", targetDepth)) {
                    context.nextToken();
                    projectDescription.setDatasets(new ListUnmarshaller<DatasetMetadata>(DatasetMetadataJsonUnmarshaller.getInstance())

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

        return projectDescription;
    }

    private static ProjectDescriptionJsonUnmarshaller instance;

    public static ProjectDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectDescriptionJsonUnmarshaller();
        return instance;
    }
}
