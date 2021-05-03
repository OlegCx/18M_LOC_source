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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/TagResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that you want to add one or more tags to.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>) and an
     * associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length
     * of a tag value is 256 characters.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that you want to add one or more tags to.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the application that you want to add one or more tags to.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that you want to add one or more tags to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application that you want to add one or more tags to.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that you want to add one or more tags to.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the application that you want to add one or more tags to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>) and an
     * associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length
     * of a tag value is 256 characters.
     * </p>
     * 
     * @return A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>)
     *         and an associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The
     *         maximum length of a tag value is 256 characters.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>) and an
     * associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length
     * of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>) and
     *        an associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The
     *        maximum length of a tag value is 256 characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>) and an
     * associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length
     * of a tag value is 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>) and
     *        an associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The
     *        maximum length of a tag value is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>) and an
     * associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The maximum length
     * of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A list of tags that to add to the application. A tag consists of a required tag key (<code>Key</code>) and
     *        an associated tag value (<code>Value</code>). The maximum length of a tag key is 128 characters. The
     *        maximum length of a tag value is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
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
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
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

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
