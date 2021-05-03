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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicationTaskStats JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTaskStatsJsonUnmarshaller implements Unmarshaller<ReplicationTaskStats, JsonUnmarshallerContext> {

    public ReplicationTaskStats unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationTaskStats replicationTaskStats = new ReplicationTaskStats();

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
                if (context.testExpression("FullLoadProgressPercent", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setFullLoadProgressPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ElapsedTimeMillis", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setElapsedTimeMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TablesLoaded", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setTablesLoaded(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesLoading", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setTablesLoading(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesQueued", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setTablesQueued(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesErrored", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setTablesErrored(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FreshStartDate", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setFreshStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartDate", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StopDate", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setStopDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FullLoadStartDate", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setFullLoadStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FullLoadFinishDate", targetDepth)) {
                    context.nextToken();
                    replicationTaskStats.setFullLoadFinishDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicationTaskStats;
    }

    private static ReplicationTaskStatsJsonUnmarshaller instance;

    public static ReplicationTaskStatsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskStatsJsonUnmarshaller();
        return instance;
    }
}
