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
package com.amazonaws.services.cloudwatch;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;

/**
 * Interface for accessing CloudWatch asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudwatch.AbstractAmazonCloudWatchAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon CloudWatch monitors your Amazon Web Services (AWS) resources and the applications you run on AWS in real time.
 * You can use CloudWatch to collect and track metrics, which are the variables you want to measure for your resources
 * and applications.
 * </p>
 * <p>
 * CloudWatch alarms send notifications or automatically change the resources you are monitoring based on rules that you
 * define. For example, you can monitor the CPU usage and disk reads and writes of your Amazon EC2 instances. Then, use
 * this data to determine whether you should launch additional instances to handle increased load. You can also use this
 * data to stop under-used instances to save money.
 * </p>
 * <p>
 * In addition to monitoring the built-in metrics that come with AWS, you can monitor your own custom metrics. With
 * CloudWatch, you gain system-wide visibility into resource utilization, application performance, and operational
 * health.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudWatchAsync extends AmazonCloudWatch {

    /**
     * <p>
     * Deletes the specified alarms. You can delete up to 100 alarms in one operation. However, this total can include
     * no more than one composite alarm. For example, you could delete 99 metric alarms and one composite alarms with
     * one operation, but you can't delete two composite alarms with one operation.
     * </p>
     * <p>
     * In the event of an error, no alarms are deleted.
     * </p>
     * <note>
     * <p>
     * It is possible to create a loop or cycle of composite alarms, where composite alarm A depends on composite alarm
     * B, and composite alarm B also depends on composite alarm A. In this scenario, you can't delete any composite
     * alarm that is part of the cycle because there is always still a composite alarm that depends on that alarm that
     * you want to delete.
     * </p>
     * <p>
     * To get out of such a situation, you must break the cycle by changing the rule of one of the composite alarms in
     * the cycle to remove a dependency that creates the cycle. The simplest change to make to break a cycle is to
     * change the <code>AlarmRule</code> of one of the alarms to <code>False</code>.
     * </p>
     * <p>
     * Additionally, the evaluation of composite alarms stops if CloudWatch detects a cycle in the evaluation path.
     * </p>
     * </note>
     * 
     * @param deleteAlarmsRequest
     * @return A Java Future containing the result of the DeleteAlarms operation returned by the service.
     * @sample AmazonCloudWatchAsync.DeleteAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlarmsResult> deleteAlarmsAsync(DeleteAlarmsRequest deleteAlarmsRequest);

    /**
     * <p>
     * Deletes the specified alarms. You can delete up to 100 alarms in one operation. However, this total can include
     * no more than one composite alarm. For example, you could delete 99 metric alarms and one composite alarms with
     * one operation, but you can't delete two composite alarms with one operation.
     * </p>
     * <p>
     * In the event of an error, no alarms are deleted.
     * </p>
     * <note>
     * <p>
     * It is possible to create a loop or cycle of composite alarms, where composite alarm A depends on composite alarm
     * B, and composite alarm B also depends on composite alarm A. In this scenario, you can't delete any composite
     * alarm that is part of the cycle because there is always still a composite alarm that depends on that alarm that
     * you want to delete.
     * </p>
     * <p>
     * To get out of such a situation, you must break the cycle by changing the rule of one of the composite alarms in
     * the cycle to remove a dependency that creates the cycle. The simplest change to make to break a cycle is to
     * change the <code>AlarmRule</code> of one of the alarms to <code>False</code>.
     * </p>
     * <p>
     * Additionally, the evaluation of composite alarms stops if CloudWatch detects a cycle in the evaluation path.
     * </p>
     * </note>
     * 
     * @param deleteAlarmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlarms operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DeleteAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlarmsResult> deleteAlarmsAsync(DeleteAlarmsRequest deleteAlarmsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlarmsRequest, DeleteAlarmsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified anomaly detection model from your account.
     * </p>
     * 
     * @param deleteAnomalyDetectorRequest
     * @return A Java Future containing the result of the DeleteAnomalyDetector operation returned by the service.
     * @sample AmazonCloudWatchAsync.DeleteAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnomalyDetectorResult> deleteAnomalyDetectorAsync(DeleteAnomalyDetectorRequest deleteAnomalyDetectorRequest);

    /**
     * <p>
     * Deletes the specified anomaly detection model from your account.
     * </p>
     * 
     * @param deleteAnomalyDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnomalyDetector operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DeleteAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnomalyDetectorResult> deleteAnomalyDetectorAsync(DeleteAnomalyDetectorRequest deleteAnomalyDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnomalyDetectorRequest, DeleteAnomalyDetectorResult> asyncHandler);

    /**
     * <p>
     * Deletes all dashboards that you specify. You can specify up to 100 dashboards to delete. If there is an error
     * during this call, no dashboards are deleted.
     * </p>
     * 
     * @param deleteDashboardsRequest
     * @return A Java Future containing the result of the DeleteDashboards operation returned by the service.
     * @sample AmazonCloudWatchAsync.DeleteDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteDashboards" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDashboardsResult> deleteDashboardsAsync(DeleteDashboardsRequest deleteDashboardsRequest);

    /**
     * <p>
     * Deletes all dashboards that you specify. You can specify up to 100 dashboards to delete. If there is an error
     * during this call, no dashboards are deleted.
     * </p>
     * 
     * @param deleteDashboardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDashboards operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DeleteDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteDashboards" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDashboardsResult> deleteDashboardsAsync(DeleteDashboardsRequest deleteDashboardsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDashboardsRequest, DeleteDashboardsResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes the specified Contributor Insights rules.
     * </p>
     * <p>
     * If you create a rule, delete it, and then re-create it with the same name, historical data from the first time
     * the rule was created might not be available.
     * </p>
     * 
     * @param deleteInsightRulesRequest
     * @return A Java Future containing the result of the DeleteInsightRules operation returned by the service.
     * @sample AmazonCloudWatchAsync.DeleteInsightRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteInsightRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInsightRulesResult> deleteInsightRulesAsync(DeleteInsightRulesRequest deleteInsightRulesRequest);

    /**
     * <p>
     * Permanently deletes the specified Contributor Insights rules.
     * </p>
     * <p>
     * If you create a rule, delete it, and then re-create it with the same name, historical data from the first time
     * the rule was created might not be available.
     * </p>
     * 
     * @param deleteInsightRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInsightRules operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DeleteInsightRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteInsightRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInsightRulesResult> deleteInsightRulesAsync(DeleteInsightRulesRequest deleteInsightRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInsightRulesRequest, DeleteInsightRulesResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes the metric stream that you specify.
     * </p>
     * 
     * @param deleteMetricStreamRequest
     * @return A Java Future containing the result of the DeleteMetricStream operation returned by the service.
     * @sample AmazonCloudWatchAsync.DeleteMetricStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteMetricStream" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMetricStreamResult> deleteMetricStreamAsync(DeleteMetricStreamRequest deleteMetricStreamRequest);

    /**
     * <p>
     * Permanently deletes the metric stream that you specify.
     * </p>
     * 
     * @param deleteMetricStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMetricStream operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DeleteMetricStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteMetricStream" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMetricStreamResult> deleteMetricStreamAsync(DeleteMetricStreamRequest deleteMetricStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMetricStreamRequest, DeleteMetricStreamResult> asyncHandler);

    /**
     * <p>
     * Retrieves the history for the specified alarm. You can filter the results by date range or item type. If an alarm
     * name is not specified, the histories for either all metric alarms or all composite alarms are returned.
     * </p>
     * <p>
     * CloudWatch retains the history of an alarm even if you delete the alarm.
     * </p>
     * 
     * @param describeAlarmHistoryRequest
     * @return A Java Future containing the result of the DescribeAlarmHistory operation returned by the service.
     * @sample AmazonCloudWatchAsync.DescribeAlarmHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarmHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(DescribeAlarmHistoryRequest describeAlarmHistoryRequest);

    /**
     * <p>
     * Retrieves the history for the specified alarm. You can filter the results by date range or item type. If an alarm
     * name is not specified, the histories for either all metric alarms or all composite alarms are returned.
     * </p>
     * <p>
     * CloudWatch retains the history of an alarm even if you delete the alarm.
     * </p>
     * 
     * @param describeAlarmHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlarmHistory operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DescribeAlarmHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarmHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(DescribeAlarmHistoryRequest describeAlarmHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest)
     */
    java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync();

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation with an AsyncHandler.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified alarms. You can filter the results by specifying a prefix for the alarm name, the alarm
     * state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @return A Java Future containing the result of the DescribeAlarms operation returned by the service.
     * @sample AmazonCloudWatchAsync.DescribeAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(DescribeAlarmsRequest describeAlarmsRequest);

    /**
     * <p>
     * Retrieves the specified alarms. You can filter the results by specifying a prefix for the alarm name, the alarm
     * state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlarms operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DescribeAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(DescribeAlarmsRequest describeAlarmsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAlarms operation.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest)
     */
    java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync();

    /**
     * Simplified method form for invoking the DescribeAlarms operation with an AsyncHandler.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the alarms for the specified metric. To filter the results, specify a statistic, period, or unit.
     * </p>
     * <p>
     * This operation retrieves only standard alarms that are based on the specified metric. It does not return alarms
     * based on math expressions that use the specified metric, or composite alarms that use the specified metric.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @return A Java Future containing the result of the DescribeAlarmsForMetric operation returned by the service.
     * @sample AmazonCloudWatchAsync.DescribeAlarmsForMetric
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarmsForMetric"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest);

    /**
     * <p>
     * Retrieves the alarms for the specified metric. To filter the results, specify a statistic, period, or unit.
     * </p>
     * <p>
     * This operation retrieves only standard alarms that are based on the specified metric. It does not return alarms
     * based on math expressions that use the specified metric, or composite alarms that use the specified metric.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlarmsForMetric operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DescribeAlarmsForMetric
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarmsForMetric"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsForMetricRequest, DescribeAlarmsForMetricResult> asyncHandler);

    /**
     * <p>
     * Lists the anomaly detection models that you have created in your account. You can list all models in your account
     * or filter the results to only the models that are related to a certain namespace, metric name, or metric
     * dimension.
     * </p>
     * 
     * @param describeAnomalyDetectorsRequest
     * @return A Java Future containing the result of the DescribeAnomalyDetectors operation returned by the service.
     * @sample AmazonCloudWatchAsync.DescribeAnomalyDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAnomalyDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyDetectorsResult> describeAnomalyDetectorsAsync(DescribeAnomalyDetectorsRequest describeAnomalyDetectorsRequest);

    /**
     * <p>
     * Lists the anomaly detection models that you have created in your account. You can list all models in your account
     * or filter the results to only the models that are related to a certain namespace, metric name, or metric
     * dimension.
     * </p>
     * 
     * @param describeAnomalyDetectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnomalyDetectors operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DescribeAnomalyDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAnomalyDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyDetectorsResult> describeAnomalyDetectorsAsync(DescribeAnomalyDetectorsRequest describeAnomalyDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnomalyDetectorsRequest, DescribeAnomalyDetectorsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the Contributor Insights rules in your account.
     * </p>
     * <p>
     * For more information about Contributor Insights, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights.html">Using Contributor
     * Insights to Analyze High-Cardinality Data</a>.
     * </p>
     * 
     * @param describeInsightRulesRequest
     * @return A Java Future containing the result of the DescribeInsightRules operation returned by the service.
     * @sample AmazonCloudWatchAsync.DescribeInsightRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeInsightRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInsightRulesResult> describeInsightRulesAsync(DescribeInsightRulesRequest describeInsightRulesRequest);

    /**
     * <p>
     * Returns a list of all the Contributor Insights rules in your account.
     * </p>
     * <p>
     * For more information about Contributor Insights, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights.html">Using Contributor
     * Insights to Analyze High-Cardinality Data</a>.
     * </p>
     * 
     * @param describeInsightRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInsightRules operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DescribeInsightRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeInsightRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInsightRulesResult> describeInsightRulesAsync(DescribeInsightRulesRequest describeInsightRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInsightRulesRequest, DescribeInsightRulesResult> asyncHandler);

    /**
     * <p>
     * Disables the actions for the specified alarms. When an alarm's actions are disabled, the alarm actions do not
     * execute when the alarm state changes.
     * </p>
     * 
     * @param disableAlarmActionsRequest
     * @return A Java Future containing the result of the DisableAlarmActions operation returned by the service.
     * @sample AmazonCloudWatchAsync.DisableAlarmActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DisableAlarmActions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableAlarmActionsResult> disableAlarmActionsAsync(DisableAlarmActionsRequest disableAlarmActionsRequest);

    /**
     * <p>
     * Disables the actions for the specified alarms. When an alarm's actions are disabled, the alarm actions do not
     * execute when the alarm state changes.
     * </p>
     * 
     * @param disableAlarmActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableAlarmActions operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DisableAlarmActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DisableAlarmActions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableAlarmActionsResult> disableAlarmActionsAsync(DisableAlarmActionsRequest disableAlarmActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DisableAlarmActionsRequest, DisableAlarmActionsResult> asyncHandler);

    /**
     * <p>
     * Disables the specified Contributor Insights rules. When rules are disabled, they do not analyze log groups and do
     * not incur costs.
     * </p>
     * 
     * @param disableInsightRulesRequest
     * @return A Java Future containing the result of the DisableInsightRules operation returned by the service.
     * @sample AmazonCloudWatchAsync.DisableInsightRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DisableInsightRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableInsightRulesResult> disableInsightRulesAsync(DisableInsightRulesRequest disableInsightRulesRequest);

    /**
     * <p>
     * Disables the specified Contributor Insights rules. When rules are disabled, they do not analyze log groups and do
     * not incur costs.
     * </p>
     * 
     * @param disableInsightRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableInsightRules operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DisableInsightRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DisableInsightRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableInsightRulesResult> disableInsightRulesAsync(DisableInsightRulesRequest disableInsightRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DisableInsightRulesRequest, DisableInsightRulesResult> asyncHandler);

    /**
     * <p>
     * Enables the actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @return A Java Future containing the result of the EnableAlarmActions operation returned by the service.
     * @sample AmazonCloudWatchAsync.EnableAlarmActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/EnableAlarmActions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableAlarmActionsResult> enableAlarmActionsAsync(EnableAlarmActionsRequest enableAlarmActionsRequest);

    /**
     * <p>
     * Enables the actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableAlarmActions operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.EnableAlarmActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/EnableAlarmActions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableAlarmActionsResult> enableAlarmActionsAsync(EnableAlarmActionsRequest enableAlarmActionsRequest,
            com.amazonaws.handlers.AsyncHandler<EnableAlarmActionsRequest, EnableAlarmActionsResult> asyncHandler);

    /**
     * <p>
     * Enables the specified Contributor Insights rules. When rules are enabled, they immediately begin analyzing log
     * data.
     * </p>
     * 
     * @param enableInsightRulesRequest
     * @return A Java Future containing the result of the EnableInsightRules operation returned by the service.
     * @sample AmazonCloudWatchAsync.EnableInsightRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/EnableInsightRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableInsightRulesResult> enableInsightRulesAsync(EnableInsightRulesRequest enableInsightRulesRequest);

    /**
     * <p>
     * Enables the specified Contributor Insights rules. When rules are enabled, they immediately begin analyzing log
     * data.
     * </p>
     * 
     * @param enableInsightRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableInsightRules operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.EnableInsightRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/EnableInsightRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableInsightRulesResult> enableInsightRulesAsync(EnableInsightRulesRequest enableInsightRulesRequest,
            com.amazonaws.handlers.AsyncHandler<EnableInsightRulesRequest, EnableInsightRulesResult> asyncHandler);

    /**
     * <p>
     * Displays the details of the dashboard that you specify.
     * </p>
     * <p>
     * To copy an existing dashboard, use <code>GetDashboard</code>, and then use the data returned within
     * <code>DashboardBody</code> as the template for the new dashboard when you call <code>PutDashboard</code> to
     * create the copy.
     * </p>
     * 
     * @param getDashboardRequest
     * @return A Java Future containing the result of the GetDashboard operation returned by the service.
     * @sample AmazonCloudWatchAsync.GetDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDashboardResult> getDashboardAsync(GetDashboardRequest getDashboardRequest);

    /**
     * <p>
     * Displays the details of the dashboard that you specify.
     * </p>
     * <p>
     * To copy an existing dashboard, use <code>GetDashboard</code>, and then use the data returned within
     * <code>DashboardBody</code> as the template for the new dashboard when you call <code>PutDashboard</code> to
     * create the copy.
     * </p>
     * 
     * @param getDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDashboard operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.GetDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDashboardResult> getDashboardAsync(GetDashboardRequest getDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<GetDashboardRequest, GetDashboardResult> asyncHandler);

    /**
     * <p>
     * This operation returns the time series data collected by a Contributor Insights rule. The data includes the
     * identity and number of contributors to the log group.
     * </p>
     * <p>
     * You can also optionally return one or more statistics about each data point in the time series. These statistics
     * can include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of the
     * contributor might change for each data point in the graph.
     * </p>
     * <p>
     * If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     * occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     * highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> -- the number of data points matched by the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimum</code> -- the minimum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> -- the maximum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> -- the average value from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getInsightRuleReportRequest
     * @return A Java Future containing the result of the GetInsightRuleReport operation returned by the service.
     * @sample AmazonCloudWatchAsync.GetInsightRuleReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetInsightRuleReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightRuleReportResult> getInsightRuleReportAsync(GetInsightRuleReportRequest getInsightRuleReportRequest);

    /**
     * <p>
     * This operation returns the time series data collected by a Contributor Insights rule. The data includes the
     * identity and number of contributors to the log group.
     * </p>
     * <p>
     * You can also optionally return one or more statistics about each data point in the time series. These statistics
     * can include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of the
     * contributor might change for each data point in the graph.
     * </p>
     * <p>
     * If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     * occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     * highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> -- the number of data points matched by the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimum</code> -- the minimum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> -- the maximum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> -- the average value from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getInsightRuleReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightRuleReport operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.GetInsightRuleReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetInsightRuleReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightRuleReportResult> getInsightRuleReportAsync(GetInsightRuleReportRequest getInsightRuleReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightRuleReportRequest, GetInsightRuleReportResult> asyncHandler);

    /**
     * <p>
     * You can use the <code>GetMetricData</code> API to retrieve as many as 500 different metrics in a single request,
     * with a total of as many as 100,800 data points. You can also optionally perform math expressions on the values of
     * the returned statistics, to create new time series that represent new insights into your data. For example, using
     * Lambda metrics, you could divide the Errors metric by the Invocations metric to get an error rate time series.
     * For more information about metric math expressions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Calls to the <code>GetMetricData</code> API have a different pricing structure than calls to
     * <code>GetMetricStatistics</code>. For more information about pricing, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * Amazon CloudWatch retains metric data as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data points with a period of less than 60 seconds are available for 3 hours. These data points are
     * high-resolution metrics and are available only for custom metrics that have been defined with a
     * <code>StorageResolution</code> of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 60 seconds (1-minute) are available for 15 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 300 seconds (5-minute) are available for 63 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Data points that are initially published with a shorter period are aggregated together for long-term storage. For
     * example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute
     * resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution
     * of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
     * </p>
     * <p>
     * If you omit <code>Unit</code> in your request, all data that was collected with any unit is returned, along with
     * the corresponding units that were specified when the data was reported to CloudWatch. If you specify a unit, the
     * operation returns only data that was collected with that unit specified. If you specify a unit that does not
     * match the data collected, the results of the operation are null. CloudWatch does not perform unit conversions.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return A Java Future containing the result of the GetMetricData operation returned by the service.
     * @sample AmazonCloudWatchAsync.GetMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest);

    /**
     * <p>
     * You can use the <code>GetMetricData</code> API to retrieve as many as 500 different metrics in a single request,
     * with a total of as many as 100,800 data points. You can also optionally perform math expressions on the values of
     * the returned statistics, to create new time series that represent new insights into your data. For example, using
     * Lambda metrics, you could divide the Errors metric by the Invocations metric to get an error rate time series.
     * For more information about metric math expressions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Calls to the <code>GetMetricData</code> API have a different pricing structure than calls to
     * <code>GetMetricStatistics</code>. For more information about pricing, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * Amazon CloudWatch retains metric data as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data points with a period of less than 60 seconds are available for 3 hours. These data points are
     * high-resolution metrics and are available only for custom metrics that have been defined with a
     * <code>StorageResolution</code> of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 60 seconds (1-minute) are available for 15 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 300 seconds (5-minute) are available for 63 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Data points that are initially published with a shorter period are aggregated together for long-term storage. For
     * example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute
     * resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution
     * of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
     * </p>
     * <p>
     * If you omit <code>Unit</code> in your request, all data that was collected with any unit is returned, along with
     * the corresponding units that were specified when the data was reported to CloudWatch. If you specify a unit, the
     * operation returns only data that was collected with that unit specified. If you specify a unit that does not
     * match the data collected, the results of the operation are null. CloudWatch does not perform unit conversions.
     * </p>
     * 
     * @param getMetricDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMetricData operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.GetMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler);

    /**
     * <p>
     * Gets statistics for the specified metric.
     * </p>
     * <p>
     * The maximum number of data points returned from a single call is 1,440. If you request more than 1,440 data
     * points, CloudWatch returns an error. To reduce the number of data points, you can narrow the specified time range
     * and make multiple requests across adjacent time ranges, or you can increase the specified period. Data points are
     * not returned in chronological order.
     * </p>
     * <p>
     * CloudWatch aggregates data points based on the length of the period that you specify. For example, if you request
     * statistics with a one-hour period, CloudWatch aggregates all data points with time stamps that fall within each
     * one-hour period. Therefore, the number of values aggregated by CloudWatch is larger than the number of data
     * points returned.
     * </p>
     * <p>
     * CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set
     * instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The SampleCount value of the statistic set is 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Min and the Max values of the statistic set are equal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Percentile statistics are not available for metrics when any of the metric values are negative numbers.
     * </p>
     * <p>
     * Amazon CloudWatch retains metric data as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data points with a period of less than 60 seconds are available for 3 hours. These data points are
     * high-resolution metrics and are available only for custom metrics that have been defined with a
     * <code>StorageResolution</code> of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 60 seconds (1-minute) are available for 15 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 300 seconds (5-minute) are available for 63 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Data points that are initially published with a shorter period are aggregated together for long-term storage. For
     * example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute
     * resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution
     * of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
     * </p>
     * <p>
     * CloudWatch started retaining 5-minute and 1-hour metric data as of July 9, 2016.
     * </p>
     * <p>
     * For information about metrics and dimensions supported by AWS services, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CW_Support_For_AWS.html">Amazon CloudWatch
     * Metrics and Dimensions Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param getMetricStatisticsRequest
     * @return A Java Future containing the result of the GetMetricStatistics operation returned by the service.
     * @sample AmazonCloudWatchAsync.GetMetricStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest getMetricStatisticsRequest);

    /**
     * <p>
     * Gets statistics for the specified metric.
     * </p>
     * <p>
     * The maximum number of data points returned from a single call is 1,440. If you request more than 1,440 data
     * points, CloudWatch returns an error. To reduce the number of data points, you can narrow the specified time range
     * and make multiple requests across adjacent time ranges, or you can increase the specified period. Data points are
     * not returned in chronological order.
     * </p>
     * <p>
     * CloudWatch aggregates data points based on the length of the period that you specify. For example, if you request
     * statistics with a one-hour period, CloudWatch aggregates all data points with time stamps that fall within each
     * one-hour period. Therefore, the number of values aggregated by CloudWatch is larger than the number of data
     * points returned.
     * </p>
     * <p>
     * CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set
     * instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The SampleCount value of the statistic set is 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Min and the Max values of the statistic set are equal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Percentile statistics are not available for metrics when any of the metric values are negative numbers.
     * </p>
     * <p>
     * Amazon CloudWatch retains metric data as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data points with a period of less than 60 seconds are available for 3 hours. These data points are
     * high-resolution metrics and are available only for custom metrics that have been defined with a
     * <code>StorageResolution</code> of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 60 seconds (1-minute) are available for 15 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 300 seconds (5-minute) are available for 63 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Data points that are initially published with a shorter period are aggregated together for long-term storage. For
     * example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute
     * resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution
     * of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
     * </p>
     * <p>
     * CloudWatch started retaining 5-minute and 1-hour metric data as of July 9, 2016.
     * </p>
     * <p>
     * For information about metrics and dimensions supported by AWS services, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CW_Support_For_AWS.html">Amazon CloudWatch
     * Metrics and Dimensions Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param getMetricStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMetricStatistics operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.GetMetricStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest getMetricStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMetricStatisticsRequest, GetMetricStatisticsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the metric stream that you specify.
     * </p>
     * 
     * @param getMetricStreamRequest
     * @return A Java Future containing the result of the GetMetricStream operation returned by the service.
     * @sample AmazonCloudWatchAsync.GetMetricStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMetricStreamResult> getMetricStreamAsync(GetMetricStreamRequest getMetricStreamRequest);

    /**
     * <p>
     * Returns information about the metric stream that you specify.
     * </p>
     * 
     * @param getMetricStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMetricStream operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.GetMetricStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMetricStreamResult> getMetricStreamAsync(GetMetricStreamRequest getMetricStreamRequest,
            com.amazonaws.handlers.AsyncHandler<GetMetricStreamRequest, GetMetricStreamResult> asyncHandler);

    /**
     * <p>
     * You can use the <code>GetMetricWidgetImage</code> API to retrieve a snapshot graph of one or more Amazon
     * CloudWatch metrics as a bitmap image. You can then embed this image into your services and products, such as wiki
     * pages, reports, and documents. You could also retrieve images regularly, such as every minute, and create your
     * own custom live dashboard.
     * </p>
     * <p>
     * The graph you retrieve can include all CloudWatch metric graph features, including metric math and horizontal and
     * vertical annotations.
     * </p>
     * <p>
     * There is a limit of 20 transactions per second for this API. Each <code>GetMetricWidgetImage</code> action has
     * the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * As many as 100 metrics in the graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * Up to 100 KB uncompressed payload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMetricWidgetImageRequest
     * @return A Java Future containing the result of the GetMetricWidgetImage operation returned by the service.
     * @sample AmazonCloudWatchAsync.GetMetricWidgetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricWidgetImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMetricWidgetImageResult> getMetricWidgetImageAsync(GetMetricWidgetImageRequest getMetricWidgetImageRequest);

    /**
     * <p>
     * You can use the <code>GetMetricWidgetImage</code> API to retrieve a snapshot graph of one or more Amazon
     * CloudWatch metrics as a bitmap image. You can then embed this image into your services and products, such as wiki
     * pages, reports, and documents. You could also retrieve images regularly, such as every minute, and create your
     * own custom live dashboard.
     * </p>
     * <p>
     * The graph you retrieve can include all CloudWatch metric graph features, including metric math and horizontal and
     * vertical annotations.
     * </p>
     * <p>
     * There is a limit of 20 transactions per second for this API. Each <code>GetMetricWidgetImage</code> action has
     * the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * As many as 100 metrics in the graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * Up to 100 KB uncompressed payload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMetricWidgetImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMetricWidgetImage operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.GetMetricWidgetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricWidgetImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMetricWidgetImageResult> getMetricWidgetImageAsync(GetMetricWidgetImageRequest getMetricWidgetImageRequest,
            com.amazonaws.handlers.AsyncHandler<GetMetricWidgetImageRequest, GetMetricWidgetImageResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the dashboards for your account. If you include <code>DashboardNamePrefix</code>, only those
     * dashboards with names starting with the prefix are listed. Otherwise, all dashboards in your account are listed.
     * </p>
     * <p>
     * <code>ListDashboards</code> returns up to 1000 results on one page. If there are more than 1000 dashboards, you
     * can call <code>ListDashboards</code> again and include the value you received for <code>NextToken</code> in the
     * first call, to receive the next 1000 results.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return A Java Future containing the result of the ListDashboards operation returned by the service.
     * @sample AmazonCloudWatchAsync.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest listDashboardsRequest);

    /**
     * <p>
     * Returns a list of the dashboards for your account. If you include <code>DashboardNamePrefix</code>, only those
     * dashboards with names starting with the prefix are listed. Otherwise, all dashboards in your account are listed.
     * </p>
     * <p>
     * <code>ListDashboards</code> returns up to 1000 results on one page. If there are more than 1000 dashboards, you
     * can call <code>ListDashboards</code> again and include the value you received for <code>NextToken</code> in the
     * first call, to receive the next 1000 results.
     * </p>
     * 
     * @param listDashboardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDashboards operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest listDashboardsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDashboardsRequest, ListDashboardsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of metric streams in this account.
     * </p>
     * 
     * @param listMetricStreamsRequest
     * @return A Java Future containing the result of the ListMetricStreams operation returned by the service.
     * @sample AmazonCloudWatchAsync.ListMetricStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListMetricStreams" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMetricStreamsResult> listMetricStreamsAsync(ListMetricStreamsRequest listMetricStreamsRequest);

    /**
     * <p>
     * Returns a list of metric streams in this account.
     * </p>
     * 
     * @param listMetricStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMetricStreams operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.ListMetricStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListMetricStreams" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMetricStreamsResult> listMetricStreamsAsync(ListMetricStreamsRequest listMetricStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMetricStreamsRequest, ListMetricStreamsResult> asyncHandler);

    /**
     * <p>
     * List the specified metrics. You can use the returned metrics with <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a> to obtain statistical data.
     * </p>
     * <p>
     * Up to 500 results are returned for any one call. To retrieve additional results, use the returned token with
     * subsequent calls.
     * </p>
     * <p>
     * After you create a metric, allow up to 15 minutes before the metric appears. You can see statistics about the
     * metric sooner by using <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a>.
     * </p>
     * <p>
     * <code>ListMetrics</code> doesn't return information about metrics if those metrics haven't reported data in the
     * past two weeks. To retrieve those metrics, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a>.
     * </p>
     * 
     * @param listMetricsRequest
     * @return A Java Future containing the result of the ListMetrics operation returned by the service.
     * @sample AmazonCloudWatchAsync.ListMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest listMetricsRequest);

    /**
     * <p>
     * List the specified metrics. You can use the returned metrics with <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a> to obtain statistical data.
     * </p>
     * <p>
     * Up to 500 results are returned for any one call. To retrieve additional results, use the returned token with
     * subsequent calls.
     * </p>
     * <p>
     * After you create a metric, allow up to 15 minutes before the metric appears. You can see statistics about the
     * metric sooner by using <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a>.
     * </p>
     * <p>
     * <code>ListMetrics</code> doesn't return information about metrics if those metrics haven't reported data in the
     * past two weeks. To retrieve those metrics, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a>.
     * </p>
     * 
     * @param listMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMetrics operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.ListMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest listMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListMetrics operation.
     *
     * @see #listMetricsAsync(ListMetricsRequest)
     */
    java.util.concurrent.Future<ListMetricsResult> listMetricsAsync();

    /**
     * Simplified method form for invoking the ListMetrics operation with an AsyncHandler.
     *
     * @see #listMetricsAsync(ListMetricsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with a CloudWatch resource. Currently, alarms and Contributor Insights rules support
     * tagging.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCloudWatchAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with a CloudWatch resource. Currently, alarms and Contributor Insights rules support
     * tagging.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates an anomaly detection model for a CloudWatch metric. You can use the model to display a band of expected
     * normal values when the metric is graphed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Anomaly_Detection.html"
     * >CloudWatch Anomaly Detection</a>.
     * </p>
     * 
     * @param putAnomalyDetectorRequest
     * @return A Java Future containing the result of the PutAnomalyDetector operation returned by the service.
     * @sample AmazonCloudWatchAsync.PutAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutAnomalyDetector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAnomalyDetectorResult> putAnomalyDetectorAsync(PutAnomalyDetectorRequest putAnomalyDetectorRequest);

    /**
     * <p>
     * Creates an anomaly detection model for a CloudWatch metric. You can use the model to display a band of expected
     * normal values when the metric is graphed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Anomaly_Detection.html"
     * >CloudWatch Anomaly Detection</a>.
     * </p>
     * 
     * @param putAnomalyDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAnomalyDetector operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.PutAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutAnomalyDetector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAnomalyDetectorResult> putAnomalyDetectorAsync(PutAnomalyDetectorRequest putAnomalyDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<PutAnomalyDetectorRequest, PutAnomalyDetectorResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a <i>composite alarm</i>. When you create a composite alarm, you specify a rule expression for
     * the alarm that takes into account the alarm states of other alarms that you have created. The composite alarm
     * goes into ALARM state only if all conditions of the rule are met.
     * </p>
     * <p>
     * The alarms specified in a composite alarm's rule expression can include metric alarms and other composite alarms.
     * </p>
     * <p>
     * Using composite alarms can reduce alarm noise. You can create multiple metric alarms, and also create a composite
     * alarm and set up alerts only for the composite alarm. For example, you could create a composite alarm that goes
     * into ALARM state only when more than one of the underlying metric alarms are in ALARM state.
     * </p>
     * <p>
     * Currently, the only alarm actions that can be taken by composite alarms are notifying SNS topics.
     * </p>
     * <note>
     * <p>
     * It is possible to create a loop or cycle of composite alarms, where composite alarm A depends on composite alarm
     * B, and composite alarm B also depends on composite alarm A. In this scenario, you can't delete any composite
     * alarm that is part of the cycle because there is always still a composite alarm that depends on that alarm that
     * you want to delete.
     * </p>
     * <p>
     * To get out of such a situation, you must break the cycle by changing the rule of one of the composite alarms in
     * the cycle to remove a dependency that creates the cycle. The simplest change to make to break a cycle is to
     * change the <code>AlarmRule</code> of one of the alarms to <code>False</code>.
     * </p>
     * <p>
     * Additionally, the evaluation of composite alarms stops if CloudWatch detects a cycle in the evaluation path.
     * </p>
     * </note>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code>. The
     * alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then
     * executed. For a composite alarm, this initial time after creation is the only time that the alarm can be in
     * <code>INSUFFICIENT_DATA</code> state.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous
     * configuration of the alarm.
     * </p>
     * <p>
     * If you are an IAM user, you must have <code>iam:CreateServiceLinkedRole</code> to create a composite alarm that
     * has Systems Manager OpsItem actions.
     * </p>
     * 
     * @param putCompositeAlarmRequest
     * @return A Java Future containing the result of the PutCompositeAlarm operation returned by the service.
     * @sample AmazonCloudWatchAsync.PutCompositeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutCompositeAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutCompositeAlarmResult> putCompositeAlarmAsync(PutCompositeAlarmRequest putCompositeAlarmRequest);

    /**
     * <p>
     * Creates or updates a <i>composite alarm</i>. When you create a composite alarm, you specify a rule expression for
     * the alarm that takes into account the alarm states of other alarms that you have created. The composite alarm
     * goes into ALARM state only if all conditions of the rule are met.
     * </p>
     * <p>
     * The alarms specified in a composite alarm's rule expression can include metric alarms and other composite alarms.
     * </p>
     * <p>
     * Using composite alarms can reduce alarm noise. You can create multiple metric alarms, and also create a composite
     * alarm and set up alerts only for the composite alarm. For example, you could create a composite alarm that goes
     * into ALARM state only when more than one of the underlying metric alarms are in ALARM state.
     * </p>
     * <p>
     * Currently, the only alarm actions that can be taken by composite alarms are notifying SNS topics.
     * </p>
     * <note>
     * <p>
     * It is possible to create a loop or cycle of composite alarms, where composite alarm A depends on composite alarm
     * B, and composite alarm B also depends on composite alarm A. In this scenario, you can't delete any composite
     * alarm that is part of the cycle because there is always still a composite alarm that depends on that alarm that
     * you want to delete.
     * </p>
     * <p>
     * To get out of such a situation, you must break the cycle by changing the rule of one of the composite alarms in
     * the cycle to remove a dependency that creates the cycle. The simplest change to make to break a cycle is to
     * change the <code>AlarmRule</code> of one of the alarms to <code>False</code>.
     * </p>
     * <p>
     * Additionally, the evaluation of composite alarms stops if CloudWatch detects a cycle in the evaluation path.
     * </p>
     * </note>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code>. The
     * alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then
     * executed. For a composite alarm, this initial time after creation is the only time that the alarm can be in
     * <code>INSUFFICIENT_DATA</code> state.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous
     * configuration of the alarm.
     * </p>
     * <p>
     * If you are an IAM user, you must have <code>iam:CreateServiceLinkedRole</code> to create a composite alarm that
     * has Systems Manager OpsItem actions.
     * </p>
     * 
     * @param putCompositeAlarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutCompositeAlarm operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.PutCompositeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutCompositeAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutCompositeAlarmResult> putCompositeAlarmAsync(PutCompositeAlarmRequest putCompositeAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<PutCompositeAlarmRequest, PutCompositeAlarmResult> asyncHandler);

    /**
     * <p>
     * Creates a dashboard if it does not already exist, or updates an existing dashboard. If you update a dashboard,
     * the entire contents are replaced with what you specify here.
     * </p>
     * <p>
     * All dashboards in your account are global, not region-specific.
     * </p>
     * <p>
     * A simple way to create a dashboard using <code>PutDashboard</code> is to copy an existing dashboard. To copy an
     * existing dashboard using the console, you can load the dashboard and then use the View/edit source command in the
     * Actions menu to display the JSON block for that dashboard. Another way to copy a dashboard is to use
     * <code>GetDashboard</code>, and then use the data returned within <code>DashboardBody</code> as the template for
     * the new dashboard when you call <code>PutDashboard</code>.
     * </p>
     * <p>
     * When you create a dashboard with <code>PutDashboard</code>, a good practice is to add a text widget at the top of
     * the dashboard with a message that the dashboard was created by script and should not be changed in the console.
     * This message could also point console users to the location of the <code>DashboardBody</code> script or the
     * CloudFormation template used to create the dashboard.
     * </p>
     * 
     * @param putDashboardRequest
     * @return A Java Future containing the result of the PutDashboard operation returned by the service.
     * @sample AmazonCloudWatchAsync.PutDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDashboardResult> putDashboardAsync(PutDashboardRequest putDashboardRequest);

    /**
     * <p>
     * Creates a dashboard if it does not already exist, or updates an existing dashboard. If you update a dashboard,
     * the entire contents are replaced with what you specify here.
     * </p>
     * <p>
     * All dashboards in your account are global, not region-specific.
     * </p>
     * <p>
     * A simple way to create a dashboard using <code>PutDashboard</code> is to copy an existing dashboard. To copy an
     * existing dashboard using the console, you can load the dashboard and then use the View/edit source command in the
     * Actions menu to display the JSON block for that dashboard. Another way to copy a dashboard is to use
     * <code>GetDashboard</code>, and then use the data returned within <code>DashboardBody</code> as the template for
     * the new dashboard when you call <code>PutDashboard</code>.
     * </p>
     * <p>
     * When you create a dashboard with <code>PutDashboard</code>, a good practice is to add a text widget at the top of
     * the dashboard with a message that the dashboard was created by script and should not be changed in the console.
     * This message could also point console users to the location of the <code>DashboardBody</code> script or the
     * CloudFormation template used to create the dashboard.
     * </p>
     * 
     * @param putDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDashboard operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.PutDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDashboardResult> putDashboardAsync(PutDashboardRequest putDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<PutDashboardRequest, PutDashboardResult> asyncHandler);

    /**
     * <p>
     * Creates a Contributor Insights rule. Rules evaluate log events in a CloudWatch Logs log group, enabling you to
     * find contributor data for the log events in that log group. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights.html">Using Contributor
     * Insights to Analyze High-Cardinality Data</a>.
     * </p>
     * <p>
     * If you create a rule, delete it, and then re-create it with the same name, historical data from the first time
     * the rule was created might not be available.
     * </p>
     * 
     * @param putInsightRuleRequest
     * @return A Java Future containing the result of the PutInsightRule operation returned by the service.
     * @sample AmazonCloudWatchAsync.PutInsightRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutInsightRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutInsightRuleResult> putInsightRuleAsync(PutInsightRuleRequest putInsightRuleRequest);

    /**
     * <p>
     * Creates a Contributor Insights rule. Rules evaluate log events in a CloudWatch Logs log group, enabling you to
     * find contributor data for the log events in that log group. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights.html">Using Contributor
     * Insights to Analyze High-Cardinality Data</a>.
     * </p>
     * <p>
     * If you create a rule, delete it, and then re-create it with the same name, historical data from the first time
     * the rule was created might not be available.
     * </p>
     * 
     * @param putInsightRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInsightRule operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.PutInsightRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutInsightRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutInsightRuleResult> putInsightRuleAsync(PutInsightRuleRequest putInsightRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutInsightRuleRequest, PutInsightRuleResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an alarm and associates it with the specified metric, metric math expression, or anomaly
     * detection model.
     * </p>
     * <p>
     * Alarms based on anomaly detection models cannot have Auto Scaling actions.
     * </p>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code>. The
     * alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then
     * executed.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous
     * configuration of the alarm.
     * </p>
     * <p>
     * If you are an IAM user, you must have Amazon EC2 permissions for some alarm operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>iam:CreateServiceLinkedRole</code> for all alarms with EC2 actions
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>iam:CreateServiceLinkedRole</code> to create an alarm with Systems Manager OpsItem actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The first time you create an alarm in the AWS Management Console, the CLI, or by using the PutMetricAlarm API,
     * CloudWatch creates the necessary service-linked role for you. The service-linked roles are called
     * <code>AWSServiceRoleForCloudWatchEvents</code> and <code>AWSServiceRoleForCloudWatchAlarms_ActionSSM</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role"
     * >AWS service-linked role</a>.
     * </p>
     * 
     * @param putMetricAlarmRequest
     * @return A Java Future containing the result of the PutMetricAlarm operation returned by the service.
     * @sample AmazonCloudWatchAsync.PutMetricAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetricAlarmResult> putMetricAlarmAsync(PutMetricAlarmRequest putMetricAlarmRequest);

    /**
     * <p>
     * Creates or updates an alarm and associates it with the specified metric, metric math expression, or anomaly
     * detection model.
     * </p>
     * <p>
     * Alarms based on anomaly detection models cannot have Auto Scaling actions.
     * </p>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code>. The
     * alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then
     * executed.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous
     * configuration of the alarm.
     * </p>
     * <p>
     * If you are an IAM user, you must have Amazon EC2 permissions for some alarm operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>iam:CreateServiceLinkedRole</code> for all alarms with EC2 actions
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>iam:CreateServiceLinkedRole</code> to create an alarm with Systems Manager OpsItem actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The first time you create an alarm in the AWS Management Console, the CLI, or by using the PutMetricAlarm API,
     * CloudWatch creates the necessary service-linked role for you. The service-linked roles are called
     * <code>AWSServiceRoleForCloudWatchEvents</code> and <code>AWSServiceRoleForCloudWatchAlarms_ActionSSM</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role"
     * >AWS service-linked role</a>.
     * </p>
     * 
     * @param putMetricAlarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMetricAlarm operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.PutMetricAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetricAlarmResult> putMetricAlarmAsync(PutMetricAlarmRequest putMetricAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetricAlarmRequest, PutMetricAlarmResult> asyncHandler);

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
     * metric. If the specified metric does not exist, CloudWatch creates the metric. When CloudWatch creates a metric,
     * it can take up to fifteen minutes for the metric to appear in calls to <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html">ListMetrics</a>.
     * </p>
     * <p>
     * You can publish either individual data points in the <code>Value</code> field, or arrays of values and the number
     * of times each value occurred during the period by using the <code>Values</code> and <code>Counts</code> fields in
     * the <code>MetricDatum</code> structure. Using the <code>Values</code> and <code>Counts</code> method enables you
     * to publish up to 150 values per metric with one <code>PutMetricData</code> request, and supports retrieving
     * percentile statistics on this data.
     * </p>
     * <p>
     * Each <code>PutMetricData</code> request is limited to 40 KB in size for HTTP POST requests. You can send a
     * payload compressed by gzip. Each request is also limited to no more than 20 different metrics.
     * </p>
     * <p>
     * Although the <code>Value</code> parameter accepts numbers of type <code>Double</code>, CloudWatch rejects values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360. In addition, special
     * values (for example, NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * <p>
     * You can use up to 10 dimensions per metric to further clarify what data the metric collects. Each dimension
     * consists of a Name and Value pair. For more information about specifying dimensions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * You specify the time stamp to be associated with each data point. You can specify time stamps that are as much as
     * two weeks before the current date, and as much as 2 hours after the current day and time.
     * </p>
     * <p>
     * Data points with time stamps from 24 hours ago or longer can take at least 48 hours to become available for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a> from the time they are submitted. Data points with time stamps between 3 and 24 hours ago
     * can take as much as 2 hours to become available for for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a>.
     * </p>
     * <p>
     * CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set
     * instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>SampleCount</code> value of the statistic set is 1 and <code>Min</code>, <code>Max</code>, and
     * <code>Sum</code> are all equal.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Min</code> and <code>Max</code> are equal, and <code>Sum</code> is equal to <code>Min</code> multiplied
     * by <code>SampleCount</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putMetricDataRequest
     * @return A Java Future containing the result of the PutMetricData operation returned by the service.
     * @sample AmazonCloudWatchAsync.PutMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetricDataResult> putMetricDataAsync(PutMetricDataRequest putMetricDataRequest);

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
     * metric. If the specified metric does not exist, CloudWatch creates the metric. When CloudWatch creates a metric,
     * it can take up to fifteen minutes for the metric to appear in calls to <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html">ListMetrics</a>.
     * </p>
     * <p>
     * You can publish either individual data points in the <code>Value</code> field, or arrays of values and the number
     * of times each value occurred during the period by using the <code>Values</code> and <code>Counts</code> fields in
     * the <code>MetricDatum</code> structure. Using the <code>Values</code> and <code>Counts</code> method enables you
     * to publish up to 150 values per metric with one <code>PutMetricData</code> request, and supports retrieving
     * percentile statistics on this data.
     * </p>
     * <p>
     * Each <code>PutMetricData</code> request is limited to 40 KB in size for HTTP POST requests. You can send a
     * payload compressed by gzip. Each request is also limited to no more than 20 different metrics.
     * </p>
     * <p>
     * Although the <code>Value</code> parameter accepts numbers of type <code>Double</code>, CloudWatch rejects values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360. In addition, special
     * values (for example, NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * <p>
     * You can use up to 10 dimensions per metric to further clarify what data the metric collects. Each dimension
     * consists of a Name and Value pair. For more information about specifying dimensions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * You specify the time stamp to be associated with each data point. You can specify time stamps that are as much as
     * two weeks before the current date, and as much as 2 hours after the current day and time.
     * </p>
     * <p>
     * Data points with time stamps from 24 hours ago or longer can take at least 48 hours to become available for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a> from the time they are submitted. Data points with time stamps between 3 and 24 hours ago
     * can take as much as 2 hours to become available for for <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html">GetMetricData</a>
     * or <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html">
     * GetMetricStatistics</a>.
     * </p>
     * <p>
     * CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set
     * instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>SampleCount</code> value of the statistic set is 1 and <code>Min</code>, <code>Max</code>, and
     * <code>Sum</code> are all equal.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Min</code> and <code>Max</code> are equal, and <code>Sum</code> is equal to <code>Min</code> multiplied
     * by <code>SampleCount</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putMetricDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMetricData operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.PutMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetricDataResult> putMetricDataAsync(PutMetricDataRequest putMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetricDataRequest, PutMetricDataResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a metric stream. Metric streams can automatically stream CloudWatch metrics to AWS
     * destinations including Amazon S3 and to many third-party solutions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Metric-Streams.html"> Using Metric
     * Streams</a>.
     * </p>
     * <p>
     * To create a metric stream, you must be logged on to an account that has the <code>iam:PassRole</code> permission
     * and either the <code>CloudWatchFullAccess</code> policy or the <code>cloudwatch:PutMetricStream</code>
     * permission.
     * </p>
     * <p>
     * When you create or update a metric stream, you choose one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Stream metrics from all metric namespaces in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream metrics from all metric namespaces in the account, except for the namespaces that you list in
     * <code>ExcludeFilters</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream metrics from only the metric namespaces that you list in <code>IncludeFilters</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use <code>PutMetricStream</code> to create a new metric stream, the stream is created in the
     * <code>running</code> state. If you use it to update an existing stream, the state of the stream is not changed.
     * </p>
     * 
     * @param putMetricStreamRequest
     * @return A Java Future containing the result of the PutMetricStream operation returned by the service.
     * @sample AmazonCloudWatchAsync.PutMetricStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetricStreamResult> putMetricStreamAsync(PutMetricStreamRequest putMetricStreamRequest);

    /**
     * <p>
     * Creates or updates a metric stream. Metric streams can automatically stream CloudWatch metrics to AWS
     * destinations including Amazon S3 and to many third-party solutions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Metric-Streams.html"> Using Metric
     * Streams</a>.
     * </p>
     * <p>
     * To create a metric stream, you must be logged on to an account that has the <code>iam:PassRole</code> permission
     * and either the <code>CloudWatchFullAccess</code> policy or the <code>cloudwatch:PutMetricStream</code>
     * permission.
     * </p>
     * <p>
     * When you create or update a metric stream, you choose one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Stream metrics from all metric namespaces in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream metrics from all metric namespaces in the account, except for the namespaces that you list in
     * <code>ExcludeFilters</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream metrics from only the metric namespaces that you list in <code>IncludeFilters</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use <code>PutMetricStream</code> to create a new metric stream, the stream is created in the
     * <code>running</code> state. If you use it to update an existing stream, the state of the stream is not changed.
     * </p>
     * 
     * @param putMetricStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMetricStream operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.PutMetricStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetricStreamResult> putMetricStreamAsync(PutMetricStreamRequest putMetricStreamRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetricStreamRequest, PutMetricStreamResult> asyncHandler);

    /**
     * <p>
     * Temporarily sets the state of an alarm for testing purposes. When the updated state differs from the previous
     * value, the action configured for the appropriate state is invoked. For example, if your alarm is configured to
     * send an Amazon SNS message when an alarm is triggered, temporarily changing the alarm state to <code>ALARM</code>
     * sends an SNS message.
     * </p>
     * <p>
     * Metric alarms returns to their actual state quickly, often within seconds. Because the metric alarm state change
     * happens quickly, it is typically only visible in the alarm's <b>History</b> tab in the Amazon CloudWatch console
     * or through <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarmHistory.html"
     * >DescribeAlarmHistory</a>.
     * </p>
     * <p>
     * If you use <code>SetAlarmState</code> on a composite alarm, the composite alarm is not guaranteed to return to
     * its actual state. It returns to its actual state only once any of its children alarms change state. It is also
     * reevaluated if you update its configuration.
     * </p>
     * <p>
     * If an alarm triggers EC2 Auto Scaling policies or application Auto Scaling policies, you must include information
     * in the <code>StateReasonData</code> parameter to enable the policy to take the correct action.
     * </p>
     * 
     * @param setAlarmStateRequest
     * @return A Java Future containing the result of the SetAlarmState operation returned by the service.
     * @sample AmazonCloudWatchAsync.SetAlarmState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/SetAlarmState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetAlarmStateResult> setAlarmStateAsync(SetAlarmStateRequest setAlarmStateRequest);

    /**
     * <p>
     * Temporarily sets the state of an alarm for testing purposes. When the updated state differs from the previous
     * value, the action configured for the appropriate state is invoked. For example, if your alarm is configured to
     * send an Amazon SNS message when an alarm is triggered, temporarily changing the alarm state to <code>ALARM</code>
     * sends an SNS message.
     * </p>
     * <p>
     * Metric alarms returns to their actual state quickly, often within seconds. Because the metric alarm state change
     * happens quickly, it is typically only visible in the alarm's <b>History</b> tab in the Amazon CloudWatch console
     * or through <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarmHistory.html"
     * >DescribeAlarmHistory</a>.
     * </p>
     * <p>
     * If you use <code>SetAlarmState</code> on a composite alarm, the composite alarm is not guaranteed to return to
     * its actual state. It returns to its actual state only once any of its children alarms change state. It is also
     * reevaluated if you update its configuration.
     * </p>
     * <p>
     * If an alarm triggers EC2 Auto Scaling policies or application Auto Scaling policies, you must include information
     * in the <code>StateReasonData</code> parameter to enable the policy to take the correct action.
     * </p>
     * 
     * @param setAlarmStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetAlarmState operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.SetAlarmState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/SetAlarmState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetAlarmStateResult> setAlarmStateAsync(SetAlarmStateRequest setAlarmStateRequest,
            com.amazonaws.handlers.AsyncHandler<SetAlarmStateRequest, SetAlarmStateResult> asyncHandler);

    /**
     * <p>
     * Starts the streaming of metrics for one or more of your metric streams.
     * </p>
     * 
     * @param startMetricStreamsRequest
     * @return A Java Future containing the result of the StartMetricStreams operation returned by the service.
     * @sample AmazonCloudWatchAsync.StartMetricStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/StartMetricStreams" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMetricStreamsResult> startMetricStreamsAsync(StartMetricStreamsRequest startMetricStreamsRequest);

    /**
     * <p>
     * Starts the streaming of metrics for one or more of your metric streams.
     * </p>
     * 
     * @param startMetricStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMetricStreams operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.StartMetricStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/StartMetricStreams" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMetricStreamsResult> startMetricStreamsAsync(StartMetricStreamsRequest startMetricStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<StartMetricStreamsRequest, StartMetricStreamsResult> asyncHandler);

    /**
     * <p>
     * Stops the streaming of metrics for one or more of your metric streams.
     * </p>
     * 
     * @param stopMetricStreamsRequest
     * @return A Java Future containing the result of the StopMetricStreams operation returned by the service.
     * @sample AmazonCloudWatchAsync.StopMetricStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/StopMetricStreams" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopMetricStreamsResult> stopMetricStreamsAsync(StopMetricStreamsRequest stopMetricStreamsRequest);

    /**
     * <p>
     * Stops the streaming of metrics for one or more of your metric streams.
     * </p>
     * 
     * @param stopMetricStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopMetricStreams operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.StopMetricStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/StopMetricStreams" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopMetricStreamsResult> stopMetricStreamsAsync(StopMetricStreamsRequest stopMetricStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<StopMetricStreamsRequest, StopMetricStreamsResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch resource. Currently, the only CloudWatch
     * resources that can be tagged are alarms and Contributor Insights rules.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with an alarm that already has tags. If you specify a new tag key
     * for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that
     * is already associated with the alarm, the new tag value that you specify replaces the previous value for that
     * tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a CloudWatch resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudWatchAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch resource. Currently, the only CloudWatch
     * resources that can be tagged are alarms and Contributor Insights rules.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with an alarm that already has tags. If you specify a new tag key
     * for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that
     * is already associated with the alarm, the new tag value that you specify replaces the previous value for that
     * tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a CloudWatch resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudWatchAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
