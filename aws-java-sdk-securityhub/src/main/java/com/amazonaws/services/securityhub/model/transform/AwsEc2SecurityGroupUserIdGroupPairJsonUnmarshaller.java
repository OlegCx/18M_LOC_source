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
 * AwsEc2SecurityGroupUserIdGroupPair JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller implements Unmarshaller<AwsEc2SecurityGroupUserIdGroupPair, JsonUnmarshallerContext> {

    public AwsEc2SecurityGroupUserIdGroupPair unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2SecurityGroupUserIdGroupPair awsEc2SecurityGroupUserIdGroupPair = new AwsEc2SecurityGroupUserIdGroupPair();

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
                if (context.testExpression("GroupId", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupUserIdGroupPair.setGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupName", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupUserIdGroupPair.setGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeeringStatus", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupUserIdGroupPair.setPeeringStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserId", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupUserIdGroupPair.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupUserIdGroupPair.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcPeeringConnectionId", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupUserIdGroupPair.setVpcPeeringConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2SecurityGroupUserIdGroupPair;
    }

    private static AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller instance;

    public static AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller();
        return instance;
    }
}
