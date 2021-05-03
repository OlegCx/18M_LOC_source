// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.fluent.models.EncryptionProtectorInner;
import com.azure.resourcemanager.sql.models.EncryptionProtectorName;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EncryptionProtectorsClient. */
public interface EncryptionProtectorsClient {
    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> revalidateWithResponseAsync(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginRevalidateAsync(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRevalidate(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRevalidate(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName, Context context);

    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> revalidateAsync(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revalidate(String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revalidate(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName, Context context);

    /**
     * Gets a list of server encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server encryption protectors.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<EncryptionProtectorInner> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Gets a list of server encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server encryption protectors.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EncryptionProtectorInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Gets a list of server encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server encryption protectors.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EncryptionProtectorInner> listByServer(String resourceGroupName, String serverName, Context context);

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<EncryptionProtectorInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<EncryptionProtectorInner> getAsync(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionProtectorInner get(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EncryptionProtectorInner> getWithResponse(
        String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName, Context context);

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters);

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<EncryptionProtectorInner>, EncryptionProtectorInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters);

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EncryptionProtectorInner>, EncryptionProtectorInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters);

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The server encryption protector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EncryptionProtectorInner>, EncryptionProtectorInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters,
        Context context);

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<EncryptionProtectorInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters);

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The server encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionProtectorInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters);

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The server encryption protector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionProtectorInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters,
        Context context);
}