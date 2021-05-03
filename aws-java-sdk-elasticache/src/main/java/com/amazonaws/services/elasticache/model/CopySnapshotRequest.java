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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>CopySnapshotMessage</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CopySnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopySnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing snapshot from which to make a copy.
     * </p>
     */
    private String sourceSnapshotName;
    /**
     * <p>
     * A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must be
     * unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
     * </p>
     */
    private String targetSnapshotName;
    /**
     * <p>
     * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for
     * external access.
     * </p>
     * <p>
     * When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to this S3
     * bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting a
     * Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     */
    private String targetBucket;
    /**
     * <p>
     * The ID of the KMS key used to encrypt the target snapshot.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of an existing snapshot from which to make a copy.
     * </p>
     * 
     * @param sourceSnapshotName
     *        The name of an existing snapshot from which to make a copy.
     */

    public void setSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
    }

    /**
     * <p>
     * The name of an existing snapshot from which to make a copy.
     * </p>
     * 
     * @return The name of an existing snapshot from which to make a copy.
     */

    public String getSourceSnapshotName() {
        return this.sourceSnapshotName;
    }

    /**
     * <p>
     * The name of an existing snapshot from which to make a copy.
     * </p>
     * 
     * @param sourceSnapshotName
     *        The name of an existing snapshot from which to make a copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withSourceSnapshotName(String sourceSnapshotName) {
        setSourceSnapshotName(sourceSnapshotName);
        return this;
    }

    /**
     * <p>
     * A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must be
     * unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
     * </p>
     * 
     * @param targetSnapshotName
     *        A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must
     *        be unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
     */

    public void setTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
    }

    /**
     * <p>
     * A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must be
     * unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
     * </p>
     * 
     * @return A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name
     *         must be unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
     */

    public String getTargetSnapshotName() {
        return this.targetSnapshotName;
    }

    /**
     * <p>
     * A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must be
     * unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
     * </p>
     * 
     * @param targetSnapshotName
     *        A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must
     *        be unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withTargetSnapshotName(String targetSnapshotName) {
        setTargetSnapshotName(targetSnapshotName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for
     * external access.
     * </p>
     * <p>
     * When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to this S3
     * bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting a
     * Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * 
     * @param targetBucket
     *        The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a
     *        snapshot for external access.</p>
     *        <p>
     *        When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to
     *        this S3 bucket. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     *        >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the <i>Amazon ElastiCache User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting a
     *        Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     */

    public void setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for
     * external access.
     * </p>
     * <p>
     * When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to this S3
     * bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting a
     * Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * 
     * @return The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a
     *         snapshot for external access.</p>
     *         <p>
     *         When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to
     *         this S3 bucket. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     *         >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the <i>Amazon ElastiCache User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting a
     *         Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     */

    public String getTargetBucket() {
        return this.targetBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for
     * external access.
     * </p>
     * <p>
     * When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to this S3
     * bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting a
     * Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * 
     * @param targetBucket
     *        The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a
     *        snapshot for external access.</p>
     *        <p>
     *        When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to
     *        this S3 bucket. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     *        >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the <i>Amazon ElastiCache User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting a
     *        Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withTargetBucket(String targetBucket) {
        setTargetBucket(targetBucket);
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the target snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the target snapshot.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the target snapshot.
     * </p>
     * 
     * @return The ID of the KMS key used to encrypt the target snapshot.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the target snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the target snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @return A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by
     *         a tag value, although null is accepted.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
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
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withTags(Tag... tags) {
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
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceSnapshotName() != null)
            sb.append("SourceSnapshotName: ").append(getSourceSnapshotName()).append(",");
        if (getTargetSnapshotName() != null)
            sb.append("TargetSnapshotName: ").append(getTargetSnapshotName()).append(",");
        if (getTargetBucket() != null)
            sb.append("TargetBucket: ").append(getTargetBucket()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
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

        if (obj instanceof CopySnapshotRequest == false)
            return false;
        CopySnapshotRequest other = (CopySnapshotRequest) obj;
        if (other.getSourceSnapshotName() == null ^ this.getSourceSnapshotName() == null)
            return false;
        if (other.getSourceSnapshotName() != null && other.getSourceSnapshotName().equals(this.getSourceSnapshotName()) == false)
            return false;
        if (other.getTargetSnapshotName() == null ^ this.getTargetSnapshotName() == null)
            return false;
        if (other.getTargetSnapshotName() != null && other.getTargetSnapshotName().equals(this.getTargetSnapshotName()) == false)
            return false;
        if (other.getTargetBucket() == null ^ this.getTargetBucket() == null)
            return false;
        if (other.getTargetBucket() != null && other.getTargetBucket().equals(this.getTargetBucket()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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

        hashCode = prime * hashCode + ((getSourceSnapshotName() == null) ? 0 : getSourceSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getTargetSnapshotName() == null) ? 0 : getTargetSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getTargetBucket() == null) ? 0 : getTargetBucket().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CopySnapshotRequest clone() {
        return (CopySnapshotRequest) super.clone();
    }

}
