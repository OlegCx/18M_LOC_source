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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of an experiment template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ExperimentTemplateSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentTemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description of the experiment template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time that the experiment template was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time that the experiment template was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The tags for the experiment template.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param id
     *        The ID of the experiment template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @return The ID of the experiment template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param id
     *        The ID of the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description of the experiment template.
     * </p>
     * 
     * @param description
     *        The description of the experiment template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the experiment template.
     * </p>
     * 
     * @return The description of the experiment template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the experiment template.
     * </p>
     * 
     * @param description
     *        The description of the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time that the experiment template was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the experiment template was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the experiment template was created.
     * </p>
     * 
     * @return The time that the experiment template was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the experiment template was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the experiment template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that the experiment template was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time that the experiment template was last updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time that the experiment template was last updated.
     * </p>
     * 
     * @return The time that the experiment template was last updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time that the experiment template was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time that the experiment template was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The tags for the experiment template.
     * </p>
     * 
     * @return The tags for the experiment template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the experiment template.
     * </p>
     * 
     * @param tags
     *        The tags for the experiment template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the experiment template.
     * </p>
     * 
     * @param tags
     *        The tags for the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ExperimentTemplateSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateSummary addTagsEntry(String key, String value) {
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

    public ExperimentTemplateSummary clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
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

        if (obj instanceof ExperimentTemplateSummary == false)
            return false;
        ExperimentTemplateSummary other = (ExperimentTemplateSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentTemplateSummary clone() {
        try {
            return (ExperimentTemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentTemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
