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
package com.amazonaws.services.workspaces;

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

import com.amazonaws.services.workspaces.AmazonWorkspacesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.services.workspaces.model.transform.*;

/**
 * Client for accessing Amazon WorkSpaces. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows and Amazon Linux desktops for your
 * users.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkspacesClient extends AmazonWebServiceClient implements AmazonWorkspaces {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonWorkspaces.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "workspaces";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedWorkspaceConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.UnsupportedWorkspaceConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedNetworkConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.UnsupportedNetworkConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WorkspacesDefaultRoleNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.WorkspacesDefaultRoleNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotSupportedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.OperationNotSupportedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAssociatedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.ResourceAssociatedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.InvalidResourceStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValuesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.InvalidParameterValuesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationInProgressException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.OperationInProgressExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.ResourceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceCreationFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.ResourceCreationFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspaces.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.workspaces.model.AmazonWorkspacesException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces. A credentials provider chain will be used
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
     * @deprecated use {@link AmazonWorkspacesClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonWorkspacesClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonWorkspacesClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonWorkspacesClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonWorkspacesClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonWorkspacesClientBuilder builder() {
        return AmazonWorkspacesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkspacesClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkspacesClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://workspaces.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/workspaces/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/workspaces/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates the specified connection alias with the specified directory to enable cross-Region redirection. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </note>
     * 
     * @param associateConnectionAliasRequest
     * @return Result of the AssociateConnectionAlias operation returned by the service.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.AssociateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateConnectionAliasResult associateConnectionAlias(AssociateConnectionAliasRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateConnectionAlias(request);
    }

    @SdkInternalApi
    final AssociateConnectionAliasResult executeAssociateConnectionAlias(AssociateConnectionAliasRequest associateConnectionAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(associateConnectionAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateConnectionAliasRequest> request = null;
        Response<AssociateConnectionAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateConnectionAliasRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateConnectionAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateConnectionAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateConnectionAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateConnectionAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified IP access control group with the specified directory.
     * </p>
     * 
     * @param associateIpGroupsRequest
     * @return Result of the AssociateIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.AssociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateIpGroupsResult associateIpGroups(AssociateIpGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateIpGroups(request);
    }

    @SdkInternalApi
    final AssociateIpGroupsResult executeAssociateIpGroups(AssociateIpGroupsRequest associateIpGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateIpGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateIpGroupsRequest> request = null;
        Response<AssociateIpGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateIpGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateIpGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateIpGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateIpGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateIpGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more rules to the specified IP access control group.
     * </p>
     * <p>
     * This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the
     * rules.
     * </p>
     * 
     * @param authorizeIpRulesRequest
     * @return Result of the AuthorizeIpRules operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.AuthorizeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AuthorizeIpRules" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AuthorizeIpRulesResult authorizeIpRules(AuthorizeIpRulesRequest request) {
        request = beforeClientExecution(request);
        return executeAuthorizeIpRules(request);
    }

    @SdkInternalApi
    final AuthorizeIpRulesResult executeAuthorizeIpRules(AuthorizeIpRulesRequest authorizeIpRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(authorizeIpRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeIpRulesRequest> request = null;
        Response<AuthorizeIpRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeIpRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(authorizeIpRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AuthorizeIpRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AuthorizeIpRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AuthorizeIpRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified image from the specified Region to the current Region. For more information about copying
     * images, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/copy-custom-image.html"> Copy a
     * Custom WorkSpaces Image</a>.
     * </p>
     * <note>
     * <p>
     * In the China (Ningxia) Region, you can copy images only within the same Region.
     * </p>
     * <p>
     * In the AWS GovCloud (US-West) Region, to copy images to and from other AWS Regions, contact AWS Support.
     * </p>
     * </note> <important>
     * <p>
     * Before copying a shared image, be sure to verify that it has been shared from the correct AWS account. To
     * determine if an image has been shared and to see the AWS account ID that owns an image, use the <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImages.html"
     * >DescribeWorkSpaceImages</a> and <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImagePermissions.html"
     * >DescribeWorkspaceImagePermissions</a> API operations.
     * </p>
     * </important>
     * 
     * @param copyWorkspaceImageRequest
     * @return Result of the CopyWorkspaceImage operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.CopyWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CopyWorkspaceImage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CopyWorkspaceImageResult copyWorkspaceImage(CopyWorkspaceImageRequest request) {
        request = beforeClientExecution(request);
        return executeCopyWorkspaceImage(request);
    }

    @SdkInternalApi
    final CopyWorkspaceImageResult executeCopyWorkspaceImage(CopyWorkspaceImageRequest copyWorkspaceImageRequest) {

        ExecutionContext executionContext = createExecutionContext(copyWorkspaceImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyWorkspaceImageRequest> request = null;
        Response<CopyWorkspaceImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyWorkspaceImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyWorkspaceImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyWorkspaceImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyWorkspaceImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyWorkspaceImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the specified connection alias for use with cross-Region redirection. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param createConnectionAliasRequest
     * @return Result of the CreateConnectionAlias operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.CreateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConnectionAliasResult createConnectionAlias(CreateConnectionAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnectionAlias(request);
    }

    @SdkInternalApi
    final CreateConnectionAliasResult executeCreateConnectionAlias(CreateConnectionAliasRequest createConnectionAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectionAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectionAliasRequest> request = null;
        Response<CreateConnectionAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectionAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectionAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnectionAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectionAliasResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateConnectionAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an IP access control group.
     * </p>
     * <p>
     * An IP access control group provides you with the ability to control the IP addresses from which users are allowed
     * to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and
     * then associate the group with your directory. You can add rules when you create the group or at any time using
     * <a>AuthorizeIpRules</a>.
     * </p>
     * <p>
     * There is a default IP access control group associated with your directory. If you don't associate an IP access
     * control group with your directory, the default group is used. The default group includes a default rule that
     * allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for
     * your directory.
     * </p>
     * 
     * @param createIpGroupRequest
     * @return Result of the CreateIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceCreationFailedException
     *         The resource could not be created.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.CreateIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateIpGroupResult createIpGroup(CreateIpGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIpGroup(request);
    }

    @SdkInternalApi
    final CreateIpGroupResult executeCreateIpGroup(CreateIpGroupRequest createIpGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createIpGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIpGroupRequest> request = null;
        Response<CreateIpGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIpGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIpGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIpGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIpGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIpGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AmazonWorkspaces.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTags(request);
    }

    @SdkInternalApi
    final CreateTagsResult executeCreateTags(CreateTagsRequest createTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<CreateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the specified WorkSpace bundle. For more information about creating WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/create-custom-bundle.html"> Create a Custom
     * WorkSpaces Image and Bundle</a>.
     * </p>
     * 
     * @param createWorkspaceBundleRequest
     * @return Result of the CreateWorkspaceBundle operation returned by the service.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.CreateWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkspaceBundleResult createWorkspaceBundle(CreateWorkspaceBundleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspaceBundle(request);
    }

    @SdkInternalApi
    final CreateWorkspaceBundleResult executeCreateWorkspaceBundle(CreateWorkspaceBundleRequest createWorkspaceBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspaceBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspaceBundleRequest> request = null;
        Response<CreateWorkspaceBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspaceBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkspaceBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspaceBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspaceBundleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateWorkspaceBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * 
     * @param createWorkspacesRequest
     * @return Result of the CreateWorkspaces operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspaces(request);
    }

    @SdkInternalApi
    final CreateWorkspacesResult executeCreateWorkspaces(CreateWorkspacesRequest createWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspacesRequest> request = null;
        Response<CreateWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified connection alias. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <important>
     * <p>
     * <b>If you will no longer be using a fully qualified domain name (FQDN) as the registration code for your
     * WorkSpaces users, you must take certain precautions to prevent potential security issues.</b> For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html#cross-region-redirection-security-considerations"
     * > Security Considerations if You Stop Using Cross-Region Redirection</a>.
     * </p>
     * </important> <note>
     * <p>
     * To delete a connection alias that has been shared, the shared account must first disassociate the connection
     * alias from any directories it has been associated with. Then you must unshare the connection alias from the
     * account it has been shared with. You can delete a connection alias only after it is no longer shared with any
     * accounts or associated with any directories.
     * </p>
     * </note>
     * 
     * @param deleteConnectionAliasRequest
     * @return Result of the DeleteConnectionAlias operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.DeleteConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConnectionAliasResult deleteConnectionAlias(DeleteConnectionAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnectionAlias(request);
    }

    @SdkInternalApi
    final DeleteConnectionAliasResult executeDeleteConnectionAlias(DeleteConnectionAliasRequest deleteConnectionAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectionAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionAliasRequest> request = null;
        Response<DeleteConnectionAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectionAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnectionAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectionAliasResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteConnectionAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified IP access control group.
     * </p>
     * <p>
     * You cannot delete an IP access control group that is associated with a directory.
     * </p>
     * 
     * @param deleteIpGroupRequest
     * @return Result of the DeleteIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DeleteIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIpGroupResult deleteIpGroup(DeleteIpGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIpGroup(request);
    }

    @SdkInternalApi
    final DeleteIpGroupResult executeDeleteIpGroup(DeleteIpGroupRequest deleteIpGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIpGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIpGroupRequest> request = null;
        Response<DeleteIpGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIpGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIpGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIpGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIpGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIpGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified tags from the specified WorkSpaces resource.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified WorkSpace bundle. For more information about deleting WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete_bundle.html"> Delete a Custom WorkSpaces
     * Bundle or Image</a>.
     * </p>
     * 
     * @param deleteWorkspaceBundleRequest
     * @return Result of the DeleteWorkspaceBundle operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DeleteWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkspaceBundleResult deleteWorkspaceBundle(DeleteWorkspaceBundleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspaceBundle(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceBundleResult executeDeleteWorkspaceBundle(DeleteWorkspaceBundleRequest deleteWorkspaceBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceBundleRequest> request = null;
        Response<DeleteWorkspaceBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkspaceBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspaceBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceBundleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteWorkspaceBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
     * associated with the image and unshare the image if it is shared with other accounts.
     * </p>
     * 
     * @param deleteWorkspaceImageRequest
     * @return Result of the DeleteWorkspaceImage operation returned by the service.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DeleteWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspaceImage(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceImageResult executeDeleteWorkspaceImage(DeleteWorkspaceImageRequest deleteWorkspaceImageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceImageRequest> request = null;
        Response<DeleteWorkspaceImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkspaceImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspaceImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkspaceImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters the specified directory. This operation is asynchronous and returns before the WorkSpace directory is
     * deregistered. If any WorkSpaces are registered to this directory, you must remove them before you can deregister
     * the directory.
     * </p>
     * <note>
     * <p>
     * Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no
     * WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will
     * be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per
     * the <a href="http://aws.amazon.com/directoryservice/pricing/">AWS Directory Services pricing terms</a>.
     * </p>
     * <p>
     * To delete empty directories, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete-workspaces-directory.html"> Delete the
     * Directory for Your WorkSpaces</a>. If you delete your Simple AD or AD Connector directory, you can always create
     * a new one when you want to start using WorkSpaces again.
     * </p>
     * </note>
     * 
     * @param deregisterWorkspaceDirectoryRequest
     * @return Result of the DeregisterWorkspaceDirectory operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @sample AmazonWorkspaces.DeregisterWorkspaceDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeregisterWorkspaceDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterWorkspaceDirectoryResult deregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterWorkspaceDirectory(request);
    }

    @SdkInternalApi
    final DeregisterWorkspaceDirectoryResult executeDeregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest deregisterWorkspaceDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterWorkspaceDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterWorkspaceDirectoryRequest> request = null;
        Response<DeregisterWorkspaceDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterWorkspaceDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterWorkspaceDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterWorkspaceDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterWorkspaceDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterWorkspaceDirectoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list that describes the configuration of Bring Your Own License (BYOL) for the specified account.
     * </p>
     * 
     * @param describeAccountRequest
     * @return Result of the DescribeAccount operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAccountResult describeAccount(DescribeAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccount(request);
    }

    @SdkInternalApi
    final DescribeAccountResult executeDescribeAccount(DescribeAccountRequest describeAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountRequest> request = null;
        Response<DescribeAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list that describes modifications to the configuration of Bring Your Own License (BYOL) for the
     * specified account.
     * </p>
     * 
     * @param describeAccountModificationsRequest
     * @return Result of the DescribeAccountModifications operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeAccountModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccountModifications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountModificationsResult describeAccountModifications(DescribeAccountModificationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountModifications(request);
    }

    @SdkInternalApi
    final DescribeAccountModificationsResult executeDescribeAccountModifications(DescribeAccountModificationsRequest describeAccountModificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountModificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountModificationsRequest> request = null;
        Response<DescribeAccountModificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountModificationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountModificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountModifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountModificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountModificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param describeClientPropertiesRequest
     * @return Result of the DescribeClientProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClientPropertiesResult describeClientProperties(DescribeClientPropertiesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClientProperties(request);
    }

    @SdkInternalApi
    final DescribeClientPropertiesResult executeDescribeClientProperties(DescribeClientPropertiesRequest describeClientPropertiesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClientPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClientPropertiesRequest> request = null;
        Response<DescribeClientPropertiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClientPropertiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeClientPropertiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClientProperties");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClientPropertiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeClientPropertiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the permissions that the owner of a connection alias has granted to another AWS account for the
     * specified connection alias. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param describeConnectionAliasPermissionsRequest
     * @return Result of the DescribeConnectionAliasPermissions operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.DescribeConnectionAliasPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliasPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConnectionAliasPermissionsResult describeConnectionAliasPermissions(DescribeConnectionAliasPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnectionAliasPermissions(request);
    }

    @SdkInternalApi
    final DescribeConnectionAliasPermissionsResult executeDescribeConnectionAliasPermissions(
            DescribeConnectionAliasPermissionsRequest describeConnectionAliasPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectionAliasPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionAliasPermissionsRequest> request = null;
        Response<DescribeConnectionAliasPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionAliasPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConnectionAliasPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnectionAliasPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectionAliasPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConnectionAliasPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list that describes the connection aliases used for cross-Region redirection. For more information,
     * see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html">
     * Cross-Region Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param describeConnectionAliasesRequest
     * @return Result of the DescribeConnectionAliases operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.DescribeConnectionAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConnectionAliasesResult describeConnectionAliases(DescribeConnectionAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnectionAliases(request);
    }

    @SdkInternalApi
    final DescribeConnectionAliasesResult executeDescribeConnectionAliases(DescribeConnectionAliasesRequest describeConnectionAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectionAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionAliasesRequest> request = null;
        Response<DescribeConnectionAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionAliasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConnectionAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnectionAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectionAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConnectionAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your IP access control groups.
     * </p>
     * 
     * @param describeIpGroupsRequest
     * @return Result of the DescribeIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeIpGroupsResult describeIpGroups(DescribeIpGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIpGroups(request);
    }

    @SdkInternalApi
    final DescribeIpGroupsResult executeDescribeIpGroups(DescribeIpGroupsRequest describeIpGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIpGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIpGroupsRequest> request = null;
        Response<DescribeIpGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIpGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIpGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIpGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIpGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeIpGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list that describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @return Result of the DescribeWorkspaceBundles operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceBundles(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceBundlesResult executeDescribeWorkspaceBundles(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceBundlesRequest> request = null;
        Response<DescribeWorkspaceBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceBundlesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspaceBundles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceBundlesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles() {
        return describeWorkspaceBundles(new DescribeWorkspaceBundlesRequest());
    }

    /**
     * <p>
     * Describes the available directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @return Result of the DescribeWorkspaceDirectories operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceDirectories(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceDirectoriesResult executeDescribeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceDirectoriesRequest> request = null;
        Response<DescribeWorkspaceDirectoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceDirectoriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspaceDirectories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceDirectoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceDirectoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories() {
        return describeWorkspaceDirectories(new DescribeWorkspaceDirectoriesRequest());
    }

    /**
     * <p>
     * Describes the permissions that the owner of an image has granted to other AWS accounts for an image.
     * </p>
     * 
     * @param describeWorkspaceImagePermissionsRequest
     * @return Result of the DescribeWorkspaceImagePermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceImagePermissionsResult describeWorkspaceImagePermissions(DescribeWorkspaceImagePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceImagePermissions(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceImagePermissionsResult executeDescribeWorkspaceImagePermissions(
            DescribeWorkspaceImagePermissionsRequest describeWorkspaceImagePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceImagePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceImagePermissionsRequest> request = null;
        Response<DescribeWorkspaceImagePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceImagePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceImagePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspaceImagePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceImagePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceImagePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise,
     * all images in the account are described.
     * </p>
     * 
     * @param describeWorkspaceImagesRequest
     * @return Result of the DescribeWorkspaceImages operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeWorkspaceImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImages"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceImagesResult describeWorkspaceImages(DescribeWorkspaceImagesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceImages(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceImagesResult executeDescribeWorkspaceImages(DescribeWorkspaceImagesRequest describeWorkspaceImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceImagesRequest> request = null;
        Response<DescribeWorkspaceImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceImagesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspaceImages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the snapshots for the specified WorkSpace.
     * </p>
     * 
     * @param describeWorkspaceSnapshotsRequest
     * @return Result of the DescribeWorkspaceSnapshots operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeWorkspaceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceSnapshotsResult describeWorkspaceSnapshots(DescribeWorkspaceSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceSnapshots(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceSnapshotsResult executeDescribeWorkspaceSnapshots(DescribeWorkspaceSnapshotsRequest describeWorkspaceSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceSnapshotsRequest> request = null;
        Response<DescribeWorkspaceSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspaceSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified WorkSpaces.
     * </p>
     * <p>
     * You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify
     * only one filter at a time.
     * </p>
     * 
     * @param describeWorkspacesRequest
     * @return Result of the DescribeWorkspaces operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaces(request);
    }

    @SdkInternalApi
    final DescribeWorkspacesResult executeDescribeWorkspaces(DescribeWorkspacesRequest describeWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspacesRequest> request = null;
        Response<DescribeWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeWorkspacesResult describeWorkspaces() {
        return describeWorkspaces(new DescribeWorkspacesRequest());
    }

    /**
     * <p>
     * Describes the connection status of the specified WorkSpaces.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return Result of the DescribeWorkspacesConnectionStatus operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspacesConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspacesConnectionStatusResult describeWorkspacesConnectionStatus(DescribeWorkspacesConnectionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspacesConnectionStatus(request);
    }

    @SdkInternalApi
    final DescribeWorkspacesConnectionStatusResult executeDescribeWorkspacesConnectionStatus(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspacesConnectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspacesConnectionStatusRequest> request = null;
        Response<DescribeWorkspacesConnectionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspacesConnectionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspacesConnectionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspacesConnectionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspacesConnectionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspacesConnectionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a connection alias from a directory. Disassociating a connection alias disables cross-Region
     * redirection between two directories in different AWS Regions. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </note>
     * 
     * @param disassociateConnectionAliasRequest
     * @return Result of the DisassociateConnectionAlias operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.DisassociateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateConnectionAliasResult disassociateConnectionAlias(DisassociateConnectionAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateConnectionAlias(request);
    }

    @SdkInternalApi
    final DisassociateConnectionAliasResult executeDisassociateConnectionAlias(DisassociateConnectionAliasRequest disassociateConnectionAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateConnectionAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateConnectionAliasRequest> request = null;
        Response<DisassociateConnectionAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateConnectionAliasRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateConnectionAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateConnectionAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateConnectionAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateConnectionAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified IP access control group from the specified directory.
     * </p>
     * 
     * @param disassociateIpGroupsRequest
     * @return Result of the DisassociateIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DisassociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateIpGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateIpGroupsResult disassociateIpGroups(DisassociateIpGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateIpGroups(request);
    }

    @SdkInternalApi
    final DisassociateIpGroupsResult executeDisassociateIpGroups(DisassociateIpGroupsRequest disassociateIpGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateIpGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateIpGroupsRequest> request = null;
        Response<DisassociateIpGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateIpGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateIpGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateIpGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateIpGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateIpGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports the specified Windows 10 Bring Your Own License (BYOL) image into Amazon WorkSpaces. The image must be an
     * already licensed Amazon EC2 image that is in your AWS account, and you must own the image. For more information
     * about creating BYOL images, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html"> Bring Your Own Windows
     * Desktop Licenses</a>.
     * </p>
     * 
     * @param importWorkspaceImageRequest
     * @return Result of the ImportWorkspaceImage operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.ImportWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportWorkspaceImageResult importWorkspaceImage(ImportWorkspaceImageRequest request) {
        request = beforeClientExecution(request);
        return executeImportWorkspaceImage(request);
    }

    @SdkInternalApi
    final ImportWorkspaceImageResult executeImportWorkspaceImage(ImportWorkspaceImageRequest importWorkspaceImageRequest) {

        ExecutionContext executionContext = createExecutionContext(importWorkspaceImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportWorkspaceImageRequest> request = null;
        Response<ImportWorkspaceImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportWorkspaceImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importWorkspaceImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportWorkspaceImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportWorkspaceImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportWorkspaceImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management
     * interface when you enable Bring Your Own License (BYOL).
     * </p>
     * <p>
     * This operation can be run only by AWS accounts that are enabled for BYOL. If your account isn't enabled for BYOL,
     * you'll receive an <code>AccessDeniedException</code> error.
     * </p>
     * <p>
     * The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
     * interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
     * manage the WorkSpace.
     * </p>
     * 
     * @param listAvailableManagementCidrRangesRequest
     * @return Result of the ListAvailableManagementCidrRanges operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.ListAvailableManagementCidrRanges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAvailableManagementCidrRanges"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAvailableManagementCidrRangesResult listAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest request) {
        request = beforeClientExecution(request);
        return executeListAvailableManagementCidrRanges(request);
    }

    @SdkInternalApi
    final ListAvailableManagementCidrRangesResult executeListAvailableManagementCidrRanges(
            ListAvailableManagementCidrRangesRequest listAvailableManagementCidrRangesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAvailableManagementCidrRangesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableManagementCidrRangesRequest> request = null;
        Response<ListAvailableManagementCidrRangesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailableManagementCidrRangesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAvailableManagementCidrRangesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAvailableManagementCidrRanges");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAvailableManagementCidrRangesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAvailableManagementCidrRangesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Migrates a WorkSpace from one operating system or bundle type to another, while retaining the data on the user
     * volume.
     * </p>
     * <p>
     * The migration process recreates the WorkSpace by using a new root volume from the target bundle image and the
     * user volume from the last available snapshot of the original WorkSpace. During migration, the original
     * <code>D:\Users\%USERNAME%</code> user profile folder is renamed to
     * <code>D:\Users\%USERNAME%MMddyyTHHmmss%.NotMigrated</code>. A new <code>D:\Users\%USERNAME%\</code> folder is
     * generated by the new OS. Certain files in the old user profile are moved to the new user profile.
     * </p>
     * <p>
     * For available migration scenarios, details about what happens during migration, and best practices, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/migrate-workspaces.html">Migrate a WorkSpace</a>.
     * </p>
     * 
     * @param migrateWorkspaceRequest
     * @return Result of the MigrateWorkspace operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws OperationInProgressException
     *         The properties of this WorkSpace are currently being modified. Try again in a moment.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.MigrateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/MigrateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public MigrateWorkspaceResult migrateWorkspace(MigrateWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeMigrateWorkspace(request);
    }

    @SdkInternalApi
    final MigrateWorkspaceResult executeMigrateWorkspace(MigrateWorkspaceRequest migrateWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(migrateWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MigrateWorkspaceRequest> request = null;
        Response<MigrateWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MigrateWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(migrateWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MigrateWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MigrateWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new MigrateWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the configuration of Bring Your Own License (BYOL) for the specified account.
     * </p>
     * 
     * @param modifyAccountRequest
     * @return Result of the ModifyAccount operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.ModifyAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ModifyAccountResult modifyAccount(ModifyAccountRequest request) {
        request = beforeClientExecution(request);
        return executeModifyAccount(request);
    }

    @SdkInternalApi
    final ModifyAccountResult executeModifyAccount(ModifyAccountRequest modifyAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyAccountRequest> request = null;
        Response<ModifyAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ModifyAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the properties of the specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param modifyClientPropertiesRequest
     * @return Result of the ModifyClientProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.ModifyClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyClientPropertiesResult modifyClientProperties(ModifyClientPropertiesRequest request) {
        request = beforeClientExecution(request);
        return executeModifyClientProperties(request);
    }

    @SdkInternalApi
    final ModifyClientPropertiesResult executeModifyClientProperties(ModifyClientPropertiesRequest modifyClientPropertiesRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClientPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClientPropertiesRequest> request = null;
        Response<ModifyClientPropertiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClientPropertiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyClientPropertiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyClientProperties");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyClientPropertiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyClientPropertiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the self-service WorkSpace management capabilities for your users. For more information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/enable-user-self-service-workspace-management.html"
     * >Enable Self-Service WorkSpace Management Capabilities for Your Users</a>.
     * </p>
     * 
     * @param modifySelfservicePermissionsRequest
     * @return Result of the ModifySelfservicePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.ModifySelfservicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifySelfservicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifySelfservicePermissionsResult modifySelfservicePermissions(ModifySelfservicePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeModifySelfservicePermissions(request);
    }

    @SdkInternalApi
    final ModifySelfservicePermissionsResult executeModifySelfservicePermissions(ModifySelfservicePermissionsRequest modifySelfservicePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(modifySelfservicePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifySelfservicePermissionsRequest> request = null;
        Response<ModifySelfservicePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifySelfservicePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifySelfservicePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifySelfservicePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifySelfservicePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifySelfservicePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies which devices and operating systems users can use to access their WorkSpaces. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html#control-device-access">
     * Control Device Access</a>.
     * </p>
     * 
     * @param modifyWorkspaceAccessPropertiesRequest
     * @return Result of the ModifyWorkspaceAccessProperties operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.ModifyWorkspaceAccessProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceAccessProperties"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyWorkspaceAccessPropertiesResult modifyWorkspaceAccessProperties(ModifyWorkspaceAccessPropertiesRequest request) {
        request = beforeClientExecution(request);
        return executeModifyWorkspaceAccessProperties(request);
    }

    @SdkInternalApi
    final ModifyWorkspaceAccessPropertiesResult executeModifyWorkspaceAccessProperties(
            ModifyWorkspaceAccessPropertiesRequest modifyWorkspaceAccessPropertiesRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyWorkspaceAccessPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyWorkspaceAccessPropertiesRequest> request = null;
        Response<ModifyWorkspaceAccessPropertiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyWorkspaceAccessPropertiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyWorkspaceAccessPropertiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyWorkspaceAccessProperties");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyWorkspaceAccessPropertiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyWorkspaceAccessPropertiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modify the default properties used to create WorkSpaces.
     * </p>
     * 
     * @param modifyWorkspaceCreationPropertiesRequest
     * @return Result of the ModifyWorkspaceCreationProperties operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.ModifyWorkspaceCreationProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceCreationProperties"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyWorkspaceCreationPropertiesResult modifyWorkspaceCreationProperties(ModifyWorkspaceCreationPropertiesRequest request) {
        request = beforeClientExecution(request);
        return executeModifyWorkspaceCreationProperties(request);
    }

    @SdkInternalApi
    final ModifyWorkspaceCreationPropertiesResult executeModifyWorkspaceCreationProperties(
            ModifyWorkspaceCreationPropertiesRequest modifyWorkspaceCreationPropertiesRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyWorkspaceCreationPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyWorkspaceCreationPropertiesRequest> request = null;
        Response<ModifyWorkspaceCreationPropertiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyWorkspaceCreationPropertiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyWorkspaceCreationPropertiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyWorkspaceCreationProperties");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyWorkspaceCreationPropertiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyWorkspaceCreationPropertiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified WorkSpace properties. For important information about how to modify the size of the root
     * and user volumes, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html">
     * Modify a WorkSpace</a>.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return Result of the ModifyWorkspaceProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationInProgressException
     *         The properties of this WorkSpace are currently being modified. Try again in a moment.
     * @throws UnsupportedWorkspaceConfigurationException
     *         The configuration of this WorkSpace is not supported for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/required-service-components.html">Required
     *         Configuration and Service Components for WorkSpaces </a>.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyWorkspacePropertiesResult modifyWorkspaceProperties(ModifyWorkspacePropertiesRequest request) {
        request = beforeClientExecution(request);
        return executeModifyWorkspaceProperties(request);
    }

    @SdkInternalApi
    final ModifyWorkspacePropertiesResult executeModifyWorkspaceProperties(ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyWorkspacePropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyWorkspacePropertiesRequest> request = null;
        Response<ModifyWorkspacePropertiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyWorkspacePropertiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyWorkspacePropertiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyWorkspaceProperties");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyWorkspacePropertiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyWorkspacePropertiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the state of the specified WorkSpace.
     * </p>
     * <p>
     * To maintain a WorkSpace without being interrupted, set the WorkSpace state to <code>ADMIN_MAINTENANCE</code>.
     * WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop
     * WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the <code>ADMIN_MAINTENANCE</code>
     * state.
     * </p>
     * 
     * @param modifyWorkspaceStateRequest
     * @return Result of the ModifyWorkspaceState operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.ModifyWorkspaceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceState"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyWorkspaceStateResult modifyWorkspaceState(ModifyWorkspaceStateRequest request) {
        request = beforeClientExecution(request);
        return executeModifyWorkspaceState(request);
    }

    @SdkInternalApi
    final ModifyWorkspaceStateResult executeModifyWorkspaceState(ModifyWorkspaceStateRequest modifyWorkspaceStateRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyWorkspaceStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyWorkspaceStateRequest> request = null;
        Response<ModifyWorkspaceStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyWorkspaceStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyWorkspaceStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyWorkspaceState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyWorkspaceStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ModifyWorkspaceStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot reboot a WorkSpace unless its state is <code>AVAILABLE</code> or <code>UNHEALTHY</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have rebooted.
     * </p>
     * 
     * @param rebootWorkspacesRequest
     * @return Result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeRebootWorkspaces(request);
    }

    @SdkInternalApi
    final RebootWorkspacesResult executeRebootWorkspaces(RebootWorkspacesRequest rebootWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootWorkspacesRequest> request = null;
        Response<RebootWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebootWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebootWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rebuilds the specified WorkSpace.
     * </p>
     * <p>
     * You cannot rebuild a WorkSpace unless its state is <code>AVAILABLE</code>, <code>ERROR</code>,
     * <code>UNHEALTHY</code>, <code>STOPPED</code>, or <code>REBOOTING</code>.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/reset-workspace.html">Rebuild
     * a WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
     * </p>
     * 
     * @param rebuildWorkspacesRequest
     * @return Result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeRebuildWorkspaces(request);
    }

    @SdkInternalApi
    final RebuildWorkspacesResult executeRebuildWorkspaces(RebuildWorkspacesRequest rebuildWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(rebuildWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebuildWorkspacesRequest> request = null;
        Response<RebuildWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebuildWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebuildWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebuildWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebuildWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebuildWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the specified directory. This operation is asynchronous and returns before the WorkSpace directory is
     * registered. If this is the first time you are registering a directory, you will need to create the
     * workspaces_DefaultRole role before you can register a directory. For more information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role">
     * Creating the workspaces_DefaultRole Role</a>.
     * </p>
     * 
     * @param registerWorkspaceDirectoryRequest
     * @return Result of the RegisterWorkspaceDirectory operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws WorkspacesDefaultRoleNotFoundException
     *         The workspaces_DefaultRole role could not be found. If this is the first time you are registering a
     *         directory, you will need to create the workspaces_DefaultRole role before you can register a directory.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role"
     *         >Creating the workspaces_DefaultRole Role</a>.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws UnsupportedNetworkConfigurationException
     *         The configuration of this network is not supported for this operation, or your network configuration
     *         conflicts with the Amazon WorkSpaces management network IP range. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces-vpc.html"> Configure a
     *         VPC for Amazon WorkSpaces</a>.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.RegisterWorkspaceDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RegisterWorkspaceDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterWorkspaceDirectory(request);
    }

    @SdkInternalApi
    final RegisterWorkspaceDirectoryResult executeRegisterWorkspaceDirectory(RegisterWorkspaceDirectoryRequest registerWorkspaceDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(registerWorkspaceDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterWorkspaceDirectoryRequest> request = null;
        Response<RegisterWorkspaceDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterWorkspaceDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerWorkspaceDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterWorkspaceDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterWorkspaceDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterWorkspaceDirectoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores the specified WorkSpace to its last known healthy state.
     * </p>
     * <p>
     * You cannot restore a WorkSpace unless its state is <code> AVAILABLE</code>, <code>ERROR</code>,
     * <code>UNHEALTHY</code>, or <code>STOPPED</code>.
     * </p>
     * <p>
     * Restoring a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/restore-workspace.html">Restore a WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpace is completely restored.
     * </p>
     * 
     * @param restoreWorkspaceRequest
     * @return Result of the RestoreWorkspace operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.RestoreWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RestoreWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RestoreWorkspaceResult restoreWorkspace(RestoreWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreWorkspace(request);
    }

    @SdkInternalApi
    final RestoreWorkspaceResult executeRestoreWorkspace(RestoreWorkspaceRequest restoreWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreWorkspaceRequest> request = null;
        Response<RestoreWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more rules from the specified IP access control group.
     * </p>
     * 
     * @param revokeIpRulesRequest
     * @return Result of the RevokeIpRules operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.RevokeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RevokeIpRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RevokeIpRulesResult revokeIpRules(RevokeIpRulesRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeIpRules(request);
    }

    @SdkInternalApi
    final RevokeIpRulesResult executeRevokeIpRules(RevokeIpRulesRequest revokeIpRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeIpRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeIpRulesRequest> request = null;
        Response<RevokeIpRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeIpRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeIpRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeIpRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeIpRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeIpRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot start a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>STOPPED</code>.
     * </p>
     * 
     * @param startWorkspacesRequest
     * @return Result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartWorkspacesResult startWorkspaces(StartWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeStartWorkspaces(request);
    }

    @SdkInternalApi
    final StartWorkspacesResult executeStartWorkspaces(StartWorkspacesRequest startWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(startWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartWorkspacesRequest> request = null;
        Response<StartWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot stop a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>AVAILABLE</code>, <code>IMPAIRED</code>, <code>UNHEALTHY</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @return Result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeStopWorkspaces(request);
    }

    @SdkInternalApi
    final StopWorkspacesResult executeStopWorkspaces(StopWorkspacesRequest stopWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(stopWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopWorkspacesRequest> request = null;
        Response<StopWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <important>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
     * archive any user data, contact AWS Support before terminating the WorkSpace.
     * </p>
     * </important>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated. After a
     * WorkSpace is terminated, the <code>TERMINATED</code> state is returned only briefly before the WorkSpace
     * directory metadata is cleaned up, so this state is rarely returned. To confirm that a WorkSpace is terminated,
     * check for the WorkSpace ID by using <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html"> DescribeWorkSpaces</a>. If
     * the WorkSpace ID isn't returned, then the WorkSpace has been successfully terminated.
     * </p>
     * <note>
     * <p>
     * Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no
     * WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will
     * be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per
     * the <a href="http://aws.amazon.com/directoryservice/pricing/">AWS Directory Services pricing terms</a>.
     * </p>
     * <p>
     * To delete empty directories, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete-workspaces-directory.html"> Delete the
     * Directory for Your WorkSpaces</a>. If you delete your Simple AD or AD Connector directory, you can always create
     * a new one when you want to start using WorkSpaces again.
     * </p>
     * </note>
     * 
     * @param terminateWorkspacesRequest
     * @return Result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateWorkspaces(request);
    }

    @SdkInternalApi
    final TerminateWorkspacesResult executeTerminateWorkspaces(TerminateWorkspacesRequest terminateWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateWorkspacesRequest> request = null;
        Response<TerminateWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(terminateWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TerminateWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Shares or unshares a connection alias with one account by specifying whether that account has permission to
     * associate the connection alias with a directory. If the association permission is granted, the connection alias
     * is shared with that account. If the association permission is revoked, the connection alias is unshared with the
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a connection alias that has been shared, the shared account must first disassociate the connection
     * alias from any directories it has been associated with. Then you must unshare the connection alias from the
     * account it has been shared with. You can delete a connection alias only after it is no longer shared with any
     * accounts or associated with any directories.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateConnectionAliasPermissionRequest
     * @return Result of the UpdateConnectionAliasPermission operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.UpdateConnectionAliasPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateConnectionAliasPermission"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConnectionAliasPermissionResult updateConnectionAliasPermission(UpdateConnectionAliasPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConnectionAliasPermission(request);
    }

    @SdkInternalApi
    final UpdateConnectionAliasPermissionResult executeUpdateConnectionAliasPermission(
            UpdateConnectionAliasPermissionRequest updateConnectionAliasPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConnectionAliasPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConnectionAliasPermissionRequest> request = null;
        Response<UpdateConnectionAliasPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConnectionAliasPermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConnectionAliasPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConnectionAliasPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConnectionAliasPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConnectionAliasPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the current rules of the specified IP access control group with the specified rules.
     * </p>
     * 
     * @param updateRulesOfIpGroupRequest
     * @return Result of the UpdateRulesOfIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.UpdateRulesOfIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateRulesOfIpGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRulesOfIpGroupResult updateRulesOfIpGroup(UpdateRulesOfIpGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRulesOfIpGroup(request);
    }

    @SdkInternalApi
    final UpdateRulesOfIpGroupResult executeUpdateRulesOfIpGroup(UpdateRulesOfIpGroupRequest updateRulesOfIpGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRulesOfIpGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRulesOfIpGroupRequest> request = null;
        Response<UpdateRulesOfIpGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRulesOfIpGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRulesOfIpGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRulesOfIpGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRulesOfIpGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRulesOfIpGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a WorkSpace bundle with a new image. For more information about updating WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/update-custom-bundle.html"> Update a Custom
     * WorkSpaces Bundle</a>.
     * </p>
     * <important>
     * <p>
     * Existing WorkSpaces aren't automatically updated when you update the bundle that they're based on. To update
     * existing WorkSpaces that are based on a bundle that you've updated, you must either rebuild the WorkSpaces or
     * delete and recreate them.
     * </p>
     * </important>
     * 
     * @param updateWorkspaceBundleRequest
     * @return Result of the UpdateWorkspaceBundle operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.UpdateWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkspaceBundleResult updateWorkspaceBundle(UpdateWorkspaceBundleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkspaceBundle(request);
    }

    @SdkInternalApi
    final UpdateWorkspaceBundleResult executeUpdateWorkspaceBundle(UpdateWorkspaceBundleRequest updateWorkspaceBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkspaceBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkspaceBundleRequest> request = null;
        Response<UpdateWorkspaceBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkspaceBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkspaceBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkspaceBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkspaceBundleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateWorkspaceBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Shares or unshares an image with one account in the same AWS Region by specifying whether that account has
     * permission to copy the image. If the copy image permission is granted, the image is shared with that account. If
     * the copy image permission is revoked, the image is unshared with the account.
     * </p>
     * <p>
     * After an image has been shared, the recipient account can copy the image to other AWS Regions as needed.
     * </p>
     * <note>
     * <p>
     * In the China (Ningxia) Region, you can copy images only within the same Region.
     * </p>
     * <p>
     * In the AWS GovCloud (US-West) Region, to copy images to and from other AWS Regions, contact AWS Support.
     * </p>
     * </note>
     * <p>
     * For more information about sharing images, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/share-custom-image.html"> Share or Unshare a
     * Custom WorkSpaces Image</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * To delete an image that has been shared, you must unshare the image before you delete it.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sharing Bring Your Own License (BYOL) images across AWS accounts isn't supported at this time in the AWS GovCloud
     * (US-West) Region. To share BYOL images across accounts in the AWS GovCloud (US-West) Region, contact AWS Support.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateWorkspaceImagePermissionRequest
     * @return Result of the UpdateWorkspaceImagePermission operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.UpdateWorkspaceImagePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceImagePermission"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkspaceImagePermissionResult updateWorkspaceImagePermission(UpdateWorkspaceImagePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkspaceImagePermission(request);
    }

    @SdkInternalApi
    final UpdateWorkspaceImagePermissionResult executeUpdateWorkspaceImagePermission(UpdateWorkspaceImagePermissionRequest updateWorkspaceImagePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkspaceImagePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkspaceImagePermissionRequest> request = null;
        Response<UpdateWorkspaceImagePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkspaceImagePermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateWorkspaceImagePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkspaceImagePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkspaceImagePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateWorkspaceImagePermissionResultJsonUnmarshaller());
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
