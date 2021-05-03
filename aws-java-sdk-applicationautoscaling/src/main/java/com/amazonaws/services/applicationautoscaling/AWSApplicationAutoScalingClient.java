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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.services.applicationautoscaling.model.transform.*;

/**
 * Client for accessing Application Auto Scaling. All service calls made using this client are blocking, and will not
 * return until the service call completes.
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
public class AWSApplicationAutoScalingClient extends AmazonWebServiceClient implements AWSApplicationAutoScaling {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSApplicationAutoScaling.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "application-autoscaling";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationautoscaling.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationautoscaling.model.transform.InternalServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationautoscaling.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ObjectNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationautoscaling.model.transform.ObjectNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FailedResourceAccessException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationautoscaling.model.transform.FailedResourceAccessExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationautoscaling.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentUpdateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationautoscaling.model.transform.ConcurrentUpdateExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.applicationautoscaling.model.AWSApplicationAutoScalingException.class));

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSApplicationAutoScalingClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSApplicationAutoScalingClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Application Auto Scaling (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSApplicationAutoScalingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationAutoScalingClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSApplicationAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)} for
     *             example:
     *             {@code AWSApplicationAutoScalingClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSApplicationAutoScalingClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Application Auto Scaling (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSApplicationAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationAutoScalingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationAutoScalingClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSApplicationAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSApplicationAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Application Auto Scaling (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSApplicationAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationAutoScalingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Application Auto Scaling (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSApplicationAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationAutoScalingClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSApplicationAutoScalingClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSApplicationAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSApplicationAutoScalingClientBuilder builder() {
        return AWSApplicationAutoScalingClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSApplicationAutoScalingClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Application Auto Scaling using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSApplicationAutoScalingClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://application-autoscaling.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/applicationautoscaling/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/applicationautoscaling/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the specified scaling policy for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Deleting a step scaling policy deletes the underlying alarm action, but does not delete the CloudWatch alarm
     * associated with the scaling policy, even if it no longer has an associated action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#delete-step-scaling-policy"
     * >Delete a step scaling policy</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html#delete-target-tracking-policy"
     * >Delete a target tracking scaling policy</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @return Result of the DeleteScalingPolicy operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws ObjectNotFoundException
     *         The specified object could not be found. For any operation that depends on the existence of a scalable
     *         target, this exception is thrown if the scalable target with the specified service namespace, resource
     *         ID, and scalable dimension does not exist. For any operation that deletes or deregisters a resource, this
     *         exception is thrown if the resource cannot be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteScalingPolicyResult deleteScalingPolicy(DeleteScalingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScalingPolicy(request);
    }

    @SdkInternalApi
    final DeleteScalingPolicyResult executeDeleteScalingPolicy(DeleteScalingPolicyRequest deleteScalingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScalingPolicyRequest> request = null;
        Response<DeleteScalingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScalingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScalingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScalingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScalingPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified scheduled action for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/scheduled-scaling-additional-cli-commands.html#delete-scheduled-action"
     * >Delete a scheduled action</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return Result of the DeleteScheduledAction operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws ObjectNotFoundException
     *         The specified object could not be found. For any operation that depends on the existence of a scalable
     *         target, this exception is thrown if the scalable target with the specified service namespace, resource
     *         ID, and scalable dimension does not exist. For any operation that deletes or deregisters a resource, this
     *         exception is thrown if the resource cannot be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteScheduledActionResult deleteScheduledAction(DeleteScheduledActionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScheduledAction(request);
    }

    @SdkInternalApi
    final DeleteScheduledActionResult executeDeleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduledActionRequest> request = null;
        Response<DeleteScheduledActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduledActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScheduledActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScheduledAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScheduledActionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteScheduledActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters an Application Auto Scaling scalable target when you have finished using it. To see which resources
     * have been registered, use <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>.
     * </p>
     * <note>
     * <p>
     * Deregistering a scalable target deletes the scaling policies and the scheduled actions that are associated with
     * it.
     * </p>
     * </note>
     * 
     * @param deregisterScalableTargetRequest
     * @return Result of the DeregisterScalableTarget operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws ObjectNotFoundException
     *         The specified object could not be found. For any operation that depends on the existence of a scalable
     *         target, this exception is thrown if the scalable target with the specified service namespace, resource
     *         ID, and scalable dimension does not exist. For any operation that deletes or deregisters a resource, this
     *         exception is thrown if the resource cannot be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DeregisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeregisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterScalableTargetResult deregisterScalableTarget(DeregisterScalableTargetRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterScalableTarget(request);
    }

    @SdkInternalApi
    final DeregisterScalableTargetResult executeDeregisterScalableTarget(DeregisterScalableTargetRequest deregisterScalableTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterScalableTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterScalableTargetRequest> request = null;
        Response<DeregisterScalableTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterScalableTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterScalableTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterScalableTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterScalableTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterScalableTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the scalable targets in the specified namespace.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceIds</code> and <code>ScalableDimension</code>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @return Result of the DescribeScalableTargets operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws InvalidNextTokenException
     *         The next token supplied was invalid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DescribeScalableTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalableTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScalableTargetsResult describeScalableTargets(DescribeScalableTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalableTargets(request);
    }

    @SdkInternalApi
    final DescribeScalableTargetsResult executeDescribeScalableTargets(DescribeScalableTargetsRequest describeScalableTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalableTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalableTargetsRequest> request = null;
        Response<DescribeScalableTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalableTargetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeScalableTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalableTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScalableTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeScalableTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six
     * weeks.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceId</code> and <code>ScalableDimension</code>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return Result of the DescribeScalingActivities operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws InvalidNextTokenException
     *         The next token supplied was invalid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DescribeScalingActivities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScalingActivitiesResult describeScalingActivities(DescribeScalingActivitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalingActivities(request);
    }

    @SdkInternalApi
    final DescribeScalingActivitiesResult executeDescribeScalingActivities(DescribeScalingActivitiesRequest describeScalingActivitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalingActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingActivitiesRequest> request = null;
        Response<DescribeScalingActivitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingActivitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeScalingActivitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalingActivities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScalingActivitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeScalingActivitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the Application Auto Scaling scaling policies for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>PolicyNames</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     * >Target tracking scaling policies</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * >Step scaling policies</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @return Result of the DescribeScalingPolicies operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws FailedResourceAccessException
     *         Failed access to resources caused an exception. This exception is thrown when Application Auto Scaling is
     *         unable to retrieve the alarms associated with a scaling policy due to a client error, for example, if the
     *         role ARN specified for a scalable target does not have permission to call the CloudWatch <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarms.html"
     *         >DescribeAlarms</a> on your behalf.
     * @throws InvalidNextTokenException
     *         The next token supplied was invalid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScalingPoliciesResult describeScalingPolicies(DescribeScalingPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalingPolicies(request);
    }

    @SdkInternalApi
    final DescribeScalingPoliciesResult executeDescribeScalingPolicies(DescribeScalingPoliciesRequest describeScalingPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalingPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingPoliciesRequest> request = null;
        Response<DescribeScalingPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeScalingPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalingPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScalingPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeScalingPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the Application Auto Scaling scheduled actions for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>ScheduledActionNames</code> parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled scaling</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/scheduled-scaling-additional-cli-commands.html"
     * >Managing scheduled scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return Result of the DescribeScheduledActions operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws InvalidNextTokenException
     *         The next token supplied was invalid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScheduledActionsResult describeScheduledActions(DescribeScheduledActionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScheduledActions(request);
    }

    @SdkInternalApi
    final DescribeScheduledActionsResult executeDescribeScheduledActions(DescribeScheduledActionsRequest describeScheduledActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScheduledActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduledActionsRequest> request = null;
        Response<DescribeScheduledActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduledActionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeScheduledActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScheduledActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScheduledActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeScheduledActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a scaling policy for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy
     * applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you
     * have registered the resource as a scalable target.
     * </p>
     * <p>
     * Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more
     * target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that
     * multiple policies could conflict, instructing the scalable target to scale out or in at the same time.
     * Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale out and
     * scale in. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent,
     * and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity
     * (200% of 10 = 20) and scales out to 30.
     * </p>
     * <p>
     * We recommend caution, however, when using target tracking scaling policies with step scaling policies because
     * conflicts between these policies can cause undesirable behavior. For example, if the step scaling policy
     * initiates a scale-in activity before the target tracking policy is ready to scale in, the scale-in activity will
     * not be blocked. After the scale-in activity completes, the target tracking policy could instruct the scalable
     * target to scale out again.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     * >Target tracking scaling policies</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * >Step scaling policies</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If a scalable target is deregistered, the scalable target is no longer available to execute scaling policies. Any
     * scaling policies that were specified for the scalable target are deleted.
     * </p>
     * </note>
     * 
     * @param putScalingPolicyRequest
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws LimitExceededException
     *         A per-account resource limit is exceeded. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-limits.html"
     *         >Application Auto Scaling service quotas</a>.
     * @throws ObjectNotFoundException
     *         The specified object could not be found. For any operation that depends on the existence of a scalable
     *         target, this exception is thrown if the scalable target with the specified service namespace, resource
     *         ID, and scalable dimension does not exist. For any operation that deletes or deregisters a resource, this
     *         exception is thrown if the resource cannot be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws FailedResourceAccessException
     *         Failed access to resources caused an exception. This exception is thrown when Application Auto Scaling is
     *         unable to retrieve the alarms associated with a scaling policy due to a client error, for example, if the
     *         role ARN specified for a scalable target does not have permission to call the CloudWatch <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarms.html"
     *         >DescribeAlarms</a> on your behalf.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutScalingPolicy(request);
    }

    @SdkInternalApi
    final PutScalingPolicyResult executePutScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScalingPolicyRequest> request = null;
        Response<PutScalingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutScalingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutScalingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutScalingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutScalingPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled
     * action applies to the scalable target identified by those three attributes. You cannot create a scheduled action
     * until you have registered the resource as a scalable target.
     * </p>
     * <p>
     * When start and end times are specified with a recurring schedule using a cron expression or rates, they form the
     * boundaries for when the recurring action starts and stops.
     * </p>
     * <p>
     * To update a scheduled action, specify the parameters that you want to change. If you don't specify start and end
     * times, the old values are deleted.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If a scalable target is deregistered, the scalable target is no longer available to run scheduled actions. Any
     * scheduled actions that were specified for the scalable target are deleted.
     * </p>
     * </note>
     * 
     * @param putScheduledActionRequest
     * @return Result of the PutScheduledAction operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws LimitExceededException
     *         A per-account resource limit is exceeded. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-limits.html"
     *         >Application Auto Scaling service quotas</a>.
     * @throws ObjectNotFoundException
     *         The specified object could not be found. For any operation that depends on the existence of a scalable
     *         target, this exception is thrown if the scalable target with the specified service namespace, resource
     *         ID, and scalable dimension does not exist. For any operation that deletes or deregisters a resource, this
     *         exception is thrown if the resource cannot be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.PutScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutScheduledActionResult putScheduledAction(PutScheduledActionRequest request) {
        request = beforeClientExecution(request);
        return executePutScheduledAction(request);
    }

    @SdkInternalApi
    final PutScheduledActionResult executePutScheduledAction(PutScheduledActionRequest putScheduledActionRequest) {

        ExecutionContext executionContext = createExecutionContext(putScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScheduledActionRequest> request = null;
        Response<PutScheduledActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutScheduledActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putScheduledActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutScheduledAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutScheduledActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutScheduledActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers or updates a scalable target.
     * </p>
     * <p>
     * A scalable target is a resource that Application Auto Scaling can scale out and scale in. Scalable targets are
     * uniquely identified by the combination of resource ID, scalable dimension, and namespace.
     * </p>
     * <p>
     * When you register a new scalable target, you must specify values for minimum and maximum capacity. Current
     * capacity will be adjusted within the specified range when scaling starts. Application Auto Scaling scaling
     * policies will not scale capacity to values that are outside of this range.
     * </p>
     * <p>
     * After you register a scalable target, you do not need to register it again to use other Application Auto Scaling
     * operations. To see which resources have been registered, use <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>. You can also view the scaling policies for a service namespace by using <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html"
     * >DescribeScalableTargets</a>. If you no longer need a scalable target, you can deregister it by using <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DeregisterScalableTarget.html"
     * >DeregisterScalableTarget</a>.
     * </p>
     * <p>
     * To update a scalable target, specify the parameters that you want to change. Include the parameters that identify
     * the scalable target: resource ID, scalable dimension, and namespace. Any parameters that you don't specify are
     * not changed by this update request.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @return Result of the RegisterScalableTarget operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the available parameters for the API request.
     * @throws LimitExceededException
     *         A per-account resource limit is exceeded. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-limits.html"
     *         >Application Auto Scaling service quotas</a>.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to an Application Auto
     *         Scaling resource that already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.RegisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/RegisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterScalableTargetResult registerScalableTarget(RegisterScalableTargetRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterScalableTarget(request);
    }

    @SdkInternalApi
    final RegisterScalableTargetResult executeRegisterScalableTarget(RegisterScalableTargetRequest registerScalableTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(registerScalableTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterScalableTargetRequest> request = null;
        Response<RegisterScalableTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterScalableTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerScalableTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterScalableTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterScalableTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterScalableTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
