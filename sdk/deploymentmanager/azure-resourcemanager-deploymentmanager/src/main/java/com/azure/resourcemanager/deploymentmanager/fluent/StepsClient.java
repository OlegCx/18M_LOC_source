// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.StepResourceInner;
import java.util.List;

/** An instance of this class provides access to all the operations defined in StepsClient. */
public interface StepsClient {
    /**
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource representation of a rollout step.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StepResourceInner createOrUpdate(String resourceGroupName, String stepName);

    /**
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param stepInfo The step object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource representation of a rollout step.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StepResourceInner> createOrUpdateWithResponse(
        String resourceGroupName, String stepName, StepResourceInner stepInfo, Context context);

    /**
     * Gets the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the step.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StepResourceInner getByResourceGroup(String resourceGroupName, String stepName);

    /**
     * Gets the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the step.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StepResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String stepName, Context context);

    /**
     * Deletes the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String stepName);

    /**
     * Deletes the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String stepName, Context context);

    /**
     * Lists the steps in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of steps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<StepResourceInner> list(String resourceGroupName);

    /**
     * Lists the steps in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of steps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<StepResourceInner>> listWithResponse(String resourceGroupName, Context context);
}