/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a cloud service Extension.
 */
public class Extension {
    /**
     * The name of the extension.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private CloudServiceExtensionProperties properties;

    /**
     * Get the name of the extension.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the extension.
     *
     * @param name the name value to set
     * @return the Extension object itself.
     */
    public Extension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public CloudServiceExtensionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the Extension object itself.
     */
    public Extension withProperties(CloudServiceExtensionProperties properties) {
        this.properties = properties;
        return this;
    }

}