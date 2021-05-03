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
package com.amazonaws.services.route53.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListVPCAssociationAuthorizationsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVPCAssociationAuthorizationsResultStaxUnmarshaller implements Unmarshaller<ListVPCAssociationAuthorizationsResult, StaxUnmarshallerContext> {

    public ListVPCAssociationAuthorizationsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListVPCAssociationAuthorizationsResult listVPCAssociationAuthorizationsResult = new ListVPCAssociationAuthorizationsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listVPCAssociationAuthorizationsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("HostedZoneId", targetDepth)) {
                    listVPCAssociationAuthorizationsResult.setHostedZoneId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    listVPCAssociationAuthorizationsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VPCs", targetDepth)) {
                    listVPCAssociationAuthorizationsResult.withVPCs(new ArrayList<VPC>());
                    continue;
                }

                if (context.testExpression("VPCs/VPC", targetDepth)) {
                    listVPCAssociationAuthorizationsResult.withVPCs(VPCStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listVPCAssociationAuthorizationsResult;
                }
            }
        }
    }

    private static ListVPCAssociationAuthorizationsResultStaxUnmarshaller instance;

    public static ListVPCAssociationAuthorizationsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListVPCAssociationAuthorizationsResultStaxUnmarshaller();
        return instance;
    }
}
