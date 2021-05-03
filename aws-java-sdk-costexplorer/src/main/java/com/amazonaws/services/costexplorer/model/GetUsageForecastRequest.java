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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetUsageForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsageForecastRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start and end dates of the period that you want to retrieve usage forecast for. The start date is inclusive,
     * but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code>
     * is <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>. The start date must be equal to or
     * later than the current date to avoid a validation error.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast.
     * </p>
     * <p>
     * Valid values for a <code>GetUsageForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USAGE_QUANTITY
     * </p>
     * </li>
     * <li>
     * <p>
     * NORMALIZED_USAGE_AMOUNT
     * </p>
     * </li>
     * </ul>
     */
    private String metric;
    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     */
    private String granularity;
    /**
     * <p>
     * The filters that you want to use to filter your forecast. The <code>GetUsageForecast</code> API supports
     * filtering by the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AZ</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PURCHASE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USAGE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USAGE_TYPE_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECORD_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TENANCY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCOPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLATFORM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBSCRIPTION_ID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGAL_ENTITY_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATABASE_ENGINE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BILLING_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESERVATION_ID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * </ul>
     */
    private Expression filter;
    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around
     * the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is
     * about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction
     * intervals.
     * </p>
     */
    private Integer predictionIntervalLevel;

    /**
     * <p>
     * The start and end dates of the period that you want to retrieve usage forecast for. The start date is inclusive,
     * but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code>
     * is <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>. The start date must be equal to or
     * later than the current date to avoid a validation error.
     * </p>
     * 
     * @param timePeriod
     *        The start and end dates of the period that you want to retrieve usage forecast for. The start date is
     *        inclusive, but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code>
     *        and <code>end</code> is <code>2017-05-01</code>, then the cost and usage data is retrieved from
     *        <code>2017-01-01</code> up to and including <code>2017-04-30</code> but not including
     *        <code>2017-05-01</code>. The start date must be equal to or later than the current date to avoid a
     *        validation error.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The start and end dates of the period that you want to retrieve usage forecast for. The start date is inclusive,
     * but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code>
     * is <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>. The start date must be equal to or
     * later than the current date to avoid a validation error.
     * </p>
     * 
     * @return The start and end dates of the period that you want to retrieve usage forecast for. The start date is
     *         inclusive, but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code>
     *         and <code>end</code> is <code>2017-05-01</code>, then the cost and usage data is retrieved from
     *         <code>2017-01-01</code> up to and including <code>2017-04-30</code> but not including
     *         <code>2017-05-01</code>. The start date must be equal to or later than the current date to avoid a
     *         validation error.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The start and end dates of the period that you want to retrieve usage forecast for. The start date is inclusive,
     * but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code>
     * is <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>. The start date must be equal to or
     * later than the current date to avoid a validation error.
     * </p>
     * 
     * @param timePeriod
     *        The start and end dates of the period that you want to retrieve usage forecast for. The start date is
     *        inclusive, but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code>
     *        and <code>end</code> is <code>2017-05-01</code>, then the cost and usage data is retrieved from
     *        <code>2017-01-01</code> up to and including <code>2017-04-30</code> but not including
     *        <code>2017-05-01</code>. The start date must be equal to or later than the current date to avoid a
     *        validation error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageForecastRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast.
     * </p>
     * <p>
     * Valid values for a <code>GetUsageForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USAGE_QUANTITY
     * </p>
     * </li>
     * <li>
     * <p>
     * NORMALIZED_USAGE_AMOUNT
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        Which metric Cost Explorer uses to create your forecast.</p>
     *        <p>
     *        Valid values for a <code>GetUsageForecast</code> call are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        USAGE_QUANTITY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NORMALIZED_USAGE_AMOUNT
     *        </p>
     *        </li>
     * @see Metric
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast.
     * </p>
     * <p>
     * Valid values for a <code>GetUsageForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USAGE_QUANTITY
     * </p>
     * </li>
     * <li>
     * <p>
     * NORMALIZED_USAGE_AMOUNT
     * </p>
     * </li>
     * </ul>
     * 
     * @return Which metric Cost Explorer uses to create your forecast.</p>
     *         <p>
     *         Valid values for a <code>GetUsageForecast</code> call are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         USAGE_QUANTITY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NORMALIZED_USAGE_AMOUNT
     *         </p>
     *         </li>
     * @see Metric
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast.
     * </p>
     * <p>
     * Valid values for a <code>GetUsageForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USAGE_QUANTITY
     * </p>
     * </li>
     * <li>
     * <p>
     * NORMALIZED_USAGE_AMOUNT
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        Which metric Cost Explorer uses to create your forecast.</p>
     *        <p>
     *        Valid values for a <code>GetUsageForecast</code> call are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        USAGE_QUANTITY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NORMALIZED_USAGE_AMOUNT
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Metric
     */

    public GetUsageForecastRequest withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast.
     * </p>
     * <p>
     * Valid values for a <code>GetUsageForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USAGE_QUANTITY
     * </p>
     * </li>
     * <li>
     * <p>
     * NORMALIZED_USAGE_AMOUNT
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        Which metric Cost Explorer uses to create your forecast.</p>
     *        <p>
     *        Valid values for a <code>GetUsageForecast</code> call are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        USAGE_QUANTITY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NORMALIZED_USAGE_AMOUNT
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Metric
     */

    public GetUsageForecastRequest withMetric(Metric metric) {
        this.metric = metric.toString();
        return this;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12
     *        months of <code>MONTHLY</code> forecasts.</p>
     *        <p>
     *        The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     *        granularities.
     * @see Granularity
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @return How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12
     *         months of <code>MONTHLY</code> forecasts.</p>
     *         <p>
     *         The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     *         granularities.
     * @see Granularity
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12
     *        months of <code>MONTHLY</code> forecasts.</p>
     *        <p>
     *        The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     *        granularities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetUsageForecastRequest withGranularity(String granularity) {
        setGranularity(granularity);
        return this;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12
     *        months of <code>MONTHLY</code> forecasts.</p>
     *        <p>
     *        The <code>GetUsageForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     *        granularities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetUsageForecastRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. The <code>GetUsageForecast</code> API supports
     * filtering by the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AZ</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PURCHASE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USAGE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USAGE_TYPE_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECORD_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TENANCY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCOPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLATFORM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBSCRIPTION_ID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGAL_ENTITY_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATABASE_ENGINE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BILLING_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESERVATION_ID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        The filters that you want to use to filter your forecast. The <code>GetUsageForecast</code> API supports
     *        filtering by the following dimensions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AZ</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_TYPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LINKED_ACCOUNT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LINKED_ACCOUNT_NAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPERATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PURCHASE_TYPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USAGE_TYPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USAGE_TYPE_GROUP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECORD_TYPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPERATING_SYSTEM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TENANCY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCOPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLATFORM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBSCRIPTION_ID</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LEGAL_ENTITY_NAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPLOYMENT_OPTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATABASE_ENGINE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_TYPE_FAMILY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BILLING_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESERVATION_ID</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_PLAN_ARN</code>
     *        </p>
     *        </li>
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. The <code>GetUsageForecast</code> API supports
     * filtering by the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AZ</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PURCHASE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USAGE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USAGE_TYPE_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECORD_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TENANCY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCOPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLATFORM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBSCRIPTION_ID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGAL_ENTITY_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATABASE_ENGINE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BILLING_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESERVATION_ID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters that you want to use to filter your forecast. The <code>GetUsageForecast</code> API supports
     *         filtering by the following dimensions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AZ</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTANCE_TYPE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LINKED_ACCOUNT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LINKED_ACCOUNT_NAME</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPERATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PURCHASE_TYPE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>USAGE_TYPE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>USAGE_TYPE_GROUP</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RECORD_TYPE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPERATING_SYSTEM</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TENANCY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SCOPE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLATFORM</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUBSCRIPTION_ID</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LEGAL_ENTITY_NAME</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPLOYMENT_OPTION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DATABASE_ENGINE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTANCE_TYPE_FAMILY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BILLING_ENTITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESERVATION_ID</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SAVINGS_PLAN_ARN</code>
     *         </p>
     *         </li>
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. The <code>GetUsageForecast</code> API supports
     * filtering by the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AZ</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PURCHASE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USAGE_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USAGE_TYPE_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECORD_TYPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TENANCY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCOPE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLATFORM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBSCRIPTION_ID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGAL_ENTITY_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATABASE_ENGINE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BILLING_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESERVATION_ID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        The filters that you want to use to filter your forecast. The <code>GetUsageForecast</code> API supports
     *        filtering by the following dimensions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AZ</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_TYPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LINKED_ACCOUNT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LINKED_ACCOUNT_NAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPERATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PURCHASE_TYPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USAGE_TYPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USAGE_TYPE_GROUP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECORD_TYPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPERATING_SYSTEM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TENANCY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCOPE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLATFORM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBSCRIPTION_ID</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LEGAL_ENTITY_NAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPLOYMENT_OPTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATABASE_ENGINE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_TYPE_FAMILY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BILLING_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESERVATION_ID</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_PLAN_ARN</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageForecastRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around
     * the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is
     * about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction
     * intervals.
     * </p>
     * 
     * @param predictionIntervalLevel
     *        Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval
     *        around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost
     *        Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in
     *        wider prediction intervals.
     */

    public void setPredictionIntervalLevel(Integer predictionIntervalLevel) {
        this.predictionIntervalLevel = predictionIntervalLevel;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around
     * the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is
     * about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction
     * intervals.
     * </p>
     * 
     * @return Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval
     *         around the mean by specifying a confidence level. The higher the confidence level, the more confident
     *         Cost Explorer is about the actual value falling in the prediction interval. Higher confidence levels
     *         result in wider prediction intervals.
     */

    public Integer getPredictionIntervalLevel() {
        return this.predictionIntervalLevel;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around
     * the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is
     * about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction
     * intervals.
     * </p>
     * 
     * @param predictionIntervalLevel
     *        Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval
     *        around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost
     *        Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in
     *        wider prediction intervals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageForecastRequest withPredictionIntervalLevel(Integer predictionIntervalLevel) {
        setPredictionIntervalLevel(predictionIntervalLevel);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getPredictionIntervalLevel() != null)
            sb.append("PredictionIntervalLevel: ").append(getPredictionIntervalLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageForecastRequest == false)
            return false;
        GetUsageForecastRequest other = (GetUsageForecastRequest) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getPredictionIntervalLevel() == null ^ this.getPredictionIntervalLevel() == null)
            return false;
        if (other.getPredictionIntervalLevel() != null && other.getPredictionIntervalLevel().equals(this.getPredictionIntervalLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getPredictionIntervalLevel() == null) ? 0 : getPredictionIntervalLevel().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageForecastRequest clone() {
        return (GetUsageForecastRequest) super.clone();
    }

}
