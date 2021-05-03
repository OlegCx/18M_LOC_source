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
import com.azure.resourcemanager.sql.fluent.models.JobTargetGroupInner;
import com.azure.resourcemanager.sql.models.JobTarget;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in JobTargetGroupsClient. */
public interface JobTargetGroupsClient {
    /**
     * Gets all target groups in an agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all target groups in an agent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<JobTargetGroupInner> listByAgentAsync(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Gets all target groups in an agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all target groups in an agent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobTargetGroupInner> listByAgent(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Gets all target groups in an agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all target groups in an agent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobTargetGroupInner> listByAgent(
        String resourceGroupName, String serverName, String jobAgentName, Context context);

    /**
     * Gets a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a target group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobTargetGroupInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String jobAgentName, String targetGroupName);

    /**
     * Gets a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a target group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobTargetGroupInner> getAsync(
        String resourceGroupName, String serverName, String jobAgentName, String targetGroupName);

    /**
     * Gets a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a target group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobTargetGroupInner get(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName);

    /**
     * Gets a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a target group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobTargetGroupInner> getWithResponse(
        String resourceGroupName, String serverName, String jobAgentName, String targetGroupName, Context context);

    /**
     * Creates or updates a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @param members Members of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a group of job targets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobTargetGroupInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String targetGroupName,
        List<JobTarget> members);

    /**
     * Creates or updates a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @param members Members of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a group of job targets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobTargetGroupInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String targetGroupName,
        List<JobTarget> members);

    /**
     * Creates or updates a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a group of job targets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobTargetGroupInner> createOrUpdateAsync(
        String resourceGroupName, String serverName, String jobAgentName, String targetGroupName);

    /**
     * Creates or updates a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a group of job targets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobTargetGroupInner createOrUpdate(
        String resourceGroupName, String serverName, String jobAgentName, String targetGroupName);

    /**
     * Creates or updates a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @param members Members of the target group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a group of job targets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobTargetGroupInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String targetGroupName,
        List<JobTarget> members,
        Context context);

    /**
     * Deletes a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String serverName, String jobAgentName, String targetGroupName);

    /**
     * Deletes a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName);

    /**
     * Deletes a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName);

    /**
     * Deletes a target group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param targetGroupName The name of the target group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serverName, String jobAgentName, String targetGroupName, Context context);
}