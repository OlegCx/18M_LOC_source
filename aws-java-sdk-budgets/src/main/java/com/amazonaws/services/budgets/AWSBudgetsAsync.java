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

/**
 * Interface for accessing AWSBudgets asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.budgets.AbstractAWSBudgetsAsync} instead.
 * </p>
 * <p>
 * <p>
 * The AWS Budgets API enables you to use AWS Budgets to plan your service usage, service costs, and instance
 * reservations. The API reference provides descriptions, syntax, and usage examples for each of the actions and data
 * types for AWS Budgets.
 * </p>
 * <p>
 * Budgets provide you with a way to see the following information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * How close your plan is to your budgeted amount or to the free tier limits
 * </p>
 * </li>
 * <li>
 * <p>
 * Your usage-to-date, including how much you've used of your Reserved Instances (RIs)
 * </p>
 * </li>
 * <li>
 * <p>
 * Your current estimated charges from AWS, and how much your predicted usage will accrue in charges by the end of the
 * month
 * </p>
 * </li>
 * <li>
 * <p>
 * How much of your budget has been used
 * </p>
 * </li>
 * </ul>
 * <p>
 * AWS updates your budget status several times a day. Budgets track your unblended costs, subscriptions, refunds, and
 * RIs. You can create the following types of budgets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Cost budgets</b> - Plan how much you want to spend on a service.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Usage budgets</b> - Plan how much you want to use one or more services.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>RI utilization budgets</b> - Define a utilization threshold, and receive alerts when your RI usage falls below
 * that threshold. This lets you see if your RIs are unused or under-utilized.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>RI coverage budgets</b> - Define a coverage threshold, and receive alerts when the number of your instance hours
 * that are covered by RIs fall below that threshold. This lets you see how much of your instance usage is covered by a
 * reservation.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The AWS Budgets API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://budgets.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about costs that are associated with the AWS Budgets API, see <a
 * href="https://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBudgetsAsync extends AWSBudgets {

    /**
     * <p>
     * Creates a budget and, if included, notifications and subscribers.
     * </p>
     * <important>
     * <p>
     * Only one of <code>BudgetLimit</code> or <code>PlannedBudgetLimits</code> can be present in the syntax at one
     * time. Use the syntax that matches your case. The Request Syntax section shows the <code>BudgetLimit</code>
     * syntax. For <code>PlannedBudgetLimits</code>, see the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_CreateBudget.html#API_CreateBudget_Examples"
     * >Examples</a> section.
     * </p>
     * </important>
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @return A Java Future containing the result of the CreateBudget operation returned by the service.
     * @sample AWSBudgetsAsync.CreateBudget
     */
    java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest createBudgetRequest);

    /**
     * <p>
     * Creates a budget and, if included, notifications and subscribers.
     * </p>
     * <important>
     * <p>
     * Only one of <code>BudgetLimit</code> or <code>PlannedBudgetLimits</code> can be present in the syntax at one
     * time. Use the syntax that matches your case. The Request Syntax section shows the <code>BudgetLimit</code>
     * syntax. For <code>PlannedBudgetLimits</code>, see the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_CreateBudget.html#API_CreateBudget_Examples"
     * >Examples</a> section.
     * </p>
     * </important>
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBudget operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.CreateBudget
     */
    java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest createBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBudgetRequest, CreateBudgetResult> asyncHandler);

    /**
     * <p>
     * Creates a budget action.
     * </p>
     * 
     * @param createBudgetActionRequest
     * @return A Java Future containing the result of the CreateBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsync.CreateBudgetAction
     */
    java.util.concurrent.Future<CreateBudgetActionResult> createBudgetActionAsync(CreateBudgetActionRequest createBudgetActionRequest);

    /**
     * <p>
     * Creates a budget action.
     * </p>
     * 
     * @param createBudgetActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.CreateBudgetAction
     */
    java.util.concurrent.Future<CreateBudgetActionResult> createBudgetActionAsync(CreateBudgetActionRequest createBudgetActionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBudgetActionRequest, CreateBudgetActionResult> asyncHandler);

    /**
     * <p>
     * Creates a notification. You must create the budget before you create the associated notification.
     * </p>
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @return A Java Future containing the result of the CreateNotification operation returned by the service.
     * @sample AWSBudgetsAsync.CreateNotification
     */
    java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(CreateNotificationRequest createNotificationRequest);

    /**
     * <p>
     * Creates a notification. You must create the budget before you create the associated notification.
     * </p>
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotification operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.CreateNotification
     */
    java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(CreateNotificationRequest createNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotificationRequest, CreateNotificationResult> asyncHandler);

    /**
     * <p>
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     * </p>
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @return A Java Future containing the result of the CreateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.CreateSubscriber
     */
    java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest createSubscriberRequest);

    /**
     * <p>
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     * </p>
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.CreateSubscriber
     */
    java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest createSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriberRequest, CreateSubscriberResult> asyncHandler);

    /**
     * <p>
     * Deletes a budget. You can delete your budget at any time.
     * </p>
     * <important>
     * <p>
     * Deleting a budget also deletes the notifications and subscribers that are associated with that budget.
     * </p>
     * </important>
     * 
     * @param deleteBudgetRequest
     *        Request of DeleteBudget
     * @return A Java Future containing the result of the DeleteBudget operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteBudget
     */
    java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest deleteBudgetRequest);

    /**
     * <p>
     * Deletes a budget. You can delete your budget at any time.
     * </p>
     * <important>
     * <p>
     * Deleting a budget also deletes the notifications and subscribers that are associated with that budget.
     * </p>
     * </important>
     * 
     * @param deleteBudgetRequest
     *        Request of DeleteBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBudget operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DeleteBudget
     */
    java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest deleteBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBudgetRequest, DeleteBudgetResult> asyncHandler);

    /**
     * <p>
     * Deletes a budget action.
     * </p>
     * 
     * @param deleteBudgetActionRequest
     * @return A Java Future containing the result of the DeleteBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteBudgetAction
     */
    java.util.concurrent.Future<DeleteBudgetActionResult> deleteBudgetActionAsync(DeleteBudgetActionRequest deleteBudgetActionRequest);

    /**
     * <p>
     * Deletes a budget action.
     * </p>
     * 
     * @param deleteBudgetActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DeleteBudgetAction
     */
    java.util.concurrent.Future<DeleteBudgetActionResult> deleteBudgetActionAsync(DeleteBudgetActionRequest deleteBudgetActionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBudgetActionRequest, DeleteBudgetActionResult> asyncHandler);

    /**
     * <p>
     * Deletes a notification.
     * </p>
     * <important>
     * <p>
     * Deleting a notification also deletes the subscribers that are associated with the notification.
     * </p>
     * </important>
     * 
     * @param deleteNotificationRequest
     *        Request of DeleteNotification
     * @return A Java Future containing the result of the DeleteNotification operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteNotification
     */
    java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(DeleteNotificationRequest deleteNotificationRequest);

    /**
     * <p>
     * Deletes a notification.
     * </p>
     * <important>
     * <p>
     * Deleting a notification also deletes the subscribers that are associated with the notification.
     * </p>
     * </important>
     * 
     * @param deleteNotificationRequest
     *        Request of DeleteNotification
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotification operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DeleteNotification
     */
    java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(DeleteNotificationRequest deleteNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationRequest, DeleteNotificationResult> asyncHandler);

    /**
     * <p>
     * Deletes a subscriber.
     * </p>
     * <important>
     * <p>
     * Deleting the last subscriber to a notification also deletes the notification.
     * </p>
     * </important>
     * 
     * @param deleteSubscriberRequest
     *        Request of DeleteSubscriber
     * @return A Java Future containing the result of the DeleteSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteSubscriber
     */
    java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest deleteSubscriberRequest);

    /**
     * <p>
     * Deletes a subscriber.
     * </p>
     * <important>
     * <p>
     * Deleting the last subscriber to a notification also deletes the notification.
     * </p>
     * </important>
     * 
     * @param deleteSubscriberRequest
     *        Request of DeleteSubscriber
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriber operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DeleteSubscriber
     */
    java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest deleteSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriberRequest, DeleteSubscriberResult> asyncHandler);

    /**
     * <p>
     * Describes a budget.
     * </p>
     * <important>
     * <p>
     * The Request Syntax section shows the <code>BudgetLimit</code> syntax. For <code>PlannedBudgetLimits</code>, see
     * the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_DescribeBudget.html#API_DescribeBudget_Examples"
     * >Examples</a> section.
     * </p>
     * </important>
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @return A Java Future containing the result of the DescribeBudget operation returned by the service.
     * @sample AWSBudgetsAsync.DescribeBudget
     */
    java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(DescribeBudgetRequest describeBudgetRequest);

    /**
     * <p>
     * Describes a budget.
     * </p>
     * <important>
     * <p>
     * The Request Syntax section shows the <code>BudgetLimit</code> syntax. For <code>PlannedBudgetLimits</code>, see
     * the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_DescribeBudget.html#API_DescribeBudget_Examples"
     * >Examples</a> section.
     * </p>
     * </important>
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudget operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudget
     */
    java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(DescribeBudgetRequest describeBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetRequest, DescribeBudgetResult> asyncHandler);

    /**
     * <p>
     * Describes a budget action detail.
     * </p>
     * 
     * @param describeBudgetActionRequest
     * @return A Java Future containing the result of the DescribeBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsync.DescribeBudgetAction
     */
    java.util.concurrent.Future<DescribeBudgetActionResult> describeBudgetActionAsync(DescribeBudgetActionRequest describeBudgetActionRequest);

    /**
     * <p>
     * Describes a budget action detail.
     * </p>
     * 
     * @param describeBudgetActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudgetAction
     */
    java.util.concurrent.Future<DescribeBudgetActionResult> describeBudgetActionAsync(DescribeBudgetActionRequest describeBudgetActionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetActionRequest, DescribeBudgetActionResult> asyncHandler);

    /**
     * <p>
     * Describes a budget action history detail.
     * </p>
     * 
     * @param describeBudgetActionHistoriesRequest
     * @return A Java Future containing the result of the DescribeBudgetActionHistories operation returned by the
     *         service.
     * @sample AWSBudgetsAsync.DescribeBudgetActionHistories
     */
    java.util.concurrent.Future<DescribeBudgetActionHistoriesResult> describeBudgetActionHistoriesAsync(
            DescribeBudgetActionHistoriesRequest describeBudgetActionHistoriesRequest);

    /**
     * <p>
     * Describes a budget action history detail.
     * </p>
     * 
     * @param describeBudgetActionHistoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudgetActionHistories operation returned by the
     *         service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudgetActionHistories
     */
    java.util.concurrent.Future<DescribeBudgetActionHistoriesResult> describeBudgetActionHistoriesAsync(
            DescribeBudgetActionHistoriesRequest describeBudgetActionHistoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetActionHistoriesRequest, DescribeBudgetActionHistoriesResult> asyncHandler);

    /**
     * <p>
     * Describes all of the budget actions for an account.
     * </p>
     * 
     * @param describeBudgetActionsForAccountRequest
     * @return A Java Future containing the result of the DescribeBudgetActionsForAccount operation returned by the
     *         service.
     * @sample AWSBudgetsAsync.DescribeBudgetActionsForAccount
     */
    java.util.concurrent.Future<DescribeBudgetActionsForAccountResult> describeBudgetActionsForAccountAsync(
            DescribeBudgetActionsForAccountRequest describeBudgetActionsForAccountRequest);

    /**
     * <p>
     * Describes all of the budget actions for an account.
     * </p>
     * 
     * @param describeBudgetActionsForAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudgetActionsForAccount operation returned by the
     *         service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudgetActionsForAccount
     */
    java.util.concurrent.Future<DescribeBudgetActionsForAccountResult> describeBudgetActionsForAccountAsync(
            DescribeBudgetActionsForAccountRequest describeBudgetActionsForAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetActionsForAccountRequest, DescribeBudgetActionsForAccountResult> asyncHandler);

    /**
     * <p>
     * Describes all of the budget actions for a budget.
     * </p>
     * 
     * @param describeBudgetActionsForBudgetRequest
     * @return A Java Future containing the result of the DescribeBudgetActionsForBudget operation returned by the
     *         service.
     * @sample AWSBudgetsAsync.DescribeBudgetActionsForBudget
     */
    java.util.concurrent.Future<DescribeBudgetActionsForBudgetResult> describeBudgetActionsForBudgetAsync(
            DescribeBudgetActionsForBudgetRequest describeBudgetActionsForBudgetRequest);

    /**
     * <p>
     * Describes all of the budget actions for a budget.
     * </p>
     * 
     * @param describeBudgetActionsForBudgetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudgetActionsForBudget operation returned by the
     *         service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudgetActionsForBudget
     */
    java.util.concurrent.Future<DescribeBudgetActionsForBudgetResult> describeBudgetActionsForBudgetAsync(
            DescribeBudgetActionsForBudgetRequest describeBudgetActionsForBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetActionsForBudgetRequest, DescribeBudgetActionsForBudgetResult> asyncHandler);

    /**
     * <p>
     * Describes the history for <code>DAILY</code>, <code>MONTHLY</code>, and <code>QUARTERLY</code> budgets. Budget
     * history isn't available for <code>ANNUAL</code> budgets.
     * </p>
     * 
     * @param describeBudgetPerformanceHistoryRequest
     * @return A Java Future containing the result of the DescribeBudgetPerformanceHistory operation returned by the
     *         service.
     * @sample AWSBudgetsAsync.DescribeBudgetPerformanceHistory
     */
    java.util.concurrent.Future<DescribeBudgetPerformanceHistoryResult> describeBudgetPerformanceHistoryAsync(
            DescribeBudgetPerformanceHistoryRequest describeBudgetPerformanceHistoryRequest);

    /**
     * <p>
     * Describes the history for <code>DAILY</code>, <code>MONTHLY</code>, and <code>QUARTERLY</code> budgets. Budget
     * history isn't available for <code>ANNUAL</code> budgets.
     * </p>
     * 
     * @param describeBudgetPerformanceHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudgetPerformanceHistory operation returned by the
     *         service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudgetPerformanceHistory
     */
    java.util.concurrent.Future<DescribeBudgetPerformanceHistoryResult> describeBudgetPerformanceHistoryAsync(
            DescribeBudgetPerformanceHistoryRequest describeBudgetPerformanceHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetPerformanceHistoryRequest, DescribeBudgetPerformanceHistoryResult> asyncHandler);

    /**
     * <p>
     * Lists the budgets that are associated with an account.
     * </p>
     * <important>
     * <p>
     * The Request Syntax section shows the <code>BudgetLimit</code> syntax. For <code>PlannedBudgetLimits</code>, see
     * the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_DescribeBudgets.html#API_DescribeBudgets_Examples"
     * >Examples</a> section.
     * </p>
     * </important>
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @return A Java Future containing the result of the DescribeBudgets operation returned by the service.
     * @sample AWSBudgetsAsync.DescribeBudgets
     */
    java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(DescribeBudgetsRequest describeBudgetsRequest);

    /**
     * <p>
     * Lists the budgets that are associated with an account.
     * </p>
     * <important>
     * <p>
     * The Request Syntax section shows the <code>BudgetLimit</code> syntax. For <code>PlannedBudgetLimits</code>, see
     * the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_DescribeBudgets.html#API_DescribeBudgets_Examples"
     * >Examples</a> section.
     * </p>
     * </important>
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudgets operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudgets
     */
    java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(DescribeBudgetsRequest describeBudgetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetsRequest, DescribeBudgetsResult> asyncHandler);

    /**
     * <p>
     * Lists the notifications that are associated with a budget.
     * </p>
     * 
     * @param describeNotificationsForBudgetRequest
     *        Request of DescribeNotificationsForBudget
     * @return A Java Future containing the result of the DescribeNotificationsForBudget operation returned by the
     *         service.
     * @sample AWSBudgetsAsync.DescribeNotificationsForBudget
     */
    java.util.concurrent.Future<DescribeNotificationsForBudgetResult> describeNotificationsForBudgetAsync(
            DescribeNotificationsForBudgetRequest describeNotificationsForBudgetRequest);

    /**
     * <p>
     * Lists the notifications that are associated with a budget.
     * </p>
     * 
     * @param describeNotificationsForBudgetRequest
     *        Request of DescribeNotificationsForBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotificationsForBudget operation returned by the
     *         service.
     * @sample AWSBudgetsAsyncHandler.DescribeNotificationsForBudget
     */
    java.util.concurrent.Future<DescribeNotificationsForBudgetResult> describeNotificationsForBudgetAsync(
            DescribeNotificationsForBudgetRequest describeNotificationsForBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationsForBudgetRequest, DescribeNotificationsForBudgetResult> asyncHandler);

    /**
     * <p>
     * Lists the subscribers that are associated with a notification.
     * </p>
     * 
     * @param describeSubscribersForNotificationRequest
     *        Request of DescribeSubscribersForNotification
     * @return A Java Future containing the result of the DescribeSubscribersForNotification operation returned by the
     *         service.
     * @sample AWSBudgetsAsync.DescribeSubscribersForNotification
     */
    java.util.concurrent.Future<DescribeSubscribersForNotificationResult> describeSubscribersForNotificationAsync(
            DescribeSubscribersForNotificationRequest describeSubscribersForNotificationRequest);

    /**
     * <p>
     * Lists the subscribers that are associated with a notification.
     * </p>
     * 
     * @param describeSubscribersForNotificationRequest
     *        Request of DescribeSubscribersForNotification
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubscribersForNotification operation returned by the
     *         service.
     * @sample AWSBudgetsAsyncHandler.DescribeSubscribersForNotification
     */
    java.util.concurrent.Future<DescribeSubscribersForNotificationResult> describeSubscribersForNotificationAsync(
            DescribeSubscribersForNotificationRequest describeSubscribersForNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscribersForNotificationRequest, DescribeSubscribersForNotificationResult> asyncHandler);

    /**
     * <p>
     * Executes a budget action.
     * </p>
     * 
     * @param executeBudgetActionRequest
     * @return A Java Future containing the result of the ExecuteBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsync.ExecuteBudgetAction
     */
    java.util.concurrent.Future<ExecuteBudgetActionResult> executeBudgetActionAsync(ExecuteBudgetActionRequest executeBudgetActionRequest);

    /**
     * <p>
     * Executes a budget action.
     * </p>
     * 
     * @param executeBudgetActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.ExecuteBudgetAction
     */
    java.util.concurrent.Future<ExecuteBudgetActionResult> executeBudgetActionAsync(ExecuteBudgetActionRequest executeBudgetActionRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteBudgetActionRequest, ExecuteBudgetActionResult> asyncHandler);

    /**
     * <p>
     * Updates a budget. You can change every part of a budget except for the <code>budgetName</code> and the
     * <code>calculatedSpend</code>. When you modify a budget, the <code>calculatedSpend</code> drops to zero until AWS
     * has new usage data to use for forecasting.
     * </p>
     * <important>
     * <p>
     * Only one of <code>BudgetLimit</code> or <code>PlannedBudgetLimits</code> can be present in the syntax at one
     * time. Use the syntax that matches your case. The Request Syntax section shows the <code>BudgetLimit</code>
     * syntax. For <code>PlannedBudgetLimits</code>, see the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_UpdateBudget.html#API_UpdateBudget_Examples"
     * >Examples</a> section.
     * </p>
     * </important>
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @return A Java Future containing the result of the UpdateBudget operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateBudget
     */
    java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest updateBudgetRequest);

    /**
     * <p>
     * Updates a budget. You can change every part of a budget except for the <code>budgetName</code> and the
     * <code>calculatedSpend</code>. When you modify a budget, the <code>calculatedSpend</code> drops to zero until AWS
     * has new usage data to use for forecasting.
     * </p>
     * <important>
     * <p>
     * Only one of <code>BudgetLimit</code> or <code>PlannedBudgetLimits</code> can be present in the syntax at one
     * time. Use the syntax that matches your case. The Request Syntax section shows the <code>BudgetLimit</code>
     * syntax. For <code>PlannedBudgetLimits</code>, see the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_UpdateBudget.html#API_UpdateBudget_Examples"
     * >Examples</a> section.
     * </p>
     * </important>
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBudget operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.UpdateBudget
     */
    java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest updateBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBudgetRequest, UpdateBudgetResult> asyncHandler);

    /**
     * <p>
     * Updates a budget action.
     * </p>
     * 
     * @param updateBudgetActionRequest
     * @return A Java Future containing the result of the UpdateBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateBudgetAction
     */
    java.util.concurrent.Future<UpdateBudgetActionResult> updateBudgetActionAsync(UpdateBudgetActionRequest updateBudgetActionRequest);

    /**
     * <p>
     * Updates a budget action.
     * </p>
     * 
     * @param updateBudgetActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBudgetAction operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.UpdateBudgetAction
     */
    java.util.concurrent.Future<UpdateBudgetActionResult> updateBudgetActionAsync(UpdateBudgetActionRequest updateBudgetActionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBudgetActionRequest, UpdateBudgetActionResult> asyncHandler);

    /**
     * <p>
     * Updates a notification.
     * </p>
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @return A Java Future containing the result of the UpdateNotification operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateNotification
     */
    java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(UpdateNotificationRequest updateNotificationRequest);

    /**
     * <p>
     * Updates a notification.
     * </p>
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotification operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.UpdateNotification
     */
    java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(UpdateNotificationRequest updateNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotificationRequest, UpdateNotificationResult> asyncHandler);

    /**
     * <p>
     * Updates a subscriber.
     * </p>
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @return A Java Future containing the result of the UpdateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateSubscriber
     */
    java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest updateSubscriberRequest);

    /**
     * <p>
     * Updates a subscriber.
     * </p>
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.UpdateSubscriber
     */
    java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest updateSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriberRequest, UpdateSubscriberResult> asyncHandler);

}
