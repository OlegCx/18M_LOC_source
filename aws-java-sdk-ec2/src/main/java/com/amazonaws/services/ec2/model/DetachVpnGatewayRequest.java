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
import com.amazonaws.services.ec2.model.transform.DetachVpnGatewayRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DetachVpnGateway.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachVpnGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DetachVpnGatewayRequest> {

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String vpnGatewayId;

    /**
     * Default constructor for DetachVpnGatewayRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DetachVpnGatewayRequest() {
    }

    /**
     * Constructs a new DetachVpnGatewayRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway.
     * @param vpcId
     *        The ID of the VPC.
     */
    public DetachVpnGatewayRequest(String vpnGatewayId, String vpcId) {
        setVpnGatewayId(vpnGatewayId);
        setVpcId(vpcId);
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVpnGatewayRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway.
     */

    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway.
     */

    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVpnGatewayRequest withVpnGatewayId(String vpnGatewayId) {
        setVpnGatewayId(vpnGatewayId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DetachVpnGatewayRequest> getDryRunRequest() {
        Request<DetachVpnGatewayRequest> request = new DetachVpnGatewayRequestMarshaller().marshall(this);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: ").append(getVpnGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachVpnGatewayRequest == false)
            return false;
        DetachVpnGatewayRequest other = (DetachVpnGatewayRequest) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public DetachVpnGatewayRequest clone() {
        return (DetachVpnGatewayRequest) super.clone();
    }
}
