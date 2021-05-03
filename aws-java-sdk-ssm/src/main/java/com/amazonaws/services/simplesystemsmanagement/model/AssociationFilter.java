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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociationFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated.
     * </p>
     * </note>
     */
    private String key;
    /**
     * <p>
     * The filter value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated.
     * </p>
     * </note>
     * 
     * @param key
     *        The name of the filter.</p> <note>
     *        <p>
     *        <code>InstanceId</code> has been deprecated.
     *        </p>
     * @see AssociationFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated.
     * </p>
     * </note>
     * 
     * @return The name of the filter.</p> <note>
     *         <p>
     *         <code>InstanceId</code> has been deprecated.
     *         </p>
     * @see AssociationFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated.
     * </p>
     * </note>
     * 
     * @param key
     *        The name of the filter.</p> <note>
     *        <p>
     *        <code>InstanceId</code> has been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationFilterKey
     */

    public AssociationFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated.
     * </p>
     * </note>
     * 
     * @param key
     *        The name of the filter.</p> <note>
     *        <p>
     *        <code>InstanceId</code> has been deprecated.
     *        </p>
     * @see AssociationFilterKey
     */

    public void setKey(AssociationFilterKey key) {
        withKey(key);
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated.
     * </p>
     * </note>
     * 
     * @param key
     *        The name of the filter.</p> <note>
     *        <p>
     *        <code>InstanceId</code> has been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationFilterKey
     */

    public AssociationFilter withKey(AssociationFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     * 
     * @param value
     *        The filter value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     * 
     * @return The filter value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     * 
     * @param value
     *        The filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationFilter withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationFilter == false)
            return false;
        AssociationFilter other = (AssociationFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AssociationFilter clone() {
        try {
            return (AssociationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AssociationFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
