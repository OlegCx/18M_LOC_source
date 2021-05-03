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
package com.amazonaws.services.medialive;

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

import com.amazonaws.services.medialive.AWSMediaLiveClientBuilder;
import com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.services.medialive.model.transform.*;

/**
 * Client for accessing MediaLive. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * API for AWS Elemental MediaLive
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaLiveClient extends AmazonWebServiceClient implements AWSMediaLive {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaLive.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "medialive";

    private volatile AWSMediaLiveWaiters waiters;

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
                                    com.amazonaws.services.medialive.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medialive.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medialive.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnprocessableEntityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medialive.model.transform.UnprocessableEntityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medialive.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medialive.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadGatewayException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medialive.model.transform.BadGatewayExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GatewayTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medialive.model.transform.GatewayTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medialive.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.medialive.model.AWSMediaLiveException.class));

    public static AWSMediaLiveClientBuilder builder() {
        return AWSMediaLiveClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MediaLive using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaLiveClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MediaLive using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaLiveClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("medialive.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/medialive/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/medialive/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Accept an incoming input device transfer. The ownership of the device will transfer to your AWS account.
     * 
     * @param acceptInputDeviceTransferRequest
     *        Placeholder documentation for AcceptInputDeviceTransferRequest
     * @return Result of the AcceptInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to accept input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be accepted.
     * @sample AWSMediaLive.AcceptInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AcceptInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptInputDeviceTransferResult acceptInputDeviceTransfer(AcceptInputDeviceTransferRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptInputDeviceTransfer(request);
    }

    @SdkInternalApi
    final AcceptInputDeviceTransferResult executeAcceptInputDeviceTransfer(AcceptInputDeviceTransferRequest acceptInputDeviceTransferRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptInputDeviceTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptInputDeviceTransferRequest> request = null;
        Response<AcceptInputDeviceTransferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptInputDeviceTransferRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptInputDeviceTransferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptInputDeviceTransfer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptInputDeviceTransferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptInputDeviceTransferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Starts delete of resources.
     * 
     * @param batchDeleteRequest
     *        A request to delete resources
     * @return Result of the BatchDelete operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to delete the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to delete do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete resources calls.
     * @throws ConflictException
     *         The resources are unable to delete.
     * @sample AWSMediaLive.BatchDelete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchDelete" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchDeleteResult batchDelete(BatchDeleteRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDelete(request);
    }

    @SdkInternalApi
    final BatchDeleteResult executeBatchDelete(BatchDeleteRequest batchDeleteRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteRequest> request = null;
        Response<BatchDeleteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDelete");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Starts existing resources
     * 
     * @param batchStartRequest
     *        A request to start resources
     * @return Result of the BatchStart operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to start the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to start do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on start resources calls to resource service.
     * @throws ConflictException
     *         The resources are unable to start.
     * @sample AWSMediaLive.BatchStart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStart" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchStartResult batchStart(BatchStartRequest request) {
        request = beforeClientExecution(request);
        return executeBatchStart(request);
    }

    @SdkInternalApi
    final BatchStartResult executeBatchStart(BatchStartRequest batchStartRequest) {

        ExecutionContext executionContext = createExecutionContext(batchStartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchStartRequest> request = null;
        Response<BatchStartResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchStartRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchStartRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchStart");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchStartResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchStartResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Stops running resources
     * 
     * @param batchStopRequest
     *        A request to stop resources
     * @return Result of the BatchStop operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to stop the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to stop do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop resources.
     * @throws ConflictException
     *         The resources are unable to stop.
     * @sample AWSMediaLive.BatchStop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStop" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchStopResult batchStop(BatchStopRequest request) {
        request = beforeClientExecution(request);
        return executeBatchStop(request);
    }

    @SdkInternalApi
    final BatchStopResult executeBatchStop(BatchStopRequest batchStopRequest) {

        ExecutionContext executionContext = createExecutionContext(batchStopRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchStopRequest> request = null;
        Response<BatchStopResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchStopRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchStopRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchStop");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchStopResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchStopResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update a channel schedule
     * 
     * @param batchUpdateScheduleRequest
     *        List of actions to create and list of actions to delete.
     * @return Result of the BatchUpdateSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The update schedule request failed validation.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The specified channel id does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on update schedule calls.
     * @sample AWSMediaLive.BatchUpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchUpdateSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchUpdateScheduleResult batchUpdateSchedule(BatchUpdateScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateSchedule(request);
    }

    @SdkInternalApi
    final BatchUpdateScheduleResult executeBatchUpdateSchedule(BatchUpdateScheduleRequest batchUpdateScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateScheduleRequest> request = null;
        Response<BatchUpdateScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Cancel an input device transfer that you have requested.
     * 
     * @param cancelInputDeviceTransferRequest
     *        Placeholder documentation for CancelInputDeviceTransferRequest
     * @return Result of the CancelInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to cancel input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be canceled.
     * @sample AWSMediaLive.CancelInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CancelInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelInputDeviceTransferResult cancelInputDeviceTransfer(CancelInputDeviceTransferRequest request) {
        request = beforeClientExecution(request);
        return executeCancelInputDeviceTransfer(request);
    }

    @SdkInternalApi
    final CancelInputDeviceTransferResult executeCancelInputDeviceTransfer(CancelInputDeviceTransferRequest cancelInputDeviceTransferRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelInputDeviceTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelInputDeviceTransferRequest> request = null;
        Response<CancelInputDeviceTransferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelInputDeviceTransferRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelInputDeviceTransferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelInputDeviceTransfer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelInputDeviceTransferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelInputDeviceTransferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest
     *        A request to create a channel
     * @return Result of the CreateChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The Channel failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to create the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on create channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to create due to an issue with channel resources.
     * @sample AWSMediaLive.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateChannelResult createChannel(CreateChannelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannel(request);
    }

    @SdkInternalApi
    final CreateChannelResult executeCreateChannel(CreateChannelRequest createChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelRequest> request = null;
        Response<CreateChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create an input
     * 
     * @param createInputRequest
     *        The name of the input
     * @return Result of the CreateInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInputResult createInput(CreateInputRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInput(request);
    }

    @SdkInternalApi
    final CreateInputResult executeCreateInput(CreateInputRequest createInputRequest) {

        ExecutionContext executionContext = createExecutionContext(createInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInputRequest> request = null;
        Response<CreateInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest
     *        The IPv4 CIDRs to whitelist for this Input Security Group
     * @return Result of the CreateInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to create an Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to create an Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.CreateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInputSecurityGroupResult createInputSecurityGroup(CreateInputSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInputSecurityGroup(request);
    }

    @SdkInternalApi
    final CreateInputSecurityGroupResult executeCreateInputSecurityGroup(CreateInputSecurityGroupRequest createInputSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInputSecurityGroupRequest> request = null;
        Response<CreateInputSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInputSecurityGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createInputSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInputSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInputSecurityGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateInputSecurityGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create a new multiplex.
     * 
     * @param createMultiplexRequest
     *        A request to create a multiplex.
     * @return Result of the CreateMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The Multiplex failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to create the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on create multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to create due to an issue with multiplex resources.
     * @sample AWSMediaLive.CreateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMultiplexResult createMultiplex(CreateMultiplexRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMultiplex(request);
    }

    @SdkInternalApi
    final CreateMultiplexResult executeCreateMultiplex(CreateMultiplexRequest createMultiplexRequest) {

        ExecutionContext executionContext = createExecutionContext(createMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMultiplexRequest> request = null;
        Response<CreateMultiplexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMultiplexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMultiplexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMultiplex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMultiplexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMultiplexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create a new program in the multiplex.
     * 
     * @param createMultiplexProgramRequest
     *        A request to create a program in a multiplex.
     * @return Result of the CreateMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The Multiplex program failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to create a program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on create multiplex program calls to multiplex service.
     * @throws ConflictException
     *         The multiplex program is unable to create due to an issue with multiplex resources.
     * @sample AWSMediaLive.CreateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMultiplexProgramResult createMultiplexProgram(CreateMultiplexProgramRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMultiplexProgram(request);
    }

    @SdkInternalApi
    final CreateMultiplexProgramResult executeCreateMultiplexProgram(CreateMultiplexProgramRequest createMultiplexProgramRequest) {

        ExecutionContext executionContext = createExecutionContext(createMultiplexProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMultiplexProgramRequest> request = null;
        Response<CreateMultiplexProgramResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMultiplexProgramRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMultiplexProgramRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMultiplexProgram");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMultiplexProgramResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMultiplexProgramResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create a partner input
     * 
     * @param createPartnerInputRequest
     *        A request to create a partner input
     * @return Result of the CreatePartnerInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.CreatePartnerInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreatePartnerInput" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePartnerInputResult createPartnerInput(CreatePartnerInputRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePartnerInput(request);
    }

    @SdkInternalApi
    final CreatePartnerInputResult executeCreatePartnerInput(CreatePartnerInputRequest createPartnerInputRequest) {

        ExecutionContext executionContext = createExecutionContext(createPartnerInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePartnerInputRequest> request = null;
        Response<CreatePartnerInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePartnerInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPartnerInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePartnerInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePartnerInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePartnerInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create tags for a resource
     * 
     * @param createTagsRequest
     *        Placeholder documentation for CreateTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateTags" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest
     *        Placeholder documentation for DeleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to delete the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to delete does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to delete due to an issue with channel resources.
     * @sample AWSMediaLive.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteChannelResult deleteChannel(DeleteChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannel(request);
    }

    @SdkInternalApi
    final DeleteChannelResult executeDeleteChannel(DeleteChannelRequest deleteChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelRequest> request = null;
        Response<DeleteChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest
     *        Placeholder documentation for DeleteInputRequest
     * @return Result of the DeleteInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @throws ConflictException
     *         Resource conflict
     * @sample AWSMediaLive.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInputResult deleteInput(DeleteInputRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInput(request);
    }

    @SdkInternalApi
    final DeleteInputResult executeDeleteInput(DeleteInputRequest deleteInputRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInputRequest> request = null;
        Response<DeleteInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest
     *        Placeholder documentation for DeleteInputSecurityGroupRequest
     * @return Result of the DeleteInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to delete the Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to delete this Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input Security Group not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.DeleteInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInputSecurityGroupResult deleteInputSecurityGroup(DeleteInputSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInputSecurityGroup(request);
    }

    @SdkInternalApi
    final DeleteInputSecurityGroupResult executeDeleteInputSecurityGroup(DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInputSecurityGroupRequest> request = null;
        Response<DeleteInputSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInputSecurityGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInputSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInputSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInputSecurityGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInputSecurityGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Delete a multiplex. The multiplex must be idle.
     * 
     * @param deleteMultiplexRequest
     *        Placeholder documentation for DeleteMultiplexRequest
     * @return Result of the DeleteMultiplex operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to delete the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to delete doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to delete due to an issue with multiplex resources.
     * @sample AWSMediaLive.DeleteMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMultiplexResult deleteMultiplex(DeleteMultiplexRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMultiplex(request);
    }

    @SdkInternalApi
    final DeleteMultiplexResult executeDeleteMultiplex(DeleteMultiplexRequest deleteMultiplexRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMultiplexRequest> request = null;
        Response<DeleteMultiplexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMultiplexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMultiplexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMultiplex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMultiplexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMultiplexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Delete a program from a multiplex.
     * 
     * @param deleteMultiplexProgramRequest
     *        Placeholder documentation for DeleteMultiplexProgramRequest
     * @return Result of the DeleteMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to delete the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The program that you are trying to delete doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete multiplex program calls to multiplex service.
     * @throws ConflictException
     *         The multiplex program is unable to delete due to an issue with multiplex resources.
     * @sample AWSMediaLive.DeleteMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMultiplexProgramResult deleteMultiplexProgram(DeleteMultiplexProgramRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMultiplexProgram(request);
    }

    @SdkInternalApi
    final DeleteMultiplexProgramResult executeDeleteMultiplexProgram(DeleteMultiplexProgramRequest deleteMultiplexProgramRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMultiplexProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMultiplexProgramRequest> request = null;
        Response<DeleteMultiplexProgramResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMultiplexProgramRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMultiplexProgramRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMultiplexProgram");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMultiplexProgramResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMultiplexProgramResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Delete an expired reservation.
     * 
     * @param deleteReservationRequest
     *        Placeholder documentation for DeleteReservationRequest
     * @return Result of the DeleteReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to delete reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation you're attempting to delete does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete reservation request
     * @throws ConflictException
     *         The reservation could not be deleted because it is currently active.
     * @sample AWSMediaLive.DeleteReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteReservation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteReservationResult deleteReservation(DeleteReservationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReservation(request);
    }

    @SdkInternalApi
    final DeleteReservationResult executeDeleteReservation(DeleteReservationRequest deleteReservationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReservationRequest> request = null;
        Response<DeleteReservationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReservationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReservationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReservation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReservationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReservationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Delete all schedule actions on a channel.
     * 
     * @param deleteScheduleRequest
     *        Placeholder documentation for DeleteScheduleRequest
     * @return Result of the DeleteSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request to delete the schedule on this channel was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to delete the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The specified channel does not exist to have its schedule deleted.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete schedule calls.
     * @sample AWSMediaLive.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteScheduleResult deleteSchedule(DeleteScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchedule(request);
    }

    @SdkInternalApi
    final DeleteScheduleResult executeDeleteSchedule(DeleteScheduleRequest deleteScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduleRequest> request = null;
        Response<DeleteScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes tags for a resource
     * 
     * @param deleteTagsRequest
     *        Placeholder documentation for DeleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteTags" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Gets details about a channel
     * 
     * @param describeChannelRequest
     *        Placeholder documentation for DescribeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to describe does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe channel calls to channel service.
     * @sample AWSMediaLive.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeChannelResult describeChannel(DescribeChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannel(request);
    }

    @SdkInternalApi
    final DescribeChannelResult executeDescribeChannel(DescribeChannelRequest describeChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelRequest> request = null;
        Response<DescribeChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces details about an input
     * 
     * @param describeInputRequest
     *        Placeholder documentation for DescribeInputRequest
     * @return Result of the DescribeInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeInputResult describeInput(DescribeInputRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInput(request);
    }

    @SdkInternalApi
    final DescribeInputResult executeDescribeInput(DescribeInputRequest describeInputRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputRequest> request = null;
        Response<DescribeInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Gets the details for the input device
     * 
     * @param describeInputDeviceRequest
     *        Placeholder documentation for DescribeInputDeviceRequest
     * @return Result of the DescribeInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         The input device you're requesting to describe does not exist. Check the ID.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe calls to the input device service.
     * @sample AWSMediaLive.DescribeInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeInputDeviceResult describeInputDevice(DescribeInputDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInputDevice(request);
    }

    @SdkInternalApi
    final DescribeInputDeviceResult executeDescribeInputDevice(DescribeInputDeviceRequest describeInputDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInputDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputDeviceRequest> request = null;
        Response<DescribeInputDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInputDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInputDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInputDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInputDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get the latest thumbnail data for the input device.
     * 
     * @param describeInputDeviceThumbnailRequest
     *        Placeholder documentation for DescribeInputDeviceThumbnailRequest
     * @return Result of the DescribeInputDeviceThumbnail operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe input device thumbnail.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on get thumbnail calls to the input device service.
     * @sample AWSMediaLive.DescribeInputDeviceThumbnail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDeviceThumbnail"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInputDeviceThumbnailResult describeInputDeviceThumbnail(DescribeInputDeviceThumbnailRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInputDeviceThumbnail(request);
    }

    @SdkInternalApi
    final DescribeInputDeviceThumbnailResult executeDescribeInputDeviceThumbnail(DescribeInputDeviceThumbnailRequest describeInputDeviceThumbnailRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInputDeviceThumbnailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputDeviceThumbnailRequest> request = null;
        Response<DescribeInputDeviceThumbnailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputDeviceThumbnailRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInputDeviceThumbnailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInputDeviceThumbnail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInputDeviceThumbnailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true),
                    new DescribeInputDeviceThumbnailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest
     *        Placeholder documentation for DescribeInputSecurityGroupRequest
     * @return Result of the DescribeInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to describe an Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to describe this Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input Security Group not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.DescribeInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInputSecurityGroupResult describeInputSecurityGroup(DescribeInputSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInputSecurityGroup(request);
    }

    @SdkInternalApi
    final DescribeInputSecurityGroupResult executeDescribeInputSecurityGroup(DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputSecurityGroupRequest> request = null;
        Response<DescribeInputSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputSecurityGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInputSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInputSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInputSecurityGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInputSecurityGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Gets details about a multiplex.
     * 
     * @param describeMultiplexRequest
     *        Placeholder documentation for DescribeMultiplexRequest
     * @return Result of the DescribeMultiplex operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to describe the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to describe doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe multiplex calls to multiplex service.
     * @sample AWSMediaLive.DescribeMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplex" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeMultiplexResult describeMultiplex(DescribeMultiplexRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMultiplex(request);
    }

    @SdkInternalApi
    final DescribeMultiplexResult executeDescribeMultiplex(DescribeMultiplexRequest describeMultiplexRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMultiplexRequest> request = null;
        Response<DescribeMultiplexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMultiplexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMultiplexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMultiplex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMultiplexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMultiplexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get the details for a program in a multiplex.
     * 
     * @param describeMultiplexProgramRequest
     *        Placeholder documentation for DescribeMultiplexProgramRequest
     * @return Result of the DescribeMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to describe the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't describe the program. The multiplex or the program that you specified doesn’t exist.
     *         Check the IDs and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe multiplex program calls to multiplex service.
     * @sample AWSMediaLive.DescribeMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMultiplexProgramResult describeMultiplexProgram(DescribeMultiplexProgramRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMultiplexProgram(request);
    }

    @SdkInternalApi
    final DescribeMultiplexProgramResult executeDescribeMultiplexProgram(DescribeMultiplexProgramRequest describeMultiplexProgramRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMultiplexProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMultiplexProgramRequest> request = null;
        Response<DescribeMultiplexProgramResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMultiplexProgramRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMultiplexProgramRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMultiplexProgram");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMultiplexProgramResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMultiplexProgramResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get details for an offering.
     * 
     * @param describeOfferingRequest
     *        Placeholder documentation for DescribeOfferingRequest
     * @return Result of the DescribeOffering operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to describe offering
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Offering you're attempting to describe does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe offering request
     * @sample AWSMediaLive.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeOffering" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeOfferingResult describeOffering(DescribeOfferingRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOffering(request);
    }

    @SdkInternalApi
    final DescribeOfferingResult executeDescribeOffering(DescribeOfferingRequest describeOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOfferingRequest> request = null;
        Response<DescribeOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOfferingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get details for a reservation.
     * 
     * @param describeReservationRequest
     *        Placeholder documentation for DescribeReservationRequest
     * @return Result of the DescribeReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to describe reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation you're attempting to describe does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe reservation request
     * @sample AWSMediaLive.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeReservation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeReservationResult describeReservation(DescribeReservationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservation(request);
    }

    @SdkInternalApi
    final DescribeReservationResult executeDescribeReservation(DescribeReservationRequest describeReservationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservationRequest> request = null;
        Response<DescribeReservationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeReservationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeReservationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get a channel schedule
     * 
     * @param describeScheduleRequest
     *        Placeholder documentation for DescribeScheduleRequest
     * @return Result of the DescribeSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting a schedule describe for does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe schedule calls.
     * @sample AWSMediaLive.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeScheduleResult describeSchedule(DescribeScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSchedule(request);
    }

    @SdkInternalApi
    final DescribeScheduleResult executeDescribeSchedule(DescribeScheduleRequest describeScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduleRequest> request = null;
        Response<DescribeScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest
     *        Placeholder documentation for ListChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list channels.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list channel calls to channel service.
     * @sample AWSMediaLive.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListChannelsResult listChannels(ListChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannels(request);
    }

    @SdkInternalApi
    final ListChannelsResult executeListChannels(ListChannelsRequest listChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsRequest> request = null;
        Response<ListChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List input devices that are currently being transferred. List input devices that you are transferring from your
     * AWS account or input devices that another AWS account is transferring to you.
     * 
     * @param listInputDeviceTransfersRequest
     *        Placeholder documentation for ListInputDeviceTransfersRequest
     * @return Result of the ListInputDeviceTransfers operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list transferring devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list devices calls to the input device service.
     * @sample AWSMediaLive.ListInputDeviceTransfers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDeviceTransfers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInputDeviceTransfersResult listInputDeviceTransfers(ListInputDeviceTransfersRequest request) {
        request = beforeClientExecution(request);
        return executeListInputDeviceTransfers(request);
    }

    @SdkInternalApi
    final ListInputDeviceTransfersResult executeListInputDeviceTransfers(ListInputDeviceTransfersRequest listInputDeviceTransfersRequest) {

        ExecutionContext executionContext = createExecutionContext(listInputDeviceTransfersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputDeviceTransfersRequest> request = null;
        Response<ListInputDeviceTransfersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputDeviceTransfersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInputDeviceTransfersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInputDeviceTransfers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInputDeviceTransfersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInputDeviceTransfersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List input devices
     * 
     * @param listInputDevicesRequest
     *        Placeholder documentation for ListInputDevicesRequest
     * @return Result of the ListInputDevices operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list input devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list devices calls to the input device service.
     * @sample AWSMediaLive.ListInputDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInputDevicesResult listInputDevices(ListInputDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListInputDevices(request);
    }

    @SdkInternalApi
    final ListInputDevicesResult executeListInputDevices(ListInputDevicesRequest listInputDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInputDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputDevicesRequest> request = null;
        Response<ListInputDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInputDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInputDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInputDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInputDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest
     *        Placeholder documentation for ListInputSecurityGroupsRequest
     * @return Result of the ListInputSecurityGroups operation returned by the service.
     * @throws BadRequestException
     *         The request to list Input Security Groups was invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to call ListInputSecurityGroups
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.ListInputSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInputSecurityGroupsResult listInputSecurityGroups(ListInputSecurityGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListInputSecurityGroups(request);
    }

    @SdkInternalApi
    final ListInputSecurityGroupsResult executeListInputSecurityGroups(ListInputSecurityGroupsRequest listInputSecurityGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInputSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputSecurityGroupsRequest> request = null;
        Response<ListInputSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputSecurityGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInputSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInputSecurityGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInputSecurityGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInputSecurityGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest
     *        Placeholder documentation for ListInputsRequest
     * @return Result of the ListInputs operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInputsResult listInputs(ListInputsRequest request) {
        request = beforeClientExecution(request);
        return executeListInputs(request);
    }

    @SdkInternalApi
    final ListInputsResult executeListInputs(ListInputsRequest listInputsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInputsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputsRequest> request = null;
        Response<ListInputsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInputsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInputs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInputsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInputsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List the programs that currently exist for a specific multiplex.
     * 
     * @param listMultiplexProgramsRequest
     *        Placeholder documentation for ListMultiplexProgramsRequest
     * @return Result of the ListMultiplexPrograms operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list multiplex programs.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't provide the list of programs. The multiplex that you specified doesn’t exist. Check the
     *         ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list multiplex calls to multiplex service.
     * @sample AWSMediaLive.ListMultiplexPrograms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexPrograms"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMultiplexProgramsResult listMultiplexPrograms(ListMultiplexProgramsRequest request) {
        request = beforeClientExecution(request);
        return executeListMultiplexPrograms(request);
    }

    @SdkInternalApi
    final ListMultiplexProgramsResult executeListMultiplexPrograms(ListMultiplexProgramsRequest listMultiplexProgramsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMultiplexProgramsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMultiplexProgramsRequest> request = null;
        Response<ListMultiplexProgramsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMultiplexProgramsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMultiplexProgramsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMultiplexPrograms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMultiplexProgramsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListMultiplexProgramsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieve a list of the existing multiplexes.
     * 
     * @param listMultiplexesRequest
     *        Placeholder documentation for ListMultiplexesRequest
     * @return Result of the ListMultiplexes operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to list multiplexes.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list multiplex calls to multiplex service.
     * @sample AWSMediaLive.ListMultiplexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMultiplexesResult listMultiplexes(ListMultiplexesRequest request) {
        request = beforeClientExecution(request);
        return executeListMultiplexes(request);
    }

    @SdkInternalApi
    final ListMultiplexesResult executeListMultiplexes(ListMultiplexesRequest listMultiplexesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMultiplexesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMultiplexesRequest> request = null;
        Response<ListMultiplexesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMultiplexesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMultiplexesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMultiplexes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMultiplexesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMultiplexesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List offerings available for purchase.
     * 
     * @param listOfferingsRequest
     *        Placeholder documentation for ListOfferingsRequest
     * @return Result of the ListOfferings operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to list offerings
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list offerings request
     * @sample AWSMediaLive.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListOfferingsResult listOfferings(ListOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeListOfferings(request);
    }

    @SdkInternalApi
    final ListOfferingsResult executeListOfferings(ListOfferingsRequest listOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOfferingsRequest> request = null;
        Response<ListOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOfferingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOfferingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOfferingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List purchased reservations.
     * 
     * @param listReservationsRequest
     *        Placeholder documentation for ListReservationsRequest
     * @return Result of the ListReservations operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to list reservations
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list reservations request
     * @sample AWSMediaLive.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListReservations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReservationsResult listReservations(ListReservationsRequest request) {
        request = beforeClientExecution(request);
        return executeListReservations(request);
    }

    @SdkInternalApi
    final ListReservationsResult executeListReservations(ListReservationsRequest listReservationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReservationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReservationsRequest> request = null;
        Response<ListReservationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReservationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReservationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReservations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReservationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReservationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces list of tags that have been created for a resource
     * 
     * @param listTagsForResourceRequest
     *        Placeholder documentation for ListTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Purchase an offering and create a reservation.
     * 
     * @param purchaseOfferingRequest
     *        Placeholder documentation for PurchaseOfferingRequest
     * @return Result of the PurchaseOffering operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to purchase the offering
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Offering you're attempting to purchase does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on purchase offering request
     * @throws ConflictException
     *         Offering purchase prevented by service resource issue
     * @sample AWSMediaLive.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PurchaseOffering" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseOffering(request);
    }

    @SdkInternalApi
    final PurchaseOfferingResult executePurchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseOfferingRequest> request = null;
        Response<PurchaseOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseOfferingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(purchaseOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurchaseOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PurchaseOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Reject the transfer of the specified input device to your AWS account.
     * 
     * @param rejectInputDeviceTransferRequest
     *        Placeholder documentation for RejectInputDeviceTransferRequest
     * @return Result of the RejectInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to reject input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be rejected.
     * @sample AWSMediaLive.RejectInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RejectInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectInputDeviceTransferResult rejectInputDeviceTransfer(RejectInputDeviceTransferRequest request) {
        request = beforeClientExecution(request);
        return executeRejectInputDeviceTransfer(request);
    }

    @SdkInternalApi
    final RejectInputDeviceTransferResult executeRejectInputDeviceTransfer(RejectInputDeviceTransferRequest rejectInputDeviceTransferRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectInputDeviceTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectInputDeviceTransferRequest> request = null;
        Response<RejectInputDeviceTransferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectInputDeviceTransferRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectInputDeviceTransferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectInputDeviceTransfer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectInputDeviceTransferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RejectInputDeviceTransferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest
     *        Placeholder documentation for StartChannelRequest
     * @return Result of the StartChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to start the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to start does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on start channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to start due to an issue with channel resources.
     * @sample AWSMediaLive.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartChannelResult startChannel(StartChannelRequest request) {
        request = beforeClientExecution(request);
        return executeStartChannel(request);
    }

    @SdkInternalApi
    final StartChannelResult executeStartChannel(StartChannelRequest startChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(startChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartChannelRequest> request = null;
        Response<StartChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Start (run) the multiplex. Starting the multiplex does not start the channels. You must explicitly start each
     * channel.
     * 
     * @param startMultiplexRequest
     *        Placeholder documentation for StartMultiplexRequest
     * @return Result of the StartMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to start the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to start doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on start multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to start due to an issue with multiplex resources.
     * @sample AWSMediaLive.StartMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartMultiplexResult startMultiplex(StartMultiplexRequest request) {
        request = beforeClientExecution(request);
        return executeStartMultiplex(request);
    }

    @SdkInternalApi
    final StartMultiplexResult executeStartMultiplex(StartMultiplexRequest startMultiplexRequest) {

        ExecutionContext executionContext = createExecutionContext(startMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMultiplexRequest> request = null;
        Response<StartMultiplexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMultiplexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startMultiplexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMultiplex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMultiplexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartMultiplexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest
     *        Placeholder documentation for StopChannelRequest
     * @return Result of the StopChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to stop the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to stop does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to stop due to an issue with channel resources.
     * @sample AWSMediaLive.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopChannelResult stopChannel(StopChannelRequest request) {
        request = beforeClientExecution(request);
        return executeStopChannel(request);
    }

    @SdkInternalApi
    final StopChannelResult executeStopChannel(StopChannelRequest stopChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(stopChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopChannelRequest> request = null;
        Response<StopChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Stops a running multiplex. If the multiplex isn't running, this action has no effect.
     * 
     * @param stopMultiplexRequest
     *        Placeholder documentation for StopMultiplexRequest
     * @return Result of the StopMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to stop the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to stop doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to stop due to an issue with multiplex resources.
     * @sample AWSMediaLive.StopMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopMultiplexResult stopMultiplex(StopMultiplexRequest request) {
        request = beforeClientExecution(request);
        return executeStopMultiplex(request);
    }

    @SdkInternalApi
    final StopMultiplexResult executeStopMultiplex(StopMultiplexRequest stopMultiplexRequest) {

        ExecutionContext executionContext = createExecutionContext(stopMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopMultiplexRequest> request = null;
        Response<StopMultiplexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopMultiplexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopMultiplexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopMultiplex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopMultiplexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopMultiplexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Start an input device transfer to another AWS account. After you make the request, the other account must accept
     * or reject the transfer.
     * 
     * @param transferInputDeviceRequest
     *        A request to transfer an input device.
     * @return Result of the TransferInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to transfer input devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device could not be transferred.
     * @sample AWSMediaLive.TransferInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TransferInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TransferInputDeviceResult transferInputDevice(TransferInputDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeTransferInputDevice(request);
    }

    @SdkInternalApi
    final TransferInputDeviceResult executeTransferInputDevice(TransferInputDeviceRequest transferInputDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(transferInputDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferInputDeviceRequest> request = null;
        Response<TransferInputDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferInputDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(transferInputDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TransferInputDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TransferInputDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TransferInputDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates a channel.
     * 
     * @param updateChannelRequest
     *        A request to update a channel.
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The channel configuration failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The channel is unable to update due to an issue with channel resources.
     * @sample AWSMediaLive.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateChannelResult updateChannel(UpdateChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannel(request);
    }

    @SdkInternalApi
    final UpdateChannelResult executeUpdateChannel(UpdateChannelRequest updateChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelRequest> request = null;
        Response<UpdateChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Changes the class of the channel.
     * 
     * @param updateChannelClassRequest
     *        Channel class that the channel should be updated to.
     * @return Result of the UpdateChannelClass operation returned by the service.
     * @throws BadRequestException
     *         This request to update the channel class was invalid.
     * @throws UnprocessableEntityException
     *         The channel configuration failed validation when attempting to update the channel class.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the class of this channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're trying to update the class on does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on update channel class calls.
     * @throws ConflictException
     *         The channel class cannot be updated due to an issue with channel resources.
     * @sample AWSMediaLive.UpdateChannelClass
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannelClass" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateChannelClassResult updateChannelClass(UpdateChannelClassRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannelClass(request);
    }

    @SdkInternalApi
    final UpdateChannelClassResult executeUpdateChannelClass(UpdateChannelClassRequest updateChannelClassRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelClassRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelClassRequest> request = null;
        Response<UpdateChannelClassResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelClassRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChannelClassRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannelClass");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelClassResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChannelClassResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates an input.
     * 
     * @param updateInputRequest
     *        A request to update an input.
     * @return Result of the UpdateInput operation returned by the service.
     * @throws BadRequestException
     *         This request to update the input was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         The requester does not have permission to update an input.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The input was not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The input was unable to be updated at this time due to an issue with input resources.
     * @sample AWSMediaLive.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateInputResult updateInput(UpdateInputRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInput(request);
    }

    @SdkInternalApi
    final UpdateInputResult executeUpdateInput(UpdateInputRequest updateInputRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInputRequest> request = null;
        Response<UpdateInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates the parameters for the input device.
     * 
     * @param updateInputDeviceRequest
     *        A request to update an input device.
     * @return Result of the UpdateInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Input device failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         The input device you're requesting to does not exist. Check the ID.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on update calls to the input device service.
     * @sample AWSMediaLive.UpdateInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateInputDeviceResult updateInputDevice(UpdateInputDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInputDevice(request);
    }

    @SdkInternalApi
    final UpdateInputDeviceResult executeUpdateInputDevice(UpdateInputDeviceRequest updateInputDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInputDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInputDeviceRequest> request = null;
        Response<UpdateInputDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInputDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInputDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInputDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInputDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateInputDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update an Input Security Group's Whilelists.
     * 
     * @param updateInputSecurityGroupRequest
     *        The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input
     *        Security Group should allow.
     * @return Result of the UpdateInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to update the Input Security Group was invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to update an Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The Input Security Group was not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The Input Security Group was unable to be updated due to an issue with input security group resources.
     * @sample AWSMediaLive.UpdateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInputSecurityGroupResult updateInputSecurityGroup(UpdateInputSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInputSecurityGroup(request);
    }

    @SdkInternalApi
    final UpdateInputSecurityGroupResult executeUpdateInputSecurityGroup(UpdateInputSecurityGroupRequest updateInputSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInputSecurityGroupRequest> request = null;
        Response<UpdateInputSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInputSecurityGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateInputSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInputSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInputSecurityGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateInputSecurityGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates a multiplex.
     * 
     * @param updateMultiplexRequest
     *        A request to update a multiplex.
     * @return Result of the UpdateMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The multiplex configuration failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to update the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to update doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The multiplex is unable to update due to an issue with multiplex resources.
     * @sample AWSMediaLive.UpdateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateMultiplexResult updateMultiplex(UpdateMultiplexRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMultiplex(request);
    }

    @SdkInternalApi
    final UpdateMultiplexResult executeUpdateMultiplex(UpdateMultiplexRequest updateMultiplexRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMultiplexRequest> request = null;
        Response<UpdateMultiplexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMultiplexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMultiplexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMultiplex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMultiplexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMultiplexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update a program in a multiplex.
     * 
     * @param updateMultiplexProgramRequest
     *        A request to update a program in a multiplex.
     * @return Result of the UpdateMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The multiplex program failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to update the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't update the program. The multiplex or the program that you specified doesn’t exist. Check
     *         the IDs and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The multiplex program is unable to update due to an issue with multiplex resources.
     * @sample AWSMediaLive.UpdateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMultiplexProgramResult updateMultiplexProgram(UpdateMultiplexProgramRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMultiplexProgram(request);
    }

    @SdkInternalApi
    final UpdateMultiplexProgramResult executeUpdateMultiplexProgram(UpdateMultiplexProgramRequest updateMultiplexProgramRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMultiplexProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMultiplexProgramRequest> request = null;
        Response<UpdateMultiplexProgramResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMultiplexProgramRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMultiplexProgramRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMultiplexProgram");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMultiplexProgramResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMultiplexProgramResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update reservation.
     * 
     * @param updateReservationRequest
     *        Request to update a reservation
     * @return Result of the UpdateReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to update reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded
     * @throws ConflictException
     *         The reservation could not be updated
     * @sample AWSMediaLive.UpdateReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateReservation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateReservationResult updateReservation(UpdateReservationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReservation(request);
    }

    @SdkInternalApi
    final UpdateReservationResult executeUpdateReservation(UpdateReservationRequest updateReservationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReservationRequest> request = null;
        Response<UpdateReservationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReservationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateReservationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReservation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReservationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateReservationResultJsonUnmarshaller());
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
    public AWSMediaLiveWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSMediaLiveWaiters(this);
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
