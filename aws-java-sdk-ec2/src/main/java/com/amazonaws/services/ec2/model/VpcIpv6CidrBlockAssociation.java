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
 * Describes an IPv6 CIDR block associated with a VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpcIpv6CidrBlockAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcIpv6CidrBlockAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The association ID for the IPv6 CIDR block.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     */
    private VpcCidrBlockState ipv6CidrBlockState;
    /**
     * <p>
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     * addresses, for example, <code>us-east-1-wl1-bos-wlz-1</code>.
     * </p>
     */
    private String networkBorderGroup;
    /**
     * <p>
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     * </p>
     */
    private String ipv6Pool;

    /**
     * <p>
     * The association ID for the IPv6 CIDR block.
     * </p>
     * 
     * @param associationId
     *        The association ID for the IPv6 CIDR block.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID for the IPv6 CIDR block.
     * </p>
     * 
     * @return The association ID for the IPv6 CIDR block.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID for the IPv6 CIDR block.
     * </p>
     * 
     * @param associationId
     *        The association ID for the IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIpv6CidrBlockAssociation withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @return The IPv6 CIDR block.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIpv6CidrBlockAssociation withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlockState
     *        Information about the state of the CIDR block.
     */

    public void setIpv6CidrBlockState(VpcCidrBlockState ipv6CidrBlockState) {
        this.ipv6CidrBlockState = ipv6CidrBlockState;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @return Information about the state of the CIDR block.
     */

    public VpcCidrBlockState getIpv6CidrBlockState() {
        return this.ipv6CidrBlockState;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlockState
     *        Information about the state of the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIpv6CidrBlockAssociation withIpv6CidrBlockState(VpcCidrBlockState ipv6CidrBlockState) {
        setIpv6CidrBlockState(ipv6CidrBlockState);
        return this;
    }

    /**
     * <p>
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     * addresses, for example, <code>us-east-1-wl1-bos-wlz-1</code>.
     * </p>
     * 
     * @param networkBorderGroup
     *        The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS
     *        advertises IP addresses, for example, <code>us-east-1-wl1-bos-wlz-1</code>.
     */

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     * addresses, for example, <code>us-east-1-wl1-bos-wlz-1</code>.
     * </p>
     * 
     * @return The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS
     *         advertises IP addresses, for example, <code>us-east-1-wl1-bos-wlz-1</code>.
     */

    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }

    /**
     * <p>
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     * addresses, for example, <code>us-east-1-wl1-bos-wlz-1</code>.
     * </p>
     * 
     * @param networkBorderGroup
     *        The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS
     *        advertises IP addresses, for example, <code>us-east-1-wl1-bos-wlz-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIpv6CidrBlockAssociation withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
        return this;
    }

    /**
     * <p>
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     * </p>
     * 
     * @param ipv6Pool
     *        The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     */

    public void setIpv6Pool(String ipv6Pool) {
        this.ipv6Pool = ipv6Pool;
    }

    /**
     * <p>
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     * </p>
     * 
     * @return The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     */

    public String getIpv6Pool() {
        return this.ipv6Pool;
    }

    /**
     * <p>
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     * </p>
     * 
     * @param ipv6Pool
     *        The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIpv6CidrBlockAssociation withIpv6Pool(String ipv6Pool) {
        setIpv6Pool(ipv6Pool);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
        if (getIpv6CidrBlockState() != null)
            sb.append("Ipv6CidrBlockState: ").append(getIpv6CidrBlockState()).append(",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: ").append(getNetworkBorderGroup()).append(",");
        if (getIpv6Pool() != null)
            sb.append("Ipv6Pool: ").append(getIpv6Pool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcIpv6CidrBlockAssociation == false)
            return false;
        VpcIpv6CidrBlockAssociation other = (VpcIpv6CidrBlockAssociation) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getIpv6CidrBlockState() == null ^ this.getIpv6CidrBlockState() == null)
            return false;
        if (other.getIpv6CidrBlockState() != null && other.getIpv6CidrBlockState().equals(this.getIpv6CidrBlockState()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getIpv6Pool() == null ^ this.getIpv6Pool() == null)
            return false;
        if (other.getIpv6Pool() != null && other.getIpv6Pool().equals(this.getIpv6Pool()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlockState() == null) ? 0 : getIpv6CidrBlockState().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getIpv6Pool() == null) ? 0 : getIpv6Pool().hashCode());
        return hashCode;
    }

    @Override
    public VpcIpv6CidrBlockAssociation clone() {
        try {
            return (VpcIpv6CidrBlockAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
