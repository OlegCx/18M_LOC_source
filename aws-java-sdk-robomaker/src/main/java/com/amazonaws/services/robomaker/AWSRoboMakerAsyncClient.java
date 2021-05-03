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
package com.amazonaws.services.robomaker;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing RoboMaker asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * This section provides documentation for the AWS RoboMaker API operations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoboMakerAsyncClient extends AWSRoboMakerClient implements AWSRoboMakerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRoboMakerAsyncClientBuilder asyncBuilder() {
        return AWSRoboMakerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on RoboMaker using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRoboMakerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on RoboMaker using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSRoboMakerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchDeleteWorldsResult> batchDeleteWorldsAsync(BatchDeleteWorldsRequest request) {

        return batchDeleteWorldsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteWorldsResult> batchDeleteWorldsAsync(final BatchDeleteWorldsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteWorldsRequest, BatchDeleteWorldsResult> asyncHandler) {
        final BatchDeleteWorldsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteWorldsResult>() {
            @Override
            public BatchDeleteWorldsResult call() throws Exception {
                BatchDeleteWorldsResult result = null;

                try {
                    result = executeBatchDeleteWorlds(finalRequest);
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
    public java.util.concurrent.Future<BatchDescribeSimulationJobResult> batchDescribeSimulationJobAsync(BatchDescribeSimulationJobRequest request) {

        return batchDescribeSimulationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDescribeSimulationJobResult> batchDescribeSimulationJobAsync(final BatchDescribeSimulationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDescribeSimulationJobRequest, BatchDescribeSimulationJobResult> asyncHandler) {
        final BatchDescribeSimulationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDescribeSimulationJobResult>() {
            @Override
            public BatchDescribeSimulationJobResult call() throws Exception {
                BatchDescribeSimulationJobResult result = null;

                try {
                    result = executeBatchDescribeSimulationJob(finalRequest);
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
    public java.util.concurrent.Future<CancelDeploymentJobResult> cancelDeploymentJobAsync(CancelDeploymentJobRequest request) {

        return cancelDeploymentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelDeploymentJobResult> cancelDeploymentJobAsync(final CancelDeploymentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelDeploymentJobRequest, CancelDeploymentJobResult> asyncHandler) {
        final CancelDeploymentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelDeploymentJobResult>() {
            @Override
            public CancelDeploymentJobResult call() throws Exception {
                CancelDeploymentJobResult result = null;

                try {
                    result = executeCancelDeploymentJob(finalRequest);
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
    public java.util.concurrent.Future<CancelSimulationJobResult> cancelSimulationJobAsync(CancelSimulationJobRequest request) {

        return cancelSimulationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSimulationJobResult> cancelSimulationJobAsync(final CancelSimulationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSimulationJobRequest, CancelSimulationJobResult> asyncHandler) {
        final CancelSimulationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSimulationJobResult>() {
            @Override
            public CancelSimulationJobResult call() throws Exception {
                CancelSimulationJobResult result = null;

                try {
                    result = executeCancelSimulationJob(finalRequest);
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
    public java.util.concurrent.Future<CancelSimulationJobBatchResult> cancelSimulationJobBatchAsync(CancelSimulationJobBatchRequest request) {

        return cancelSimulationJobBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSimulationJobBatchResult> cancelSimulationJobBatchAsync(final CancelSimulationJobBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSimulationJobBatchRequest, CancelSimulationJobBatchResult> asyncHandler) {
        final CancelSimulationJobBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSimulationJobBatchResult>() {
            @Override
            public CancelSimulationJobBatchResult call() throws Exception {
                CancelSimulationJobBatchResult result = null;

                try {
                    result = executeCancelSimulationJobBatch(finalRequest);
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
    public java.util.concurrent.Future<CancelWorldExportJobResult> cancelWorldExportJobAsync(CancelWorldExportJobRequest request) {

        return cancelWorldExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelWorldExportJobResult> cancelWorldExportJobAsync(final CancelWorldExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelWorldExportJobRequest, CancelWorldExportJobResult> asyncHandler) {
        final CancelWorldExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelWorldExportJobResult>() {
            @Override
            public CancelWorldExportJobResult call() throws Exception {
                CancelWorldExportJobResult result = null;

                try {
                    result = executeCancelWorldExportJob(finalRequest);
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
    public java.util.concurrent.Future<CancelWorldGenerationJobResult> cancelWorldGenerationJobAsync(CancelWorldGenerationJobRequest request) {

        return cancelWorldGenerationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelWorldGenerationJobResult> cancelWorldGenerationJobAsync(final CancelWorldGenerationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelWorldGenerationJobRequest, CancelWorldGenerationJobResult> asyncHandler) {
        final CancelWorldGenerationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelWorldGenerationJobResult>() {
            @Override
            public CancelWorldGenerationJobResult call() throws Exception {
                CancelWorldGenerationJobResult result = null;

                try {
                    result = executeCancelWorldGenerationJob(finalRequest);
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
    public java.util.concurrent.Future<CreateDeploymentJobResult> createDeploymentJobAsync(CreateDeploymentJobRequest request) {

        return createDeploymentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentJobResult> createDeploymentJobAsync(final CreateDeploymentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentJobRequest, CreateDeploymentJobResult> asyncHandler) {
        final CreateDeploymentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentJobResult>() {
            @Override
            public CreateDeploymentJobResult call() throws Exception {
                CreateDeploymentJobResult result = null;

                try {
                    result = executeCreateDeploymentJob(finalRequest);
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
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(final CreateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {
        final CreateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetResult>() {
            @Override
            public CreateFleetResult call() throws Exception {
                CreateFleetResult result = null;

                try {
                    result = executeCreateFleet(finalRequest);
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
    public java.util.concurrent.Future<CreateRobotResult> createRobotAsync(CreateRobotRequest request) {

        return createRobotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRobotResult> createRobotAsync(final CreateRobotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRobotRequest, CreateRobotResult> asyncHandler) {
        final CreateRobotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRobotResult>() {
            @Override
            public CreateRobotResult call() throws Exception {
                CreateRobotResult result = null;

                try {
                    result = executeCreateRobot(finalRequest);
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
    public java.util.concurrent.Future<CreateRobotApplicationResult> createRobotApplicationAsync(CreateRobotApplicationRequest request) {

        return createRobotApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRobotApplicationResult> createRobotApplicationAsync(final CreateRobotApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRobotApplicationRequest, CreateRobotApplicationResult> asyncHandler) {
        final CreateRobotApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRobotApplicationResult>() {
            @Override
            public CreateRobotApplicationResult call() throws Exception {
                CreateRobotApplicationResult result = null;

                try {
                    result = executeCreateRobotApplication(finalRequest);
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
    public java.util.concurrent.Future<CreateRobotApplicationVersionResult> createRobotApplicationVersionAsync(CreateRobotApplicationVersionRequest request) {

        return createRobotApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRobotApplicationVersionResult> createRobotApplicationVersionAsync(
            final CreateRobotApplicationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRobotApplicationVersionRequest, CreateRobotApplicationVersionResult> asyncHandler) {
        final CreateRobotApplicationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRobotApplicationVersionResult>() {
            @Override
            public CreateRobotApplicationVersionResult call() throws Exception {
                CreateRobotApplicationVersionResult result = null;

                try {
                    result = executeCreateRobotApplicationVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateSimulationApplicationResult> createSimulationApplicationAsync(CreateSimulationApplicationRequest request) {

        return createSimulationApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSimulationApplicationResult> createSimulationApplicationAsync(final CreateSimulationApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSimulationApplicationRequest, CreateSimulationApplicationResult> asyncHandler) {
        final CreateSimulationApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSimulationApplicationResult>() {
            @Override
            public CreateSimulationApplicationResult call() throws Exception {
                CreateSimulationApplicationResult result = null;

                try {
                    result = executeCreateSimulationApplication(finalRequest);
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
    public java.util.concurrent.Future<CreateSimulationApplicationVersionResult> createSimulationApplicationVersionAsync(
            CreateSimulationApplicationVersionRequest request) {

        return createSimulationApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSimulationApplicationVersionResult> createSimulationApplicationVersionAsync(
            final CreateSimulationApplicationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSimulationApplicationVersionRequest, CreateSimulationApplicationVersionResult> asyncHandler) {
        final CreateSimulationApplicationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSimulationApplicationVersionResult>() {
            @Override
            public CreateSimulationApplicationVersionResult call() throws Exception {
                CreateSimulationApplicationVersionResult result = null;

                try {
                    result = executeCreateSimulationApplicationVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateSimulationJobResult> createSimulationJobAsync(CreateSimulationJobRequest request) {

        return createSimulationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSimulationJobResult> createSimulationJobAsync(final CreateSimulationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSimulationJobRequest, CreateSimulationJobResult> asyncHandler) {
        final CreateSimulationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSimulationJobResult>() {
            @Override
            public CreateSimulationJobResult call() throws Exception {
                CreateSimulationJobResult result = null;

                try {
                    result = executeCreateSimulationJob(finalRequest);
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
    public java.util.concurrent.Future<CreateWorldExportJobResult> createWorldExportJobAsync(CreateWorldExportJobRequest request) {

        return createWorldExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorldExportJobResult> createWorldExportJobAsync(final CreateWorldExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorldExportJobRequest, CreateWorldExportJobResult> asyncHandler) {
        final CreateWorldExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorldExportJobResult>() {
            @Override
            public CreateWorldExportJobResult call() throws Exception {
                CreateWorldExportJobResult result = null;

                try {
                    result = executeCreateWorldExportJob(finalRequest);
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
    public java.util.concurrent.Future<CreateWorldGenerationJobResult> createWorldGenerationJobAsync(CreateWorldGenerationJobRequest request) {

        return createWorldGenerationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorldGenerationJobResult> createWorldGenerationJobAsync(final CreateWorldGenerationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorldGenerationJobRequest, CreateWorldGenerationJobResult> asyncHandler) {
        final CreateWorldGenerationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorldGenerationJobResult>() {
            @Override
            public CreateWorldGenerationJobResult call() throws Exception {
                CreateWorldGenerationJobResult result = null;

                try {
                    result = executeCreateWorldGenerationJob(finalRequest);
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
    public java.util.concurrent.Future<CreateWorldTemplateResult> createWorldTemplateAsync(CreateWorldTemplateRequest request) {

        return createWorldTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorldTemplateResult> createWorldTemplateAsync(final CreateWorldTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorldTemplateRequest, CreateWorldTemplateResult> asyncHandler) {
        final CreateWorldTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorldTemplateResult>() {
            @Override
            public CreateWorldTemplateResult call() throws Exception {
                CreateWorldTemplateResult result = null;

                try {
                    result = executeCreateWorldTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request) {

        return deleteFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(final DeleteFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler) {
        final DeleteFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetResult>() {
            @Override
            public DeleteFleetResult call() throws Exception {
                DeleteFleetResult result = null;

                try {
                    result = executeDeleteFleet(finalRequest);
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
    public java.util.concurrent.Future<DeleteRobotResult> deleteRobotAsync(DeleteRobotRequest request) {

        return deleteRobotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRobotResult> deleteRobotAsync(final DeleteRobotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRobotRequest, DeleteRobotResult> asyncHandler) {
        final DeleteRobotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRobotResult>() {
            @Override
            public DeleteRobotResult call() throws Exception {
                DeleteRobotResult result = null;

                try {
                    result = executeDeleteRobot(finalRequest);
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
    public java.util.concurrent.Future<DeleteRobotApplicationResult> deleteRobotApplicationAsync(DeleteRobotApplicationRequest request) {

        return deleteRobotApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRobotApplicationResult> deleteRobotApplicationAsync(final DeleteRobotApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRobotApplicationRequest, DeleteRobotApplicationResult> asyncHandler) {
        final DeleteRobotApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRobotApplicationResult>() {
            @Override
            public DeleteRobotApplicationResult call() throws Exception {
                DeleteRobotApplicationResult result = null;

                try {
                    result = executeDeleteRobotApplication(finalRequest);
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
    public java.util.concurrent.Future<DeleteSimulationApplicationResult> deleteSimulationApplicationAsync(DeleteSimulationApplicationRequest request) {

        return deleteSimulationApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSimulationApplicationResult> deleteSimulationApplicationAsync(final DeleteSimulationApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSimulationApplicationRequest, DeleteSimulationApplicationResult> asyncHandler) {
        final DeleteSimulationApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSimulationApplicationResult>() {
            @Override
            public DeleteSimulationApplicationResult call() throws Exception {
                DeleteSimulationApplicationResult result = null;

                try {
                    result = executeDeleteSimulationApplication(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorldTemplateResult> deleteWorldTemplateAsync(DeleteWorldTemplateRequest request) {

        return deleteWorldTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorldTemplateResult> deleteWorldTemplateAsync(final DeleteWorldTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorldTemplateRequest, DeleteWorldTemplateResult> asyncHandler) {
        final DeleteWorldTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorldTemplateResult>() {
            @Override
            public DeleteWorldTemplateResult call() throws Exception {
                DeleteWorldTemplateResult result = null;

                try {
                    result = executeDeleteWorldTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeregisterRobotResult> deregisterRobotAsync(DeregisterRobotRequest request) {

        return deregisterRobotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterRobotResult> deregisterRobotAsync(final DeregisterRobotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterRobotRequest, DeregisterRobotResult> asyncHandler) {
        final DeregisterRobotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterRobotResult>() {
            @Override
            public DeregisterRobotResult call() throws Exception {
                DeregisterRobotResult result = null;

                try {
                    result = executeDeregisterRobot(finalRequest);
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
    public java.util.concurrent.Future<DescribeDeploymentJobResult> describeDeploymentJobAsync(DescribeDeploymentJobRequest request) {

        return describeDeploymentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeploymentJobResult> describeDeploymentJobAsync(final DescribeDeploymentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeploymentJobRequest, DescribeDeploymentJobResult> asyncHandler) {
        final DescribeDeploymentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeploymentJobResult>() {
            @Override
            public DescribeDeploymentJobResult call() throws Exception {
                DescribeDeploymentJobResult result = null;

                try {
                    result = executeDescribeDeploymentJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetResult> describeFleetAsync(DescribeFleetRequest request) {

        return describeFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetResult> describeFleetAsync(final DescribeFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetRequest, DescribeFleetResult> asyncHandler) {
        final DescribeFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetResult>() {
            @Override
            public DescribeFleetResult call() throws Exception {
                DescribeFleetResult result = null;

                try {
                    result = executeDescribeFleet(finalRequest);
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
    public java.util.concurrent.Future<DescribeRobotResult> describeRobotAsync(DescribeRobotRequest request) {

        return describeRobotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRobotResult> describeRobotAsync(final DescribeRobotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRobotRequest, DescribeRobotResult> asyncHandler) {
        final DescribeRobotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRobotResult>() {
            @Override
            public DescribeRobotResult call() throws Exception {
                DescribeRobotResult result = null;

                try {
                    result = executeDescribeRobot(finalRequest);
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
    public java.util.concurrent.Future<DescribeRobotApplicationResult> describeRobotApplicationAsync(DescribeRobotApplicationRequest request) {

        return describeRobotApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRobotApplicationResult> describeRobotApplicationAsync(final DescribeRobotApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRobotApplicationRequest, DescribeRobotApplicationResult> asyncHandler) {
        final DescribeRobotApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRobotApplicationResult>() {
            @Override
            public DescribeRobotApplicationResult call() throws Exception {
                DescribeRobotApplicationResult result = null;

                try {
                    result = executeDescribeRobotApplication(finalRequest);
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
    public java.util.concurrent.Future<DescribeSimulationApplicationResult> describeSimulationApplicationAsync(DescribeSimulationApplicationRequest request) {

        return describeSimulationApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSimulationApplicationResult> describeSimulationApplicationAsync(
            final DescribeSimulationApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSimulationApplicationRequest, DescribeSimulationApplicationResult> asyncHandler) {
        final DescribeSimulationApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSimulationApplicationResult>() {
            @Override
            public DescribeSimulationApplicationResult call() throws Exception {
                DescribeSimulationApplicationResult result = null;

                try {
                    result = executeDescribeSimulationApplication(finalRequest);
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
    public java.util.concurrent.Future<DescribeSimulationJobResult> describeSimulationJobAsync(DescribeSimulationJobRequest request) {

        return describeSimulationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSimulationJobResult> describeSimulationJobAsync(final DescribeSimulationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSimulationJobRequest, DescribeSimulationJobResult> asyncHandler) {
        final DescribeSimulationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSimulationJobResult>() {
            @Override
            public DescribeSimulationJobResult call() throws Exception {
                DescribeSimulationJobResult result = null;

                try {
                    result = executeDescribeSimulationJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeSimulationJobBatchResult> describeSimulationJobBatchAsync(DescribeSimulationJobBatchRequest request) {

        return describeSimulationJobBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSimulationJobBatchResult> describeSimulationJobBatchAsync(final DescribeSimulationJobBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSimulationJobBatchRequest, DescribeSimulationJobBatchResult> asyncHandler) {
        final DescribeSimulationJobBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSimulationJobBatchResult>() {
            @Override
            public DescribeSimulationJobBatchResult call() throws Exception {
                DescribeSimulationJobBatchResult result = null;

                try {
                    result = executeDescribeSimulationJobBatch(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorldResult> describeWorldAsync(DescribeWorldRequest request) {

        return describeWorldAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorldResult> describeWorldAsync(final DescribeWorldRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorldRequest, DescribeWorldResult> asyncHandler) {
        final DescribeWorldRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorldResult>() {
            @Override
            public DescribeWorldResult call() throws Exception {
                DescribeWorldResult result = null;

                try {
                    result = executeDescribeWorld(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorldExportJobResult> describeWorldExportJobAsync(DescribeWorldExportJobRequest request) {

        return describeWorldExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorldExportJobResult> describeWorldExportJobAsync(final DescribeWorldExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorldExportJobRequest, DescribeWorldExportJobResult> asyncHandler) {
        final DescribeWorldExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorldExportJobResult>() {
            @Override
            public DescribeWorldExportJobResult call() throws Exception {
                DescribeWorldExportJobResult result = null;

                try {
                    result = executeDescribeWorldExportJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorldGenerationJobResult> describeWorldGenerationJobAsync(DescribeWorldGenerationJobRequest request) {

        return describeWorldGenerationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorldGenerationJobResult> describeWorldGenerationJobAsync(final DescribeWorldGenerationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorldGenerationJobRequest, DescribeWorldGenerationJobResult> asyncHandler) {
        final DescribeWorldGenerationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorldGenerationJobResult>() {
            @Override
            public DescribeWorldGenerationJobResult call() throws Exception {
                DescribeWorldGenerationJobResult result = null;

                try {
                    result = executeDescribeWorldGenerationJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorldTemplateResult> describeWorldTemplateAsync(DescribeWorldTemplateRequest request) {

        return describeWorldTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorldTemplateResult> describeWorldTemplateAsync(final DescribeWorldTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorldTemplateRequest, DescribeWorldTemplateResult> asyncHandler) {
        final DescribeWorldTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorldTemplateResult>() {
            @Override
            public DescribeWorldTemplateResult call() throws Exception {
                DescribeWorldTemplateResult result = null;

                try {
                    result = executeDescribeWorldTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetWorldTemplateBodyResult> getWorldTemplateBodyAsync(GetWorldTemplateBodyRequest request) {

        return getWorldTemplateBodyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorldTemplateBodyResult> getWorldTemplateBodyAsync(final GetWorldTemplateBodyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorldTemplateBodyRequest, GetWorldTemplateBodyResult> asyncHandler) {
        final GetWorldTemplateBodyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorldTemplateBodyResult>() {
            @Override
            public GetWorldTemplateBodyResult call() throws Exception {
                GetWorldTemplateBodyResult result = null;

                try {
                    result = executeGetWorldTemplateBody(finalRequest);
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
    public java.util.concurrent.Future<ListDeploymentJobsResult> listDeploymentJobsAsync(ListDeploymentJobsRequest request) {

        return listDeploymentJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentJobsResult> listDeploymentJobsAsync(final ListDeploymentJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentJobsRequest, ListDeploymentJobsResult> asyncHandler) {
        final ListDeploymentJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentJobsResult>() {
            @Override
            public ListDeploymentJobsResult call() throws Exception {
                ListDeploymentJobsResult result = null;

                try {
                    result = executeListDeploymentJobs(finalRequest);
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
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest request) {

        return listFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(final ListFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler) {
        final ListFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFleetsResult>() {
            @Override
            public ListFleetsResult call() throws Exception {
                ListFleetsResult result = null;

                try {
                    result = executeListFleets(finalRequest);
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
    public java.util.concurrent.Future<ListRobotApplicationsResult> listRobotApplicationsAsync(ListRobotApplicationsRequest request) {

        return listRobotApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRobotApplicationsResult> listRobotApplicationsAsync(final ListRobotApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRobotApplicationsRequest, ListRobotApplicationsResult> asyncHandler) {
        final ListRobotApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRobotApplicationsResult>() {
            @Override
            public ListRobotApplicationsResult call() throws Exception {
                ListRobotApplicationsResult result = null;

                try {
                    result = executeListRobotApplications(finalRequest);
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
    public java.util.concurrent.Future<ListRobotsResult> listRobotsAsync(ListRobotsRequest request) {

        return listRobotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRobotsResult> listRobotsAsync(final ListRobotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRobotsRequest, ListRobotsResult> asyncHandler) {
        final ListRobotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRobotsResult>() {
            @Override
            public ListRobotsResult call() throws Exception {
                ListRobotsResult result = null;

                try {
                    result = executeListRobots(finalRequest);
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
    public java.util.concurrent.Future<ListSimulationApplicationsResult> listSimulationApplicationsAsync(ListSimulationApplicationsRequest request) {

        return listSimulationApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSimulationApplicationsResult> listSimulationApplicationsAsync(final ListSimulationApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSimulationApplicationsRequest, ListSimulationApplicationsResult> asyncHandler) {
        final ListSimulationApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSimulationApplicationsResult>() {
            @Override
            public ListSimulationApplicationsResult call() throws Exception {
                ListSimulationApplicationsResult result = null;

                try {
                    result = executeListSimulationApplications(finalRequest);
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
    public java.util.concurrent.Future<ListSimulationJobBatchesResult> listSimulationJobBatchesAsync(ListSimulationJobBatchesRequest request) {

        return listSimulationJobBatchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSimulationJobBatchesResult> listSimulationJobBatchesAsync(final ListSimulationJobBatchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSimulationJobBatchesRequest, ListSimulationJobBatchesResult> asyncHandler) {
        final ListSimulationJobBatchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSimulationJobBatchesResult>() {
            @Override
            public ListSimulationJobBatchesResult call() throws Exception {
                ListSimulationJobBatchesResult result = null;

                try {
                    result = executeListSimulationJobBatches(finalRequest);
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
    public java.util.concurrent.Future<ListSimulationJobsResult> listSimulationJobsAsync(ListSimulationJobsRequest request) {

        return listSimulationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSimulationJobsResult> listSimulationJobsAsync(final ListSimulationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSimulationJobsRequest, ListSimulationJobsResult> asyncHandler) {
        final ListSimulationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSimulationJobsResult>() {
            @Override
            public ListSimulationJobsResult call() throws Exception {
                ListSimulationJobsResult result = null;

                try {
                    result = executeListSimulationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListWorldExportJobsResult> listWorldExportJobsAsync(ListWorldExportJobsRequest request) {

        return listWorldExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorldExportJobsResult> listWorldExportJobsAsync(final ListWorldExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorldExportJobsRequest, ListWorldExportJobsResult> asyncHandler) {
        final ListWorldExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorldExportJobsResult>() {
            @Override
            public ListWorldExportJobsResult call() throws Exception {
                ListWorldExportJobsResult result = null;

                try {
                    result = executeListWorldExportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListWorldGenerationJobsResult> listWorldGenerationJobsAsync(ListWorldGenerationJobsRequest request) {

        return listWorldGenerationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorldGenerationJobsResult> listWorldGenerationJobsAsync(final ListWorldGenerationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorldGenerationJobsRequest, ListWorldGenerationJobsResult> asyncHandler) {
        final ListWorldGenerationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorldGenerationJobsResult>() {
            @Override
            public ListWorldGenerationJobsResult call() throws Exception {
                ListWorldGenerationJobsResult result = null;

                try {
                    result = executeListWorldGenerationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListWorldTemplatesResult> listWorldTemplatesAsync(ListWorldTemplatesRequest request) {

        return listWorldTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorldTemplatesResult> listWorldTemplatesAsync(final ListWorldTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorldTemplatesRequest, ListWorldTemplatesResult> asyncHandler) {
        final ListWorldTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorldTemplatesResult>() {
            @Override
            public ListWorldTemplatesResult call() throws Exception {
                ListWorldTemplatesResult result = null;

                try {
                    result = executeListWorldTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListWorldsResult> listWorldsAsync(ListWorldsRequest request) {

        return listWorldsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorldsResult> listWorldsAsync(final ListWorldsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorldsRequest, ListWorldsResult> asyncHandler) {
        final ListWorldsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorldsResult>() {
            @Override
            public ListWorldsResult call() throws Exception {
                ListWorldsResult result = null;

                try {
                    result = executeListWorlds(finalRequest);
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
    public java.util.concurrent.Future<RegisterRobotResult> registerRobotAsync(RegisterRobotRequest request) {

        return registerRobotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterRobotResult> registerRobotAsync(final RegisterRobotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterRobotRequest, RegisterRobotResult> asyncHandler) {
        final RegisterRobotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterRobotResult>() {
            @Override
            public RegisterRobotResult call() throws Exception {
                RegisterRobotResult result = null;

                try {
                    result = executeRegisterRobot(finalRequest);
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
    public java.util.concurrent.Future<RestartSimulationJobResult> restartSimulationJobAsync(RestartSimulationJobRequest request) {

        return restartSimulationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestartSimulationJobResult> restartSimulationJobAsync(final RestartSimulationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestartSimulationJobRequest, RestartSimulationJobResult> asyncHandler) {
        final RestartSimulationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestartSimulationJobResult>() {
            @Override
            public RestartSimulationJobResult call() throws Exception {
                RestartSimulationJobResult result = null;

                try {
                    result = executeRestartSimulationJob(finalRequest);
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
    public java.util.concurrent.Future<StartSimulationJobBatchResult> startSimulationJobBatchAsync(StartSimulationJobBatchRequest request) {

        return startSimulationJobBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSimulationJobBatchResult> startSimulationJobBatchAsync(final StartSimulationJobBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSimulationJobBatchRequest, StartSimulationJobBatchResult> asyncHandler) {
        final StartSimulationJobBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSimulationJobBatchResult>() {
            @Override
            public StartSimulationJobBatchResult call() throws Exception {
                StartSimulationJobBatchResult result = null;

                try {
                    result = executeStartSimulationJobBatch(finalRequest);
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
    public java.util.concurrent.Future<SyncDeploymentJobResult> syncDeploymentJobAsync(SyncDeploymentJobRequest request) {

        return syncDeploymentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SyncDeploymentJobResult> syncDeploymentJobAsync(final SyncDeploymentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<SyncDeploymentJobRequest, SyncDeploymentJobResult> asyncHandler) {
        final SyncDeploymentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SyncDeploymentJobResult>() {
            @Override
            public SyncDeploymentJobResult call() throws Exception {
                SyncDeploymentJobResult result = null;

                try {
                    result = executeSyncDeploymentJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateRobotApplicationResult> updateRobotApplicationAsync(UpdateRobotApplicationRequest request) {

        return updateRobotApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRobotApplicationResult> updateRobotApplicationAsync(final UpdateRobotApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRobotApplicationRequest, UpdateRobotApplicationResult> asyncHandler) {
        final UpdateRobotApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRobotApplicationResult>() {
            @Override
            public UpdateRobotApplicationResult call() throws Exception {
                UpdateRobotApplicationResult result = null;

                try {
                    result = executeUpdateRobotApplication(finalRequest);
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
    public java.util.concurrent.Future<UpdateSimulationApplicationResult> updateSimulationApplicationAsync(UpdateSimulationApplicationRequest request) {

        return updateSimulationApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSimulationApplicationResult> updateSimulationApplicationAsync(final UpdateSimulationApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSimulationApplicationRequest, UpdateSimulationApplicationResult> asyncHandler) {
        final UpdateSimulationApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSimulationApplicationResult>() {
            @Override
            public UpdateSimulationApplicationResult call() throws Exception {
                UpdateSimulationApplicationResult result = null;

                try {
                    result = executeUpdateSimulationApplication(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorldTemplateResult> updateWorldTemplateAsync(UpdateWorldTemplateRequest request) {

        return updateWorldTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorldTemplateResult> updateWorldTemplateAsync(final UpdateWorldTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorldTemplateRequest, UpdateWorldTemplateResult> asyncHandler) {
        final UpdateWorldTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorldTemplateResult>() {
            @Override
            public UpdateWorldTemplateResult call() throws Exception {
                UpdateWorldTemplateResult result = null;

                try {
                    result = executeUpdateWorldTemplate(finalRequest);
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
