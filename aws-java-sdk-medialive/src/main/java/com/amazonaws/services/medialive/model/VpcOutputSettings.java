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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The properties for a private VPC Output When this property is specified, the output egress addresses will be created
 * in a user specified VPC
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/VpcOutputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcOutputSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must specify one
     * for SINGLE_PIPELINE, two for STANDARD channels
     */
    private java.util.List<String> publicAddressAllocationIds;
    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     * specified then the VPC default security group will be used
     */
    private java.util.List<String> securityGroupIds;
    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     */
    private java.util.List<String> subnetIds;

    /**
     * List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must specify one
     * for SINGLE_PIPELINE, two for STANDARD channels
     * 
     * @return List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must
     *         specify one for SINGLE_PIPELINE, two for STANDARD channels
     */

    public java.util.List<String> getPublicAddressAllocationIds() {
        return publicAddressAllocationIds;
    }

    /**
     * List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must specify one
     * for SINGLE_PIPELINE, two for STANDARD channels
     * 
     * @param publicAddressAllocationIds
     *        List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must
     *        specify one for SINGLE_PIPELINE, two for STANDARD channels
     */

    public void setPublicAddressAllocationIds(java.util.Collection<String> publicAddressAllocationIds) {
        if (publicAddressAllocationIds == null) {
            this.publicAddressAllocationIds = null;
            return;
        }

        this.publicAddressAllocationIds = new java.util.ArrayList<String>(publicAddressAllocationIds);
    }

    /**
     * List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must specify one
     * for SINGLE_PIPELINE, two for STANDARD channels
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicAddressAllocationIds(java.util.Collection)} or
     * {@link #withPublicAddressAllocationIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param publicAddressAllocationIds
     *        List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must
     *        specify one for SINGLE_PIPELINE, two for STANDARD channels
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettings withPublicAddressAllocationIds(String... publicAddressAllocationIds) {
        if (this.publicAddressAllocationIds == null) {
            setPublicAddressAllocationIds(new java.util.ArrayList<String>(publicAddressAllocationIds.length));
        }
        for (String ele : publicAddressAllocationIds) {
            this.publicAddressAllocationIds.add(ele);
        }
        return this;
    }

    /**
     * List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must specify one
     * for SINGLE_PIPELINE, two for STANDARD channels
     * 
     * @param publicAddressAllocationIds
     *        List of public address allocation ids to associate with ENIs that will be created in Output VPC. Must
     *        specify one for SINGLE_PIPELINE, two for STANDARD channels
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettings withPublicAddressAllocationIds(java.util.Collection<String> publicAddressAllocationIds) {
        setPublicAddressAllocationIds(publicAddressAllocationIds);
        return this;
    }

    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     * specified then the VPC default security group will be used
     * 
     * @return A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     *         specified then the VPC default security group will be used
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     * specified then the VPC default security group will be used
     * 
     * @param securityGroupIds
     *        A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     *        specified then the VPC default security group will be used
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     * specified then the VPC default security group will be used
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     *        specified then the VPC default security group will be used
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettings withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     * specified then the VPC default security group will be used
     * 
     * @param securityGroupIds
     *        A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces. If none are
     *        specified then the VPC default security group will be used
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettings withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     * 
     * @return A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     *         availability zones (AZ).
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     *        availability zones (AZ).
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     *        availability zones (AZ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettings withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     *        availability zones (AZ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettings withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getPublicAddressAllocationIds() != null)
            sb.append("PublicAddressAllocationIds: ").append(getPublicAddressAllocationIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcOutputSettings == false)
            return false;
        VpcOutputSettings other = (VpcOutputSettings) obj;
        if (other.getPublicAddressAllocationIds() == null ^ this.getPublicAddressAllocationIds() == null)
            return false;
        if (other.getPublicAddressAllocationIds() != null && other.getPublicAddressAllocationIds().equals(this.getPublicAddressAllocationIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicAddressAllocationIds() == null) ? 0 : getPublicAddressAllocationIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public VpcOutputSettings clone() {
        try {
            return (VpcOutputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.VpcOutputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
