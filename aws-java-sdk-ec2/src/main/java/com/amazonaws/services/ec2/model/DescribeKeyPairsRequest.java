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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeKeyPairsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyPairsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeKeyPairsRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> keyNames;
    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> keyPairIds;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>key-pair-id</code> - The ID of the key pair.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fingerprint</code> - The fingerprint of the key pair.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>key-name</code> - The name of the key pair.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         assigned a tag with a specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *         key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify
     *         <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>key-pair-id</code> - The ID of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fingerprint</code> - The fingerprint of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key-name</code> - The name of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>key-pair-id</code> - The ID of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fingerprint</code> - The fingerprint of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key-name</code> - The name of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPairsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>key-pair-id</code> - The ID of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fingerprint</code> - The fingerprint of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key-name</code> - The name of the key pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPairsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     * 
     * @return The key pair names.</p>
     *         <p>
     *         Default: Describes all your key pairs.
     */

    public java.util.List<String> getKeyNames() {
        if (keyNames == null) {
            keyNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return keyNames;
    }

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     * 
     * @param keyNames
     *        The key pair names.</p>
     *        <p>
     *        Default: Describes all your key pairs.
     */

    public void setKeyNames(java.util.Collection<String> keyNames) {
        if (keyNames == null) {
            this.keyNames = null;
            return;
        }

        this.keyNames = new com.amazonaws.internal.SdkInternalList<String>(keyNames);
    }

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyNames(java.util.Collection)} or {@link #withKeyNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keyNames
     *        The key pair names.</p>
     *        <p>
     *        Default: Describes all your key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPairsRequest withKeyNames(String... keyNames) {
        if (this.keyNames == null) {
            setKeyNames(new com.amazonaws.internal.SdkInternalList<String>(keyNames.length));
        }
        for (String ele : keyNames) {
            this.keyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     * 
     * @param keyNames
     *        The key pair names.</p>
     *        <p>
     *        Default: Describes all your key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPairsRequest withKeyNames(java.util.Collection<String> keyNames) {
        setKeyNames(keyNames);
        return this;
    }

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     * 
     * @return The IDs of the key pairs.
     */

    public java.util.List<String> getKeyPairIds() {
        if (keyPairIds == null) {
            keyPairIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return keyPairIds;
    }

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     * 
     * @param keyPairIds
     *        The IDs of the key pairs.
     */

    public void setKeyPairIds(java.util.Collection<String> keyPairIds) {
        if (keyPairIds == null) {
            this.keyPairIds = null;
            return;
        }

        this.keyPairIds = new com.amazonaws.internal.SdkInternalList<String>(keyPairIds);
    }

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPairIds(java.util.Collection)} or {@link #withKeyPairIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyPairIds
     *        The IDs of the key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPairsRequest withKeyPairIds(String... keyPairIds) {
        if (this.keyPairIds == null) {
            setKeyPairIds(new com.amazonaws.internal.SdkInternalList<String>(keyPairIds.length));
        }
        for (String ele : keyPairIds) {
            this.keyPairIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     * 
     * @param keyPairIds
     *        The IDs of the key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPairsRequest withKeyPairIds(java.util.Collection<String> keyPairIds) {
        setKeyPairIds(keyPairIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeKeyPairsRequest> getDryRunRequest() {
        Request<DescribeKeyPairsRequest> request = new DescribeKeyPairsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getKeyNames() != null)
            sb.append("KeyNames: ").append(getKeyNames()).append(",");
        if (getKeyPairIds() != null)
            sb.append("KeyPairIds: ").append(getKeyPairIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyPairsRequest == false)
            return false;
        DescribeKeyPairsRequest other = (DescribeKeyPairsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getKeyNames() == null ^ this.getKeyNames() == null)
            return false;
        if (other.getKeyNames() != null && other.getKeyNames().equals(this.getKeyNames()) == false)
            return false;
        if (other.getKeyPairIds() == null ^ this.getKeyPairIds() == null)
            return false;
        if (other.getKeyPairIds() != null && other.getKeyPairIds().equals(this.getKeyPairIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getKeyNames() == null) ? 0 : getKeyNames().hashCode());
        hashCode = prime * hashCode + ((getKeyPairIds() == null) ? 0 : getKeyPairIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeyPairsRequest clone() {
        return (DescribeKeyPairsRequest) super.clone();
    }
}
