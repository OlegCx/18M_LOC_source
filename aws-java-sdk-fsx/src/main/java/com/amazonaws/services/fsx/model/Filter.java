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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter used to restrict the results of describe calls. You can use multiple filters to return results that meet all
 * applied filter requirements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/Filter" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for this filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The values of the filter. These are all the values for any of the applied filters.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name for this filter.
     * </p>
     * 
     * @param name
     *        The name for this filter.
     * @see FilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for this filter.
     * </p>
     * 
     * @return The name for this filter.
     * @see FilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for this filter.
     * </p>
     * 
     * @param name
     *        The name for this filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterName
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name for this filter.
     * </p>
     * 
     * @param name
     *        The name for this filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterName
     */

    public Filter withName(FilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The values of the filter. These are all the values for any of the applied filters.
     * </p>
     * 
     * @return The values of the filter. These are all the values for any of the applied filters.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the filter. These are all the values for any of the applied filters.
     * </p>
     * 
     * @param values
     *        The values of the filter. These are all the values for any of the applied filters.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The values of the filter. These are all the values for any of the applied filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of the filter. These are all the values for any of the applied filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values of the filter. These are all the values for any of the applied filters.
     * </p>
     * 
     * @param values
     *        The values of the filter. These are all the values for any of the applied filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
