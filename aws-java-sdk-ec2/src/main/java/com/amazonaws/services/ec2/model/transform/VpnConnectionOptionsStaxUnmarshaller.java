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
 * VpnConnectionOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnConnectionOptionsStaxUnmarshaller implements Unmarshaller<VpnConnectionOptions, StaxUnmarshallerContext> {

    public VpnConnectionOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        VpnConnectionOptions vpnConnectionOptions = new VpnConnectionOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return vpnConnectionOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("enableAcceleration", targetDepth)) {
                    vpnConnectionOptions.setEnableAcceleration(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("staticRoutesOnly", targetDepth)) {
                    vpnConnectionOptions.setStaticRoutesOnly(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localIpv4NetworkCidr", targetDepth)) {
                    vpnConnectionOptions.setLocalIpv4NetworkCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("remoteIpv4NetworkCidr", targetDepth)) {
                    vpnConnectionOptions.setRemoteIpv4NetworkCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localIpv6NetworkCidr", targetDepth)) {
                    vpnConnectionOptions.setLocalIpv6NetworkCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("remoteIpv6NetworkCidr", targetDepth)) {
                    vpnConnectionOptions.setRemoteIpv6NetworkCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tunnelInsideIpVersion", targetDepth)) {
                    vpnConnectionOptions.setTunnelInsideIpVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tunnelOptionSet", targetDepth)) {
                    vpnConnectionOptions.withTunnelOptions(new ArrayList<TunnelOption>());
                    continue;
                }

                if (context.testExpression("tunnelOptionSet/item", targetDepth)) {
                    vpnConnectionOptions.withTunnelOptions(TunnelOptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return vpnConnectionOptions;
                }
            }
        }
    }

    private static VpnConnectionOptionsStaxUnmarshaller instance;

    public static VpnConnectionOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpnConnectionOptionsStaxUnmarshaller();
        return instance;
    }
}
