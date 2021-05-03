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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows you to add filters when you use the search function in Secrets Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters your list of secrets by a specific key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Filters your list of secrets by a specific value.
     * </p>
     * <p>
     * You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation filters.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * Filters your list of secrets by a specific key.
     * </p>
     * 
     * @param key
     *        Filters your list of secrets by a specific key.
     * @see FilterNameStringType
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Filters your list of secrets by a specific key.
     * </p>
     * 
     * @return Filters your list of secrets by a specific key.
     * @see FilterNameStringType
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Filters your list of secrets by a specific key.
     * </p>
     * 
     * @param key
     *        Filters your list of secrets by a specific key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterNameStringType
     */

    public Filter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Filters your list of secrets by a specific key.
     * </p>
     * 
     * @param key
     *        Filters your list of secrets by a specific key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterNameStringType
     */

    public Filter withKey(FilterNameStringType key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * Filters your list of secrets by a specific value.
     * </p>
     * <p>
     * You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation filters.
     * </p>
     * 
     * @return Filters your list of secrets by a specific value.</p>
     *         <p>
     *         You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation
     *         filters.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * Filters your list of secrets by a specific value.
     * </p>
     * <p>
     * You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation filters.
     * </p>
     * 
     * @param values
     *        Filters your list of secrets by a specific value.</p>
     *        <p>
     *        You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation
     *        filters.
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
     * Filters your list of secrets by a specific value.
     * </p>
     * <p>
     * You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        Filters your list of secrets by a specific value.</p>
     *        <p>
     *        You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation
     *        filters.
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
     * Filters your list of secrets by a specific value.
     * </p>
     * <p>
     * You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation filters.
     * </p>
     * 
     * @param values
     *        Filters your list of secrets by a specific value.</p>
     *        <p>
     *        You can prefix your search value with an exclamation mark (<code>!</code>) in order to perform negation
     *        filters.
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
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
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
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
        com.amazonaws.services.secretsmanager.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
