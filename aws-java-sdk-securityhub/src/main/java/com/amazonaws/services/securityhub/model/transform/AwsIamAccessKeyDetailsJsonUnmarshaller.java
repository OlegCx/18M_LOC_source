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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsIamAccessKeyDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamAccessKeyDetailsJsonUnmarshaller implements Unmarshaller<AwsIamAccessKeyDetails, JsonUnmarshallerContext> {

    public AwsIamAccessKeyDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsIamAccessKeyDetails awsIamAccessKeyDetails = new AwsIamAccessKeyDetails();

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
                if (context.testExpression("UserName", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrincipalId", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setPrincipalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrincipalType", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setPrincipalType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrincipalName", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setPrincipalName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessKeyId", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setAccessKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SessionContext", targetDepth)) {
                    context.nextToken();
                    awsIamAccessKeyDetails.setSessionContext(AwsIamAccessKeySessionContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsIamAccessKeyDetails;
    }

    private static AwsIamAccessKeyDetailsJsonUnmarshaller instance;

    public static AwsIamAccessKeyDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsIamAccessKeyDetailsJsonUnmarshaller();
        return instance;
    }
}
