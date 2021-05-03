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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource to remove a tag from.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     */
    private String resourceId;
    /**
     * <p>
     * The list of keys for tags to remove from the specified resource.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The ID of the resource to remove a tag from.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The ID of the resource to remove a tag from.</p>
     *        <p>
     *        You can specify any of the following taggable resources.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS account – specify the account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *        <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *        <code>r-<i>1a2b</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *        <code>p-<i>12abcdefg3</i> </code>
     *        </p>
     *        </li>
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource to remove a tag from.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the resource to remove a tag from.</p>
     *         <p>
     *         You can specify any of the following taggable resources.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS account – specify the account ID number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *         <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *         <code>r-<i>1a2b</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *         <code>p-<i>12abcdefg3</i> </code>
     *         </p>
     *         </li>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource to remove a tag from.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The ID of the resource to remove a tag from.</p>
     *        <p>
     *        You can specify any of the following taggable resources.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS account – specify the account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *        <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *        <code>r-<i>1a2b</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *        <code>p-<i>12abcdefg3</i> </code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The list of keys for tags to remove from the specified resource.
     * </p>
     * 
     * @return The list of keys for tags to remove from the specified resource.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The list of keys for tags to remove from the specified resource.
     * </p>
     * 
     * @param tagKeys
     *        The list of keys for tags to remove from the specified resource.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * The list of keys for tags to remove from the specified resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        The list of keys for tags to remove from the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of keys for tags to remove from the specified resource.
     * </p>
     * 
     * @param tagKeys
     *        The list of keys for tags to remove from the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
