// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DigitalTwins. */
public interface DigitalTwins {
    /**
     * Get DigitalTwinsInstances resource.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return digitalTwinsInstances resource.
     */
    DigitalTwinsDescription getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Get DigitalTwinsInstances resource.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return digitalTwinsInstances resource.
     */
    Response<DigitalTwinsDescription> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Delete a DigitalTwinsInstance.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the DigitalTwins service.
     */
    DigitalTwinsDescription deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Delete a DigitalTwinsInstance.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the DigitalTwins service.
     */
    DigitalTwinsDescription delete(String resourceGroupName, String resourceName, Context context);

    /**
     * Get all the DigitalTwinsInstances in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DigitalTwinsInstances in a subscription.
     */
    PagedIterable<DigitalTwinsDescription> list();

    /**
     * Get all the DigitalTwinsInstances in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DigitalTwinsInstances in a subscription.
     */
    PagedIterable<DigitalTwinsDescription> list(Context context);

    /**
     * Get all the DigitalTwinsInstances in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DigitalTwinsInstances in a resource group.
     */
    PagedIterable<DigitalTwinsDescription> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the DigitalTwinsInstances in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DigitalTwinsInstances in a resource group.
     */
    PagedIterable<DigitalTwinsDescription> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Check if a DigitalTwinsInstance name is available.
     *
     * @param location Location of DigitalTwinsInstance.
     * @param digitalTwinsInstanceCheckName Set the name parameter in the DigitalTwinsInstanceCheckName structure to the
     *     name of the DigitalTwinsInstance to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    CheckNameResult checkNameAvailability(String location, CheckNameRequest digitalTwinsInstanceCheckName);

    /**
     * Check if a DigitalTwinsInstance name is available.
     *
     * @param location Location of DigitalTwinsInstance.
     * @param digitalTwinsInstanceCheckName Set the name parameter in the DigitalTwinsInstanceCheckName structure to the
     *     name of the DigitalTwinsInstance to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String location, CheckNameRequest digitalTwinsInstanceCheckName, Context context);

    /**
     * Get DigitalTwinsInstances resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return digitalTwinsInstances resource.
     */
    DigitalTwinsDescription getById(String id);

    /**
     * Get DigitalTwinsInstances resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return digitalTwinsInstances resource.
     */
    Response<DigitalTwinsDescription> getByIdWithResponse(String id, Context context);

    /**
     * Delete a DigitalTwinsInstance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the DigitalTwins service.
     */
    DigitalTwinsDescription deleteById(String id);

    /**
     * Delete a DigitalTwinsInstance.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the DigitalTwins service.
     */
    DigitalTwinsDescription deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DigitalTwinsDescription resource.
     *
     * @param name resource name.
     * @return the first stage of the new DigitalTwinsDescription definition.
     */
    DigitalTwinsDescription.DefinitionStages.Blank define(String name);
}