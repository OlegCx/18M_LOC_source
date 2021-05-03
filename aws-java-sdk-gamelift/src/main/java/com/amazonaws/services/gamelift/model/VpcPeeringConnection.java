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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a peering connection between a VPC on one of your AWS accounts and the VPC for your Amazon GameLift
 * fleets. This record may be for an active peering connection or a pending connection that has not yet been
 * established.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> | <a>DeleteVpcPeeringAuthorization</a>
 * | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> | <a>DeleteVpcPeeringConnection</a> | <a
 * href=
 * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
 * >All APIs by task</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/VpcPeeringConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcPeeringConnection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift fleet resource for this connection.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC also has
     * an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection cannot be created.
     * </p>
     */
    private String ipV4CidrBlock;
    /**
     * <p>
     * A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC peering
     * connection events, and is used when deleting a connection with <a>DeleteVpcPeeringConnection</a>.
     * </p>
     */
    private String vpcPeeringConnectionId;
    /**
     * <p>
     * The status information about the connection. Status indicates if a connection is pending, successful, or failed.
     * </p>
     */
    private VpcPeeringConnectionStatus status;
    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in the same
     * Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with GameLift
     * Fleets</a>.
     * </p>
     */
    private String peerVpcId;
    /**
     * <p>
     * A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is managed
     * by Amazon GameLift and does not appear in your AWS account.
     * </p>
     */
    private String gameLiftVpcId;

    /**
     * <p>
     * A unique identifier for the fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
     * </p>
     * 
     * @return A unique identifier for the fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift fleet resource for this connection.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *        GameLift fleet resource for this connection.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift fleet resource for this connection.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *         GameLift fleet resource for this connection.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift fleet resource for this connection.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *        GameLift fleet resource for this connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC also has
     * an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection cannot be created.
     * </p>
     * 
     * @param ipV4CidrBlock
     *        CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC
     *        also has an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection
     *        cannot be created.
     */

    public void setIpV4CidrBlock(String ipV4CidrBlock) {
        this.ipV4CidrBlock = ipV4CidrBlock;
    }

    /**
     * <p>
     * CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC also has
     * an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection cannot be created.
     * </p>
     * 
     * @return CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC
     *         also has an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection
     *         cannot be created.
     */

    public String getIpV4CidrBlock() {
        return this.ipV4CidrBlock;
    }

    /**
     * <p>
     * CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC also has
     * an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection cannot be created.
     * </p>
     * 
     * @param ipV4CidrBlock
     *        CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC
     *        also has an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection
     *        cannot be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withIpV4CidrBlock(String ipV4CidrBlock) {
        setIpV4CidrBlock(ipV4CidrBlock);
        return this;
    }

    /**
     * <p>
     * A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC peering
     * connection events, and is used when deleting a connection with <a>DeleteVpcPeeringConnection</a>.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC
     *        peering connection events, and is used when deleting a connection with <a>DeleteVpcPeeringConnection</a>.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC peering
     * connection events, and is used when deleting a connection with <a>DeleteVpcPeeringConnection</a>.
     * </p>
     * 
     * @return A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC
     *         peering connection events, and is used when deleting a connection with <a>DeleteVpcPeeringConnection</a>.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC peering
     * connection events, and is used when deleting a connection with <a>DeleteVpcPeeringConnection</a>.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC
     *        peering connection events, and is used when deleting a connection with <a>DeleteVpcPeeringConnection</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
        return this;
    }

    /**
     * <p>
     * The status information about the connection. Status indicates if a connection is pending, successful, or failed.
     * </p>
     * 
     * @param status
     *        The status information about the connection. Status indicates if a connection is pending, successful, or
     *        failed.
     */

    public void setStatus(VpcPeeringConnectionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status information about the connection. Status indicates if a connection is pending, successful, or failed.
     * </p>
     * 
     * @return The status information about the connection. Status indicates if a connection is pending, successful, or
     *         failed.
     */

    public VpcPeeringConnectionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status information about the connection. Status indicates if a connection is pending, successful, or failed.
     * </p>
     * 
     * @param status
     *        The status information about the connection. Status indicates if a connection is pending, successful, or
     *        failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withStatus(VpcPeeringConnectionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in the same
     * Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with GameLift
     * Fleets</a>.
     * </p>
     * 
     * @param peerVpcId
     *        A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in the
     *        same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     *        Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     *        GameLift Fleets</a>.
     */

    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in the same
     * Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with GameLift
     * Fleets</a>.
     * </p>
     * 
     * @return A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in
     *         the same Region as your fleet. To look up a VPC ID, use the <a
     *         href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more
     *         about VPC peering in <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     *         GameLift Fleets</a>.
     */

    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in the same
     * Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with GameLift
     * Fleets</a>.
     * </p>
     * 
     * @param peerVpcId
     *        A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in the
     *        same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     *        Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     *        GameLift Fleets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withPeerVpcId(String peerVpcId) {
        setPeerVpcId(peerVpcId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is managed
     * by Amazon GameLift and does not appear in your AWS account.
     * </p>
     * 
     * @param gameLiftVpcId
     *        A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is
     *        managed by Amazon GameLift and does not appear in your AWS account.
     */

    public void setGameLiftVpcId(String gameLiftVpcId) {
        this.gameLiftVpcId = gameLiftVpcId;
    }

    /**
     * <p>
     * A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is managed
     * by Amazon GameLift and does not appear in your AWS account.
     * </p>
     * 
     * @return A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is
     *         managed by Amazon GameLift and does not appear in your AWS account.
     */

    public String getGameLiftVpcId() {
        return this.gameLiftVpcId;
    }

    /**
     * <p>
     * A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is managed
     * by Amazon GameLift and does not appear in your AWS account.
     * </p>
     * 
     * @param gameLiftVpcId
     *        A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is
     *        managed by Amazon GameLift and does not appear in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withGameLiftVpcId(String gameLiftVpcId) {
        setGameLiftVpcId(gameLiftVpcId);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getIpV4CidrBlock() != null)
            sb.append("IpV4CidrBlock: ").append(getIpV4CidrBlock()).append(",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: ").append(getVpcPeeringConnectionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPeerVpcId() != null)
            sb.append("PeerVpcId: ").append(getPeerVpcId()).append(",");
        if (getGameLiftVpcId() != null)
            sb.append("GameLiftVpcId: ").append(getGameLiftVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcPeeringConnection == false)
            return false;
        VpcPeeringConnection other = (VpcPeeringConnection) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getIpV4CidrBlock() == null ^ this.getIpV4CidrBlock() == null)
            return false;
        if (other.getIpV4CidrBlock() != null && other.getIpV4CidrBlock().equals(this.getIpV4CidrBlock()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null)
            return false;
        if (other.getPeerVpcId() != null && other.getPeerVpcId().equals(this.getPeerVpcId()) == false)
            return false;
        if (other.getGameLiftVpcId() == null ^ this.getGameLiftVpcId() == null)
            return false;
        if (other.getGameLiftVpcId() != null && other.getGameLiftVpcId().equals(this.getGameLiftVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getIpV4CidrBlock() == null) ? 0 : getIpV4CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode());
        hashCode = prime * hashCode + ((getGameLiftVpcId() == null) ? 0 : getGameLiftVpcId().hashCode());
        return hashCode;
    }

    @Override
    public VpcPeeringConnection clone() {
        try {
            return (VpcPeeringConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.VpcPeeringConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
