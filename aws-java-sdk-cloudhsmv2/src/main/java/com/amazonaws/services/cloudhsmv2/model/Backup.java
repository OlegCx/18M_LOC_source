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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a backup of an AWS CloudHSM cluster. All backup objects contain the <code>BackupId</code>,
 * <code>BackupState</code>, <code>ClusterId</code>, and <code>CreateTimestamp</code> parameters. Backups that were
 * copied into a destination region additionally contain the <code>CopyTimestamp</code>, <code>SourceBackup</code>,
 * <code>SourceCluster</code>, and <code>SourceRegion</code> parameters. A backup that is pending deletion will include
 * the <code>DeleteTimestamp</code> parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/Backup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Backup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier (ID) of the backup.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * The state of the backup.
     * </p>
     */
    private String backupState;
    /**
     * <p>
     * The identifier (ID) of the cluster that was backed up.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The date and time when the backup was created.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * The date and time when the backup was copied from a source backup.
     * </p>
     */
    private java.util.Date copyTimestamp;
    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     */
    private Boolean neverExpires;
    /**
     * <p>
     * The AWS Region that contains the source backup from which the new backup was copied.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The identifier (ID) of the source backup from which the new backup was copied.
     * </p>
     */
    private String sourceBackup;
    /**
     * <p>
     * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
     * </p>
     */
    private String sourceCluster;
    /**
     * <p>
     * The date and time when the backup will be permanently deleted.
     * </p>
     */
    private java.util.Date deleteTimestamp;
    /**
     * <p>
     * The list of tags for the backup.
     * </p>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p>
     * The identifier (ID) of the backup.
     * </p>
     * 
     * @param backupId
     *        The identifier (ID) of the backup.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The identifier (ID) of the backup.
     * </p>
     * 
     * @return The identifier (ID) of the backup.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The identifier (ID) of the backup.
     * </p>
     * 
     * @param backupId
     *        The identifier (ID) of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * The state of the backup.
     * </p>
     * 
     * @param backupState
     *        The state of the backup.
     * @see BackupState
     */

    public void setBackupState(String backupState) {
        this.backupState = backupState;
    }

    /**
     * <p>
     * The state of the backup.
     * </p>
     * 
     * @return The state of the backup.
     * @see BackupState
     */

    public String getBackupState() {
        return this.backupState;
    }

    /**
     * <p>
     * The state of the backup.
     * </p>
     * 
     * @param backupState
     *        The state of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupState
     */

    public Backup withBackupState(String backupState) {
        setBackupState(backupState);
        return this;
    }

    /**
     * <p>
     * The state of the backup.
     * </p>
     * 
     * @param backupState
     *        The state of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupState
     */

    public Backup withBackupState(BackupState backupState) {
        this.backupState = backupState.toString();
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that was backed up.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that was backed up.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that was backed up.
     * </p>
     * 
     * @return The identifier (ID) of the cluster that was backed up.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that was backed up.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that was backed up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The date and time when the backup was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time when the backup was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The date and time when the backup was created.
     * </p>
     * 
     * @return The date and time when the backup was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The date and time when the backup was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time when the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time when the backup was copied from a source backup.
     * </p>
     * 
     * @param copyTimestamp
     *        The date and time when the backup was copied from a source backup.
     */

    public void setCopyTimestamp(java.util.Date copyTimestamp) {
        this.copyTimestamp = copyTimestamp;
    }

    /**
     * <p>
     * The date and time when the backup was copied from a source backup.
     * </p>
     * 
     * @return The date and time when the backup was copied from a source backup.
     */

    public java.util.Date getCopyTimestamp() {
        return this.copyTimestamp;
    }

    /**
     * <p>
     * The date and time when the backup was copied from a source backup.
     * </p>
     * 
     * @param copyTimestamp
     *        The date and time when the backup was copied from a source backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withCopyTimestamp(java.util.Date copyTimestamp) {
        setCopyTimestamp(copyTimestamp);
        return this;
    }

    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     * 
     * @param neverExpires
     *        Specifies whether the service should exempt a backup from the retention policy for the cluster.
     *        <code>True</code> exempts a backup from the retention policy. <code>False</code> means the service applies
     *        the backup retention policy defined at the cluster.
     */

    public void setNeverExpires(Boolean neverExpires) {
        this.neverExpires = neverExpires;
    }

    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     * 
     * @return Specifies whether the service should exempt a backup from the retention policy for the cluster.
     *         <code>True</code> exempts a backup from the retention policy. <code>False</code> means the service
     *         applies the backup retention policy defined at the cluster.
     */

    public Boolean getNeverExpires() {
        return this.neverExpires;
    }

    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     * 
     * @param neverExpires
     *        Specifies whether the service should exempt a backup from the retention policy for the cluster.
     *        <code>True</code> exempts a backup from the retention policy. <code>False</code> means the service applies
     *        the backup retention policy defined at the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withNeverExpires(Boolean neverExpires) {
        setNeverExpires(neverExpires);
        return this;
    }

    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     * 
     * @return Specifies whether the service should exempt a backup from the retention policy for the cluster.
     *         <code>True</code> exempts a backup from the retention policy. <code>False</code> means the service
     *         applies the backup retention policy defined at the cluster.
     */

    public Boolean isNeverExpires() {
        return this.neverExpires;
    }

    /**
     * <p>
     * The AWS Region that contains the source backup from which the new backup was copied.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region that contains the source backup from which the new backup was copied.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The AWS Region that contains the source backup from which the new backup was copied.
     * </p>
     * 
     * @return The AWS Region that contains the source backup from which the new backup was copied.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The AWS Region that contains the source backup from which the new backup was copied.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region that contains the source backup from which the new backup was copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the source backup from which the new backup was copied.
     * </p>
     * 
     * @param sourceBackup
     *        The identifier (ID) of the source backup from which the new backup was copied.
     */

    public void setSourceBackup(String sourceBackup) {
        this.sourceBackup = sourceBackup;
    }

    /**
     * <p>
     * The identifier (ID) of the source backup from which the new backup was copied.
     * </p>
     * 
     * @return The identifier (ID) of the source backup from which the new backup was copied.
     */

    public String getSourceBackup() {
        return this.sourceBackup;
    }

    /**
     * <p>
     * The identifier (ID) of the source backup from which the new backup was copied.
     * </p>
     * 
     * @param sourceBackup
     *        The identifier (ID) of the source backup from which the new backup was copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withSourceBackup(String sourceBackup) {
        setSourceBackup(sourceBackup);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
     * </p>
     * 
     * @param sourceCluster
     *        The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
     */

    public void setSourceCluster(String sourceCluster) {
        this.sourceCluster = sourceCluster;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
     * </p>
     * 
     * @return The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
     */

    public String getSourceCluster() {
        return this.sourceCluster;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
     * </p>
     * 
     * @param sourceCluster
     *        The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withSourceCluster(String sourceCluster) {
        setSourceCluster(sourceCluster);
        return this;
    }

    /**
     * <p>
     * The date and time when the backup will be permanently deleted.
     * </p>
     * 
     * @param deleteTimestamp
     *        The date and time when the backup will be permanently deleted.
     */

    public void setDeleteTimestamp(java.util.Date deleteTimestamp) {
        this.deleteTimestamp = deleteTimestamp;
    }

    /**
     * <p>
     * The date and time when the backup will be permanently deleted.
     * </p>
     * 
     * @return The date and time when the backup will be permanently deleted.
     */

    public java.util.Date getDeleteTimestamp() {
        return this.deleteTimestamp;
    }

    /**
     * <p>
     * The date and time when the backup will be permanently deleted.
     * </p>
     * 
     * @param deleteTimestamp
     *        The date and time when the backup will be permanently deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withDeleteTimestamp(java.util.Date deleteTimestamp) {
        setDeleteTimestamp(deleteTimestamp);
        return this;
    }

    /**
     * <p>
     * The list of tags for the backup.
     * </p>
     * 
     * @return The list of tags for the backup.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The list of tags for the backup.
     * </p>
     * 
     * @param tagList
     *        The list of tags for the backup.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * The list of tags for the backup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        The list of tags for the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the backup.
     * </p>
     * 
     * @param tagList
     *        The list of tags for the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getBackupState() != null)
            sb.append("BackupState: ").append(getBackupState()).append(",");
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getCopyTimestamp() != null)
            sb.append("CopyTimestamp: ").append(getCopyTimestamp()).append(",");
        if (getNeverExpires() != null)
            sb.append("NeverExpires: ").append(getNeverExpires()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getSourceBackup() != null)
            sb.append("SourceBackup: ").append(getSourceBackup()).append(",");
        if (getSourceCluster() != null)
            sb.append("SourceCluster: ").append(getSourceCluster()).append(",");
        if (getDeleteTimestamp() != null)
            sb.append("DeleteTimestamp: ").append(getDeleteTimestamp()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Backup == false)
            return false;
        Backup other = (Backup) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getBackupState() == null ^ this.getBackupState() == null)
            return false;
        if (other.getBackupState() != null && other.getBackupState().equals(this.getBackupState()) == false)
            return false;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getCopyTimestamp() == null ^ this.getCopyTimestamp() == null)
            return false;
        if (other.getCopyTimestamp() != null && other.getCopyTimestamp().equals(this.getCopyTimestamp()) == false)
            return false;
        if (other.getNeverExpires() == null ^ this.getNeverExpires() == null)
            return false;
        if (other.getNeverExpires() != null && other.getNeverExpires().equals(this.getNeverExpires()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceBackup() == null ^ this.getSourceBackup() == null)
            return false;
        if (other.getSourceBackup() != null && other.getSourceBackup().equals(this.getSourceBackup()) == false)
            return false;
        if (other.getSourceCluster() == null ^ this.getSourceCluster() == null)
            return false;
        if (other.getSourceCluster() != null && other.getSourceCluster().equals(this.getSourceCluster()) == false)
            return false;
        if (other.getDeleteTimestamp() == null ^ this.getDeleteTimestamp() == null)
            return false;
        if (other.getDeleteTimestamp() != null && other.getDeleteTimestamp().equals(this.getDeleteTimestamp()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getBackupState() == null) ? 0 : getBackupState().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCopyTimestamp() == null) ? 0 : getCopyTimestamp().hashCode());
        hashCode = prime * hashCode + ((getNeverExpires() == null) ? 0 : getNeverExpires().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceBackup() == null) ? 0 : getSourceBackup().hashCode());
        hashCode = prime * hashCode + ((getSourceCluster() == null) ? 0 : getSourceCluster().hashCode());
        hashCode = prime * hashCode + ((getDeleteTimestamp() == null) ? 0 : getDeleteTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public Backup clone() {
        try {
            return (Backup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudhsmv2.model.transform.BackupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
