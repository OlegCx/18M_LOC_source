// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The QueriesQueryTwinsHeaders model. */
@Fluent
public final class QueriesQueryTwinsHeaders {
    /*
     * The query-charge property.
     */
    @JsonProperty(value = "query-charge")
    private Float queryCharge;

    /**
     * Get the queryCharge property: The query-charge property.
     *
     * @return the queryCharge value.
     */
    public Float getQueryCharge() {
        return this.queryCharge;
    }

    /**
     * Set the queryCharge property: The query-charge property.
     *
     * @param queryCharge the queryCharge value to set.
     * @return the QueriesQueryTwinsHeaders object itself.
     */
    public QueriesQueryTwinsHeaders setQueryCharge(Float queryCharge) {
        this.queryCharge = queryCharge;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}