// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Clusters. */
public interface Clusters {
    /**
     * Get a Service Fabric cluster resource created or in the process of being created in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group.
     */
    Cluster getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Get a Service Fabric cluster resource created or in the process of being created in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group.
     */
    Response<Cluster> getByResourceGroupWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Delete a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Delete a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets all Service Fabric cluster resources created or in the process of being created in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the resource group.
     */
    ClusterListResult listByResourceGroup(String resourceGroupName);

    /**
     * Gets all Service Fabric cluster resources created or in the process of being created in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the resource group.
     */
    Response<ClusterListResult> listByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Gets all Service Fabric cluster resources created or in the process of being created in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the subscription.
     */
    ClusterListResult list();

    /**
     * Gets all Service Fabric cluster resources created or in the process of being created in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the subscription.
     */
    Response<ClusterListResult> listWithResponse(Context context);

    /**
     * Get a Service Fabric cluster resource created or in the process of being created in the specified resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group.
     */
    Cluster getById(String id);

    /**
     * Get a Service Fabric cluster resource created or in the process of being created in the specified resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group.
     */
    Response<Cluster> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Service Fabric cluster resource with the specified name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Service Fabric cluster resource with the specified name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Cluster resource.
     *
     * @param name resource name.
     * @return the first stage of the new Cluster definition.
     */
    Cluster.DefinitionStages.Blank define(String name);
}