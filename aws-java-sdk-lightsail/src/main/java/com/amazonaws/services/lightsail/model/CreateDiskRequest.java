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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDisk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDiskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     */
    private String diskName;
    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Use the same
     * Availability Zone as the Lightsail instance to which you want to attach the disk.
     * </p>
     * <p>
     * Use the <code>get regions</code> operation to list the Availability Zones where Lightsail is currently available.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     */
    private Integer sizeInGb;
    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new disk.
     * </p>
     */
    private java.util.List<AddOnRequest> addOns;

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @param diskName
     *        The unique Lightsail disk name (e.g., <code>my-disk</code>).
     */

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @return The unique Lightsail disk name (e.g., <code>my-disk</code>).
     */

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @param diskName
     *        The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withDiskName(String diskName) {
        setDiskName(diskName);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Use the same
     * Availability Zone as the Lightsail instance to which you want to attach the disk.
     * </p>
     * <p>
     * Use the <code>get regions</code> operation to list the Availability Zones where Lightsail is currently available.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Use the same
     *        Availability Zone as the Lightsail instance to which you want to attach the disk.</p>
     *        <p>
     *        Use the <code>get regions</code> operation to list the Availability Zones where Lightsail is currently
     *        available.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Use the same
     * Availability Zone as the Lightsail instance to which you want to attach the disk.
     * </p>
     * <p>
     * Use the <code>get regions</code> operation to list the Availability Zones where Lightsail is currently available.
     * </p>
     * 
     * @return The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Use the same
     *         Availability Zone as the Lightsail instance to which you want to attach the disk.</p>
     *         <p>
     *         Use the <code>get regions</code> operation to list the Availability Zones where Lightsail is currently
     *         available.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Use the same
     * Availability Zone as the Lightsail instance to which you want to attach the disk.
     * </p>
     * <p>
     * Use the <code>get regions</code> operation to list the Availability Zones where Lightsail is currently available.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Use the same
     *        Availability Zone as the Lightsail instance to which you want to attach the disk.</p>
     *        <p>
     *        Use the <code>get regions</code> operation to list the Availability Zones where Lightsail is currently
     *        available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB (e.g., <code>32</code>).
     */

    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     * 
     * @return The size of the disk in GB (e.g., <code>32</code>).
     */

    public Integer getSizeInGb() {
        return this.sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB (e.g., <code>32</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @return The tag keys and optional values to add to the resource during create.</p>
     *         <p>
     *         Use the <code>TagResource</code> action to tag a resource after it's created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withTags(Tag... tags) {
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new disk.
     * </p>
     * 
     * @return An array of objects that represent the add-ons to enable for the new disk.
     */

    public java.util.List<AddOnRequest> getAddOns() {
        return addOns;
    }

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new disk.
     * </p>
     * 
     * @param addOns
     *        An array of objects that represent the add-ons to enable for the new disk.
     */

    public void setAddOns(java.util.Collection<AddOnRequest> addOns) {
        if (addOns == null) {
            this.addOns = null;
            return;
        }

        this.addOns = new java.util.ArrayList<AddOnRequest>(addOns);
    }

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new disk.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddOns(java.util.Collection)} or {@link #withAddOns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param addOns
     *        An array of objects that represent the add-ons to enable for the new disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withAddOns(AddOnRequest... addOns) {
        if (this.addOns == null) {
            setAddOns(new java.util.ArrayList<AddOnRequest>(addOns.length));
        }
        for (AddOnRequest ele : addOns) {
            this.addOns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new disk.
     * </p>
     * 
     * @param addOns
     *        An array of objects that represent the add-ons to enable for the new disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withAddOns(java.util.Collection<AddOnRequest> addOns) {
        setAddOns(addOns);
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
        if (getDiskName() != null)
            sb.append("DiskName: ").append(getDiskName()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getSizeInGb() != null)
            sb.append("SizeInGb: ").append(getSizeInGb()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAddOns() != null)
            sb.append("AddOns: ").append(getAddOns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDiskRequest == false)
            return false;
        CreateDiskRequest other = (CreateDiskRequest) obj;
        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAddOns() == null ^ this.getAddOns() == null)
            return false;
        if (other.getAddOns() != null && other.getAddOns().equals(this.getAddOns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAddOns() == null) ? 0 : getAddOns().hashCode());
        return hashCode;
    }

    @Override
    public CreateDiskRequest clone() {
        return (CreateDiskRequest) super.clone();
    }

}
