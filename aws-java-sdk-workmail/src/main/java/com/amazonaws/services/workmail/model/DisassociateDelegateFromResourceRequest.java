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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateDelegateFromResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateDelegateFromResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization under which the resource exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier of the resource from which delegates' set members are removed.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The identifier for the member (user, group) to be removed from the resource's delegates.
     * </p>
     */
    private String entityId;

    /**
     * <p>
     * The identifier for the organization under which the resource exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the resource exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the resource exists.
     * </p>
     * 
     * @return The identifier for the organization under which the resource exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the resource exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the resource exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDelegateFromResourceRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the resource from which delegates' set members are removed.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource from which delegates' set members are removed.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource from which delegates' set members are removed.
     * </p>
     * 
     * @return The identifier of the resource from which delegates' set members are removed.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource from which delegates' set members are removed.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource from which delegates' set members are removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDelegateFromResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The identifier for the member (user, group) to be removed from the resource's delegates.
     * </p>
     * 
     * @param entityId
     *        The identifier for the member (user, group) to be removed from the resource's delegates.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier for the member (user, group) to be removed from the resource's delegates.
     * </p>
     * 
     * @return The identifier for the member (user, group) to be removed from the resource's delegates.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier for the member (user, group) to be removed from the resource's delegates.
     * </p>
     * 
     * @param entityId
     *        The identifier for the member (user, group) to be removed from the resource's delegates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDelegateFromResourceRequest withEntityId(String entityId) {
        setEntityId(entityId);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateDelegateFromResourceRequest == false)
            return false;
        DisassociateDelegateFromResourceRequest other = (DisassociateDelegateFromResourceRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateDelegateFromResourceRequest clone() {
        return (DisassociateDelegateFromResourceRequest) super.clone();
    }

}
