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
package com.amazonaws.services.cloudwatchevents;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon CloudWatch Events asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EventBridge helps you to respond to state changes in your AWS resources. When your resources change state,
 * they automatically send events into an event stream. You can create rules that match selected events in the stream
 * and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For
 * example, you can configure rules to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance
 * enters the running state.
 * </p>
 * </li>
 * <li>
 * <p>
 * Direct specific API records from AWS CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential
 * security or availability risks.
 * </p>
 * </li>
 * <li>
 * <p>
 * Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about the features of Amazon EventBridge, see the <a
 * href="https://docs.aws.amazon.com/eventbridge/latest/userguide">Amazon EventBridge User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudWatchEventsAsyncClient extends AmazonCloudWatchEventsClient implements AmazonCloudWatchEventsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Events (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the provided AWS
     * account credentials provider and client configuration options.
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
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCloudWatchEventsAsyncClientBuilder asyncBuilder() {
        return AmazonCloudWatchEventsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchEventsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonCloudWatchEventsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<ActivateEventSourceResult> activateEventSourceAsync(ActivateEventSourceRequest request) {

        return activateEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateEventSourceResult> activateEventSourceAsync(final ActivateEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateEventSourceRequest, ActivateEventSourceResult> asyncHandler) {
        final ActivateEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateEventSourceResult>() {
            @Override
            public ActivateEventSourceResult call() throws Exception {
                ActivateEventSourceResult result = null;

                try {
                    result = executeActivateEventSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CancelReplayResult> cancelReplayAsync(CancelReplayRequest request) {

        return cancelReplayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelReplayResult> cancelReplayAsync(final CancelReplayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelReplayRequest, CancelReplayResult> asyncHandler) {
        final CancelReplayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelReplayResult>() {
            @Override
            public CancelReplayResult call() throws Exception {
                CancelReplayResult result = null;

                try {
                    result = executeCancelReplay(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateApiDestinationResult> createApiDestinationAsync(CreateApiDestinationRequest request) {

        return createApiDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApiDestinationResult> createApiDestinationAsync(final CreateApiDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApiDestinationRequest, CreateApiDestinationResult> asyncHandler) {
        final CreateApiDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApiDestinationResult>() {
            @Override
            public CreateApiDestinationResult call() throws Exception {
                CreateApiDestinationResult result = null;

                try {
                    result = executeCreateApiDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateArchiveResult> createArchiveAsync(CreateArchiveRequest request) {

        return createArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateArchiveResult> createArchiveAsync(final CreateArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateArchiveRequest, CreateArchiveResult> asyncHandler) {
        final CreateArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateArchiveResult>() {
            @Override
            public CreateArchiveResult call() throws Exception {
                CreateArchiveResult result = null;

                try {
                    result = executeCreateArchive(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateEventBusResult> createEventBusAsync(CreateEventBusRequest request) {

        return createEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventBusResult> createEventBusAsync(final CreateEventBusRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventBusRequest, CreateEventBusResult> asyncHandler) {
        final CreateEventBusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventBusResult>() {
            @Override
            public CreateEventBusResult call() throws Exception {
                CreateEventBusResult result = null;

                try {
                    result = executeCreateEventBus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePartnerEventSourceResult> createPartnerEventSourceAsync(CreatePartnerEventSourceRequest request) {

        return createPartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePartnerEventSourceResult> createPartnerEventSourceAsync(final CreatePartnerEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePartnerEventSourceRequest, CreatePartnerEventSourceResult> asyncHandler) {
        final CreatePartnerEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePartnerEventSourceResult>() {
            @Override
            public CreatePartnerEventSourceResult call() throws Exception {
                CreatePartnerEventSourceResult result = null;

                try {
                    result = executeCreatePartnerEventSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeactivateEventSourceResult> deactivateEventSourceAsync(DeactivateEventSourceRequest request) {

        return deactivateEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivateEventSourceResult> deactivateEventSourceAsync(final DeactivateEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeactivateEventSourceRequest, DeactivateEventSourceResult> asyncHandler) {
        final DeactivateEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeactivateEventSourceResult>() {
            @Override
            public DeactivateEventSourceResult call() throws Exception {
                DeactivateEventSourceResult result = null;

                try {
                    result = executeDeactivateEventSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeauthorizeConnectionResult> deauthorizeConnectionAsync(DeauthorizeConnectionRequest request) {

        return deauthorizeConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeauthorizeConnectionResult> deauthorizeConnectionAsync(final DeauthorizeConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeauthorizeConnectionRequest, DeauthorizeConnectionResult> asyncHandler) {
        final DeauthorizeConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeauthorizeConnectionResult>() {
            @Override
            public DeauthorizeConnectionResult call() throws Exception {
                DeauthorizeConnectionResult result = null;

                try {
                    result = executeDeauthorizeConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApiDestinationResult> deleteApiDestinationAsync(DeleteApiDestinationRequest request) {

        return deleteApiDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiDestinationResult> deleteApiDestinationAsync(final DeleteApiDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApiDestinationRequest, DeleteApiDestinationResult> asyncHandler) {
        final DeleteApiDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApiDestinationResult>() {
            @Override
            public DeleteApiDestinationResult call() throws Exception {
                DeleteApiDestinationResult result = null;

                try {
                    result = executeDeleteApiDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest request) {

        return deleteArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(final DeleteArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteArchiveRequest, DeleteArchiveResult> asyncHandler) {
        final DeleteArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteArchiveResult>() {
            @Override
            public DeleteArchiveResult call() throws Exception {
                DeleteArchiveResult result = null;

                try {
                    result = executeDeleteArchive(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteEventBusResult> deleteEventBusAsync(DeleteEventBusRequest request) {

        return deleteEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventBusResult> deleteEventBusAsync(final DeleteEventBusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventBusRequest, DeleteEventBusResult> asyncHandler) {
        final DeleteEventBusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventBusResult>() {
            @Override
            public DeleteEventBusResult call() throws Exception {
                DeleteEventBusResult result = null;

                try {
                    result = executeDeleteEventBus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePartnerEventSourceResult> deletePartnerEventSourceAsync(DeletePartnerEventSourceRequest request) {

        return deletePartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePartnerEventSourceResult> deletePartnerEventSourceAsync(final DeletePartnerEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePartnerEventSourceRequest, DeletePartnerEventSourceResult> asyncHandler) {
        final DeletePartnerEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePartnerEventSourceResult>() {
            @Override
            public DeletePartnerEventSourceResult call() throws Exception {
                DeletePartnerEventSourceResult result = null;

                try {
                    result = executeDeletePartnerEventSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(final DeleteRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {
        final DeleteRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result = null;

                try {
                    result = executeDeleteRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeApiDestinationResult> describeApiDestinationAsync(DescribeApiDestinationRequest request) {

        return describeApiDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApiDestinationResult> describeApiDestinationAsync(final DescribeApiDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApiDestinationRequest, DescribeApiDestinationResult> asyncHandler) {
        final DescribeApiDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApiDestinationResult>() {
            @Override
            public DescribeApiDestinationResult call() throws Exception {
                DescribeApiDestinationResult result = null;

                try {
                    result = executeDescribeApiDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeArchiveResult> describeArchiveAsync(DescribeArchiveRequest request) {

        return describeArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeArchiveResult> describeArchiveAsync(final DescribeArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeArchiveRequest, DescribeArchiveResult> asyncHandler) {
        final DescribeArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeArchiveResult>() {
            @Override
            public DescribeArchiveResult call() throws Exception {
                DescribeArchiveResult result = null;

                try {
                    result = executeDescribeArchive(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionResult> describeConnectionAsync(DescribeConnectionRequest request) {

        return describeConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionResult> describeConnectionAsync(final DescribeConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectionRequest, DescribeConnectionResult> asyncHandler) {
        final DescribeConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectionResult>() {
            @Override
            public DescribeConnectionResult call() throws Exception {
                DescribeConnectionResult result = null;

                try {
                    result = executeDescribeConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(DescribeEventBusRequest request) {

        return describeEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(final DescribeEventBusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventBusRequest, DescribeEventBusResult> asyncHandler) {
        final DescribeEventBusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventBusResult>() {
            @Override
            public DescribeEventBusResult call() throws Exception {
                DescribeEventBusResult result = null;

                try {
                    result = executeDescribeEventBus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSourceResult> describeEventSourceAsync(DescribeEventSourceRequest request) {

        return describeEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSourceResult> describeEventSourceAsync(final DescribeEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventSourceRequest, DescribeEventSourceResult> asyncHandler) {
        final DescribeEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventSourceResult>() {
            @Override
            public DescribeEventSourceResult call() throws Exception {
                DescribeEventSourceResult result = null;

                try {
                    result = executeDescribeEventSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePartnerEventSourceResult> describePartnerEventSourceAsync(DescribePartnerEventSourceRequest request) {

        return describePartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePartnerEventSourceResult> describePartnerEventSourceAsync(final DescribePartnerEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePartnerEventSourceRequest, DescribePartnerEventSourceResult> asyncHandler) {
        final DescribePartnerEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePartnerEventSourceResult>() {
            @Override
            public DescribePartnerEventSourceResult call() throws Exception {
                DescribePartnerEventSourceResult result = null;

                try {
                    result = executeDescribePartnerEventSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeReplayResult> describeReplayAsync(DescribeReplayRequest request) {

        return describeReplayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplayResult> describeReplayAsync(final DescribeReplayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplayRequest, DescribeReplayResult> asyncHandler) {
        final DescribeReplayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplayResult>() {
            @Override
            public DescribeReplayResult call() throws Exception {
                DescribeReplayResult result = null;

                try {
                    result = executeDescribeReplay(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest request) {

        return describeRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(final DescribeRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler) {
        final DescribeRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuleResult>() {
            @Override
            public DescribeRuleResult call() throws Exception {
                DescribeRuleResult result = null;

                try {
                    result = executeDescribeRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest request) {

        return disableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(final DisableRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableRuleRequest, DisableRuleResult> asyncHandler) {
        final DisableRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableRuleResult>() {
            @Override
            public DisableRuleResult call() throws Exception {
                DisableRuleResult result = null;

                try {
                    result = executeDisableRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest request) {

        return enableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(final EnableRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableRuleRequest, EnableRuleResult> asyncHandler) {
        final EnableRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableRuleResult>() {
            @Override
            public EnableRuleResult call() throws Exception {
                EnableRuleResult result = null;

                try {
                    result = executeEnableRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApiDestinationsResult> listApiDestinationsAsync(ListApiDestinationsRequest request) {

        return listApiDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApiDestinationsResult> listApiDestinationsAsync(final ListApiDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApiDestinationsRequest, ListApiDestinationsResult> asyncHandler) {
        final ListApiDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApiDestinationsResult>() {
            @Override
            public ListApiDestinationsResult call() throws Exception {
                ListApiDestinationsResult result = null;

                try {
                    result = executeListApiDestinations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListArchivesResult> listArchivesAsync(ListArchivesRequest request) {

        return listArchivesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArchivesResult> listArchivesAsync(final ListArchivesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListArchivesRequest, ListArchivesResult> asyncHandler) {
        final ListArchivesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListArchivesResult>() {
            @Override
            public ListArchivesResult call() throws Exception {
                ListArchivesResult result = null;

                try {
                    result = executeListArchives(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest request) {

        return listConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(final ListConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectionsRequest, ListConnectionsResult> asyncHandler) {
        final ListConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectionsResult>() {
            @Override
            public ListConnectionsResult call() throws Exception {
                ListConnectionsResult result = null;

                try {
                    result = executeListConnections(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEventBusesResult> listEventBusesAsync(ListEventBusesRequest request) {

        return listEventBusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventBusesResult> listEventBusesAsync(final ListEventBusesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventBusesRequest, ListEventBusesResult> asyncHandler) {
        final ListEventBusesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventBusesResult>() {
            @Override
            public ListEventBusesResult call() throws Exception {
                ListEventBusesResult result = null;

                try {
                    result = executeListEventBuses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEventSourcesResult> listEventSourcesAsync(ListEventSourcesRequest request) {

        return listEventSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSourcesResult> listEventSourcesAsync(final ListEventSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventSourcesRequest, ListEventSourcesResult> asyncHandler) {
        final ListEventSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventSourcesResult>() {
            @Override
            public ListEventSourcesResult call() throws Exception {
                ListEventSourcesResult result = null;

                try {
                    result = executeListEventSources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourceAccountsResult> listPartnerEventSourceAccountsAsync(ListPartnerEventSourceAccountsRequest request) {

        return listPartnerEventSourceAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourceAccountsResult> listPartnerEventSourceAccountsAsync(
            final ListPartnerEventSourceAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPartnerEventSourceAccountsRequest, ListPartnerEventSourceAccountsResult> asyncHandler) {
        final ListPartnerEventSourceAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPartnerEventSourceAccountsResult>() {
            @Override
            public ListPartnerEventSourceAccountsResult call() throws Exception {
                ListPartnerEventSourceAccountsResult result = null;

                try {
                    result = executeListPartnerEventSourceAccounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourcesResult> listPartnerEventSourcesAsync(ListPartnerEventSourcesRequest request) {

        return listPartnerEventSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourcesResult> listPartnerEventSourcesAsync(final ListPartnerEventSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPartnerEventSourcesRequest, ListPartnerEventSourcesResult> asyncHandler) {
        final ListPartnerEventSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPartnerEventSourcesResult>() {
            @Override
            public ListPartnerEventSourcesResult call() throws Exception {
                ListPartnerEventSourcesResult result = null;

                try {
                    result = executeListPartnerEventSources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListReplaysResult> listReplaysAsync(ListReplaysRequest request) {

        return listReplaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReplaysResult> listReplaysAsync(final ListReplaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReplaysRequest, ListReplaysResult> asyncHandler) {
        final ListReplaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReplaysResult>() {
            @Override
            public ListReplaysResult call() throws Exception {
                ListReplaysResult result = null;

                try {
                    result = executeListReplays(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest request) {

        return listRuleNamesByTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(final ListRuleNamesByTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRuleNamesByTargetRequest, ListRuleNamesByTargetResult> asyncHandler) {
        final ListRuleNamesByTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRuleNamesByTargetResult>() {
            @Override
            public ListRuleNamesByTargetResult call() throws Exception {
                ListRuleNamesByTargetResult result = null;

                try {
                    result = executeListRuleNamesByTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(final ListRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {
        final ListRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRulesResult>() {
            @Override
            public ListRulesResult call() throws Exception {
                ListRulesResult result = null;

                try {
                    result = executeListRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest request) {

        return listTargetsByRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(final ListTargetsByRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTargetsByRuleRequest, ListTargetsByRuleResult> asyncHandler) {
        final ListTargetsByRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTargetsByRuleResult>() {
            @Override
            public ListTargetsByRuleResult call() throws Exception {
                ListTargetsByRuleResult result = null;

                try {
                    result = executeListTargetsByRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request) {

        return putEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(final PutEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler) {
        final PutEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEventsResult>() {
            @Override
            public PutEventsResult call() throws Exception {
                PutEventsResult result = null;

                try {
                    result = executePutEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutPartnerEventsResult> putPartnerEventsAsync(PutPartnerEventsRequest request) {

        return putPartnerEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPartnerEventsResult> putPartnerEventsAsync(final PutPartnerEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPartnerEventsRequest, PutPartnerEventsResult> asyncHandler) {
        final PutPartnerEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPartnerEventsResult>() {
            @Override
            public PutPartnerEventsResult call() throws Exception {
                PutPartnerEventsResult result = null;

                try {
                    result = executePutPartnerEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest request) {

        return putPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(final PutPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPermissionRequest, PutPermissionResult> asyncHandler) {
        final PutPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPermissionResult>() {
            @Override
            public PutPermissionResult call() throws Exception {
                PutPermissionResult result = null;

                try {
                    result = executePutPermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest request) {

        return putRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(final PutRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRuleRequest, PutRuleResult> asyncHandler) {
        final PutRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRuleResult>() {
            @Override
            public PutRuleResult call() throws Exception {
                PutRuleResult result = null;

                try {
                    result = executePutRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest request) {

        return putTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(final PutTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutTargetsRequest, PutTargetsResult> asyncHandler) {
        final PutTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutTargetsResult>() {
            @Override
            public PutTargetsResult call() throws Exception {
                PutTargetsResult result = null;

                try {
                    result = executePutTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest request) {

        return removeTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(final RemoveTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTargetsRequest, RemoveTargetsResult> asyncHandler) {
        final RemoveTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTargetsResult>() {
            @Override
            public RemoveTargetsResult call() throws Exception {
                RemoveTargetsResult result = null;

                try {
                    result = executeRemoveTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartReplayResult> startReplayAsync(StartReplayRequest request) {

        return startReplayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplayResult> startReplayAsync(final StartReplayRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReplayRequest, StartReplayResult> asyncHandler) {
        final StartReplayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReplayResult>() {
            @Override
            public StartReplayResult call() throws Exception {
                StartReplayResult result = null;

                try {
                    result = executeStartReplay(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest request) {

        return testEventPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(final TestEventPatternRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestEventPatternRequest, TestEventPatternResult> asyncHandler) {
        final TestEventPatternRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestEventPatternResult>() {
            @Override
            public TestEventPatternResult call() throws Exception {
                TestEventPatternResult result = null;

                try {
                    result = executeTestEventPattern(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateApiDestinationResult> updateApiDestinationAsync(UpdateApiDestinationRequest request) {

        return updateApiDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiDestinationResult> updateApiDestinationAsync(final UpdateApiDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApiDestinationRequest, UpdateApiDestinationResult> asyncHandler) {
        final UpdateApiDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApiDestinationResult>() {
            @Override
            public UpdateApiDestinationResult call() throws Exception {
                UpdateApiDestinationResult result = null;

                try {
                    result = executeUpdateApiDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateArchiveResult> updateArchiveAsync(UpdateArchiveRequest request) {

        return updateArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateArchiveResult> updateArchiveAsync(final UpdateArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateArchiveRequest, UpdateArchiveResult> asyncHandler) {
        final UpdateArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateArchiveResult>() {
            @Override
            public UpdateArchiveResult call() throws Exception {
                UpdateArchiveResult result = null;

                try {
                    result = executeUpdateArchive(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
