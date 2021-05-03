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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicaDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaDescriptionJsonUnmarshaller implements Unmarshaller<ReplicaDescription, JsonUnmarshallerContext> {

    public ReplicaDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicaDescription replicaDescription = new ReplicaDescription();

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
                if (context.testExpression("RegionName", targetDepth)) {
                    context.nextToken();
                    replicaDescription.setRegionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicaStatus", targetDepth)) {
                    context.nextToken();
                    replicaDescription.setReplicaStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicaStatusDescription", targetDepth)) {
                    context.nextToken();
                    replicaDescription.setReplicaStatusDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicaStatusPercentProgress", targetDepth)) {
                    context.nextToken();
                    replicaDescription.setReplicaStatusPercentProgress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KMSMasterKeyId", targetDepth)) {
                    context.nextToken();
                    replicaDescription.setKMSMasterKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedThroughputOverride", targetDepth)) {
                    context.nextToken();
                    replicaDescription.setProvisionedThroughputOverride(ProvisionedThroughputOverrideJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GlobalSecondaryIndexes", targetDepth)) {
                    context.nextToken();
                    replicaDescription.setGlobalSecondaryIndexes(new ListUnmarshaller<ReplicaGlobalSecondaryIndexDescription>(
                            ReplicaGlobalSecondaryIndexDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ReplicaInaccessibleDateTime", targetDepth)) {
                    context.nextToken();
                    replicaDescription.setReplicaInaccessibleDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicaDescription;
    }

    private static ReplicaDescriptionJsonUnmarshaller instance;

    public static ReplicaDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaDescriptionJsonUnmarshaller();
        return instance;
    }
}
