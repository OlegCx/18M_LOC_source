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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackagingConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the PackagingConfiguration. */
    private String arn;

    private CmafPackage cmafPackage;

    private DashPackage dashPackage;

    private HlsPackage hlsPackage;
    /** The ID of the PackagingConfiguration. */
    private String id;

    private MssPackage mssPackage;
    /** The ID of a PackagingGroup. */
    private String packagingGroupId;

    private java.util.Map<String, String> tags;

    /**
     * The ARN of the PackagingConfiguration.
     * 
     * @param arn
     *        The ARN of the PackagingConfiguration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the PackagingConfiguration.
     * 
     * @return The ARN of the PackagingConfiguration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of the PackagingConfiguration.
     * 
     * @param arn
     *        The ARN of the PackagingConfiguration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param cmafPackage
     */

    public void setCmafPackage(CmafPackage cmafPackage) {
        this.cmafPackage = cmafPackage;
    }

    /**
     * @return
     */

    public CmafPackage getCmafPackage() {
        return this.cmafPackage;
    }

    /**
     * @param cmafPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult withCmafPackage(CmafPackage cmafPackage) {
        setCmafPackage(cmafPackage);
        return this;
    }

    /**
     * @param dashPackage
     */

    public void setDashPackage(DashPackage dashPackage) {
        this.dashPackage = dashPackage;
    }

    /**
     * @return
     */

    public DashPackage getDashPackage() {
        return this.dashPackage;
    }

    /**
     * @param dashPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult withDashPackage(DashPackage dashPackage) {
        setDashPackage(dashPackage);
        return this;
    }

    /**
     * @param hlsPackage
     */

    public void setHlsPackage(HlsPackage hlsPackage) {
        this.hlsPackage = hlsPackage;
    }

    /**
     * @return
     */

    public HlsPackage getHlsPackage() {
        return this.hlsPackage;
    }

    /**
     * @param hlsPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult withHlsPackage(HlsPackage hlsPackage) {
        setHlsPackage(hlsPackage);
        return this;
    }

    /**
     * The ID of the PackagingConfiguration.
     * 
     * @param id
     *        The ID of the PackagingConfiguration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the PackagingConfiguration.
     * 
     * @return The ID of the PackagingConfiguration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the PackagingConfiguration.
     * 
     * @param id
     *        The ID of the PackagingConfiguration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param mssPackage
     */

    public void setMssPackage(MssPackage mssPackage) {
        this.mssPackage = mssPackage;
    }

    /**
     * @return
     */

    public MssPackage getMssPackage() {
        return this.mssPackage;
    }

    /**
     * @param mssPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult withMssPackage(MssPackage mssPackage) {
        setMssPackage(mssPackage);
        return this;
    }

    /**
     * The ID of a PackagingGroup.
     * 
     * @param packagingGroupId
     *        The ID of a PackagingGroup.
     */

    public void setPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
    }

    /**
     * The ID of a PackagingGroup.
     * 
     * @return The ID of a PackagingGroup.
     */

    public String getPackagingGroupId() {
        return this.packagingGroupId;
    }

    /**
     * The ID of a PackagingGroup.
     * 
     * @param packagingGroupId
     *        The ID of a PackagingGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult withPackagingGroupId(String packagingGroupId) {
        setPackagingGroupId(packagingGroupId);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePackagingConfigurationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackagingConfigurationResult addTagsEntry(String key, String value) {
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

    public CreatePackagingConfigurationResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCmafPackage() != null)
            sb.append("CmafPackage: ").append(getCmafPackage()).append(",");
        if (getDashPackage() != null)
            sb.append("DashPackage: ").append(getDashPackage()).append(",");
        if (getHlsPackage() != null)
            sb.append("HlsPackage: ").append(getHlsPackage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMssPackage() != null)
            sb.append("MssPackage: ").append(getMssPackage()).append(",");
        if (getPackagingGroupId() != null)
            sb.append("PackagingGroupId: ").append(getPackagingGroupId()).append(",");
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

        if (obj instanceof CreatePackagingConfigurationResult == false)
            return false;
        CreatePackagingConfigurationResult other = (CreatePackagingConfigurationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCmafPackage() == null ^ this.getCmafPackage() == null)
            return false;
        if (other.getCmafPackage() != null && other.getCmafPackage().equals(this.getCmafPackage()) == false)
            return false;
        if (other.getDashPackage() == null ^ this.getDashPackage() == null)
            return false;
        if (other.getDashPackage() != null && other.getDashPackage().equals(this.getDashPackage()) == false)
            return false;
        if (other.getHlsPackage() == null ^ this.getHlsPackage() == null)
            return false;
        if (other.getHlsPackage() != null && other.getHlsPackage().equals(this.getHlsPackage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMssPackage() == null ^ this.getMssPackage() == null)
            return false;
        if (other.getMssPackage() != null && other.getMssPackage().equals(this.getMssPackage()) == false)
            return false;
        if (other.getPackagingGroupId() == null ^ this.getPackagingGroupId() == null)
            return false;
        if (other.getPackagingGroupId() != null && other.getPackagingGroupId().equals(this.getPackagingGroupId()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCmafPackage() == null) ? 0 : getCmafPackage().hashCode());
        hashCode = prime * hashCode + ((getDashPackage() == null) ? 0 : getDashPackage().hashCode());
        hashCode = prime * hashCode + ((getHlsPackage() == null) ? 0 : getHlsPackage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMssPackage() == null) ? 0 : getMssPackage().hashCode());
        hashCode = prime * hashCode + ((getPackagingGroupId() == null) ? 0 : getPackagingGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePackagingConfigurationResult clone() {
        try {
            return (CreatePackagingConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
