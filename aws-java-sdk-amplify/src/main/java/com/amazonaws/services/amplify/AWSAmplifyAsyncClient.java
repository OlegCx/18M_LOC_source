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
package com.amazonaws.services.amplify;

import javax.annotation.Generated;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amplify asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Amplify enables developers to develop and deploy cloud-powered mobile and web apps. The Amplify Console provides a
 * continuous delivery and hosting service for web applications. For more information, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html">Amplify Console User Guide</a>. The Amplify
 * Framework is a comprehensive set of SDKs, libraries, tools, and documentation for client app development. For more
 * information, see the <a href="https://docs.amplify.aws/">Amplify Framework.</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAmplifyAsyncClient extends AWSAmplifyClient implements AWSAmplifyAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAmplifyAsyncClientBuilder asyncBuilder() {
        return AWSAmplifyAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amplify using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAmplifyAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amplify using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSAmplifyAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(final CreateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {
        final CreateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppResult>() {
            @Override
            public CreateAppResult call() throws Exception {
                CreateAppResult result = null;

                try {
                    result = executeCreateApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBackendEnvironmentResult> createBackendEnvironmentAsync(CreateBackendEnvironmentRequest request) {

        return createBackendEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendEnvironmentResult> createBackendEnvironmentAsync(final CreateBackendEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackendEnvironmentRequest, CreateBackendEnvironmentResult> asyncHandler) {
        final CreateBackendEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackendEnvironmentResult>() {
            @Override
            public CreateBackendEnvironmentResult call() throws Exception {
                CreateBackendEnvironmentResult result = null;

                try {
                    result = executeCreateBackendEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest request) {

        return createBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBranchResult> createBranchAsync(final CreateBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, CreateBranchResult> asyncHandler) {
        final CreateBranchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBranchResult>() {
            @Override
            public CreateBranchResult call() throws Exception {
                CreateBranchResult result = null;

                try {
                    result = executeCreateBranch(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDomainAssociationResult> createDomainAssociationAsync(CreateDomainAssociationRequest request) {

        return createDomainAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainAssociationResult> createDomainAssociationAsync(final CreateDomainAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainAssociationRequest, CreateDomainAssociationResult> asyncHandler) {
        final CreateDomainAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainAssociationResult>() {
            @Override
            public CreateDomainAssociationResult call() throws Exception {
                CreateDomainAssociationResult result = null;

                try {
                    result = executeCreateDomainAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest request) {

        return createWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(final CreateWebhookRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWebhookRequest, CreateWebhookResult> asyncHandler) {
        final CreateWebhookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWebhookResult>() {
            @Override
            public CreateWebhookResult call() throws Exception {
                CreateWebhookResult result = null;

                try {
                    result = executeCreateWebhook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(final DeleteAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {
        final DeleteAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppResult>() {
            @Override
            public DeleteAppResult call() throws Exception {
                DeleteAppResult result = null;

                try {
                    result = executeDeleteApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendEnvironmentResult> deleteBackendEnvironmentAsync(DeleteBackendEnvironmentRequest request) {

        return deleteBackendEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendEnvironmentResult> deleteBackendEnvironmentAsync(final DeleteBackendEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackendEnvironmentRequest, DeleteBackendEnvironmentResult> asyncHandler) {
        final DeleteBackendEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackendEnvironmentResult>() {
            @Override
            public DeleteBackendEnvironmentResult call() throws Exception {
                DeleteBackendEnvironmentResult result = null;

                try {
                    result = executeDeleteBackendEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest request) {

        return deleteBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(final DeleteBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBranchRequest, DeleteBranchResult> asyncHandler) {
        final DeleteBranchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBranchResult>() {
            @Override
            public DeleteBranchResult call() throws Exception {
                DeleteBranchResult result = null;

                try {
                    result = executeDeleteBranch(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainAssociationResult> deleteDomainAssociationAsync(DeleteDomainAssociationRequest request) {

        return deleteDomainAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainAssociationResult> deleteDomainAssociationAsync(final DeleteDomainAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainAssociationRequest, DeleteDomainAssociationResult> asyncHandler) {
        final DeleteDomainAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainAssociationResult>() {
            @Override
            public DeleteDomainAssociationResult call() throws Exception {
                DeleteDomainAssociationResult result = null;

                try {
                    result = executeDeleteDomainAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest request) {

        return deleteWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(final DeleteWebhookRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWebhookRequest, DeleteWebhookResult> asyncHandler) {
        final DeleteWebhookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWebhookResult>() {
            @Override
            public DeleteWebhookResult call() throws Exception {
                DeleteWebhookResult result = null;

                try {
                    result = executeDeleteWebhook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GenerateAccessLogsResult> generateAccessLogsAsync(GenerateAccessLogsRequest request) {

        return generateAccessLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateAccessLogsResult> generateAccessLogsAsync(final GenerateAccessLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateAccessLogsRequest, GenerateAccessLogsResult> asyncHandler) {
        final GenerateAccessLogsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateAccessLogsResult>() {
            @Override
            public GenerateAccessLogsResult call() throws Exception {
                GenerateAccessLogsResult result = null;

                try {
                    result = executeGenerateAccessLogs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest request) {

        return getAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppResult> getAppAsync(final GetAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppRequest, GetAppResult> asyncHandler) {
        final GetAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppResult>() {
            @Override
            public GetAppResult call() throws Exception {
                GetAppResult result = null;

                try {
                    result = executeGetApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetArtifactUrlResult> getArtifactUrlAsync(GetArtifactUrlRequest request) {

        return getArtifactUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArtifactUrlResult> getArtifactUrlAsync(final GetArtifactUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArtifactUrlRequest, GetArtifactUrlResult> asyncHandler) {
        final GetArtifactUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArtifactUrlResult>() {
            @Override
            public GetArtifactUrlResult call() throws Exception {
                GetArtifactUrlResult result = null;

                try {
                    result = executeGetArtifactUrl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBackendEnvironmentResult> getBackendEnvironmentAsync(GetBackendEnvironmentRequest request) {

        return getBackendEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackendEnvironmentResult> getBackendEnvironmentAsync(final GetBackendEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackendEnvironmentRequest, GetBackendEnvironmentResult> asyncHandler) {
        final GetBackendEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackendEnvironmentResult>() {
            @Override
            public GetBackendEnvironmentResult call() throws Exception {
                GetBackendEnvironmentResult result = null;

                try {
                    result = executeGetBackendEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest request) {

        return getBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(final GetBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler) {
        final GetBranchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBranchResult>() {
            @Override
            public GetBranchResult call() throws Exception {
                GetBranchResult result = null;

                try {
                    result = executeGetBranch(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDomainAssociationResult> getDomainAssociationAsync(GetDomainAssociationRequest request) {

        return getDomainAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainAssociationResult> getDomainAssociationAsync(final GetDomainAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainAssociationRequest, GetDomainAssociationResult> asyncHandler) {
        final GetDomainAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainAssociationResult>() {
            @Override
            public GetDomainAssociationResult call() throws Exception {
                GetDomainAssociationResult result = null;

                try {
                    result = executeGetDomainAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetWebhookResult> getWebhookAsync(GetWebhookRequest request) {

        return getWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWebhookResult> getWebhookAsync(final GetWebhookRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWebhookRequest, GetWebhookResult> asyncHandler) {
        final GetWebhookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWebhookResult>() {
            @Override
            public GetWebhookResult call() throws Exception {
                GetWebhookResult result = null;

                try {
                    result = executeGetWebhook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request) {

        return listAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(final ListAppsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler) {
        final ListAppsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppsResult>() {
            @Override
            public ListAppsResult call() throws Exception {
                ListAppsResult result = null;

                try {
                    result = executeListApps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest request) {

        return listArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(final ListArtifactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler) {
        final ListArtifactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListArtifactsResult>() {
            @Override
            public ListArtifactsResult call() throws Exception {
                ListArtifactsResult result = null;

                try {
                    result = executeListArtifacts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBackendEnvironmentsResult> listBackendEnvironmentsAsync(ListBackendEnvironmentsRequest request) {

        return listBackendEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackendEnvironmentsResult> listBackendEnvironmentsAsync(final ListBackendEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBackendEnvironmentsRequest, ListBackendEnvironmentsResult> asyncHandler) {
        final ListBackendEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBackendEnvironmentsResult>() {
            @Override
            public ListBackendEnvironmentsResult call() throws Exception {
                ListBackendEnvironmentsResult result = null;

                try {
                    result = executeListBackendEnvironments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest request) {

        return listBranchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(final ListBranchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler) {
        final ListBranchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBranchesResult>() {
            @Override
            public ListBranchesResult call() throws Exception {
                ListBranchesResult result = null;

                try {
                    result = executeListBranches(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDomainAssociationsResult> listDomainAssociationsAsync(ListDomainAssociationsRequest request) {

        return listDomainAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainAssociationsResult> listDomainAssociationsAsync(final ListDomainAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainAssociationsRequest, ListDomainAssociationsResult> asyncHandler) {
        final ListDomainAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainAssociationsResult>() {
            @Override
            public ListDomainAssociationsResult call() throws Exception {
                ListDomainAssociationsResult result = null;

                try {
                    result = executeListDomainAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListWebhooksResult> listWebhooksAsync(ListWebhooksRequest request) {

        return listWebhooksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWebhooksResult> listWebhooksAsync(final ListWebhooksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWebhooksRequest, ListWebhooksResult> asyncHandler) {
        final ListWebhooksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWebhooksResult>() {
            @Override
            public ListWebhooksResult call() throws Exception {
                ListWebhooksResult result = null;

                try {
                    result = executeListWebhooks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest request) {

        return startDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(final StartDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDeploymentRequest, StartDeploymentResult> asyncHandler) {
        final StartDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDeploymentResult>() {
            @Override
            public StartDeploymentResult call() throws Exception {
                StartDeploymentResult result = null;

                try {
                    result = executeStartDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest request) {

        return startJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobResult> startJobAsync(final StartJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartJobRequest, StartJobResult> asyncHandler) {
        final StartJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartJobResult>() {
            @Override
            public StartJobResult call() throws Exception {
                StartJobResult result = null;

                try {
                    result = executeStartJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopJobResult> stopJobAsync(StopJobRequest request) {

        return stopJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopJobResult> stopJobAsync(final StopJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopJobRequest, StopJobResult> asyncHandler) {
        final StopJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopJobResult>() {
            @Override
            public StopJobResult call() throws Exception {
                StopJobResult result = null;

                try {
                    result = executeStopJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest request) {

        return updateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(final UpdateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler) {
        final UpdateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppResult>() {
            @Override
            public UpdateAppResult call() throws Exception {
                UpdateAppResult result = null;

                try {
                    result = executeUpdateApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBranchResult> updateBranchAsync(UpdateBranchRequest request) {

        return updateBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBranchResult> updateBranchAsync(final UpdateBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBranchRequest, UpdateBranchResult> asyncHandler) {
        final UpdateBranchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBranchResult>() {
            @Override
            public UpdateBranchResult call() throws Exception {
                UpdateBranchResult result = null;

                try {
                    result = executeUpdateBranch(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainAssociationResult> updateDomainAssociationAsync(UpdateDomainAssociationRequest request) {

        return updateDomainAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainAssociationResult> updateDomainAssociationAsync(final UpdateDomainAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainAssociationRequest, UpdateDomainAssociationResult> asyncHandler) {
        final UpdateDomainAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainAssociationResult>() {
            @Override
            public UpdateDomainAssociationResult call() throws Exception {
                UpdateDomainAssociationResult result = null;

                try {
                    result = executeUpdateDomainAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest request) {

        return updateWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(final UpdateWebhookRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWebhookRequest, UpdateWebhookResult> asyncHandler) {
        final UpdateWebhookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWebhookResult>() {
            @Override
            public UpdateWebhookResult call() throws Exception {
                UpdateWebhookResult result = null;

                try {
                    result = executeUpdateWebhook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
