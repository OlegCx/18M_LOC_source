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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * IKEVersionsListValue StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IKEVersionsListValueStaxUnmarshaller implements Unmarshaller<IKEVersionsListValue, StaxUnmarshallerContext> {

    public IKEVersionsListValue unmarshall(StaxUnmarshallerContext context) throws Exception {
        IKEVersionsListValue iKEVersionsListValue = new IKEVersionsListValue();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return iKEVersionsListValue;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("value", targetDepth)) {
                    iKEVersionsListValue.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return iKEVersionsListValue;
                }
            }
        }
    }

    private static IKEVersionsListValueStaxUnmarshaller instance;

    public static IKEVersionsListValueStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IKEVersionsListValueStaxUnmarshaller();
        return instance;
    }
}
