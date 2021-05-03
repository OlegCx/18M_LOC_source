// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerRegistryBlobsCompleteUploadHeaders model. */
@Fluent
public final class ContainerRegistryBlobsCompleteUploadHeaders {
    /*
     * The Range property.
     */
    @JsonProperty(value = "Range")
    private String range;

    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /*
     * The Docker-Content-Digest property.
     */
    @JsonProperty(value = "Docker-Content-Digest")
    private String dockerContentDigest;

    /**
     * Get the range property: The Range property.
     *
     * @return the range value.
     */
    public String getRange() {
        return this.range;
    }

    /**
     * Set the range property: The Range property.
     *
     * @param range the range value to set.
     * @return the ContainerRegistryBlobsCompleteUploadHeaders object itself.
     */
    public ContainerRegistryBlobsCompleteUploadHeaders setRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the ContainerRegistryBlobsCompleteUploadHeaders object itself.
     */
    public ContainerRegistryBlobsCompleteUploadHeaders setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the dockerContentDigest property: The Docker-Content-Digest property.
     *
     * @return the dockerContentDigest value.
     */
    public String getDockerContentDigest() {
        return this.dockerContentDigest;
    }

    /**
     * Set the dockerContentDigest property: The Docker-Content-Digest property.
     *
     * @param dockerContentDigest the dockerContentDigest value to set.
     * @return the ContainerRegistryBlobsCompleteUploadHeaders object itself.
     */
    public ContainerRegistryBlobsCompleteUploadHeaders setDockerContentDigest(String dockerContentDigest) {
        this.dockerContentDigest = dockerContentDigest;
        return this;
    }
}