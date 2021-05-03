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
package com.amazonaws.services.mediaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Flow JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowJsonUnmarshaller implements Unmarshaller<Flow, JsonUnmarshallerContext> {

    public Flow unmarshall(JsonUnmarshallerContext context) throws Exception {
        Flow flow = new Flow();

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
                if (context.testExpression("availabilityZone", targetDepth)) {
                    context.nextToken();
                    flow.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    flow.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("egressIp", targetDepth)) {
                    context.nextToken();
                    flow.setEgressIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entitlements", targetDepth)) {
                    context.nextToken();
                    flow.setEntitlements(new ListUnmarshaller<Entitlement>(EntitlementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("flowArn", targetDepth)) {
                    context.nextToken();
                    flow.setFlowArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    flow.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputs", targetDepth)) {
                    context.nextToken();
                    flow.setOutputs(new ListUnmarshaller<Output>(OutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    flow.setSource(SourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceFailoverConfig", targetDepth)) {
                    context.nextToken();
                    flow.setSourceFailoverConfig(FailoverConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    context.nextToken();
                    flow.setSources(new ListUnmarshaller<Source>(SourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    flow.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcInterfaces", targetDepth)) {
                    context.nextToken();
                    flow.setVpcInterfaces(new ListUnmarshaller<VpcInterface>(VpcInterfaceJsonUnmarshaller.getInstance())

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

        return flow;
    }

    private static FlowJsonUnmarshaller instance;

    public static FlowJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlowJsonUnmarshaller();
        return instance;
    }
}
