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
package com.amazonaws.services.kafka;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Kafka asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * 
 * <p>
 * The operations for managing an Amazon MSK cluster.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSKafkaAsyncClient extends AWSKafkaClient implements AWSKafkaAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSKafkaAsyncClientBuilder asyncBuilder() {
        return AWSKafkaAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kafka using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSKafkaAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kafka using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSKafkaAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchAssociateScramSecretResult> batchAssociateScramSecretAsync(BatchAssociateScramSecretRequest request) {

        return batchAssociateScramSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateScramSecretResult> batchAssociateScramSecretAsync(final BatchAssociateScramSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateScramSecretRequest, BatchAssociateScramSecretResult> asyncHandler) {
        final BatchAssociateScramSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateScramSecretResult>() {
            @Override
            public BatchAssociateScramSecretResult call() throws Exception {
                BatchAssociateScramSecretResult result = null;

                try {
                    result = executeBatchAssociateScramSecret(finalRequest);
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
    public java.util.concurrent.Future<BatchDisassociateScramSecretResult> batchDisassociateScramSecretAsync(BatchDisassociateScramSecretRequest request) {

        return batchDisassociateScramSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateScramSecretResult> batchDisassociateScramSecretAsync(final BatchDisassociateScramSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateScramSecretRequest, BatchDisassociateScramSecretResult> asyncHandler) {
        final BatchDisassociateScramSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateScramSecretResult>() {
            @Override
            public BatchDisassociateScramSecretResult call() throws Exception {
                BatchDisassociateScramSecretResult result = null;

                try {
                    result = executeBatchDisassociateScramSecret(finalRequest);
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
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(final CreateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {
        final CreateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClusterResult>() {
            @Override
            public CreateClusterResult call() throws Exception {
                CreateClusterResult result = null;

                try {
                    result = executeCreateCluster(finalRequest);
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
    public java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest request) {

        return createConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(final CreateConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationRequest, CreateConfigurationResult> asyncHandler) {
        final CreateConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationResult>() {
            @Override
            public CreateConfigurationResult call() throws Exception {
                CreateConfigurationResult result = null;

                try {
                    result = executeCreateConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(final DeleteClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {
        final DeleteClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterResult>() {
            @Override
            public DeleteClusterResult call() throws Exception {
                DeleteClusterResult result = null;

                try {
                    result = executeDeleteCluster(finalRequest);
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
    public java.util.concurrent.Future<DeleteConfigurationResult> deleteConfigurationAsync(DeleteConfigurationRequest request) {

        return deleteConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationResult> deleteConfigurationAsync(final DeleteConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationRequest, DeleteConfigurationResult> asyncHandler) {
        final DeleteConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationResult>() {
            @Override
            public DeleteConfigurationResult call() throws Exception {
                DeleteConfigurationResult result = null;

                try {
                    result = executeDeleteConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request) {

        return describeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(final DescribeClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler) {
        final DescribeClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterResult>() {
            @Override
            public DescribeClusterResult call() throws Exception {
                DescribeClusterResult result = null;

                try {
                    result = executeDescribeCluster(finalRequest);
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
    public java.util.concurrent.Future<DescribeClusterOperationResult> describeClusterOperationAsync(DescribeClusterOperationRequest request) {

        return describeClusterOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterOperationResult> describeClusterOperationAsync(final DescribeClusterOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterOperationRequest, DescribeClusterOperationResult> asyncHandler) {
        final DescribeClusterOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterOperationResult>() {
            @Override
            public DescribeClusterOperationResult call() throws Exception {
                DescribeClusterOperationResult result = null;

                try {
                    result = executeDescribeClusterOperation(finalRequest);
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
    public java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest request) {

        return describeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(final DescribeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRequest, DescribeConfigurationResult> asyncHandler) {
        final DescribeConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationResult>() {
            @Override
            public DescribeConfigurationResult call() throws Exception {
                DescribeConfigurationResult result = null;

                try {
                    result = executeDescribeConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(DescribeConfigurationRevisionRequest request) {

        return describeConfigurationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(
            final DescribeConfigurationRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRevisionRequest, DescribeConfigurationRevisionResult> asyncHandler) {
        final DescribeConfigurationRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationRevisionResult>() {
            @Override
            public DescribeConfigurationRevisionResult call() throws Exception {
                DescribeConfigurationRevisionResult result = null;

                try {
                    result = executeDescribeConfigurationRevision(finalRequest);
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
    public java.util.concurrent.Future<GetBootstrapBrokersResult> getBootstrapBrokersAsync(GetBootstrapBrokersRequest request) {

        return getBootstrapBrokersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBootstrapBrokersResult> getBootstrapBrokersAsync(final GetBootstrapBrokersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBootstrapBrokersRequest, GetBootstrapBrokersResult> asyncHandler) {
        final GetBootstrapBrokersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBootstrapBrokersResult>() {
            @Override
            public GetBootstrapBrokersResult call() throws Exception {
                GetBootstrapBrokersResult result = null;

                try {
                    result = executeGetBootstrapBrokers(finalRequest);
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
    public java.util.concurrent.Future<GetCompatibleKafkaVersionsResult> getCompatibleKafkaVersionsAsync(GetCompatibleKafkaVersionsRequest request) {

        return getCompatibleKafkaVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleKafkaVersionsResult> getCompatibleKafkaVersionsAsync(final GetCompatibleKafkaVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCompatibleKafkaVersionsRequest, GetCompatibleKafkaVersionsResult> asyncHandler) {
        final GetCompatibleKafkaVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCompatibleKafkaVersionsResult>() {
            @Override
            public GetCompatibleKafkaVersionsResult call() throws Exception {
                GetCompatibleKafkaVersionsResult result = null;

                try {
                    result = executeGetCompatibleKafkaVersions(finalRequest);
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
    public java.util.concurrent.Future<ListClusterOperationsResult> listClusterOperationsAsync(ListClusterOperationsRequest request) {

        return listClusterOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClusterOperationsResult> listClusterOperationsAsync(final ListClusterOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClusterOperationsRequest, ListClusterOperationsResult> asyncHandler) {
        final ListClusterOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListClusterOperationsResult>() {
            @Override
            public ListClusterOperationsResult call() throws Exception {
                ListClusterOperationsResult result = null;

                try {
                    result = executeListClusterOperations(finalRequest);
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
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(final ListClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {
        final ListClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListClustersResult>() {
            @Override
            public ListClustersResult call() throws Exception {
                ListClustersResult result = null;

                try {
                    result = executeListClusters(finalRequest);
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
    public java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(ListConfigurationRevisionsRequest request) {

        return listConfigurationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(final ListConfigurationRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationRevisionsRequest, ListConfigurationRevisionsResult> asyncHandler) {
        final ListConfigurationRevisionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationRevisionsResult>() {
            @Override
            public ListConfigurationRevisionsResult call() throws Exception {
                ListConfigurationRevisionsResult result = null;

                try {
                    result = executeListConfigurationRevisions(finalRequest);
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
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request) {

        return listConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(final ListConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler) {
        final ListConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationsResult>() {
            @Override
            public ListConfigurationsResult call() throws Exception {
                ListConfigurationsResult result = null;

                try {
                    result = executeListConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListKafkaVersionsResult> listKafkaVersionsAsync(ListKafkaVersionsRequest request) {

        return listKafkaVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKafkaVersionsResult> listKafkaVersionsAsync(final ListKafkaVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKafkaVersionsRequest, ListKafkaVersionsResult> asyncHandler) {
        final ListKafkaVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKafkaVersionsResult>() {
            @Override
            public ListKafkaVersionsResult call() throws Exception {
                ListKafkaVersionsResult result = null;

                try {
                    result = executeListKafkaVersions(finalRequest);
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
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request) {

        return listNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(final ListNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler) {
        final ListNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNodesResult>() {
            @Override
            public ListNodesResult call() throws Exception {
                ListNodesResult result = null;

                try {
                    result = executeListNodes(finalRequest);
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
    public java.util.concurrent.Future<ListScramSecretsResult> listScramSecretsAsync(ListScramSecretsRequest request) {

        return listScramSecretsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScramSecretsResult> listScramSecretsAsync(final ListScramSecretsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListScramSecretsRequest, ListScramSecretsResult> asyncHandler) {
        final ListScramSecretsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListScramSecretsResult>() {
            @Override
            public ListScramSecretsResult call() throws Exception {
                ListScramSecretsResult result = null;

                try {
                    result = executeListScramSecrets(finalRequest);
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
    public java.util.concurrent.Future<RebootBrokerResult> rebootBrokerAsync(RebootBrokerRequest request) {

        return rebootBrokerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootBrokerResult> rebootBrokerAsync(final RebootBrokerRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootBrokerRequest, RebootBrokerResult> asyncHandler) {
        final RebootBrokerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebootBrokerResult>() {
            @Override
            public RebootBrokerResult call() throws Exception {
                RebootBrokerResult result = null;

                try {
                    result = executeRebootBroker(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateBrokerCountResult> updateBrokerCountAsync(UpdateBrokerCountRequest request) {

        return updateBrokerCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerCountResult> updateBrokerCountAsync(final UpdateBrokerCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBrokerCountRequest, UpdateBrokerCountResult> asyncHandler) {
        final UpdateBrokerCountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBrokerCountResult>() {
            @Override
            public UpdateBrokerCountResult call() throws Exception {
                UpdateBrokerCountResult result = null;

                try {
                    result = executeUpdateBrokerCount(finalRequest);
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
    public java.util.concurrent.Future<UpdateBrokerStorageResult> updateBrokerStorageAsync(UpdateBrokerStorageRequest request) {

        return updateBrokerStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerStorageResult> updateBrokerStorageAsync(final UpdateBrokerStorageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBrokerStorageRequest, UpdateBrokerStorageResult> asyncHandler) {
        final UpdateBrokerStorageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBrokerStorageResult>() {
            @Override
            public UpdateBrokerStorageResult call() throws Exception {
                UpdateBrokerStorageResult result = null;

                try {
                    result = executeUpdateBrokerStorage(finalRequest);
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
    public java.util.concurrent.Future<UpdateBrokerTypeResult> updateBrokerTypeAsync(UpdateBrokerTypeRequest request) {

        return updateBrokerTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerTypeResult> updateBrokerTypeAsync(final UpdateBrokerTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBrokerTypeRequest, UpdateBrokerTypeResult> asyncHandler) {
        final UpdateBrokerTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBrokerTypeResult>() {
            @Override
            public UpdateBrokerTypeResult call() throws Exception {
                UpdateBrokerTypeResult result = null;

                try {
                    result = executeUpdateBrokerType(finalRequest);
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
    public java.util.concurrent.Future<UpdateClusterConfigurationResult> updateClusterConfigurationAsync(UpdateClusterConfigurationRequest request) {

        return updateClusterConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterConfigurationResult> updateClusterConfigurationAsync(final UpdateClusterConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClusterConfigurationRequest, UpdateClusterConfigurationResult> asyncHandler) {
        final UpdateClusterConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClusterConfigurationResult>() {
            @Override
            public UpdateClusterConfigurationResult call() throws Exception {
                UpdateClusterConfigurationResult result = null;

                try {
                    result = executeUpdateClusterConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateClusterKafkaVersionResult> updateClusterKafkaVersionAsync(UpdateClusterKafkaVersionRequest request) {

        return updateClusterKafkaVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterKafkaVersionResult> updateClusterKafkaVersionAsync(final UpdateClusterKafkaVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClusterKafkaVersionRequest, UpdateClusterKafkaVersionResult> asyncHandler) {
        final UpdateClusterKafkaVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClusterKafkaVersionResult>() {
            @Override
            public UpdateClusterKafkaVersionResult call() throws Exception {
                UpdateClusterKafkaVersionResult result = null;

                try {
                    result = executeUpdateClusterKafkaVersion(finalRequest);
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
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest request) {

        return updateConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(final UpdateConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationRequest, UpdateConfigurationResult> asyncHandler) {
        final UpdateConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationResult>() {
            @Override
            public UpdateConfigurationResult call() throws Exception {
                UpdateConfigurationResult result = null;

                try {
                    result = executeUpdateConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateMonitoringResult> updateMonitoringAsync(UpdateMonitoringRequest request) {

        return updateMonitoringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoringResult> updateMonitoringAsync(final UpdateMonitoringRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMonitoringRequest, UpdateMonitoringResult> asyncHandler) {
        final UpdateMonitoringRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMonitoringResult>() {
            @Override
            public UpdateMonitoringResult call() throws Exception {
                UpdateMonitoringResult result = null;

                try {
                    result = executeUpdateMonitoring(finalRequest);
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
