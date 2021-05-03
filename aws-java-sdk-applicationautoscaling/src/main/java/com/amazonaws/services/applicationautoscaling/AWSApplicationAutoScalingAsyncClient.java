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
package com.amazonaws.services.applicationautoscaling;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Application Auto Scaling asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * With Application Auto Scaling, you can configure automatic scaling for the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon ECS services
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2 Spot Fleet requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EMR clusters
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon AppStream 2.0 fleets
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon DynamoDB tables and global secondary indexes throughput capacity
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Aurora Replicas
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SageMaker endpoint variants
 * </p>
 * </li>
 * <li>
 * <p>
 * Custom resources provided by your own applications or services
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Comprehend document classification and entity recognizer endpoints
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Lambda function provisioned concurrency
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Keyspaces (for Apache Cassandra) tables
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Managed Streaming for Apache Kafka broker storage
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>API Summary</b>
 * </p>
 * <p>
 * The Application Auto Scaling service API includes three key sets of actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Register and manage scalable targets - Register AWS or custom resources as scalable targets (a resource that
 * Application Auto Scaling can scale), set minimum and maximum capacity limits, and retrieve information on existing
 * scalable targets.
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure and manage automatic scaling - Define scaling policies to dynamically scale your resources in response to
 * CloudWatch alarms, schedule one-time or recurring scaling actions, and retrieve your recent scaling activity history.
 * </p>
 * </li>
 * <li>
 * <p>
 * Suspend and resume scaling - Temporarily suspend and later resume automatic scaling by calling the <a
 * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html"
 * >RegisterScalableTarget</a> API action for any Application Auto Scaling scalable target. You can suspend and resume
 * (individually or in combination) scale-out activities that are triggered by a scaling policy, scale-in activities
 * that are triggered by a scaling policy, and scheduled scaling.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To learn more about Application Auto Scaling, including information about granting IAM users required permissions for
 * Application Auto Scaling actions, see the <a
 * href="https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html"
 * >Application Auto Scaling User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSApplicationAutoScalingAsyncClient extends AWSApplicationAutoScalingClient implements AWSApplicationAutoScalingAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling. A credentials
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
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling. A credentials
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
     *        The client configuration options controlling how this client connects to Application Auto Scaling (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the specified
     * AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the specified
     * AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationAutoScalingAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the specified
     * AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationAutoScalingAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSApplicationAutoScalingAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the specified
     * AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the provided AWS
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
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationAutoScalingAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the specified
     * AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationAutoScalingAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the specified
     * AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSApplicationAutoScalingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationAutoScalingAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSApplicationAutoScalingAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSApplicationAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSApplicationAutoScalingAsyncClientBuilder asyncBuilder() {
        return AWSApplicationAutoScalingAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSApplicationAutoScalingAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Auto Scaling using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSApplicationAutoScalingAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest request) {

        return deleteScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(final DeleteScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler) {
        final DeleteScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScalingPolicyResult>() {
            @Override
            public DeleteScalingPolicyResult call() throws Exception {
                DeleteScalingPolicyResult result = null;

                try {
                    result = executeDeleteScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest request) {

        return deleteScheduledActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(final DeleteScheduledActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScheduledActionRequest, DeleteScheduledActionResult> asyncHandler) {
        final DeleteScheduledActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScheduledActionResult>() {
            @Override
            public DeleteScheduledActionResult call() throws Exception {
                DeleteScheduledActionResult result = null;

                try {
                    result = executeDeleteScheduledAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterScalableTargetResult> deregisterScalableTargetAsync(DeregisterScalableTargetRequest request) {

        return deregisterScalableTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterScalableTargetResult> deregisterScalableTargetAsync(final DeregisterScalableTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterScalableTargetRequest, DeregisterScalableTargetResult> asyncHandler) {
        final DeregisterScalableTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterScalableTargetResult>() {
            @Override
            public DeregisterScalableTargetResult call() throws Exception {
                DeregisterScalableTargetResult result = null;

                try {
                    result = executeDeregisterScalableTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeScalableTargetsResult> describeScalableTargetsAsync(DescribeScalableTargetsRequest request) {

        return describeScalableTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalableTargetsResult> describeScalableTargetsAsync(final DescribeScalableTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalableTargetsRequest, DescribeScalableTargetsResult> asyncHandler) {
        final DescribeScalableTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScalableTargetsResult>() {
            @Override
            public DescribeScalableTargetsResult call() throws Exception {
                DescribeScalableTargetsResult result = null;

                try {
                    result = executeDescribeScalableTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(DescribeScalingActivitiesRequest request) {

        return describeScalingActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(final DescribeScalingActivitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler) {
        final DescribeScalingActivitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScalingActivitiesResult>() {
            @Override
            public DescribeScalingActivitiesResult call() throws Exception {
                DescribeScalingActivitiesResult result = null;

                try {
                    result = executeDescribeScalingActivities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest request) {

        return describeScalingPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(final DescribeScalingPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler) {
        final DescribeScalingPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScalingPoliciesResult>() {
            @Override
            public DescribeScalingPoliciesResult call() throws Exception {
                DescribeScalingPoliciesResult result = null;

                try {
                    result = executeDescribeScalingPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest request) {

        return describeScheduledActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(final DescribeScheduledActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler) {
        final DescribeScheduledActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScheduledActionsResult>() {
            @Override
            public DescribeScheduledActionsResult call() throws Exception {
                DescribeScheduledActionsResult result = null;

                try {
                    result = executeDescribeScheduledActions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest request) {

        return putScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(final PutScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler) {
        final PutScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutScalingPolicyResult>() {
            @Override
            public PutScalingPolicyResult call() throws Exception {
                PutScalingPolicyResult result = null;

                try {
                    result = executePutScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutScheduledActionResult> putScheduledActionAsync(PutScheduledActionRequest request) {

        return putScheduledActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutScheduledActionResult> putScheduledActionAsync(final PutScheduledActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutScheduledActionRequest, PutScheduledActionResult> asyncHandler) {
        final PutScheduledActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutScheduledActionResult>() {
            @Override
            public PutScheduledActionResult call() throws Exception {
                PutScheduledActionResult result = null;

                try {
                    result = executePutScheduledAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterScalableTargetResult> registerScalableTargetAsync(RegisterScalableTargetRequest request) {

        return registerScalableTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterScalableTargetResult> registerScalableTargetAsync(final RegisterScalableTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterScalableTargetRequest, RegisterScalableTargetResult> asyncHandler) {
        final RegisterScalableTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterScalableTargetResult>() {
            @Override
            public RegisterScalableTargetResult call() throws Exception {
                RegisterScalableTargetResult result = null;

                try {
                    result = executeRegisterScalableTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
