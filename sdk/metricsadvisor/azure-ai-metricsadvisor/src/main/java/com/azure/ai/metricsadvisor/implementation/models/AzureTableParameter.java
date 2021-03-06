// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureTableParameter model. */
@Fluent
public final class AzureTableParameter {
    /*
     * Azure Table connection string
     */
    @JsonProperty(value = "connectionString", required = true)
    private String connectionString;

    /*
     * Table name
     */
    @JsonProperty(value = "table", required = true)
    private String table;

    /*
     * Query script
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /**
     * Get the connectionString property: Azure Table connection string.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: Azure Table connection string.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureTableParameter object itself.
     */
    public AzureTableParameter setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the table property: Table name.
     *
     * @return the table value.
     */
    public String getTable() {
        return this.table;
    }

    /**
     * Set the table property: Table name.
     *
     * @param table the table value to set.
     * @return the AzureTableParameter object itself.
     */
    public AzureTableParameter setTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the query property: Query script.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Query script.
     *
     * @param query the query value to set.
     * @return the AzureTableParameter object itself.
     */
    public AzureTableParameter setQuery(String query) {
        this.query = query;
        return this;
    }
}
