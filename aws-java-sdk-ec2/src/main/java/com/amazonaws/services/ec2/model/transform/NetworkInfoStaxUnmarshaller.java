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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * NetworkInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInfoStaxUnmarshaller implements Unmarshaller<NetworkInfo, StaxUnmarshallerContext> {

    public NetworkInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkInfo networkInfo = new NetworkInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return networkInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("networkPerformance", targetDepth)) {
                    networkInfo.setNetworkPerformance(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maximumNetworkInterfaces", targetDepth)) {
                    networkInfo.setMaximumNetworkInterfaces(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maximumNetworkCards", targetDepth)) {
                    networkInfo.setMaximumNetworkCards(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("defaultNetworkCardIndex", targetDepth)) {
                    networkInfo.setDefaultNetworkCardIndex(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkCards", targetDepth)) {
                    networkInfo.withNetworkCards(new ArrayList<NetworkCardInfo>());
                    continue;
                }

                if (context.testExpression("networkCards/item", targetDepth)) {
                    networkInfo.withNetworkCards(NetworkCardInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv4AddressesPerInterface", targetDepth)) {
                    networkInfo.setIpv4AddressesPerInterface(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6AddressesPerInterface", targetDepth)) {
                    networkInfo.setIpv6AddressesPerInterface(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6Supported", targetDepth)) {
                    networkInfo.setIpv6Supported(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("enaSupport", targetDepth)) {
                    networkInfo.setEnaSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("efaSupported", targetDepth)) {
                    networkInfo.setEfaSupported(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("efaInfo", targetDepth)) {
                    networkInfo.setEfaInfo(EfaInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkInfo;
                }
            }
        }
    }

    private static NetworkInfoStaxUnmarshaller instance;

    public static NetworkInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInfoStaxUnmarshaller();
        return instance;
    }
}
