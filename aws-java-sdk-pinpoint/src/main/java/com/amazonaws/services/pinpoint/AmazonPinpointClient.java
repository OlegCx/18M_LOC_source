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
package com.amazonaws.services.pinpoint;

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

import com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.services.pinpoint.model.transform.*;

/**
 * Client for accessing Amazon Pinpoint. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Doc Engage API - Amazon Pinpoint API
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointClient extends AmazonWebServiceClient implements AmazonPinpoint {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPinpoint.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mobiletargeting";

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
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpoint.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpoint.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MethodNotAllowedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpoint.model.transform.MethodNotAllowedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpoint.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PayloadTooLargeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpoint.model.transform.PayloadTooLargeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpoint.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpoint.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpoint.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pinpoint.model.AmazonPinpointException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     * @deprecated use {@link AmazonPinpointClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonPinpointClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonPinpointClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPinpointClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonPinpointClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonPinpointClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonPinpointClientBuilder builder() {
        return AmazonPinpointClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://pinpoint.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pinpoint/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pinpoint/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAppResult createApp(CreateAppRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApp(request);
    }

    @SdkInternalApi
    final CreateAppResult executeCreateApp(CreateAppRequest createAppRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new campaign for an application or updates the settings of an existing campaign for an application.
     * </p>
     * 
     * @param createCampaignRequest
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCampaignResult createCampaign(CreateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCampaign(request);
    }

    @SdkInternalApi
    final CreateCampaignResult executeCreateCampaign(CreateCampaignRequest createCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(createCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCampaignRequest> request = null;
        Response<CreateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param createEmailTemplateRequest
     * @return Result of the CreateEmailTemplate operation returned by the service.
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @sample AmazonPinpoint.CreateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateEmailTemplateResult createEmailTemplate(CreateEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEmailTemplate(request);
    }

    @SdkInternalApi
    final CreateEmailTemplateResult executeCreateEmailTemplate(CreateEmailTemplateRequest createEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEmailTemplateRequest> request = null;
        Response<CreateEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an export job for an application.
     * </p>
     * 
     * @param createExportJobRequest
     * @return Result of the CreateExportJob operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateExportJobResult createExportJob(CreateExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExportJob(request);
    }

    @SdkInternalApi
    final CreateExportJobResult executeCreateExportJob(CreateExportJobRequest createExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExportJobRequest> request = null;
        Response<CreateExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an import job for an application.
     * </p>
     * 
     * @param createImportJobRequest
     * @return Result of the CreateImportJob operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateImportJobResult createImportJob(CreateImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImportJob(request);
    }

    @SdkInternalApi
    final CreateImportJobResult executeCreateImportJob(CreateImportJobRequest createImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImportJobRequest> request = null;
        Response<CreateImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a journey for an application.
     * </p>
     * 
     * @param createJourneyRequest
     * @return Result of the CreateJourney operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateJourney" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateJourneyResult createJourney(CreateJourneyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJourney(request);
    }

    @SdkInternalApi
    final CreateJourneyResult executeCreateJourney(CreateJourneyRequest createJourneyRequest) {

        ExecutionContext executionContext = createExecutionContext(createJourneyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJourneyRequest> request = null;
        Response<CreateJourneyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJourneyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJourneyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJourney");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJourneyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJourneyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a message template for messages that are sent through a push notification channel.
     * </p>
     * 
     * @param createPushTemplateRequest
     * @return Result of the CreatePushTemplate operation returned by the service.
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @sample AmazonPinpoint.CreatePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreatePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePushTemplateResult createPushTemplate(CreatePushTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePushTemplate(request);
    }

    @SdkInternalApi
    final CreatePushTemplateResult executeCreatePushTemplate(CreatePushTemplateRequest createPushTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createPushTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePushTemplateRequest> request = null;
        Response<CreatePushTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePushTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPushTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePushTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePushTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePushTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param createRecommenderConfigurationRequest
     * @return Result of the CreateRecommenderConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRecommenderConfigurationResult createRecommenderConfiguration(CreateRecommenderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRecommenderConfiguration(request);
    }

    @SdkInternalApi
    final CreateRecommenderConfigurationResult executeCreateRecommenderConfiguration(CreateRecommenderConfigurationRequest createRecommenderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createRecommenderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRecommenderConfigurationRequest> request = null;
        Response<CreateRecommenderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRecommenderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRecommenderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRecommenderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRecommenderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRecommenderConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration, dimension, and other settings for an
     * existing segment that's associated with an application.
     * </p>
     * 
     * @param createSegmentRequest
     * @return Result of the CreateSegment operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSegmentResult createSegment(CreateSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSegment(request);
    }

    @SdkInternalApi
    final CreateSegmentResult executeCreateSegment(CreateSegmentRequest createSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSegmentRequest> request = null;
        Response<CreateSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSegment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSegmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param createSmsTemplateRequest
     * @return Result of the CreateSmsTemplate operation returned by the service.
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @sample AmazonPinpoint.CreateSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSmsTemplateResult createSmsTemplate(CreateSmsTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSmsTemplate(request);
    }

    @SdkInternalApi
    final CreateSmsTemplateResult executeCreateSmsTemplate(CreateSmsTemplateRequest createSmsTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createSmsTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSmsTemplateRequest> request = null;
        Response<CreateSmsTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSmsTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSmsTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSmsTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSmsTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSmsTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param createVoiceTemplateRequest
     * @return Result of the CreateVoiceTemplate operation returned by the service.
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @sample AmazonPinpoint.CreateVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateVoiceTemplateResult createVoiceTemplate(CreateVoiceTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVoiceTemplate(request);
    }

    @SdkInternalApi
    final CreateVoiceTemplateResult executeCreateVoiceTemplate(CreateVoiceTemplateRequest createVoiceTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createVoiceTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVoiceTemplateRequest> request = null;
        Response<CreateVoiceTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVoiceTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVoiceTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVoiceTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVoiceTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVoiceTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the ADM channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteAdmChannelRequest
     * @return Result of the DeleteAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAdmChannelResult deleteAdmChannel(DeleteAdmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAdmChannel(request);
    }

    @SdkInternalApi
    final DeleteAdmChannelResult executeDeleteAdmChannel(DeleteAdmChannelRequest deleteAdmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAdmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAdmChannelRequest> request = null;
        Response<DeleteAdmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAdmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAdmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAdmChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAdmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAdmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the APNs channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsChannelRequest
     * @return Result of the DeleteApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteApnsChannelResult deleteApnsChannel(DeleteApnsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApnsChannel(request);
    }

    @SdkInternalApi
    final DeleteApnsChannelResult executeDeleteApnsChannel(DeleteApnsChannelRequest deleteApnsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsChannelRequest> request = null;
        Response<DeleteApnsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApnsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApnsChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApnsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApnsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsSandboxChannelRequest
     * @return Result of the DeleteApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApnsSandboxChannelResult deleteApnsSandboxChannel(DeleteApnsSandboxChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApnsSandboxChannel(request);
    }

    @SdkInternalApi
    final DeleteApnsSandboxChannelResult executeDeleteApnsSandboxChannel(DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApnsSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsSandboxChannelRequest> request = null;
        Response<DeleteApnsSandboxChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsSandboxChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApnsSandboxChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApnsSandboxChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApnsSandboxChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApnsSandboxChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipChannelRequest
     * @return Result of the DeleteApnsVoipChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteApnsVoipChannelResult deleteApnsVoipChannel(DeleteApnsVoipChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApnsVoipChannel(request);
    }

    @SdkInternalApi
    final DeleteApnsVoipChannelResult executeDeleteApnsVoipChannel(DeleteApnsVoipChannelRequest deleteApnsVoipChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApnsVoipChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsVoipChannelRequest> request = null;
        Response<DeleteApnsVoipChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsVoipChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApnsVoipChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApnsVoipChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApnsVoipChannelResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteApnsVoipChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipSandboxChannelRequest
     * @return Result of the DeleteApnsVoipSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApnsVoipSandboxChannelResult deleteApnsVoipSandboxChannel(DeleteApnsVoipSandboxChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApnsVoipSandboxChannel(request);
    }

    @SdkInternalApi
    final DeleteApnsVoipSandboxChannelResult executeDeleteApnsVoipSandboxChannel(DeleteApnsVoipSandboxChannelRequest deleteApnsVoipSandboxChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApnsVoipSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsVoipSandboxChannelRequest> request = null;
        Response<DeleteApnsVoipSandboxChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsVoipSandboxChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApnsVoipSandboxChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApnsVoipSandboxChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApnsVoipSandboxChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApnsVoipSandboxChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAppResult deleteApp(DeleteAppRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApp(request);
    }

    @SdkInternalApi
    final DeleteAppResult executeDeleteApp(DeleteAppRequest deleteAppRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppRequest> request = null;
        Response<DeleteAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the Baidu channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteBaiduChannelRequest
     * @return Result of the DeleteBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBaiduChannelResult deleteBaiduChannel(DeleteBaiduChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBaiduChannel(request);
    }

    @SdkInternalApi
    final DeleteBaiduChannelResult executeDeleteBaiduChannel(DeleteBaiduChannelRequest deleteBaiduChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBaiduChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBaiduChannelRequest> request = null;
        Response<DeleteBaiduChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBaiduChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBaiduChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBaiduChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBaiduChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBaiduChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a campaign from an application.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCampaignResult deleteCampaign(DeleteCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCampaign(request);
    }

    @SdkInternalApi
    final DeleteCampaignResult executeDeleteCampaign(DeleteCampaignRequest deleteCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCampaignRequest> request = null;
        Response<DeleteCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the email channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteEmailChannelRequest
     * @return Result of the DeleteEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEmailChannelResult deleteEmailChannel(DeleteEmailChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEmailChannel(request);
    }

    @SdkInternalApi
    final DeleteEmailChannelResult executeDeleteEmailChannel(DeleteEmailChannelRequest deleteEmailChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEmailChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEmailChannelRequest> request = null;
        Response<DeleteEmailChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEmailChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEmailChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEmailChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEmailChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEmailChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a message template for messages that were sent through the email channel.
     * </p>
     * 
     * @param deleteEmailTemplateRequest
     * @return Result of the DeleteEmailTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEmailTemplateResult deleteEmailTemplate(DeleteEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEmailTemplate(request);
    }

    @SdkInternalApi
    final DeleteEmailTemplateResult executeDeleteEmailTemplate(DeleteEmailTemplateRequest deleteEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEmailTemplateRequest> request = null;
        Response<DeleteEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an endpoint from an application.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEndpoint(request);
    }

    @SdkInternalApi
    final DeleteEndpointResult executeDeleteEndpoint(DeleteEndpointRequest deleteEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<DeleteEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the event stream for an application.
     * </p>
     * 
     * @param deleteEventStreamRequest
     * @return Result of the DeleteEventStream operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEventStreamResult deleteEventStream(DeleteEventStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventStream(request);
    }

    @SdkInternalApi
    final DeleteEventStreamResult executeDeleteEventStream(DeleteEventStreamRequest deleteEventStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventStreamRequest> request = null;
        Response<DeleteEventStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEventStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the GCM channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteGcmChannelRequest
     * @return Result of the DeleteGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGcmChannelResult deleteGcmChannel(DeleteGcmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGcmChannel(request);
    }

    @SdkInternalApi
    final DeleteGcmChannelResult executeDeleteGcmChannel(DeleteGcmChannelRequest deleteGcmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGcmChannelRequest> request = null;
        Response<DeleteGcmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGcmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGcmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGcmChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGcmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGcmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a journey from an application.
     * </p>
     * 
     * @param deleteJourneyRequest
     * @return Result of the DeleteJourney operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteJourney" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJourneyResult deleteJourney(DeleteJourneyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJourney(request);
    }

    @SdkInternalApi
    final DeleteJourneyResult executeDeleteJourney(DeleteJourneyRequest deleteJourneyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJourneyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJourneyRequest> request = null;
        Response<DeleteJourneyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJourneyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJourneyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJourney");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJourneyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJourneyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a message template for messages that were sent through a push notification channel.
     * </p>
     * 
     * @param deletePushTemplateRequest
     * @return Result of the DeletePushTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeletePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeletePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePushTemplateResult deletePushTemplate(DeletePushTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePushTemplate(request);
    }

    @SdkInternalApi
    final DeletePushTemplateResult executeDeletePushTemplate(DeletePushTemplateRequest deletePushTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePushTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePushTemplateRequest> request = null;
        Response<DeletePushTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePushTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePushTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePushTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePushTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePushTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param deleteRecommenderConfigurationRequest
     * @return Result of the DeleteRecommenderConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRecommenderConfigurationResult deleteRecommenderConfiguration(DeleteRecommenderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRecommenderConfiguration(request);
    }

    @SdkInternalApi
    final DeleteRecommenderConfigurationResult executeDeleteRecommenderConfiguration(DeleteRecommenderConfigurationRequest deleteRecommenderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRecommenderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRecommenderConfigurationRequest> request = null;
        Response<DeleteRecommenderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRecommenderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRecommenderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRecommenderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRecommenderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRecommenderConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a segment from an application.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @return Result of the DeleteSegment operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSegmentResult deleteSegment(DeleteSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSegment(request);
    }

    @SdkInternalApi
    final DeleteSegmentResult executeDeleteSegment(DeleteSegmentRequest deleteSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSegmentRequest> request = null;
        Response<DeleteSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSegment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSegmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the SMS channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteSmsChannelRequest
     * @return Result of the DeleteSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSmsChannel(request);
    }

    @SdkInternalApi
    final DeleteSmsChannelResult executeDeleteSmsChannel(DeleteSmsChannelRequest deleteSmsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSmsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSmsChannelRequest> request = null;
        Response<DeleteSmsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSmsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSmsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSmsChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSmsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSmsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a message template for messages that were sent through the SMS channel.
     * </p>
     * 
     * @param deleteSmsTemplateRequest
     * @return Result of the DeleteSmsTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSmsTemplateResult deleteSmsTemplate(DeleteSmsTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSmsTemplate(request);
    }

    @SdkInternalApi
    final DeleteSmsTemplateResult executeDeleteSmsTemplate(DeleteSmsTemplateRequest deleteSmsTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSmsTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSmsTemplateRequest> request = null;
        Response<DeleteSmsTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSmsTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSmsTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSmsTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSmsTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSmsTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param deleteUserEndpointsRequest
     * @return Result of the DeleteUserEndpoints operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteUserEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteUserEndpointsResult deleteUserEndpoints(DeleteUserEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserEndpoints(request);
    }

    @SdkInternalApi
    final DeleteUserEndpointsResult executeDeleteUserEndpoints(DeleteUserEndpointsRequest deleteUserEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserEndpointsRequest> request = null;
        Response<DeleteUserEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the voice channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteVoiceChannelRequest
     * @return Result of the DeleteVoiceChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteVoiceChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVoiceChannelResult deleteVoiceChannel(DeleteVoiceChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceChannel(request);
    }

    @SdkInternalApi
    final DeleteVoiceChannelResult executeDeleteVoiceChannel(DeleteVoiceChannelRequest deleteVoiceChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceChannelRequest> request = null;
        Response<DeleteVoiceChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVoiceChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVoiceChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a message template for messages that were sent through the voice channel.
     * </p>
     * 
     * @param deleteVoiceTemplateRequest
     * @return Result of the DeleteVoiceTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVoiceTemplateResult deleteVoiceTemplate(DeleteVoiceTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceTemplate(request);
    }

    @SdkInternalApi
    final DeleteVoiceTemplateResult executeDeleteVoiceTemplate(DeleteVoiceTemplateRequest deleteVoiceTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceTemplateRequest> request = null;
        Response<DeleteVoiceTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVoiceTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVoiceTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the ADM channel for an application.
     * </p>
     * 
     * @param getAdmChannelRequest
     * @return Result of the GetAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAdmChannelResult getAdmChannel(GetAdmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetAdmChannel(request);
    }

    @SdkInternalApi
    final GetAdmChannelResult executeGetAdmChannel(GetAdmChannelRequest getAdmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getAdmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAdmChannelRequest> request = null;
        Response<GetAdmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAdmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAdmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAdmChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAdmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAdmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs channel for an application.
     * </p>
     * 
     * @param getApnsChannelRequest
     * @return Result of the GetApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetApnsChannelResult getApnsChannel(GetApnsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetApnsChannel(request);
    }

    @SdkInternalApi
    final GetApnsChannelResult executeGetApnsChannel(GetApnsChannelRequest getApnsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsChannelRequest> request = null;
        Response<GetApnsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApnsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApnsChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApnsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApnsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs sandbox channel for an application.
     * </p>
     * 
     * @param getApnsSandboxChannelRequest
     * @return Result of the GetApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsSandboxChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetApnsSandboxChannelResult getApnsSandboxChannel(GetApnsSandboxChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetApnsSandboxChannel(request);
    }

    @SdkInternalApi
    final GetApnsSandboxChannelResult executeGetApnsSandboxChannel(GetApnsSandboxChannelRequest getApnsSandboxChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getApnsSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsSandboxChannelRequest> request = null;
        Response<GetApnsSandboxChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsSandboxChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApnsSandboxChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApnsSandboxChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApnsSandboxChannelResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetApnsSandboxChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP channel for an application.
     * </p>
     * 
     * @param getApnsVoipChannelRequest
     * @return Result of the GetApnsVoipChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetApnsVoipChannelResult getApnsVoipChannel(GetApnsVoipChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetApnsVoipChannel(request);
    }

    @SdkInternalApi
    final GetApnsVoipChannelResult executeGetApnsVoipChannel(GetApnsVoipChannelRequest getApnsVoipChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getApnsVoipChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsVoipChannelRequest> request = null;
        Response<GetApnsVoipChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsVoipChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApnsVoipChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApnsVoipChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApnsVoipChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApnsVoipChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.
     * </p>
     * 
     * @param getApnsVoipSandboxChannelRequest
     * @return Result of the GetApnsVoipSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApnsVoipSandboxChannelResult getApnsVoipSandboxChannel(GetApnsVoipSandboxChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetApnsVoipSandboxChannel(request);
    }

    @SdkInternalApi
    final GetApnsVoipSandboxChannelResult executeGetApnsVoipSandboxChannel(GetApnsVoipSandboxChannelRequest getApnsVoipSandboxChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getApnsVoipSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsVoipSandboxChannelRequest> request = null;
        Response<GetApnsVoipSandboxChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsVoipSandboxChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getApnsVoipSandboxChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApnsVoipSandboxChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApnsVoipSandboxChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApnsVoipSandboxChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an application.
     * </p>
     * 
     * @param getAppRequest
     * @return Result of the GetApp operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAppResult getApp(GetAppRequest request) {
        request = beforeClientExecution(request);
        return executeGetApp(request);
    }

    @SdkInternalApi
    final GetAppResult executeGetApp(GetAppRequest getAppRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppRequest> request = null;
        Response<GetAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.
     * </p>
     * 
     * @param getApplicationDateRangeKpiRequest
     * @return Result of the GetApplicationDateRangeKpi operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApplicationDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationDateRangeKpiResult getApplicationDateRangeKpi(GetApplicationDateRangeKpiRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationDateRangeKpi(request);
    }

    @SdkInternalApi
    final GetApplicationDateRangeKpiResult executeGetApplicationDateRangeKpi(GetApplicationDateRangeKpiRequest getApplicationDateRangeKpiRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationDateRangeKpiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationDateRangeKpiRequest> request = null;
        Response<GetApplicationDateRangeKpiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationDateRangeKpiRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getApplicationDateRangeKpiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationDateRangeKpi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationDateRangeKpiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationDateRangeKpiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the settings for an application.
     * </p>
     * 
     * @param getApplicationSettingsRequest
     * @return Result of the GetApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationSettingsResult getApplicationSettings(GetApplicationSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationSettings(request);
    }

    @SdkInternalApi
    final GetApplicationSettingsResult executeGetApplicationSettings(GetApplicationSettingsRequest getApplicationSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationSettingsRequest> request = null;
        Response<GetApplicationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about all the applications that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param getAppsRequest
     * @return Result of the GetApps operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAppsResult getApps(GetAppsRequest request) {
        request = beforeClientExecution(request);
        return executeGetApps(request);
    }

    @SdkInternalApi
    final GetAppsResult executeGetApps(GetAppsRequest getAppsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppsRequest> request = null;
        Response<GetAppsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the Baidu channel for an application.
     * </p>
     * 
     * @param getBaiduChannelRequest
     * @return Result of the GetBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetBaiduChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetBaiduChannel(request);
    }

    @SdkInternalApi
    final GetBaiduChannelResult executeGetBaiduChannel(GetBaiduChannelRequest getBaiduChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getBaiduChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBaiduChannelRequest> request = null;
        Response<GetBaiduChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBaiduChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBaiduChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBaiduChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBaiduChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBaiduChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @return Result of the GetCampaign operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCampaignResult getCampaign(GetCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaign(request);
    }

    @SdkInternalApi
    final GetCampaignResult executeGetCampaign(GetCampaignRequest getCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignRequest> request = null;
        Response<GetCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about all the activities for a campaign.
     * </p>
     * 
     * @param getCampaignActivitiesRequest
     * @return Result of the GetCampaignActivities operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaignActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCampaignActivitiesResult getCampaignActivities(GetCampaignActivitiesRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignActivities(request);
    }

    @SdkInternalApi
    final GetCampaignActivitiesResult executeGetCampaignActivities(GetCampaignActivitiesRequest getCampaignActivitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignActivitiesRequest> request = null;
        Response<GetCampaignActivitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignActivitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignActivitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaignActivities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignActivitiesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetCampaignActivitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.
     * </p>
     * 
     * @param getCampaignDateRangeKpiRequest
     * @return Result of the GetCampaignDateRangeKpi operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaignDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCampaignDateRangeKpiResult getCampaignDateRangeKpi(GetCampaignDateRangeKpiRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignDateRangeKpi(request);
    }

    @SdkInternalApi
    final GetCampaignDateRangeKpiResult executeGetCampaignDateRangeKpi(GetCampaignDateRangeKpiRequest getCampaignDateRangeKpiRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignDateRangeKpiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignDateRangeKpiRequest> request = null;
        Response<GetCampaignDateRangeKpiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignDateRangeKpiRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCampaignDateRangeKpiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaignDateRangeKpi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignDateRangeKpiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCampaignDateRangeKpiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a specific version of a campaign.
     * </p>
     * 
     * @param getCampaignVersionRequest
     * @return Result of the GetCampaignVersion operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaignVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCampaignVersionResult getCampaignVersion(GetCampaignVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignVersion(request);
    }

    @SdkInternalApi
    final GetCampaignVersionResult executeGetCampaignVersion(GetCampaignVersionRequest getCampaignVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignVersionRequest> request = null;
        Response<GetCampaignVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaignVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all versions of a campaign.
     * </p>
     * 
     * @param getCampaignVersionsRequest
     * @return Result of the GetCampaignVersions operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaignVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCampaignVersionsResult getCampaignVersions(GetCampaignVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignVersions(request);
    }

    @SdkInternalApi
    final GetCampaignVersionsResult executeGetCampaignVersions(GetCampaignVersionsRequest getCampaignVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignVersionsRequest> request = null;
        Response<GetCampaignVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaignVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all the campaigns that are
     * associated with an application.
     * </p>
     * 
     * @param getCampaignsRequest
     * @return Result of the GetCampaigns operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCampaignsResult getCampaigns(GetCampaignsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaigns(request);
    }

    @SdkInternalApi
    final GetCampaignsResult executeGetCampaigns(GetCampaignsRequest getCampaignsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignsRequest> request = null;
        Response<GetCampaignsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaigns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the history and status of each channel for an application.
     * </p>
     * 
     * @param getChannelsRequest
     * @return Result of the GetChannels operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetChannels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetChannelsResult getChannels(GetChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannels(request);
    }

    @SdkInternalApi
    final GetChannelsResult executeGetChannels(GetChannelsRequest getChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelsRequest> request = null;
        Response<GetChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the email channel for an application.
     * </p>
     * 
     * @param getEmailChannelRequest
     * @return Result of the GetEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEmailChannelResult getEmailChannel(GetEmailChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetEmailChannel(request);
    }

    @SdkInternalApi
    final GetEmailChannelResult executeGetEmailChannel(GetEmailChannelRequest getEmailChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getEmailChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEmailChannelRequest> request = null;
        Response<GetEmailChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEmailChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEmailChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEmailChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEmailChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEmailChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param getEmailTemplateRequest
     * @return Result of the GetEmailTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEmailTemplateResult getEmailTemplate(GetEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetEmailTemplate(request);
    }

    @SdkInternalApi
    final GetEmailTemplateResult executeGetEmailTemplate(GetEmailTemplateRequest getEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEmailTemplateRequest> request = null;
        Response<GetEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the settings and attributes of a specific endpoint for an application.
     * </p>
     * 
     * @param getEndpointRequest
     * @return Result of the GetEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEndpointResult getEndpoint(GetEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetEndpoint(request);
    }

    @SdkInternalApi
    final GetEndpointResult executeGetEndpoint(GetEndpointRequest getEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEndpointRequest> request = null;
        Response<GetEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the event stream settings for an application.
     * </p>
     * 
     * @param getEventStreamRequest
     * @return Result of the GetEventStream operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEventStreamResult getEventStream(GetEventStreamRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventStream(request);
    }

    @SdkInternalApi
    final GetEventStreamResult executeGetEventStream(GetEventStreamRequest getEventStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventStreamRequest> request = null;
        Response<GetEventStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEventStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEventStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of a specific export job for an application.
     * </p>
     * 
     * @param getExportJobRequest
     * @return Result of the GetExportJob operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetExportJobResult getExportJob(GetExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetExportJob(request);
    }

    @SdkInternalApi
    final GetExportJobResult executeGetExportJob(GetExportJobRequest getExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportJobRequest> request = null;
        Response<GetExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of all the export jobs for an application.
     * </p>
     * 
     * @param getExportJobsRequest
     * @return Result of the GetExportJobs operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetExportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetExportJobsResult getExportJobs(GetExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetExportJobs(request);
    }

    @SdkInternalApi
    final GetExportJobsResult executeGetExportJobs(GetExportJobsRequest getExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportJobsRequest> request = null;
        Response<GetExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the GCM channel for an application.
     * </p>
     * 
     * @param getGcmChannelRequest
     * @return Result of the GetGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGcmChannelResult getGcmChannel(GetGcmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetGcmChannel(request);
    }

    @SdkInternalApi
    final GetGcmChannelResult executeGetGcmChannel(GetGcmChannelRequest getGcmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGcmChannelRequest> request = null;
        Response<GetGcmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGcmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGcmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGcmChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGcmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGcmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of a specific import job for an application.
     * </p>
     * 
     * @param getImportJobRequest
     * @return Result of the GetImportJob operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetImportJobResult getImportJob(GetImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetImportJob(request);
    }

    @SdkInternalApi
    final GetImportJobResult executeGetImportJob(GetImportJobRequest getImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportJobRequest> request = null;
        Response<GetImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of all the import jobs for an application.
     * </p>
     * 
     * @param getImportJobsRequest
     * @return Result of the GetImportJobs operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetImportJobsResult getImportJobs(GetImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetImportJobs(request);
    }

    @SdkInternalApi
    final GetImportJobsResult executeGetImportJobs(GetImportJobsRequest getImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportJobsRequest> request = null;
        Response<GetImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a journey.
     * </p>
     * 
     * @param getJourneyRequest
     * @return Result of the GetJourney operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourney" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJourneyResult getJourney(GetJourneyRequest request) {
        request = beforeClientExecution(request);
        return executeGetJourney(request);
    }

    @SdkInternalApi
    final GetJourneyResult executeGetJourney(GetJourneyRequest getJourneyRequest) {

        ExecutionContext executionContext = createExecutionContext(getJourneyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJourneyRequest> request = null;
        Response<GetJourneyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJourneyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJourneyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJourney");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJourneyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJourneyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard engagement metric that applies to a journey.
     * </p>
     * 
     * @param getJourneyDateRangeKpiRequest
     * @return Result of the GetJourneyDateRangeKpi operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetJourneyDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetJourneyDateRangeKpiResult getJourneyDateRangeKpi(GetJourneyDateRangeKpiRequest request) {
        request = beforeClientExecution(request);
        return executeGetJourneyDateRangeKpi(request);
    }

    @SdkInternalApi
    final GetJourneyDateRangeKpiResult executeGetJourneyDateRangeKpi(GetJourneyDateRangeKpiRequest getJourneyDateRangeKpiRequest) {

        ExecutionContext executionContext = createExecutionContext(getJourneyDateRangeKpiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJourneyDateRangeKpiRequest> request = null;
        Response<GetJourneyDateRangeKpiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJourneyDateRangeKpiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJourneyDateRangeKpiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJourneyDateRangeKpi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJourneyDateRangeKpiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetJourneyDateRangeKpiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard execution metric that applies to a journey activity.
     * </p>
     * 
     * @param getJourneyExecutionActivityMetricsRequest
     * @return Result of the GetJourneyExecutionActivityMetrics operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetJourneyExecutionActivityMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyExecutionActivityMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetJourneyExecutionActivityMetricsResult getJourneyExecutionActivityMetrics(GetJourneyExecutionActivityMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeGetJourneyExecutionActivityMetrics(request);
    }

    @SdkInternalApi
    final GetJourneyExecutionActivityMetricsResult executeGetJourneyExecutionActivityMetrics(
            GetJourneyExecutionActivityMetricsRequest getJourneyExecutionActivityMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(getJourneyExecutionActivityMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJourneyExecutionActivityMetricsRequest> request = null;
        Response<GetJourneyExecutionActivityMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJourneyExecutionActivityMetricsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getJourneyExecutionActivityMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJourneyExecutionActivityMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJourneyExecutionActivityMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetJourneyExecutionActivityMetricsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard execution metric that applies to a journey.
     * </p>
     * 
     * @param getJourneyExecutionMetricsRequest
     * @return Result of the GetJourneyExecutionMetrics operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetJourneyExecutionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyExecutionMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetJourneyExecutionMetricsResult getJourneyExecutionMetrics(GetJourneyExecutionMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeGetJourneyExecutionMetrics(request);
    }

    @SdkInternalApi
    final GetJourneyExecutionMetricsResult executeGetJourneyExecutionMetrics(GetJourneyExecutionMetricsRequest getJourneyExecutionMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(getJourneyExecutionMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJourneyExecutionMetricsRequest> request = null;
        Response<GetJourneyExecutionMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJourneyExecutionMetricsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getJourneyExecutionMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJourneyExecutionMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJourneyExecutionMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetJourneyExecutionMetricsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through a push notification
     * channel.
     * </p>
     * 
     * @param getPushTemplateRequest
     * @return Result of the GetPushTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetPushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetPushTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPushTemplateResult getPushTemplate(GetPushTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetPushTemplate(request);
    }

    @SdkInternalApi
    final GetPushTemplateResult executeGetPushTemplate(GetPushTemplateRequest getPushTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getPushTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPushTemplateRequest> request = null;
        Response<GetPushTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPushTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPushTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPushTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPushTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPushTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param getRecommenderConfigurationRequest
     * @return Result of the GetRecommenderConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecommenderConfigurationResult getRecommenderConfiguration(GetRecommenderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecommenderConfiguration(request);
    }

    @SdkInternalApi
    final GetRecommenderConfigurationResult executeGetRecommenderConfiguration(GetRecommenderConfigurationRequest getRecommenderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecommenderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecommenderConfigurationRequest> request = null;
        Response<GetRecommenderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecommenderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRecommenderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecommenderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecommenderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRecommenderConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about all the recommender model configurations that are associated with your Amazon
     * Pinpoint account.
     * </p>
     * 
     * @param getRecommenderConfigurationsRequest
     * @return Result of the GetRecommenderConfigurations operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetRecommenderConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetRecommenderConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecommenderConfigurationsResult getRecommenderConfigurations(GetRecommenderConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecommenderConfigurations(request);
    }

    @SdkInternalApi
    final GetRecommenderConfigurationsResult executeGetRecommenderConfigurations(GetRecommenderConfigurationsRequest getRecommenderConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecommenderConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecommenderConfigurationsRequest> request = null;
        Response<GetRecommenderConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecommenderConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRecommenderConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecommenderConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecommenderConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRecommenderConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for a specific segment that's
     * associated with an application.
     * </p>
     * 
     * @param getSegmentRequest
     * @return Result of the GetSegment operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSegmentResult getSegment(GetSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegment(request);
    }

    @SdkInternalApi
    final GetSegmentResult executeGetSegment(GetSegmentRequest getSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentRequest> request = null;
        Response<GetSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSegment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the export jobs for a segment.
     * </p>
     * 
     * @param getSegmentExportJobsRequest
     * @return Result of the GetSegmentExportJobs operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegmentExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSegmentExportJobsResult getSegmentExportJobs(GetSegmentExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegmentExportJobs(request);
    }

    @SdkInternalApi
    final GetSegmentExportJobsResult executeGetSegmentExportJobs(GetSegmentExportJobsRequest getSegmentExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentExportJobsRequest> request = null;
        Response<GetSegmentExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSegmentExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentExportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the import jobs for a segment.
     * </p>
     * 
     * @param getSegmentImportJobsRequest
     * @return Result of the GetSegmentImportJobs operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegmentImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSegmentImportJobsResult getSegmentImportJobs(GetSegmentImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegmentImportJobs(request);
    }

    @SdkInternalApi
    final GetSegmentImportJobsResult executeGetSegmentImportJobs(GetSegmentImportJobsRequest getSegmentImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentImportJobsRequest> request = null;
        Response<GetSegmentImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSegmentImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for a specific version of a segment
     * that's associated with an application.
     * </p>
     * 
     * @param getSegmentVersionRequest
     * @return Result of the GetSegmentVersion operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegmentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSegmentVersionResult getSegmentVersion(GetSegmentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegmentVersion(request);
    }

    @SdkInternalApi
    final GetSegmentVersionResult executeGetSegmentVersion(GetSegmentVersionRequest getSegmentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentVersionRequest> request = null;
        Response<GetSegmentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSegmentVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for all the versions of a specific
     * segment that's associated with an application.
     * </p>
     * 
     * @param getSegmentVersionsRequest
     * @return Result of the GetSegmentVersions operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegmentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSegmentVersionsResult getSegmentVersions(GetSegmentVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegmentVersions(request);
    }

    @SdkInternalApi
    final GetSegmentVersionsResult executeGetSegmentVersions(GetSegmentVersionsRequest getSegmentVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentVersionsRequest> request = null;
        Response<GetSegmentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSegmentVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for all the segments that are
     * associated with an application.
     * </p>
     * 
     * @param getSegmentsRequest
     * @return Result of the GetSegments operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSegmentsResult getSegments(GetSegmentsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegments(request);
    }

    @SdkInternalApi
    final GetSegmentsResult executeGetSegments(GetSegmentsRequest getSegmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentsRequest> request = null;
        Response<GetSegmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSegments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the SMS channel for an application.
     * </p>
     * 
     * @param getSmsChannelRequest
     * @return Result of the GetSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSmsChannelResult getSmsChannel(GetSmsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetSmsChannel(request);
    }

    @SdkInternalApi
    final GetSmsChannelResult executeGetSmsChannel(GetSmsChannelRequest getSmsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getSmsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSmsChannelRequest> request = null;
        Response<GetSmsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSmsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSmsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSmsChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSmsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSmsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param getSmsTemplateRequest
     * @return Result of the GetSmsTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSmsTemplateResult getSmsTemplate(GetSmsTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetSmsTemplate(request);
    }

    @SdkInternalApi
    final GetSmsTemplateResult executeGetSmsTemplate(GetSmsTemplateRequest getSmsTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getSmsTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSmsTemplateRequest> request = null;
        Response<GetSmsTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSmsTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSmsTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSmsTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSmsTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSmsTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param getUserEndpointsRequest
     * @return Result of the GetUserEndpoints operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetUserEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserEndpointsResult getUserEndpoints(GetUserEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserEndpoints(request);
    }

    @SdkInternalApi
    final GetUserEndpointsResult executeGetUserEndpoints(GetUserEndpointsRequest getUserEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserEndpointsRequest> request = null;
        Response<GetUserEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status and settings of the voice channel for an application.
     * </p>
     * 
     * @param getVoiceChannelRequest
     * @return Result of the GetVoiceChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetVoiceChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVoiceChannelResult getVoiceChannel(GetVoiceChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceChannel(request);
    }

    @SdkInternalApi
    final GetVoiceChannelResult executeGetVoiceChannel(GetVoiceChannelRequest getVoiceChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceChannelRequest> request = null;
        Response<GetVoiceChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVoiceChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVoiceChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param getVoiceTemplateRequest
     * @return Result of the GetVoiceTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetVoiceTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVoiceTemplateResult getVoiceTemplate(GetVoiceTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceTemplate(request);
    }

    @SdkInternalApi
    final GetVoiceTemplateResult executeGetVoiceTemplate(GetVoiceTemplateRequest getVoiceTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceTemplateRequest> request = null;
        Response<GetVoiceTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVoiceTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVoiceTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all the journeys that are
     * associated with an application.
     * </p>
     * 
     * @param listJourneysRequest
     * @return Result of the ListJourneys operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.ListJourneys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListJourneys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJourneysResult listJourneys(ListJourneysRequest request) {
        request = beforeClientExecution(request);
        return executeListJourneys(request);
    }

    @SdkInternalApi
    final ListJourneysResult executeListJourneys(ListJourneysRequest listJourneysRequest) {

        ExecutionContext executionContext = createExecutionContext(listJourneysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJourneysRequest> request = null;
        Response<ListJourneysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJourneysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJourneysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJourneys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJourneysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJourneysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all the tags (keys and values) that are associated with an application, campaign, message template, or
     * segment.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPinpoint.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about all the versions of a specific message template.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @return Result of the ListTemplateVersions operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.ListTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTemplateVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTemplateVersionsResult listTemplateVersions(ListTemplateVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplateVersions(request);
    }

    @SdkInternalApi
    final ListTemplateVersionsResult executeListTemplateVersions(ListTemplateVersionsRequest listTemplateVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplateVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateVersionsRequest> request = null;
        Response<ListTemplateVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplateVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplateVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplateVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplateVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about all the message templates that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @sample AmazonPinpoint.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTemplatesResult listTemplates(ListTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplates(request);
    }

    @SdkInternalApi
    final ListTemplatesResult executeListTemplates(ListTemplatesRequest listTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplatesRequest> request = null;
        Response<ListTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a phone number.
     * </p>
     * 
     * @param phoneNumberValidateRequest
     * @return Result of the PhoneNumberValidate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.PhoneNumberValidate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PhoneNumberValidate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PhoneNumberValidateResult phoneNumberValidate(PhoneNumberValidateRequest request) {
        request = beforeClientExecution(request);
        return executePhoneNumberValidate(request);
    }

    @SdkInternalApi
    final PhoneNumberValidateResult executePhoneNumberValidate(PhoneNumberValidateRequest phoneNumberValidateRequest) {

        ExecutionContext executionContext = createExecutionContext(phoneNumberValidateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PhoneNumberValidateRequest> request = null;
        Response<PhoneNumberValidateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PhoneNumberValidateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(phoneNumberValidateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PhoneNumberValidate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PhoneNumberValidateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PhoneNumberValidateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new event stream for an application or updates the settings of an existing event stream for an
     * application.
     * </p>
     * 
     * @param putEventStreamRequest
     * @return Result of the PutEventStream operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.PutEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutEventStreamResult putEventStream(PutEventStreamRequest request) {
        request = beforeClientExecution(request);
        return executePutEventStream(request);
    }

    @SdkInternalApi
    final PutEventStreamResult executePutEventStream(PutEventStreamRequest putEventStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(putEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventStreamRequest> request = null;
        Response<PutEventStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEventStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEventStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEventStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEventStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are
     * associated with.
     * </p>
     * 
     * @param putEventsRequest
     * @return Result of the PutEvents operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutEventsResult putEvents(PutEventsRequest request) {
        request = beforeClientExecution(request);
        return executePutEvents(request);
    }

    @SdkInternalApi
    final PutEventsResult executePutEvents(PutEventsRequest putEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(putEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventsRequest> request = null;
        Response<PutEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEventsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an
     * application.
     * </p>
     * 
     * @param removeAttributesRequest
     * @return Result of the RemoveAttributes operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.RemoveAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/RemoveAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveAttributesResult removeAttributes(RemoveAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveAttributes(request);
    }

    @SdkInternalApi
    final RemoveAttributesResult executeRemoveAttributes(RemoveAttributesRequest removeAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(removeAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAttributesRequest> request = null;
        Response<RemoveAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and sends a direct message.
     * </p>
     * 
     * @param sendMessagesRequest
     * @return Result of the SendMessages operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.SendMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendMessages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendMessagesResult sendMessages(SendMessagesRequest request) {
        request = beforeClientExecution(request);
        return executeSendMessages(request);
    }

    @SdkInternalApi
    final SendMessagesResult executeSendMessages(SendMessagesRequest sendMessagesRequest) {

        ExecutionContext executionContext = createExecutionContext(sendMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessagesRequest> request = null;
        Response<SendMessagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendMessagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendMessagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendMessages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendMessagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendMessagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and sends a message to a list of users.
     * </p>
     * 
     * @param sendUsersMessagesRequest
     * @return Result of the SendUsersMessages operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.SendUsersMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendUsersMessagesResult sendUsersMessages(SendUsersMessagesRequest request) {
        request = beforeClientExecution(request);
        return executeSendUsersMessages(request);
    }

    @SdkInternalApi
    final SendUsersMessagesResult executeSendUsersMessages(SendUsersMessagesRequest sendUsersMessagesRequest) {

        ExecutionContext executionContext = createExecutionContext(sendUsersMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendUsersMessagesRequest> request = null;
        Response<SendUsersMessagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendUsersMessagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendUsersMessagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendUsersMessages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendUsersMessagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendUsersMessagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags (keys and values) to an application, campaign, message template, or segment.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @sample AmazonPinpoint.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
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
     * Removes one or more tags (keys and values) from an application, campaign, message template, or segment.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AmazonPinpoint.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
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
     * Enables the ADM channel for an application or updates the status and settings of the ADM channel for an
     * application.
     * </p>
     * 
     * @param updateAdmChannelRequest
     * @return Result of the UpdateAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAdmChannelResult updateAdmChannel(UpdateAdmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAdmChannel(request);
    }

    @SdkInternalApi
    final UpdateAdmChannelResult executeUpdateAdmChannel(UpdateAdmChannelRequest updateAdmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAdmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAdmChannelRequest> request = null;
        Response<UpdateAdmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAdmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAdmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAdmChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAdmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAdmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the APNs channel for an application or updates the status and settings of the APNs channel for an
     * application.
     * </p>
     * 
     * @param updateApnsChannelRequest
     * @return Result of the UpdateApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateApnsChannelResult updateApnsChannel(UpdateApnsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApnsChannel(request);
    }

    @SdkInternalApi
    final UpdateApnsChannelResult executeUpdateApnsChannel(UpdateApnsChannelRequest updateApnsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsChannelRequest> request = null;
        Response<UpdateApnsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApnsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApnsChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApnsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApnsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the APNs sandbox channel for an application or updates the status and settings of the APNs sandbox
     * channel for an application.
     * </p>
     * 
     * @param updateApnsSandboxChannelRequest
     * @return Result of the UpdateApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApnsSandboxChannelResult updateApnsSandboxChannel(UpdateApnsSandboxChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApnsSandboxChannel(request);
    }

    @SdkInternalApi
    final UpdateApnsSandboxChannelResult executeUpdateApnsSandboxChannel(UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApnsSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsSandboxChannelRequest> request = null;
        Response<UpdateApnsSandboxChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsSandboxChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateApnsSandboxChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApnsSandboxChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApnsSandboxChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateApnsSandboxChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the APNs VoIP channel for an application or updates the status and settings of the APNs VoIP channel for
     * an application.
     * </p>
     * 
     * @param updateApnsVoipChannelRequest
     * @return Result of the UpdateApnsVoipChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateApnsVoipChannelResult updateApnsVoipChannel(UpdateApnsVoipChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApnsVoipChannel(request);
    }

    @SdkInternalApi
    final UpdateApnsVoipChannelResult executeUpdateApnsVoipChannel(UpdateApnsVoipChannelRequest updateApnsVoipChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApnsVoipChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsVoipChannelRequest> request = null;
        Response<UpdateApnsVoipChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsVoipChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApnsVoipChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApnsVoipChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApnsVoipChannelResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateApnsVoipChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the APNs VoIP sandbox channel for an application or updates the status and settings of the APNs VoIP
     * sandbox channel for an application.
     * </p>
     * 
     * @param updateApnsVoipSandboxChannelRequest
     * @return Result of the UpdateApnsVoipSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApnsVoipSandboxChannelResult updateApnsVoipSandboxChannel(UpdateApnsVoipSandboxChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApnsVoipSandboxChannel(request);
    }

    @SdkInternalApi
    final UpdateApnsVoipSandboxChannelResult executeUpdateApnsVoipSandboxChannel(UpdateApnsVoipSandboxChannelRequest updateApnsVoipSandboxChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApnsVoipSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsVoipSandboxChannelRequest> request = null;
        Response<UpdateApnsVoipSandboxChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsVoipSandboxChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateApnsVoipSandboxChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApnsVoipSandboxChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApnsVoipSandboxChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateApnsVoipSandboxChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings for an application.
     * </p>
     * 
     * @param updateApplicationSettingsRequest
     * @return Result of the UpdateApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationSettingsResult updateApplicationSettings(UpdateApplicationSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplicationSettings(request);
    }

    @SdkInternalApi
    final UpdateApplicationSettingsResult executeUpdateApplicationSettings(UpdateApplicationSettingsRequest updateApplicationSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationSettingsRequest> request = null;
        Response<UpdateApplicationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateApplicationSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplicationSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateApplicationSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the Baidu channel for an application or updates the status and settings of the Baidu channel for an
     * application.
     * </p>
     * 
     * @param updateBaiduChannelRequest
     * @return Result of the UpdateBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateBaiduChannelResult updateBaiduChannel(UpdateBaiduChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBaiduChannel(request);
    }

    @SdkInternalApi
    final UpdateBaiduChannelResult executeUpdateBaiduChannel(UpdateBaiduChannelRequest updateBaiduChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBaiduChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBaiduChannelRequest> request = null;
        Response<UpdateBaiduChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBaiduChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBaiduChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBaiduChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBaiduChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBaiduChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration and other settings for a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCampaignResult updateCampaign(UpdateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCampaign(request);
    }

    @SdkInternalApi
    final UpdateCampaignResult executeUpdateCampaign(UpdateCampaignRequest updateCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignRequest> request = null;
        Response<UpdateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the email channel for an application or updates the status and settings of the email channel for an
     * application.
     * </p>
     * 
     * @param updateEmailChannelRequest
     * @return Result of the UpdateEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateEmailChannelResult updateEmailChannel(UpdateEmailChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEmailChannel(request);
    }

    @SdkInternalApi
    final UpdateEmailChannelResult executeUpdateEmailChannel(UpdateEmailChannelRequest updateEmailChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEmailChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEmailChannelRequest> request = null;
        Response<UpdateEmailChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEmailChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEmailChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEmailChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEmailChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEmailChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param updateEmailTemplateRequest
     * @return Result of the UpdateEmailTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateEmailTemplateResult updateEmailTemplate(UpdateEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEmailTemplate(request);
    }

    @SdkInternalApi
    final UpdateEmailTemplateResult executeUpdateEmailTemplate(UpdateEmailTemplateRequest updateEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEmailTemplateRequest> request = null;
        Response<UpdateEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an
     * application. You can also use this operation to define custom attributes for an endpoint. If an update includes
     * one or more values for a custom attribute, Amazon Pinpoint replaces (overwrites) any existing values with the new
     * values.
     * </p>
     * 
     * @param updateEndpointRequest
     * @return Result of the UpdateEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEndpointResult updateEndpoint(UpdateEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEndpoint(request);
    }

    @SdkInternalApi
    final UpdateEndpointResult executeUpdateEndpoint(UpdateEndpointRequest updateEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointRequest> request = null;
        Response<UpdateEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing
     * endpoints for an application. You can also use this operation to define custom attributes for a batch of
     * endpoints. If an update includes one or more values for a custom attribute, Amazon Pinpoint replaces (overwrites)
     * any existing values with the new values.
     * </p>
     * 
     * @param updateEndpointsBatchRequest
     * @return Result of the UpdateEndpointsBatch operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateEndpointsBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpointsBatch" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateEndpointsBatchResult updateEndpointsBatch(UpdateEndpointsBatchRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEndpointsBatch(request);
    }

    @SdkInternalApi
    final UpdateEndpointsBatchResult executeUpdateEndpointsBatch(UpdateEndpointsBatchRequest updateEndpointsBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEndpointsBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointsBatchRequest> request = null;
        Response<UpdateEndpointsBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointsBatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEndpointsBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEndpointsBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEndpointsBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEndpointsBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the GCM channel for an application or updates the status and settings of the GCM channel for an
     * application.
     * </p>
     * 
     * @param updateGcmChannelRequest
     * @return Result of the UpdateGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGcmChannelResult updateGcmChannel(UpdateGcmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGcmChannel(request);
    }

    @SdkInternalApi
    final UpdateGcmChannelResult executeUpdateGcmChannel(UpdateGcmChannelRequest updateGcmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGcmChannelRequest> request = null;
        Response<UpdateGcmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGcmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGcmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGcmChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGcmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGcmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration and other settings for a journey.
     * </p>
     * 
     * @param updateJourneyRequest
     * @return Result of the UpdateJourney operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @throws ConflictException
     *         The request failed due to a conflict with the current state of the specified resource
     *         (ConflictException).
     * @sample AmazonPinpoint.UpdateJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateJourney" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateJourneyResult updateJourney(UpdateJourneyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJourney(request);
    }

    @SdkInternalApi
    final UpdateJourneyResult executeUpdateJourney(UpdateJourneyRequest updateJourneyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJourneyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJourneyRequest> request = null;
        Response<UpdateJourneyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJourneyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJourneyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJourney");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJourneyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJourneyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels (stops) an active journey.
     * </p>
     * 
     * @param updateJourneyStateRequest
     * @return Result of the UpdateJourneyState operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateJourneyState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateJourneyState" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateJourneyStateResult updateJourneyState(UpdateJourneyStateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJourneyState(request);
    }

    @SdkInternalApi
    final UpdateJourneyStateResult executeUpdateJourneyState(UpdateJourneyStateRequest updateJourneyStateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJourneyStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJourneyStateRequest> request = null;
        Response<UpdateJourneyStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJourneyStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJourneyStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJourneyState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJourneyStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJourneyStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing message template for messages that are sent through a push notification channel.
     * </p>
     * 
     * @param updatePushTemplateRequest
     * @return Result of the UpdatePushTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdatePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdatePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePushTemplateResult updatePushTemplate(UpdatePushTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePushTemplate(request);
    }

    @SdkInternalApi
    final UpdatePushTemplateResult executeUpdatePushTemplate(UpdatePushTemplateRequest updatePushTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePushTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePushTemplateRequest> request = null;
        Response<UpdatePushTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePushTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePushTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePushTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePushTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePushTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param updateRecommenderConfigurationRequest
     * @return Result of the UpdateRecommenderConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRecommenderConfigurationResult updateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRecommenderConfiguration(request);
    }

    @SdkInternalApi
    final UpdateRecommenderConfigurationResult executeUpdateRecommenderConfiguration(UpdateRecommenderConfigurationRequest updateRecommenderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRecommenderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecommenderConfigurationRequest> request = null;
        Response<UpdateRecommenderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecommenderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRecommenderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRecommenderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRecommenderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRecommenderConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration, dimension, and other settings for an
     * existing segment that's associated with an application.
     * </p>
     * 
     * @param updateSegmentRequest
     * @return Result of the UpdateSegment operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSegmentResult updateSegment(UpdateSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSegment(request);
    }

    @SdkInternalApi
    final UpdateSegmentResult executeUpdateSegment(UpdateSegmentRequest updateSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSegmentRequest> request = null;
        Response<UpdateSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSegment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSegmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the SMS channel for an application or updates the status and settings of the SMS channel for an
     * application.
     * </p>
     * 
     * @param updateSmsChannelRequest
     * @return Result of the UpdateSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSmsChannelResult updateSmsChannel(UpdateSmsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSmsChannel(request);
    }

    @SdkInternalApi
    final UpdateSmsChannelResult executeUpdateSmsChannel(UpdateSmsChannelRequest updateSmsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSmsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSmsChannelRequest> request = null;
        Response<UpdateSmsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSmsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSmsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSmsChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSmsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSmsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param updateSmsTemplateRequest
     * @return Result of the UpdateSmsTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSmsTemplateResult updateSmsTemplate(UpdateSmsTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSmsTemplate(request);
    }

    @SdkInternalApi
    final UpdateSmsTemplateResult executeUpdateSmsTemplate(UpdateSmsTemplateRequest updateSmsTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSmsTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSmsTemplateRequest> request = null;
        Response<UpdateSmsTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSmsTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSmsTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSmsTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSmsTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSmsTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the status of a specific version of a message template to <i>active</i>.
     * </p>
     * 
     * @param updateTemplateActiveVersionRequest
     * @return Result of the UpdateTemplateActiveVersion operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateTemplateActiveVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateTemplateActiveVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTemplateActiveVersionResult updateTemplateActiveVersion(UpdateTemplateActiveVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTemplateActiveVersion(request);
    }

    @SdkInternalApi
    final UpdateTemplateActiveVersionResult executeUpdateTemplateActiveVersion(UpdateTemplateActiveVersionRequest updateTemplateActiveVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTemplateActiveVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateActiveVersionRequest> request = null;
        Response<UpdateTemplateActiveVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateActiveVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateTemplateActiveVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTemplateActiveVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTemplateActiveVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateTemplateActiveVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the voice channel for an application or updates the status and settings of the voice channel for an
     * application.
     * </p>
     * 
     * @param updateVoiceChannelRequest
     * @return Result of the UpdateVoiceChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateVoiceChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVoiceChannelResult updateVoiceChannel(UpdateVoiceChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVoiceChannel(request);
    }

    @SdkInternalApi
    final UpdateVoiceChannelResult executeUpdateVoiceChannel(UpdateVoiceChannelRequest updateVoiceChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVoiceChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceChannelRequest> request = null;
        Response<UpdateVoiceChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVoiceChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVoiceChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVoiceChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVoiceChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param updateVoiceTemplateRequest
     * @return Result of the UpdateVoiceTemplate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws PayloadTooLargeException
     *         The request failed because the payload for the body of the request is too large
     *         (RequestEntityTooLargeException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVoiceTemplateResult updateVoiceTemplate(UpdateVoiceTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVoiceTemplate(request);
    }

    @SdkInternalApi
    final UpdateVoiceTemplateResult executeUpdateVoiceTemplate(UpdateVoiceTemplateRequest updateVoiceTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVoiceTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceTemplateRequest> request = null;
        Response<UpdateVoiceTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVoiceTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVoiceTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVoiceTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVoiceTemplateResultJsonUnmarshaller());
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
