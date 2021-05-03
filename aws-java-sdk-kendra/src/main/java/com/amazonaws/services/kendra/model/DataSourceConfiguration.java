/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for a Amazon Kendra data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DataSourceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
     * </p>
     */
    private S3DataSourceConfiguration s3Configuration;
    /**
     * <p>
     * Provides information necessary to create a data source connector for a Microsoft SharePoint site.
     * </p>
     */
    private SharePointConfiguration sharePointConfiguration;
    /**
     * <p>
     * Provides information necessary to create a data source connector for a database.
     * </p>
     */
    private DatabaseConfiguration databaseConfiguration;
    /**
     * <p>
     * Provides configuration information for data sources that connect to a Salesforce site.
     * </p>
     */
    private SalesforceConfiguration salesforceConfiguration;
    /**
     * <p>
     * Provides configuration for data sources that connect to Microsoft OneDrive.
     * </p>
     */
    private OneDriveConfiguration oneDriveConfiguration;
    /**
     * <p>
     * Provides configuration for data sources that connect to ServiceNow instances.
     * </p>
     */
    private ServiceNowConfiguration serviceNowConfiguration;
    /**
     * <p>
     * Provides configuration information for connecting to a Confluence data source.
     * </p>
     */
    private ConfluenceConfiguration confluenceConfiguration;
    /**
     * <p>
     * Provides configuration for data sources that connect to Google Drive.
     * </p>
     */
    private GoogleDriveConfiguration googleDriveConfiguration;

    /**
     * <p>
     * Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
     * </p>
     * 
     * @param s3Configuration
     *        Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
     */

    public void setS3Configuration(S3DataSourceConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
     * </p>
     * 
     * @return Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
     */

    public S3DataSourceConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
     * </p>
     * 
     * @param s3Configuration
     *        Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withS3Configuration(S3DataSourceConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * Provides information necessary to create a data source connector for a Microsoft SharePoint site.
     * </p>
     * 
     * @param sharePointConfiguration
     *        Provides information necessary to create a data source connector for a Microsoft SharePoint site.
     */

    public void setSharePointConfiguration(SharePointConfiguration sharePointConfiguration) {
        this.sharePointConfiguration = sharePointConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to create a data source connector for a Microsoft SharePoint site.
     * </p>
     * 
     * @return Provides information necessary to create a data source connector for a Microsoft SharePoint site.
     */

    public SharePointConfiguration getSharePointConfiguration() {
        return this.sharePointConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to create a data source connector for a Microsoft SharePoint site.
     * </p>
     * 
     * @param sharePointConfiguration
     *        Provides information necessary to create a data source connector for a Microsoft SharePoint site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withSharePointConfiguration(SharePointConfiguration sharePointConfiguration) {
        setSharePointConfiguration(sharePointConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides information necessary to create a data source connector for a database.
     * </p>
     * 
     * @param databaseConfiguration
     *        Provides information necessary to create a data source connector for a database.
     */

    public void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to create a data source connector for a database.
     * </p>
     * 
     * @return Provides information necessary to create a data source connector for a database.
     */

    public DatabaseConfiguration getDatabaseConfiguration() {
        return this.databaseConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to create a data source connector for a database.
     * </p>
     * 
     * @param databaseConfiguration
     *        Provides information necessary to create a data source connector for a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        setDatabaseConfiguration(databaseConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides configuration information for data sources that connect to a Salesforce site.
     * </p>
     * 
     * @param salesforceConfiguration
     *        Provides configuration information for data sources that connect to a Salesforce site.
     */

    public void setSalesforceConfiguration(SalesforceConfiguration salesforceConfiguration) {
        this.salesforceConfiguration = salesforceConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for data sources that connect to a Salesforce site.
     * </p>
     * 
     * @return Provides configuration information for data sources that connect to a Salesforce site.
     */

    public SalesforceConfiguration getSalesforceConfiguration() {
        return this.salesforceConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for data sources that connect to a Salesforce site.
     * </p>
     * 
     * @param salesforceConfiguration
     *        Provides configuration information for data sources that connect to a Salesforce site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withSalesforceConfiguration(SalesforceConfiguration salesforceConfiguration) {
        setSalesforceConfiguration(salesforceConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to Microsoft OneDrive.
     * </p>
     * 
     * @param oneDriveConfiguration
     *        Provides configuration for data sources that connect to Microsoft OneDrive.
     */

    public void setOneDriveConfiguration(OneDriveConfiguration oneDriveConfiguration) {
        this.oneDriveConfiguration = oneDriveConfiguration;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to Microsoft OneDrive.
     * </p>
     * 
     * @return Provides configuration for data sources that connect to Microsoft OneDrive.
     */

    public OneDriveConfiguration getOneDriveConfiguration() {
        return this.oneDriveConfiguration;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to Microsoft OneDrive.
     * </p>
     * 
     * @param oneDriveConfiguration
     *        Provides configuration for data sources that connect to Microsoft OneDrive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withOneDriveConfiguration(OneDriveConfiguration oneDriveConfiguration) {
        setOneDriveConfiguration(oneDriveConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to ServiceNow instances.
     * </p>
     * 
     * @param serviceNowConfiguration
     *        Provides configuration for data sources that connect to ServiceNow instances.
     */

    public void setServiceNowConfiguration(ServiceNowConfiguration serviceNowConfiguration) {
        this.serviceNowConfiguration = serviceNowConfiguration;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to ServiceNow instances.
     * </p>
     * 
     * @return Provides configuration for data sources that connect to ServiceNow instances.
     */

    public ServiceNowConfiguration getServiceNowConfiguration() {
        return this.serviceNowConfiguration;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to ServiceNow instances.
     * </p>
     * 
     * @param serviceNowConfiguration
     *        Provides configuration for data sources that connect to ServiceNow instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withServiceNowConfiguration(ServiceNowConfiguration serviceNowConfiguration) {
        setServiceNowConfiguration(serviceNowConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides configuration information for connecting to a Confluence data source.
     * </p>
     * 
     * @param confluenceConfiguration
     *        Provides configuration information for connecting to a Confluence data source.
     */

    public void setConfluenceConfiguration(ConfluenceConfiguration confluenceConfiguration) {
        this.confluenceConfiguration = confluenceConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for connecting to a Confluence data source.
     * </p>
     * 
     * @return Provides configuration information for connecting to a Confluence data source.
     */

    public ConfluenceConfiguration getConfluenceConfiguration() {
        return this.confluenceConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for connecting to a Confluence data source.
     * </p>
     * 
     * @param confluenceConfiguration
     *        Provides configuration information for connecting to a Confluence data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withConfluenceConfiguration(ConfluenceConfiguration confluenceConfiguration) {
        setConfluenceConfiguration(confluenceConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to Google Drive.
     * </p>
     * 
     * @param googleDriveConfiguration
     *        Provides configuration for data sources that connect to Google Drive.
     */

    public void setGoogleDriveConfiguration(GoogleDriveConfiguration googleDriveConfiguration) {
        this.googleDriveConfiguration = googleDriveConfiguration;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to Google Drive.
     * </p>
     * 
     * @return Provides configuration for data sources that connect to Google Drive.
     */

    public GoogleDriveConfiguration getGoogleDriveConfiguration() {
        return this.googleDriveConfiguration;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to Google Drive.
     * </p>
     * 
     * @param googleDriveConfiguration
     *        Provides configuration for data sources that connect to Google Drive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withGoogleDriveConfiguration(GoogleDriveConfiguration googleDriveConfiguration) {
        setGoogleDriveConfiguration(googleDriveConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getSharePointConfiguration() != null)
            sb.append("SharePointConfiguration: ").append(getSharePointConfiguration()).append(",");
        if (getDatabaseConfiguration() != null)
            sb.append("DatabaseConfiguration: ").append(getDatabaseConfiguration()).append(",");
        if (getSalesforceConfiguration() != null)
            sb.append("SalesforceConfiguration: ").append(getSalesforceConfiguration()).append(",");
        if (getOneDriveConfiguration() != null)
            sb.append("OneDriveConfiguration: ").append(getOneDriveConfiguration()).append(",");
        if (getServiceNowConfiguration() != null)
            sb.append("ServiceNowConfiguration: ").append(getServiceNowConfiguration()).append(",");
        if (getConfluenceConfiguration() != null)
            sb.append("ConfluenceConfiguration: ").append(getConfluenceConfiguration()).append(",");
        if (getGoogleDriveConfiguration() != null)
            sb.append("GoogleDriveConfiguration: ").append(getGoogleDriveConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getSharePointConfiguration() == null ^ this.getSharePointConfiguration() == null)
            return false;
        if (other.getSharePointConfiguration() != null && other.getSharePointConfiguration().equals(this.getSharePointConfiguration()) == false)
            return false;
        if (other.getDatabaseConfiguration() == null ^ this.getDatabaseConfiguration() == null)
            return false;
        if (other.getDatabaseConfiguration() != null && other.getDatabaseConfiguration().equals(this.getDatabaseConfiguration()) == false)
            return false;
        if (other.getSalesforceConfiguration() == null ^ this.getSalesforceConfiguration() == null)
            return false;
        if (other.getSalesforceConfiguration() != null && other.getSalesforceConfiguration().equals(this.getSalesforceConfiguration()) == false)
            return false;
        if (other.getOneDriveConfiguration() == null ^ this.getOneDriveConfiguration() == null)
            return false;
        if (other.getOneDriveConfiguration() != null && other.getOneDriveConfiguration().equals(this.getOneDriveConfiguration()) == false)
            return false;
        if (other.getServiceNowConfiguration() == null ^ this.getServiceNowConfiguration() == null)
            return false;
        if (other.getServiceNowConfiguration() != null && other.getServiceNowConfiguration().equals(this.getServiceNowConfiguration()) == false)
            return false;
        if (other.getConfluenceConfiguration() == null ^ this.getConfluenceConfiguration() == null)
            return false;
        if (other.getConfluenceConfiguration() != null && other.getConfluenceConfiguration().equals(this.getConfluenceConfiguration()) == false)
            return false;
        if (other.getGoogleDriveConfiguration() == null ^ this.getGoogleDriveConfiguration() == null)
            return false;
        if (other.getGoogleDriveConfiguration() != null && other.getGoogleDriveConfiguration().equals(this.getGoogleDriveConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getSharePointConfiguration() == null) ? 0 : getSharePointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDatabaseConfiguration() == null) ? 0 : getDatabaseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSalesforceConfiguration() == null) ? 0 : getSalesforceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOneDriveConfiguration() == null) ? 0 : getOneDriveConfiguration().hashCode());
        hashCode = prime * hashCode + ((getServiceNowConfiguration() == null) ? 0 : getServiceNowConfiguration().hashCode());
        hashCode = prime * hashCode + ((getConfluenceConfiguration() == null) ? 0 : getConfluenceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getGoogleDriveConfiguration() == null) ? 0 : getGoogleDriveConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfiguration clone() {
        try {
            return (DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
