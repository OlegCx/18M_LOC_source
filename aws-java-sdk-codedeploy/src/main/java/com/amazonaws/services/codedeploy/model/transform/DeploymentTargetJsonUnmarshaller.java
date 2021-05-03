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
package com.amazonaws.services.codedeploy.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentTarget JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentTargetJsonUnmarshaller implements Unmarshaller<DeploymentTarget, JsonUnmarshallerContext> {

    public DeploymentTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentTarget deploymentTarget = new DeploymentTarget();

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
                if (context.testExpression("deploymentTargetType", targetDepth)) {
                    context.nextToken();
                    deploymentTarget.setDeploymentTargetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceTarget", targetDepth)) {
                    context.nextToken();
                    deploymentTarget.setInstanceTarget(InstanceTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaTarget", targetDepth)) {
                    context.nextToken();
                    deploymentTarget.setLambdaTarget(LambdaTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ecsTarget", targetDepth)) {
                    context.nextToken();
                    deploymentTarget.setEcsTarget(ECSTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cloudFormationTarget", targetDepth)) {
                    context.nextToken();
                    deploymentTarget.setCloudFormationTarget(CloudFormationTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deploymentTarget;
    }

    private static DeploymentTargetJsonUnmarshaller instance;

    public static DeploymentTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentTargetJsonUnmarshaller();
        return instance;
    }
}
