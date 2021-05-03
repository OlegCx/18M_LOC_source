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
 * Summary information about a managed resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ManagedResourceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedResourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of resource associated with a license.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Number of resources associated with licenses.
     * </p>
     */
    private Long associationCount;

    /**
     * <p>
     * Type of resource associated with a license.
     * </p>
     * 
     * @param resourceType
     *        Type of resource associated with a license.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of resource associated with a license.
     * </p>
     * 
     * @return Type of resource associated with a license.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of resource associated with a license.
     * </p>
     * 
     * @param resourceType
     *        Type of resource associated with a license.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ManagedResourceSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Type of resource associated with a license.
     * </p>
     * 
     * @param resourceType
     *        Type of resource associated with a license.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ManagedResourceSummary withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Number of resources associated with licenses.
     * </p>
     * 
     * @param associationCount
     *        Number of resources associated with licenses.
     */

    public void setAssociationCount(Long associationCount) {
        this.associationCount = associationCount;
    }

    /**
     * <p>
     * Number of resources associated with licenses.
     * </p>
     * 
     * @return Number of resources associated with licenses.
     */

    public Long getAssociationCount() {
        return this.associationCount;
    }

    /**
     * <p>
     * Number of resources associated with licenses.
     * </p>
     * 
     * @param associationCount
     *        Number of resources associated with licenses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withAssociationCount(Long associationCount) {
        setAssociationCount(associationCount);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getAssociationCount() != null)
            sb.append("AssociationCount: ").append(getAssociationCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedResourceSummary == false)
            return false;
        ManagedResourceSummary other = (ManagedResourceSummary) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getAssociationCount() == null ^ this.getAssociationCount() == null)
            return false;
        if (other.getAssociationCount() != null && other.getAssociationCount().equals(this.getAssociationCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getAssociationCount() == null) ? 0 : getAssociationCount().hashCode());
        return hashCode;
    }

    @Override
    public ManagedResourceSummary clone() {
        try {
            return (ManagedResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ManagedResourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
