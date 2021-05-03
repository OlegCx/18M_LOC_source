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
package com.amazonaws.services.sagemaker;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SageMaker asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon SageMaker resources.
 * </p>
 * <p>
 * Other Resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/whatis.html#first-time-user">Amazon SageMaker Developer
 * Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/augmented-ai/2019-11-07/APIReference/Welcome.html">Amazon Augmented AI Runtime
 * API Reference</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerAsyncClient extends AmazonSageMakerClient implements AmazonSageMakerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonSageMakerAsyncClientBuilder asyncBuilder() {
        return AmazonSageMakerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SageMaker using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SageMaker using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonSageMakerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AddAssociationResult> addAssociationAsync(AddAssociationRequest request) {

        return addAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddAssociationResult> addAssociationAsync(final AddAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddAssociationRequest, AddAssociationResult> asyncHandler) {
        final AddAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddAssociationResult>() {
            @Override
            public AddAssociationResult call() throws Exception {
                AddAssociationResult result = null;

                try {
                    result = executeAddAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(final AddTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {
        final AddTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsResult>() {
            @Override
            public AddTagsResult call() throws Exception {
                AddTagsResult result = null;

                try {
                    result = executeAddTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateTrialComponentResult> associateTrialComponentAsync(AssociateTrialComponentRequest request) {

        return associateTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTrialComponentResult> associateTrialComponentAsync(final AssociateTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTrialComponentRequest, AssociateTrialComponentResult> asyncHandler) {
        final AssociateTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTrialComponentResult>() {
            @Override
            public AssociateTrialComponentResult call() throws Exception {
                AssociateTrialComponentResult result = null;

                try {
                    result = executeAssociateTrialComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateActionResult> createActionAsync(CreateActionRequest request) {

        return createActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateActionResult> createActionAsync(final CreateActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateActionRequest, CreateActionResult> asyncHandler) {
        final CreateActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateActionResult>() {
            @Override
            public CreateActionResult call() throws Exception {
                CreateActionResult result = null;

                try {
                    result = executeCreateAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAlgorithmResult> createAlgorithmAsync(CreateAlgorithmRequest request) {

        return createAlgorithmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAlgorithmResult> createAlgorithmAsync(final CreateAlgorithmRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAlgorithmRequest, CreateAlgorithmResult> asyncHandler) {
        final CreateAlgorithmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAlgorithmResult>() {
            @Override
            public CreateAlgorithmResult call() throws Exception {
                CreateAlgorithmResult result = null;

                try {
                    result = executeCreateAlgorithm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
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
    public java.util.concurrent.Future<CreateAppImageConfigResult> createAppImageConfigAsync(CreateAppImageConfigRequest request) {

        return createAppImageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppImageConfigResult> createAppImageConfigAsync(final CreateAppImageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppImageConfigRequest, CreateAppImageConfigResult> asyncHandler) {
        final CreateAppImageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppImageConfigResult>() {
            @Override
            public CreateAppImageConfigResult call() throws Exception {
                CreateAppImageConfigResult result = null;

                try {
                    result = executeCreateAppImageConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateArtifactResult> createArtifactAsync(CreateArtifactRequest request) {

        return createArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateArtifactResult> createArtifactAsync(final CreateArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateArtifactRequest, CreateArtifactResult> asyncHandler) {
        final CreateArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateArtifactResult>() {
            @Override
            public CreateArtifactResult call() throws Exception {
                CreateArtifactResult result = null;

                try {
                    result = executeCreateArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAutoMLJobResult> createAutoMLJobAsync(CreateAutoMLJobRequest request) {

        return createAutoMLJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAutoMLJobResult> createAutoMLJobAsync(final CreateAutoMLJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAutoMLJobRequest, CreateAutoMLJobResult> asyncHandler) {
        final CreateAutoMLJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAutoMLJobResult>() {
            @Override
            public CreateAutoMLJobResult call() throws Exception {
                CreateAutoMLJobResult result = null;

                try {
                    result = executeCreateAutoMLJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCodeRepositoryResult> createCodeRepositoryAsync(CreateCodeRepositoryRequest request) {

        return createCodeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCodeRepositoryResult> createCodeRepositoryAsync(final CreateCodeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCodeRepositoryRequest, CreateCodeRepositoryResult> asyncHandler) {
        final CreateCodeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCodeRepositoryResult>() {
            @Override
            public CreateCodeRepositoryResult call() throws Exception {
                CreateCodeRepositoryResult result = null;

                try {
                    result = executeCreateCodeRepository(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCompilationJobResult> createCompilationJobAsync(CreateCompilationJobRequest request) {

        return createCompilationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCompilationJobResult> createCompilationJobAsync(final CreateCompilationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCompilationJobRequest, CreateCompilationJobResult> asyncHandler) {
        final CreateCompilationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCompilationJobResult>() {
            @Override
            public CreateCompilationJobResult call() throws Exception {
                CreateCompilationJobResult result = null;

                try {
                    result = executeCreateCompilationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateContextResult> createContextAsync(CreateContextRequest request) {

        return createContextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContextResult> createContextAsync(final CreateContextRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContextRequest, CreateContextResult> asyncHandler) {
        final CreateContextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContextResult>() {
            @Override
            public CreateContextResult call() throws Exception {
                CreateContextResult result = null;

                try {
                    result = executeCreateContext(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataQualityJobDefinitionResult> createDataQualityJobDefinitionAsync(CreateDataQualityJobDefinitionRequest request) {

        return createDataQualityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataQualityJobDefinitionResult> createDataQualityJobDefinitionAsync(
            final CreateDataQualityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataQualityJobDefinitionRequest, CreateDataQualityJobDefinitionResult> asyncHandler) {
        final CreateDataQualityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataQualityJobDefinitionResult>() {
            @Override
            public CreateDataQualityJobDefinitionResult call() throws Exception {
                CreateDataQualityJobDefinitionResult result = null;

                try {
                    result = executeCreateDataQualityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceFleetResult> createDeviceFleetAsync(CreateDeviceFleetRequest request) {

        return createDeviceFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceFleetResult> createDeviceFleetAsync(final CreateDeviceFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeviceFleetRequest, CreateDeviceFleetResult> asyncHandler) {
        final CreateDeviceFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeviceFleetResult>() {
            @Override
            public CreateDeviceFleetResult call() throws Exception {
                CreateDeviceFleetResult result = null;

                try {
                    result = executeCreateDeviceFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {
        final CreateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result = null;

                try {
                    result = executeCreateDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEdgePackagingJobResult> createEdgePackagingJobAsync(CreateEdgePackagingJobRequest request) {

        return createEdgePackagingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEdgePackagingJobResult> createEdgePackagingJobAsync(final CreateEdgePackagingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEdgePackagingJobRequest, CreateEdgePackagingJobResult> asyncHandler) {
        final CreateEdgePackagingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEdgePackagingJobResult>() {
            @Override
            public CreateEdgePackagingJobResult call() throws Exception {
                CreateEdgePackagingJobResult result = null;

                try {
                    result = executeCreateEdgePackagingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest request) {

        return createEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(final CreateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler) {
        final CreateEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointResult>() {
            @Override
            public CreateEndpointResult call() throws Exception {
                CreateEndpointResult result = null;

                try {
                    result = executeCreateEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest request) {

        return createEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(final CreateEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointConfigRequest, CreateEndpointConfigResult> asyncHandler) {
        final CreateEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointConfigResult>() {
            @Override
            public CreateEndpointConfigResult call() throws Exception {
                CreateEndpointConfigResult result = null;

                try {
                    result = executeCreateEndpointConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateExperimentResult> createExperimentAsync(CreateExperimentRequest request) {

        return createExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExperimentResult> createExperimentAsync(final CreateExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExperimentRequest, CreateExperimentResult> asyncHandler) {
        final CreateExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExperimentResult>() {
            @Override
            public CreateExperimentResult call() throws Exception {
                CreateExperimentResult result = null;

                try {
                    result = executeCreateExperiment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFeatureGroupResult> createFeatureGroupAsync(CreateFeatureGroupRequest request) {

        return createFeatureGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFeatureGroupResult> createFeatureGroupAsync(final CreateFeatureGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFeatureGroupRequest, CreateFeatureGroupResult> asyncHandler) {
        final CreateFeatureGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFeatureGroupResult>() {
            @Override
            public CreateFeatureGroupResult call() throws Exception {
                CreateFeatureGroupResult result = null;

                try {
                    result = executeCreateFeatureGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFlowDefinitionResult> createFlowDefinitionAsync(CreateFlowDefinitionRequest request) {

        return createFlowDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowDefinitionResult> createFlowDefinitionAsync(final CreateFlowDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFlowDefinitionRequest, CreateFlowDefinitionResult> asyncHandler) {
        final CreateFlowDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFlowDefinitionResult>() {
            @Override
            public CreateFlowDefinitionResult call() throws Exception {
                CreateFlowDefinitionResult result = null;

                try {
                    result = executeCreateFlowDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateHumanTaskUiResult> createHumanTaskUiAsync(CreateHumanTaskUiRequest request) {

        return createHumanTaskUiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHumanTaskUiResult> createHumanTaskUiAsync(final CreateHumanTaskUiRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHumanTaskUiRequest, CreateHumanTaskUiResult> asyncHandler) {
        final CreateHumanTaskUiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHumanTaskUiResult>() {
            @Override
            public CreateHumanTaskUiResult call() throws Exception {
                CreateHumanTaskUiResult result = null;

                try {
                    result = executeCreateHumanTaskUi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateHyperParameterTuningJobResult> createHyperParameterTuningJobAsync(CreateHyperParameterTuningJobRequest request) {

        return createHyperParameterTuningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHyperParameterTuningJobResult> createHyperParameterTuningJobAsync(
            final CreateHyperParameterTuningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHyperParameterTuningJobRequest, CreateHyperParameterTuningJobResult> asyncHandler) {
        final CreateHyperParameterTuningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHyperParameterTuningJobResult>() {
            @Override
            public CreateHyperParameterTuningJobResult call() throws Exception {
                CreateHyperParameterTuningJobResult result = null;

                try {
                    result = executeCreateHyperParameterTuningJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest request) {

        return createImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(final CreateImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler) {
        final CreateImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImageResult>() {
            @Override
            public CreateImageResult call() throws Exception {
                CreateImageResult result = null;

                try {
                    result = executeCreateImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateImageVersionResult> createImageVersionAsync(CreateImageVersionRequest request) {

        return createImageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageVersionResult> createImageVersionAsync(final CreateImageVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImageVersionRequest, CreateImageVersionResult> asyncHandler) {
        final CreateImageVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImageVersionResult>() {
            @Override
            public CreateImageVersionResult call() throws Exception {
                CreateImageVersionResult result = null;

                try {
                    result = executeCreateImageVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLabelingJobResult> createLabelingJobAsync(CreateLabelingJobRequest request) {

        return createLabelingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLabelingJobResult> createLabelingJobAsync(final CreateLabelingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLabelingJobRequest, CreateLabelingJobResult> asyncHandler) {
        final CreateLabelingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLabelingJobResult>() {
            @Override
            public CreateLabelingJobResult call() throws Exception {
                CreateLabelingJobResult result = null;

                try {
                    result = executeCreateLabelingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(final CreateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {
        final CreateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelResult>() {
            @Override
            public CreateModelResult call() throws Exception {
                CreateModelResult result = null;

                try {
                    result = executeCreateModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelBiasJobDefinitionResult> createModelBiasJobDefinitionAsync(CreateModelBiasJobDefinitionRequest request) {

        return createModelBiasJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelBiasJobDefinitionResult> createModelBiasJobDefinitionAsync(final CreateModelBiasJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelBiasJobDefinitionRequest, CreateModelBiasJobDefinitionResult> asyncHandler) {
        final CreateModelBiasJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelBiasJobDefinitionResult>() {
            @Override
            public CreateModelBiasJobDefinitionResult call() throws Exception {
                CreateModelBiasJobDefinitionResult result = null;

                try {
                    result = executeCreateModelBiasJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelExplainabilityJobDefinitionResult> createModelExplainabilityJobDefinitionAsync(
            CreateModelExplainabilityJobDefinitionRequest request) {

        return createModelExplainabilityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelExplainabilityJobDefinitionResult> createModelExplainabilityJobDefinitionAsync(
            final CreateModelExplainabilityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelExplainabilityJobDefinitionRequest, CreateModelExplainabilityJobDefinitionResult> asyncHandler) {
        final CreateModelExplainabilityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelExplainabilityJobDefinitionResult>() {
            @Override
            public CreateModelExplainabilityJobDefinitionResult call() throws Exception {
                CreateModelExplainabilityJobDefinitionResult result = null;

                try {
                    result = executeCreateModelExplainabilityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelPackageResult> createModelPackageAsync(CreateModelPackageRequest request) {

        return createModelPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelPackageResult> createModelPackageAsync(final CreateModelPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelPackageRequest, CreateModelPackageResult> asyncHandler) {
        final CreateModelPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelPackageResult>() {
            @Override
            public CreateModelPackageResult call() throws Exception {
                CreateModelPackageResult result = null;

                try {
                    result = executeCreateModelPackage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelPackageGroupResult> createModelPackageGroupAsync(CreateModelPackageGroupRequest request) {

        return createModelPackageGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelPackageGroupResult> createModelPackageGroupAsync(final CreateModelPackageGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelPackageGroupRequest, CreateModelPackageGroupResult> asyncHandler) {
        final CreateModelPackageGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelPackageGroupResult>() {
            @Override
            public CreateModelPackageGroupResult call() throws Exception {
                CreateModelPackageGroupResult result = null;

                try {
                    result = executeCreateModelPackageGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelQualityJobDefinitionResult> createModelQualityJobDefinitionAsync(
            CreateModelQualityJobDefinitionRequest request) {

        return createModelQualityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelQualityJobDefinitionResult> createModelQualityJobDefinitionAsync(
            final CreateModelQualityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelQualityJobDefinitionRequest, CreateModelQualityJobDefinitionResult> asyncHandler) {
        final CreateModelQualityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelQualityJobDefinitionResult>() {
            @Override
            public CreateModelQualityJobDefinitionResult call() throws Exception {
                CreateModelQualityJobDefinitionResult result = null;

                try {
                    result = executeCreateModelQualityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoringScheduleResult> createMonitoringScheduleAsync(CreateMonitoringScheduleRequest request) {

        return createMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoringScheduleResult> createMonitoringScheduleAsync(final CreateMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMonitoringScheduleRequest, CreateMonitoringScheduleResult> asyncHandler) {
        final CreateMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMonitoringScheduleResult>() {
            @Override
            public CreateMonitoringScheduleResult call() throws Exception {
                CreateMonitoringScheduleResult result = null;

                try {
                    result = executeCreateMonitoringSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest request) {

        return createNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(final CreateNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceRequest, CreateNotebookInstanceResult> asyncHandler) {
        final CreateNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNotebookInstanceResult>() {
            @Override
            public CreateNotebookInstanceResult call() throws Exception {
                CreateNotebookInstanceResult result = null;

                try {
                    result = executeCreateNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceLifecycleConfigResult> createNotebookInstanceLifecycleConfigAsync(
            CreateNotebookInstanceLifecycleConfigRequest request) {

        return createNotebookInstanceLifecycleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceLifecycleConfigResult> createNotebookInstanceLifecycleConfigAsync(
            final CreateNotebookInstanceLifecycleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceLifecycleConfigRequest, CreateNotebookInstanceLifecycleConfigResult> asyncHandler) {
        final CreateNotebookInstanceLifecycleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNotebookInstanceLifecycleConfigResult>() {
            @Override
            public CreateNotebookInstanceLifecycleConfigResult call() throws Exception {
                CreateNotebookInstanceLifecycleConfigResult result = null;

                try {
                    result = executeCreateNotebookInstanceLifecycleConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request) {

        return createPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(final CreatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler) {
        final CreatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePipelineResult>() {
            @Override
            public CreatePipelineResult call() throws Exception {
                CreatePipelineResult result = null;

                try {
                    result = executeCreatePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedDomainUrlResult> createPresignedDomainUrlAsync(CreatePresignedDomainUrlRequest request) {

        return createPresignedDomainUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedDomainUrlResult> createPresignedDomainUrlAsync(final CreatePresignedDomainUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePresignedDomainUrlRequest, CreatePresignedDomainUrlResult> asyncHandler) {
        final CreatePresignedDomainUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePresignedDomainUrlResult>() {
            @Override
            public CreatePresignedDomainUrlResult call() throws Exception {
                CreatePresignedDomainUrlResult result = null;

                try {
                    result = executeCreatePresignedDomainUrl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest request) {

        return createPresignedNotebookInstanceUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            final CreatePresignedNotebookInstanceUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePresignedNotebookInstanceUrlRequest, CreatePresignedNotebookInstanceUrlResult> asyncHandler) {
        final CreatePresignedNotebookInstanceUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePresignedNotebookInstanceUrlResult>() {
            @Override
            public CreatePresignedNotebookInstanceUrlResult call() throws Exception {
                CreatePresignedNotebookInstanceUrlResult result = null;

                try {
                    result = executeCreatePresignedNotebookInstanceUrl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProcessingJobResult> createProcessingJobAsync(CreateProcessingJobRequest request) {

        return createProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProcessingJobResult> createProcessingJobAsync(final CreateProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProcessingJobRequest, CreateProcessingJobResult> asyncHandler) {
        final CreateProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProcessingJobResult>() {
            @Override
            public CreateProcessingJobResult call() throws Exception {
                CreateProcessingJobResult result = null;

                try {
                    result = executeCreateProcessingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(final CreateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {
        final CreateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProjectResult>() {
            @Override
            public CreateProjectResult call() throws Exception {
                CreateProjectResult result = null;

                try {
                    result = executeCreateProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest request) {

        return createTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(final CreateTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrainingJobRequest, CreateTrainingJobResult> asyncHandler) {
        final CreateTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrainingJobResult>() {
            @Override
            public CreateTrainingJobResult call() throws Exception {
                CreateTrainingJobResult result = null;

                try {
                    result = executeCreateTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTransformJobResult> createTransformJobAsync(CreateTransformJobRequest request) {

        return createTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransformJobResult> createTransformJobAsync(final CreateTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransformJobRequest, CreateTransformJobResult> asyncHandler) {
        final CreateTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransformJobResult>() {
            @Override
            public CreateTransformJobResult call() throws Exception {
                CreateTransformJobResult result = null;

                try {
                    result = executeCreateTransformJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTrialResult> createTrialAsync(CreateTrialRequest request) {

        return createTrialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrialResult> createTrialAsync(final CreateTrialRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrialRequest, CreateTrialResult> asyncHandler) {
        final CreateTrialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrialResult>() {
            @Override
            public CreateTrialResult call() throws Exception {
                CreateTrialResult result = null;

                try {
                    result = executeCreateTrial(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTrialComponentResult> createTrialComponentAsync(CreateTrialComponentRequest request) {

        return createTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrialComponentResult> createTrialComponentAsync(final CreateTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrialComponentRequest, CreateTrialComponentResult> asyncHandler) {
        final CreateTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrialComponentResult>() {
            @Override
            public CreateTrialComponentResult call() throws Exception {
                CreateTrialComponentResult result = null;

                try {
                    result = executeCreateTrialComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest request) {

        return createUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(final CreateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler) {
        final CreateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserProfileResult>() {
            @Override
            public CreateUserProfileResult call() throws Exception {
                CreateUserProfileResult result = null;

                try {
                    result = executeCreateUserProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWorkforceResult> createWorkforceAsync(CreateWorkforceRequest request) {

        return createWorkforceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkforceResult> createWorkforceAsync(final CreateWorkforceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkforceRequest, CreateWorkforceResult> asyncHandler) {
        final CreateWorkforceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkforceResult>() {
            @Override
            public CreateWorkforceResult call() throws Exception {
                CreateWorkforceResult result = null;

                try {
                    result = executeCreateWorkforce(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWorkteamResult> createWorkteamAsync(CreateWorkteamRequest request) {

        return createWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkteamResult> createWorkteamAsync(final CreateWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkteamRequest, CreateWorkteamResult> asyncHandler) {
        final CreateWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkteamResult>() {
            @Override
            public CreateWorkteamResult call() throws Exception {
                CreateWorkteamResult result = null;

                try {
                    result = executeCreateWorkteam(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteActionResult> deleteActionAsync(DeleteActionRequest request) {

        return deleteActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteActionResult> deleteActionAsync(final DeleteActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteActionRequest, DeleteActionResult> asyncHandler) {
        final DeleteActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteActionResult>() {
            @Override
            public DeleteActionResult call() throws Exception {
                DeleteActionResult result = null;

                try {
                    result = executeDeleteAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAlgorithmResult> deleteAlgorithmAsync(DeleteAlgorithmRequest request) {

        return deleteAlgorithmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlgorithmResult> deleteAlgorithmAsync(final DeleteAlgorithmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAlgorithmRequest, DeleteAlgorithmResult> asyncHandler) {
        final DeleteAlgorithmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAlgorithmResult>() {
            @Override
            public DeleteAlgorithmResult call() throws Exception {
                DeleteAlgorithmResult result = null;

                try {
                    result = executeDeleteAlgorithm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteAppImageConfigResult> deleteAppImageConfigAsync(DeleteAppImageConfigRequest request) {

        return deleteAppImageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppImageConfigResult> deleteAppImageConfigAsync(final DeleteAppImageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppImageConfigRequest, DeleteAppImageConfigResult> asyncHandler) {
        final DeleteAppImageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppImageConfigResult>() {
            @Override
            public DeleteAppImageConfigResult call() throws Exception {
                DeleteAppImageConfigResult result = null;

                try {
                    result = executeDeleteAppImageConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteArtifactResult> deleteArtifactAsync(DeleteArtifactRequest request) {

        return deleteArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteArtifactResult> deleteArtifactAsync(final DeleteArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteArtifactRequest, DeleteArtifactResult> asyncHandler) {
        final DeleteArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteArtifactResult>() {
            @Override
            public DeleteArtifactResult call() throws Exception {
                DeleteArtifactResult result = null;

                try {
                    result = executeDeleteArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest request) {

        return deleteAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(final DeleteAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler) {
        final DeleteAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssociationResult>() {
            @Override
            public DeleteAssociationResult call() throws Exception {
                DeleteAssociationResult result = null;

                try {
                    result = executeDeleteAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCodeRepositoryResult> deleteCodeRepositoryAsync(DeleteCodeRepositoryRequest request) {

        return deleteCodeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCodeRepositoryResult> deleteCodeRepositoryAsync(final DeleteCodeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCodeRepositoryRequest, DeleteCodeRepositoryResult> asyncHandler) {
        final DeleteCodeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCodeRepositoryResult>() {
            @Override
            public DeleteCodeRepositoryResult call() throws Exception {
                DeleteCodeRepositoryResult result = null;

                try {
                    result = executeDeleteCodeRepository(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteContextResult> deleteContextAsync(DeleteContextRequest request) {

        return deleteContextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContextResult> deleteContextAsync(final DeleteContextRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContextRequest, DeleteContextResult> asyncHandler) {
        final DeleteContextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContextResult>() {
            @Override
            public DeleteContextResult call() throws Exception {
                DeleteContextResult result = null;

                try {
                    result = executeDeleteContext(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataQualityJobDefinitionResult> deleteDataQualityJobDefinitionAsync(DeleteDataQualityJobDefinitionRequest request) {

        return deleteDataQualityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataQualityJobDefinitionResult> deleteDataQualityJobDefinitionAsync(
            final DeleteDataQualityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataQualityJobDefinitionRequest, DeleteDataQualityJobDefinitionResult> asyncHandler) {
        final DeleteDataQualityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataQualityJobDefinitionResult>() {
            @Override
            public DeleteDataQualityJobDefinitionResult call() throws Exception {
                DeleteDataQualityJobDefinitionResult result = null;

                try {
                    result = executeDeleteDataQualityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceFleetResult> deleteDeviceFleetAsync(DeleteDeviceFleetRequest request) {

        return deleteDeviceFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceFleetResult> deleteDeviceFleetAsync(final DeleteDeviceFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeviceFleetRequest, DeleteDeviceFleetResult> asyncHandler) {
        final DeleteDeviceFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeviceFleetResult>() {
            @Override
            public DeleteDeviceFleetResult call() throws Exception {
                DeleteDeviceFleetResult result = null;

                try {
                    result = executeDeleteDeviceFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {
        final DeleteDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result = null;

                try {
                    result = executeDeleteDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(final DeleteEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {
        final DeleteEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointResult>() {
            @Override
            public DeleteEndpointResult call() throws Exception {
                DeleteEndpointResult result = null;

                try {
                    result = executeDeleteEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest request) {

        return deleteEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(final DeleteEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointConfigRequest, DeleteEndpointConfigResult> asyncHandler) {
        final DeleteEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointConfigResult>() {
            @Override
            public DeleteEndpointConfigResult call() throws Exception {
                DeleteEndpointConfigResult result = null;

                try {
                    result = executeDeleteEndpointConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteExperimentResult> deleteExperimentAsync(DeleteExperimentRequest request) {

        return deleteExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExperimentResult> deleteExperimentAsync(final DeleteExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExperimentRequest, DeleteExperimentResult> asyncHandler) {
        final DeleteExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExperimentResult>() {
            @Override
            public DeleteExperimentResult call() throws Exception {
                DeleteExperimentResult result = null;

                try {
                    result = executeDeleteExperiment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFeatureGroupResult> deleteFeatureGroupAsync(DeleteFeatureGroupRequest request) {

        return deleteFeatureGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFeatureGroupResult> deleteFeatureGroupAsync(final DeleteFeatureGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFeatureGroupRequest, DeleteFeatureGroupResult> asyncHandler) {
        final DeleteFeatureGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFeatureGroupResult>() {
            @Override
            public DeleteFeatureGroupResult call() throws Exception {
                DeleteFeatureGroupResult result = null;

                try {
                    result = executeDeleteFeatureGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowDefinitionResult> deleteFlowDefinitionAsync(DeleteFlowDefinitionRequest request) {

        return deleteFlowDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowDefinitionResult> deleteFlowDefinitionAsync(final DeleteFlowDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFlowDefinitionRequest, DeleteFlowDefinitionResult> asyncHandler) {
        final DeleteFlowDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFlowDefinitionResult>() {
            @Override
            public DeleteFlowDefinitionResult call() throws Exception {
                DeleteFlowDefinitionResult result = null;

                try {
                    result = executeDeleteFlowDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteHumanTaskUiResult> deleteHumanTaskUiAsync(DeleteHumanTaskUiRequest request) {

        return deleteHumanTaskUiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHumanTaskUiResult> deleteHumanTaskUiAsync(final DeleteHumanTaskUiRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHumanTaskUiRequest, DeleteHumanTaskUiResult> asyncHandler) {
        final DeleteHumanTaskUiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHumanTaskUiResult>() {
            @Override
            public DeleteHumanTaskUiResult call() throws Exception {
                DeleteHumanTaskUiResult result = null;

                try {
                    result = executeDeleteHumanTaskUi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest request) {

        return deleteImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(final DeleteImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImageRequest, DeleteImageResult> asyncHandler) {
        final DeleteImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImageResult>() {
            @Override
            public DeleteImageResult call() throws Exception {
                DeleteImageResult result = null;

                try {
                    result = executeDeleteImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImageVersionResult> deleteImageVersionAsync(DeleteImageVersionRequest request) {

        return deleteImageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageVersionResult> deleteImageVersionAsync(final DeleteImageVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImageVersionRequest, DeleteImageVersionResult> asyncHandler) {
        final DeleteImageVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImageVersionResult>() {
            @Override
            public DeleteImageVersionResult call() throws Exception {
                DeleteImageVersionResult result = null;

                try {
                    result = executeDeleteImageVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(final DeleteModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler) {
        final DeleteModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelResult>() {
            @Override
            public DeleteModelResult call() throws Exception {
                DeleteModelResult result = null;

                try {
                    result = executeDeleteModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelBiasJobDefinitionResult> deleteModelBiasJobDefinitionAsync(DeleteModelBiasJobDefinitionRequest request) {

        return deleteModelBiasJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelBiasJobDefinitionResult> deleteModelBiasJobDefinitionAsync(final DeleteModelBiasJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelBiasJobDefinitionRequest, DeleteModelBiasJobDefinitionResult> asyncHandler) {
        final DeleteModelBiasJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelBiasJobDefinitionResult>() {
            @Override
            public DeleteModelBiasJobDefinitionResult call() throws Exception {
                DeleteModelBiasJobDefinitionResult result = null;

                try {
                    result = executeDeleteModelBiasJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelExplainabilityJobDefinitionResult> deleteModelExplainabilityJobDefinitionAsync(
            DeleteModelExplainabilityJobDefinitionRequest request) {

        return deleteModelExplainabilityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelExplainabilityJobDefinitionResult> deleteModelExplainabilityJobDefinitionAsync(
            final DeleteModelExplainabilityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelExplainabilityJobDefinitionRequest, DeleteModelExplainabilityJobDefinitionResult> asyncHandler) {
        final DeleteModelExplainabilityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelExplainabilityJobDefinitionResult>() {
            @Override
            public DeleteModelExplainabilityJobDefinitionResult call() throws Exception {
                DeleteModelExplainabilityJobDefinitionResult result = null;

                try {
                    result = executeDeleteModelExplainabilityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelPackageResult> deleteModelPackageAsync(DeleteModelPackageRequest request) {

        return deleteModelPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelPackageResult> deleteModelPackageAsync(final DeleteModelPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelPackageRequest, DeleteModelPackageResult> asyncHandler) {
        final DeleteModelPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelPackageResult>() {
            @Override
            public DeleteModelPackageResult call() throws Exception {
                DeleteModelPackageResult result = null;

                try {
                    result = executeDeleteModelPackage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelPackageGroupResult> deleteModelPackageGroupAsync(DeleteModelPackageGroupRequest request) {

        return deleteModelPackageGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelPackageGroupResult> deleteModelPackageGroupAsync(final DeleteModelPackageGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelPackageGroupRequest, DeleteModelPackageGroupResult> asyncHandler) {
        final DeleteModelPackageGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelPackageGroupResult>() {
            @Override
            public DeleteModelPackageGroupResult call() throws Exception {
                DeleteModelPackageGroupResult result = null;

                try {
                    result = executeDeleteModelPackageGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelPackageGroupPolicyResult> deleteModelPackageGroupPolicyAsync(DeleteModelPackageGroupPolicyRequest request) {

        return deleteModelPackageGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelPackageGroupPolicyResult> deleteModelPackageGroupPolicyAsync(
            final DeleteModelPackageGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelPackageGroupPolicyRequest, DeleteModelPackageGroupPolicyResult> asyncHandler) {
        final DeleteModelPackageGroupPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelPackageGroupPolicyResult>() {
            @Override
            public DeleteModelPackageGroupPolicyResult call() throws Exception {
                DeleteModelPackageGroupPolicyResult result = null;

                try {
                    result = executeDeleteModelPackageGroupPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelQualityJobDefinitionResult> deleteModelQualityJobDefinitionAsync(
            DeleteModelQualityJobDefinitionRequest request) {

        return deleteModelQualityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelQualityJobDefinitionResult> deleteModelQualityJobDefinitionAsync(
            final DeleteModelQualityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelQualityJobDefinitionRequest, DeleteModelQualityJobDefinitionResult> asyncHandler) {
        final DeleteModelQualityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelQualityJobDefinitionResult>() {
            @Override
            public DeleteModelQualityJobDefinitionResult call() throws Exception {
                DeleteModelQualityJobDefinitionResult result = null;

                try {
                    result = executeDeleteModelQualityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoringScheduleResult> deleteMonitoringScheduleAsync(DeleteMonitoringScheduleRequest request) {

        return deleteMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoringScheduleResult> deleteMonitoringScheduleAsync(final DeleteMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMonitoringScheduleRequest, DeleteMonitoringScheduleResult> asyncHandler) {
        final DeleteMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMonitoringScheduleResult>() {
            @Override
            public DeleteMonitoringScheduleResult call() throws Exception {
                DeleteMonitoringScheduleResult result = null;

                try {
                    result = executeDeleteMonitoringSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest request) {

        return deleteNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(final DeleteNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceRequest, DeleteNotebookInstanceResult> asyncHandler) {
        final DeleteNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotebookInstanceResult>() {
            @Override
            public DeleteNotebookInstanceResult call() throws Exception {
                DeleteNotebookInstanceResult result = null;

                try {
                    result = executeDeleteNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceLifecycleConfigResult> deleteNotebookInstanceLifecycleConfigAsync(
            DeleteNotebookInstanceLifecycleConfigRequest request) {

        return deleteNotebookInstanceLifecycleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceLifecycleConfigResult> deleteNotebookInstanceLifecycleConfigAsync(
            final DeleteNotebookInstanceLifecycleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceLifecycleConfigRequest, DeleteNotebookInstanceLifecycleConfigResult> asyncHandler) {
        final DeleteNotebookInstanceLifecycleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotebookInstanceLifecycleConfigResult>() {
            @Override
            public DeleteNotebookInstanceLifecycleConfigResult call() throws Exception {
                DeleteNotebookInstanceLifecycleConfigResult result = null;

                try {
                    result = executeDeleteNotebookInstanceLifecycleConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request) {

        return deletePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(final DeletePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler) {
        final DeletePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePipelineResult>() {
            @Override
            public DeletePipelineResult call() throws Exception {
                DeletePipelineResult result = null;

                try {
                    result = executeDeletePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(final DeleteProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {
        final DeleteProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProjectResult>() {
            @Override
            public DeleteProjectResult call() throws Exception {
                DeleteProjectResult result = null;

                try {
                    result = executeDeleteProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTrialResult> deleteTrialAsync(DeleteTrialRequest request) {

        return deleteTrialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrialResult> deleteTrialAsync(final DeleteTrialRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrialRequest, DeleteTrialResult> asyncHandler) {
        final DeleteTrialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrialResult>() {
            @Override
            public DeleteTrialResult call() throws Exception {
                DeleteTrialResult result = null;

                try {
                    result = executeDeleteTrial(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTrialComponentResult> deleteTrialComponentAsync(DeleteTrialComponentRequest request) {

        return deleteTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrialComponentResult> deleteTrialComponentAsync(final DeleteTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrialComponentRequest, DeleteTrialComponentResult> asyncHandler) {
        final DeleteTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrialComponentResult>() {
            @Override
            public DeleteTrialComponentResult call() throws Exception {
                DeleteTrialComponentResult result = null;

                try {
                    result = executeDeleteTrialComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest request) {

        return deleteUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(final DeleteUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, DeleteUserProfileResult> asyncHandler) {
        final DeleteUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserProfileResult>() {
            @Override
            public DeleteUserProfileResult call() throws Exception {
                DeleteUserProfileResult result = null;

                try {
                    result = executeDeleteUserProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkforceResult> deleteWorkforceAsync(DeleteWorkforceRequest request) {

        return deleteWorkforceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkforceResult> deleteWorkforceAsync(final DeleteWorkforceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkforceRequest, DeleteWorkforceResult> asyncHandler) {
        final DeleteWorkforceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkforceResult>() {
            @Override
            public DeleteWorkforceResult call() throws Exception {
                DeleteWorkforceResult result = null;

                try {
                    result = executeDeleteWorkforce(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkteamResult> deleteWorkteamAsync(DeleteWorkteamRequest request) {

        return deleteWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkteamResult> deleteWorkteamAsync(final DeleteWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkteamRequest, DeleteWorkteamResult> asyncHandler) {
        final DeleteWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkteamResult>() {
            @Override
            public DeleteWorkteamResult call() throws Exception {
                DeleteWorkteamResult result = null;

                try {
                    result = executeDeleteWorkteam(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterDevicesResult> deregisterDevicesAsync(DeregisterDevicesRequest request) {

        return deregisterDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterDevicesResult> deregisterDevicesAsync(final DeregisterDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterDevicesRequest, DeregisterDevicesResult> asyncHandler) {
        final DeregisterDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterDevicesResult>() {
            @Override
            public DeregisterDevicesResult call() throws Exception {
                DeregisterDevicesResult result = null;

                try {
                    result = executeDeregisterDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeActionResult> describeActionAsync(DescribeActionRequest request) {

        return describeActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActionResult> describeActionAsync(final DescribeActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActionRequest, DescribeActionResult> asyncHandler) {
        final DescribeActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeActionResult>() {
            @Override
            public DescribeActionResult call() throws Exception {
                DescribeActionResult result = null;

                try {
                    result = executeDescribeAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest request) {

        return describeAlgorithmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(final DescribeAlgorithmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAlgorithmRequest, DescribeAlgorithmResult> asyncHandler) {
        final DescribeAlgorithmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAlgorithmResult>() {
            @Override
            public DescribeAlgorithmResult call() throws Exception {
                DescribeAlgorithmResult result = null;

                try {
                    result = executeDescribeAlgorithm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest request) {

        return describeAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(final DescribeAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler) {
        final DescribeAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppResult>() {
            @Override
            public DescribeAppResult call() throws Exception {
                DescribeAppResult result = null;

                try {
                    result = executeDescribeApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppImageConfigResult> describeAppImageConfigAsync(DescribeAppImageConfigRequest request) {

        return describeAppImageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppImageConfigResult> describeAppImageConfigAsync(final DescribeAppImageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppImageConfigRequest, DescribeAppImageConfigResult> asyncHandler) {
        final DescribeAppImageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppImageConfigResult>() {
            @Override
            public DescribeAppImageConfigResult call() throws Exception {
                DescribeAppImageConfigResult result = null;

                try {
                    result = executeDescribeAppImageConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeArtifactResult> describeArtifactAsync(DescribeArtifactRequest request) {

        return describeArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeArtifactResult> describeArtifactAsync(final DescribeArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeArtifactRequest, DescribeArtifactResult> asyncHandler) {
        final DescribeArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeArtifactResult>() {
            @Override
            public DescribeArtifactResult call() throws Exception {
                DescribeArtifactResult result = null;

                try {
                    result = executeDescribeArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoMLJobResult> describeAutoMLJobAsync(DescribeAutoMLJobRequest request) {

        return describeAutoMLJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoMLJobResult> describeAutoMLJobAsync(final DescribeAutoMLJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutoMLJobRequest, DescribeAutoMLJobResult> asyncHandler) {
        final DescribeAutoMLJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAutoMLJobResult>() {
            @Override
            public DescribeAutoMLJobResult call() throws Exception {
                DescribeAutoMLJobResult result = null;

                try {
                    result = executeDescribeAutoMLJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeRepositoryResult> describeCodeRepositoryAsync(DescribeCodeRepositoryRequest request) {

        return describeCodeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeRepositoryResult> describeCodeRepositoryAsync(final DescribeCodeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCodeRepositoryRequest, DescribeCodeRepositoryResult> asyncHandler) {
        final DescribeCodeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCodeRepositoryResult>() {
            @Override
            public DescribeCodeRepositoryResult call() throws Exception {
                DescribeCodeRepositoryResult result = null;

                try {
                    result = executeDescribeCodeRepository(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeCompilationJobResult> describeCompilationJobAsync(DescribeCompilationJobRequest request) {

        return describeCompilationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCompilationJobResult> describeCompilationJobAsync(final DescribeCompilationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCompilationJobRequest, DescribeCompilationJobResult> asyncHandler) {
        final DescribeCompilationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCompilationJobResult>() {
            @Override
            public DescribeCompilationJobResult call() throws Exception {
                DescribeCompilationJobResult result = null;

                try {
                    result = executeDescribeCompilationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeContextResult> describeContextAsync(DescribeContextRequest request) {

        return describeContextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContextResult> describeContextAsync(final DescribeContextRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContextRequest, DescribeContextResult> asyncHandler) {
        final DescribeContextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContextResult>() {
            @Override
            public DescribeContextResult call() throws Exception {
                DescribeContextResult result = null;

                try {
                    result = executeDescribeContext(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDataQualityJobDefinitionResult> describeDataQualityJobDefinitionAsync(
            DescribeDataQualityJobDefinitionRequest request) {

        return describeDataQualityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataQualityJobDefinitionResult> describeDataQualityJobDefinitionAsync(
            final DescribeDataQualityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataQualityJobDefinitionRequest, DescribeDataQualityJobDefinitionResult> asyncHandler) {
        final DescribeDataQualityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataQualityJobDefinitionResult>() {
            @Override
            public DescribeDataQualityJobDefinitionResult call() throws Exception {
                DescribeDataQualityJobDefinitionResult result = null;

                try {
                    result = executeDescribeDataQualityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest request) {

        return describeDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(final DescribeDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler) {
        final DescribeDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeviceResult>() {
            @Override
            public DescribeDeviceResult call() throws Exception {
                DescribeDeviceResult result = null;

                try {
                    result = executeDescribeDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceFleetResult> describeDeviceFleetAsync(DescribeDeviceFleetRequest request) {

        return describeDeviceFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceFleetResult> describeDeviceFleetAsync(final DescribeDeviceFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeviceFleetRequest, DescribeDeviceFleetResult> asyncHandler) {
        final DescribeDeviceFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeviceFleetResult>() {
            @Override
            public DescribeDeviceFleetResult call() throws Exception {
                DescribeDeviceFleetResult result = null;

                try {
                    result = executeDescribeDeviceFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(final DescribeDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler) {
        final DescribeDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainResult>() {
            @Override
            public DescribeDomainResult call() throws Exception {
                DescribeDomainResult result = null;

                try {
                    result = executeDescribeDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEdgePackagingJobResult> describeEdgePackagingJobAsync(DescribeEdgePackagingJobRequest request) {

        return describeEdgePackagingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEdgePackagingJobResult> describeEdgePackagingJobAsync(final DescribeEdgePackagingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEdgePackagingJobRequest, DescribeEdgePackagingJobResult> asyncHandler) {
        final DescribeEdgePackagingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEdgePackagingJobResult>() {
            @Override
            public DescribeEdgePackagingJobResult call() throws Exception {
                DescribeEdgePackagingJobResult result = null;

                try {
                    result = executeDescribeEdgePackagingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest request) {

        return describeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(final DescribeEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler) {
        final DescribeEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointResult>() {
            @Override
            public DescribeEndpointResult call() throws Exception {
                DescribeEndpointResult result = null;

                try {
                    result = executeDescribeEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest request) {

        return describeEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(final DescribeEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointConfigRequest, DescribeEndpointConfigResult> asyncHandler) {
        final DescribeEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointConfigResult>() {
            @Override
            public DescribeEndpointConfigResult call() throws Exception {
                DescribeEndpointConfigResult result = null;

                try {
                    result = executeDescribeEndpointConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeExperimentResult> describeExperimentAsync(DescribeExperimentRequest request) {

        return describeExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExperimentResult> describeExperimentAsync(final DescribeExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExperimentRequest, DescribeExperimentResult> asyncHandler) {
        final DescribeExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExperimentResult>() {
            @Override
            public DescribeExperimentResult call() throws Exception {
                DescribeExperimentResult result = null;

                try {
                    result = executeDescribeExperiment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFeatureGroupResult> describeFeatureGroupAsync(DescribeFeatureGroupRequest request) {

        return describeFeatureGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFeatureGroupResult> describeFeatureGroupAsync(final DescribeFeatureGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFeatureGroupRequest, DescribeFeatureGroupResult> asyncHandler) {
        final DescribeFeatureGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFeatureGroupResult>() {
            @Override
            public DescribeFeatureGroupResult call() throws Exception {
                DescribeFeatureGroupResult result = null;

                try {
                    result = executeDescribeFeatureGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowDefinitionResult> describeFlowDefinitionAsync(DescribeFlowDefinitionRequest request) {

        return describeFlowDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowDefinitionResult> describeFlowDefinitionAsync(final DescribeFlowDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowDefinitionRequest, DescribeFlowDefinitionResult> asyncHandler) {
        final DescribeFlowDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowDefinitionResult>() {
            @Override
            public DescribeFlowDefinitionResult call() throws Exception {
                DescribeFlowDefinitionResult result = null;

                try {
                    result = executeDescribeFlowDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeHumanTaskUiResult> describeHumanTaskUiAsync(DescribeHumanTaskUiRequest request) {

        return describeHumanTaskUiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHumanTaskUiResult> describeHumanTaskUiAsync(final DescribeHumanTaskUiRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHumanTaskUiRequest, DescribeHumanTaskUiResult> asyncHandler) {
        final DescribeHumanTaskUiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHumanTaskUiResult>() {
            @Override
            public DescribeHumanTaskUiResult call() throws Exception {
                DescribeHumanTaskUiResult result = null;

                try {
                    result = executeDescribeHumanTaskUi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeHyperParameterTuningJobResult> describeHyperParameterTuningJobAsync(
            DescribeHyperParameterTuningJobRequest request) {

        return describeHyperParameterTuningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHyperParameterTuningJobResult> describeHyperParameterTuningJobAsync(
            final DescribeHyperParameterTuningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHyperParameterTuningJobRequest, DescribeHyperParameterTuningJobResult> asyncHandler) {
        final DescribeHyperParameterTuningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHyperParameterTuningJobResult>() {
            @Override
            public DescribeHyperParameterTuningJobResult call() throws Exception {
                DescribeHyperParameterTuningJobResult result = null;

                try {
                    result = executeDescribeHyperParameterTuningJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeImageResult> describeImageAsync(DescribeImageRequest request) {

        return describeImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImageResult> describeImageAsync(final DescribeImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImageRequest, DescribeImageResult> asyncHandler) {
        final DescribeImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImageResult>() {
            @Override
            public DescribeImageResult call() throws Exception {
                DescribeImageResult result = null;

                try {
                    result = executeDescribeImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeImageVersionResult> describeImageVersionAsync(DescribeImageVersionRequest request) {

        return describeImageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImageVersionResult> describeImageVersionAsync(final DescribeImageVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImageVersionRequest, DescribeImageVersionResult> asyncHandler) {
        final DescribeImageVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImageVersionResult>() {
            @Override
            public DescribeImageVersionResult call() throws Exception {
                DescribeImageVersionResult result = null;

                try {
                    result = executeDescribeImageVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeLabelingJobResult> describeLabelingJobAsync(DescribeLabelingJobRequest request) {

        return describeLabelingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLabelingJobResult> describeLabelingJobAsync(final DescribeLabelingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLabelingJobRequest, DescribeLabelingJobResult> asyncHandler) {
        final DescribeLabelingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLabelingJobResult>() {
            @Override
            public DescribeLabelingJobResult call() throws Exception {
                DescribeLabelingJobResult result = null;

                try {
                    result = executeDescribeLabelingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest request) {

        return describeModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelResult> describeModelAsync(final DescribeModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelRequest, DescribeModelResult> asyncHandler) {
        final DescribeModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelResult>() {
            @Override
            public DescribeModelResult call() throws Exception {
                DescribeModelResult result = null;

                try {
                    result = executeDescribeModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeModelBiasJobDefinitionResult> describeModelBiasJobDefinitionAsync(DescribeModelBiasJobDefinitionRequest request) {

        return describeModelBiasJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelBiasJobDefinitionResult> describeModelBiasJobDefinitionAsync(
            final DescribeModelBiasJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelBiasJobDefinitionRequest, DescribeModelBiasJobDefinitionResult> asyncHandler) {
        final DescribeModelBiasJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelBiasJobDefinitionResult>() {
            @Override
            public DescribeModelBiasJobDefinitionResult call() throws Exception {
                DescribeModelBiasJobDefinitionResult result = null;

                try {
                    result = executeDescribeModelBiasJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeModelExplainabilityJobDefinitionResult> describeModelExplainabilityJobDefinitionAsync(
            DescribeModelExplainabilityJobDefinitionRequest request) {

        return describeModelExplainabilityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelExplainabilityJobDefinitionResult> describeModelExplainabilityJobDefinitionAsync(
            final DescribeModelExplainabilityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelExplainabilityJobDefinitionRequest, DescribeModelExplainabilityJobDefinitionResult> asyncHandler) {
        final DescribeModelExplainabilityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelExplainabilityJobDefinitionResult>() {
            @Override
            public DescribeModelExplainabilityJobDefinitionResult call() throws Exception {
                DescribeModelExplainabilityJobDefinitionResult result = null;

                try {
                    result = executeDescribeModelExplainabilityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeModelPackageResult> describeModelPackageAsync(DescribeModelPackageRequest request) {

        return describeModelPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelPackageResult> describeModelPackageAsync(final DescribeModelPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelPackageRequest, DescribeModelPackageResult> asyncHandler) {
        final DescribeModelPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelPackageResult>() {
            @Override
            public DescribeModelPackageResult call() throws Exception {
                DescribeModelPackageResult result = null;

                try {
                    result = executeDescribeModelPackage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeModelPackageGroupResult> describeModelPackageGroupAsync(DescribeModelPackageGroupRequest request) {

        return describeModelPackageGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelPackageGroupResult> describeModelPackageGroupAsync(final DescribeModelPackageGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelPackageGroupRequest, DescribeModelPackageGroupResult> asyncHandler) {
        final DescribeModelPackageGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelPackageGroupResult>() {
            @Override
            public DescribeModelPackageGroupResult call() throws Exception {
                DescribeModelPackageGroupResult result = null;

                try {
                    result = executeDescribeModelPackageGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeModelQualityJobDefinitionResult> describeModelQualityJobDefinitionAsync(
            DescribeModelQualityJobDefinitionRequest request) {

        return describeModelQualityJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelQualityJobDefinitionResult> describeModelQualityJobDefinitionAsync(
            final DescribeModelQualityJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelQualityJobDefinitionRequest, DescribeModelQualityJobDefinitionResult> asyncHandler) {
        final DescribeModelQualityJobDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelQualityJobDefinitionResult>() {
            @Override
            public DescribeModelQualityJobDefinitionResult call() throws Exception {
                DescribeModelQualityJobDefinitionResult result = null;

                try {
                    result = executeDescribeModelQualityJobDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeMonitoringScheduleResult> describeMonitoringScheduleAsync(DescribeMonitoringScheduleRequest request) {

        return describeMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMonitoringScheduleResult> describeMonitoringScheduleAsync(final DescribeMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMonitoringScheduleRequest, DescribeMonitoringScheduleResult> asyncHandler) {
        final DescribeMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMonitoringScheduleResult>() {
            @Override
            public DescribeMonitoringScheduleResult call() throws Exception {
                DescribeMonitoringScheduleResult result = null;

                try {
                    result = executeDescribeMonitoringSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest request) {

        return describeNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(final DescribeNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult> asyncHandler) {
        final DescribeNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotebookInstanceResult>() {
            @Override
            public DescribeNotebookInstanceResult call() throws Exception {
                DescribeNotebookInstanceResult result = null;

                try {
                    result = executeDescribeNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceLifecycleConfigResult> describeNotebookInstanceLifecycleConfigAsync(
            DescribeNotebookInstanceLifecycleConfigRequest request) {

        return describeNotebookInstanceLifecycleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceLifecycleConfigResult> describeNotebookInstanceLifecycleConfigAsync(
            final DescribeNotebookInstanceLifecycleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceLifecycleConfigRequest, DescribeNotebookInstanceLifecycleConfigResult> asyncHandler) {
        final DescribeNotebookInstanceLifecycleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotebookInstanceLifecycleConfigResult>() {
            @Override
            public DescribeNotebookInstanceLifecycleConfigResult call() throws Exception {
                DescribeNotebookInstanceLifecycleConfigResult result = null;

                try {
                    result = executeDescribeNotebookInstanceLifecycleConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePipelineResult> describePipelineAsync(DescribePipelineRequest request) {

        return describePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePipelineResult> describePipelineAsync(final DescribePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePipelineRequest, DescribePipelineResult> asyncHandler) {
        final DescribePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePipelineResult>() {
            @Override
            public DescribePipelineResult call() throws Exception {
                DescribePipelineResult result = null;

                try {
                    result = executeDescribePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePipelineDefinitionForExecutionResult> describePipelineDefinitionForExecutionAsync(
            DescribePipelineDefinitionForExecutionRequest request) {

        return describePipelineDefinitionForExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePipelineDefinitionForExecutionResult> describePipelineDefinitionForExecutionAsync(
            final DescribePipelineDefinitionForExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePipelineDefinitionForExecutionRequest, DescribePipelineDefinitionForExecutionResult> asyncHandler) {
        final DescribePipelineDefinitionForExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePipelineDefinitionForExecutionResult>() {
            @Override
            public DescribePipelineDefinitionForExecutionResult call() throws Exception {
                DescribePipelineDefinitionForExecutionResult result = null;

                try {
                    result = executeDescribePipelineDefinitionForExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePipelineExecutionResult> describePipelineExecutionAsync(DescribePipelineExecutionRequest request) {

        return describePipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePipelineExecutionResult> describePipelineExecutionAsync(final DescribePipelineExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePipelineExecutionRequest, DescribePipelineExecutionResult> asyncHandler) {
        final DescribePipelineExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePipelineExecutionResult>() {
            @Override
            public DescribePipelineExecutionResult call() throws Exception {
                DescribePipelineExecutionResult result = null;

                try {
                    result = executeDescribePipelineExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProcessingJobResult> describeProcessingJobAsync(DescribeProcessingJobRequest request) {

        return describeProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProcessingJobResult> describeProcessingJobAsync(final DescribeProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProcessingJobRequest, DescribeProcessingJobResult> asyncHandler) {
        final DescribeProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProcessingJobResult>() {
            @Override
            public DescribeProcessingJobResult call() throws Exception {
                DescribeProcessingJobResult result = null;

                try {
                    result = executeDescribeProcessingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest request) {

        return describeProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(final DescribeProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler) {
        final DescribeProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProjectResult>() {
            @Override
            public DescribeProjectResult call() throws Exception {
                DescribeProjectResult result = null;

                try {
                    result = executeDescribeProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscribedWorkteamResult> describeSubscribedWorkteamAsync(DescribeSubscribedWorkteamRequest request) {

        return describeSubscribedWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscribedWorkteamResult> describeSubscribedWorkteamAsync(final DescribeSubscribedWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubscribedWorkteamRequest, DescribeSubscribedWorkteamResult> asyncHandler) {
        final DescribeSubscribedWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSubscribedWorkteamResult>() {
            @Override
            public DescribeSubscribedWorkteamResult call() throws Exception {
                DescribeSubscribedWorkteamResult result = null;

                try {
                    result = executeDescribeSubscribedWorkteam(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest request) {

        return describeTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(final DescribeTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrainingJobRequest, DescribeTrainingJobResult> asyncHandler) {
        final DescribeTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrainingJobResult>() {
            @Override
            public DescribeTrainingJobResult call() throws Exception {
                DescribeTrainingJobResult result = null;

                try {
                    result = executeDescribeTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTransformJobResult> describeTransformJobAsync(DescribeTransformJobRequest request) {

        return describeTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransformJobResult> describeTransformJobAsync(final DescribeTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTransformJobRequest, DescribeTransformJobResult> asyncHandler) {
        final DescribeTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTransformJobResult>() {
            @Override
            public DescribeTransformJobResult call() throws Exception {
                DescribeTransformJobResult result = null;

                try {
                    result = executeDescribeTransformJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTrialResult> describeTrialAsync(DescribeTrialRequest request) {

        return describeTrialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrialResult> describeTrialAsync(final DescribeTrialRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrialRequest, DescribeTrialResult> asyncHandler) {
        final DescribeTrialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrialResult>() {
            @Override
            public DescribeTrialResult call() throws Exception {
                DescribeTrialResult result = null;

                try {
                    result = executeDescribeTrial(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTrialComponentResult> describeTrialComponentAsync(DescribeTrialComponentRequest request) {

        return describeTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrialComponentResult> describeTrialComponentAsync(final DescribeTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrialComponentRequest, DescribeTrialComponentResult> asyncHandler) {
        final DescribeTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrialComponentResult>() {
            @Override
            public DescribeTrialComponentResult call() throws Exception {
                DescribeTrialComponentResult result = null;

                try {
                    result = executeDescribeTrialComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(DescribeUserProfileRequest request) {

        return describeUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(final DescribeUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserProfileRequest, DescribeUserProfileResult> asyncHandler) {
        final DescribeUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserProfileResult>() {
            @Override
            public DescribeUserProfileResult call() throws Exception {
                DescribeUserProfileResult result = null;

                try {
                    result = executeDescribeUserProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkforceResult> describeWorkforceAsync(DescribeWorkforceRequest request) {

        return describeWorkforceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkforceResult> describeWorkforceAsync(final DescribeWorkforceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkforceRequest, DescribeWorkforceResult> asyncHandler) {
        final DescribeWorkforceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkforceResult>() {
            @Override
            public DescribeWorkforceResult call() throws Exception {
                DescribeWorkforceResult result = null;

                try {
                    result = executeDescribeWorkforce(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkteamResult> describeWorkteamAsync(DescribeWorkteamRequest request) {

        return describeWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkteamResult> describeWorkteamAsync(final DescribeWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkteamRequest, DescribeWorkteamResult> asyncHandler) {
        final DescribeWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkteamResult>() {
            @Override
            public DescribeWorkteamResult call() throws Exception {
                DescribeWorkteamResult result = null;

                try {
                    result = executeDescribeWorkteam(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisableSagemakerServicecatalogPortfolioResult> disableSagemakerServicecatalogPortfolioAsync(
            DisableSagemakerServicecatalogPortfolioRequest request) {

        return disableSagemakerServicecatalogPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableSagemakerServicecatalogPortfolioResult> disableSagemakerServicecatalogPortfolioAsync(
            final DisableSagemakerServicecatalogPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableSagemakerServicecatalogPortfolioRequest, DisableSagemakerServicecatalogPortfolioResult> asyncHandler) {
        final DisableSagemakerServicecatalogPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableSagemakerServicecatalogPortfolioResult>() {
            @Override
            public DisableSagemakerServicecatalogPortfolioResult call() throws Exception {
                DisableSagemakerServicecatalogPortfolioResult result = null;

                try {
                    result = executeDisableSagemakerServicecatalogPortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateTrialComponentResult> disassociateTrialComponentAsync(DisassociateTrialComponentRequest request) {

        return disassociateTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTrialComponentResult> disassociateTrialComponentAsync(final DisassociateTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTrialComponentRequest, DisassociateTrialComponentResult> asyncHandler) {
        final DisassociateTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTrialComponentResult>() {
            @Override
            public DisassociateTrialComponentResult call() throws Exception {
                DisassociateTrialComponentResult result = null;

                try {
                    result = executeDisassociateTrialComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableSagemakerServicecatalogPortfolioResult> enableSagemakerServicecatalogPortfolioAsync(
            EnableSagemakerServicecatalogPortfolioRequest request) {

        return enableSagemakerServicecatalogPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableSagemakerServicecatalogPortfolioResult> enableSagemakerServicecatalogPortfolioAsync(
            final EnableSagemakerServicecatalogPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableSagemakerServicecatalogPortfolioRequest, EnableSagemakerServicecatalogPortfolioResult> asyncHandler) {
        final EnableSagemakerServicecatalogPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableSagemakerServicecatalogPortfolioResult>() {
            @Override
            public EnableSagemakerServicecatalogPortfolioResult call() throws Exception {
                EnableSagemakerServicecatalogPortfolioResult result = null;

                try {
                    result = executeEnableSagemakerServicecatalogPortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeviceFleetReportResult> getDeviceFleetReportAsync(GetDeviceFleetReportRequest request) {

        return getDeviceFleetReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceFleetReportResult> getDeviceFleetReportAsync(final GetDeviceFleetReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceFleetReportRequest, GetDeviceFleetReportResult> asyncHandler) {
        final GetDeviceFleetReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceFleetReportResult>() {
            @Override
            public GetDeviceFleetReportResult call() throws Exception {
                GetDeviceFleetReportResult result = null;

                try {
                    result = executeGetDeviceFleetReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelPackageGroupPolicyResult> getModelPackageGroupPolicyAsync(GetModelPackageGroupPolicyRequest request) {

        return getModelPackageGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelPackageGroupPolicyResult> getModelPackageGroupPolicyAsync(final GetModelPackageGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelPackageGroupPolicyRequest, GetModelPackageGroupPolicyResult> asyncHandler) {
        final GetModelPackageGroupPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelPackageGroupPolicyResult>() {
            @Override
            public GetModelPackageGroupPolicyResult call() throws Exception {
                GetModelPackageGroupPolicyResult result = null;

                try {
                    result = executeGetModelPackageGroupPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSagemakerServicecatalogPortfolioStatusResult> getSagemakerServicecatalogPortfolioStatusAsync(
            GetSagemakerServicecatalogPortfolioStatusRequest request) {

        return getSagemakerServicecatalogPortfolioStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSagemakerServicecatalogPortfolioStatusResult> getSagemakerServicecatalogPortfolioStatusAsync(
            final GetSagemakerServicecatalogPortfolioStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSagemakerServicecatalogPortfolioStatusRequest, GetSagemakerServicecatalogPortfolioStatusResult> asyncHandler) {
        final GetSagemakerServicecatalogPortfolioStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSagemakerServicecatalogPortfolioStatusResult>() {
            @Override
            public GetSagemakerServicecatalogPortfolioStatusResult call() throws Exception {
                GetSagemakerServicecatalogPortfolioStatusResult result = null;

                try {
                    result = executeGetSagemakerServicecatalogPortfolioStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSearchSuggestionsResult> getSearchSuggestionsAsync(GetSearchSuggestionsRequest request) {

        return getSearchSuggestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSearchSuggestionsResult> getSearchSuggestionsAsync(final GetSearchSuggestionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSearchSuggestionsRequest, GetSearchSuggestionsResult> asyncHandler) {
        final GetSearchSuggestionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSearchSuggestionsResult>() {
            @Override
            public GetSearchSuggestionsResult call() throws Exception {
                GetSearchSuggestionsResult result = null;

                try {
                    result = executeGetSearchSuggestions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListActionsResult> listActionsAsync(ListActionsRequest request) {

        return listActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActionsResult> listActionsAsync(final ListActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListActionsRequest, ListActionsResult> asyncHandler) {
        final ListActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListActionsResult>() {
            @Override
            public ListActionsResult call() throws Exception {
                ListActionsResult result = null;

                try {
                    result = executeListActions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAlgorithmsResult> listAlgorithmsAsync(ListAlgorithmsRequest request) {

        return listAlgorithmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAlgorithmsResult> listAlgorithmsAsync(final ListAlgorithmsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAlgorithmsRequest, ListAlgorithmsResult> asyncHandler) {
        final ListAlgorithmsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAlgorithmsResult>() {
            @Override
            public ListAlgorithmsResult call() throws Exception {
                ListAlgorithmsResult result = null;

                try {
                    result = executeListAlgorithms(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppImageConfigsResult> listAppImageConfigsAsync(ListAppImageConfigsRequest request) {

        return listAppImageConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppImageConfigsResult> listAppImageConfigsAsync(final ListAppImageConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppImageConfigsRequest, ListAppImageConfigsResult> asyncHandler) {
        final ListAppImageConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppImageConfigsResult>() {
            @Override
            public ListAppImageConfigsResult call() throws Exception {
                ListAppImageConfigsResult result = null;

                try {
                    result = executeListAppImageConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest request) {

        return listAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(final ListAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler) {
        final ListAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociationsResult>() {
            @Override
            public ListAssociationsResult call() throws Exception {
                ListAssociationsResult result = null;

                try {
                    result = executeListAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAutoMLJobsResult> listAutoMLJobsAsync(ListAutoMLJobsRequest request) {

        return listAutoMLJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAutoMLJobsResult> listAutoMLJobsAsync(final ListAutoMLJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAutoMLJobsRequest, ListAutoMLJobsResult> asyncHandler) {
        final ListAutoMLJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAutoMLJobsResult>() {
            @Override
            public ListAutoMLJobsResult call() throws Exception {
                ListAutoMLJobsResult result = null;

                try {
                    result = executeListAutoMLJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCandidatesForAutoMLJobResult> listCandidatesForAutoMLJobAsync(ListCandidatesForAutoMLJobRequest request) {

        return listCandidatesForAutoMLJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCandidatesForAutoMLJobResult> listCandidatesForAutoMLJobAsync(final ListCandidatesForAutoMLJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCandidatesForAutoMLJobRequest, ListCandidatesForAutoMLJobResult> asyncHandler) {
        final ListCandidatesForAutoMLJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCandidatesForAutoMLJobResult>() {
            @Override
            public ListCandidatesForAutoMLJobResult call() throws Exception {
                ListCandidatesForAutoMLJobResult result = null;

                try {
                    result = executeListCandidatesForAutoMLJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCodeRepositoriesResult> listCodeRepositoriesAsync(ListCodeRepositoriesRequest request) {

        return listCodeRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCodeRepositoriesResult> listCodeRepositoriesAsync(final ListCodeRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCodeRepositoriesRequest, ListCodeRepositoriesResult> asyncHandler) {
        final ListCodeRepositoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCodeRepositoriesResult>() {
            @Override
            public ListCodeRepositoriesResult call() throws Exception {
                ListCodeRepositoriesResult result = null;

                try {
                    result = executeListCodeRepositories(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCompilationJobsResult> listCompilationJobsAsync(ListCompilationJobsRequest request) {

        return listCompilationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCompilationJobsResult> listCompilationJobsAsync(final ListCompilationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCompilationJobsRequest, ListCompilationJobsResult> asyncHandler) {
        final ListCompilationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCompilationJobsResult>() {
            @Override
            public ListCompilationJobsResult call() throws Exception {
                ListCompilationJobsResult result = null;

                try {
                    result = executeListCompilationJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListContextsResult> listContextsAsync(ListContextsRequest request) {

        return listContextsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContextsResult> listContextsAsync(final ListContextsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContextsRequest, ListContextsResult> asyncHandler) {
        final ListContextsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContextsResult>() {
            @Override
            public ListContextsResult call() throws Exception {
                ListContextsResult result = null;

                try {
                    result = executeListContexts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataQualityJobDefinitionsResult> listDataQualityJobDefinitionsAsync(ListDataQualityJobDefinitionsRequest request) {

        return listDataQualityJobDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataQualityJobDefinitionsResult> listDataQualityJobDefinitionsAsync(
            final ListDataQualityJobDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataQualityJobDefinitionsRequest, ListDataQualityJobDefinitionsResult> asyncHandler) {
        final ListDataQualityJobDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataQualityJobDefinitionsResult>() {
            @Override
            public ListDataQualityJobDefinitionsResult call() throws Exception {
                ListDataQualityJobDefinitionsResult result = null;

                try {
                    result = executeListDataQualityJobDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeviceFleetsResult> listDeviceFleetsAsync(ListDeviceFleetsRequest request) {

        return listDeviceFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceFleetsResult> listDeviceFleetsAsync(final ListDeviceFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceFleetsRequest, ListDeviceFleetsResult> asyncHandler) {
        final ListDeviceFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceFleetsResult>() {
            @Override
            public ListDeviceFleetsResult call() throws Exception {
                ListDeviceFleetsResult result = null;

                try {
                    result = executeListDeviceFleets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(final ListDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {
        final ListDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevicesResult>() {
            @Override
            public ListDevicesResult call() throws Exception {
                ListDevicesResult result = null;

                try {
                    result = executeListDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {
        final ListDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result = null;

                try {
                    result = executeListDomains(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEdgePackagingJobsResult> listEdgePackagingJobsAsync(ListEdgePackagingJobsRequest request) {

        return listEdgePackagingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEdgePackagingJobsResult> listEdgePackagingJobsAsync(final ListEdgePackagingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEdgePackagingJobsRequest, ListEdgePackagingJobsResult> asyncHandler) {
        final ListEdgePackagingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEdgePackagingJobsResult>() {
            @Override
            public ListEdgePackagingJobsResult call() throws Exception {
                ListEdgePackagingJobsResult result = null;

                try {
                    result = executeListEdgePackagingJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest request) {

        return listEndpointConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(final ListEndpointConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointConfigsRequest, ListEndpointConfigsResult> asyncHandler) {
        final ListEndpointConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointConfigsResult>() {
            @Override
            public ListEndpointConfigsResult call() throws Exception {
                ListEndpointConfigsResult result = null;

                try {
                    result = executeListEndpointConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest request) {

        return listEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(final ListEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointsRequest, ListEndpointsResult> asyncHandler) {
        final ListEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointsResult>() {
            @Override
            public ListEndpointsResult call() throws Exception {
                ListEndpointsResult result = null;

                try {
                    result = executeListEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest request) {

        return listExperimentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(final ListExperimentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExperimentsRequest, ListExperimentsResult> asyncHandler) {
        final ListExperimentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExperimentsResult>() {
            @Override
            public ListExperimentsResult call() throws Exception {
                ListExperimentsResult result = null;

                try {
                    result = executeListExperiments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFeatureGroupsResult> listFeatureGroupsAsync(ListFeatureGroupsRequest request) {

        return listFeatureGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFeatureGroupsResult> listFeatureGroupsAsync(final ListFeatureGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFeatureGroupsRequest, ListFeatureGroupsResult> asyncHandler) {
        final ListFeatureGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFeatureGroupsResult>() {
            @Override
            public ListFeatureGroupsResult call() throws Exception {
                ListFeatureGroupsResult result = null;

                try {
                    result = executeListFeatureGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFlowDefinitionsResult> listFlowDefinitionsAsync(ListFlowDefinitionsRequest request) {

        return listFlowDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFlowDefinitionsResult> listFlowDefinitionsAsync(final ListFlowDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFlowDefinitionsRequest, ListFlowDefinitionsResult> asyncHandler) {
        final ListFlowDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFlowDefinitionsResult>() {
            @Override
            public ListFlowDefinitionsResult call() throws Exception {
                ListFlowDefinitionsResult result = null;

                try {
                    result = executeListFlowDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListHumanTaskUisResult> listHumanTaskUisAsync(ListHumanTaskUisRequest request) {

        return listHumanTaskUisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHumanTaskUisResult> listHumanTaskUisAsync(final ListHumanTaskUisRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHumanTaskUisRequest, ListHumanTaskUisResult> asyncHandler) {
        final ListHumanTaskUisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHumanTaskUisResult>() {
            @Override
            public ListHumanTaskUisResult call() throws Exception {
                ListHumanTaskUisResult result = null;

                try {
                    result = executeListHumanTaskUis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListHyperParameterTuningJobsResult> listHyperParameterTuningJobsAsync(ListHyperParameterTuningJobsRequest request) {

        return listHyperParameterTuningJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHyperParameterTuningJobsResult> listHyperParameterTuningJobsAsync(final ListHyperParameterTuningJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHyperParameterTuningJobsRequest, ListHyperParameterTuningJobsResult> asyncHandler) {
        final ListHyperParameterTuningJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHyperParameterTuningJobsResult>() {
            @Override
            public ListHyperParameterTuningJobsResult call() throws Exception {
                ListHyperParameterTuningJobsResult result = null;

                try {
                    result = executeListHyperParameterTuningJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListImageVersionsResult> listImageVersionsAsync(ListImageVersionsRequest request) {

        return listImageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImageVersionsResult> listImageVersionsAsync(final ListImageVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImageVersionsRequest, ListImageVersionsResult> asyncHandler) {
        final ListImageVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImageVersionsResult>() {
            @Override
            public ListImageVersionsResult call() throws Exception {
                ListImageVersionsResult result = null;

                try {
                    result = executeListImageVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest request) {

        return listImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(final ListImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler) {
        final ListImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImagesResult>() {
            @Override
            public ListImagesResult call() throws Exception {
                ListImagesResult result = null;

                try {
                    result = executeListImages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLabelingJobsResult> listLabelingJobsAsync(ListLabelingJobsRequest request) {

        return listLabelingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLabelingJobsResult> listLabelingJobsAsync(final ListLabelingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLabelingJobsRequest, ListLabelingJobsResult> asyncHandler) {
        final ListLabelingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLabelingJobsResult>() {
            @Override
            public ListLabelingJobsResult call() throws Exception {
                ListLabelingJobsResult result = null;

                try {
                    result = executeListLabelingJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLabelingJobsForWorkteamResult> listLabelingJobsForWorkteamAsync(ListLabelingJobsForWorkteamRequest request) {

        return listLabelingJobsForWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLabelingJobsForWorkteamResult> listLabelingJobsForWorkteamAsync(final ListLabelingJobsForWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLabelingJobsForWorkteamRequest, ListLabelingJobsForWorkteamResult> asyncHandler) {
        final ListLabelingJobsForWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLabelingJobsForWorkteamResult>() {
            @Override
            public ListLabelingJobsForWorkteamResult call() throws Exception {
                ListLabelingJobsForWorkteamResult result = null;

                try {
                    result = executeListLabelingJobsForWorkteam(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListModelBiasJobDefinitionsResult> listModelBiasJobDefinitionsAsync(ListModelBiasJobDefinitionsRequest request) {

        return listModelBiasJobDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelBiasJobDefinitionsResult> listModelBiasJobDefinitionsAsync(final ListModelBiasJobDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelBiasJobDefinitionsRequest, ListModelBiasJobDefinitionsResult> asyncHandler) {
        final ListModelBiasJobDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelBiasJobDefinitionsResult>() {
            @Override
            public ListModelBiasJobDefinitionsResult call() throws Exception {
                ListModelBiasJobDefinitionsResult result = null;

                try {
                    result = executeListModelBiasJobDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListModelExplainabilityJobDefinitionsResult> listModelExplainabilityJobDefinitionsAsync(
            ListModelExplainabilityJobDefinitionsRequest request) {

        return listModelExplainabilityJobDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelExplainabilityJobDefinitionsResult> listModelExplainabilityJobDefinitionsAsync(
            final ListModelExplainabilityJobDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelExplainabilityJobDefinitionsRequest, ListModelExplainabilityJobDefinitionsResult> asyncHandler) {
        final ListModelExplainabilityJobDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelExplainabilityJobDefinitionsResult>() {
            @Override
            public ListModelExplainabilityJobDefinitionsResult call() throws Exception {
                ListModelExplainabilityJobDefinitionsResult result = null;

                try {
                    result = executeListModelExplainabilityJobDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListModelPackageGroupsResult> listModelPackageGroupsAsync(ListModelPackageGroupsRequest request) {

        return listModelPackageGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelPackageGroupsResult> listModelPackageGroupsAsync(final ListModelPackageGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelPackageGroupsRequest, ListModelPackageGroupsResult> asyncHandler) {
        final ListModelPackageGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelPackageGroupsResult>() {
            @Override
            public ListModelPackageGroupsResult call() throws Exception {
                ListModelPackageGroupsResult result = null;

                try {
                    result = executeListModelPackageGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListModelPackagesResult> listModelPackagesAsync(ListModelPackagesRequest request) {

        return listModelPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelPackagesResult> listModelPackagesAsync(final ListModelPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelPackagesRequest, ListModelPackagesResult> asyncHandler) {
        final ListModelPackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelPackagesResult>() {
            @Override
            public ListModelPackagesResult call() throws Exception {
                ListModelPackagesResult result = null;

                try {
                    result = executeListModelPackages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListModelQualityJobDefinitionsResult> listModelQualityJobDefinitionsAsync(ListModelQualityJobDefinitionsRequest request) {

        return listModelQualityJobDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelQualityJobDefinitionsResult> listModelQualityJobDefinitionsAsync(
            final ListModelQualityJobDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelQualityJobDefinitionsRequest, ListModelQualityJobDefinitionsResult> asyncHandler) {
        final ListModelQualityJobDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelQualityJobDefinitionsResult>() {
            @Override
            public ListModelQualityJobDefinitionsResult call() throws Exception {
                ListModelQualityJobDefinitionsResult result = null;

                try {
                    result = executeListModelQualityJobDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest request) {

        return listModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelsResult> listModelsAsync(final ListModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelsRequest, ListModelsResult> asyncHandler) {
        final ListModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelsResult>() {
            @Override
            public ListModelsResult call() throws Exception {
                ListModelsResult result = null;

                try {
                    result = executeListModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMonitoringExecutionsResult> listMonitoringExecutionsAsync(ListMonitoringExecutionsRequest request) {

        return listMonitoringExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoringExecutionsResult> listMonitoringExecutionsAsync(final ListMonitoringExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMonitoringExecutionsRequest, ListMonitoringExecutionsResult> asyncHandler) {
        final ListMonitoringExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMonitoringExecutionsResult>() {
            @Override
            public ListMonitoringExecutionsResult call() throws Exception {
                ListMonitoringExecutionsResult result = null;

                try {
                    result = executeListMonitoringExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMonitoringSchedulesResult> listMonitoringSchedulesAsync(ListMonitoringSchedulesRequest request) {

        return listMonitoringSchedulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoringSchedulesResult> listMonitoringSchedulesAsync(final ListMonitoringSchedulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMonitoringSchedulesRequest, ListMonitoringSchedulesResult> asyncHandler) {
        final ListMonitoringSchedulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMonitoringSchedulesResult>() {
            @Override
            public ListMonitoringSchedulesResult call() throws Exception {
                ListMonitoringSchedulesResult result = null;

                try {
                    result = executeListMonitoringSchedules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstanceLifecycleConfigsResult> listNotebookInstanceLifecycleConfigsAsync(
            ListNotebookInstanceLifecycleConfigsRequest request) {

        return listNotebookInstanceLifecycleConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstanceLifecycleConfigsResult> listNotebookInstanceLifecycleConfigsAsync(
            final ListNotebookInstanceLifecycleConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotebookInstanceLifecycleConfigsRequest, ListNotebookInstanceLifecycleConfigsResult> asyncHandler) {
        final ListNotebookInstanceLifecycleConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotebookInstanceLifecycleConfigsResult>() {
            @Override
            public ListNotebookInstanceLifecycleConfigsResult call() throws Exception {
                ListNotebookInstanceLifecycleConfigsResult result = null;

                try {
                    result = executeListNotebookInstanceLifecycleConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest request) {

        return listNotebookInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(final ListNotebookInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotebookInstancesRequest, ListNotebookInstancesResult> asyncHandler) {
        final ListNotebookInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotebookInstancesResult>() {
            @Override
            public ListNotebookInstancesResult call() throws Exception {
                ListNotebookInstancesResult result = null;

                try {
                    result = executeListNotebookInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPipelineExecutionStepsResult> listPipelineExecutionStepsAsync(ListPipelineExecutionStepsRequest request) {

        return listPipelineExecutionStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelineExecutionStepsResult> listPipelineExecutionStepsAsync(final ListPipelineExecutionStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelineExecutionStepsRequest, ListPipelineExecutionStepsResult> asyncHandler) {
        final ListPipelineExecutionStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipelineExecutionStepsResult>() {
            @Override
            public ListPipelineExecutionStepsResult call() throws Exception {
                ListPipelineExecutionStepsResult result = null;

                try {
                    result = executeListPipelineExecutionSteps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPipelineExecutionsResult> listPipelineExecutionsAsync(ListPipelineExecutionsRequest request) {

        return listPipelineExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelineExecutionsResult> listPipelineExecutionsAsync(final ListPipelineExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelineExecutionsRequest, ListPipelineExecutionsResult> asyncHandler) {
        final ListPipelineExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipelineExecutionsResult>() {
            @Override
            public ListPipelineExecutionsResult call() throws Exception {
                ListPipelineExecutionsResult result = null;

                try {
                    result = executeListPipelineExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPipelineParametersForExecutionResult> listPipelineParametersForExecutionAsync(
            ListPipelineParametersForExecutionRequest request) {

        return listPipelineParametersForExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelineParametersForExecutionResult> listPipelineParametersForExecutionAsync(
            final ListPipelineParametersForExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelineParametersForExecutionRequest, ListPipelineParametersForExecutionResult> asyncHandler) {
        final ListPipelineParametersForExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipelineParametersForExecutionResult>() {
            @Override
            public ListPipelineParametersForExecutionResult call() throws Exception {
                ListPipelineParametersForExecutionResult result = null;

                try {
                    result = executeListPipelineParametersForExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request) {

        return listPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(final ListPipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {
        final ListPipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipelinesResult>() {
            @Override
            public ListPipelinesResult call() throws Exception {
                ListPipelinesResult result = null;

                try {
                    result = executeListPipelines(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProcessingJobsResult> listProcessingJobsAsync(ListProcessingJobsRequest request) {

        return listProcessingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProcessingJobsResult> listProcessingJobsAsync(final ListProcessingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProcessingJobsRequest, ListProcessingJobsResult> asyncHandler) {
        final ListProcessingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProcessingJobsResult>() {
            @Override
            public ListProcessingJobsResult call() throws Exception {
                ListProcessingJobsResult result = null;

                try {
                    result = executeListProcessingJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(final ListProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {
        final ListProjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProjectsResult>() {
            @Override
            public ListProjectsResult call() throws Exception {
                ListProjectsResult result = null;

                try {
                    result = executeListProjects(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSubscribedWorkteamsResult> listSubscribedWorkteamsAsync(ListSubscribedWorkteamsRequest request) {

        return listSubscribedWorkteamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscribedWorkteamsResult> listSubscribedWorkteamsAsync(final ListSubscribedWorkteamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscribedWorkteamsRequest, ListSubscribedWorkteamsResult> asyncHandler) {
        final ListSubscribedWorkteamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscribedWorkteamsResult>() {
            @Override
            public ListSubscribedWorkteamsResult call() throws Exception {
                ListSubscribedWorkteamsResult result = null;

                try {
                    result = executeListSubscribedWorkteams(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest request) {

        return listTrainingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(final ListTrainingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrainingJobsRequest, ListTrainingJobsResult> asyncHandler) {
        final ListTrainingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrainingJobsResult>() {
            @Override
            public ListTrainingJobsResult call() throws Exception {
                ListTrainingJobsResult result = null;

                try {
                    result = executeListTrainingJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsForHyperParameterTuningJobResult> listTrainingJobsForHyperParameterTuningJobAsync(
            ListTrainingJobsForHyperParameterTuningJobRequest request) {

        return listTrainingJobsForHyperParameterTuningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsForHyperParameterTuningJobResult> listTrainingJobsForHyperParameterTuningJobAsync(
            final ListTrainingJobsForHyperParameterTuningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrainingJobsForHyperParameterTuningJobRequest, ListTrainingJobsForHyperParameterTuningJobResult> asyncHandler) {
        final ListTrainingJobsForHyperParameterTuningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrainingJobsForHyperParameterTuningJobResult>() {
            @Override
            public ListTrainingJobsForHyperParameterTuningJobResult call() throws Exception {
                ListTrainingJobsForHyperParameterTuningJobResult result = null;

                try {
                    result = executeListTrainingJobsForHyperParameterTuningJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTransformJobsResult> listTransformJobsAsync(ListTransformJobsRequest request) {

        return listTransformJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransformJobsResult> listTransformJobsAsync(final ListTransformJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTransformJobsRequest, ListTransformJobsResult> asyncHandler) {
        final ListTransformJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTransformJobsResult>() {
            @Override
            public ListTransformJobsResult call() throws Exception {
                ListTransformJobsResult result = null;

                try {
                    result = executeListTransformJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTrialComponentsResult> listTrialComponentsAsync(ListTrialComponentsRequest request) {

        return listTrialComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrialComponentsResult> listTrialComponentsAsync(final ListTrialComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrialComponentsRequest, ListTrialComponentsResult> asyncHandler) {
        final ListTrialComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrialComponentsResult>() {
            @Override
            public ListTrialComponentsResult call() throws Exception {
                ListTrialComponentsResult result = null;

                try {
                    result = executeListTrialComponents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTrialsResult> listTrialsAsync(ListTrialsRequest request) {

        return listTrialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrialsResult> listTrialsAsync(final ListTrialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrialsRequest, ListTrialsResult> asyncHandler) {
        final ListTrialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrialsResult>() {
            @Override
            public ListTrialsResult call() throws Exception {
                ListTrialsResult result = null;

                try {
                    result = executeListTrials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(ListUserProfilesRequest request) {

        return listUserProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(final ListUserProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserProfilesRequest, ListUserProfilesResult> asyncHandler) {
        final ListUserProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserProfilesResult>() {
            @Override
            public ListUserProfilesResult call() throws Exception {
                ListUserProfilesResult result = null;

                try {
                    result = executeListUserProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkforcesResult> listWorkforcesAsync(ListWorkforcesRequest request) {

        return listWorkforcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkforcesResult> listWorkforcesAsync(final ListWorkforcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkforcesRequest, ListWorkforcesResult> asyncHandler) {
        final ListWorkforcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkforcesResult>() {
            @Override
            public ListWorkforcesResult call() throws Exception {
                ListWorkforcesResult result = null;

                try {
                    result = executeListWorkforces(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkteamsResult> listWorkteamsAsync(ListWorkteamsRequest request) {

        return listWorkteamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkteamsResult> listWorkteamsAsync(final ListWorkteamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkteamsRequest, ListWorkteamsResult> asyncHandler) {
        final ListWorkteamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkteamsResult>() {
            @Override
            public ListWorkteamsResult call() throws Exception {
                ListWorkteamsResult result = null;

                try {
                    result = executeListWorkteams(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutModelPackageGroupPolicyResult> putModelPackageGroupPolicyAsync(PutModelPackageGroupPolicyRequest request) {

        return putModelPackageGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutModelPackageGroupPolicyResult> putModelPackageGroupPolicyAsync(final PutModelPackageGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutModelPackageGroupPolicyRequest, PutModelPackageGroupPolicyResult> asyncHandler) {
        final PutModelPackageGroupPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutModelPackageGroupPolicyResult>() {
            @Override
            public PutModelPackageGroupPolicyResult call() throws Exception {
                PutModelPackageGroupPolicyResult result = null;

                try {
                    result = executePutModelPackageGroupPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterDevicesResult> registerDevicesAsync(RegisterDevicesRequest request) {

        return registerDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDevicesResult> registerDevicesAsync(final RegisterDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterDevicesRequest, RegisterDevicesResult> asyncHandler) {
        final RegisterDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterDevicesResult>() {
            @Override
            public RegisterDevicesResult call() throws Exception {
                RegisterDevicesResult result = null;

                try {
                    result = executeRegisterDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RenderUiTemplateResult> renderUiTemplateAsync(RenderUiTemplateRequest request) {

        return renderUiTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RenderUiTemplateResult> renderUiTemplateAsync(final RenderUiTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<RenderUiTemplateRequest, RenderUiTemplateResult> asyncHandler) {
        final RenderUiTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RenderUiTemplateResult>() {
            @Override
            public RenderUiTemplateResult call() throws Exception {
                RenderUiTemplateResult result = null;

                try {
                    result = executeRenderUiTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest request) {

        return searchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResult> searchAsync(final SearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler) {
        final SearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchResult>() {
            @Override
            public SearchResult call() throws Exception {
                SearchResult result = null;

                try {
                    result = executeSearch(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartMonitoringScheduleResult> startMonitoringScheduleAsync(StartMonitoringScheduleRequest request) {

        return startMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMonitoringScheduleResult> startMonitoringScheduleAsync(final StartMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMonitoringScheduleRequest, StartMonitoringScheduleResult> asyncHandler) {
        final StartMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMonitoringScheduleResult>() {
            @Override
            public StartMonitoringScheduleResult call() throws Exception {
                StartMonitoringScheduleResult result = null;

                try {
                    result = executeStartMonitoringSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest request) {

        return startNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(final StartNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartNotebookInstanceRequest, StartNotebookInstanceResult> asyncHandler) {
        final StartNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartNotebookInstanceResult>() {
            @Override
            public StartNotebookInstanceResult call() throws Exception {
                StartNotebookInstanceResult result = null;

                try {
                    result = executeStartNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(StartPipelineExecutionRequest request) {

        return startPipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(final StartPipelineExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartPipelineExecutionRequest, StartPipelineExecutionResult> asyncHandler) {
        final StartPipelineExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartPipelineExecutionResult>() {
            @Override
            public StartPipelineExecutionResult call() throws Exception {
                StartPipelineExecutionResult result = null;

                try {
                    result = executeStartPipelineExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopAutoMLJobResult> stopAutoMLJobAsync(StopAutoMLJobRequest request) {

        return stopAutoMLJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAutoMLJobResult> stopAutoMLJobAsync(final StopAutoMLJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAutoMLJobRequest, StopAutoMLJobResult> asyncHandler) {
        final StopAutoMLJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopAutoMLJobResult>() {
            @Override
            public StopAutoMLJobResult call() throws Exception {
                StopAutoMLJobResult result = null;

                try {
                    result = executeStopAutoMLJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopCompilationJobResult> stopCompilationJobAsync(StopCompilationJobRequest request) {

        return stopCompilationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCompilationJobResult> stopCompilationJobAsync(final StopCompilationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopCompilationJobRequest, StopCompilationJobResult> asyncHandler) {
        final StopCompilationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopCompilationJobResult>() {
            @Override
            public StopCompilationJobResult call() throws Exception {
                StopCompilationJobResult result = null;

                try {
                    result = executeStopCompilationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopEdgePackagingJobResult> stopEdgePackagingJobAsync(StopEdgePackagingJobRequest request) {

        return stopEdgePackagingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopEdgePackagingJobResult> stopEdgePackagingJobAsync(final StopEdgePackagingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopEdgePackagingJobRequest, StopEdgePackagingJobResult> asyncHandler) {
        final StopEdgePackagingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopEdgePackagingJobResult>() {
            @Override
            public StopEdgePackagingJobResult call() throws Exception {
                StopEdgePackagingJobResult result = null;

                try {
                    result = executeStopEdgePackagingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopHyperParameterTuningJobResult> stopHyperParameterTuningJobAsync(StopHyperParameterTuningJobRequest request) {

        return stopHyperParameterTuningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopHyperParameterTuningJobResult> stopHyperParameterTuningJobAsync(final StopHyperParameterTuningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopHyperParameterTuningJobRequest, StopHyperParameterTuningJobResult> asyncHandler) {
        final StopHyperParameterTuningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopHyperParameterTuningJobResult>() {
            @Override
            public StopHyperParameterTuningJobResult call() throws Exception {
                StopHyperParameterTuningJobResult result = null;

                try {
                    result = executeStopHyperParameterTuningJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopLabelingJobResult> stopLabelingJobAsync(StopLabelingJobRequest request) {

        return stopLabelingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopLabelingJobResult> stopLabelingJobAsync(final StopLabelingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopLabelingJobRequest, StopLabelingJobResult> asyncHandler) {
        final StopLabelingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopLabelingJobResult>() {
            @Override
            public StopLabelingJobResult call() throws Exception {
                StopLabelingJobResult result = null;

                try {
                    result = executeStopLabelingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopMonitoringScheduleResult> stopMonitoringScheduleAsync(StopMonitoringScheduleRequest request) {

        return stopMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopMonitoringScheduleResult> stopMonitoringScheduleAsync(final StopMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopMonitoringScheduleRequest, StopMonitoringScheduleResult> asyncHandler) {
        final StopMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopMonitoringScheduleResult>() {
            @Override
            public StopMonitoringScheduleResult call() throws Exception {
                StopMonitoringScheduleResult result = null;

                try {
                    result = executeStopMonitoringSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest request) {

        return stopNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(final StopNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopNotebookInstanceRequest, StopNotebookInstanceResult> asyncHandler) {
        final StopNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopNotebookInstanceResult>() {
            @Override
            public StopNotebookInstanceResult call() throws Exception {
                StopNotebookInstanceResult result = null;

                try {
                    result = executeStopNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopPipelineExecutionResult> stopPipelineExecutionAsync(StopPipelineExecutionRequest request) {

        return stopPipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopPipelineExecutionResult> stopPipelineExecutionAsync(final StopPipelineExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopPipelineExecutionRequest, StopPipelineExecutionResult> asyncHandler) {
        final StopPipelineExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopPipelineExecutionResult>() {
            @Override
            public StopPipelineExecutionResult call() throws Exception {
                StopPipelineExecutionResult result = null;

                try {
                    result = executeStopPipelineExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopProcessingJobResult> stopProcessingJobAsync(StopProcessingJobRequest request) {

        return stopProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopProcessingJobResult> stopProcessingJobAsync(final StopProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopProcessingJobRequest, StopProcessingJobResult> asyncHandler) {
        final StopProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopProcessingJobResult>() {
            @Override
            public StopProcessingJobResult call() throws Exception {
                StopProcessingJobResult result = null;

                try {
                    result = executeStopProcessingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest request) {

        return stopTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(final StopTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTrainingJobRequest, StopTrainingJobResult> asyncHandler) {
        final StopTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTrainingJobResult>() {
            @Override
            public StopTrainingJobResult call() throws Exception {
                StopTrainingJobResult result = null;

                try {
                    result = executeStopTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopTransformJobResult> stopTransformJobAsync(StopTransformJobRequest request) {

        return stopTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTransformJobResult> stopTransformJobAsync(final StopTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTransformJobRequest, StopTransformJobResult> asyncHandler) {
        final StopTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTransformJobResult>() {
            @Override
            public StopTransformJobResult call() throws Exception {
                StopTransformJobResult result = null;

                try {
                    result = executeStopTransformJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateActionResult> updateActionAsync(UpdateActionRequest request) {

        return updateActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateActionResult> updateActionAsync(final UpdateActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateActionRequest, UpdateActionResult> asyncHandler) {
        final UpdateActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateActionResult>() {
            @Override
            public UpdateActionResult call() throws Exception {
                UpdateActionResult result = null;

                try {
                    result = executeUpdateAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAppImageConfigResult> updateAppImageConfigAsync(UpdateAppImageConfigRequest request) {

        return updateAppImageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppImageConfigResult> updateAppImageConfigAsync(final UpdateAppImageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppImageConfigRequest, UpdateAppImageConfigResult> asyncHandler) {
        final UpdateAppImageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppImageConfigResult>() {
            @Override
            public UpdateAppImageConfigResult call() throws Exception {
                UpdateAppImageConfigResult result = null;

                try {
                    result = executeUpdateAppImageConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateArtifactResult> updateArtifactAsync(UpdateArtifactRequest request) {

        return updateArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateArtifactResult> updateArtifactAsync(final UpdateArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateArtifactRequest, UpdateArtifactResult> asyncHandler) {
        final UpdateArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateArtifactResult>() {
            @Override
            public UpdateArtifactResult call() throws Exception {
                UpdateArtifactResult result = null;

                try {
                    result = executeUpdateArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateCodeRepositoryResult> updateCodeRepositoryAsync(UpdateCodeRepositoryRequest request) {

        return updateCodeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCodeRepositoryResult> updateCodeRepositoryAsync(final UpdateCodeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCodeRepositoryRequest, UpdateCodeRepositoryResult> asyncHandler) {
        final UpdateCodeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCodeRepositoryResult>() {
            @Override
            public UpdateCodeRepositoryResult call() throws Exception {
                UpdateCodeRepositoryResult result = null;

                try {
                    result = executeUpdateCodeRepository(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateContextResult> updateContextAsync(UpdateContextRequest request) {

        return updateContextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContextResult> updateContextAsync(final UpdateContextRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContextRequest, UpdateContextResult> asyncHandler) {
        final UpdateContextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContextResult>() {
            @Override
            public UpdateContextResult call() throws Exception {
                UpdateContextResult result = null;

                try {
                    result = executeUpdateContext(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceFleetResult> updateDeviceFleetAsync(UpdateDeviceFleetRequest request) {

        return updateDeviceFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceFleetResult> updateDeviceFleetAsync(final UpdateDeviceFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceFleetRequest, UpdateDeviceFleetResult> asyncHandler) {
        final UpdateDeviceFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceFleetResult>() {
            @Override
            public UpdateDeviceFleetResult call() throws Exception {
                UpdateDeviceFleetResult result = null;

                try {
                    result = executeUpdateDeviceFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDevicesResult> updateDevicesAsync(UpdateDevicesRequest request) {

        return updateDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDevicesResult> updateDevicesAsync(final UpdateDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDevicesRequest, UpdateDevicesResult> asyncHandler) {
        final UpdateDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDevicesResult>() {
            @Override
            public UpdateDevicesResult call() throws Exception {
                UpdateDevicesResult result = null;

                try {
                    result = executeUpdateDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest request) {

        return updateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(final UpdateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler) {
        final UpdateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainResult>() {
            @Override
            public UpdateDomainResult call() throws Exception {
                UpdateDomainResult result = null;

                try {
                    result = executeUpdateDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest request) {

        return updateEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(final UpdateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler) {
        final UpdateEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointResult>() {
            @Override
            public UpdateEndpointResult call() throws Exception {
                UpdateEndpointResult result = null;

                try {
                    result = executeUpdateEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest request) {

        return updateEndpointWeightsAndCapacitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            final UpdateEndpointWeightsAndCapacitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointWeightsAndCapacitiesRequest, UpdateEndpointWeightsAndCapacitiesResult> asyncHandler) {
        final UpdateEndpointWeightsAndCapacitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointWeightsAndCapacitiesResult>() {
            @Override
            public UpdateEndpointWeightsAndCapacitiesResult call() throws Exception {
                UpdateEndpointWeightsAndCapacitiesResult result = null;

                try {
                    result = executeUpdateEndpointWeightsAndCapacities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateExperimentResult> updateExperimentAsync(UpdateExperimentRequest request) {

        return updateExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExperimentResult> updateExperimentAsync(final UpdateExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExperimentRequest, UpdateExperimentResult> asyncHandler) {
        final UpdateExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateExperimentResult>() {
            @Override
            public UpdateExperimentResult call() throws Exception {
                UpdateExperimentResult result = null;

                try {
                    result = executeUpdateExperiment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateImageResult> updateImageAsync(UpdateImageRequest request) {

        return updateImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateImageResult> updateImageAsync(final UpdateImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateImageRequest, UpdateImageResult> asyncHandler) {
        final UpdateImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateImageResult>() {
            @Override
            public UpdateImageResult call() throws Exception {
                UpdateImageResult result = null;

                try {
                    result = executeUpdateImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateModelPackageResult> updateModelPackageAsync(UpdateModelPackageRequest request) {

        return updateModelPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelPackageResult> updateModelPackageAsync(final UpdateModelPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateModelPackageRequest, UpdateModelPackageResult> asyncHandler) {
        final UpdateModelPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateModelPackageResult>() {
            @Override
            public UpdateModelPackageResult call() throws Exception {
                UpdateModelPackageResult result = null;

                try {
                    result = executeUpdateModelPackage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoringScheduleResult> updateMonitoringScheduleAsync(UpdateMonitoringScheduleRequest request) {

        return updateMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoringScheduleResult> updateMonitoringScheduleAsync(final UpdateMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMonitoringScheduleRequest, UpdateMonitoringScheduleResult> asyncHandler) {
        final UpdateMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMonitoringScheduleResult>() {
            @Override
            public UpdateMonitoringScheduleResult call() throws Exception {
                UpdateMonitoringScheduleResult result = null;

                try {
                    result = executeUpdateMonitoringSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest request) {

        return updateNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(final UpdateNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceRequest, UpdateNotebookInstanceResult> asyncHandler) {
        final UpdateNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotebookInstanceResult>() {
            @Override
            public UpdateNotebookInstanceResult call() throws Exception {
                UpdateNotebookInstanceResult result = null;

                try {
                    result = executeUpdateNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceLifecycleConfigResult> updateNotebookInstanceLifecycleConfigAsync(
            UpdateNotebookInstanceLifecycleConfigRequest request) {

        return updateNotebookInstanceLifecycleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceLifecycleConfigResult> updateNotebookInstanceLifecycleConfigAsync(
            final UpdateNotebookInstanceLifecycleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceLifecycleConfigRequest, UpdateNotebookInstanceLifecycleConfigResult> asyncHandler) {
        final UpdateNotebookInstanceLifecycleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotebookInstanceLifecycleConfigResult>() {
            @Override
            public UpdateNotebookInstanceLifecycleConfigResult call() throws Exception {
                UpdateNotebookInstanceLifecycleConfigResult result = null;

                try {
                    result = executeUpdateNotebookInstanceLifecycleConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request) {

        return updatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(final UpdatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler) {
        final UpdatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipelineResult>() {
            @Override
            public UpdatePipelineResult call() throws Exception {
                UpdatePipelineResult result = null;

                try {
                    result = executeUpdatePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineExecutionResult> updatePipelineExecutionAsync(UpdatePipelineExecutionRequest request) {

        return updatePipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineExecutionResult> updatePipelineExecutionAsync(final UpdatePipelineExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipelineExecutionRequest, UpdatePipelineExecutionResult> asyncHandler) {
        final UpdatePipelineExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipelineExecutionResult>() {
            @Override
            public UpdatePipelineExecutionResult call() throws Exception {
                UpdatePipelineExecutionResult result = null;

                try {
                    result = executeUpdatePipelineExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTrainingJobResult> updateTrainingJobAsync(UpdateTrainingJobRequest request) {

        return updateTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrainingJobResult> updateTrainingJobAsync(final UpdateTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrainingJobRequest, UpdateTrainingJobResult> asyncHandler) {
        final UpdateTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrainingJobResult>() {
            @Override
            public UpdateTrainingJobResult call() throws Exception {
                UpdateTrainingJobResult result = null;

                try {
                    result = executeUpdateTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTrialResult> updateTrialAsync(UpdateTrialRequest request) {

        return updateTrialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrialResult> updateTrialAsync(final UpdateTrialRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrialRequest, UpdateTrialResult> asyncHandler) {
        final UpdateTrialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrialResult>() {
            @Override
            public UpdateTrialResult call() throws Exception {
                UpdateTrialResult result = null;

                try {
                    result = executeUpdateTrial(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTrialComponentResult> updateTrialComponentAsync(UpdateTrialComponentRequest request) {

        return updateTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrialComponentResult> updateTrialComponentAsync(final UpdateTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrialComponentRequest, UpdateTrialComponentResult> asyncHandler) {
        final UpdateTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrialComponentResult>() {
            @Override
            public UpdateTrialComponentResult call() throws Exception {
                UpdateTrialComponentResult result = null;

                try {
                    result = executeUpdateTrialComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest request) {

        return updateUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(final UpdateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler) {
        final UpdateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserProfileResult>() {
            @Override
            public UpdateUserProfileResult call() throws Exception {
                UpdateUserProfileResult result = null;

                try {
                    result = executeUpdateUserProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkforceResult> updateWorkforceAsync(UpdateWorkforceRequest request) {

        return updateWorkforceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkforceResult> updateWorkforceAsync(final UpdateWorkforceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkforceRequest, UpdateWorkforceResult> asyncHandler) {
        final UpdateWorkforceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkforceResult>() {
            @Override
            public UpdateWorkforceResult call() throws Exception {
                UpdateWorkforceResult result = null;

                try {
                    result = executeUpdateWorkforce(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkteamResult> updateWorkteamAsync(UpdateWorkteamRequest request) {

        return updateWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkteamResult> updateWorkteamAsync(final UpdateWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkteamRequest, UpdateWorkteamResult> asyncHandler) {
        final UpdateWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkteamResult>() {
            @Override
            public UpdateWorkteamResult call() throws Exception {
                UpdateWorkteamResult result = null;

                try {
                    result = executeUpdateWorkteam(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
