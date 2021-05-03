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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeDiscoverer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDiscovererResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the discoverer.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the discoverer.
     * </p>
     */
    private String discovererArn;
    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     */
    private String discovererId;
    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The state of the discoverer.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The description of the discoverer.
     * </p>
     * 
     * @param description
     *        The description of the discoverer.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the discoverer.
     * </p>
     * 
     * @return The description of the discoverer.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the discoverer.
     * </p>
     * 
     * @param description
     *        The description of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscovererResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the discoverer.
     * </p>
     * 
     * @param discovererArn
     *        The ARN of the discoverer.
     */

    public void setDiscovererArn(String discovererArn) {
        this.discovererArn = discovererArn;
    }

    /**
     * <p>
     * The ARN of the discoverer.
     * </p>
     * 
     * @return The ARN of the discoverer.
     */

    public String getDiscovererArn() {
        return this.discovererArn;
    }

    /**
     * <p>
     * The ARN of the discoverer.
     * </p>
     * 
     * @param discovererArn
     *        The ARN of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscovererResult withDiscovererArn(String discovererArn) {
        setDiscovererArn(discovererArn);
        return this;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @param discovererId
     *        The ID of the discoverer.
     */

    public void setDiscovererId(String discovererId) {
        this.discovererId = discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @return The ID of the discoverer.
     */

    public String getDiscovererId() {
        return this.discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @param discovererId
     *        The ID of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscovererResult withDiscovererId(String discovererId) {
        setDiscovererId(discovererId);
        return this;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the event bus.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     * 
     * @return The ARN of the event bus.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscovererResult withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * 
     * @param state
     *        The state of the discoverer.
     * @see DiscovererState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * 
     * @return The state of the discoverer.
     * @see DiscovererState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * 
     * @param state
     *        The state of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscovererState
     */

    public DescribeDiscovererResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * 
     * @param state
     *        The state of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscovererState
     */

    public DescribeDiscovererResult withState(DiscovererState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @return Tags associated with the resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with the resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscovererResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeDiscovererResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscovererResult addTagsEntry(String key, String value) {
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

    public DescribeDiscovererResult clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDiscovererArn() != null)
            sb.append("DiscovererArn: ").append(getDiscovererArn()).append(",");
        if (getDiscovererId() != null)
            sb.append("DiscovererId: ").append(getDiscovererId()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof DescribeDiscovererResult == false)
            return false;
        DescribeDiscovererResult other = (DescribeDiscovererResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiscovererArn() == null ^ this.getDiscovererArn() == null)
            return false;
        if (other.getDiscovererArn() != null && other.getDiscovererArn().equals(this.getDiscovererArn()) == false)
            return false;
        if (other.getDiscovererId() == null ^ this.getDiscovererId() == null)
            return false;
        if (other.getDiscovererId() != null && other.getDiscovererId().equals(this.getDiscovererId()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiscovererArn() == null) ? 0 : getDiscovererArn().hashCode());
        hashCode = prime * hashCode + ((getDiscovererId() == null) ? 0 : getDiscovererId().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDiscovererResult clone() {
        try {
            return (DescribeDiscovererResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
