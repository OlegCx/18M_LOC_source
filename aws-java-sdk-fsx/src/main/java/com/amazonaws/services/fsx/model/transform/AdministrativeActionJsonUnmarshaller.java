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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AdministrativeAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdministrativeActionJsonUnmarshaller implements Unmarshaller<AdministrativeAction, JsonUnmarshallerContext> {

    public AdministrativeAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AdministrativeAction administrativeAction = new AdministrativeAction();

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
                if (context.testExpression("AdministrativeActionType", targetDepth)) {
                    context.nextToken();
                    administrativeAction.setAdministrativeActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProgressPercent", targetDepth)) {
                    context.nextToken();
                    administrativeAction.setProgressPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RequestTime", targetDepth)) {
                    context.nextToken();
                    administrativeAction.setRequestTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    administrativeAction.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetFileSystemValues", targetDepth)) {
                    context.nextToken();
                    administrativeAction.setTargetFileSystemValues(FileSystemJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    context.nextToken();
                    administrativeAction.setFailureDetails(AdministrativeActionFailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return administrativeAction;
    }

    private static AdministrativeActionJsonUnmarshaller instance;

    public static AdministrativeActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AdministrativeActionJsonUnmarshaller();
        return instance;
    }
}
