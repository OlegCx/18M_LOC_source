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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the properties of a global table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/GlobalTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalTable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The global table name.
     * </p>
     */
    private String globalTableName;
    /**
     * <p>
     * The Regions where the global table has replicas.
     * </p>
     */
    private java.util.List<Replica> replicationGroup;

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @param globalTableName
     *        The global table name.
     */

    public void setGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @return The global table name.
     */

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @param globalTableName
     *        The global table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalTable withGlobalTableName(String globalTableName) {
        setGlobalTableName(globalTableName);
        return this;
    }

    /**
     * <p>
     * The Regions where the global table has replicas.
     * </p>
     * 
     * @return The Regions where the global table has replicas.
     */

    public java.util.List<Replica> getReplicationGroup() {
        return replicationGroup;
    }

    /**
     * <p>
     * The Regions where the global table has replicas.
     * </p>
     * 
     * @param replicationGroup
     *        The Regions where the global table has replicas.
     */

    public void setReplicationGroup(java.util.Collection<Replica> replicationGroup) {
        if (replicationGroup == null) {
            this.replicationGroup = null;
            return;
        }

        this.replicationGroup = new java.util.ArrayList<Replica>(replicationGroup);
    }

    /**
     * <p>
     * The Regions where the global table has replicas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationGroup(java.util.Collection)} or {@link #withReplicationGroup(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicationGroup
     *        The Regions where the global table has replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalTable withReplicationGroup(Replica... replicationGroup) {
        if (this.replicationGroup == null) {
            setReplicationGroup(new java.util.ArrayList<Replica>(replicationGroup.length));
        }
        for (Replica ele : replicationGroup) {
            this.replicationGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Regions where the global table has replicas.
     * </p>
     * 
     * @param replicationGroup
     *        The Regions where the global table has replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalTable withReplicationGroup(java.util.Collection<Replica> replicationGroup) {
        setReplicationGroup(replicationGroup);
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
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: ").append(getGlobalTableName()).append(",");
        if (getReplicationGroup() != null)
            sb.append("ReplicationGroup: ").append(getReplicationGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalTable == false)
            return false;
        GlobalTable other = (GlobalTable) obj;
        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        if (other.getReplicationGroup() == null ^ this.getReplicationGroup() == null)
            return false;
        if (other.getReplicationGroup() != null && other.getReplicationGroup().equals(this.getReplicationGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroup() == null) ? 0 : getReplicationGroup().hashCode());
        return hashCode;
    }

    @Override
    public GlobalTable clone() {
        try {
            return (GlobalTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.GlobalTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
