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
 * Details about a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ResourceInventory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceInventory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Type of resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Platform of the resource.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Platform version of the resource in the inventory.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * ID of the account that owns the resource.
     * </p>
     */
    private String resourceOwningAccountId;

    /**
     * <p>
     * ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * ID of the resource.
     * </p>
     * 
     * @return ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInventory withResourceId(String resourceId) {
        setResourceId(resourceId);
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

    public ResourceInventory withResourceType(String resourceType) {
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

    public ResourceInventory withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

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

    public ResourceInventory withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Platform of the resource.
     * </p>
     * 
     * @param platform
     *        Platform of the resource.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * Platform of the resource.
     * </p>
     * 
     * @return Platform of the resource.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * Platform of the resource.
     * </p>
     * 
     * @param platform
     *        Platform of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInventory withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * Platform version of the resource in the inventory.
     * </p>
     * 
     * @param platformVersion
     *        Platform version of the resource in the inventory.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * Platform version of the resource in the inventory.
     * </p>
     * 
     * @return Platform version of the resource in the inventory.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * Platform version of the resource in the inventory.
     * </p>
     * 
     * @param platformVersion
     *        Platform version of the resource in the inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInventory withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * ID of the account that owns the resource.
     * </p>
     * 
     * @param resourceOwningAccountId
     *        ID of the account that owns the resource.
     */

    public void setResourceOwningAccountId(String resourceOwningAccountId) {
        this.resourceOwningAccountId = resourceOwningAccountId;
    }

    /**
     * <p>
     * ID of the account that owns the resource.
     * </p>
     * 
     * @return ID of the account that owns the resource.
     */

    public String getResourceOwningAccountId() {
        return this.resourceOwningAccountId;
    }

    /**
     * <p>
     * ID of the account that owns the resource.
     * </p>
     * 
     * @param resourceOwningAccountId
     *        ID of the account that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInventory withResourceOwningAccountId(String resourceOwningAccountId) {
        setResourceOwningAccountId(resourceOwningAccountId);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getResourceOwningAccountId() != null)
            sb.append("ResourceOwningAccountId: ").append(getResourceOwningAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceInventory == false)
            return false;
        ResourceInventory other = (ResourceInventory) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getResourceOwningAccountId() == null ^ this.getResourceOwningAccountId() == null)
            return false;
        if (other.getResourceOwningAccountId() != null && other.getResourceOwningAccountId().equals(this.getResourceOwningAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getResourceOwningAccountId() == null) ? 0 : getResourceOwningAccountId().hashCode());
        return hashCode;
    }

    @Override
    public ResourceInventory clone() {
        try {
            return (ResourceInventory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ResourceInventoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
