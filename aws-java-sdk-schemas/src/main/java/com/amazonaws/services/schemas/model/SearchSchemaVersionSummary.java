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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/SearchSchemaVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSchemaVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The version number of the schema
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The type of schema.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     * 
     * @param createdDate
     *        The date the schema version was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     * 
     * @return The date the schema version was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     * 
     * @param createdDate
     *        The date the schema version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSchemaVersionSummary withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     * 
     * @param schemaVersion
     *        The version number of the schema
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     * 
     * @return The version number of the schema
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     * 
     * @param schemaVersion
     *        The version number of the schema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSchemaVersionSummary withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The type of schema.
     * </p>
     * 
     * @param type
     *        The type of schema.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of schema.
     * </p>
     * 
     * @return The type of schema.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of schema.
     * </p>
     * 
     * @param type
     *        The type of schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public SearchSchemaVersionSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of schema.
     * </p>
     * 
     * @param type
     *        The type of schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public SearchSchemaVersionSummary withType(Type type) {
        this.type = type.toString();
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSchemaVersionSummary == false)
            return false;
        SearchSchemaVersionSummary other = (SearchSchemaVersionSummary) obj;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SearchSchemaVersionSummary clone() {
        try {
            return (SearchSchemaVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.schemas.model.transform.SearchSchemaVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
