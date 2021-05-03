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

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.waiters.AWSLambdaWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.services.lambda.model.transform.*;

/**
 * Client for accessing AWS Lambda. All service calls made using this client are blocking, and will not return until the
 * service call completes.
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
public class AWSLambdaClient extends AmazonWebServiceClient implements AWSLambda {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLambda.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lambda";

    private volatile AWSLambdaWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotReadyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.ResourceNotReadyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSAccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.KMSAccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EC2ThrottledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.EC2ThrottledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidZipFileException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.InvalidZipFileExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSDisabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.KMSDisabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EFSIOException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.EFSIOExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCodeSignatureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.InvalidCodeSignatureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRuntimeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.InvalidRuntimeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EFSMountFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.EFSMountFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EC2UnexpectedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.EC2UnexpectedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSecurityGroupIDException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.InvalidSecurityGroupIDExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.ResourceConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.KMSNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSubnetIDException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.InvalidSubnetIDExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.PreconditionFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedMediaTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.UnsupportedMediaTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.InvalidParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EFSMountConnectivityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.EFSMountConnectivityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EC2AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.EC2AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyLengthExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.PolicyLengthExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.ServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.KMSInvalidStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestContentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.InvalidRequestContentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CodeSigningConfigNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.CodeSigningConfigNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProvisionedConcurrencyConfigNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.ProvisionedConcurrencyConfigNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CodeStorageExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.CodeStorageExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ENILimitReachedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.ENILimitReachedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetIPAddressLimitReachedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.SubnetIPAddressLimitReachedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CodeVerificationFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.CodeVerificationFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EFSMountTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.EFSMountTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestTooLargeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.RequestTooLargeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lambda.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lambda.model.AWSLambdaException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Lambda. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AWSLambdaClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSLambdaClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSLambdaClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLambdaClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSLambdaClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSLambdaClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSLambdaClientBuilder builder() {
        return AWSLambdaClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLambdaClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLambdaClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("lambda.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lambda/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lambda/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds permissions to the resource-based policy of a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. Use this
     * action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS
     * accounts, or all accounts in an organization.
     * </p>
     * <p>
     * To revoke permission, call <a>RemoveLayerVersionPermission</a> with the statement ID that you specified when you
     * added it.
     * </p>
     * 
     * @param addLayerVersionPermissionRequest
     * @return Result of the AddLayerVersionPermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws PolicyLengthExceededException
     *         The permissions policy for the resource is too large. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.AddLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddLayerVersionPermissionResult addLayerVersionPermission(AddLayerVersionPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeAddLayerVersionPermission(request);
    }

    @SdkInternalApi
    final AddLayerVersionPermissionResult executeAddLayerVersionPermission(AddLayerVersionPermissionRequest addLayerVersionPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(addLayerVersionPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddLayerVersionPermissionRequest> request = null;
        Response<AddLayerVersionPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddLayerVersionPermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addLayerVersionPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddLayerVersionPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddLayerVersionPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddLayerVersionPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants an AWS service or another account permission to use a function. You can apply the policy at the function
     * level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the
     * invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function.
     * </p>
     * <p>
     * To grant permission to another account, specify the account ID as the <code>Principal</code>. For AWS services,
     * the principal is a domain-style identifier defined by the service, like <code>s3.amazonaws.com</code> or
     * <code>sns.amazonaws.com</code>. For AWS services, you can also specify the ARN of the associated resource as the
     * <code>SourceArn</code>. If you grant permission to a service principal without specifying the source, other
     * accounts could potentially configure resources in their account to invoke your Lambda function.
     * </p>
     * <p>
     * This action adds a statement to a resource-based permissions policy for the function. For more information about
     * function policies, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html">Lambda Function
     * Policies</a>.
     * </p>
     * 
     * @param addPermissionRequest
     * @return Result of the AddPermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws PolicyLengthExceededException
     *         The permissions policy for the resource is too large. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddPermissionResult addPermission(AddPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeAddPermission(request);
    }

    @SdkInternalApi
    final AddPermissionResult executeAddPermission(AddPermissionRequest addPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPermissionRequest> request = null;
        Response<AddPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddPermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a> for a Lambda
     * function version. Use aliases to provide clients with a function identifier that you can update to invoke a
     * different version.
     * </p>
     * <p>
     * You can also map an alias to split invocation requests between two versions. Use the <code>RoutingConfig</code>
     * parameter to specify a second version and the percentage of invocation requests that it receives.
     * </p>
     * 
     * @param createAliasRequest
     * @return Result of the CreateAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlias(request);
    }

    @SdkInternalApi
    final CreateAliasResult executeCreateAlias(CreateAliasRequest createAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a code signing configuration. A <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-trustedcode.html">code signing configuration</a>
     * defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if
     * deployment validation checks fail).
     * </p>
     * 
     * @param createCodeSigningConfigRequest
     * @return Result of the CreateCodeSigningConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @sample AWSLambda.CreateCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateCodeSigningConfigResult createCodeSigningConfig(CreateCodeSigningConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCodeSigningConfig(request);
    }

    @SdkInternalApi
    final CreateCodeSigningConfigResult executeCreateCodeSigningConfig(CreateCodeSigningConfigRequest createCodeSigningConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createCodeSigningConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCodeSigningConfigRequest> request = null;
        Response<CreateCodeSigningConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCodeSigningConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCodeSigningConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCodeSigningConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCodeSigningConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCodeSigningConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
     * and triggers the function.
     * </p>
     * <p>
     * For details about each event source type, see the following topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html">Using AWS Lambda with Amazon DynamoDB</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html">Using AWS Lambda with Amazon Kinesis</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html">Using AWS Lambda with Amazon SQS</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-mq.html">Using AWS Lambda with Amazon MQ</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html">Using AWS Lambda with Amazon MSK</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/kafka-smaa.html">Using AWS Lambda with Self-Managed Apache
     * Kafka</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following error handling options are only available for stream sources (DynamoDB and Kinesis):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BisectBatchOnFunctionError</code> - If the function returns an error, split the batch in two and retry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationConfig</code> - Send discarded records to an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRecordAgeInSeconds</code> - Discard records older than the specified age. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRetryAttempts</code> - Discard records after the specified number of retries. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParallelizationFactor</code> - Process multiple batches from each shard concurrently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventSourceMappingRequest
     * @return Result of the CreateEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AWSLambda.CreateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEventSourceMappingResult createEventSourceMapping(CreateEventSourceMappingRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEventSourceMapping(request);
    }

    @SdkInternalApi
    final CreateEventSourceMappingResult executeCreateEventSourceMapping(CreateEventSourceMappingRequest createEventSourceMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(createEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSourceMappingRequest> request = null;
        Response<CreateEventSourceMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventSourceMappingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEventSourceMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEventSourceMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEventSourceMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Lambda function. To create a function, you need a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html">deployment package</a> and an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role">
     * execution role</a>. The deployment package is a .zip file archive or container image that contains your function
     * code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for
     * log streaming and AWS X-Ray for request tracing.
     * </p>
     * <p>
     * When you create a function, Lambda provisions an instance of the function and its supporting resources. If your
     * function connects to a VPC, this process can take a minute or so. During this time, you can't invoke or modify
     * the function. The <code>State</code>, <code>StateReason</code>, and <code>StateReasonCode</code> fields in the
     * response from <a>GetFunctionConfiguration</a> indicate when the function is ready to invoke. For more
     * information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/functions-states.html">Function
     * States</a>.
     * </p>
     * <p>
     * A function has an unpublished version, and can have published versions and aliases. The unpublished version
     * changes when you update your function's code and configuration. A published version is a snapshot of your
     * function code and configuration that can't be changed. An alias is a named resource that maps to a version, and
     * can be changed to map to a different version. Use the <code>Publish</code> parameter to create version
     * <code>1</code> of your function from its initial configuration.
     * </p>
     * <p>
     * The other parameters let you configure version-specific and function-level settings. You can modify
     * version-specific settings later with <a>UpdateFunctionConfiguration</a>. Function-level settings apply to both
     * the unpublished and published versions of the function, and include tags (<a>TagResource</a>) and per-function
     * concurrency limits (<a>PutFunctionConcurrency</a>).
     * </p>
     * <p>
     * You can use code signing if your deployment package is a .zip file archive. To enable code signing for this
     * function, specify the ARN of a code-signing configuration. When a user attempts to deploy a code package with
     * <a>UpdateFunctionCode</a>, Lambda checks that the code package has a valid signature from a trusted publisher.
     * The code-signing configuration includes set set of signing profiles, which define the trusted publishers for this
     * function.
     * </p>
     * <p>
     * If another account or an AWS service invokes your function, use <a>AddPermission</a> to grant permission by
     * creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an
     * alias.
     * </p>
     * <p>
     * To invoke your function directly, use <a>Invoke</a>. To invoke your function in response to events in other AWS
     * services, create an event source mapping (<a>CreateEventSourceMapping</a>), or configure a function trigger in
     * the other service. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html">Invoking Functions</a>.
     * </p>
     * 
     * @param createFunctionRequest
     * @return Result of the CreateFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws CodeVerificationFailedException
     *         The code signature failed one or more of the validation checks for signature mismatch or expiry, and the
     *         code signing policy is set to ENFORCE. Lambda blocks the deployment.
     * @throws InvalidCodeSignatureException
     *         The code signature failed the integrity check. Lambda always blocks deployment if the integrity check
     *         fails, even if code signing policy is set to WARN.
     * @throws CodeSigningConfigNotFoundException
     *         The specified code signing configuration does not exist.
     * @sample AWSLambda.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFunctionResult createFunction(CreateFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFunction(request);
    }

    @SdkInternalApi
    final CreateFunctionResult executeCreateFunction(CreateFunctionRequest createFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(createFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFunctionRequest> request = null;
        Response<CreateFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAliasResult deleteAlias(DeleteAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlias(request);
    }

    @SdkInternalApi
    final DeleteAliasResult executeDeleteAlias(DeleteAliasRequest deleteAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<DeleteAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the code signing configuration. You can delete the code signing configuration only if no function is
     * using it.
     * </p>
     * 
     * @param deleteCodeSigningConfigRequest
     * @return Result of the DeleteCodeSigningConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.DeleteCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCodeSigningConfigResult deleteCodeSigningConfig(DeleteCodeSigningConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCodeSigningConfig(request);
    }

    @SdkInternalApi
    final DeleteCodeSigningConfigResult executeDeleteCodeSigningConfig(DeleteCodeSigningConfigRequest deleteCodeSigningConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCodeSigningConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCodeSigningConfigRequest> request = null;
        Response<DeleteCodeSigningConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCodeSigningConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCodeSigningConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCodeSigningConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCodeSigningConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCodeSigningConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an <a href="https://docs.aws.amazon.com/lambda/latest/dg/intro-invocation-modes.html">event source
     * mapping</a>. You can get the identifier of a mapping from the output of <a>ListEventSourceMappings</a>.
     * </p>
     * <p>
     * When you delete an event source mapping, it enters a <code>Deleting</code> state and might not be completely
     * deleted for several seconds.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @return Result of the DeleteEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to update an
     *         EventSource Mapping in CREATING, or tried to delete a EventSource mapping currently in the UPDATING
     *         state.
     * @sample AWSLambda.DeleteEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEventSourceMappingResult deleteEventSourceMapping(DeleteEventSourceMappingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventSourceMapping(request);
    }

    @SdkInternalApi
    final DeleteEventSourceMappingResult executeDeleteEventSourceMapping(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSourceMappingRequest> request = null;
        Response<DeleteEventSourceMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventSourceMappingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventSourceMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventSourceMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEventSourceMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Lambda function. To delete a specific function version, use the <code>Qualifier</code> parameter.
     * Otherwise, all versions and aliases are deleted.
     * </p>
     * <p>
     * To delete Lambda event source mappings that invoke a function, use <a>DeleteEventSourceMapping</a>. For AWS
     * services and resources that invoke your function directly, delete the trigger in the service where you originally
     * configured it.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return Result of the DeleteFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFunctionResult deleteFunction(DeleteFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFunction(request);
    }

    @SdkInternalApi
    final DeleteFunctionResult executeDeleteFunction(DeleteFunctionRequest deleteFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionRequest> request = null;
        Response<DeleteFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the code signing configuration from the function.
     * </p>
     * 
     * @param deleteFunctionCodeSigningConfigRequest
     * @return Result of the DeleteFunctionCodeSigningConfig operation returned by the service.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws CodeSigningConfigNotFoundException
     *         The specified code signing configuration does not exist.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.DeleteFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFunctionCodeSigningConfigResult deleteFunctionCodeSigningConfig(DeleteFunctionCodeSigningConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFunctionCodeSigningConfig(request);
    }

    @SdkInternalApi
    final DeleteFunctionCodeSigningConfigResult executeDeleteFunctionCodeSigningConfig(
            DeleteFunctionCodeSigningConfigRequest deleteFunctionCodeSigningConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFunctionCodeSigningConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionCodeSigningConfigRequest> request = null;
        Response<DeleteFunctionCodeSigningConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionCodeSigningConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteFunctionCodeSigningConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFunctionCodeSigningConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFunctionCodeSigningConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteFunctionCodeSigningConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a concurrent execution limit from a function.
     * </p>
     * 
     * @param deleteFunctionConcurrencyRequest
     * @return Result of the DeleteFunctionConcurrency operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.DeleteFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFunctionConcurrencyResult deleteFunctionConcurrency(DeleteFunctionConcurrencyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFunctionConcurrency(request);
    }

    @SdkInternalApi
    final DeleteFunctionConcurrencyResult executeDeleteFunctionConcurrency(DeleteFunctionConcurrencyRequest deleteFunctionConcurrencyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFunctionConcurrencyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionConcurrencyRequest> request = null;
        Response<DeleteFunctionConcurrencyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionConcurrencyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteFunctionConcurrencyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFunctionConcurrency");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFunctionConcurrencyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteFunctionConcurrencyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param deleteFunctionEventInvokeConfigRequest
     * @return Result of the DeleteFunctionEventInvokeConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.DeleteFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFunctionEventInvokeConfigResult deleteFunctionEventInvokeConfig(DeleteFunctionEventInvokeConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFunctionEventInvokeConfig(request);
    }

    @SdkInternalApi
    final DeleteFunctionEventInvokeConfigResult executeDeleteFunctionEventInvokeConfig(
            DeleteFunctionEventInvokeConfigRequest deleteFunctionEventInvokeConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFunctionEventInvokeConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionEventInvokeConfigRequest> request = null;
        Response<DeleteFunctionEventInvokeConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionEventInvokeConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteFunctionEventInvokeConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFunctionEventInvokeConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFunctionEventInvokeConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteFunctionEventInvokeConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a version of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
     * Lambda layer</a>. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a
     * copy of the version remains in Lambda until no functions refer to it.
     * </p>
     * 
     * @param deleteLayerVersionRequest
     * @return Result of the DeleteLayerVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.DeleteLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLayerVersionResult deleteLayerVersion(DeleteLayerVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLayerVersion(request);
    }

    @SdkInternalApi
    final DeleteLayerVersionResult executeDeleteLayerVersion(DeleteLayerVersionRequest deleteLayerVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLayerVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLayerVersionRequest> request = null;
        Response<DeleteLayerVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLayerVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLayerVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLayerVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLayerVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLayerVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the provisioned concurrency configuration for a function.
     * </p>
     * 
     * @param deleteProvisionedConcurrencyConfigRequest
     * @return Result of the DeleteProvisionedConcurrencyConfig operation returned by the service.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.DeleteProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProvisionedConcurrencyConfigResult deleteProvisionedConcurrencyConfig(DeleteProvisionedConcurrencyConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProvisionedConcurrencyConfig(request);
    }

    @SdkInternalApi
    final DeleteProvisionedConcurrencyConfigResult executeDeleteProvisionedConcurrencyConfig(
            DeleteProvisionedConcurrencyConfigRequest deleteProvisionedConcurrencyConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProvisionedConcurrencyConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProvisionedConcurrencyConfigRequest> request = null;
        Response<DeleteProvisionedConcurrencyConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProvisionedConcurrencyConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteProvisionedConcurrencyConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProvisionedConcurrencyConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProvisionedConcurrencyConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteProvisionedConcurrencyConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about your account's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limits</a> and usage in an AWS Region.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSettings(request);
    }

    @SdkInternalApi
    final GetAccountSettingsResult executeGetAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSettingsRequest> request = null;
        Response<GetAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param getAliasRequest
     * @return Result of the GetAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.GetAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAliasResult getAlias(GetAliasRequest request) {
        request = beforeClientExecution(request);
        return executeGetAlias(request);
    }

    @SdkInternalApi
    final GetAliasResult executeGetAlias(GetAliasRequest getAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(getAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAliasRequest> request = null;
        Response<GetAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAliasResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified code signing configuration.
     * </p>
     * 
     * @param getCodeSigningConfigRequest
     * @return Result of the GetCodeSigningConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AWSLambda.GetCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCodeSigningConfigResult getCodeSigningConfig(GetCodeSigningConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetCodeSigningConfig(request);
    }

    @SdkInternalApi
    final GetCodeSigningConfigResult executeGetCodeSigningConfig(GetCodeSigningConfigRequest getCodeSigningConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getCodeSigningConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCodeSigningConfigRequest> request = null;
        Response<GetCodeSigningConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCodeSigningConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCodeSigningConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCodeSigningConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCodeSigningConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCodeSigningConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about an event source mapping. You can get the identifier of a mapping from the output of
     * <a>ListEventSourceMappings</a>.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @return Result of the GetEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.GetEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetEventSourceMapping" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEventSourceMappingResult getEventSourceMapping(GetEventSourceMappingRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventSourceMapping(request);
    }

    @SdkInternalApi
    final GetEventSourceMappingResult executeGetEventSourceMapping(GetEventSourceMappingRequest getEventSourceMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventSourceMappingRequest> request = null;
        Response<GetEventSourceMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventSourceMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEventSourceMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventSourceMappingResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetEventSourceMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the function or function version, with a link to download the deployment package that's
     * valid for 10 minutes. If you specify a function version, only details that are specific to that version are
     * returned.
     * </p>
     * 
     * @param getFunctionRequest
     * @return Result of the GetFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @sample AWSLambda.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFunctionResult getFunction(GetFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeGetFunction(request);
    }

    @SdkInternalApi
    final GetFunctionResult executeGetFunction(GetFunctionRequest getFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(getFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionRequest> request = null;
        Response<GetFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the code signing configuration for the specified function.
     * </p>
     * 
     * @param getFunctionCodeSigningConfigRequest
     * @return Result of the GetFunctionCodeSigningConfig operation returned by the service.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.GetFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFunctionCodeSigningConfigResult getFunctionCodeSigningConfig(GetFunctionCodeSigningConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetFunctionCodeSigningConfig(request);
    }

    @SdkInternalApi
    final GetFunctionCodeSigningConfigResult executeGetFunctionCodeSigningConfig(GetFunctionCodeSigningConfigRequest getFunctionCodeSigningConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getFunctionCodeSigningConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionCodeSigningConfigRequest> request = null;
        Response<GetFunctionCodeSigningConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionCodeSigningConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getFunctionCodeSigningConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFunctionCodeSigningConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFunctionCodeSigningConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetFunctionCodeSigningConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about the reserved concurrency configuration for a function. To set a concurrency limit for a
     * function, use <a>PutFunctionConcurrency</a>.
     * </p>
     * 
     * @param getFunctionConcurrencyRequest
     * @return Result of the GetFunctionConcurrency operation returned by the service.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.GetFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetFunctionConcurrencyResult getFunctionConcurrency(GetFunctionConcurrencyRequest request) {
        request = beforeClientExecution(request);
        return executeGetFunctionConcurrency(request);
    }

    @SdkInternalApi
    final GetFunctionConcurrencyResult executeGetFunctionConcurrency(GetFunctionConcurrencyRequest getFunctionConcurrencyRequest) {

        ExecutionContext executionContext = createExecutionContext(getFunctionConcurrencyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionConcurrencyRequest> request = null;
        Response<GetFunctionConcurrencyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionConcurrencyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFunctionConcurrencyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFunctionConcurrency");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFunctionConcurrencyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetFunctionConcurrencyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the version-specific settings of a Lambda function or version. The output includes only options that can
     * vary between versions of a function. To modify these settings, use <a>UpdateFunctionConfiguration</a>.
     * </p>
     * <p>
     * To get all of a function's details, including function-level settings, use <a>GetFunction</a>.
     * </p>
     * 
     * @param getFunctionConfigurationRequest
     * @return Result of the GetFunctionConfiguration operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @sample AWSLambda.GetFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetFunctionConfiguration(request);
    }

    @SdkInternalApi
    final GetFunctionConfigurationResult executeGetFunctionConfiguration(GetFunctionConfigurationRequest getFunctionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getFunctionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionConfigurationRequest> request = null;
        Response<GetFunctionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getFunctionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFunctionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFunctionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetFunctionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param getFunctionEventInvokeConfigRequest
     * @return Result of the GetFunctionEventInvokeConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.GetFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFunctionEventInvokeConfigResult getFunctionEventInvokeConfig(GetFunctionEventInvokeConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetFunctionEventInvokeConfig(request);
    }

    @SdkInternalApi
    final GetFunctionEventInvokeConfigResult executeGetFunctionEventInvokeConfig(GetFunctionEventInvokeConfigRequest getFunctionEventInvokeConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getFunctionEventInvokeConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionEventInvokeConfigRequest> request = null;
        Response<GetFunctionEventInvokeConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionEventInvokeConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getFunctionEventInvokeConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFunctionEventInvokeConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFunctionEventInvokeConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetFunctionEventInvokeConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>, with a link
     * to download the layer archive that's valid for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionRequest
     * @return Result of the GetLayerVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AWSLambda.GetLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLayerVersionResult getLayerVersion(GetLayerVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetLayerVersion(request);
    }

    @SdkInternalApi
    final GetLayerVersionResult executeGetLayerVersion(GetLayerVersionRequest getLayerVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getLayerVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLayerVersionRequest> request = null;
        Response<GetLayerVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLayerVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLayerVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLayerVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLayerVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLayerVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>, with a link
     * to download the layer archive that's valid for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionByArnRequest
     * @return Result of the GetLayerVersionByArn operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AWSLambda.GetLayerVersionByArn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionByArn" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetLayerVersionByArnResult getLayerVersionByArn(GetLayerVersionByArnRequest request) {
        request = beforeClientExecution(request);
        return executeGetLayerVersionByArn(request);
    }

    @SdkInternalApi
    final GetLayerVersionByArnResult executeGetLayerVersionByArn(GetLayerVersionByArnRequest getLayerVersionByArnRequest) {

        ExecutionContext executionContext = createExecutionContext(getLayerVersionByArnRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLayerVersionByArnRequest> request = null;
        Response<GetLayerVersionByArnResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLayerVersionByArnRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLayerVersionByArnRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLayerVersionByArn");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLayerVersionByArnResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLayerVersionByArnResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the permission policy for a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. For more
     * information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param getLayerVersionPolicyRequest
     * @return Result of the GetLayerVersionPolicy operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @sample AWSLambda.GetLayerVersionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetLayerVersionPolicyResult getLayerVersionPolicy(GetLayerVersionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetLayerVersionPolicy(request);
    }

    @SdkInternalApi
    final GetLayerVersionPolicyResult executeGetLayerVersionPolicy(GetLayerVersionPolicyRequest getLayerVersionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getLayerVersionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLayerVersionPolicyRequest> request = null;
        Response<GetLayerVersionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLayerVersionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLayerVersionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLayerVersionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLayerVersionPolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetLayerVersionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html">resource-based IAM
     * policy</a> for a function, version, or alias.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @sample AWSLambda.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicy(request);
    }

    @SdkInternalApi
    final GetPolicyResult executeGetPolicy(GetPolicyRequest getPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the provisioned concurrency configuration for a function's alias or version.
     * </p>
     * 
     * @param getProvisionedConcurrencyConfigRequest
     * @return Result of the GetProvisionedConcurrencyConfig operation returned by the service.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ProvisionedConcurrencyConfigNotFoundException
     *         The specified configuration does not exist.
     * @sample AWSLambda.GetProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProvisionedConcurrencyConfigResult getProvisionedConcurrencyConfig(GetProvisionedConcurrencyConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetProvisionedConcurrencyConfig(request);
    }

    @SdkInternalApi
    final GetProvisionedConcurrencyConfigResult executeGetProvisionedConcurrencyConfig(
            GetProvisionedConcurrencyConfigRequest getProvisionedConcurrencyConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getProvisionedConcurrencyConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProvisionedConcurrencyConfigRequest> request = null;
        Response<GetProvisionedConcurrencyConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProvisionedConcurrencyConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getProvisionedConcurrencyConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProvisionedConcurrencyConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProvisionedConcurrencyConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetProvisionedConcurrencyConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or
     * asynchronously. To invoke a function asynchronously, set <code>InvocationType</code> to <code>Event</code>.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-sync.html">synchronous invocation</a>,
     * details about the function response, including errors, are included in the response body and headers. For either
     * invocation type, you can find more information in the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/monitoring-functions.html">execution log</a> and <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-x-ray.html">trace</a>.
     * </p>
     * <p>
     * When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client,
     * event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error,
     * Lambda executes the function up to two more times. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/retries-on-errors.html">Retry Behavior</a>.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html">asynchronous invocation</a>,
     * Lambda adds events to a queue before sending them to your function. If your function does not have enough
     * capacity to keep up with the queue, events may be lost. Occasionally, your function may receive the same event
     * multiple times, even if no error occurs. To retain events that were not processed, configure your function with a
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq">dead-letter queue</a>.
     * </p>
     * <p>
     * The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that
     * prevent your function from executing, such as permissions errors, <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limit errors</a>, or issues with your function's
     * code and configuration. For example, Lambda returns <code>TooManyRequestsException</code> if executing the
     * function would cause you to exceed a concurrency limit at either the account level (
     * <code>ConcurrentInvocationLimitExceeded</code>) or function level (
     * <code>ReservedFunctionConcurrentInvocationLimitExceeded</code>).
     * </p>
     * <p>
     * For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits
     * for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_awslambda.html">lambda:InvokeFunction</a> action.
     * </p>
     * 
     * @param invokeRequest
     * @return Result of the Invoke operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidRequestContentException
     *         The request body could not be parsed as JSON.
     * @throws RequestTooLargeException
     *         The request payload exceeded the <code>Invoke</code> request body JSON input limit. For more information,
     *         see <a href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>.
     * @throws UnsupportedMediaTypeException
     *         The content type of the <code>Invoke</code> request body is not JSON.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws EC2UnexpectedException
     *         AWS Lambda received an unexpected EC2 client exception while setting up for the Lambda function.
     * @throws SubnetIPAddressLimitReachedException
     *         AWS Lambda was not able to set up VPC access for the Lambda function because one or more configured
     *         subnets has no available IP addresses.
     * @throws ENILimitReachedException
     *         AWS Lambda was not able to create an elastic network interface in the VPC, specified as part of Lambda
     *         function configuration, because the limit for network interfaces has been reached.
     * @throws EFSMountConnectivityException
     *         The function couldn't make a network connection to the configured file system.
     * @throws EFSMountFailureException
     *         The function couldn't mount the configured file system due to a permission or configuration issue.
     * @throws EFSMountTimeoutException
     *         The function was able to make a network connection to the configured file system, but the mount operation
     *         timed out.
     * @throws EFSIOException
     *         An error occured when reading from or writing to a connected file system.
     * @throws EC2ThrottledException
     *         AWS Lambda was throttled by Amazon EC2 during Lambda function initialization using the execution role
     *         provided for the Lambda function.
     * @throws EC2AccessDeniedException
     *         Need additional permissions to configure VPC settings.
     * @throws InvalidSubnetIDException
     *         The Subnet ID provided in the Lambda function VPC configuration is invalid.
     * @throws InvalidSecurityGroupIDException
     *         The Security Group ID provided in the Lambda function VPC configuration is invalid.
     * @throws InvalidZipFileException
     *         AWS Lambda could not unzip the deployment package.
     * @throws KMSDisabledException
     *         Lambda was unable to decrypt the environment variables because the KMS key used is disabled. Check the
     *         Lambda function's KMS key settings.
     * @throws KMSInvalidStateException
     *         Lambda was unable to decrypt the environment variables because the KMS key used is in an invalid state
     *         for Decrypt. Check the function's KMS key settings.
     * @throws KMSAccessDeniedException
     *         Lambda was unable to decrypt the environment variables because KMS access was denied. Check the Lambda
     *         function's KMS permissions.
     * @throws KMSNotFoundException
     *         Lambda was unable to decrypt the environment variables because the KMS key was not found. Check the
     *         function's KMS key settings.
     * @throws InvalidRuntimeException
     *         The runtime or runtime version specified is not supported.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotReadyException
     *         The function is inactive and its VPC connection is no longer available. Wait for the VPC connection to
     *         reestablish and try again.
     * @sample AWSLambda.Invoke
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public InvokeResult invoke(InvokeRequest request) {
        request = beforeClientExecution(request);
        return executeInvoke(request);
    }

    @SdkInternalApi
    final InvokeResult executeInvoke(InvokeRequest invokeRequest) {

        ExecutionContext executionContext = createExecutionContext(invokeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeRequest> request = null;
        Response<InvokeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(invokeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Invoke");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InvokeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(false), new InvokeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <important>
     * <p>
     * For asynchronous function invocation, use <a>Invoke</a>.
     * </p>
     * </important>
     * <p>
     * Invokes a function asynchronously.
     * </p>
     * 
     * @param invokeAsyncRequest
     * @return Result of the InvokeAsync operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidRequestContentException
     *         The request body could not be parsed as JSON.
     * @throws InvalidRuntimeException
     *         The runtime or runtime version specified is not supported.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.InvokeAsync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public InvokeAsyncResult invokeAsync(InvokeAsyncRequest request) {
        request = beforeClientExecution(request);
        return executeInvokeAsync(request);
    }

    @SdkInternalApi
    final InvokeAsyncResult executeInvokeAsync(InvokeAsyncRequest invokeAsyncRequest) {

        ExecutionContext executionContext = createExecutionContext(invokeAsyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeAsyncRequest> request = null;
        Response<InvokeAsyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeAsyncRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(invokeAsyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InvokeAsync");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

                request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, Boolean.TRUE);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InvokeAsyncResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InvokeAsyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">aliases</a> for
     * a Lambda function.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListAliases(request);
    }

    @SdkInternalApi
    final ListAliasesResult executeListAliases(ListAliasesRequest listAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuring-codesigning.html">code
     * signing configurations</a>. A request returns up to 10,000 configurations per call. You can use the
     * <code>MaxItems</code> parameter to return fewer configurations per call.
     * </p>
     * 
     * @param listCodeSigningConfigsRequest
     * @return Result of the ListCodeSigningConfigs operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @sample AWSLambda.ListCodeSigningConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListCodeSigningConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCodeSigningConfigsResult listCodeSigningConfigs(ListCodeSigningConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListCodeSigningConfigs(request);
    }

    @SdkInternalApi
    final ListCodeSigningConfigsResult executeListCodeSigningConfigs(ListCodeSigningConfigsRequest listCodeSigningConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCodeSigningConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCodeSigningConfigsRequest> request = null;
        Response<ListCodeSigningConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCodeSigningConfigsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCodeSigningConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCodeSigningConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCodeSigningConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCodeSigningConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists event source mappings. Specify an <code>EventSourceArn</code> to only show event source mappings for a
     * single event source.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @return Result of the ListEventSourceMappings operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.ListEventSourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListEventSourceMappingsResult listEventSourceMappings(ListEventSourceMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeListEventSourceMappings(request);
    }

    @SdkInternalApi
    final ListEventSourceMappingsResult executeListEventSourceMappings(ListEventSourceMappingsRequest listEventSourceMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventSourceMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventSourceMappingsRequest> request = null;
        Response<ListEventSourceMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventSourceMappingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEventSourceMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEventSourceMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventSourceMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEventSourceMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListEventSourceMappingsResult listEventSourceMappings() {
        return listEventSourceMappings(new ListEventSourceMappingsRequest());
    }

    /**
     * <p>
     * Retrieves a list of configurations for asynchronous invocation for a function.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param listFunctionEventInvokeConfigsRequest
     * @return Result of the ListFunctionEventInvokeConfigs operation returned by the service.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.ListFunctionEventInvokeConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionEventInvokeConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFunctionEventInvokeConfigsResult listFunctionEventInvokeConfigs(ListFunctionEventInvokeConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListFunctionEventInvokeConfigs(request);
    }

    @SdkInternalApi
    final ListFunctionEventInvokeConfigsResult executeListFunctionEventInvokeConfigs(ListFunctionEventInvokeConfigsRequest listFunctionEventInvokeConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFunctionEventInvokeConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFunctionEventInvokeConfigsRequest> request = null;
        Response<ListFunctionEventInvokeConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFunctionEventInvokeConfigsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listFunctionEventInvokeConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFunctionEventInvokeConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFunctionEventInvokeConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListFunctionEventInvokeConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Lambda functions, with the version-specific configuration of each. Lambda returns up to 50
     * functions per call.
     * </p>
     * <p>
     * Set <code>FunctionVersion</code> to <code>ALL</code> to include all published versions of each function in
     * addition to the unpublished version.
     * </p>
     * <note>
     * <p>
     * The <code>ListFunctions</code> action returns a subset of the <a>FunctionConfiguration</a> fields. To get the
     * additional fields (State, StateReasonCode, StateReason, LastUpdateStatus, LastUpdateStatusReason,
     * LastUpdateStatusReasonCode) for a function or version, use <a>GetFunction</a>.
     * </p>
     * </note>
     * 
     * @param listFunctionsRequest
     * @return Result of the ListFunctions operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @sample AWSLambda.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFunctionsResult listFunctions(ListFunctionsRequest request) {
        request = beforeClientExecution(request);
        return executeListFunctions(request);
    }

    @SdkInternalApi
    final ListFunctionsResult executeListFunctions(ListFunctionsRequest listFunctionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFunctionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFunctionsRequest> request = null;
        Response<ListFunctionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFunctionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFunctionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFunctions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFunctionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFunctionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListFunctionsResult listFunctions() {
        return listFunctions(new ListFunctionsRequest());
    }

    /**
     * <p>
     * List the functions that use the specified code signing configuration. You can use this method prior to deleting a
     * code signing configuration, to verify that no functions are using it.
     * </p>
     * 
     * @param listFunctionsByCodeSigningConfigRequest
     * @return Result of the ListFunctionsByCodeSigningConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AWSLambda.ListFunctionsByCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionsByCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFunctionsByCodeSigningConfigResult listFunctionsByCodeSigningConfig(ListFunctionsByCodeSigningConfigRequest request) {
        request = beforeClientExecution(request);
        return executeListFunctionsByCodeSigningConfig(request);
    }

    @SdkInternalApi
    final ListFunctionsByCodeSigningConfigResult executeListFunctionsByCodeSigningConfig(
            ListFunctionsByCodeSigningConfigRequest listFunctionsByCodeSigningConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(listFunctionsByCodeSigningConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFunctionsByCodeSigningConfigRequest> request = null;
        Response<ListFunctionsByCodeSigningConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFunctionsByCodeSigningConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listFunctionsByCodeSigningConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFunctionsByCodeSigningConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFunctionsByCodeSigningConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListFunctionsByCodeSigningConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the versions of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
     * Lambda layer</a>. Versions that have been deleted aren't listed. Specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * versions that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayerVersionsRequest
     * @return Result of the ListLayerVersions operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.ListLayerVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayerVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLayerVersionsResult listLayerVersions(ListLayerVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListLayerVersions(request);
    }

    @SdkInternalApi
    final ListLayerVersionsResult executeListLayerVersions(ListLayerVersionsRequest listLayerVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLayerVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLayerVersionsRequest> request = null;
        Response<ListLayerVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLayerVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLayerVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLayerVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLayerVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLayerVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layers</a> and
     * shows information about the latest version of each. Specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * layers that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayersRequest
     * @return Result of the ListLayers operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.ListLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLayersResult listLayers(ListLayersRequest request) {
        request = beforeClientExecution(request);
        return executeListLayers(request);
    }

    @SdkInternalApi
    final ListLayersResult executeListLayers(ListLayersRequest listLayersRequest) {

        ExecutionContext executionContext = createExecutionContext(listLayersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLayersRequest> request = null;
        Response<ListLayersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLayersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLayersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLayers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLayersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLayersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of provisioned concurrency configurations for a function.
     * </p>
     * 
     * @param listProvisionedConcurrencyConfigsRequest
     * @return Result of the ListProvisionedConcurrencyConfigs operation returned by the service.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.ListProvisionedConcurrencyConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListProvisionedConcurrencyConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProvisionedConcurrencyConfigsResult listProvisionedConcurrencyConfigs(ListProvisionedConcurrencyConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListProvisionedConcurrencyConfigs(request);
    }

    @SdkInternalApi
    final ListProvisionedConcurrencyConfigsResult executeListProvisionedConcurrencyConfigs(
            ListProvisionedConcurrencyConfigsRequest listProvisionedConcurrencyConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProvisionedConcurrencyConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisionedConcurrencyConfigsRequest> request = null;
        Response<ListProvisionedConcurrencyConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisionedConcurrencyConfigsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProvisionedConcurrencyConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProvisionedConcurrencyConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProvisionedConcurrencyConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProvisionedConcurrencyConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>. You can also
     * view tags with <a>GetFunction</a>.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">versions</a>,
     * with the version-specific configuration of each. Lambda returns up to 50 versions per call.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @return Result of the ListVersionsByFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.ListVersionsByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListVersionsByFunctionResult listVersionsByFunction(ListVersionsByFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeListVersionsByFunction(request);
    }

    @SdkInternalApi
    final ListVersionsByFunctionResult executeListVersionsByFunction(ListVersionsByFunctionRequest listVersionsByFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(listVersionsByFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVersionsByFunctionRequest> request = null;
        Response<ListVersionsByFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVersionsByFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVersionsByFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVersionsByFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVersionsByFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListVersionsByFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>
     * from a ZIP archive. Each time you call <code>PublishLayerVersion</code> with the same layer name, a new version
     * is created.
     * </p>
     * <p>
     * Add layers to your function with <a>CreateFunction</a> or <a>UpdateFunctionConfiguration</a>.
     * </p>
     * 
     * @param publishLayerVersionRequest
     * @return Result of the PublishLayerVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @sample AWSLambda.PublishLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PublishLayerVersionResult publishLayerVersion(PublishLayerVersionRequest request) {
        request = beforeClientExecution(request);
        return executePublishLayerVersion(request);
    }

    @SdkInternalApi
    final PublishLayerVersionResult executePublishLayerVersion(PublishLayerVersionRequest publishLayerVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(publishLayerVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishLayerVersionRequest> request = null;
        Response<PublishLayerVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishLayerVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(publishLayerVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PublishLayerVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishLayerVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PublishLayerVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">version</a> from the
     * current code and configuration of a function. Use versions to create a snapshot of your function code and
     * configuration that doesn't change.
     * </p>
     * <p>
     * AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last
     * version. Use <a>UpdateFunctionCode</a> or <a>UpdateFunctionConfiguration</a> to update the function before
     * publishing a version.
     * </p>
     * <p>
     * Clients can invoke versions directly or with an alias. To create an alias, use <a>CreateAlias</a>.
     * </p>
     * 
     * @param publishVersionRequest
     * @return Result of the PublishVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.PublishVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PublishVersionResult publishVersion(PublishVersionRequest request) {
        request = beforeClientExecution(request);
        return executePublishVersion(request);
    }

    @SdkInternalApi
    final PublishVersionResult executePublishVersion(PublishVersionRequest publishVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(publishVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishVersionRequest> request = null;
        Response<PublishVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(publishVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PublishVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PublishVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the code signing configuration for the function. Changes to the code signing configuration take effect the
     * next time a user tries to deploy a code package to the function.
     * </p>
     * 
     * @param putFunctionCodeSigningConfigRequest
     * @return Result of the PutFunctionCodeSigningConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws CodeSigningConfigNotFoundException
     *         The specified code signing configuration does not exist.
     * @sample AWSLambda.PutFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutFunctionCodeSigningConfigResult putFunctionCodeSigningConfig(PutFunctionCodeSigningConfigRequest request) {
        request = beforeClientExecution(request);
        return executePutFunctionCodeSigningConfig(request);
    }

    @SdkInternalApi
    final PutFunctionCodeSigningConfigResult executePutFunctionCodeSigningConfig(PutFunctionCodeSigningConfigRequest putFunctionCodeSigningConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(putFunctionCodeSigningConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFunctionCodeSigningConfigRequest> request = null;
        Response<PutFunctionCodeSigningConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFunctionCodeSigningConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putFunctionCodeSigningConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutFunctionCodeSigningConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFunctionCodeSigningConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutFunctionCodeSigningConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency
     * level.
     * </p>
     * <p>
     * Concurrency settings apply to the function as a whole, including all published versions and the unpublished
     * version. Reserving concurrency both ensures that your function has capacity to process the specified number of
     * events simultaneously, and prevents it from scaling beyond that level. Use <a>GetFunction</a> to see the current
     * setting for a function.
     * </p>
     * <p>
     * Use <a>GetAccountSettings</a> to see your Regional concurrency limit. You can reserve concurrency for as many
     * functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that
     * aren't configured with a per-function limit. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param putFunctionConcurrencyRequest
     * @return Result of the PutFunctionConcurrency operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.PutFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutFunctionConcurrencyResult putFunctionConcurrency(PutFunctionConcurrencyRequest request) {
        request = beforeClientExecution(request);
        return executePutFunctionConcurrency(request);
    }

    @SdkInternalApi
    final PutFunctionConcurrencyResult executePutFunctionConcurrency(PutFunctionConcurrencyRequest putFunctionConcurrencyRequest) {

        ExecutionContext executionContext = createExecutionContext(putFunctionConcurrencyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFunctionConcurrencyRequest> request = null;
        Response<PutFunctionConcurrencyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFunctionConcurrencyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putFunctionConcurrencyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutFunctionConcurrency");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFunctionConcurrencyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutFunctionConcurrencyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures options for <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html">asynchronous
     * invocation</a> on a function, version, or alias. If a configuration already exists for a function, version, or
     * alias, this operation overwrites it. If you exclude any settings, they are removed. To set one option without
     * affecting existing settings for other options, use <a>UpdateFunctionEventInvokeConfig</a>.
     * </p>
     * <p>
     * By default, Lambda retries an asynchronous invocation twice if the function returns an error. It retains events
     * in a queue for up to six hours. When an event fails all processing attempts or stays in the asynchronous
     * invocation queue for too long, Lambda discards it. To retain discarded events, configure a dead-letter queue with
     * <a>UpdateFunctionConfiguration</a>.
     * </p>
     * <p>
     * To send an invocation record to a queue, topic, function, or event bus, specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations"
     * >destination</a>. You can configure separate destinations for successful invocations (on-success) and events that
     * fail all processing attempts (on-failure). You can configure destinations in addition to or instead of a
     * dead-letter queue.
     * </p>
     * 
     * @param putFunctionEventInvokeConfigRequest
     * @return Result of the PutFunctionEventInvokeConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.PutFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutFunctionEventInvokeConfigResult putFunctionEventInvokeConfig(PutFunctionEventInvokeConfigRequest request) {
        request = beforeClientExecution(request);
        return executePutFunctionEventInvokeConfig(request);
    }

    @SdkInternalApi
    final PutFunctionEventInvokeConfigResult executePutFunctionEventInvokeConfig(PutFunctionEventInvokeConfigRequest putFunctionEventInvokeConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(putFunctionEventInvokeConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFunctionEventInvokeConfigRequest> request = null;
        Response<PutFunctionEventInvokeConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFunctionEventInvokeConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putFunctionEventInvokeConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutFunctionEventInvokeConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFunctionEventInvokeConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutFunctionEventInvokeConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a provisioned concurrency configuration to a function's alias or version.
     * </p>
     * 
     * @param putProvisionedConcurrencyConfigRequest
     * @return Result of the PutProvisionedConcurrencyConfig operation returned by the service.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.PutProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutProvisionedConcurrencyConfigResult putProvisionedConcurrencyConfig(PutProvisionedConcurrencyConfigRequest request) {
        request = beforeClientExecution(request);
        return executePutProvisionedConcurrencyConfig(request);
    }

    @SdkInternalApi
    final PutProvisionedConcurrencyConfigResult executePutProvisionedConcurrencyConfig(
            PutProvisionedConcurrencyConfigRequest putProvisionedConcurrencyConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(putProvisionedConcurrencyConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutProvisionedConcurrencyConfigRequest> request = null;
        Response<PutProvisionedConcurrencyConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutProvisionedConcurrencyConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putProvisionedConcurrencyConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutProvisionedConcurrencyConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutProvisionedConcurrencyConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutProvisionedConcurrencyConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a statement from the permissions policy for a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. For more
     * information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param removeLayerVersionPermissionRequest
     * @return Result of the RemoveLayerVersionPermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.RemoveLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemoveLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveLayerVersionPermissionResult removeLayerVersionPermission(RemoveLayerVersionPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveLayerVersionPermission(request);
    }

    @SdkInternalApi
    final RemoveLayerVersionPermissionResult executeRemoveLayerVersionPermission(RemoveLayerVersionPermissionRequest removeLayerVersionPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(removeLayerVersionPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveLayerVersionPermissionRequest> request = null;
        Response<RemoveLayerVersionPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveLayerVersionPermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeLayerVersionPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveLayerVersionPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveLayerVersionPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveLayerVersionPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from
     * the output of <a>GetPolicy</a>.
     * </p>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeRemovePermission(request);
    }

    @SdkInternalApi
    final RemovePermissionResult executeRemovePermission(RemovePermissionRequest removePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemovePermissionRequest> request = null;
        Response<RemovePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemovePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemovePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemovePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemovePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to a function.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> from a function.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param updateAliasRequest
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @sample AWSLambda.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAliasResult updateAlias(UpdateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAlias(request);
    }

    @SdkInternalApi
    final UpdateAliasResult executeUpdateAlias(UpdateAliasRequest updateAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAliasRequest> request = null;
        Response<UpdateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the code signing configuration. Changes to the code signing configuration take effect the next time a user
     * tries to deploy a code package to the function.
     * </p>
     * 
     * @param updateCodeSigningConfigRequest
     * @return Result of the UpdateCodeSigningConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AWSLambda.UpdateCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateCodeSigningConfigResult updateCodeSigningConfig(UpdateCodeSigningConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCodeSigningConfig(request);
    }

    @SdkInternalApi
    final UpdateCodeSigningConfigResult executeUpdateCodeSigningConfig(UpdateCodeSigningConfigRequest updateCodeSigningConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCodeSigningConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCodeSigningConfigRequest> request = null;
        Response<UpdateCodeSigningConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCodeSigningConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCodeSigningConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCodeSigningConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCodeSigningConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCodeSigningConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
     * resume later from the same location.
     * </p>
     * <p>
     * The following error handling options are only available for stream sources (DynamoDB and Kinesis):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BisectBatchOnFunctionError</code> - If the function returns an error, split the batch in two and retry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationConfig</code> - Send discarded records to an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRecordAgeInSeconds</code> - Discard records older than the specified age. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRetryAttempts</code> - Discard records after the specified number of retries. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParallelizationFactor</code> - Process multiple batches from each shard concurrently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateEventSourceMappingRequest
     * @return Result of the UpdateEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to update an
     *         EventSource Mapping in CREATING, or tried to delete a EventSource mapping currently in the UPDATING
     *         state.
     * @sample AWSLambda.UpdateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEventSourceMappingResult updateEventSourceMapping(UpdateEventSourceMappingRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEventSourceMapping(request);
    }

    @SdkInternalApi
    final UpdateEventSourceMappingResult executeUpdateEventSourceMapping(UpdateEventSourceMappingRequest updateEventSourceMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEventSourceMappingRequest> request = null;
        Response<UpdateEventSourceMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEventSourceMappingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEventSourceMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEventSourceMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEventSourceMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Lambda function's code. If code signing is enabled for the function, the code package must be signed by
     * a trusted publisher. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-trustedcode.html">Configuring code signing</a>.
     * </p>
     * <p>
     * The function's code is locked when you publish a version. You can't modify the code of a published version, only
     * the unpublished version.
     * </p>
     * <note>
     * <p>
     * For a function defined as a container image, Lambda resolves the image tag to an image digest. In Amazon ECR, if
     * you update the image tag to a new image, Lambda does not automatically update the function.
     * </p>
     * </note>
     * 
     * @param updateFunctionCodeRequest
     * @return Result of the UpdateFunctionCode operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws CodeVerificationFailedException
     *         The code signature failed one or more of the validation checks for signature mismatch or expiry, and the
     *         code signing policy is set to ENFORCE. Lambda blocks the deployment.
     * @throws InvalidCodeSignatureException
     *         The code signature failed the integrity check. Lambda always blocks deployment if the integrity check
     *         fails, even if code signing policy is set to WARN.
     * @throws CodeSigningConfigNotFoundException
     *         The specified code signing configuration does not exist.
     * @sample AWSLambda.UpdateFunctionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFunctionCode(request);
    }

    @SdkInternalApi
    final UpdateFunctionCodeResult executeUpdateFunctionCode(UpdateFunctionCodeRequest updateFunctionCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFunctionCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFunctionCodeRequest> request = null;
        Response<UpdateFunctionCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFunctionCodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFunctionCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFunctionCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFunctionCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFunctionCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modify the version-specific settings of a Lambda function.
     * </p>
     * <p>
     * When you update a function, Lambda provisions an instance of the function and its supporting resources. If your
     * function connects to a VPC, this process can take a minute. During this time, you can't modify the function, but
     * you can still invoke it. The <code>LastUpdateStatus</code>, <code>LastUpdateStatusReason</code>, and
     * <code>LastUpdateStatusReasonCode</code> fields in the response from <a>GetFunctionConfiguration</a> indicate when
     * the update is complete and the function is processing events with the new configuration. For more information,
     * see <a href="https://docs.aws.amazon.com/lambda/latest/dg/functions-states.html">Function States</a>.
     * </p>
     * <p>
     * These settings can vary between versions of a function and are locked when you publish a version. You can't
     * modify the configuration of a published version, only the unpublished version.
     * </p>
     * <p>
     * To configure function concurrency, use <a>PutFunctionConcurrency</a>. To grant invoke permissions to an account
     * or AWS service, use <a>AddPermission</a>.
     * </p>
     * 
     * @param updateFunctionConfigurationRequest
     * @return Result of the UpdateFunctionConfiguration operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @throws ResourceConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @throws CodeVerificationFailedException
     *         The code signature failed one or more of the validation checks for signature mismatch or expiry, and the
     *         code signing policy is set to ENFORCE. Lambda blocks the deployment.
     * @throws InvalidCodeSignatureException
     *         The code signature failed the integrity check. Lambda always blocks deployment if the integrity check
     *         fails, even if code signing policy is set to WARN.
     * @throws CodeSigningConfigNotFoundException
     *         The specified code signing configuration does not exist.
     * @sample AWSLambda.UpdateFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFunctionConfiguration(request);
    }

    @SdkInternalApi
    final UpdateFunctionConfigurationResult executeUpdateFunctionConfiguration(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFunctionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFunctionConfigurationRequest> request = null;
        Response<UpdateFunctionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFunctionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFunctionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFunctionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFunctionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateFunctionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param updateFunctionEventInvokeConfigRequest
     * @return Result of the UpdateFunctionEventInvokeConfig operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid.
     * @throws TooManyRequestsException
     *         The request throughput limit was exceeded.
     * @sample AWSLambda.UpdateFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFunctionEventInvokeConfigResult updateFunctionEventInvokeConfig(UpdateFunctionEventInvokeConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFunctionEventInvokeConfig(request);
    }

    @SdkInternalApi
    final UpdateFunctionEventInvokeConfigResult executeUpdateFunctionEventInvokeConfig(
            UpdateFunctionEventInvokeConfigRequest updateFunctionEventInvokeConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFunctionEventInvokeConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFunctionEventInvokeConfigRequest> request = null;
        Response<UpdateFunctionEventInvokeConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFunctionEventInvokeConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFunctionEventInvokeConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lambda");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFunctionEventInvokeConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFunctionEventInvokeConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateFunctionEventInvokeConfigResultJsonUnmarshaller());
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
    public AWSLambdaWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSLambdaWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
