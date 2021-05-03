// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.subscription.fluent.SubscriptionOperationsClient;
import com.azure.resourcemanager.subscription.fluent.models.CanceledSubscriptionIdInner;
import com.azure.resourcemanager.subscription.fluent.models.EnabledSubscriptionIdInner;
import com.azure.resourcemanager.subscription.fluent.models.RenamedSubscriptionIdInner;
import com.azure.resourcemanager.subscription.models.SubscriptionName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SubscriptionOperationsClient. */
public final class SubscriptionOperationsClientImpl implements SubscriptionOperationsClient {
    private final ClientLogger logger = new ClientLogger(SubscriptionOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SubscriptionOperationsService service;

    /** The service client containing this operation class. */
    private final SubscriptionClientImpl client;

    /**
     * Initializes an instance of SubscriptionOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SubscriptionOperationsClientImpl(SubscriptionClientImpl client) {
        this.service =
            RestProxy
                .create(SubscriptionOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionClientSubscriptionOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SubscriptionClientSu")
    private interface SubscriptionOperationsService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Subscription/cancel")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CanceledSubscriptionIdInner>> cancel(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Subscription/rename")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RenamedSubscriptionIdInner>> rename(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SubscriptionName body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Subscription/enable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EnabledSubscriptionIdInner>> enable(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * The operation to cancel a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the canceled subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CanceledSubscriptionIdInner>> cancelWithResponseAsync(String subscriptionId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.cancel(this.client.getEndpoint(), subscriptionId, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * The operation to cancel a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the canceled subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CanceledSubscriptionIdInner>> cancelWithResponseAsync(
        String subscriptionId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.cancel(this.client.getEndpoint(), subscriptionId, apiVersion, accept, context);
    }

    /**
     * The operation to cancel a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the canceled subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CanceledSubscriptionIdInner> cancelAsync(String subscriptionId) {
        return cancelWithResponseAsync(subscriptionId)
            .flatMap(
                (Response<CanceledSubscriptionIdInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The operation to cancel a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the canceled subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CanceledSubscriptionIdInner cancel(String subscriptionId) {
        return cancelAsync(subscriptionId).block();
    }

    /**
     * The operation to cancel a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the canceled subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CanceledSubscriptionIdInner> cancelWithResponse(String subscriptionId, Context context) {
        return cancelWithResponseAsync(subscriptionId, context).block();
    }

    /**
     * The operation to rename a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param body Subscription Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being renamed.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RenamedSubscriptionIdInner>> renameWithResponseAsync(
        String subscriptionId, SubscriptionName body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.rename(this.client.getEndpoint(), subscriptionId, apiVersion, body, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * The operation to rename a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param body Subscription Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being renamed.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RenamedSubscriptionIdInner>> renameWithResponseAsync(
        String subscriptionId, SubscriptionName body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.rename(this.client.getEndpoint(), subscriptionId, apiVersion, body, accept, context);
    }

    /**
     * The operation to rename a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param body Subscription Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being renamed.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RenamedSubscriptionIdInner> renameAsync(String subscriptionId, SubscriptionName body) {
        return renameWithResponseAsync(subscriptionId, body)
            .flatMap(
                (Response<RenamedSubscriptionIdInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The operation to rename a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param body Subscription Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being renamed.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RenamedSubscriptionIdInner rename(String subscriptionId, SubscriptionName body) {
        return renameAsync(subscriptionId, body).block();
    }

    /**
     * The operation to rename a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param body Subscription Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being renamed.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RenamedSubscriptionIdInner> renameWithResponse(
        String subscriptionId, SubscriptionName body, Context context) {
        return renameWithResponseAsync(subscriptionId, body, context).block();
    }

    /**
     * The operation to enable a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being enabled.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EnabledSubscriptionIdInner>> enableWithResponseAsync(String subscriptionId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.enable(this.client.getEndpoint(), subscriptionId, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * The operation to enable a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being enabled.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EnabledSubscriptionIdInner>> enableWithResponseAsync(String subscriptionId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.enable(this.client.getEndpoint(), subscriptionId, apiVersion, accept, context);
    }

    /**
     * The operation to enable a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being enabled.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<EnabledSubscriptionIdInner> enableAsync(String subscriptionId) {
        return enableWithResponseAsync(subscriptionId)
            .flatMap(
                (Response<EnabledSubscriptionIdInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The operation to enable a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being enabled.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EnabledSubscriptionIdInner enable(String subscriptionId) {
        return enableAsync(subscriptionId).block();
    }

    /**
     * The operation to enable a subscription.
     *
     * @param subscriptionId Subscription Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID of the subscriptions that is being enabled.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EnabledSubscriptionIdInner> enableWithResponse(String subscriptionId, Context context) {
        return enableWithResponseAsync(subscriptionId, context).block();
    }
}