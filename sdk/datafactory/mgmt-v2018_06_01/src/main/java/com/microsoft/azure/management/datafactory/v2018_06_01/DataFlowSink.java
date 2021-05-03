/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Transformation for data flow sink.
 */
public class DataFlowSink extends Transformation {
    /**
     * Dataset reference.
     */
    @JsonProperty(value = "dataset")
    private DatasetReference dataset;

    /**
     * Linked service reference.
     */
    @JsonProperty(value = "linkedService")
    private LinkedServiceReference linkedService;

    /**
     * Schema linked service reference.
     */
    @JsonProperty(value = "schemaLinkedService")
    private LinkedServiceReference schemaLinkedService;

    /**
     * Get dataset reference.
     *
     * @return the dataset value
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set dataset reference.
     *
     * @param dataset the dataset value to set
     * @return the DataFlowSink object itself.
     */
    public DataFlowSink withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get linked service reference.
     *
     * @return the linkedService value
     */
    public LinkedServiceReference linkedService() {
        return this.linkedService;
    }

    /**
     * Set linked service reference.
     *
     * @param linkedService the linkedService value to set
     * @return the DataFlowSink object itself.
     */
    public DataFlowSink withLinkedService(LinkedServiceReference linkedService) {
        this.linkedService = linkedService;
        return this;
    }

    /**
     * Get schema linked service reference.
     *
     * @return the schemaLinkedService value
     */
    public LinkedServiceReference schemaLinkedService() {
        return this.schemaLinkedService;
    }

    /**
     * Set schema linked service reference.
     *
     * @param schemaLinkedService the schemaLinkedService value to set
     * @return the DataFlowSink object itself.
     */
    public DataFlowSink withSchemaLinkedService(LinkedServiceReference schemaLinkedService) {
        this.schemaLinkedService = schemaLinkedService;
        return this;
    }

}