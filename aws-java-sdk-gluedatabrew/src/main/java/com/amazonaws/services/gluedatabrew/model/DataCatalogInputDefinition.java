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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents how metadata stored in the AWS Glue Data Catalog is defined in a DataBrew dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DataCatalogInputDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCatalogInputDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of a database in the Data Catalog.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     * </p>
     */
    private S3Location tempDirectory;

    /**
     * <p>
     * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     * </p>
     * 
     * @param catalogId
     *        The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     * </p>
     * 
     * @return The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     * </p>
     * 
     * @param catalogId
     *        The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogInputDefinition withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of a database in the Data Catalog.
     * </p>
     * 
     * @param databaseName
     *        The name of a database in the Data Catalog.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of a database in the Data Catalog.
     * </p>
     * 
     * @return The name of a database in the Data Catalog.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of a database in the Data Catalog.
     * </p>
     * 
     * @param databaseName
     *        The name of a database in the Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogInputDefinition withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
     * </p>
     * 
     * @param tableName
     *        The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
     * </p>
     * 
     * @return The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
     * </p>
     * 
     * @param tableName
     *        The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogInputDefinition withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     * </p>
     * 
     * @param tempDirectory
     *        An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     */

    public void setTempDirectory(S3Location tempDirectory) {
        this.tempDirectory = tempDirectory;
    }

    /**
     * <p>
     * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     * </p>
     * 
     * @return An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     */

    public S3Location getTempDirectory() {
        return this.tempDirectory;
    }

    /**
     * <p>
     * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     * </p>
     * 
     * @param tempDirectory
     *        An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogInputDefinition withTempDirectory(S3Location tempDirectory) {
        setTempDirectory(tempDirectory);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTempDirectory() != null)
            sb.append("TempDirectory: ").append(getTempDirectory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCatalogInputDefinition == false)
            return false;
        DataCatalogInputDefinition other = (DataCatalogInputDefinition) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTempDirectory() == null ^ this.getTempDirectory() == null)
            return false;
        if (other.getTempDirectory() != null && other.getTempDirectory().equals(this.getTempDirectory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTempDirectory() == null) ? 0 : getTempDirectory().hashCode());
        return hashCode;
    }

    @Override
    public DataCatalogInputDefinition clone() {
        try {
            return (DataCatalogInputDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.DataCatalogInputDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
