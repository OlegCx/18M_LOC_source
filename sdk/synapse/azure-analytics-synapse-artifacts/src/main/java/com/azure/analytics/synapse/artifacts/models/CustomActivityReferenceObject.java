// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Reference objects for custom activity. */
@Fluent
public final class CustomActivityReferenceObject {
    /*
     * Linked service references.
     */
    @JsonProperty(value = "linkedServices")
    private List<LinkedServiceReference> linkedServices;

    /*
     * Dataset references.
     */
    @JsonProperty(value = "datasets")
    private List<DatasetReference> datasets;

    /**
     * Get the linkedServices property: Linked service references.
     *
     * @return the linkedServices value.
     */
    public List<LinkedServiceReference> getLinkedServices() {
        return this.linkedServices;
    }

    /**
     * Set the linkedServices property: Linked service references.
     *
     * @param linkedServices the linkedServices value to set.
     * @return the CustomActivityReferenceObject object itself.
     */
    public CustomActivityReferenceObject setLinkedServices(List<LinkedServiceReference> linkedServices) {
        this.linkedServices = linkedServices;
        return this;
    }

    /**
     * Get the datasets property: Dataset references.
     *
     * @return the datasets value.
     */
    public List<DatasetReference> getDatasets() {
        return this.datasets;
    }

    /**
     * Set the datasets property: Dataset references.
     *
     * @param datasets the datasets value to set.
     * @return the CustomActivityReferenceObject object itself.
     */
    public CustomActivityReferenceObject setDatasets(List<DatasetReference> datasets) {
        this.datasets = datasets;
        return this;
    }
}