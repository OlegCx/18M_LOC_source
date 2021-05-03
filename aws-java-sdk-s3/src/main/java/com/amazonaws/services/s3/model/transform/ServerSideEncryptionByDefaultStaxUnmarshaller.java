/*
 * Copyright 2015-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.ServerSideEncryptionByDefault;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import javax.xml.stream.events.XMLEvent;

/**
 * Unmarshaller for {@link ServerSideEncryptionByDefault}.
 */
class ServerSideEncryptionByDefaultStaxUnmarshaller
    implements Unmarshaller<ServerSideEncryptionByDefault, StaxUnmarshallerContext> {

    private static final ServerSideEncryptionByDefaultStaxUnmarshaller instance = new ServerSideEncryptionByDefaultStaxUnmarshaller();

    public static ServerSideEncryptionByDefaultStaxUnmarshaller getInstance() {
        return instance;
    }

    private ServerSideEncryptionByDefaultStaxUnmarshaller() {
    }

    @Override
    public ServerSideEncryptionByDefault unmarshall(StaxUnmarshallerContext context) throws Exception {
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        ServerSideEncryptionByDefault sseByDefault = new ServerSideEncryptionByDefault();

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return sseByDefault;
            }

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("SSEAlgorithm", targetDepth)) {
                    sseByDefault.setSSEAlgorithm(StringStaxUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KMSMasterKeyID", targetDepth)) {
                    sseByDefault.setKMSMasterKeyID(StringStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return sseByDefault;
                }
            }
        }
    }

}
