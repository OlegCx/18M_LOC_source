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
package com.amazonaws.services.appstream.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchAssociateUserStackResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAssociateUserStackResultJsonUnmarshaller implements Unmarshaller<BatchAssociateUserStackResult, JsonUnmarshallerContext> {

    public BatchAssociateUserStackResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchAssociateUserStackResult batchAssociateUserStackResult = new BatchAssociateUserStackResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchAssociateUserStackResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("errors", targetDepth)) {
                    context.nextToken();
                    batchAssociateUserStackResult.setErrors(new ListUnmarshaller<UserStackAssociationError>(UserStackAssociationErrorJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchAssociateUserStackResult;
    }

    private static BatchAssociateUserStackResultJsonUnmarshaller instance;

    public static BatchAssociateUserStackResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchAssociateUserStackResultJsonUnmarshaller();
        return instance;
    }
}
