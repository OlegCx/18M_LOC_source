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
 * Contains information about an instance that is part of a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DBClusterMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterMember implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the instance identifier for this member of the cluster.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     * <code>false</code> otherwise.
     * </p>
     */
    private Boolean isClusterWriter;
    /**
     * <p>
     * Specifies the status of the cluster parameter group for this member of the DB cluster.
     * </p>
     */
    private String dBClusterParameterGroupStatus;
    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     */
    private Integer promotionTier;

    /**
     * <p>
     * Specifies the instance identifier for this member of the cluster.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Specifies the instance identifier for this member of the cluster.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Specifies the instance identifier for this member of the cluster.
     * </p>
     * 
     * @return Specifies the instance identifier for this member of the cluster.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * Specifies the instance identifier for this member of the cluster.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Specifies the instance identifier for this member of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterMember withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     * <code>false</code> otherwise.
     * </p>
     * 
     * @param isClusterWriter
     *        A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     *        <code>false</code> otherwise.
     */

    public void setIsClusterWriter(Boolean isClusterWriter) {
        this.isClusterWriter = isClusterWriter;
    }

    /**
     * <p>
     * A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     * <code>false</code> otherwise.
     * </p>
     * 
     * @return A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     *         <code>false</code> otherwise.
     */

    public Boolean getIsClusterWriter() {
        return this.isClusterWriter;
    }

    /**
     * <p>
     * A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     * <code>false</code> otherwise.
     * </p>
     * 
     * @param isClusterWriter
     *        A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     *        <code>false</code> otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterMember withIsClusterWriter(Boolean isClusterWriter) {
        setIsClusterWriter(isClusterWriter);
        return this;
    }

    /**
     * <p>
     * A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     * <code>false</code> otherwise.
     * </p>
     * 
     * @return A value that is <code>true</code> if the cluster member is the primary instance for the cluster and
     *         <code>false</code> otherwise.
     */

    public Boolean isClusterWriter() {
        return this.isClusterWriter;
    }

    /**
     * <p>
     * Specifies the status of the cluster parameter group for this member of the DB cluster.
     * </p>
     * 
     * @param dBClusterParameterGroupStatus
     *        Specifies the status of the cluster parameter group for this member of the DB cluster.
     */

    public void setDBClusterParameterGroupStatus(String dBClusterParameterGroupStatus) {
        this.dBClusterParameterGroupStatus = dBClusterParameterGroupStatus;
    }

    /**
     * <p>
     * Specifies the status of the cluster parameter group for this member of the DB cluster.
     * </p>
     * 
     * @return Specifies the status of the cluster parameter group for this member of the DB cluster.
     */

    public String getDBClusterParameterGroupStatus() {
        return this.dBClusterParameterGroupStatus;
    }

    /**
     * <p>
     * Specifies the status of the cluster parameter group for this member of the DB cluster.
     * </p>
     * 
     * @param dBClusterParameterGroupStatus
     *        Specifies the status of the cluster parameter group for this member of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterMember withDBClusterParameterGroupStatus(String dBClusterParameterGroupStatus) {
        setDBClusterParameterGroupStatus(dBClusterParameterGroupStatus);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance
     *        after a failure of the existing primary instance.
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * 
     * @return A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary
     *         instance after a failure of the existing primary instance.
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance
     *        after a failure of the existing primary instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterMember withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
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
        if (getIsClusterWriter() != null)
            sb.append("IsClusterWriter: ").append(getIsClusterWriter()).append(",");
        if (getDBClusterParameterGroupStatus() != null)
            sb.append("DBClusterParameterGroupStatus: ").append(getDBClusterParameterGroupStatus()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterMember == false)
            return false;
        DBClusterMember other = (DBClusterMember) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getIsClusterWriter() == null ^ this.getIsClusterWriter() == null)
            return false;
        if (other.getIsClusterWriter() != null && other.getIsClusterWriter().equals(this.getIsClusterWriter()) == false)
            return false;
        if (other.getDBClusterParameterGroupStatus() == null ^ this.getDBClusterParameterGroupStatus() == null)
            return false;
        if (other.getDBClusterParameterGroupStatus() != null
                && other.getDBClusterParameterGroupStatus().equals(this.getDBClusterParameterGroupStatus()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIsClusterWriter() == null) ? 0 : getIsClusterWriter().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupStatus() == null) ? 0 : getDBClusterParameterGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterMember clone() {
        try {
            return (DBClusterMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
