// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.frontdoor.fluent.models.LatencyScorecardInner;
import com.azure.resourcemanager.frontdoor.fluent.models.TimeseriesInner;
import com.azure.resourcemanager.frontdoor.models.LatencyScorecardAggregationInterval;
import com.azure.resourcemanager.frontdoor.models.TimeseriesAggregationInterval;
import com.azure.resourcemanager.frontdoor.models.TimeseriesType;
import java.time.OffsetDateTime;

/** An instance of this class provides access to all the operations defined in ReportsClient. */
public interface ReportsClient {
    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param aggregationInterval The aggregation interval of the Latency Scorecard.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Latency Scorecard for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LatencyScorecardInner getLatencyScorecards(
        String resourceGroupName,
        String profileName,
        String experimentName,
        LatencyScorecardAggregationInterval aggregationInterval);

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param aggregationInterval The aggregation interval of the Latency Scorecard.
     * @param endDateTimeUtc The end DateTime of the Latency Scorecard in UTC.
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Latency Scorecard for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LatencyScorecardInner> getLatencyScorecardsWithResponse(
        String resourceGroupName,
        String profileName,
        String experimentName,
        LatencyScorecardAggregationInterval aggregationInterval,
        String endDateTimeUtc,
        String country,
        Context context);

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param startDateTimeUtc The start DateTime of the Timeseries in UTC.
     * @param endDateTimeUtc The end DateTime of the Timeseries in UTC.
     * @param aggregationInterval The aggregation interval of the Timeseries.
     * @param timeseriesType The type of Timeseries.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Timeseries for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TimeseriesInner getTimeseries(
        String resourceGroupName,
        String profileName,
        String experimentName,
        OffsetDateTime startDateTimeUtc,
        OffsetDateTime endDateTimeUtc,
        TimeseriesAggregationInterval aggregationInterval,
        TimeseriesType timeseriesType);

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param startDateTimeUtc The start DateTime of the Timeseries in UTC.
     * @param endDateTimeUtc The end DateTime of the Timeseries in UTC.
     * @param aggregationInterval The aggregation interval of the Timeseries.
     * @param timeseriesType The type of Timeseries.
     * @param endpoint The specific endpoint.
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Timeseries for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TimeseriesInner> getTimeseriesWithResponse(
        String resourceGroupName,
        String profileName,
        String experimentName,
        OffsetDateTime startDateTimeUtc,
        OffsetDateTime endDateTimeUtc,
        TimeseriesAggregationInterval aggregationInterval,
        TimeseriesType timeseriesType,
        String endpoint,
        String country,
        Context context);
}