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
import com.azure.resourcemanager.sql.fluent.models.ExtendedDatabaseBlobAuditingPolicyInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ExtendedDatabaseBlobAuditingPoliciesClient.
 */
public interface ExtendedDatabaseBlobAuditingPoliciesClient {
    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExtendedDatabaseBlobAuditingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExtendedDatabaseBlobAuditingPolicyInner> getAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExtendedDatabaseBlobAuditingPolicyInner get(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExtendedDatabaseBlobAuditingPolicyInner> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, Context context);

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExtendedDatabaseBlobAuditingPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters);

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExtendedDatabaseBlobAuditingPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters);

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExtendedDatabaseBlobAuditingPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters);

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExtendedDatabaseBlobAuditingPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters,
        Context context);

    /**
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ExtendedDatabaseBlobAuditingPolicyInner> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExtendedDatabaseBlobAuditingPolicyInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExtendedDatabaseBlobAuditingPolicyInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}