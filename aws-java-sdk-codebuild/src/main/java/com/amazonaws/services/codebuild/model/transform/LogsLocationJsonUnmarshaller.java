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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LogsLocation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogsLocationJsonUnmarshaller implements Unmarshaller<LogsLocation, JsonUnmarshallerContext> {

    public LogsLocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        LogsLocation logsLocation = new LogsLocation();

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
                if (context.testExpression("groupName", targetDepth)) {
                    context.nextToken();
                    logsLocation.setGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("streamName", targetDepth)) {
                    context.nextToken();
                    logsLocation.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deepLink", targetDepth)) {
                    context.nextToken();
                    logsLocation.setDeepLink(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3DeepLink", targetDepth)) {
                    context.nextToken();
                    logsLocation.setS3DeepLink(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cloudWatchLogsArn", targetDepth)) {
                    context.nextToken();
                    logsLocation.setCloudWatchLogsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3LogsArn", targetDepth)) {
                    context.nextToken();
                    logsLocation.setS3LogsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cloudWatchLogs", targetDepth)) {
                    context.nextToken();
                    logsLocation.setCloudWatchLogs(CloudWatchLogsConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("s3Logs", targetDepth)) {
                    context.nextToken();
                    logsLocation.setS3Logs(S3LogsConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return logsLocation;
    }

    private static LogsLocationJsonUnmarshaller instance;

    public static LogsLocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogsLocationJsonUnmarshaller();
        return instance;
    }
}
