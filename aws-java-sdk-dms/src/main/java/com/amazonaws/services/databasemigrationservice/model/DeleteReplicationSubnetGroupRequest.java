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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationSubnetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicationSubnetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The subnet group name of the replication instance.
     * </p>
     */
    private String replicationSubnetGroupIdentifier;

    /**
     * <p>
     * The subnet group name of the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        The subnet group name of the replication instance.
     */

    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The subnet group name of the replication instance.
     * </p>
     * 
     * @return The subnet group name of the replication instance.
     */

    public String getReplicationSubnetGroupIdentifier() {
        return this.replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The subnet group name of the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        The subnet group name of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationSubnetGroupRequest withReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        setReplicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier);
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
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: ").append(getReplicationSubnetGroupIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationSubnetGroupRequest == false)
            return false;
        DeleteReplicationSubnetGroupRequest other = (DeleteReplicationSubnetGroupRequest) obj;
        if (other.getReplicationSubnetGroupIdentifier() == null ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(this.getReplicationSubnetGroupIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationSubnetGroupIdentifier() == null) ? 0 : getReplicationSubnetGroupIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicationSubnetGroupRequest clone() {
        return (DeleteReplicationSubnetGroupRequest) super.clone();
    }

}
