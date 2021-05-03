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
 * PendingModifiedValues StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingModifiedValuesStaxUnmarshaller implements Unmarshaller<PendingModifiedValues, StaxUnmarshallerContext> {

    public PendingModifiedValues unmarshall(StaxUnmarshallerContext context) throws Exception {
        PendingModifiedValues pendingModifiedValues = new PendingModifiedValues();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return pendingModifiedValues;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("NumCacheNodes", targetDepth)) {
                    pendingModifiedValues.setNumCacheNodes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeIdsToRemove", targetDepth)) {
                    pendingModifiedValues.withCacheNodeIdsToRemove(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("CacheNodeIdsToRemove/CacheNodeId", targetDepth)) {
                    pendingModifiedValues.withCacheNodeIdsToRemove(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    pendingModifiedValues.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeType", targetDepth)) {
                    pendingModifiedValues.setCacheNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthTokenStatus", targetDepth)) {
                    pendingModifiedValues.setAuthTokenStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogDeliveryConfigurations", targetDepth)) {
                    pendingModifiedValues.withLogDeliveryConfigurations(new ArrayList<PendingLogDeliveryConfiguration>());
                    continue;
                }

                if (context.testExpression("LogDeliveryConfigurations/member", targetDepth)) {
                    pendingModifiedValues.withLogDeliveryConfigurations(PendingLogDeliveryConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return pendingModifiedValues;
                }
            }
        }
    }

    private static PendingModifiedValuesStaxUnmarshaller instance;

    public static PendingModifiedValuesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PendingModifiedValuesStaxUnmarshaller();
        return instance;
    }
}
