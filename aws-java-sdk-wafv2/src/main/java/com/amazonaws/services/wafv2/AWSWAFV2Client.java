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
package com.amazonaws.services.wafv2;

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

import com.amazonaws.services.wafv2.AWSWAFV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.services.wafv2.model.transform.*;

/**
 * Client for accessing WAFV2. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <note>
 * <p>
 * This is the latest version of the <b>AWS WAF</b> API, released in November, 2019. The names of the entities that you
 * use to access this API, like endpoints and namespaces, all have the versioning information added, like "V2" or "v2",
 * to distinguish from the prior version. We recommend migrating your resources to this version, because it has a number
 * of significant improvements.
 * </p>
 * <p>
 * If you used AWS WAF prior to this release, you can't use this AWS WAFV2 API to access any AWS WAF resources that you
 * created before. You can access your old rules, web ACLs, and other AWS WAF resources only through the AWS WAF Classic
 * APIs. The AWS WAF Classic APIs have retained the prior names, endpoints, and namespaces.
 * </p>
 * <p>
 * For information, including how to migrate your AWS WAF resources to this version, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to Amazon
 * CloudFront, an Amazon API Gateway REST API, an Application Load Balancer, or an AWS AppSync GraphQL API. AWS WAF also
 * lets you control access to your content. Based on conditions that you specify, such as the IP addresses that requests
 * originate from or the values of query strings, the API Gateway REST API, CloudFront distribution, the Application
 * Load Balancer, or the AWS AppSync GraphQL API responds to requests either with the requested content or with an HTTP
 * 403 status code (Forbidden). You also can configure CloudFront to return a custom error page when a request is
 * blocked.
 * </p>
 * <p>
 * This API guide is for developers who need detailed information about AWS WAF API actions, data types, and errors. For
 * detailed information about AWS WAF features and an overview of how to use AWS WAF, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
 * </p>
 * <p>
 * You can make calls using the endpoints listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#waf_region">AWS Service Endpoints for AWS WAF</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * For regional applications, you can use any of the endpoints in the list. A regional application can be an Application
 * Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
 * </p>
 * </li>
 * <li>
 * <p>
 * For AWS CloudFront applications, you must use the API endpoint listed for US East (N. Virginia): us-east-1.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * We currently provide two versions of the AWS WAF API: this API and the prior versions, the classic AWS WAF APIs. This
 * new API provides the same functionality as the older versions, with the following major improvements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You use one API for both global and regional applications. Where you need to distinguish the scope, you specify a
 * <code>Scope</code> parameter and set it to <code>CLOUDFRONT</code> or <code>REGIONAL</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can define a Web ACL or rule group with a single call, and update it with a single call. You define all rule
 * specifications in JSON format, and pass them to your rule group or Web ACL calls.
 * </p>
 * </li>
 * <li>
 * <p>
 * The limits AWS WAF places on the use of rules more closely reflects the cost of running each type of rule. Rule
 * groups include capacity settings, so you know the maximum cost of a rule group when you use it.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSWAFV2Client extends AmazonWebServiceClient implements AWSWAFV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSWAFV2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "wafv2";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFLimitsExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFLimitsExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFNonexistentItemException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFNonexistentItemExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFAssociatedItemException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFAssociatedItemExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFServiceLinkedRoleErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFServiceLinkedRoleErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInvalidPermissionPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFInvalidPermissionPolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInternalErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFInternalErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFDuplicateItemException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFDuplicateItemExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInvalidOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFInvalidOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFInvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFTagOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFTagOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFTagOperationInternalErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFTagOperationInternalErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFSubscriptionNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFSubscriptionNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFUnavailableEntityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFUnavailableEntityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInvalidResourceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFInvalidResourceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFOptimisticLockException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wafv2.model.transform.WAFOptimisticLockExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.wafv2.model.AWSWAFV2Exception.class));

    public static AWSWAFV2ClientBuilder builder() {
        return AWSWAFV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on WAFV2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSWAFV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on WAFV2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSWAFV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("wafv2.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/wafv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/wafv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a Web ACL with a regional application resource, to protect the resource. A regional application can be
     * an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * For AWS CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To associate a
     * Web ACL, in the CloudFront call <code>UpdateDistribution</code>, set the web ACL ID to the Amazon Resource Name
     * (ARN) of the Web ACL. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>.
     * </p>
     * 
     * @param associateWebACLRequest
     * @return Result of the AssociateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFUnavailableEntityException
     *         AWS WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AssociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateWebACLResult associateWebACL(AssociateWebACLRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateWebACL(request);
    }

    @SdkInternalApi
    final AssociateWebACLResult executeAssociateWebACL(AssociateWebACLRequest associateWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(associateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWebACLRequest> request = null;
        Response<AssociateWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateWebACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to
     * check the capacity requirements for the rules you want to use in a <a>RuleGroup</a> or <a>WebACL</a>.
     * </p>
     * <p>
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups,
     * and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each
     * rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power.
     * Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule
     * group. The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @param checkCapacityRequest
     * @return Result of the CheckCapacity operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidResourceException
     *         AWS WAF couldn’t perform the operation because the resource that you requested isn’t valid. Check the
     *         resource, and try again.
     * @throws WAFUnavailableEntityException
     *         AWS WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @sample AWSWAFV2.CheckCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CheckCapacity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CheckCapacityResult checkCapacity(CheckCapacityRequest request) {
        request = beforeClientExecution(request);
        return executeCheckCapacity(request);
    }

    @SdkInternalApi
    final CheckCapacityResult executeCheckCapacity(CheckCapacityRequest checkCapacityRequest) {

        ExecutionContext executionContext = createExecutionContext(checkCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckCapacityRequest> request = null;
        Response<CheckCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckCapacityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(checkCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CheckCapacity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CheckCapacityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CheckCapacityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <a>IPSet</a>, which you use to identify web requests that originate from specific IP addresses or
     * ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can
     * configure AWS WAF to block them using an IPSet that lists those IP addresses.
     * </p>
     * 
     * @param createIPSetRequest
     * @return Result of the CreateIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFDuplicateItemException
     *         AWS WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateIPSetResult createIPSet(CreateIPSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIPSet(request);
    }

    @SdkInternalApi
    final CreateIPSetResult executeCreateIPSet(CreateIPSetRequest createIPSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIPSetRequest> request = null;
        Response<CreateIPSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIPSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIPSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIPSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIPSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIPSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>RegexPatternSet</a>, which you reference in a <a>RegexPatternSetReferenceStatement</a>, to have AWS
     * WAF inspect a web request component for the specified patterns.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @return Result of the CreateRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFDuplicateItemException
     *         AWS WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRegexPatternSetResult createRegexPatternSet(CreateRegexPatternSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRegexPatternSet(request);
    }

    @SdkInternalApi
    final CreateRegexPatternSetResult executeCreateRegexPatternSet(CreateRegexPatternSetRequest createRegexPatternSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createRegexPatternSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRegexPatternSetRequest> request = null;
        Response<CreateRegexPatternSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRegexPatternSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRegexPatternSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRegexPatternSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRegexPatternSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateRegexPatternSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>RuleGroup</a> per the specifications provided.
     * </p>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @return Result of the CreateRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFDuplicateItemException
     *         AWS WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFUnavailableEntityException
     *         AWS WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRuleGroupResult createRuleGroup(CreateRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRuleGroup(request);
    }

    @SdkInternalApi
    final CreateRuleGroupResult executeCreateRuleGroup(CreateRuleGroupRequest createRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleGroupRequest> request = null;
        Response<CreateRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>WebACL</a> per the specifications provided.
     * </p>
     * <p>
     * A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action
     * defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a
     * default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web
     * ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a
     * Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway
     * REST API, an Application Load Balancer, or an AWS AppSync GraphQL API.
     * </p>
     * 
     * @param createWebACLRequest
     * @return Result of the CreateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFDuplicateItemException
     *         AWS WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidResourceException
     *         AWS WAF couldn’t perform the operation because the resource that you requested isn’t valid. Check the
     *         resource, and try again.
     * @throws WAFUnavailableEntityException
     *         AWS WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWebACLResult createWebACL(CreateWebACLRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWebACL(request);
    }

    @SdkInternalApi
    final CreateWebACLResult executeCreateWebACL(CreateWebACLRequest createWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(createWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebACLRequest> request = null;
        Response<CreateWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWebACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all rule groups that are managed by AWS Firewall Manager for the specified web ACL.
     * </p>
     * <p>
     * You can only use this if <code>ManagedByFirewallManager</code> is false in the specified <a>WebACL</a>.
     * </p>
     * 
     * @param deleteFirewallManagerRuleGroupsRequest
     * @return Result of the DeleteFirewallManagerRuleGroups operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteFirewallManagerRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteFirewallManagerRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFirewallManagerRuleGroupsResult deleteFirewallManagerRuleGroups(DeleteFirewallManagerRuleGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFirewallManagerRuleGroups(request);
    }

    @SdkInternalApi
    final DeleteFirewallManagerRuleGroupsResult executeDeleteFirewallManagerRuleGroups(
            DeleteFirewallManagerRuleGroupsRequest deleteFirewallManagerRuleGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFirewallManagerRuleGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFirewallManagerRuleGroupsRequest> request = null;
        Response<DeleteFirewallManagerRuleGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFirewallManagerRuleGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteFirewallManagerRuleGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFirewallManagerRuleGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFirewallManagerRuleGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteFirewallManagerRuleGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified <a>IPSet</a>.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @return Result of the DeleteIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFAssociatedItemException
     *         AWS WAF couldn’t perform the operation because your resource is being used by another resource or it’s
     *         associated with another resource.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIPSetResult deleteIPSet(DeleteIPSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIPSet(request);
    }

    @SdkInternalApi
    final DeleteIPSetResult executeDeleteIPSet(DeleteIPSetRequest deleteIPSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIPSetRequest> request = null;
        Response<DeleteIPSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIPSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIPSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIPSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIPSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIPSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return Result of the DeleteLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLoggingConfigurationResult deleteLoggingConfiguration(DeleteLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoggingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteLoggingConfigurationResult executeDeleteLoggingConfiguration(DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoggingConfigurationRequest> request = null;
        Response<DeleteLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes an IAM policy from the specified rule group.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @return Result of the DeletePermissionPolicy operation returned by the service.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFV2.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeletePermissionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePermissionPolicyResult deletePermissionPolicy(DeletePermissionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePermissionPolicy(request);
    }

    @SdkInternalApi
    final DeletePermissionPolicyResult executeDeletePermissionPolicy(DeletePermissionPolicyRequest deletePermissionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePermissionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePermissionPolicyRequest> request = null;
        Response<DeletePermissionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePermissionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePermissionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePermissionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePermissionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePermissionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @return Result of the DeleteRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFAssociatedItemException
     *         AWS WAF couldn’t perform the operation because your resource is being used by another resource or it’s
     *         associated with another resource.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRegexPatternSetResult deleteRegexPatternSet(DeleteRegexPatternSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRegexPatternSet(request);
    }

    @SdkInternalApi
    final DeleteRegexPatternSetResult executeDeleteRegexPatternSet(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRegexPatternSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRegexPatternSetRequest> request = null;
        Response<DeleteRegexPatternSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRegexPatternSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRegexPatternSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRegexPatternSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRegexPatternSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteRegexPatternSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param deleteRuleGroupRequest
     * @return Result of the DeleteRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFAssociatedItemException
     *         AWS WAF couldn’t perform the operation because your resource is being used by another resource or it’s
     *         associated with another resource.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRuleGroupResult deleteRuleGroup(DeleteRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRuleGroup(request);
    }

    @SdkInternalApi
    final DeleteRuleGroupResult executeDeleteRuleGroup(DeleteRuleGroupRequest deleteRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleGroupRequest> request = null;
        Response<DeleteRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified <a>WebACL</a>.
     * </p>
     * <p>
     * You can only use this if <code>ManagedByFirewallManager</code> is false in the specified <a>WebACL</a>.
     * </p>
     * 
     * @param deleteWebACLRequest
     * @return Result of the DeleteWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFAssociatedItemException
     *         AWS WAF couldn’t perform the operation because your resource is being used by another resource or it’s
     *         associated with another resource.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWebACLResult deleteWebACL(DeleteWebACLRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWebACL(request);
    }

    @SdkInternalApi
    final DeleteWebACLResult executeDeleteWebACL(DeleteWebACLRequest deleteWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebACLRequest> request = null;
        Response<DeleteWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWebACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides high-level information for a managed rule group, including descriptions of the rules.
     * </p>
     * 
     * @param describeManagedRuleGroupRequest
     * @return Result of the DescribeManagedRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidResourceException
     *         AWS WAF couldn’t perform the operation because the resource that you requested isn’t valid. Check the
     *         resource, and try again.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DescribeManagedRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeManagedRuleGroupResult describeManagedRuleGroup(DescribeManagedRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeManagedRuleGroup(request);
    }

    @SdkInternalApi
    final DescribeManagedRuleGroupResult executeDescribeManagedRuleGroup(DescribeManagedRuleGroupRequest describeManagedRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeManagedRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeManagedRuleGroupRequest> request = null;
        Response<DescribeManagedRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeManagedRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeManagedRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeManagedRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeManagedRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeManagedRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a Web ACL from a regional application resource. A regional application can be an Application Load
     * Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * For AWS CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To disassociate
     * a Web ACL, provide an empty web ACL ID in the CloudFront call <code>UpdateDistribution</code>. For information,
     * see <a href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html">
     * UpdateDistribution</a>.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @return Result of the DisassociateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DisassociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DisassociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisassociateWebACLResult disassociateWebACL(DisassociateWebACLRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateWebACL(request);
    }

    @SdkInternalApi
    final DisassociateWebACLResult executeDisassociateWebACL(DisassociateWebACLRequest disassociateWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWebACLRequest> request = null;
        Response<DisassociateWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateWebACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified <a>IPSet</a>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return Result of the GetIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIPSetResult getIPSet(GetIPSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetIPSet(request);
    }

    @SdkInternalApi
    final GetIPSetResult executeGetIPSet(GetIPSetRequest getIPSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIPSetRequest> request = null;
        Response<GetIPSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIPSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIPSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIPSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIPSetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIPSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return Result of the GetLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetLoggingConfigurationResult getLoggingConfiguration(GetLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoggingConfiguration(request);
    }

    @SdkInternalApi
    final GetLoggingConfigurationResult executeGetLoggingConfiguration(GetLoggingConfigurationRequest getLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoggingConfigurationRequest> request = null;
        Response<GetLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the IAM policy that is attached to the specified rule group.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @return Result of the GetPermissionPolicy operation returned by the service.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFV2.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPermissionPolicyResult getPermissionPolicy(GetPermissionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPermissionPolicy(request);
    }

    @SdkInternalApi
    final GetPermissionPolicyResult executeGetPermissionPolicy(GetPermissionPolicyRequest getPermissionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPermissionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPermissionPolicyRequest> request = null;
        Response<GetPermissionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPermissionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPermissionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPermissionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPermissionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPermissionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the keys that are currently blocked by a rate-based rule. The maximum number of managed keys that can
     * be blocked for a single rate-based rule is 10,000. If more than 10,000 addresses exceed the rate limit, those
     * with the highest rates are blocked.
     * </p>
     * 
     * @param getRateBasedStatementManagedKeysRequest
     * @return Result of the GetRateBasedStatementManagedKeys operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetRateBasedStatementManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRateBasedStatementManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRateBasedStatementManagedKeysResult getRateBasedStatementManagedKeys(GetRateBasedStatementManagedKeysRequest request) {
        request = beforeClientExecution(request);
        return executeGetRateBasedStatementManagedKeys(request);
    }

    @SdkInternalApi
    final GetRateBasedStatementManagedKeysResult executeGetRateBasedStatementManagedKeys(
            GetRateBasedStatementManagedKeysRequest getRateBasedStatementManagedKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(getRateBasedStatementManagedKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRateBasedStatementManagedKeysRequest> request = null;
        Response<GetRateBasedStatementManagedKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRateBasedStatementManagedKeysRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRateBasedStatementManagedKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRateBasedStatementManagedKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRateBasedStatementManagedKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRateBasedStatementManagedKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @return Result of the GetRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRegexPatternSetResult getRegexPatternSet(GetRegexPatternSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetRegexPatternSet(request);
    }

    @SdkInternalApi
    final GetRegexPatternSetResult executeGetRegexPatternSet(GetRegexPatternSetRequest getRegexPatternSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getRegexPatternSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegexPatternSetRequest> request = null;
        Response<GetRegexPatternSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegexPatternSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRegexPatternSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRegexPatternSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRegexPatternSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRegexPatternSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @return Result of the GetRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRuleGroupResult getRuleGroup(GetRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetRuleGroup(request);
    }

    @SdkInternalApi
    final GetRuleGroupResult executeGetRuleGroup(GetRuleGroupRequest getRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRuleGroupRequest> request = null;
        Response<GetRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from
     * among the first 5,000 requests that your AWS resource received during a time range that you choose. You can
     * specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which AWS WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @return Result of the GetSampledRequests operation returned by the service.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFV2.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetSampledRequests" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSampledRequestsResult getSampledRequests(GetSampledRequestsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSampledRequests(request);
    }

    @SdkInternalApi
    final GetSampledRequestsResult executeGetSampledRequests(GetSampledRequestsRequest getSampledRequestsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSampledRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSampledRequestsRequest> request = null;
        Response<GetSampledRequestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSampledRequestsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSampledRequestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSampledRequests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSampledRequestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSampledRequestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified <a>WebACL</a>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return Result of the GetWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWebACLResult getWebACL(GetWebACLRequest request) {
        request = beforeClientExecution(request);
        return executeGetWebACL(request);
    }

    @SdkInternalApi
    final GetWebACLResult executeGetWebACL(GetWebACLRequest getWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(getWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebACLRequest> request = null;
        Response<GetWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWebACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWebACLResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the <a>WebACL</a> for the specified resource.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @return Result of the GetWebACLForResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFUnavailableEntityException
     *         AWS WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetWebACLForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACLForResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWebACLForResourceResult getWebACLForResource(GetWebACLForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetWebACLForResource(request);
    }

    @SdkInternalApi
    final GetWebACLForResourceResult executeGetWebACLForResource(GetWebACLForResourceRequest getWebACLForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getWebACLForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebACLForResourceRequest> request = null;
        Response<GetWebACLForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebACLForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWebACLForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWebACLForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWebACLForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWebACLForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an array of managed rule groups that are available for you to use. This list includes all AWS Managed
     * Rules rule groups and the AWS Marketplace managed rule groups that you're subscribed to.
     * </p>
     * 
     * @param listAvailableManagedRuleGroupsRequest
     * @return Result of the ListAvailableManagedRuleGroups operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListAvailableManagedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAvailableManagedRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAvailableManagedRuleGroupsResult listAvailableManagedRuleGroups(ListAvailableManagedRuleGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListAvailableManagedRuleGroups(request);
    }

    @SdkInternalApi
    final ListAvailableManagedRuleGroupsResult executeListAvailableManagedRuleGroups(ListAvailableManagedRuleGroupsRequest listAvailableManagedRuleGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAvailableManagedRuleGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableManagedRuleGroupsRequest> request = null;
        Response<ListAvailableManagedRuleGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailableManagedRuleGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAvailableManagedRuleGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAvailableManagedRuleGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAvailableManagedRuleGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAvailableManagedRuleGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an array of <a>IPSetSummary</a> objects for the IP sets that you manage.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return Result of the ListIPSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIPSetsResult listIPSets(ListIPSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListIPSets(request);
    }

    @SdkInternalApi
    final ListIPSetsResult executeListIPSets(ListIPSetsRequest listIPSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIPSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIPSetsRequest> request = null;
        Response<ListIPSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIPSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIPSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIPSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIPSetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIPSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an array of your <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return Result of the ListLoggingConfigurations operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLoggingConfigurationsResult listLoggingConfigurations(ListLoggingConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListLoggingConfigurations(request);
    }

    @SdkInternalApi
    final ListLoggingConfigurationsResult executeListLoggingConfigurations(ListLoggingConfigurationsRequest listLoggingConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLoggingConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLoggingConfigurationsRequest> request = null;
        Response<ListLoggingConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLoggingConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLoggingConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLoggingConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLoggingConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLoggingConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an array of <a>RegexPatternSetSummary</a> objects for the regex pattern sets that you manage.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @return Result of the ListRegexPatternSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListRegexPatternSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRegexPatternSetsResult listRegexPatternSets(ListRegexPatternSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListRegexPatternSets(request);
    }

    @SdkInternalApi
    final ListRegexPatternSetsResult executeListRegexPatternSets(ListRegexPatternSetsRequest listRegexPatternSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRegexPatternSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRegexPatternSetsRequest> request = null;
        Response<ListRegexPatternSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRegexPatternSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRegexPatternSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRegexPatternSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRegexPatternSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRegexPatternSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the
     * specified web ACL. If you want the list of AWS CloudFront resources, use the AWS CloudFront call
     * <code>ListDistributionsByWebACLId</code>.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @return Result of the ListResourcesForWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListResourcesForWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListResourcesForWebACL" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListResourcesForWebACLResult listResourcesForWebACL(ListResourcesForWebACLRequest request) {
        request = beforeClientExecution(request);
        return executeListResourcesForWebACL(request);
    }

    @SdkInternalApi
    final ListResourcesForWebACLResult executeListResourcesForWebACL(ListResourcesForWebACLRequest listResourcesForWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourcesForWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesForWebACLRequest> request = null;
        Response<ListResourcesForWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesForWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourcesForWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourcesForWebACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourcesForWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResourcesForWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an array of <a>RuleGroupSummary</a> objects for the rule groups that you manage.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return Result of the ListRuleGroups operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListRuleGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRuleGroupsResult listRuleGroups(ListRuleGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListRuleGroups(request);
    }

    @SdkInternalApi
    final ListRuleGroupsResult executeListRuleGroups(ListRuleGroupsRequest listRuleGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRuleGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRuleGroupsRequest> request = null;
        Response<ListRuleGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRuleGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRuleGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRuleGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRuleGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRuleGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the <a>TagInfoForResource</a> for the specified resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS
     * resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can tag the AWS resources that you manage through AWS WAF: web ACLs, rule groups, IP sets, and regex pattern
     * sets. You can't manage or view tags through the AWS WAF console.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
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
     * Retrieves an array of <a>WebACLSummary</a> objects for the web ACLs that you manage.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return Result of the ListWebACLs operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWebACLsResult listWebACLs(ListWebACLsRequest request) {
        request = beforeClientExecution(request);
        return executeListWebACLs(request);
    }

    @SdkInternalApi
    final ListWebACLsResult executeListWebACLs(ListWebACLsRequest listWebACLsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWebACLsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebACLsRequest> request = null;
        Response<ListWebACLsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebACLsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWebACLsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWebACLs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWebACLsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWebACLsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the specified <a>LoggingConfiguration</a>, to start logging from a web ACL, according to the
     * configuration provided.
     * </p>
     * <p>
     * You can access information about all traffic that AWS WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the Region that you are operating. If you are capturing logs
     * for Amazon CloudFront, always create the firehose in US East (N. Virginia).
     * </p>
     * <p>
     * Give the data firehose a name that starts with the prefix <code>aws-waf-logs-</code>. For example,
     * <code>aws-waf-logs-us-east-2-analytics</code>.
     * </p>
     * <note>
     * <p>
     * Do not create the data firehose using a <code>Kinesis stream</code> as your source.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Associate that firehose to your web ACL using a <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, AWS WAF will create a
     * service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more
     * information, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging Web ACL
     * Traffic Information</a> in the <i>AWS WAF Developer Guide</i>.
     * </p>
     * 
     * @param putLoggingConfigurationRequest
     * @return Result of the PutLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFServiceLinkedRoleErrorException
     *         AWS WAF is not able to access the service linked role. This can be caused by a previous
     *         <code>PutLoggingConfiguration</code> request, which can lock the service linked role for about 20
     *         seconds. Please try your request again. The service linked role can also be locked by a previous
     *         <code>DeleteServiceLinkedRole</code> request, which can lock the role for 15 minutes or more. If you
     *         recently made a call to <code>DeleteServiceLinkedRole</code>, wait at least 15 minutes and try the
     *         request again. If you receive this same exception again, you will have to wait additional time until the
     *         role is unlocked.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFV2.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutLoggingConfigurationResult putLoggingConfiguration(PutLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutLoggingConfiguration(request);
    }

    @SdkInternalApi
    final PutLoggingConfigurationResult executePutLoggingConfiguration(PutLoggingConfigurationRequest putLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLoggingConfigurationRequest> request = null;
        Response<PutLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches an IAM policy to the specified resource. Use this to share a rule group across accounts.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * <p>
     * This action is subject to the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can attach only one policy with each <code>PutPermissionPolicy</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN in the request must be a valid WAF <a>RuleGroup</a> ARN and the rule group must exist in the same region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The user making the request must be the owner of the rule group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putPermissionPolicyRequest
     * @return Result of the PutPermissionPolicy operation returned by the service.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidPermissionPolicyException
     *         The operation failed because the specified policy isn't in the proper format. </p>
     *         <p>
     *         The policy specifications must conform to the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The policy must be composed using IAM Policy version 2012-10-17 or version 2015-01-01.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The policy must include specifications for <code>Effect</code>, <code>Action</code>, and
     *         <code>Principal</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Effect</code> must specify <code>Allow</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Action</code> must specify <code>wafv2:CreateWebACL</code>, <code>wafv2:UpdateWebACL</code>, and
     *         <code>wafv2:PutFirewallManagerRuleGroups</code>. AWS WAF rejects any extra actions or wildcard actions in
     *         the policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The policy must not include a <code>Resource</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM Policies</a>.
     * @sample AWSWAFV2.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutPermissionPolicyResult putPermissionPolicy(PutPermissionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutPermissionPolicy(request);
    }

    @SdkInternalApi
    final PutPermissionPolicyResult executePutPermissionPolicy(PutPermissionPolicyRequest putPermissionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putPermissionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPermissionPolicyRequest> request = null;
        Response<PutPermissionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPermissionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putPermissionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPermissionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPermissionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutPermissionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates tags with the specified AWS resource. Tags are key:value pairs that you can use to categorize and
     * manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the
     * value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for
     * a resource.
     * </p>
     * <p>
     * You can tag the AWS resources that you manage through AWS WAF: web ACLs, rule groups, IP sets, and regex pattern
     * sets. You can't manage or view tags through the AWS WAF console.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
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
     * Disassociates tags from an AWS resource. Tags are key:value pairs that you can associate with AWS resources. For
     * example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags
     * to add to each container. You can add up to 50 tags to each AWS resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         AWS WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
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
     * Updates the specified <a>IPSet</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces any IP address specifications that you already have in the IP set with the
     * ones that you provide to this call. If you want to add to or modify the addresses that are already in the IP set,
     * retrieve those by calling <a>GetIPSet</a>, update them, and provide the complete updated array of IP addresses to
     * this call.
     * </p>
     * </note>
     * 
     * @param updateIPSetRequest
     * @return Result of the UpdateIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFDuplicateItemException
     *         AWS WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateIPSetResult updateIPSet(UpdateIPSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIPSet(request);
    }

    @SdkInternalApi
    final UpdateIPSetResult executeUpdateIPSet(UpdateIPSetRequest updateIPSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIPSetRequest> request = null;
        Response<UpdateIPSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIPSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIPSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIPSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIPSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIPSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param updateRegexPatternSetRequest
     * @return Result of the UpdateRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFDuplicateItemException
     *         AWS WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateRegexPatternSetResult updateRegexPatternSet(UpdateRegexPatternSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRegexPatternSet(request);
    }

    @SdkInternalApi
    final UpdateRegexPatternSetResult executeUpdateRegexPatternSet(UpdateRegexPatternSetRequest updateRegexPatternSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRegexPatternSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRegexPatternSetRequest> request = null;
        Response<UpdateRegexPatternSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRegexPatternSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRegexPatternSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRegexPatternSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRegexPatternSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateRegexPatternSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified <a>RuleGroup</a>.
     * </p>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return Result of the UpdateRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFDuplicateItemException
     *         AWS WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFUnavailableEntityException
     *         AWS WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRuleGroupResult updateRuleGroup(UpdateRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRuleGroup(request);
    }

    @SdkInternalApi
    final UpdateRuleGroupResult executeUpdateRuleGroup(UpdateRuleGroupRequest updateRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleGroupRequest> request = null;
        Response<UpdateRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified <a>WebACL</a>.
     * </p>
     * <p>
     * A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action
     * defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a
     * default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web
     * ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a
     * Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway
     * REST API, an Application Load Balancer, or an AWS AppSync GraphQL API.
     * </p>
     * 
     * @param updateWebACLRequest
     * @return Result of the UpdateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but AWS WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a Web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         AWS WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFDuplicateItemException
     *         AWS WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         AWS WAF couldn’t save your changes because you tried to update or delete a resource that has changed
     *         since you last retrieved it. Get the resource again, make any changes you need to make to the new copy,
     *         and retry your operation.
     * @throws WAFLimitsExceededException
     *         AWS WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an AWS account. For more information, see
     *         <a href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidResourceException
     *         AWS WAF couldn’t perform the operation because the resource that you requested isn’t valid. Check the
     *         resource, and try again.
     * @throws WAFUnavailableEntityException
     *         AWS WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWebACLResult updateWebACL(UpdateWebACLRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWebACL(request);
    }

    @SdkInternalApi
    final UpdateWebACLResult executeUpdateWebACL(UpdateWebACLRequest updateWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWebACLRequest> request = null;
        Response<UpdateWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WAFV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWebACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWebACLResultJsonUnmarshaller());
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
