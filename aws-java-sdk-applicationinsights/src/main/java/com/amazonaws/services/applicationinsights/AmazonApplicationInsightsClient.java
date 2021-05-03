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
package com.amazonaws.services.applicationinsights;

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

import com.amazonaws.services.applicationinsights.AmazonApplicationInsightsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.applicationinsights.model.*;
import com.amazonaws.services.applicationinsights.model.transform.*;

/**
 * Client for accessing Application Insights. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon CloudWatch Application Insights</fullname>
 * <p>
 * Amazon CloudWatch Application Insights is a service that helps you detect common problems with your applications. It
 * enables you to pinpoint the source of issues in your applications (built with technologies such as Microsoft IIS,
 * .NET, and Microsoft SQL Server), by providing key insights into detected problems.
 * </p>
 * <p>
 * After you onboard your application, CloudWatch Application Insights identifies, recommends, and sets up metrics and
 * logs. It continuously analyzes and correlates your metrics and logs for unusual behavior to surface actionable
 * problems with your application. For example, if your application is slow and unresponsive and leading to HTTP 500
 * errors in your Application Load Balancer (ALB), Application Insights informs you that a memory pressure problem with
 * your SQL Server database is occurring. It bases this analysis on impactful metrics and log errors.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonApplicationInsightsClient extends AmazonWebServiceClient implements AmazonApplicationInsights {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonApplicationInsights.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "applicationinsights";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationinsights.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationinsights.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationinsights.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationinsights.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagsAlreadyExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationinsights.model.transform.TagsAlreadyExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationinsights.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationinsights.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationinsights.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.applicationinsights.model.AmazonApplicationInsightsException.class));

    public static AmazonApplicationInsightsClientBuilder builder() {
        return AmazonApplicationInsightsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Application Insights using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonApplicationInsightsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Application Insights using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonApplicationInsightsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("applicationinsights.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/applicationinsights/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/applicationinsights/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds an application that is created from a resource group.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws TagsAlreadyExistException
     *         Tags are already registered for the specified application ARN.
     * @throws AccessDeniedException
     *         User does not have permissions to perform this action.
     * @sample AmazonApplicationInsights.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom component by grouping similar standalone instances to monitor.
     * </p>
     * 
     * @param createComponentRequest
     * @return Result of the CreateComponent operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateComponentResult createComponent(CreateComponentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateComponent(request);
    }

    @SdkInternalApi
    final CreateComponentResult executeCreateComponent(CreateComponentRequest createComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(createComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComponentRequest> request = null;
        Response<CreateComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an log pattern to a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param createLogPatternRequest
     * @return Result of the CreateLogPattern operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.CreateLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLogPatternResult createLogPattern(CreateLogPatternRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLogPattern(request);
    }

    @SdkInternalApi
    final CreateLogPatternResult executeCreateLogPattern(CreateLogPatternRequest createLogPatternRequest) {

        ExecutionContext executionContext = createExecutionContext(createLogPatternRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogPatternRequest> request = null;
        Response<CreateLogPatternResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogPatternRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLogPatternRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLogPattern");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLogPatternResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLogPatternResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified application from monitoring. Does not delete the application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws BadRequestException
     *         The request is not understood by the server.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the
     * component are removed and the instances revert to their standalone status.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteComponentResult deleteComponent(DeleteComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteComponent(request);
    }

    @SdkInternalApi
    final DeleteComponentResult executeDeleteComponent(DeleteComponentRequest deleteComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteComponentRequest> request = null;
        Response<DeleteComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified log pattern from a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param deleteLogPatternRequest
     * @return Result of the DeleteLogPattern operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws BadRequestException
     *         The request is not understood by the server.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DeleteLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLogPattern(request);
    }

    @SdkInternalApi
    final DeleteLogPatternResult executeDeleteLogPattern(DeleteLogPatternRequest deleteLogPatternRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLogPatternRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogPatternRequest> request = null;
        Response<DeleteLogPatternResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogPatternRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLogPatternRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLogPattern");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLogPatternResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLogPatternResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationResult describeApplication(DescribeApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplication(request);
    }

    @SdkInternalApi
    final DescribeApplicationResult executeDescribeApplication(DescribeApplicationRequest describeApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationRequest> request = null;
        Response<DescribeApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a component and lists the resources that are grouped together in a component.
     * </p>
     * 
     * @param describeComponentRequest
     * @return Result of the DescribeComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeComponentResult describeComponent(DescribeComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeComponent(request);
    }

    @SdkInternalApi
    final DescribeComponentResult executeDescribeComponent(DescribeComponentRequest describeComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComponentRequest> request = null;
        Response<DescribeComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the monitoring configuration of the component.
     * </p>
     * 
     * @param describeComponentConfigurationRequest
     * @return Result of the DescribeComponentConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeComponentConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeComponentConfigurationResult describeComponentConfiguration(DescribeComponentConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeComponentConfiguration(request);
    }

    @SdkInternalApi
    final DescribeComponentConfigurationResult executeDescribeComponentConfiguration(DescribeComponentConfigurationRequest describeComponentConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeComponentConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComponentConfigurationRequest> request = null;
        Response<DescribeComponentConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComponentConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeComponentConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeComponentConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeComponentConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeComponentConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the recommended monitoring configuration of the component.
     * </p>
     * 
     * @param describeComponentConfigurationRecommendationRequest
     * @return Result of the DescribeComponentConfigurationRecommendation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeComponentConfigurationRecommendation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfigurationRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeComponentConfigurationRecommendationResult describeComponentConfigurationRecommendation(
            DescribeComponentConfigurationRecommendationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeComponentConfigurationRecommendation(request);
    }

    @SdkInternalApi
    final DescribeComponentConfigurationRecommendationResult executeDescribeComponentConfigurationRecommendation(
            DescribeComponentConfigurationRecommendationRequest describeComponentConfigurationRecommendationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeComponentConfigurationRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComponentConfigurationRecommendationRequest> request = null;
        Response<DescribeComponentConfigurationRecommendationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComponentConfigurationRecommendationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeComponentConfigurationRecommendationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeComponentConfigurationRecommendation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeComponentConfigurationRecommendationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeComponentConfigurationRecommendationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe a specific log pattern from a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param describeLogPatternRequest
     * @return Result of the DescribeLogPattern operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLogPatternResult describeLogPattern(DescribeLogPatternRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLogPattern(request);
    }

    @SdkInternalApi
    final DescribeLogPatternResult executeDescribeLogPattern(DescribeLogPatternRequest describeLogPatternRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLogPatternRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLogPatternRequest> request = null;
        Response<DescribeLogPatternResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLogPatternRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLogPatternRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLogPattern");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLogPatternResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLogPatternResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an anomaly or error with the application.
     * </p>
     * 
     * @param describeObservationRequest
     * @return Result of the DescribeObservation operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @sample AmazonApplicationInsights.DescribeObservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeObservation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeObservationResult describeObservation(DescribeObservationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeObservation(request);
    }

    @SdkInternalApi
    final DescribeObservationResult executeDescribeObservation(DescribeObservationRequest describeObservationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeObservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeObservationRequest> request = null;
        Response<DescribeObservationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeObservationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeObservationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeObservation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeObservationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeObservationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an application problem.
     * </p>
     * 
     * @param describeProblemRequest
     * @return Result of the DescribeProblem operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @sample AmazonApplicationInsights.DescribeProblem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProblemResult describeProblem(DescribeProblemRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProblem(request);
    }

    @SdkInternalApi
    final DescribeProblemResult executeDescribeProblem(DescribeProblemRequest describeProblemRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProblemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProblemRequest> request = null;
        Response<DescribeProblemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProblemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProblemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProblem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProblemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProblemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the anomalies or errors associated with the problem.
     * </p>
     * 
     * @param describeProblemObservationsRequest
     * @return Result of the DescribeProblemObservations operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @sample AmazonApplicationInsights.DescribeProblemObservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblemObservations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProblemObservationsResult describeProblemObservations(DescribeProblemObservationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProblemObservations(request);
    }

    @SdkInternalApi
    final DescribeProblemObservationsResult executeDescribeProblemObservations(DescribeProblemObservationsRequest describeProblemObservationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProblemObservationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProblemObservationsRequest> request = null;
        Response<DescribeProblemObservationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProblemObservationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeProblemObservationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProblemObservations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProblemObservationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProblemObservationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the IDs of the applications that you are monitoring.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the auto-grouped, standalone, and custom components of the application.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListComponents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListComponentsResult listComponents(ListComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeListComponents(request);
    }

    @SdkInternalApi
    final ListComponentsResult executeListComponents(ListComponentsRequest listComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentsRequest> request = null;
        Response<ListComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the INFO, WARN, and ERROR events for periodic configuration updates performed by Application Insights.
     * Examples of events represented are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INFO: creating a new alarm or updating an alarm threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARN: alarm not created due to insufficient data points used to predict thresholds.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR: alarm not created due to permission errors or exceeding quotas.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listConfigurationHistoryRequest
     * @return Result of the ListConfigurationHistory operation returned by the service.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListConfigurationHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListConfigurationHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConfigurationHistoryResult listConfigurationHistory(ListConfigurationHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurationHistory(request);
    }

    @SdkInternalApi
    final ListConfigurationHistoryResult executeListConfigurationHistory(ListConfigurationHistoryRequest listConfigurationHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationHistoryRequest> request = null;
        Response<ListConfigurationHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConfigurationHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurationHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConfigurationHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the log pattern sets in the specific application.
     * </p>
     * 
     * @param listLogPatternSetsRequest
     * @return Result of the ListLogPatternSets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListLogPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatternSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLogPatternSetsResult listLogPatternSets(ListLogPatternSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListLogPatternSets(request);
    }

    @SdkInternalApi
    final ListLogPatternSetsResult executeListLogPatternSets(ListLogPatternSetsRequest listLogPatternSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLogPatternSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLogPatternSetsRequest> request = null;
        Response<ListLogPatternSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLogPatternSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLogPatternSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLogPatternSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLogPatternSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLogPatternSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the log patterns in the specific log <code>LogPatternSet</code>.
     * </p>
     * 
     * @param listLogPatternsRequest
     * @return Result of the ListLogPatterns operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListLogPatterns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatterns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLogPatternsResult listLogPatterns(ListLogPatternsRequest request) {
        request = beforeClientExecution(request);
        return executeListLogPatterns(request);
    }

    @SdkInternalApi
    final ListLogPatternsResult executeListLogPatterns(ListLogPatternsRequest listLogPatternsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLogPatternsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLogPatternsRequest> request = null;
        Response<ListLogPatternsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLogPatternsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLogPatternsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLogPatterns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLogPatternsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLogPatternsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the problems with your application.
     * </p>
     * 
     * @param listProblemsRequest
     * @return Result of the ListProblems operation returned by the service.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListProblems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListProblems"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProblemsResult listProblems(ListProblemsRequest request) {
        request = beforeClientExecution(request);
        return executeListProblems(request);
    }

    @SdkInternalApi
    final ListProblemsResult executeListProblems(ListProblemsRequest listProblemsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProblemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProblemsRequest> request = null;
        Response<ListProblemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProblemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProblemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProblems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProblemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProblemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specified application. A <i>tag</i> is a
     * label that you optionally define and associate with an application. Each tag consists of a required <i>tag
     * key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a category for
     * more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @sample AmazonApplicationInsights.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
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
     * Add one or more tags (keys and values) to a specified application. A <i>tag</i> is a label that you optionally
     * define and associate with an application. Tags can help you categorize and manage application in different ways,
     * such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A
     * tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
     * within a tag key.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws TooManyTagsException
     *         The number of the provided tags is beyond the limit, or the number of total tags you are trying to attach
     *         to the specified resource exceeds the limit.
     * @throws ValidationException
     *         The parameter is not valid.
     * @sample AmazonApplicationInsights.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
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
     * Remove one or more tags (keys and values) from a specified application.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @sample AmazonApplicationInsights.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
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
     * Updates the application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @sample AmazonApplicationInsights.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the custom component name and/or the list of resources that make up the component.
     * </p>
     * 
     * @param updateComponentRequest
     * @return Result of the UpdateComponent operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateComponentResult updateComponent(UpdateComponentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateComponent(request);
    }

    @SdkInternalApi
    final UpdateComponentResult executeUpdateComponent(UpdateComponentRequest updateComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateComponentRequest> request = null;
        Response<UpdateComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of
     * the configuration and should match the schema of what is returned by
     * <code>DescribeComponentConfigurationRecommendation</code>.
     * </p>
     * 
     * @param updateComponentConfigurationRequest
     * @return Result of the UpdateComponentConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.UpdateComponentConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateComponentConfigurationResult updateComponentConfiguration(UpdateComponentConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateComponentConfiguration(request);
    }

    @SdkInternalApi
    final UpdateComponentConfigurationResult executeUpdateComponentConfiguration(UpdateComponentConfigurationRequest updateComponentConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateComponentConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateComponentConfigurationRequest> request = null;
        Response<UpdateComponentConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateComponentConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateComponentConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateComponentConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateComponentConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateComponentConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a log pattern to a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param updateLogPatternRequest
     * @return Result of the UpdateLogPattern operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.UpdateLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLogPatternResult updateLogPattern(UpdateLogPatternRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLogPattern(request);
    }

    @SdkInternalApi
    final UpdateLogPatternResult executeUpdateLogPattern(UpdateLogPatternRequest updateLogPatternRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLogPatternRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLogPatternRequest> request = null;
        Response<UpdateLogPatternResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLogPatternRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLogPatternRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Insights");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLogPattern");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLogPatternResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLogPatternResultJsonUnmarshaller());
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
