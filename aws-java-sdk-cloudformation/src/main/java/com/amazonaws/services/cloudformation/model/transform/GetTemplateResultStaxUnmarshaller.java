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
 * GetTemplateResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateResultStaxUnmarshaller implements Unmarshaller<GetTemplateResult, StaxUnmarshallerContext> {

    public GetTemplateResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetTemplateResult getTemplateResult = new GetTemplateResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getTemplateResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TemplateBody", targetDepth)) {
                    getTemplateResult.setTemplateBody(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StagesAvailable", targetDepth)) {
                    getTemplateResult.withStagesAvailable(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("StagesAvailable/member", targetDepth)) {
                    getTemplateResult.withStagesAvailable(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getTemplateResult;
                }
            }
        }
    }

    private static GetTemplateResultStaxUnmarshaller instance;

    public static GetTemplateResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTemplateResultStaxUnmarshaller();
        return instance;
    }
}
