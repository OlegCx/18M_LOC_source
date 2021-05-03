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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SpotOptionsRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotOptionsRequestStaxUnmarshaller implements Unmarshaller<SpotOptionsRequest, StaxUnmarshallerContext> {

    public SpotOptionsRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        SpotOptionsRequest spotOptionsRequest = new SpotOptionsRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return spotOptionsRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AllocationStrategy", targetDepth)) {
                    spotOptionsRequest.setAllocationStrategy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaintenanceStrategies", targetDepth)) {
                    spotOptionsRequest.setMaintenanceStrategies(FleetSpotMaintenanceStrategiesRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceInterruptionBehavior", targetDepth)) {
                    spotOptionsRequest.setInstanceInterruptionBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstancePoolsToUseCount", targetDepth)) {
                    spotOptionsRequest.setInstancePoolsToUseCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SingleInstanceType", targetDepth)) {
                    spotOptionsRequest.setSingleInstanceType(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SingleAvailabilityZone", targetDepth)) {
                    spotOptionsRequest.setSingleAvailabilityZone(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MinTargetCapacity", targetDepth)) {
                    spotOptionsRequest.setMinTargetCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxTotalPrice", targetDepth)) {
                    spotOptionsRequest.setMaxTotalPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return spotOptionsRequest;
                }
            }
        }
    }

    private static SpotOptionsRequestStaxUnmarshaller instance;

    public static SpotOptionsRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpotOptionsRequestStaxUnmarshaller();
        return instance;
    }
}
