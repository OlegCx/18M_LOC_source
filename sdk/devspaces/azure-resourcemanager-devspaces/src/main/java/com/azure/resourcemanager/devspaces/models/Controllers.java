// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Controllers. */
public interface Controllers {
    /**
     * Gets the properties for an Azure Dev Spaces Controller.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param name Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for an Azure Dev Spaces Controller.
     */
    Controller getByResourceGroup(String resourceGroupName, String name);

    /**
     * Gets the properties for an Azure Dev Spaces Controller.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param name Name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for an Azure Dev Spaces Controller.
     */
    Response<Controller> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Deletes an existing Azure Dev Spaces Controller.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param name Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String name);

    /**
     * Deletes an existing Azure Dev Spaces Controller.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param name Name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String name, Context context);

    /**
     * Lists all the Azure Dev Spaces Controllers with their properties in the specified resource group and
     * subscription.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PagedIterable<Controller> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the Azure Dev Spaces Controllers with their properties in the specified resource group and
     * subscription.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PagedIterable<Controller> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the Azure Dev Spaces Controllers with their properties in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PagedIterable<Controller> list();

    /**
     * Lists all the Azure Dev Spaces Controllers with their properties in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PagedIterable<Controller> list(Context context);

    /**
     * Lists connection details for the underlying container resources of an Azure Dev Spaces Controller.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param name Name of the resource.
     * @param listConnectionDetailsParameters Parameters for listing connection details of Azure Dev Spaces Controller.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ControllerConnectionDetailsList listConnectionDetails(
        String resourceGroupName, String name, ListConnectionDetailsParameters listConnectionDetailsParameters);

    /**
     * Lists connection details for the underlying container resources of an Azure Dev Spaces Controller.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param name Name of the resource.
     * @param listConnectionDetailsParameters Parameters for listing connection details of Azure Dev Spaces Controller.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<ControllerConnectionDetailsList> listConnectionDetailsWithResponse(
        String resourceGroupName,
        String name,
        ListConnectionDetailsParameters listConnectionDetailsParameters,
        Context context);

    /**
     * Gets the properties for an Azure Dev Spaces Controller.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for an Azure Dev Spaces Controller.
     */
    Controller getById(String id);

    /**
     * Gets the properties for an Azure Dev Spaces Controller.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for an Azure Dev Spaces Controller.
     */
    Response<Controller> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Azure Dev Spaces Controller.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing Azure Dev Spaces Controller.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Controller resource.
     *
     * @param name resource name.
     * @return the first stage of the new Controller definition.
     */
    Controller.DefinitionStages.Blank define(String name);
}