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
 * Contains all of the attributes of a specific Redis replication group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ReplicationGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The user supplied description of the replication group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the Global datastore and role of this replication group in the Global datastore.
     * </p>
     */
    private GlobalReplicationGroupInfo globalReplicationGroupInfo;
    /**
     * <p>
     * The current state of this replication group - <code>creating</code>, <code>available</code>,
     * <code>modifying</code>, <code>deleting</code>, <code>create-failed</code>, <code>snapshotting</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A group of settings to be applied to the replication group, either immediately or during the next maintenance
     * window.
     * </p>
     */
    private ReplicationGroupPendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> memberClusters;
    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a
     * single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each
     * node group (shard).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeGroup> nodeGroups;
    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the replication group.
     * </p>
     */
    private String snapshottingClusterId;
    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     */
    private String automaticFailover;
    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     * Multi-AZ</a>
     * </p>
     */
    private String multiAZ;
    /**
     * <p>
     * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this
     * replication group.
     * </p>
     */
    private Endpoint configurationEndpoint;
    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example,
     * if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5 days
     * before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     * </p>
     * </important>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     */
    private String snapshotWindow;
    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     * partitioned across multiple shards (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean clusterEnabled;
    /**
     * <p>
     * The name of the compute and memory capacity node type for each node in the replication group.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean authTokenEnabled;
    /**
     * <p>
     * The date the auth token was last modified
     * </p>
     */
    private java.util.Date authTokenLastModifiedDate;
    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean transitEncryptionEnabled;
    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean atRestEncryptionEnabled;
    /**
     * <p>
     * The outpost ARNs of the replication group's member clusters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> memberClustersOutpostArns;
    /**
     * <p>
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the replication group.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The list of user group IDs that have access to the replication group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userGroupIds;
    /**
     * <p>
     * Returns the destination, format and type of the logs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LogDeliveryConfiguration> logDeliveryConfigurations;

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier for the replication group.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     * 
     * @return The identifier for the replication group.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier for the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The user supplied description of the replication group.
     * </p>
     * 
     * @param description
     *        The user supplied description of the replication group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user supplied description of the replication group.
     * </p>
     * 
     * @return The user supplied description of the replication group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user supplied description of the replication group.
     * </p>
     * 
     * @param description
     *        The user supplied description of the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the Global datastore and role of this replication group in the Global datastore.
     * </p>
     * 
     * @param globalReplicationGroupInfo
     *        The name of the Global datastore and role of this replication group in the Global datastore.
     */

    public void setGlobalReplicationGroupInfo(GlobalReplicationGroupInfo globalReplicationGroupInfo) {
        this.globalReplicationGroupInfo = globalReplicationGroupInfo;
    }

    /**
     * <p>
     * The name of the Global datastore and role of this replication group in the Global datastore.
     * </p>
     * 
     * @return The name of the Global datastore and role of this replication group in the Global datastore.
     */

    public GlobalReplicationGroupInfo getGlobalReplicationGroupInfo() {
        return this.globalReplicationGroupInfo;
    }

    /**
     * <p>
     * The name of the Global datastore and role of this replication group in the Global datastore.
     * </p>
     * 
     * @param globalReplicationGroupInfo
     *        The name of the Global datastore and role of this replication group in the Global datastore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withGlobalReplicationGroupInfo(GlobalReplicationGroupInfo globalReplicationGroupInfo) {
        setGlobalReplicationGroupInfo(globalReplicationGroupInfo);
        return this;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>, <code>available</code>,
     * <code>modifying</code>, <code>deleting</code>, <code>create-failed</code>, <code>snapshotting</code>.
     * </p>
     * 
     * @param status
     *        The current state of this replication group - <code>creating</code>, <code>available</code>,
     *        <code>modifying</code>, <code>deleting</code>, <code>create-failed</code>, <code>snapshotting</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>, <code>available</code>,
     * <code>modifying</code>, <code>deleting</code>, <code>create-failed</code>, <code>snapshotting</code>.
     * </p>
     * 
     * @return The current state of this replication group - <code>creating</code>, <code>available</code>,
     *         <code>modifying</code>, <code>deleting</code>, <code>create-failed</code>, <code>snapshotting</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>, <code>available</code>,
     * <code>modifying</code>, <code>deleting</code>, <code>create-failed</code>, <code>snapshotting</code>.
     * </p>
     * 
     * @param status
     *        The current state of this replication group - <code>creating</code>, <code>available</code>,
     *        <code>modifying</code>, <code>deleting</code>, <code>create-failed</code>, <code>snapshotting</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either immediately or during the next maintenance
     * window.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A group of settings to be applied to the replication group, either immediately or during the next
     *        maintenance window.
     */

    public void setPendingModifiedValues(ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either immediately or during the next maintenance
     * window.
     * </p>
     * 
     * @return A group of settings to be applied to the replication group, either immediately or during the next
     *         maintenance window.
     */

    public ReplicationGroupPendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either immediately or during the next maintenance
     * window.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A group of settings to be applied to the replication group, either immediately or during the next
     *        maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withPendingModifiedValues(ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     * 
     * @return The names of all the cache clusters that are part of this replication group.
     */

    public java.util.List<String> getMemberClusters() {
        if (memberClusters == null) {
            memberClusters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return memberClusters;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this replication group.
     */

    public void setMemberClusters(java.util.Collection<String> memberClusters) {
        if (memberClusters == null) {
            this.memberClusters = null;
            return;
        }

        this.memberClusters = new com.amazonaws.internal.SdkInternalList<String>(memberClusters);
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberClusters(java.util.Collection)} or {@link #withMemberClusters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withMemberClusters(String... memberClusters) {
        if (this.memberClusters == null) {
            setMemberClusters(new com.amazonaws.internal.SdkInternalList<String>(memberClusters.length));
        }
        for (String ele : memberClusters) {
            this.memberClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withMemberClusters(java.util.Collection<String> memberClusters) {
        setMemberClusters(memberClusters);
        return this;
    }

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a
     * single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each
     * node group (shard).
     * </p>
     * 
     * @return A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups,
     *         this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an
     *         entry for each node group (shard).
     */

    public java.util.List<NodeGroup> getNodeGroups() {
        if (nodeGroups == null) {
            nodeGroups = new com.amazonaws.internal.SdkInternalList<NodeGroup>();
        }
        return nodeGroups;
    }

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a
     * single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each
     * node group (shard).
     * </p>
     * 
     * @param nodeGroups
     *        A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups,
     *        this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an
     *        entry for each node group (shard).
     */

    public void setNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        if (nodeGroups == null) {
            this.nodeGroups = null;
            return;
        }

        this.nodeGroups = new com.amazonaws.internal.SdkInternalList<NodeGroup>(nodeGroups);
    }

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a
     * single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each
     * node group (shard).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeGroups(java.util.Collection)} or {@link #withNodeGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nodeGroups
     *        A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups,
     *        this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an
     *        entry for each node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withNodeGroups(NodeGroup... nodeGroups) {
        if (this.nodeGroups == null) {
            setNodeGroups(new com.amazonaws.internal.SdkInternalList<NodeGroup>(nodeGroups.length));
        }
        for (NodeGroup ele : nodeGroups) {
            this.nodeGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a
     * single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each
     * node group (shard).
     * </p>
     * 
     * @param nodeGroups
     *        A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups,
     *        this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an
     *        entry for each node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        setNodeGroups(nodeGroups);
        return this;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the replication group.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cluster ID that is used as the daily snapshot source for the replication group.
     */

    public void setSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the replication group.
     * </p>
     * 
     * @return The cluster ID that is used as the daily snapshot source for the replication group.
     */

    public String getSnapshottingClusterId() {
        return this.snapshottingClusterId;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the replication group.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cluster ID that is used as the daily snapshot source for the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withSnapshottingClusterId(String snapshottingClusterId) {
        setSnapshottingClusterId(snapshottingClusterId);
        return this;
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @param automaticFailover
     *        Indicates the status of automatic failover for this Redis replication group.
     * @see AutomaticFailoverStatus
     */

    public void setAutomaticFailover(String automaticFailover) {
        this.automaticFailover = automaticFailover;
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @return Indicates the status of automatic failover for this Redis replication group.
     * @see AutomaticFailoverStatus
     */

    public String getAutomaticFailover() {
        return this.automaticFailover;
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @param automaticFailover
     *        Indicates the status of automatic failover for this Redis replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomaticFailoverStatus
     */

    public ReplicationGroup withAutomaticFailover(String automaticFailover) {
        setAutomaticFailover(automaticFailover);
        return this;
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @param automaticFailover
     *        Indicates the status of automatic failover for this Redis replication group.
     * @see AutomaticFailoverStatus
     */

    public void setAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        withAutomaticFailover(automaticFailover);
    }

    /**
     * <p>
     * Indicates the status of automatic failover for this Redis replication group.
     * </p>
     * 
     * @param automaticFailover
     *        Indicates the status of automatic failover for this Redis replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomaticFailoverStatus
     */

    public ReplicationGroup withAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        this.automaticFailover = automaticFailover.toString();
        return this;
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     * Multi-AZ</a>
     * </p>
     * 
     * @param multiAZ
     *        A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     *        Multi-AZ</a>
     * @see MultiAZStatus
     */

    public void setMultiAZ(String multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     * Multi-AZ</a>
     * </p>
     * 
     * @return A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     *         Multi-AZ</a>
     * @see MultiAZStatus
     */

    public String getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     * Multi-AZ</a>
     * </p>
     * 
     * @param multiAZ
     *        A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     *        Multi-AZ</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MultiAZStatus
     */

    public ReplicationGroup withMultiAZ(String multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     * Multi-AZ</a>
     * </p>
     * 
     * @param multiAZ
     *        A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     *        Multi-AZ</a>
     * @see MultiAZStatus
     */

    public void setMultiAZ(MultiAZStatus multiAZ) {
        withMultiAZ(multiAZ);
    }

    /**
     * <p>
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     * Multi-AZ</a>
     * </p>
     * 
     * @param multiAZ
     *        A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html">Minimizing Downtime:
     *        Multi-AZ</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MultiAZStatus
     */

    public ReplicationGroup withMultiAZ(MultiAZStatus multiAZ) {
        this.multiAZ = multiAZ.toString();
        return this;
    }

    /**
     * <p>
     * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this
     * replication group.
     * </p>
     * 
     * @param configurationEndpoint
     *        The configuration endpoint for this replication group. Use the configuration endpoint to connect to this
     *        replication group.
     */

    public void setConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
    }

    /**
     * <p>
     * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this
     * replication group.
     * </p>
     * 
     * @return The configuration endpoint for this replication group. Use the configuration endpoint to connect to this
     *         replication group.
     */

    public Endpoint getConfigurationEndpoint() {
        return this.configurationEndpoint;
    }

    /**
     * <p>
     * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this
     * replication group.
     * </p>
     * 
     * @param configurationEndpoint
     *        The configuration endpoint for this replication group. Use the configuration endpoint to connect to this
     *        replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withConfigurationEndpoint(Endpoint configurationEndpoint) {
        setConfigurationEndpoint(configurationEndpoint);
        return this;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example,
     * if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5 days
     * before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For
     *        example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained
     *        for 5 days before being deleted.</p> <important>
     *        <p>
     *        If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     *        </p>
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example,
     * if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5 days
     * before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @return The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For
     *         example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained
     *         for 5 days before being deleted.</p> <important>
     *         <p>
     *         If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     *         </p>
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example,
     * if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5 days
     * before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For
     *        example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained
     *        for 5 days before being deleted.</p> <important>
     *        <p>
     *        If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group
     *        (shard).</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @return The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group
     *         (shard).</p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     *         </p>
     *         <p>
     *         If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *         </p>
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group
     *        (shard).</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     * partitioned across multiple shards (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param clusterEnabled
     *        A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     *        partitioned across multiple shards (API/CLI: node groups).</p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     */

    public void setClusterEnabled(Boolean clusterEnabled) {
        this.clusterEnabled = clusterEnabled;
    }

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     * partitioned across multiple shards (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     *         partitioned across multiple shards (API/CLI: node groups).</p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     */

    public Boolean getClusterEnabled() {
        return this.clusterEnabled;
    }

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     * partitioned across multiple shards (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param clusterEnabled
     *        A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     *        partitioned across multiple shards (API/CLI: node groups).</p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withClusterEnabled(Boolean clusterEnabled) {
        setClusterEnabled(clusterEnabled);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     * partitioned across multiple shards (API/CLI: node groups).
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be
     *         partitioned across multiple shards (API/CLI: node groups).</p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     */

    public Boolean isClusterEnabled() {
        return this.clusterEnabled;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for each node in the replication group.
     * </p>
     * 
     * @param cacheNodeType
     *        The name of the compute and memory capacity node type for each node in the replication group.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for each node in the replication group.
     * </p>
     * 
     * @return The name of the compute and memory capacity node type for each node in the replication group.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for each node in the replication group.
     * </p>
     * 
     * @param cacheNodeType
     *        The name of the compute and memory capacity node type for each node in the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param authTokenEnabled
     *        A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setAuthTokenEnabled(Boolean authTokenEnabled) {
        this.authTokenEnabled = authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getAuthTokenEnabled() {
        return this.authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param authTokenEnabled
     *        A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withAuthTokenEnabled(Boolean authTokenEnabled) {
        setAuthTokenEnabled(authTokenEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isAuthTokenEnabled() {
        return this.authTokenEnabled;
    }

    /**
     * <p>
     * The date the auth token was last modified
     * </p>
     * 
     * @param authTokenLastModifiedDate
     *        The date the auth token was last modified
     */

    public void setAuthTokenLastModifiedDate(java.util.Date authTokenLastModifiedDate) {
        this.authTokenLastModifiedDate = authTokenLastModifiedDate;
    }

    /**
     * <p>
     * The date the auth token was last modified
     * </p>
     * 
     * @return The date the auth token was last modified
     */

    public java.util.Date getAuthTokenLastModifiedDate() {
        return this.authTokenLastModifiedDate;
    }

    /**
     * <p>
     * The date the auth token was last modified
     * </p>
     * 
     * @param authTokenLastModifiedDate
     *        The date the auth token was last modified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withAuthTokenLastModifiedDate(java.util.Date authTokenLastModifiedDate) {
        setAuthTokenLastModifiedDate(authTokenLastModifiedDate);
        return this;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param transitEncryptionEnabled
     *        A flag that enables in-transit encryption when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To
     *        enable in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to
     *        <code>true</code> when you create a cluster.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code>, <code>4.x</code> or later.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables in-transit encryption when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To
     *         enable in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to
     *         <code>true</code> when you create a cluster.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code>, <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param transitEncryptionEnabled
     *        A flag that enables in-transit encryption when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To
     *        enable in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to
     *        <code>true</code> when you create a cluster.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code>, <code>4.x</code> or later.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        setTransitEncryptionEnabled(transitEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables in-transit encryption when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To
     *         enable in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to
     *         <code>true</code> when you create a cluster.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code>, <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param atRestEncryptionEnabled
     *        A flag that enables encryption at-rest when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To
     *        enable encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to
     *        <code>true</code> when you create a cluster.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code>, <code>4.x</code> or later.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables encryption at-rest when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To
     *         enable encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to
     *         <code>true</code> when you create a cluster.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code>, <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param atRestEncryptionEnabled
     *        A flag that enables encryption at-rest when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To
     *        enable encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to
     *        <code>true</code> when you create a cluster.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code>, <code>4.x</code> or later.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        setAtRestEncryptionEnabled(atRestEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables encryption at-rest when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To
     *         enable encryption at-rest on a cluster you must set <code>AtRestEncryptionEnabled</code> to
     *         <code>true</code> when you create a cluster.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code>, <code>4.x</code> or later.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
    }

    /**
     * <p>
     * The outpost ARNs of the replication group's member clusters.
     * </p>
     * 
     * @return The outpost ARNs of the replication group's member clusters.
     */

    public java.util.List<String> getMemberClustersOutpostArns() {
        if (memberClustersOutpostArns == null) {
            memberClustersOutpostArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return memberClustersOutpostArns;
    }

    /**
     * <p>
     * The outpost ARNs of the replication group's member clusters.
     * </p>
     * 
     * @param memberClustersOutpostArns
     *        The outpost ARNs of the replication group's member clusters.
     */

    public void setMemberClustersOutpostArns(java.util.Collection<String> memberClustersOutpostArns) {
        if (memberClustersOutpostArns == null) {
            this.memberClustersOutpostArns = null;
            return;
        }

        this.memberClustersOutpostArns = new com.amazonaws.internal.SdkInternalList<String>(memberClustersOutpostArns);
    }

    /**
     * <p>
     * The outpost ARNs of the replication group's member clusters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberClustersOutpostArns(java.util.Collection)} or
     * {@link #withMemberClustersOutpostArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param memberClustersOutpostArns
     *        The outpost ARNs of the replication group's member clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withMemberClustersOutpostArns(String... memberClustersOutpostArns) {
        if (this.memberClustersOutpostArns == null) {
            setMemberClustersOutpostArns(new com.amazonaws.internal.SdkInternalList<String>(memberClustersOutpostArns.length));
        }
        for (String ele : memberClustersOutpostArns) {
            this.memberClustersOutpostArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outpost ARNs of the replication group's member clusters.
     * </p>
     * 
     * @param memberClustersOutpostArns
     *        The outpost ARNs of the replication group's member clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withMemberClustersOutpostArns(java.util.Collection<String> memberClustersOutpostArns) {
        setMemberClustersOutpostArns(memberClustersOutpostArns);
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the disk in the cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     * 
     * @return The ID of the KMS key used to encrypt the disk in the cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the disk in the cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the disk in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the replication group.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) of the replication group.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the replication group.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the replication group.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the replication group.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) of the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The list of user group IDs that have access to the replication group.
     * </p>
     * 
     * @return The list of user group IDs that have access to the replication group.
     */

    public java.util.List<String> getUserGroupIds() {
        if (userGroupIds == null) {
            userGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userGroupIds;
    }

    /**
     * <p>
     * The list of user group IDs that have access to the replication group.
     * </p>
     * 
     * @param userGroupIds
     *        The list of user group IDs that have access to the replication group.
     */

    public void setUserGroupIds(java.util.Collection<String> userGroupIds) {
        if (userGroupIds == null) {
            this.userGroupIds = null;
            return;
        }

        this.userGroupIds = new com.amazonaws.internal.SdkInternalList<String>(userGroupIds);
    }

    /**
     * <p>
     * The list of user group IDs that have access to the replication group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroupIds(java.util.Collection)} or {@link #withUserGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userGroupIds
     *        The list of user group IDs that have access to the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withUserGroupIds(String... userGroupIds) {
        if (this.userGroupIds == null) {
            setUserGroupIds(new com.amazonaws.internal.SdkInternalList<String>(userGroupIds.length));
        }
        for (String ele : userGroupIds) {
            this.userGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user group IDs that have access to the replication group.
     * </p>
     * 
     * @param userGroupIds
     *        The list of user group IDs that have access to the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withUserGroupIds(java.util.Collection<String> userGroupIds) {
        setUserGroupIds(userGroupIds);
        return this;
    }

    /**
     * <p>
     * Returns the destination, format and type of the logs.
     * </p>
     * 
     * @return Returns the destination, format and type of the logs.
     */

    public java.util.List<LogDeliveryConfiguration> getLogDeliveryConfigurations() {
        if (logDeliveryConfigurations == null) {
            logDeliveryConfigurations = new com.amazonaws.internal.SdkInternalList<LogDeliveryConfiguration>();
        }
        return logDeliveryConfigurations;
    }

    /**
     * <p>
     * Returns the destination, format and type of the logs.
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        Returns the destination, format and type of the logs.
     */

    public void setLogDeliveryConfigurations(java.util.Collection<LogDeliveryConfiguration> logDeliveryConfigurations) {
        if (logDeliveryConfigurations == null) {
            this.logDeliveryConfigurations = null;
            return;
        }

        this.logDeliveryConfigurations = new com.amazonaws.internal.SdkInternalList<LogDeliveryConfiguration>(logDeliveryConfigurations);
    }

    /**
     * <p>
     * Returns the destination, format and type of the logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogDeliveryConfigurations(java.util.Collection)} or
     * {@link #withLogDeliveryConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        Returns the destination, format and type of the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withLogDeliveryConfigurations(LogDeliveryConfiguration... logDeliveryConfigurations) {
        if (this.logDeliveryConfigurations == null) {
            setLogDeliveryConfigurations(new com.amazonaws.internal.SdkInternalList<LogDeliveryConfiguration>(logDeliveryConfigurations.length));
        }
        for (LogDeliveryConfiguration ele : logDeliveryConfigurations) {
            this.logDeliveryConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the destination, format and type of the logs.
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        Returns the destination, format and type of the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withLogDeliveryConfigurations(java.util.Collection<LogDeliveryConfiguration> logDeliveryConfigurations) {
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGlobalReplicationGroupInfo() != null)
            sb.append("GlobalReplicationGroupInfo: ").append(getGlobalReplicationGroupInfo()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues()).append(",");
        if (getMemberClusters() != null)
            sb.append("MemberClusters: ").append(getMemberClusters()).append(",");
        if (getNodeGroups() != null)
            sb.append("NodeGroups: ").append(getNodeGroups()).append(",");
        if (getSnapshottingClusterId() != null)
            sb.append("SnapshottingClusterId: ").append(getSnapshottingClusterId()).append(",");
        if (getAutomaticFailover() != null)
            sb.append("AutomaticFailover: ").append(getAutomaticFailover()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getConfigurationEndpoint() != null)
            sb.append("ConfigurationEndpoint: ").append(getConfigurationEndpoint()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getClusterEnabled() != null)
            sb.append("ClusterEnabled: ").append(getClusterEnabled()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getAuthTokenEnabled() != null)
            sb.append("AuthTokenEnabled: ").append(getAuthTokenEnabled()).append(",");
        if (getAuthTokenLastModifiedDate() != null)
            sb.append("AuthTokenLastModifiedDate: ").append(getAuthTokenLastModifiedDate()).append(",");
        if (getTransitEncryptionEnabled() != null)
            sb.append("TransitEncryptionEnabled: ").append(getTransitEncryptionEnabled()).append(",");
        if (getAtRestEncryptionEnabled() != null)
            sb.append("AtRestEncryptionEnabled: ").append(getAtRestEncryptionEnabled()).append(",");
        if (getMemberClustersOutpostArns() != null)
            sb.append("MemberClustersOutpostArns: ").append(getMemberClustersOutpostArns()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getUserGroupIds() != null)
            sb.append("UserGroupIds: ").append(getUserGroupIds()).append(",");
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

        if (obj instanceof ReplicationGroup == false)
            return false;
        ReplicationGroup other = (ReplicationGroup) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGlobalReplicationGroupInfo() == null ^ this.getGlobalReplicationGroupInfo() == null)
            return false;
        if (other.getGlobalReplicationGroupInfo() != null && other.getGlobalReplicationGroupInfo().equals(this.getGlobalReplicationGroupInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getMemberClusters() == null ^ this.getMemberClusters() == null)
            return false;
        if (other.getMemberClusters() != null && other.getMemberClusters().equals(this.getMemberClusters()) == false)
            return false;
        if (other.getNodeGroups() == null ^ this.getNodeGroups() == null)
            return false;
        if (other.getNodeGroups() != null && other.getNodeGroups().equals(this.getNodeGroups()) == false)
            return false;
        if (other.getSnapshottingClusterId() == null ^ this.getSnapshottingClusterId() == null)
            return false;
        if (other.getSnapshottingClusterId() != null && other.getSnapshottingClusterId().equals(this.getSnapshottingClusterId()) == false)
            return false;
        if (other.getAutomaticFailover() == null ^ this.getAutomaticFailover() == null)
            return false;
        if (other.getAutomaticFailover() != null && other.getAutomaticFailover().equals(this.getAutomaticFailover()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getConfigurationEndpoint() == null ^ this.getConfigurationEndpoint() == null)
            return false;
        if (other.getConfigurationEndpoint() != null && other.getConfigurationEndpoint().equals(this.getConfigurationEndpoint()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getClusterEnabled() == null ^ this.getClusterEnabled() == null)
            return false;
        if (other.getClusterEnabled() != null && other.getClusterEnabled().equals(this.getClusterEnabled()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getAuthTokenEnabled() == null ^ this.getAuthTokenEnabled() == null)
            return false;
        if (other.getAuthTokenEnabled() != null && other.getAuthTokenEnabled().equals(this.getAuthTokenEnabled()) == false)
            return false;
        if (other.getAuthTokenLastModifiedDate() == null ^ this.getAuthTokenLastModifiedDate() == null)
            return false;
        if (other.getAuthTokenLastModifiedDate() != null && other.getAuthTokenLastModifiedDate().equals(this.getAuthTokenLastModifiedDate()) == false)
            return false;
        if (other.getTransitEncryptionEnabled() == null ^ this.getTransitEncryptionEnabled() == null)
            return false;
        if (other.getTransitEncryptionEnabled() != null && other.getTransitEncryptionEnabled().equals(this.getTransitEncryptionEnabled()) == false)
            return false;
        if (other.getAtRestEncryptionEnabled() == null ^ this.getAtRestEncryptionEnabled() == null)
            return false;
        if (other.getAtRestEncryptionEnabled() != null && other.getAtRestEncryptionEnabled().equals(this.getAtRestEncryptionEnabled()) == false)
            return false;
        if (other.getMemberClustersOutpostArns() == null ^ this.getMemberClustersOutpostArns() == null)
            return false;
        if (other.getMemberClustersOutpostArns() != null && other.getMemberClustersOutpostArns().equals(this.getMemberClustersOutpostArns()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getUserGroupIds() == null ^ this.getUserGroupIds() == null)
            return false;
        if (other.getUserGroupIds() != null && other.getUserGroupIds().equals(this.getUserGroupIds()) == false)
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

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGlobalReplicationGroupInfo() == null) ? 0 : getGlobalReplicationGroupInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getMemberClusters() == null) ? 0 : getMemberClusters().hashCode());
        hashCode = prime * hashCode + ((getNodeGroups() == null) ? 0 : getNodeGroups().hashCode());
        hashCode = prime * hashCode + ((getSnapshottingClusterId() == null) ? 0 : getSnapshottingClusterId().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFailover() == null) ? 0 : getAutomaticFailover().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getConfigurationEndpoint() == null) ? 0 : getConfigurationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode + ((getClusterEnabled() == null) ? 0 : getClusterEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getAuthTokenEnabled() == null) ? 0 : getAuthTokenEnabled().hashCode());
        hashCode = prime * hashCode + ((getAuthTokenLastModifiedDate() == null) ? 0 : getAuthTokenLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getTransitEncryptionEnabled() == null) ? 0 : getTransitEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getAtRestEncryptionEnabled() == null) ? 0 : getAtRestEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getMemberClustersOutpostArns() == null) ? 0 : getMemberClustersOutpostArns().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getUserGroupIds() == null) ? 0 : getUserGroupIds().hashCode());
        hashCode = prime * hashCode + ((getLogDeliveryConfigurations() == null) ? 0 : getLogDeliveryConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationGroup clone() {
        try {
            return (ReplicationGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
