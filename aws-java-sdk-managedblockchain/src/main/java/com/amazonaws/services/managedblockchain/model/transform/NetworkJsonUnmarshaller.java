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
package com.amazonaws.services.managedblockchain.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.managedblockchain.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Network JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkJsonUnmarshaller implements Unmarshaller<Network, JsonUnmarshallerContext> {

    public Network unmarshall(JsonUnmarshallerContext context) throws Exception {
        Network network = new Network();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    network.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    network.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    network.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Framework", targetDepth)) {
                    context.nextToken();
                    network.setFramework(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FrameworkVersion", targetDepth)) {
                    context.nextToken();
                    network.setFrameworkVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FrameworkAttributes", targetDepth)) {
                    context.nextToken();
                    network.setFrameworkAttributes(NetworkFrameworkAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcEndpointServiceName", targetDepth)) {
                    context.nextToken();
                    network.setVpcEndpointServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VotingPolicy", targetDepth)) {
                    context.nextToken();
                    network.setVotingPolicy(VotingPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    network.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    network.setCreationDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    network.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    network.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return network;
    }

    private static NetworkJsonUnmarshaller instance;

    public static NetworkJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkJsonUnmarshaller();
        return instance;
    }
}
