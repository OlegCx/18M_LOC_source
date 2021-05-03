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
package com.amazonaws.services.cloudfront.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CacheBehavior StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheBehaviorStaxUnmarshaller implements Unmarshaller<CacheBehavior, StaxUnmarshallerContext> {

    public CacheBehavior unmarshall(StaxUnmarshallerContext context) throws Exception {
        CacheBehavior cacheBehavior = new CacheBehavior();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cacheBehavior;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PathPattern", targetDepth)) {
                    cacheBehavior.setPathPattern(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetOriginId", targetDepth)) {
                    cacheBehavior.setTargetOriginId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TrustedSigners", targetDepth)) {
                    cacheBehavior.setTrustedSigners(TrustedSignersStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TrustedKeyGroups", targetDepth)) {
                    cacheBehavior.setTrustedKeyGroups(TrustedKeyGroupsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ViewerProtocolPolicy", targetDepth)) {
                    cacheBehavior.setViewerProtocolPolicy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedMethods", targetDepth)) {
                    cacheBehavior.setAllowedMethods(AllowedMethodsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SmoothStreaming", targetDepth)) {
                    cacheBehavior.setSmoothStreaming(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Compress", targetDepth)) {
                    cacheBehavior.setCompress(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LambdaFunctionAssociations", targetDepth)) {
                    cacheBehavior.setLambdaFunctionAssociations(LambdaFunctionAssociationsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FunctionAssociations", targetDepth)) {
                    cacheBehavior.setFunctionAssociations(FunctionAssociationsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FieldLevelEncryptionId", targetDepth)) {
                    cacheBehavior.setFieldLevelEncryptionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RealtimeLogConfigArn", targetDepth)) {
                    cacheBehavior.setRealtimeLogConfigArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CachePolicyId", targetDepth)) {
                    cacheBehavior.setCachePolicyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OriginRequestPolicyId", targetDepth)) {
                    cacheBehavior.setOriginRequestPolicyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ForwardedValues", targetDepth)) {
                    cacheBehavior.setForwardedValues(ForwardedValuesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MinTTL", targetDepth)) {
                    cacheBehavior.setMinTTL(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultTTL", targetDepth)) {
                    cacheBehavior.setDefaultTTL(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxTTL", targetDepth)) {
                    cacheBehavior.setMaxTTL(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cacheBehavior;
                }
            }
        }
    }

    private static CacheBehaviorStaxUnmarshaller instance;

    public static CacheBehaviorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CacheBehaviorStaxUnmarshaller();
        return instance;
    }
}
