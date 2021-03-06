/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.BackupSchedule;
import java.util.List;
import com.microsoft.azure.management.appservice.v2020_09_01.DatabaseBackupSetting;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * Description of a backup which will be performed.
 */
@JsonFlatten
public class BackupRequestInner extends ProxyOnlyResource {
    /**
     * Name of the backup.
     */
    @JsonProperty(value = "properties.backupName")
    private String backupName;

    /**
     * True if the backup schedule is enabled (must be included in that case),
     * false if the backup schedule should be disabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * SAS URL to the container.
     */
    @JsonProperty(value = "properties.storageAccountUrl", required = true)
    private String storageAccountUrl;

    /**
     * Schedule for the backup if it is executed periodically.
     */
    @JsonProperty(value = "properties.backupSchedule")
    private BackupSchedule backupSchedule;

    /**
     * Databases included in the backup.
     */
    @JsonProperty(value = "properties.databases")
    private List<DatabaseBackupSetting> databases;

    /**
     * Get name of the backup.
     *
     * @return the backupName value
     */
    public String backupName() {
        return this.backupName;
    }

    /**
     * Set name of the backup.
     *
     * @param backupName the backupName value to set
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * Get true if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set true if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     *
     * @param enabled the enabled value to set
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get sAS URL to the container.
     *
     * @return the storageAccountUrl value
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    /**
     * Set sAS URL to the container.
     *
     * @param storageAccountUrl the storageAccountUrl value to set
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withStorageAccountUrl(String storageAccountUrl) {
        this.storageAccountUrl = storageAccountUrl;
        return this;
    }

    /**
     * Get schedule for the backup if it is executed periodically.
     *
     * @return the backupSchedule value
     */
    public BackupSchedule backupSchedule() {
        return this.backupSchedule;
    }

    /**
     * Set schedule for the backup if it is executed periodically.
     *
     * @param backupSchedule the backupSchedule value to set
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withBackupSchedule(BackupSchedule backupSchedule) {
        this.backupSchedule = backupSchedule;
        return this;
    }

    /**
     * Get databases included in the backup.
     *
     * @return the databases value
     */
    public List<DatabaseBackupSetting> databases() {
        return this.databases;
    }

    /**
     * Set databases included in the backup.
     *
     * @param databases the databases value to set
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withDatabases(List<DatabaseBackupSetting> databases) {
        this.databases = databases;
        return this;
    }

}
