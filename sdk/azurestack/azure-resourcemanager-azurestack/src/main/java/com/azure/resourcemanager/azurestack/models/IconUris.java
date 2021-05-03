// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Links to product icons. */
@Fluent
public final class IconUris {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IconUris.class);

    /*
     * URI to large icon.
     */
    @JsonProperty(value = "large")
    private String large;

    /*
     * URI to wide icon.
     */
    @JsonProperty(value = "wide")
    private String wide;

    /*
     * URI to medium icon.
     */
    @JsonProperty(value = "medium")
    private String medium;

    /*
     * URI to small icon.
     */
    @JsonProperty(value = "small")
    private String small;

    /*
     * URI to hero icon.
     */
    @JsonProperty(value = "hero")
    private String hero;

    /**
     * Get the large property: URI to large icon.
     *
     * @return the large value.
     */
    public String large() {
        return this.large;
    }

    /**
     * Set the large property: URI to large icon.
     *
     * @param large the large value to set.
     * @return the IconUris object itself.
     */
    public IconUris withLarge(String large) {
        this.large = large;
        return this;
    }

    /**
     * Get the wide property: URI to wide icon.
     *
     * @return the wide value.
     */
    public String wide() {
        return this.wide;
    }

    /**
     * Set the wide property: URI to wide icon.
     *
     * @param wide the wide value to set.
     * @return the IconUris object itself.
     */
    public IconUris withWide(String wide) {
        this.wide = wide;
        return this;
    }

    /**
     * Get the medium property: URI to medium icon.
     *
     * @return the medium value.
     */
    public String medium() {
        return this.medium;
    }

    /**
     * Set the medium property: URI to medium icon.
     *
     * @param medium the medium value to set.
     * @return the IconUris object itself.
     */
    public IconUris withMedium(String medium) {
        this.medium = medium;
        return this;
    }

    /**
     * Get the small property: URI to small icon.
     *
     * @return the small value.
     */
    public String small() {
        return this.small;
    }

    /**
     * Set the small property: URI to small icon.
     *
     * @param small the small value to set.
     * @return the IconUris object itself.
     */
    public IconUris withSmall(String small) {
        this.small = small;
        return this;
    }

    /**
     * Get the hero property: URI to hero icon.
     *
     * @return the hero value.
     */
    public String hero() {
        return this.hero;
    }

    /**
     * Set the hero property: URI to hero icon.
     *
     * @param hero the hero value to set.
     * @return the IconUris object itself.
     */
    public IconUris withHero(String hero) {
        this.hero = hero;
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