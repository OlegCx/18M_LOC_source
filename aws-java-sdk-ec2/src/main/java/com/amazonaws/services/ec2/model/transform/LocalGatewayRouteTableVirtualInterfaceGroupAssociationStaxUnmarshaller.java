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
 * LocalGatewayRouteTableVirtualInterfaceGroupAssociation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalGatewayRouteTableVirtualInterfaceGroupAssociationStaxUnmarshaller implements
        Unmarshaller<LocalGatewayRouteTableVirtualInterfaceGroupAssociation, StaxUnmarshallerContext> {

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation unmarshall(StaxUnmarshallerContext context) throws Exception {
        LocalGatewayRouteTableVirtualInterfaceGroupAssociation localGatewayRouteTableVirtualInterfaceGroupAssociation = new LocalGatewayRouteTableVirtualInterfaceGroupAssociation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return localGatewayRouteTableVirtualInterfaceGroupAssociation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("localGatewayRouteTableVirtualInterfaceGroupAssociationId", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation.setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localGatewayVirtualInterfaceGroupId", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation.setLocalGatewayVirtualInterfaceGroupId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("localGatewayId", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation.setLocalGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localGatewayRouteTableId", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation
                            .setLocalGatewayRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localGatewayRouteTableArn", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation.setLocalGatewayRouteTableArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    localGatewayRouteTableVirtualInterfaceGroupAssociation.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return localGatewayRouteTableVirtualInterfaceGroupAssociation;
                }
            }
        }
    }

    private static LocalGatewayRouteTableVirtualInterfaceGroupAssociationStaxUnmarshaller instance;

    public static LocalGatewayRouteTableVirtualInterfaceGroupAssociationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayRouteTableVirtualInterfaceGroupAssociationStaxUnmarshaller();
        return instance;
    }
}
