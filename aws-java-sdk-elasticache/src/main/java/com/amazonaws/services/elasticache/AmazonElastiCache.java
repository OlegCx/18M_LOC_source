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
package com.amazonaws.services.elasticache;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters;

/**
 * Interface for accessing Amazon ElastiCache.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticache.AbstractAmazonElastiCache} instead.
 * </p>
 * <p>
 * <fullname>Amazon ElastiCache</fullname>
 * <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the
 * cloud.
 * </p>
 * <p>
 * With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the
 * administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and
 * cluster failure handling much simpler than in a self-managed cache deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance
 * statistics associated with their cache and can receive alarms if a part of their cache runs hot.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElastiCache {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "elasticache";

    /**
     * Overrides the default endpoint for this client ("elasticache.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticache.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "elasticache.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "elasticache.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "elasticache.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonElastiCache#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track
     * all your ElastiCache resources, with the exception of global replication group. When you add or remove tags on
     * replication groups, those actions will be replicated to all nodes in the replication group. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.ResourceLevelPermissions.html">Resource
     * -level permissions</a>.
     * </p>
     * <p>
     * For example, you can use cost-allocation tags to your ElastiCache resources, AWS generates a cost allocation
     * report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply
     * tags that represent business categories (such as cost centers, application names, or owners) to organize your
     * costs across multiple services.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html">Using Cost Allocation Tags in
     * Amazon ElastiCache</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input of an AddTagsToResource operation.
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AmazonElastiCache.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AddTagsToResource" target="_top">AWS
     *      API Documentation</a>
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2,
     * and Amazon EC2 security groups are used as the authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another
     * region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest
     *        Represents the input of an AuthorizeCacheSecurityGroupIngress operation.
     * @return Result of the AuthorizeCacheSecurityGroupIngress operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws AuthorizationAlreadyExistsException
     *         The specified Amazon EC2 security group is already authorized for the specified cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.AuthorizeCacheSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AuthorizeCacheSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    CacheSecurityGroup authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest);

    /**
     * <p>
     * Apply the service update. For more information on service updates and applying them, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/applying-updates.html">Applying Service
     * Updates</a>.
     * </p>
     * 
     * @param batchApplyUpdateActionRequest
     * @return Result of the BatchApplyUpdateAction operation returned by the service.
     * @throws ServiceUpdateNotFoundException
     *         The service update doesn't exist
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.BatchApplyUpdateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/BatchApplyUpdateAction"
     *      target="_top">AWS API Documentation</a>
     */
    BatchApplyUpdateActionResult batchApplyUpdateAction(BatchApplyUpdateActionRequest batchApplyUpdateActionRequest);

    /**
     * <p>
     * Stop the service update. For more information on service updates and stopping them, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/stopping-self-service-updates.html">Stopping
     * Service Updates</a>.
     * </p>
     * 
     * @param batchStopUpdateActionRequest
     * @return Result of the BatchStopUpdateAction operation returned by the service.
     * @throws ServiceUpdateNotFoundException
     *         The service update doesn't exist
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.BatchStopUpdateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/BatchStopUpdateAction"
     *      target="_top">AWS API Documentation</a>
     */
    BatchStopUpdateActionResult batchStopUpdateAction(BatchStopUpdateActionRequest batchStopUpdateActionRequest);

    /**
     * <p>
     * Complete the migration of data.
     * </p>
     * 
     * @param completeMigrationRequest
     * @return Result of the CompleteMigration operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupNotUnderMigrationException
     *         The designated replication group is not available for data migration.
     * @sample AmazonElastiCache.CompleteMigration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CompleteMigration" target="_top">AWS
     *      API Documentation</a>
     */
    ReplicationGroup completeMigration(CompleteMigrationRequest completeMigrationRequest);

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note> <important>
     * <p>
     * Users or groups that have permissions to use the <code>CopySnapshot</code> operation can create their own Amazon
     * S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has
     * the ability to use the <code>CopySnapshot</code> operation. For more information about using IAM to control the
     * use of ElastiCache operations, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html">Exporting Snapshots</a>
     * and <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.html">Authentication &amp; Access
     * Control</a>.
     * </p>
     * </important>
     * <p>
     * You could receive the following error messages.
     * </p>
     * <p class="title">
     * <b>Error Messages</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is outside of the region.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s does not exist.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is not owned by the authenticated user.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient permissions to perform the desired
     * activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s already contains an object with key %s.
     * </p>
     * <p>
     * <b>Solution:</b> Give the <code>TargetSnapshotName</code> a new and unique value. If exporting a snapshot, you
     * could alternatively create a new Amazon S3 bucket and use this same value for <code>TargetSnapshotName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add List and Read permissions on the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add Upload/Delete permissions on the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add View Permissions on the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest
     *        Represents the input of a <code>CopySnapshotMessage</code> operation.
     * @return Result of the CopySnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidSnapshotStateException
     *         The current state of the snapshot does not allow the requested operation to occur.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    Snapshot copySnapshot(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either
     * Memcached or Redis.
     * </p>
     * <p>
     * This operation is not supported for Redis (cluster mode enabled) clusters.
     * </p>
     * 
     * @param createCacheClusterRequest
     *        Represents the input of a CreateCacheCluster operation.
     * @return Result of the CreateCacheCluster operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws CacheClusterAlreadyExistsException
     *         You already have a cluster with the given identifier.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of clusters per customer.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    CacheCluster createCacheCluster(CreateCacheClusterRequest createCacheClusterRequest);

    /**
     * <p>
     * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of
     * parameters and their values that are applied to all of the nodes in any cluster or replication group using the
     * CacheParameterGroup.
     * </p>
     * <p>
     * A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the
     * CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of
     * specific parameters. For more information, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheParameterGroup.html">
     * ModifyCacheParameterGroup</a> in the ElastiCache API Reference.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.html">Parameters and
     * Parameter Groups</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCacheParameterGroupRequest
     *        Represents the input of a <code>CreateCacheParameterGroup</code> operation.
     * @return Result of the CreateCacheParameterGroup operation returned by the service.
     * @throws CacheParameterGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of cache security groups.
     * @throws CacheParameterGroupAlreadyExistsException
     *         A cache parameter group with the requested name already exists.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CacheParameterGroup createCacheParameterGroup(CreateCacheParameterGroupRequest createCacheParameterGroupRequest);

    /**
     * <p>
     * Creates a new cache security group. Use a cache security group to control access to one or more clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud
     * (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest
     *        Represents the input of a <code>CreateCacheSecurityGroup</code> operation.
     * @return Result of the CreateCacheSecurityGroup operation returned by the service.
     * @throws CacheSecurityGroupAlreadyExistsException
     *         A cache security group with the specified name already exists.
     * @throws CacheSecurityGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache security groups.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CacheSecurityGroup createCacheSecurityGroup(CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest);

    /**
     * <p>
     * Creates a new cache subnet group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest
     *        Represents the input of a <code>CreateCacheSubnetGroup</code> operation.
     * @return Result of the CreateCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupAlreadyExistsException
     *         The requested cache subnet group name is already in use by an existing cache subnet group.
     * @throws CacheSubnetGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache subnet groups.
     * @throws CacheSubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a cache subnet
     *         group.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @throws SubnetNotAllowedException
     *         At least one subnet ID does not match the other subnet IDs. This mismatch typically occurs when a user
     *         sets one subnet ID to a regional Availability Zone and a different one to an outpost. Or when a user sets
     *         the subnet ID to an Outpost when not subscribed on this service.
     * @sample AmazonElastiCache.CreateCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CacheSubnetGroup createCacheSubnetGroup(CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest);

    /**
     * <p>
     * Global Datastore for Redis offers fully managed, fast, reliable and secure cross-region replication. Using Global
     * Datastore for Redis, you can create cross-region read replica clusters for ElastiCache for Redis to enable
     * low-latency reads and disaster recovery across regions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Redis-Global-Datastore.html">Replication Across
     * Regions Using Global Datastore</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <b>GlobalReplicationGroupIdSuffix</b> is the name of the Global datastore.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <b>PrimaryReplicationGroupId</b> represents the name of the primary cluster that accepts writes and will
     * replicate updates to the secondary cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGlobalReplicationGroupRequest
     * @return Result of the CreateGlobalReplicationGroup operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws GlobalReplicationGroupAlreadyExistsException
     *         The Global datastore name already exists.
     * @throws ServiceLinkedRoleNotFoundException
     *         The specified service linked role (SLR) was not found.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.CreateGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GlobalReplicationGroup createGlobalReplicationGroup(CreateGlobalReplicationGroupRequest createGlobalReplicationGroupRequest);

    /**
     * <p>
     * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group.
     * </p>
     * <p>
     * This API can be used to create a standalone regional replication group or a secondary replication group
     * associated with a Global datastore.
     * </p>
     * <p>
     * A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a
     * read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to
     * the replicas.
     * </p>
     * <p>
     * A Redis cluster-mode enabled cluster is comprised of from 1 to 90 shards (API/CLI: node groups). Each shard has a
     * primary node and up to 5 read-only replica nodes. The configuration can range from 90 shards and 0 replicas to 15
     * shards and 5 replicas, which is the maximum number or replicas allowed.
     * </p>
     * <p>
     * The node or shard limit can be increased to a maximum of 500 per cluster if the Redis engine version is 5.0.6 or
     * higher. For example, you can choose to configure a 500 node cluster that ranges between 83 shards (one primary
     * and 5 replicas per shard) and 500 shards (single primary and no replicas). Make sure there are enough available
     * IP addresses to accommodate the increase. Common pitfalls include the subnets in the subnet group have too small
     * a CIDR range or the subnets are shared and heavily used by other clusters. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.Creating.html">Creating a Subnet
     * Group</a>. For versions below 5.0.6, the limit is 250 per cluster.
     * </p>
     * <p>
     * To request a limit increase, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> and choose
     * the limit type <b>Nodes per cluster per instance type</b>.
     * </p>
     * <p>
     * When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more
     * read replicas to it, up to a total of 5 read replicas. If you need to increase or decrease the number of node
     * groups (console: shards), you can avail yourself of ElastiCache for Redis' scaling. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Scaling.html">Scaling ElastiCache for Redis
     * Clusters</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest
     *        Represents the input of a <code>CreateReplicationGroup</code> operation.
     * @return Result of the CreateReplicationGroup operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws ReplicationGroupAlreadyExistsException
     *         The specified replication group already exists.
     * @throws InvalidUserGroupStateException
     *         The user group is not in an active state.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of clusters per customer.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum allowed number of node groups
     *         (shards) in a single replication group. The default maximum is 90
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ReplicationGroup createReplicationGroup(CreateReplicationGroupRequest createReplicationGroupRequest);

    /**
     * <p>
     * Creates a copy of an entire cluster or replication group at a specific moment in time.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Represents the input of a <code>CreateSnapshot</code> operation.
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    Snapshot createSnapshot(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * For Redis engine version 6.x onwards: Creates a Redis user. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html">Using Role Based Access
     * Control (RBAC)</a>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws UserAlreadyExistsException
     *         A user with this ID already exists.
     * @throws UserQuotaExceededException
     *         The quota of users has been exceeded.
     * @throws DuplicateUserNameException
     *         A user with this username already exists.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @sample AmazonElastiCache.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * For Redis engine version 6.x onwards: Creates a Redis user group. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html">Using Role Based Access
     * Control (RBAC)</a>
     * </p>
     * 
     * @param createUserGroupRequest
     * @return Result of the CreateUserGroup operation returned by the service.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws DuplicateUserNameException
     *         A user with this username already exists.
     * @throws UserGroupAlreadyExistsException
     *         The user group with this ID already exists.
     * @throws DefaultUserRequiredException
     *         You must add default user to a user group.
     * @throws UserGroupQuotaExceededException
     *         The number of users exceeds the user group limit.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @sample AmazonElastiCache.CreateUserGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateUserGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateUserGroupResult createUserGroup(CreateUserGroupRequest createUserGroupRequest);

    /**
     * <p>
     * Decreases the number of node groups in a Global datastore
     * </p>
     * 
     * @param decreaseNodeGroupsInGlobalReplicationGroupRequest
     * @return Result of the DecreaseNodeGroupsInGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DecreaseNodeGroupsInGlobalReplicationGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DecreaseNodeGroupsInGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GlobalReplicationGroup decreaseNodeGroupsInGlobalReplicationGroup(
            DecreaseNodeGroupsInGlobalReplicationGroupRequest decreaseNodeGroupsInGlobalReplicationGroupRequest);

    /**
     * <p>
     * Dynamically decreases the number of replicas in a Redis (cluster mode disabled) replication group or the number
     * of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
     * operation is performed with no cluster down time.
     * </p>
     * 
     * @param decreaseReplicaCountRequest
     * @return Result of the DecreaseReplicaCount operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of clusters per customer.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum allowed number of node groups
     *         (shards) in a single replication group. The default maximum is 90
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws ServiceLinkedRoleNotFoundException
     *         The specified service linked role (SLR) was not found.
     * @throws NoOperationException
     *         The operation was not performed because no changes were required.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DecreaseReplicaCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DecreaseReplicaCount"
     *      target="_top">AWS API Documentation</a>
     */
    ReplicationGroup decreaseReplicaCount(DecreaseReplicaCountRequest decreaseReplicaCountRequest);

    /**
     * <p>
     * Deletes a previously provisioned cluster. <code>DeleteCacheCluster</code> deletes all associated cache nodes,
     * node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation.
     * </p>
     * <p>
     * This operation is not valid for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode enabled) clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled) clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is the last read replica of a replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is the primary node of a replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A node group (shard) that has Multi-AZ mode enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster from a Redis (cluster mode enabled) replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is not in the <code>available</code> state
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteCacheClusterRequest
     *        Represents the input of a <code>DeleteCacheCluster</code> operation.
     * @return Result of the DeleteCacheCluster operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    CacheCluster deleteCacheCluster(DeleteCacheClusterRequest deleteCacheClusterRequest);

    /**
     * <p>
     * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with
     * any cache clusters. You cannot delete the default cache parameter groups in your account.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest
     *        Represents the input of a <code>DeleteCacheParameterGroup</code> operation.
     * @return Result of the DeleteCacheParameterGroup operation returned by the service.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCacheParameterGroupResult deleteCacheParameterGroup(DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest);

    /**
     * <p>
     * Deletes a cache security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest
     *        Represents the input of a <code>DeleteCacheSecurityGroup</code> operation.
     * @return Result of the DeleteCacheSecurityGroup operation returned by the service.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCacheSecurityGroupResult deleteCacheSecurityGroup(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest);

    /**
     * <p>
     * Deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a default cache subnet group or one that is associated with any clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest
     *        Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.
     * @return Result of the DeleteCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupInUseException
     *         The requested cache subnet group is currently in use.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @sample AmazonElastiCache.DeleteCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCacheSubnetGroupResult deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest);

    /**
     * <p>
     * Deleting a Global datastore is a two-step process:
     * </p>
     * <ul>
     * <li>
     * <p>
     * First, you must <a>DisassociateGlobalReplicationGroup</a> to remove the secondary clusters in the Global
     * datastore.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once the Global datastore contains only the primary cluster, you can use the
     * <code>DeleteGlobalReplicationGroup</code> API to delete the Global datastore while retainining the primary
     * cluster using <code>RetainPrimaryReplicationGroup=true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Since the Global Datastore has only a primary cluster, you can delete the Global Datastore while retaining the
     * primary by setting <code>RetainPrimaryReplicationGroup=true</code>. The primary cluster is never deleted when
     * deleting a Global Datastore. It can only be deleted when it no longer is associated with any Global Datastore.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
     * selected resources; you cannot cancel or revert this operation.
     * </p>
     * 
     * @param deleteGlobalReplicationGroupRequest
     * @return Result of the DeleteGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.DeleteGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GlobalReplicationGroup deleteGlobalReplicationGroup(DeleteGlobalReplicationGroupRequest deleteGlobalReplicationGroupRequest);

    /**
     * <p>
     * Deletes an existing replication group. By default, this operation deletes the entire replication group, including
     * the primary/primaries and all of the read replicas. If the replication group has only one primary, you can
     * optionally delete only the read replicas, while retaining the primary by setting
     * <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
     * selected resources; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteReplicationGroupRequest
     *        Represents the input of a <code>DeleteReplicationGroup</code> operation.
     * @return Result of the DeleteReplicationGroup operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ReplicationGroup deleteReplicationGroup(DeleteReplicationGroupRequest deleteReplicationGroupRequest);

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotRequest
     *        Represents the input of a <code>DeleteSnapshot</code> operation.
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws InvalidSnapshotStateException
     *         The current state of the snapshot does not allow the requested operation to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    Snapshot deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * For Redis engine version 6.x onwards: Deletes a user. The user will be removed from all user groups and in turn
     * removed from all replication groups. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html">Using Role Based Access
     * Control (RBAC)</a>.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws InvalidUserStateException
     *         The user is not in active state.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws DefaultUserAssociatedToUserGroupException
     * @sample AmazonElastiCache.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * For Redis engine version 6.x onwards: Deletes a user group. The user group must first be disassociated from the
     * replication group before it can be deleted. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html">Using Role Based Access
     * Control (RBAC)</a>.
     * </p>
     * 
     * @param deleteUserGroupRequest
     * @return Result of the DeleteUserGroup operation returned by the service.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidUserGroupStateException
     *         The user group is not in an active state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.DeleteUserGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteUserGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteUserGroupResult deleteUserGroup(DeleteUserGroupRequest deleteUserGroupRequest);

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
     * cache cluster if a cluster identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the clusters is returned. You can use the optional
     * <i>ShowCacheNodeInfo</i> flag to retrieve detailed information about the cache nodes associated with the
     * clusters. These details include the DNS address and port for the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the <i>creating</i> state, only cluster-level information is displayed until all of the
     * nodes are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the <i>deleting</i> state, only cluster-level information is displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cluster, node endpoint information and creation time for the
     * additional nodes are not displayed until they are completely provisioned. When the cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is
     * displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest
     *        Represents the input of a <code>DescribeCacheClusters</code> operation.
     * @return Result of the DescribeCacheClusters operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheClusters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCacheClustersResult describeCacheClusters(DescribeCacheClustersRequest describeCacheClustersRequest);

    /**
     * Simplified method form for invoking the DescribeCacheClusters operation.
     *
     * @see #describeCacheClusters(DescribeCacheClustersRequest)
     */
    DescribeCacheClustersResult describeCacheClusters();

    /**
     * <p>
     * Returns a list of the available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest
     *        Represents the input of a <code>DescribeCacheEngineVersions</code> operation.
     * @return Result of the DescribeCacheEngineVersions operation returned by the service.
     * @sample AmazonElastiCache.DescribeCacheEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCacheEngineVersionsResult describeCacheEngineVersions(DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest);

    /**
     * Simplified method form for invoking the DescribeCacheEngineVersions operation.
     *
     * @see #describeCacheEngineVersions(DescribeCacheEngineVersionsRequest)
     */
    DescribeCacheEngineVersionsResult describeCacheEngineVersions();

    /**
     * <p>
     * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list
     * contains only the descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest
     *        Represents the input of a <code>DescribeCacheParameterGroups</code> operation.
     * @return Result of the DescribeCacheParameterGroups operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCacheParameterGroupsResult describeCacheParameterGroups(DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeCacheParameterGroups operation.
     *
     * @see #describeCacheParameterGroups(DescribeCacheParameterGroupsRequest)
     */
    DescribeCacheParameterGroupsResult describeCacheParameterGroups();

    /**
     * <p>
     * Returns the detailed parameter list for a particular cache parameter group.
     * </p>
     * 
     * @param describeCacheParametersRequest
     *        Represents the input of a <code>DescribeCacheParameters</code> operation.
     * @return Result of the DescribeCacheParameters operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCacheParametersResult describeCacheParameters(DescribeCacheParametersRequest describeCacheParametersRequest);

    /**
     * <p>
     * Returns a list of cache security group descriptions. If a cache security group name is specified, the list
     * contains only the description of that group. This applicable only when you have ElastiCache in Classic setup
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest
     *        Represents the input of a <code>DescribeCacheSecurityGroups</code> operation.
     * @return Result of the DescribeCacheSecurityGroups operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeCacheSecurityGroups operation.
     *
     * @see #describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest)
     */
    DescribeCacheSecurityGroupsResult describeCacheSecurityGroups();

    /**
     * <p>
     * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only
     * the description of that group. This is applicable only when you have ElastiCache in VPC setup. All ElastiCache
     * clusters now launch in VPC by default.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest
     *        Represents the input of a <code>DescribeCacheSubnetGroups</code> operation.
     * @return Result of the DescribeCacheSubnetGroups operation returned by the service.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @sample AmazonElastiCache.DescribeCacheSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeCacheSubnetGroups operation.
     *
     * @see #describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest)
     */
    DescribeCacheSubnetGroupsResult describeCacheSubnetGroups();

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     *        Represents the input of a <code>DescribeEngineDefaultParameters</code> operation.
     * @return Result of the DescribeEngineDefaultParameters operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest);

    /**
     * <p>
     * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events
     * specific to a particular cluster, cache security group, or cache parameter group by providing the name as a
     * parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input of a <code>DescribeEvents</code> operation.
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEvents(DescribeEventsRequest)
     */
    DescribeEventsResult describeEvents();

    /**
     * <p>
     * Returns information about a particular global replication group. If no identifier is specified, returns
     * information about all Global datastores.
     * </p>
     * 
     * @param describeGlobalReplicationGroupsRequest
     * @return Result of the DescribeGlobalReplicationGroups operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeGlobalReplicationGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeGlobalReplicationGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGlobalReplicationGroupsResult describeGlobalReplicationGroups(DescribeGlobalReplicationGroupsRequest describeGlobalReplicationGroupsRequest);

    /**
     * <p>
     * Returns information about a particular replication group. If no identifier is specified,
     * <code>DescribeReplicationGroups</code> returns information about all replication groups.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeReplicationGroupsRequest
     *        Represents the input of a <code>DescribeReplicationGroups</code> operation.
     * @return Result of the DescribeReplicationGroups operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReplicationGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReplicationGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReplicationGroupsResult describeReplicationGroups(DescribeReplicationGroupsRequest describeReplicationGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeReplicationGroups operation.
     *
     * @see #describeReplicationGroups(DescribeReplicationGroupsRequest)
     */
    DescribeReplicationGroupsResult describeReplicationGroups();

    /**
     * <p>
     * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest
     *        Represents the input of a <code>DescribeReservedCacheNodes</code> operation.
     * @return Result of the DescribeReservedCacheNodes operation returned by the service.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReservedCacheNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedCacheNodesResult describeReservedCacheNodes(DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest);

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodes operation.
     *
     * @see #describeReservedCacheNodes(DescribeReservedCacheNodesRequest)
     */
    DescribeReservedCacheNodesResult describeReservedCacheNodes();

    /**
     * <p>
     * Lists available reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest
     *        Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.
     * @return Result of the DescribeReservedCacheNodesOfferings operation returned by the service.
     * @throws ReservedCacheNodesOfferingNotFoundException
     *         The requested cache node offering does not exist.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReservedCacheNodesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodesOfferings operation.
     *
     * @see #describeReservedCacheNodesOfferings(DescribeReservedCacheNodesOfferingsRequest)
     */
    DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings();

    /**
     * <p>
     * Returns details of the service updates
     * </p>
     * 
     * @param describeServiceUpdatesRequest
     * @return Result of the DescribeServiceUpdates operation returned by the service.
     * @throws ServiceUpdateNotFoundException
     *         The service update doesn't exist
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeServiceUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeServiceUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest describeServiceUpdatesRequest);

    /**
     * <p>
     * Returns information about cluster or replication group snapshots. By default, <code>DescribeSnapshots</code>
     * lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with
     * a particular cache cluster.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeSnapshotsRequest
     *        Represents the input of a <code>DescribeSnapshotsMessage</code> operation.
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshots(DescribeSnapshotsRequest)
     */
    DescribeSnapshotsResult describeSnapshots();

    /**
     * <p>
     * Returns details of the update actions
     * </p>
     * 
     * @param describeUpdateActionsRequest
     * @return Result of the DescribeUpdateActions operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeUpdateActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUpdateActions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUpdateActionsResult describeUpdateActions(DescribeUpdateActionsRequest describeUpdateActionsRequest);

    /**
     * <p>
     * Returns a list of user groups.
     * </p>
     * 
     * @param describeUserGroupsRequest
     * @return Result of the DescribeUserGroups operation returned by the service.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeUserGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUserGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeUserGroupsResult describeUserGroups(DescribeUserGroupsRequest describeUserGroupsRequest);

    /**
     * <p>
     * Returns a list of users.
     * </p>
     * 
     * @param describeUsersRequest
     * @return Result of the DescribeUsers operation returned by the service.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUsersResult describeUsers(DescribeUsersRequest describeUsersRequest);

    /**
     * <p>
     * Remove a secondary cluster from the Global datastore using the Global datastore name. The secondary cluster will
     * no longer receive updates from the primary cluster, but will remain as a standalone cluster in that AWS region.
     * </p>
     * 
     * @param disassociateGlobalReplicationGroupRequest
     * @return Result of the DisassociateGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DisassociateGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DisassociateGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GlobalReplicationGroup disassociateGlobalReplicationGroup(DisassociateGlobalReplicationGroupRequest disassociateGlobalReplicationGroupRequest);

    /**
     * <p>
     * Used to failover the primary region to a selected secondary region. The selected secondary region will become
     * primary, and all other clusters will become secondary.
     * </p>
     * 
     * @param failoverGlobalReplicationGroupRequest
     * @return Result of the FailoverGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.FailoverGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/FailoverGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GlobalReplicationGroup failoverGlobalReplicationGroup(FailoverGlobalReplicationGroupRequest failoverGlobalReplicationGroupRequest);

    /**
     * <p>
     * Increase the number of node groups in the Global datastore
     * </p>
     * 
     * @param increaseNodeGroupsInGlobalReplicationGroupRequest
     * @return Result of the IncreaseNodeGroupsInGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.IncreaseNodeGroupsInGlobalReplicationGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/IncreaseNodeGroupsInGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GlobalReplicationGroup increaseNodeGroupsInGlobalReplicationGroup(
            IncreaseNodeGroupsInGlobalReplicationGroupRequest increaseNodeGroupsInGlobalReplicationGroupRequest);

    /**
     * <p>
     * Dynamically increases the number of replicas in a Redis (cluster mode disabled) replication group or the number
     * of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This
     * operation is performed with no cluster down time.
     * </p>
     * 
     * @param increaseReplicaCountRequest
     * @return Result of the IncreaseReplicaCount operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of clusters per customer.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum allowed number of node groups
     *         (shards) in a single replication group. The default maximum is 90
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws NoOperationException
     *         The operation was not performed because no changes were required.
     * @throws InvalidKMSKeyException
     *         The KMS key supplied is not valid.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.IncreaseReplicaCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/IncreaseReplicaCount"
     *      target="_top">AWS API Documentation</a>
     */
    ReplicationGroup increaseReplicaCount(IncreaseReplicaCountRequest increaseReplicaCountRequest);

    /**
     * <p>
     * Lists all available node types that you can scale your Redis cluster's or replication group's current node type.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code> operations to scale your
     * cluster or replication group, the value of the <code>CacheNodeType</code> parameter must be one of the node types
     * returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest
     *        The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.
     * @return Result of the ListAllowedNodeTypeModifications operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.ListAllowedNodeTypeModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListAllowedNodeTypeModifications"
     *      target="_top">AWS API Documentation</a>
     */
    ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications(ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest);

    /**
     * Simplified method form for invoking the ListAllowedNodeTypeModifications operation.
     *
     * @see #listAllowedNodeTypeModifications(ListAllowedNodeTypeModificationsRequest)
     */
    ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications();

    /**
     * <p>
     * Lists all tags currently on a named resource.
     * </p>
     * <p>
     * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track
     * all your ElastiCache resources, with the exception of global replication group. When you add or remove tags on
     * replication groups, those actions will be replicated to all nodes in the replication group. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.ResourceLevelPermissions.html">Resource
     * -level permissions</a>.
     * </p>
     * <p>
     * If the cluster is not in the <i>available</i> state, <code>ListTagsForResource</code> returns an error.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The input parameters for the <code>ListTagsForResource</code> operation.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AmazonElastiCache.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest
     *        Represents the input of a <code>ModifyCacheCluster</code> operation.
     * @return Result of the ModifyCacheCluster operation returned by the service.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    CacheCluster modifyCacheCluster(ModifyCacheClusterRequest modifyCacheClusterRequest);

    /**
     * <p>
     * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest
     *        Represents the input of a <code>ModifyCacheParameterGroup</code> operation.
     * @return Result of the ModifyCacheParameterGroup operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @sample AmazonElastiCache.ModifyCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyCacheParameterGroupResult modifyCacheParameterGroup(ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest);

    /**
     * <p>
     * Modifies an existing cache subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest
     *        Represents the input of a <code>ModifyCacheSubnetGroup</code> operation.
     * @return Result of the ModifyCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws CacheSubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a cache subnet
     *         group.
     * @throws SubnetInUseException
     *         The requested subnet is being used by another cache subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @throws SubnetNotAllowedException
     *         At least one subnet ID does not match the other subnet IDs. This mismatch typically occurs when a user
     *         sets one subnet ID to a regional Availability Zone and a different one to an outpost. Or when a user sets
     *         the subnet ID to an Outpost when not subscribed on this service.
     * @sample AmazonElastiCache.ModifyCacheSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest);

    /**
     * <p>
     * Modifies the settings for a Global datastore.
     * </p>
     * 
     * @param modifyGlobalReplicationGroupRequest
     * @return Result of the ModifyGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.ModifyGlobalReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GlobalReplicationGroup modifyGlobalReplicationGroup(ModifyGlobalReplicationGroupRequest modifyGlobalReplicationGroupRequest);

    /**
     * <p>
     * Modifies the settings for a replication group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html">
     * Scaling for Amazon ElastiCache for Redis (cluster mode enabled)</a> in the ElastiCache User Guide
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroupShardConfiguration.html"
     * >ModifyReplicationGroupShardConfiguration</a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param modifyReplicationGroupRequest
     *        Represents the input of a <code>ModifyReplicationGroups</code> operation.
     * @return Result of the ModifyReplicationGroup operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidUserGroupStateException
     *         The user group is not in an active state.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InvalidKMSKeyException
     *         The KMS key supplied is not valid.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyReplicationGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ReplicationGroup modifyReplicationGroup(ModifyReplicationGroupRequest modifyReplicationGroupRequest);

    /**
     * <p>
     * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance
     * the keyspaces among existing shards.
     * </p>
     * 
     * @param modifyReplicationGroupShardConfigurationRequest
     *        Represents the input for a <code>ModifyReplicationGroupShardConfiguration</code> operation.
     * @return Result of the ModifyReplicationGroupShardConfiguration operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ErrorMessages.html#ErrorMessages.INSUFFICIENT_CACHE_CLUSTER_CAPACITY"
     *         >InsufficientCacheClusterCapacity</a> in the ElastiCache User Guide.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum allowed number of node groups
     *         (shards) in a single replication group. The default maximum is 90
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws InvalidKMSKeyException
     *         The KMS key supplied is not valid.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyReplicationGroupShardConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroupShardConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ReplicationGroup modifyReplicationGroupShardConfiguration(ModifyReplicationGroupShardConfigurationRequest modifyReplicationGroupShardConfigurationRequest);

    /**
     * <p>
     * Changes user password(s) and/or access string.
     * </p>
     * 
     * @param modifyUserRequest
     * @return Result of the ModifyUser operation returned by the service.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws InvalidUserStateException
     *         The user is not in active state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyUser" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyUserResult modifyUser(ModifyUserRequest modifyUserRequest);

    /**
     * <p>
     * Changes the list of users that belong to the user group.
     * </p>
     * 
     * @param modifyUserGroupRequest
     * @return Result of the ModifyUserGroup operation returned by the service.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws DuplicateUserNameException
     *         A user with this username already exists.
     * @throws DefaultUserRequiredException
     *         You must add default user to a user group.
     * @throws InvalidUserGroupStateException
     *         The user group is not in an active state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyUserGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyUserGroup" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyUserGroupResult modifyUserGroup(ModifyUserGroupRequest modifyUserGroupRequest);

    /**
     * <p>
     * Allows you to purchase a reserved cache node offering. Reserved nodes are not eligible for cancellation and are
     * non-refundable. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/reserved-nodes.html">Managing Costs with
     * Reserved Nodes</a> for Redis or <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/reserved-nodes.html">Managing Costs with
     * Reserved Nodes</a> for Memcached.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest
     *        Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.
     * @return Result of the PurchaseReservedCacheNodesOffering operation returned by the service.
     * @throws ReservedCacheNodesOfferingNotFoundException
     *         The requested cache node offering does not exist.
     * @throws ReservedCacheNodeAlreadyExistsException
     *         You already have a reservation with the given identifier.
     * @throws ReservedCacheNodeQuotaExceededException
     *         The request cannot be processed because it would exceed the user's cache node quota.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 50.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.PurchaseReservedCacheNodesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/PurchaseReservedCacheNodesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    ReservedCacheNode purchaseReservedCacheNodesOffering(PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest);

    /**
     * <p>
     * Redistribute slots to ensure uniform distribution across existing shards in the cluster.
     * </p>
     * 
     * @param rebalanceSlotsInGlobalReplicationGroupRequest
     * @return Result of the RebalanceSlotsInGlobalReplicationGroup operation returned by the service.
     * @throws GlobalReplicationGroupNotFoundException
     *         The Global datastore does not exist
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.RebalanceSlotsInGlobalReplicationGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RebalanceSlotsInGlobalReplicationGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GlobalReplicationGroup rebalanceSlotsInGlobalReplicationGroup(RebalanceSlotsInGlobalReplicationGroupRequest rebalanceSlotsInGlobalReplicationGroupRequest);

    /**
     * <p>
     * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache
     * parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary
     * outage to the cluster. During the reboot, the cluster status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cluster event is created.
     * </p>
     * <p>
     * Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is
     * not supported on Redis (cluster mode enabled) clusters.
     * </p>
     * <p>
     * If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to
     * be applied, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html">Rebooting a Cluster</a>
     * for an alternate process.
     * </p>
     * 
     * @param rebootCacheClusterRequest
     *        Represents the input of a <code>RebootCacheCluster</code> operation.
     * @return Result of the RebootCacheCluster operation returned by the service.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @sample AmazonElastiCache.RebootCacheCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RebootCacheCluster" target="_top">AWS
     *      API Documentation</a>
     */
    CacheCluster rebootCacheCluster(RebootCacheClusterRequest rebootCacheClusterRequest);

    /**
     * <p>
     * Removes the tags identified by the <code>TagKeys</code> list from the named resource. A tag is a key-value pair
     * where the key and value are case-sensitive. You can use tags to categorize and track all your ElastiCache
     * resources, with the exception of global replication group. When you add or remove tags on replication groups,
     * those actions will be replicated to all nodes in the replication group. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.ResourceLevelPermissions.html"
     * >Resource-level permissions</a>.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input of a <code>RemoveTagsFromResource</code> operation.
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cluster ID does not refer to an existing cluster.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws UserNotFoundException
     *         The user does not exist or could not be found.
     * @throws UserGroupNotFoundException
     *         The user group was not found or does not exist
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws TagNotFoundException
     *         The requested tag was not found on this resource.
     * @sample AmazonElastiCache.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the
     * <code>ResetAllParameters</code> and <code>CacheParameterGroupName</code> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest
     *        Represents the input of a <code>ResetCacheParameterGroup</code> operation.
     * @return Result of the ResetCacheParameterGroup operation returned by the service.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidGlobalReplicationGroupStateException
     *         The Global datastore is not available or in primary-only state.
     * @sample AmazonElastiCache.ResetCacheParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ResetCacheParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ResetCacheParameterGroupResult resetCacheParameterGroup(ResetCacheParameterGroupRequest resetCacheParameterGroupRequest);

    /**
     * <p>
     * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security
     * group that had been previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest
     *        Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.
     * @return Result of the RevokeCacheSecurityGroupIngress operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws AuthorizationNotFoundException
     *         The specified Amazon EC2 security group is not authorized for the specified cache security group.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.RevokeCacheSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RevokeCacheSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    CacheSecurityGroup revokeCacheSecurityGroupIngress(RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest);

    /**
     * <p>
     * Start the migration of data.
     * </p>
     * 
     * @param startMigrationRequest
     * @return Result of the StartMigration operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws ReplicationGroupAlreadyUnderMigrationException
     *         The targeted replication group is not available.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.StartMigration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/StartMigration" target="_top">AWS API
     *      Documentation</a>
     */
    ReplicationGroup startMigration(StartMigrationRequest startMigrationRequest);

    /**
     * <p>
     * Represents the input of a <code>TestFailover</code> operation which test automatic failover on a specified node
     * group (called shard in the console) in a replication group (called cluster in the console).
     * </p>
     * <p class="title">
     * <b>Note the following</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the
     * ElastiCache API and AWS CLI) in any rolling 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * If calling this operation on shards in different clusters (called replication groups in the API and CLI), the
     * calls can be made concurrently.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication
     * group, the first node replacement must complete before a subsequent call can be made.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console,
     * the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in
     * order of occurrance:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Replication group message: <code>Test Failover API called for node group &lt;node-group-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Failover from primary node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replication group message:
     * <code>Failover from primary node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message: <code>Recovering cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message: <code>Finished recovery for cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ECEvents.Viewing.html">Viewing ElastiCache
     * Events</a> in the <i>ElastiCache User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEvents.html">DescribeEvents
     * </a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Also see, <a
     * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html#auto-failover-test">Testing
     * Multi-AZ </a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param testFailoverRequest
     * @return Result of the TestFailover operation returned by the service.
     * @throws APICallRateForCustomerExceededException
     *         The customer has exceeded the allowed rate of API calls.
     * @throws InvalidCacheClusterStateException
     *         The requested cluster is not in the <code>available</code> state.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws NodeGroupNotFoundException
     *         The node group specified by the <code>NodeGroupId</code> parameter could not be found. Please verify that
     *         the node group exists and that you spelled the <code>NodeGroupId</code> value correctly.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws TestFailoverNotAvailableException
     *         The <code>TestFailover</code> action is not available.
     * @throws InvalidKMSKeyException
     *         The KMS key supplied is not valid.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.TestFailover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/TestFailover" target="_top">AWS API
     *      Documentation</a>
     */
    ReplicationGroup testFailover(TestFailoverRequest testFailoverRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonElastiCacheWaiters waiters();

}
