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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateRouteRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateRouteRequest> {

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most specific
     * match. We modify the specified CIDR block to its canonical form; for example, if you specify
     * <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     */
    private String destinationIpv6CidrBlock;
    /**
     * <p>
     * The ID of a prefix list used for the destination match.
     * </p>
     */
    private String destinationPrefixListId;
    /**
     * <p>
     * The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     */
    private String egressOnlyInternetGatewayId;
    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway attached to your VPC.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;
    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * <p>
     * You can only use this option when the VPC contains a subnet which is associated with a Wavelength Zone.
     * </p>
     */
    private String carrierGatewayId;
    /**
     * <p>
     * The ID of a network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most specific
     * match. We modify the specified CIDR block to its canonical form; for example, if you specify
     * <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most
     *        specific match. We modify the specified CIDR block to its canonical form; for example, if you specify
     *        <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most specific
     * match. We modify the specified CIDR block to its canonical form; for example, if you specify
     * <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @return The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most
     *         specific match. We modify the specified CIDR block to its canonical form; for example, if you specify
     *         <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most specific
     * match. We modify the specified CIDR block to its canonical form; for example, if you specify
     * <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most
     *        specific match. We modify the specified CIDR block to its canonical form; for example, if you specify
     *        <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @param destinationIpv6CidrBlock
     *        The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific
     *        match.
     */

    public void setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @return The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific
     *         match.
     */

    public String getDestinationIpv6CidrBlock() {
        return this.destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @param destinationIpv6CidrBlock
     *        The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        setDestinationIpv6CidrBlock(destinationIpv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of a prefix list used for the destination match.
     * </p>
     * 
     * @param destinationPrefixListId
     *        The ID of a prefix list used for the destination match.
     */

    public void setDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    /**
     * <p>
     * The ID of a prefix list used for the destination match.
     * </p>
     * 
     * @return The ID of a prefix list used for the destination match.
     */

    public String getDestinationPrefixListId() {
        return this.destinationPrefixListId;
    }

    /**
     * <p>
     * The ID of a prefix list used for the destination match.
     * </p>
     * 
     * @param destinationPrefixListId
     *        The ID of a prefix list used for the destination match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withDestinationPrefixListId(String destinationPrefixListId) {
        setDestinationPrefixListId(destinationPrefixListId);
        return this;
    }

    /**
     * <p>
     * The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * </p>
     * 
     * @return The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        [IPv6 traffic only] The ID of an egress-only internet gateway.
     */

    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     * 
     * @return [IPv6 traffic only] The ID of an egress-only internet gateway.
     */

    public String getEgressOnlyInternetGatewayId() {
        return this.egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        [IPv6 traffic only] The ID of an egress-only internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        setEgressOnlyInternetGatewayId(egressOnlyInternetGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @param gatewayId
     *        The ID of an internet gateway or virtual private gateway attached to your VPC.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @return The ID of an internet gateway or virtual private gateway attached to your VPC.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @param gatewayId
     *        The ID of an internet gateway or virtual private gateway attached to your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @param instanceId
     *        The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     *        network interface is attached.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @return The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly
     *         one network interface is attached.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @param instanceId
     *        The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     *        network interface is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        [IPv4 traffic only] The ID of a NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     * 
     * @return [IPv4 traffic only] The ID of a NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        [IPv4 traffic only] The ID of a NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of a transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @return The ID of a transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of a transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     */

    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @return The ID of the local gateway.
     */

    public String getLocalGatewayId() {
        return this.localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withLocalGatewayId(String localGatewayId) {
        setLocalGatewayId(localGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * <p>
     * You can only use this option when the VPC contains a subnet which is associated with a Wavelength Zone.
     * </p>
     * 
     * @param carrierGatewayId
     *        The ID of the carrier gateway.</p>
     *        <p>
     *        You can only use this option when the VPC contains a subnet which is associated with a Wavelength Zone.
     */

    public void setCarrierGatewayId(String carrierGatewayId) {
        this.carrierGatewayId = carrierGatewayId;
    }

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * <p>
     * You can only use this option when the VPC contains a subnet which is associated with a Wavelength Zone.
     * </p>
     * 
     * @return The ID of the carrier gateway.</p>
     *         <p>
     *         You can only use this option when the VPC contains a subnet which is associated with a Wavelength Zone.
     */

    public String getCarrierGatewayId() {
        return this.carrierGatewayId;
    }

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * <p>
     * You can only use this option when the VPC contains a subnet which is associated with a Wavelength Zone.
     * </p>
     * 
     * @param carrierGatewayId
     *        The ID of the carrier gateway.</p>
     *        <p>
     *        You can only use this option when the VPC contains a subnet which is associated with a Wavelength Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withCarrierGatewayId(String carrierGatewayId) {
        setCarrierGatewayId(carrierGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of a network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @return The ID of a network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of a network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table for the route.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     * 
     * @return The ID of the route table for the route.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of a VPC peering connection.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @return The ID of a VPC peering connection.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of a VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateRouteRequest> getDryRunRequest() {
        Request<CreateRouteRequest> request = new CreateRouteRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getDestinationIpv6CidrBlock() != null)
            sb.append("DestinationIpv6CidrBlock: ").append(getDestinationIpv6CidrBlock()).append(",");
        if (getDestinationPrefixListId() != null)
            sb.append("DestinationPrefixListId: ").append(getDestinationPrefixListId()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getEgressOnlyInternetGatewayId() != null)
            sb.append("EgressOnlyInternetGatewayId: ").append(getEgressOnlyInternetGatewayId()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: ").append(getLocalGatewayId()).append(",");
        if (getCarrierGatewayId() != null)
            sb.append("CarrierGatewayId: ").append(getCarrierGatewayId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: ").append(getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRouteRequest == false)
            return false;
        CreateRouteRequest other = (CreateRouteRequest) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinationIpv6CidrBlock() == null ^ this.getDestinationIpv6CidrBlock() == null)
            return false;
        if (other.getDestinationIpv6CidrBlock() != null && other.getDestinationIpv6CidrBlock().equals(this.getDestinationIpv6CidrBlock()) == false)
            return false;
        if (other.getDestinationPrefixListId() == null ^ this.getDestinationPrefixListId() == null)
            return false;
        if (other.getDestinationPrefixListId() != null && other.getDestinationPrefixListId().equals(this.getDestinationPrefixListId()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getEgressOnlyInternetGatewayId() == null ^ this.getEgressOnlyInternetGatewayId() == null)
            return false;
        if (other.getEgressOnlyInternetGatewayId() != null && other.getEgressOnlyInternetGatewayId().equals(this.getEgressOnlyInternetGatewayId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getCarrierGatewayId() == null ^ this.getCarrierGatewayId() == null)
            return false;
        if (other.getCarrierGatewayId() != null && other.getCarrierGatewayId().equals(this.getCarrierGatewayId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDestinationIpv6CidrBlock() == null) ? 0 : getDestinationIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDestinationPrefixListId() == null) ? 0 : getDestinationPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getEgressOnlyInternetGatewayId() == null) ? 0 : getEgressOnlyInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCarrierGatewayId() == null) ? 0 : getCarrierGatewayId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRouteRequest clone() {
        return (CreateRouteRequest) super.clone();
    }
}
