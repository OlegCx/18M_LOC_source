// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The set of allowed action and not allowed actions a caller has on a billing account. */
@Immutable
public final class BillingPermissionsPropertiesInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BillingPermissionsPropertiesInner.class);

    /*
     * The set of actions that the caller is allowed to perform.
     */
    @JsonProperty(value = "actions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> actions;

    /*
     * The set of actions that the caller is not allowed to perform.
     */
    @JsonProperty(value = "notActions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> notActions;

    /**
     * Get the actions property: The set of actions that the caller is allowed to perform.
     *
     * @return the actions value.
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Get the notActions property: The set of actions that the caller is not allowed to perform.
     *
     * @return the notActions value.
     */
    public List<String> notActions() {
        return this.notActions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}