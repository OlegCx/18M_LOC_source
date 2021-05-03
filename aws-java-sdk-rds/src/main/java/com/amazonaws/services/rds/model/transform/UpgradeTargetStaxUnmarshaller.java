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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * UpgradeTarget StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeTargetStaxUnmarshaller implements Unmarshaller<UpgradeTarget, StaxUnmarshallerContext> {

    public UpgradeTarget unmarshall(StaxUnmarshallerContext context) throws Exception {
        UpgradeTarget upgradeTarget = new UpgradeTarget();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return upgradeTarget;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Engine", targetDepth)) {
                    upgradeTarget.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    upgradeTarget.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    upgradeTarget.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutoUpgrade", targetDepth)) {
                    upgradeTarget.setAutoUpgrade(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsMajorVersionUpgrade", targetDepth)) {
                    upgradeTarget.setIsMajorVersionUpgrade(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedEngineModes", targetDepth)) {
                    upgradeTarget.withSupportedEngineModes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedEngineModes/member", targetDepth)) {
                    upgradeTarget.withSupportedEngineModes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsParallelQuery", targetDepth)) {
                    upgradeTarget.setSupportsParallelQuery(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsGlobalDatabases", targetDepth)) {
                    upgradeTarget.setSupportsGlobalDatabases(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return upgradeTarget;
                }
            }
        }
    }

    private static UpgradeTargetStaxUnmarshaller instance;

    public static UpgradeTargetStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpgradeTargetStaxUnmarshaller();
        return instance;
    }
}
