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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the usage of a resource associated with a license configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/LicenseConfigurationUsage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseConfigurationUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Type of resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Status of the resource.
     * </p>
     */
    private String resourceStatus;
    /**
     * <p>
     * ID of the account that owns the resource.
     * </p>
     */
    private String resourceOwnerId;
    /**
     * <p>
     * Time when the license configuration was initially associated with the resource.
     * </p>
     */
    private java.util.Date associationTime;
    /**
     * <p>
     * Number of licenses consumed by the resource.
     * </p>
     */
    private Long consumedLicenses;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfigurationUsage withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @param resourceType
     *        Type of resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @return Type of resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @param resourceType
     *        Type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LicenseConfigurationUsage withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @param resourceType
     *        Type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LicenseConfigurationUsage withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Status of the resource.
     */

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * <p>
     * Status of the resource.
     * </p>
     * 
     * @return Status of the resource.
     */

    public String getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * <p>
     * Status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfigurationUsage withResourceStatus(String resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * ID of the account that owns the resource.
     * </p>
     * 
     * @param resourceOwnerId
     *        ID of the account that owns the resource.
     */

    public void setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
    }

    /**
     * <p>
     * ID of the account that owns the resource.
     * </p>
     * 
     * @return ID of the account that owns the resource.
     */

    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * <p>
     * ID of the account that owns the resource.
     * </p>
     * 
     * @param resourceOwnerId
     *        ID of the account that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfigurationUsage withResourceOwnerId(String resourceOwnerId) {
        setResourceOwnerId(resourceOwnerId);
        return this;
    }

    /**
     * <p>
     * Time when the license configuration was initially associated with the resource.
     * </p>
     * 
     * @param associationTime
     *        Time when the license configuration was initially associated with the resource.
     */

    public void setAssociationTime(java.util.Date associationTime) {
        this.associationTime = associationTime;
    }

    /**
     * <p>
     * Time when the license configuration was initially associated with the resource.
     * </p>
     * 
     * @return Time when the license configuration was initially associated with the resource.
     */

    public java.util.Date getAssociationTime() {
        return this.associationTime;
    }

    /**
     * <p>
     * Time when the license configuration was initially associated with the resource.
     * </p>
     * 
     * @param associationTime
     *        Time when the license configuration was initially associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfigurationUsage withAssociationTime(java.util.Date associationTime) {
        setAssociationTime(associationTime);
        return this;
    }

    /**
     * <p>
     * Number of licenses consumed by the resource.
     * </p>
     * 
     * @param consumedLicenses
     *        Number of licenses consumed by the resource.
     */

    public void setConsumedLicenses(Long consumedLicenses) {
        this.consumedLicenses = consumedLicenses;
    }

    /**
     * <p>
     * Number of licenses consumed by the resource.
     * </p>
     * 
     * @return Number of licenses consumed by the resource.
     */

    public Long getConsumedLicenses() {
        return this.consumedLicenses;
    }

    /**
     * <p>
     * Number of licenses consumed by the resource.
     * </p>
     * 
     * @param consumedLicenses
     *        Number of licenses consumed by the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfigurationUsage withConsumedLicenses(Long consumedLicenses) {
        setConsumedLicenses(consumedLicenses);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceStatus() != null)
            sb.append("ResourceStatus: ").append(getResourceStatus()).append(",");
        if (getResourceOwnerId() != null)
            sb.append("ResourceOwnerId: ").append(getResourceOwnerId()).append(",");
        if (getAssociationTime() != null)
            sb.append("AssociationTime: ").append(getAssociationTime()).append(",");
        if (getConsumedLicenses() != null)
            sb.append("ConsumedLicenses: ").append(getConsumedLicenses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseConfigurationUsage == false)
            return false;
        LicenseConfigurationUsage other = (LicenseConfigurationUsage) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null)
            return false;
        if (other.getResourceStatus() != null && other.getResourceStatus().equals(this.getResourceStatus()) == false)
            return false;
        if (other.getResourceOwnerId() == null ^ this.getResourceOwnerId() == null)
            return false;
        if (other.getResourceOwnerId() != null && other.getResourceOwnerId().equals(this.getResourceOwnerId()) == false)
            return false;
        if (other.getAssociationTime() == null ^ this.getAssociationTime() == null)
            return false;
        if (other.getAssociationTime() != null && other.getAssociationTime().equals(this.getAssociationTime()) == false)
            return false;
        if (other.getConsumedLicenses() == null ^ this.getConsumedLicenses() == null)
            return false;
        if (other.getConsumedLicenses() != null && other.getConsumedLicenses().equals(this.getConsumedLicenses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceOwnerId() == null) ? 0 : getResourceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getAssociationTime() == null) ? 0 : getAssociationTime().hashCode());
        hashCode = prime * hashCode + ((getConsumedLicenses() == null) ? 0 : getConsumedLicenses().hashCode());
        return hashCode;
    }

    @Override
    public LicenseConfigurationUsage clone() {
        try {
            return (LicenseConfigurationUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.LicenseConfigurationUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
