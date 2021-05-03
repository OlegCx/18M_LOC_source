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
 * Describes an AWS Identity and Access Management (IAM) role that is associated with a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DBClusterRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterRole implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Describes the state of association between the IAM role and the cluster. The <code>Status</code> property returns
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The IAM role ARN is associated with the cluster and can be used to access other AWS
     * services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The IAM role ARN is being associated with the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - The IAM role ARN is associated with the cluster, but the cluster cannot assume the IAM
     * role to access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterRole withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Describes the state of association between the IAM role and the cluster. The <code>Status</code> property returns
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The IAM role ARN is associated with the cluster and can be used to access other AWS
     * services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The IAM role ARN is being associated with the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - The IAM role ARN is associated with the cluster, but the cluster cannot assume the IAM
     * role to access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the state of association between the IAM role and the cluster. The <code>Status</code> property
     *        returns one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The IAM role ARN is associated with the cluster and can be used to access other AWS
     *        services on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The IAM role ARN is being associated with the DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID</code> - The IAM role ARN is associated with the cluster, but the cluster cannot assume the
     *        IAM role to access other AWS services on your behalf.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the state of association between the IAM role and the cluster. The <code>Status</code> property returns
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The IAM role ARN is associated with the cluster and can be used to access other AWS
     * services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The IAM role ARN is being associated with the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - The IAM role ARN is associated with the cluster, but the cluster cannot assume the IAM
     * role to access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the state of association between the IAM role and the cluster. The <code>Status</code> property
     *         returns one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The IAM role ARN is associated with the cluster and can be used to access other AWS
     *         services on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - The IAM role ARN is being associated with the DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID</code> - The IAM role ARN is associated with the cluster, but the cluster cannot assume the
     *         IAM role to access other AWS services on your behalf.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes the state of association between the IAM role and the cluster. The <code>Status</code> property returns
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The IAM role ARN is associated with the cluster and can be used to access other AWS
     * services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The IAM role ARN is being associated with the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - The IAM role ARN is associated with the cluster, but the cluster cannot assume the IAM
     * role to access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the state of association between the IAM role and the cluster. The <code>Status</code> property
     *        returns one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The IAM role ARN is associated with the cluster and can be used to access other AWS
     *        services on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The IAM role ARN is being associated with the DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID</code> - The IAM role ARN is associated with the cluster, but the cluster cannot assume the
     *        IAM role to access other AWS services on your behalf.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterRole withStatus(String status) {
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof DBClusterRole == false)
            return false;
        DBClusterRole other = (DBClusterRole) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterRole clone() {
        try {
            return (DBClusterRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
