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
package com.amazonaws.services.mediapackagevod.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagevod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DashPackage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashPackageJsonUnmarshaller implements Unmarshaller<DashPackage, JsonUnmarshallerContext> {

    public DashPackage unmarshall(JsonUnmarshallerContext context) throws Exception {
        DashPackage dashPackage = new DashPackage();

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
                if (context.testExpression("dashManifests", targetDepth)) {
                    context.nextToken();
                    dashPackage.setDashManifests(new ListUnmarshaller<DashManifest>(DashManifestJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("encryption", targetDepth)) {
                    context.nextToken();
                    dashPackage.setEncryption(DashEncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("includeEncoderConfigurationInSegments", targetDepth)) {
                    context.nextToken();
                    dashPackage.setIncludeEncoderConfigurationInSegments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("periodTriggers", targetDepth)) {
                    context.nextToken();
                    dashPackage.setPeriodTriggers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("segmentDurationSeconds", targetDepth)) {
                    context.nextToken();
                    dashPackage.setSegmentDurationSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("segmentTemplateFormat", targetDepth)) {
                    context.nextToken();
                    dashPackage.setSegmentTemplateFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dashPackage;
    }

    private static DashPackageJsonUnmarshaller instance;

    public static DashPackageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DashPackageJsonUnmarshaller();
        return instance;
    }
}
