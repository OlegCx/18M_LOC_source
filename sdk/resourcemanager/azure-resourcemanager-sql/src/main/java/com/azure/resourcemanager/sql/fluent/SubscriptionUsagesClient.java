// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.SubscriptionUsageInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SubscriptionUsagesClient. */
public interface SubscriptionUsagesClient {
    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscription usage metrics in a given location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SubscriptionUsageInner> listByLocationAsync(String locationName);

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscription usage metrics in a given location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubscriptionUsageInner> listByLocation(String locationName);

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscription usage metrics in a given location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubscriptionUsageInner> listByLocation(String locationName, Context context);

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subscription usage metric.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SubscriptionUsageInner>> getWithResponseAsync(String locationName, String usageName);

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subscription usage metric.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SubscriptionUsageInner> getAsync(String locationName, String usageName);

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subscription usage metric.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubscriptionUsageInner get(String locationName, String usageName);

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subscription usage metric.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SubscriptionUsageInner> getWithResponse(String locationName, String usageName, Context context);
}