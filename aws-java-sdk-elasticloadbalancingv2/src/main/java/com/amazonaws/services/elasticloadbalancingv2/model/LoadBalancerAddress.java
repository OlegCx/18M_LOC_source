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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a static IP address for a load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/LoadBalancerAddress"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerAddress implements Serializable, Cloneable {

    /**
     * <p>
     * The static IP address.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * [Network Load Balancers] The private IPv4 address for an internal load balancer.
     * </p>
     */
    private String privateIPv4Address;
    /**
     * <p>
     * [Network Load Balancers] The IPv6 address.
     * </p>
     */
    private String iPv6Address;

    /**
     * <p>
     * The static IP address.
     * </p>
     * 
     * @param ipAddress
     *        The static IP address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The static IP address.
     * </p>
     * 
     * @return The static IP address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The static IP address.
     * </p>
     * 
     * @param ipAddress
     *        The static IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAddress withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
     * </p>
     * 
     * @param allocationId
     *        [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
     * </p>
     * 
     * @return [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load
     *         balancer.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
     * </p>
     * 
     * @param allocationId
     *        [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAddress withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * [Network Load Balancers] The private IPv4 address for an internal load balancer.
     * </p>
     * 
     * @param privateIPv4Address
     *        [Network Load Balancers] The private IPv4 address for an internal load balancer.
     */

    public void setPrivateIPv4Address(String privateIPv4Address) {
        this.privateIPv4Address = privateIPv4Address;
    }

    /**
     * <p>
     * [Network Load Balancers] The private IPv4 address for an internal load balancer.
     * </p>
     * 
     * @return [Network Load Balancers] The private IPv4 address for an internal load balancer.
     */

    public String getPrivateIPv4Address() {
        return this.privateIPv4Address;
    }

    /**
     * <p>
     * [Network Load Balancers] The private IPv4 address for an internal load balancer.
     * </p>
     * 
     * @param privateIPv4Address
     *        [Network Load Balancers] The private IPv4 address for an internal load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAddress withPrivateIPv4Address(String privateIPv4Address) {
        setPrivateIPv4Address(privateIPv4Address);
        return this;
    }

    /**
     * <p>
     * [Network Load Balancers] The IPv6 address.
     * </p>
     * 
     * @param iPv6Address
     *        [Network Load Balancers] The IPv6 address.
     */

    public void setIPv6Address(String iPv6Address) {
        this.iPv6Address = iPv6Address;
    }

    /**
     * <p>
     * [Network Load Balancers] The IPv6 address.
     * </p>
     * 
     * @return [Network Load Balancers] The IPv6 address.
     */

    public String getIPv6Address() {
        return this.iPv6Address;
    }

    /**
     * <p>
     * [Network Load Balancers] The IPv6 address.
     * </p>
     * 
     * @param iPv6Address
     *        [Network Load Balancers] The IPv6 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAddress withIPv6Address(String iPv6Address) {
        setIPv6Address(iPv6Address);
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
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getPrivateIPv4Address() != null)
            sb.append("PrivateIPv4Address: ").append(getPrivateIPv4Address()).append(",");
        if (getIPv6Address() != null)
            sb.append("IPv6Address: ").append(getIPv6Address());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerAddress == false)
            return false;
        LoadBalancerAddress other = (LoadBalancerAddress) obj;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getPrivateIPv4Address() == null ^ this.getPrivateIPv4Address() == null)
            return false;
        if (other.getPrivateIPv4Address() != null && other.getPrivateIPv4Address().equals(this.getPrivateIPv4Address()) == false)
            return false;
        if (other.getIPv6Address() == null ^ this.getIPv6Address() == null)
            return false;
        if (other.getIPv6Address() != null && other.getIPv6Address().equals(this.getIPv6Address()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIPv4Address() == null) ? 0 : getPrivateIPv4Address().hashCode());
        hashCode = prime * hashCode + ((getIPv6Address() == null) ? 0 : getIPv6Address().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerAddress clone() {
        try {
            return (LoadBalancerAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
