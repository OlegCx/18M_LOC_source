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

/**
 * <p>
 * The tags for a Spot Fleet resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotFleetTagSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotFleetTagSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag the
     * Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     * <code>SpotFleetRequestConfigData</code> </a>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag the
     * Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     * <code>SpotFleetRequestConfigData</code> </a>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag
     *        the Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     *        <code>SpotFleetRequestConfigData</code> </a>.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag the
     * Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     * <code>SpotFleetRequestConfigData</code> </a>.
     * </p>
     * 
     * @return The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To
     *         tag the Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     *         <code>SpotFleetRequestConfigData</code> </a>.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag the
     * Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     * <code>SpotFleetRequestConfigData</code> </a>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag
     *        the Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     *        <code>SpotFleetRequestConfigData</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public SpotFleetTagSpecification withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag the
     * Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     * <code>SpotFleetRequestConfigData</code> </a>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag
     *        the Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     *        <code>SpotFleetRequestConfigData</code> </a>.
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag the
     * Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     * <code>SpotFleetRequestConfigData</code> </a>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource. Currently, the only resource type that is supported is <code>instance</code>. To tag
     *        the Spot Fleet request on creation, use the <code>TagSpecifications</code> parameter in <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     *        <code>SpotFleetRequestConfigData</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public SpotFleetTagSpecification withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetTagSpecification withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetTagSpecification withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
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

        if (obj instanceof SpotFleetTagSpecification == false)
            return false;
        SpotFleetTagSpecification other = (SpotFleetTagSpecification) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
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

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SpotFleetTagSpecification clone() {
        try {
            return (SpotFleetTagSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
