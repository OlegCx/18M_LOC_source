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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackupPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * </p>
     */
    private String backupPlanArn;
    /**
     * <p>
     * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be
     * edited.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * A list of <code>BackupOptions</code> settings for a resource type. This option is only available for Windows VSS
     * backup jobs.
     * </p>
     */
    private java.util.List<AdvancedBackupSetting> advancedBackupSettings;

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * 
     * @param backupPlanId
     *        Uniquely identifies a backup plan.
     */

    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * 
     * @return Uniquely identifies a backup plan.
     */

    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * 
     * @param backupPlanId
     *        Uniquely identifies a backup plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupPlanResult withBackupPlanId(String backupPlanId) {
        setBackupPlanId(backupPlanId);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * </p>
     * 
     * @param backupPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     */

    public void setBackupPlanArn(String backupPlanArn) {
        this.backupPlanArn = backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     */

    public String getBackupPlanArn() {
        return this.backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * </p>
     * 
     * @param backupPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupPlanResult withBackupPlanArn(String backupPlanArn) {
        setBackupPlanArn(backupPlanArn);
        return this;
    }

    /**
     * <p>
     * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupPlanResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be
     * edited.
     * </p>
     * 
     * @param versionId
     *        Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot
     *        be edited.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be
     * edited.
     * </p>
     * 
     * @return Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot
     *         be edited.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be
     * edited.
     * </p>
     * 
     * @param versionId
     *        Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot
     *        be edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupPlanResult withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * A list of <code>BackupOptions</code> settings for a resource type. This option is only available for Windows VSS
     * backup jobs.
     * </p>
     * 
     * @return A list of <code>BackupOptions</code> settings for a resource type. This option is only available for
     *         Windows VSS backup jobs.
     */

    public java.util.List<AdvancedBackupSetting> getAdvancedBackupSettings() {
        return advancedBackupSettings;
    }

    /**
     * <p>
     * A list of <code>BackupOptions</code> settings for a resource type. This option is only available for Windows VSS
     * backup jobs.
     * </p>
     * 
     * @param advancedBackupSettings
     *        A list of <code>BackupOptions</code> settings for a resource type. This option is only available for
     *        Windows VSS backup jobs.
     */

    public void setAdvancedBackupSettings(java.util.Collection<AdvancedBackupSetting> advancedBackupSettings) {
        if (advancedBackupSettings == null) {
            this.advancedBackupSettings = null;
            return;
        }

        this.advancedBackupSettings = new java.util.ArrayList<AdvancedBackupSetting>(advancedBackupSettings);
    }

    /**
     * <p>
     * A list of <code>BackupOptions</code> settings for a resource type. This option is only available for Windows VSS
     * backup jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedBackupSettings(java.util.Collection)} or
     * {@link #withAdvancedBackupSettings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param advancedBackupSettings
     *        A list of <code>BackupOptions</code> settings for a resource type. This option is only available for
     *        Windows VSS backup jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupPlanResult withAdvancedBackupSettings(AdvancedBackupSetting... advancedBackupSettings) {
        if (this.advancedBackupSettings == null) {
            setAdvancedBackupSettings(new java.util.ArrayList<AdvancedBackupSetting>(advancedBackupSettings.length));
        }
        for (AdvancedBackupSetting ele : advancedBackupSettings) {
            this.advancedBackupSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>BackupOptions</code> settings for a resource type. This option is only available for Windows VSS
     * backup jobs.
     * </p>
     * 
     * @param advancedBackupSettings
     *        A list of <code>BackupOptions</code> settings for a resource type. This option is only available for
     *        Windows VSS backup jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupPlanResult withAdvancedBackupSettings(java.util.Collection<AdvancedBackupSetting> advancedBackupSettings) {
        setAdvancedBackupSettings(advancedBackupSettings);
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
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: ").append(getBackupPlanId()).append(",");
        if (getBackupPlanArn() != null)
            sb.append("BackupPlanArn: ").append(getBackupPlanArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getAdvancedBackupSettings() != null)
            sb.append("AdvancedBackupSettings: ").append(getAdvancedBackupSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackupPlanResult == false)
            return false;
        CreateBackupPlanResult other = (CreateBackupPlanResult) obj;
        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getBackupPlanArn() == null ^ this.getBackupPlanArn() == null)
            return false;
        if (other.getBackupPlanArn() != null && other.getBackupPlanArn().equals(this.getBackupPlanArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getAdvancedBackupSettings() == null ^ this.getAdvancedBackupSettings() == null)
            return false;
        if (other.getAdvancedBackupSettings() != null && other.getAdvancedBackupSettings().equals(this.getAdvancedBackupSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanArn() == null) ? 0 : getBackupPlanArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getAdvancedBackupSettings() == null) ? 0 : getAdvancedBackupSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackupPlanResult clone() {
        try {
            return (CreateBackupPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
