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
package com.amazonaws.services.lambda;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Lambda asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide provides additional information. For the
 * service overview, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS Lambda</a>, and
 * for information about how the service works, see <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a> in the
 * <b>AWS Lambda Developer Guide</b>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLambdaAsyncClient extends AWSLambdaClient implements AWSLambdaAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda. A credentials provider chain will
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
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSLambdaAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLambdaAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSLambdaAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSLambdaAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSLambdaAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSLambdaAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSLambdaAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the provided AWS account
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
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLambdaAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSLambdaAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSLambdaAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSLambdaAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSLambdaAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSLambdaAsyncClientBuilder asyncBuilder() {
        return AWSLambdaAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLambdaAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSLambdaAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AddLayerVersionPermissionResult> addLayerVersionPermissionAsync(AddLayerVersionPermissionRequest request) {

        return addLayerVersionPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddLayerVersionPermissionResult> addLayerVersionPermissionAsync(final AddLayerVersionPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddLayerVersionPermissionRequest, AddLayerVersionPermissionResult> asyncHandler) {
        final AddLayerVersionPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddLayerVersionPermissionResult>() {
            @Override
            public AddLayerVersionPermissionResult call() throws Exception {
                AddLayerVersionPermissionResult result = null;

                try {
                    result = executeAddLayerVersionPermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request) {

        return addPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(final AddPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {
        final AddPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddPermissionResult>() {
            @Override
            public AddPermissionResult call() throws Exception {
                AddPermissionResult result = null;

                try {
                    result = executeAddPermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {
        final CreateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAliasResult>() {
            @Override
            public CreateAliasResult call() throws Exception {
                CreateAliasResult result = null;

                try {
                    result = executeCreateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCodeSigningConfigResult> createCodeSigningConfigAsync(CreateCodeSigningConfigRequest request) {

        return createCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCodeSigningConfigResult> createCodeSigningConfigAsync(final CreateCodeSigningConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCodeSigningConfigRequest, CreateCodeSigningConfigResult> asyncHandler) {
        final CreateCodeSigningConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCodeSigningConfigResult>() {
            @Override
            public CreateCodeSigningConfigResult call() throws Exception {
                CreateCodeSigningConfigResult result = null;

                try {
                    result = executeCreateCodeSigningConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest request) {

        return createEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(final CreateEventSourceMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventSourceMappingRequest, CreateEventSourceMappingResult> asyncHandler) {
        final CreateEventSourceMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventSourceMappingResult>() {
            @Override
            public CreateEventSourceMappingResult call() throws Exception {
                CreateEventSourceMappingResult result = null;

                try {
                    result = executeCreateEventSourceMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest request) {

        return createFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(final CreateFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler) {
        final CreateFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFunctionResult>() {
            @Override
            public CreateFunctionResult call() throws Exception {
                CreateFunctionResult result = null;

                try {
                    result = executeCreateFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(final DeleteAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {
        final DeleteAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAliasResult>() {
            @Override
            public DeleteAliasResult call() throws Exception {
                DeleteAliasResult result = null;

                try {
                    result = executeDeleteAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCodeSigningConfigResult> deleteCodeSigningConfigAsync(DeleteCodeSigningConfigRequest request) {

        return deleteCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCodeSigningConfigResult> deleteCodeSigningConfigAsync(final DeleteCodeSigningConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCodeSigningConfigRequest, DeleteCodeSigningConfigResult> asyncHandler) {
        final DeleteCodeSigningConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCodeSigningConfigResult>() {
            @Override
            public DeleteCodeSigningConfigResult call() throws Exception {
                DeleteCodeSigningConfigResult result = null;

                try {
                    result = executeDeleteCodeSigningConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest request) {

        return deleteEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(final DeleteEventSourceMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventSourceMappingRequest, DeleteEventSourceMappingResult> asyncHandler) {
        final DeleteEventSourceMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventSourceMappingResult>() {
            @Override
            public DeleteEventSourceMappingResult call() throws Exception {
                DeleteEventSourceMappingResult result = null;

                try {
                    result = executeDeleteEventSourceMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest request) {

        return deleteFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(final DeleteFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler) {
        final DeleteFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFunctionResult>() {
            @Override
            public DeleteFunctionResult call() throws Exception {
                DeleteFunctionResult result = null;

                try {
                    result = executeDeleteFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionCodeSigningConfigResult> deleteFunctionCodeSigningConfigAsync(
            DeleteFunctionCodeSigningConfigRequest request) {

        return deleteFunctionCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionCodeSigningConfigResult> deleteFunctionCodeSigningConfigAsync(
            final DeleteFunctionCodeSigningConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFunctionCodeSigningConfigRequest, DeleteFunctionCodeSigningConfigResult> asyncHandler) {
        final DeleteFunctionCodeSigningConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFunctionCodeSigningConfigResult>() {
            @Override
            public DeleteFunctionCodeSigningConfigResult call() throws Exception {
                DeleteFunctionCodeSigningConfigResult result = null;

                try {
                    result = executeDeleteFunctionCodeSigningConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionConcurrencyResult> deleteFunctionConcurrencyAsync(DeleteFunctionConcurrencyRequest request) {

        return deleteFunctionConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionConcurrencyResult> deleteFunctionConcurrencyAsync(final DeleteFunctionConcurrencyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFunctionConcurrencyRequest, DeleteFunctionConcurrencyResult> asyncHandler) {
        final DeleteFunctionConcurrencyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFunctionConcurrencyResult>() {
            @Override
            public DeleteFunctionConcurrencyResult call() throws Exception {
                DeleteFunctionConcurrencyResult result = null;

                try {
                    result = executeDeleteFunctionConcurrency(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionEventInvokeConfigResult> deleteFunctionEventInvokeConfigAsync(
            DeleteFunctionEventInvokeConfigRequest request) {

        return deleteFunctionEventInvokeConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionEventInvokeConfigResult> deleteFunctionEventInvokeConfigAsync(
            final DeleteFunctionEventInvokeConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFunctionEventInvokeConfigRequest, DeleteFunctionEventInvokeConfigResult> asyncHandler) {
        final DeleteFunctionEventInvokeConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFunctionEventInvokeConfigResult>() {
            @Override
            public DeleteFunctionEventInvokeConfigResult call() throws Exception {
                DeleteFunctionEventInvokeConfigResult result = null;

                try {
                    result = executeDeleteFunctionEventInvokeConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLayerVersionResult> deleteLayerVersionAsync(DeleteLayerVersionRequest request) {

        return deleteLayerVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLayerVersionResult> deleteLayerVersionAsync(final DeleteLayerVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLayerVersionRequest, DeleteLayerVersionResult> asyncHandler) {
        final DeleteLayerVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLayerVersionResult>() {
            @Override
            public DeleteLayerVersionResult call() throws Exception {
                DeleteLayerVersionResult result = null;

                try {
                    result = executeDeleteLayerVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedConcurrencyConfigResult> deleteProvisionedConcurrencyConfigAsync(
            DeleteProvisionedConcurrencyConfigRequest request) {

        return deleteProvisionedConcurrencyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedConcurrencyConfigResult> deleteProvisionedConcurrencyConfigAsync(
            final DeleteProvisionedConcurrencyConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProvisionedConcurrencyConfigRequest, DeleteProvisionedConcurrencyConfigResult> asyncHandler) {
        final DeleteProvisionedConcurrencyConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProvisionedConcurrencyConfigResult>() {
            @Override
            public DeleteProvisionedConcurrencyConfigResult call() throws Exception {
                DeleteProvisionedConcurrencyConfigResult result = null;

                try {
                    result = executeDeleteProvisionedConcurrencyConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(final GetAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {
        final GetAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSettingsResult>() {
            @Override
            public GetAccountSettingsResult call() throws Exception {
                GetAccountSettingsResult result = null;

                try {
                    result = executeGetAccountSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest request) {

        return getAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(final GetAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler) {
        final GetAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAliasResult>() {
            @Override
            public GetAliasResult call() throws Exception {
                GetAliasResult result = null;

                try {
                    result = executeGetAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCodeSigningConfigResult> getCodeSigningConfigAsync(GetCodeSigningConfigRequest request) {

        return getCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCodeSigningConfigResult> getCodeSigningConfigAsync(final GetCodeSigningConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCodeSigningConfigRequest, GetCodeSigningConfigResult> asyncHandler) {
        final GetCodeSigningConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCodeSigningConfigResult>() {
            @Override
            public GetCodeSigningConfigResult call() throws Exception {
                GetCodeSigningConfigResult result = null;

                try {
                    result = executeGetCodeSigningConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest request) {

        return getEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(final GetEventSourceMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventSourceMappingRequest, GetEventSourceMappingResult> asyncHandler) {
        final GetEventSourceMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventSourceMappingResult>() {
            @Override
            public GetEventSourceMappingResult call() throws Exception {
                GetEventSourceMappingResult result = null;

                try {
                    result = executeGetEventSourceMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest request) {

        return getFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(final GetFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler) {
        final GetFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionResult>() {
            @Override
            public GetFunctionResult call() throws Exception {
                GetFunctionResult result = null;

                try {
                    result = executeGetFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionCodeSigningConfigResult> getFunctionCodeSigningConfigAsync(GetFunctionCodeSigningConfigRequest request) {

        return getFunctionCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionCodeSigningConfigResult> getFunctionCodeSigningConfigAsync(final GetFunctionCodeSigningConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionCodeSigningConfigRequest, GetFunctionCodeSigningConfigResult> asyncHandler) {
        final GetFunctionCodeSigningConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionCodeSigningConfigResult>() {
            @Override
            public GetFunctionCodeSigningConfigResult call() throws Exception {
                GetFunctionCodeSigningConfigResult result = null;

                try {
                    result = executeGetFunctionCodeSigningConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConcurrencyResult> getFunctionConcurrencyAsync(GetFunctionConcurrencyRequest request) {

        return getFunctionConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConcurrencyResult> getFunctionConcurrencyAsync(final GetFunctionConcurrencyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionConcurrencyRequest, GetFunctionConcurrencyResult> asyncHandler) {
        final GetFunctionConcurrencyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionConcurrencyResult>() {
            @Override
            public GetFunctionConcurrencyResult call() throws Exception {
                GetFunctionConcurrencyResult result = null;

                try {
                    result = executeGetFunctionConcurrency(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest request) {

        return getFunctionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(final GetFunctionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler) {
        final GetFunctionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionConfigurationResult>() {
            @Override
            public GetFunctionConfigurationResult call() throws Exception {
                GetFunctionConfigurationResult result = null;

                try {
                    result = executeGetFunctionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionEventInvokeConfigResult> getFunctionEventInvokeConfigAsync(GetFunctionEventInvokeConfigRequest request) {

        return getFunctionEventInvokeConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionEventInvokeConfigResult> getFunctionEventInvokeConfigAsync(final GetFunctionEventInvokeConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionEventInvokeConfigRequest, GetFunctionEventInvokeConfigResult> asyncHandler) {
        final GetFunctionEventInvokeConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionEventInvokeConfigResult>() {
            @Override
            public GetFunctionEventInvokeConfigResult call() throws Exception {
                GetFunctionEventInvokeConfigResult result = null;

                try {
                    result = executeGetFunctionEventInvokeConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionResult> getLayerVersionAsync(GetLayerVersionRequest request) {

        return getLayerVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionResult> getLayerVersionAsync(final GetLayerVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLayerVersionRequest, GetLayerVersionResult> asyncHandler) {
        final GetLayerVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLayerVersionResult>() {
            @Override
            public GetLayerVersionResult call() throws Exception {
                GetLayerVersionResult result = null;

                try {
                    result = executeGetLayerVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionByArnResult> getLayerVersionByArnAsync(GetLayerVersionByArnRequest request) {

        return getLayerVersionByArnAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionByArnResult> getLayerVersionByArnAsync(final GetLayerVersionByArnRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLayerVersionByArnRequest, GetLayerVersionByArnResult> asyncHandler) {
        final GetLayerVersionByArnRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLayerVersionByArnResult>() {
            @Override
            public GetLayerVersionByArnResult call() throws Exception {
                GetLayerVersionByArnResult result = null;

                try {
                    result = executeGetLayerVersionByArn(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionPolicyResult> getLayerVersionPolicyAsync(GetLayerVersionPolicyRequest request) {

        return getLayerVersionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLayerVersionPolicyResult> getLayerVersionPolicyAsync(final GetLayerVersionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLayerVersionPolicyRequest, GetLayerVersionPolicyResult> asyncHandler) {
        final GetLayerVersionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLayerVersionPolicyResult>() {
            @Override
            public GetLayerVersionPolicyResult call() throws Exception {
                GetLayerVersionPolicyResult result = null;

                try {
                    result = executeGetLayerVersionPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {
        final GetPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyResult>() {
            @Override
            public GetPolicyResult call() throws Exception {
                GetPolicyResult result = null;

                try {
                    result = executeGetPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProvisionedConcurrencyConfigResult> getProvisionedConcurrencyConfigAsync(
            GetProvisionedConcurrencyConfigRequest request) {

        return getProvisionedConcurrencyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProvisionedConcurrencyConfigResult> getProvisionedConcurrencyConfigAsync(
            final GetProvisionedConcurrencyConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProvisionedConcurrencyConfigRequest, GetProvisionedConcurrencyConfigResult> asyncHandler) {
        final GetProvisionedConcurrencyConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProvisionedConcurrencyConfigResult>() {
            @Override
            public GetProvisionedConcurrencyConfigResult call() throws Exception {
                GetProvisionedConcurrencyConfigResult result = null;

                try {
                    result = executeGetProvisionedConcurrencyConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest request) {

        return invokeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvokeResult> invokeAsync(final InvokeRequest request,
            final com.amazonaws.handlers.AsyncHandler<InvokeRequest, InvokeResult> asyncHandler) {
        final InvokeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InvokeResult>() {
            @Override
            public InvokeResult call() throws Exception {
                InvokeResult result = null;

                try {
                    result = executeInvoke(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest request) {

        return invokeAsyncAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(final InvokeAsyncRequest request,
            final com.amazonaws.handlers.AsyncHandler<InvokeAsyncRequest, InvokeAsyncResult> asyncHandler) {
        final InvokeAsyncRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InvokeAsyncResult>() {
            @Override
            public InvokeAsyncResult call() throws Exception {
                InvokeAsyncResult result = null;

                try {
                    result = executeInvokeAsync(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {
        final ListAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAliasesResult>() {
            @Override
            public ListAliasesResult call() throws Exception {
                ListAliasesResult result = null;

                try {
                    result = executeListAliases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCodeSigningConfigsResult> listCodeSigningConfigsAsync(ListCodeSigningConfigsRequest request) {

        return listCodeSigningConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCodeSigningConfigsResult> listCodeSigningConfigsAsync(final ListCodeSigningConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCodeSigningConfigsRequest, ListCodeSigningConfigsResult> asyncHandler) {
        final ListCodeSigningConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCodeSigningConfigsResult>() {
            @Override
            public ListCodeSigningConfigsResult call() throws Exception {
                ListCodeSigningConfigsResult result = null;

                try {
                    result = executeListCodeSigningConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest request) {

        return listEventSourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(final ListEventSourceMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler) {
        final ListEventSourceMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventSourceMappingsResult>() {
            @Override
            public ListEventSourceMappingsResult call() throws Exception {
                ListEventSourceMappingsResult result = null;

                try {
                    result = executeListEventSourceMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the ListEventSourceMappings operation.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync() {

        return listEventSourceMappingsAsync(new ListEventSourceMappingsRequest());
    }

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation with an AsyncHandler.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(
            com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler) {

        return listEventSourceMappingsAsync(new ListEventSourceMappingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionEventInvokeConfigsResult> listFunctionEventInvokeConfigsAsync(ListFunctionEventInvokeConfigsRequest request) {

        return listFunctionEventInvokeConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionEventInvokeConfigsResult> listFunctionEventInvokeConfigsAsync(
            final ListFunctionEventInvokeConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFunctionEventInvokeConfigsRequest, ListFunctionEventInvokeConfigsResult> asyncHandler) {
        final ListFunctionEventInvokeConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFunctionEventInvokeConfigsResult>() {
            @Override
            public ListFunctionEventInvokeConfigsResult call() throws Exception {
                ListFunctionEventInvokeConfigsResult result = null;

                try {
                    result = executeListFunctionEventInvokeConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest request) {

        return listFunctionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(final ListFunctionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler) {
        final ListFunctionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFunctionsResult>() {
            @Override
            public ListFunctionsResult call() throws Exception {
                ListFunctionsResult result = null;

                try {
                    result = executeListFunctions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the ListFunctions operation.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync() {

        return listFunctionsAsync(new ListFunctionsRequest());
    }

    /**
     * Simplified method form for invoking the ListFunctions operation with an AsyncHandler.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler) {

        return listFunctionsAsync(new ListFunctionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsByCodeSigningConfigResult> listFunctionsByCodeSigningConfigAsync(
            ListFunctionsByCodeSigningConfigRequest request) {

        return listFunctionsByCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsByCodeSigningConfigResult> listFunctionsByCodeSigningConfigAsync(
            final ListFunctionsByCodeSigningConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFunctionsByCodeSigningConfigRequest, ListFunctionsByCodeSigningConfigResult> asyncHandler) {
        final ListFunctionsByCodeSigningConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFunctionsByCodeSigningConfigResult>() {
            @Override
            public ListFunctionsByCodeSigningConfigResult call() throws Exception {
                ListFunctionsByCodeSigningConfigResult result = null;

                try {
                    result = executeListFunctionsByCodeSigningConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLayerVersionsResult> listLayerVersionsAsync(ListLayerVersionsRequest request) {

        return listLayerVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLayerVersionsResult> listLayerVersionsAsync(final ListLayerVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLayerVersionsRequest, ListLayerVersionsResult> asyncHandler) {
        final ListLayerVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLayerVersionsResult>() {
            @Override
            public ListLayerVersionsResult call() throws Exception {
                ListLayerVersionsResult result = null;

                try {
                    result = executeListLayerVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLayersResult> listLayersAsync(ListLayersRequest request) {

        return listLayersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLayersResult> listLayersAsync(final ListLayersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLayersRequest, ListLayersResult> asyncHandler) {
        final ListLayersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLayersResult>() {
            @Override
            public ListLayersResult call() throws Exception {
                ListLayersResult result = null;

                try {
                    result = executeListLayers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedConcurrencyConfigsResult> listProvisionedConcurrencyConfigsAsync(
            ListProvisionedConcurrencyConfigsRequest request) {

        return listProvisionedConcurrencyConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedConcurrencyConfigsResult> listProvisionedConcurrencyConfigsAsync(
            final ListProvisionedConcurrencyConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProvisionedConcurrencyConfigsRequest, ListProvisionedConcurrencyConfigsResult> asyncHandler) {
        final ListProvisionedConcurrencyConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProvisionedConcurrencyConfigsResult>() {
            @Override
            public ListProvisionedConcurrencyConfigsResult call() throws Exception {
                ListProvisionedConcurrencyConfigsResult result = null;

                try {
                    result = executeListProvisionedConcurrencyConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest request) {

        return listVersionsByFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(final ListVersionsByFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVersionsByFunctionRequest, ListVersionsByFunctionResult> asyncHandler) {
        final ListVersionsByFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVersionsByFunctionResult>() {
            @Override
            public ListVersionsByFunctionResult call() throws Exception {
                ListVersionsByFunctionResult result = null;

                try {
                    result = executeListVersionsByFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PublishLayerVersionResult> publishLayerVersionAsync(PublishLayerVersionRequest request) {

        return publishLayerVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishLayerVersionResult> publishLayerVersionAsync(final PublishLayerVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishLayerVersionRequest, PublishLayerVersionResult> asyncHandler) {
        final PublishLayerVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PublishLayerVersionResult>() {
            @Override
            public PublishLayerVersionResult call() throws Exception {
                PublishLayerVersionResult result = null;

                try {
                    result = executePublishLayerVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest request) {

        return publishVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(final PublishVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishVersionRequest, PublishVersionResult> asyncHandler) {
        final PublishVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PublishVersionResult>() {
            @Override
            public PublishVersionResult call() throws Exception {
                PublishVersionResult result = null;

                try {
                    result = executePublishVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutFunctionCodeSigningConfigResult> putFunctionCodeSigningConfigAsync(PutFunctionCodeSigningConfigRequest request) {

        return putFunctionCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFunctionCodeSigningConfigResult> putFunctionCodeSigningConfigAsync(final PutFunctionCodeSigningConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFunctionCodeSigningConfigRequest, PutFunctionCodeSigningConfigResult> asyncHandler) {
        final PutFunctionCodeSigningConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFunctionCodeSigningConfigResult>() {
            @Override
            public PutFunctionCodeSigningConfigResult call() throws Exception {
                PutFunctionCodeSigningConfigResult result = null;

                try {
                    result = executePutFunctionCodeSigningConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutFunctionConcurrencyResult> putFunctionConcurrencyAsync(PutFunctionConcurrencyRequest request) {

        return putFunctionConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFunctionConcurrencyResult> putFunctionConcurrencyAsync(final PutFunctionConcurrencyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFunctionConcurrencyRequest, PutFunctionConcurrencyResult> asyncHandler) {
        final PutFunctionConcurrencyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFunctionConcurrencyResult>() {
            @Override
            public PutFunctionConcurrencyResult call() throws Exception {
                PutFunctionConcurrencyResult result = null;

                try {
                    result = executePutFunctionConcurrency(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutFunctionEventInvokeConfigResult> putFunctionEventInvokeConfigAsync(PutFunctionEventInvokeConfigRequest request) {

        return putFunctionEventInvokeConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFunctionEventInvokeConfigResult> putFunctionEventInvokeConfigAsync(final PutFunctionEventInvokeConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFunctionEventInvokeConfigRequest, PutFunctionEventInvokeConfigResult> asyncHandler) {
        final PutFunctionEventInvokeConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFunctionEventInvokeConfigResult>() {
            @Override
            public PutFunctionEventInvokeConfigResult call() throws Exception {
                PutFunctionEventInvokeConfigResult result = null;

                try {
                    result = executePutFunctionEventInvokeConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutProvisionedConcurrencyConfigResult> putProvisionedConcurrencyConfigAsync(
            PutProvisionedConcurrencyConfigRequest request) {

        return putProvisionedConcurrencyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProvisionedConcurrencyConfigResult> putProvisionedConcurrencyConfigAsync(
            final PutProvisionedConcurrencyConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutProvisionedConcurrencyConfigRequest, PutProvisionedConcurrencyConfigResult> asyncHandler) {
        final PutProvisionedConcurrencyConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutProvisionedConcurrencyConfigResult>() {
            @Override
            public PutProvisionedConcurrencyConfigResult call() throws Exception {
                PutProvisionedConcurrencyConfigResult result = null;

                try {
                    result = executePutProvisionedConcurrencyConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveLayerVersionPermissionResult> removeLayerVersionPermissionAsync(RemoveLayerVersionPermissionRequest request) {

        return removeLayerVersionPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveLayerVersionPermissionResult> removeLayerVersionPermissionAsync(final RemoveLayerVersionPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveLayerVersionPermissionRequest, RemoveLayerVersionPermissionResult> asyncHandler) {
        final RemoveLayerVersionPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveLayerVersionPermissionResult>() {
            @Override
            public RemoveLayerVersionPermissionResult call() throws Exception {
                RemoveLayerVersionPermissionResult result = null;

                try {
                    result = executeRemoveLayerVersionPermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(final RemovePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {
        final RemovePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemovePermissionResult>() {
            @Override
            public RemovePermissionResult call() throws Exception {
                RemovePermissionResult result = null;

                try {
                    result = executeRemovePermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(final UpdateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {
        final UpdateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAliasResult>() {
            @Override
            public UpdateAliasResult call() throws Exception {
                UpdateAliasResult result = null;

                try {
                    result = executeUpdateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateCodeSigningConfigResult> updateCodeSigningConfigAsync(UpdateCodeSigningConfigRequest request) {

        return updateCodeSigningConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCodeSigningConfigResult> updateCodeSigningConfigAsync(final UpdateCodeSigningConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCodeSigningConfigRequest, UpdateCodeSigningConfigResult> asyncHandler) {
        final UpdateCodeSigningConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCodeSigningConfigResult>() {
            @Override
            public UpdateCodeSigningConfigResult call() throws Exception {
                UpdateCodeSigningConfigResult result = null;

                try {
                    result = executeUpdateCodeSigningConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest request) {

        return updateEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(final UpdateEventSourceMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventSourceMappingRequest, UpdateEventSourceMappingResult> asyncHandler) {
        final UpdateEventSourceMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventSourceMappingResult>() {
            @Override
            public UpdateEventSourceMappingResult call() throws Exception {
                UpdateEventSourceMappingResult result = null;

                try {
                    result = executeUpdateEventSourceMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest request) {

        return updateFunctionCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(final UpdateFunctionCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFunctionCodeRequest, UpdateFunctionCodeResult> asyncHandler) {
        final UpdateFunctionCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFunctionCodeResult>() {
            @Override
            public UpdateFunctionCodeResult call() throws Exception {
                UpdateFunctionCodeResult result = null;

                try {
                    result = executeUpdateFunctionCode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(UpdateFunctionConfigurationRequest request) {

        return updateFunctionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(final UpdateFunctionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler) {
        final UpdateFunctionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFunctionConfigurationResult>() {
            @Override
            public UpdateFunctionConfigurationResult call() throws Exception {
                UpdateFunctionConfigurationResult result = null;

                try {
                    result = executeUpdateFunctionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionEventInvokeConfigResult> updateFunctionEventInvokeConfigAsync(
            UpdateFunctionEventInvokeConfigRequest request) {

        return updateFunctionEventInvokeConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionEventInvokeConfigResult> updateFunctionEventInvokeConfigAsync(
            final UpdateFunctionEventInvokeConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFunctionEventInvokeConfigRequest, UpdateFunctionEventInvokeConfigResult> asyncHandler) {
        final UpdateFunctionEventInvokeConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFunctionEventInvokeConfigResult>() {
            @Override
            public UpdateFunctionEventInvokeConfigResult call() throws Exception {
                UpdateFunctionEventInvokeConfigResult result = null;

                try {
                    result = executeUpdateFunctionEventInvokeConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
