// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The error code compose of code and message. */
@Fluent
public final class Error {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Error.class);

    /*
     * The code of error.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The message of error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: The code of error.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The code of error.
     *
     * @param code the code value to set.
     * @return the Error object itself.
     */
    public Error withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message of error.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message of error.
     *
     * @param message the message value to set.
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
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