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
 * <p>
 * Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstanceAutomatedBackup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBInstanceAutomatedBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     */
    private String dbiResourceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the automated backups to delete, for example,
     * <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * </p>
     */
    private String dBInstanceAutomatedBackupsArn;

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     * 
     * @param dbiResourceId
     *        The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     * 
     * @return The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     * 
     * @param dbiResourceId
     *        The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBInstanceAutomatedBackupRequest withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the automated backups to delete, for example,
     * <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * </p>
     * 
     * @param dBInstanceAutomatedBackupsArn
     *        The Amazon Resource Name (ARN) of the automated backups to delete, for example,
     *        <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     */

    public void setDBInstanceAutomatedBackupsArn(String dBInstanceAutomatedBackupsArn) {
        this.dBInstanceAutomatedBackupsArn = dBInstanceAutomatedBackupsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the automated backups to delete, for example,
     * <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the automated backups to delete, for example,
     *         <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     */

    public String getDBInstanceAutomatedBackupsArn() {
        return this.dBInstanceAutomatedBackupsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the automated backups to delete, for example,
     * <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * </p>
     * 
     * @param dBInstanceAutomatedBackupsArn
     *        The Amazon Resource Name (ARN) of the automated backups to delete, for example,
     *        <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBInstanceAutomatedBackupRequest withDBInstanceAutomatedBackupsArn(String dBInstanceAutomatedBackupsArn) {
        setDBInstanceAutomatedBackupsArn(dBInstanceAutomatedBackupsArn);
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
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId()).append(",");
        if (getDBInstanceAutomatedBackupsArn() != null)
            sb.append("DBInstanceAutomatedBackupsArn: ").append(getDBInstanceAutomatedBackupsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBInstanceAutomatedBackupRequest == false)
            return false;
        DeleteDBInstanceAutomatedBackupRequest other = (DeleteDBInstanceAutomatedBackupRequest) obj;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getDBInstanceAutomatedBackupsArn() == null ^ this.getDBInstanceAutomatedBackupsArn() == null)
            return false;
        if (other.getDBInstanceAutomatedBackupsArn() != null
                && other.getDBInstanceAutomatedBackupsArn().equals(this.getDBInstanceAutomatedBackupsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceAutomatedBackupsArn() == null) ? 0 : getDBInstanceAutomatedBackupsArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBInstanceAutomatedBackupRequest clone() {
        return (DeleteDBInstanceAutomatedBackupRequest) super.clone();
    }

}
