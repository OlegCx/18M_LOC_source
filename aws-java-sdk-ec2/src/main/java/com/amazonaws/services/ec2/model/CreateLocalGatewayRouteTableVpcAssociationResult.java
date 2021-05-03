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
public class CreateLocalGatewayRouteTableVpcAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the association.
     * </p>
     */
    private LocalGatewayRouteTableVpcAssociation localGatewayRouteTableVpcAssociation;

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @param localGatewayRouteTableVpcAssociation
     *        Information about the association.
     */

    public void setLocalGatewayRouteTableVpcAssociation(LocalGatewayRouteTableVpcAssociation localGatewayRouteTableVpcAssociation) {
        this.localGatewayRouteTableVpcAssociation = localGatewayRouteTableVpcAssociation;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @return Information about the association.
     */

    public LocalGatewayRouteTableVpcAssociation getLocalGatewayRouteTableVpcAssociation() {
        return this.localGatewayRouteTableVpcAssociation;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @param localGatewayRouteTableVpcAssociation
     *        Information about the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableVpcAssociationResult withLocalGatewayRouteTableVpcAssociation(
            LocalGatewayRouteTableVpcAssociation localGatewayRouteTableVpcAssociation) {
        setLocalGatewayRouteTableVpcAssociation(localGatewayRouteTableVpcAssociation);
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
        if (getLocalGatewayRouteTableVpcAssociation() != null)
            sb.append("LocalGatewayRouteTableVpcAssociation: ").append(getLocalGatewayRouteTableVpcAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocalGatewayRouteTableVpcAssociationResult == false)
            return false;
        CreateLocalGatewayRouteTableVpcAssociationResult other = (CreateLocalGatewayRouteTableVpcAssociationResult) obj;
        if (other.getLocalGatewayRouteTableVpcAssociation() == null ^ this.getLocalGatewayRouteTableVpcAssociation() == null)
            return false;
        if (other.getLocalGatewayRouteTableVpcAssociation() != null
                && other.getLocalGatewayRouteTableVpcAssociation().equals(this.getLocalGatewayRouteTableVpcAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalGatewayRouteTableVpcAssociation() == null) ? 0 : getLocalGatewayRouteTableVpcAssociation().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocalGatewayRouteTableVpcAssociationResult clone() {
        try {
            return (CreateLocalGatewayRouteTableVpcAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
