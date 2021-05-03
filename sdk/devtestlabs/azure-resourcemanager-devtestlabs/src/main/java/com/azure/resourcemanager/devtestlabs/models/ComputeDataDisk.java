// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A data disks attached to a virtual machine. */
@Fluent
public final class ComputeDataDisk {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComputeDataDisk.class);

    /*
     * Gets data disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * When backed by a blob, the URI of underlying blob.
     */
    @JsonProperty(value = "diskUri")
    private String diskUri;

    /*
     * When backed by managed disk, this is the ID of the compute disk
     * resource.
     */
    @JsonProperty(value = "managedDiskId")
    private String managedDiskId;

    /*
     * Gets data disk size in GiB.
     */
    @JsonProperty(value = "diskSizeGiB")
    private Integer diskSizeGiB;

    /**
     * Get the name property: Gets data disk name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets data disk name.
     *
     * @param name the name value to set.
     * @return the ComputeDataDisk object itself.
     */
    public ComputeDataDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the diskUri property: When backed by a blob, the URI of underlying blob.
     *
     * @return the diskUri value.
     */
    public String diskUri() {
        return this.diskUri;
    }

    /**
     * Set the diskUri property: When backed by a blob, the URI of underlying blob.
     *
     * @param diskUri the diskUri value to set.
     * @return the ComputeDataDisk object itself.
     */
    public ComputeDataDisk withDiskUri(String diskUri) {
        this.diskUri = diskUri;
        return this;
    }

    /**
     * Get the managedDiskId property: When backed by managed disk, this is the ID of the compute disk resource.
     *
     * @return the managedDiskId value.
     */
    public String managedDiskId() {
        return this.managedDiskId;
    }

    /**
     * Set the managedDiskId property: When backed by managed disk, this is the ID of the compute disk resource.
     *
     * @param managedDiskId the managedDiskId value to set.
     * @return the ComputeDataDisk object itself.
     */
    public ComputeDataDisk withManagedDiskId(String managedDiskId) {
        this.managedDiskId = managedDiskId;
        return this;
    }

    /**
     * Get the diskSizeGiB property: Gets data disk size in GiB.
     *
     * @return the diskSizeGiB value.
     */
    public Integer diskSizeGiB() {
        return this.diskSizeGiB;
    }

    /**
     * Set the diskSizeGiB property: Gets data disk size in GiB.
     *
     * @param diskSizeGiB the diskSizeGiB value to set.
     * @return the ComputeDataDisk object itself.
     */
    public ComputeDataDisk withDiskSizeGiB(Integer diskSizeGiB) {
        this.diskSizeGiB = diskSizeGiB;
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