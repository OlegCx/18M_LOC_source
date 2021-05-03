/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the resource to query the troubleshooting result.
 */
public class QueryTroubleshootingParameters {
    /**
     * The target resource ID to query the troubleshooting result.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * Get the target resource ID to query the troubleshooting result.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the target resource ID to query the troubleshooting result.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the QueryTroubleshootingParameters object itself.
     */
    public QueryTroubleshootingParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

}