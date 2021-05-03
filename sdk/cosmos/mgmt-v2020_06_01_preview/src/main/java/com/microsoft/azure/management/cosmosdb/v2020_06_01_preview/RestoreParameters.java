/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.DatabaseRestoreResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to indicate the information about the restore.
 */
public class RestoreParameters {
    /**
     * Describes the mode of the restore. Possible values include:
     * 'PointInTime'.
     */
    @JsonProperty(value = "restoreMode")
    private RestoreMode restoreMode;

    /**
     * The id of the restorable database account from which the restore has to
     * be initiated. For example:
     * /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{restorableDatabaseAccountName}.
     */
    @JsonProperty(value = "restoreSource")
    private String restoreSource;

    /**
     * Time to which the account has to be restored (ISO-8601 format).
     */
    @JsonProperty(value = "restoreTimestampInUtc")
    private DateTime restoreTimestampInUtc;

    /**
     * List of specific databases available for restore.
     */
    @JsonProperty(value = "databasesToRestore")
    private List<DatabaseRestoreResourceInner> databasesToRestore;

    /**
     * Get describes the mode of the restore. Possible values include: 'PointInTime'.
     *
     * @return the restoreMode value
     */
    public RestoreMode restoreMode() {
        return this.restoreMode;
    }

    /**
     * Set describes the mode of the restore. Possible values include: 'PointInTime'.
     *
     * @param restoreMode the restoreMode value to set
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withRestoreMode(RestoreMode restoreMode) {
        this.restoreMode = restoreMode;
        return this;
    }

    /**
     * Get the id of the restorable database account from which the restore has to be initiated. For example: /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{restorableDatabaseAccountName}.
     *
     * @return the restoreSource value
     */
    public String restoreSource() {
        return this.restoreSource;
    }

    /**
     * Set the id of the restorable database account from which the restore has to be initiated. For example: /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{restorableDatabaseAccountName}.
     *
     * @param restoreSource the restoreSource value to set
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withRestoreSource(String restoreSource) {
        this.restoreSource = restoreSource;
        return this;
    }

    /**
     * Get time to which the account has to be restored (ISO-8601 format).
     *
     * @return the restoreTimestampInUtc value
     */
    public DateTime restoreTimestampInUtc() {
        return this.restoreTimestampInUtc;
    }

    /**
     * Set time to which the account has to be restored (ISO-8601 format).
     *
     * @param restoreTimestampInUtc the restoreTimestampInUtc value to set
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withRestoreTimestampInUtc(DateTime restoreTimestampInUtc) {
        this.restoreTimestampInUtc = restoreTimestampInUtc;
        return this;
    }

    /**
     * Get list of specific databases available for restore.
     *
     * @return the databasesToRestore value
     */
    public List<DatabaseRestoreResourceInner> databasesToRestore() {
        return this.databasesToRestore;
    }

    /**
     * Set list of specific databases available for restore.
     *
     * @param databasesToRestore the databasesToRestore value to set
     * @return the RestoreParameters object itself.
     */
    public RestoreParameters withDatabasesToRestore(List<DatabaseRestoreResourceInner> databasesToRestore) {
        this.databasesToRestore = databasesToRestore;
        return this;
    }

}