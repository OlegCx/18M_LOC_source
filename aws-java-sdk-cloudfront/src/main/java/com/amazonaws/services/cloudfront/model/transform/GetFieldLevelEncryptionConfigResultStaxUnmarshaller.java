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
 * GetFieldLevelEncryptionConfigResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFieldLevelEncryptionConfigResultStaxUnmarshaller implements Unmarshaller<GetFieldLevelEncryptionConfigResult, StaxUnmarshallerContext> {

    public GetFieldLevelEncryptionConfigResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfigResult = new GetFieldLevelEncryptionConfigResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            context.setCurrentHeader("ETag");
            getFieldLevelEncryptionConfigResult.setETag(StringStaxUnmarshaller.getInstance().unmarshall(context));

        }

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getFieldLevelEncryptionConfigResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("FieldLevelEncryptionConfig", targetDepth)) {
                    getFieldLevelEncryptionConfigResult.setFieldLevelEncryptionConfig(FieldLevelEncryptionConfigStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getFieldLevelEncryptionConfigResult;
                }
            }
        }
    }

    private static GetFieldLevelEncryptionConfigResultStaxUnmarshaller instance;

    public static GetFieldLevelEncryptionConfigResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetFieldLevelEncryptionConfigResultStaxUnmarshaller();
        return instance;
    }
}
