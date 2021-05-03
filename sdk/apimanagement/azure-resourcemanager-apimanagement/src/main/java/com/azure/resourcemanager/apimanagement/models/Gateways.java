// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Gateways. */
public interface Gateways {
    /**
     * Lists a collection of gateways registered with service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Gateway list representation.
     */
    PagedIterable<GatewayContract> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of gateways registered with service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| region | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Gateway list representation.
     */
    PagedIterable<GatewayContract> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the entity state (Etag) version of the Gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(String resourceGroupName, String serviceName, String gatewayId);

    /**
     * Gets the entity state (Etag) version of the Gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the Gateway specified by its identifier.
     */
    GatewaysGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context);

    /**
     * Gets the details of the Gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Gateway specified by its identifier.
     */
    GatewayContract get(String resourceGroupName, String serviceName, String gatewayId);

    /**
     * Gets the details of the Gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Gateway specified by its identifier.
     */
    Response<GatewayContract> getWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context);

    /**
     * Deletes specific Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String gatewayId, String ifMatch);

    /**
     * Deletes specific Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String ifMatch, Context context);

    /**
     * Retrieves gateway keys.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gateway authentication keys.
     */
    GatewayKeysContract listKeys(String resourceGroupName, String serviceName, String gatewayId);

    /**
     * Retrieves gateway keys.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gateway authentication keys.
     */
    Response<GatewayKeysContract> listKeysWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context);

    /**
     * Regenerates specified gateway key invalidating any tokens created with it.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway key regeneration request contract properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateKey(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayKeyRegenerationRequestContract parameters);

    /**
     * Regenerates specified gateway key invalidating any tokens created with it.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway key regeneration request contract properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> regenerateKeyWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayKeyRegenerationRequestContract parameters,
        Context context);

    /**
     * Gets the Shared Access Authorization Token for the gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway token request contract properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the gateway.
     */
    GatewayTokenContract generateToken(
        String resourceGroupName, String serviceName, String gatewayId, GatewayTokenRequestContract parameters);

    /**
     * Gets the Shared Access Authorization Token for the gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway token request contract properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the gateway.
     */
    Response<GatewayTokenContract> generateTokenWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayTokenRequestContract parameters,
        Context context);

    /**
     * Gets the details of the Gateway specified by its identifier.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Gateway specified by its identifier.
     */
    GatewayContract getById(String id);

    /**
     * Gets the details of the Gateway specified by its identifier.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Gateway specified by its identifier.
     */
    Response<GatewayContract> getByIdWithResponse(String id, Context context);

    /**
     * Deletes specific Gateway.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes specific Gateway.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new GatewayContract resource.
     *
     * @param name resource name.
     * @return the first stage of the new GatewayContract definition.
     */
    GatewayContract.DefinitionStages.Blank define(String name);
}