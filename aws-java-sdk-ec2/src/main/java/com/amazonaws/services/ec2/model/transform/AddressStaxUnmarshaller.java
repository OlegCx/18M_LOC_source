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
 * Address StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressStaxUnmarshaller implements Unmarshaller<Address, StaxUnmarshallerContext> {

    public Address unmarshall(StaxUnmarshallerContext context) throws Exception {
        Address address = new Address();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return address;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("instanceId", targetDepth)) {
                    address.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("publicIp", targetDepth)) {
                    address.setPublicIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("allocationId", targetDepth)) {
                    address.setAllocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("associationId", targetDepth)) {
                    address.setAssociationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("domain", targetDepth)) {
                    address.setDomain(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    address.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceOwnerId", targetDepth)) {
                    address.setNetworkInterfaceOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateIpAddress", targetDepth)) {
                    address.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    address.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    address.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("publicIpv4Pool", targetDepth)) {
                    address.setPublicIpv4Pool(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkBorderGroup", targetDepth)) {
                    address.setNetworkBorderGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("customerOwnedIp", targetDepth)) {
                    address.setCustomerOwnedIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("customerOwnedIpv4Pool", targetDepth)) {
                    address.setCustomerOwnedIpv4Pool(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("carrierIp", targetDepth)) {
                    address.setCarrierIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return address;
                }
            }
        }
    }

    private static AddressStaxUnmarshaller instance;

    public static AddressStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressStaxUnmarshaller();
        return instance;
    }
}
