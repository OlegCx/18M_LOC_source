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
package com.amazonaws.services.workmailmessageflow;

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

import com.amazonaws.services.workmailmessageflow.AmazonWorkMailMessageFlowClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.workmailmessageflow.model.*;
import com.amazonaws.services.workmailmessageflow.model.transform.*;

/**
 * Client for accessing Amazon WorkMail Message Flow. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * The WorkMail Message Flow API provides access to email messages as they are being sent and received by a WorkMail
 * organization.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkMailMessageFlowClient extends AmazonWebServiceClient implements AmazonWorkMailMessageFlow {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonWorkMailMessageFlow.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "workmailmessageflow";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidContentLocation").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmailmessageflow.model.transform.InvalidContentLocationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MessageFrozen").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmailmessageflow.model.transform.MessageFrozenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmailmessageflow.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MessageRejected").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmailmessageflow.model.transform.MessageRejectedExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.workmailmessageflow.model.AmazonWorkMailMessageFlowException.class));

    public static AmazonWorkMailMessageFlowClientBuilder builder() {
        return AmazonWorkMailMessageFlowClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkMail Message Flow using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkMailMessageFlowClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkMail Message Flow using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkMailMessageFlowClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("workmailmessageflow.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/workmailmessageflow/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/workmailmessageflow/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Retrieves the raw content of an in-transit email message, in MIME format.
     * </p>
     * 
     * @param getRawMessageContentRequest
     * @return Result of the GetRawMessageContent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested email message is not found.
     * @sample AmazonWorkMailMessageFlow.GetRawMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/GetRawMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRawMessageContentResult getRawMessageContent(GetRawMessageContentRequest request) {
        request = beforeClientExecution(request);
        return executeGetRawMessageContent(request);
    }

    @SdkInternalApi
    final GetRawMessageContentResult executeGetRawMessageContent(GetRawMessageContentRequest getRawMessageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(getRawMessageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRawMessageContentRequest> request = null;
        Response<GetRawMessageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRawMessageContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRawMessageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMailMessageFlow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRawMessageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRawMessageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetRawMessageContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the raw content of an in-transit email message, in MIME format.
     * </p>
     * <p>
     * This example describes how to update in-transit email message. For more information and examples for using this
     * API, see <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/update-with-lambda.html"> Updating
     * message content with AWS Lambda</a>.
     * </p>
     * <note>
     * <p>
     * Updates to an in-transit message only appear when you call <code>PutRawMessageContent</code> from an AWS Lambda
     * function configured with a synchronous <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/lambda.html#synchronous-rules"> Run Lambda</a> rule.
     * If you call <code>PutRawMessageContent</code> on a delivered or sent message, the message remains unchanged, even
     * though <a
     * href="https://docs.aws.amazon.com/workmail/latest/APIReference/API_messageflow_GetRawMessageContent.html"
     * >GetRawMessageContent</a> returns an updated message.
     * </p>
     * </note>
     * 
     * @param putRawMessageContentRequest
     * @return Result of the PutRawMessageContent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested email message is not found.
     * @throws InvalidContentLocationException
     *         WorkMail could not access the updated email content. Possible reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You made the request in a region other than your S3 bucket region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-owner-condition.html">S3 bucket
     *         owner</a> is not the same as the calling AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You have an incomplete or missing S3 bucket policy. For more information about policies, see <a
     *         href="https://docs.aws.amazon.com/workmail/latest/adminguide/update-with-lambda.html"> Updating message
     *         content with AWS Lambda </a> in the <i>WorkMail Administrator Guide</i>.
     *         </p>
     *         </li>
     * @throws MessageRejectedException
     *         The requested email could not be updated due to an error in the MIME content. Check the error message for
     *         more information about what caused the error.
     * @throws MessageFrozenException
     *         The requested email is not eligible for update. This is usually the case for a redirected email.
     * @sample AmazonWorkMailMessageFlow.PutRawMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/PutRawMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRawMessageContentResult putRawMessageContent(PutRawMessageContentRequest request) {
        request = beforeClientExecution(request);
        return executePutRawMessageContent(request);
    }

    @SdkInternalApi
    final PutRawMessageContentResult executePutRawMessageContent(PutRawMessageContentRequest putRawMessageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(putRawMessageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRawMessageContentRequest> request = null;
        Response<PutRawMessageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRawMessageContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRawMessageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMailMessageFlow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRawMessageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRawMessageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRawMessageContentResultJsonUnmarshaller());
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
