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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/RemoveTagsFromResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTagsFromResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Neptune resource that the tags are removed from. This value is an Amazon Resource Name (ARN). For
     * information about creating an ARN, see <a
     * href="https://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The Amazon Neptune resource that the tags are removed from. This value is an Amazon Resource Name (ARN). For
     * information about creating an ARN, see <a
     * href="https://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Neptune resource that the tags are removed from. This value is an Amazon Resource Name (ARN).
     *        For information about creating an ARN, see <a
     *        href="https://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *        Constructing an Amazon Resource Name (ARN)</a>.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Neptune resource that the tags are removed from. This value is an Amazon Resource Name (ARN). For
     * information about creating an ARN, see <a
     * href="https://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @return The Amazon Neptune resource that the tags are removed from. This value is an Amazon Resource Name (ARN).
     *         For information about creating an ARN, see <a
     *         href="https://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *         Constructing an Amazon Resource Name (ARN)</a>.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The Amazon Neptune resource that the tags are removed from. This value is an Amazon Resource Name (ARN). For
     * information about creating an ARN, see <a
     * href="https://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Neptune resource that the tags are removed from. This value is an Amazon Resource Name (ARN).
     *        For information about creating an ARN, see <a
     *        href="https://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *        Constructing an Amazon Resource Name (ARN)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     * 
     * @return The tag key (name) of the tag to be removed.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     * 
     * @param tagKeys
     *        The tag key (name) of the tag to be removed.
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
     * The tag key (name) of the tag to be removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        The tag key (name) of the tag to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
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
     * The tag key (name) of the tag to be removed.
     * </p>
     * 
     * @param tagKeys
     *        The tag key (name) of the tag to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
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

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
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

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsFromResourceRequest clone() {
        return (RemoveTagsFromResourceRequest) super.clone();
    }

}
