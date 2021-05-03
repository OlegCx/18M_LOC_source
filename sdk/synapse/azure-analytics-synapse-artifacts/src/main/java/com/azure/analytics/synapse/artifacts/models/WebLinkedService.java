// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Web linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Web")
@Fluent
public final class WebLinkedService extends LinkedService {
    /*
     * Web linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private WebLinkedServiceTypeProperties typeProperties;

    /**
     * Get the typeProperties property: Web linked service properties.
     *
     * @return the typeProperties value.
     */
    public WebLinkedServiceTypeProperties getTypeProperties() {
        return this.typeProperties;
    }

    /**
     * Set the typeProperties property: Web linked service properties.
     *
     * @param typeProperties the typeProperties value to set.
     * @return the WebLinkedService object itself.
     */
    public WebLinkedService setTypeProperties(WebLinkedServiceTypeProperties typeProperties) {
        this.typeProperties = typeProperties;
        return this;
    }
}