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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListMetricStreamsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetricStreamsResultStaxUnmarshaller implements Unmarshaller<ListMetricStreamsResult, StaxUnmarshallerContext> {

    public ListMetricStreamsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListMetricStreamsResult listMetricStreamsResult = new ListMetricStreamsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listMetricStreamsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("NextToken", targetDepth)) {
                    listMetricStreamsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Entries", targetDepth)) {
                    listMetricStreamsResult.withEntries(new ArrayList<MetricStreamEntry>());
                    continue;
                }

                if (context.testExpression("Entries/member", targetDepth)) {
                    listMetricStreamsResult.withEntries(MetricStreamEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listMetricStreamsResult;
                }
            }
        }
    }

    private static ListMetricStreamsResultStaxUnmarshaller instance;

    public static ListMetricStreamsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListMetricStreamsResultStaxUnmarshaller();
        return instance;
    }
}
