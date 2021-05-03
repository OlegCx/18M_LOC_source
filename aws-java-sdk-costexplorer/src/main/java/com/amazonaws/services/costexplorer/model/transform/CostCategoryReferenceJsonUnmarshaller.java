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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CostCategoryReference JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategoryReferenceJsonUnmarshaller implements Unmarshaller<CostCategoryReference, JsonUnmarshallerContext> {

    public CostCategoryReference unmarshall(JsonUnmarshallerContext context) throws Exception {
        CostCategoryReference costCategoryReference = new CostCategoryReference();

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
                if (context.testExpression("CostCategoryArn", targetDepth)) {
                    context.nextToken();
                    costCategoryReference.setCostCategoryArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    costCategoryReference.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EffectiveStart", targetDepth)) {
                    context.nextToken();
                    costCategoryReference.setEffectiveStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EffectiveEnd", targetDepth)) {
                    context.nextToken();
                    costCategoryReference.setEffectiveEnd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfRules", targetDepth)) {
                    context.nextToken();
                    costCategoryReference.setNumberOfRules(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ProcessingStatus", targetDepth)) {
                    context.nextToken();
                    costCategoryReference.setProcessingStatus(new ListUnmarshaller<CostCategoryProcessingStatus>(CostCategoryProcessingStatusJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Values", targetDepth)) {
                    context.nextToken();
                    costCategoryReference.setValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DefaultValue", targetDepth)) {
                    context.nextToken();
                    costCategoryReference.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return costCategoryReference;
    }

    private static CostCategoryReferenceJsonUnmarshaller instance;

    public static CostCategoryReferenceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CostCategoryReferenceJsonUnmarshaller();
        return instance;
    }
}
