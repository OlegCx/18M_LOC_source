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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNatGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     */
    private String natGatewayId;

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @return The ID of the NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNatGatewayResult withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
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
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNatGatewayResult == false)
            return false;
        DeleteNatGatewayResult other = (DeleteNatGatewayResult) obj;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNatGatewayResult clone() {
        try {
            return (DeleteNatGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
