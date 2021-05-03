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
 * Describes a volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Volume" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Volume implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeAttachment> attachments;
    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was
     * used to protect the volume encryption key for the volume.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The volume state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The volume type.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     */
    private Boolean fastRestored;
    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     */
    private Boolean multiAttachEnabled;
    /**
     * <p>
     * The throughput that the volume supports, in MiB/s.
     * </p>
     */
    private Integer throughput;

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * 
     * @return Information about the volume attachments.
     */

    public java.util.List<VolumeAttachment> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<VolumeAttachment>();
        }
        return attachments;
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * 
     * @param attachments
     *        Information about the volume attachments.
     */

    public void setAttachments(java.util.Collection<VolumeAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<VolumeAttachment>(attachments);
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        Information about the volume attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAttachments(VolumeAttachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<VolumeAttachment>(attachments.length));
        }
        for (VolumeAttachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * 
     * @param attachments
     *        Information about the volume attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAttachments(java.util.Collection<VolumeAttachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the volume.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     * 
     * @return The Availability Zone for the volume.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     * 
     * @param createTime
     *        The time stamp when volume creation was initiated.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     * 
     * @return The time stamp when volume creation was initiated.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     * 
     * @param createTime
     *        The time stamp when volume creation was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     * 
     * @return Indicates whether the volume is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     * 
     * @return Indicates whether the volume is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was
     * used to protect the volume encryption key for the volume.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that
     *        was used to protect the volume encryption key for the volume.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was
     * used to protect the volume encryption key for the volume.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that
     *         was used to protect the volume encryption key for the volume.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was
     * used to protect the volume encryption key for the volume.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that
     *        was used to protect the volume encryption key for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @param size
     *        The size of the volume, in GiBs.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @return The size of the volume, in GiBs.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @param size
     *        The size of the volume, in GiBs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which the volume was created, if applicable.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     * 
     * @return The snapshot from which the volume was created, if applicable.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which the volume was created, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param state
     *        The volume state.
     * @see VolumeState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @return The volume state.
     * @see VolumeState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param state
     *        The volume state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeState
     */

    public Volume withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param state
     *        The volume state.
     * @see VolumeState
     */

    public void setState(VolumeState state) {
        withState(state);
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param state
     *        The volume state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeState
     */

    public Volume withState(VolumeState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *        <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *        <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the
     *        volume accumulates I/O credits for bursting.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *         <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *         <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which
     *         the volume accumulates I/O credits for bursting.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *        <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *        <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the
     *        volume accumulates I/O credits for bursting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     * 
     * @return Any tags assigned to the volume.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the volume.
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
     * Any tags assigned to the volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withTags(Tag... tags) {
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
     * Any tags assigned to the volume.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @param volumeType
     *        The volume type.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @return The volume type.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @param volumeType
     *        The volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public Volume withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @param volumeType
     *        The volume type.
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        withVolumeType(volumeType);
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @param volumeType
     *        The volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public Volume withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     * 
     * @param fastRestored
     *        Indicates whether the volume was created using fast snapshot restore.
     */

    public void setFastRestored(Boolean fastRestored) {
        this.fastRestored = fastRestored;
    }

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     * 
     * @return Indicates whether the volume was created using fast snapshot restore.
     */

    public Boolean getFastRestored() {
        return this.fastRestored;
    }

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     * 
     * @param fastRestored
     *        Indicates whether the volume was created using fast snapshot restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withFastRestored(Boolean fastRestored) {
        setFastRestored(fastRestored);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     * 
     * @return Indicates whether the volume was created using fast snapshot restore.
     */

    public Boolean isFastRestored() {
        return this.fastRestored;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     * 
     * @param multiAttachEnabled
     *        Indicates whether Amazon EBS Multi-Attach is enabled.
     */

    public void setMultiAttachEnabled(Boolean multiAttachEnabled) {
        this.multiAttachEnabled = multiAttachEnabled;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     * 
     * @return Indicates whether Amazon EBS Multi-Attach is enabled.
     */

    public Boolean getMultiAttachEnabled() {
        return this.multiAttachEnabled;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     * 
     * @param multiAttachEnabled
     *        Indicates whether Amazon EBS Multi-Attach is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withMultiAttachEnabled(Boolean multiAttachEnabled) {
        setMultiAttachEnabled(multiAttachEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     * 
     * @return Indicates whether Amazon EBS Multi-Attach is enabled.
     */

    public Boolean isMultiAttachEnabled() {
        return this.multiAttachEnabled;
    }

    /**
     * <p>
     * The throughput that the volume supports, in MiB/s.
     * </p>
     * 
     * @param throughput
     *        The throughput that the volume supports, in MiB/s.
     */

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput that the volume supports, in MiB/s.
     * </p>
     * 
     * @return The throughput that the volume supports, in MiB/s.
     */

    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput that the volume supports, in MiB/s.
     * </p>
     * 
     * @param throughput
     *        The throughput that the volume supports, in MiB/s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withThroughput(Integer throughput) {
        setThroughput(throughput);
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
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getFastRestored() != null)
            sb.append("FastRestored: ").append(getFastRestored()).append(",");
        if (getMultiAttachEnabled() != null)
            sb.append("MultiAttachEnabled: ").append(getMultiAttachEnabled()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Volume == false)
            return false;
        Volume other = (Volume) obj;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getFastRestored() == null ^ this.getFastRestored() == null)
            return false;
        if (other.getFastRestored() != null && other.getFastRestored().equals(this.getFastRestored()) == false)
            return false;
        if (other.getMultiAttachEnabled() == null ^ this.getMultiAttachEnabled() == null)
            return false;
        if (other.getMultiAttachEnabled() != null && other.getMultiAttachEnabled().equals(this.getMultiAttachEnabled()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getFastRestored() == null) ? 0 : getFastRestored().hashCode());
        hashCode = prime * hashCode + ((getMultiAttachEnabled() == null) ? 0 : getMultiAttachEnabled().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        return hashCode;
    }

    @Override
    public Volume clone() {
        try {
            return (Volume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
