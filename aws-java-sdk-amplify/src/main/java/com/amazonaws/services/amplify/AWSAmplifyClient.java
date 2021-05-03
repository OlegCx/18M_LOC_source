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
package com.amazonaws.services.amplify;

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

import com.amazonaws.services.amplify.AWSAmplifyClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.services.amplify.model.transform.*;

/**
 * Client for accessing Amplify. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amplify enables developers to develop and deploy cloud-powered mobile and web apps. The Amplify Console provides a
 * continuous delivery and hosting service for web applications. For more information, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html">Amplify Console User Guide</a>. The Amplify
 * Framework is a comprehensive set of SDKs, libraries, tools, and documentation for client app development. For more
 * information, see the <a href="https://docs.amplify.aws/">Amplify Framework.</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAmplifyClient extends AmazonWebServiceClient implements AWSAmplify {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAmplify.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "amplify";

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
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplify.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplify.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplify.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplify.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependentServiceFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplify.model.transform.DependentServiceFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplify.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplify.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.amplify.model.AWSAmplifyException.class));

    public static AWSAmplifyClientBuilder builder() {
        return AWSAmplifyClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amplify using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAmplifyClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amplify using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAmplifyClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("amplify.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/amplify/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/amplify/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new Amplify app.
     * </p>
     * 
     * @param createAppRequest
     *        The request structure used to create apps in Amplify.
     * @return Result of the CreateApp operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateApp" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
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
     * Creates a new backend environment for an Amplify app.
     * </p>
     * 
     * @param createBackendEnvironmentRequest
     *        The request structure for the backend environment create request.
     * @return Result of the CreateBackendEnvironment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.CreateBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBackendEnvironmentResult createBackendEnvironment(CreateBackendEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackendEnvironment(request);
    }

    @SdkInternalApi
    final CreateBackendEnvironmentResult executeCreateBackendEnvironment(CreateBackendEnvironmentRequest createBackendEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackendEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackendEnvironmentRequest> request = null;
        Response<CreateBackendEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackendEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createBackendEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackendEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackendEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateBackendEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new branch for an Amplify app.
     * </p>
     * 
     * @param createBranchRequest
     *        The request structure for the create branch request.
     * @return Result of the CreateBranch operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBranchResult createBranch(CreateBranchRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBranch(request);
    }

    @SdkInternalApi
    final CreateBranchResult executeCreateBranch(CreateBranchRequest createBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(createBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBranchRequest> request = null;
        Response<CreateBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a deployment for a manually deployed Amplify app. Manually deployed apps are not connected to a
     * repository.
     * </p>
     * 
     * @param createDeploymentRequest
     *        The request structure for the create a new deployment request.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeployment(request);
    }

    @SdkInternalApi
    final CreateDeploymentResult executeCreateDeployment(CreateDeploymentRequest createDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new domain association for an Amplify app. This action associates a custom domain with the Amplify app
     * </p>
     * 
     * @param createDomainAssociationRequest
     *        The request structure for the create domain association request.
     * @return Result of the CreateDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.CreateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDomainAssociationResult createDomainAssociation(CreateDomainAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomainAssociation(request);
    }

    @SdkInternalApi
    final CreateDomainAssociationResult executeCreateDomainAssociation(CreateDomainAssociationRequest createDomainAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainAssociationRequest> request = null;
        Response<CreateDomainAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDomainAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomainAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDomainAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new webhook on an Amplify app.
     * </p>
     * 
     * @param createWebhookRequest
     *        The request structure for the create webhook request.
     * @return Result of the CreateWebhook operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWebhookResult createWebhook(CreateWebhookRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWebhook(request);
    }

    @SdkInternalApi
    final CreateWebhookResult executeCreateWebhook(CreateWebhookRequest createWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(createWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebhookRequest> request = null;
        Response<CreateWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWebhookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWebhookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing Amplify app specified by an app ID.
     * </p>
     * 
     * @param deleteAppRequest
     *        Describes the request structure for the delete app request.
     * @return Result of the DeleteApp operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteApp" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
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
     * Deletes a backend environment for an Amplify app.
     * </p>
     * 
     * @param deleteBackendEnvironmentRequest
     *        The request structure for the delete backend environment request.
     * @return Result of the DeleteBackendEnvironment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.DeleteBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBackendEnvironmentResult deleteBackendEnvironment(DeleteBackendEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackendEnvironment(request);
    }

    @SdkInternalApi
    final DeleteBackendEnvironmentResult executeDeleteBackendEnvironment(DeleteBackendEnvironmentRequest deleteBackendEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackendEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackendEnvironmentRequest> request = null;
        Response<DeleteBackendEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackendEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteBackendEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackendEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackendEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteBackendEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a branch for an Amplify app.
     * </p>
     * 
     * @param deleteBranchRequest
     *        The request structure for the delete branch request.
     * @return Result of the DeleteBranch operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBranchResult deleteBranch(DeleteBranchRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBranch(request);
    }

    @SdkInternalApi
    final DeleteBranchResult executeDeleteBranch(DeleteBranchRequest deleteBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBranchRequest> request = null;
        Response<DeleteBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a domain association for an Amplify app.
     * </p>
     * 
     * @param deleteDomainAssociationRequest
     *        The request structure for the delete domain association request.
     * @return Result of the DeleteDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.DeleteDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDomainAssociationResult deleteDomainAssociation(DeleteDomainAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomainAssociation(request);
    }

    @SdkInternalApi
    final DeleteDomainAssociationResult executeDeleteDomainAssociation(DeleteDomainAssociationRequest deleteDomainAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainAssociationRequest> request = null;
        Response<DeleteDomainAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDomainAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomainAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDomainAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a job for a branch of an Amplify app.
     * </p>
     * 
     * @param deleteJobRequest
     *        The request structure for the delete job request.
     * @return Result of the DeleteJob operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJobResult deleteJob(DeleteJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJob(request);
    }

    @SdkInternalApi
    final DeleteJobResult executeDeleteJob(DeleteJobRequest deleteJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobRequest> request = null;
        Response<DeleteJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a webhook.
     * </p>
     * 
     * @param deleteWebhookRequest
     *        The request structure for the delete webhook request.
     * @return Result of the DeleteWebhook operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWebhookResult deleteWebhook(DeleteWebhookRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWebhook(request);
    }

    @SdkInternalApi
    final DeleteWebhookResult executeDeleteWebhook(DeleteWebhookRequest deleteWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebhookRequest> request = null;
        Response<DeleteWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWebhookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWebhookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the website access logs for a specific time range using a presigned URL.
     * </p>
     * 
     * @param generateAccessLogsRequest
     *        The request structure for the generate access logs request.
     * @return Result of the GenerateAccessLogs operation returned by the service.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GenerateAccessLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GenerateAccessLogs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GenerateAccessLogsResult generateAccessLogs(GenerateAccessLogsRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateAccessLogs(request);
    }

    @SdkInternalApi
    final GenerateAccessLogsResult executeGenerateAccessLogs(GenerateAccessLogsRequest generateAccessLogsRequest) {

        ExecutionContext executionContext = createExecutionContext(generateAccessLogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateAccessLogsRequest> request = null;
        Response<GenerateAccessLogsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateAccessLogsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(generateAccessLogsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateAccessLogs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateAccessLogsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GenerateAccessLogsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an existing Amplify app by appID.
     * </p>
     * 
     * @param getAppRequest
     *        The request structure for the get app request.
     * @return Result of the GetApp operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetApp" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
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
     * Returns the artifact info that corresponds to an artifact id.
     * </p>
     * 
     * @param getArtifactUrlRequest
     *        Returns the request structure for the get artifact request.
     * @return Result of the GetArtifactUrl operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.GetArtifactUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetArtifactUrl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetArtifactUrlResult getArtifactUrl(GetArtifactUrlRequest request) {
        request = beforeClientExecution(request);
        return executeGetArtifactUrl(request);
    }

    @SdkInternalApi
    final GetArtifactUrlResult executeGetArtifactUrl(GetArtifactUrlRequest getArtifactUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(getArtifactUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArtifactUrlRequest> request = null;
        Response<GetArtifactUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArtifactUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getArtifactUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArtifactUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArtifactUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetArtifactUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a backend environment for an Amplify app.
     * </p>
     * 
     * @param getBackendEnvironmentRequest
     *        The request structure for the get backend environment request.
     * @return Result of the GetBackendEnvironment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBackendEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBackendEnvironmentResult getBackendEnvironment(GetBackendEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackendEnvironment(request);
    }

    @SdkInternalApi
    final GetBackendEnvironmentResult executeGetBackendEnvironment(GetBackendEnvironmentRequest getBackendEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackendEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackendEnvironmentRequest> request = null;
        Response<GetBackendEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackendEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackendEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackendEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackendEnvironmentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetBackendEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a branch for an Amplify app.
     * </p>
     * 
     * @param getBranchRequest
     *        The request structure for the get branch request.
     * @return Result of the GetBranch operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBranchResult getBranch(GetBranchRequest request) {
        request = beforeClientExecution(request);
        return executeGetBranch(request);
    }

    @SdkInternalApi
    final GetBranchResult executeGetBranch(GetBranchRequest getBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(getBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBranchRequest> request = null;
        Response<GetBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBranchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the domain information for an Amplify app.
     * </p>
     * 
     * @param getDomainAssociationRequest
     *        The request structure for the get domain association request.
     * @return Result of the GetDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetDomainAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDomainAssociationResult getDomainAssociation(GetDomainAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainAssociation(request);
    }

    @SdkInternalApi
    final GetDomainAssociationResult executeGetDomainAssociation(GetDomainAssociationRequest getDomainAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainAssociationRequest> request = null;
        Response<GetDomainAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainAssociationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a job for a branch of an Amplify app.
     * </p>
     * 
     * @param getJobRequest
     *        The request structure for the get job request.
     * @return Result of the GetJob operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobResult getJob(GetJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetJob(request);
    }

    @SdkInternalApi
    final GetJobResult executeGetJob(GetJobRequest getJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRequest> request = null;
        Response<GetJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the webhook information that corresponds to a specified webhook ID.
     * </p>
     * 
     * @param getWebhookRequest
     *        The request structure for the get webhook request.
     * @return Result of the GetWebhook operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.GetWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWebhookResult getWebhook(GetWebhookRequest request) {
        request = beforeClientExecution(request);
        return executeGetWebhook(request);
    }

    @SdkInternalApi
    final GetWebhookResult executeGetWebhook(GetWebhookRequest getWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(getWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebhookRequest> request = null;
        Response<GetWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWebhookResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWebhookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the existing Amplify apps.
     * </p>
     * 
     * @param listAppsRequest
     *        The request structure for the list apps request.
     * @return Result of the ListApps operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAppsResult listApps(ListAppsRequest request) {
        request = beforeClientExecution(request);
        return executeListApps(request);
    }

    @SdkInternalApi
    final ListAppsResult executeListApps(ListAppsRequest listAppsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppsRequest> request = null;
        Response<ListAppsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of artifacts for a specified app, branch, and job.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Describes the request structure for the list artifacts request.
     * @return Result of the ListArtifacts operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListArtifactsResult listArtifacts(ListArtifactsRequest request) {
        request = beforeClientExecution(request);
        return executeListArtifacts(request);
    }

    @SdkInternalApi
    final ListArtifactsResult executeListArtifacts(ListArtifactsRequest listArtifactsRequest) {

        ExecutionContext executionContext = createExecutionContext(listArtifactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListArtifactsRequest> request = null;
        Response<ListArtifactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListArtifactsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listArtifactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListArtifacts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListArtifactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListArtifactsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the backend environments for an Amplify app.
     * </p>
     * 
     * @param listBackendEnvironmentsRequest
     *        The request structure for the list backend environments request.
     * @return Result of the ListBackendEnvironments operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListBackendEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBackendEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBackendEnvironmentsResult listBackendEnvironments(ListBackendEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListBackendEnvironments(request);
    }

    @SdkInternalApi
    final ListBackendEnvironmentsResult executeListBackendEnvironments(ListBackendEnvironmentsRequest listBackendEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackendEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackendEnvironmentsRequest> request = null;
        Response<ListBackendEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackendEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listBackendEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBackendEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackendEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListBackendEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the branches of an Amplify app.
     * </p>
     * 
     * @param listBranchesRequest
     *        The request structure for the list branches request.
     * @return Result of the ListBranches operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBranchesResult listBranches(ListBranchesRequest request) {
        request = beforeClientExecution(request);
        return executeListBranches(request);
    }

    @SdkInternalApi
    final ListBranchesResult executeListBranches(ListBranchesRequest listBranchesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBranchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBranchesRequest> request = null;
        Response<ListBranchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBranchesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBranchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBranches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBranchesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBranchesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the domain associations for an Amplify app.
     * </p>
     * 
     * @param listDomainAssociationsRequest
     *        The request structure for the list domain associations request.
     * @return Result of the ListDomainAssociations operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListDomainAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListDomainAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDomainAssociationsResult listDomainAssociations(ListDomainAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomainAssociations(request);
    }

    @SdkInternalApi
    final ListDomainAssociationsResult executeListDomainAssociations(ListDomainAssociationsRequest listDomainAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainAssociationsRequest> request = null;
        Response<ListDomainAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDomainAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the jobs for a branch of an Amplify app.
     * </p>
     * 
     * @param listJobsRequest
     *        The request structure for the list jobs request.
     * @return Result of the ListJobs operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobs(request);
    }

    @SdkInternalApi
    final ListJobsResult executeListJobs(ListJobsRequest listJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags for a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request structure to use to list tags for a resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws ResourceNotFoundException
     *         An operation failed due to a non-existent resource.
     * @sample AWSAmplify.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
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
     * Returns a list of webhooks for an Amplify app.
     * </p>
     * 
     * @param listWebhooksRequest
     *        The request structure for the list webhooks request.
     * @return Result of the ListWebhooks operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.ListWebhooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListWebhooks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWebhooksResult listWebhooks(ListWebhooksRequest request) {
        request = beforeClientExecution(request);
        return executeListWebhooks(request);
    }

    @SdkInternalApi
    final ListWebhooksResult executeListWebhooks(ListWebhooksRequest listWebhooksRequest) {

        ExecutionContext executionContext = createExecutionContext(listWebhooksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebhooksRequest> request = null;
        Response<ListWebhooksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebhooksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWebhooksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWebhooks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWebhooksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWebhooksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a deployment for a manually deployed app. Manually deployed apps are not connected to a repository.
     * </p>
     * 
     * @param startDeploymentRequest
     *        The request structure for the start a deployment request.
     * @return Result of the StartDeployment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartDeploymentResult startDeployment(StartDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeStartDeployment(request);
    }

    @SdkInternalApi
    final StartDeploymentResult executeStartDeployment(StartDeploymentRequest startDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(startDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDeploymentRequest> request = null;
        Response<StartDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a new job for a branch of an Amplify app.
     * </p>
     * 
     * @param startJobRequest
     *        The request structure for the start job request.
     * @return Result of the StartJob operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartJobResult startJob(StartJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartJob(request);
    }

    @SdkInternalApi
    final StartJobResult executeStartJob(StartJobRequest startJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRequest> request = null;
        Response<StartJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a job that is in progress for a branch of an Amplify app.
     * </p>
     * 
     * @param stopJobRequest
     *        The request structure for the stop job request.
     * @return Result of the StopJob operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopJobResult stopJob(StopJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopJob(request);
    }

    @SdkInternalApi
    final StopJobResult executeStopJob(StopJobRequest stopJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopJobRequest> request = null;
        Response<StopJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags the resource with a tag key and value.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request structure to tag a resource with a tag key and value.
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws ResourceNotFoundException
     *         An operation failed due to a non-existent resource.
     * @sample AWSAmplify.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
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
     * Untags a resource with a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param untagResourceRequest
     *        The request structure for the untag resource request.
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws ResourceNotFoundException
     *         An operation failed due to a non-existent resource.
     * @sample AWSAmplify.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
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
     * Updates an existing Amplify app.
     * </p>
     * 
     * @param updateAppRequest
     *        The request structure for the update app request.
     * @return Result of the UpdateApp operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAppResult updateApp(UpdateAppRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApp(request);
    }

    @SdkInternalApi
    final UpdateAppResult executeUpdateApp(UpdateAppRequest updateAppRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppRequest> request = null;
        Response<UpdateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a branch for an Amplify app.
     * </p>
     * 
     * @param updateBranchRequest
     *        The request structure for the update branch request.
     * @return Result of the UpdateBranch operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.UpdateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBranchResult updateBranch(UpdateBranchRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBranch(request);
    }

    @SdkInternalApi
    final UpdateBranchResult executeUpdateBranch(UpdateBranchRequest updateBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBranchRequest> request = null;
        Response<UpdateBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new domain association for an Amplify app.
     * </p>
     * 
     * @param updateDomainAssociationRequest
     *        The request structure for the update domain association request.
     * @return Result of the UpdateDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.UpdateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDomainAssociationResult updateDomainAssociation(UpdateDomainAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainAssociation(request);
    }

    @SdkInternalApi
    final UpdateDomainAssociationResult executeUpdateDomainAssociation(UpdateDomainAssociationRequest updateDomainAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainAssociationRequest> request = null;
        Response<UpdateDomainAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDomainAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDomainAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a webhook.
     * </p>
     * 
     * @param updateWebhookRequest
     *        The request structure for the update webhook request.
     * @return Result of the UpdateWebhook operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWebhookResult updateWebhook(UpdateWebhookRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWebhook(request);
    }

    @SdkInternalApi
    final UpdateWebhookResult executeUpdateWebhook(UpdateWebhookRequest updateWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWebhookRequest> request = null;
        Response<UpdateWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWebhookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWebhookResultJsonUnmarshaller());
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
