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
 * Represents an authorization for a VPC peering connection between the VPC for an Amazon GameLift fleet and another VPC
 * on an account you have access to. This authorization must exist and be valid for the peering connection to be
 * established. Authorizations are valid for 24 hours after they are issued.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/VpcPeeringAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcPeeringAuthorization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the AWS account that you use to manage your GameLift fleet. You can find your Account ID
     * in the AWS Management Console under account settings.
     * </p>
     */
    private String gameLiftAwsAccountId;
    /** <p/> */
    private String peerVpcAwsAccountId;
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
     * Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number expressed in
     * Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date expirationTime;

    /**
     * <p>
     * A unique identifier for the AWS account that you use to manage your GameLift fleet. You can find your Account ID
     * in the AWS Management Console under account settings.
     * </p>
     * 
     * @param gameLiftAwsAccountId
     *        A unique identifier for the AWS account that you use to manage your GameLift fleet. You can find your
     *        Account ID in the AWS Management Console under account settings.
     */

    public void setGameLiftAwsAccountId(String gameLiftAwsAccountId) {
        this.gameLiftAwsAccountId = gameLiftAwsAccountId;
    }

    /**
     * <p>
     * A unique identifier for the AWS account that you use to manage your GameLift fleet. You can find your Account ID
     * in the AWS Management Console under account settings.
     * </p>
     * 
     * @return A unique identifier for the AWS account that you use to manage your GameLift fleet. You can find your
     *         Account ID in the AWS Management Console under account settings.
     */

    public String getGameLiftAwsAccountId() {
        return this.gameLiftAwsAccountId;
    }

    /**
     * <p>
     * A unique identifier for the AWS account that you use to manage your GameLift fleet. You can find your Account ID
     * in the AWS Management Console under account settings.
     * </p>
     * 
     * @param gameLiftAwsAccountId
     *        A unique identifier for the AWS account that you use to manage your GameLift fleet. You can find your
     *        Account ID in the AWS Management Console under account settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringAuthorization withGameLiftAwsAccountId(String gameLiftAwsAccountId) {
        setGameLiftAwsAccountId(gameLiftAwsAccountId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param peerVpcAwsAccountId
     */

    public void setPeerVpcAwsAccountId(String peerVpcAwsAccountId) {
        this.peerVpcAwsAccountId = peerVpcAwsAccountId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getPeerVpcAwsAccountId() {
        return this.peerVpcAwsAccountId;
    }

    /**
     * <p/>
     * 
     * @param peerVpcAwsAccountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringAuthorization withPeerVpcAwsAccountId(String peerVpcAwsAccountId) {
        setPeerVpcAwsAccountId(peerVpcAwsAccountId);
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

    public VpcPeeringAuthorization withPeerVpcId(String peerVpcId) {
        setPeerVpcId(peerVpcId);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as
     *         milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringAuthorization withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number expressed in
     * Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param expirationTime
     *        Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number
     *        expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number expressed in
     * Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number
     *         expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number expressed in
     * Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param expirationTime
     *        Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number
     *        expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringAuthorization withExpirationTime(java.util.Date expirationTime) {
        setExpirationTime(expirationTime);
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
        if (getGameLiftAwsAccountId() != null)
            sb.append("GameLiftAwsAccountId: ").append(getGameLiftAwsAccountId()).append(",");
        if (getPeerVpcAwsAccountId() != null)
            sb.append("PeerVpcAwsAccountId: ").append(getPeerVpcAwsAccountId()).append(",");
        if (getPeerVpcId() != null)
            sb.append("PeerVpcId: ").append(getPeerVpcId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcPeeringAuthorization == false)
            return false;
        VpcPeeringAuthorization other = (VpcPeeringAuthorization) obj;
        if (other.getGameLiftAwsAccountId() == null ^ this.getGameLiftAwsAccountId() == null)
            return false;
        if (other.getGameLiftAwsAccountId() != null && other.getGameLiftAwsAccountId().equals(this.getGameLiftAwsAccountId()) == false)
            return false;
        if (other.getPeerVpcAwsAccountId() == null ^ this.getPeerVpcAwsAccountId() == null)
            return false;
        if (other.getPeerVpcAwsAccountId() != null && other.getPeerVpcAwsAccountId().equals(this.getPeerVpcAwsAccountId()) == false)
            return false;
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null)
            return false;
        if (other.getPeerVpcId() != null && other.getPeerVpcId().equals(this.getPeerVpcId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameLiftAwsAccountId() == null) ? 0 : getGameLiftAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcAwsAccountId() == null) ? 0 : getPeerVpcAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        return hashCode;
    }

    @Override
    public VpcPeeringAuthorization clone() {
        try {
            return (VpcPeeringAuthorization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.VpcPeeringAuthorizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
