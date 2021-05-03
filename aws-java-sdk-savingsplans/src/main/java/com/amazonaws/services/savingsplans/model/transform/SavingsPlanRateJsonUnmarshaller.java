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
package com.amazonaws.services.savingsplans.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.savingsplans.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SavingsPlanRate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlanRateJsonUnmarshaller implements Unmarshaller<SavingsPlanRate, JsonUnmarshallerContext> {

    public SavingsPlanRate unmarshall(JsonUnmarshallerContext context) throws Exception {
        SavingsPlanRate savingsPlanRate = new SavingsPlanRate();

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
                if (context.testExpression("rate", targetDepth)) {
                    context.nextToken();
                    savingsPlanRate.setRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currency", targetDepth)) {
                    context.nextToken();
                    savingsPlanRate.setCurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unit", targetDepth)) {
                    context.nextToken();
                    savingsPlanRate.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("productType", targetDepth)) {
                    context.nextToken();
                    savingsPlanRate.setProductType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceCode", targetDepth)) {
                    context.nextToken();
                    savingsPlanRate.setServiceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usageType", targetDepth)) {
                    context.nextToken();
                    savingsPlanRate.setUsageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operation", targetDepth)) {
                    context.nextToken();
                    savingsPlanRate.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("properties", targetDepth)) {
                    context.nextToken();
                    savingsPlanRate.setProperties(new ListUnmarshaller<SavingsPlanRateProperty>(SavingsPlanRatePropertyJsonUnmarshaller.getInstance())

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

        return savingsPlanRate;
    }

    private static SavingsPlanRateJsonUnmarshaller instance;

    public static SavingsPlanRateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlanRateJsonUnmarshaller();
        return instance;
    }
}
