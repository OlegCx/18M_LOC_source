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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters to use when listing TagOptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListTagOptionsFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagOptionsFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The TagOption key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The TagOption value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The active state.
     * </p>
     */
    private Boolean active;

    /**
     * <p>
     * The TagOption key.
     * </p>
     * 
     * @param key
     *        The TagOption key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The TagOption key.
     * </p>
     * 
     * @return The TagOption key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The TagOption key.
     * </p>
     * 
     * @param key
     *        The TagOption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagOptionsFilters withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The TagOption value.
     * </p>
     * 
     * @param value
     *        The TagOption value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The TagOption value.
     * </p>
     * 
     * @return The TagOption value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The TagOption value.
     * </p>
     * 
     * @param value
     *        The TagOption value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagOptionsFilters withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The active state.
     * </p>
     * 
     * @param active
     *        The active state.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * The active state.
     * </p>
     * 
     * @return The active state.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * The active state.
     * </p>
     * 
     * @param active
     *        The active state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagOptionsFilters withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * The active state.
     * </p>
     * 
     * @return The active state.
     */

    public Boolean isActive() {
        return this.active;
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
            sb.append("Value: ").append(getValue()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagOptionsFilters == false)
            return false;
        ListTagOptionsFilters other = (ListTagOptionsFilters) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        return hashCode;
    }

    @Override
    public ListTagOptionsFilters clone() {
        try {
            return (ListTagOptionsFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ListTagOptionsFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
