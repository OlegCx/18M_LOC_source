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
package com.amazonaws.services.glue;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Glue asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>AWS Glue</fullname>
 * <p>
 * Defines the public endpoint for the AWS Glue service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGlueAsyncClient extends AWSGlueClient implements AWSGlueAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSGlueAsyncClientBuilder asyncBuilder() {
        return AWSGlueAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Glue using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSGlueAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Glue using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSGlueAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchCreatePartitionResult> batchCreatePartitionAsync(BatchCreatePartitionRequest request) {

        return batchCreatePartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreatePartitionResult> batchCreatePartitionAsync(final BatchCreatePartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreatePartitionRequest, BatchCreatePartitionResult> asyncHandler) {
        final BatchCreatePartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreatePartitionResult>() {
            @Override
            public BatchCreatePartitionResult call() throws Exception {
                BatchCreatePartitionResult result = null;

                try {
                    result = executeBatchCreatePartition(finalRequest);
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
    public java.util.concurrent.Future<BatchDeleteConnectionResult> batchDeleteConnectionAsync(BatchDeleteConnectionRequest request) {

        return batchDeleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteConnectionResult> batchDeleteConnectionAsync(final BatchDeleteConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteConnectionRequest, BatchDeleteConnectionResult> asyncHandler) {
        final BatchDeleteConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteConnectionResult>() {
            @Override
            public BatchDeleteConnectionResult call() throws Exception {
                BatchDeleteConnectionResult result = null;

                try {
                    result = executeBatchDeleteConnection(finalRequest);
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
    public java.util.concurrent.Future<BatchDeletePartitionResult> batchDeletePartitionAsync(BatchDeletePartitionRequest request) {

        return batchDeletePartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeletePartitionResult> batchDeletePartitionAsync(final BatchDeletePartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeletePartitionRequest, BatchDeletePartitionResult> asyncHandler) {
        final BatchDeletePartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeletePartitionResult>() {
            @Override
            public BatchDeletePartitionResult call() throws Exception {
                BatchDeletePartitionResult result = null;

                try {
                    result = executeBatchDeletePartition(finalRequest);
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
    public java.util.concurrent.Future<BatchDeleteTableResult> batchDeleteTableAsync(BatchDeleteTableRequest request) {

        return batchDeleteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteTableResult> batchDeleteTableAsync(final BatchDeleteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteTableRequest, BatchDeleteTableResult> asyncHandler) {
        final BatchDeleteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteTableResult>() {
            @Override
            public BatchDeleteTableResult call() throws Exception {
                BatchDeleteTableResult result = null;

                try {
                    result = executeBatchDeleteTable(finalRequest);
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
    public java.util.concurrent.Future<BatchDeleteTableVersionResult> batchDeleteTableVersionAsync(BatchDeleteTableVersionRequest request) {

        return batchDeleteTableVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteTableVersionResult> batchDeleteTableVersionAsync(final BatchDeleteTableVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteTableVersionRequest, BatchDeleteTableVersionResult> asyncHandler) {
        final BatchDeleteTableVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteTableVersionResult>() {
            @Override
            public BatchDeleteTableVersionResult call() throws Exception {
                BatchDeleteTableVersionResult result = null;

                try {
                    result = executeBatchDeleteTableVersion(finalRequest);
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
    public java.util.concurrent.Future<BatchGetCrawlersResult> batchGetCrawlersAsync(BatchGetCrawlersRequest request) {

        return batchGetCrawlersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetCrawlersResult> batchGetCrawlersAsync(final BatchGetCrawlersRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetCrawlersRequest, BatchGetCrawlersResult> asyncHandler) {
        final BatchGetCrawlersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetCrawlersResult>() {
            @Override
            public BatchGetCrawlersResult call() throws Exception {
                BatchGetCrawlersResult result = null;

                try {
                    result = executeBatchGetCrawlers(finalRequest);
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
    public java.util.concurrent.Future<BatchGetDevEndpointsResult> batchGetDevEndpointsAsync(BatchGetDevEndpointsRequest request) {

        return batchGetDevEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDevEndpointsResult> batchGetDevEndpointsAsync(final BatchGetDevEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDevEndpointsRequest, BatchGetDevEndpointsResult> asyncHandler) {
        final BatchGetDevEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDevEndpointsResult>() {
            @Override
            public BatchGetDevEndpointsResult call() throws Exception {
                BatchGetDevEndpointsResult result = null;

                try {
                    result = executeBatchGetDevEndpoints(finalRequest);
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
    public java.util.concurrent.Future<BatchGetJobsResult> batchGetJobsAsync(BatchGetJobsRequest request) {

        return batchGetJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetJobsResult> batchGetJobsAsync(final BatchGetJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetJobsRequest, BatchGetJobsResult> asyncHandler) {
        final BatchGetJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetJobsResult>() {
            @Override
            public BatchGetJobsResult call() throws Exception {
                BatchGetJobsResult result = null;

                try {
                    result = executeBatchGetJobs(finalRequest);
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
    public java.util.concurrent.Future<BatchGetPartitionResult> batchGetPartitionAsync(BatchGetPartitionRequest request) {

        return batchGetPartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetPartitionResult> batchGetPartitionAsync(final BatchGetPartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetPartitionRequest, BatchGetPartitionResult> asyncHandler) {
        final BatchGetPartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetPartitionResult>() {
            @Override
            public BatchGetPartitionResult call() throws Exception {
                BatchGetPartitionResult result = null;

                try {
                    result = executeBatchGetPartition(finalRequest);
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
    public java.util.concurrent.Future<BatchGetTriggersResult> batchGetTriggersAsync(BatchGetTriggersRequest request) {

        return batchGetTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetTriggersResult> batchGetTriggersAsync(final BatchGetTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetTriggersRequest, BatchGetTriggersResult> asyncHandler) {
        final BatchGetTriggersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetTriggersResult>() {
            @Override
            public BatchGetTriggersResult call() throws Exception {
                BatchGetTriggersResult result = null;

                try {
                    result = executeBatchGetTriggers(finalRequest);
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
    public java.util.concurrent.Future<BatchGetWorkflowsResult> batchGetWorkflowsAsync(BatchGetWorkflowsRequest request) {

        return batchGetWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetWorkflowsResult> batchGetWorkflowsAsync(final BatchGetWorkflowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetWorkflowsRequest, BatchGetWorkflowsResult> asyncHandler) {
        final BatchGetWorkflowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetWorkflowsResult>() {
            @Override
            public BatchGetWorkflowsResult call() throws Exception {
                BatchGetWorkflowsResult result = null;

                try {
                    result = executeBatchGetWorkflows(finalRequest);
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
    public java.util.concurrent.Future<BatchStopJobRunResult> batchStopJobRunAsync(BatchStopJobRunRequest request) {

        return batchStopJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchStopJobRunResult> batchStopJobRunAsync(final BatchStopJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchStopJobRunRequest, BatchStopJobRunResult> asyncHandler) {
        final BatchStopJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchStopJobRunResult>() {
            @Override
            public BatchStopJobRunResult call() throws Exception {
                BatchStopJobRunResult result = null;

                try {
                    result = executeBatchStopJobRun(finalRequest);
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
    public java.util.concurrent.Future<BatchUpdatePartitionResult> batchUpdatePartitionAsync(BatchUpdatePartitionRequest request) {

        return batchUpdatePartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdatePartitionResult> batchUpdatePartitionAsync(final BatchUpdatePartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdatePartitionRequest, BatchUpdatePartitionResult> asyncHandler) {
        final BatchUpdatePartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdatePartitionResult>() {
            @Override
            public BatchUpdatePartitionResult call() throws Exception {
                BatchUpdatePartitionResult result = null;

                try {
                    result = executeBatchUpdatePartition(finalRequest);
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
    public java.util.concurrent.Future<CancelMLTaskRunResult> cancelMLTaskRunAsync(CancelMLTaskRunRequest request) {

        return cancelMLTaskRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelMLTaskRunResult> cancelMLTaskRunAsync(final CancelMLTaskRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelMLTaskRunRequest, CancelMLTaskRunResult> asyncHandler) {
        final CancelMLTaskRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelMLTaskRunResult>() {
            @Override
            public CancelMLTaskRunResult call() throws Exception {
                CancelMLTaskRunResult result = null;

                try {
                    result = executeCancelMLTaskRun(finalRequest);
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
    public java.util.concurrent.Future<CheckSchemaVersionValidityResult> checkSchemaVersionValidityAsync(CheckSchemaVersionValidityRequest request) {

        return checkSchemaVersionValidityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckSchemaVersionValidityResult> checkSchemaVersionValidityAsync(final CheckSchemaVersionValidityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckSchemaVersionValidityRequest, CheckSchemaVersionValidityResult> asyncHandler) {
        final CheckSchemaVersionValidityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckSchemaVersionValidityResult>() {
            @Override
            public CheckSchemaVersionValidityResult call() throws Exception {
                CheckSchemaVersionValidityResult result = null;

                try {
                    result = executeCheckSchemaVersionValidity(finalRequest);
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
    public java.util.concurrent.Future<CreateClassifierResult> createClassifierAsync(CreateClassifierRequest request) {

        return createClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClassifierResult> createClassifierAsync(final CreateClassifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClassifierRequest, CreateClassifierResult> asyncHandler) {
        final CreateClassifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClassifierResult>() {
            @Override
            public CreateClassifierResult call() throws Exception {
                CreateClassifierResult result = null;

                try {
                    result = executeCreateClassifier(finalRequest);
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
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(final CreateConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {
        final CreateConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectionResult>() {
            @Override
            public CreateConnectionResult call() throws Exception {
                CreateConnectionResult result = null;

                try {
                    result = executeCreateConnection(finalRequest);
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
    public java.util.concurrent.Future<CreateCrawlerResult> createCrawlerAsync(CreateCrawlerRequest request) {

        return createCrawlerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCrawlerResult> createCrawlerAsync(final CreateCrawlerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCrawlerRequest, CreateCrawlerResult> asyncHandler) {
        final CreateCrawlerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCrawlerResult>() {
            @Override
            public CreateCrawlerResult call() throws Exception {
                CreateCrawlerResult result = null;

                try {
                    result = executeCreateCrawler(finalRequest);
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
    public java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(CreateDatabaseRequest request) {

        return createDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(final CreateDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatabaseRequest, CreateDatabaseResult> asyncHandler) {
        final CreateDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatabaseResult>() {
            @Override
            public CreateDatabaseResult call() throws Exception {
                CreateDatabaseResult result = null;

                try {
                    result = executeCreateDatabase(finalRequest);
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
    public java.util.concurrent.Future<CreateDevEndpointResult> createDevEndpointAsync(CreateDevEndpointRequest request) {

        return createDevEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDevEndpointResult> createDevEndpointAsync(final CreateDevEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDevEndpointRequest, CreateDevEndpointResult> asyncHandler) {
        final CreateDevEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDevEndpointResult>() {
            @Override
            public CreateDevEndpointResult call() throws Exception {
                CreateDevEndpointResult result = null;

                try {
                    result = executeCreateDevEndpoint(finalRequest);
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
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(final CreateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {
        final CreateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateJobResult>() {
            @Override
            public CreateJobResult call() throws Exception {
                CreateJobResult result = null;

                try {
                    result = executeCreateJob(finalRequest);
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
    public java.util.concurrent.Future<CreateMLTransformResult> createMLTransformAsync(CreateMLTransformRequest request) {

        return createMLTransformAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMLTransformResult> createMLTransformAsync(final CreateMLTransformRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMLTransformRequest, CreateMLTransformResult> asyncHandler) {
        final CreateMLTransformRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMLTransformResult>() {
            @Override
            public CreateMLTransformResult call() throws Exception {
                CreateMLTransformResult result = null;

                try {
                    result = executeCreateMLTransform(finalRequest);
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
    public java.util.concurrent.Future<CreatePartitionResult> createPartitionAsync(CreatePartitionRequest request) {

        return createPartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePartitionResult> createPartitionAsync(final CreatePartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePartitionRequest, CreatePartitionResult> asyncHandler) {
        final CreatePartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePartitionResult>() {
            @Override
            public CreatePartitionResult call() throws Exception {
                CreatePartitionResult result = null;

                try {
                    result = executeCreatePartition(finalRequest);
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
    public java.util.concurrent.Future<CreatePartitionIndexResult> createPartitionIndexAsync(CreatePartitionIndexRequest request) {

        return createPartitionIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePartitionIndexResult> createPartitionIndexAsync(final CreatePartitionIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePartitionIndexRequest, CreatePartitionIndexResult> asyncHandler) {
        final CreatePartitionIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePartitionIndexResult>() {
            @Override
            public CreatePartitionIndexResult call() throws Exception {
                CreatePartitionIndexResult result = null;

                try {
                    result = executeCreatePartitionIndex(finalRequest);
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
    public java.util.concurrent.Future<CreateRegistryResult> createRegistryAsync(CreateRegistryRequest request) {

        return createRegistryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegistryResult> createRegistryAsync(final CreateRegistryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegistryRequest, CreateRegistryResult> asyncHandler) {
        final CreateRegistryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegistryResult>() {
            @Override
            public CreateRegistryResult call() throws Exception {
                CreateRegistryResult result = null;

                try {
                    result = executeCreateRegistry(finalRequest);
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
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest request) {

        return createSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(final CreateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler) {
        final CreateSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSchemaResult>() {
            @Override
            public CreateSchemaResult call() throws Exception {
                CreateSchemaResult result = null;

                try {
                    result = executeCreateSchema(finalRequest);
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
    public java.util.concurrent.Future<CreateScriptResult> createScriptAsync(CreateScriptRequest request) {

        return createScriptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScriptResult> createScriptAsync(final CreateScriptRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateScriptRequest, CreateScriptResult> asyncHandler) {
        final CreateScriptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateScriptResult>() {
            @Override
            public CreateScriptResult call() throws Exception {
                CreateScriptResult result = null;

                try {
                    result = executeCreateScript(finalRequest);
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
    public java.util.concurrent.Future<CreateSecurityConfigurationResult> createSecurityConfigurationAsync(CreateSecurityConfigurationRequest request) {

        return createSecurityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityConfigurationResult> createSecurityConfigurationAsync(final CreateSecurityConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSecurityConfigurationRequest, CreateSecurityConfigurationResult> asyncHandler) {
        final CreateSecurityConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSecurityConfigurationResult>() {
            @Override
            public CreateSecurityConfigurationResult call() throws Exception {
                CreateSecurityConfigurationResult result = null;

                try {
                    result = executeCreateSecurityConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request) {

        return createTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(final CreateTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) {
        final CreateTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTableResult>() {
            @Override
            public CreateTableResult call() throws Exception {
                CreateTableResult result = null;

                try {
                    result = executeCreateTable(finalRequest);
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
    public java.util.concurrent.Future<CreateTriggerResult> createTriggerAsync(CreateTriggerRequest request) {

        return createTriggerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTriggerResult> createTriggerAsync(final CreateTriggerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTriggerRequest, CreateTriggerResult> asyncHandler) {
        final CreateTriggerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTriggerResult>() {
            @Override
            public CreateTriggerResult call() throws Exception {
                CreateTriggerResult result = null;

                try {
                    result = executeCreateTrigger(finalRequest);
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
    public java.util.concurrent.Future<CreateUserDefinedFunctionResult> createUserDefinedFunctionAsync(CreateUserDefinedFunctionRequest request) {

        return createUserDefinedFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserDefinedFunctionResult> createUserDefinedFunctionAsync(final CreateUserDefinedFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserDefinedFunctionRequest, CreateUserDefinedFunctionResult> asyncHandler) {
        final CreateUserDefinedFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserDefinedFunctionResult>() {
            @Override
            public CreateUserDefinedFunctionResult call() throws Exception {
                CreateUserDefinedFunctionResult result = null;

                try {
                    result = executeCreateUserDefinedFunction(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest request) {

        return createWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(final CreateWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler) {
        final CreateWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkflowResult>() {
            @Override
            public CreateWorkflowResult call() throws Exception {
                CreateWorkflowResult result = null;

                try {
                    result = executeCreateWorkflow(finalRequest);
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
    public java.util.concurrent.Future<DeleteClassifierResult> deleteClassifierAsync(DeleteClassifierRequest request) {

        return deleteClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClassifierResult> deleteClassifierAsync(final DeleteClassifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClassifierRequest, DeleteClassifierResult> asyncHandler) {
        final DeleteClassifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClassifierResult>() {
            @Override
            public DeleteClassifierResult call() throws Exception {
                DeleteClassifierResult result = null;

                try {
                    result = executeDeleteClassifier(finalRequest);
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
    public java.util.concurrent.Future<DeleteColumnStatisticsForPartitionResult> deleteColumnStatisticsForPartitionAsync(
            DeleteColumnStatisticsForPartitionRequest request) {

        return deleteColumnStatisticsForPartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteColumnStatisticsForPartitionResult> deleteColumnStatisticsForPartitionAsync(
            final DeleteColumnStatisticsForPartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteColumnStatisticsForPartitionRequest, DeleteColumnStatisticsForPartitionResult> asyncHandler) {
        final DeleteColumnStatisticsForPartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteColumnStatisticsForPartitionResult>() {
            @Override
            public DeleteColumnStatisticsForPartitionResult call() throws Exception {
                DeleteColumnStatisticsForPartitionResult result = null;

                try {
                    result = executeDeleteColumnStatisticsForPartition(finalRequest);
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
    public java.util.concurrent.Future<DeleteColumnStatisticsForTableResult> deleteColumnStatisticsForTableAsync(DeleteColumnStatisticsForTableRequest request) {

        return deleteColumnStatisticsForTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteColumnStatisticsForTableResult> deleteColumnStatisticsForTableAsync(
            final DeleteColumnStatisticsForTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteColumnStatisticsForTableRequest, DeleteColumnStatisticsForTableResult> asyncHandler) {
        final DeleteColumnStatisticsForTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteColumnStatisticsForTableResult>() {
            @Override
            public DeleteColumnStatisticsForTableResult call() throws Exception {
                DeleteColumnStatisticsForTableResult result = null;

                try {
                    result = executeDeleteColumnStatisticsForTable(finalRequest);
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
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(final DeleteConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {
        final DeleteConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectionResult>() {
            @Override
            public DeleteConnectionResult call() throws Exception {
                DeleteConnectionResult result = null;

                try {
                    result = executeDeleteConnection(finalRequest);
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
    public java.util.concurrent.Future<DeleteCrawlerResult> deleteCrawlerAsync(DeleteCrawlerRequest request) {

        return deleteCrawlerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCrawlerResult> deleteCrawlerAsync(final DeleteCrawlerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCrawlerRequest, DeleteCrawlerResult> asyncHandler) {
        final DeleteCrawlerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCrawlerResult>() {
            @Override
            public DeleteCrawlerResult call() throws Exception {
                DeleteCrawlerResult result = null;

                try {
                    result = executeDeleteCrawler(finalRequest);
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
    public java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(DeleteDatabaseRequest request) {

        return deleteDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(final DeleteDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatabaseRequest, DeleteDatabaseResult> asyncHandler) {
        final DeleteDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatabaseResult>() {
            @Override
            public DeleteDatabaseResult call() throws Exception {
                DeleteDatabaseResult result = null;

                try {
                    result = executeDeleteDatabase(finalRequest);
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
    public java.util.concurrent.Future<DeleteDevEndpointResult> deleteDevEndpointAsync(DeleteDevEndpointRequest request) {

        return deleteDevEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDevEndpointResult> deleteDevEndpointAsync(final DeleteDevEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDevEndpointRequest, DeleteDevEndpointResult> asyncHandler) {
        final DeleteDevEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDevEndpointResult>() {
            @Override
            public DeleteDevEndpointResult call() throws Exception {
                DeleteDevEndpointResult result = null;

                try {
                    result = executeDeleteDevEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest request) {

        return deleteJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(final DeleteJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler) {
        final DeleteJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteJobResult>() {
            @Override
            public DeleteJobResult call() throws Exception {
                DeleteJobResult result = null;

                try {
                    result = executeDeleteJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteMLTransformResult> deleteMLTransformAsync(DeleteMLTransformRequest request) {

        return deleteMLTransformAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMLTransformResult> deleteMLTransformAsync(final DeleteMLTransformRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMLTransformRequest, DeleteMLTransformResult> asyncHandler) {
        final DeleteMLTransformRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMLTransformResult>() {
            @Override
            public DeleteMLTransformResult call() throws Exception {
                DeleteMLTransformResult result = null;

                try {
                    result = executeDeleteMLTransform(finalRequest);
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
    public java.util.concurrent.Future<DeletePartitionResult> deletePartitionAsync(DeletePartitionRequest request) {

        return deletePartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePartitionResult> deletePartitionAsync(final DeletePartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePartitionRequest, DeletePartitionResult> asyncHandler) {
        final DeletePartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePartitionResult>() {
            @Override
            public DeletePartitionResult call() throws Exception {
                DeletePartitionResult result = null;

                try {
                    result = executeDeletePartition(finalRequest);
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
    public java.util.concurrent.Future<DeletePartitionIndexResult> deletePartitionIndexAsync(DeletePartitionIndexRequest request) {

        return deletePartitionIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePartitionIndexResult> deletePartitionIndexAsync(final DeletePartitionIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePartitionIndexRequest, DeletePartitionIndexResult> asyncHandler) {
        final DeletePartitionIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePartitionIndexResult>() {
            @Override
            public DeletePartitionIndexResult call() throws Exception {
                DeletePartitionIndexResult result = null;

                try {
                    result = executeDeletePartitionIndex(finalRequest);
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
    public java.util.concurrent.Future<DeleteRegistryResult> deleteRegistryAsync(DeleteRegistryRequest request) {

        return deleteRegistryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistryResult> deleteRegistryAsync(final DeleteRegistryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegistryRequest, DeleteRegistryResult> asyncHandler) {
        final DeleteRegistryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegistryResult>() {
            @Override
            public DeleteRegistryResult call() throws Exception {
                DeleteRegistryResult result = null;

                try {
                    result = executeDeleteRegistry(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest request) {

        return deleteSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(final DeleteSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler) {
        final DeleteSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSchemaResult>() {
            @Override
            public DeleteSchemaResult call() throws Exception {
                DeleteSchemaResult result = null;

                try {
                    result = executeDeleteSchema(finalRequest);
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
    public java.util.concurrent.Future<DeleteSchemaVersionsResult> deleteSchemaVersionsAsync(DeleteSchemaVersionsRequest request) {

        return deleteSchemaVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaVersionsResult> deleteSchemaVersionsAsync(final DeleteSchemaVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSchemaVersionsRequest, DeleteSchemaVersionsResult> asyncHandler) {
        final DeleteSchemaVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSchemaVersionsResult>() {
            @Override
            public DeleteSchemaVersionsResult call() throws Exception {
                DeleteSchemaVersionsResult result = null;

                try {
                    result = executeDeleteSchemaVersions(finalRequest);
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
    public java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(DeleteSecurityConfigurationRequest request) {

        return deleteSecurityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(final DeleteSecurityConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSecurityConfigurationRequest, DeleteSecurityConfigurationResult> asyncHandler) {
        final DeleteSecurityConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSecurityConfigurationResult>() {
            @Override
            public DeleteSecurityConfigurationResult call() throws Exception {
                DeleteSecurityConfigurationResult result = null;

                try {
                    result = executeDeleteSecurityConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request) {

        return deleteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(final DeleteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) {
        final DeleteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTableResult>() {
            @Override
            public DeleteTableResult call() throws Exception {
                DeleteTableResult result = null;

                try {
                    result = executeDeleteTable(finalRequest);
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
    public java.util.concurrent.Future<DeleteTableVersionResult> deleteTableVersionAsync(DeleteTableVersionRequest request) {

        return deleteTableVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableVersionResult> deleteTableVersionAsync(final DeleteTableVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTableVersionRequest, DeleteTableVersionResult> asyncHandler) {
        final DeleteTableVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTableVersionResult>() {
            @Override
            public DeleteTableVersionResult call() throws Exception {
                DeleteTableVersionResult result = null;

                try {
                    result = executeDeleteTableVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteTriggerResult> deleteTriggerAsync(DeleteTriggerRequest request) {

        return deleteTriggerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTriggerResult> deleteTriggerAsync(final DeleteTriggerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTriggerRequest, DeleteTriggerResult> asyncHandler) {
        final DeleteTriggerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTriggerResult>() {
            @Override
            public DeleteTriggerResult call() throws Exception {
                DeleteTriggerResult result = null;

                try {
                    result = executeDeleteTrigger(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserDefinedFunctionResult> deleteUserDefinedFunctionAsync(DeleteUserDefinedFunctionRequest request) {

        return deleteUserDefinedFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserDefinedFunctionResult> deleteUserDefinedFunctionAsync(final DeleteUserDefinedFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserDefinedFunctionRequest, DeleteUserDefinedFunctionResult> asyncHandler) {
        final DeleteUserDefinedFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserDefinedFunctionResult>() {
            @Override
            public DeleteUserDefinedFunctionResult call() throws Exception {
                DeleteUserDefinedFunctionResult result = null;

                try {
                    result = executeDeleteUserDefinedFunction(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request) {

        return deleteWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(final DeleteWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler) {
        final DeleteWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkflowResult>() {
            @Override
            public DeleteWorkflowResult call() throws Exception {
                DeleteWorkflowResult result = null;

                try {
                    result = executeDeleteWorkflow(finalRequest);
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
    public java.util.concurrent.Future<GetCatalogImportStatusResult> getCatalogImportStatusAsync(GetCatalogImportStatusRequest request) {

        return getCatalogImportStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCatalogImportStatusResult> getCatalogImportStatusAsync(final GetCatalogImportStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCatalogImportStatusRequest, GetCatalogImportStatusResult> asyncHandler) {
        final GetCatalogImportStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCatalogImportStatusResult>() {
            @Override
            public GetCatalogImportStatusResult call() throws Exception {
                GetCatalogImportStatusResult result = null;

                try {
                    result = executeGetCatalogImportStatus(finalRequest);
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
    public java.util.concurrent.Future<GetClassifierResult> getClassifierAsync(GetClassifierRequest request) {

        return getClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClassifierResult> getClassifierAsync(final GetClassifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClassifierRequest, GetClassifierResult> asyncHandler) {
        final GetClassifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClassifierResult>() {
            @Override
            public GetClassifierResult call() throws Exception {
                GetClassifierResult result = null;

                try {
                    result = executeGetClassifier(finalRequest);
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
    public java.util.concurrent.Future<GetClassifiersResult> getClassifiersAsync(GetClassifiersRequest request) {

        return getClassifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClassifiersResult> getClassifiersAsync(final GetClassifiersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClassifiersRequest, GetClassifiersResult> asyncHandler) {
        final GetClassifiersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClassifiersResult>() {
            @Override
            public GetClassifiersResult call() throws Exception {
                GetClassifiersResult result = null;

                try {
                    result = executeGetClassifiers(finalRequest);
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
    public java.util.concurrent.Future<GetColumnStatisticsForPartitionResult> getColumnStatisticsForPartitionAsync(
            GetColumnStatisticsForPartitionRequest request) {

        return getColumnStatisticsForPartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetColumnStatisticsForPartitionResult> getColumnStatisticsForPartitionAsync(
            final GetColumnStatisticsForPartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetColumnStatisticsForPartitionRequest, GetColumnStatisticsForPartitionResult> asyncHandler) {
        final GetColumnStatisticsForPartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetColumnStatisticsForPartitionResult>() {
            @Override
            public GetColumnStatisticsForPartitionResult call() throws Exception {
                GetColumnStatisticsForPartitionResult result = null;

                try {
                    result = executeGetColumnStatisticsForPartition(finalRequest);
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
    public java.util.concurrent.Future<GetColumnStatisticsForTableResult> getColumnStatisticsForTableAsync(GetColumnStatisticsForTableRequest request) {

        return getColumnStatisticsForTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetColumnStatisticsForTableResult> getColumnStatisticsForTableAsync(final GetColumnStatisticsForTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetColumnStatisticsForTableRequest, GetColumnStatisticsForTableResult> asyncHandler) {
        final GetColumnStatisticsForTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetColumnStatisticsForTableResult>() {
            @Override
            public GetColumnStatisticsForTableResult call() throws Exception {
                GetColumnStatisticsForTableResult result = null;

                try {
                    result = executeGetColumnStatisticsForTable(finalRequest);
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
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest request) {

        return getConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(final GetConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectionRequest, GetConnectionResult> asyncHandler) {
        final GetConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectionResult>() {
            @Override
            public GetConnectionResult call() throws Exception {
                GetConnectionResult result = null;

                try {
                    result = executeGetConnection(finalRequest);
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
    public java.util.concurrent.Future<GetConnectionsResult> getConnectionsAsync(GetConnectionsRequest request) {

        return getConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionsResult> getConnectionsAsync(final GetConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectionsRequest, GetConnectionsResult> asyncHandler) {
        final GetConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectionsResult>() {
            @Override
            public GetConnectionsResult call() throws Exception {
                GetConnectionsResult result = null;

                try {
                    result = executeGetConnections(finalRequest);
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
    public java.util.concurrent.Future<GetCrawlerResult> getCrawlerAsync(GetCrawlerRequest request) {

        return getCrawlerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCrawlerResult> getCrawlerAsync(final GetCrawlerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCrawlerRequest, GetCrawlerResult> asyncHandler) {
        final GetCrawlerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCrawlerResult>() {
            @Override
            public GetCrawlerResult call() throws Exception {
                GetCrawlerResult result = null;

                try {
                    result = executeGetCrawler(finalRequest);
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
    public java.util.concurrent.Future<GetCrawlerMetricsResult> getCrawlerMetricsAsync(GetCrawlerMetricsRequest request) {

        return getCrawlerMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCrawlerMetricsResult> getCrawlerMetricsAsync(final GetCrawlerMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCrawlerMetricsRequest, GetCrawlerMetricsResult> asyncHandler) {
        final GetCrawlerMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCrawlerMetricsResult>() {
            @Override
            public GetCrawlerMetricsResult call() throws Exception {
                GetCrawlerMetricsResult result = null;

                try {
                    result = executeGetCrawlerMetrics(finalRequest);
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
    public java.util.concurrent.Future<GetCrawlersResult> getCrawlersAsync(GetCrawlersRequest request) {

        return getCrawlersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCrawlersResult> getCrawlersAsync(final GetCrawlersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCrawlersRequest, GetCrawlersResult> asyncHandler) {
        final GetCrawlersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCrawlersResult>() {
            @Override
            public GetCrawlersResult call() throws Exception {
                GetCrawlersResult result = null;

                try {
                    result = executeGetCrawlers(finalRequest);
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
    public java.util.concurrent.Future<GetDataCatalogEncryptionSettingsResult> getDataCatalogEncryptionSettingsAsync(
            GetDataCatalogEncryptionSettingsRequest request) {

        return getDataCatalogEncryptionSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataCatalogEncryptionSettingsResult> getDataCatalogEncryptionSettingsAsync(
            final GetDataCatalogEncryptionSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataCatalogEncryptionSettingsRequest, GetDataCatalogEncryptionSettingsResult> asyncHandler) {
        final GetDataCatalogEncryptionSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataCatalogEncryptionSettingsResult>() {
            @Override
            public GetDataCatalogEncryptionSettingsResult call() throws Exception {
                GetDataCatalogEncryptionSettingsResult result = null;

                try {
                    result = executeGetDataCatalogEncryptionSettings(finalRequest);
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
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest request) {

        return getDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(final GetDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatabaseRequest, GetDatabaseResult> asyncHandler) {
        final GetDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatabaseResult>() {
            @Override
            public GetDatabaseResult call() throws Exception {
                GetDatabaseResult result = null;

                try {
                    result = executeGetDatabase(finalRequest);
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
    public java.util.concurrent.Future<GetDatabasesResult> getDatabasesAsync(GetDatabasesRequest request) {

        return getDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatabasesResult> getDatabasesAsync(final GetDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatabasesRequest, GetDatabasesResult> asyncHandler) {
        final GetDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatabasesResult>() {
            @Override
            public GetDatabasesResult call() throws Exception {
                GetDatabasesResult result = null;

                try {
                    result = executeGetDatabases(finalRequest);
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
    public java.util.concurrent.Future<GetDataflowGraphResult> getDataflowGraphAsync(GetDataflowGraphRequest request) {

        return getDataflowGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataflowGraphResult> getDataflowGraphAsync(final GetDataflowGraphRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataflowGraphRequest, GetDataflowGraphResult> asyncHandler) {
        final GetDataflowGraphRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataflowGraphResult>() {
            @Override
            public GetDataflowGraphResult call() throws Exception {
                GetDataflowGraphResult result = null;

                try {
                    result = executeGetDataflowGraph(finalRequest);
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
    public java.util.concurrent.Future<GetDevEndpointResult> getDevEndpointAsync(GetDevEndpointRequest request) {

        return getDevEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevEndpointResult> getDevEndpointAsync(final GetDevEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevEndpointRequest, GetDevEndpointResult> asyncHandler) {
        final GetDevEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevEndpointResult>() {
            @Override
            public GetDevEndpointResult call() throws Exception {
                GetDevEndpointResult result = null;

                try {
                    result = executeGetDevEndpoint(finalRequest);
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
    public java.util.concurrent.Future<GetDevEndpointsResult> getDevEndpointsAsync(GetDevEndpointsRequest request) {

        return getDevEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevEndpointsResult> getDevEndpointsAsync(final GetDevEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevEndpointsRequest, GetDevEndpointsResult> asyncHandler) {
        final GetDevEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevEndpointsResult>() {
            @Override
            public GetDevEndpointsResult call() throws Exception {
                GetDevEndpointsResult result = null;

                try {
                    result = executeGetDevEndpoints(finalRequest);
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
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request) {

        return getJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(final GetJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler) {
        final GetJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobResult>() {
            @Override
            public GetJobResult call() throws Exception {
                GetJobResult result = null;

                try {
                    result = executeGetJob(finalRequest);
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
    public java.util.concurrent.Future<GetJobBookmarkResult> getJobBookmarkAsync(GetJobBookmarkRequest request) {

        return getJobBookmarkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobBookmarkResult> getJobBookmarkAsync(final GetJobBookmarkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobBookmarkRequest, GetJobBookmarkResult> asyncHandler) {
        final GetJobBookmarkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobBookmarkResult>() {
            @Override
            public GetJobBookmarkResult call() throws Exception {
                GetJobBookmarkResult result = null;

                try {
                    result = executeGetJobBookmark(finalRequest);
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
    public java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(GetJobRunRequest request) {

        return getJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(final GetJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobRunRequest, GetJobRunResult> asyncHandler) {
        final GetJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobRunResult>() {
            @Override
            public GetJobRunResult call() throws Exception {
                GetJobRunResult result = null;

                try {
                    result = executeGetJobRun(finalRequest);
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
    public java.util.concurrent.Future<GetJobRunsResult> getJobRunsAsync(GetJobRunsRequest request) {

        return getJobRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobRunsResult> getJobRunsAsync(final GetJobRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobRunsRequest, GetJobRunsResult> asyncHandler) {
        final GetJobRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobRunsResult>() {
            @Override
            public GetJobRunsResult call() throws Exception {
                GetJobRunsResult result = null;

                try {
                    result = executeGetJobRuns(finalRequest);
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
    public java.util.concurrent.Future<GetJobsResult> getJobsAsync(GetJobsRequest request) {

        return getJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobsResult> getJobsAsync(final GetJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobsRequest, GetJobsResult> asyncHandler) {
        final GetJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobsResult>() {
            @Override
            public GetJobsResult call() throws Exception {
                GetJobsResult result = null;

                try {
                    result = executeGetJobs(finalRequest);
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
    public java.util.concurrent.Future<GetMLTaskRunResult> getMLTaskRunAsync(GetMLTaskRunRequest request) {

        return getMLTaskRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLTaskRunResult> getMLTaskRunAsync(final GetMLTaskRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLTaskRunRequest, GetMLTaskRunResult> asyncHandler) {
        final GetMLTaskRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLTaskRunResult>() {
            @Override
            public GetMLTaskRunResult call() throws Exception {
                GetMLTaskRunResult result = null;

                try {
                    result = executeGetMLTaskRun(finalRequest);
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
    public java.util.concurrent.Future<GetMLTaskRunsResult> getMLTaskRunsAsync(GetMLTaskRunsRequest request) {

        return getMLTaskRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLTaskRunsResult> getMLTaskRunsAsync(final GetMLTaskRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLTaskRunsRequest, GetMLTaskRunsResult> asyncHandler) {
        final GetMLTaskRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLTaskRunsResult>() {
            @Override
            public GetMLTaskRunsResult call() throws Exception {
                GetMLTaskRunsResult result = null;

                try {
                    result = executeGetMLTaskRuns(finalRequest);
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
    public java.util.concurrent.Future<GetMLTransformResult> getMLTransformAsync(GetMLTransformRequest request) {

        return getMLTransformAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLTransformResult> getMLTransformAsync(final GetMLTransformRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLTransformRequest, GetMLTransformResult> asyncHandler) {
        final GetMLTransformRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLTransformResult>() {
            @Override
            public GetMLTransformResult call() throws Exception {
                GetMLTransformResult result = null;

                try {
                    result = executeGetMLTransform(finalRequest);
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
    public java.util.concurrent.Future<GetMLTransformsResult> getMLTransformsAsync(GetMLTransformsRequest request) {

        return getMLTransformsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLTransformsResult> getMLTransformsAsync(final GetMLTransformsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLTransformsRequest, GetMLTransformsResult> asyncHandler) {
        final GetMLTransformsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLTransformsResult>() {
            @Override
            public GetMLTransformsResult call() throws Exception {
                GetMLTransformsResult result = null;

                try {
                    result = executeGetMLTransforms(finalRequest);
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
    public java.util.concurrent.Future<GetMappingResult> getMappingAsync(GetMappingRequest request) {

        return getMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMappingResult> getMappingAsync(final GetMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMappingRequest, GetMappingResult> asyncHandler) {
        final GetMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMappingResult>() {
            @Override
            public GetMappingResult call() throws Exception {
                GetMappingResult result = null;

                try {
                    result = executeGetMapping(finalRequest);
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
    public java.util.concurrent.Future<GetPartitionResult> getPartitionAsync(GetPartitionRequest request) {

        return getPartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPartitionResult> getPartitionAsync(final GetPartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPartitionRequest, GetPartitionResult> asyncHandler) {
        final GetPartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPartitionResult>() {
            @Override
            public GetPartitionResult call() throws Exception {
                GetPartitionResult result = null;

                try {
                    result = executeGetPartition(finalRequest);
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
    public java.util.concurrent.Future<GetPartitionIndexesResult> getPartitionIndexesAsync(GetPartitionIndexesRequest request) {

        return getPartitionIndexesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPartitionIndexesResult> getPartitionIndexesAsync(final GetPartitionIndexesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPartitionIndexesRequest, GetPartitionIndexesResult> asyncHandler) {
        final GetPartitionIndexesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPartitionIndexesResult>() {
            @Override
            public GetPartitionIndexesResult call() throws Exception {
                GetPartitionIndexesResult result = null;

                try {
                    result = executeGetPartitionIndexes(finalRequest);
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
    public java.util.concurrent.Future<GetPartitionsResult> getPartitionsAsync(GetPartitionsRequest request) {

        return getPartitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPartitionsResult> getPartitionsAsync(final GetPartitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPartitionsRequest, GetPartitionsResult> asyncHandler) {
        final GetPartitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPartitionsResult>() {
            @Override
            public GetPartitionsResult call() throws Exception {
                GetPartitionsResult result = null;

                try {
                    result = executeGetPartitions(finalRequest);
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
    public java.util.concurrent.Future<GetPlanResult> getPlanAsync(GetPlanRequest request) {

        return getPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlanResult> getPlanAsync(final GetPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPlanRequest, GetPlanResult> asyncHandler) {
        final GetPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPlanResult>() {
            @Override
            public GetPlanResult call() throws Exception {
                GetPlanResult result = null;

                try {
                    result = executeGetPlan(finalRequest);
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
    public java.util.concurrent.Future<GetRegistryResult> getRegistryAsync(GetRegistryRequest request) {

        return getRegistryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegistryResult> getRegistryAsync(final GetRegistryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegistryRequest, GetRegistryResult> asyncHandler) {
        final GetRegistryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRegistryResult>() {
            @Override
            public GetRegistryResult call() throws Exception {
                GetRegistryResult result = null;

                try {
                    result = executeGetRegistry(finalRequest);
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
    public java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest request) {

        return getResourcePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(final GetResourcePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePoliciesRequest, GetResourcePoliciesResult> asyncHandler) {
        final GetResourcePoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePoliciesResult>() {
            @Override
            public GetResourcePoliciesResult call() throws Exception {
                GetResourcePoliciesResult result = null;

                try {
                    result = executeGetResourcePolicies(finalRequest);
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
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request) {

        return getResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(final GetResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler) {
        final GetResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePolicyResult>() {
            @Override
            public GetResourcePolicyResult call() throws Exception {
                GetResourcePolicyResult result = null;

                try {
                    result = executeGetResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest request) {

        return getSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(final GetSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaRequest, GetSchemaResult> asyncHandler) {
        final GetSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaResult>() {
            @Override
            public GetSchemaResult call() throws Exception {
                GetSchemaResult result = null;

                try {
                    result = executeGetSchema(finalRequest);
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
    public java.util.concurrent.Future<GetSchemaByDefinitionResult> getSchemaByDefinitionAsync(GetSchemaByDefinitionRequest request) {

        return getSchemaByDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaByDefinitionResult> getSchemaByDefinitionAsync(final GetSchemaByDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaByDefinitionRequest, GetSchemaByDefinitionResult> asyncHandler) {
        final GetSchemaByDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaByDefinitionResult>() {
            @Override
            public GetSchemaByDefinitionResult call() throws Exception {
                GetSchemaByDefinitionResult result = null;

                try {
                    result = executeGetSchemaByDefinition(finalRequest);
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
    public java.util.concurrent.Future<GetSchemaVersionResult> getSchemaVersionAsync(GetSchemaVersionRequest request) {

        return getSchemaVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaVersionResult> getSchemaVersionAsync(final GetSchemaVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaVersionRequest, GetSchemaVersionResult> asyncHandler) {
        final GetSchemaVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaVersionResult>() {
            @Override
            public GetSchemaVersionResult call() throws Exception {
                GetSchemaVersionResult result = null;

                try {
                    result = executeGetSchemaVersion(finalRequest);
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
    public java.util.concurrent.Future<GetSchemaVersionsDiffResult> getSchemaVersionsDiffAsync(GetSchemaVersionsDiffRequest request) {

        return getSchemaVersionsDiffAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaVersionsDiffResult> getSchemaVersionsDiffAsync(final GetSchemaVersionsDiffRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaVersionsDiffRequest, GetSchemaVersionsDiffResult> asyncHandler) {
        final GetSchemaVersionsDiffRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaVersionsDiffResult>() {
            @Override
            public GetSchemaVersionsDiffResult call() throws Exception {
                GetSchemaVersionsDiffResult result = null;

                try {
                    result = executeGetSchemaVersionsDiff(finalRequest);
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
    public java.util.concurrent.Future<GetSecurityConfigurationResult> getSecurityConfigurationAsync(GetSecurityConfigurationRequest request) {

        return getSecurityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityConfigurationResult> getSecurityConfigurationAsync(final GetSecurityConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSecurityConfigurationRequest, GetSecurityConfigurationResult> asyncHandler) {
        final GetSecurityConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSecurityConfigurationResult>() {
            @Override
            public GetSecurityConfigurationResult call() throws Exception {
                GetSecurityConfigurationResult result = null;

                try {
                    result = executeGetSecurityConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetSecurityConfigurationsResult> getSecurityConfigurationsAsync(GetSecurityConfigurationsRequest request) {

        return getSecurityConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityConfigurationsResult> getSecurityConfigurationsAsync(final GetSecurityConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSecurityConfigurationsRequest, GetSecurityConfigurationsResult> asyncHandler) {
        final GetSecurityConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSecurityConfigurationsResult>() {
            @Override
            public GetSecurityConfigurationsResult call() throws Exception {
                GetSecurityConfigurationsResult result = null;

                try {
                    result = executeGetSecurityConfigurations(finalRequest);
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
    public java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest request) {

        return getTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableResult> getTableAsync(final GetTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTableRequest, GetTableResult> asyncHandler) {
        final GetTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTableResult>() {
            @Override
            public GetTableResult call() throws Exception {
                GetTableResult result = null;

                try {
                    result = executeGetTable(finalRequest);
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
    public java.util.concurrent.Future<GetTableVersionResult> getTableVersionAsync(GetTableVersionRequest request) {

        return getTableVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableVersionResult> getTableVersionAsync(final GetTableVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTableVersionRequest, GetTableVersionResult> asyncHandler) {
        final GetTableVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTableVersionResult>() {
            @Override
            public GetTableVersionResult call() throws Exception {
                GetTableVersionResult result = null;

                try {
                    result = executeGetTableVersion(finalRequest);
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
    public java.util.concurrent.Future<GetTableVersionsResult> getTableVersionsAsync(GetTableVersionsRequest request) {

        return getTableVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableVersionsResult> getTableVersionsAsync(final GetTableVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTableVersionsRequest, GetTableVersionsResult> asyncHandler) {
        final GetTableVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTableVersionsResult>() {
            @Override
            public GetTableVersionsResult call() throws Exception {
                GetTableVersionsResult result = null;

                try {
                    result = executeGetTableVersions(finalRequest);
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
    public java.util.concurrent.Future<GetTablesResult> getTablesAsync(GetTablesRequest request) {

        return getTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTablesResult> getTablesAsync(final GetTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTablesRequest, GetTablesResult> asyncHandler) {
        final GetTablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTablesResult>() {
            @Override
            public GetTablesResult call() throws Exception {
                GetTablesResult result = null;

                try {
                    result = executeGetTables(finalRequest);
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
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest request) {

        return getTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(final GetTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler) {
        final GetTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTagsResult>() {
            @Override
            public GetTagsResult call() throws Exception {
                GetTagsResult result = null;

                try {
                    result = executeGetTags(finalRequest);
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
    public java.util.concurrent.Future<GetTriggerResult> getTriggerAsync(GetTriggerRequest request) {

        return getTriggerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTriggerResult> getTriggerAsync(final GetTriggerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTriggerRequest, GetTriggerResult> asyncHandler) {
        final GetTriggerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTriggerResult>() {
            @Override
            public GetTriggerResult call() throws Exception {
                GetTriggerResult result = null;

                try {
                    result = executeGetTrigger(finalRequest);
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
    public java.util.concurrent.Future<GetTriggersResult> getTriggersAsync(GetTriggersRequest request) {

        return getTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTriggersResult> getTriggersAsync(final GetTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTriggersRequest, GetTriggersResult> asyncHandler) {
        final GetTriggersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTriggersResult>() {
            @Override
            public GetTriggersResult call() throws Exception {
                GetTriggersResult result = null;

                try {
                    result = executeGetTriggers(finalRequest);
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
    public java.util.concurrent.Future<GetUserDefinedFunctionResult> getUserDefinedFunctionAsync(GetUserDefinedFunctionRequest request) {

        return getUserDefinedFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserDefinedFunctionResult> getUserDefinedFunctionAsync(final GetUserDefinedFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserDefinedFunctionRequest, GetUserDefinedFunctionResult> asyncHandler) {
        final GetUserDefinedFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserDefinedFunctionResult>() {
            @Override
            public GetUserDefinedFunctionResult call() throws Exception {
                GetUserDefinedFunctionResult result = null;

                try {
                    result = executeGetUserDefinedFunction(finalRequest);
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
    public java.util.concurrent.Future<GetUserDefinedFunctionsResult> getUserDefinedFunctionsAsync(GetUserDefinedFunctionsRequest request) {

        return getUserDefinedFunctionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserDefinedFunctionsResult> getUserDefinedFunctionsAsync(final GetUserDefinedFunctionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserDefinedFunctionsRequest, GetUserDefinedFunctionsResult> asyncHandler) {
        final GetUserDefinedFunctionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserDefinedFunctionsResult>() {
            @Override
            public GetUserDefinedFunctionsResult call() throws Exception {
                GetUserDefinedFunctionsResult result = null;

                try {
                    result = executeGetUserDefinedFunctions(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest request) {

        return getWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(final GetWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler) {
        final GetWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowResult>() {
            @Override
            public GetWorkflowResult call() throws Exception {
                GetWorkflowResult result = null;

                try {
                    result = executeGetWorkflow(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowRunResult> getWorkflowRunAsync(GetWorkflowRunRequest request) {

        return getWorkflowRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowRunResult> getWorkflowRunAsync(final GetWorkflowRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowRunRequest, GetWorkflowRunResult> asyncHandler) {
        final GetWorkflowRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowRunResult>() {
            @Override
            public GetWorkflowRunResult call() throws Exception {
                GetWorkflowRunResult result = null;

                try {
                    result = executeGetWorkflowRun(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowRunPropertiesResult> getWorkflowRunPropertiesAsync(GetWorkflowRunPropertiesRequest request) {

        return getWorkflowRunPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowRunPropertiesResult> getWorkflowRunPropertiesAsync(final GetWorkflowRunPropertiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowRunPropertiesRequest, GetWorkflowRunPropertiesResult> asyncHandler) {
        final GetWorkflowRunPropertiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowRunPropertiesResult>() {
            @Override
            public GetWorkflowRunPropertiesResult call() throws Exception {
                GetWorkflowRunPropertiesResult result = null;

                try {
                    result = executeGetWorkflowRunProperties(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowRunsResult> getWorkflowRunsAsync(GetWorkflowRunsRequest request) {

        return getWorkflowRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowRunsResult> getWorkflowRunsAsync(final GetWorkflowRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowRunsRequest, GetWorkflowRunsResult> asyncHandler) {
        final GetWorkflowRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowRunsResult>() {
            @Override
            public GetWorkflowRunsResult call() throws Exception {
                GetWorkflowRunsResult result = null;

                try {
                    result = executeGetWorkflowRuns(finalRequest);
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
    public java.util.concurrent.Future<ImportCatalogToGlueResult> importCatalogToGlueAsync(ImportCatalogToGlueRequest request) {

        return importCatalogToGlueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportCatalogToGlueResult> importCatalogToGlueAsync(final ImportCatalogToGlueRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportCatalogToGlueRequest, ImportCatalogToGlueResult> asyncHandler) {
        final ImportCatalogToGlueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportCatalogToGlueResult>() {
            @Override
            public ImportCatalogToGlueResult call() throws Exception {
                ImportCatalogToGlueResult result = null;

                try {
                    result = executeImportCatalogToGlue(finalRequest);
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
    public java.util.concurrent.Future<ListCrawlersResult> listCrawlersAsync(ListCrawlersRequest request) {

        return listCrawlersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCrawlersResult> listCrawlersAsync(final ListCrawlersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCrawlersRequest, ListCrawlersResult> asyncHandler) {
        final ListCrawlersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCrawlersResult>() {
            @Override
            public ListCrawlersResult call() throws Exception {
                ListCrawlersResult result = null;

                try {
                    result = executeListCrawlers(finalRequest);
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
    public java.util.concurrent.Future<ListDevEndpointsResult> listDevEndpointsAsync(ListDevEndpointsRequest request) {

        return listDevEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevEndpointsResult> listDevEndpointsAsync(final ListDevEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevEndpointsRequest, ListDevEndpointsResult> asyncHandler) {
        final ListDevEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevEndpointsResult>() {
            @Override
            public ListDevEndpointsResult call() throws Exception {
                ListDevEndpointsResult result = null;

                try {
                    result = executeListDevEndpoints(finalRequest);
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
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {
        final ListJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result = null;

                try {
                    result = executeListJobs(finalRequest);
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
    public java.util.concurrent.Future<ListMLTransformsResult> listMLTransformsAsync(ListMLTransformsRequest request) {

        return listMLTransformsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMLTransformsResult> listMLTransformsAsync(final ListMLTransformsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMLTransformsRequest, ListMLTransformsResult> asyncHandler) {
        final ListMLTransformsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMLTransformsResult>() {
            @Override
            public ListMLTransformsResult call() throws Exception {
                ListMLTransformsResult result = null;

                try {
                    result = executeListMLTransforms(finalRequest);
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
    public java.util.concurrent.Future<ListRegistriesResult> listRegistriesAsync(ListRegistriesRequest request) {

        return listRegistriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegistriesResult> listRegistriesAsync(final ListRegistriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRegistriesRequest, ListRegistriesResult> asyncHandler) {
        final ListRegistriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRegistriesResult>() {
            @Override
            public ListRegistriesResult call() throws Exception {
                ListRegistriesResult result = null;

                try {
                    result = executeListRegistries(finalRequest);
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
    public java.util.concurrent.Future<ListSchemaVersionsResult> listSchemaVersionsAsync(ListSchemaVersionsRequest request) {

        return listSchemaVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemaVersionsResult> listSchemaVersionsAsync(final ListSchemaVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchemaVersionsRequest, ListSchemaVersionsResult> asyncHandler) {
        final ListSchemaVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchemaVersionsResult>() {
            @Override
            public ListSchemaVersionsResult call() throws Exception {
                ListSchemaVersionsResult result = null;

                try {
                    result = executeListSchemaVersions(finalRequest);
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
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest request) {

        return listSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(final ListSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler) {
        final ListSchemasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchemasResult>() {
            @Override
            public ListSchemasResult call() throws Exception {
                ListSchemasResult result = null;

                try {
                    result = executeListSchemas(finalRequest);
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
    public java.util.concurrent.Future<ListTriggersResult> listTriggersAsync(ListTriggersRequest request) {

        return listTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTriggersResult> listTriggersAsync(final ListTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTriggersRequest, ListTriggersResult> asyncHandler) {
        final ListTriggersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTriggersResult>() {
            @Override
            public ListTriggersResult call() throws Exception {
                ListTriggersResult result = null;

                try {
                    result = executeListTriggers(finalRequest);
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
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request) {

        return listWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(final ListWorkflowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler) {
        final ListWorkflowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkflowsResult>() {
            @Override
            public ListWorkflowsResult call() throws Exception {
                ListWorkflowsResult result = null;

                try {
                    result = executeListWorkflows(finalRequest);
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
    public java.util.concurrent.Future<PutDataCatalogEncryptionSettingsResult> putDataCatalogEncryptionSettingsAsync(
            PutDataCatalogEncryptionSettingsRequest request) {

        return putDataCatalogEncryptionSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDataCatalogEncryptionSettingsResult> putDataCatalogEncryptionSettingsAsync(
            final PutDataCatalogEncryptionSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDataCatalogEncryptionSettingsRequest, PutDataCatalogEncryptionSettingsResult> asyncHandler) {
        final PutDataCatalogEncryptionSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDataCatalogEncryptionSettingsResult>() {
            @Override
            public PutDataCatalogEncryptionSettingsResult call() throws Exception {
                PutDataCatalogEncryptionSettingsResult result = null;

                try {
                    result = executePutDataCatalogEncryptionSettings(finalRequest);
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
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(final PutResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {
        final PutResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePolicyResult>() {
            @Override
            public PutResourcePolicyResult call() throws Exception {
                PutResourcePolicyResult result = null;

                try {
                    result = executePutResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<PutSchemaVersionMetadataResult> putSchemaVersionMetadataAsync(PutSchemaVersionMetadataRequest request) {

        return putSchemaVersionMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSchemaVersionMetadataResult> putSchemaVersionMetadataAsync(final PutSchemaVersionMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSchemaVersionMetadataRequest, PutSchemaVersionMetadataResult> asyncHandler) {
        final PutSchemaVersionMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSchemaVersionMetadataResult>() {
            @Override
            public PutSchemaVersionMetadataResult call() throws Exception {
                PutSchemaVersionMetadataResult result = null;

                try {
                    result = executePutSchemaVersionMetadata(finalRequest);
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
    public java.util.concurrent.Future<PutWorkflowRunPropertiesResult> putWorkflowRunPropertiesAsync(PutWorkflowRunPropertiesRequest request) {

        return putWorkflowRunPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutWorkflowRunPropertiesResult> putWorkflowRunPropertiesAsync(final PutWorkflowRunPropertiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutWorkflowRunPropertiesRequest, PutWorkflowRunPropertiesResult> asyncHandler) {
        final PutWorkflowRunPropertiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutWorkflowRunPropertiesResult>() {
            @Override
            public PutWorkflowRunPropertiesResult call() throws Exception {
                PutWorkflowRunPropertiesResult result = null;

                try {
                    result = executePutWorkflowRunProperties(finalRequest);
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
    public java.util.concurrent.Future<QuerySchemaVersionMetadataResult> querySchemaVersionMetadataAsync(QuerySchemaVersionMetadataRequest request) {

        return querySchemaVersionMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QuerySchemaVersionMetadataResult> querySchemaVersionMetadataAsync(final QuerySchemaVersionMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<QuerySchemaVersionMetadataRequest, QuerySchemaVersionMetadataResult> asyncHandler) {
        final QuerySchemaVersionMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<QuerySchemaVersionMetadataResult>() {
            @Override
            public QuerySchemaVersionMetadataResult call() throws Exception {
                QuerySchemaVersionMetadataResult result = null;

                try {
                    result = executeQuerySchemaVersionMetadata(finalRequest);
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
    public java.util.concurrent.Future<RegisterSchemaVersionResult> registerSchemaVersionAsync(RegisterSchemaVersionRequest request) {

        return registerSchemaVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterSchemaVersionResult> registerSchemaVersionAsync(final RegisterSchemaVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterSchemaVersionRequest, RegisterSchemaVersionResult> asyncHandler) {
        final RegisterSchemaVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterSchemaVersionResult>() {
            @Override
            public RegisterSchemaVersionResult call() throws Exception {
                RegisterSchemaVersionResult result = null;

                try {
                    result = executeRegisterSchemaVersion(finalRequest);
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
    public java.util.concurrent.Future<RemoveSchemaVersionMetadataResult> removeSchemaVersionMetadataAsync(RemoveSchemaVersionMetadataRequest request) {

        return removeSchemaVersionMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveSchemaVersionMetadataResult> removeSchemaVersionMetadataAsync(final RemoveSchemaVersionMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveSchemaVersionMetadataRequest, RemoveSchemaVersionMetadataResult> asyncHandler) {
        final RemoveSchemaVersionMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveSchemaVersionMetadataResult>() {
            @Override
            public RemoveSchemaVersionMetadataResult call() throws Exception {
                RemoveSchemaVersionMetadataResult result = null;

                try {
                    result = executeRemoveSchemaVersionMetadata(finalRequest);
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
    public java.util.concurrent.Future<ResetJobBookmarkResult> resetJobBookmarkAsync(ResetJobBookmarkRequest request) {

        return resetJobBookmarkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetJobBookmarkResult> resetJobBookmarkAsync(final ResetJobBookmarkRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetJobBookmarkRequest, ResetJobBookmarkResult> asyncHandler) {
        final ResetJobBookmarkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetJobBookmarkResult>() {
            @Override
            public ResetJobBookmarkResult call() throws Exception {
                ResetJobBookmarkResult result = null;

                try {
                    result = executeResetJobBookmark(finalRequest);
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
    public java.util.concurrent.Future<ResumeWorkflowRunResult> resumeWorkflowRunAsync(ResumeWorkflowRunRequest request) {

        return resumeWorkflowRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeWorkflowRunResult> resumeWorkflowRunAsync(final ResumeWorkflowRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeWorkflowRunRequest, ResumeWorkflowRunResult> asyncHandler) {
        final ResumeWorkflowRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResumeWorkflowRunResult>() {
            @Override
            public ResumeWorkflowRunResult call() throws Exception {
                ResumeWorkflowRunResult result = null;

                try {
                    result = executeResumeWorkflowRun(finalRequest);
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
    public java.util.concurrent.Future<SearchTablesResult> searchTablesAsync(SearchTablesRequest request) {

        return searchTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchTablesResult> searchTablesAsync(final SearchTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchTablesRequest, SearchTablesResult> asyncHandler) {
        final SearchTablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchTablesResult>() {
            @Override
            public SearchTablesResult call() throws Exception {
                SearchTablesResult result = null;

                try {
                    result = executeSearchTables(finalRequest);
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
    public java.util.concurrent.Future<StartCrawlerResult> startCrawlerAsync(StartCrawlerRequest request) {

        return startCrawlerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCrawlerResult> startCrawlerAsync(final StartCrawlerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCrawlerRequest, StartCrawlerResult> asyncHandler) {
        final StartCrawlerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCrawlerResult>() {
            @Override
            public StartCrawlerResult call() throws Exception {
                StartCrawlerResult result = null;

                try {
                    result = executeStartCrawler(finalRequest);
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
    public java.util.concurrent.Future<StartCrawlerScheduleResult> startCrawlerScheduleAsync(StartCrawlerScheduleRequest request) {

        return startCrawlerScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCrawlerScheduleResult> startCrawlerScheduleAsync(final StartCrawlerScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCrawlerScheduleRequest, StartCrawlerScheduleResult> asyncHandler) {
        final StartCrawlerScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCrawlerScheduleResult>() {
            @Override
            public StartCrawlerScheduleResult call() throws Exception {
                StartCrawlerScheduleResult result = null;

                try {
                    result = executeStartCrawlerSchedule(finalRequest);
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
    public java.util.concurrent.Future<StartExportLabelsTaskRunResult> startExportLabelsTaskRunAsync(StartExportLabelsTaskRunRequest request) {

        return startExportLabelsTaskRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExportLabelsTaskRunResult> startExportLabelsTaskRunAsync(final StartExportLabelsTaskRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartExportLabelsTaskRunRequest, StartExportLabelsTaskRunResult> asyncHandler) {
        final StartExportLabelsTaskRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartExportLabelsTaskRunResult>() {
            @Override
            public StartExportLabelsTaskRunResult call() throws Exception {
                StartExportLabelsTaskRunResult result = null;

                try {
                    result = executeStartExportLabelsTaskRun(finalRequest);
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
    public java.util.concurrent.Future<StartImportLabelsTaskRunResult> startImportLabelsTaskRunAsync(StartImportLabelsTaskRunRequest request) {

        return startImportLabelsTaskRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImportLabelsTaskRunResult> startImportLabelsTaskRunAsync(final StartImportLabelsTaskRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartImportLabelsTaskRunRequest, StartImportLabelsTaskRunResult> asyncHandler) {
        final StartImportLabelsTaskRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartImportLabelsTaskRunResult>() {
            @Override
            public StartImportLabelsTaskRunResult call() throws Exception {
                StartImportLabelsTaskRunResult result = null;

                try {
                    result = executeStartImportLabelsTaskRun(finalRequest);
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
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest request) {

        return startJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(final StartJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler) {
        final StartJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartJobRunResult>() {
            @Override
            public StartJobRunResult call() throws Exception {
                StartJobRunResult result = null;

                try {
                    result = executeStartJobRun(finalRequest);
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
    public java.util.concurrent.Future<StartMLEvaluationTaskRunResult> startMLEvaluationTaskRunAsync(StartMLEvaluationTaskRunRequest request) {

        return startMLEvaluationTaskRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMLEvaluationTaskRunResult> startMLEvaluationTaskRunAsync(final StartMLEvaluationTaskRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMLEvaluationTaskRunRequest, StartMLEvaluationTaskRunResult> asyncHandler) {
        final StartMLEvaluationTaskRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMLEvaluationTaskRunResult>() {
            @Override
            public StartMLEvaluationTaskRunResult call() throws Exception {
                StartMLEvaluationTaskRunResult result = null;

                try {
                    result = executeStartMLEvaluationTaskRun(finalRequest);
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
    public java.util.concurrent.Future<StartMLLabelingSetGenerationTaskRunResult> startMLLabelingSetGenerationTaskRunAsync(
            StartMLLabelingSetGenerationTaskRunRequest request) {

        return startMLLabelingSetGenerationTaskRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMLLabelingSetGenerationTaskRunResult> startMLLabelingSetGenerationTaskRunAsync(
            final StartMLLabelingSetGenerationTaskRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMLLabelingSetGenerationTaskRunRequest, StartMLLabelingSetGenerationTaskRunResult> asyncHandler) {
        final StartMLLabelingSetGenerationTaskRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMLLabelingSetGenerationTaskRunResult>() {
            @Override
            public StartMLLabelingSetGenerationTaskRunResult call() throws Exception {
                StartMLLabelingSetGenerationTaskRunResult result = null;

                try {
                    result = executeStartMLLabelingSetGenerationTaskRun(finalRequest);
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
    public java.util.concurrent.Future<StartTriggerResult> startTriggerAsync(StartTriggerRequest request) {

        return startTriggerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTriggerResult> startTriggerAsync(final StartTriggerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTriggerRequest, StartTriggerResult> asyncHandler) {
        final StartTriggerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTriggerResult>() {
            @Override
            public StartTriggerResult call() throws Exception {
                StartTriggerResult result = null;

                try {
                    result = executeStartTrigger(finalRequest);
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
    public java.util.concurrent.Future<StartWorkflowRunResult> startWorkflowRunAsync(StartWorkflowRunRequest request) {

        return startWorkflowRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartWorkflowRunResult> startWorkflowRunAsync(final StartWorkflowRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartWorkflowRunRequest, StartWorkflowRunResult> asyncHandler) {
        final StartWorkflowRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartWorkflowRunResult>() {
            @Override
            public StartWorkflowRunResult call() throws Exception {
                StartWorkflowRunResult result = null;

                try {
                    result = executeStartWorkflowRun(finalRequest);
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
    public java.util.concurrent.Future<StopCrawlerResult> stopCrawlerAsync(StopCrawlerRequest request) {

        return stopCrawlerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCrawlerResult> stopCrawlerAsync(final StopCrawlerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopCrawlerRequest, StopCrawlerResult> asyncHandler) {
        final StopCrawlerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopCrawlerResult>() {
            @Override
            public StopCrawlerResult call() throws Exception {
                StopCrawlerResult result = null;

                try {
                    result = executeStopCrawler(finalRequest);
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
    public java.util.concurrent.Future<StopCrawlerScheduleResult> stopCrawlerScheduleAsync(StopCrawlerScheduleRequest request) {

        return stopCrawlerScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCrawlerScheduleResult> stopCrawlerScheduleAsync(final StopCrawlerScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopCrawlerScheduleRequest, StopCrawlerScheduleResult> asyncHandler) {
        final StopCrawlerScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopCrawlerScheduleResult>() {
            @Override
            public StopCrawlerScheduleResult call() throws Exception {
                StopCrawlerScheduleResult result = null;

                try {
                    result = executeStopCrawlerSchedule(finalRequest);
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
    public java.util.concurrent.Future<StopTriggerResult> stopTriggerAsync(StopTriggerRequest request) {

        return stopTriggerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTriggerResult> stopTriggerAsync(final StopTriggerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTriggerRequest, StopTriggerResult> asyncHandler) {
        final StopTriggerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTriggerResult>() {
            @Override
            public StopTriggerResult call() throws Exception {
                StopTriggerResult result = null;

                try {
                    result = executeStopTrigger(finalRequest);
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
    public java.util.concurrent.Future<StopWorkflowRunResult> stopWorkflowRunAsync(StopWorkflowRunRequest request) {

        return stopWorkflowRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopWorkflowRunResult> stopWorkflowRunAsync(final StopWorkflowRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopWorkflowRunRequest, StopWorkflowRunResult> asyncHandler) {
        final StopWorkflowRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopWorkflowRunResult>() {
            @Override
            public StopWorkflowRunResult call() throws Exception {
                StopWorkflowRunResult result = null;

                try {
                    result = executeStopWorkflowRun(finalRequest);
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
    public java.util.concurrent.Future<UpdateClassifierResult> updateClassifierAsync(UpdateClassifierRequest request) {

        return updateClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClassifierResult> updateClassifierAsync(final UpdateClassifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClassifierRequest, UpdateClassifierResult> asyncHandler) {
        final UpdateClassifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClassifierResult>() {
            @Override
            public UpdateClassifierResult call() throws Exception {
                UpdateClassifierResult result = null;

                try {
                    result = executeUpdateClassifier(finalRequest);
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
    public java.util.concurrent.Future<UpdateColumnStatisticsForPartitionResult> updateColumnStatisticsForPartitionAsync(
            UpdateColumnStatisticsForPartitionRequest request) {

        return updateColumnStatisticsForPartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateColumnStatisticsForPartitionResult> updateColumnStatisticsForPartitionAsync(
            final UpdateColumnStatisticsForPartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateColumnStatisticsForPartitionRequest, UpdateColumnStatisticsForPartitionResult> asyncHandler) {
        final UpdateColumnStatisticsForPartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateColumnStatisticsForPartitionResult>() {
            @Override
            public UpdateColumnStatisticsForPartitionResult call() throws Exception {
                UpdateColumnStatisticsForPartitionResult result = null;

                try {
                    result = executeUpdateColumnStatisticsForPartition(finalRequest);
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
    public java.util.concurrent.Future<UpdateColumnStatisticsForTableResult> updateColumnStatisticsForTableAsync(UpdateColumnStatisticsForTableRequest request) {

        return updateColumnStatisticsForTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateColumnStatisticsForTableResult> updateColumnStatisticsForTableAsync(
            final UpdateColumnStatisticsForTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateColumnStatisticsForTableRequest, UpdateColumnStatisticsForTableResult> asyncHandler) {
        final UpdateColumnStatisticsForTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateColumnStatisticsForTableResult>() {
            @Override
            public UpdateColumnStatisticsForTableResult call() throws Exception {
                UpdateColumnStatisticsForTableResult result = null;

                try {
                    result = executeUpdateColumnStatisticsForTable(finalRequest);
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
    public java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(UpdateConnectionRequest request) {

        return updateConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(final UpdateConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResult> asyncHandler) {
        final UpdateConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConnectionResult>() {
            @Override
            public UpdateConnectionResult call() throws Exception {
                UpdateConnectionResult result = null;

                try {
                    result = executeUpdateConnection(finalRequest);
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
    public java.util.concurrent.Future<UpdateCrawlerResult> updateCrawlerAsync(UpdateCrawlerRequest request) {

        return updateCrawlerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCrawlerResult> updateCrawlerAsync(final UpdateCrawlerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCrawlerRequest, UpdateCrawlerResult> asyncHandler) {
        final UpdateCrawlerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCrawlerResult>() {
            @Override
            public UpdateCrawlerResult call() throws Exception {
                UpdateCrawlerResult result = null;

                try {
                    result = executeUpdateCrawler(finalRequest);
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
    public java.util.concurrent.Future<UpdateCrawlerScheduleResult> updateCrawlerScheduleAsync(UpdateCrawlerScheduleRequest request) {

        return updateCrawlerScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCrawlerScheduleResult> updateCrawlerScheduleAsync(final UpdateCrawlerScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCrawlerScheduleRequest, UpdateCrawlerScheduleResult> asyncHandler) {
        final UpdateCrawlerScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCrawlerScheduleResult>() {
            @Override
            public UpdateCrawlerScheduleResult call() throws Exception {
                UpdateCrawlerScheduleResult result = null;

                try {
                    result = executeUpdateCrawlerSchedule(finalRequest);
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
    public java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(UpdateDatabaseRequest request) {

        return updateDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(final UpdateDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResult> asyncHandler) {
        final UpdateDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatabaseResult>() {
            @Override
            public UpdateDatabaseResult call() throws Exception {
                UpdateDatabaseResult result = null;

                try {
                    result = executeUpdateDatabase(finalRequest);
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
    public java.util.concurrent.Future<UpdateDevEndpointResult> updateDevEndpointAsync(UpdateDevEndpointRequest request) {

        return updateDevEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDevEndpointResult> updateDevEndpointAsync(final UpdateDevEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDevEndpointRequest, UpdateDevEndpointResult> asyncHandler) {
        final UpdateDevEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDevEndpointResult>() {
            @Override
            public UpdateDevEndpointResult call() throws Exception {
                UpdateDevEndpointResult result = null;

                try {
                    result = executeUpdateDevEndpoint(finalRequest);
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
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest request) {

        return updateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(final UpdateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler) {
        final UpdateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateJobResult>() {
            @Override
            public UpdateJobResult call() throws Exception {
                UpdateJobResult result = null;

                try {
                    result = executeUpdateJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateMLTransformResult> updateMLTransformAsync(UpdateMLTransformRequest request) {

        return updateMLTransformAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMLTransformResult> updateMLTransformAsync(final UpdateMLTransformRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMLTransformRequest, UpdateMLTransformResult> asyncHandler) {
        final UpdateMLTransformRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMLTransformResult>() {
            @Override
            public UpdateMLTransformResult call() throws Exception {
                UpdateMLTransformResult result = null;

                try {
                    result = executeUpdateMLTransform(finalRequest);
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
    public java.util.concurrent.Future<UpdatePartitionResult> updatePartitionAsync(UpdatePartitionRequest request) {

        return updatePartitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePartitionResult> updatePartitionAsync(final UpdatePartitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePartitionRequest, UpdatePartitionResult> asyncHandler) {
        final UpdatePartitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePartitionResult>() {
            @Override
            public UpdatePartitionResult call() throws Exception {
                UpdatePartitionResult result = null;

                try {
                    result = executeUpdatePartition(finalRequest);
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
    public java.util.concurrent.Future<UpdateRegistryResult> updateRegistryAsync(UpdateRegistryRequest request) {

        return updateRegistryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRegistryResult> updateRegistryAsync(final UpdateRegistryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRegistryRequest, UpdateRegistryResult> asyncHandler) {
        final UpdateRegistryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRegistryResult>() {
            @Override
            public UpdateRegistryResult call() throws Exception {
                UpdateRegistryResult result = null;

                try {
                    result = executeUpdateRegistry(finalRequest);
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
    public java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(UpdateSchemaRequest request) {

        return updateSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(final UpdateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSchemaRequest, UpdateSchemaResult> asyncHandler) {
        final UpdateSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSchemaResult>() {
            @Override
            public UpdateSchemaResult call() throws Exception {
                UpdateSchemaResult result = null;

                try {
                    result = executeUpdateSchema(finalRequest);
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
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request) {

        return updateTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(final UpdateTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) {
        final UpdateTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTableResult>() {
            @Override
            public UpdateTableResult call() throws Exception {
                UpdateTableResult result = null;

                try {
                    result = executeUpdateTable(finalRequest);
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
    public java.util.concurrent.Future<UpdateTriggerResult> updateTriggerAsync(UpdateTriggerRequest request) {

        return updateTriggerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTriggerResult> updateTriggerAsync(final UpdateTriggerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTriggerRequest, UpdateTriggerResult> asyncHandler) {
        final UpdateTriggerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTriggerResult>() {
            @Override
            public UpdateTriggerResult call() throws Exception {
                UpdateTriggerResult result = null;

                try {
                    result = executeUpdateTrigger(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserDefinedFunctionResult> updateUserDefinedFunctionAsync(UpdateUserDefinedFunctionRequest request) {

        return updateUserDefinedFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserDefinedFunctionResult> updateUserDefinedFunctionAsync(final UpdateUserDefinedFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserDefinedFunctionRequest, UpdateUserDefinedFunctionResult> asyncHandler) {
        final UpdateUserDefinedFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserDefinedFunctionResult>() {
            @Override
            public UpdateUserDefinedFunctionResult call() throws Exception {
                UpdateUserDefinedFunctionResult result = null;

                try {
                    result = executeUpdateUserDefinedFunction(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest request) {

        return updateWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(final UpdateWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkflowRequest, UpdateWorkflowResult> asyncHandler) {
        final UpdateWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkflowResult>() {
            @Override
            public UpdateWorkflowResult call() throws Exception {
                UpdateWorkflowResult result = null;

                try {
                    result = executeUpdateWorkflow(finalRequest);
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
