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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an Elastic IP address, or a carrier IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Address" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Address implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The Elastic IP address.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The ID representing the association of the address with an instance in a VPC.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     */
    private String networkInterfaceOwnerId;
    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * Any tags assigned to the Elastic IP address.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of an address pool.
     * </p>
     */
    private String publicIpv4Pool;
    /**
     * <p>
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     * addresses.
     * </p>
     */
    private String networkBorderGroup;
    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     */
    private String customerOwnedIp;
    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     */
    private String customerOwnedIpv4Pool;
    /**
     * <p>
     * The carrier IP address associated. This option is only available for network interfaces which reside in a subnet
     * in a Wavelength Zone (for example an EC2 instance).
     * </p>
     */
    private String carrierIp;

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that the address is associated with (if any).
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     * 
     * @return The ID of the instance that the address is associated with (if any).
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that the address is associated with (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @return The Elastic IP address.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     * 
     * @param allocationId
     *        The ID representing the allocation of the address for use with EC2-VPC.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     * 
     * @return The ID representing the allocation of the address for use with EC2-VPC.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     * 
     * @param allocationId
     *        The ID representing the allocation of the address for use with EC2-VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a VPC.
     * </p>
     * 
     * @param associationId
     *        The ID representing the association of the address with an instance in a VPC.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a VPC.
     * </p>
     * 
     * @return The ID representing the association of the address with an instance in a VPC.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a VPC.
     * </p>
     * 
     * @param associationId
     *        The ID representing the association of the address with an instance in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @param domain
     *        Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>)
     *        or instances in a VPC (<code>vpc</code>).
     * @see DomainType
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @return Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>
     *         ) or instances in a VPC (<code>vpc</code>).
     * @see DomainType
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @param domain
     *        Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>)
     *        or instances in a VPC (<code>vpc</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public Address withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @param domain
     *        Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>)
     *        or instances in a VPC (<code>vpc</code>).
     * @see DomainType
     */

    public void setDomain(DomainType domain) {
        withDomain(domain);
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @param domain
     *        Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>)
     *        or instances in a VPC (<code>vpc</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public Address withDomain(DomainType domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     * 
     * @param networkInterfaceOwnerId
     *        The ID of the AWS account that owns the network interface.
     */

    public void setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        this.networkInterfaceOwnerId = networkInterfaceOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     * 
     * @return The ID of the AWS account that owns the network interface.
     */

    public String getNetworkInterfaceOwnerId() {
        return this.networkInterfaceOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     * 
     * @param networkInterfaceOwnerId
     *        The ID of the AWS account that owns the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        setNetworkInterfaceOwnerId(networkInterfaceOwnerId);
        return this;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address associated with the Elastic IP address.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @return The private IP address associated with the Elastic IP address.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address associated with the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Elastic IP address.
     * </p>
     * 
     * @return Any tags assigned to the Elastic IP address.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Elastic IP address.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Elastic IP address.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the Elastic IP address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Elastic IP address.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of an address pool.
     * </p>
     * 
     * @param publicIpv4Pool
     *        The ID of an address pool.
     */

    public void setPublicIpv4Pool(String publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
    }

    /**
     * <p>
     * The ID of an address pool.
     * </p>
     * 
     * @return The ID of an address pool.
     */

    public String getPublicIpv4Pool() {
        return this.publicIpv4Pool;
    }

    /**
     * <p>
     * The ID of an address pool.
     * </p>
     * 
     * @param publicIpv4Pool
     *        The ID of an address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPublicIpv4Pool(String publicIpv4Pool) {
        setPublicIpv4Pool(publicIpv4Pool);
        return this;
    }

    /**
     * <p>
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     * addresses.
     * </p>
     * 
     * @param networkBorderGroup
     *        The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS
     *        advertises IP addresses.
     */

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     * addresses.
     * </p>
     * 
     * @return The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS
     *         advertises IP addresses.
     */

    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }

    /**
     * <p>
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     * addresses.
     * </p>
     * 
     * @param networkBorderGroup
     *        The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS
     *        advertises IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
        return this;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     * 
     * @param customerOwnedIp
     *        The customer-owned IP address.
     */

    public void setCustomerOwnedIp(String customerOwnedIp) {
        this.customerOwnedIp = customerOwnedIp;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     * 
     * @return The customer-owned IP address.
     */

    public String getCustomerOwnedIp() {
        return this.customerOwnedIp;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     * 
     * @param customerOwnedIp
     *        The customer-owned IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCustomerOwnedIp(String customerOwnedIp) {
        setCustomerOwnedIp(customerOwnedIp);
        return this;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @param customerOwnedIpv4Pool
     *        The ID of the customer-owned address pool.
     */

    public void setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @return The ID of the customer-owned address pool.
     */

    public String getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @param customerOwnedIpv4Pool
     *        The ID of the customer-owned address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        setCustomerOwnedIpv4Pool(customerOwnedIpv4Pool);
        return this;
    }

    /**
     * <p>
     * The carrier IP address associated. This option is only available for network interfaces which reside in a subnet
     * in a Wavelength Zone (for example an EC2 instance).
     * </p>
     * 
     * @param carrierIp
     *        The carrier IP address associated. This option is only available for network interfaces which reside in a
     *        subnet in a Wavelength Zone (for example an EC2 instance).
     */

    public void setCarrierIp(String carrierIp) {
        this.carrierIp = carrierIp;
    }

    /**
     * <p>
     * The carrier IP address associated. This option is only available for network interfaces which reside in a subnet
     * in a Wavelength Zone (for example an EC2 instance).
     * </p>
     * 
     * @return The carrier IP address associated. This option is only available for network interfaces which reside in a
     *         subnet in a Wavelength Zone (for example an EC2 instance).
     */

    public String getCarrierIp() {
        return this.carrierIp;
    }

    /**
     * <p>
     * The carrier IP address associated. This option is only available for network interfaces which reside in a subnet
     * in a Wavelength Zone (for example an EC2 instance).
     * </p>
     * 
     * @param carrierIp
     *        The carrier IP address associated. This option is only available for network interfaces which reside in a
     *        subnet in a Wavelength Zone (for example an EC2 instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCarrierIp(String carrierIp) {
        setCarrierIp(carrierIp);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getNetworkInterfaceOwnerId() != null)
            sb.append("NetworkInterfaceOwnerId: ").append(getNetworkInterfaceOwnerId()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPublicIpv4Pool() != null)
            sb.append("PublicIpv4Pool: ").append(getPublicIpv4Pool()).append(",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: ").append(getNetworkBorderGroup()).append(",");
        if (getCustomerOwnedIp() != null)
            sb.append("CustomerOwnedIp: ").append(getCustomerOwnedIp()).append(",");
        if (getCustomerOwnedIpv4Pool() != null)
            sb.append("CustomerOwnedIpv4Pool: ").append(getCustomerOwnedIpv4Pool()).append(",");
        if (getCarrierIp() != null)
            sb.append("CarrierIp: ").append(getCarrierIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Address == false)
            return false;
        Address other = (Address) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkInterfaceOwnerId() == null ^ this.getNetworkInterfaceOwnerId() == null)
            return false;
        if (other.getNetworkInterfaceOwnerId() != null && other.getNetworkInterfaceOwnerId().equals(this.getNetworkInterfaceOwnerId()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPublicIpv4Pool() == null ^ this.getPublicIpv4Pool() == null)
            return false;
        if (other.getPublicIpv4Pool() != null && other.getPublicIpv4Pool().equals(this.getPublicIpv4Pool()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getCustomerOwnedIp() == null ^ this.getCustomerOwnedIp() == null)
            return false;
        if (other.getCustomerOwnedIp() != null && other.getCustomerOwnedIp().equals(this.getCustomerOwnedIp()) == false)
            return false;
        if (other.getCustomerOwnedIpv4Pool() == null ^ this.getCustomerOwnedIpv4Pool() == null)
            return false;
        if (other.getCustomerOwnedIpv4Pool() != null && other.getCustomerOwnedIpv4Pool().equals(this.getCustomerOwnedIpv4Pool()) == false)
            return false;
        if (other.getCarrierIp() == null ^ this.getCarrierIp() == null)
            return false;
        if (other.getCarrierIp() != null && other.getCarrierIp().equals(this.getCarrierIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceOwnerId() == null) ? 0 : getNetworkInterfaceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPublicIpv4Pool() == null) ? 0 : getPublicIpv4Pool().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getCustomerOwnedIp() == null) ? 0 : getCustomerOwnedIp().hashCode());
        hashCode = prime * hashCode + ((getCustomerOwnedIpv4Pool() == null) ? 0 : getCustomerOwnedIpv4Pool().hashCode());
        hashCode = prime * hashCode + ((getCarrierIp() == null) ? 0 : getCarrierIp().hashCode());
        return hashCode;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
