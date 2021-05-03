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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowVpcInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveFlowVpcInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The flow that you want to remove a VPC interface from. */
    private String flowArn;
    /** The name of the VPC interface that you want to remove. */
    private String vpcInterfaceName;

    /**
     * The flow that you want to remove a VPC interface from.
     * 
     * @param flowArn
     *        The flow that you want to remove a VPC interface from.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that you want to remove a VPC interface from.
     * 
     * @return The flow that you want to remove a VPC interface from.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that you want to remove a VPC interface from.
     * 
     * @param flowArn
     *        The flow that you want to remove a VPC interface from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowVpcInterfaceRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The name of the VPC interface that you want to remove.
     * 
     * @param vpcInterfaceName
     *        The name of the VPC interface that you want to remove.
     */

    public void setVpcInterfaceName(String vpcInterfaceName) {
        this.vpcInterfaceName = vpcInterfaceName;
    }

    /**
     * The name of the VPC interface that you want to remove.
     * 
     * @return The name of the VPC interface that you want to remove.
     */

    public String getVpcInterfaceName() {
        return this.vpcInterfaceName;
    }

    /**
     * The name of the VPC interface that you want to remove.
     * 
     * @param vpcInterfaceName
     *        The name of the VPC interface that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowVpcInterfaceRequest withVpcInterfaceName(String vpcInterfaceName) {
        setVpcInterfaceName(vpcInterfaceName);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getVpcInterfaceName() != null)
            sb.append("VpcInterfaceName: ").append(getVpcInterfaceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveFlowVpcInterfaceRequest == false)
            return false;
        RemoveFlowVpcInterfaceRequest other = (RemoveFlowVpcInterfaceRequest) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getVpcInterfaceName() == null ^ this.getVpcInterfaceName() == null)
            return false;
        if (other.getVpcInterfaceName() != null && other.getVpcInterfaceName().equals(this.getVpcInterfaceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getVpcInterfaceName() == null) ? 0 : getVpcInterfaceName().hashCode());
        return hashCode;
    }

    @Override
    public RemoveFlowVpcInterfaceRequest clone() {
        return (RemoveFlowVpcInterfaceRequest) super.clone();
    }

}
