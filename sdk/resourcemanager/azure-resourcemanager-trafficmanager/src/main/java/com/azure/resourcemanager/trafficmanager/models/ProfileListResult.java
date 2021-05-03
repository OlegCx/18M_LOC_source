// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.trafficmanager.fluent.models.ProfileInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Traffic Manager profiles operation response. */
@Fluent
public final class ProfileListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProfileListResult.class);

    /*
     * Gets the list of Traffic manager profiles.
     */
    @JsonProperty(value = "value")
    private List<ProfileInner> value;

    /**
     * Get the value property: Gets the list of Traffic manager profiles.
     *
     * @return the value value.
     */
    public List<ProfileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets the list of Traffic manager profiles.
     *
     * @param value the value value to set.
     * @return the ProfileListResult object itself.
     */
    public ProfileListResult withValue(List<ProfileInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}