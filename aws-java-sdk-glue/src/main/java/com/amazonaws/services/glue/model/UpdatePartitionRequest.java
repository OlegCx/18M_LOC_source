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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdatePartition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePartitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account ID is
     * used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database in which the table in question resides.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table in which the partition to be updated is located.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * List of partition key values that define the partition to update.
     * </p>
     */
    private java.util.List<String> partitionValueList;
    /**
     * <p>
     * The new partition object to update the partition to.
     * </p>
     * <p>
     * The <code>Values</code> property can't be changed. If you want to change the partition key values for a
     * partition, delete and recreate the partition.
     * </p>
     */
    private PartitionInput partitionInput;

    /**
     * <p>
     * The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account
     *        ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS
     *         account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account
     *        ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartitionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database in which the table in question resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database in which the table in question resides.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the table in question resides.
     * </p>
     * 
     * @return The name of the catalog database in which the table in question resides.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the table in question resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database in which the table in question resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartitionRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table in which the partition to be updated is located.
     * </p>
     * 
     * @param tableName
     *        The name of the table in which the partition to be updated is located.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table in which the partition to be updated is located.
     * </p>
     * 
     * @return The name of the table in which the partition to be updated is located.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table in which the partition to be updated is located.
     * </p>
     * 
     * @param tableName
     *        The name of the table in which the partition to be updated is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartitionRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * List of partition key values that define the partition to update.
     * </p>
     * 
     * @return List of partition key values that define the partition to update.
     */

    public java.util.List<String> getPartitionValueList() {
        return partitionValueList;
    }

    /**
     * <p>
     * List of partition key values that define the partition to update.
     * </p>
     * 
     * @param partitionValueList
     *        List of partition key values that define the partition to update.
     */

    public void setPartitionValueList(java.util.Collection<String> partitionValueList) {
        if (partitionValueList == null) {
            this.partitionValueList = null;
            return;
        }

        this.partitionValueList = new java.util.ArrayList<String>(partitionValueList);
    }

    /**
     * <p>
     * List of partition key values that define the partition to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionValueList(java.util.Collection)} or {@link #withPartitionValueList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param partitionValueList
     *        List of partition key values that define the partition to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartitionRequest withPartitionValueList(String... partitionValueList) {
        if (this.partitionValueList == null) {
            setPartitionValueList(new java.util.ArrayList<String>(partitionValueList.length));
        }
        for (String ele : partitionValueList) {
            this.partitionValueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of partition key values that define the partition to update.
     * </p>
     * 
     * @param partitionValueList
     *        List of partition key values that define the partition to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartitionRequest withPartitionValueList(java.util.Collection<String> partitionValueList) {
        setPartitionValueList(partitionValueList);
        return this;
    }

    /**
     * <p>
     * The new partition object to update the partition to.
     * </p>
     * <p>
     * The <code>Values</code> property can't be changed. If you want to change the partition key values for a
     * partition, delete and recreate the partition.
     * </p>
     * 
     * @param partitionInput
     *        The new partition object to update the partition to.</p>
     *        <p>
     *        The <code>Values</code> property can't be changed. If you want to change the partition key values for a
     *        partition, delete and recreate the partition.
     */

    public void setPartitionInput(PartitionInput partitionInput) {
        this.partitionInput = partitionInput;
    }

    /**
     * <p>
     * The new partition object to update the partition to.
     * </p>
     * <p>
     * The <code>Values</code> property can't be changed. If you want to change the partition key values for a
     * partition, delete and recreate the partition.
     * </p>
     * 
     * @return The new partition object to update the partition to.</p>
     *         <p>
     *         The <code>Values</code> property can't be changed. If you want to change the partition key values for a
     *         partition, delete and recreate the partition.
     */

    public PartitionInput getPartitionInput() {
        return this.partitionInput;
    }

    /**
     * <p>
     * The new partition object to update the partition to.
     * </p>
     * <p>
     * The <code>Values</code> property can't be changed. If you want to change the partition key values for a
     * partition, delete and recreate the partition.
     * </p>
     * 
     * @param partitionInput
     *        The new partition object to update the partition to.</p>
     *        <p>
     *        The <code>Values</code> property can't be changed. If you want to change the partition key values for a
     *        partition, delete and recreate the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartitionRequest withPartitionInput(PartitionInput partitionInput) {
        setPartitionInput(partitionInput);
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
        if (getPartitionValueList() != null)
            sb.append("PartitionValueList: ").append(getPartitionValueList()).append(",");
        if (getPartitionInput() != null)
            sb.append("PartitionInput: ").append(getPartitionInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePartitionRequest == false)
            return false;
        UpdatePartitionRequest other = (UpdatePartitionRequest) obj;
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
        if (other.getPartitionValueList() == null ^ this.getPartitionValueList() == null)
            return false;
        if (other.getPartitionValueList() != null && other.getPartitionValueList().equals(this.getPartitionValueList()) == false)
            return false;
        if (other.getPartitionInput() == null ^ this.getPartitionInput() == null)
            return false;
        if (other.getPartitionInput() != null && other.getPartitionInput().equals(this.getPartitionInput()) == false)
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
        hashCode = prime * hashCode + ((getPartitionValueList() == null) ? 0 : getPartitionValueList().hashCode());
        hashCode = prime * hashCode + ((getPartitionInput() == null) ? 0 : getPartitionInput().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePartitionRequest clone() {
        return (UpdatePartitionRequest) super.clone();
    }

}
