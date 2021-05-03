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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceFleetConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetConfigJsonUnmarshaller implements Unmarshaller<InstanceFleetConfig, JsonUnmarshallerContext> {

    public InstanceFleetConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceFleetConfig instanceFleetConfig = new InstanceFleetConfig();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    instanceFleetConfig.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceFleetType", targetDepth)) {
                    context.nextToken();
                    instanceFleetConfig.setInstanceFleetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetOnDemandCapacity", targetDepth)) {
                    context.nextToken();
                    instanceFleetConfig.setTargetOnDemandCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TargetSpotCapacity", targetDepth)) {
                    context.nextToken();
                    instanceFleetConfig.setTargetSpotCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstanceTypeConfigs", targetDepth)) {
                    context.nextToken();
                    instanceFleetConfig.setInstanceTypeConfigs(new ListUnmarshaller<InstanceTypeConfig>(InstanceTypeConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LaunchSpecifications", targetDepth)) {
                    context.nextToken();
                    instanceFleetConfig.setLaunchSpecifications(InstanceFleetProvisioningSpecificationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceFleetConfig;
    }

    private static InstanceFleetConfigJsonUnmarshaller instance;

    public static InstanceFleetConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceFleetConfigJsonUnmarshaller();
        return instance;
    }
}
