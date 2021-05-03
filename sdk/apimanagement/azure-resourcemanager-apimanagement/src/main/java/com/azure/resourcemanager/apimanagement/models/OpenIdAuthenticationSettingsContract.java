// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** API OAuth2 Authentication settings details. */
@Fluent
public final class OpenIdAuthenticationSettingsContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenIdAuthenticationSettingsContract.class);

    /*
     * OAuth authorization server identifier.
     */
    @JsonProperty(value = "openidProviderId")
    private String openidProviderId;

    /*
     * How to send token to the server.
     */
    @JsonProperty(value = "bearerTokenSendingMethods")
    private List<BearerTokenSendingMethods> bearerTokenSendingMethods;

    /**
     * Get the openidProviderId property: OAuth authorization server identifier.
     *
     * @return the openidProviderId value.
     */
    public String openidProviderId() {
        return this.openidProviderId;
    }

    /**
     * Set the openidProviderId property: OAuth authorization server identifier.
     *
     * @param openidProviderId the openidProviderId value to set.
     * @return the OpenIdAuthenticationSettingsContract object itself.
     */
    public OpenIdAuthenticationSettingsContract withOpenidProviderId(String openidProviderId) {
        this.openidProviderId = openidProviderId;
        return this;
    }

    /**
     * Get the bearerTokenSendingMethods property: How to send token to the server.
     *
     * @return the bearerTokenSendingMethods value.
     */
    public List<BearerTokenSendingMethods> bearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods;
    }

    /**
     * Set the bearerTokenSendingMethods property: How to send token to the server.
     *
     * @param bearerTokenSendingMethods the bearerTokenSendingMethods value to set.
     * @return the OpenIdAuthenticationSettingsContract object itself.
     */
    public OpenIdAuthenticationSettingsContract withBearerTokenSendingMethods(
        List<BearerTokenSendingMethods> bearerTokenSendingMethods) {
        this.bearerTokenSendingMethods = bearerTokenSendingMethods;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}