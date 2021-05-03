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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyBackupToRegionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS region that will contain your copied CloudHSM cluster backup.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * The ID of the backup that will be copied to the destination region.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * Tags to apply to the destination backup during creation. If you specify tags, only these tags will be applied to
     * the destination backup. If you do not specify tags, the service copies tags from the source backup to the
     * destination backup.
     * </p>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p>
     * The AWS region that will contain your copied CloudHSM cluster backup.
     * </p>
     * 
     * @param destinationRegion
     *        The AWS region that will contain your copied CloudHSM cluster backup.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The AWS region that will contain your copied CloudHSM cluster backup.
     * </p>
     * 
     * @return The AWS region that will contain your copied CloudHSM cluster backup.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The AWS region that will contain your copied CloudHSM cluster backup.
     * </p>
     * 
     * @param destinationRegion
     *        The AWS region that will contain your copied CloudHSM cluster backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupToRegionRequest withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * The ID of the backup that will be copied to the destination region.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup that will be copied to the destination region.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup that will be copied to the destination region.
     * </p>
     * 
     * @return The ID of the backup that will be copied to the destination region.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The ID of the backup that will be copied to the destination region.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup that will be copied to the destination region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupToRegionRequest withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * Tags to apply to the destination backup during creation. If you specify tags, only these tags will be applied to
     * the destination backup. If you do not specify tags, the service copies tags from the source backup to the
     * destination backup.
     * </p>
     * 
     * @return Tags to apply to the destination backup during creation. If you specify tags, only these tags will be
     *         applied to the destination backup. If you do not specify tags, the service copies tags from the source
     *         backup to the destination backup.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * Tags to apply to the destination backup during creation. If you specify tags, only these tags will be applied to
     * the destination backup. If you do not specify tags, the service copies tags from the source backup to the
     * destination backup.
     * </p>
     * 
     * @param tagList
     *        Tags to apply to the destination backup during creation. If you specify tags, only these tags will be
     *        applied to the destination backup. If you do not specify tags, the service copies tags from the source
     *        backup to the destination backup.
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
     * Tags to apply to the destination backup during creation. If you specify tags, only these tags will be applied to
     * the destination backup. If you do not specify tags, the service copies tags from the source backup to the
     * destination backup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        Tags to apply to the destination backup during creation. If you specify tags, only these tags will be
     *        applied to the destination backup. If you do not specify tags, the service copies tags from the source
     *        backup to the destination backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupToRegionRequest withTagList(Tag... tagList) {
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
     * Tags to apply to the destination backup during creation. If you specify tags, only these tags will be applied to
     * the destination backup. If you do not specify tags, the service copies tags from the source backup to the
     * destination backup.
     * </p>
     * 
     * @param tagList
     *        Tags to apply to the destination backup during creation. If you specify tags, only these tags will be
     *        applied to the destination backup. If you do not specify tags, the service copies tags from the source
     *        backup to the destination backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupToRegionRequest withTagList(java.util.Collection<Tag> tagList) {
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
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: ").append(getDestinationRegion()).append(",");
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
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

        if (obj instanceof CopyBackupToRegionRequest == false)
            return false;
        CopyBackupToRegionRequest other = (CopyBackupToRegionRequest) obj;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
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

        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public CopyBackupToRegionRequest clone() {
        return (CopyBackupToRegionRequest) super.clone();
    }

}
