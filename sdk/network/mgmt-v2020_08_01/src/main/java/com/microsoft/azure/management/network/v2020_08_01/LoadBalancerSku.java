/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU of a load balancer.
 */
public class LoadBalancerSku {
    /**
     * Name of a load balancer SKU. Possible values include: 'Basic',
     * 'Standard'.
     */
    @JsonProperty(value = "name")
    private LoadBalancerSkuName name;

    /**
     * Tier of a load balancer SKU. Possible values include: 'Regional',
     * 'Global'.
     */
    @JsonProperty(value = "tier")
    private LoadBalancerSkuTier tier;

    /**
     * Get name of a load balancer SKU. Possible values include: 'Basic', 'Standard'.
     *
     * @return the name value
     */
    public LoadBalancerSkuName name() {
        return this.name;
    }

    /**
     * Set name of a load balancer SKU. Possible values include: 'Basic', 'Standard'.
     *
     * @param name the name value to set
     * @return the LoadBalancerSku object itself.
     */
    public LoadBalancerSku withName(LoadBalancerSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get tier of a load balancer SKU. Possible values include: 'Regional', 'Global'.
     *
     * @return the tier value
     */
    public LoadBalancerSkuTier tier() {
        return this.tier;
    }

    /**
     * Set tier of a load balancer SKU. Possible values include: 'Regional', 'Global'.
     *
     * @param tier the tier value to set
     * @return the LoadBalancerSku object itself.
     */
    public LoadBalancerSku withTier(LoadBalancerSkuTier tier) {
        this.tier = tier;
        return this;
    }

}