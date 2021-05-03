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
package com.amazonaws.services.groundstation.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.groundstation.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeContactResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContactResultJsonUnmarshaller implements Unmarshaller<DescribeContactResult, JsonUnmarshallerContext> {

    public DescribeContactResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeContactResult describeContactResult = new DescribeContactResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeContactResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("contactId", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contactStatus", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setContactStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataflowList", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setDataflowList(new ListUnmarshaller<DataflowDetail>(DataflowDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groundStation", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setGroundStation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maximumElevation", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setMaximumElevation(ElevationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("missionProfileArn", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setMissionProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("postPassEndTime", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setPostPassEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("prePassStartTime", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setPrePassStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("satelliteArn", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setSatelliteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeContactResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeContactResult;
    }

    private static DescribeContactResultJsonUnmarshaller instance;

    public static DescribeContactResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeContactResultJsonUnmarshaller();
        return instance;
    }
}
