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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary information for the data catalog, which includes its name and type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DataCatalogSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCatalogSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data catalog.
     * </p>
     */
    private String catalogName;
    /**
     * <p>
     * The data catalog type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the data catalog.
     * </p>
     * 
     * @param catalogName
     *        The name of the data catalog.
     */

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * <p>
     * The name of the data catalog.
     * </p>
     * 
     * @return The name of the data catalog.
     */

    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * <p>
     * The name of the data catalog.
     * </p>
     * 
     * @param catalogName
     *        The name of the data catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogSummary withCatalogName(String catalogName) {
        setCatalogName(catalogName);
        return this;
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * 
     * @param type
     *        The data catalog type.
     * @see DataCatalogType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * 
     * @return The data catalog type.
     * @see DataCatalogType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * 
     * @param type
     *        The data catalog type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCatalogType
     */

    public DataCatalogSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * 
     * @param type
     *        The data catalog type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCatalogType
     */

    public DataCatalogSummary withType(DataCatalogType type) {
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
        if (getCatalogName() != null)
            sb.append("CatalogName: ").append(getCatalogName()).append(",");
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

        if (obj instanceof DataCatalogSummary == false)
            return false;
        DataCatalogSummary other = (DataCatalogSummary) obj;
        if (other.getCatalogName() == null ^ this.getCatalogName() == null)
            return false;
        if (other.getCatalogName() != null && other.getCatalogName().equals(this.getCatalogName()) == false)
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

        hashCode = prime * hashCode + ((getCatalogName() == null) ? 0 : getCatalogName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DataCatalogSummary clone() {
        try {
            return (DataCatalogSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.DataCatalogSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
