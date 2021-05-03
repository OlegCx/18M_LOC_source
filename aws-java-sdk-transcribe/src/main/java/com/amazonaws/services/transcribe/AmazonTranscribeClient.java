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
package com.amazonaws.services.transcribe;

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

import com.amazonaws.services.transcribe.AmazonTranscribeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.services.transcribe.model.transform.*;

/**
 * Client for accessing Amazon Transcribe Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Operations and objects for transcribing speech to text.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranscribeClient extends AmazonWebServiceClient implements AmazonTranscribe {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonTranscribe.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "transcribe";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.transcribe.model.AmazonTranscribeException.class));

    public static AmazonTranscribeClientBuilder builder() {
        return AmazonTranscribeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Transcribe Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTranscribeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Transcribe Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTranscribeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("transcribe.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/transcribe/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/transcribe/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new custom language model. Use Amazon S3 prefixes to provide the location of your input files. The time
     * it takes to create your model depends on the size of your training data.
     * </p>
     * 
     * @param createLanguageModelRequest
     * @return Result of the CreateLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.CreateLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLanguageModelResult createLanguageModel(CreateLanguageModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLanguageModel(request);
    }

    @SdkInternalApi
    final CreateLanguageModelResult executeCreateLanguageModel(CreateLanguageModelRequest createLanguageModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLanguageModelRequest> request = null;
        Response<CreateLanguageModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLanguageModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLanguageModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLanguageModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLanguageModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLanguageModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom vocabulary that you can use to change how Amazon Transcribe Medical transcribes your audio
     * file.
     * </p>
     * 
     * @param createMedicalVocabularyRequest
     * @return Result of the CreateMedicalVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.CreateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMedicalVocabularyResult createMedicalVocabulary(CreateMedicalVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMedicalVocabulary(request);
    }

    @SdkInternalApi
    final CreateMedicalVocabularyResult executeCreateMedicalVocabulary(CreateMedicalVocabularyRequest createMedicalVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(createMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMedicalVocabularyRequest> request = null;
        Response<CreateMedicalVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMedicalVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMedicalVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMedicalVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMedicalVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMedicalVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an
     * audio file.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return Result of the CreateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateVocabularyResult createVocabulary(CreateVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVocabulary(request);
    }

    @SdkInternalApi
    final CreateVocabularyResult executeCreateVocabulary(CreateVocabularyRequest createVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(createVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVocabularyRequest> request = null;
        Response<CreateVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new vocabulary filter that you can use to filter words, such as profane words, from the output of a
     * transcription job.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @return Result of the CreateVocabularyFilter operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.CreateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVocabularyFilterResult createVocabularyFilter(CreateVocabularyFilterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVocabularyFilter(request);
    }

    @SdkInternalApi
    final CreateVocabularyFilterResult executeCreateVocabularyFilter(CreateVocabularyFilterRequest createVocabularyFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(createVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVocabularyFilterRequest> request = null;
        Response<CreateVocabularyFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVocabularyFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVocabularyFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVocabularyFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVocabularyFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateVocabularyFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom language model using its name.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @return Result of the DeleteLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteLanguageModelResult deleteLanguageModel(DeleteLanguageModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLanguageModel(request);
    }

    @SdkInternalApi
    final DeleteLanguageModelResult executeDeleteLanguageModel(DeleteLanguageModelRequest deleteLanguageModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLanguageModelRequest> request = null;
        Response<DeleteLanguageModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLanguageModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLanguageModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLanguageModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLanguageModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLanguageModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a transcription job generated by Amazon Transcribe Medical and any related information.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @return Result of the DeleteMedicalTranscriptionJob operation returned by the service.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMedicalTranscriptionJobResult deleteMedicalTranscriptionJob(DeleteMedicalTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMedicalTranscriptionJob(request);
    }

    @SdkInternalApi
    final DeleteMedicalTranscriptionJobResult executeDeleteMedicalTranscriptionJob(DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMedicalTranscriptionJobRequest> request = null;
        Response<DeleteMedicalTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMedicalTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMedicalTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMedicalTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMedicalTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMedicalTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a vocabulary from Amazon Transcribe Medical.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @return Result of the DeleteMedicalVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMedicalVocabularyResult deleteMedicalVocabulary(DeleteMedicalVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMedicalVocabulary(request);
    }

    @SdkInternalApi
    final DeleteMedicalVocabularyResult executeDeleteMedicalVocabulary(DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMedicalVocabularyRequest> request = null;
        Response<DeleteMedicalVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMedicalVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMedicalVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMedicalVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMedicalVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMedicalVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously submitted transcription job along with any other generated results such as the
     * transcription, models, and so on.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @return Result of the DeleteTranscriptionJob operation returned by the service.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTranscriptionJobResult deleteTranscriptionJob(DeleteTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTranscriptionJob(request);
    }

    @SdkInternalApi
    final DeleteTranscriptionJobResult executeDeleteTranscriptionJob(DeleteTranscriptionJobRequest deleteTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTranscriptionJobRequest> request = null;
        Response<DeleteTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a vocabulary from Amazon Transcribe.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return Result of the DeleteVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVocabularyResult deleteVocabulary(DeleteVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVocabulary(request);
    }

    @SdkInternalApi
    final DeleteVocabularyResult executeDeleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVocabularyRequest> request = null;
        Response<DeleteVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a vocabulary filter.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @return Result of the DeleteVocabularyFilter operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVocabularyFilterResult deleteVocabularyFilter(DeleteVocabularyFilterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVocabularyFilter(request);
    }

    @SdkInternalApi
    final DeleteVocabularyFilterResult executeDeleteVocabularyFilter(DeleteVocabularyFilterRequest deleteVocabularyFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVocabularyFilterRequest> request = null;
        Response<DeleteVocabularyFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVocabularyFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVocabularyFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVocabularyFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVocabularyFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVocabularyFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a single custom language model. Use this information to see details about the language
     * model in your AWS account. You can also see whether the base language model used to create your custom language
     * model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language
     * model using the updated base model. If the language model wasn't created, you can use this operation to
     * understand why Amazon Transcribe couldn't create it.
     * </p>
     * 
     * @param describeLanguageModelRequest
     * @return Result of the DescribeLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @sample AmazonTranscribe.DescribeLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DescribeLanguageModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLanguageModelResult describeLanguageModel(DescribeLanguageModelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLanguageModel(request);
    }

    @SdkInternalApi
    final DescribeLanguageModelResult executeDescribeLanguageModel(DescribeLanguageModelRequest describeLanguageModelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLanguageModelRequest> request = null;
        Response<DescribeLanguageModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLanguageModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLanguageModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLanguageModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLanguageModelResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeLanguageModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a transcription job from Amazon Transcribe Medical. To see the status of the job, check
     * the <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished. You
     * find the results of the completed job in the <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param getMedicalTranscriptionJobRequest
     * @return Result of the GetMedicalTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @sample AmazonTranscribe.GetMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMedicalTranscriptionJobResult getMedicalTranscriptionJob(GetMedicalTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetMedicalTranscriptionJob(request);
    }

    @SdkInternalApi
    final GetMedicalTranscriptionJobResult executeGetMedicalTranscriptionJob(GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMedicalTranscriptionJobRequest> request = null;
        Response<GetMedicalTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMedicalTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMedicalTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMedicalTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMedicalTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMedicalTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a medical vocabulary.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @return Result of the GetMedicalVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @sample AmazonTranscribe.GetMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMedicalVocabularyResult getMedicalVocabulary(GetMedicalVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeGetMedicalVocabulary(request);
    }

    @SdkInternalApi
    final GetMedicalVocabularyResult executeGetMedicalVocabulary(GetMedicalVocabularyRequest getMedicalVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(getMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMedicalVocabularyRequest> request = null;
        Response<GetMedicalVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMedicalVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMedicalVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMedicalVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMedicalVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMedicalVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a transcription job. To see the status of the job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished and you
     * can find the results at the location specified in the <code>TranscriptFileUri</code> field. If you enable content
     * redaction, the redacted transcript appears in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return Result of the GetTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @sample AmazonTranscribe.GetTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetTranscriptionJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTranscriptionJobResult getTranscriptionJob(GetTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetTranscriptionJob(request);
    }

    @SdkInternalApi
    final GetTranscriptionJobResult executeGetTranscriptionJob(GetTranscriptionJobRequest getTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTranscriptionJobRequest> request = null;
        Response<GetTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a vocabulary.
     * </p>
     * 
     * @param getVocabularyRequest
     * @return Result of the GetVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @sample AmazonTranscribe.GetVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVocabularyResult getVocabulary(GetVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeGetVocabulary(request);
    }

    @SdkInternalApi
    final GetVocabularyResult executeGetVocabulary(GetVocabularyRequest getVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(getVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVocabularyRequest> request = null;
        Response<GetVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a vocabulary filter.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return Result of the GetVocabularyFilter operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @sample AmazonTranscribe.GetVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabularyFilter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetVocabularyFilterResult getVocabularyFilter(GetVocabularyFilterRequest request) {
        request = beforeClientExecution(request);
        return executeGetVocabularyFilter(request);
    }

    @SdkInternalApi
    final GetVocabularyFilterResult executeGetVocabularyFilter(GetVocabularyFilterRequest getVocabularyFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(getVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVocabularyFilterRequest> request = null;
        Response<GetVocabularyFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVocabularyFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVocabularyFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVocabularyFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVocabularyFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVocabularyFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides more information about the custom language models you've created. You can use the information in this
     * list to find a specific custom language model. You can then use the operation to get more information about it.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @return Result of the ListLanguageModels operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListLanguageModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListLanguageModels" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLanguageModelsResult listLanguageModels(ListLanguageModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListLanguageModels(request);
    }

    @SdkInternalApi
    final ListLanguageModelsResult executeListLanguageModels(ListLanguageModelsRequest listLanguageModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLanguageModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLanguageModelsRequest> request = null;
        Response<ListLanguageModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLanguageModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLanguageModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLanguageModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLanguageModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLanguageModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists medical transcription jobs with a specified status or substring that matches their names.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @return Result of the ListMedicalTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListMedicalTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMedicalTranscriptionJobsResult listMedicalTranscriptionJobs(ListMedicalTranscriptionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListMedicalTranscriptionJobs(request);
    }

    @SdkInternalApi
    final ListMedicalTranscriptionJobsResult executeListMedicalTranscriptionJobs(ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMedicalTranscriptionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMedicalTranscriptionJobsRequest> request = null;
        Response<ListMedicalTranscriptionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMedicalTranscriptionJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMedicalTranscriptionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMedicalTranscriptionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMedicalTranscriptionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMedicalTranscriptionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If you don't enter a value in any of the
     * request parameters, returns the entire list of vocabularies.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @return Result of the ListMedicalVocabularies operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListMedicalVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMedicalVocabulariesResult listMedicalVocabularies(ListMedicalVocabulariesRequest request) {
        request = beforeClientExecution(request);
        return executeListMedicalVocabularies(request);
    }

    @SdkInternalApi
    final ListMedicalVocabulariesResult executeListMedicalVocabularies(ListMedicalVocabulariesRequest listMedicalVocabulariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMedicalVocabulariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMedicalVocabulariesRequest> request = null;
        Response<ListMedicalVocabulariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMedicalVocabulariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMedicalVocabulariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMedicalVocabularies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMedicalVocabulariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMedicalVocabulariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return Result of the ListTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTranscriptionJobsResult listTranscriptionJobs(ListTranscriptionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListTranscriptionJobs(request);
    }

    @SdkInternalApi
    final ListTranscriptionJobsResult executeListTranscriptionJobs(ListTranscriptionJobsRequest listTranscriptionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTranscriptionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTranscriptionJobsRequest> request = null;
        Response<ListTranscriptionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTranscriptionJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTranscriptionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTranscriptionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTranscriptionJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListTranscriptionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the
     * entire list of vocabularies.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return Result of the ListVocabularies operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListVocabulariesResult listVocabularies(ListVocabulariesRequest request) {
        request = beforeClientExecution(request);
        return executeListVocabularies(request);
    }

    @SdkInternalApi
    final ListVocabulariesResult executeListVocabularies(ListVocabulariesRequest listVocabulariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVocabulariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVocabulariesRequest> request = null;
        Response<ListVocabulariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVocabulariesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVocabulariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVocabularies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVocabulariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVocabulariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about vocabulary filters.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @return Result of the ListVocabularyFilters operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListVocabularyFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularyFilters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVocabularyFiltersResult listVocabularyFilters(ListVocabularyFiltersRequest request) {
        request = beforeClientExecution(request);
        return executeListVocabularyFilters(request);
    }

    @SdkInternalApi
    final ListVocabularyFiltersResult executeListVocabularyFilters(ListVocabularyFiltersRequest listVocabularyFiltersRequest) {

        ExecutionContext executionContext = createExecutionContext(listVocabularyFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVocabularyFiltersRequest> request = null;
        Response<ListVocabularyFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVocabularyFiltersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVocabularyFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVocabularyFilters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVocabularyFiltersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListVocabularyFiltersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a batch job to transcribe medical speech to text.
     * </p>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @return Result of the StartMedicalTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.StartMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMedicalTranscriptionJobResult startMedicalTranscriptionJob(StartMedicalTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartMedicalTranscriptionJob(request);
    }

    @SdkInternalApi
    final StartMedicalTranscriptionJobResult executeStartMedicalTranscriptionJob(StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMedicalTranscriptionJobRequest> request = null;
        Response<StartMedicalTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMedicalTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMedicalTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMedicalTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMedicalTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMedicalTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @return Result of the StartTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.StartTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartTranscriptionJobResult startTranscriptionJob(StartTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartTranscriptionJob(request);
    }

    @SdkInternalApi
    final StartTranscriptionJobResult executeStartTranscriptionJob(StartTranscriptionJobRequest startTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTranscriptionJobRequest> request = null;
        Response<StartTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTranscriptionJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a vocabulary with new values that you provide in a different text file from the one you used to create
     * the vocabulary. The <code>UpdateMedicalVocabulary</code> operation overwrites all of the existing information
     * with the values that you provide in the request.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return Result of the UpdateMedicalVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.UpdateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMedicalVocabularyResult updateMedicalVocabulary(UpdateMedicalVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMedicalVocabulary(request);
    }

    @SdkInternalApi
    final UpdateMedicalVocabularyResult executeUpdateMedicalVocabulary(UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMedicalVocabularyRequest> request = null;
        Response<UpdateMedicalVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMedicalVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMedicalVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMedicalVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMedicalVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMedicalVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing vocabulary with new values. The <code>UpdateVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return Result of the UpdateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.UpdateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVocabularyResult updateVocabulary(UpdateVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVocabulary(request);
    }

    @SdkInternalApi
    final UpdateVocabularyResult executeUpdateVocabulary(UpdateVocabularyRequest updateVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVocabularyRequest> request = null;
        Response<UpdateVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a vocabulary filter with a new list of filtered words.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return Result of the UpdateVocabularyFilter operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @sample AmazonTranscribe.UpdateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVocabularyFilterResult updateVocabularyFilter(UpdateVocabularyFilterRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVocabularyFilter(request);
    }

    @SdkInternalApi
    final UpdateVocabularyFilterResult executeUpdateVocabularyFilter(UpdateVocabularyFilterRequest updateVocabularyFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVocabularyFilterRequest> request = null;
        Response<UpdateVocabularyFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVocabularyFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVocabularyFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVocabularyFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVocabularyFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateVocabularyFilterResultJsonUnmarshaller());
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
