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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeSnapshotAccess" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeSnapshotAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the snapshot the account is authorized to restore.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a
     * policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     */
    private String snapshotClusterIdentifier;
    /**
     * <p>
     * The identifier of the AWS customer account authorized to restore the specified snapshot.
     * </p>
     * <p>
     * To share a snapshot with AWS support, specify amazon-redshift-support.
     * </p>
     */
    private String accountWithRestoreAccess;

    /**
     * <p>
     * The identifier of the snapshot the account is authorized to restore.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot the account is authorized to restore.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot the account is authorized to restore.
     * </p>
     * 
     * @return The identifier of the snapshot the account is authorized to restore.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot the account is authorized to restore.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot the account is authorized to restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSnapshotAccessRequest withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a
     * policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * 
     * @param snapshotClusterIdentifier
     *        The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user
     *        has a policy containing a snapshot resource element that specifies anything other than * for the cluster
     *        name.
     */

    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a
     * policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * 
     * @return The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user
     *         has a policy containing a snapshot resource element that specifies anything other than * for the cluster
     *         name.
     */

    public String getSnapshotClusterIdentifier() {
        return this.snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a
     * policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * 
     * @param snapshotClusterIdentifier
     *        The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user
     *        has a policy containing a snapshot resource element that specifies anything other than * for the cluster
     *        name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSnapshotAccessRequest withSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        setSnapshotClusterIdentifier(snapshotClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS customer account authorized to restore the specified snapshot.
     * </p>
     * <p>
     * To share a snapshot with AWS support, specify amazon-redshift-support.
     * </p>
     * 
     * @param accountWithRestoreAccess
     *        The identifier of the AWS customer account authorized to restore the specified snapshot.</p>
     *        <p>
     *        To share a snapshot with AWS support, specify amazon-redshift-support.
     */

    public void setAccountWithRestoreAccess(String accountWithRestoreAccess) {
        this.accountWithRestoreAccess = accountWithRestoreAccess;
    }

    /**
     * <p>
     * The identifier of the AWS customer account authorized to restore the specified snapshot.
     * </p>
     * <p>
     * To share a snapshot with AWS support, specify amazon-redshift-support.
     * </p>
     * 
     * @return The identifier of the AWS customer account authorized to restore the specified snapshot.</p>
     *         <p>
     *         To share a snapshot with AWS support, specify amazon-redshift-support.
     */

    public String getAccountWithRestoreAccess() {
        return this.accountWithRestoreAccess;
    }

    /**
     * <p>
     * The identifier of the AWS customer account authorized to restore the specified snapshot.
     * </p>
     * <p>
     * To share a snapshot with AWS support, specify amazon-redshift-support.
     * </p>
     * 
     * @param accountWithRestoreAccess
     *        The identifier of the AWS customer account authorized to restore the specified snapshot.</p>
     *        <p>
     *        To share a snapshot with AWS support, specify amazon-redshift-support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSnapshotAccessRequest withAccountWithRestoreAccess(String accountWithRestoreAccess) {
        setAccountWithRestoreAccess(accountWithRestoreAccess);
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getSnapshotClusterIdentifier() != null)
            sb.append("SnapshotClusterIdentifier: ").append(getSnapshotClusterIdentifier()).append(",");
        if (getAccountWithRestoreAccess() != null)
            sb.append("AccountWithRestoreAccess: ").append(getAccountWithRestoreAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeSnapshotAccessRequest == false)
            return false;
        AuthorizeSnapshotAccessRequest other = (AuthorizeSnapshotAccessRequest) obj;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotClusterIdentifier() == null ^ this.getSnapshotClusterIdentifier() == null)
            return false;
        if (other.getSnapshotClusterIdentifier() != null && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false)
            return false;
        if (other.getAccountWithRestoreAccess() == null ^ this.getAccountWithRestoreAccess() == null)
            return false;
        if (other.getAccountWithRestoreAccess() != null && other.getAccountWithRestoreAccess().equals(this.getAccountWithRestoreAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAccountWithRestoreAccess() == null) ? 0 : getAccountWithRestoreAccess().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeSnapshotAccessRequest clone() {
        return (AuthorizeSnapshotAccessRequest) super.clone();
    }

}
