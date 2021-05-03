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
package com.amazonaws.services.docdb;

import javax.annotation.Generated;

import com.amazonaws.services.docdb.model.*;

/**
 * Interface for accessing Amazon DocDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.docdb.AbstractAmazonDocDBAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon DocumentDB API documentation
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDocDBAsync extends AmazonDocDB {

    /**
     * <p>
     * Adds a source identifier to an existing event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     *        Represents the input to <a>AddSourceIdentifierToSubscription</a>.
     * @return A Java Future containing the result of the AddSourceIdentifierToSubscription operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.AddSourceIdentifierToSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/AddSourceIdentifierToSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(
            AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest);

    /**
     * <p>
     * Adds a source identifier to an existing event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     *        Represents the input to <a>AddSourceIdentifierToSubscription</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddSourceIdentifierToSubscription operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.AddSourceIdentifierToSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/AddSourceIdentifierToSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(
            AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<AddSourceIdentifierToSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to
     * track costs that are associated with Amazon DocumentDB resources. or in a <code>Condition</code> statement in an
     * AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input to <a>AddTagsToResource</a>.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AmazonDocDBAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to
     * track costs that are associated with Amazon DocumentDB resources. or in a <code>Condition</code> statement in an
     * AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input to <a>AddTagsToResource</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to an Amazon DocumentDB instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     *        Represents the input to <a>ApplyPendingMaintenanceAction</a>.
     * @return A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to an Amazon DocumentDB instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     *        Represents the input to <a>ApplyPendingMaintenanceAction</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest,
            com.amazonaws.handlers.AsyncHandler<ApplyPendingMaintenanceActionRequest, ResourcePendingMaintenanceActions> asyncHandler);

    /**
     * <p>
     * Copies the specified cluster parameter group.
     * </p>
     * 
     * @param copyDBClusterParameterGroupRequest
     *        Represents the input to <a>CopyDBClusterParameterGroup</a>.
     * @return A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service.
     * @sample AmazonDocDBAsync.CopyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CopyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Copies the specified cluster parameter group.
     * </p>
     * 
     * @param copyDBClusterParameterGroupRequest
     *        Represents the input to <a>CopyDBClusterParameterGroup</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.CopyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CopyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(
            CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CopyDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler);

    /**
     * <p>
     * Copies a snapshot of a cluster.
     * </p>
     * <p>
     * To copy a cluster snapshot from a shared manual cluster snapshot, <code>SourceDBClusterSnapshotIdentifier</code>
     * must be the Amazon Resource Name (ARN) of the shared cluster snapshot. You can only copy a shared DB cluster
     * snapshot, whether encrypted or not, in the same AWS Region.
     * </p>
     * <p>
     * To cancel the copy operation after it is in progress, delete the target cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that cluster snapshot is in the <i>copying</i> status.
     * </p>
     * 
     * @param copyDBClusterSnapshotRequest
     *        Represents the input to <a>CopyDBClusterSnapshot</a>.
     * @return A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBAsync.CopyDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest);

    /**
     * <p>
     * Copies a snapshot of a cluster.
     * </p>
     * <p>
     * To copy a cluster snapshot from a shared manual cluster snapshot, <code>SourceDBClusterSnapshotIdentifier</code>
     * must be the Amazon Resource Name (ARN) of the shared cluster snapshot. You can only copy a shared DB cluster
     * snapshot, whether encrypted or not, in the same AWS Region.
     * </p>
     * <p>
     * To cancel the copy operation after it is in progress, delete the target cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that cluster snapshot is in the <i>copying</i> status.
     * </p>
     * 
     * @param copyDBClusterSnapshotRequest
     *        Represents the input to <a>CopyDBClusterSnapshot</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.CopyDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopyDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon DocumentDB cluster.
     * </p>
     * 
     * @param createDBClusterRequest
     *        Represents the input to <a>CreateDBCluster</a>.
     * @return A Java Future containing the result of the CreateDBCluster operation returned by the service.
     * @sample AmazonDocDBAsync.CreateDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest createDBClusterRequest);

    /**
     * <p>
     * Creates a new Amazon DocumentDB cluster.
     * </p>
     * 
     * @param createDBClusterRequest
     *        Represents the input to <a>CreateDBCluster</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBCluster operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.CreateDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest createDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Creates a new cluster parameter group.
     * </p>
     * <p>
     * Parameters in a cluster parameter group apply to all of the instances in a cluster.
     * </p>
     * <p>
     * A cluster parameter group is initially created with the default parameters for the database engine used by
     * instances in the cluster. In Amazon DocumentDB, you cannot make modifications directly to the
     * <code>default.docdb3.6</code> cluster parameter group. If your Amazon DocumentDB cluster is using the default
     * cluster parameter group and you want to modify a value in it, you must first <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-create.html"> create a
     * new parameter group</a> or <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-copy.html"> copy an
     * existing parameter group</a>, modify it, and then apply the modified parameter group to your cluster. For the new
     * cluster parameter group and associated settings to take effect, you must then reboot the instances in the cluster
     * without failover. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-modify.html">
     * Modifying Amazon DocumentDB Cluster Parameter Groups</a>.
     * </p>
     * 
     * @param createDBClusterParameterGroupRequest
     *        Represents the input of <a>CreateDBClusterParameterGroup</a>.
     * @return A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.CreateDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(
            CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest);

    /**
     * <p>
     * Creates a new cluster parameter group.
     * </p>
     * <p>
     * Parameters in a cluster parameter group apply to all of the instances in a cluster.
     * </p>
     * <p>
     * A cluster parameter group is initially created with the default parameters for the database engine used by
     * instances in the cluster. In Amazon DocumentDB, you cannot make modifications directly to the
     * <code>default.docdb3.6</code> cluster parameter group. If your Amazon DocumentDB cluster is using the default
     * cluster parameter group and you want to modify a value in it, you must first <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-create.html"> create a
     * new parameter group</a> or <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-copy.html"> copy an
     * existing parameter group</a>, modify it, and then apply the modified parameter group to your cluster. For the new
     * cluster parameter group and associated settings to take effect, you must then reboot the instances in the cluster
     * without failover. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-modify.html">
     * Modifying Amazon DocumentDB Cluster Parameter Groups</a>.
     * </p>
     * 
     * @param createDBClusterParameterGroupRequest
     *        Represents the input of <a>CreateDBClusterParameterGroup</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.CreateDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(
            CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of a cluster.
     * </p>
     * 
     * @param createDBClusterSnapshotRequest
     *        Represents the input of <a>CreateDBClusterSnapshot</a>.
     * @return A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBAsync.CreateDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a cluster.
     * </p>
     * 
     * @param createDBClusterSnapshotRequest
     *        Represents the input of <a>CreateDBClusterSnapshot</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.CreateDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler);

    /**
     * <p>
     * Creates a new instance.
     * </p>
     * 
     * @param createDBInstanceRequest
     *        Represents the input to <a>CreateDBInstance</a>.
     * @return A Java Future containing the result of the CreateDBInstance operation returned by the service.
     * @sample AmazonDocDBAsync.CreateDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest createDBInstanceRequest);

    /**
     * <p>
     * Creates a new instance.
     * </p>
     * 
     * @param createDBInstanceRequest
     *        Represents the input to <a>CreateDBInstance</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBInstance operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.CreateDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest createDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Creates a new subnet group. subnet groups must contain at least one subnet in at least two Availability Zones in
     * the AWS Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest
     *        Represents the input to <a>CreateDBSubnetGroup</a>.
     * @return A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service.
     * @sample AmazonDocDBAsync.CreateDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest createDBSubnetGroupRequest);

    /**
     * <p>
     * Creates a new subnet group. subnet groups must contain at least one subnet in at least two Availability Zones in
     * the AWS Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest
     *        Represents the input to <a>CreateDBSubnetGroup</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.CreateDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest createDBSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBSubnetGroupRequest, DBSubnetGroup> asyncHandler);

    /**
     * <p>
     * Creates an Amazon DocumentDB event notification subscription. This action requires a topic Amazon Resource Name
     * (ARN) created by using the Amazon DocumentDB console, the Amazon SNS console, or the Amazon SNS API. To obtain an
     * ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in
     * the Amazon SNS console.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) that you want to be notified of. You can also
     * provide a list of Amazon DocumentDB sources (<code>SourceIds</code>) that trigger the events, and you can provide
     * a list of event categories (<code>EventCategories</code>) for events that you want to be notified of. For
     * example, you can specify <code>SourceType = db-instance</code>,
     * <code>SourceIds = mydbinstance1, mydbinstance2</code> and <code>EventCategories = Availability, Backup</code>.
     * </p>
     * <p>
     * If you specify both the <code>SourceType</code> and <code>SourceIds</code> (such as
     * <code>SourceType = db-instance</code> and <code>SourceIdentifier = myDBInstance1</code>), you are notified of all
     * the <code>db-instance</code> events for the specified source. If you specify a <code>SourceType</code> but do not
     * specify a <code>SourceIdentifier</code>, you receive notice of the events for that source type for all your
     * Amazon DocumentDB sources. If you do not specify either the <code>SourceType</code> or the
     * <code>SourceIdentifier</code>, you are notified of events generated from all Amazon DocumentDB sources belonging
     * to your customer account.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     *        Represents the input to <a>CreateEventSubscription</a>.
     * @return A Java Future containing the result of the CreateEventSubscription operation returned by the service.
     * @sample AmazonDocDBAsync.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * Creates an Amazon DocumentDB event notification subscription. This action requires a topic Amazon Resource Name
     * (ARN) created by using the Amazon DocumentDB console, the Amazon SNS console, or the Amazon SNS API. To obtain an
     * ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in
     * the Amazon SNS console.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) that you want to be notified of. You can also
     * provide a list of Amazon DocumentDB sources (<code>SourceIds</code>) that trigger the events, and you can provide
     * a list of event categories (<code>EventCategories</code>) for events that you want to be notified of. For
     * example, you can specify <code>SourceType = db-instance</code>,
     * <code>SourceIds = mydbinstance1, mydbinstance2</code> and <code>EventCategories = Availability, Backup</code>.
     * </p>
     * <p>
     * If you specify both the <code>SourceType</code> and <code>SourceIds</code> (such as
     * <code>SourceType = db-instance</code> and <code>SourceIdentifier = myDBInstance1</code>), you are notified of all
     * the <code>db-instance</code> events for the specified source. If you specify a <code>SourceType</code> but do not
     * specify a <code>SourceIdentifier</code>, you receive notice of the events for that source type for all your
     * Amazon DocumentDB sources. If you do not specify either the <code>SourceType</code> or the
     * <code>SourceIdentifier</code>, you are notified of events generated from all Amazon DocumentDB sources belonging
     * to your customer account.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     *        Represents the input to <a>CreateEventSubscription</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventSubscription operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest createEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Deletes a previously provisioned cluster. When you delete a cluster, all automated backups for that cluster are
     * deleted and can't be recovered. Manual DB cluster snapshots of the specified cluster are not deleted.
     * </p>
     * <p/>
     * 
     * @param deleteDBClusterRequest
     *        Represents the input to <a>DeleteDBCluster</a>.
     * @return A Java Future containing the result of the DeleteDBCluster operation returned by the service.
     * @sample AmazonDocDBAsync.DeleteDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest deleteDBClusterRequest);

    /**
     * <p>
     * Deletes a previously provisioned cluster. When you delete a cluster, all automated backups for that cluster are
     * deleted and can't be recovered. Manual DB cluster snapshots of the specified cluster are not deleted.
     * </p>
     * <p/>
     * 
     * @param deleteDBClusterRequest
     *        Represents the input to <a>DeleteDBCluster</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBCluster operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DeleteDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest deleteDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Deletes a specified cluster parameter group. The cluster parameter group to be deleted can't be associated with
     * any clusters.
     * </p>
     * 
     * @param deleteDBClusterParameterGroupRequest
     *        Represents the input to <a>DeleteDBClusterParameterGroup</a>.
     * @return A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.DeleteDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(
            DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest);

    /**
     * <p>
     * Deletes a specified cluster parameter group. The cluster parameter group to be deleted can't be associated with
     * any clusters.
     * </p>
     * 
     * @param deleteDBClusterParameterGroupRequest
     *        Represents the input to <a>DeleteDBClusterParameterGroup</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.DeleteDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(
            DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterParameterGroupRequest, DeleteDBClusterParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a cluster snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The cluster snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterSnapshotRequest
     *        Represents the input to <a>DeleteDBClusterSnapshot</a>.
     * @return A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBAsync.DeleteDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest);

    /**
     * <p>
     * Deletes a cluster snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The cluster snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterSnapshotRequest
     *        Represents the input to <a>DeleteDBClusterSnapshot</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DeleteDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler);

    /**
     * <p>
     * Deletes a previously provisioned instance.
     * </p>
     * 
     * @param deleteDBInstanceRequest
     *        Represents the input to <a>DeleteDBInstance</a>.
     * @return A Java Future containing the result of the DeleteDBInstance operation returned by the service.
     * @sample AmazonDocDBAsync.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest deleteDBInstanceRequest);

    /**
     * <p>
     * Deletes a previously provisioned instance.
     * </p>
     * 
     * @param deleteDBInstanceRequest
     *        Represents the input to <a>DeleteDBInstance</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBInstance operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest deleteDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * <note>
     * <p>
     * The specified database subnet group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSubnetGroupRequest
     *        Represents the input to <a>DeleteDBSubnetGroup</a>.
     * @return A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service.
     * @sample AmazonDocDBAsync.DeleteDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * <note>
     * <p>
     * The specified database subnet group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSubnetGroupRequest
     *        Represents the input to <a>DeleteDBSubnetGroup</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DeleteDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBSubnetGroupRequest, DeleteDBSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     *        Represents the input to <a>DeleteEventSubscription</a>.
     * @return A Java Future containing the result of the DeleteEventSubscription operation returned by the service.
     * @sample AmazonDocDBAsync.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Deletes an Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     *        Represents the input to <a>DeleteEventSubscription</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventSubscription operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Returns a list of certificate authority (CA) certificates provided by Amazon DocumentDB for this AWS account.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return A Java Future containing the result of the DescribeCertificates operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest describeCertificatesRequest);

    /**
     * <p>
     * Returns a list of certificate authority (CA) certificates provided by Amazon DocumentDB for this AWS account.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificates operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest describeCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list contains only the description of the
     * specified cluster parameter group.
     * </p>
     * 
     * @param describeDBClusterParameterGroupsRequest
     *        Represents the input to <a>DescribeDBClusterParameterGroups</a>.
     * @return A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.DescribeDBClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest);

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list contains only the description of the
     * specified cluster parameter group.
     * </p>
     * 
     * @param describeDBClusterParameterGroupsRequest
     *        Represents the input to <a>DescribeDBClusterParameterGroups</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.DescribeDBClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the detailed parameter list for a particular cluster parameter group.
     * </p>
     * 
     * @param describeDBClusterParametersRequest
     *        Represents the input to <a>DescribeDBClusterParameters</a>.
     * @return A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeDBClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(
            DescribeDBClusterParametersRequest describeDBClusterParametersRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular cluster parameter group.
     * </p>
     * 
     * @param describeDBClusterParametersRequest
     *        Represents the input to <a>DescribeDBClusterParameters</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeDBClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(
            DescribeDBClusterParametersRequest describeDBClusterParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParametersRequest, DescribeDBClusterParametersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of cluster snapshot attribute names and values for a manual DB cluster snapshot.
     * </p>
     * <p>
     * When you share snapshots with other AWS accounts, <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual cluster snapshot. If <code>all</code> is included in the list of values for the <code>restore</code>
     * attribute, then the manual cluster snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * 
     * @param describeDBClusterSnapshotAttributesRequest
     *        Represents the input to <a>DescribeDBClusterSnapshotAttributes</a>.
     * @return A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.DescribeDBClusterSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest);

    /**
     * <p>
     * Returns a list of cluster snapshot attribute names and values for a manual DB cluster snapshot.
     * </p>
     * <p>
     * When you share snapshots with other AWS accounts, <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual cluster snapshot. If <code>all</code> is included in the list of values for the <code>restore</code>
     * attribute, then the manual cluster snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * 
     * @param describeDBClusterSnapshotAttributesRequest
     *        Represents the input to <a>DescribeDBClusterSnapshotAttributes</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.DescribeDBClusterSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotAttributesRequest, DBClusterSnapshotAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns information about cluster snapshots. This API operation supports pagination.
     * </p>
     * 
     * @param describeDBClusterSnapshotsRequest
     *        Represents the input to <a>DescribeDBClusterSnapshots</a>.
     * @return A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeDBClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(
            DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest);

    /**
     * <p>
     * Returns information about cluster snapshots. This API operation supports pagination.
     * </p>
     * 
     * @param describeDBClusterSnapshotsRequest
     *        Represents the input to <a>DescribeDBClusterSnapshots</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeDBClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(
            DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns information about provisioned Amazon DocumentDB clusters. This API operation supports pagination. For
     * certain management features such as cluster and instance lifecycle management, Amazon DocumentDB leverages
     * operational technology that is shared with Amazon RDS and Amazon Neptune. Use the
     * <code>filterName=engine,Values=docdb</code> filter parameter to return only Amazon DocumentDB clusters.
     * </p>
     * 
     * @param describeDBClustersRequest
     *        Represents the input to <a>DescribeDBClusters</a>.
     * @return A Java Future containing the result of the DescribeDBClusters operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeDBClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest describeDBClustersRequest);

    /**
     * <p>
     * Returns information about provisioned Amazon DocumentDB clusters. This API operation supports pagination. For
     * certain management features such as cluster and instance lifecycle management, Amazon DocumentDB leverages
     * operational technology that is shared with Amazon RDS and Amazon Neptune. Use the
     * <code>filterName=engine,Values=docdb</code> filter parameter to return only Amazon DocumentDB clusters.
     * </p>
     * 
     * @param describeDBClustersRequest
     *        Represents the input to <a>DescribeDBClusters</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusters operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeDBClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest describeDBClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the available engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     *        Represents the input to <a>DescribeDBEngineVersions</a>.
     * @return A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeDBEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBEngineVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest);

    /**
     * <p>
     * Returns a list of the available engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     *        Represents the input to <a>DescribeDBEngineVersions</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeDBEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBEngineVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
     * </p>
     * 
     * @param describeDBInstancesRequest
     *        Represents the input to <a>DescribeDBInstances</a>.
     * @return A Java Future containing the result of the DescribeDBInstances operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest describeDBInstancesRequest);

    /**
     * <p>
     * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
     * </p>
     * 
     * @param describeDBInstancesRequest
     *        Represents the input to <a>DescribeDBInstances</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBInstances operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest describeDBInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>DBSubnetGroup</code> descriptions. If a <code>DBSubnetGroupName</code> is specified, the
     * list will contain only the descriptions of the specified <code>DBSubnetGroup</code>.
     * </p>
     * 
     * @param describeDBSubnetGroupsRequest
     *        Represents the input to <a>DescribeDBSubnetGroups</a>.
     * @return A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeDBSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBSubnetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest);

    /**
     * <p>
     * Returns a list of <code>DBSubnetGroup</code> descriptions. If a <code>DBSubnetGroupName</code> is specified, the
     * list will contain only the descriptions of the specified <code>DBSubnetGroup</code>.
     * </p>
     * 
     * @param describeDBSubnetGroupsRequest
     *        Represents the input to <a>DescribeDBSubnetGroups</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeDBSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBSubnetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     *        Represents the input to <a>DescribeEngineDefaultClusterParameters</a>.
     * @return A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
     *         the service.
     * @sample AmazonDocDBAsync.DescribeEngineDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEngineDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(
            DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     *        Represents the input to <a>DescribeEngineDefaultClusterParameters</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
     *         the service.
     * @sample AmazonDocDBAsyncHandler.DescribeEngineDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEngineDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(
            DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultClusterParametersRequest, EngineDefaults> asyncHandler);

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     *        Represents the input to <a>DescribeEventCategories</a>.
     * @return A Java Future containing the result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest describeEventCategoriesRequest);

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     *        Represents the input to <a>DescribeEventCategories</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest describeEventCategoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler);

    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The description for a subscription includes
     * <code>SubscriptionName</code>, <code>SNSTopicARN</code>, <code>CustomerID</code>, <code>SourceType</code>,
     * <code>SourceID</code>, <code>CreationTime</code>, and <code>Status</code>.
     * </p>
     * <p>
     * If you specify a <code>SubscriptionName</code>, lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     *        Represents the input to <a>DescribeEventSubscriptions</a>.
     * @return A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The description for a subscription includes
     * <code>SubscriptionName</code>, <code>SNSTopicARN</code>, <code>CustomerID</code>, <code>SourceType</code>,
     * <code>SourceID</code>, <code>CreationTime</code>, and <code>Status</code>.
     * </p>
     * <p>
     * If you specify a <code>SubscriptionName</code>, lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     *        Represents the input to <a>DescribeEventSubscriptions</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Returns events related to instances, security groups, snapshots, and DB parameter groups for the past 14 days.
     * You can obtain events specific to a particular DB instance, security group, snapshot, or parameter group by
     * providing the name as a parameter. By default, the events of the past hour are returned.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input to <a>DescribeEvents</a>.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonDocDBAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns events related to instances, security groups, snapshots, and DB parameter groups for the past 14 days.
     * You can obtain events specific to a particular DB instance, security group, snapshot, or parameter group by
     * providing the name as a parameter. By default, the events of the past hour are returned.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input to <a>DescribeEvents</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of orderable instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     *        Represents the input to <a>DescribeOrderableDBInstanceOptions</a>.
     * @return A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.DescribeOrderableDBInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeOrderableDBInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest);

    /**
     * <p>
     * Returns a list of orderable instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     *        Represents the input to <a>DescribeOrderableDBInstanceOptions</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.DescribeOrderableDBInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeOrderableDBInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableDBInstanceOptionsRequest, DescribeOrderableDBInstanceOptionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of resources (for example, instances) that have at least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     *        Represents the input to <a>DescribePendingMaintenanceActions</a>.
     * @return A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest);

    /**
     * <p>
     * Returns a list of resources (for example, instances) that have at least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     *        Represents the input to <a>DescribePendingMaintenanceActions</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler);

    /**
     * <p>
     * Forces a failover for a cluster.
     * </p>
     * <p>
     * A failover for a cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the cluster to
     * be the primary instance (the cluster writer).
     * </p>
     * <p>
     * If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one
     * exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
     * </p>
     * 
     * @param failoverDBClusterRequest
     *        Represents the input to <a>FailoverDBCluster</a>.
     * @return A Java Future containing the result of the FailoverDBCluster operation returned by the service.
     * @sample AmazonDocDBAsync.FailoverDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/FailoverDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest failoverDBClusterRequest);

    /**
     * <p>
     * Forces a failover for a cluster.
     * </p>
     * <p>
     * A failover for a cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the cluster to
     * be the primary instance (the cluster writer).
     * </p>
     * <p>
     * If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one
     * exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
     * </p>
     * 
     * @param failoverDBClusterRequest
     *        Represents the input to <a>FailoverDBCluster</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FailoverDBCluster operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.FailoverDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/FailoverDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest failoverDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Lists all tags on an Amazon DocumentDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Represents the input to <a>ListTagsForResource</a>.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonDocDBAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on an Amazon DocumentDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Represents the input to <a>ListTagsForResource</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies a setting for an Amazon DocumentDB cluster. You can change one or more database configuration parameters
     * by specifying these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBClusterRequest
     *        Represents the input to <a>ModifyDBCluster</a>.
     * @return A Java Future containing the result of the ModifyDBCluster operation returned by the service.
     * @sample AmazonDocDBAsync.ModifyDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest modifyDBClusterRequest);

    /**
     * <p>
     * Modifies a setting for an Amazon DocumentDB cluster. You can change one or more database configuration parameters
     * by specifying these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBClusterRequest
     *        Represents the input to <a>ModifyDBCluster</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBCluster operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.ModifyDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest modifyDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or
     * maintenance window before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a cluster parameter group, you should wait at least 5 minutes before creating your first cluster
     * that uses that cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully
     * complete the create action before the parameter group is used as the default for a new cluster. This step is
     * especially important for parameters that are critical when creating the default database for a cluster, such as
     * the character set for the default database defined by the <code>character_set_database</code> parameter.
     * </p>
     * </important>
     * 
     * @param modifyDBClusterParameterGroupRequest
     *        Represents the input to <a>ModifyDBClusterParameterGroup</a>.
     * @return A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.ModifyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(
            ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or
     * maintenance window before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a cluster parameter group, you should wait at least 5 minutes before creating your first cluster
     * that uses that cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully
     * complete the create action before the parameter group is used as the default for a new cluster. This step is
     * especially important for parameters that are critical when creating the default database for a cluster, such as
     * the character set for the default database defined by the <code>character_set_database</code> parameter.
     * </p>
     * </important>
     * 
     * @param modifyDBClusterParameterGroupRequest
     *        Represents the input to <a>ModifyDBClusterParameterGroup</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.ModifyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(
            ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterParameterGroupRequest, ModifyDBClusterParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual cluster snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code>, and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual cluster snapshot. Use the value <code>all</code> to make the
     * manual cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the
     * <code>all</code> value for any manual DB cluster snapshots that contain private information that you don't want
     * available to all AWS accounts. If a manual cluster snapshot is encrypted, it can be shared, but only by
     * specifying a list of authorized AWS account IDs for the <code>ValuesToAdd</code> parameter. You can't use
     * <code>all</code> as a value for that parameter in this case.
     * </p>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest
     *        Represents the input to <a>ModifyDBClusterSnapshotAttribute</a>.
     * @return A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.ModifyDBClusterSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBClusterSnapshotAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(
            ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual cluster snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code>, and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual cluster snapshot. Use the value <code>all</code> to make the
     * manual cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the
     * <code>all</code> value for any manual DB cluster snapshots that contain private information that you don't want
     * available to all AWS accounts. If a manual cluster snapshot is encrypted, it can be shared, but only by
     * specifying a list of authorized AWS account IDs for the <code>ValuesToAdd</code> parameter. You can't use
     * <code>all</code> as a value for that parameter in this case.
     * </p>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest
     *        Represents the input to <a>ModifyDBClusterSnapshotAttribute</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.ModifyDBClusterSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBClusterSnapshotAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(
            ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterSnapshotAttributeRequest, DBClusterSnapshotAttributesResult> asyncHandler);

    /**
     * <p>
     * Modifies settings for an instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBInstanceRequest
     *        Represents the input to <a>ModifyDBInstance</a>.
     * @return A Java Future containing the result of the ModifyDBInstance operation returned by the service.
     * @sample AmazonDocDBAsync.ModifyDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest modifyDBInstanceRequest);

    /**
     * <p>
     * Modifies settings for an instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBInstanceRequest
     *        Represents the input to <a>ModifyDBInstance</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBInstance operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.ModifyDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest modifyDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Modifies an existing subnet group. subnet groups must contain at least one subnet in at least two Availability
     * Zones in the AWS Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest
     *        Represents the input to <a>ModifyDBSubnetGroup</a>.
     * @return A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service.
     * @sample AmazonDocDBAsync.ModifyDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing subnet group. subnet groups must contain at least one subnet in at least two Availability
     * Zones in the AWS Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest
     *        Represents the input to <a>ModifyDBSubnetGroup</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.ModifyDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBSubnetGroupRequest, DBSubnetGroup> asyncHandler);

    /**
     * <p>
     * Modifies an existing Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     *        Represents the input to <a>ModifyEventSubscription</a>.
     * @return A Java Future containing the result of the ModifyEventSubscription operation returned by the service.
     * @sample AmazonDocDBAsync.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

    /**
     * <p>
     * Modifies an existing Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     *        Represents the input to <a>ModifyEventSubscription</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyEventSubscription operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * You might need to reboot your instance, usually for maintenance reasons. For example, if you make certain
     * changes, or if you change the cluster parameter group that is associated with the instance, you must reboot the
     * instance for the changes to take effect.
     * </p>
     * <p>
     * Rebooting an instance restarts the database engine service. Rebooting an instance results in a momentary outage,
     * during which the instance status is set to <i>rebooting</i>.
     * </p>
     * 
     * @param rebootDBInstanceRequest
     *        Represents the input to <a>RebootDBInstance</a>.
     * @return A Java Future containing the result of the RebootDBInstance operation returned by the service.
     * @sample AmazonDocDBAsync.RebootDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RebootDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest rebootDBInstanceRequest);

    /**
     * <p>
     * You might need to reboot your instance, usually for maintenance reasons. For example, if you make certain
     * changes, or if you change the cluster parameter group that is associated with the instance, you must reboot the
     * instance for the changes to take effect.
     * </p>
     * <p>
     * Rebooting an instance restarts the database engine service. Rebooting an instance results in a momentary outage,
     * during which the instance status is set to <i>rebooting</i>.
     * </p>
     * 
     * @param rebootDBInstanceRequest
     *        Represents the input to <a>RebootDBInstance</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootDBInstance operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.RebootDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RebootDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest rebootDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RebootDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Removes a source identifier from an existing Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     *        Represents the input to <a>RemoveSourceIdentifierFromSubscription</a>.
     * @return A Java Future containing the result of the RemoveSourceIdentifierFromSubscription operation returned by
     *         the service.
     * @sample AmazonDocDBAsync.RemoveSourceIdentifierFromSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RemoveSourceIdentifierFromSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(
            RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest);

    /**
     * <p>
     * Removes a source identifier from an existing Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     *        Represents the input to <a>RemoveSourceIdentifierFromSubscription</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveSourceIdentifierFromSubscription operation returned by
     *         the service.
     * @sample AmazonDocDBAsyncHandler.RemoveSourceIdentifierFromSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RemoveSourceIdentifierFromSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(
            RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveSourceIdentifierFromSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Removes metadata tags from an Amazon DocumentDB resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input to <a>RemoveTagsFromResource</a>.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AmazonDocDBAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RemoveTagsFromResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes metadata tags from an Amazon DocumentDB resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input to <a>RemoveTagsFromResource</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RemoveTagsFromResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a cluster parameter group to the default value. To reset specific parameters, submit a
     * list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire cluster
     * parameter group, specify the <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
     * parameters.
     * </p>
     * <p>
     * When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance reboot.
     * </p>
     * 
     * @param resetDBClusterParameterGroupRequest
     *        Represents the input to <a>ResetDBClusterParameterGroup</a>.
     * @return A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.ResetDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ResetDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(
            ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a cluster parameter group to the default value. To reset specific parameters, submit a
     * list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire cluster
     * parameter group, specify the <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
     * parameters.
     * </p>
     * <p>
     * When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance reboot.
     * </p>
     * 
     * @param resetDBClusterParameterGroupRequest
     *        Represents the input to <a>ResetDBClusterParameterGroup</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.ResetDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ResetDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(
            ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ResetDBClusterParameterGroupRequest, ResetDBClusterParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a new cluster from a snapshot or cluster snapshot.
     * </p>
     * <p>
     * If a snapshot is specified, the target cluster is created from the source DB snapshot with a default
     * configuration and default security group.
     * </p>
     * <p>
     * If a cluster snapshot is specified, the target cluster is created from the source cluster restore point with the
     * same configuration as the original source DB cluster, except that the new cluster is created with the default
     * security group.
     * </p>
     * 
     * @param restoreDBClusterFromSnapshotRequest
     *        Represents the input to <a>RestoreDBClusterFromSnapshot</a>.
     * @return A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.RestoreDBClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RestoreDBClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest);

    /**
     * <p>
     * Creates a new cluster from a snapshot or cluster snapshot.
     * </p>
     * <p>
     * If a snapshot is specified, the target cluster is created from the source DB snapshot with a default
     * configuration and default security group.
     * </p>
     * <p>
     * If a cluster snapshot is specified, the target cluster is created from the source cluster restore point with the
     * same configuration as the original source DB cluster, except that the new cluster is created with the default
     * security group.
     * </p>
     * 
     * @param restoreDBClusterFromSnapshotRequest
     *        Represents the input to <a>RestoreDBClusterFromSnapshot</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.RestoreDBClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RestoreDBClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromSnapshotRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Restores a cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target cluster is
     * created from the source cluster with the same configuration as the original cluster, except that the new cluster
     * is created with the default security group.
     * </p>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     *        Represents the input to <a>RestoreDBClusterToPointInTime</a>.
     * @return A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
     *         service.
     * @sample AmazonDocDBAsync.RestoreDBClusterToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RestoreDBClusterToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest);

    /**
     * <p>
     * Restores a cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target cluster is
     * created from the source cluster with the same configuration as the original cluster, except that the new cluster
     * is created with the default security group.
     * </p>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     *        Represents the input to <a>RestoreDBClusterToPointInTime</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
     *         service.
     * @sample AmazonDocDBAsyncHandler.RestoreDBClusterToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RestoreDBClusterToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreDBClusterToPointInTimeRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Restarts the stopped cluster that is specified by <code>DBClusterIdentifier</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-stop-start.html">Stopping and
     * Starting an Amazon DocumentDB Cluster</a>.
     * </p>
     * 
     * @param startDBClusterRequest
     * @return A Java Future containing the result of the StartDBCluster operation returned by the service.
     * @sample AmazonDocDBAsync.StartDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/StartDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> startDBClusterAsync(StartDBClusterRequest startDBClusterRequest);

    /**
     * <p>
     * Restarts the stopped cluster that is specified by <code>DBClusterIdentifier</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-stop-start.html">Stopping and
     * Starting an Amazon DocumentDB Cluster</a>.
     * </p>
     * 
     * @param startDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDBCluster operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.StartDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/StartDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> startDBClusterAsync(StartDBClusterRequest startDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<StartDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Stops the running cluster that is specified by <code>DBClusterIdentifier</code>. The cluster must be in the
     * <i>available</i> state. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-stop-start.html">Stopping and
     * Starting an Amazon DocumentDB Cluster</a>.
     * </p>
     * 
     * @param stopDBClusterRequest
     * @return A Java Future containing the result of the StopDBCluster operation returned by the service.
     * @sample AmazonDocDBAsync.StopDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/StopDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> stopDBClusterAsync(StopDBClusterRequest stopDBClusterRequest);

    /**
     * <p>
     * Stops the running cluster that is specified by <code>DBClusterIdentifier</code>. The cluster must be in the
     * <i>available</i> state. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-stop-start.html">Stopping and
     * Starting an Amazon DocumentDB Cluster</a>.
     * </p>
     * 
     * @param stopDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDBCluster operation returned by the service.
     * @sample AmazonDocDBAsyncHandler.StopDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/StopDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> stopDBClusterAsync(StopDBClusterRequest stopDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<StopDBClusterRequest, DBCluster> asyncHandler);

}
