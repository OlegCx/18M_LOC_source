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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the allowed node types you can use to modify your cluster or replication group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListAllowedNodeTypeModifications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAllowedNodeTypeModificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scaleUpModifications;
    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scaleDownModifications;

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     * 
     * @return A string list, each element of which specifies a cache node type which you can use to scale your cluster
     *         or replication group.</p>
     *         <p>
     *         When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     *         <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code>
     *         parameter.
     */

    public java.util.List<String> getScaleUpModifications() {
        if (scaleUpModifications == null) {
            scaleUpModifications = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scaleUpModifications;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     * 
     * @param scaleUpModifications
     *        A string list, each element of which specifies a cache node type which you can use to scale your cluster
     *        or replication group.</p>
     *        <p>
     *        When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     *        <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code>
     *        parameter.
     */

    public void setScaleUpModifications(java.util.Collection<String> scaleUpModifications) {
        if (scaleUpModifications == null) {
            this.scaleUpModifications = null;
            return;
        }

        this.scaleUpModifications = new com.amazonaws.internal.SdkInternalList<String>(scaleUpModifications);
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScaleUpModifications(java.util.Collection)} or {@link #withScaleUpModifications(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scaleUpModifications
     *        A string list, each element of which specifies a cache node type which you can use to scale your cluster
     *        or replication group.</p>
     *        <p>
     *        When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     *        <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeModificationsResult withScaleUpModifications(String... scaleUpModifications) {
        if (this.scaleUpModifications == null) {
            setScaleUpModifications(new com.amazonaws.internal.SdkInternalList<String>(scaleUpModifications.length));
        }
        for (String ele : scaleUpModifications) {
            this.scaleUpModifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group.
     * </p>
     * <p>
     * When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code> parameter.
     * </p>
     * 
     * @param scaleUpModifications
     *        A string list, each element of which specifies a cache node type which you can use to scale your cluster
     *        or replication group.</p>
     *        <p>
     *        When scaling up a Redis cluster or replication group using <code>ModifyCacheCluster</code> or
     *        <code>ModifyReplicationGroup</code>, use a value from this list for the <code>CacheNodeType</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeModificationsResult withScaleUpModifications(java.util.Collection<String> scaleUpModifications) {
        setScaleUpModifications(scaleUpModifications);
        return this;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     * </p>
     * 
     * @return A string list, each element of which specifies a cache node type which you can use to scale your cluster
     *         or replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     *         ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     */

    public java.util.List<String> getScaleDownModifications() {
        if (scaleDownModifications == null) {
            scaleDownModifications = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scaleDownModifications;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     * </p>
     * 
     * @param scaleDownModifications
     *        A string list, each element of which specifies a cache node type which you can use to scale your cluster
     *        or replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     *        ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     */

    public void setScaleDownModifications(java.util.Collection<String> scaleDownModifications) {
        if (scaleDownModifications == null) {
            this.scaleDownModifications = null;
            return;
        }

        this.scaleDownModifications = new com.amazonaws.internal.SdkInternalList<String>(scaleDownModifications);
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScaleDownModifications(java.util.Collection)} or
     * {@link #withScaleDownModifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scaleDownModifications
     *        A string list, each element of which specifies a cache node type which you can use to scale your cluster
     *        or replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     *        ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeModificationsResult withScaleDownModifications(String... scaleDownModifications) {
        if (this.scaleDownModifications == null) {
            setScaleDownModifications(new com.amazonaws.internal.SdkInternalList<String>(scaleDownModifications.length));
        }
        for (String ele : scaleDownModifications) {
            this.scaleDownModifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string list, each element of which specifies a cache node type which you can use to scale your cluster or
     * replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     * ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     * </p>
     * 
     * @param scaleDownModifications
     *        A string list, each element of which specifies a cache node type which you can use to scale your cluster
     *        or replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or
     *        ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeModificationsResult withScaleDownModifications(java.util.Collection<String> scaleDownModifications) {
        setScaleDownModifications(scaleDownModifications);
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
        if (getScaleUpModifications() != null)
            sb.append("ScaleUpModifications: ").append(getScaleUpModifications()).append(",");
        if (getScaleDownModifications() != null)
            sb.append("ScaleDownModifications: ").append(getScaleDownModifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAllowedNodeTypeModificationsResult == false)
            return false;
        ListAllowedNodeTypeModificationsResult other = (ListAllowedNodeTypeModificationsResult) obj;
        if (other.getScaleUpModifications() == null ^ this.getScaleUpModifications() == null)
            return false;
        if (other.getScaleUpModifications() != null && other.getScaleUpModifications().equals(this.getScaleUpModifications()) == false)
            return false;
        if (other.getScaleDownModifications() == null ^ this.getScaleDownModifications() == null)
            return false;
        if (other.getScaleDownModifications() != null && other.getScaleDownModifications().equals(this.getScaleDownModifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScaleUpModifications() == null) ? 0 : getScaleUpModifications().hashCode());
        hashCode = prime * hashCode + ((getScaleDownModifications() == null) ? 0 : getScaleDownModifications().hashCode());
        return hashCode;
    }

    @Override
    public ListAllowedNodeTypeModificationsResult clone() {
        try {
            return (ListAllowedNodeTypeModificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
