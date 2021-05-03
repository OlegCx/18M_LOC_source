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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ValidateTemplateResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateTemplateResultStaxUnmarshaller implements Unmarshaller<ValidateTemplateResult, StaxUnmarshallerContext> {

    public ValidateTemplateResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ValidateTemplateResult validateTemplateResult = new ValidateTemplateResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return validateTemplateResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Parameters", targetDepth)) {
                    validateTemplateResult.withParameters(new ArrayList<TemplateParameter>());
                    continue;
                }

                if (context.testExpression("Parameters/member", targetDepth)) {
                    validateTemplateResult.withParameters(TemplateParameterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    validateTemplateResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Capabilities", targetDepth)) {
                    validateTemplateResult.withCapabilities(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Capabilities/member", targetDepth)) {
                    validateTemplateResult.withCapabilities(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CapabilitiesReason", targetDepth)) {
                    validateTemplateResult.setCapabilitiesReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeclaredTransforms", targetDepth)) {
                    validateTemplateResult.withDeclaredTransforms(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("DeclaredTransforms/member", targetDepth)) {
                    validateTemplateResult.withDeclaredTransforms(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return validateTemplateResult;
                }
            }
        }
    }

    private static ValidateTemplateResultStaxUnmarshaller instance;

    public static ValidateTemplateResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ValidateTemplateResultStaxUnmarshaller();
        return instance;
    }
}
