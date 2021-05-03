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
package com.amazonaws.services.neptune.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBInstanceStatusInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBInstanceStatusInfoStaxUnmarshaller implements Unmarshaller<DBInstanceStatusInfo, StaxUnmarshallerContext> {

    public DBInstanceStatusInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBInstanceStatusInfo dBInstanceStatusInfo = new DBInstanceStatusInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBInstanceStatusInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StatusType", targetDepth)) {
                    dBInstanceStatusInfo.setStatusType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Normal", targetDepth)) {
                    dBInstanceStatusInfo.setNormal(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBInstanceStatusInfo.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Message", targetDepth)) {
                    dBInstanceStatusInfo.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBInstanceStatusInfo;
                }
            }
        }
    }

    private static DBInstanceStatusInfoStaxUnmarshaller instance;

    public static DBInstanceStatusInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBInstanceStatusInfoStaxUnmarshaller();
        return instance;
    }
}
