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
 * CacheSubnetGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheSubnetGroupStaxUnmarshaller implements Unmarshaller<CacheSubnetGroup, StaxUnmarshallerContext> {

    public CacheSubnetGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        CacheSubnetGroup cacheSubnetGroup = new CacheSubnetGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cacheSubnetGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CacheSubnetGroupName", targetDepth)) {
                    cacheSubnetGroup.setCacheSubnetGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheSubnetGroupDescription", targetDepth)) {
                    cacheSubnetGroup.setCacheSubnetGroupDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    cacheSubnetGroup.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Subnets", targetDepth)) {
                    cacheSubnetGroup.withSubnets(new ArrayList<Subnet>());
                    continue;
                }

                if (context.testExpression("Subnets/Subnet", targetDepth)) {
                    cacheSubnetGroup.withSubnets(SubnetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    cacheSubnetGroup.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cacheSubnetGroup;
                }
            }
        }
    }

    private static CacheSubnetGroupStaxUnmarshaller instance;

    public static CacheSubnetGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CacheSubnetGroupStaxUnmarshaller();
        return instance;
    }
}
