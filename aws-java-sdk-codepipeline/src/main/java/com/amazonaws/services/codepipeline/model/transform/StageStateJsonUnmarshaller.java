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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StageState JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageStateJsonUnmarshaller implements Unmarshaller<StageState, JsonUnmarshallerContext> {

    public StageState unmarshall(JsonUnmarshallerContext context) throws Exception {
        StageState stageState = new StageState();

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
                if (context.testExpression("stageName", targetDepth)) {
                    context.nextToken();
                    stageState.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inboundExecution", targetDepth)) {
                    context.nextToken();
                    stageState.setInboundExecution(StageExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inboundTransitionState", targetDepth)) {
                    context.nextToken();
                    stageState.setInboundTransitionState(TransitionStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("actionStates", targetDepth)) {
                    context.nextToken();
                    stageState.setActionStates(new ListUnmarshaller<ActionState>(ActionStateJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("latestExecution", targetDepth)) {
                    context.nextToken();
                    stageState.setLatestExecution(StageExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stageState;
    }

    private static StageStateJsonUnmarshaller instance;

    public static StageStateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StageStateJsonUnmarshaller();
        return instance;
    }
}
