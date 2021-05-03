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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeProductResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProductResultJsonUnmarshaller implements Unmarshaller<DescribeProductResult, JsonUnmarshallerContext> {

    public DescribeProductResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProductResult describeProductResult = new DescribeProductResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeProductResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProductViewSummary", targetDepth)) {
                    context.nextToken();
                    describeProductResult.setProductViewSummary(ProductViewSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifacts", targetDepth)) {
                    context.nextToken();
                    describeProductResult.setProvisioningArtifacts(new ListUnmarshaller<ProvisioningArtifact>(ProvisioningArtifactJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Budgets", targetDepth)) {
                    context.nextToken();
                    describeProductResult.setBudgets(new ListUnmarshaller<BudgetDetail>(BudgetDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LaunchPaths", targetDepth)) {
                    context.nextToken();
                    describeProductResult.setLaunchPaths(new ListUnmarshaller<LaunchPath>(LaunchPathJsonUnmarshaller.getInstance())

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

        return describeProductResult;
    }

    private static DescribeProductResultJsonUnmarshaller instance;

    public static DescribeProductResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProductResultJsonUnmarshaller();
        return instance;
    }
}
