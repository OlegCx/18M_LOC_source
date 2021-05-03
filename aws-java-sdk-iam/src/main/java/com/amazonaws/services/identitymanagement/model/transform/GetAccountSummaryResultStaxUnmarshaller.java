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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.Map;

import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetAccountSummaryResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountSummaryResultStaxUnmarshaller implements Unmarshaller<GetAccountSummaryResult, StaxUnmarshallerContext> {

    private static class SummaryMapMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, Integer>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, Integer> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, Integer> entry = new MapEntry<String, Integer>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument())
                    return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static SummaryMapMapEntryUnmarshaller instance;

        public static SummaryMapMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new SummaryMapMapEntryUnmarshaller();
            return instance;
        }

    }

    public GetAccountSummaryResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetAccountSummaryResult getAccountSummaryResult = new GetAccountSummaryResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getAccountSummaryResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SummaryMap/entry", targetDepth)) {
                    Entry<String, Integer> entry = SummaryMapMapEntryUnmarshaller.getInstance().unmarshall(context);
                    getAccountSummaryResult.addSummaryMapEntry(entry.getKey(), entry.getValue());
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getAccountSummaryResult;
                }
            }
        }
    }

    private static GetAccountSummaryResultStaxUnmarshaller instance;

    public static GetAccountSummaryResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAccountSummaryResultStaxUnmarshaller();
        return instance;
    }
}
