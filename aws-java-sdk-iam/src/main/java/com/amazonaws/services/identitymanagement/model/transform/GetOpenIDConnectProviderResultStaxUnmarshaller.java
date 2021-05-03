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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetOpenIDConnectProviderResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOpenIDConnectProviderResultStaxUnmarshaller implements Unmarshaller<GetOpenIDConnectProviderResult, StaxUnmarshallerContext> {

    public GetOpenIDConnectProviderResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetOpenIDConnectProviderResult getOpenIDConnectProviderResult = new GetOpenIDConnectProviderResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getOpenIDConnectProviderResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Url", targetDepth)) {
                    getOpenIDConnectProviderResult.setUrl(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClientIDList", targetDepth)) {
                    getOpenIDConnectProviderResult.withClientIDList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ClientIDList/member", targetDepth)) {
                    getOpenIDConnectProviderResult.withClientIDList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ThumbprintList", targetDepth)) {
                    getOpenIDConnectProviderResult.withThumbprintList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ThumbprintList/member", targetDepth)) {
                    getOpenIDConnectProviderResult.withThumbprintList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateDate", targetDepth)) {
                    getOpenIDConnectProviderResult.setCreateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    getOpenIDConnectProviderResult.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/member", targetDepth)) {
                    getOpenIDConnectProviderResult.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getOpenIDConnectProviderResult;
                }
            }
        }
    }

    private static GetOpenIDConnectProviderResultStaxUnmarshaller instance;

    public static GetOpenIDConnectProviderResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetOpenIDConnectProviderResultStaxUnmarshaller();
        return instance;
    }
}
