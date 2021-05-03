// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.eventhubs.fluent.models.ArmDisasterRecoveryInner;
import com.azure.resourcemanager.eventhubs.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.eventhubs.fluent.models.CheckNameAvailabilityResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DisasterRecoveryConfigsClient. */
public interface DisasterRecoveryConfigsClient {
    /**
     * Gets a list of authorization rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of authorization rules for a Namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AuthorizationRuleInner> listAuthorizationRulesAsync(
        String resourceGroupName, String namespaceName, String alias);

    /**
     * Gets a list of authorization rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of authorization rules for a Namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String alias);

    /**
     * Gets a list of authorization rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of authorization rules for a Namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String alias, Context context);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AuthorizationRuleInner>> getAuthorizationRuleWithResponseAsync(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AuthorizationRuleInner> getAuthorizationRuleAsync(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AuthorizationRuleInner getAuthorizationRule(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AuthorizationRuleInner> getAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName, Context context);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the Namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AccessKeysInner>> listKeysWithResponseAsync(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the Namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AccessKeysInner> listKeysAsync(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the Namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner listKeys(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the Namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> listKeysWithResponse(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName, Context context);

    /**
     * Check the give Namespace name availability.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param name Name to check the namespace name availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Result of the CheckNameAvailability operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(
        String resourceGroupName, String namespaceName, String name);

    /**
     * Check the give Namespace name availability.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param name Name to check the namespace name availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Result of the CheckNameAvailability operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(
        String resourceGroupName, String namespaceName, String name);

    /**
     * Check the give Namespace name availability.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param name Name to check the namespace name availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Result of the CheckNameAvailability operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResultInner checkNameAvailability(String resourceGroupName, String namespaceName, String name);

    /**
     * Check the give Namespace name availability.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param name Name to check the namespace name availability.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Result of the CheckNameAvailability operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResultInner> checkNameAvailabilityWithResponse(
        String resourceGroupName, String namespaceName, String name, Context context);

    /**
     * Gets all Alias(Disaster Recovery configurations).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Alias(Disaster Recovery configurations).
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ArmDisasterRecoveryInner> listAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets all Alias(Disaster Recovery configurations).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Alias(Disaster Recovery configurations).
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ArmDisasterRecoveryInner> list(String resourceGroupName, String namespaceName);

    /**
     * Gets all Alias(Disaster Recovery configurations).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Alias(Disaster Recovery configurations).
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ArmDisasterRecoveryInner> list(String resourceGroupName, String namespaceName, Context context);

    /**
     * Creates or updates a new Alias(Disaster Recovery configuration).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param parameters Single item in List or Get Alias(Disaster Recovery configuration) operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Alias(Disaster Recovery configuration) operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ArmDisasterRecoveryInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String namespaceName, String alias, ArmDisasterRecoveryInner parameters);

    /**
     * Creates or updates a new Alias(Disaster Recovery configuration).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param parameters Single item in List or Get Alias(Disaster Recovery configuration) operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Alias(Disaster Recovery configuration) operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ArmDisasterRecoveryInner> createOrUpdateAsync(
        String resourceGroupName, String namespaceName, String alias, ArmDisasterRecoveryInner parameters);

    /**
     * Creates or updates a new Alias(Disaster Recovery configuration).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param parameters Single item in List or Get Alias(Disaster Recovery configuration) operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Alias(Disaster Recovery configuration) operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArmDisasterRecoveryInner createOrUpdate(
        String resourceGroupName, String namespaceName, String alias, ArmDisasterRecoveryInner parameters);

    /**
     * Creates or updates a new Alias(Disaster Recovery configuration).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param parameters Single item in List or Get Alias(Disaster Recovery configuration) operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Alias(Disaster Recovery configuration) operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArmDisasterRecoveryInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String namespaceName,
        String alias,
        ArmDisasterRecoveryInner parameters,
        Context context);

    /**
     * Deletes an Alias(Disaster Recovery configuration).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String namespaceName, String alias);

    /**
     * Deletes an Alias(Disaster Recovery configuration).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String namespaceName, String alias);

    /**
     * Deletes an Alias(Disaster Recovery configuration).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String alias);

    /**
     * Deletes an Alias(Disaster Recovery configuration).
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String namespaceName, String alias, Context context);

    /**
     * Retrieves Alias(Disaster Recovery configuration) for primary or secondary namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Alias(Disaster Recovery configuration) operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ArmDisasterRecoveryInner>> getWithResponseAsync(
        String resourceGroupName, String namespaceName, String alias);

    /**
     * Retrieves Alias(Disaster Recovery configuration) for primary or secondary namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Alias(Disaster Recovery configuration) operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ArmDisasterRecoveryInner> getAsync(String resourceGroupName, String namespaceName, String alias);

    /**
     * Retrieves Alias(Disaster Recovery configuration) for primary or secondary namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Alias(Disaster Recovery configuration) operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArmDisasterRecoveryInner get(String resourceGroupName, String namespaceName, String alias);

    /**
     * Retrieves Alias(Disaster Recovery configuration) for primary or secondary namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Alias(Disaster Recovery configuration) operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArmDisasterRecoveryInner> getWithResponse(
        String resourceGroupName, String namespaceName, String alias, Context context);

    /**
     * This operation disables the Disaster Recovery and stops replicating changes from primary to secondary namespaces.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> breakPairingWithResponseAsync(String resourceGroupName, String namespaceName, String alias);

    /**
     * This operation disables the Disaster Recovery and stops replicating changes from primary to secondary namespaces.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> breakPairingAsync(String resourceGroupName, String namespaceName, String alias);

    /**
     * This operation disables the Disaster Recovery and stops replicating changes from primary to secondary namespaces.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void breakPairing(String resourceGroupName, String namespaceName, String alias);

    /**
     * This operation disables the Disaster Recovery and stops replicating changes from primary to secondary namespaces.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> breakPairingWithResponse(
        String resourceGroupName, String namespaceName, String alias, Context context);

    /**
     * Invokes GEO DR failover and reconfigure the alias to point to the secondary namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> failOverWithResponseAsync(String resourceGroupName, String namespaceName, String alias);

    /**
     * Invokes GEO DR failover and reconfigure the alias to point to the secondary namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> failOverAsync(String resourceGroupName, String namespaceName, String alias);

    /**
     * Invokes GEO DR failover and reconfigure the alias to point to the secondary namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void failOver(String resourceGroupName, String namespaceName, String alias);

    /**
     * Invokes GEO DR failover and reconfigure the alias to point to the secondary namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param alias The Disaster Recovery configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> failOverWithResponse(String resourceGroupName, String namespaceName, String alias, Context context);
}