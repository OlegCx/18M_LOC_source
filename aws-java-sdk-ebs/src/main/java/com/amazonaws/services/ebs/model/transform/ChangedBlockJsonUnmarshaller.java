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
package com.amazonaws.services.ebs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ChangedBlock JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangedBlockJsonUnmarshaller implements Unmarshaller<ChangedBlock, JsonUnmarshallerContext> {

    public ChangedBlock unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChangedBlock changedBlock = new ChangedBlock();

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
                if (context.testExpression("BlockIndex", targetDepth)) {
                    context.nextToken();
                    changedBlock.setBlockIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FirstBlockToken", targetDepth)) {
                    context.nextToken();
                    changedBlock.setFirstBlockToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecondBlockToken", targetDepth)) {
                    context.nextToken();
                    changedBlock.setSecondBlockToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return changedBlock;
    }

    private static ChangedBlockJsonUnmarshaller instance;

    public static ChangedBlockJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChangedBlockJsonUnmarshaller();
        return instance;
    }
}
