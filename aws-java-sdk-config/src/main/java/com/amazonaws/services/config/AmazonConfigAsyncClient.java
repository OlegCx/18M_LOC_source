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
package com.amazonaws.services.config;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Config Service asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Config</fullname>
 * <p>
 * AWS Config provides a way to keep track of the configurations of all the AWS resources associated with your AWS
 * account. You can use AWS Config to get the current and historical configurations of each AWS resource and also to get
 * information about the relationship between the resources. An AWS resource can be an Amazon Compute Cloud (Amazon EC2)
 * instance, an Elastic Block Store (EBS) volume, an elastic network Interface (ENI), or a security group. For a
 * complete list of resources currently supported by AWS Config, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported AWS Resources</a>.
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management Console, the AWS Command Line Interface (AWS CLI),
 * the AWS Config API, or the AWS SDKs for AWS Config. This reference guide contains documentation for the AWS Config
 * API and the AWS CLI commands that you can use to manage AWS Config. The AWS Config API uses the Signature Version 4
 * protocol for signing requests. For more information about how to sign a request with this protocol, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>. For detailed information about AWS Config features and their associated actions or commands, as well as
 * how to work with AWS Management Console, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html">What Is AWS Config</a> in the
 * <i>AWS Config Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConfigAsyncClient extends AmazonConfigClient implements AmazonConfigAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonConfigAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Config Service (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonConfigAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonConfigAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonConfigAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonConfigAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonConfigAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonConfigAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonConfigAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonConfigAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the provided AWS account
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
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonConfigAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonConfigAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonConfigAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonConfigAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonConfigAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonConfigAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonConfigAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonConfigAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonConfigAsyncClientBuilder asyncBuilder() {
        return AmazonConfigAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConfigAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config Service using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonConfigAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchGetAggregateResourceConfigResult> batchGetAggregateResourceConfigAsync(
            BatchGetAggregateResourceConfigRequest request) {

        return batchGetAggregateResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetAggregateResourceConfigResult> batchGetAggregateResourceConfigAsync(
            final BatchGetAggregateResourceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetAggregateResourceConfigRequest, BatchGetAggregateResourceConfigResult> asyncHandler) {
        final BatchGetAggregateResourceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetAggregateResourceConfigResult>() {
            @Override
            public BatchGetAggregateResourceConfigResult call() throws Exception {
                BatchGetAggregateResourceConfigResult result = null;

                try {
                    result = executeBatchGetAggregateResourceConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetResourceConfigResult> batchGetResourceConfigAsync(BatchGetResourceConfigRequest request) {

        return batchGetResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetResourceConfigResult> batchGetResourceConfigAsync(final BatchGetResourceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetResourceConfigRequest, BatchGetResourceConfigResult> asyncHandler) {
        final BatchGetResourceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetResourceConfigResult>() {
            @Override
            public BatchGetResourceConfigResult call() throws Exception {
                BatchGetResourceConfigResult result = null;

                try {
                    result = executeBatchGetResourceConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAggregationAuthorizationResult> deleteAggregationAuthorizationAsync(DeleteAggregationAuthorizationRequest request) {

        return deleteAggregationAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAggregationAuthorizationResult> deleteAggregationAuthorizationAsync(
            final DeleteAggregationAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResult> asyncHandler) {
        final DeleteAggregationAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAggregationAuthorizationResult>() {
            @Override
            public DeleteAggregationAuthorizationResult call() throws Exception {
                DeleteAggregationAuthorizationResult result = null;

                try {
                    result = executeDeleteAggregationAuthorization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigRuleResult> deleteConfigRuleAsync(DeleteConfigRuleRequest request) {

        return deleteConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigRuleResult> deleteConfigRuleAsync(final DeleteConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigRuleRequest, DeleteConfigRuleResult> asyncHandler) {
        final DeleteConfigRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigRuleResult>() {
            @Override
            public DeleteConfigRuleResult call() throws Exception {
                DeleteConfigRuleResult result = null;

                try {
                    result = executeDeleteConfigRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationAggregatorResult> deleteConfigurationAggregatorAsync(DeleteConfigurationAggregatorRequest request) {

        return deleteConfigurationAggregatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationAggregatorResult> deleteConfigurationAggregatorAsync(
            final DeleteConfigurationAggregatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResult> asyncHandler) {
        final DeleteConfigurationAggregatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationAggregatorResult>() {
            @Override
            public DeleteConfigurationAggregatorResult call() throws Exception {
                DeleteConfigurationAggregatorResult result = null;

                try {
                    result = executeDeleteConfigurationAggregator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationRecorderResult> deleteConfigurationRecorderAsync(DeleteConfigurationRecorderRequest request) {

        return deleteConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationRecorderResult> deleteConfigurationRecorderAsync(final DeleteConfigurationRecorderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationRecorderRequest, DeleteConfigurationRecorderResult> asyncHandler) {
        final DeleteConfigurationRecorderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationRecorderResult>() {
            @Override
            public DeleteConfigurationRecorderResult call() throws Exception {
                DeleteConfigurationRecorderResult result = null;

                try {
                    result = executeDeleteConfigurationRecorder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConformancePackResult> deleteConformancePackAsync(DeleteConformancePackRequest request) {

        return deleteConformancePackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConformancePackResult> deleteConformancePackAsync(final DeleteConformancePackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConformancePackRequest, DeleteConformancePackResult> asyncHandler) {
        final DeleteConformancePackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConformancePackResult>() {
            @Override
            public DeleteConformancePackResult call() throws Exception {
                DeleteConformancePackResult result = null;

                try {
                    result = executeDeleteConformancePack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryChannelResult> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest request) {

        return deleteDeliveryChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryChannelResult> deleteDeliveryChannelAsync(final DeleteDeliveryChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeliveryChannelRequest, DeleteDeliveryChannelResult> asyncHandler) {
        final DeleteDeliveryChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeliveryChannelResult>() {
            @Override
            public DeleteDeliveryChannelResult call() throws Exception {
                DeleteDeliveryChannelResult result = null;

                try {
                    result = executeDeleteDeliveryChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEvaluationResultsResult> deleteEvaluationResultsAsync(DeleteEvaluationResultsRequest request) {

        return deleteEvaluationResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEvaluationResultsResult> deleteEvaluationResultsAsync(final DeleteEvaluationResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEvaluationResultsRequest, DeleteEvaluationResultsResult> asyncHandler) {
        final DeleteEvaluationResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEvaluationResultsResult>() {
            @Override
            public DeleteEvaluationResultsResult call() throws Exception {
                DeleteEvaluationResultsResult result = null;

                try {
                    result = executeDeleteEvaluationResults(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOrganizationConfigRuleResult> deleteOrganizationConfigRuleAsync(DeleteOrganizationConfigRuleRequest request) {

        return deleteOrganizationConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOrganizationConfigRuleResult> deleteOrganizationConfigRuleAsync(final DeleteOrganizationConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOrganizationConfigRuleRequest, DeleteOrganizationConfigRuleResult> asyncHandler) {
        final DeleteOrganizationConfigRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOrganizationConfigRuleResult>() {
            @Override
            public DeleteOrganizationConfigRuleResult call() throws Exception {
                DeleteOrganizationConfigRuleResult result = null;

                try {
                    result = executeDeleteOrganizationConfigRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOrganizationConformancePackResult> deleteOrganizationConformancePackAsync(
            DeleteOrganizationConformancePackRequest request) {

        return deleteOrganizationConformancePackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOrganizationConformancePackResult> deleteOrganizationConformancePackAsync(
            final DeleteOrganizationConformancePackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOrganizationConformancePackRequest, DeleteOrganizationConformancePackResult> asyncHandler) {
        final DeleteOrganizationConformancePackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOrganizationConformancePackResult>() {
            @Override
            public DeleteOrganizationConformancePackResult call() throws Exception {
                DeleteOrganizationConformancePackResult result = null;

                try {
                    result = executeDeleteOrganizationConformancePack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePendingAggregationRequestResult> deletePendingAggregationRequestAsync(
            DeletePendingAggregationRequestRequest request) {

        return deletePendingAggregationRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePendingAggregationRequestResult> deletePendingAggregationRequestAsync(
            final DeletePendingAggregationRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResult> asyncHandler) {
        final DeletePendingAggregationRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePendingAggregationRequestResult>() {
            @Override
            public DeletePendingAggregationRequestResult call() throws Exception {
                DeletePendingAggregationRequestResult result = null;

                try {
                    result = executeDeletePendingAggregationRequest(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRemediationConfigurationResult> deleteRemediationConfigurationAsync(DeleteRemediationConfigurationRequest request) {

        return deleteRemediationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRemediationConfigurationResult> deleteRemediationConfigurationAsync(
            final DeleteRemediationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRemediationConfigurationRequest, DeleteRemediationConfigurationResult> asyncHandler) {
        final DeleteRemediationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRemediationConfigurationResult>() {
            @Override
            public DeleteRemediationConfigurationResult call() throws Exception {
                DeleteRemediationConfigurationResult result = null;

                try {
                    result = executeDeleteRemediationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRemediationExceptionsResult> deleteRemediationExceptionsAsync(DeleteRemediationExceptionsRequest request) {

        return deleteRemediationExceptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRemediationExceptionsResult> deleteRemediationExceptionsAsync(final DeleteRemediationExceptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRemediationExceptionsRequest, DeleteRemediationExceptionsResult> asyncHandler) {
        final DeleteRemediationExceptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRemediationExceptionsResult>() {
            @Override
            public DeleteRemediationExceptionsResult call() throws Exception {
                DeleteRemediationExceptionsResult result = null;

                try {
                    result = executeDeleteRemediationExceptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceConfigResult> deleteResourceConfigAsync(DeleteResourceConfigRequest request) {

        return deleteResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceConfigResult> deleteResourceConfigAsync(final DeleteResourceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceConfigRequest, DeleteResourceConfigResult> asyncHandler) {
        final DeleteResourceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceConfigResult>() {
            @Override
            public DeleteResourceConfigResult call() throws Exception {
                DeleteResourceConfigResult result = null;

                try {
                    result = executeDeleteResourceConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionConfigurationResult> deleteRetentionConfigurationAsync(DeleteRetentionConfigurationRequest request) {

        return deleteRetentionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionConfigurationResult> deleteRetentionConfigurationAsync(final DeleteRetentionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRetentionConfigurationRequest, DeleteRetentionConfigurationResult> asyncHandler) {
        final DeleteRetentionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRetentionConfigurationResult>() {
            @Override
            public DeleteRetentionConfigurationResult call() throws Exception {
                DeleteRetentionConfigurationResult result = null;

                try {
                    result = executeDeleteRetentionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStoredQueryResult> deleteStoredQueryAsync(DeleteStoredQueryRequest request) {

        return deleteStoredQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStoredQueryResult> deleteStoredQueryAsync(final DeleteStoredQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStoredQueryRequest, DeleteStoredQueryResult> asyncHandler) {
        final DeleteStoredQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStoredQueryResult>() {
            @Override
            public DeleteStoredQueryResult call() throws Exception {
                DeleteStoredQueryResult result = null;

                try {
                    result = executeDeleteStoredQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest request) {

        return deliverConfigSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(final DeliverConfigSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeliverConfigSnapshotRequest, DeliverConfigSnapshotResult> asyncHandler) {
        final DeliverConfigSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeliverConfigSnapshotResult>() {
            @Override
            public DeliverConfigSnapshotResult call() throws Exception {
                DeliverConfigSnapshotResult result = null;

                try {
                    result = executeDeliverConfigSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateComplianceByConfigRulesResult> describeAggregateComplianceByConfigRulesAsync(
            DescribeAggregateComplianceByConfigRulesRequest request) {

        return describeAggregateComplianceByConfigRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateComplianceByConfigRulesResult> describeAggregateComplianceByConfigRulesAsync(
            final DescribeAggregateComplianceByConfigRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAggregateComplianceByConfigRulesRequest, DescribeAggregateComplianceByConfigRulesResult> asyncHandler) {
        final DescribeAggregateComplianceByConfigRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAggregateComplianceByConfigRulesResult>() {
            @Override
            public DescribeAggregateComplianceByConfigRulesResult call() throws Exception {
                DescribeAggregateComplianceByConfigRulesResult result = null;

                try {
                    result = executeDescribeAggregateComplianceByConfigRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateComplianceByConformancePacksResult> describeAggregateComplianceByConformancePacksAsync(
            DescribeAggregateComplianceByConformancePacksRequest request) {

        return describeAggregateComplianceByConformancePacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateComplianceByConformancePacksResult> describeAggregateComplianceByConformancePacksAsync(
            final DescribeAggregateComplianceByConformancePacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAggregateComplianceByConformancePacksRequest, DescribeAggregateComplianceByConformancePacksResult> asyncHandler) {
        final DescribeAggregateComplianceByConformancePacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAggregateComplianceByConformancePacksResult>() {
            @Override
            public DescribeAggregateComplianceByConformancePacksResult call() throws Exception {
                DescribeAggregateComplianceByConformancePacksResult result = null;

                try {
                    result = executeDescribeAggregateComplianceByConformancePacks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregationAuthorizationsResult> describeAggregationAuthorizationsAsync(
            DescribeAggregationAuthorizationsRequest request) {

        return describeAggregationAuthorizationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregationAuthorizationsResult> describeAggregationAuthorizationsAsync(
            final DescribeAggregationAuthorizationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAggregationAuthorizationsRequest, DescribeAggregationAuthorizationsResult> asyncHandler) {
        final DescribeAggregationAuthorizationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAggregationAuthorizationsResult>() {
            @Override
            public DescribeAggregationAuthorizationsResult call() throws Exception {
                DescribeAggregationAuthorizationsResult result = null;

                try {
                    result = executeDescribeAggregationAuthorizations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest request) {

        return describeComplianceByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            final DescribeComplianceByConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler) {
        final DescribeComplianceByConfigRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeComplianceByConfigRuleResult>() {
            @Override
            public DescribeComplianceByConfigRuleResult call() throws Exception {
                DescribeComplianceByConfigRuleResult result = null;

                try {
                    result = executeDescribeComplianceByConfigRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync() {

        return describeComplianceByConfigRuleAsync(new DescribeComplianceByConfigRuleRequest());
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation with an AsyncHandler.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler) {

        return describeComplianceByConfigRuleAsync(new DescribeComplianceByConfigRuleRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(DescribeComplianceByResourceRequest request) {

        return describeComplianceByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(final DescribeComplianceByResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler) {
        final DescribeComplianceByResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeComplianceByResourceResult>() {
            @Override
            public DescribeComplianceByResourceResult call() throws Exception {
                DescribeComplianceByResourceResult result = null;

                try {
                    result = executeDescribeComplianceByResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeComplianceByResource operation.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync() {

        return describeComplianceByResourceAsync(new DescribeComplianceByResourceRequest());
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByResource operation with an AsyncHandler.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler) {

        return describeComplianceByResourceAsync(new DescribeComplianceByResourceRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest request) {

        return describeConfigRuleEvaluationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            final DescribeConfigRuleEvaluationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler) {
        final DescribeConfigRuleEvaluationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigRuleEvaluationStatusResult>() {
            @Override
            public DescribeConfigRuleEvaluationStatusResult call() throws Exception {
                DescribeConfigRuleEvaluationStatusResult result = null;

                try {
                    result = executeDescribeConfigRuleEvaluationStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync() {

        return describeConfigRuleEvaluationStatusAsync(new DescribeConfigRuleEvaluationStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation with an AsyncHandler.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler) {

        return describeConfigRuleEvaluationStatusAsync(new DescribeConfigRuleEvaluationStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest request) {

        return describeConfigRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(final DescribeConfigRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler) {
        final DescribeConfigRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigRulesResult>() {
            @Override
            public DescribeConfigRulesResult call() throws Exception {
                DescribeConfigRulesResult result = null;

                try {
                    result = executeDescribeConfigRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeConfigRules operation.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync() {

        return describeConfigRulesAsync(new DescribeConfigRulesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigRules operation with an AsyncHandler.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler) {

        return describeConfigRulesAsync(new DescribeConfigRulesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationAggregatorSourcesStatusResult> describeConfigurationAggregatorSourcesStatusAsync(
            DescribeConfigurationAggregatorSourcesStatusRequest request) {

        return describeConfigurationAggregatorSourcesStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationAggregatorSourcesStatusResult> describeConfigurationAggregatorSourcesStatusAsync(
            final DescribeConfigurationAggregatorSourcesStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationAggregatorSourcesStatusRequest, DescribeConfigurationAggregatorSourcesStatusResult> asyncHandler) {
        final DescribeConfigurationAggregatorSourcesStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationAggregatorSourcesStatusResult>() {
            @Override
            public DescribeConfigurationAggregatorSourcesStatusResult call() throws Exception {
                DescribeConfigurationAggregatorSourcesStatusResult result = null;

                try {
                    result = executeDescribeConfigurationAggregatorSourcesStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationAggregatorsResult> describeConfigurationAggregatorsAsync(
            DescribeConfigurationAggregatorsRequest request) {

        return describeConfigurationAggregatorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationAggregatorsResult> describeConfigurationAggregatorsAsync(
            final DescribeConfigurationAggregatorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationAggregatorsRequest, DescribeConfigurationAggregatorsResult> asyncHandler) {
        final DescribeConfigurationAggregatorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationAggregatorsResult>() {
            @Override
            public DescribeConfigurationAggregatorsResult call() throws Exception {
                DescribeConfigurationAggregatorsResult result = null;

                try {
                    result = executeDescribeConfigurationAggregators(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest request) {

        return describeConfigurationRecorderStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            final DescribeConfigurationRecorderStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler) {
        final DescribeConfigurationRecorderStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationRecorderStatusResult>() {
            @Override
            public DescribeConfigurationRecorderStatusResult call() throws Exception {
                DescribeConfigurationRecorderStatusResult result = null;

                try {
                    result = executeDescribeConfigurationRecorderStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync() {

        return describeConfigurationRecorderStatusAsync(new DescribeConfigurationRecorderStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler) {

        return describeConfigurationRecorderStatusAsync(new DescribeConfigurationRecorderStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest request) {

        return describeConfigurationRecordersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            final DescribeConfigurationRecordersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler) {
        final DescribeConfigurationRecordersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationRecordersResult>() {
            @Override
            public DescribeConfigurationRecordersResult call() throws Exception {
                DescribeConfigurationRecordersResult result = null;

                try {
                    result = executeDescribeConfigurationRecorders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeConfigurationRecorders operation.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync() {

        return describeConfigurationRecordersAsync(new DescribeConfigurationRecordersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler) {

        return describeConfigurationRecordersAsync(new DescribeConfigurationRecordersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConformancePackComplianceResult> describeConformancePackComplianceAsync(
            DescribeConformancePackComplianceRequest request) {

        return describeConformancePackComplianceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConformancePackComplianceResult> describeConformancePackComplianceAsync(
            final DescribeConformancePackComplianceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConformancePackComplianceRequest, DescribeConformancePackComplianceResult> asyncHandler) {
        final DescribeConformancePackComplianceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConformancePackComplianceResult>() {
            @Override
            public DescribeConformancePackComplianceResult call() throws Exception {
                DescribeConformancePackComplianceResult result = null;

                try {
                    result = executeDescribeConformancePackCompliance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConformancePackStatusResult> describeConformancePackStatusAsync(DescribeConformancePackStatusRequest request) {

        return describeConformancePackStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConformancePackStatusResult> describeConformancePackStatusAsync(
            final DescribeConformancePackStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConformancePackStatusRequest, DescribeConformancePackStatusResult> asyncHandler) {
        final DescribeConformancePackStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConformancePackStatusResult>() {
            @Override
            public DescribeConformancePackStatusResult call() throws Exception {
                DescribeConformancePackStatusResult result = null;

                try {
                    result = executeDescribeConformancePackStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConformancePacksResult> describeConformancePacksAsync(DescribeConformancePacksRequest request) {

        return describeConformancePacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConformancePacksResult> describeConformancePacksAsync(final DescribeConformancePacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConformancePacksRequest, DescribeConformancePacksResult> asyncHandler) {
        final DescribeConformancePacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConformancePacksResult>() {
            @Override
            public DescribeConformancePacksResult call() throws Exception {
                DescribeConformancePacksResult result = null;

                try {
                    result = executeDescribeConformancePacks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest request) {

        return describeDeliveryChannelStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            final DescribeDeliveryChannelStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler) {
        final DescribeDeliveryChannelStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeliveryChannelStatusResult>() {
            @Override
            public DescribeDeliveryChannelStatusResult call() throws Exception {
                DescribeDeliveryChannelStatusResult result = null;

                try {
                    result = executeDescribeDeliveryChannelStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync() {

        return describeDeliveryChannelStatusAsync(new DescribeDeliveryChannelStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler) {

        return describeDeliveryChannelStatusAsync(new DescribeDeliveryChannelStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest request) {

        return describeDeliveryChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(final DescribeDeliveryChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler) {
        final DescribeDeliveryChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeliveryChannelsResult>() {
            @Override
            public DescribeDeliveryChannelsResult call() throws Exception {
                DescribeDeliveryChannelsResult result = null;

                try {
                    result = executeDescribeDeliveryChannels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeDeliveryChannels operation.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync() {

        return describeDeliveryChannelsAsync(new DescribeDeliveryChannelsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler) {

        return describeDeliveryChannelsAsync(new DescribeDeliveryChannelsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigRuleStatusesResult> describeOrganizationConfigRuleStatusesAsync(
            DescribeOrganizationConfigRuleStatusesRequest request) {

        return describeOrganizationConfigRuleStatusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigRuleStatusesResult> describeOrganizationConfigRuleStatusesAsync(
            final DescribeOrganizationConfigRuleStatusesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigRuleStatusesRequest, DescribeOrganizationConfigRuleStatusesResult> asyncHandler) {
        final DescribeOrganizationConfigRuleStatusesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationConfigRuleStatusesResult>() {
            @Override
            public DescribeOrganizationConfigRuleStatusesResult call() throws Exception {
                DescribeOrganizationConfigRuleStatusesResult result = null;

                try {
                    result = executeDescribeOrganizationConfigRuleStatuses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigRulesResult> describeOrganizationConfigRulesAsync(
            DescribeOrganizationConfigRulesRequest request) {

        return describeOrganizationConfigRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigRulesResult> describeOrganizationConfigRulesAsync(
            final DescribeOrganizationConfigRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigRulesRequest, DescribeOrganizationConfigRulesResult> asyncHandler) {
        final DescribeOrganizationConfigRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationConfigRulesResult>() {
            @Override
            public DescribeOrganizationConfigRulesResult call() throws Exception {
                DescribeOrganizationConfigRulesResult result = null;

                try {
                    result = executeDescribeOrganizationConfigRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConformancePackStatusesResult> describeOrganizationConformancePackStatusesAsync(
            DescribeOrganizationConformancePackStatusesRequest request) {

        return describeOrganizationConformancePackStatusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConformancePackStatusesResult> describeOrganizationConformancePackStatusesAsync(
            final DescribeOrganizationConformancePackStatusesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConformancePackStatusesRequest, DescribeOrganizationConformancePackStatusesResult> asyncHandler) {
        final DescribeOrganizationConformancePackStatusesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationConformancePackStatusesResult>() {
            @Override
            public DescribeOrganizationConformancePackStatusesResult call() throws Exception {
                DescribeOrganizationConformancePackStatusesResult result = null;

                try {
                    result = executeDescribeOrganizationConformancePackStatuses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConformancePacksResult> describeOrganizationConformancePacksAsync(
            DescribeOrganizationConformancePacksRequest request) {

        return describeOrganizationConformancePacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConformancePacksResult> describeOrganizationConformancePacksAsync(
            final DescribeOrganizationConformancePacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConformancePacksRequest, DescribeOrganizationConformancePacksResult> asyncHandler) {
        final DescribeOrganizationConformancePacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationConformancePacksResult>() {
            @Override
            public DescribeOrganizationConformancePacksResult call() throws Exception {
                DescribeOrganizationConformancePacksResult result = null;

                try {
                    result = executeDescribeOrganizationConformancePacks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePendingAggregationRequestsResult> describePendingAggregationRequestsAsync(
            DescribePendingAggregationRequestsRequest request) {

        return describePendingAggregationRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePendingAggregationRequestsResult> describePendingAggregationRequestsAsync(
            final DescribePendingAggregationRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePendingAggregationRequestsRequest, DescribePendingAggregationRequestsResult> asyncHandler) {
        final DescribePendingAggregationRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePendingAggregationRequestsResult>() {
            @Override
            public DescribePendingAggregationRequestsResult call() throws Exception {
                DescribePendingAggregationRequestsResult result = null;

                try {
                    result = executeDescribePendingAggregationRequests(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationConfigurationsResult> describeRemediationConfigurationsAsync(
            DescribeRemediationConfigurationsRequest request) {

        return describeRemediationConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationConfigurationsResult> describeRemediationConfigurationsAsync(
            final DescribeRemediationConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRemediationConfigurationsRequest, DescribeRemediationConfigurationsResult> asyncHandler) {
        final DescribeRemediationConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRemediationConfigurationsResult>() {
            @Override
            public DescribeRemediationConfigurationsResult call() throws Exception {
                DescribeRemediationConfigurationsResult result = null;

                try {
                    result = executeDescribeRemediationConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationExceptionsResult> describeRemediationExceptionsAsync(DescribeRemediationExceptionsRequest request) {

        return describeRemediationExceptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationExceptionsResult> describeRemediationExceptionsAsync(
            final DescribeRemediationExceptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRemediationExceptionsRequest, DescribeRemediationExceptionsResult> asyncHandler) {
        final DescribeRemediationExceptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRemediationExceptionsResult>() {
            @Override
            public DescribeRemediationExceptionsResult call() throws Exception {
                DescribeRemediationExceptionsResult result = null;

                try {
                    result = executeDescribeRemediationExceptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationExecutionStatusResult> describeRemediationExecutionStatusAsync(
            DescribeRemediationExecutionStatusRequest request) {

        return describeRemediationExecutionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationExecutionStatusResult> describeRemediationExecutionStatusAsync(
            final DescribeRemediationExecutionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRemediationExecutionStatusRequest, DescribeRemediationExecutionStatusResult> asyncHandler) {
        final DescribeRemediationExecutionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRemediationExecutionStatusResult>() {
            @Override
            public DescribeRemediationExecutionStatusResult call() throws Exception {
                DescribeRemediationExecutionStatusResult result = null;

                try {
                    result = executeDescribeRemediationExecutionStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRetentionConfigurationsResult> describeRetentionConfigurationsAsync(
            DescribeRetentionConfigurationsRequest request) {

        return describeRetentionConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRetentionConfigurationsResult> describeRetentionConfigurationsAsync(
            final DescribeRetentionConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRetentionConfigurationsRequest, DescribeRetentionConfigurationsResult> asyncHandler) {
        final DescribeRetentionConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRetentionConfigurationsResult>() {
            @Override
            public DescribeRetentionConfigurationsResult call() throws Exception {
                DescribeRetentionConfigurationsResult result = null;

                try {
                    result = executeDescribeRetentionConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAggregateComplianceDetailsByConfigRuleResult> getAggregateComplianceDetailsByConfigRuleAsync(
            GetAggregateComplianceDetailsByConfigRuleRequest request) {

        return getAggregateComplianceDetailsByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateComplianceDetailsByConfigRuleResult> getAggregateComplianceDetailsByConfigRuleAsync(
            final GetAggregateComplianceDetailsByConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAggregateComplianceDetailsByConfigRuleRequest, GetAggregateComplianceDetailsByConfigRuleResult> asyncHandler) {
        final GetAggregateComplianceDetailsByConfigRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAggregateComplianceDetailsByConfigRuleResult>() {
            @Override
            public GetAggregateComplianceDetailsByConfigRuleResult call() throws Exception {
                GetAggregateComplianceDetailsByConfigRuleResult result = null;

                try {
                    result = executeGetAggregateComplianceDetailsByConfigRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAggregateConfigRuleComplianceSummaryResult> getAggregateConfigRuleComplianceSummaryAsync(
            GetAggregateConfigRuleComplianceSummaryRequest request) {

        return getAggregateConfigRuleComplianceSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateConfigRuleComplianceSummaryResult> getAggregateConfigRuleComplianceSummaryAsync(
            final GetAggregateConfigRuleComplianceSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAggregateConfigRuleComplianceSummaryRequest, GetAggregateConfigRuleComplianceSummaryResult> asyncHandler) {
        final GetAggregateConfigRuleComplianceSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAggregateConfigRuleComplianceSummaryResult>() {
            @Override
            public GetAggregateConfigRuleComplianceSummaryResult call() throws Exception {
                GetAggregateConfigRuleComplianceSummaryResult result = null;

                try {
                    result = executeGetAggregateConfigRuleComplianceSummary(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAggregateConformancePackComplianceSummaryResult> getAggregateConformancePackComplianceSummaryAsync(
            GetAggregateConformancePackComplianceSummaryRequest request) {

        return getAggregateConformancePackComplianceSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateConformancePackComplianceSummaryResult> getAggregateConformancePackComplianceSummaryAsync(
            final GetAggregateConformancePackComplianceSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAggregateConformancePackComplianceSummaryRequest, GetAggregateConformancePackComplianceSummaryResult> asyncHandler) {
        final GetAggregateConformancePackComplianceSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAggregateConformancePackComplianceSummaryResult>() {
            @Override
            public GetAggregateConformancePackComplianceSummaryResult call() throws Exception {
                GetAggregateConformancePackComplianceSummaryResult result = null;

                try {
                    result = executeGetAggregateConformancePackComplianceSummary(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAggregateDiscoveredResourceCountsResult> getAggregateDiscoveredResourceCountsAsync(
            GetAggregateDiscoveredResourceCountsRequest request) {

        return getAggregateDiscoveredResourceCountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateDiscoveredResourceCountsResult> getAggregateDiscoveredResourceCountsAsync(
            final GetAggregateDiscoveredResourceCountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAggregateDiscoveredResourceCountsRequest, GetAggregateDiscoveredResourceCountsResult> asyncHandler) {
        final GetAggregateDiscoveredResourceCountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAggregateDiscoveredResourceCountsResult>() {
            @Override
            public GetAggregateDiscoveredResourceCountsResult call() throws Exception {
                GetAggregateDiscoveredResourceCountsResult result = null;

                try {
                    result = executeGetAggregateDiscoveredResourceCounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAggregateResourceConfigResult> getAggregateResourceConfigAsync(GetAggregateResourceConfigRequest request) {

        return getAggregateResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateResourceConfigResult> getAggregateResourceConfigAsync(final GetAggregateResourceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAggregateResourceConfigRequest, GetAggregateResourceConfigResult> asyncHandler) {
        final GetAggregateResourceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAggregateResourceConfigResult>() {
            @Override
            public GetAggregateResourceConfigResult call() throws Exception {
                GetAggregateResourceConfigResult result = null;

                try {
                    result = executeGetAggregateResourceConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest request) {

        return getComplianceDetailsByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            final GetComplianceDetailsByConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByConfigRuleRequest, GetComplianceDetailsByConfigRuleResult> asyncHandler) {
        final GetComplianceDetailsByConfigRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComplianceDetailsByConfigRuleResult>() {
            @Override
            public GetComplianceDetailsByConfigRuleResult call() throws Exception {
                GetComplianceDetailsByConfigRuleResult result = null;

                try {
                    result = executeGetComplianceDetailsByConfigRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(GetComplianceDetailsByResourceRequest request) {

        return getComplianceDetailsByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            final GetComplianceDetailsByResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByResourceRequest, GetComplianceDetailsByResourceResult> asyncHandler) {
        final GetComplianceDetailsByResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComplianceDetailsByResourceResult>() {
            @Override
            public GetComplianceDetailsByResourceResult call() throws Exception {
                GetComplianceDetailsByResourceResult result = null;

                try {
                    result = executeGetComplianceDetailsByResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest request) {

        return getComplianceSummaryByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            final GetComplianceSummaryByConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler) {
        final GetComplianceSummaryByConfigRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComplianceSummaryByConfigRuleResult>() {
            @Override
            public GetComplianceSummaryByConfigRuleResult call() throws Exception {
                GetComplianceSummaryByConfigRuleResult result = null;

                try {
                    result = executeGetComplianceSummaryByConfigRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync() {

        return getComplianceSummaryByConfigRuleAsync(new GetComplianceSummaryByConfigRuleRequest());
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler) {

        return getComplianceSummaryByConfigRuleAsync(new GetComplianceSummaryByConfigRuleRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest request) {

        return getComplianceSummaryByResourceTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            final GetComplianceSummaryByResourceTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler) {
        final GetComplianceSummaryByResourceTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComplianceSummaryByResourceTypeResult>() {
            @Override
            public GetComplianceSummaryByResourceTypeResult call() throws Exception {
                GetComplianceSummaryByResourceTypeResult result = null;

                try {
                    result = executeGetComplianceSummaryByResourceType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync() {

        return getComplianceSummaryByResourceTypeAsync(new GetComplianceSummaryByResourceTypeRequest());
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler) {

        return getComplianceSummaryByResourceTypeAsync(new GetComplianceSummaryByResourceTypeRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetConformancePackComplianceDetailsResult> getConformancePackComplianceDetailsAsync(
            GetConformancePackComplianceDetailsRequest request) {

        return getConformancePackComplianceDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConformancePackComplianceDetailsResult> getConformancePackComplianceDetailsAsync(
            final GetConformancePackComplianceDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConformancePackComplianceDetailsRequest, GetConformancePackComplianceDetailsResult> asyncHandler) {
        final GetConformancePackComplianceDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConformancePackComplianceDetailsResult>() {
            @Override
            public GetConformancePackComplianceDetailsResult call() throws Exception {
                GetConformancePackComplianceDetailsResult result = null;

                try {
                    result = executeGetConformancePackComplianceDetails(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConformancePackComplianceSummaryResult> getConformancePackComplianceSummaryAsync(
            GetConformancePackComplianceSummaryRequest request) {

        return getConformancePackComplianceSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConformancePackComplianceSummaryResult> getConformancePackComplianceSummaryAsync(
            final GetConformancePackComplianceSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConformancePackComplianceSummaryRequest, GetConformancePackComplianceSummaryResult> asyncHandler) {
        final GetConformancePackComplianceSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConformancePackComplianceSummaryResult>() {
            @Override
            public GetConformancePackComplianceSummaryResult call() throws Exception {
                GetConformancePackComplianceSummaryResult result = null;

                try {
                    result = executeGetConformancePackComplianceSummary(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveredResourceCountsResult> getDiscoveredResourceCountsAsync(GetDiscoveredResourceCountsRequest request) {

        return getDiscoveredResourceCountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveredResourceCountsResult> getDiscoveredResourceCountsAsync(final GetDiscoveredResourceCountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDiscoveredResourceCountsRequest, GetDiscoveredResourceCountsResult> asyncHandler) {
        final GetDiscoveredResourceCountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDiscoveredResourceCountsResult>() {
            @Override
            public GetDiscoveredResourceCountsResult call() throws Exception {
                GetDiscoveredResourceCountsResult result = null;

                try {
                    result = executeGetDiscoveredResourceCounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationConfigRuleDetailedStatusResult> getOrganizationConfigRuleDetailedStatusAsync(
            GetOrganizationConfigRuleDetailedStatusRequest request) {

        return getOrganizationConfigRuleDetailedStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationConfigRuleDetailedStatusResult> getOrganizationConfigRuleDetailedStatusAsync(
            final GetOrganizationConfigRuleDetailedStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOrganizationConfigRuleDetailedStatusRequest, GetOrganizationConfigRuleDetailedStatusResult> asyncHandler) {
        final GetOrganizationConfigRuleDetailedStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOrganizationConfigRuleDetailedStatusResult>() {
            @Override
            public GetOrganizationConfigRuleDetailedStatusResult call() throws Exception {
                GetOrganizationConfigRuleDetailedStatusResult result = null;

                try {
                    result = executeGetOrganizationConfigRuleDetailedStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationConformancePackDetailedStatusResult> getOrganizationConformancePackDetailedStatusAsync(
            GetOrganizationConformancePackDetailedStatusRequest request) {

        return getOrganizationConformancePackDetailedStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationConformancePackDetailedStatusResult> getOrganizationConformancePackDetailedStatusAsync(
            final GetOrganizationConformancePackDetailedStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOrganizationConformancePackDetailedStatusRequest, GetOrganizationConformancePackDetailedStatusResult> asyncHandler) {
        final GetOrganizationConformancePackDetailedStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOrganizationConformancePackDetailedStatusResult>() {
            @Override
            public GetOrganizationConformancePackDetailedStatusResult call() throws Exception {
                GetOrganizationConformancePackDetailedStatusResult result = null;

                try {
                    result = executeGetOrganizationConformancePackDetailedStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest request) {

        return getResourceConfigHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(final GetResourceConfigHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceConfigHistoryRequest, GetResourceConfigHistoryResult> asyncHandler) {
        final GetResourceConfigHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceConfigHistoryResult>() {
            @Override
            public GetResourceConfigHistoryResult call() throws Exception {
                GetResourceConfigHistoryResult result = null;

                try {
                    result = executeGetResourceConfigHistory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStoredQueryResult> getStoredQueryAsync(GetStoredQueryRequest request) {

        return getStoredQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStoredQueryResult> getStoredQueryAsync(final GetStoredQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStoredQueryRequest, GetStoredQueryResult> asyncHandler) {
        final GetStoredQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStoredQueryResult>() {
            @Override
            public GetStoredQueryResult call() throws Exception {
                GetStoredQueryResult result = null;

                try {
                    result = executeGetStoredQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAggregateDiscoveredResourcesResult> listAggregateDiscoveredResourcesAsync(
            ListAggregateDiscoveredResourcesRequest request) {

        return listAggregateDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAggregateDiscoveredResourcesResult> listAggregateDiscoveredResourcesAsync(
            final ListAggregateDiscoveredResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResult> asyncHandler) {
        final ListAggregateDiscoveredResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAggregateDiscoveredResourcesResult>() {
            @Override
            public ListAggregateDiscoveredResourcesResult call() throws Exception {
                ListAggregateDiscoveredResourcesResult result = null;

                try {
                    result = executeListAggregateDiscoveredResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest request) {

        return listDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(final ListDiscoveredResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler) {
        final ListDiscoveredResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDiscoveredResourcesResult>() {
            @Override
            public ListDiscoveredResourcesResult call() throws Exception {
                ListDiscoveredResourcesResult result = null;

                try {
                    result = executeListDiscoveredResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStoredQueriesResult> listStoredQueriesAsync(ListStoredQueriesRequest request) {

        return listStoredQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStoredQueriesResult> listStoredQueriesAsync(final ListStoredQueriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStoredQueriesRequest, ListStoredQueriesResult> asyncHandler) {
        final ListStoredQueriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStoredQueriesResult>() {
            @Override
            public ListStoredQueriesResult call() throws Exception {
                ListStoredQueriesResult result = null;

                try {
                    result = executeListStoredQueries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutAggregationAuthorizationResult> putAggregationAuthorizationAsync(PutAggregationAuthorizationRequest request) {

        return putAggregationAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAggregationAuthorizationResult> putAggregationAuthorizationAsync(final PutAggregationAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAggregationAuthorizationRequest, PutAggregationAuthorizationResult> asyncHandler) {
        final PutAggregationAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAggregationAuthorizationResult>() {
            @Override
            public PutAggregationAuthorizationResult call() throws Exception {
                PutAggregationAuthorizationResult result = null;

                try {
                    result = executePutAggregationAuthorization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutConfigRuleResult> putConfigRuleAsync(PutConfigRuleRequest request) {

        return putConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigRuleResult> putConfigRuleAsync(final PutConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigRuleRequest, PutConfigRuleResult> asyncHandler) {
        final PutConfigRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigRuleResult>() {
            @Override
            public PutConfigRuleResult call() throws Exception {
                PutConfigRuleResult result = null;

                try {
                    result = executePutConfigRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationAggregatorResult> putConfigurationAggregatorAsync(PutConfigurationAggregatorRequest request) {

        return putConfigurationAggregatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationAggregatorResult> putConfigurationAggregatorAsync(final PutConfigurationAggregatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationAggregatorRequest, PutConfigurationAggregatorResult> asyncHandler) {
        final PutConfigurationAggregatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationAggregatorResult>() {
            @Override
            public PutConfigurationAggregatorResult call() throws Exception {
                PutConfigurationAggregatorResult result = null;

                try {
                    result = executePutConfigurationAggregator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationRecorderResult> putConfigurationRecorderAsync(PutConfigurationRecorderRequest request) {

        return putConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationRecorderResult> putConfigurationRecorderAsync(final PutConfigurationRecorderRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationRecorderRequest, PutConfigurationRecorderResult> asyncHandler) {
        final PutConfigurationRecorderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationRecorderResult>() {
            @Override
            public PutConfigurationRecorderResult call() throws Exception {
                PutConfigurationRecorderResult result = null;

                try {
                    result = executePutConfigurationRecorder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutConformancePackResult> putConformancePackAsync(PutConformancePackRequest request) {

        return putConformancePackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConformancePackResult> putConformancePackAsync(final PutConformancePackRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConformancePackRequest, PutConformancePackResult> asyncHandler) {
        final PutConformancePackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConformancePackResult>() {
            @Override
            public PutConformancePackResult call() throws Exception {
                PutConformancePackResult result = null;

                try {
                    result = executePutConformancePack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutDeliveryChannelResult> putDeliveryChannelAsync(PutDeliveryChannelRequest request) {

        return putDeliveryChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDeliveryChannelResult> putDeliveryChannelAsync(final PutDeliveryChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDeliveryChannelRequest, PutDeliveryChannelResult> asyncHandler) {
        final PutDeliveryChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDeliveryChannelResult>() {
            @Override
            public PutDeliveryChannelResult call() throws Exception {
                PutDeliveryChannelResult result = null;

                try {
                    result = executePutDeliveryChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest request) {

        return putEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(final PutEvaluationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEvaluationsRequest, PutEvaluationsResult> asyncHandler) {
        final PutEvaluationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEvaluationsResult>() {
            @Override
            public PutEvaluationsResult call() throws Exception {
                PutEvaluationsResult result = null;

                try {
                    result = executePutEvaluations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutExternalEvaluationResult> putExternalEvaluationAsync(PutExternalEvaluationRequest request) {

        return putExternalEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutExternalEvaluationResult> putExternalEvaluationAsync(final PutExternalEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutExternalEvaluationRequest, PutExternalEvaluationResult> asyncHandler) {
        final PutExternalEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutExternalEvaluationResult>() {
            @Override
            public PutExternalEvaluationResult call() throws Exception {
                PutExternalEvaluationResult result = null;

                try {
                    result = executePutExternalEvaluation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutOrganizationConfigRuleResult> putOrganizationConfigRuleAsync(PutOrganizationConfigRuleRequest request) {

        return putOrganizationConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutOrganizationConfigRuleResult> putOrganizationConfigRuleAsync(final PutOrganizationConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutOrganizationConfigRuleRequest, PutOrganizationConfigRuleResult> asyncHandler) {
        final PutOrganizationConfigRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutOrganizationConfigRuleResult>() {
            @Override
            public PutOrganizationConfigRuleResult call() throws Exception {
                PutOrganizationConfigRuleResult result = null;

                try {
                    result = executePutOrganizationConfigRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutOrganizationConformancePackResult> putOrganizationConformancePackAsync(PutOrganizationConformancePackRequest request) {

        return putOrganizationConformancePackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutOrganizationConformancePackResult> putOrganizationConformancePackAsync(
            final PutOrganizationConformancePackRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutOrganizationConformancePackRequest, PutOrganizationConformancePackResult> asyncHandler) {
        final PutOrganizationConformancePackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutOrganizationConformancePackResult>() {
            @Override
            public PutOrganizationConformancePackResult call() throws Exception {
                PutOrganizationConformancePackResult result = null;

                try {
                    result = executePutOrganizationConformancePack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRemediationConfigurationsResult> putRemediationConfigurationsAsync(PutRemediationConfigurationsRequest request) {

        return putRemediationConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRemediationConfigurationsResult> putRemediationConfigurationsAsync(final PutRemediationConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRemediationConfigurationsRequest, PutRemediationConfigurationsResult> asyncHandler) {
        final PutRemediationConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRemediationConfigurationsResult>() {
            @Override
            public PutRemediationConfigurationsResult call() throws Exception {
                PutRemediationConfigurationsResult result = null;

                try {
                    result = executePutRemediationConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRemediationExceptionsResult> putRemediationExceptionsAsync(PutRemediationExceptionsRequest request) {

        return putRemediationExceptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRemediationExceptionsResult> putRemediationExceptionsAsync(final PutRemediationExceptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRemediationExceptionsRequest, PutRemediationExceptionsResult> asyncHandler) {
        final PutRemediationExceptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRemediationExceptionsResult>() {
            @Override
            public PutRemediationExceptionsResult call() throws Exception {
                PutRemediationExceptionsResult result = null;

                try {
                    result = executePutRemediationExceptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutResourceConfigResult> putResourceConfigAsync(PutResourceConfigRequest request) {

        return putResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourceConfigResult> putResourceConfigAsync(final PutResourceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourceConfigRequest, PutResourceConfigResult> asyncHandler) {
        final PutResourceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourceConfigResult>() {
            @Override
            public PutResourceConfigResult call() throws Exception {
                PutResourceConfigResult result = null;

                try {
                    result = executePutResourceConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRetentionConfigurationResult> putRetentionConfigurationAsync(PutRetentionConfigurationRequest request) {

        return putRetentionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRetentionConfigurationResult> putRetentionConfigurationAsync(final PutRetentionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRetentionConfigurationRequest, PutRetentionConfigurationResult> asyncHandler) {
        final PutRetentionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRetentionConfigurationResult>() {
            @Override
            public PutRetentionConfigurationResult call() throws Exception {
                PutRetentionConfigurationResult result = null;

                try {
                    result = executePutRetentionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutStoredQueryResult> putStoredQueryAsync(PutStoredQueryRequest request) {

        return putStoredQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutStoredQueryResult> putStoredQueryAsync(final PutStoredQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutStoredQueryRequest, PutStoredQueryResult> asyncHandler) {
        final PutStoredQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutStoredQueryResult>() {
            @Override
            public PutStoredQueryResult call() throws Exception {
                PutStoredQueryResult result = null;

                try {
                    result = executePutStoredQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SelectAggregateResourceConfigResult> selectAggregateResourceConfigAsync(SelectAggregateResourceConfigRequest request) {

        return selectAggregateResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SelectAggregateResourceConfigResult> selectAggregateResourceConfigAsync(
            final SelectAggregateResourceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<SelectAggregateResourceConfigRequest, SelectAggregateResourceConfigResult> asyncHandler) {
        final SelectAggregateResourceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SelectAggregateResourceConfigResult>() {
            @Override
            public SelectAggregateResourceConfigResult call() throws Exception {
                SelectAggregateResourceConfigResult result = null;

                try {
                    result = executeSelectAggregateResourceConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SelectResourceConfigResult> selectResourceConfigAsync(SelectResourceConfigRequest request) {

        return selectResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SelectResourceConfigResult> selectResourceConfigAsync(final SelectResourceConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<SelectResourceConfigRequest, SelectResourceConfigResult> asyncHandler) {
        final SelectResourceConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SelectResourceConfigResult>() {
            @Override
            public SelectResourceConfigResult call() throws Exception {
                SelectResourceConfigResult result = null;

                try {
                    result = executeSelectResourceConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartConfigRulesEvaluationResult> startConfigRulesEvaluationAsync(StartConfigRulesEvaluationRequest request) {

        return startConfigRulesEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartConfigRulesEvaluationResult> startConfigRulesEvaluationAsync(final StartConfigRulesEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartConfigRulesEvaluationRequest, StartConfigRulesEvaluationResult> asyncHandler) {
        final StartConfigRulesEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartConfigRulesEvaluationResult>() {
            @Override
            public StartConfigRulesEvaluationResult call() throws Exception {
                StartConfigRulesEvaluationResult result = null;

                try {
                    result = executeStartConfigRulesEvaluation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationRecorderResult> startConfigurationRecorderAsync(StartConfigurationRecorderRequest request) {

        return startConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationRecorderResult> startConfigurationRecorderAsync(final StartConfigurationRecorderRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartConfigurationRecorderRequest, StartConfigurationRecorderResult> asyncHandler) {
        final StartConfigurationRecorderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartConfigurationRecorderResult>() {
            @Override
            public StartConfigurationRecorderResult call() throws Exception {
                StartConfigurationRecorderResult result = null;

                try {
                    result = executeStartConfigurationRecorder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartRemediationExecutionResult> startRemediationExecutionAsync(StartRemediationExecutionRequest request) {

        return startRemediationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRemediationExecutionResult> startRemediationExecutionAsync(final StartRemediationExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRemediationExecutionRequest, StartRemediationExecutionResult> asyncHandler) {
        final StartRemediationExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRemediationExecutionResult>() {
            @Override
            public StartRemediationExecutionResult call() throws Exception {
                StartRemediationExecutionResult result = null;

                try {
                    result = executeStartRemediationExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopConfigurationRecorderResult> stopConfigurationRecorderAsync(StopConfigurationRecorderRequest request) {

        return stopConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopConfigurationRecorderResult> stopConfigurationRecorderAsync(final StopConfigurationRecorderRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopConfigurationRecorderRequest, StopConfigurationRecorderResult> asyncHandler) {
        final StopConfigurationRecorderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopConfigurationRecorderResult>() {
            @Override
            public StopConfigurationRecorderResult call() throws Exception {
                StopConfigurationRecorderResult result = null;

                try {
                    result = executeStopConfigurationRecorder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
