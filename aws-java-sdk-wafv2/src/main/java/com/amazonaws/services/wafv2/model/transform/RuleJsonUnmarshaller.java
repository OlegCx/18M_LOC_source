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
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Rule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleJsonUnmarshaller implements Unmarshaller<Rule, JsonUnmarshallerContext> {

    public Rule unmarshall(JsonUnmarshallerContext context) throws Exception {
        Rule rule = new Rule();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    rule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    rule.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Statement", targetDepth)) {
                    context.nextToken();
                    rule.setStatement(StatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    rule.setAction(RuleActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OverrideAction", targetDepth)) {
                    context.nextToken();
                    rule.setOverrideAction(OverrideActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RuleLabels", targetDepth)) {
                    context.nextToken();
                    rule.setRuleLabels(new ListUnmarshaller<Label>(LabelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VisibilityConfig", targetDepth)) {
                    context.nextToken();
                    rule.setVisibilityConfig(VisibilityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rule;
    }

    private static RuleJsonUnmarshaller instance;

    public static RuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonUnmarshaller();
        return instance;
    }
}
