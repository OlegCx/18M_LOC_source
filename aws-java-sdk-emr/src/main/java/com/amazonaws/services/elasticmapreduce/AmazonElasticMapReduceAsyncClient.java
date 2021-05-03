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
package com.amazonaws.services.elasticmapreduce;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon EMR asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EMR is a web service that makes it easier to process large amounts of data efficiently. Amazon EMR uses Hadoop
 * processing combined with several AWS services to do tasks such as web indexing, data mining, log file analysis,
 * machine learning, scientific simulation, and data warehouse management.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticMapReduceAsyncClient extends AmazonElasticMapReduceClient implements AmazonElasticMapReduceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon EMR (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticMapReduceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticMapReduceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticMapReduceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticMapReduceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticMapReduceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticMapReduceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticMapReduceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticMapReduceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticMapReduceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonElasticMapReduceAsyncClientBuilder asyncBuilder() {
        return AmazonElasticMapReduceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonElasticMapReduceAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonElasticMapReduceAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AddInstanceFleetResult> addInstanceFleetAsync(AddInstanceFleetRequest request) {

        return addInstanceFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddInstanceFleetResult> addInstanceFleetAsync(final AddInstanceFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddInstanceFleetRequest, AddInstanceFleetResult> asyncHandler) {
        final AddInstanceFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddInstanceFleetResult>() {
            @Override
            public AddInstanceFleetResult call() throws Exception {
                AddInstanceFleetResult result = null;

                try {
                    result = executeAddInstanceFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(AddInstanceGroupsRequest request) {

        return addInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(final AddInstanceGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddInstanceGroupsRequest, AddInstanceGroupsResult> asyncHandler) {
        final AddInstanceGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddInstanceGroupsResult>() {
            @Override
            public AddInstanceGroupsResult call() throws Exception {
                AddInstanceGroupsResult result = null;

                try {
                    result = executeAddInstanceGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest request) {

        return addJobFlowStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(final AddJobFlowStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddJobFlowStepsRequest, AddJobFlowStepsResult> asyncHandler) {
        final AddJobFlowStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddJobFlowStepsResult>() {
            @Override
            public AddJobFlowStepsResult call() throws Exception {
                AddJobFlowStepsResult result = null;

                try {
                    result = executeAddJobFlowSteps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CancelStepsResult> cancelStepsAsync(CancelStepsRequest request) {

        return cancelStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelStepsResult> cancelStepsAsync(final CancelStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelStepsRequest, CancelStepsResult> asyncHandler) {
        final CancelStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelStepsResult>() {
            @Override
            public CancelStepsResult call() throws Exception {
                CancelStepsResult result = null;

                try {
                    result = executeCancelSteps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateStudioResult> createStudioAsync(CreateStudioRequest request) {

        return createStudioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStudioResult> createStudioAsync(final CreateStudioRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStudioRequest, CreateStudioResult> asyncHandler) {
        final CreateStudioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStudioResult>() {
            @Override
            public CreateStudioResult call() throws Exception {
                CreateStudioResult result = null;

                try {
                    result = executeCreateStudio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStudioSessionMappingResult> createStudioSessionMappingAsync(CreateStudioSessionMappingRequest request) {

        return createStudioSessionMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStudioSessionMappingResult> createStudioSessionMappingAsync(final CreateStudioSessionMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStudioSessionMappingRequest, CreateStudioSessionMappingResult> asyncHandler) {
        final CreateStudioSessionMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStudioSessionMappingResult>() {
            @Override
            public CreateStudioSessionMappingResult call() throws Exception {
                CreateStudioSessionMappingResult result = null;

                try {
                    result = executeCreateStudioSessionMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteStudioResult> deleteStudioAsync(DeleteStudioRequest request) {

        return deleteStudioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStudioResult> deleteStudioAsync(final DeleteStudioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStudioRequest, DeleteStudioResult> asyncHandler) {
        final DeleteStudioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStudioResult>() {
            @Override
            public DeleteStudioResult call() throws Exception {
                DeleteStudioResult result = null;

                try {
                    result = executeDeleteStudio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStudioSessionMappingResult> deleteStudioSessionMappingAsync(DeleteStudioSessionMappingRequest request) {

        return deleteStudioSessionMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStudioSessionMappingResult> deleteStudioSessionMappingAsync(final DeleteStudioSessionMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStudioSessionMappingRequest, DeleteStudioSessionMappingResult> asyncHandler) {
        final DeleteStudioSessionMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStudioSessionMappingResult>() {
            @Override
            public DeleteStudioSessionMappingResult call() throws Exception {
                DeleteStudioSessionMappingResult result = null;

                try {
                    result = executeDeleteStudioSessionMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(DescribeJobFlowsRequest request) {

        return describeJobFlowsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(final DescribeJobFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler) {
        final DescribeJobFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobFlowsResult>() {
            @Override
            public DescribeJobFlowsResult call() throws Exception {
                DescribeJobFlowsResult result = null;

                try {
                    result = executeDescribeJobFlows(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeJobFlows operation.
     *
     * @see #describeJobFlowsAsync(DescribeJobFlowsRequest)
     */
    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync() {

        return describeJobFlowsAsync(new DescribeJobFlowsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeJobFlows operation with an AsyncHandler.
     *
     * @see #describeJobFlowsAsync(DescribeJobFlowsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler) {

        return describeJobFlowsAsync(new DescribeJobFlowsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookExecutionResult> describeNotebookExecutionAsync(DescribeNotebookExecutionRequest request) {

        return describeNotebookExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookExecutionResult> describeNotebookExecutionAsync(final DescribeNotebookExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotebookExecutionRequest, DescribeNotebookExecutionResult> asyncHandler) {
        final DescribeNotebookExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotebookExecutionResult>() {
            @Override
            public DescribeNotebookExecutionResult call() throws Exception {
                DescribeNotebookExecutionResult result = null;

                try {
                    result = executeDescribeNotebookExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityConfigurationResult> describeSecurityConfigurationAsync(DescribeSecurityConfigurationRequest request) {

        return describeSecurityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityConfigurationResult> describeSecurityConfigurationAsync(
            final DescribeSecurityConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSecurityConfigurationRequest, DescribeSecurityConfigurationResult> asyncHandler) {
        final DescribeSecurityConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSecurityConfigurationResult>() {
            @Override
            public DescribeSecurityConfigurationResult call() throws Exception {
                DescribeSecurityConfigurationResult result = null;

                try {
                    result = executeDescribeSecurityConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeStepResult> describeStepAsync(DescribeStepRequest request) {

        return describeStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStepResult> describeStepAsync(final DescribeStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStepRequest, DescribeStepResult> asyncHandler) {
        final DescribeStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStepResult>() {
            @Override
            public DescribeStepResult call() throws Exception {
                DescribeStepResult result = null;

                try {
                    result = executeDescribeStep(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeStudioResult> describeStudioAsync(DescribeStudioRequest request) {

        return describeStudioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStudioResult> describeStudioAsync(final DescribeStudioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStudioRequest, DescribeStudioResult> asyncHandler) {
        final DescribeStudioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStudioResult>() {
            @Override
            public DescribeStudioResult call() throws Exception {
                DescribeStudioResult result = null;

                try {
                    result = executeDescribeStudio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBlockPublicAccessConfigurationResult> getBlockPublicAccessConfigurationAsync(
            GetBlockPublicAccessConfigurationRequest request) {

        return getBlockPublicAccessConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlockPublicAccessConfigurationResult> getBlockPublicAccessConfigurationAsync(
            final GetBlockPublicAccessConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBlockPublicAccessConfigurationRequest, GetBlockPublicAccessConfigurationResult> asyncHandler) {
        final GetBlockPublicAccessConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBlockPublicAccessConfigurationResult>() {
            @Override
            public GetBlockPublicAccessConfigurationResult call() throws Exception {
                GetBlockPublicAccessConfigurationResult result = null;

                try {
                    result = executeGetBlockPublicAccessConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetManagedScalingPolicyResult> getManagedScalingPolicyAsync(GetManagedScalingPolicyRequest request) {

        return getManagedScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetManagedScalingPolicyResult> getManagedScalingPolicyAsync(final GetManagedScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetManagedScalingPolicyRequest, GetManagedScalingPolicyResult> asyncHandler) {
        final GetManagedScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetManagedScalingPolicyResult>() {
            @Override
            public GetManagedScalingPolicyResult call() throws Exception {
                GetManagedScalingPolicyResult result = null;

                try {
                    result = executeGetManagedScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStudioSessionMappingResult> getStudioSessionMappingAsync(GetStudioSessionMappingRequest request) {

        return getStudioSessionMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStudioSessionMappingResult> getStudioSessionMappingAsync(final GetStudioSessionMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStudioSessionMappingRequest, GetStudioSessionMappingResult> asyncHandler) {
        final GetStudioSessionMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStudioSessionMappingResult>() {
            @Override
            public GetStudioSessionMappingResult call() throws Exception {
                GetStudioSessionMappingResult result = null;

                try {
                    result = executeGetStudioSessionMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBootstrapActionsResult> listBootstrapActionsAsync(ListBootstrapActionsRequest request) {

        return listBootstrapActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBootstrapActionsResult> listBootstrapActionsAsync(final ListBootstrapActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBootstrapActionsRequest, ListBootstrapActionsResult> asyncHandler) {
        final ListBootstrapActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBootstrapActionsResult>() {
            @Override
            public ListBootstrapActionsResult call() throws Exception {
                ListBootstrapActionsResult result = null;

                try {
                    result = executeListBootstrapActions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClustersAsync(ListClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync() {

        return listClustersAsync(new ListClustersRequest());
    }

    /**
     * Simplified method form for invoking the ListClusters operation with an AsyncHandler.
     *
     * @see #listClustersAsync(ListClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        return listClustersAsync(new ListClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceFleetsResult> listInstanceFleetsAsync(ListInstanceFleetsRequest request) {

        return listInstanceFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceFleetsResult> listInstanceFleetsAsync(final ListInstanceFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceFleetsRequest, ListInstanceFleetsResult> asyncHandler) {
        final ListInstanceFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceFleetsResult>() {
            @Override
            public ListInstanceFleetsResult call() throws Exception {
                ListInstanceFleetsResult result = null;

                try {
                    result = executeListInstanceFleets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(ListInstanceGroupsRequest request) {

        return listInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(final ListInstanceGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceGroupsRequest, ListInstanceGroupsResult> asyncHandler) {
        final ListInstanceGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceGroupsResult>() {
            @Override
            public ListInstanceGroupsResult call() throws Exception {
                ListInstanceGroupsResult result = null;

                try {
                    result = executeListInstanceGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(final ListInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {
        final ListInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstancesResult>() {
            @Override
            public ListInstancesResult call() throws Exception {
                ListInstancesResult result = null;

                try {
                    result = executeListInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNotebookExecutionsResult> listNotebookExecutionsAsync(ListNotebookExecutionsRequest request) {

        return listNotebookExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookExecutionsResult> listNotebookExecutionsAsync(final ListNotebookExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotebookExecutionsRequest, ListNotebookExecutionsResult> asyncHandler) {
        final ListNotebookExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotebookExecutionsResult>() {
            @Override
            public ListNotebookExecutionsResult call() throws Exception {
                ListNotebookExecutionsResult result = null;

                try {
                    result = executeListNotebookExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSecurityConfigurationsResult> listSecurityConfigurationsAsync(ListSecurityConfigurationsRequest request) {

        return listSecurityConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityConfigurationsResult> listSecurityConfigurationsAsync(final ListSecurityConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityConfigurationsRequest, ListSecurityConfigurationsResult> asyncHandler) {
        final ListSecurityConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityConfigurationsResult>() {
            @Override
            public ListSecurityConfigurationsResult call() throws Exception {
                ListSecurityConfigurationsResult result = null;

                try {
                    result = executeListSecurityConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest request) {

        return listStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStepsResult> listStepsAsync(final ListStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler) {
        final ListStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStepsResult>() {
            @Override
            public ListStepsResult call() throws Exception {
                ListStepsResult result = null;

                try {
                    result = executeListSteps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStudioSessionMappingsResult> listStudioSessionMappingsAsync(ListStudioSessionMappingsRequest request) {

        return listStudioSessionMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStudioSessionMappingsResult> listStudioSessionMappingsAsync(final ListStudioSessionMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStudioSessionMappingsRequest, ListStudioSessionMappingsResult> asyncHandler) {
        final ListStudioSessionMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStudioSessionMappingsResult>() {
            @Override
            public ListStudioSessionMappingsResult call() throws Exception {
                ListStudioSessionMappingsResult result = null;

                try {
                    result = executeListStudioSessionMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStudiosResult> listStudiosAsync(ListStudiosRequest request) {

        return listStudiosAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStudiosResult> listStudiosAsync(final ListStudiosRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStudiosRequest, ListStudiosResult> asyncHandler) {
        final ListStudiosRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStudiosResult>() {
            @Override
            public ListStudiosResult call() throws Exception {
                ListStudiosResult result = null;

                try {
                    result = executeListStudios(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterResult> modifyClusterAsync(ModifyClusterRequest request) {

        return modifyClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterResult> modifyClusterAsync(final ModifyClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterRequest, ModifyClusterResult> asyncHandler) {
        final ModifyClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyClusterResult>() {
            @Override
            public ModifyClusterResult call() throws Exception {
                ModifyClusterResult result = null;

                try {
                    result = executeModifyCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceFleetResult> modifyInstanceFleetAsync(ModifyInstanceFleetRequest request) {

        return modifyInstanceFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceFleetResult> modifyInstanceFleetAsync(final ModifyInstanceFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstanceFleetRequest, ModifyInstanceFleetResult> asyncHandler) {
        final ModifyInstanceFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstanceFleetResult>() {
            @Override
            public ModifyInstanceFleetResult call() throws Exception {
                ModifyInstanceFleetResult result = null;

                try {
                    result = executeModifyInstanceFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest request) {

        return modifyInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(final ModifyInstanceGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstanceGroupsRequest, ModifyInstanceGroupsResult> asyncHandler) {
        final ModifyInstanceGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstanceGroupsResult>() {
            @Override
            public ModifyInstanceGroupsResult call() throws Exception {
                ModifyInstanceGroupsResult result = null;

                try {
                    result = executeModifyInstanceGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the ModifyInstanceGroups operation.
     *
     * @see #modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync() {

        return modifyInstanceGroupsAsync(new ModifyInstanceGroupsRequest());
    }

    /**
     * Simplified method form for invoking the ModifyInstanceGroups operation with an AsyncHandler.
     *
     * @see #modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceGroupsRequest, ModifyInstanceGroupsResult> asyncHandler) {

        return modifyInstanceGroupsAsync(new ModifyInstanceGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutAutoScalingPolicyResult> putAutoScalingPolicyAsync(PutAutoScalingPolicyRequest request) {

        return putAutoScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAutoScalingPolicyResult> putAutoScalingPolicyAsync(final PutAutoScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAutoScalingPolicyRequest, PutAutoScalingPolicyResult> asyncHandler) {
        final PutAutoScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAutoScalingPolicyResult>() {
            @Override
            public PutAutoScalingPolicyResult call() throws Exception {
                PutAutoScalingPolicyResult result = null;

                try {
                    result = executePutAutoScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutBlockPublicAccessConfigurationResult> putBlockPublicAccessConfigurationAsync(
            PutBlockPublicAccessConfigurationRequest request) {

        return putBlockPublicAccessConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBlockPublicAccessConfigurationResult> putBlockPublicAccessConfigurationAsync(
            final PutBlockPublicAccessConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBlockPublicAccessConfigurationRequest, PutBlockPublicAccessConfigurationResult> asyncHandler) {
        final PutBlockPublicAccessConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBlockPublicAccessConfigurationResult>() {
            @Override
            public PutBlockPublicAccessConfigurationResult call() throws Exception {
                PutBlockPublicAccessConfigurationResult result = null;

                try {
                    result = executePutBlockPublicAccessConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutManagedScalingPolicyResult> putManagedScalingPolicyAsync(PutManagedScalingPolicyRequest request) {

        return putManagedScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutManagedScalingPolicyResult> putManagedScalingPolicyAsync(final PutManagedScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutManagedScalingPolicyRequest, PutManagedScalingPolicyResult> asyncHandler) {
        final PutManagedScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutManagedScalingPolicyResult>() {
            @Override
            public PutManagedScalingPolicyResult call() throws Exception {
                PutManagedScalingPolicyResult result = null;

                try {
                    result = executePutManagedScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveAutoScalingPolicyResult> removeAutoScalingPolicyAsync(RemoveAutoScalingPolicyRequest request) {

        return removeAutoScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAutoScalingPolicyResult> removeAutoScalingPolicyAsync(final RemoveAutoScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveAutoScalingPolicyRequest, RemoveAutoScalingPolicyResult> asyncHandler) {
        final RemoveAutoScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveAutoScalingPolicyResult>() {
            @Override
            public RemoveAutoScalingPolicyResult call() throws Exception {
                RemoveAutoScalingPolicyResult result = null;

                try {
                    result = executeRemoveAutoScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveManagedScalingPolicyResult> removeManagedScalingPolicyAsync(RemoveManagedScalingPolicyRequest request) {

        return removeManagedScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveManagedScalingPolicyResult> removeManagedScalingPolicyAsync(final RemoveManagedScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveManagedScalingPolicyRequest, RemoveManagedScalingPolicyResult> asyncHandler) {
        final RemoveManagedScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveManagedScalingPolicyResult>() {
            @Override
            public RemoveManagedScalingPolicyResult call() throws Exception {
                RemoveManagedScalingPolicyResult result = null;

                try {
                    result = executeRemoveManagedScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {
        final RemoveTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsResult>() {
            @Override
            public RemoveTagsResult call() throws Exception {
                RemoveTagsResult result = null;

                try {
                    result = executeRemoveTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest request) {

        return runJobFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(final RunJobFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<RunJobFlowRequest, RunJobFlowResult> asyncHandler) {
        final RunJobFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RunJobFlowResult>() {
            @Override
            public RunJobFlowResult call() throws Exception {
                RunJobFlowResult result = null;

                try {
                    result = executeRunJobFlow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetTerminationProtectionResult> setTerminationProtectionAsync(SetTerminationProtectionRequest request) {

        return setTerminationProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTerminationProtectionResult> setTerminationProtectionAsync(final SetTerminationProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTerminationProtectionRequest, SetTerminationProtectionResult> asyncHandler) {
        final SetTerminationProtectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetTerminationProtectionResult>() {
            @Override
            public SetTerminationProtectionResult call() throws Exception {
                SetTerminationProtectionResult result = null;

                try {
                    result = executeSetTerminationProtection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetVisibleToAllUsersResult> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest request) {

        return setVisibleToAllUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetVisibleToAllUsersResult> setVisibleToAllUsersAsync(final SetVisibleToAllUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetVisibleToAllUsersRequest, SetVisibleToAllUsersResult> asyncHandler) {
        final SetVisibleToAllUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetVisibleToAllUsersResult>() {
            @Override
            public SetVisibleToAllUsersResult call() throws Exception {
                SetVisibleToAllUsersResult result = null;

                try {
                    result = executeSetVisibleToAllUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartNotebookExecutionResult> startNotebookExecutionAsync(StartNotebookExecutionRequest request) {

        return startNotebookExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartNotebookExecutionResult> startNotebookExecutionAsync(final StartNotebookExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartNotebookExecutionRequest, StartNotebookExecutionResult> asyncHandler) {
        final StartNotebookExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartNotebookExecutionResult>() {
            @Override
            public StartNotebookExecutionResult call() throws Exception {
                StartNotebookExecutionResult result = null;

                try {
                    result = executeStartNotebookExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopNotebookExecutionResult> stopNotebookExecutionAsync(StopNotebookExecutionRequest request) {

        return stopNotebookExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopNotebookExecutionResult> stopNotebookExecutionAsync(final StopNotebookExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopNotebookExecutionRequest, StopNotebookExecutionResult> asyncHandler) {
        final StopNotebookExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopNotebookExecutionResult>() {
            @Override
            public StopNotebookExecutionResult call() throws Exception {
                StopNotebookExecutionResult result = null;

                try {
                    result = executeStopNotebookExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TerminateJobFlowsResult> terminateJobFlowsAsync(TerminateJobFlowsRequest request) {

        return terminateJobFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateJobFlowsResult> terminateJobFlowsAsync(final TerminateJobFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateJobFlowsRequest, TerminateJobFlowsResult> asyncHandler) {
        final TerminateJobFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateJobFlowsResult>() {
            @Override
            public TerminateJobFlowsResult call() throws Exception {
                TerminateJobFlowsResult result = null;

                try {
                    result = executeTerminateJobFlows(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStudioResult> updateStudioAsync(UpdateStudioRequest request) {

        return updateStudioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStudioResult> updateStudioAsync(final UpdateStudioRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStudioRequest, UpdateStudioResult> asyncHandler) {
        final UpdateStudioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStudioResult>() {
            @Override
            public UpdateStudioResult call() throws Exception {
                UpdateStudioResult result = null;

                try {
                    result = executeUpdateStudio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStudioSessionMappingResult> updateStudioSessionMappingAsync(UpdateStudioSessionMappingRequest request) {

        return updateStudioSessionMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStudioSessionMappingResult> updateStudioSessionMappingAsync(final UpdateStudioSessionMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStudioSessionMappingRequest, UpdateStudioSessionMappingResult> asyncHandler) {
        final UpdateStudioSessionMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStudioSessionMappingResult>() {
            @Override
            public UpdateStudioSessionMappingResult call() throws Exception {
                UpdateStudioSessionMappingResult result = null;

                try {
                    result = executeUpdateStudioSessionMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
