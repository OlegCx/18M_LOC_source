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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a CreateCacheCluster operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCacheClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The node group (shard) identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 50 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster
     * is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary
     * that is not part of any replication group.
     * </p>
     * <p>
     * If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the cluster is
     * created in Availability Zones that provide the best spread of read replicas across Availability Zones.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     */
    private String replicationGroupId;
    /**
     * <p>
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created across
     * multiple Availability Zones in the cluster's region.
     * </p>
     * <p>
     * This parameter is only supported for Memcached clusters.
     * </p>
     * <p>
     * If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache assumes
     * <code>single-az</code> mode.
     * </p>
     */
    private String aZMode;
    /**
     * <p>
     * The EC2 Availability Zone in which the cluster is created.
     * </p>
     * <p>
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want to create your
     * nodes across multiple Availability Zones, use <code>PreferredAvailabilityZones</code>.
     * </p>
     * <p>
     * Default: System chosen Availability Zone.
     * </p>
     */
    private String preferredAvailabilityZone;
    /**
     * <p>
     * A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is not
     * important.
     * </p>
     * <p>
     * This option is only supported on Memcached.
     * </p>
     * <note>
     * <p>
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability Zones
     * that are associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     * </p>
     * </note>
     * <p>
     * If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code> instead, or
     * repeat the Availability Zone multiple times in the list.
     * </p>
     * <p>
     * Default: System chosen Availability Zones.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> preferredAvailabilityZones;
    /**
     * <p>
     * The initial number of cache nodes that the cluster has.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 40.
     * </p>
     * <p>
     * If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase Request
     * form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us
     * /elasticache-node-limit-request/</a>.
     * </p>
     */
    private Integer numCacheNodes;
    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group (shard).
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine version
     * 1.5.16 onward).
     * </p>
     * <p>
     * <code>cache.m6g.large</code>, <code>cache.m6g.xlarge</code>, <code>cache.m6g.2xlarge</code>,
     * <code>cache.m6g.4xlarge</code>, <code>cache.m6g.8xlarge</code>, <code>cache.m6g.12xlarge</code>,
     * <code>cache.m6g.16xlarge</code>
     * </p>
     * <note>
     * <p>
     * For region availability, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     * >Supported Node Types</a>
     * </p>
     * </note>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>, <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>, <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine version
     * 1.5.16 onward).
     * </p>
     * <p>
     * <code>cache.r6g.large</code>, <code>cache.r6g.xlarge</code>, <code>cache.r6g.2xlarge</code>,
     * <code>cache.r6g.4xlarge</code>, <code>cache.r6g.8xlarge</code>, <code>cache.r6g.12xlarge</code>,
     * <code>cache.r6g.16xlarge</code>
     * </p>
     * <note>
     * <p>
     * For region availability, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     * >Supported Node Types</a>
     * </p>
     * </note>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>, <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on Redis
     * version 2.8.22 and later.
     * </p>
     * </li>
     * </ul>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The name of the cache engine to be used for this cluster.
     * </p>
     * <p>
     * Valid values for this parameter are: <code>memcached</code> | <code>redis</code>
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the cache engine to be used for this cluster. To view the supported cache engine versions,
     * use the DescribeCacheEngineVersions operation.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you want to use an
     * earlier engine version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of the parameter group to associate with this cluster. If this argument is omitted, the default
     * parameter group for the specified engine is used. You cannot use any parameter group which has
     * <code>cluster-enabled='yes'</code> when creating a cluster.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * The name of the subnet group to be used for the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <important>
     * <p>
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you start
     * creating a cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html">Subnets and Subnet
     * Groups</a>.
     * </p>
     * </important>
     */
    private String cacheSubnetGroupName;
    /**
     * <p>
     * A list of security group names to associate with this cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheSecurityGroupNames;
    /**
     * <p>
     * One or more VPC security groups associated with the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * A list of tags to be added to this resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB
     * snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> snapshotArns;
    /**
     * <p>
     * The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot status
     * changes to <code>restoring</code> while the new node group (shard) is being created.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     */
    private String snapshotName;
    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * Valid values for <code>ddd</code> are:
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The port number on which each of the cache nodes accepts connections.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are
     * sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cluster owner.
     * </p>
     * </note>
     */
    private String notificationTopicArn;
    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you
     * set <code>SnapshotRetentionLimit</code> to 5, a snapshot taken today is retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * </p>
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
     * <b>Reserved parameter.</b> The password used to access a password protected server.
     * </p>
     * <p>
     * Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable special
     * characters cannot be used in the AUTH token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="http://redis.io/commands/AUTH">AUTH password</a> at
     * http://redis.io/commands/AUTH.
     * </p>
     */
    private String authToken;
    /**
     * <p>
     * Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * </p>
     */
    private String outpostMode;
    /**
     * <p>
     * The outpost ARN in which the cache cluster is created.
     * </p>
     */
    private String preferredOutpostArn;
    /**
     * <p>
     * The outpost ARNs in which the cache cluster is created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> preferredOutpostArns;
    /**
     * <p>
     * Specifies the destination, format and type of the logs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest> logDeliveryConfigurations;

    /**
     * Default constructor for CreateCacheClusterRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateCacheClusterRequest() {
    }

    /**
     * Constructs a new CreateCacheClusterRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param cacheClusterId
     *        The node group (shard) identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        <b>Constraints:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A name must contain from 1 to 50 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A name cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @param numCacheNodes
     *        The initial number of cache nodes that the cluster has.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 40.
     *        </p>
     *        <p>
     *        If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase
     *        Request form at <a
     *        href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon
     *        .com/contact-us/elasticache-node-limit-request/</a>.
     * @param cacheNodeType
     *        The compute and memory capacity of the nodes in the node group (shard).
     *        </p>
     *        <p>
     *        The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *        provide more memory and computational power at lower cost when compared to their equivalent previous
     *        generation counterparts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>M6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine
     *        version 1.5.16 onward).
     *        </p>
     *        <p>
     *        <code>cache.m6g.large</code>, <code>cache.m6g.xlarge</code>, <code>cache.m6g.2xlarge</code>,
     *        <code>cache.m6g.4xlarge</code>, <code>cache.m6g.8xlarge</code>, <code>cache.m6g.12xlarge</code>,
     *        <code>cache.m6g.16xlarge</code>
     *        </p>
     *        <note>
     *        <p>
     *        For region availability, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     *        >Supported Node Types</a>
     *        </p>
     *        </note>
     *        <p>
     *        <b>M5 node types:</b> <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>,
     *        <code>cache.m5.2xlarge</code>, <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *        <code>cache.m5.24xlarge</code>
     *        </p>
     *        <p>
     *        <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        <p>
     *        <b>T3 node types:</b> <code>cache.t3.micro</code>, <code>cache.t3.small</code>,
     *        <code>cache.t3.medium</code>
     *        </p>
     *        <p>
     *        <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *        <code>cache.t2.medium</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>T1 node types:</b> <code>cache.t1.micro</code>
     *        </p>
     *        <p>
     *        <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        <p>
     *        <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>R6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine
     *        version 1.5.16 onward).
     *        </p>
     *        <p>
     *        <code>cache.r6g.large</code>, <code>cache.r6g.xlarge</code>, <code>cache.r6g.2xlarge</code>,
     *        <code>cache.r6g.4xlarge</code>, <code>cache.r6g.8xlarge</code>, <code>cache.r6g.12xlarge</code>,
     *        <code>cache.r6g.16xlarge</code>
     *        </p>
     *        <note>
     *        <p>
     *        For region availability, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     *        >Supported Node Types</a>
     *        </p>
     *        </note>
     *        <p>
     *        <b>R5 node types:</b> <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>,
     *        <code>cache.r5.2xlarge</code>, <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *        <code>cache.r5.24xlarge</code>
     *        </p>
     *        <p>
     *        <b>R4 node types:</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>,
     *        <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *        <code>cache.r4.16xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        <p>
     *        <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Additional node type info</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All current generation instance types are created in Amazon VPC by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis append-only files (AOF) are not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Multi-AZ with automatic failover is not supported on T1 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on
     *        Redis version 2.8.22 and later.
     *        </p>
     *        </li>
     * @param engine
     *        The name of the cache engine to be used for this cluster.</p>
     *        <p>
     *        Valid values for this parameter are: <code>memcached</code> | <code>redis</code>
     * @param cacheSecurityGroupNames
     *        A list of security group names to associate with this cluster.
     *        </p>
     *        <p>
     *        Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon
     *        VPC).
     */
    public CreateCacheClusterRequest(String cacheClusterId, Integer numCacheNodes, String cacheNodeType, String engine,
            java.util.List<String> cacheSecurityGroupNames) {
        setCacheClusterId(cacheClusterId);
        setNumCacheNodes(numCacheNodes);
        setCacheNodeType(cacheNodeType);
        setEngine(engine);
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
    }

    /**
     * <p>
     * The node group (shard) identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 50 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheClusterId
     *        The node group (shard) identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        <b>Constraints:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A name must contain from 1 to 50 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A name cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The node group (shard) identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 50 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The node group (shard) identifier. This parameter is stored as a lowercase string.</p>
     *         <p>
     *         <b>Constraints:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A name must contain from 1 to 50 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A name cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The node group (shard) identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 50 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheClusterId
     *        The node group (shard) identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        <b>Constraints:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A name must contain from 1 to 50 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A name cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster
     * is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary
     * that is not part of any replication group.
     * </p>
     * <p>
     * If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the cluster is
     * created in Availability Zones that provide the best spread of read replicas across Availability Zones.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param replicationGroupId
     *        The ID of the replication group to which this cluster should belong. If this parameter is specified, the
     *        cluster is added to the specified replication group as a read replica; otherwise, the cluster is a
     *        standalone primary that is not part of any replication group.</p>
     *        <p>
     *        If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the
     *        cluster is created in Availability Zones that provide the best spread of read replicas across Availability
     *        Zones.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster
     * is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary
     * that is not part of any replication group.
     * </p>
     * <p>
     * If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the cluster is
     * created in Availability Zones that provide the best spread of read replicas across Availability Zones.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @return The ID of the replication group to which this cluster should belong. If this parameter is specified, the
     *         cluster is added to the specified replication group as a read replica; otherwise, the cluster is a
     *         standalone primary that is not part of any replication group.</p>
     *         <p>
     *         If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the
     *         cluster is created in Availability Zones that provide the best spread of read replicas across
     *         Availability Zones.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *         </p>
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster
     * is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary
     * that is not part of any replication group.
     * </p>
     * <p>
     * If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the cluster is
     * created in Availability Zones that provide the best spread of read replicas across Availability Zones.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param replicationGroupId
     *        The ID of the replication group to which this cluster should belong. If this parameter is specified, the
     *        cluster is added to the specified replication group as a read replica; otherwise, the cluster is a
     *        standalone primary that is not part of any replication group.</p>
     *        <p>
     *        If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the
     *        cluster is created in Availability Zones that provide the best spread of read replicas across Availability
     *        Zones.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created across
     * multiple Availability Zones in the cluster's region.
     * </p>
     * <p>
     * This parameter is only supported for Memcached clusters.
     * </p>
     * <p>
     * If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache assumes
     * <code>single-az</code> mode.
     * </p>
     * 
     * @param aZMode
     *        Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created
     *        across multiple Availability Zones in the cluster's region.</p>
     *        <p>
     *        This parameter is only supported for Memcached clusters.
     *        </p>
     *        <p>
     *        If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *        assumes <code>single-az</code> mode.
     * @see AZMode
     */

    public void setAZMode(String aZMode) {
        this.aZMode = aZMode;
    }

    /**
     * <p>
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created across
     * multiple Availability Zones in the cluster's region.
     * </p>
     * <p>
     * This parameter is only supported for Memcached clusters.
     * </p>
     * <p>
     * If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache assumes
     * <code>single-az</code> mode.
     * </p>
     * 
     * @return Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or
     *         created across multiple Availability Zones in the cluster's region.</p>
     *         <p>
     *         This parameter is only supported for Memcached clusters.
     *         </p>
     *         <p>
     *         If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *         assumes <code>single-az</code> mode.
     * @see AZMode
     */

    public String getAZMode() {
        return this.aZMode;
    }

    /**
     * <p>
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created across
     * multiple Availability Zones in the cluster's region.
     * </p>
     * <p>
     * This parameter is only supported for Memcached clusters.
     * </p>
     * <p>
     * If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache assumes
     * <code>single-az</code> mode.
     * </p>
     * 
     * @param aZMode
     *        Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created
     *        across multiple Availability Zones in the cluster's region.</p>
     *        <p>
     *        This parameter is only supported for Memcached clusters.
     *        </p>
     *        <p>
     *        If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *        assumes <code>single-az</code> mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AZMode
     */

    public CreateCacheClusterRequest withAZMode(String aZMode) {
        setAZMode(aZMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created across
     * multiple Availability Zones in the cluster's region.
     * </p>
     * <p>
     * This parameter is only supported for Memcached clusters.
     * </p>
     * <p>
     * If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache assumes
     * <code>single-az</code> mode.
     * </p>
     * 
     * @param aZMode
     *        Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created
     *        across multiple Availability Zones in the cluster's region.</p>
     *        <p>
     *        This parameter is only supported for Memcached clusters.
     *        </p>
     *        <p>
     *        If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *        assumes <code>single-az</code> mode.
     * @see AZMode
     */

    public void setAZMode(AZMode aZMode) {
        withAZMode(aZMode);
    }

    /**
     * <p>
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created across
     * multiple Availability Zones in the cluster's region.
     * </p>
     * <p>
     * This parameter is only supported for Memcached clusters.
     * </p>
     * <p>
     * If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache assumes
     * <code>single-az</code> mode.
     * </p>
     * 
     * @param aZMode
     *        Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created
     *        across multiple Availability Zones in the cluster's region.</p>
     *        <p>
     *        This parameter is only supported for Memcached clusters.
     *        </p>
     *        <p>
     *        If the <code>AZMode</code> and <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *        assumes <code>single-az</code> mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AZMode
     */

    public CreateCacheClusterRequest withAZMode(AZMode aZMode) {
        this.aZMode = aZMode.toString();
        return this;
    }

    /**
     * <p>
     * The EC2 Availability Zone in which the cluster is created.
     * </p>
     * <p>
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want to create your
     * nodes across multiple Availability Zones, use <code>PreferredAvailabilityZones</code>.
     * </p>
     * <p>
     * Default: System chosen Availability Zone.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The EC2 Availability Zone in which the cluster is created.</p>
     *        <p>
     *        All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want to create
     *        your nodes across multiple Availability Zones, use <code>PreferredAvailabilityZones</code>.
     *        </p>
     *        <p>
     *        Default: System chosen Availability Zone.
     */

    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone in which the cluster is created.
     * </p>
     * <p>
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want to create your
     * nodes across multiple Availability Zones, use <code>PreferredAvailabilityZones</code>.
     * </p>
     * <p>
     * Default: System chosen Availability Zone.
     * </p>
     * 
     * @return The EC2 Availability Zone in which the cluster is created.</p>
     *         <p>
     *         All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want to create
     *         your nodes across multiple Availability Zones, use <code>PreferredAvailabilityZones</code>.
     *         </p>
     *         <p>
     *         Default: System chosen Availability Zone.
     */

    public String getPreferredAvailabilityZone() {
        return this.preferredAvailabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone in which the cluster is created.
     * </p>
     * <p>
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want to create your
     * nodes across multiple Availability Zones, use <code>PreferredAvailabilityZones</code>.
     * </p>
     * <p>
     * Default: System chosen Availability Zone.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The EC2 Availability Zone in which the cluster is created.</p>
     *        <p>
     *        All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want to create
     *        your nodes across multiple Availability Zones, use <code>PreferredAvailabilityZones</code>.
     *        </p>
     *        <p>
     *        Default: System chosen Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        setPreferredAvailabilityZone(preferredAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is not
     * important.
     * </p>
     * <p>
     * This option is only supported on Memcached.
     * </p>
     * <note>
     * <p>
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability Zones
     * that are associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     * </p>
     * </note>
     * <p>
     * If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code> instead, or
     * repeat the Availability Zone multiple times in the list.
     * </p>
     * <p>
     * Default: System chosen Availability Zones.
     * </p>
     * 
     * @return A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is
     *         not important.</p>
     *         <p>
     *         This option is only supported on Memcached.
     *         </p>
     *         <note>
     *         <p>
     *         If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability
     *         Zones that are associated with the subnets in the selected subnet group.
     *         </p>
     *         <p>
     *         The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     *         </p>
     *         </note>
     *         <p>
     *         If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code>
     *         instead, or repeat the Availability Zone multiple times in the list.
     *         </p>
     *         <p>
     *         Default: System chosen Availability Zones.
     */

    public java.util.List<String> getPreferredAvailabilityZones() {
        if (preferredAvailabilityZones == null) {
            preferredAvailabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return preferredAvailabilityZones;
    }

    /**
     * <p>
     * A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is not
     * important.
     * </p>
     * <p>
     * This option is only supported on Memcached.
     * </p>
     * <note>
     * <p>
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability Zones
     * that are associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     * </p>
     * </note>
     * <p>
     * If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code> instead, or
     * repeat the Availability Zone multiple times in the list.
     * </p>
     * <p>
     * Default: System chosen Availability Zones.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is
     *        not important.</p>
     *        <p>
     *        This option is only supported on Memcached.
     *        </p>
     *        <note>
     *        <p>
     *        If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability
     *        Zones that are associated with the subnets in the selected subnet group.
     *        </p>
     *        <p>
     *        The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code>
     *        instead, or repeat the Availability Zone multiple times in the list.
     *        </p>
     *        <p>
     *        Default: System chosen Availability Zones.
     */

    public void setPreferredAvailabilityZones(java.util.Collection<String> preferredAvailabilityZones) {
        if (preferredAvailabilityZones == null) {
            this.preferredAvailabilityZones = null;
            return;
        }

        this.preferredAvailabilityZones = new com.amazonaws.internal.SdkInternalList<String>(preferredAvailabilityZones);
    }

    /**
     * <p>
     * A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is not
     * important.
     * </p>
     * <p>
     * This option is only supported on Memcached.
     * </p>
     * <note>
     * <p>
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability Zones
     * that are associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     * </p>
     * </note>
     * <p>
     * If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code> instead, or
     * repeat the Availability Zone multiple times in the list.
     * </p>
     * <p>
     * Default: System chosen Availability Zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreferredAvailabilityZones(java.util.Collection)} or
     * {@link #withPreferredAvailabilityZones(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is
     *        not important.</p>
     *        <p>
     *        This option is only supported on Memcached.
     *        </p>
     *        <note>
     *        <p>
     *        If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability
     *        Zones that are associated with the subnets in the selected subnet group.
     *        </p>
     *        <p>
     *        The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code>
     *        instead, or repeat the Availability Zone multiple times in the list.
     *        </p>
     *        <p>
     *        Default: System chosen Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withPreferredAvailabilityZones(String... preferredAvailabilityZones) {
        if (this.preferredAvailabilityZones == null) {
            setPreferredAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(preferredAvailabilityZones.length));
        }
        for (String ele : preferredAvailabilityZones) {
            this.preferredAvailabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is not
     * important.
     * </p>
     * <p>
     * This option is only supported on Memcached.
     * </p>
     * <note>
     * <p>
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability Zones
     * that are associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     * </p>
     * </note>
     * <p>
     * If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code> instead, or
     * repeat the Availability Zone multiple times in the list.
     * </p>
     * <p>
     * Default: System chosen Availability Zones.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is
     *        not important.</p>
     *        <p>
     *        This option is only supported on Memcached.
     *        </p>
     *        <note>
     *        <p>
     *        If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability
     *        Zones that are associated with the subnets in the selected subnet group.
     *        </p>
     *        <p>
     *        The number of Availability Zones listed must equal the value of <code>NumCacheNodes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        If you want all the nodes in the same Availability Zone, use <code>PreferredAvailabilityZone</code>
     *        instead, or repeat the Availability Zone multiple times in the list.
     *        </p>
     *        <p>
     *        Default: System chosen Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withPreferredAvailabilityZones(java.util.Collection<String> preferredAvailabilityZones) {
        setPreferredAvailabilityZones(preferredAvailabilityZones);
        return this;
    }

    /**
     * <p>
     * The initial number of cache nodes that the cluster has.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 40.
     * </p>
     * <p>
     * If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase Request
     * form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us
     * /elasticache-node-limit-request/</a>.
     * </p>
     * 
     * @param numCacheNodes
     *        The initial number of cache nodes that the cluster has.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 40.
     *        </p>
     *        <p>
     *        If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase
     *        Request form at <a
     *        href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon
     *        .com/contact-us/elasticache-node-limit-request/</a>.
     */

    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The initial number of cache nodes that the cluster has.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 40.
     * </p>
     * <p>
     * If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase Request
     * form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us
     * /elasticache-node-limit-request/</a>.
     * </p>
     * 
     * @return The initial number of cache nodes that the cluster has.</p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 40.
     *         </p>
     *         <p>
     *         If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase
     *         Request form at <a
     *         href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon
     *         .com/contact-us/elasticache-node-limit-request/</a>.
     */

    public Integer getNumCacheNodes() {
        return this.numCacheNodes;
    }

    /**
     * <p>
     * The initial number of cache nodes that the cluster has.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 40.
     * </p>
     * <p>
     * If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase Request
     * form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us
     * /elasticache-node-limit-request/</a>.
     * </p>
     * 
     * @param numCacheNodes
     *        The initial number of cache nodes that the cluster has.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 40.
     *        </p>
     *        <p>
     *        If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase
     *        Request form at <a
     *        href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon
     *        .com/contact-us/elasticache-node-limit-request/</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withNumCacheNodes(Integer numCacheNodes) {
        setNumCacheNodes(numCacheNodes);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group (shard).
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine version
     * 1.5.16 onward).
     * </p>
     * <p>
     * <code>cache.m6g.large</code>, <code>cache.m6g.xlarge</code>, <code>cache.m6g.2xlarge</code>,
     * <code>cache.m6g.4xlarge</code>, <code>cache.m6g.8xlarge</code>, <code>cache.m6g.12xlarge</code>,
     * <code>cache.m6g.16xlarge</code>
     * </p>
     * <note>
     * <p>
     * For region availability, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     * >Supported Node Types</a>
     * </p>
     * </note>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>, <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>, <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine version
     * 1.5.16 onward).
     * </p>
     * <p>
     * <code>cache.r6g.large</code>, <code>cache.r6g.xlarge</code>, <code>cache.r6g.2xlarge</code>,
     * <code>cache.r6g.4xlarge</code>, <code>cache.r6g.8xlarge</code>, <code>cache.r6g.12xlarge</code>,
     * <code>cache.r6g.16xlarge</code>
     * </p>
     * <note>
     * <p>
     * For region availability, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     * >Supported Node Types</a>
     * </p>
     * </note>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>, <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on Redis
     * version 2.8.22 and later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheNodeType
     *        The compute and memory capacity of the nodes in the node group (shard).</p>
     *        <p>
     *        The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *        provide more memory and computational power at lower cost when compared to their equivalent previous
     *        generation counterparts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>M6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine
     *        version 1.5.16 onward).
     *        </p>
     *        <p>
     *        <code>cache.m6g.large</code>, <code>cache.m6g.xlarge</code>, <code>cache.m6g.2xlarge</code>,
     *        <code>cache.m6g.4xlarge</code>, <code>cache.m6g.8xlarge</code>, <code>cache.m6g.12xlarge</code>,
     *        <code>cache.m6g.16xlarge</code>
     *        </p>
     *        <note>
     *        <p>
     *        For region availability, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     *        >Supported Node Types</a>
     *        </p>
     *        </note>
     *        <p>
     *        <b>M5 node types:</b> <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>,
     *        <code>cache.m5.2xlarge</code>, <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *        <code>cache.m5.24xlarge</code>
     *        </p>
     *        <p>
     *        <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        <p>
     *        <b>T3 node types:</b> <code>cache.t3.micro</code>, <code>cache.t3.small</code>,
     *        <code>cache.t3.medium</code>
     *        </p>
     *        <p>
     *        <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *        <code>cache.t2.medium</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>T1 node types:</b> <code>cache.t1.micro</code>
     *        </p>
     *        <p>
     *        <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        <p>
     *        <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>R6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine
     *        version 1.5.16 onward).
     *        </p>
     *        <p>
     *        <code>cache.r6g.large</code>, <code>cache.r6g.xlarge</code>, <code>cache.r6g.2xlarge</code>,
     *        <code>cache.r6g.4xlarge</code>, <code>cache.r6g.8xlarge</code>, <code>cache.r6g.12xlarge</code>,
     *        <code>cache.r6g.16xlarge</code>
     *        </p>
     *        <note>
     *        <p>
     *        For region availability, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     *        >Supported Node Types</a>
     *        </p>
     *        </note>
     *        <p>
     *        <b>R5 node types:</b> <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>,
     *        <code>cache.r5.2xlarge</code>, <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *        <code>cache.r5.24xlarge</code>
     *        </p>
     *        <p>
     *        <b>R4 node types:</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>,
     *        <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *        <code>cache.r4.16xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        <p>
     *        <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Additional node type info</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All current generation instance types are created in Amazon VPC by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis append-only files (AOF) are not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Multi-AZ with automatic failover is not supported on T1 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on
     *        Redis version 2.8.22 and later.
     *        </p>
     *        </li>
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group (shard).
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine version
     * 1.5.16 onward).
     * </p>
     * <p>
     * <code>cache.m6g.large</code>, <code>cache.m6g.xlarge</code>, <code>cache.m6g.2xlarge</code>,
     * <code>cache.m6g.4xlarge</code>, <code>cache.m6g.8xlarge</code>, <code>cache.m6g.12xlarge</code>,
     * <code>cache.m6g.16xlarge</code>
     * </p>
     * <note>
     * <p>
     * For region availability, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     * >Supported Node Types</a>
     * </p>
     * </note>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>, <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>, <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine version
     * 1.5.16 onward).
     * </p>
     * <p>
     * <code>cache.r6g.large</code>, <code>cache.r6g.xlarge</code>, <code>cache.r6g.2xlarge</code>,
     * <code>cache.r6g.4xlarge</code>, <code>cache.r6g.8xlarge</code>, <code>cache.r6g.12xlarge</code>,
     * <code>cache.r6g.16xlarge</code>
     * </p>
     * <note>
     * <p>
     * For region availability, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     * >Supported Node Types</a>
     * </p>
     * </note>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>, <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on Redis
     * version 2.8.22 and later.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The compute and memory capacity of the nodes in the node group (shard).</p>
     *         <p>
     *         The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *         provide more memory and computational power at lower cost when compared to their equivalent previous
     *         generation counterparts.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General purpose:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>M6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine
     *         version 1.5.16 onward).
     *         </p>
     *         <p>
     *         <code>cache.m6g.large</code>, <code>cache.m6g.xlarge</code>, <code>cache.m6g.2xlarge</code>,
     *         <code>cache.m6g.4xlarge</code>, <code>cache.m6g.8xlarge</code>, <code>cache.m6g.12xlarge</code>,
     *         <code>cache.m6g.16xlarge</code>
     *         </p>
     *         <note>
     *         <p>
     *         For region availability, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     *         >Supported Node Types</a>
     *         </p>
     *         </note>
     *         <p>
     *         <b>M5 node types:</b> <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>,
     *         <code>cache.m5.2xlarge</code>, <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *         <code>cache.m5.24xlarge</code>
     *         </p>
     *         <p>
     *         <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *         <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *         </p>
     *         <p>
     *         <b>T3 node types:</b> <code>cache.t3.micro</code>, <code>cache.t3.small</code>,
     *         <code>cache.t3.medium</code>
     *         </p>
     *         <p>
     *         <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *         <code>cache.t2.medium</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>T1 node types:</b> <code>cache.t1.micro</code>
     *         </p>
     *         <p>
     *         <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *         <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *         </p>
     *         <p>
     *         <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Compute optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Memory optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>R6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine
     *         version 1.5.16 onward).
     *         </p>
     *         <p>
     *         <code>cache.r6g.large</code>, <code>cache.r6g.xlarge</code>, <code>cache.r6g.2xlarge</code>,
     *         <code>cache.r6g.4xlarge</code>, <code>cache.r6g.8xlarge</code>, <code>cache.r6g.12xlarge</code>,
     *         <code>cache.r6g.16xlarge</code>
     *         </p>
     *         <note>
     *         <p>
     *         For region availability, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     *         >Supported Node Types</a>
     *         </p>
     *         </note>
     *         <p>
     *         <b>R5 node types:</b> <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>,
     *         <code>cache.r5.2xlarge</code>, <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *         <code>cache.r5.24xlarge</code>
     *         </p>
     *         <p>
     *         <b>R4 node types:</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>,
     *         <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *         <code>cache.r4.16xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *         <code>cache.m2.4xlarge</code>
     *         </p>
     *         <p>
     *         <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *         <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Additional node type info</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         All current generation instance types are created in Amazon VPC by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis append-only files (AOF) are not supported for T1 or T2 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Multi-AZ with automatic failover is not supported on T1 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on
     *         Redis version 2.8.22 and later.
     *         </p>
     *         </li>
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group (shard).
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine version
     * 1.5.16 onward).
     * </p>
     * <p>
     * <code>cache.m6g.large</code>, <code>cache.m6g.xlarge</code>, <code>cache.m6g.2xlarge</code>,
     * <code>cache.m6g.4xlarge</code>, <code>cache.m6g.8xlarge</code>, <code>cache.m6g.12xlarge</code>,
     * <code>cache.m6g.16xlarge</code>
     * </p>
     * <note>
     * <p>
     * For region availability, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     * >Supported Node Types</a>
     * </p>
     * </note>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>, <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>, <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine version
     * 1.5.16 onward).
     * </p>
     * <p>
     * <code>cache.r6g.large</code>, <code>cache.r6g.xlarge</code>, <code>cache.r6g.2xlarge</code>,
     * <code>cache.r6g.4xlarge</code>, <code>cache.r6g.8xlarge</code>, <code>cache.r6g.12xlarge</code>,
     * <code>cache.r6g.16xlarge</code>
     * </p>
     * <note>
     * <p>
     * For region availability, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     * >Supported Node Types</a>
     * </p>
     * </note>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>, <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on Redis
     * version 2.8.22 and later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheNodeType
     *        The compute and memory capacity of the nodes in the node group (shard).</p>
     *        <p>
     *        The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *        provide more memory and computational power at lower cost when compared to their equivalent previous
     *        generation counterparts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>M6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine
     *        version 1.5.16 onward).
     *        </p>
     *        <p>
     *        <code>cache.m6g.large</code>, <code>cache.m6g.xlarge</code>, <code>cache.m6g.2xlarge</code>,
     *        <code>cache.m6g.4xlarge</code>, <code>cache.m6g.8xlarge</code>, <code>cache.m6g.12xlarge</code>,
     *        <code>cache.m6g.16xlarge</code>
     *        </p>
     *        <note>
     *        <p>
     *        For region availability, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     *        >Supported Node Types</a>
     *        </p>
     *        </note>
     *        <p>
     *        <b>M5 node types:</b> <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>,
     *        <code>cache.m5.2xlarge</code>, <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *        <code>cache.m5.24xlarge</code>
     *        </p>
     *        <p>
     *        <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        <p>
     *        <b>T3 node types:</b> <code>cache.t3.micro</code>, <code>cache.t3.small</code>,
     *        <code>cache.t3.medium</code>
     *        </p>
     *        <p>
     *        <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *        <code>cache.t2.medium</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>T1 node types:</b> <code>cache.t1.micro</code>
     *        </p>
     *        <p>
     *        <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        <p>
     *        <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>R6g node types</b> (available only for Redis engine version 5.0.6 onward and for Memcached engine
     *        version 1.5.16 onward).
     *        </p>
     *        <p>
     *        <code>cache.r6g.large</code>, <code>cache.r6g.xlarge</code>, <code>cache.r6g.2xlarge</code>,
     *        <code>cache.r6g.4xlarge</code>, <code>cache.r6g.8xlarge</code>, <code>cache.r6g.12xlarge</code>,
     *        <code>cache.r6g.16xlarge</code>
     *        </p>
     *        <note>
     *        <p>
     *        For region availability, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion"
     *        >Supported Node Types</a>
     *        </p>
     *        </note>
     *        <p>
     *        <b>R5 node types:</b> <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>,
     *        <code>cache.r5.2xlarge</code>, <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *        <code>cache.r5.24xlarge</code>
     *        </p>
     *        <p>
     *        <b>R4 node types:</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>,
     *        <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *        <code>cache.r4.16xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        <p>
     *        <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Additional node type info</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All current generation instance types are created in Amazon VPC by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis append-only files (AOF) are not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Multi-AZ with automatic failover is not supported on T1 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on
     *        Redis version 2.8.22 and later.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The name of the cache engine to be used for this cluster.
     * </p>
     * <p>
     * Valid values for this parameter are: <code>memcached</code> | <code>redis</code>
     * </p>
     * 
     * @param engine
     *        The name of the cache engine to be used for this cluster.</p>
     *        <p>
     *        Valid values for this parameter are: <code>memcached</code> | <code>redis</code>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine to be used for this cluster.
     * </p>
     * <p>
     * Valid values for this parameter are: <code>memcached</code> | <code>redis</code>
     * </p>
     * 
     * @return The name of the cache engine to be used for this cluster.</p>
     *         <p>
     *         Valid values for this parameter are: <code>memcached</code> | <code>redis</code>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the cache engine to be used for this cluster.
     * </p>
     * <p>
     * Valid values for this parameter are: <code>memcached</code> | <code>redis</code>
     * </p>
     * 
     * @param engine
     *        The name of the cache engine to be used for this cluster.</p>
     *        <p>
     *        Valid values for this parameter are: <code>memcached</code> | <code>redis</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for this cluster. To view the supported cache engine versions,
     * use the DescribeCacheEngineVersions operation.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you want to use an
     * earlier engine version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the cache engine to be used for this cluster. To view the supported cache engine
     *        versions, use the DescribeCacheEngineVersions operation.</p>
     *        <p>
     *        <b>Important:</b> You can upgrade to a newer engine version (see <a
     *        href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *        >Selecting a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you
     *        want to use an earlier engine version, you must delete the existing cluster or replication group and
     *        create it anew with the earlier engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for this cluster. To view the supported cache engine versions,
     * use the DescribeCacheEngineVersions operation.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you want to use an
     * earlier engine version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     * </p>
     * 
     * @return The version number of the cache engine to be used for this cluster. To view the supported cache engine
     *         versions, use the DescribeCacheEngineVersions operation.</p>
     *         <p>
     *         <b>Important:</b> You can upgrade to a newer engine version (see <a
     *         href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *         >Selecting a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you
     *         want to use an earlier engine version, you must delete the existing cluster or replication group and
     *         create it anew with the earlier engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for this cluster. To view the supported cache engine versions,
     * use the DescribeCacheEngineVersions operation.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you want to use an
     * earlier engine version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the cache engine to be used for this cluster. To view the supported cache engine
     *        versions, use the DescribeCacheEngineVersions operation.</p>
     *        <p>
     *        <b>Important:</b> You can upgrade to a newer engine version (see <a
     *        href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *        >Selecting a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you
     *        want to use an earlier engine version, you must delete the existing cluster or replication group and
     *        create it anew with the earlier engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this cluster. If this argument is omitted, the default
     * parameter group for the specified engine is used. You cannot use any parameter group which has
     * <code>cluster-enabled='yes'</code> when creating a cluster.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the parameter group to associate with this cluster. If this argument is omitted, the default
     *        parameter group for the specified engine is used. You cannot use any parameter group which has
     *        <code>cluster-enabled='yes'</code> when creating a cluster.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this cluster. If this argument is omitted, the default
     * parameter group for the specified engine is used. You cannot use any parameter group which has
     * <code>cluster-enabled='yes'</code> when creating a cluster.
     * </p>
     * 
     * @return The name of the parameter group to associate with this cluster. If this argument is omitted, the default
     *         parameter group for the specified engine is used. You cannot use any parameter group which has
     *         <code>cluster-enabled='yes'</code> when creating a cluster.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this cluster. If this argument is omitted, the default
     * parameter group for the specified engine is used. You cannot use any parameter group which has
     * <code>cluster-enabled='yes'</code> when creating a cluster.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the parameter group to associate with this cluster. If this argument is omitted, the default
     *        parameter group for the specified engine is used. You cannot use any parameter group which has
     *        <code>cluster-enabled='yes'</code> when creating a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <important>
     * <p>
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you start
     * creating a cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html">Subnets and Subnet
     * Groups</a>.
     * </p>
     * </important>
     * 
     * @param cacheSubnetGroupName
     *        The name of the subnet group to be used for the cluster.</p>
     *        <p>
     *        Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        <important>
     *        <p>
     *        If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you
     *        start creating a cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html">Subnets and Subnet
     *        Groups</a>.
     *        </p>
     */

    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <important>
     * <p>
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you start
     * creating a cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html">Subnets and Subnet
     * Groups</a>.
     * </p>
     * </important>
     * 
     * @return The name of the subnet group to be used for the cluster.</p>
     *         <p>
     *         Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     *         </p>
     *         <important>
     *         <p>
     *         If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you
     *         start creating a cluster. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html">Subnets and Subnet
     *         Groups</a>.
     *         </p>
     */

    public String getCacheSubnetGroupName() {
        return this.cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <important>
     * <p>
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you start
     * creating a cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html">Subnets and Subnet
     * Groups</a>.
     * </p>
     * </important>
     * 
     * @param cacheSubnetGroupName
     *        The name of the subnet group to be used for the cluster.</p>
     *        <p>
     *        Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        <important>
     *        <p>
     *        If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you
     *        start creating a cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.html">Subnets and Subnet
     *        Groups</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        setCacheSubnetGroupName(cacheSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of security group names to associate with this cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @return A list of security group names to associate with this cluster.</p>
     *         <p>
     *         Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud
     *         (Amazon VPC).
     */

    public java.util.List<String> getCacheSecurityGroupNames() {
        if (cacheSecurityGroupNames == null) {
            cacheSecurityGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheSecurityGroupNames;
    }

    /**
     * <p>
     * A list of security group names to associate with this cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of security group names to associate with this cluster.</p>
     *        <p>
     *        Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon
     *        VPC).
     */

    public void setCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
            return;
        }

        this.cacheSecurityGroupNames = new com.amazonaws.internal.SdkInternalList<String>(cacheSecurityGroupNames);
    }

    /**
     * <p>
     * A list of security group names to associate with this cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheSecurityGroupNames(java.util.Collection)} or
     * {@link #withCacheSecurityGroupNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of security group names to associate with this cluster.</p>
     *        <p>
     *        Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon
     *        VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withCacheSecurityGroupNames(String... cacheSecurityGroupNames) {
        if (this.cacheSecurityGroupNames == null) {
            setCacheSecurityGroupNames(new com.amazonaws.internal.SdkInternalList<String>(cacheSecurityGroupNames.length));
        }
        for (String ele : cacheSecurityGroupNames) {
            this.cacheSecurityGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security group names to associate with this cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of security group names to associate with this cluster.</p>
     *        <p>
     *        Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon
     *        VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
        return this;
    }

    /**
     * <p>
     * One or more VPC security groups associated with the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @return One or more VPC security groups associated with the cluster.</p>
     *         <p>
     *         Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more VPC security groups associated with the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param securityGroupIds
     *        One or more VPC security groups associated with the cluster.</p>
     *        <p>
     *        Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * One or more VPC security groups associated with the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more VPC security groups associated with the cluster.</p>
     *        <p>
     *        Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPC security groups associated with the cluster.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param securityGroupIds
     *        One or more VPC security groups associated with the cluster.</p>
     *        <p>
     *        Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource.
     * </p>
     * 
     * @return A list of tags to be added to this resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to this resource.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to be added to this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB
     * snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * 
     * @return A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis
     *         RDB snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The
     *         Amazon S3 object name in the ARN cannot contain any commas.</p> <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     */

    public java.util.List<String> getSnapshotArns() {
        if (snapshotArns == null) {
            snapshotArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return snapshotArns;
    }

    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB
     * snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * 
     * @param snapshotArns
     *        A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB
     *        snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The
     *        Amazon S3 object name in the ARN cannot contain any commas.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     */

    public void setSnapshotArns(java.util.Collection<String> snapshotArns) {
        if (snapshotArns == null) {
            this.snapshotArns = null;
            return;
        }

        this.snapshotArns = new com.amazonaws.internal.SdkInternalList<String>(snapshotArns);
    }

    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB
     * snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotArns(java.util.Collection)} or {@link #withSnapshotArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshotArns
     *        A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB
     *        snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The
     *        Amazon S3 object name in the ARN cannot contain any commas.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withSnapshotArns(String... snapshotArns) {
        if (this.snapshotArns == null) {
            setSnapshotArns(new com.amazonaws.internal.SdkInternalList<String>(snapshotArns.length));
        }
        for (String ele : snapshotArns) {
            this.snapshotArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB
     * snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * 
     * @param snapshotArns
     *        A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB
     *        snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The
     *        Amazon S3 object name in the ARN cannot contain any commas.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Example of an Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withSnapshotArns(java.util.Collection<String> snapshotArns) {
        setSnapshotArns(snapshotArns);
        return this;
    }

    /**
     * <p>
     * The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot status
     * changes to <code>restoring</code> while the new node group (shard) is being created.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param snapshotName
     *        The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot
     *        status changes to <code>restoring</code> while the new node group (shard) is being created.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot status
     * changes to <code>restoring</code> while the new node group (shard) is being created.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @return The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot
     *         status changes to <code>restoring</code> while the new node group (shard) is being created.</p> <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *         </p>
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot status
     * changes to <code>restoring</code> while the new node group (shard) is being created.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param snapshotName
     *        The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot
     *        status changes to <code>restoring</code> while the new node group (shard) is being created.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * Valid values for <code>ddd</code> are:
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a
     *        range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     *        period. Valid values for <code>ddd</code> are:
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * Valid values for <code>ddd</code> are:
     * </p>
     * 
     * @return Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as
     *         a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60
     *         minute period. Valid values for <code>ddd</code> are:
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * Valid values for <code>ddd</code> are:
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a
     *        range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     *        period. Valid values for <code>ddd</code> are:
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The port number on which each of the cache nodes accepts connections.
     * </p>
     * 
     * @param port
     *        The port number on which each of the cache nodes accepts connections.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which each of the cache nodes accepts connections.
     * </p>
     * 
     * @return The port number on which each of the cache nodes accepts connections.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which each of the cache nodes accepts connections.
     * </p>
     * 
     * @param port
     *        The port number on which each of the cache nodes accepts connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are
     * sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cluster owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     *        notifications are sent.</p> <note>
     *        <p>
     *        The Amazon SNS topic owner must be the same as the cluster owner.
     *        </p>
     */

    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are
     * sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cluster owner.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     *         notifications are sent.</p> <note>
     *         <p>
     *         The Amazon SNS topic owner must be the same as the cluster owner.
     *         </p>
     */

    public String getNotificationTopicArn() {
        return this.notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are
     * sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cluster owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     *        notifications are sent.</p> <note>
     *        <p>
     *        The Amazon SNS topic owner must be the same as the cluster owner.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withNotificationTopicArn(String notificationTopicArn) {
        setNotificationTopicArn(notificationTopicArn);
        return this;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        This parameter is currently disabled.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @return This parameter is currently disabled.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        This parameter is currently disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @return This parameter is currently disabled.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you
     * set <code>SnapshotRetentionLimit</code> to 5, a snapshot taken today is retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if
     *        you set <code>SnapshotRetentionLimit</code> to 5, a snapshot taken today is retained for 5 days before
     *        being deleted.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you
     * set <code>SnapshotRetentionLimit</code> to 5, a snapshot taken today is retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * </p>
     * 
     * @return The number of days for which ElastiCache retains automatic snapshots before deleting them. For example,
     *         if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot taken today is retained for 5 days before
     *         being deleted.</p> <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you
     * set <code>SnapshotRetentionLimit</code> to 5, a snapshot taken today is retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if
     *        you set <code>SnapshotRetentionLimit</code> to 5, a snapshot taken today is retained for 5 days before
     *        being deleted.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
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

    public CreateCacheClusterRequest withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * <b>Reserved parameter.</b> The password used to access a password protected server.
     * </p>
     * <p>
     * Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable special
     * characters cannot be used in the AUTH token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="http://redis.io/commands/AUTH">AUTH password</a> at
     * http://redis.io/commands/AUTH.
     * </p>
     * 
     * @param authToken
     *        <b>Reserved parameter.</b> The password used to access a password protected server.</p>
     *        <p>
     *        Password constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be only printable ASCII characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 16 characters and no more than 128 characters in length.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable
     *        special characters cannot be used in the AUTH token.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href="http://redis.io/commands/AUTH">AUTH password</a> at
     *        http://redis.io/commands/AUTH.
     */

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * <p>
     * <b>Reserved parameter.</b> The password used to access a password protected server.
     * </p>
     * <p>
     * Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable special
     * characters cannot be used in the AUTH token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="http://redis.io/commands/AUTH">AUTH password</a> at
     * http://redis.io/commands/AUTH.
     * </p>
     * 
     * @return <b>Reserved parameter.</b> The password used to access a password protected server.</p>
     *         <p>
     *         Password constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be only printable ASCII characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 16 characters and no more than 128 characters in length.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable
     *         special characters cannot be used in the AUTH token.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href="http://redis.io/commands/AUTH">AUTH password</a> at
     *         http://redis.io/commands/AUTH.
     */

    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * <p>
     * <b>Reserved parameter.</b> The password used to access a password protected server.
     * </p>
     * <p>
     * Password constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be only printable ASCII characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 16 characters and no more than 128 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable special
     * characters cannot be used in the AUTH token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="http://redis.io/commands/AUTH">AUTH password</a> at
     * http://redis.io/commands/AUTH.
     * </p>
     * 
     * @param authToken
     *        <b>Reserved parameter.</b> The password used to access a password protected server.</p>
     *        <p>
     *        Password constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be only printable ASCII characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 16 characters and no more than 128 characters in length.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable
     *        special characters cannot be used in the AUTH token.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href="http://redis.io/commands/AUTH">AUTH password</a> at
     *        http://redis.io/commands/AUTH.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withAuthToken(String authToken) {
        setAuthToken(authToken);
        return this;
    }

    /**
     * <p>
     * Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * </p>
     * 
     * @param outpostMode
     *        Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * @see OutpostMode
     */

    public void setOutpostMode(String outpostMode) {
        this.outpostMode = outpostMode;
    }

    /**
     * <p>
     * Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * </p>
     * 
     * @return Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * @see OutpostMode
     */

    public String getOutpostMode() {
        return this.outpostMode;
    }

    /**
     * <p>
     * Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * </p>
     * 
     * @param outpostMode
     *        Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutpostMode
     */

    public CreateCacheClusterRequest withOutpostMode(String outpostMode) {
        setOutpostMode(outpostMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * </p>
     * 
     * @param outpostMode
     *        Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * @see OutpostMode
     */

    public void setOutpostMode(OutpostMode outpostMode) {
        withOutpostMode(outpostMode);
    }

    /**
     * <p>
     * Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * </p>
     * 
     * @param outpostMode
     *        Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutpostMode
     */

    public CreateCacheClusterRequest withOutpostMode(OutpostMode outpostMode) {
        this.outpostMode = outpostMode.toString();
        return this;
    }

    /**
     * <p>
     * The outpost ARN in which the cache cluster is created.
     * </p>
     * 
     * @param preferredOutpostArn
     *        The outpost ARN in which the cache cluster is created.
     */

    public void setPreferredOutpostArn(String preferredOutpostArn) {
        this.preferredOutpostArn = preferredOutpostArn;
    }

    /**
     * <p>
     * The outpost ARN in which the cache cluster is created.
     * </p>
     * 
     * @return The outpost ARN in which the cache cluster is created.
     */

    public String getPreferredOutpostArn() {
        return this.preferredOutpostArn;
    }

    /**
     * <p>
     * The outpost ARN in which the cache cluster is created.
     * </p>
     * 
     * @param preferredOutpostArn
     *        The outpost ARN in which the cache cluster is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withPreferredOutpostArn(String preferredOutpostArn) {
        setPreferredOutpostArn(preferredOutpostArn);
        return this;
    }

    /**
     * <p>
     * The outpost ARNs in which the cache cluster is created.
     * </p>
     * 
     * @return The outpost ARNs in which the cache cluster is created.
     */

    public java.util.List<String> getPreferredOutpostArns() {
        if (preferredOutpostArns == null) {
            preferredOutpostArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return preferredOutpostArns;
    }

    /**
     * <p>
     * The outpost ARNs in which the cache cluster is created.
     * </p>
     * 
     * @param preferredOutpostArns
     *        The outpost ARNs in which the cache cluster is created.
     */

    public void setPreferredOutpostArns(java.util.Collection<String> preferredOutpostArns) {
        if (preferredOutpostArns == null) {
            this.preferredOutpostArns = null;
            return;
        }

        this.preferredOutpostArns = new com.amazonaws.internal.SdkInternalList<String>(preferredOutpostArns);
    }

    /**
     * <p>
     * The outpost ARNs in which the cache cluster is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreferredOutpostArns(java.util.Collection)} or {@link #withPreferredOutpostArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param preferredOutpostArns
     *        The outpost ARNs in which the cache cluster is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withPreferredOutpostArns(String... preferredOutpostArns) {
        if (this.preferredOutpostArns == null) {
            setPreferredOutpostArns(new com.amazonaws.internal.SdkInternalList<String>(preferredOutpostArns.length));
        }
        for (String ele : preferredOutpostArns) {
            this.preferredOutpostArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outpost ARNs in which the cache cluster is created.
     * </p>
     * 
     * @param preferredOutpostArns
     *        The outpost ARNs in which the cache cluster is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withPreferredOutpostArns(java.util.Collection<String> preferredOutpostArns) {
        setPreferredOutpostArns(preferredOutpostArns);
        return this;
    }

    /**
     * <p>
     * Specifies the destination, format and type of the logs.
     * </p>
     * 
     * @return Specifies the destination, format and type of the logs.
     */

    public java.util.List<LogDeliveryConfigurationRequest> getLogDeliveryConfigurations() {
        if (logDeliveryConfigurations == null) {
            logDeliveryConfigurations = new com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest>();
        }
        return logDeliveryConfigurations;
    }

    /**
     * <p>
     * Specifies the destination, format and type of the logs.
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        Specifies the destination, format and type of the logs.
     */

    public void setLogDeliveryConfigurations(java.util.Collection<LogDeliveryConfigurationRequest> logDeliveryConfigurations) {
        if (logDeliveryConfigurations == null) {
            this.logDeliveryConfigurations = null;
            return;
        }

        this.logDeliveryConfigurations = new com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest>(logDeliveryConfigurations);
    }

    /**
     * <p>
     * Specifies the destination, format and type of the logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogDeliveryConfigurations(java.util.Collection)} or
     * {@link #withLogDeliveryConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        Specifies the destination, format and type of the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withLogDeliveryConfigurations(LogDeliveryConfigurationRequest... logDeliveryConfigurations) {
        if (this.logDeliveryConfigurations == null) {
            setLogDeliveryConfigurations(new com.amazonaws.internal.SdkInternalList<LogDeliveryConfigurationRequest>(logDeliveryConfigurations.length));
        }
        for (LogDeliveryConfigurationRequest ele : logDeliveryConfigurations) {
            this.logDeliveryConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the destination, format and type of the logs.
     * </p>
     * 
     * @param logDeliveryConfigurations
     *        Specifies the destination, format and type of the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheClusterRequest withLogDeliveryConfigurations(java.util.Collection<LogDeliveryConfigurationRequest> logDeliveryConfigurations) {
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getAZMode() != null)
            sb.append("AZMode: ").append(getAZMode()).append(",");
        if (getPreferredAvailabilityZone() != null)
            sb.append("PreferredAvailabilityZone: ").append(getPreferredAvailabilityZone()).append(",");
        if (getPreferredAvailabilityZones() != null)
            sb.append("PreferredAvailabilityZones: ").append(getPreferredAvailabilityZones()).append(",");
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: ").append(getNumCacheNodes()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: ").append(getCacheParameterGroupName()).append(",");
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: ").append(getCacheSubnetGroupName()).append(",");
        if (getCacheSecurityGroupNames() != null)
            sb.append("CacheSecurityGroupNames: ").append(getCacheSecurityGroupNames()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSnapshotArns() != null)
            sb.append("SnapshotArns: ").append(getSnapshotArns()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getNotificationTopicArn() != null)
            sb.append("NotificationTopicArn: ").append(getNotificationTopicArn()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getAuthToken() != null)
            sb.append("AuthToken: ").append(getAuthToken()).append(",");
        if (getOutpostMode() != null)
            sb.append("OutpostMode: ").append(getOutpostMode()).append(",");
        if (getPreferredOutpostArn() != null)
            sb.append("PreferredOutpostArn: ").append(getPreferredOutpostArn()).append(",");
        if (getPreferredOutpostArns() != null)
            sb.append("PreferredOutpostArns: ").append(getPreferredOutpostArns()).append(",");
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

        if (obj instanceof CreateCacheClusterRequest == false)
            return false;
        CreateCacheClusterRequest other = (CreateCacheClusterRequest) obj;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getAZMode() == null ^ this.getAZMode() == null)
            return false;
        if (other.getAZMode() != null && other.getAZMode().equals(this.getAZMode()) == false)
            return false;
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null)
            return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false)
            return false;
        if (other.getPreferredAvailabilityZones() == null ^ this.getPreferredAvailabilityZones() == null)
            return false;
        if (other.getPreferredAvailabilityZones() != null && other.getPreferredAvailabilityZones().equals(this.getPreferredAvailabilityZones()) == false)
            return false;
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null)
            return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getCacheSecurityGroupNames() == null ^ this.getCacheSecurityGroupNames() == null)
            return false;
        if (other.getCacheSecurityGroupNames() != null && other.getCacheSecurityGroupNames().equals(this.getCacheSecurityGroupNames()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSnapshotArns() == null ^ this.getSnapshotArns() == null)
            return false;
        if (other.getSnapshotArns() != null && other.getSnapshotArns().equals(this.getSnapshotArns()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null)
            return false;
        if (other.getNotificationTopicArn() != null && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getAuthToken() == null ^ this.getAuthToken() == null)
            return false;
        if (other.getAuthToken() != null && other.getAuthToken().equals(this.getAuthToken()) == false)
            return false;
        if (other.getOutpostMode() == null ^ this.getOutpostMode() == null)
            return false;
        if (other.getOutpostMode() != null && other.getOutpostMode().equals(this.getOutpostMode()) == false)
            return false;
        if (other.getPreferredOutpostArn() == null ^ this.getPreferredOutpostArn() == null)
            return false;
        if (other.getPreferredOutpostArn() != null && other.getPreferredOutpostArn().equals(this.getPreferredOutpostArn()) == false)
            return false;
        if (other.getPreferredOutpostArns() == null ^ this.getPreferredOutpostArns() == null)
            return false;
        if (other.getPreferredOutpostArns() != null && other.getPreferredOutpostArns().equals(this.getPreferredOutpostArns()) == false)
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

        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getAZMode() == null) ? 0 : getAZMode().hashCode());
        hashCode = prime * hashCode + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getPreferredAvailabilityZones() == null) ? 0 : getPreferredAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArns() == null) ? 0 : getSnapshotArns().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode + ((getAuthToken() == null) ? 0 : getAuthToken().hashCode());
        hashCode = prime * hashCode + ((getOutpostMode() == null) ? 0 : getOutpostMode().hashCode());
        hashCode = prime * hashCode + ((getPreferredOutpostArn() == null) ? 0 : getPreferredOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getPreferredOutpostArns() == null) ? 0 : getPreferredOutpostArns().hashCode());
        hashCode = prime * hashCode + ((getLogDeliveryConfigurations() == null) ? 0 : getLogDeliveryConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public CreateCacheClusterRequest clone() {
        return (CreateCacheClusterRequest) super.clone();
    }

}
