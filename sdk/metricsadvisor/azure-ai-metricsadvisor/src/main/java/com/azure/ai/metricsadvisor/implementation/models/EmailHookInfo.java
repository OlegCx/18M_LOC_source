// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The EmailHookInfo model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "hookType")
@JsonTypeName("Email")
@Fluent
public final class EmailHookInfo extends HookInfo {
    /*
     * The hookParameter property.
     */
    @JsonProperty(value = "hookParameter")
    private EmailHookParameter hookParameter;

    /**
     * Get the hookParameter property: The hookParameter property.
     *
     * @return the hookParameter value.
     */
    public EmailHookParameter getHookParameter() {
        return this.hookParameter;
    }

    /**
     * Set the hookParameter property: The hookParameter property.
     *
     * @param hookParameter the hookParameter value to set.
     * @return the EmailHookInfo object itself.
     */
    public EmailHookInfo setHookParameter(EmailHookParameter hookParameter) {
        this.hookParameter = hookParameter;
        return this;
    }
}
