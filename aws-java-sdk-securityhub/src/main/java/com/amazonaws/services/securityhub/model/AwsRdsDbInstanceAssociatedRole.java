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
 * An AWS Identity and Access Management (IAM) role associated with the DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbInstanceAssociatedRole"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbInstanceAssociatedRole implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the feature associated with the IAM)role.
     * </p>
     */
    private String featureName;
    /**
     * <p>
     * Describes the state of the association between the IAM role and the DB instance. The <code>Status</code> property
     * returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The IAM role ARN is associated with the DB instance and can be used to access other AWS
     * services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The IAM role ARN is being associated with the DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - The IAM role ARN is associated with the DB instance. But the DB instance is unable to
     * assume the IAM role in order to access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceAssociatedRole withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the feature associated with the IAM)role.
     * </p>
     * 
     * @param featureName
     *        The name of the feature associated with the IAM)role.
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature associated with the IAM)role.
     * </p>
     * 
     * @return The name of the feature associated with the IAM)role.
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of the feature associated with the IAM)role.
     * </p>
     * 
     * @param featureName
     *        The name of the feature associated with the IAM)role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceAssociatedRole withFeatureName(String featureName) {
        setFeatureName(featureName);
        return this;
    }

    /**
     * <p>
     * Describes the state of the association between the IAM role and the DB instance. The <code>Status</code> property
     * returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The IAM role ARN is associated with the DB instance and can be used to access other AWS
     * services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The IAM role ARN is being associated with the DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - The IAM role ARN is associated with the DB instance. But the DB instance is unable to
     * assume the IAM role in order to access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the state of the association between the IAM role and the DB instance. The <code>Status</code>
     *        property returns one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The IAM role ARN is associated with the DB instance and can be used to access other
     *        AWS services on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The IAM role ARN is being associated with the DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID</code> - The IAM role ARN is associated with the DB instance. But the DB instance is unable
     *        to assume the IAM role in order to access other AWS services on your behalf.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the state of the association between the IAM role and the DB instance. The <code>Status</code> property
     * returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The IAM role ARN is associated with the DB instance and can be used to access other AWS
     * services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The IAM role ARN is being associated with the DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - The IAM role ARN is associated with the DB instance. But the DB instance is unable to
     * assume the IAM role in order to access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the state of the association between the IAM role and the DB instance. The <code>Status</code>
     *         property returns one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The IAM role ARN is associated with the DB instance and can be used to access other
     *         AWS services on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - The IAM role ARN is being associated with the DB instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID</code> - The IAM role ARN is associated with the DB instance. But the DB instance is unable
     *         to assume the IAM role in order to access other AWS services on your behalf.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes the state of the association between the IAM role and the DB instance. The <code>Status</code> property
     * returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The IAM role ARN is associated with the DB instance and can be used to access other AWS
     * services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The IAM role ARN is being associated with the DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - The IAM role ARN is associated with the DB instance. But the DB instance is unable to
     * assume the IAM role in order to access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the state of the association between the IAM role and the DB instance. The <code>Status</code>
     *        property returns one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The IAM role ARN is associated with the DB instance and can be used to access other
     *        AWS services on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The IAM role ARN is being associated with the DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID</code> - The IAM role ARN is associated with the DB instance. But the DB instance is unable
     *        to assume the IAM role in order to access other AWS services on your behalf.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceAssociatedRole withStatus(String status) {
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
        if (getFeatureName() != null)
            sb.append("FeatureName: ").append(getFeatureName()).append(",");
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

        if (obj instanceof AwsRdsDbInstanceAssociatedRole == false)
            return false;
        AwsRdsDbInstanceAssociatedRole other = (AwsRdsDbInstanceAssociatedRole) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
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
        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbInstanceAssociatedRole clone() {
        try {
            return (AwsRdsDbInstanceAssociatedRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbInstanceAssociatedRoleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
