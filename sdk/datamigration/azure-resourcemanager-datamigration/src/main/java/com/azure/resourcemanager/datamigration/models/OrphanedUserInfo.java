// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information of orphaned users on the SQL server database. */
@Fluent
public final class OrphanedUserInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrphanedUserInfo.class);

    /*
     * Name of the orphaned user
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Parent database of the user
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * Get the name property: Name of the orphaned user.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the orphaned user.
     *
     * @param name the name value to set.
     * @return the OrphanedUserInfo object itself.
     */
    public OrphanedUserInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the databaseName property: Parent database of the user.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: Parent database of the user.
     *
     * @param databaseName the databaseName value to set.
     * @return the OrphanedUserInfo object itself.
     */
    public OrphanedUserInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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