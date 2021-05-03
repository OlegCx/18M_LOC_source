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
package com.amazonaws.services.pi;

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

import com.amazonaws.services.pi.AWSPIClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pi.model.*;
import com.amazonaws.services.pi.model.transform.*;

/**
 * Client for accessing AWS PI. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon RDS Performance Insights</fullname>
 * <p>
 * Amazon RDS Performance Insights enables you to monitor and explore different dimensions of database load based on
 * data captured from a running DB instance. The guide provides detailed information about Performance Insights data
 * types, parameters and errors.
 * </p>
 * <p>
 * When Performance Insights is enabled, the Amazon RDS Performance Insights API provides visibility into the
 * performance of your DB instance. Amazon CloudWatch provides the authoritative source for AWS service-vended
 * monitoring metrics. Performance Insights offers a domain-specific view of DB load.
 * </p>
 * <p>
 * DB load is measured as Average Active Sessions. Performance Insights provides the data to API consumers as a
 * two-dimensional time-series dataset. The time dimension provides DB load data for each time point in the queried time
 * range. Each time point decomposes overall load in relation to the requested dimensions, measured at that time point.
 * Examples include SQL, Wait event, User, and Host.
 * </p>
 * <ul>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon Aurora DB instances, go to the <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights.html">Amazon Aurora User
 * Guide</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon RDS DB instances, go to the <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Amazon RDS User Guide</a>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPIClient extends AmazonWebServiceClient implements AWSPI {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSPI.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "pi";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAuthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pi.model.transform.NotAuthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pi.model.transform.InvalidArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceError").withExceptionUnmarshaller(
                                    com.amazonaws.services.pi.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pi.model.AWSPIException.class));

    public static AWSPIClientBuilder builder() {
        return AWSPIClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS PI using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPIClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS PI using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPIClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("pi.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pi/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pi/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * For a specific time period, retrieve the top <code>N</code> dimension keys for a metric.
     * </p>
     * <note>
     * <p>
     * Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first
     * 500 bytes are returned.
     * </p>
     * </note>
     * 
     * @param describeDimensionKeysRequest
     * @return Result of the DescribeDimensionKeys operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.DescribeDimensionKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDimensionKeysResult describeDimensionKeys(DescribeDimensionKeysRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDimensionKeys(request);
    }

    @SdkInternalApi
    final DescribeDimensionKeysResult executeDescribeDimensionKeys(DescribeDimensionKeysRequest describeDimensionKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDimensionKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDimensionKeysRequest> request = null;
        Response<DescribeDimensionKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDimensionKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDimensionKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PI");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDimensionKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDimensionKeysResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDimensionKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific
     * dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
     * </p>
     * <note>
     * <p>
     * Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first
     * 500 bytes are returned.
     * </p>
     * </note>
     * 
     * @param getResourceMetricsRequest
     * @return Result of the GetResourceMetrics operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.GetResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetResourceMetricsResult getResourceMetrics(GetResourceMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceMetrics(request);
    }

    @SdkInternalApi
    final GetResourceMetricsResult executeGetResourceMetrics(GetResourceMetricsRequest getResourceMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceMetricsRequest> request = null;
        Response<GetResourceMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceMetricsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PI");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourceMetricsResultJsonUnmarshaller());
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
