// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.SoftwareUpdateConfigurationRunsClient;
import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationRunInner;
import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationRunListResultInner;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SoftwareUpdateConfigurationRunsClient. */
public final class SoftwareUpdateConfigurationRunsClientImpl implements SoftwareUpdateConfigurationRunsClient {
    private final ClientLogger logger = new ClientLogger(SoftwareUpdateConfigurationRunsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SoftwareUpdateConfigurationRunsService service;

    /** The service client containing this operation class. */
    private final AutomationClientImpl client;

    /**
     * Initializes an instance of SoftwareUpdateConfigurationRunsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SoftwareUpdateConfigurationRunsClientImpl(AutomationClientImpl client) {
        this.service =
            RestProxy
                .create(
                    SoftwareUpdateConfigurationRunsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutomationClientSoftwareUpdateConfigurationRuns to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutomationClientSoft")
    private interface SoftwareUpdateConfigurationRunsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Automation"
                + "/automationAccounts/{automationAccountName}/softwareUpdateConfigurationRuns"
                + "/{softwareUpdateConfigurationRunId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SoftwareUpdateConfigurationRunInner>> getById(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("automationAccountName") String automationAccountName,
            @PathParam("softwareUpdateConfigurationRunId") UUID softwareUpdateConfigurationRunId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("clientRequestId") String clientRequestId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Automation"
                + "/automationAccounts/{automationAccountName}/softwareUpdateConfigurationRuns")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SoftwareUpdateConfigurationRunListResultInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("automationAccountName") String automationAccountName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("clientRequestId") String clientRequestId,
            @QueryParam("$filter") String filter,
            @QueryParam("$skip") String skip,
            @QueryParam("$top") String top,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get a single software update configuration Run by Id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param softwareUpdateConfigurationRunId The Id of the software update configuration run.
     * @param clientRequestId Identifies this specific client request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single software update configuration Run by Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SoftwareUpdateConfigurationRunInner>> getByIdWithResponseAsync(
        String resourceGroupName,
        String automationAccountName,
        UUID softwareUpdateConfigurationRunId,
        String clientRequestId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        if (softwareUpdateConfigurationRunId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter softwareUpdateConfigurationRunId is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getById(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            automationAccountName,
                            softwareUpdateConfigurationRunId,
                            apiVersion,
                            clientRequestId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a single software update configuration Run by Id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param softwareUpdateConfigurationRunId The Id of the software update configuration run.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single software update configuration Run by Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SoftwareUpdateConfigurationRunInner>> getByIdWithResponseAsync(
        String resourceGroupName,
        String automationAccountName,
        UUID softwareUpdateConfigurationRunId,
        String clientRequestId,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        if (softwareUpdateConfigurationRunId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter softwareUpdateConfigurationRunId is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getById(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                automationAccountName,
                softwareUpdateConfigurationRunId,
                apiVersion,
                clientRequestId,
                accept,
                context);
    }

    /**
     * Get a single software update configuration Run by Id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param softwareUpdateConfigurationRunId The Id of the software update configuration run.
     * @param clientRequestId Identifies this specific client request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single software update configuration Run by Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SoftwareUpdateConfigurationRunInner> getByIdAsync(
        String resourceGroupName,
        String automationAccountName,
        UUID softwareUpdateConfigurationRunId,
        String clientRequestId) {
        return getByIdWithResponseAsync(
                resourceGroupName, automationAccountName, softwareUpdateConfigurationRunId, clientRequestId)
            .flatMap(
                (Response<SoftwareUpdateConfigurationRunInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a single software update configuration Run by Id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param softwareUpdateConfigurationRunId The Id of the software update configuration run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single software update configuration Run by Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SoftwareUpdateConfigurationRunInner> getByIdAsync(
        String resourceGroupName, String automationAccountName, UUID softwareUpdateConfigurationRunId) {
        final String clientRequestId = null;
        return getByIdWithResponseAsync(
                resourceGroupName, automationAccountName, softwareUpdateConfigurationRunId, clientRequestId)
            .flatMap(
                (Response<SoftwareUpdateConfigurationRunInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a single software update configuration Run by Id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param softwareUpdateConfigurationRunId The Id of the software update configuration run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single software update configuration Run by Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SoftwareUpdateConfigurationRunInner getById(
        String resourceGroupName, String automationAccountName, UUID softwareUpdateConfigurationRunId) {
        final String clientRequestId = null;
        return getByIdAsync(resourceGroupName, automationAccountName, softwareUpdateConfigurationRunId, clientRequestId)
            .block();
    }

    /**
     * Get a single software update configuration Run by Id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param softwareUpdateConfigurationRunId The Id of the software update configuration run.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single software update configuration Run by Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SoftwareUpdateConfigurationRunInner> getByIdWithResponse(
        String resourceGroupName,
        String automationAccountName,
        UUID softwareUpdateConfigurationRunId,
        String clientRequestId,
        Context context) {
        return getByIdWithResponseAsync(
                resourceGroupName, automationAccountName, softwareUpdateConfigurationRunId, clientRequestId, context)
            .block();
    }

    /**
     * Return list of software update configuration runs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param clientRequestId Identifies this specific client request.
     * @param filter The filter to apply on the operation. You can use the following filters: 'properties/osType',
     *     'properties/status', 'properties/startTime', and 'properties/softwareUpdateConfiguration/name'.
     * @param skip Number of entries you skip before returning results.
     * @param top Maximum number of entries returned in the results collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing all software update configuration runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SoftwareUpdateConfigurationRunListResultInner>> listWithResponseAsync(
        String resourceGroupName,
        String automationAccountName,
        String clientRequestId,
        String filter,
        String skip,
        String top) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            automationAccountName,
                            apiVersion,
                            clientRequestId,
                            filter,
                            skip,
                            top,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Return list of software update configuration runs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param clientRequestId Identifies this specific client request.
     * @param filter The filter to apply on the operation. You can use the following filters: 'properties/osType',
     *     'properties/status', 'properties/startTime', and 'properties/softwareUpdateConfiguration/name'.
     * @param skip Number of entries you skip before returning results.
     * @param top Maximum number of entries returned in the results collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing all software update configuration runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SoftwareUpdateConfigurationRunListResultInner>> listWithResponseAsync(
        String resourceGroupName,
        String automationAccountName,
        String clientRequestId,
        String filter,
        String skip,
        String top,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                automationAccountName,
                apiVersion,
                clientRequestId,
                filter,
                skip,
                top,
                accept,
                context);
    }

    /**
     * Return list of software update configuration runs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param clientRequestId Identifies this specific client request.
     * @param filter The filter to apply on the operation. You can use the following filters: 'properties/osType',
     *     'properties/status', 'properties/startTime', and 'properties/softwareUpdateConfiguration/name'.
     * @param skip Number of entries you skip before returning results.
     * @param top Maximum number of entries returned in the results collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing all software update configuration runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SoftwareUpdateConfigurationRunListResultInner> listAsync(
        String resourceGroupName,
        String automationAccountName,
        String clientRequestId,
        String filter,
        String skip,
        String top) {
        return listWithResponseAsync(resourceGroupName, automationAccountName, clientRequestId, filter, skip, top)
            .flatMap(
                (Response<SoftwareUpdateConfigurationRunListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Return list of software update configuration runs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing all software update configuration runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SoftwareUpdateConfigurationRunListResultInner> listAsync(
        String resourceGroupName, String automationAccountName) {
        final String clientRequestId = null;
        final String filter = null;
        final String skip = null;
        final String top = null;
        return listWithResponseAsync(resourceGroupName, automationAccountName, clientRequestId, filter, skip, top)
            .flatMap(
                (Response<SoftwareUpdateConfigurationRunListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Return list of software update configuration runs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing all software update configuration runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SoftwareUpdateConfigurationRunListResultInner list(String resourceGroupName, String automationAccountName) {
        final String clientRequestId = null;
        final String filter = null;
        final String skip = null;
        final String top = null;
        return listAsync(resourceGroupName, automationAccountName, clientRequestId, filter, skip, top).block();
    }

    /**
     * Return list of software update configuration runs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param clientRequestId Identifies this specific client request.
     * @param filter The filter to apply on the operation. You can use the following filters: 'properties/osType',
     *     'properties/status', 'properties/startTime', and 'properties/softwareUpdateConfiguration/name'.
     * @param skip Number of entries you skip before returning results.
     * @param top Maximum number of entries returned in the results collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing all software update configuration runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SoftwareUpdateConfigurationRunListResultInner> listWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String clientRequestId,
        String filter,
        String skip,
        String top,
        Context context) {
        return listWithResponseAsync(
                resourceGroupName, automationAccountName, clientRequestId, filter, skip, top, context)
            .block();
    }
}