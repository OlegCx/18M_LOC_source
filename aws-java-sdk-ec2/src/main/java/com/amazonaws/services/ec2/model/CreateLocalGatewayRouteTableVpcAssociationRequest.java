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
import com.amazonaws.services.ec2.model.transform.CreateLocalGatewayRouteTableVpcAssociationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocalGatewayRouteTableVpcAssociationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateLocalGatewayRouteTableVpcAssociationRequest> {

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The tags to assign to the local gateway route table VPC association.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     */

    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @return The ID of the local gateway route table.
     */

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableVpcAssociationRequest withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
        return this;
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

    public CreateLocalGatewayRouteTableVpcAssociationRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the local gateway route table VPC association.
     * </p>
     * 
     * @return The tags to assign to the local gateway route table VPC association.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to the local gateway route table VPC association.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the local gateway route table VPC association.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to assign to the local gateway route table VPC association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the local gateway route table VPC association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableVpcAssociationRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to the local gateway route table VPC association.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the local gateway route table VPC association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableVpcAssociationRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateLocalGatewayRouteTableVpcAssociationRequest> getDryRunRequest() {
        Request<CreateLocalGatewayRouteTableVpcAssociationRequest> request = new CreateLocalGatewayRouteTableVpcAssociationRequestMarshaller().marshall(this);
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
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocalGatewayRouteTableVpcAssociationRequest == false)
            return false;
        CreateLocalGatewayRouteTableVpcAssociationRequest other = (CreateLocalGatewayRouteTableVpcAssociationRequest) obj;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocalGatewayRouteTableVpcAssociationRequest clone() {
        return (CreateLocalGatewayRouteTableVpcAssociationRequest) super.clone();
    }
}
