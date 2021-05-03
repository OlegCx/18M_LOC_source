// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines a function that boosts scores based on the value of a date-time field. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("freshness")
@Fluent
public final class FreshnessScoringFunction extends ScoringFunction {
    /*
     * Parameter values for the freshness scoring function.
     */
    @JsonProperty(value = "freshness", required = true)
    private FreshnessScoringParameters parameters;

    /**
     * Creates an instance of FreshnessScoringFunction class.
     *
     * @param fieldName the fieldName value to set.
     * @param boost the boost value to set.
     * @param parameters the parameters value to set.
     */
    @JsonCreator
    public FreshnessScoringFunction(
            @JsonProperty(value = "fieldName", required = true) String fieldName,
            @JsonProperty(value = "boost", required = true) double boost,
            @JsonProperty(value = "freshness", required = true) FreshnessScoringParameters parameters) {
        super(fieldName, boost);
        this.parameters = parameters;
    }

    /**
     * Get the parameters property: Parameter values for the freshness scoring function.
     *
     * @return the parameters value.
     */
    public FreshnessScoringParameters getParameters() {
        return this.parameters;
    }
}