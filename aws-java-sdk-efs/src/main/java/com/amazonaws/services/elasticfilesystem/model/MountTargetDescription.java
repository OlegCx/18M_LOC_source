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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a description of a mount target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/MountTargetDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MountTargetDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     */
    private String mountTargetId;
    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     */
    private String lifeCycleState;
    /**
     * <p>
     * Address at which the file system can be mounted by using the mount target.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The unique and consistent identifier of the Availability Zone that the mount target resides in. For example,
     * <code>use1-az1</code> is an AZ ID for the us-east-1 Region and it has the same location in every AWS account.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The name of the Availability Zone in which the mount target is located. Availability Zones are independently
     * mapped to names for each AWS account. For example, the Availability Zone <code>us-east-1a</code> for your AWS
     * account might not be the same location as <code>us-east-1a</code> for another AWS account.
     * </p>
     */
    private String availabilityZoneName;
    /**
     * <p>
     * The virtual private cloud (VPC) ID that the mount target is configured in.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     * 
     * @param ownerId
     *        AWS account ID that owns the resource.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     * 
     * @return AWS account ID that owns the resource.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     * 
     * @param ownerId
     *        AWS account ID that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     * 
     * @param mountTargetId
     *        System-assigned mount target ID.
     */

    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     * 
     * @return System-assigned mount target ID.
     */

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     * 
     * @param mountTargetId
     *        System-assigned mount target ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withMountTargetId(String mountTargetId) {
        setMountTargetId(mountTargetId);
        return this;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system for which the mount target is intended.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     * 
     * @return The ID of the file system for which the mount target is intended.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system for which the mount target is intended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the mount target's subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     * 
     * @return The ID of the mount target's subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the mount target's subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle state of the mount target.
     * @see LifeCycleState
     */

    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @return Lifecycle state of the mount target.
     * @see LifeCycleState
     */

    public String getLifeCycleState() {
        return this.lifeCycleState;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle state of the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public MountTargetDescription withLifeCycleState(String lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle state of the mount target.
     * @see LifeCycleState
     */

    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        withLifeCycleState(lifeCycleState);
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle state of the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public MountTargetDescription withLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
        return this;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount target.
     * </p>
     * 
     * @param ipAddress
     *        Address at which the file system can be mounted by using the mount target.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount target.
     * </p>
     * 
     * @return Address at which the file system can be mounted by using the mount target.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount target.
     * </p>
     * 
     * @param ipAddress
     *        Address at which the file system can be mounted by using the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface that Amazon EFS created when it created the mount target.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * </p>
     * 
     * @return The ID of the network interface that Amazon EFS created when it created the mount target.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface that Amazon EFS created when it created the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The unique and consistent identifier of the Availability Zone that the mount target resides in. For example,
     * <code>use1-az1</code> is an AZ ID for the us-east-1 Region and it has the same location in every AWS account.
     * </p>
     * 
     * @param availabilityZoneId
     *        The unique and consistent identifier of the Availability Zone that the mount target resides in. For
     *        example, <code>use1-az1</code> is an AZ ID for the us-east-1 Region and it has the same location in every
     *        AWS account.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The unique and consistent identifier of the Availability Zone that the mount target resides in. For example,
     * <code>use1-az1</code> is an AZ ID for the us-east-1 Region and it has the same location in every AWS account.
     * </p>
     * 
     * @return The unique and consistent identifier of the Availability Zone that the mount target resides in. For
     *         example, <code>use1-az1</code> is an AZ ID for the us-east-1 Region and it has the same location in every
     *         AWS account.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The unique and consistent identifier of the Availability Zone that the mount target resides in. For example,
     * <code>use1-az1</code> is an AZ ID for the us-east-1 Region and it has the same location in every AWS account.
     * </p>
     * 
     * @param availabilityZoneId
     *        The unique and consistent identifier of the Availability Zone that the mount target resides in. For
     *        example, <code>use1-az1</code> is an AZ ID for the us-east-1 Region and it has the same location in every
     *        AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the mount target is located. Availability Zones are independently
     * mapped to names for each AWS account. For example, the Availability Zone <code>us-east-1a</code> for your AWS
     * account might not be the same location as <code>us-east-1a</code> for another AWS account.
     * </p>
     * 
     * @param availabilityZoneName
     *        The name of the Availability Zone in which the mount target is located. Availability Zones are
     *        independently mapped to names for each AWS account. For example, the Availability Zone
     *        <code>us-east-1a</code> for your AWS account might not be the same location as <code>us-east-1a</code> for
     *        another AWS account.
     */

    public void setAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the mount target is located. Availability Zones are independently
     * mapped to names for each AWS account. For example, the Availability Zone <code>us-east-1a</code> for your AWS
     * account might not be the same location as <code>us-east-1a</code> for another AWS account.
     * </p>
     * 
     * @return The name of the Availability Zone in which the mount target is located. Availability Zones are
     *         independently mapped to names for each AWS account. For example, the Availability Zone
     *         <code>us-east-1a</code> for your AWS account might not be the same location as <code>us-east-1a</code>
     *         for another AWS account.
     */

    public String getAvailabilityZoneName() {
        return this.availabilityZoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the mount target is located. Availability Zones are independently
     * mapped to names for each AWS account. For example, the Availability Zone <code>us-east-1a</code> for your AWS
     * account might not be the same location as <code>us-east-1a</code> for another AWS account.
     * </p>
     * 
     * @param availabilityZoneName
     *        The name of the Availability Zone in which the mount target is located. Availability Zones are
     *        independently mapped to names for each AWS account. For example, the Availability Zone
     *        <code>us-east-1a</code> for your AWS account might not be the same location as <code>us-east-1a</code> for
     *        another AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withAvailabilityZoneName(String availabilityZoneName) {
        setAvailabilityZoneName(availabilityZoneName);
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) ID that the mount target is configured in.
     * </p>
     * 
     * @param vpcId
     *        The virtual private cloud (VPC) ID that the mount target is configured in.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) ID that the mount target is configured in.
     * </p>
     * 
     * @return The virtual private cloud (VPC) ID that the mount target is configured in.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) ID that the mount target is configured in.
     * </p>
     * 
     * @param vpcId
     *        The virtual private cloud (VPC) ID that the mount target is configured in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountTargetDescription withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getMountTargetId() != null)
            sb.append("MountTargetId: ").append(getMountTargetId()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: ").append(getLifeCycleState()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getAvailabilityZoneName() != null)
            sb.append("AvailabilityZoneName: ").append(getAvailabilityZoneName()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MountTargetDescription == false)
            return false;
        MountTargetDescription other = (MountTargetDescription) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLifeCycleState() == null ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getAvailabilityZoneName() == null ^ this.getAvailabilityZoneName() == null)
            return false;
        if (other.getAvailabilityZoneName() != null && other.getAvailabilityZoneName().equals(this.getAvailabilityZoneName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getLifeCycleState() == null) ? 0 : getLifeCycleState().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneName() == null) ? 0 : getAvailabilityZoneName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public MountTargetDescription clone() {
        try {
            return (MountTargetDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.MountTargetDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
