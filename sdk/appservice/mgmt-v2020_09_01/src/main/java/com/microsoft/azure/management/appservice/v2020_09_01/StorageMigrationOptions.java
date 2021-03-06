/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Options for app content migration.
 */
@JsonFlatten
public class StorageMigrationOptions extends ProxyOnlyResource {
    /**
     * AzureFiles connection string.
     */
    @JsonProperty(value = "properties.azurefilesConnectionString", required = true)
    private String azurefilesConnectionString;

    /**
     * AzureFiles share.
     */
    @JsonProperty(value = "properties.azurefilesShare", required = true)
    private String azurefilesShare;

    /**
     * &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.switchSiteAfterMigration")
    private Boolean switchSiteAfterMigration;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy
     * operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.blockWriteAccessToSite")
    private Boolean blockWriteAccessToSite;

    /**
     * Get azureFiles connection string.
     *
     * @return the azurefilesConnectionString value
     */
    public String azurefilesConnectionString() {
        return this.azurefilesConnectionString;
    }

    /**
     * Set azureFiles connection string.
     *
     * @param azurefilesConnectionString the azurefilesConnectionString value to set
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withAzurefilesConnectionString(String azurefilesConnectionString) {
        this.azurefilesConnectionString = azurefilesConnectionString;
        return this;
    }

    /**
     * Get azureFiles share.
     *
     * @return the azurefilesShare value
     */
    public String azurefilesShare() {
        return this.azurefilesShare;
    }

    /**
     * Set azureFiles share.
     *
     * @param azurefilesShare the azurefilesShare value to set
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withAzurefilesShare(String azurefilesShare) {
        this.azurefilesShare = azurefilesShare;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt;if the app should be switched over; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the switchSiteAfterMigration value
     */
    public Boolean switchSiteAfterMigration() {
        return this.switchSiteAfterMigration;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt;if the app should be switched over; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param switchSiteAfterMigration the switchSiteAfterMigration value to set
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withSwitchSiteAfterMigration(Boolean switchSiteAfterMigration) {
        this.switchSiteAfterMigration = switchSiteAfterMigration;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the blockWriteAccessToSite value
     */
    public Boolean blockWriteAccessToSite() {
        return this.blockWriteAccessToSite;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param blockWriteAccessToSite the blockWriteAccessToSite value to set
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withBlockWriteAccessToSite(Boolean blockWriteAccessToSite) {
        this.blockWriteAccessToSite = blockWriteAccessToSite;
        return this;
    }

}
