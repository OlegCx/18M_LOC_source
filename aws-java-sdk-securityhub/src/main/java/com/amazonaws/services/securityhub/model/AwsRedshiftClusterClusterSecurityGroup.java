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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A security group that is associated with the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterClusterSecurityGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterClusterSecurityGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the cluster security group.
     * </p>
     */
    private String clusterSecurityGroupName;
    /**
     * <p>
     * The status of the cluster security group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the cluster security group.
     * </p>
     * 
     * @param clusterSecurityGroupName
     *        The name of the cluster security group.
     */

    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group.
     * </p>
     * 
     * @return The name of the cluster security group.
     */

    public String getClusterSecurityGroupName() {
        return this.clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group.
     * </p>
     * 
     * @param clusterSecurityGroupName
     *        The name of the cluster security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterSecurityGroup withClusterSecurityGroupName(String clusterSecurityGroupName) {
        setClusterSecurityGroupName(clusterSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the cluster security group.
     * </p>
     * 
     * @param status
     *        The status of the cluster security group.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the cluster security group.
     * </p>
     * 
     * @return The status of the cluster security group.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the cluster security group.
     * </p>
     * 
     * @param status
     *        The status of the cluster security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterSecurityGroup withStatus(String status) {
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
        if (getClusterSecurityGroupName() != null)
            sb.append("ClusterSecurityGroupName: ").append(getClusterSecurityGroupName()).append(",");
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

        if (obj instanceof AwsRedshiftClusterClusterSecurityGroup == false)
            return false;
        AwsRedshiftClusterClusterSecurityGroup other = (AwsRedshiftClusterClusterSecurityGroup) obj;
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null)
            return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false)
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

        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterClusterSecurityGroup clone() {
        try {
            return (AwsRedshiftClusterClusterSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterClusterSecurityGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
