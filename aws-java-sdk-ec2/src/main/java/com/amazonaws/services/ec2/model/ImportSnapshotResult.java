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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     */
    private String importTaskId;
    /**
     * <p>
     * Information about the import snapshot task.
     * </p>
     */
    private SnapshotTaskDetail snapshotTaskDetail;
    /**
     * <p>
     * Any tags assigned to the import snapshot task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     * 
     * @param description
     *        A description of the import snapshot task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     * 
     * @return A description of the import snapshot task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     * 
     * @param description
     *        A description of the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the import snapshot task.
     */

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     * 
     * @return The ID of the import snapshot task.
     */

    public String getImportTaskId() {
        return this.importTaskId;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotResult withImportTaskId(String importTaskId) {
        setImportTaskId(importTaskId);
        return this;
    }

    /**
     * <p>
     * Information about the import snapshot task.
     * </p>
     * 
     * @param snapshotTaskDetail
     *        Information about the import snapshot task.
     */

    public void setSnapshotTaskDetail(SnapshotTaskDetail snapshotTaskDetail) {
        this.snapshotTaskDetail = snapshotTaskDetail;
    }

    /**
     * <p>
     * Information about the import snapshot task.
     * </p>
     * 
     * @return Information about the import snapshot task.
     */

    public SnapshotTaskDetail getSnapshotTaskDetail() {
        return this.snapshotTaskDetail;
    }

    /**
     * <p>
     * Information about the import snapshot task.
     * </p>
     * 
     * @param snapshotTaskDetail
     *        Information about the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotResult withSnapshotTaskDetail(SnapshotTaskDetail snapshotTaskDetail) {
        setSnapshotTaskDetail(snapshotTaskDetail);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the import snapshot task.
     * </p>
     * 
     * @return Any tags assigned to the import snapshot task.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the import snapshot task.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the import snapshot task.
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
     * Any tags assigned to the import snapshot task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotResult withTags(Tag... tags) {
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
     * Any tags assigned to the import snapshot task.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSnapshotResult withTags(java.util.Collection<Tag> tags) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: ").append(getImportTaskId()).append(",");
        if (getSnapshotTaskDetail() != null)
            sb.append("SnapshotTaskDetail: ").append(getSnapshotTaskDetail()).append(",");
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

        if (obj instanceof ImportSnapshotResult == false)
            return false;
        ImportSnapshotResult other = (ImportSnapshotResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getSnapshotTaskDetail() == null ^ this.getSnapshotTaskDetail() == null)
            return false;
        if (other.getSnapshotTaskDetail() != null && other.getSnapshotTaskDetail().equals(this.getSnapshotTaskDetail()) == false)
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
        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotTaskDetail() == null) ? 0 : getSnapshotTaskDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportSnapshotResult clone() {
        try {
            return (ImportSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
