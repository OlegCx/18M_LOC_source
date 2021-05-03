/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.TriggerTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * Static Site Function Overview ARM resource.
 */
@JsonFlatten
public class StaticSiteFunctionOverviewARMResourceInner extends ProxyOnlyResource {
    /**
     * The name for the function.
     */
    @JsonProperty(value = "properties.functionName", access = JsonProperty.Access.WRITE_ONLY)
    private String functionName;

    /**
     * The trigger type of the function. Possible values include:
     * 'HttpTrigger', 'Unknown'.
     */
    @JsonProperty(value = "properties.triggerType", access = JsonProperty.Access.WRITE_ONLY)
    private TriggerTypes triggerType;

    /**
     * Get the name for the function.
     *
     * @return the functionName value
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * Get the trigger type of the function. Possible values include: 'HttpTrigger', 'Unknown'.
     *
     * @return the triggerType value
     */
    public TriggerTypes triggerType() {
        return this.triggerType;
    }

}