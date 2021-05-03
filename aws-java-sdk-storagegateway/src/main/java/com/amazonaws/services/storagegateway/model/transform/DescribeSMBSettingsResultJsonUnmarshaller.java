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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeSMBSettingsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSMBSettingsResultJsonUnmarshaller implements Unmarshaller<DescribeSMBSettingsResult, JsonUnmarshallerContext> {

    public DescribeSMBSettingsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSMBSettingsResult describeSMBSettingsResult = new DescribeSMBSettingsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSMBSettingsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("GatewayARN", targetDepth)) {
                    context.nextToken();
                    describeSMBSettingsResult.setGatewayARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    describeSMBSettingsResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActiveDirectoryStatus", targetDepth)) {
                    context.nextToken();
                    describeSMBSettingsResult.setActiveDirectoryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SMBGuestPasswordSet", targetDepth)) {
                    context.nextToken();
                    describeSMBSettingsResult.setSMBGuestPasswordSet(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SMBSecurityStrategy", targetDepth)) {
                    context.nextToken();
                    describeSMBSettingsResult.setSMBSecurityStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSharesVisible", targetDepth)) {
                    context.nextToken();
                    describeSMBSettingsResult.setFileSharesVisible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeSMBSettingsResult;
    }

    private static DescribeSMBSettingsResultJsonUnmarshaller instance;

    public static DescribeSMBSettingsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSMBSettingsResultJsonUnmarshaller();
        return instance;
    }
}
