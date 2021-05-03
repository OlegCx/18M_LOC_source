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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A column in a <code>Table</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Column" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Column implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the <code>Column</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the <code>Column</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A free-form text comment.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * These key-value pairs define properties associated with the column.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The name of the <code>Column</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>Column</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>Column</code>.
     * </p>
     * 
     * @return The name of the <code>Column</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>Column</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>Column</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Column withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the <code>Column</code>.
     * </p>
     * 
     * @param type
     *        The data type of the <code>Column</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the <code>Column</code>.
     * </p>
     * 
     * @return The data type of the <code>Column</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the <code>Column</code>.
     * </p>
     * 
     * @param type
     *        The data type of the <code>Column</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Column withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A free-form text comment.
     * </p>
     * 
     * @param comment
     *        A free-form text comment.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A free-form text comment.
     * </p>
     * 
     * @return A free-form text comment.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A free-form text comment.
     * </p>
     * 
     * @param comment
     *        A free-form text comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Column withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the column.
     * </p>
     * 
     * @return These key-value pairs define properties associated with the column.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the column.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define properties associated with the column.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the column.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define properties associated with the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Column withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see Column#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Column addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Column clearParametersEntries() {
        this.parameters = null;
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
            sb.append("Comment: ").append(getComment()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
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
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
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
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
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
        com.amazonaws.services.glue.model.transform.ColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
