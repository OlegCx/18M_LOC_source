/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Netezza source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = NetezzaSource.class)
@JsonTypeName("NetezzaSource")
public class NetezzaSource extends TabularSource {
    /**
     * A query to retrieve data from source. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * The partition mechanism that will be used for Netezza read in parallel.
     * Possible values include: "None", "DataSlice", "DynamicRange".
     */
    @JsonProperty(value = "partitionOption")
    private Object partitionOption;

    /**
     * The settings that will be leveraged for Netezza source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private NetezzaPartitionSettings partitionSettings;

    /**
     * Get a query to retrieve data from source. Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set a query to retrieve data from source. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the partition mechanism that will be used for Netezza read in parallel. Possible values include: "None", "DataSlice", "DynamicRange".
     *
     * @return the partitionOption value
     */
    public Object partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partition mechanism that will be used for Netezza read in parallel. Possible values include: "None", "DataSlice", "DynamicRange".
     *
     * @param partitionOption the partitionOption value to set
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource withPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the settings that will be leveraged for Netezza source partitioning.
     *
     * @return the partitionSettings value
     */
    public NetezzaPartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the settings that will be leveraged for Netezza source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource withPartitionSettings(NetezzaPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

}