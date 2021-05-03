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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource related to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the resource that details are provided for. If possible, set <code>Type</code> to one of the
     * supported resource types. For example, if the resource is an EC2 instance, then set <code>Type</code> to
     * <code>AwsEc2Instance</code>.
     * </p>
     * <p>
     * If the resource does not match any of the provided types, then set <code>Type</code> to <code>Other</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The canonical identifier for the given resource type.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     */
    private String partition;
    /**
     * <p>
     * The canonical AWS external Region name where this resource is located.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Identifies the role of the resource in the finding. A resource is either the actor or target of the finding
     * activity,
     * </p>
     */
    private String resourceRole;
    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was processed.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Contains information about sensitive data that was detected on the resource.
     * </p>
     */
    private DataClassificationDetails dataClassification;
    /**
     * <p>
     * Additional details about the resource related to a finding.
     * </p>
     */
    private ResourceDetails details;

    /**
     * <p>
     * The type of the resource that details are provided for. If possible, set <code>Type</code> to one of the
     * supported resource types. For example, if the resource is an EC2 instance, then set <code>Type</code> to
     * <code>AwsEc2Instance</code>.
     * </p>
     * <p>
     * If the resource does not match any of the provided types, then set <code>Type</code> to <code>Other</code>.
     * </p>
     * 
     * @param type
     *        The type of the resource that details are provided for. If possible, set <code>Type</code> to one of the
     *        supported resource types. For example, if the resource is an EC2 instance, then set <code>Type</code> to
     *        <code>AwsEc2Instance</code>.</p>
     *        <p>
     *        If the resource does not match any of the provided types, then set <code>Type</code> to <code>Other</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource that details are provided for. If possible, set <code>Type</code> to one of the
     * supported resource types. For example, if the resource is an EC2 instance, then set <code>Type</code> to
     * <code>AwsEc2Instance</code>.
     * </p>
     * <p>
     * If the resource does not match any of the provided types, then set <code>Type</code> to <code>Other</code>.
     * </p>
     * 
     * @return The type of the resource that details are provided for. If possible, set <code>Type</code> to one of the
     *         supported resource types. For example, if the resource is an EC2 instance, then set <code>Type</code> to
     *         <code>AwsEc2Instance</code>.</p>
     *         <p>
     *         If the resource does not match any of the provided types, then set <code>Type</code> to
     *         <code>Other</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the resource that details are provided for. If possible, set <code>Type</code> to one of the
     * supported resource types. For example, if the resource is an EC2 instance, then set <code>Type</code> to
     * <code>AwsEc2Instance</code>.
     * </p>
     * <p>
     * If the resource does not match any of the provided types, then set <code>Type</code> to <code>Other</code>.
     * </p>
     * 
     * @param type
     *        The type of the resource that details are provided for. If possible, set <code>Type</code> to one of the
     *        supported resource types. For example, if the resource is an EC2 instance, then set <code>Type</code> to
     *        <code>AwsEc2Instance</code>.</p>
     *        <p>
     *        If the resource does not match any of the provided types, then set <code>Type</code> to <code>Other</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The canonical identifier for the given resource type.
     * </p>
     * 
     * @param id
     *        The canonical identifier for the given resource type.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The canonical identifier for the given resource type.
     * </p>
     * 
     * @return The canonical identifier for the given resource type.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The canonical identifier for the given resource type.
     * </p>
     * 
     * @param id
     *        The canonical identifier for the given resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * 
     * @param partition
     *        The canonical AWS partition name that the Region is assigned to.
     * @see Partition
     */

    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * 
     * @return The canonical AWS partition name that the Region is assigned to.
     * @see Partition
     */

    public String getPartition() {
        return this.partition;
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * 
     * @param partition
     *        The canonical AWS partition name that the Region is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Partition
     */

    public Resource withPartition(String partition) {
        setPartition(partition);
        return this;
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * 
     * @param partition
     *        The canonical AWS partition name that the Region is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Partition
     */

    public Resource withPartition(Partition partition) {
        this.partition = partition.toString();
        return this;
    }

    /**
     * <p>
     * The canonical AWS external Region name where this resource is located.
     * </p>
     * 
     * @param region
     *        The canonical AWS external Region name where this resource is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The canonical AWS external Region name where this resource is located.
     * </p>
     * 
     * @return The canonical AWS external Region name where this resource is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The canonical AWS external Region name where this resource is located.
     * </p>
     * 
     * @param region
     *        The canonical AWS external Region name where this resource is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Identifies the role of the resource in the finding. A resource is either the actor or target of the finding
     * activity,
     * </p>
     * 
     * @param resourceRole
     *        Identifies the role of the resource in the finding. A resource is either the actor or target of the
     *        finding activity,
     */

    public void setResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
    }

    /**
     * <p>
     * Identifies the role of the resource in the finding. A resource is either the actor or target of the finding
     * activity,
     * </p>
     * 
     * @return Identifies the role of the resource in the finding. A resource is either the actor or target of the
     *         finding activity,
     */

    public String getResourceRole() {
        return this.resourceRole;
    }

    /**
     * <p>
     * Identifies the role of the resource in the finding. A resource is either the actor or target of the finding
     * activity,
     * </p>
     * 
     * @param resourceRole
     *        Identifies the role of the resource in the finding. A resource is either the actor or target of the
     *        finding activity,
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceRole(String resourceRole) {
        setResourceRole(resourceRole);
        return this;
    }

    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was processed.
     * </p>
     * 
     * @return A list of AWS tags associated with a resource at the time the finding was processed.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was processed.
     * </p>
     * 
     * @param tags
     *        A list of AWS tags associated with a resource at the time the finding was processed.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was processed.
     * </p>
     * 
     * @param tags
     *        A list of AWS tags associated with a resource at the time the finding was processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Resource#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Resource addTagsEntry(String key, String value) {
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

    public Resource clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Contains information about sensitive data that was detected on the resource.
     * </p>
     * 
     * @param dataClassification
     *        Contains information about sensitive data that was detected on the resource.
     */

    public void setDataClassification(DataClassificationDetails dataClassification) {
        this.dataClassification = dataClassification;
    }

    /**
     * <p>
     * Contains information about sensitive data that was detected on the resource.
     * </p>
     * 
     * @return Contains information about sensitive data that was detected on the resource.
     */

    public DataClassificationDetails getDataClassification() {
        return this.dataClassification;
    }

    /**
     * <p>
     * Contains information about sensitive data that was detected on the resource.
     * </p>
     * 
     * @param dataClassification
     *        Contains information about sensitive data that was detected on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withDataClassification(DataClassificationDetails dataClassification) {
        setDataClassification(dataClassification);
        return this;
    }

    /**
     * <p>
     * Additional details about the resource related to a finding.
     * </p>
     * 
     * @param details
     *        Additional details about the resource related to a finding.
     */

    public void setDetails(ResourceDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * Additional details about the resource related to a finding.
     * </p>
     * 
     * @return Additional details about the resource related to a finding.
     */

    public ResourceDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Additional details about the resource related to a finding.
     * </p>
     * 
     * @param details
     *        Additional details about the resource related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withDetails(ResourceDetails details) {
        setDetails(details);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPartition() != null)
            sb.append("Partition: ").append(getPartition()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResourceRole() != null)
            sb.append("ResourceRole: ").append(getResourceRole()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDataClassification() != null)
            sb.append("DataClassification: ").append(getDataClassification()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceRole() == null ^ this.getResourceRole() == null)
            return false;
        if (other.getResourceRole() != null && other.getResourceRole().equals(this.getResourceRole()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDataClassification() == null ^ this.getDataClassification() == null)
            return false;
        if (other.getDataClassification() != null && other.getDataClassification().equals(this.getDataClassification()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceRole() == null) ? 0 : getResourceRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDataClassification() == null) ? 0 : getDataClassification().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
