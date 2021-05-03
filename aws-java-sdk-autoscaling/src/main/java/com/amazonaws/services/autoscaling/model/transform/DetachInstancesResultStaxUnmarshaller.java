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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DetachInstancesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachInstancesResultStaxUnmarshaller implements Unmarshaller<DetachInstancesResult, StaxUnmarshallerContext> {

    public DetachInstancesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DetachInstancesResult detachInstancesResult = new DetachInstancesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return detachInstancesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Activities", targetDepth)) {
                    detachInstancesResult.withActivities(new ArrayList<Activity>());
                    continue;
                }

                if (context.testExpression("Activities/member", targetDepth)) {
                    detachInstancesResult.withActivities(ActivityStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return detachInstancesResult;
                }
            }
        }
    }

    private static DetachInstancesResultStaxUnmarshaller instance;

    public static DetachInstancesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetachInstancesResultStaxUnmarshaller();
        return instance;
    }
}
