// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-scale settings for the cluster. The system automatically scales the cluster up and down (within minimumNodeCount
 * and maximumNodeCount) based on the number of queued and running jobs assigned to the cluster.
 */
@Fluent
public final class AutoScaleSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoScaleSettings.class);

    /*
     * The minimum number of compute nodes the Batch AI service will try to
     * allocate for the cluster. Note, the actual number of nodes can be less
     * than the specified value if the subscription has not enough quota to
     * fulfill the request.
     */
    @JsonProperty(value = "minimumNodeCount", required = true)
    private int minimumNodeCount;

    /*
     * The maximum number of compute nodes the cluster can have.
     */
    @JsonProperty(value = "maximumNodeCount", required = true)
    private int maximumNodeCount;

    /*
     * The number of compute nodes to allocate on cluster creation. Note that
     * this value is used only during cluster creation. Default: 0.
     */
    @JsonProperty(value = "initialNodeCount")
    private Integer initialNodeCount;

    /**
     * Get the minimumNodeCount property: The minimum number of compute nodes the Batch AI service will try to allocate
     * for the cluster. Note, the actual number of nodes can be less than the specified value if the subscription has
     * not enough quota to fulfill the request.
     *
     * @return the minimumNodeCount value.
     */
    public int minimumNodeCount() {
        return this.minimumNodeCount;
    }

    /**
     * Set the minimumNodeCount property: The minimum number of compute nodes the Batch AI service will try to allocate
     * for the cluster. Note, the actual number of nodes can be less than the specified value if the subscription has
     * not enough quota to fulfill the request.
     *
     * @param minimumNodeCount the minimumNodeCount value to set.
     * @return the AutoScaleSettings object itself.
     */
    public AutoScaleSettings withMinimumNodeCount(int minimumNodeCount) {
        this.minimumNodeCount = minimumNodeCount;
        return this;
    }

    /**
     * Get the maximumNodeCount property: The maximum number of compute nodes the cluster can have.
     *
     * @return the maximumNodeCount value.
     */
    public int maximumNodeCount() {
        return this.maximumNodeCount;
    }

    /**
     * Set the maximumNodeCount property: The maximum number of compute nodes the cluster can have.
     *
     * @param maximumNodeCount the maximumNodeCount value to set.
     * @return the AutoScaleSettings object itself.
     */
    public AutoScaleSettings withMaximumNodeCount(int maximumNodeCount) {
        this.maximumNodeCount = maximumNodeCount;
        return this;
    }

    /**
     * Get the initialNodeCount property: The number of compute nodes to allocate on cluster creation. Note that this
     * value is used only during cluster creation. Default: 0.
     *
     * @return the initialNodeCount value.
     */
    public Integer initialNodeCount() {
        return this.initialNodeCount;
    }

    /**
     * Set the initialNodeCount property: The number of compute nodes to allocate on cluster creation. Note that this
     * value is used only during cluster creation. Default: 0.
     *
     * @param initialNodeCount the initialNodeCount value to set.
     * @return the AutoScaleSettings object itself.
     */
    public AutoScaleSettings withInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}