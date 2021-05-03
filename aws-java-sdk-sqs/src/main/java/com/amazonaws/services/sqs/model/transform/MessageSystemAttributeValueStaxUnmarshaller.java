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
package com.amazonaws.services.sqs.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MessageSystemAttributeValue StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageSystemAttributeValueStaxUnmarshaller implements Unmarshaller<MessageSystemAttributeValue, StaxUnmarshallerContext> {

    public MessageSystemAttributeValue unmarshall(StaxUnmarshallerContext context) throws Exception {
        MessageSystemAttributeValue messageSystemAttributeValue = new MessageSystemAttributeValue();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return messageSystemAttributeValue;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StringValue", targetDepth)) {
                    messageSystemAttributeValue.setStringValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BinaryValue", targetDepth)) {
                    messageSystemAttributeValue.setBinaryValue(ByteBufferStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StringListValue", targetDepth)) {
                    messageSystemAttributeValue.withStringListValues(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BinaryListValue", targetDepth)) {
                    messageSystemAttributeValue.withBinaryListValues(ByteBufferStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataType", targetDepth)) {
                    messageSystemAttributeValue.setDataType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return messageSystemAttributeValue;
                }
            }
        }
    }

    private static MessageSystemAttributeValueStaxUnmarshaller instance;

    public static MessageSystemAttributeValueStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MessageSystemAttributeValueStaxUnmarshaller();
        return instance;
    }
}
