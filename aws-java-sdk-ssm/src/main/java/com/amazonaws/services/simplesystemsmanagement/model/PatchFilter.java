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
 * Defines which patches should be included in a patch baseline.
 * </p>
 * <p>
 * A patch filter consists of a key and a set of values. The filter key is a patch property. For example, the available
 * filter keys for WINDOWS are PATCH_SET, PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, and MSRC_SEVERITY. The filter values
 * define a matching criterion for the patch property indicated by the key. For example, if the filter key is PRODUCT
 * and the filter values are ["Office 2013", "Office 2016"], then the filter accepts all patches where product name is
 * either "Office 2013" or "Office 2016". The filter values can be exact values for the patch property given as a key,
 * or a wildcard (*), which matches all values.
 * </p>
 * <p>
 * You can view lists of valid values for the patch properties by running the <code>DescribePatchProperties</code>
 * command. For information about which patch properties can be used with each major operating system, see
 * <a>DescribePatchProperties</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on operating
     * system type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * </p>
     * 
     * @param key
     *        The key for the filter.</p>
     *        <p>
     *        Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * @see PatchFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * </p>
     * 
     * @return The key for the filter.</p>
     *         <p>
     *         Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system
     *         type.
     * @see PatchFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * </p>
     * 
     * @param key
     *        The key for the filter.</p>
     *        <p>
     *        Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchFilterKey
     */

    public PatchFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * </p>
     * 
     * @param key
     *        The key for the filter.</p>
     *        <p>
     *        Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * @see PatchFilterKey
     */

    public void setKey(PatchFilterKey key) {
        withKey(key);
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * </p>
     * 
     * @param key
     *        The key for the filter.</p>
     *        <p>
     *        Run the <a>DescribePatchProperties</a> command to view lists of valid keys for each operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchFilterKey
     */

    public PatchFilter withKey(PatchFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on operating
     * system type.
     * </p>
     * 
     * @return The value for the filter key.</p>
     *         <p>
     *         Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on
     *         operating system type.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on operating
     * system type.
     * </p>
     * 
     * @param values
     *        The value for the filter key.</p>
     *        <p>
     *        Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on
     *        operating system type.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on operating
     * system type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value for the filter key.</p>
     *        <p>
     *        Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on
     *        operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on operating
     * system type.
     * </p>
     * 
     * @param values
     *        The value for the filter key.</p>
     *        <p>
     *        Run the <a>DescribePatchProperties</a> command to view lists of valid values for each key based on
     *        operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof PatchFilter == false)
            return false;
        PatchFilter other = (PatchFilter) obj;
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
    public PatchFilter clone() {
        try {
            return (PatchFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
