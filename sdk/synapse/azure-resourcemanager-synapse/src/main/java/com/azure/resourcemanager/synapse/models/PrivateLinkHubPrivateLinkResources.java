// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateLinkHubPrivateLinkResources. */
public interface PrivateLinkHubPrivateLinkResources {
    /**
     * Get all private link resources for a private link hub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName The name of the private link hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link resources for a private link hub.
     */
    PagedIterable<PrivateLinkResource> list(String resourceGroupName, String privateLinkHubName);

    /**
     * Get all private link resources for a private link hub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName The name of the private link hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link resources for a private link hub.
     */
    PagedIterable<PrivateLinkResource> list(String resourceGroupName, String privateLinkHubName, Context context);

    /**
     * Get private link resource in private link hub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName The name of the private link hub.
     * @param privateLinkResourceName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link resource in private link hub.
     */
    PrivateLinkResource get(String resourceGroupName, String privateLinkHubName, String privateLinkResourceName);

    /**
     * Get private link resource in private link hub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName The name of the private link hub.
     * @param privateLinkResourceName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link resource in private link hub.
     */
    Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String privateLinkHubName, String privateLinkResourceName, Context context);
}