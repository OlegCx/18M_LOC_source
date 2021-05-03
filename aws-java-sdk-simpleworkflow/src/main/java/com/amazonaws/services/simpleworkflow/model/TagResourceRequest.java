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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon SWF domain.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The list of tags to add to a domain.
     * </p>
     * <p>
     * Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     */
    private java.util.List<ResourceTag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon SWF domain.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the Amazon SWF domain.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon SWF domain.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Amazon SWF domain.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon SWF domain.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the Amazon SWF domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The list of tags to add to a domain.
     * </p>
     * <p>
     * Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * 
     * @return The list of tags to add to a domain. </p>
     *         <p>
     *         Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     */

    public java.util.List<ResourceTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags to add to a domain.
     * </p>
     * <p>
     * Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * 
     * @param tags
     *        The list of tags to add to a domain. </p>
     *        <p>
     *        Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     */

    public void setTags(java.util.Collection<ResourceTag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<ResourceTag>(tags);
    }

    /**
     * <p>
     * The list of tags to add to a domain.
     * </p>
     * <p>
     * Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags to add to a domain. </p>
     *        <p>
     *        Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(ResourceTag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<ResourceTag>(tags.length));
        }
        for (ResourceTag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags to add to a domain.
     * </p>
     * <p>
     * Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * 
     * @param tags
     *        The list of tags to add to a domain. </p>
     *        <p>
     *        Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<ResourceTag> tags) {
        setTags(tags);
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
