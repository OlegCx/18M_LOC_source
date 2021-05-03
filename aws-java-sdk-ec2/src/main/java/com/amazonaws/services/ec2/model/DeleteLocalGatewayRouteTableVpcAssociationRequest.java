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
import com.amazonaws.services.ec2.model.transform.DeleteLocalGatewayRouteTableVpcAssociationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLocalGatewayRouteTableVpcAssociationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteLocalGatewayRouteTableVpcAssociationRequest> {

    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String localGatewayRouteTableVpcAssociationId;

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param localGatewayRouteTableVpcAssociationId
     *        The ID of the association.
     */

    public void setLocalGatewayRouteTableVpcAssociationId(String localGatewayRouteTableVpcAssociationId) {
        this.localGatewayRouteTableVpcAssociationId = localGatewayRouteTableVpcAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getLocalGatewayRouteTableVpcAssociationId() {
        return this.localGatewayRouteTableVpcAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param localGatewayRouteTableVpcAssociationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLocalGatewayRouteTableVpcAssociationRequest withLocalGatewayRouteTableVpcAssociationId(String localGatewayRouteTableVpcAssociationId) {
        setLocalGatewayRouteTableVpcAssociationId(localGatewayRouteTableVpcAssociationId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteLocalGatewayRouteTableVpcAssociationRequest> getDryRunRequest() {
        Request<DeleteLocalGatewayRouteTableVpcAssociationRequest> request = new DeleteLocalGatewayRouteTableVpcAssociationRequestMarshaller().marshall(this);
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
        if (getLocalGatewayRouteTableVpcAssociationId() != null)
            sb.append("LocalGatewayRouteTableVpcAssociationId: ").append(getLocalGatewayRouteTableVpcAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLocalGatewayRouteTableVpcAssociationRequest == false)
            return false;
        DeleteLocalGatewayRouteTableVpcAssociationRequest other = (DeleteLocalGatewayRouteTableVpcAssociationRequest) obj;
        if (other.getLocalGatewayRouteTableVpcAssociationId() == null ^ this.getLocalGatewayRouteTableVpcAssociationId() == null)
            return false;
        if (other.getLocalGatewayRouteTableVpcAssociationId() != null
                && other.getLocalGatewayRouteTableVpcAssociationId().equals(this.getLocalGatewayRouteTableVpcAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalGatewayRouteTableVpcAssociationId() == null) ? 0 : getLocalGatewayRouteTableVpcAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLocalGatewayRouteTableVpcAssociationRequest clone() {
        return (DeleteLocalGatewayRouteTableVpcAssociationRequest) super.clone();
    }
}
