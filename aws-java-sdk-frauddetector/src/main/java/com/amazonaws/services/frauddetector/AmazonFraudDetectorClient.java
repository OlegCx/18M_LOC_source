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
package com.amazonaws.services.frauddetector;

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

import com.amazonaws.services.frauddetector.AmazonFraudDetectorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.services.frauddetector.model.transform.*;

/**
 * Client for accessing Amazon Fraud Detector. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * This is the Amazon Fraud Detector API Reference. This guide is for developers who need detailed information about
 * Amazon Fraud Detector API actions, data types, and errors. For more information about Amazon Fraud Detector features,
 * see the <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/">Amazon Fraud Detector User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonFraudDetectorClient extends AmazonWebServiceClient implements AmazonFraudDetector {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonFraudDetector.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "frauddetector";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.frauddetector.model.AmazonFraudDetectorException.class));

    public static AmazonFraudDetectorClientBuilder builder() {
        return AmazonFraudDetectorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Fraud Detector using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonFraudDetectorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Fraud Detector using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonFraudDetectorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("frauddetector.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/frauddetector/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/frauddetector/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a batch of variables.
     * </p>
     * 
     * @param batchCreateVariableRequest
     * @return Result of the BatchCreateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.BatchCreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchCreateVariable"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchCreateVariableResult batchCreateVariable(BatchCreateVariableRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCreateVariable(request);
    }

    @SdkInternalApi
    final BatchCreateVariableResult executeBatchCreateVariable(BatchCreateVariableRequest batchCreateVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCreateVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateVariableRequest> request = null;
        Response<BatchCreateVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchCreateVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchCreateVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCreateVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchCreateVariableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a batch of variables.
     * </p>
     * 
     * @param batchGetVariableRequest
     * @return Result of the BatchGetVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.BatchGetVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchGetVariable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchGetVariableResult batchGetVariable(BatchGetVariableRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetVariable(request);
    }

    @SdkInternalApi
    final BatchGetVariableResult executeBatchGetVariable(BatchGetVariableRequest batchGetVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetVariableRequest> request = null;
        Response<BatchGetVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetVariableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the specified batch prediction job.
     * </p>
     * 
     * @param cancelBatchPredictionJobRequest
     * @return Result of the CancelBatchPredictionJob operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CancelBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CancelBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelBatchPredictionJobResult cancelBatchPredictionJob(CancelBatchPredictionJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelBatchPredictionJob(request);
    }

    @SdkInternalApi
    final CancelBatchPredictionJobResult executeCancelBatchPredictionJob(CancelBatchPredictionJobRequest cancelBatchPredictionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelBatchPredictionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelBatchPredictionJobRequest> request = null;
        Response<CancelBatchPredictionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelBatchPredictionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelBatchPredictionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelBatchPredictionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelBatchPredictionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelBatchPredictionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a batch prediction job.
     * </p>
     * 
     * @param createBatchPredictionJobRequest
     * @return Result of the CreateBatchPredictionJob operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBatchPredictionJobResult createBatchPredictionJob(CreateBatchPredictionJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBatchPredictionJob(request);
    }

    @SdkInternalApi
    final CreateBatchPredictionJobResult executeCreateBatchPredictionJob(CreateBatchPredictionJobRequest createBatchPredictionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createBatchPredictionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBatchPredictionJobRequest> request = null;
        Response<CreateBatchPredictionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBatchPredictionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createBatchPredictionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBatchPredictionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBatchPredictionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateBatchPredictionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a detector version. The detector version starts in a <code>DRAFT</code> status.
     * </p>
     * 
     * @param createDetectorVersionRequest
     * @return Result of the CreateDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDetectorVersionResult createDetectorVersion(CreateDetectorVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDetectorVersion(request);
    }

    @SdkInternalApi
    final CreateDetectorVersionResult executeCreateDetectorVersion(CreateDetectorVersionRequest createDetectorVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDetectorVersionRequest> request = null;
        Response<CreateDetectorVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDetectorVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDetectorVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDetectorVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDetectorVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDetectorVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a model using the specified model type.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateModelResult createModel(CreateModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModel(request);
    }

    @SdkInternalApi
    final CreateModelResult executeCreateModel(CreateModelRequest createModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelRequest> request = null;
        Response<CreateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a version of the model using the specified model type and model id.
     * </p>
     * 
     * @param createModelVersionRequest
     * @return Result of the CreateModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @sample AmazonFraudDetector.CreateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateModelVersionResult createModelVersion(CreateModelVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModelVersion(request);
    }

    @SdkInternalApi
    final CreateModelVersionResult executeCreateModelVersion(CreateModelVersionRequest createModelVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelVersionRequest> request = null;
        Response<CreateModelVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModelVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a rule for use with the specified detector.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRuleResult createRule(CreateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRule(request);
    }

    @SdkInternalApi
    final CreateRuleResult executeCreateRule(CreateRuleRequest createRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a variable.
     * </p>
     * 
     * @param createVariableRequest
     * @return Result of the CreateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateVariableResult createVariable(CreateVariableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVariable(request);
    }

    @SdkInternalApi
    final CreateVariableResult executeCreateVariable(CreateVariableRequest createVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(createVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVariableRequest> request = null;
        Response<CreateVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVariableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a batch prediction job.
     * </p>
     * 
     * @param deleteBatchPredictionJobRequest
     * @return Result of the DeleteBatchPredictionJob operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBatchPredictionJobResult deleteBatchPredictionJob(DeleteBatchPredictionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBatchPredictionJob(request);
    }

    @SdkInternalApi
    final DeleteBatchPredictionJobResult executeDeleteBatchPredictionJob(DeleteBatchPredictionJobRequest deleteBatchPredictionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBatchPredictionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBatchPredictionJobRequest> request = null;
        Response<DeleteBatchPredictionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBatchPredictionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteBatchPredictionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBatchPredictionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBatchPredictionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteBatchPredictionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the detector. Before deleting a detector, you must first delete all detector versions and rule versions
     * associated with the detector.
     * </p>
     * <p>
     * When you delete a detector, Amazon Fraud Detector permanently deletes the detector and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return Result of the DeleteDetector operation returned by the service.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDetectorResult deleteDetector(DeleteDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDetector(request);
    }

    @SdkInternalApi
    final DeleteDetectorResult executeDeleteDetector(DeleteDetectorRequest deleteDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDetectorRequest> request = null;
        Response<DeleteDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the detector version. You cannot delete detector versions that are in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * When you delete a detector version, Amazon Fraud Detector permanently deletes the detector and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteDetectorVersionRequest
     * @return Result of the DeleteDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDetectorVersionResult deleteDetectorVersion(DeleteDetectorVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDetectorVersion(request);
    }

    @SdkInternalApi
    final DeleteDetectorVersionResult executeDeleteDetectorVersion(DeleteDetectorVersionRequest deleteDetectorVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDetectorVersionRequest> request = null;
        Response<DeleteDetectorVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDetectorVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDetectorVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDetectorVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDetectorVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDetectorVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an entity type.
     * </p>
     * <p>
     * You cannot delete an entity type that is included in an event type.
     * </p>
     * <p>
     * When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteEntityTypeRequest
     * @return Result of the DeleteEntityType operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteEntityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEntityType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEntityTypeResult deleteEntityType(DeleteEntityTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEntityType(request);
    }

    @SdkInternalApi
    final DeleteEntityTypeResult executeDeleteEntityType(DeleteEntityTypeRequest deleteEntityTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEntityTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEntityTypeRequest> request = null;
        Response<DeleteEntityTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEntityTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEntityTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEntityType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEntityTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEntityTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified event.
     * </p>
     * <p>
     * When you delete an event, Amazon Fraud Detector permanently deletes that event and the event data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteEventRequest
     * @return Result of the DeleteEvent operation returned by the service.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @sample AmazonFraudDetector.DeleteEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEvent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEventResult deleteEvent(DeleteEventRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEvent(request);
    }

    @SdkInternalApi
    final DeleteEventResult executeDeleteEvent(DeleteEventRequest deleteEventRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventRequest> request = null;
        Response<DeleteEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an event type.
     * </p>
     * <p>
     * You cannot delete an event type that is used in a detector or a model.
     * </p>
     * <p>
     * When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteEventTypeRequest
     * @return Result of the DeleteEventType operation returned by the service.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteEventType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEventType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEventTypeResult deleteEventType(DeleteEventTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventType(request);
    }

    @SdkInternalApi
    final DeleteEventTypeResult executeDeleteEventType(DeleteEventTypeRequest deleteEventTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventTypeRequest> request = null;
        Response<DeleteEventTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEventTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a SageMaker model from Amazon Fraud Detector.
     * </p>
     * <p>
     * You can remove an Amazon SageMaker model if it is not associated with a detector version. Removing a SageMaker
     * model disconnects it from Amazon Fraud Detector, but the model remains available in SageMaker.
     * </p>
     * 
     * @param deleteExternalModelRequest
     * @return Result of the DeleteExternalModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteExternalModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteExternalModelResult deleteExternalModel(DeleteExternalModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteExternalModel(request);
    }

    @SdkInternalApi
    final DeleteExternalModelResult executeDeleteExternalModel(DeleteExternalModelRequest deleteExternalModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteExternalModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExternalModelRequest> request = null;
        Response<DeleteExternalModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExternalModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteExternalModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteExternalModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteExternalModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteExternalModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a label.
     * </p>
     * <p>
     * You cannot delete labels that are included in an event type in Amazon Fraud Detector.
     * </p>
     * <p>
     * You cannot delete a label assigned to an event ID. You must first delete the relevant event ID.
     * </p>
     * <p>
     * When you delete a label, Amazon Fraud Detector permanently deletes that label and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteLabelRequest
     * @return Result of the DeleteLabel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @sample AmazonFraudDetector.DeleteLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteLabel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLabelResult deleteLabel(DeleteLabelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLabel(request);
    }

    @SdkInternalApi
    final DeleteLabelResult executeDeleteLabel(DeleteLabelRequest deleteLabelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLabelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLabelRequest> request = null;
        Response<DeleteLabelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLabelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLabelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLabel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLabelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLabelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a model.
     * </p>
     * <p>
     * You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a
     * detector version.
     * </p>
     * <p>
     * When you delete a model, Amazon Fraud Detector permanently deletes that model and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteModelResult deleteModel(DeleteModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModel(request);
    }

    @SdkInternalApi
    final DeleteModelResult executeDeleteModel(DeleteModelRequest deleteModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelRequest> request = null;
        Response<DeleteModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a model version.
     * </p>
     * <p>
     * You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a
     * detector version.
     * </p>
     * <p>
     * When you delete a model version, Amazon Fraud Detector permanently deletes that model version and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteModelVersionRequest
     * @return Result of the DeleteModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @sample AmazonFraudDetector.DeleteModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteModelVersionResult deleteModelVersion(DeleteModelVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModelVersion(request);
    }

    @SdkInternalApi
    final DeleteModelVersionResult executeDeleteModelVersion(DeleteModelVersionRequest deleteModelVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelVersionRequest> request = null;
        Response<DeleteModelVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteModelVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModelVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteModelVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an outcome.
     * </p>
     * <p>
     * You cannot delete an outcome that is used in a rule version.
     * </p>
     * <p>
     * When you delete an outcome, Amazon Fraud Detector permanently deletes that outcome and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteOutcomeRequest
     * @return Result of the DeleteOutcome operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteOutcome" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteOutcomeResult deleteOutcome(DeleteOutcomeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOutcome(request);
    }

    @SdkInternalApi
    final DeleteOutcomeResult executeDeleteOutcome(DeleteOutcomeRequest deleteOutcomeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOutcomeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOutcomeRequest> request = null;
        Response<DeleteOutcomeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOutcomeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOutcomeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOutcome");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOutcomeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOutcomeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the rule. You cannot delete a rule if it is used by an <code>ACTIVE</code> or <code>INACTIVE</code>
     * detector version.
     * </p>
     * <p>
     * When you delete a rule, Amazon Fraud Detector permanently deletes that rule and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRuleResult deleteRule(DeleteRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRule(request);
    }

    @SdkInternalApi
    final DeleteRuleResult executeDeleteRule(DeleteRuleRequest deleteRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleRequest> request = null;
        Response<DeleteRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a variable.
     * </p>
     * <p>
     * You can't delete variables that are included in an event type in Amazon Fraud Detector.
     * </p>
     * <p>
     * Amazon Fraud Detector automatically deletes model output variables and SageMaker model output variables when you
     * delete the model. You can't delete these variables manually.
     * </p>
     * <p>
     * When you delete a variable, Amazon Fraud Detector permanently deletes that variable and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteVariableRequest
     * @return Result of the DeleteVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteVariable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVariableResult deleteVariable(DeleteVariableRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVariable(request);
    }

    @SdkInternalApi
    final DeleteVariableResult executeDeleteVariable(DeleteVariableRequest deleteVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVariableRequest> request = null;
        Response<DeleteVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVariableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all versions for a specified detector.
     * </p>
     * 
     * @param describeDetectorRequest
     * @return Result of the DescribeDetector operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeDetector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDetector(request);
    }

    @SdkInternalApi
    final DescribeDetectorResult executeDescribeDetector(DescribeDetectorRequest describeDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDetectorRequest> request = null;
        Response<DescribeDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all of the model versions for the specified model type or for the specified model type and model ID. You can
     * also get details for a single, specified model version.
     * </p>
     * 
     * @param describeModelVersionsRequest
     * @return Result of the DescribeModelVersions operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DescribeModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeModelVersionsResult describeModelVersions(DescribeModelVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeModelVersions(request);
    }

    @SdkInternalApi
    final DescribeModelVersionsResult executeDescribeModelVersions(DescribeModelVersionsRequest describeModelVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeModelVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelVersionsRequest> request = null;
        Response<DescribeModelVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeModelVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeModelVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeModelVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeModelVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all batch prediction jobs or a specific job if you specify a job ID. This is a paginated API. If you provide
     * a null maxResults, this action retrieves a maximum of 50 records per page. If you provide a maxResults, the value
     * must be between 1 and 50. To get the next page results, provide the pagination token from the
     * GetBatchPredictionJobsResponse as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getBatchPredictionJobsRequest
     * @return Result of the GetBatchPredictionJobs operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetBatchPredictionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetBatchPredictionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBatchPredictionJobsResult getBatchPredictionJobs(GetBatchPredictionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBatchPredictionJobs(request);
    }

    @SdkInternalApi
    final GetBatchPredictionJobsResult executeGetBatchPredictionJobs(GetBatchPredictionJobsRequest getBatchPredictionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBatchPredictionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBatchPredictionJobsRequest> request = null;
        Response<GetBatchPredictionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBatchPredictionJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBatchPredictionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBatchPredictionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBatchPredictionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetBatchPredictionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a particular detector version.
     * </p>
     * 
     * @param getDetectorVersionRequest
     * @return Result of the GetDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDetectorVersionResult getDetectorVersion(GetDetectorVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDetectorVersion(request);
    }

    @SdkInternalApi
    final GetDetectorVersionResult executeGetDetectorVersion(GetDetectorVersionRequest getDetectorVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDetectorVersionRequest> request = null;
        Response<GetDetectorVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDetectorVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDetectorVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDetectorVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDetectorVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDetectorVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all detectors or a single detector if a <code>detectorId</code> is specified. This is a paginated API. If
     * you provide a null <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you
     * provide a <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the
     * pagination token from the <code>GetDetectorsResponse</code> as part of your request. A null pagination token
     * fetches the records from the beginning.
     * </p>
     * 
     * @param getDetectorsRequest
     * @return Result of the GetDetectors operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDetectorsResult getDetectors(GetDetectorsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDetectors(request);
    }

    @SdkInternalApi
    final GetDetectorsResult executeGetDetectors(GetDetectorsRequest getDetectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDetectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDetectorsRequest> request = null;
        Response<GetDetectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDetectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDetectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDetectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDetectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDetectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all entity types or a specific entity type if a name is specified. This is a paginated API. If you provide a
     * null <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the pagination
     * token from the <code>GetEntityTypesResponse</code> as part of your request. A null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getEntityTypesRequest
     * @return Result of the GetEntityTypes operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetEntityTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEntityTypes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEntityTypesResult getEntityTypes(GetEntityTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetEntityTypes(request);
    }

    @SdkInternalApi
    final GetEntityTypesResult executeGetEntityTypes(GetEntityTypesRequest getEntityTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getEntityTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEntityTypesRequest> request = null;
        Response<GetEntityTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEntityTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEntityTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEntityTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEntityTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEntityTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (
     * <code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getEventPredictionRequest
     * @return Result of the GetEventPrediction operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @sample AmazonFraudDetector.GetEventPrediction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventPrediction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEventPredictionResult getEventPrediction(GetEventPredictionRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventPrediction(request);
    }

    @SdkInternalApi
    final GetEventPredictionResult executeGetEventPrediction(GetEventPredictionRequest getEventPredictionRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventPredictionRequest> request = null;
        Response<GetEventPredictionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventPredictionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEventPrediction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventPredictionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEventPredictionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all event types or a specific event type if name is provided. This is a paginated API. If you provide a null
     * <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the pagination
     * token from the <code>GetEventTypesResponse</code> as part of your request. A null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getEventTypesRequest
     * @return Result of the GetEventTypes operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventTypes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEventTypesResult getEventTypes(GetEventTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventTypes(request);
    }

    @SdkInternalApi
    final GetEventTypesResult executeGetEventTypes(GetEventTypesRequest getEventTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventTypesRequest> request = null;
        Response<GetEventTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEventTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEventTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a
     * paginated API. If you provide a null <code>maxResults</code>, this actions retrieves a maximum of 10 records per
     * page. If you provide a <code>maxResults</code>, the value must be between 5 and 10. To get the next page results,
     * provide the pagination token from the <code>GetExternalModelsResult</code> as part of your request. A null
     * pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getExternalModelsRequest
     * @return Result of the GetExternalModels operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetExternalModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetExternalModels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetExternalModelsResult getExternalModels(GetExternalModelsRequest request) {
        request = beforeClientExecution(request);
        return executeGetExternalModels(request);
    }

    @SdkInternalApi
    final GetExternalModelsResult executeGetExternalModels(GetExternalModelsRequest getExternalModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(getExternalModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExternalModelsRequest> request = null;
        Response<GetExternalModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExternalModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExternalModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExternalModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExternalModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExternalModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the encryption key if a Key Management Service (KMS) customer master key (CMK) has been specified to be used
     * to encrypt content in Amazon Fraud Detector.
     * </p>
     * 
     * @param getKMSEncryptionKeyRequest
     * @return Result of the GetKMSEncryptionKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetKMSEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetKMSEncryptionKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetKMSEncryptionKeyResult getKMSEncryptionKey(GetKMSEncryptionKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetKMSEncryptionKey(request);
    }

    @SdkInternalApi
    final GetKMSEncryptionKeyResult executeGetKMSEncryptionKey(GetKMSEncryptionKeyRequest getKMSEncryptionKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(getKMSEncryptionKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKMSEncryptionKeyRequest> request = null;
        Response<GetKMSEncryptionKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKMSEncryptionKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKMSEncryptionKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKMSEncryptionKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKMSEncryptionKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKMSEncryptionKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all labels or a specific label if name is provided. This is a paginated API. If you provide a null
     * <code>maxResults</code>, this action retrieves a maximum of 50 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 10 and 50. To get the next page results, provide the
     * pagination token from the <code>GetGetLabelsResponse</code> as part of your request. A null pagination token
     * fetches the records from the beginning.
     * </p>
     * 
     * @param getLabelsRequest
     * @return Result of the GetLabels operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetLabels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLabelsResult getLabels(GetLabelsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLabels(request);
    }

    @SdkInternalApi
    final GetLabelsResult executeGetLabels(GetLabelsRequest getLabelsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLabelsRequest> request = null;
        Response<GetLabelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLabelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLabelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLabels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLabelsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLabelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of the specified model version.
     * </p>
     * 
     * @param getModelVersionRequest
     * @return Result of the GetModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModelVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetModelVersionResult getModelVersion(GetModelVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetModelVersion(request);
    }

    @SdkInternalApi
    final GetModelVersionResult executeGetModelVersion(GetModelVersionRequest getModelVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelVersionRequest> request = null;
        Response<GetModelVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getModelVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModelVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetModelVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets one or more models. Gets all models for the AWS account if no model type and no model id provided. Gets all
     * models for the AWS account and model type, if the model type is specified but model id is not provided. Gets a
     * specific model if (model type, model id) tuple is specified.
     * </p>
     * <p>
     * This is a paginated API. If you provide a null <code>maxResults</code>, this action retrieves a maximum of 10
     * records per page. If you provide a <code>maxResults</code>, the value must be between 1 and 10. To get the next
     * page results, provide the pagination token from the response as part of your request. A null pagination token
     * fetches the records from the beginning.
     * </p>
     * 
     * @param getModelsRequest
     * @return Result of the GetModels operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetModelsResult getModels(GetModelsRequest request) {
        request = beforeClientExecution(request);
        return executeGetModels(request);
    }

    @SdkInternalApi
    final GetModelsResult executeGetModels(GetModelsRequest getModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelsRequest> request = null;
        Response<GetModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets one or more outcomes. This is a paginated API. If you provide a null <code>maxResults</code>, this actions
     * retrieves a maximum of 100 records per page. If you provide a <code>maxResults</code>, the value must be between
     * 50 and 100. To get the next page results, provide the pagination token from the <code>GetOutcomesResult</code> as
     * part of your request. A null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getOutcomesRequest
     * @return Result of the GetOutcomes operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetOutcomes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetOutcomes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOutcomesResult getOutcomes(GetOutcomesRequest request) {
        request = beforeClientExecution(request);
        return executeGetOutcomes(request);
    }

    @SdkInternalApi
    final GetOutcomesResult executeGetOutcomes(GetOutcomesRequest getOutcomesRequest) {

        ExecutionContext executionContext = createExecutionContext(getOutcomesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOutcomesRequest> request = null;
        Response<GetOutcomesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOutcomesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOutcomesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOutcomes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOutcomesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOutcomesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get all rules for a detector (paginated) if <code>ruleId</code> and <code>ruleVersion</code> are not specified.
     * Gets all rules for the detector and the <code>ruleId</code> if present (paginated). Gets a specific rule if both
     * the <code>ruleId</code> and the <code>ruleVersion</code> are specified.
     * </p>
     * <p>
     * This is a paginated API. Providing null maxResults results in retrieving maximum of 100 records per page. If you
     * provide maxResults the value must be between 50 and 100. To get the next page result, a provide a pagination
     * token from GetRulesResult as part of your request. Null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getRulesRequest
     * @return Result of the GetRules operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRulesResult getRules(GetRulesRequest request) {
        request = beforeClientExecution(request);
        return executeGetRules(request);
    }

    @SdkInternalApi
    final GetRulesResult executeGetRules(GetRulesRequest getRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(getRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRulesRequest> request = null;
        Response<GetRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRulesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all of the variables or the specific variable. This is a paginated API. Providing null
     * <code>maxSizePerPage</code> results in retrieving maximum of 100 records per page. If you provide
     * <code>maxSizePerPage</code> the value must be between 50 and 100. To get the next page result, a provide a
     * pagination token from <code>GetVariablesResult</code> as part of your request. Null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getVariablesRequest
     * @return Result of the GetVariables operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetVariables" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVariablesResult getVariables(GetVariablesRequest request) {
        request = beforeClientExecution(request);
        return executeGetVariables(request);
    }

    @SdkInternalApi
    final GetVariablesResult executeGetVariables(GetVariablesRequest getVariablesRequest) {

        ExecutionContext executionContext = createExecutionContext(getVariablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVariablesRequest> request = null;
        Response<GetVariablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVariablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVariablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVariables");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVariablesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVariablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with the resource. This is a paginated API. To get the next page results, provide the
     * pagination token from the response as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
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
     * Creates or updates a detector.
     * </p>
     * 
     * @param putDetectorRequest
     * @return Result of the PutDetector operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutDetector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutDetectorResult putDetector(PutDetectorRequest request) {
        request = beforeClientExecution(request);
        return executePutDetector(request);
    }

    @SdkInternalApi
    final PutDetectorResult executePutDetector(PutDetectorRequest putDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(putDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDetectorRequest> request = null;
        Response<PutDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an entity type. An entity represents who is performing the event. As part of a fraud
     * prediction, you pass the entity ID to indicate the specific entity who performed the event. An entity type
     * classifies the entity. Example classifications include customer, merchant, or account.
     * </p>
     * 
     * @param putEntityTypeRequest
     * @return Result of the PutEntityType operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutEntityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEntityType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutEntityTypeResult putEntityType(PutEntityTypeRequest request) {
        request = beforeClientExecution(request);
        return executePutEntityType(request);
    }

    @SdkInternalApi
    final PutEntityTypeResult executePutEntityType(PutEntityTypeRequest putEntityTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(putEntityTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEntityTypeRequest> request = null;
        Response<PutEntityTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEntityTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEntityTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEntityType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEntityTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEntityTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an event type. An event is a business activity that is evaluated for fraud risk. With Amazon
     * Fraud Detector, you generate fraud predictions for events. An event type defines the structure for an event sent
     * to Amazon Fraud Detector. This includes the variables sent as part of the event, the entity performing the event
     * (such as a customer), and the labels that classify the event. Example event types include online payment
     * transactions, account registrations, and authentications.
     * </p>
     * 
     * @param putEventTypeRequest
     * @return Result of the PutEventType operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutEventType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEventType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutEventTypeResult putEventType(PutEventTypeRequest request) {
        request = beforeClientExecution(request);
        return executePutEventType(request);
    }

    @SdkInternalApi
    final PutEventTypeResult executePutEventType(PutEventTypeRequest putEventTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(putEventTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventTypeRequest> request = null;
        Response<PutEventTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEventTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEventType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEventTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEventTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an Amazon SageMaker model endpoint. You can also use this action to update the configuration
     * of the model endpoint, including the IAM role and/or the mapped variables.
     * </p>
     * 
     * @param putExternalModelRequest
     * @return Result of the PutExternalModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutExternalModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutExternalModelResult putExternalModel(PutExternalModelRequest request) {
        request = beforeClientExecution(request);
        return executePutExternalModel(request);
    }

    @SdkInternalApi
    final PutExternalModelResult executePutExternalModel(PutExternalModelRequest putExternalModelRequest) {

        ExecutionContext executionContext = createExecutionContext(putExternalModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutExternalModelRequest> request = null;
        Response<PutExternalModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutExternalModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putExternalModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutExternalModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutExternalModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutExternalModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies the Key Management Service (KMS) customer master key (CMK) to be used to encrypt content in Amazon
     * Fraud Detector.
     * </p>
     * 
     * @param putKMSEncryptionKeyRequest
     * @return Result of the PutKMSEncryptionKey operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutKMSEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutKMSEncryptionKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutKMSEncryptionKeyResult putKMSEncryptionKey(PutKMSEncryptionKeyRequest request) {
        request = beforeClientExecution(request);
        return executePutKMSEncryptionKey(request);
    }

    @SdkInternalApi
    final PutKMSEncryptionKeyResult executePutKMSEncryptionKey(PutKMSEncryptionKeyRequest putKMSEncryptionKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(putKMSEncryptionKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutKMSEncryptionKeyRequest> request = null;
        Response<PutKMSEncryptionKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutKMSEncryptionKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putKMSEncryptionKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutKMSEncryptionKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutKMSEncryptionKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutKMSEncryptionKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates label. A label classifies an event as fraudulent or legitimate. Labels are associated with
     * event types and used to train supervised machine learning models in Amazon Fraud Detector.
     * </p>
     * 
     * @param putLabelRequest
     * @return Result of the PutLabel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutLabel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutLabelResult putLabel(PutLabelRequest request) {
        request = beforeClientExecution(request);
        return executePutLabel(request);
    }

    @SdkInternalApi
    final PutLabelResult executePutLabel(PutLabelRequest putLabelRequest) {

        ExecutionContext executionContext = createExecutionContext(putLabelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLabelRequest> request = null;
        Response<PutLabelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLabelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLabelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLabel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLabelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutLabelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an outcome.
     * </p>
     * 
     * @param putOutcomeRequest
     * @return Result of the PutOutcome operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutOutcome" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutOutcomeResult putOutcome(PutOutcomeRequest request) {
        request = beforeClientExecution(request);
        return executePutOutcome(request);
    }

    @SdkInternalApi
    final PutOutcomeResult executePutOutcome(PutOutcomeRequest putOutcomeRequest) {

        ExecutionContext executionContext = createExecutionContext(putOutcomeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutOutcomeRequest> request = null;
        Response<PutOutcomeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutOutcomeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putOutcomeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutOutcome");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutOutcomeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutOutcomeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
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
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
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
     * Updates a detector version. The detector version attributes that you can update include models, external model
     * endpoints, rules, rule execution mode, and description. You can only update a <code>DRAFT</code> detector
     * version.
     * </p>
     * 
     * @param updateDetectorVersionRequest
     * @return Result of the UpdateDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDetectorVersion(request);
    }

    @SdkInternalApi
    final UpdateDetectorVersionResult executeUpdateDetectorVersion(UpdateDetectorVersionRequest updateDetectorVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionRequest> request = null;
        Response<UpdateDetectorVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDetectorVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDetectorVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDetectorVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateDetectorVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the detector version's description. You can update the metadata for any detector version (
     * <code>DRAFT, ACTIVE,</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @param updateDetectorVersionMetadataRequest
     * @return Result of the UpdateDetectorVersionMetadata operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateDetectorVersionMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDetectorVersionMetadataResult updateDetectorVersionMetadata(UpdateDetectorVersionMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDetectorVersionMetadata(request);
    }

    @SdkInternalApi
    final UpdateDetectorVersionMetadataResult executeUpdateDetectorVersionMetadata(UpdateDetectorVersionMetadataRequest updateDetectorVersionMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionMetadataRequest> request = null;
        Response<UpdateDetectorVersionMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDetectorVersionMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDetectorVersionMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDetectorVersionMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDetectorVersionMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the detector version’s status. You can perform the following promotions or demotions using
     * <code>UpdateDetectorVersionStatus</code>: <code>DRAFT</code> to <code>ACTIVE</code>, <code>ACTIVE</code> to
     * <code>INACTIVE</code>, and <code>INACTIVE</code> to <code>ACTIVE</code>.
     * </p>
     * 
     * @param updateDetectorVersionStatusRequest
     * @return Result of the UpdateDetectorVersionStatus operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateDetectorVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDetectorVersionStatusResult updateDetectorVersionStatus(UpdateDetectorVersionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDetectorVersionStatus(request);
    }

    @SdkInternalApi
    final UpdateDetectorVersionStatusResult executeUpdateDetectorVersionStatus(UpdateDetectorVersionStatusRequest updateDetectorVersionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionStatusRequest> request = null;
        Response<UpdateDetectorVersionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDetectorVersionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDetectorVersionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDetectorVersionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDetectorVersionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a model. You can update the description attribute using this action.
     * </p>
     * 
     * @param updateModelRequest
     * @return Result of the UpdateModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateModelResult updateModel(UpdateModelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateModel(request);
    }

    @SdkInternalApi
    final UpdateModelResult executeUpdateModel(UpdateModelRequest updateModelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelRequest> request = null;
        Response<UpdateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a model version. Updating a model version retrains an existing model version using updated training data
     * and produces a new minor version of the model. You can update the training data set location and data access role
     * attributes using this action. This action creates and trains a new minor version of the model, for example
     * version 1.01, 1.02, 1.03.
     * </p>
     * 
     * @param updateModelVersionRequest
     * @return Result of the UpdateModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @sample AmazonFraudDetector.UpdateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateModelVersionResult updateModelVersion(UpdateModelVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateModelVersion(request);
    }

    @SdkInternalApi
    final UpdateModelVersionResult executeUpdateModelVersion(UpdateModelVersionRequest updateModelVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelVersionRequest> request = null;
        Response<UpdateModelVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateModelVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateModelVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateModelVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateModelVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of a model version.
     * </p>
     * <p>
     * You can perform the following status updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code>to <code>INACTIVE</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionStatusRequest
     * @return Result of the UpdateModelVersionStatus operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateModelVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateModelVersionStatusResult updateModelVersionStatus(UpdateModelVersionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateModelVersionStatus(request);
    }

    @SdkInternalApi
    final UpdateModelVersionStatusResult executeUpdateModelVersionStatus(UpdateModelVersionStatusRequest updateModelVersionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateModelVersionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelVersionStatusRequest> request = null;
        Response<UpdateModelVersionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelVersionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateModelVersionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateModelVersionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateModelVersionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateModelVersionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a rule's metadata. The description attribute can be updated.
     * </p>
     * 
     * @param updateRuleMetadataRequest
     * @return Result of the UpdateRuleMetadata operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateRuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRuleMetadataResult updateRuleMetadata(UpdateRuleMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRuleMetadata(request);
    }

    @SdkInternalApi
    final UpdateRuleMetadataResult executeUpdateRuleMetadata(UpdateRuleMetadataRequest updateRuleMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleMetadataRequest> request = null;
        Response<UpdateRuleMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRuleMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a rule version resulting in a new rule version. Updates a rule version resulting in a new rule version
     * (version 1, 2, 3 ...).
     * </p>
     * 
     * @param updateRuleVersionRequest
     * @return Result of the UpdateRuleVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateRuleVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRuleVersion(request);
    }

    @SdkInternalApi
    final UpdateRuleVersionResult executeUpdateRuleVersion(UpdateRuleVersionRequest updateRuleVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleVersionRequest> request = null;
        Response<UpdateRuleVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRuleVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a variable.
     * </p>
     * 
     * @param updateVariableRequest
     * @return Result of the UpdateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVariableResult updateVariable(UpdateVariableRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVariable(request);
    }

    @SdkInternalApi
    final UpdateVariableResult executeUpdateVariable(UpdateVariableRequest updateVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVariableRequest> request = null;
        Response<UpdateVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVariableResultJsonUnmarshaller());
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
