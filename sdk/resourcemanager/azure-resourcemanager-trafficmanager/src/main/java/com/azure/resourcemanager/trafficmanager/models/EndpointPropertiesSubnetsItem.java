// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Subnet first address, scope, and/or last address. */
@Fluent
public final class EndpointPropertiesSubnetsItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EndpointPropertiesSubnetsItem.class);

    /*
     * First address in the subnet.
     */
    @JsonProperty(value = "first")
    private String first;

    /*
     * Last address in the subnet.
     */
    @JsonProperty(value = "last")
    private String last;

    /*
     * Block size (number of leading bits in the subnet mask).
     */
    @JsonProperty(value = "scope")
    private Integer scope;

    /**
     * Get the first property: First address in the subnet.
     *
     * @return the first value.
     */
    public String first() {
        return this.first;
    }

    /**
     * Set the first property: First address in the subnet.
     *
     * @param first the first value to set.
     * @return the EndpointPropertiesSubnetsItem object itself.
     */
    public EndpointPropertiesSubnetsItem withFirst(String first) {
        this.first = first;
        return this;
    }

    /**
     * Get the last property: Last address in the subnet.
     *
     * @return the last value.
     */
    public String last() {
        return this.last;
    }

    /**
     * Set the last property: Last address in the subnet.
     *
     * @param last the last value to set.
     * @return the EndpointPropertiesSubnetsItem object itself.
     */
    public EndpointPropertiesSubnetsItem withLast(String last) {
        this.last = last;
        return this;
    }

    /**
     * Get the scope property: Block size (number of leading bits in the subnet mask).
     *
     * @return the scope value.
     */
    public Integer scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Block size (number of leading bits in the subnet mask).
     *
     * @param scope the scope value to set.
     * @return the EndpointPropertiesSubnetsItem object itself.
     */
    public EndpointPropertiesSubnetsItem withScope(Integer scope) {
        this.scope = scope;
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