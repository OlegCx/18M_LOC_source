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
 * One or more filters. Use a filter to return a more specific list of results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ParameterStringFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterStringFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <note>
     * <p>
     * The <code>ParameterStringFilter</code> object is used by the <a>DescribeParameters</a> and
     * <a>GetParametersByPath</a> API actions. However, not all of the pattern values listed for <code>Key</code> can be
     * used with both actions.
     * </p>
     * <p>
     * For <code>DescribeActions</code>, all of the listed patterns are valid, with the exception of <code>Label</code>.
     * </p>
     * <p>
     * For <code>GetParametersByPath</code>, the following patterns listed for <code>Key</code> are not valid:
     * <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.
     * </p>
     * <p>
     * For examples of CLI commands demonstrating valid parameter filter constructions, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html">Searching for Systems
     * Manager parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     */
    private String key;
    /**
     * <p>
     * For all filters used with <a>DescribeParameters</a>, valid options include <code>Equals</code> and
     * <code>BeginsWith</code>. The <code>Name</code> filter additionally supports the <code>Contains</code> option.
     * (Exception: For filters using the key <code>Path</code>, valid options include <code>Recursive</code> and
     * <code>OneLevel</code>.)
     * </p>
     * <p>
     * For filters used with <a>GetParametersByPath</a>, valid options include <code>Equals</code> and
     * <code>BeginsWith</code>. (Exception: For filters using <code>Label</code> as the Key name, the only valid option
     * is <code>Equals</code>.)
     * </p>
     */
    private String option;
    /**
     * <p>
     * The value you want to search for.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <note>
     * <p>
     * The <code>ParameterStringFilter</code> object is used by the <a>DescribeParameters</a> and
     * <a>GetParametersByPath</a> API actions. However, not all of the pattern values listed for <code>Key</code> can be
     * used with both actions.
     * </p>
     * <p>
     * For <code>DescribeActions</code>, all of the listed patterns are valid, with the exception of <code>Label</code>.
     * </p>
     * <p>
     * For <code>GetParametersByPath</code>, the following patterns listed for <code>Key</code> are not valid:
     * <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.
     * </p>
     * <p>
     * For examples of CLI commands demonstrating valid parameter filter constructions, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html">Searching for Systems
     * Manager parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param key
     *        The name of the filter.</p> <note>
     *        <p>
     *        The <code>ParameterStringFilter</code> object is used by the <a>DescribeParameters</a> and
     *        <a>GetParametersByPath</a> API actions. However, not all of the pattern values listed for <code>Key</code>
     *        can be used with both actions.
     *        </p>
     *        <p>
     *        For <code>DescribeActions</code>, all of the listed patterns are valid, with the exception of
     *        <code>Label</code>.
     *        </p>
     *        <p>
     *        For <code>GetParametersByPath</code>, the following patterns listed for <code>Key</code> are not valid:
     *        <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.
     *        </p>
     *        <p>
     *        For examples of CLI commands demonstrating valid parameter filter constructions, see <a
     *        href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html">Searching for
     *        Systems Manager parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     *        </p>
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
     * The <code>ParameterStringFilter</code> object is used by the <a>DescribeParameters</a> and
     * <a>GetParametersByPath</a> API actions. However, not all of the pattern values listed for <code>Key</code> can be
     * used with both actions.
     * </p>
     * <p>
     * For <code>DescribeActions</code>, all of the listed patterns are valid, with the exception of <code>Label</code>.
     * </p>
     * <p>
     * For <code>GetParametersByPath</code>, the following patterns listed for <code>Key</code> are not valid:
     * <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.
     * </p>
     * <p>
     * For examples of CLI commands demonstrating valid parameter filter constructions, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html">Searching for Systems
     * Manager parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The name of the filter.</p> <note>
     *         <p>
     *         The <code>ParameterStringFilter</code> object is used by the <a>DescribeParameters</a> and
     *         <a>GetParametersByPath</a> API actions. However, not all of the pattern values listed for
     *         <code>Key</code> can be used with both actions.
     *         </p>
     *         <p>
     *         For <code>DescribeActions</code>, all of the listed patterns are valid, with the exception of
     *         <code>Label</code>.
     *         </p>
     *         <p>
     *         For <code>GetParametersByPath</code>, the following patterns listed for <code>Key</code> are not valid:
     *         <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.
     *         </p>
     *         <p>
     *         For examples of CLI commands demonstrating valid parameter filter constructions, see <a
     *         href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html">Searching for
     *         Systems Manager parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     *         </p>
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
     * The <code>ParameterStringFilter</code> object is used by the <a>DescribeParameters</a> and
     * <a>GetParametersByPath</a> API actions. However, not all of the pattern values listed for <code>Key</code> can be
     * used with both actions.
     * </p>
     * <p>
     * For <code>DescribeActions</code>, all of the listed patterns are valid, with the exception of <code>Label</code>.
     * </p>
     * <p>
     * For <code>GetParametersByPath</code>, the following patterns listed for <code>Key</code> are not valid:
     * <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.
     * </p>
     * <p>
     * For examples of CLI commands demonstrating valid parameter filter constructions, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html">Searching for Systems
     * Manager parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param key
     *        The name of the filter.</p> <note>
     *        <p>
     *        The <code>ParameterStringFilter</code> object is used by the <a>DescribeParameters</a> and
     *        <a>GetParametersByPath</a> API actions. However, not all of the pattern values listed for <code>Key</code>
     *        can be used with both actions.
     *        </p>
     *        <p>
     *        For <code>DescribeActions</code>, all of the listed patterns are valid, with the exception of
     *        <code>Label</code>.
     *        </p>
     *        <p>
     *        For <code>GetParametersByPath</code>, the following patterns listed for <code>Key</code> are not valid:
     *        <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.
     *        </p>
     *        <p>
     *        For examples of CLI commands demonstrating valid parameter filter constructions, see <a
     *        href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html">Searching for
     *        Systems Manager parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterStringFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * For all filters used with <a>DescribeParameters</a>, valid options include <code>Equals</code> and
     * <code>BeginsWith</code>. The <code>Name</code> filter additionally supports the <code>Contains</code> option.
     * (Exception: For filters using the key <code>Path</code>, valid options include <code>Recursive</code> and
     * <code>OneLevel</code>.)
     * </p>
     * <p>
     * For filters used with <a>GetParametersByPath</a>, valid options include <code>Equals</code> and
     * <code>BeginsWith</code>. (Exception: For filters using <code>Label</code> as the Key name, the only valid option
     * is <code>Equals</code>.)
     * </p>
     * 
     * @param option
     *        For all filters used with <a>DescribeParameters</a>, valid options include <code>Equals</code> and
     *        <code>BeginsWith</code>. The <code>Name</code> filter additionally supports the <code>Contains</code>
     *        option. (Exception: For filters using the key <code>Path</code>, valid options include
     *        <code>Recursive</code> and <code>OneLevel</code>.)</p>
     *        <p>
     *        For filters used with <a>GetParametersByPath</a>, valid options include <code>Equals</code> and
     *        <code>BeginsWith</code>. (Exception: For filters using <code>Label</code> as the Key name, the only valid
     *        option is <code>Equals</code>.)
     */

    public void setOption(String option) {
        this.option = option;
    }

    /**
     * <p>
     * For all filters used with <a>DescribeParameters</a>, valid options include <code>Equals</code> and
     * <code>BeginsWith</code>. The <code>Name</code> filter additionally supports the <code>Contains</code> option.
     * (Exception: For filters using the key <code>Path</code>, valid options include <code>Recursive</code> and
     * <code>OneLevel</code>.)
     * </p>
     * <p>
     * For filters used with <a>GetParametersByPath</a>, valid options include <code>Equals</code> and
     * <code>BeginsWith</code>. (Exception: For filters using <code>Label</code> as the Key name, the only valid option
     * is <code>Equals</code>.)
     * </p>
     * 
     * @return For all filters used with <a>DescribeParameters</a>, valid options include <code>Equals</code> and
     *         <code>BeginsWith</code>. The <code>Name</code> filter additionally supports the <code>Contains</code>
     *         option. (Exception: For filters using the key <code>Path</code>, valid options include
     *         <code>Recursive</code> and <code>OneLevel</code>.)</p>
     *         <p>
     *         For filters used with <a>GetParametersByPath</a>, valid options include <code>Equals</code> and
     *         <code>BeginsWith</code>. (Exception: For filters using <code>Label</code> as the Key name, the only valid
     *         option is <code>Equals</code>.)
     */

    public String getOption() {
        return this.option;
    }

    /**
     * <p>
     * For all filters used with <a>DescribeParameters</a>, valid options include <code>Equals</code> and
     * <code>BeginsWith</code>. The <code>Name</code> filter additionally supports the <code>Contains</code> option.
     * (Exception: For filters using the key <code>Path</code>, valid options include <code>Recursive</code> and
     * <code>OneLevel</code>.)
     * </p>
     * <p>
     * For filters used with <a>GetParametersByPath</a>, valid options include <code>Equals</code> and
     * <code>BeginsWith</code>. (Exception: For filters using <code>Label</code> as the Key name, the only valid option
     * is <code>Equals</code>.)
     * </p>
     * 
     * @param option
     *        For all filters used with <a>DescribeParameters</a>, valid options include <code>Equals</code> and
     *        <code>BeginsWith</code>. The <code>Name</code> filter additionally supports the <code>Contains</code>
     *        option. (Exception: For filters using the key <code>Path</code>, valid options include
     *        <code>Recursive</code> and <code>OneLevel</code>.)</p>
     *        <p>
     *        For filters used with <a>GetParametersByPath</a>, valid options include <code>Equals</code> and
     *        <code>BeginsWith</code>. (Exception: For filters using <code>Label</code> as the Key name, the only valid
     *        option is <code>Equals</code>.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterStringFilter withOption(String option) {
        setOption(option);
        return this;
    }

    /**
     * <p>
     * The value you want to search for.
     * </p>
     * 
     * @return The value you want to search for.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value you want to search for.
     * </p>
     * 
     * @param values
     *        The value you want to search for.
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
     * The value you want to search for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value you want to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterStringFilter withValues(String... values) {
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
     * The value you want to search for.
     * </p>
     * 
     * @param values
     *        The value you want to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterStringFilter withValues(java.util.Collection<String> values) {
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
        if (getOption() != null)
            sb.append("Option: ").append(getOption()).append(",");
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

        if (obj instanceof ParameterStringFilter == false)
            return false;
        ParameterStringFilter other = (ParameterStringFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getOption() == null ^ this.getOption() == null)
            return false;
        if (other.getOption() != null && other.getOption().equals(this.getOption()) == false)
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
        hashCode = prime * hashCode + ((getOption() == null) ? 0 : getOption().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public ParameterStringFilter clone() {
        try {
            return (ParameterStringFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ParameterStringFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
