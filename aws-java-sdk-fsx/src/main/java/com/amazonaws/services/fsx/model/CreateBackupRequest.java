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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object for the <code>CreateBackup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the file system to back up.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string
     * is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag appears
     * in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and you specify one or
     * more tags using the <code>CreateBackup</code> action, no existing file system tags are copied from the file
     * system to the backup.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the file system to back up.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system to back up.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system to back up.
     * </p>
     * 
     * @return The ID of the file system to back up.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system to back up.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system to back up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string
     * is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This
     *        string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an
     *        AWS SDK.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string
     * is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @return (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This
     *         string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an
     *         AWS SDK.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string
     * is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This
     *        string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an
     *        AWS SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag appears
     * in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and you specify one or
     * more tags using the <code>CreateBackup</code> action, no existing file system tags are copied from the file
     * system to the backup.
     * </p>
     * 
     * @return (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag
     *         appears in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and
     *         you specify one or more tags using the <code>CreateBackup</code> action, no existing file system tags are
     *         copied from the file system to the backup.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag appears
     * in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and you specify one or
     * more tags using the <code>CreateBackup</code> action, no existing file system tags are copied from the file
     * system to the backup.
     * </p>
     * 
     * @param tags
     *        (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag
     *        appears in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and you
     *        specify one or more tags using the <code>CreateBackup</code> action, no existing file system tags are
     *        copied from the file system to the backup.
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
     * (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag appears
     * in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and you specify one or
     * more tags using the <code>CreateBackup</code> action, no existing file system tags are copied from the file
     * system to the backup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag
     *        appears in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and you
     *        specify one or more tags using the <code>CreateBackup</code> action, no existing file system tags are
     *        copied from the file system to the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupRequest withTags(Tag... tags) {
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
     * (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag appears
     * in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and you specify one or
     * more tags using the <code>CreateBackup</code> action, no existing file system tags are copied from the file
     * system to the backup.
     * </p>
     * 
     * @param tags
     *        (Optional) The tags to apply to the backup at backup creation. The key value of the <code>Name</code> tag
     *        appears in the console as the backup name. If you have set <code>CopyTagsToBackups</code> to true, and you
     *        specify one or more tags using the <code>CreateBackup</code> action, no existing file system tags are
     *        copied from the file system to the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof CreateBackupRequest == false)
            return false;
        CreateBackupRequest other = (CreateBackupRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackupRequest clone() {
        return (CreateBackupRequest) super.clone();
    }

}
