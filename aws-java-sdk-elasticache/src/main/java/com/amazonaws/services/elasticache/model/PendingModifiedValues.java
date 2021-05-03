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
 * A group of settings that are applied to the cluster in the future, or that are currently being applied.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/PendingModifiedValues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingModifiedValues implements Serializable, Cloneable {

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 40.
     * </p>
     */
    private Integer numCacheNodes;
    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheNodeIdsToRemove;
    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The auth token status
     * </p>
     */
    private String authTokenStatus;
    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PendingLogDeliveryConfiguration> logDeliveryConfigurations;

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 40.
     * </p>
     * 
     * @param numCacheNodes
     *        The new number of cache nodes for the cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 40.
     */

    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 40.
     * </p>
     * 
     * @return The new number of cache nodes for the cluster.</p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 40.
     */

    public Integer getNumCacheNodes() {
        return this.numCacheNodes;
    }

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 40.
     * </p>
     * 
     * @param numCacheNodes
     *        The new number of cache nodes for the cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 40.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withNumCacheNodes(Integer numCacheNodes) {
        setNumCacheNodes(numCacheNodes);
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @return A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a
     *         4-digit numeric identifier (0001, 0002, etc.).
     */

    public java.util.List<String> getCacheNodeIdsToRemove() {
        if (cacheNodeIdsToRemove == null) {
            cacheNodeIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheNodeIdsToRemove;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @param cacheNodeIdsToRemove
     *        A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a
     *        4-digit numeric identifier (0001, 0002, etc.).
     */

    public void setCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
            return;
        }

        this.cacheNodeIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>(cacheNodeIdsToRemove);
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheNodeIdsToRemove(java.util.Collection)} or {@link #withCacheNodeIdsToRemove(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cacheNodeIdsToRemove
     *        A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a
     *        4-digit numeric identifier (0001, 0002, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withCacheNodeIdsToRemove(String... cacheNodeIdsToRemove) {
        if (this.cacheNodeIdsToRemove == null) {
            setCacheNodeIdsToRemove(new com.amazonaws.internal.SdkInternalList<String>(cacheNodeIdsToRemove.length));
        }
        for (String ele : cacheNodeIdsToRemove) {
            this.cacheNodeIdsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @param cacheNodeIdsToRemove
     *        A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a
     *        4-digit numeric identifier (0001, 0002, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        setCacheNodeIdsToRemove(cacheNodeIdsToRemove);
        return this;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     * 
     * @param engineVersion
     *        The new cache engine version that the cluster runs.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     * 
     * @return The new cache engine version that the cluster runs.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     * 
     * @param engineVersion
     *        The new cache engine version that the cluster runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type that this cluster or replication group is scaled to.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     * 
     * @return The cache node type that this cluster or replication group is scaled to.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type that this cluster or replication group is scaled to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @param authTokenStatus
     *        The auth token status
     * @see AuthTokenUpdateStatus
     */

    public void setAuthTokenStatus(String authTokenStatus) {
        this.authTokenStatus = authTokenStatus;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @return The auth token status
     * @see AuthTokenUpdateStatus
     */

    public String getAuthTokenStatus() {
        return this.authTokenStatus;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @param authTokenStatus
     *        The auth token status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthTokenUpdateStatus
     */

    public PendingModifiedValues withAuthTokenStatus(String authTokenStatus) {
        setAuthTokenStatus(authTokenStatus);
        return this;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * 
     * @param authTokenStatus
     *        The auth token status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthTokenUpdateStatus
     */

    public PendingModifiedValues withAuthTokenStatus(AuthTokenUpdateStatus authTokenStatus) {
        this.authTokenStatus = authTokenStatus.toString();
        return this;
    }

    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     * 
     * @return The log delivery configurations being modified
     */

    public java.util.List<PendingLogDeliveryConfiguration> getLogDeliveryConfigurations() {
        if (logDeliveryConfigurations == null) {
            logDeliveryConfigurations = new com.amazonaws.internal.SdkInternalList<PendingLogDeliveryConfiguration>();
        }
        return logDeliveryConfigurations;
    }

    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        The log delivery configurations being modified
     */

    public void setLogDeliveryConfigurations(java.util.Collection<PendingLogDeliveryConfiguration> logDeliveryConfigurations) {
        if (logDeliveryConfigurations == null) {
            this.logDeliveryConfigurations = null;
            return;
        }

        this.logDeliveryConfigurations = new com.amazonaws.internal.SdkInternalList<PendingLogDeliveryConfiguration>(logDeliveryConfigurations);
    }

    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogDeliveryConfigurations(java.util.Collection)} or
     * {@link #withLogDeliveryConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        The log delivery configurations being modified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withLogDeliveryConfigurations(PendingLogDeliveryConfiguration... logDeliveryConfigurations) {
        if (this.logDeliveryConfigurations == null) {
            setLogDeliveryConfigurations(new com.amazonaws.internal.SdkInternalList<PendingLogDeliveryConfiguration>(logDeliveryConfigurations.length));
        }
        for (PendingLogDeliveryConfiguration ele : logDeliveryConfigurations) {
            this.logDeliveryConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log delivery configurations being modified
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        The log delivery configurations being modified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withLogDeliveryConfigurations(java.util.Collection<PendingLogDeliveryConfiguration> logDeliveryConfigurations) {
        setLogDeliveryConfigurations(logDeliveryConfigurations);
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
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: ").append(getNumCacheNodes()).append(",");
        if (getCacheNodeIdsToRemove() != null)
            sb.append("CacheNodeIdsToRemove: ").append(getCacheNodeIdsToRemove()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getAuthTokenStatus() != null)
            sb.append("AuthTokenStatus: ").append(getAuthTokenStatus()).append(",");
        if (getLogDeliveryConfigurations() != null)
            sb.append("LogDeliveryConfigurations: ").append(getLogDeliveryConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedValues == false)
            return false;
        PendingModifiedValues other = (PendingModifiedValues) obj;
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null)
            return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false)
            return false;
        if (other.getCacheNodeIdsToRemove() == null ^ this.getCacheNodeIdsToRemove() == null)
            return false;
        if (other.getCacheNodeIdsToRemove() != null && other.getCacheNodeIdsToRemove().equals(this.getCacheNodeIdsToRemove()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getAuthTokenStatus() == null ^ this.getAuthTokenStatus() == null)
            return false;
        if (other.getAuthTokenStatus() != null && other.getAuthTokenStatus().equals(this.getAuthTokenStatus()) == false)
            return false;
        if (other.getLogDeliveryConfigurations() == null ^ this.getLogDeliveryConfigurations() == null)
            return false;
        if (other.getLogDeliveryConfigurations() != null && other.getLogDeliveryConfigurations().equals(this.getLogDeliveryConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeIdsToRemove() == null) ? 0 : getCacheNodeIdsToRemove().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getAuthTokenStatus() == null) ? 0 : getAuthTokenStatus().hashCode());
        hashCode = prime * hashCode + ((getLogDeliveryConfigurations() == null) ? 0 : getLogDeliveryConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public PendingModifiedValues clone() {
        try {
            return (PendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
