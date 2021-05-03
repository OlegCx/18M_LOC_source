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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The virtual private cloud (VPC) endpoint settings that are configured for your file transfer protocol-enabled server.
 * With a VPC endpoint, you can restrict access to your server and resources only within your VPC. To control incoming
 * internet traffic, invoke the <code>UpdateServer</code> API and attach an Elastic IP to your server's endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/EndpointDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic IP address to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only valid in
     * the <code>UpdateServer</code> API.
     * </p>
     * </note>
     */
    private java.util.List<String> addressAllocationIds;
    /**
     * <p>
     * A list of subnet IDs that are required to host your server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The VPC ID of the VPC in which a server's endpoint will be hosted.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     */
    private String vpcId;
    /**
     * <p>
     * A list of security groups IDs that are available to attach to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * <p>
     * You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and only if you
     * are changing the <code>EndpointType</code> from <code>PUBLIC</code> or <code>VPC_ENDPOINT</code> to
     * <code>VPC</code>.
     * </p>
     * </note>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic IP address to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only valid in
     * the <code>UpdateServer</code> API.
     * </p>
     * </note>
     * 
     * @return A list of address allocation IDs that are required to attach an Elastic IP address to your server's
     *         endpoint.</p> <note>
     *         <p>
     *         This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only
     *         valid in the <code>UpdateServer</code> API.
     *         </p>
     */

    public java.util.List<String> getAddressAllocationIds() {
        return addressAllocationIds;
    }

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic IP address to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only valid in
     * the <code>UpdateServer</code> API.
     * </p>
     * </note>
     * 
     * @param addressAllocationIds
     *        A list of address allocation IDs that are required to attach an Elastic IP address to your server's
     *        endpoint.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only
     *        valid in the <code>UpdateServer</code> API.
     *        </p>
     */

    public void setAddressAllocationIds(java.util.Collection<String> addressAllocationIds) {
        if (addressAllocationIds == null) {
            this.addressAllocationIds = null;
            return;
        }

        this.addressAllocationIds = new java.util.ArrayList<String>(addressAllocationIds);
    }

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic IP address to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only valid in
     * the <code>UpdateServer</code> API.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddressAllocationIds(java.util.Collection)} or {@link #withAddressAllocationIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param addressAllocationIds
     *        A list of address allocation IDs that are required to attach an Elastic IP address to your server's
     *        endpoint.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only
     *        valid in the <code>UpdateServer</code> API.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withAddressAllocationIds(String... addressAllocationIds) {
        if (this.addressAllocationIds == null) {
            setAddressAllocationIds(new java.util.ArrayList<String>(addressAllocationIds.length));
        }
        for (String ele : addressAllocationIds) {
            this.addressAllocationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic IP address to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only valid in
     * the <code>UpdateServer</code> API.
     * </p>
     * </note>
     * 
     * @param addressAllocationIds
     *        A list of address allocation IDs that are required to attach an Elastic IP address to your server's
     *        endpoint.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code> and it is only
     *        valid in the <code>UpdateServer</code> API.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withAddressAllocationIds(java.util.Collection<String> addressAllocationIds) {
        setAddressAllocationIds(addressAllocationIds);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs that are required to host your server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @return A list of subnet IDs that are required to host your server endpoint in your VPC.</p> <note>
     *         <p>
     *         This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *         </p>
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs that are required to host your server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @param subnetIds
     *        A list of subnet IDs that are required to host your server endpoint in your VPC.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *        </p>
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of subnet IDs that are required to host your server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs that are required to host your server endpoint in your VPC.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs that are required to host your server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @param subnetIds
     *        A list of subnet IDs that are required to host your server endpoint in your VPC.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC_ENDPOINT</code>.
     *        </p>
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * 
     * @return The ID of the VPC endpoint.</p> <note>
     *         <p>
     *         This property can only be set when <code>EndpointType</code> is set to <code>VPC_ENDPOINT</code>.
     *         </p>
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC_ENDPOINT</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The VPC ID of the VPC in which a server's endpoint will be hosted.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @param vpcId
     *        The VPC ID of the VPC in which a server's endpoint will be hosted.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *        </p>
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the VPC in which a server's endpoint will be hosted.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @return The VPC ID of the VPC in which a server's endpoint will be hosted.</p> <note>
     *         <p>
     *         This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *         </p>
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID of the VPC in which a server's endpoint will be hosted.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @param vpcId
     *        The VPC ID of the VPC in which a server's endpoint will be hosted.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A list of security groups IDs that are available to attach to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * <p>
     * You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and only if you
     * are changing the <code>EndpointType</code> from <code>PUBLIC</code> or <code>VPC_ENDPOINT</code> to
     * <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @return A list of security groups IDs that are available to attach to your server's endpoint.</p> <note>
     *         <p>
     *         This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *         </p>
     *         <p>
     *         You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and
     *         only if you are changing the <code>EndpointType</code> from <code>PUBLIC</code> or
     *         <code>VPC_ENDPOINT</code> to <code>VPC</code>.
     *         </p>
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security groups IDs that are available to attach to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * <p>
     * You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and only if you
     * are changing the <code>EndpointType</code> from <code>PUBLIC</code> or <code>VPC_ENDPOINT</code> to
     * <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @param securityGroupIds
     *        A list of security groups IDs that are available to attach to your server's endpoint.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *        </p>
     *        <p>
     *        You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and only
     *        if you are changing the <code>EndpointType</code> from <code>PUBLIC</code> or <code>VPC_ENDPOINT</code> to
     *        <code>VPC</code>.
     *        </p>
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of security groups IDs that are available to attach to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * <p>
     * You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and only if you
     * are changing the <code>EndpointType</code> from <code>PUBLIC</code> or <code>VPC_ENDPOINT</code> to
     * <code>VPC</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security groups IDs that are available to attach to your server's endpoint.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *        </p>
     *        <p>
     *        You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and only
     *        if you are changing the <code>EndpointType</code> from <code>PUBLIC</code> or <code>VPC_ENDPOINT</code> to
     *        <code>VPC</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security groups IDs that are available to attach to your server's endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     * </p>
     * <p>
     * You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and only if you
     * are changing the <code>EndpointType</code> from <code>PUBLIC</code> or <code>VPC_ENDPOINT</code> to
     * <code>VPC</code>.
     * </p>
     * </note>
     * 
     * @param securityGroupIds
     *        A list of security groups IDs that are available to attach to your server's endpoint.</p> <note>
     *        <p>
     *        This property can only be set when <code>EndpointType</code> is set to <code>VPC</code>.
     *        </p>
     *        <p>
     *        You can only edit the <code>SecurityGroupIds</code> property in the <code>UpdateServer</code> API and only
     *        if you are changing the <code>EndpointType</code> from <code>PUBLIC</code> or <code>VPC_ENDPOINT</code> to
     *        <code>VPC</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getAddressAllocationIds() != null)
            sb.append("AddressAllocationIds: ").append(getAddressAllocationIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointDetails == false)
            return false;
        EndpointDetails other = (EndpointDetails) obj;
        if (other.getAddressAllocationIds() == null ^ this.getAddressAllocationIds() == null)
            return false;
        if (other.getAddressAllocationIds() != null && other.getAddressAllocationIds().equals(this.getAddressAllocationIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressAllocationIds() == null) ? 0 : getAddressAllocationIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public EndpointDetails clone() {
        try {
            return (EndpointDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.EndpointDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
