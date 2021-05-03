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
 * Contains metadata for a column in a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/Column" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Column implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the column.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Optional information about the column.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param name
     *        The name of the column.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @return The name of the column.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param name
     *        The name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Column withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param type
     *        The data type of the column.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @return The data type of the column.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param type
     *        The data type of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Column withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Optional information about the column.
     * </p>
     * 
     * @param comment
     *        Optional information about the column.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Optional information about the column.
     * </p>
     * 
     * @return Optional information about the column.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Optional information about the column.
     * </p>
     * 
     * @param comment
     *        Optional information about the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Column withComment(String comment) {
        setComment(comment);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Column == false)
            return false;
        Column other = (Column) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public Column clone() {
        try {
            return (Column) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
