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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LogDeliveryConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogDeliveryConfigurationStaxUnmarshaller implements Unmarshaller<LogDeliveryConfiguration, StaxUnmarshallerContext> {

    public LogDeliveryConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        LogDeliveryConfiguration logDeliveryConfiguration = new LogDeliveryConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return logDeliveryConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LogType", targetDepth)) {
                    logDeliveryConfiguration.setLogType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DestinationType", targetDepth)) {
                    logDeliveryConfiguration.setDestinationType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DestinationDetails", targetDepth)) {
                    logDeliveryConfiguration.setDestinationDetails(DestinationDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogFormat", targetDepth)) {
                    logDeliveryConfiguration.setLogFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    logDeliveryConfiguration.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Message", targetDepth)) {
                    logDeliveryConfiguration.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return logDeliveryConfiguration;
                }
            }
        }
    }

    private static LogDeliveryConfigurationStaxUnmarshaller instance;

    public static LogDeliveryConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogDeliveryConfigurationStaxUnmarshaller();
        return instance;
    }
}
