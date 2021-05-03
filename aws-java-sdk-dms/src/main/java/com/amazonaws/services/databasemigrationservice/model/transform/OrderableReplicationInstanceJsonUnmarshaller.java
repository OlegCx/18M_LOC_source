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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OrderableReplicationInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderableReplicationInstanceJsonUnmarshaller implements Unmarshaller<OrderableReplicationInstance, JsonUnmarshallerContext> {

    public OrderableReplicationInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrderableReplicationInstance orderableReplicationInstance = new OrderableReplicationInstance();

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
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceClass", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setReplicationInstanceClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinAllocatedStorage", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setMinAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxAllocatedStorage", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setMaxAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DefaultAllocatedStorage", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setDefaultAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IncludedAllocatedStorage", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setIncludedAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ReleaseStatus", targetDepth)) {
                    context.nextToken();
                    orderableReplicationInstance.setReleaseStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return orderableReplicationInstance;
    }

    private static OrderableReplicationInstanceJsonUnmarshaller instance;

    public static OrderableReplicationInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrderableReplicationInstanceJsonUnmarshaller();
        return instance;
    }
}
