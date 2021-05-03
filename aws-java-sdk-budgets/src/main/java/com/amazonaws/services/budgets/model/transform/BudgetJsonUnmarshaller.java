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
package com.amazonaws.services.budgets.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.budgets.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Budget JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BudgetJsonUnmarshaller implements Unmarshaller<Budget, JsonUnmarshallerContext> {

    public Budget unmarshall(JsonUnmarshallerContext context) throws Exception {
        Budget budget = new Budget();

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
                if (context.testExpression("BudgetName", targetDepth)) {
                    context.nextToken();
                    budget.setBudgetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BudgetLimit", targetDepth)) {
                    context.nextToken();
                    budget.setBudgetLimit(SpendJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PlannedBudgetLimits", targetDepth)) {
                    context.nextToken();
                    budget.setPlannedBudgetLimits(new MapUnmarshaller<String, Spend>(context.getUnmarshaller(String.class), SpendJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("CostFilters", targetDepth)) {
                    context.nextToken();
                    budget.setCostFilters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("CostTypes", targetDepth)) {
                    context.nextToken();
                    budget.setCostTypes(CostTypesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeUnit", targetDepth)) {
                    context.nextToken();
                    budget.setTimeUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimePeriod", targetDepth)) {
                    context.nextToken();
                    budget.setTimePeriod(TimePeriodJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CalculatedSpend", targetDepth)) {
                    context.nextToken();
                    budget.setCalculatedSpend(CalculatedSpendJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BudgetType", targetDepth)) {
                    context.nextToken();
                    budget.setBudgetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    budget.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return budget;
    }

    private static BudgetJsonUnmarshaller instance;

    public static BudgetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BudgetJsonUnmarshaller();
        return instance;
    }
}
