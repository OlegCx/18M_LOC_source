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
package com.amazonaws.services.detective.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.detective.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MemberDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberDetailJsonUnmarshaller implements Unmarshaller<MemberDetail, JsonUnmarshallerContext> {

    public MemberDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        MemberDetail memberDetail = new MemberDetail();

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
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    memberDetail.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailAddress", targetDepth)) {
                    context.nextToken();
                    memberDetail.setEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GraphArn", targetDepth)) {
                    context.nextToken();
                    memberDetail.setGraphArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterId", targetDepth)) {
                    context.nextToken();
                    memberDetail.setMasterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdministratorId", targetDepth)) {
                    context.nextToken();
                    memberDetail.setAdministratorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    memberDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisabledReason", targetDepth)) {
                    context.nextToken();
                    memberDetail.setDisabledReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvitedTime", targetDepth)) {
                    context.nextToken();
                    memberDetail.setInvitedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTime", targetDepth)) {
                    context.nextToken();
                    memberDetail.setUpdatedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("VolumeUsageInBytes", targetDepth)) {
                    context.nextToken();
                    memberDetail.setVolumeUsageInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("VolumeUsageUpdatedTime", targetDepth)) {
                    context.nextToken();
                    memberDetail.setVolumeUsageUpdatedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("PercentOfGraphUtilization", targetDepth)) {
                    context.nextToken();
                    memberDetail.setPercentOfGraphUtilization(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("PercentOfGraphUtilizationUpdatedTime", targetDepth)) {
                    context.nextToken();
                    memberDetail.setPercentOfGraphUtilizationUpdatedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return memberDetail;
    }

    private static MemberDetailJsonUnmarshaller instance;

    public static MemberDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MemberDetailJsonUnmarshaller();
        return instance;
    }
}
