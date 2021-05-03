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
package com.amazonaws.services.rds.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * OptionGroupMembership StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionGroupMembershipStaxUnmarshaller implements Unmarshaller<OptionGroupMembership, StaxUnmarshallerContext> {

    public OptionGroupMembership unmarshall(StaxUnmarshallerContext context) throws Exception {
        OptionGroupMembership optionGroupMembership = new OptionGroupMembership();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return optionGroupMembership;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("OptionGroupName", targetDepth)) {
                    optionGroupMembership.setOptionGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    optionGroupMembership.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return optionGroupMembership;
                }
            }
        }
    }

    private static OptionGroupMembershipStaxUnmarshaller instance;

    public static OptionGroupMembershipStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionGroupMembershipStaxUnmarshaller();
        return instance;
    }
}
