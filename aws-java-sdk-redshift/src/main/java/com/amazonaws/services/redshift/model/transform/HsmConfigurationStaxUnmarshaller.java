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
 * HsmConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HsmConfigurationStaxUnmarshaller implements Unmarshaller<HsmConfiguration, StaxUnmarshallerContext> {

    public HsmConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        HsmConfiguration hsmConfiguration = new HsmConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return hsmConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("HsmConfigurationIdentifier", targetDepth)) {
                    hsmConfiguration.setHsmConfigurationIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    hsmConfiguration.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HsmIpAddress", targetDepth)) {
                    hsmConfiguration.setHsmIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HsmPartitionName", targetDepth)) {
                    hsmConfiguration.setHsmPartitionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    hsmConfiguration.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    hsmConfiguration.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return hsmConfiguration;
                }
            }
        }
    }

    private static HsmConfigurationStaxUnmarshaller instance;

    public static HsmConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new HsmConfigurationStaxUnmarshaller();
        return instance;
    }
}
