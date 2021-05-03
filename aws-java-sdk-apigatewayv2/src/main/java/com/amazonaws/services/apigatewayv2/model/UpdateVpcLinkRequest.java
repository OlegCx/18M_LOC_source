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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a VPC link.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     */
    private String vpcLinkId;

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     * 
     * @param name
     *        The name of the VPC link.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     * 
     * @return The name of the VPC link.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     * 
     * @param name
     *        The name of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     * 
     * @param vpcLinkId
     *        The ID of the VPC link.
     */

    public void setVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     * 
     * @return The ID of the VPC link.
     */

    public String getVpcLinkId() {
        return this.vpcLinkId;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     * 
     * @param vpcLinkId
     *        The ID of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkRequest withVpcLinkId(String vpcLinkId) {
        setVpcLinkId(vpcLinkId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVpcLinkId() != null)
            sb.append("VpcLinkId: ").append(getVpcLinkId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVpcLinkRequest == false)
            return false;
        UpdateVpcLinkRequest other = (UpdateVpcLinkRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVpcLinkId() == null ^ this.getVpcLinkId() == null)
            return false;
        if (other.getVpcLinkId() != null && other.getVpcLinkId().equals(this.getVpcLinkId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVpcLinkId() == null) ? 0 : getVpcLinkId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcLinkRequest clone() {
        return (UpdateVpcLinkRequest) super.clone();
    }

}
