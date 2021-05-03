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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RevokeSecurityGroupEgressResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeSecurityGroupEgressResultStaxUnmarshaller implements Unmarshaller<RevokeSecurityGroupEgressResult, StaxUnmarshallerContext> {

    public RevokeSecurityGroupEgressResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        RevokeSecurityGroupEgressResult revokeSecurityGroupEgressResult = new RevokeSecurityGroupEgressResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return revokeSecurityGroupEgressResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("return", targetDepth)) {
                    revokeSecurityGroupEgressResult.setReturn(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("unknownIpPermissionSet", targetDepth)) {
                    revokeSecurityGroupEgressResult.withUnknownIpPermissions(new ArrayList<IpPermission>());
                    continue;
                }

                if (context.testExpression("unknownIpPermissionSet/item", targetDepth)) {
                    revokeSecurityGroupEgressResult.withUnknownIpPermissions(IpPermissionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return revokeSecurityGroupEgressResult;
                }
            }
        }
    }

    private static RevokeSecurityGroupEgressResultStaxUnmarshaller instance;

    public static RevokeSecurityGroupEgressResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RevokeSecurityGroupEgressResultStaxUnmarshaller();
        return instance;
    }
}
