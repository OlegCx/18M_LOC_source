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
 * SavingsPlansPurchaseRecommendationDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller implements
        Unmarshaller<SavingsPlansPurchaseRecommendationDetail, JsonUnmarshallerContext> {

    public SavingsPlansPurchaseRecommendationDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        SavingsPlansPurchaseRecommendationDetail savingsPlansPurchaseRecommendationDetail = new SavingsPlansPurchaseRecommendationDetail();

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
                if (context.testExpression("SavingsPlansDetails", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setSavingsPlansDetails(SavingsPlansDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpfrontCost", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedROI", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedROI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSPCost", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedSPCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCost", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedOnDemandCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCostWithCurrentCommitment", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedOnDemandCostWithCurrentCommitment(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
                if (context.testExpression("EstimatedSavingsAmount", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedSavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSavingsPercentage", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedSavingsPercentage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HourlyCommitmentToPurchase", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setHourlyCommitmentToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedAverageUtilization", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedAverageUtilization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedMonthlySavingsAmount", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedMonthlySavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentMinimumHourlyOnDemandSpend", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setCurrentMinimumHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentMaximumHourlyOnDemandSpend", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setCurrentMaximumHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAverageHourlyOnDemandSpend", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setCurrentAverageHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return savingsPlansPurchaseRecommendationDetail;
    }

    private static SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller instance;

    public static SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller();
        return instance;
    }
}
