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
package com.amazonaws.services.lookoutmetrics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutmetrics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RedshiftSourceConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftSourceConfigJsonUnmarshaller implements Unmarshaller<RedshiftSourceConfig, JsonUnmarshallerContext> {

    public RedshiftSourceConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        RedshiftSourceConfig redshiftSourceConfig = new RedshiftSourceConfig();

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
                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    context.nextToken();
                    redshiftSourceConfig.setClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseHost", targetDepth)) {
                    context.nextToken();
                    redshiftSourceConfig.setDatabaseHost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabasePort", targetDepth)) {
                    context.nextToken();
                    redshiftSourceConfig.setDatabasePort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SecretManagerArn", targetDepth)) {
                    context.nextToken();
                    redshiftSourceConfig.setSecretManagerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    redshiftSourceConfig.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    redshiftSourceConfig.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    redshiftSourceConfig.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    context.nextToken();
                    redshiftSourceConfig.setVpcConfiguration(VpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return redshiftSourceConfig;
    }

    private static RedshiftSourceConfigJsonUnmarshaller instance;

    public static RedshiftSourceConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftSourceConfigJsonUnmarshaller();
        return instance;
    }
}
