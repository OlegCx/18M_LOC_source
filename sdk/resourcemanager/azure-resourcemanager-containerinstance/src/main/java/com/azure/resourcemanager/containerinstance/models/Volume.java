// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The properties of the volume. */
@Fluent
public final class Volume {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Volume.class);

    /*
     * The name of the volume.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The Azure File volume.
     */
    @JsonProperty(value = "azureFile")
    private AzureFileVolume azureFile;

    /*
     * The empty directory volume.
     */
    @JsonProperty(value = "emptyDir")
    private Object emptyDir;

    /*
     * The secret volume.
     */
    @JsonProperty(value = "secret")
    private Map<String, String> secret;

    /*
     * The git repo volume.
     */
    @JsonProperty(value = "gitRepo")
    private GitRepoVolume gitRepo;

    /**
     * Get the name property: The name of the volume.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the volume.
     *
     * @param name the name value to set.
     * @return the Volume object itself.
     */
    public Volume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the azureFile property: The Azure File volume.
     *
     * @return the azureFile value.
     */
    public AzureFileVolume azureFile() {
        return this.azureFile;
    }

    /**
     * Set the azureFile property: The Azure File volume.
     *
     * @param azureFile the azureFile value to set.
     * @return the Volume object itself.
     */
    public Volume withAzureFile(AzureFileVolume azureFile) {
        this.azureFile = azureFile;
        return this;
    }

    /**
     * Get the emptyDir property: The empty directory volume.
     *
     * @return the emptyDir value.
     */
    public Object emptyDir() {
        return this.emptyDir;
    }

    /**
     * Set the emptyDir property: The empty directory volume.
     *
     * @param emptyDir the emptyDir value to set.
     * @return the Volume object itself.
     */
    public Volume withEmptyDir(Object emptyDir) {
        this.emptyDir = emptyDir;
        return this;
    }

    /**
     * Get the secret property: The secret volume.
     *
     * @return the secret value.
     */
    public Map<String, String> secret() {
        return this.secret;
    }

    /**
     * Set the secret property: The secret volume.
     *
     * @param secret the secret value to set.
     * @return the Volume object itself.
     */
    public Volume withSecret(Map<String, String> secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Get the gitRepo property: The git repo volume.
     *
     * @return the gitRepo value.
     */
    public GitRepoVolume gitRepo() {
        return this.gitRepo;
    }

    /**
     * Set the gitRepo property: The git repo volume.
     *
     * @param gitRepo the gitRepo value to set.
     * @return the Volume object itself.
     */
    public Volume withGitRepo(GitRepoVolume gitRepo) {
        this.gitRepo = gitRepo;
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
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Volume"));
        }
        if (azureFile() != null) {
            azureFile().validate();
        }
        if (gitRepo() != null) {
            gitRepo().validate();
        }
    }
}