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
package com.amazonaws.services.budgets;

import javax.annotation.Generated;

import com.amazonaws.services.budgets.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSBudgets}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBudgets implements AWSBudgets {

    protected AbstractAWSBudgets() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBudgetResult createBudget(CreateBudgetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBudgetActionResult createBudgetAction(CreateBudgetActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateNotificationResult createNotification(CreateNotificationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSubscriberResult createSubscriber(CreateSubscriberRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBudgetResult deleteBudget(DeleteBudgetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBudgetActionResult deleteBudgetAction(DeleteBudgetActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNotificationResult deleteNotification(DeleteNotificationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBudgetResult describeBudget(DescribeBudgetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBudgetActionResult describeBudgetAction(DescribeBudgetActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBudgetActionHistoriesResult describeBudgetActionHistories(DescribeBudgetActionHistoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBudgetActionsForAccountResult describeBudgetActionsForAccount(DescribeBudgetActionsForAccountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBudgetActionsForBudgetResult describeBudgetActionsForBudget(DescribeBudgetActionsForBudgetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBudgetPerformanceHistoryResult describeBudgetPerformanceHistory(DescribeBudgetPerformanceHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBudgetsResult describeBudgets(DescribeBudgetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNotificationsForBudgetResult describeNotificationsForBudget(DescribeNotificationsForBudgetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSubscribersForNotificationResult describeSubscribersForNotification(DescribeSubscribersForNotificationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExecuteBudgetActionResult executeBudgetAction(ExecuteBudgetActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateBudgetResult updateBudget(UpdateBudgetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateBudgetActionResult updateBudgetAction(UpdateBudgetActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateNotificationResult updateNotification(UpdateNotificationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSubscriberResult updateSubscriber(UpdateSubscriberRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
