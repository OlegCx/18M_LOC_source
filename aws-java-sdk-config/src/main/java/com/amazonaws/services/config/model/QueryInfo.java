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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/QueryInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns a <code>FieldInfo</code> object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FieldInfo> selectFields;

    /**
     * <p>
     * Returns a <code>FieldInfo</code> object.
     * </p>
     * 
     * @return Returns a <code>FieldInfo</code> object.
     */

    public java.util.List<FieldInfo> getSelectFields() {
        if (selectFields == null) {
            selectFields = new com.amazonaws.internal.SdkInternalList<FieldInfo>();
        }
        return selectFields;
    }

    /**
     * <p>
     * Returns a <code>FieldInfo</code> object.
     * </p>
     * 
     * @param selectFields
     *        Returns a <code>FieldInfo</code> object.
     */

    public void setSelectFields(java.util.Collection<FieldInfo> selectFields) {
        if (selectFields == null) {
            this.selectFields = null;
            return;
        }

        this.selectFields = new com.amazonaws.internal.SdkInternalList<FieldInfo>(selectFields);
    }

    /**
     * <p>
     * Returns a <code>FieldInfo</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectFields(java.util.Collection)} or {@link #withSelectFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param selectFields
     *        Returns a <code>FieldInfo</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryInfo withSelectFields(FieldInfo... selectFields) {
        if (this.selectFields == null) {
            setSelectFields(new com.amazonaws.internal.SdkInternalList<FieldInfo>(selectFields.length));
        }
        for (FieldInfo ele : selectFields) {
            this.selectFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a <code>FieldInfo</code> object.
     * </p>
     * 
     * @param selectFields
     *        Returns a <code>FieldInfo</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryInfo withSelectFields(java.util.Collection<FieldInfo> selectFields) {
        setSelectFields(selectFields);
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
        if (getSelectFields() != null)
            sb.append("SelectFields: ").append(getSelectFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryInfo == false)
            return false;
        QueryInfo other = (QueryInfo) obj;
        if (other.getSelectFields() == null ^ this.getSelectFields() == null)
            return false;
        if (other.getSelectFields() != null && other.getSelectFields().equals(this.getSelectFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectFields() == null) ? 0 : getSelectFields().hashCode());
        return hashCode;
    }

    @Override
    public QueryInfo clone() {
        try {
            return (QueryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.QueryInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
