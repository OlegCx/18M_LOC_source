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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MaintenanceTrack StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceTrackStaxUnmarshaller implements Unmarshaller<MaintenanceTrack, StaxUnmarshallerContext> {

    public MaintenanceTrack unmarshall(StaxUnmarshallerContext context) throws Exception {
        MaintenanceTrack maintenanceTrack = new MaintenanceTrack();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return maintenanceTrack;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MaintenanceTrackName", targetDepth)) {
                    maintenanceTrack.setMaintenanceTrackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseVersion", targetDepth)) {
                    maintenanceTrack.setDatabaseVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdateTargets", targetDepth)) {
                    maintenanceTrack.withUpdateTargets(new ArrayList<UpdateTarget>());
                    continue;
                }

                if (context.testExpression("UpdateTargets/UpdateTarget", targetDepth)) {
                    maintenanceTrack.withUpdateTargets(UpdateTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return maintenanceTrack;
                }
            }
        }
    }

    private static MaintenanceTrackStaxUnmarshaller instance;

    public static MaintenanceTrackStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceTrackStaxUnmarshaller();
        return instance;
    }
}
