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
package com.amazonaws.services.cloudfront;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing CloudFront asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon CloudFront</fullname>
 * <p>
 * This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about
 * CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon
 * CloudFront Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFrontAsyncClient extends AmazonCloudFrontClient implements AmazonCloudFrontAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront. A credentials provider chain will
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
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to CloudFront (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the provided AWS account
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
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCloudFrontAsyncClientBuilder asyncBuilder() {
        return AmazonCloudFrontAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudFrontAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonCloudFrontAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateCachePolicyResult> createCachePolicyAsync(CreateCachePolicyRequest request) {

        return createCachePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCachePolicyResult> createCachePolicyAsync(final CreateCachePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCachePolicyRequest, CreateCachePolicyResult> asyncHandler) {
        final CreateCachePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCachePolicyResult>() {
            @Override
            public CreateCachePolicyResult call() throws Exception {
                CreateCachePolicyResult result = null;

                try {
                    result = executeCreateCachePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest request) {

        return createCloudFrontOriginAccessIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            final CreateCloudFrontOriginAccessIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCloudFrontOriginAccessIdentityRequest, CreateCloudFrontOriginAccessIdentityResult> asyncHandler) {
        final CreateCloudFrontOriginAccessIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCloudFrontOriginAccessIdentityResult>() {
            @Override
            public CreateCloudFrontOriginAccessIdentityResult call() throws Exception {
                CreateCloudFrontOriginAccessIdentityResult result = null;

                try {
                    result = executeCreateCloudFrontOriginAccessIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(CreateDistributionRequest request) {

        return createDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(final CreateDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDistributionRequest, CreateDistributionResult> asyncHandler) {
        final CreateDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDistributionResult>() {
            @Override
            public CreateDistributionResult call() throws Exception {
                CreateDistributionResult result = null;

                try {
                    result = executeCreateDistribution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(CreateDistributionWithTagsRequest request) {

        return createDistributionWithTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(final CreateDistributionWithTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDistributionWithTagsRequest, CreateDistributionWithTagsResult> asyncHandler) {
        final CreateDistributionWithTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDistributionWithTagsResult>() {
            @Override
            public CreateDistributionWithTagsResult call() throws Exception {
                CreateDistributionWithTagsResult result = null;

                try {
                    result = executeCreateDistributionWithTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFieldLevelEncryptionConfigResult> createFieldLevelEncryptionConfigAsync(
            CreateFieldLevelEncryptionConfigRequest request) {

        return createFieldLevelEncryptionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFieldLevelEncryptionConfigResult> createFieldLevelEncryptionConfigAsync(
            final CreateFieldLevelEncryptionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFieldLevelEncryptionConfigRequest, CreateFieldLevelEncryptionConfigResult> asyncHandler) {
        final CreateFieldLevelEncryptionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFieldLevelEncryptionConfigResult>() {
            @Override
            public CreateFieldLevelEncryptionConfigResult call() throws Exception {
                CreateFieldLevelEncryptionConfigResult result = null;

                try {
                    result = executeCreateFieldLevelEncryptionConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFieldLevelEncryptionProfileResult> createFieldLevelEncryptionProfileAsync(
            CreateFieldLevelEncryptionProfileRequest request) {

        return createFieldLevelEncryptionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFieldLevelEncryptionProfileResult> createFieldLevelEncryptionProfileAsync(
            final CreateFieldLevelEncryptionProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFieldLevelEncryptionProfileRequest, CreateFieldLevelEncryptionProfileResult> asyncHandler) {
        final CreateFieldLevelEncryptionProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFieldLevelEncryptionProfileResult>() {
            @Override
            public CreateFieldLevelEncryptionProfileResult call() throws Exception {
                CreateFieldLevelEncryptionProfileResult result = null;

                try {
                    result = executeCreateFieldLevelEncryptionProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(CreateInvalidationRequest request) {

        return createInvalidationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(final CreateInvalidationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInvalidationRequest, CreateInvalidationResult> asyncHandler) {
        final CreateInvalidationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInvalidationResult>() {
            @Override
            public CreateInvalidationResult call() throws Exception {
                CreateInvalidationResult result = null;

                try {
                    result = executeCreateInvalidation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateKeyGroupResult> createKeyGroupAsync(CreateKeyGroupRequest request) {

        return createKeyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyGroupResult> createKeyGroupAsync(final CreateKeyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeyGroupRequest, CreateKeyGroupResult> asyncHandler) {
        final CreateKeyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKeyGroupResult>() {
            @Override
            public CreateKeyGroupResult call() throws Exception {
                CreateKeyGroupResult result = null;

                try {
                    result = executeCreateKeyGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoringSubscriptionResult> createMonitoringSubscriptionAsync(CreateMonitoringSubscriptionRequest request) {

        return createMonitoringSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoringSubscriptionResult> createMonitoringSubscriptionAsync(final CreateMonitoringSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMonitoringSubscriptionRequest, CreateMonitoringSubscriptionResult> asyncHandler) {
        final CreateMonitoringSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMonitoringSubscriptionResult>() {
            @Override
            public CreateMonitoringSubscriptionResult call() throws Exception {
                CreateMonitoringSubscriptionResult result = null;

                try {
                    result = executeCreateMonitoringSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateOriginRequestPolicyResult> createOriginRequestPolicyAsync(CreateOriginRequestPolicyRequest request) {

        return createOriginRequestPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOriginRequestPolicyResult> createOriginRequestPolicyAsync(final CreateOriginRequestPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOriginRequestPolicyRequest, CreateOriginRequestPolicyResult> asyncHandler) {
        final CreateOriginRequestPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOriginRequestPolicyResult>() {
            @Override
            public CreateOriginRequestPolicyResult call() throws Exception {
                CreateOriginRequestPolicyResult result = null;

                try {
                    result = executeCreateOriginRequestPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePublicKeyResult> createPublicKeyAsync(CreatePublicKeyRequest request) {

        return createPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePublicKeyResult> createPublicKeyAsync(final CreatePublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePublicKeyRequest, CreatePublicKeyResult> asyncHandler) {
        final CreatePublicKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePublicKeyResult>() {
            @Override
            public CreatePublicKeyResult call() throws Exception {
                CreatePublicKeyResult result = null;

                try {
                    result = executeCreatePublicKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRealtimeLogConfigResult> createRealtimeLogConfigAsync(CreateRealtimeLogConfigRequest request) {

        return createRealtimeLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRealtimeLogConfigResult> createRealtimeLogConfigAsync(final CreateRealtimeLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRealtimeLogConfigRequest, CreateRealtimeLogConfigResult> asyncHandler) {
        final CreateRealtimeLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRealtimeLogConfigResult>() {
            @Override
            public CreateRealtimeLogConfigResult call() throws Exception {
                CreateRealtimeLogConfigResult result = null;

                try {
                    result = executeCreateRealtimeLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(CreateStreamingDistributionRequest request) {

        return createStreamingDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(final CreateStreamingDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionRequest, CreateStreamingDistributionResult> asyncHandler) {
        final CreateStreamingDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamingDistributionResult>() {
            @Override
            public CreateStreamingDistributionResult call() throws Exception {
                CreateStreamingDistributionResult result = null;

                try {
                    result = executeCreateStreamingDistribution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            CreateStreamingDistributionWithTagsRequest request) {

        return createStreamingDistributionWithTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            final CreateStreamingDistributionWithTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionWithTagsRequest, CreateStreamingDistributionWithTagsResult> asyncHandler) {
        final CreateStreamingDistributionWithTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamingDistributionWithTagsResult>() {
            @Override
            public CreateStreamingDistributionWithTagsResult call() throws Exception {
                CreateStreamingDistributionWithTagsResult result = null;

                try {
                    result = executeCreateStreamingDistributionWithTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCachePolicyResult> deleteCachePolicyAsync(DeleteCachePolicyRequest request) {

        return deleteCachePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCachePolicyResult> deleteCachePolicyAsync(final DeleteCachePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCachePolicyRequest, DeleteCachePolicyResult> asyncHandler) {
        final DeleteCachePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCachePolicyResult>() {
            @Override
            public DeleteCachePolicyResult call() throws Exception {
                DeleteCachePolicyResult result = null;

                try {
                    result = executeDeleteCachePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest request) {

        return deleteCloudFrontOriginAccessIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            final DeleteCloudFrontOriginAccessIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCloudFrontOriginAccessIdentityRequest, DeleteCloudFrontOriginAccessIdentityResult> asyncHandler) {
        final DeleteCloudFrontOriginAccessIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCloudFrontOriginAccessIdentityResult>() {
            @Override
            public DeleteCloudFrontOriginAccessIdentityResult call() throws Exception {
                DeleteCloudFrontOriginAccessIdentityResult result = null;

                try {
                    result = executeDeleteCloudFrontOriginAccessIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(DeleteDistributionRequest request) {

        return deleteDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(final DeleteDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDistributionRequest, DeleteDistributionResult> asyncHandler) {
        final DeleteDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDistributionResult>() {
            @Override
            public DeleteDistributionResult call() throws Exception {
                DeleteDistributionResult result = null;

                try {
                    result = executeDeleteDistribution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFieldLevelEncryptionConfigResult> deleteFieldLevelEncryptionConfigAsync(
            DeleteFieldLevelEncryptionConfigRequest request) {

        return deleteFieldLevelEncryptionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFieldLevelEncryptionConfigResult> deleteFieldLevelEncryptionConfigAsync(
            final DeleteFieldLevelEncryptionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFieldLevelEncryptionConfigRequest, DeleteFieldLevelEncryptionConfigResult> asyncHandler) {
        final DeleteFieldLevelEncryptionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFieldLevelEncryptionConfigResult>() {
            @Override
            public DeleteFieldLevelEncryptionConfigResult call() throws Exception {
                DeleteFieldLevelEncryptionConfigResult result = null;

                try {
                    result = executeDeleteFieldLevelEncryptionConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFieldLevelEncryptionProfileResult> deleteFieldLevelEncryptionProfileAsync(
            DeleteFieldLevelEncryptionProfileRequest request) {

        return deleteFieldLevelEncryptionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFieldLevelEncryptionProfileResult> deleteFieldLevelEncryptionProfileAsync(
            final DeleteFieldLevelEncryptionProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFieldLevelEncryptionProfileRequest, DeleteFieldLevelEncryptionProfileResult> asyncHandler) {
        final DeleteFieldLevelEncryptionProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFieldLevelEncryptionProfileResult>() {
            @Override
            public DeleteFieldLevelEncryptionProfileResult call() throws Exception {
                DeleteFieldLevelEncryptionProfileResult result = null;

                try {
                    result = executeDeleteFieldLevelEncryptionProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteKeyGroupResult> deleteKeyGroupAsync(DeleteKeyGroupRequest request) {

        return deleteKeyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyGroupResult> deleteKeyGroupAsync(final DeleteKeyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeyGroupRequest, DeleteKeyGroupResult> asyncHandler) {
        final DeleteKeyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeyGroupResult>() {
            @Override
            public DeleteKeyGroupResult call() throws Exception {
                DeleteKeyGroupResult result = null;

                try {
                    result = executeDeleteKeyGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoringSubscriptionResult> deleteMonitoringSubscriptionAsync(DeleteMonitoringSubscriptionRequest request) {

        return deleteMonitoringSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoringSubscriptionResult> deleteMonitoringSubscriptionAsync(final DeleteMonitoringSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMonitoringSubscriptionRequest, DeleteMonitoringSubscriptionResult> asyncHandler) {
        final DeleteMonitoringSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMonitoringSubscriptionResult>() {
            @Override
            public DeleteMonitoringSubscriptionResult call() throws Exception {
                DeleteMonitoringSubscriptionResult result = null;

                try {
                    result = executeDeleteMonitoringSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOriginRequestPolicyResult> deleteOriginRequestPolicyAsync(DeleteOriginRequestPolicyRequest request) {

        return deleteOriginRequestPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOriginRequestPolicyResult> deleteOriginRequestPolicyAsync(final DeleteOriginRequestPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOriginRequestPolicyRequest, DeleteOriginRequestPolicyResult> asyncHandler) {
        final DeleteOriginRequestPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOriginRequestPolicyResult>() {
            @Override
            public DeleteOriginRequestPolicyResult call() throws Exception {
                DeleteOriginRequestPolicyResult result = null;

                try {
                    result = executeDeleteOriginRequestPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePublicKeyResult> deletePublicKeyAsync(DeletePublicKeyRequest request) {

        return deletePublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePublicKeyResult> deletePublicKeyAsync(final DeletePublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePublicKeyRequest, DeletePublicKeyResult> asyncHandler) {
        final DeletePublicKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePublicKeyResult>() {
            @Override
            public DeletePublicKeyResult call() throws Exception {
                DeletePublicKeyResult result = null;

                try {
                    result = executeDeletePublicKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRealtimeLogConfigResult> deleteRealtimeLogConfigAsync(DeleteRealtimeLogConfigRequest request) {

        return deleteRealtimeLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRealtimeLogConfigResult> deleteRealtimeLogConfigAsync(final DeleteRealtimeLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRealtimeLogConfigRequest, DeleteRealtimeLogConfigResult> asyncHandler) {
        final DeleteRealtimeLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRealtimeLogConfigResult>() {
            @Override
            public DeleteRealtimeLogConfigResult call() throws Exception {
                DeleteRealtimeLogConfigResult result = null;

                try {
                    result = executeDeleteRealtimeLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(DeleteStreamingDistributionRequest request) {

        return deleteStreamingDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(final DeleteStreamingDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamingDistributionRequest, DeleteStreamingDistributionResult> asyncHandler) {
        final DeleteStreamingDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamingDistributionResult>() {
            @Override
            public DeleteStreamingDistributionResult call() throws Exception {
                DeleteStreamingDistributionResult result = null;

                try {
                    result = executeDeleteStreamingDistribution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFunctionResult> describeFunctionAsync(DescribeFunctionRequest request) {

        return describeFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFunctionResult> describeFunctionAsync(final DescribeFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFunctionRequest, DescribeFunctionResult> asyncHandler) {
        final DescribeFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFunctionResult>() {
            @Override
            public DescribeFunctionResult call() throws Exception {
                DescribeFunctionResult result = null;

                try {
                    result = executeDescribeFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCachePolicyResult> getCachePolicyAsync(GetCachePolicyRequest request) {

        return getCachePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCachePolicyResult> getCachePolicyAsync(final GetCachePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCachePolicyRequest, GetCachePolicyResult> asyncHandler) {
        final GetCachePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCachePolicyResult>() {
            @Override
            public GetCachePolicyResult call() throws Exception {
                GetCachePolicyResult result = null;

                try {
                    result = executeGetCachePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCachePolicyConfigResult> getCachePolicyConfigAsync(GetCachePolicyConfigRequest request) {

        return getCachePolicyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCachePolicyConfigResult> getCachePolicyConfigAsync(final GetCachePolicyConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCachePolicyConfigRequest, GetCachePolicyConfigResult> asyncHandler) {
        final GetCachePolicyConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCachePolicyConfigResult>() {
            @Override
            public GetCachePolicyConfigResult call() throws Exception {
                GetCachePolicyConfigResult result = null;

                try {
                    result = executeGetCachePolicyConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            GetCloudFrontOriginAccessIdentityRequest request) {

        return getCloudFrontOriginAccessIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            final GetCloudFrontOriginAccessIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityRequest, GetCloudFrontOriginAccessIdentityResult> asyncHandler) {
        final GetCloudFrontOriginAccessIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCloudFrontOriginAccessIdentityResult>() {
            @Override
            public GetCloudFrontOriginAccessIdentityResult call() throws Exception {
                GetCloudFrontOriginAccessIdentityResult result = null;

                try {
                    result = executeGetCloudFrontOriginAccessIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest request) {

        return getCloudFrontOriginAccessIdentityConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            final GetCloudFrontOriginAccessIdentityConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityConfigRequest, GetCloudFrontOriginAccessIdentityConfigResult> asyncHandler) {
        final GetCloudFrontOriginAccessIdentityConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCloudFrontOriginAccessIdentityConfigResult>() {
            @Override
            public GetCloudFrontOriginAccessIdentityConfigResult call() throws Exception {
                GetCloudFrontOriginAccessIdentityConfigResult result = null;

                try {
                    result = executeGetCloudFrontOriginAccessIdentityConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(GetDistributionRequest request) {

        return getDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(final GetDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDistributionRequest, GetDistributionResult> asyncHandler) {
        final GetDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDistributionResult>() {
            @Override
            public GetDistributionResult call() throws Exception {
                GetDistributionResult result = null;

                try {
                    result = executeGetDistribution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(GetDistributionConfigRequest request) {

        return getDistributionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(final GetDistributionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDistributionConfigRequest, GetDistributionConfigResult> asyncHandler) {
        final GetDistributionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDistributionConfigResult>() {
            @Override
            public GetDistributionConfigResult call() throws Exception {
                GetDistributionConfigResult result = null;

                try {
                    result = executeGetDistributionConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFieldLevelEncryptionResult> getFieldLevelEncryptionAsync(GetFieldLevelEncryptionRequest request) {

        return getFieldLevelEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFieldLevelEncryptionResult> getFieldLevelEncryptionAsync(final GetFieldLevelEncryptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFieldLevelEncryptionRequest, GetFieldLevelEncryptionResult> asyncHandler) {
        final GetFieldLevelEncryptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFieldLevelEncryptionResult>() {
            @Override
            public GetFieldLevelEncryptionResult call() throws Exception {
                GetFieldLevelEncryptionResult result = null;

                try {
                    result = executeGetFieldLevelEncryption(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFieldLevelEncryptionConfigResult> getFieldLevelEncryptionConfigAsync(GetFieldLevelEncryptionConfigRequest request) {

        return getFieldLevelEncryptionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFieldLevelEncryptionConfigResult> getFieldLevelEncryptionConfigAsync(
            final GetFieldLevelEncryptionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFieldLevelEncryptionConfigRequest, GetFieldLevelEncryptionConfigResult> asyncHandler) {
        final GetFieldLevelEncryptionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFieldLevelEncryptionConfigResult>() {
            @Override
            public GetFieldLevelEncryptionConfigResult call() throws Exception {
                GetFieldLevelEncryptionConfigResult result = null;

                try {
                    result = executeGetFieldLevelEncryptionConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFieldLevelEncryptionProfileResult> getFieldLevelEncryptionProfileAsync(GetFieldLevelEncryptionProfileRequest request) {

        return getFieldLevelEncryptionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFieldLevelEncryptionProfileResult> getFieldLevelEncryptionProfileAsync(
            final GetFieldLevelEncryptionProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFieldLevelEncryptionProfileRequest, GetFieldLevelEncryptionProfileResult> asyncHandler) {
        final GetFieldLevelEncryptionProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFieldLevelEncryptionProfileResult>() {
            @Override
            public GetFieldLevelEncryptionProfileResult call() throws Exception {
                GetFieldLevelEncryptionProfileResult result = null;

                try {
                    result = executeGetFieldLevelEncryptionProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFieldLevelEncryptionProfileConfigResult> getFieldLevelEncryptionProfileConfigAsync(
            GetFieldLevelEncryptionProfileConfigRequest request) {

        return getFieldLevelEncryptionProfileConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFieldLevelEncryptionProfileConfigResult> getFieldLevelEncryptionProfileConfigAsync(
            final GetFieldLevelEncryptionProfileConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFieldLevelEncryptionProfileConfigRequest, GetFieldLevelEncryptionProfileConfigResult> asyncHandler) {
        final GetFieldLevelEncryptionProfileConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFieldLevelEncryptionProfileConfigResult>() {
            @Override
            public GetFieldLevelEncryptionProfileConfigResult call() throws Exception {
                GetFieldLevelEncryptionProfileConfigResult result = null;

                try {
                    result = executeGetFieldLevelEncryptionProfileConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(GetInvalidationRequest request) {

        return getInvalidationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(final GetInvalidationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInvalidationRequest, GetInvalidationResult> asyncHandler) {
        final GetInvalidationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInvalidationResult>() {
            @Override
            public GetInvalidationResult call() throws Exception {
                GetInvalidationResult result = null;

                try {
                    result = executeGetInvalidation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetKeyGroupResult> getKeyGroupAsync(GetKeyGroupRequest request) {

        return getKeyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyGroupResult> getKeyGroupAsync(final GetKeyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyGroupRequest, GetKeyGroupResult> asyncHandler) {
        final GetKeyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyGroupResult>() {
            @Override
            public GetKeyGroupResult call() throws Exception {
                GetKeyGroupResult result = null;

                try {
                    result = executeGetKeyGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetKeyGroupConfigResult> getKeyGroupConfigAsync(GetKeyGroupConfigRequest request) {

        return getKeyGroupConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyGroupConfigResult> getKeyGroupConfigAsync(final GetKeyGroupConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyGroupConfigRequest, GetKeyGroupConfigResult> asyncHandler) {
        final GetKeyGroupConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyGroupConfigResult>() {
            @Override
            public GetKeyGroupConfigResult call() throws Exception {
                GetKeyGroupConfigResult result = null;

                try {
                    result = executeGetKeyGroupConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMonitoringSubscriptionResult> getMonitoringSubscriptionAsync(GetMonitoringSubscriptionRequest request) {

        return getMonitoringSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMonitoringSubscriptionResult> getMonitoringSubscriptionAsync(final GetMonitoringSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMonitoringSubscriptionRequest, GetMonitoringSubscriptionResult> asyncHandler) {
        final GetMonitoringSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMonitoringSubscriptionResult>() {
            @Override
            public GetMonitoringSubscriptionResult call() throws Exception {
                GetMonitoringSubscriptionResult result = null;

                try {
                    result = executeGetMonitoringSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOriginRequestPolicyResult> getOriginRequestPolicyAsync(GetOriginRequestPolicyRequest request) {

        return getOriginRequestPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOriginRequestPolicyResult> getOriginRequestPolicyAsync(final GetOriginRequestPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOriginRequestPolicyRequest, GetOriginRequestPolicyResult> asyncHandler) {
        final GetOriginRequestPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOriginRequestPolicyResult>() {
            @Override
            public GetOriginRequestPolicyResult call() throws Exception {
                GetOriginRequestPolicyResult result = null;

                try {
                    result = executeGetOriginRequestPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOriginRequestPolicyConfigResult> getOriginRequestPolicyConfigAsync(GetOriginRequestPolicyConfigRequest request) {

        return getOriginRequestPolicyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOriginRequestPolicyConfigResult> getOriginRequestPolicyConfigAsync(final GetOriginRequestPolicyConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOriginRequestPolicyConfigRequest, GetOriginRequestPolicyConfigResult> asyncHandler) {
        final GetOriginRequestPolicyConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOriginRequestPolicyConfigResult>() {
            @Override
            public GetOriginRequestPolicyConfigResult call() throws Exception {
                GetOriginRequestPolicyConfigResult result = null;

                try {
                    result = executeGetOriginRequestPolicyConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPublicKeyResult> getPublicKeyAsync(GetPublicKeyRequest request) {

        return getPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPublicKeyResult> getPublicKeyAsync(final GetPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPublicKeyRequest, GetPublicKeyResult> asyncHandler) {
        final GetPublicKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPublicKeyResult>() {
            @Override
            public GetPublicKeyResult call() throws Exception {
                GetPublicKeyResult result = null;

                try {
                    result = executeGetPublicKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPublicKeyConfigResult> getPublicKeyConfigAsync(GetPublicKeyConfigRequest request) {

        return getPublicKeyConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPublicKeyConfigResult> getPublicKeyConfigAsync(final GetPublicKeyConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPublicKeyConfigRequest, GetPublicKeyConfigResult> asyncHandler) {
        final GetPublicKeyConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPublicKeyConfigResult>() {
            @Override
            public GetPublicKeyConfigResult call() throws Exception {
                GetPublicKeyConfigResult result = null;

                try {
                    result = executeGetPublicKeyConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRealtimeLogConfigResult> getRealtimeLogConfigAsync(GetRealtimeLogConfigRequest request) {

        return getRealtimeLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRealtimeLogConfigResult> getRealtimeLogConfigAsync(final GetRealtimeLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRealtimeLogConfigRequest, GetRealtimeLogConfigResult> asyncHandler) {
        final GetRealtimeLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRealtimeLogConfigResult>() {
            @Override
            public GetRealtimeLogConfigResult call() throws Exception {
                GetRealtimeLogConfigResult result = null;

                try {
                    result = executeGetRealtimeLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(GetStreamingDistributionRequest request) {

        return getStreamingDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(final GetStreamingDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionRequest, GetStreamingDistributionResult> asyncHandler) {
        final GetStreamingDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamingDistributionResult>() {
            @Override
            public GetStreamingDistributionResult call() throws Exception {
                GetStreamingDistributionResult result = null;

                try {
                    result = executeGetStreamingDistribution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(GetStreamingDistributionConfigRequest request) {

        return getStreamingDistributionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            final GetStreamingDistributionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionConfigRequest, GetStreamingDistributionConfigResult> asyncHandler) {
        final GetStreamingDistributionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamingDistributionConfigResult>() {
            @Override
            public GetStreamingDistributionConfigResult call() throws Exception {
                GetStreamingDistributionConfigResult result = null;

                try {
                    result = executeGetStreamingDistributionConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCachePoliciesResult> listCachePoliciesAsync(ListCachePoliciesRequest request) {

        return listCachePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCachePoliciesResult> listCachePoliciesAsync(final ListCachePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCachePoliciesRequest, ListCachePoliciesResult> asyncHandler) {
        final ListCachePoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCachePoliciesResult>() {
            @Override
            public ListCachePoliciesResult call() throws Exception {
                ListCachePoliciesResult result = null;

                try {
                    result = executeListCachePolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            ListCloudFrontOriginAccessIdentitiesRequest request) {

        return listCloudFrontOriginAccessIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            final ListCloudFrontOriginAccessIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCloudFrontOriginAccessIdentitiesRequest, ListCloudFrontOriginAccessIdentitiesResult> asyncHandler) {
        final ListCloudFrontOriginAccessIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCloudFrontOriginAccessIdentitiesResult>() {
            @Override
            public ListCloudFrontOriginAccessIdentitiesResult call() throws Exception {
                ListCloudFrontOriginAccessIdentitiesResult result = null;

                try {
                    result = executeListCloudFrontOriginAccessIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(ListDistributionsRequest request) {

        return listDistributionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(final ListDistributionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionsRequest, ListDistributionsResult> asyncHandler) {
        final ListDistributionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionsResult>() {
            @Override
            public ListDistributionsResult call() throws Exception {
                ListDistributionsResult result = null;

                try {
                    result = executeListDistributions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByCachePolicyIdResult> listDistributionsByCachePolicyIdAsync(
            ListDistributionsByCachePolicyIdRequest request) {

        return listDistributionsByCachePolicyIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByCachePolicyIdResult> listDistributionsByCachePolicyIdAsync(
            final ListDistributionsByCachePolicyIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionsByCachePolicyIdRequest, ListDistributionsByCachePolicyIdResult> asyncHandler) {
        final ListDistributionsByCachePolicyIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionsByCachePolicyIdResult>() {
            @Override
            public ListDistributionsByCachePolicyIdResult call() throws Exception {
                ListDistributionsByCachePolicyIdResult result = null;

                try {
                    result = executeListDistributionsByCachePolicyId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByKeyGroupResult> listDistributionsByKeyGroupAsync(ListDistributionsByKeyGroupRequest request) {

        return listDistributionsByKeyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByKeyGroupResult> listDistributionsByKeyGroupAsync(final ListDistributionsByKeyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionsByKeyGroupRequest, ListDistributionsByKeyGroupResult> asyncHandler) {
        final ListDistributionsByKeyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionsByKeyGroupResult>() {
            @Override
            public ListDistributionsByKeyGroupResult call() throws Exception {
                ListDistributionsByKeyGroupResult result = null;

                try {
                    result = executeListDistributionsByKeyGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByOriginRequestPolicyIdResult> listDistributionsByOriginRequestPolicyIdAsync(
            ListDistributionsByOriginRequestPolicyIdRequest request) {

        return listDistributionsByOriginRequestPolicyIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByOriginRequestPolicyIdResult> listDistributionsByOriginRequestPolicyIdAsync(
            final ListDistributionsByOriginRequestPolicyIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionsByOriginRequestPolicyIdRequest, ListDistributionsByOriginRequestPolicyIdResult> asyncHandler) {
        final ListDistributionsByOriginRequestPolicyIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionsByOriginRequestPolicyIdResult>() {
            @Override
            public ListDistributionsByOriginRequestPolicyIdResult call() throws Exception {
                ListDistributionsByOriginRequestPolicyIdResult result = null;

                try {
                    result = executeListDistributionsByOriginRequestPolicyId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByRealtimeLogConfigResult> listDistributionsByRealtimeLogConfigAsync(
            ListDistributionsByRealtimeLogConfigRequest request) {

        return listDistributionsByRealtimeLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByRealtimeLogConfigResult> listDistributionsByRealtimeLogConfigAsync(
            final ListDistributionsByRealtimeLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionsByRealtimeLogConfigRequest, ListDistributionsByRealtimeLogConfigResult> asyncHandler) {
        final ListDistributionsByRealtimeLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionsByRealtimeLogConfigResult>() {
            @Override
            public ListDistributionsByRealtimeLogConfigResult call() throws Exception {
                ListDistributionsByRealtimeLogConfigResult result = null;

                try {
                    result = executeListDistributionsByRealtimeLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(ListDistributionsByWebACLIdRequest request) {

        return listDistributionsByWebACLIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(final ListDistributionsByWebACLIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionsByWebACLIdRequest, ListDistributionsByWebACLIdResult> asyncHandler) {
        final ListDistributionsByWebACLIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionsByWebACLIdResult>() {
            @Override
            public ListDistributionsByWebACLIdResult call() throws Exception {
                ListDistributionsByWebACLIdResult result = null;

                try {
                    result = executeListDistributionsByWebACLId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFieldLevelEncryptionConfigsResult> listFieldLevelEncryptionConfigsAsync(
            ListFieldLevelEncryptionConfigsRequest request) {

        return listFieldLevelEncryptionConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFieldLevelEncryptionConfigsResult> listFieldLevelEncryptionConfigsAsync(
            final ListFieldLevelEncryptionConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFieldLevelEncryptionConfigsRequest, ListFieldLevelEncryptionConfigsResult> asyncHandler) {
        final ListFieldLevelEncryptionConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFieldLevelEncryptionConfigsResult>() {
            @Override
            public ListFieldLevelEncryptionConfigsResult call() throws Exception {
                ListFieldLevelEncryptionConfigsResult result = null;

                try {
                    result = executeListFieldLevelEncryptionConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFieldLevelEncryptionProfilesResult> listFieldLevelEncryptionProfilesAsync(
            ListFieldLevelEncryptionProfilesRequest request) {

        return listFieldLevelEncryptionProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFieldLevelEncryptionProfilesResult> listFieldLevelEncryptionProfilesAsync(
            final ListFieldLevelEncryptionProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFieldLevelEncryptionProfilesRequest, ListFieldLevelEncryptionProfilesResult> asyncHandler) {
        final ListFieldLevelEncryptionProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFieldLevelEncryptionProfilesResult>() {
            @Override
            public ListFieldLevelEncryptionProfilesResult call() throws Exception {
                ListFieldLevelEncryptionProfilesResult result = null;

                try {
                    result = executeListFieldLevelEncryptionProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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

    @Override
    public java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(ListInvalidationsRequest request) {

        return listInvalidationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(final ListInvalidationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInvalidationsRequest, ListInvalidationsResult> asyncHandler) {
        final ListInvalidationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInvalidationsResult>() {
            @Override
            public ListInvalidationsResult call() throws Exception {
                ListInvalidationsResult result = null;

                try {
                    result = executeListInvalidations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListKeyGroupsResult> listKeyGroupsAsync(ListKeyGroupsRequest request) {

        return listKeyGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyGroupsResult> listKeyGroupsAsync(final ListKeyGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeyGroupsRequest, ListKeyGroupsResult> asyncHandler) {
        final ListKeyGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKeyGroupsResult>() {
            @Override
            public ListKeyGroupsResult call() throws Exception {
                ListKeyGroupsResult result = null;

                try {
                    result = executeListKeyGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListOriginRequestPoliciesResult> listOriginRequestPoliciesAsync(ListOriginRequestPoliciesRequest request) {

        return listOriginRequestPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOriginRequestPoliciesResult> listOriginRequestPoliciesAsync(final ListOriginRequestPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOriginRequestPoliciesRequest, ListOriginRequestPoliciesResult> asyncHandler) {
        final ListOriginRequestPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOriginRequestPoliciesResult>() {
            @Override
            public ListOriginRequestPoliciesResult call() throws Exception {
                ListOriginRequestPoliciesResult result = null;

                try {
                    result = executeListOriginRequestPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest request) {

        return listPublicKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(final ListPublicKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler) {
        final ListPublicKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPublicKeysResult>() {
            @Override
            public ListPublicKeysResult call() throws Exception {
                ListPublicKeysResult result = null;

                try {
                    result = executeListPublicKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRealtimeLogConfigsResult> listRealtimeLogConfigsAsync(ListRealtimeLogConfigsRequest request) {

        return listRealtimeLogConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRealtimeLogConfigsResult> listRealtimeLogConfigsAsync(final ListRealtimeLogConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRealtimeLogConfigsRequest, ListRealtimeLogConfigsResult> asyncHandler) {
        final ListRealtimeLogConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRealtimeLogConfigsResult>() {
            @Override
            public ListRealtimeLogConfigsResult call() throws Exception {
                ListRealtimeLogConfigsResult result = null;

                try {
                    result = executeListRealtimeLogConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(ListStreamingDistributionsRequest request) {

        return listStreamingDistributionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(final ListStreamingDistributionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamingDistributionsRequest, ListStreamingDistributionsResult> asyncHandler) {
        final ListStreamingDistributionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamingDistributionsResult>() {
            @Override
            public ListStreamingDistributionsResult call() throws Exception {
                ListStreamingDistributionsResult result = null;

                try {
                    result = executeListStreamingDistributions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PublishFunctionResult> publishFunctionAsync(PublishFunctionRequest request) {

        return publishFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishFunctionResult> publishFunctionAsync(final PublishFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishFunctionRequest, PublishFunctionResult> asyncHandler) {
        final PublishFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PublishFunctionResult>() {
            @Override
            public PublishFunctionResult call() throws Exception {
                PublishFunctionResult result = null;

                try {
                    result = executePublishFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<TestFunctionResult> testFunctionAsync(TestFunctionRequest request) {

        return testFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestFunctionResult> testFunctionAsync(final TestFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestFunctionRequest, TestFunctionResult> asyncHandler) {
        final TestFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestFunctionResult>() {
            @Override
            public TestFunctionResult call() throws Exception {
                TestFunctionResult result = null;

                try {
                    result = executeTestFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateCachePolicyResult> updateCachePolicyAsync(UpdateCachePolicyRequest request) {

        return updateCachePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCachePolicyResult> updateCachePolicyAsync(final UpdateCachePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCachePolicyRequest, UpdateCachePolicyResult> asyncHandler) {
        final UpdateCachePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCachePolicyResult>() {
            @Override
            public UpdateCachePolicyResult call() throws Exception {
                UpdateCachePolicyResult result = null;

                try {
                    result = executeUpdateCachePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            UpdateCloudFrontOriginAccessIdentityRequest request) {

        return updateCloudFrontOriginAccessIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            final UpdateCloudFrontOriginAccessIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCloudFrontOriginAccessIdentityRequest, UpdateCloudFrontOriginAccessIdentityResult> asyncHandler) {
        final UpdateCloudFrontOriginAccessIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCloudFrontOriginAccessIdentityResult>() {
            @Override
            public UpdateCloudFrontOriginAccessIdentityResult call() throws Exception {
                UpdateCloudFrontOriginAccessIdentityResult result = null;

                try {
                    result = executeUpdateCloudFrontOriginAccessIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest request) {

        return updateDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(final UpdateDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDistributionRequest, UpdateDistributionResult> asyncHandler) {
        final UpdateDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDistributionResult>() {
            @Override
            public UpdateDistributionResult call() throws Exception {
                UpdateDistributionResult result = null;

                try {
                    result = executeUpdateDistribution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFieldLevelEncryptionConfigResult> updateFieldLevelEncryptionConfigAsync(
            UpdateFieldLevelEncryptionConfigRequest request) {

        return updateFieldLevelEncryptionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFieldLevelEncryptionConfigResult> updateFieldLevelEncryptionConfigAsync(
            final UpdateFieldLevelEncryptionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFieldLevelEncryptionConfigRequest, UpdateFieldLevelEncryptionConfigResult> asyncHandler) {
        final UpdateFieldLevelEncryptionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFieldLevelEncryptionConfigResult>() {
            @Override
            public UpdateFieldLevelEncryptionConfigResult call() throws Exception {
                UpdateFieldLevelEncryptionConfigResult result = null;

                try {
                    result = executeUpdateFieldLevelEncryptionConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFieldLevelEncryptionProfileResult> updateFieldLevelEncryptionProfileAsync(
            UpdateFieldLevelEncryptionProfileRequest request) {

        return updateFieldLevelEncryptionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFieldLevelEncryptionProfileResult> updateFieldLevelEncryptionProfileAsync(
            final UpdateFieldLevelEncryptionProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFieldLevelEncryptionProfileRequest, UpdateFieldLevelEncryptionProfileResult> asyncHandler) {
        final UpdateFieldLevelEncryptionProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFieldLevelEncryptionProfileResult>() {
            @Override
            public UpdateFieldLevelEncryptionProfileResult call() throws Exception {
                UpdateFieldLevelEncryptionProfileResult result = null;

                try {
                    result = executeUpdateFieldLevelEncryptionProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionResult> updateFunctionAsync(UpdateFunctionRequest request) {

        return updateFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionResult> updateFunctionAsync(final UpdateFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFunctionRequest, UpdateFunctionResult> asyncHandler) {
        final UpdateFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFunctionResult>() {
            @Override
            public UpdateFunctionResult call() throws Exception {
                UpdateFunctionResult result = null;

                try {
                    result = executeUpdateFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateKeyGroupResult> updateKeyGroupAsync(UpdateKeyGroupRequest request) {

        return updateKeyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKeyGroupResult> updateKeyGroupAsync(final UpdateKeyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKeyGroupRequest, UpdateKeyGroupResult> asyncHandler) {
        final UpdateKeyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKeyGroupResult>() {
            @Override
            public UpdateKeyGroupResult call() throws Exception {
                UpdateKeyGroupResult result = null;

                try {
                    result = executeUpdateKeyGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateOriginRequestPolicyResult> updateOriginRequestPolicyAsync(UpdateOriginRequestPolicyRequest request) {

        return updateOriginRequestPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOriginRequestPolicyResult> updateOriginRequestPolicyAsync(final UpdateOriginRequestPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOriginRequestPolicyRequest, UpdateOriginRequestPolicyResult> asyncHandler) {
        final UpdateOriginRequestPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOriginRequestPolicyResult>() {
            @Override
            public UpdateOriginRequestPolicyResult call() throws Exception {
                UpdateOriginRequestPolicyResult result = null;

                try {
                    result = executeUpdateOriginRequestPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePublicKeyResult> updatePublicKeyAsync(UpdatePublicKeyRequest request) {

        return updatePublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePublicKeyResult> updatePublicKeyAsync(final UpdatePublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePublicKeyRequest, UpdatePublicKeyResult> asyncHandler) {
        final UpdatePublicKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePublicKeyResult>() {
            @Override
            public UpdatePublicKeyResult call() throws Exception {
                UpdatePublicKeyResult result = null;

                try {
                    result = executeUpdatePublicKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRealtimeLogConfigResult> updateRealtimeLogConfigAsync(UpdateRealtimeLogConfigRequest request) {

        return updateRealtimeLogConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRealtimeLogConfigResult> updateRealtimeLogConfigAsync(final UpdateRealtimeLogConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRealtimeLogConfigRequest, UpdateRealtimeLogConfigResult> asyncHandler) {
        final UpdateRealtimeLogConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRealtimeLogConfigResult>() {
            @Override
            public UpdateRealtimeLogConfigResult call() throws Exception {
                UpdateRealtimeLogConfigResult result = null;

                try {
                    result = executeUpdateRealtimeLogConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(UpdateStreamingDistributionRequest request) {

        return updateStreamingDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(final UpdateStreamingDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStreamingDistributionRequest, UpdateStreamingDistributionResult> asyncHandler) {
        final UpdateStreamingDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStreamingDistributionResult>() {
            @Override
            public UpdateStreamingDistributionResult call() throws Exception {
                UpdateStreamingDistributionResult result = null;

                try {
                    result = executeUpdateStreamingDistribution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
