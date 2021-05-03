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
package com.amazonaws.services.neptune;

import javax.annotation.Generated;

import com.amazonaws.services.neptune.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Neptune asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Neptune</fullname>
 * <p>
 * Amazon Neptune is a fast, reliable, fully-managed graph database service that makes it easy to build and run
 * applications that work with highly connected datasets. The core of Amazon Neptune is a purpose-built,
 * high-performance graph database engine optimized for storing billions of relationships and querying the graph with
 * milliseconds latency. Amazon Neptune supports popular graph models Property Graph and W3C's RDF, and their respective
 * query languages Apache TinkerPop Gremlin and SPARQL, allowing you to easily build queries that efficiently navigate
 * highly connected datasets. Neptune powers graph use cases such as recommendation engines, fraud detection, knowledge
 * graphs, drug discovery, and network security.
 * </p>
 * <p>
 * This interface reference for Amazon Neptune contains documentation for a programming or command line interface you
 * can use to manage Amazon Neptune. Note that Amazon Neptune is asynchronous, which means that some interfaces might
 * require techniques such as polling or callback functions to determine when a command has been applied. In this
 * reference, the parameter descriptions indicate whether a command is applied immediately, on the next instance reboot,
 * or during the maintenance window. The reference structure is as follows, and we list following some related topics
 * from the user guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonNeptuneAsyncClient extends AmazonNeptuneClient implements AmazonNeptuneAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonNeptuneAsyncClientBuilder asyncBuilder() {
        return AmazonNeptuneAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Neptune using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonNeptuneAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Neptune using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonNeptuneAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddRoleToDBClusterResult> addRoleToDBClusterAsync(AddRoleToDBClusterRequest request) {

        return addRoleToDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddRoleToDBClusterResult> addRoleToDBClusterAsync(final AddRoleToDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddRoleToDBClusterRequest, AddRoleToDBClusterResult> asyncHandler) {
        final AddRoleToDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddRoleToDBClusterResult>() {
            @Override
            public AddRoleToDBClusterResult call() throws Exception {
                AddRoleToDBClusterResult result = null;

                try {
                    result = executeAddRoleToDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(AddSourceIdentifierToSubscriptionRequest request) {

        return addSourceIdentifierToSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(final AddSourceIdentifierToSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddSourceIdentifierToSubscriptionRequest, EventSubscription> asyncHandler) {
        final AddSourceIdentifierToSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result = null;

                try {
                    result = executeAddSourceIdentifierToSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {
        final AddTagsToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result = null;

                try {
                    result = executeAddTagsToResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(ApplyPendingMaintenanceActionRequest request) {

        return applyPendingMaintenanceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(
            final ApplyPendingMaintenanceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApplyPendingMaintenanceActionRequest, ResourcePendingMaintenanceActions> asyncHandler) {
        final ApplyPendingMaintenanceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResourcePendingMaintenanceActions>() {
            @Override
            public ResourcePendingMaintenanceActions call() throws Exception {
                ResourcePendingMaintenanceActions result = null;

                try {
                    result = executeApplyPendingMaintenanceAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(CopyDBClusterParameterGroupRequest request) {

        return copyDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(final CopyDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler) {
        final CopyDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterParameterGroup>() {
            @Override
            public DBClusterParameterGroup call() throws Exception {
                DBClusterParameterGroup result = null;

                try {
                    result = executeCopyDBClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest request) {

        return copyDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(final CopyDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {
        final CopyDBClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result = null;

                try {
                    result = executeCopyDBClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> copyDBParameterGroupAsync(CopyDBParameterGroupRequest request) {

        return copyDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> copyDBParameterGroupAsync(final CopyDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBParameterGroupRequest, DBParameterGroup> asyncHandler) {
        final CopyDBParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBParameterGroup>() {
            @Override
            public DBParameterGroup call() throws Exception {
                DBParameterGroup result = null;

                try {
                    result = executeCopyDBParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest request) {

        return createDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(final CreateDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterRequest, DBCluster> asyncHandler) {
        final CreateDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeCreateDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDBClusterEndpointResult> createDBClusterEndpointAsync(CreateDBClusterEndpointRequest request) {

        return createDBClusterEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDBClusterEndpointResult> createDBClusterEndpointAsync(final CreateDBClusterEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterEndpointRequest, CreateDBClusterEndpointResult> asyncHandler) {
        final CreateDBClusterEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDBClusterEndpointResult>() {
            @Override
            public CreateDBClusterEndpointResult call() throws Exception {
                CreateDBClusterEndpointResult result = null;

                try {
                    result = executeCreateDBClusterEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(CreateDBClusterParameterGroupRequest request) {

        return createDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(final CreateDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler) {
        final CreateDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterParameterGroup>() {
            @Override
            public DBClusterParameterGroup call() throws Exception {
                DBClusterParameterGroup result = null;

                try {
                    result = executeCreateDBClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest request) {

        return createDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(final CreateDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {
        final CreateDBClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result = null;

                try {
                    result = executeCreateDBClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest request) {

        return createDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceAsync(final CreateDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBInstanceRequest, DBInstance> asyncHandler) {
        final CreateDBInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result = null;

                try {
                    result = executeCreateDBInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest request) {

        return createDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(final CreateDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBParameterGroupRequest, DBParameterGroup> asyncHandler) {
        final CreateDBParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBParameterGroup>() {
            @Override
            public DBParameterGroup call() throws Exception {
                DBParameterGroup result = null;

                try {
                    result = executeCreateDBParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest request) {

        return createDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(final CreateDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBSubnetGroupRequest, DBSubnetGroup> asyncHandler) {
        final CreateDBSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBSubnetGroup>() {
            @Override
            public DBSubnetGroup call() throws Exception {
                DBSubnetGroup result = null;

                try {
                    result = executeCreateDBSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest request) {

        return createEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(final CreateEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler) {
        final CreateEventSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result = null;

                try {
                    result = executeCreateEventSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest request) {

        return deleteDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(final DeleteDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterRequest, DBCluster> asyncHandler) {
        final DeleteDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeDeleteDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterEndpointResult> deleteDBClusterEndpointAsync(DeleteDBClusterEndpointRequest request) {

        return deleteDBClusterEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterEndpointResult> deleteDBClusterEndpointAsync(final DeleteDBClusterEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterEndpointRequest, DeleteDBClusterEndpointResult> asyncHandler) {
        final DeleteDBClusterEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBClusterEndpointResult>() {
            @Override
            public DeleteDBClusterEndpointResult call() throws Exception {
                DeleteDBClusterEndpointResult result = null;

                try {
                    result = executeDeleteDBClusterEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(DeleteDBClusterParameterGroupRequest request) {

        return deleteDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(
            final DeleteDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterParameterGroupRequest, DeleteDBClusterParameterGroupResult> asyncHandler) {
        final DeleteDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBClusterParameterGroupResult>() {
            @Override
            public DeleteDBClusterParameterGroupResult call() throws Exception {
                DeleteDBClusterParameterGroupResult result = null;

                try {
                    result = executeDeleteDBClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest request) {

        return deleteDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(final DeleteDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {
        final DeleteDBClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result = null;

                try {
                    result = executeDeleteDBClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest request) {

        return deleteDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(final DeleteDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBInstanceRequest, DBInstance> asyncHandler) {
        final DeleteDBInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result = null;

                try {
                    result = executeDeleteDBInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest request) {

        return deleteDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(final DeleteDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBParameterGroupRequest, DeleteDBParameterGroupResult> asyncHandler) {
        final DeleteDBParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBParameterGroupResult>() {
            @Override
            public DeleteDBParameterGroupResult call() throws Exception {
                DeleteDBParameterGroupResult result = null;

                try {
                    result = executeDeleteDBParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest request) {

        return deleteDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(final DeleteDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBSubnetGroupRequest, DeleteDBSubnetGroupResult> asyncHandler) {
        final DeleteDBSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBSubnetGroupResult>() {
            @Override
            public DeleteDBSubnetGroupResult call() throws Exception {
                DeleteDBSubnetGroupResult result = null;

                try {
                    result = executeDeleteDBSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest request) {

        return deleteEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(final DeleteEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, EventSubscription> asyncHandler) {
        final DeleteEventSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result = null;

                try {
                    result = executeDeleteEventSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterEndpointsResult> describeDBClusterEndpointsAsync(DescribeDBClusterEndpointsRequest request) {

        return describeDBClusterEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterEndpointsResult> describeDBClusterEndpointsAsync(final DescribeDBClusterEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterEndpointsRequest, DescribeDBClusterEndpointsResult> asyncHandler) {
        final DescribeDBClusterEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterEndpointsResult>() {
            @Override
            public DescribeDBClusterEndpointsResult call() throws Exception {
                DescribeDBClusterEndpointsResult result = null;

                try {
                    result = executeDescribeDBClusterEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest request) {

        return describeDBClusterParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            final DescribeDBClusterParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler) {
        final DescribeDBClusterParameterGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterParameterGroupsResult>() {
            @Override
            public DescribeDBClusterParameterGroupsResult call() throws Exception {
                DescribeDBClusterParameterGroupsResult result = null;

                try {
                    result = executeDescribeDBClusterParameterGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(DescribeDBClusterParametersRequest request) {

        return describeDBClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(final DescribeDBClusterParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParametersRequest, DescribeDBClusterParametersResult> asyncHandler) {
        final DescribeDBClusterParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterParametersResult>() {
            @Override
            public DescribeDBClusterParametersResult call() throws Exception {
                DescribeDBClusterParametersResult result = null;

                try {
                    result = executeDescribeDBClusterParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest request) {

        return describeDBClusterSnapshotAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            final DescribeDBClusterSnapshotAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotAttributesRequest, DBClusterSnapshotAttributesResult> asyncHandler) {
        final DescribeDBClusterSnapshotAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshotAttributesResult>() {
            @Override
            public DBClusterSnapshotAttributesResult call() throws Exception {
                DBClusterSnapshotAttributesResult result = null;

                try {
                    result = executeDescribeDBClusterSnapshotAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest request) {

        return describeDBClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(final DescribeDBClusterSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler) {
        final DescribeDBClusterSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterSnapshotsResult>() {
            @Override
            public DescribeDBClusterSnapshotsResult call() throws Exception {
                DescribeDBClusterSnapshotsResult result = null;

                try {
                    result = executeDescribeDBClusterSnapshots(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest request) {

        return describeDBClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(final DescribeDBClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler) {
        final DescribeDBClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClustersResult>() {
            @Override
            public DescribeDBClustersResult call() throws Exception {
                DescribeDBClustersResult result = null;

                try {
                    result = executeDescribeDBClusters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest request) {

        return describeDBEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(final DescribeDBEngineVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler) {
        final DescribeDBEngineVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBEngineVersionsResult>() {
            @Override
            public DescribeDBEngineVersionsResult call() throws Exception {
                DescribeDBEngineVersionsResult result = null;

                try {
                    result = executeDescribeDBEngineVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest request) {

        return describeDBInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(final DescribeDBInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler) {
        final DescribeDBInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBInstancesResult>() {
            @Override
            public DescribeDBInstancesResult call() throws Exception {
                DescribeDBInstancesResult result = null;

                try {
                    result = executeDescribeDBInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest request) {

        return describeDBParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(final DescribeDBParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult> asyncHandler) {
        final DescribeDBParameterGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBParameterGroupsResult>() {
            @Override
            public DescribeDBParameterGroupsResult call() throws Exception {
                DescribeDBParameterGroupsResult result = null;

                try {
                    result = executeDescribeDBParameterGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParametersResult> describeDBParametersAsync(DescribeDBParametersRequest request) {

        return describeDBParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParametersResult> describeDBParametersAsync(final DescribeDBParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBParametersRequest, DescribeDBParametersResult> asyncHandler) {
        final DescribeDBParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBParametersResult>() {
            @Override
            public DescribeDBParametersResult call() throws Exception {
                DescribeDBParametersResult result = null;

                try {
                    result = executeDescribeDBParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest request) {

        return describeDBSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(final DescribeDBSubnetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler) {
        final DescribeDBSubnetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBSubnetGroupsResult>() {
            @Override
            public DescribeDBSubnetGroupsResult call() throws Exception {
                DescribeDBSubnetGroupsResult result = null;

                try {
                    result = executeDescribeDBSubnetGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(DescribeEngineDefaultClusterParametersRequest request) {

        return describeEngineDefaultClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(final DescribeEngineDefaultClusterParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultClusterParametersRequest, EngineDefaults> asyncHandler) {
        final DescribeEngineDefaultClusterParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EngineDefaults>() {
            @Override
            public EngineDefaults call() throws Exception {
                EngineDefaults result = null;

                try {
                    result = executeDescribeEngineDefaultClusterParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(DescribeEngineDefaultParametersRequest request) {

        return describeEngineDefaultParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(final DescribeEngineDefaultParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultParametersRequest, EngineDefaults> asyncHandler) {
        final DescribeEngineDefaultParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EngineDefaults>() {
            @Override
            public EngineDefaults call() throws Exception {
                EngineDefaults result = null;

                try {
                    result = executeDescribeEngineDefaultParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest request) {

        return describeEventCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(final DescribeEventCategoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {
        final DescribeEventCategoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventCategoriesResult>() {
            @Override
            public DescribeEventCategoriesResult call() throws Exception {
                DescribeEventCategoriesResult result = null;

                try {
                    result = executeDescribeEventCategories(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest request) {

        return describeEventSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(final DescribeEventSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler) {
        final DescribeEventSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventSubscriptionsResult>() {
            @Override
            public DescribeEventSubscriptionsResult call() throws Exception {
                DescribeEventSubscriptionsResult result = null;

                try {
                    result = executeDescribeEventSubscriptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {
        final DescribeEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventsResult>() {
            @Override
            public DescribeEventsResult call() throws Exception {
                DescribeEventsResult result = null;

                try {
                    result = executeDescribeEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest request) {

        return describeOrderableDBInstanceOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            final DescribeOrderableDBInstanceOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrderableDBInstanceOptionsRequest, DescribeOrderableDBInstanceOptionsResult> asyncHandler) {
        final DescribeOrderableDBInstanceOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrderableDBInstanceOptionsResult>() {
            @Override
            public DescribeOrderableDBInstanceOptionsResult call() throws Exception {
                DescribeOrderableDBInstanceOptionsResult result = null;

                try {
                    result = executeDescribeOrderableDBInstanceOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest request) {

        return describePendingMaintenanceActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            final DescribePendingMaintenanceActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler) {
        final DescribePendingMaintenanceActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePendingMaintenanceActionsResult>() {
            @Override
            public DescribePendingMaintenanceActionsResult call() throws Exception {
                DescribePendingMaintenanceActionsResult result = null;

                try {
                    result = executeDescribePendingMaintenanceActions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ValidDBInstanceModificationsMessage> describeValidDBInstanceModificationsAsync(
            DescribeValidDBInstanceModificationsRequest request) {

        return describeValidDBInstanceModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidDBInstanceModificationsMessage> describeValidDBInstanceModificationsAsync(
            final DescribeValidDBInstanceModificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeValidDBInstanceModificationsRequest, ValidDBInstanceModificationsMessage> asyncHandler) {
        final DescribeValidDBInstanceModificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidDBInstanceModificationsMessage>() {
            @Override
            public ValidDBInstanceModificationsMessage call() throws Exception {
                ValidDBInstanceModificationsMessage result = null;

                try {
                    result = executeDescribeValidDBInstanceModifications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest request) {

        return failoverDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(final FailoverDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler) {
        final FailoverDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeFailoverDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest request) {

        return modifyDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(final ModifyDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterRequest, DBCluster> asyncHandler) {
        final ModifyDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeModifyDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterEndpointResult> modifyDBClusterEndpointAsync(ModifyDBClusterEndpointRequest request) {

        return modifyDBClusterEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterEndpointResult> modifyDBClusterEndpointAsync(final ModifyDBClusterEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterEndpointRequest, ModifyDBClusterEndpointResult> asyncHandler) {
        final ModifyDBClusterEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyDBClusterEndpointResult>() {
            @Override
            public ModifyDBClusterEndpointResult call() throws Exception {
                ModifyDBClusterEndpointResult result = null;

                try {
                    result = executeModifyDBClusterEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(ModifyDBClusterParameterGroupRequest request) {

        return modifyDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(
            final ModifyDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterParameterGroupRequest, ModifyDBClusterParameterGroupResult> asyncHandler) {
        final ModifyDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyDBClusterParameterGroupResult>() {
            @Override
            public ModifyDBClusterParameterGroupResult call() throws Exception {
                ModifyDBClusterParameterGroupResult result = null;

                try {
                    result = executeModifyDBClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(ModifyDBClusterSnapshotAttributeRequest request) {

        return modifyDBClusterSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(
            final ModifyDBClusterSnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterSnapshotAttributeRequest, DBClusterSnapshotAttributesResult> asyncHandler) {
        final ModifyDBClusterSnapshotAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshotAttributesResult>() {
            @Override
            public DBClusterSnapshotAttributesResult call() throws Exception {
                DBClusterSnapshotAttributesResult result = null;

                try {
                    result = executeModifyDBClusterSnapshotAttribute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest request) {

        return modifyDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(final ModifyDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBInstanceRequest, DBInstance> asyncHandler) {
        final ModifyDBInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result = null;

                try {
                    result = executeModifyDBInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(ModifyDBParameterGroupRequest request) {

        return modifyDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(final ModifyDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBParameterGroupRequest, ModifyDBParameterGroupResult> asyncHandler) {
        final ModifyDBParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyDBParameterGroupResult>() {
            @Override
            public ModifyDBParameterGroupResult call() throws Exception {
                ModifyDBParameterGroupResult result = null;

                try {
                    result = executeModifyDBParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest request) {

        return modifyDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(final ModifyDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBSubnetGroupRequest, DBSubnetGroup> asyncHandler) {
        final ModifyDBSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBSubnetGroup>() {
            @Override
            public DBSubnetGroup call() throws Exception {
                DBSubnetGroup result = null;

                try {
                    result = executeModifyDBSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest request) {

        return modifyEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(final ModifyEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler) {
        final ModifyEventSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result = null;

                try {
                    result = executeModifyEventSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(PromoteReadReplicaDBClusterRequest request) {

        return promoteReadReplicaDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(final PromoteReadReplicaDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PromoteReadReplicaDBClusterRequest, DBCluster> asyncHandler) {
        final PromoteReadReplicaDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executePromoteReadReplicaDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest request) {

        return rebootDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(final RebootDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootDBInstanceRequest, DBInstance> asyncHandler) {
        final RebootDBInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result = null;

                try {
                    result = executeRebootDBInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromDBClusterResult> removeRoleFromDBClusterAsync(RemoveRoleFromDBClusterRequest request) {

        return removeRoleFromDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromDBClusterResult> removeRoleFromDBClusterAsync(final RemoveRoleFromDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveRoleFromDBClusterRequest, RemoveRoleFromDBClusterResult> asyncHandler) {
        final RemoveRoleFromDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveRoleFromDBClusterResult>() {
            @Override
            public RemoveRoleFromDBClusterResult call() throws Exception {
                RemoveRoleFromDBClusterResult result = null;

                try {
                    result = executeRemoveRoleFromDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(RemoveSourceIdentifierFromSubscriptionRequest request) {

        return removeSourceIdentifierFromSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(
            final RemoveSourceIdentifierFromSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveSourceIdentifierFromSubscriptionRequest, EventSubscription> asyncHandler) {
        final RemoveSourceIdentifierFromSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result = null;

                try {
                    result = executeRemoveSourceIdentifierFromSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {
        final RemoveTagsFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result = null;

                try {
                    result = executeRemoveTagsFromResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(ResetDBClusterParameterGroupRequest request) {

        return resetDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(final ResetDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetDBClusterParameterGroupRequest, ResetDBClusterParameterGroupResult> asyncHandler) {
        final ResetDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetDBClusterParameterGroupResult>() {
            @Override
            public ResetDBClusterParameterGroupResult call() throws Exception {
                ResetDBClusterParameterGroupResult result = null;

                try {
                    result = executeResetDBClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(ResetDBParameterGroupRequest request) {

        return resetDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(final ResetDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetDBParameterGroupRequest, ResetDBParameterGroupResult> asyncHandler) {
        final ResetDBParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetDBParameterGroupResult>() {
            @Override
            public ResetDBParameterGroupResult call() throws Exception {
                ResetDBParameterGroupResult result = null;

                try {
                    result = executeResetDBParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest request) {

        return restoreDBClusterFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(final RestoreDBClusterFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromSnapshotRequest, DBCluster> asyncHandler) {
        final RestoreDBClusterFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeRestoreDBClusterFromSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest request) {

        return restoreDBClusterToPointInTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(final RestoreDBClusterToPointInTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBClusterToPointInTimeRequest, DBCluster> asyncHandler) {
        final RestoreDBClusterToPointInTimeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeRestoreDBClusterToPointInTime(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> startDBClusterAsync(StartDBClusterRequest request) {

        return startDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> startDBClusterAsync(final StartDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDBClusterRequest, DBCluster> asyncHandler) {
        final StartDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeStartDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DBCluster> stopDBClusterAsync(StopDBClusterRequest request) {

        return stopDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> stopDBClusterAsync(final StopDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDBClusterRequest, DBCluster> asyncHandler) {
        final StopDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeStopDBCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
