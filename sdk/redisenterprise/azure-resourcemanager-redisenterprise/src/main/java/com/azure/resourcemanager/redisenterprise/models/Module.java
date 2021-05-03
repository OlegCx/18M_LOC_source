// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies configuration of a redis module. */
@Fluent
public final class Module {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Module.class);

    /*
     * The name of the module, e.g. 'RedisBloom', 'RediSearch',
     * 'RedisTimeSeries'
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Configuration options for the module, e.g. 'ERROR_RATE 0.00 INITIAL_SIZE
     * 400'.
     */
    @JsonProperty(value = "args")
    private String args;

    /*
     * The version of the module, e.g. '1.0'.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Get the name property: The name of the module, e.g. 'RedisBloom', 'RediSearch', 'RedisTimeSeries'.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the module, e.g. 'RedisBloom', 'RediSearch', 'RedisTimeSeries'.
     *
     * @param name the name value to set.
     * @return the Module object itself.
     */
    public Module withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the args property: Configuration options for the module, e.g. 'ERROR_RATE 0.00 INITIAL_SIZE 400'.
     *
     * @return the args value.
     */
    public String args() {
        return this.args;
    }

    /**
     * Set the args property: Configuration options for the module, e.g. 'ERROR_RATE 0.00 INITIAL_SIZE 400'.
     *
     * @param args the args value to set.
     * @return the Module object itself.
     */
    public Module withArgs(String args) {
        this.args = args;
        return this;
    }

    /**
     * Get the version property: The version of the module, e.g. '1.0'.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Module"));
        }
    }
}