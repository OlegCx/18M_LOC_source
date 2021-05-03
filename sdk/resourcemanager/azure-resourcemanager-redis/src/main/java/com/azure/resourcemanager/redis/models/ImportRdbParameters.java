// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for Redis import operation. */
@Fluent
public final class ImportRdbParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportRdbParameters.class);

    /*
     * File format.
     */
    @JsonProperty(value = "format")
    private String format;

    /*
     * files to import.
     */
    @JsonProperty(value = "files", required = true)
    private List<String> files;

    /**
     * Get the format property: File format.
     *
     * @return the format value.
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format property: File format.
     *
     * @param format the format value to set.
     * @return the ImportRdbParameters object itself.
     */
    public ImportRdbParameters withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Get the files property: files to import.
     *
     * @return the files value.
     */
    public List<String> files() {
        return this.files;
    }

    /**
     * Set the files property: files to import.
     *
     * @param files the files value to set.
     * @return the ImportRdbParameters object itself.
     */
    public ImportRdbParameters withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (files() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property files in model ImportRdbParameters"));
        }
    }
}