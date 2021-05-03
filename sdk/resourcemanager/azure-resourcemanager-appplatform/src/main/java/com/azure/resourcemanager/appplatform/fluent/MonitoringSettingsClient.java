// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appplatform.fluent.models.MonitoringSettingResourceInner;
import com.azure.resourcemanager.appplatform.models.MonitoringSettingProperties;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MonitoringSettingsClient. */
public interface MonitoringSettingsClient {
    /**
     * Get the Monitoring Setting and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Monitoring Setting and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MonitoringSettingResourceInner>> getWithResponseAsync(String resourceGroupName, String serviceName);

    /**
     * Get the Monitoring Setting and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Monitoring Setting and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MonitoringSettingResourceInner> getAsync(String resourceGroupName, String serviceName);

    /**
     * Get the Monitoring Setting and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Monitoring Setting and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringSettingResourceInner get(String resourceGroupName, String serviceName);

    /**
     * Get the Monitoring Setting and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Monitoring Setting and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MonitoringSettingResourceInner> getWithResponse(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updatePutWithResponseAsync(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<MonitoringSettingResourceInner>, MonitoringSettingResourceInner> beginUpdatePutAsync(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<MonitoringSettingResourceInner>, MonitoringSettingResourceInner> beginUpdatePut(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<MonitoringSettingResourceInner>, MonitoringSettingResourceInner> beginUpdatePut(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties, Context context);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MonitoringSettingResourceInner> updatePutAsync(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MonitoringSettingResourceInner> updatePutAsync(String resourceGroupName, String serviceName);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringSettingResourceInner updatePut(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringSettingResourceInner updatePut(String resourceGroupName, String serviceName);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringSettingResourceInner updatePut(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties, Context context);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updatePatchWithResponseAsync(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<MonitoringSettingResourceInner>, MonitoringSettingResourceInner> beginUpdatePatchAsync(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<MonitoringSettingResourceInner>, MonitoringSettingResourceInner> beginUpdatePatch(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<MonitoringSettingResourceInner>, MonitoringSettingResourceInner> beginUpdatePatch(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties, Context context);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MonitoringSettingResourceInner> updatePatchAsync(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MonitoringSettingResourceInner> updatePatchAsync(String resourceGroupName, String serviceName);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringSettingResourceInner updatePatch(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringSettingResourceInner updatePatch(String resourceGroupName, String serviceName);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param properties Properties of the Monitoring Setting resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monitoring Setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringSettingResourceInner updatePatch(
        String resourceGroupName, String serviceName, MonitoringSettingProperties properties, Context context);
}