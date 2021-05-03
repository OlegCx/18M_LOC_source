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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the registry.
     * </p>
     */
    private String registryName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     */
    private String registryArn;
    /**
     * <p>
     * The name of the schema.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * A description of schema if specified when created
     * </p>
     */
    private String description;
    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * </p>
     */
    private String dataFormat;
    /**
     * <p>
     * The compatibility mode of the schema.
     * </p>
     */
    private String compatibility;
    /**
     * <p>
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * </p>
     */
    private Long schemaCheckpoint;
    /**
     * <p>
     * The latest version of the schema associated with the returned schema definition.
     * </p>
     */
    private Long latestSchemaVersion;
    /**
     * <p>
     * The next version of the schema associated with the returned schema definition.
     * </p>
     */
    private Long nextSchemaVersion;
    /**
     * <p>
     * The status of the schema.
     * </p>
     */
    private String schemaStatus;
    /**
     * <p>
     * The date and time the schema was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * The date and time the schema was updated.
     * </p>
     */
    private String updatedTime;

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @param registryName
     *        The name of the registry.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @return The name of the registry.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @param registryName
     *        The name of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the registry.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the registry.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
        return this;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @return The name of the schema.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schema.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * A description of schema if specified when created
     * </p>
     * 
     * @param description
     *        A description of schema if specified when created
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of schema if specified when created
     * </p>
     * 
     * @return A description of schema if specified when created
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of schema if specified when created
     * </p>
     * 
     * @param description
     *        A description of schema if specified when created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * @see DataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * </p>
     * 
     * @return The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * @see DataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public GetSchemaResult withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently only <code>AVRO</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public GetSchemaResult withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The compatibility mode of the schema.
     * </p>
     * 
     * @param compatibility
     *        The compatibility mode of the schema.
     * @see Compatibility
     */

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    /**
     * <p>
     * The compatibility mode of the schema.
     * </p>
     * 
     * @return The compatibility mode of the schema.
     * @see Compatibility
     */

    public String getCompatibility() {
        return this.compatibility;
    }

    /**
     * <p>
     * The compatibility mode of the schema.
     * </p>
     * 
     * @param compatibility
     *        The compatibility mode of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public GetSchemaResult withCompatibility(String compatibility) {
        setCompatibility(compatibility);
        return this;
    }

    /**
     * <p>
     * The compatibility mode of the schema.
     * </p>
     * 
     * @param compatibility
     *        The compatibility mode of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public GetSchemaResult withCompatibility(Compatibility compatibility) {
        this.compatibility = compatibility.toString();
        return this;
    }

    /**
     * <p>
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * </p>
     * 
     * @param schemaCheckpoint
     *        The version number of the checkpoint (the last time the compatibility mode was changed).
     */

    public void setSchemaCheckpoint(Long schemaCheckpoint) {
        this.schemaCheckpoint = schemaCheckpoint;
    }

    /**
     * <p>
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * </p>
     * 
     * @return The version number of the checkpoint (the last time the compatibility mode was changed).
     */

    public Long getSchemaCheckpoint() {
        return this.schemaCheckpoint;
    }

    /**
     * <p>
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * </p>
     * 
     * @param schemaCheckpoint
     *        The version number of the checkpoint (the last time the compatibility mode was changed).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withSchemaCheckpoint(Long schemaCheckpoint) {
        setSchemaCheckpoint(schemaCheckpoint);
        return this;
    }

    /**
     * <p>
     * The latest version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @param latestSchemaVersion
     *        The latest version of the schema associated with the returned schema definition.
     */

    public void setLatestSchemaVersion(Long latestSchemaVersion) {
        this.latestSchemaVersion = latestSchemaVersion;
    }

    /**
     * <p>
     * The latest version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @return The latest version of the schema associated with the returned schema definition.
     */

    public Long getLatestSchemaVersion() {
        return this.latestSchemaVersion;
    }

    /**
     * <p>
     * The latest version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @param latestSchemaVersion
     *        The latest version of the schema associated with the returned schema definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withLatestSchemaVersion(Long latestSchemaVersion) {
        setLatestSchemaVersion(latestSchemaVersion);
        return this;
    }

    /**
     * <p>
     * The next version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @param nextSchemaVersion
     *        The next version of the schema associated with the returned schema definition.
     */

    public void setNextSchemaVersion(Long nextSchemaVersion) {
        this.nextSchemaVersion = nextSchemaVersion;
    }

    /**
     * <p>
     * The next version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @return The next version of the schema associated with the returned schema definition.
     */

    public Long getNextSchemaVersion() {
        return this.nextSchemaVersion;
    }

    /**
     * <p>
     * The next version of the schema associated with the returned schema definition.
     * </p>
     * 
     * @param nextSchemaVersion
     *        The next version of the schema associated with the returned schema definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withNextSchemaVersion(Long nextSchemaVersion) {
        setNextSchemaVersion(nextSchemaVersion);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @see SchemaStatus
     */

    public void setSchemaStatus(String schemaStatus) {
        this.schemaStatus = schemaStatus;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @return The status of the schema.
     * @see SchemaStatus
     */

    public String getSchemaStatus() {
        return this.schemaStatus;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public GetSchemaResult withSchemaStatus(String schemaStatus) {
        setSchemaStatus(schemaStatus);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public GetSchemaResult withSchemaStatus(SchemaStatus schemaStatus) {
        this.schemaStatus = schemaStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the schema was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the schema was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the schema was created.
     * </p>
     * 
     * @return The date and time the schema was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the schema was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the schema was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date and time the schema was updated.
     * </p>
     * 
     * @param updatedTime
     *        The date and time the schema was updated.
     */

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The date and time the schema was updated.
     * </p>
     * 
     * @return The date and time the schema was updated.
     */

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The date and time the schema was updated.
     * </p>
     * 
     * @param updatedTime
     *        The date and time the schema was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaResult withUpdatedTime(String updatedTime) {
        setUpdatedTime(updatedTime);
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
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getCompatibility() != null)
            sb.append("Compatibility: ").append(getCompatibility()).append(",");
        if (getSchemaCheckpoint() != null)
            sb.append("SchemaCheckpoint: ").append(getSchemaCheckpoint()).append(",");
        if (getLatestSchemaVersion() != null)
            sb.append("LatestSchemaVersion: ").append(getLatestSchemaVersion()).append(",");
        if (getNextSchemaVersion() != null)
            sb.append("NextSchemaVersion: ").append(getNextSchemaVersion()).append(",");
        if (getSchemaStatus() != null)
            sb.append("SchemaStatus: ").append(getSchemaStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSchemaResult == false)
            return false;
        GetSchemaResult other = (GetSchemaResult) obj;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getCompatibility() == null ^ this.getCompatibility() == null)
            return false;
        if (other.getCompatibility() != null && other.getCompatibility().equals(this.getCompatibility()) == false)
            return false;
        if (other.getSchemaCheckpoint() == null ^ this.getSchemaCheckpoint() == null)
            return false;
        if (other.getSchemaCheckpoint() != null && other.getSchemaCheckpoint().equals(this.getSchemaCheckpoint()) == false)
            return false;
        if (other.getLatestSchemaVersion() == null ^ this.getLatestSchemaVersion() == null)
            return false;
        if (other.getLatestSchemaVersion() != null && other.getLatestSchemaVersion().equals(this.getLatestSchemaVersion()) == false)
            return false;
        if (other.getNextSchemaVersion() == null ^ this.getNextSchemaVersion() == null)
            return false;
        if (other.getNextSchemaVersion() != null && other.getNextSchemaVersion().equals(this.getNextSchemaVersion()) == false)
            return false;
        if (other.getSchemaStatus() == null ^ this.getSchemaStatus() == null)
            return false;
        if (other.getSchemaStatus() != null && other.getSchemaStatus().equals(this.getSchemaStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getCompatibility() == null) ? 0 : getCompatibility().hashCode());
        hashCode = prime * hashCode + ((getSchemaCheckpoint() == null) ? 0 : getSchemaCheckpoint().hashCode());
        hashCode = prime * hashCode + ((getLatestSchemaVersion() == null) ? 0 : getLatestSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getNextSchemaVersion() == null) ? 0 : getNextSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getSchemaStatus() == null) ? 0 : getSchemaStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaResult clone() {
        try {
            return (GetSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
