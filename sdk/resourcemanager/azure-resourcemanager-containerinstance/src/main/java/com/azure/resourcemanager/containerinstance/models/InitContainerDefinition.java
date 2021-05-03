// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The init container definition. */
@JsonFlatten
@Fluent
public class InitContainerDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InitContainerDefinition.class);

    /*
     * The name for the init container.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The image of the init container.
     */
    @JsonProperty(value = "properties.image")
    private String image;

    /*
     * The command to execute within the init container in exec form.
     */
    @JsonProperty(value = "properties.command")
    private List<String> command;

    /*
     * The environment variables to set in the init container.
     */
    @JsonProperty(value = "properties.environmentVariables")
    private List<EnvironmentVariable> environmentVariables;

    /*
     * The instance view of the init container. Only valid in response.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private InitContainerPropertiesDefinitionInstanceView instanceView;

    /*
     * The volume mounts available to the init container.
     */
    @JsonProperty(value = "properties.volumeMounts")
    private List<VolumeMount> volumeMounts;

    /**
     * Get the name property: The name for the init container.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name for the init container.
     *
     * @param name the name value to set.
     * @return the InitContainerDefinition object itself.
     */
    public InitContainerDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the image property: The image of the init container.
     *
     * @return the image value.
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the image property: The image of the init container.
     *
     * @param image the image value to set.
     * @return the InitContainerDefinition object itself.
     */
    public InitContainerDefinition withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the command property: The command to execute within the init container in exec form.
     *
     * @return the command value.
     */
    public List<String> command() {
        return this.command;
    }

    /**
     * Set the command property: The command to execute within the init container in exec form.
     *
     * @param command the command value to set.
     * @return the InitContainerDefinition object itself.
     */
    public InitContainerDefinition withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * Get the environmentVariables property: The environment variables to set in the init container.
     *
     * @return the environmentVariables value.
     */
    public List<EnvironmentVariable> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: The environment variables to set in the init container.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the InitContainerDefinition object itself.
     */
    public InitContainerDefinition withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the instanceView property: The instance view of the init container. Only valid in response.
     *
     * @return the instanceView value.
     */
    public InitContainerPropertiesDefinitionInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get the volumeMounts property: The volume mounts available to the init container.
     *
     * @return the volumeMounts value.
     */
    public List<VolumeMount> volumeMounts() {
        return this.volumeMounts;
    }

    /**
     * Set the volumeMounts property: The volume mounts available to the init container.
     *
     * @param volumeMounts the volumeMounts value to set.
     * @return the InitContainerDefinition object itself.
     */
    public InitContainerDefinition withVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model InitContainerDefinition"));
        }
        if (environmentVariables() != null) {
            environmentVariables().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
        if (volumeMounts() != null) {
            volumeMounts().forEach(e -> e.validate());
        }
    }
}