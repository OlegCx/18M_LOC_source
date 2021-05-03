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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EnableLoggingResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableLoggingResultStaxUnmarshaller implements Unmarshaller<EnableLoggingResult, StaxUnmarshallerContext> {

    public EnableLoggingResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        EnableLoggingResult enableLoggingResult = new EnableLoggingResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return enableLoggingResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LoggingEnabled", targetDepth)) {
                    enableLoggingResult.setLoggingEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BucketName", targetDepth)) {
                    enableLoggingResult.setBucketName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("S3KeyPrefix", targetDepth)) {
                    enableLoggingResult.setS3KeyPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastSuccessfulDeliveryTime", targetDepth)) {
                    enableLoggingResult.setLastSuccessfulDeliveryTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastFailureTime", targetDepth)) {
                    enableLoggingResult.setLastFailureTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastFailureMessage", targetDepth)) {
                    enableLoggingResult.setLastFailureMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return enableLoggingResult;
                }
            }
        }
    }

    private static EnableLoggingResultStaxUnmarshaller instance;

    public static EnableLoggingResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnableLoggingResultStaxUnmarshaller();
        return instance;
    }
}
