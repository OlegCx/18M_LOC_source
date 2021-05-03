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
 * GetSatelliteResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSatelliteResultJsonUnmarshaller implements Unmarshaller<GetSatelliteResult, JsonUnmarshallerContext> {

    public GetSatelliteResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSatelliteResult getSatelliteResult = new GetSatelliteResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSatelliteResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("groundStations", targetDepth)) {
                    context.nextToken();
                    getSatelliteResult.setGroundStations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("noradSatelliteID", targetDepth)) {
                    context.nextToken();
                    getSatelliteResult.setNoradSatelliteID(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("satelliteArn", targetDepth)) {
                    context.nextToken();
                    getSatelliteResult.setSatelliteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("satelliteId", targetDepth)) {
                    context.nextToken();
                    getSatelliteResult.setSatelliteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSatelliteResult;
    }

    private static GetSatelliteResultJsonUnmarshaller instance;

    public static GetSatelliteResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSatelliteResultJsonUnmarshaller();
        return instance;
    }
}
