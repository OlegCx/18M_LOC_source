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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StreamingDistributionList StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingDistributionListStaxUnmarshaller implements Unmarshaller<StreamingDistributionList, StaxUnmarshallerContext> {

    public StreamingDistributionList unmarshall(StaxUnmarshallerContext context) throws Exception {
        StreamingDistributionList streamingDistributionList = new StreamingDistributionList();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return streamingDistributionList;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    streamingDistributionList.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextMarker", targetDepth)) {
                    streamingDistributionList.setNextMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxItems", targetDepth)) {
                    streamingDistributionList.setMaxItems(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    streamingDistributionList.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Quantity", targetDepth)) {
                    streamingDistributionList.setQuantity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Items", targetDepth)) {
                    streamingDistributionList.withItems(new ArrayList<StreamingDistributionSummary>());
                    continue;
                }

                if (context.testExpression("Items/StreamingDistributionSummary", targetDepth)) {
                    streamingDistributionList.withItems(StreamingDistributionSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return streamingDistributionList;
                }
            }
        }
    }

    private static StreamingDistributionListStaxUnmarshaller instance;

    public static StreamingDistributionListStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamingDistributionListStaxUnmarshaller();
        return instance;
    }
}
