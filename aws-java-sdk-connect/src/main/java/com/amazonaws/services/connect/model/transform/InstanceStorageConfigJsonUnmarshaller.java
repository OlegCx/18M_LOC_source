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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceStorageConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceStorageConfigJsonUnmarshaller implements Unmarshaller<InstanceStorageConfig, JsonUnmarshallerContext> {

    public InstanceStorageConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceStorageConfig instanceStorageConfig = new InstanceStorageConfig();

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
                if (context.testExpression("AssociationId", targetDepth)) {
                    context.nextToken();
                    instanceStorageConfig.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    context.nextToken();
                    instanceStorageConfig.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Config", targetDepth)) {
                    context.nextToken();
                    instanceStorageConfig.setS3Config(S3ConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisVideoStreamConfig", targetDepth)) {
                    context.nextToken();
                    instanceStorageConfig.setKinesisVideoStreamConfig(KinesisVideoStreamConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisStreamConfig", targetDepth)) {
                    context.nextToken();
                    instanceStorageConfig.setKinesisStreamConfig(KinesisStreamConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisFirehoseConfig", targetDepth)) {
                    context.nextToken();
                    instanceStorageConfig.setKinesisFirehoseConfig(KinesisFirehoseConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceStorageConfig;
    }

    private static InstanceStorageConfigJsonUnmarshaller instance;

    public static InstanceStorageConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStorageConfigJsonUnmarshaller();
        return instance;
    }
}
