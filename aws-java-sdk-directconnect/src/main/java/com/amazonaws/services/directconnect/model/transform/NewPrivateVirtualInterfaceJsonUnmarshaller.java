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
package com.amazonaws.services.directconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NewPrivateVirtualInterface JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewPrivateVirtualInterfaceJsonUnmarshaller implements Unmarshaller<NewPrivateVirtualInterface, JsonUnmarshallerContext> {

    public NewPrivateVirtualInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        NewPrivateVirtualInterface newPrivateVirtualInterface = new NewPrivateVirtualInterface();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("virtualInterfaceName", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setVirtualInterfaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setVlan(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("asn", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setAsn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("mtu", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setMtu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("authKey", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setAuthKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("amazonAddress", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setAmazonAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customerAddress", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setCustomerAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("addressFamily", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setAddressFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayId", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setVirtualGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayId", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setDirectConnectGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    newPrivateVirtualInterface.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return newPrivateVirtualInterface;
    }

    private static NewPrivateVirtualInterfaceJsonUnmarshaller instance;

    public static NewPrivateVirtualInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NewPrivateVirtualInterfaceJsonUnmarshaller();
        return instance;
    }
}
