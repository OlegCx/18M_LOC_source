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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier associated with the organization for which the resource is updated.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier of the resource to be updated.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The name of the resource to be updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The resource's booking options to be updated.
     * </p>
     */
    private BookingOptions bookingOptions;

    /**
     * <p>
     * The identifier associated with the organization for which the resource is updated.
     * </p>
     * 
     * @param organizationId
     *        The identifier associated with the organization for which the resource is updated.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization for which the resource is updated.
     * </p>
     * 
     * @return The identifier associated with the organization for which the resource is updated.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization for which the resource is updated.
     * </p>
     * 
     * @param organizationId
     *        The identifier associated with the organization for which the resource is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the resource to be updated.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource to be updated.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource to be updated.
     * </p>
     * 
     * @return The identifier of the resource to be updated.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource to be updated.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The name of the resource to be updated.
     * </p>
     * 
     * @param name
     *        The name of the resource to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource to be updated.
     * </p>
     * 
     * @return The name of the resource to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource to be updated.
     * </p>
     * 
     * @param name
     *        The name of the resource to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The resource's booking options to be updated.
     * </p>
     * 
     * @param bookingOptions
     *        The resource's booking options to be updated.
     */

    public void setBookingOptions(BookingOptions bookingOptions) {
        this.bookingOptions = bookingOptions;
    }

    /**
     * <p>
     * The resource's booking options to be updated.
     * </p>
     * 
     * @return The resource's booking options to be updated.
     */

    public BookingOptions getBookingOptions() {
        return this.bookingOptions;
    }

    /**
     * <p>
     * The resource's booking options to be updated.
     * </p>
     * 
     * @param bookingOptions
     *        The resource's booking options to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceRequest withBookingOptions(BookingOptions bookingOptions) {
        setBookingOptions(bookingOptions);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBookingOptions() != null)
            sb.append("BookingOptions: ").append(getBookingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceRequest == false)
            return false;
        UpdateResourceRequest other = (UpdateResourceRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBookingOptions() == null ^ this.getBookingOptions() == null)
            return false;
        if (other.getBookingOptions() != null && other.getBookingOptions().equals(this.getBookingOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBookingOptions() == null) ? 0 : getBookingOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceRequest clone() {
        return (UpdateResourceRequest) super.clone();
    }

}
