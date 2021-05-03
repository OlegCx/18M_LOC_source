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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource's Amazon Resource Name (ARN).
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Tags to apply to the resource. Tag keys and values can contain letters, numbers, spaces, and the following
     * symbols: <code>_.:/=+@-</code>
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The resource's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The resource's Amazon Resource Name (ARN).
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The resource's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The resource's Amazon Resource Name (ARN).
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The resource's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The resource's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Tags to apply to the resource. Tag keys and values can contain letters, numbers, spaces, and the following
     * symbols: <code>_.:/=+@-</code>
     * </p>
     * 
     * @return Tags to apply to the resource. Tag keys and values can contain letters, numbers, spaces, and the
     *         following symbols: <code>_.:/=+@-</code>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to apply to the resource. Tag keys and values can contain letters, numbers, spaces, and the following
     * symbols: <code>_.:/=+@-</code>
     * </p>
     * 
     * @param tags
     *        Tags to apply to the resource. Tag keys and values can contain letters, numbers, spaces, and the following
     *        symbols: <code>_.:/=+@-</code>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags to apply to the resource. Tag keys and values can contain letters, numbers, spaces, and the following
     * symbols: <code>_.:/=+@-</code>
     * </p>
     * 
     * @param tags
     *        Tags to apply to the resource. Tag keys and values can contain letters, numbers, spaces, and the following
     *        symbols: <code>_.:/=+@-</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see TagResourceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest clearTagsEntries() {
        this.tags = null;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
