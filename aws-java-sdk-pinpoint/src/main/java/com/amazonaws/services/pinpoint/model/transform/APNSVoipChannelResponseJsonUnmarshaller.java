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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * APNSVoipChannelResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSVoipChannelResponseJsonUnmarshaller implements Unmarshaller<APNSVoipChannelResponse, JsonUnmarshallerContext> {

    public APNSVoipChannelResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        APNSVoipChannelResponse aPNSVoipChannelResponse = new APNSVoipChannelResponse();

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
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultAuthenticationMethod", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setDefaultAuthenticationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HasCredential", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setHasCredential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HasTokenKey", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setHasTokenKey(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsArchived", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setIsArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    aPNSVoipChannelResponse.setVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return aPNSVoipChannelResponse;
    }

    private static APNSVoipChannelResponseJsonUnmarshaller instance;

    public static APNSVoipChannelResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipChannelResponseJsonUnmarshaller();
        return instance;
    }
}
