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
 * Represents the auto scaling settings of a global secondary index for a replica that will be modified.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaGlobalSecondaryIndexAutoScalingUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaGlobalSecondaryIndexAutoScalingUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     */
    private String indexName;

    private AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingUpdate;

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @return The name of the global secondary index.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexAutoScalingUpdate withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * @param provisionedReadCapacityAutoScalingUpdate
     */

    public void setProvisionedReadCapacityAutoScalingUpdate(AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingUpdate) {
        this.provisionedReadCapacityAutoScalingUpdate = provisionedReadCapacityAutoScalingUpdate;
    }

    /**
     * @return
     */

    public AutoScalingSettingsUpdate getProvisionedReadCapacityAutoScalingUpdate() {
        return this.provisionedReadCapacityAutoScalingUpdate;
    }

    /**
     * @param provisionedReadCapacityAutoScalingUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexAutoScalingUpdate withProvisionedReadCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingUpdate) {
        setProvisionedReadCapacityAutoScalingUpdate(provisionedReadCapacityAutoScalingUpdate);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getProvisionedReadCapacityAutoScalingUpdate() != null)
            sb.append("ProvisionedReadCapacityAutoScalingUpdate: ").append(getProvisionedReadCapacityAutoScalingUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaGlobalSecondaryIndexAutoScalingUpdate == false)
            return false;
        ReplicaGlobalSecondaryIndexAutoScalingUpdate other = (ReplicaGlobalSecondaryIndexAutoScalingUpdate) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingUpdate() == null ^ this.getProvisionedReadCapacityAutoScalingUpdate() == null)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingUpdate() != null
                && other.getProvisionedReadCapacityAutoScalingUpdate().equals(this.getProvisionedReadCapacityAutoScalingUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedReadCapacityAutoScalingUpdate() == null) ? 0 : getProvisionedReadCapacityAutoScalingUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaGlobalSecondaryIndexAutoScalingUpdate clone() {
        try {
            return (ReplicaGlobalSecondaryIndexAutoScalingUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaGlobalSecondaryIndexAutoScalingUpdateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
