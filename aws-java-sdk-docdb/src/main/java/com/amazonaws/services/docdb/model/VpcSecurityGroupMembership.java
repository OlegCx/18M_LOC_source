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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Used as a response element for queries on virtual private cloud (VPC) security group membership.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/VpcSecurityGroupMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcSecurityGroupMembership implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the VPC security group.
     * </p>
     */
    private String vpcSecurityGroupId;
    /**
     * <p>
     * The status of the VPC security group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the VPC security group.
     * </p>
     * 
     * @param vpcSecurityGroupId
     *        The name of the VPC security group.
     */

    public void setVpcSecurityGroupId(String vpcSecurityGroupId) {
        this.vpcSecurityGroupId = vpcSecurityGroupId;
    }

    /**
     * <p>
     * The name of the VPC security group.
     * </p>
     * 
     * @return The name of the VPC security group.
     */

    public String getVpcSecurityGroupId() {
        return this.vpcSecurityGroupId;
    }

    /**
     * <p>
     * The name of the VPC security group.
     * </p>
     * 
     * @param vpcSecurityGroupId
     *        The name of the VPC security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcSecurityGroupMembership withVpcSecurityGroupId(String vpcSecurityGroupId) {
        setVpcSecurityGroupId(vpcSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The status of the VPC security group.
     * </p>
     * 
     * @param status
     *        The status of the VPC security group.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPC security group.
     * </p>
     * 
     * @return The status of the VPC security group.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the VPC security group.
     * </p>
     * 
     * @param status
     *        The status of the VPC security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcSecurityGroupMembership withStatus(String status) {
        setStatus(status);
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
        if (getVpcSecurityGroupId() != null)
            sb.append("VpcSecurityGroupId: ").append(getVpcSecurityGroupId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcSecurityGroupMembership == false)
            return false;
        VpcSecurityGroupMembership other = (VpcSecurityGroupMembership) obj;
        if (other.getVpcSecurityGroupId() == null ^ this.getVpcSecurityGroupId() == null)
            return false;
        if (other.getVpcSecurityGroupId() != null && other.getVpcSecurityGroupId().equals(this.getVpcSecurityGroupId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcSecurityGroupId() == null) ? 0 : getVpcSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public VpcSecurityGroupMembership clone() {
        try {
            return (VpcSecurityGroupMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
