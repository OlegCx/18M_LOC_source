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
package com.amazonaws.services.robomaker;

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

import com.amazonaws.services.robomaker.AWSRoboMakerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.services.robomaker.model.transform.*;

/**
 * Client for accessing RoboMaker. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * This section provides documentation for the AWS RoboMaker API operations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoboMakerClient extends AmazonWebServiceClient implements AWSRoboMaker {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRoboMaker.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "robomaker";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentDeploymentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.ConcurrentDeploymentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.IdempotentParameterMismatchExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.robomaker.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.robomaker.model.AWSRoboMakerException.class));

    public static AWSRoboMakerClientBuilder builder() {
        return AWSRoboMakerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on RoboMaker using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoboMakerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on RoboMaker using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoboMakerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("robomaker.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/robomaker/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/robomaker/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes one or more worlds in a batch operation.
     * </p>
     * 
     * @param batchDeleteWorldsRequest
     * @return Result of the BatchDeleteWorlds operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.BatchDeleteWorlds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDeleteWorlds" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchDeleteWorldsResult batchDeleteWorlds(BatchDeleteWorldsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteWorlds(request);
    }

    @SdkInternalApi
    final BatchDeleteWorldsResult executeBatchDeleteWorlds(BatchDeleteWorldsRequest batchDeleteWorldsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteWorldsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteWorldsRequest> request = null;
        Response<BatchDeleteWorldsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteWorldsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteWorldsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteWorlds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteWorldsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteWorldsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more simulation jobs.
     * </p>
     * 
     * @param batchDescribeSimulationJobRequest
     * @return Result of the BatchDescribeSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.BatchDescribeSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDescribeSimulationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDescribeSimulationJobResult batchDescribeSimulationJob(BatchDescribeSimulationJobRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDescribeSimulationJob(request);
    }

    @SdkInternalApi
    final BatchDescribeSimulationJobResult executeBatchDescribeSimulationJob(BatchDescribeSimulationJobRequest batchDescribeSimulationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDescribeSimulationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDescribeSimulationJobRequest> request = null;
        Response<BatchDescribeSimulationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDescribeSimulationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDescribeSimulationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDescribeSimulationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDescribeSimulationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDescribeSimulationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the specified deployment job.
     * </p>
     * 
     * @param cancelDeploymentJobRequest
     * @return Result of the CancelDeploymentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelDeploymentJobResult cancelDeploymentJob(CancelDeploymentJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelDeploymentJob(request);
    }

    @SdkInternalApi
    final CancelDeploymentJobResult executeCancelDeploymentJob(CancelDeploymentJobRequest cancelDeploymentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelDeploymentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelDeploymentJobRequest> request = null;
        Response<CancelDeploymentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelDeploymentJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelDeploymentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelDeploymentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelDeploymentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelDeploymentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the specified simulation job.
     * </p>
     * 
     * @param cancelSimulationJobRequest
     * @return Result of the CancelSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelSimulationJobResult cancelSimulationJob(CancelSimulationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelSimulationJob(request);
    }

    @SdkInternalApi
    final CancelSimulationJobResult executeCancelSimulationJob(CancelSimulationJobRequest cancelSimulationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelSimulationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSimulationJobRequest> request = null;
        Response<CancelSimulationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSimulationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelSimulationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelSimulationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelSimulationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelSimulationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a simulation job batch. When you cancel a simulation job batch, you are also cancelling all of the active
     * simulation jobs created as part of the batch.
     * </p>
     * 
     * @param cancelSimulationJobBatchRequest
     * @return Result of the CancelSimulationJobBatch operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelSimulationJobBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelSimulationJobBatch"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelSimulationJobBatchResult cancelSimulationJobBatch(CancelSimulationJobBatchRequest request) {
        request = beforeClientExecution(request);
        return executeCancelSimulationJobBatch(request);
    }

    @SdkInternalApi
    final CancelSimulationJobBatchResult executeCancelSimulationJobBatch(CancelSimulationJobBatchRequest cancelSimulationJobBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelSimulationJobBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSimulationJobBatchRequest> request = null;
        Response<CancelSimulationJobBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSimulationJobBatchRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelSimulationJobBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelSimulationJobBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelSimulationJobBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelSimulationJobBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the specified export job.
     * </p>
     * 
     * @param cancelWorldExportJobRequest
     * @return Result of the CancelWorldExportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelWorldExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelWorldExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelWorldExportJobResult cancelWorldExportJob(CancelWorldExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelWorldExportJob(request);
    }

    @SdkInternalApi
    final CancelWorldExportJobResult executeCancelWorldExportJob(CancelWorldExportJobRequest cancelWorldExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelWorldExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelWorldExportJobRequest> request = null;
        Response<CancelWorldExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelWorldExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelWorldExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelWorldExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelWorldExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelWorldExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the specified world generator job.
     * </p>
     * 
     * @param cancelWorldGenerationJobRequest
     * @return Result of the CancelWorldGenerationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.CancelWorldGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelWorldGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelWorldGenerationJobResult cancelWorldGenerationJob(CancelWorldGenerationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelWorldGenerationJob(request);
    }

    @SdkInternalApi
    final CancelWorldGenerationJobResult executeCancelWorldGenerationJob(CancelWorldGenerationJobRequest cancelWorldGenerationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelWorldGenerationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelWorldGenerationJobRequest> request = null;
        Response<CancelWorldGenerationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelWorldGenerationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelWorldGenerationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelWorldGenerationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelWorldGenerationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelWorldGenerationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deploys a specific version of a robot application to robots in a fleet.
     * </p>
     * <p>
     * The robot application must have a numbered <code>applicationVersion</code> for consistency reasons. To create a
     * new version, use <code>CreateRobotApplicationVersion</code> or see <a
     * href="https://docs.aws.amazon.com/robomaker/latest/dg/create-robot-application-version.html">Creating a Robot
     * Application Version</a>.
     * </p>
     * <note>
     * <p>
     * After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.
     * </p>
     * </note>
     * 
     * @param createDeploymentJobRequest
     * @return Result of the CreateDeploymentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ConcurrentDeploymentException
     *         The failure percentage threshold percentage was met.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @sample AWSRoboMaker.CreateDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDeploymentJobResult createDeploymentJob(CreateDeploymentJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeploymentJob(request);
    }

    @SdkInternalApi
    final CreateDeploymentJobResult executeCreateDeploymentJob(CreateDeploymentJobRequest createDeploymentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentJobRequest> request = null;
        Response<CreateDeploymentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeploymentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeploymentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a fleet, a logical group of robots running the same robot application.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AWSRoboMaker.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFleet(request);
    }

    @SdkInternalApi
    final CreateFleetResult executeCreateFleet(CreateFleetRequest createFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(createFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetRequest> request = null;
        Response<CreateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a robot.
     * </p>
     * 
     * @param createRobotRequest
     * @return Result of the CreateRobot operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @sample AWSRoboMaker.CreateRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRobotResult createRobot(CreateRobotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRobot(request);
    }

    @SdkInternalApi
    final CreateRobotResult executeCreateRobot(CreateRobotRequest createRobotRequest) {

        ExecutionContext executionContext = createExecutionContext(createRobotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRobotRequest> request = null;
        Response<CreateRobotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRobotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRobotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRobot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRobotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRobotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a robot application.
     * </p>
     * 
     * @param createRobotApplicationRequest
     * @return Result of the CreateRobotApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @sample AWSRoboMaker.CreateRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRobotApplicationResult createRobotApplication(CreateRobotApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRobotApplication(request);
    }

    @SdkInternalApi
    final CreateRobotApplicationResult executeCreateRobotApplication(CreateRobotApplicationRequest createRobotApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createRobotApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRobotApplicationRequest> request = null;
        Response<CreateRobotApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRobotApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRobotApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRobotApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRobotApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRobotApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a version of a robot application.
     * </p>
     * 
     * @param createRobotApplicationVersionRequest
     * @return Result of the CreateRobotApplicationVersion operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.CreateRobotApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRobotApplicationVersionResult createRobotApplicationVersion(CreateRobotApplicationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRobotApplicationVersion(request);
    }

    @SdkInternalApi
    final CreateRobotApplicationVersionResult executeCreateRobotApplicationVersion(CreateRobotApplicationVersionRequest createRobotApplicationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createRobotApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRobotApplicationVersionRequest> request = null;
        Response<CreateRobotApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRobotApplicationVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRobotApplicationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRobotApplicationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRobotApplicationVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRobotApplicationVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a simulation application.
     * </p>
     * 
     * @param createSimulationApplicationRequest
     * @return Result of the CreateSimulationApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @sample AWSRoboMaker.CreateSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSimulationApplicationResult createSimulationApplication(CreateSimulationApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSimulationApplication(request);
    }

    @SdkInternalApi
    final CreateSimulationApplicationResult executeCreateSimulationApplication(CreateSimulationApplicationRequest createSimulationApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSimulationApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSimulationApplicationRequest> request = null;
        Response<CreateSimulationApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSimulationApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSimulationApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSimulationApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSimulationApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSimulationApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a simulation application with a specific revision id.
     * </p>
     * 
     * @param createSimulationApplicationVersionRequest
     * @return Result of the CreateSimulationApplicationVersion operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.CreateSimulationApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSimulationApplicationVersionResult createSimulationApplicationVersion(CreateSimulationApplicationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSimulationApplicationVersion(request);
    }

    @SdkInternalApi
    final CreateSimulationApplicationVersionResult executeCreateSimulationApplicationVersion(
            CreateSimulationApplicationVersionRequest createSimulationApplicationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createSimulationApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSimulationApplicationVersionRequest> request = null;
        Response<CreateSimulationApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSimulationApplicationVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSimulationApplicationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSimulationApplicationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSimulationApplicationVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSimulationApplicationVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a simulation job.
     * </p>
     * <note>
     * <p>
     * After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.
     * </p>
     * </note>
     * 
     * @param createSimulationJobRequest
     * @return Result of the CreateSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @sample AWSRoboMaker.CreateSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSimulationJobResult createSimulationJob(CreateSimulationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSimulationJob(request);
    }

    @SdkInternalApi
    final CreateSimulationJobResult executeCreateSimulationJob(CreateSimulationJobRequest createSimulationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createSimulationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSimulationJobRequest> request = null;
        Response<CreateSimulationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSimulationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSimulationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSimulationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSimulationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSimulationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a world export job.
     * </p>
     * 
     * @param createWorldExportJobRequest
     * @return Result of the CreateWorldExportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @sample AWSRoboMaker.CreateWorldExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWorldExportJobResult createWorldExportJob(CreateWorldExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorldExportJob(request);
    }

    @SdkInternalApi
    final CreateWorldExportJobResult executeCreateWorldExportJob(CreateWorldExportJobRequest createWorldExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorldExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorldExportJobRequest> request = null;
        Response<CreateWorldExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorldExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorldExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorldExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorldExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorldExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates worlds using the specified template.
     * </p>
     * 
     * @param createWorldGenerationJobRequest
     * @return Result of the CreateWorldGenerationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @sample AWSRoboMaker.CreateWorldGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorldGenerationJobResult createWorldGenerationJob(CreateWorldGenerationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorldGenerationJob(request);
    }

    @SdkInternalApi
    final CreateWorldGenerationJobResult executeCreateWorldGenerationJob(CreateWorldGenerationJobRequest createWorldGenerationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorldGenerationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorldGenerationJobRequest> request = null;
        Response<CreateWorldGenerationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorldGenerationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createWorldGenerationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorldGenerationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorldGenerationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateWorldGenerationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a world template.
     * </p>
     * 
     * @param createWorldTemplateRequest
     * @return Result of the CreateWorldTemplate operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.CreateWorldTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWorldTemplateResult createWorldTemplate(CreateWorldTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorldTemplate(request);
    }

    @SdkInternalApi
    final CreateWorldTemplateResult executeCreateWorldTemplate(CreateWorldTemplateRequest createWorldTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorldTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorldTemplateRequest> request = null;
        Response<CreateWorldTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorldTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorldTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorldTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorldTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorldTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFleetResult deleteFleet(DeleteFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFleet(request);
    }

    @SdkInternalApi
    final DeleteFleetResult executeDeleteFleet(DeleteFleetRequest deleteFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetRequest> request = null;
        Response<DeleteFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a robot.
     * </p>
     * 
     * @param deleteRobotRequest
     * @return Result of the DeleteRobot operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DeleteRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteRobot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRobotResult deleteRobot(DeleteRobotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRobot(request);
    }

    @SdkInternalApi
    final DeleteRobotResult executeDeleteRobot(DeleteRobotRequest deleteRobotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRobotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRobotRequest> request = null;
        Response<DeleteRobotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRobotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRobotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRobot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRobotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRobotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a robot application.
     * </p>
     * 
     * @param deleteRobotApplicationRequest
     * @return Result of the DeleteRobotApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DeleteRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRobotApplicationResult deleteRobotApplication(DeleteRobotApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRobotApplication(request);
    }

    @SdkInternalApi
    final DeleteRobotApplicationResult executeDeleteRobotApplication(DeleteRobotApplicationRequest deleteRobotApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRobotApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRobotApplicationRequest> request = null;
        Response<DeleteRobotApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRobotApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRobotApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRobotApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRobotApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRobotApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a simulation application.
     * </p>
     * 
     * @param deleteSimulationApplicationRequest
     * @return Result of the DeleteSimulationApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DeleteSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSimulationApplicationResult deleteSimulationApplication(DeleteSimulationApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSimulationApplication(request);
    }

    @SdkInternalApi
    final DeleteSimulationApplicationResult executeDeleteSimulationApplication(DeleteSimulationApplicationRequest deleteSimulationApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSimulationApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSimulationApplicationRequest> request = null;
        Response<DeleteSimulationApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSimulationApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSimulationApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSimulationApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSimulationApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSimulationApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a world template.
     * </p>
     * 
     * @param deleteWorldTemplateRequest
     * @return Result of the DeleteWorldTemplate operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DeleteWorldTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteWorldTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteWorldTemplateResult deleteWorldTemplate(DeleteWorldTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorldTemplate(request);
    }

    @SdkInternalApi
    final DeleteWorldTemplateResult executeDeleteWorldTemplate(DeleteWorldTemplateRequest deleteWorldTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorldTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorldTemplateRequest> request = null;
        Response<DeleteWorldTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorldTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorldTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorldTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorldTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorldTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters a robot.
     * </p>
     * 
     * @param deregisterRobotRequest
     * @return Result of the DeregisterRobot operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSRoboMaker.DeregisterRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeregisterRobot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeregisterRobotResult deregisterRobot(DeregisterRobotRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterRobot(request);
    }

    @SdkInternalApi
    final DeregisterRobotResult executeDeregisterRobot(DeregisterRobotRequest deregisterRobotRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterRobotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterRobotRequest> request = null;
        Response<DeregisterRobotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterRobotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterRobotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterRobot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterRobotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterRobotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a deployment job.
     * </p>
     * 
     * @param describeDeploymentJobRequest
     * @return Result of the DescribeDeploymentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeDeploymentJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDeploymentJobResult describeDeploymentJob(DescribeDeploymentJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeploymentJob(request);
    }

    @SdkInternalApi
    final DescribeDeploymentJobResult executeDescribeDeploymentJob(DescribeDeploymentJobRequest describeDeploymentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeploymentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeploymentJobRequest> request = null;
        Response<DescribeDeploymentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeploymentJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDeploymentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeploymentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeploymentJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDeploymentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a fleet.
     * </p>
     * 
     * @param describeFleetRequest
     * @return Result of the DescribeFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFleetResult describeFleet(DescribeFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleet(request);
    }

    @SdkInternalApi
    final DescribeFleetResult executeDescribeFleet(DescribeFleetRequest describeFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetRequest> request = null;
        Response<DescribeFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a robot.
     * </p>
     * 
     * @param describeRobotRequest
     * @return Result of the DescribeRobot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeRobotResult describeRobot(DescribeRobotRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRobot(request);
    }

    @SdkInternalApi
    final DescribeRobotResult executeDescribeRobot(DescribeRobotRequest describeRobotRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRobotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRobotRequest> request = null;
        Response<DescribeRobotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRobotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRobotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRobot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRobotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRobotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a robot application.
     * </p>
     * 
     * @param describeRobotApplicationRequest
     * @return Result of the DescribeRobotApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRobotApplicationResult describeRobotApplication(DescribeRobotApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRobotApplication(request);
    }

    @SdkInternalApi
    final DescribeRobotApplicationResult executeDescribeRobotApplication(DescribeRobotApplicationRequest describeRobotApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRobotApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRobotApplicationRequest> request = null;
        Response<DescribeRobotApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRobotApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRobotApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRobotApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRobotApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRobotApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a simulation application.
     * </p>
     * 
     * @param describeSimulationApplicationRequest
     * @return Result of the DescribeSimulationApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSimulationApplicationResult describeSimulationApplication(DescribeSimulationApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSimulationApplication(request);
    }

    @SdkInternalApi
    final DescribeSimulationApplicationResult executeDescribeSimulationApplication(DescribeSimulationApplicationRequest describeSimulationApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSimulationApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSimulationApplicationRequest> request = null;
        Response<DescribeSimulationApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSimulationApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSimulationApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSimulationApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSimulationApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSimulationApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a simulation job.
     * </p>
     * 
     * @param describeSimulationJobRequest
     * @return Result of the DescribeSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSimulationJobResult describeSimulationJob(DescribeSimulationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSimulationJob(request);
    }

    @SdkInternalApi
    final DescribeSimulationJobResult executeDescribeSimulationJob(DescribeSimulationJobRequest describeSimulationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSimulationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSimulationJobRequest> request = null;
        Response<DescribeSimulationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSimulationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSimulationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSimulationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSimulationJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeSimulationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a simulation job batch.
     * </p>
     * 
     * @param describeSimulationJobBatchRequest
     * @return Result of the DescribeSimulationJobBatch operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeSimulationJobBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationJobBatch"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSimulationJobBatchResult describeSimulationJobBatch(DescribeSimulationJobBatchRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSimulationJobBatch(request);
    }

    @SdkInternalApi
    final DescribeSimulationJobBatchResult executeDescribeSimulationJobBatch(DescribeSimulationJobBatchRequest describeSimulationJobBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSimulationJobBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSimulationJobBatchRequest> request = null;
        Response<DescribeSimulationJobBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSimulationJobBatchRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSimulationJobBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSimulationJobBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSimulationJobBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSimulationJobBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a world.
     * </p>
     * 
     * @param describeWorldRequest
     * @return Result of the DescribeWorld operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeWorld
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorld" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeWorldResult describeWorld(DescribeWorldRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorld(request);
    }

    @SdkInternalApi
    final DescribeWorldResult executeDescribeWorld(DescribeWorldRequest describeWorldRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorldRequest> request = null;
        Response<DescribeWorldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorldRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorld");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorldResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorldResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a world export job.
     * </p>
     * 
     * @param describeWorldExportJobRequest
     * @return Result of the DescribeWorldExportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeWorldExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorldExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorldExportJobResult describeWorldExportJob(DescribeWorldExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorldExportJob(request);
    }

    @SdkInternalApi
    final DescribeWorldExportJobResult executeDescribeWorldExportJob(DescribeWorldExportJobRequest describeWorldExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorldExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorldExportJobRequest> request = null;
        Response<DescribeWorldExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorldExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorldExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorldExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorldExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorldExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a world generation job.
     * </p>
     * 
     * @param describeWorldGenerationJobRequest
     * @return Result of the DescribeWorldGenerationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.DescribeWorldGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorldGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorldGenerationJobResult describeWorldGenerationJob(DescribeWorldGenerationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorldGenerationJob(request);
    }

    @SdkInternalApi
    final DescribeWorldGenerationJobResult executeDescribeWorldGenerationJob(DescribeWorldGenerationJobRequest describeWorldGenerationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorldGenerationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorldGenerationJobRequest> request = null;
        Response<DescribeWorldGenerationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorldGenerationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorldGenerationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorldGenerationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorldGenerationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorldGenerationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a world template.
     * </p>
     * 
     * @param describeWorldTemplateRequest
     * @return Result of the DescribeWorldTemplate operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.DescribeWorldTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorldTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorldTemplateResult describeWorldTemplate(DescribeWorldTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorldTemplate(request);
    }

    @SdkInternalApi
    final DescribeWorldTemplateResult executeDescribeWorldTemplate(DescribeWorldTemplateRequest describeWorldTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorldTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorldTemplateRequest> request = null;
        Response<DescribeWorldTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorldTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorldTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorldTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorldTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeWorldTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the world template body.
     * </p>
     * 
     * @param getWorldTemplateBodyRequest
     * @return Result of the GetWorldTemplateBody operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.GetWorldTemplateBody
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/GetWorldTemplateBody" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetWorldTemplateBodyResult getWorldTemplateBody(GetWorldTemplateBodyRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorldTemplateBody(request);
    }

    @SdkInternalApi
    final GetWorldTemplateBodyResult executeGetWorldTemplateBody(GetWorldTemplateBodyRequest getWorldTemplateBodyRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorldTemplateBodyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorldTemplateBodyRequest> request = null;
        Response<GetWorldTemplateBodyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorldTemplateBodyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorldTemplateBodyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorldTemplateBody");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorldTemplateBodyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorldTemplateBodyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment
     * jobs.
     * </p>
     * 
     * @param listDeploymentJobsRequest
     * @return Result of the ListDeploymentJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListDeploymentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListDeploymentJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDeploymentJobsResult listDeploymentJobs(ListDeploymentJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeploymentJobs(request);
    }

    @SdkInternalApi
    final ListDeploymentJobsResult executeListDeploymentJobs(ListDeploymentJobsRequest listDeploymentJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentJobsRequest> request = null;
        Response<ListDeploymentJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeploymentJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeploymentJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.
     * </p>
     * 
     * @param listFleetsRequest
     * @return Result of the ListFleets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFleetsResult listFleets(ListFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeListFleets(request);
    }

    @SdkInternalApi
    final ListFleetsResult executeListFleets(ListFleetsRequest listFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetsRequest> request = null;
        Response<ListFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFleets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFleetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
     * </p>
     * 
     * @param listRobotApplicationsRequest
     * @return Result of the ListRobotApplications operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListRobotApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobotApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRobotApplicationsResult listRobotApplications(ListRobotApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListRobotApplications(request);
    }

    @SdkInternalApi
    final ListRobotApplicationsResult executeListRobotApplications(ListRobotApplicationsRequest listRobotApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRobotApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRobotApplicationsRequest> request = null;
        Response<ListRobotApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRobotApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRobotApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRobotApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRobotApplicationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListRobotApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
     * </p>
     * 
     * @param listRobotsRequest
     * @return Result of the ListRobots operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListRobots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRobotsResult listRobots(ListRobotsRequest request) {
        request = beforeClientExecution(request);
        return executeListRobots(request);
    }

    @SdkInternalApi
    final ListRobotsResult executeListRobots(ListRobotsRequest listRobotsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRobotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRobotsRequest> request = null;
        Response<ListRobotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRobotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRobotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRobots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRobotsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRobotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation
     * applications.
     * </p>
     * 
     * @param listSimulationApplicationsRequest
     * @return Result of the ListSimulationApplications operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListSimulationApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSimulationApplicationsResult listSimulationApplications(ListSimulationApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSimulationApplications(request);
    }

    @SdkInternalApi
    final ListSimulationApplicationsResult executeListSimulationApplications(ListSimulationApplicationsRequest listSimulationApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSimulationApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSimulationApplicationsRequest> request = null;
        Response<ListSimulationApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSimulationApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSimulationApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSimulationApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSimulationApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSimulationApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list simulation job batches. You can optionally provide filters to retrieve specific simulation batch
     * jobs.
     * </p>
     * 
     * @param listSimulationJobBatchesRequest
     * @return Result of the ListSimulationJobBatches operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListSimulationJobBatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationJobBatches"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSimulationJobBatchesResult listSimulationJobBatches(ListSimulationJobBatchesRequest request) {
        request = beforeClientExecution(request);
        return executeListSimulationJobBatches(request);
    }

    @SdkInternalApi
    final ListSimulationJobBatchesResult executeListSimulationJobBatches(ListSimulationJobBatchesRequest listSimulationJobBatchesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSimulationJobBatchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSimulationJobBatchesRequest> request = null;
        Response<ListSimulationJobBatchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSimulationJobBatchesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSimulationJobBatchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSimulationJobBatches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSimulationJobBatchesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSimulationJobBatchesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.
     * </p>
     * 
     * @param listSimulationJobsRequest
     * @return Result of the ListSimulationJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListSimulationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSimulationJobsResult listSimulationJobs(ListSimulationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListSimulationJobs(request);
    }

    @SdkInternalApi
    final ListSimulationJobsResult executeListSimulationJobs(ListSimulationJobsRequest listSimulationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSimulationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSimulationJobsRequest> request = null;
        Response<ListSimulationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSimulationJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSimulationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSimulationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSimulationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSimulationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags on a AWS RoboMaker resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
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
     * Lists world export jobs.
     * </p>
     * 
     * @param listWorldExportJobsRequest
     * @return Result of the ListWorldExportJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListWorldExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListWorldExportJobsResult listWorldExportJobs(ListWorldExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorldExportJobs(request);
    }

    @SdkInternalApi
    final ListWorldExportJobsResult executeListWorldExportJobs(ListWorldExportJobsRequest listWorldExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorldExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorldExportJobsRequest> request = null;
        Response<ListWorldExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorldExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorldExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorldExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorldExportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorldExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists world generator jobs.
     * </p>
     * 
     * @param listWorldGenerationJobsRequest
     * @return Result of the ListWorldGenerationJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.ListWorldGenerationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldGenerationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorldGenerationJobsResult listWorldGenerationJobs(ListWorldGenerationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorldGenerationJobs(request);
    }

    @SdkInternalApi
    final ListWorldGenerationJobsResult executeListWorldGenerationJobs(ListWorldGenerationJobsRequest listWorldGenerationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorldGenerationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorldGenerationJobsRequest> request = null;
        Response<ListWorldGenerationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorldGenerationJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWorldGenerationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorldGenerationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorldGenerationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWorldGenerationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists world templates.
     * </p>
     * 
     * @param listWorldTemplatesRequest
     * @return Result of the ListWorldTemplates operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListWorldTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListWorldTemplatesResult listWorldTemplates(ListWorldTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListWorldTemplates(request);
    }

    @SdkInternalApi
    final ListWorldTemplatesResult executeListWorldTemplates(ListWorldTemplatesRequest listWorldTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorldTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorldTemplatesRequest> request = null;
        Response<ListWorldTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorldTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorldTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorldTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorldTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorldTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists worlds.
     * </p>
     * 
     * @param listWorldsRequest
     * @return Result of the ListWorlds operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.ListWorlds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorlds" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorldsResult listWorlds(ListWorldsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorlds(request);
    }

    @SdkInternalApi
    final ListWorldsResult executeListWorlds(ListWorldsRequest listWorldsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorldsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorldsRequest> request = null;
        Response<ListWorldsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorldsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorldsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorlds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorldsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorldsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a robot with a fleet.
     * </p>
     * 
     * @param registerRobotRequest
     * @return Result of the RegisterRobot operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSRoboMaker.RegisterRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RegisterRobot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RegisterRobotResult registerRobot(RegisterRobotRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterRobot(request);
    }

    @SdkInternalApi
    final RegisterRobotResult executeRegisterRobot(RegisterRobotRequest registerRobotRequest) {

        ExecutionContext executionContext = createExecutionContext(registerRobotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterRobotRequest> request = null;
        Response<RegisterRobotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterRobotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerRobotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterRobot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterRobotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterRobotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restarts a running simulation job.
     * </p>
     * 
     * @param restartSimulationJobRequest
     * @return Result of the RestartSimulationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.RestartSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RestartSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RestartSimulationJobResult restartSimulationJob(RestartSimulationJobRequest request) {
        request = beforeClientExecution(request);
        return executeRestartSimulationJob(request);
    }

    @SdkInternalApi
    final RestartSimulationJobResult executeRestartSimulationJob(RestartSimulationJobRequest restartSimulationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(restartSimulationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestartSimulationJobRequest> request = null;
        Response<RestartSimulationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestartSimulationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restartSimulationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestartSimulationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestartSimulationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestartSimulationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a new simulation job batch. The batch is defined using one or more <code>SimulationJobRequest</code>
     * objects.
     * </p>
     * 
     * @param startSimulationJobBatchRequest
     * @return Result of the StartSimulationJobBatch operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.StartSimulationJobBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/StartSimulationJobBatch"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSimulationJobBatchResult startSimulationJobBatch(StartSimulationJobBatchRequest request) {
        request = beforeClientExecution(request);
        return executeStartSimulationJobBatch(request);
    }

    @SdkInternalApi
    final StartSimulationJobBatchResult executeStartSimulationJobBatch(StartSimulationJobBatchRequest startSimulationJobBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(startSimulationJobBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSimulationJobBatchRequest> request = null;
        Response<StartSimulationJobBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSimulationJobBatchRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startSimulationJobBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSimulationJobBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSimulationJobBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSimulationJobBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
     * </p>
     * 
     * @param syncDeploymentJobRequest
     * @return Result of the SyncDeploymentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ConcurrentDeploymentException
     *         The failure percentage threshold percentage was met.
     * @throws IdempotentParameterMismatchException
     *         The request uses the same client token as a previous, but non-identical request. Do not reuse a client
     *         token with different requests, unless the requests are identical.
     * @sample AWSRoboMaker.SyncDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/SyncDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SyncDeploymentJobResult syncDeploymentJob(SyncDeploymentJobRequest request) {
        request = beforeClientExecution(request);
        return executeSyncDeploymentJob(request);
    }

    @SdkInternalApi
    final SyncDeploymentJobResult executeSyncDeploymentJob(SyncDeploymentJobRequest syncDeploymentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(syncDeploymentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SyncDeploymentJobRequest> request = null;
        Response<SyncDeploymentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SyncDeploymentJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(syncDeploymentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SyncDeploymentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SyncDeploymentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SyncDeploymentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or edits tags for a AWS RoboMaker resource.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
     * empty strings.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
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
     * Removes the specified tags from the specified AWS RoboMaker resource.
     * </p>
     * <p>
     * To remove a tag, specify the tag key. To change the tag value of an existing tag key, use <a
     * href="https://docs.aws.amazon.com/robomaker/latest/dg/API_TagResource.html"> <code>TagResource</code> </a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @sample AWSRoboMaker.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
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
     * Updates a robot application.
     * </p>
     * 
     * @param updateRobotApplicationRequest
     * @return Result of the UpdateRobotApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.UpdateRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRobotApplicationResult updateRobotApplication(UpdateRobotApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRobotApplication(request);
    }

    @SdkInternalApi
    final UpdateRobotApplicationResult executeUpdateRobotApplication(UpdateRobotApplicationRequest updateRobotApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRobotApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRobotApplicationRequest> request = null;
        Response<UpdateRobotApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRobotApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRobotApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRobotApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRobotApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRobotApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a simulation application.
     * </p>
     * 
     * @param updateSimulationApplicationRequest
     * @return Result of the UpdateSimulationApplication operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.UpdateSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSimulationApplicationResult updateSimulationApplication(UpdateSimulationApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSimulationApplication(request);
    }

    @SdkInternalApi
    final UpdateSimulationApplicationResult executeUpdateSimulationApplication(UpdateSimulationApplicationRequest updateSimulationApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSimulationApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSimulationApplicationRequest> request = null;
        Response<UpdateSimulationApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSimulationApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSimulationApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSimulationApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSimulationApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSimulationApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a world template.
     * </p>
     * 
     * @param updateWorldTemplateRequest
     * @return Result of the UpdateWorldTemplate operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message
     *         provides an explanation of the error value.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         AWS RoboMaker is temporarily unable to process the request. Try your call again.
     * @throws InternalServerException
     *         AWS RoboMaker experienced a service issue. Try your call again.
     * @sample AWSRoboMaker.UpdateWorldTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateWorldTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateWorldTemplateResult updateWorldTemplate(UpdateWorldTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorldTemplate(request);
    }

    @SdkInternalApi
    final UpdateWorldTemplateResult executeUpdateWorldTemplate(UpdateWorldTemplateRequest updateWorldTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorldTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorldTemplateRequest> request = null;
        Response<UpdateWorldTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorldTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorldTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RoboMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorldTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorldTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorldTemplateResultJsonUnmarshaller());
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
