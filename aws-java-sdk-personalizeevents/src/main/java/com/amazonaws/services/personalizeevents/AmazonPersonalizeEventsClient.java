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
package com.amazonaws.services.personalizeevents;

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

import com.amazonaws.services.personalizeevents.AmazonPersonalizeEventsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.personalizeevents.model.*;
import com.amazonaws.services.personalizeevents.model.transform.*;

/**
 * Client for accessing Amazon Personalize Events. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Personalize can consume real-time user event data, such as <i>stream</i> or <i>click</i> data, and use it for
 * model training either alone or combined with historical data. For more information see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/recording-events.html">Recording Events</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPersonalizeEventsClient extends AmazonWebServiceClient implements AmazonPersonalizeEvents {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPersonalizeEvents.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "personalize";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalizeevents.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalizeevents.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalizeevents.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.personalizeevents.model.AmazonPersonalizeEventsException.class));

    public static AmazonPersonalizeEventsClientBuilder builder() {
        return AmazonPersonalizeEventsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Personalize Events using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPersonalizeEventsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Personalize Events using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPersonalizeEventsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("personalize-events.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/personalizeevents/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/personalizeevents/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Records user interaction event data. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/recording-events.html">Recording Events</a>.
     * </p>
     * 
     * @param putEventsRequest
     * @return Result of the PutEvents operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @sample AmazonPersonalizeEvents.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutEvents" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize Events");
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
     * Adds one or more items to an Items dataset. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-items.html">Importing Items Incrementally</a>.
     * </p>
     * 
     * @param putItemsRequest
     * @return Result of the PutItems operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalizeEvents.PutItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutItems" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutItemsResult putItems(PutItemsRequest request) {
        request = beforeClientExecution(request);
        return executePutItems(request);
    }

    @SdkInternalApi
    final PutItemsResult executePutItems(PutItemsRequest putItemsRequest) {

        ExecutionContext executionContext = createExecutionContext(putItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutItemsRequest> request = null;
        Response<PutItemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutItemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putItemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutItems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutItemsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutItemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more users to a Users dataset. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-users.html">Importing Users Incrementally</a>.
     * </p>
     * 
     * @param putUsersRequest
     * @return Result of the PutUsers operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalizeEvents.PutUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutUsers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutUsersResult putUsers(PutUsersRequest request) {
        request = beforeClientExecution(request);
        return executePutUsers(request);
    }

    @SdkInternalApi
    final PutUsersResult executePutUsers(PutUsersRequest putUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(putUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutUsersRequest> request = null;
        Response<PutUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutUsersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutUsersResultJsonUnmarshaller());
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
