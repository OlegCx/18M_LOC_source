// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.containers.containerregistry.models.ContentProperties;
import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Manifest attributes details. */
@JsonFlatten
@Immutable
public class RegistryArtifactProperties {
    /*
     * Image name
     */
    @JsonProperty(value = "imageName", access = JsonProperty.Access.WRITE_ONLY)
    private String repository;

    /*
     * Manifest
     */
    @JsonProperty(value = "manifest.digest", access = JsonProperty.Access.WRITE_ONLY)
    private String digest;

    /*
     * Image size
     */
    @JsonProperty(value = "manifest.imageSize", access = JsonProperty.Access.WRITE_ONLY)
    private Long size;

    /*
     * Created time
     */
    @JsonProperty(value = "manifest.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Last update time
     */
    @JsonProperty(value = "manifest.lastUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /*
     * CPU architecture
     */
    @JsonProperty(value = "manifest.architecture", access = JsonProperty.Access.WRITE_ONLY)
    private String cpuArchitecture;

    /*
     * Operating system
     */
    @JsonProperty(value = "manifest.os", access = JsonProperty.Access.WRITE_ONLY)
    private String operatingSystem;

    /*
     * List of manifest attributes details
     */
    @JsonProperty(value = "manifest.references", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManifestAttributesManifestReferences> references;

    /*
     * List of tags
     */
    @JsonProperty(value = "manifest.tags", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> tags;

    /*
     * Writeable properties of the resource
     */
    @JsonProperty(value = "manifest.changeableAttributes", access = JsonProperty.Access.WRITE_ONLY)
    private ContentProperties writeableProperties;

    /**
     * Get the repository property: Image name.
     *
     * @return the repository value.
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * Get the digest property: Manifest.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Get the size property: Image size.
     *
     * @return the size value.
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * Get the createdOn property: Created time.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: Last update time.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the cpuArchitecture property: CPU architecture.
     *
     * @return the cpuArchitecture value.
     */
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * Get the operatingSystem property: Operating system.
     *
     * @return the operatingSystem value.
     */
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Get the references property: List of manifest attributes details.
     *
     * @return the references value.
     */
    public List<ManifestAttributesManifestReferences> getReferences() {
        return this.references;
    }

    /**
     * Get the tags property: List of tags.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Get the writeableProperties property: Writeable properties of the resource.
     *
     * @return the writeableProperties value.
     */
    public ContentProperties getWriteableProperties() {
        return this.writeableProperties;
    }
}
