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
 * ConfigTypeData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigTypeDataJsonUnmarshaller implements Unmarshaller<ConfigTypeData, JsonUnmarshallerContext> {

    public ConfigTypeData unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfigTypeData configTypeData = new ConfigTypeData();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("antennaDownlinkConfig", targetDepth)) {
                    context.nextToken();
                    configTypeData.setAntennaDownlinkConfig(AntennaDownlinkConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("antennaDownlinkDemodDecodeConfig", targetDepth)) {
                    context.nextToken();
                    configTypeData.setAntennaDownlinkDemodDecodeConfig(AntennaDownlinkDemodDecodeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("antennaUplinkConfig", targetDepth)) {
                    context.nextToken();
                    configTypeData.setAntennaUplinkConfig(AntennaUplinkConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataflowEndpointConfig", targetDepth)) {
                    context.nextToken();
                    configTypeData.setDataflowEndpointConfig(DataflowEndpointConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("s3RecordingConfig", targetDepth)) {
                    context.nextToken();
                    configTypeData.setS3RecordingConfig(S3RecordingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("trackingConfig", targetDepth)) {
                    context.nextToken();
                    configTypeData.setTrackingConfig(TrackingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("uplinkEchoConfig", targetDepth)) {
                    context.nextToken();
                    configTypeData.setUplinkEchoConfig(UplinkEchoConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configTypeData;
    }

    private static ConfigTypeDataJsonUnmarshaller instance;

    public static ConfigTypeDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigTypeDataJsonUnmarshaller();
        return instance;
    }
}
