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
package com.amazonaws.services.mq.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateBrokerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBrokerResultJsonUnmarshaller implements Unmarshaller<UpdateBrokerResult, JsonUnmarshallerContext> {

    public UpdateBrokerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateBrokerResult updateBrokerResult = new UpdateBrokerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateBrokerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("authenticationStrategy", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setAuthenticationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoMinorVersionUpgrade", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setAutoMinorVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("brokerId", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setBrokerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setConfiguration(ConfigurationIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostInstanceType", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setHostInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ldapServerMetadata", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setLdapServerMetadata(LdapServerMetadataOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logs", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setLogs(LogsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("securityGroups", targetDepth)) {
                    context.nextToken();
                    updateBrokerResult.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return updateBrokerResult;
    }

    private static UpdateBrokerResultJsonUnmarshaller instance;

    public static UpdateBrokerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateBrokerResultJsonUnmarshaller();
        return instance;
    }
}
