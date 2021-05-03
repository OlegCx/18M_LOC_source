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
 * Image JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageJsonUnmarshaller implements Unmarshaller<Image, JsonUnmarshallerContext> {

    public Image unmarshall(JsonUnmarshallerContext context) throws Exception {
        Image image = new Image();

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
                    image.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    image.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    image.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    image.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    image.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enhancedImageMetadataEnabled", targetDepth)) {
                    context.nextToken();
                    image.setEnhancedImageMetadataEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("osVersion", targetDepth)) {
                    context.nextToken();
                    image.setOsVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    image.setState(ImageStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageRecipe", targetDepth)) {
                    context.nextToken();
                    image.setImageRecipe(ImageRecipeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("containerRecipe", targetDepth)) {
                    context.nextToken();
                    image.setContainerRecipe(ContainerRecipeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourcePipelineName", targetDepth)) {
                    context.nextToken();
                    image.setSourcePipelineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourcePipelineArn", targetDepth)) {
                    context.nextToken();
                    image.setSourcePipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("infrastructureConfiguration", targetDepth)) {
                    context.nextToken();
                    image.setInfrastructureConfiguration(InfrastructureConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("distributionConfiguration", targetDepth)) {
                    context.nextToken();
                    image.setDistributionConfiguration(DistributionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageTestsConfiguration", targetDepth)) {
                    context.nextToken();
                    image.setImageTestsConfiguration(ImageTestsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    context.nextToken();
                    image.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputResources", targetDepth)) {
                    context.nextToken();
                    image.setOutputResources(OutputResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    image.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return image;
    }

    private static ImageJsonUnmarshaller instance;

    public static ImageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonUnmarshaller();
        return instance;
    }
}
