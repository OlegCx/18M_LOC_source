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

/** Defines a function that boosts scores based on distance from a geographic location. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("distance")
@Fluent
public final class DistanceScoringFunction extends ScoringFunction {
    /*
     * Parameter values for the distance scoring function.
     */
    @JsonProperty(value = "distance", required = true)
    private DistanceScoringParameters parameters;

    /**
     * Creates an instance of DistanceScoringFunction class.
     *
     * @param fieldName the fieldName value to set.
     * @param boost the boost value to set.
     * @param parameters the parameters value to set.
     */
    @JsonCreator
    public DistanceScoringFunction(
            @JsonProperty(value = "fieldName", required = true) String fieldName,
            @JsonProperty(value = "boost", required = true) double boost,
            @JsonProperty(value = "distance", required = true) DistanceScoringParameters parameters) {
        super(fieldName, boost);
        this.parameters = parameters;
    }

    /**
     * Get the parameters property: Parameter values for the distance scoring function.
     *
     * @return the parameters value.
     */
    public DistanceScoringParameters getParameters() {
        return this.parameters;
    }
}