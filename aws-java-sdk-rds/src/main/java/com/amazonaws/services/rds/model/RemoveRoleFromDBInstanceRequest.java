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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveRoleFromDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB instance to disassociate the IAM role from.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example,
     * <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of
     * supported feature names, see <code>DBEngineVersion</code>.
     * </p>
     */
    private String featureName;

    /**
     * <p>
     * The name of the DB instance to disassociate the IAM role from.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The name of the DB instance to disassociate the IAM role from.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the DB instance to disassociate the IAM role from.
     * </p>
     * 
     * @return The name of the DB instance to disassociate the IAM role from.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the DB instance to disassociate the IAM role from.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The name of the DB instance to disassociate the IAM role from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRoleFromDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example,
     * <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example,
     *        <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example,
     * <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example,
     *         <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example,
     * <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example,
     *        <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRoleFromDBInstanceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of
     * supported feature names, see <code>DBEngineVersion</code>.
     * </p>
     * 
     * @param featureName
     *        The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of
     *        supported feature names, see <code>DBEngineVersion</code>.
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of
     * supported feature names, see <code>DBEngineVersion</code>.
     * </p>
     * 
     * @return The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list
     *         of supported feature names, see <code>DBEngineVersion</code>.
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of
     * supported feature names, see <code>DBEngineVersion</code>.
     * </p>
     * 
     * @param featureName
     *        The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of
     *        supported feature names, see <code>DBEngineVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRoleFromDBInstanceRequest withFeatureName(String featureName) {
        setFeatureName(featureName);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getFeatureName() != null)
            sb.append("FeatureName: ").append(getFeatureName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveRoleFromDBInstanceRequest == false)
            return false;
        RemoveRoleFromDBInstanceRequest other = (RemoveRoleFromDBInstanceRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        return hashCode;
    }

    @Override
    public RemoveRoleFromDBInstanceRequest clone() {
        return (RemoveRoleFromDBInstanceRequest) super.clone();
    }

}
