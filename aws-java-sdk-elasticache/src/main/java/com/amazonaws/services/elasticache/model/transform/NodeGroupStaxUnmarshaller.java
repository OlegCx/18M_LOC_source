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
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * NodeGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroupStaxUnmarshaller implements Unmarshaller<NodeGroup, StaxUnmarshallerContext> {

    public NodeGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        NodeGroup nodeGroup = new NodeGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return nodeGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("NodeGroupId", targetDepth)) {
                    nodeGroup.setNodeGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    nodeGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PrimaryEndpoint", targetDepth)) {
                    nodeGroup.setPrimaryEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReaderEndpoint", targetDepth)) {
                    nodeGroup.setReaderEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Slots", targetDepth)) {
                    nodeGroup.setSlots(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeGroupMembers", targetDepth)) {
                    nodeGroup.withNodeGroupMembers(new ArrayList<NodeGroupMember>());
                    continue;
                }

                if (context.testExpression("NodeGroupMembers/NodeGroupMember", targetDepth)) {
                    nodeGroup.withNodeGroupMembers(NodeGroupMemberStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return nodeGroup;
                }
            }
        }
    }

    private static NodeGroupStaxUnmarshaller instance;

    public static NodeGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupStaxUnmarshaller();
        return instance;
    }
}
