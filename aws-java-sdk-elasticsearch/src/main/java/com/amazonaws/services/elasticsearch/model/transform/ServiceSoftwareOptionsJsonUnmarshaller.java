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
package com.amazonaws.services.elasticsearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceSoftwareOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceSoftwareOptionsJsonUnmarshaller implements Unmarshaller<ServiceSoftwareOptions, JsonUnmarshallerContext> {

    public ServiceSoftwareOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceSoftwareOptions serviceSoftwareOptions = new ServiceSoftwareOptions();

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
                if (context.testExpression("CurrentVersion", targetDepth)) {
                    context.nextToken();
                    serviceSoftwareOptions.setCurrentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NewVersion", targetDepth)) {
                    context.nextToken();
                    serviceSoftwareOptions.setNewVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateAvailable", targetDepth)) {
                    context.nextToken();
                    serviceSoftwareOptions.setUpdateAvailable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Cancellable", targetDepth)) {
                    context.nextToken();
                    serviceSoftwareOptions.setCancellable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UpdateStatus", targetDepth)) {
                    context.nextToken();
                    serviceSoftwareOptions.setUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    serviceSoftwareOptions.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutomatedUpdateDate", targetDepth)) {
                    context.nextToken();
                    serviceSoftwareOptions.setAutomatedUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OptionalDeployment", targetDepth)) {
                    context.nextToken();
                    serviceSoftwareOptions.setOptionalDeployment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceSoftwareOptions;
    }

    private static ServiceSoftwareOptionsJsonUnmarshaller instance;

    public static ServiceSoftwareOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSoftwareOptionsJsonUnmarshaller();
        return instance;
    }
}
