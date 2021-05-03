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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SegmentDimensions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentDimensionsJsonUnmarshaller implements Unmarshaller<SegmentDimensions, JsonUnmarshallerContext> {

    public SegmentDimensions unmarshall(JsonUnmarshallerContext context) throws Exception {
        SegmentDimensions segmentDimensions = new SegmentDimensions();

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
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    segmentDimensions.setAttributes(new MapUnmarshaller<String, AttributeDimension>(context.getUnmarshaller(String.class),
                            AttributeDimensionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Behavior", targetDepth)) {
                    context.nextToken();
                    segmentDimensions.setBehavior(SegmentBehaviorsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Demographic", targetDepth)) {
                    context.nextToken();
                    segmentDimensions.setDemographic(SegmentDemographicsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Location", targetDepth)) {
                    context.nextToken();
                    segmentDimensions.setLocation(SegmentLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    segmentDimensions.setMetrics(new MapUnmarshaller<String, MetricDimension>(context.getUnmarshaller(String.class),
                            MetricDimensionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("UserAttributes", targetDepth)) {
                    context.nextToken();
                    segmentDimensions.setUserAttributes(new MapUnmarshaller<String, AttributeDimension>(context.getUnmarshaller(String.class),
                            AttributeDimensionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return segmentDimensions;
    }

    private static SegmentDimensionsJsonUnmarshaller instance;

    public static SegmentDimensionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDimensionsJsonUnmarshaller();
        return instance;
    }
}
