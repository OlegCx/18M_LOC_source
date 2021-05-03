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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Action StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionStaxUnmarshaller implements Unmarshaller<Action, StaxUnmarshallerContext> {

    public Action unmarshall(StaxUnmarshallerContext context) throws Exception {
        Action action = new Action();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return action;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Type", targetDepth)) {
                    action.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetGroupArn", targetDepth)) {
                    action.setTargetGroupArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthenticateOidcConfig", targetDepth)) {
                    action.setAuthenticateOidcConfig(AuthenticateOidcActionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthenticateCognitoConfig", targetDepth)) {
                    action.setAuthenticateCognitoConfig(AuthenticateCognitoActionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Order", targetDepth)) {
                    action.setOrder(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RedirectConfig", targetDepth)) {
                    action.setRedirectConfig(RedirectActionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FixedResponseConfig", targetDepth)) {
                    action.setFixedResponseConfig(FixedResponseActionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ForwardConfig", targetDepth)) {
                    action.setForwardConfig(ForwardActionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return action;
                }
            }
        }
    }

    private static ActionStaxUnmarshaller instance;

    public static ActionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionStaxUnmarshaller();
        return instance;
    }
}
