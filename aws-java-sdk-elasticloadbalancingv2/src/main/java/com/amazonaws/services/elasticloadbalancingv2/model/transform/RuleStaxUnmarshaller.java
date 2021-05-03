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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Rule StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleStaxUnmarshaller implements Unmarshaller<Rule, StaxUnmarshallerContext> {

    public Rule unmarshall(StaxUnmarshallerContext context) throws Exception {
        Rule rule = new Rule();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return rule;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("RuleArn", targetDepth)) {
                    rule.setRuleArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Priority", targetDepth)) {
                    rule.setPriority(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Conditions", targetDepth)) {
                    rule.withConditions(new ArrayList<RuleCondition>());
                    continue;
                }

                if (context.testExpression("Conditions/member", targetDepth)) {
                    rule.withConditions(RuleConditionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Actions", targetDepth)) {
                    rule.withActions(new ArrayList<Action>());
                    continue;
                }

                if (context.testExpression("Actions/member", targetDepth)) {
                    rule.withActions(ActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsDefault", targetDepth)) {
                    rule.setIsDefault(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return rule;
                }
            }
        }
    }

    private static RuleStaxUnmarshaller instance;

    public static RuleStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleStaxUnmarshaller();
        return instance;
    }
}
