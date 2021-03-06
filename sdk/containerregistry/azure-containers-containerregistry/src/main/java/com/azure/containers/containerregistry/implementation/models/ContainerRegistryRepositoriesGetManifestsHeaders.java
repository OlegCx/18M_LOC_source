// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerRegistryRepositoriesGetManifestsHeaders model. */
@Fluent
public final class ContainerRegistryRepositoriesGetManifestsHeaders {
    /*
     * The Link property.
     */
    @JsonProperty(value = "Link")
    private String link;

    /**
     * Get the link property: The Link property.
     *
     * @return the link value.
     */
    public String getLink() {
        return this.link;
    }

    /**
     * Set the link property: The Link property.
     *
     * @param link the link value to set.
     * @return the ContainerRegistryRepositoriesGetManifestsHeaders object itself.
     */
    public ContainerRegistryRepositoriesGetManifestsHeaders setLink(String link) {
        this.link = link;
        return this;
    }
}
