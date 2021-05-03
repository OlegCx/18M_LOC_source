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
package com.amazonaws.services.support;

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

import com.amazonaws.services.support.AWSSupportClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.support.model.*;
import com.amazonaws.services.support.model.transform.*;

/**
 * Client for accessing AWS Support. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS Support</fullname>
 * <p>
 * The AWS Support API reference is intended for programmers who need detailed information about the AWS Support
 * operations and data types. This service enables you to manage your AWS Support cases programmatically. It uses HTTP
 * methods that return results in JSON format.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise support plan to use the AWS Support API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
 * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support plan,
 * see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * The AWS Support service also exposes a set of <a href="http://aws.amazon.com/premiumsupport/trustedadvisor/">AWS
 * Trusted Advisor</a> features. You can retrieve a list of checks and their descriptions, get check results, specify
 * checks to refresh, and get the refresh status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Service names, issue categories, and available severity levels. </b>The <a>DescribeServices</a> and
 * <a>DescribeSeverityLevels</a> operations return AWS service names, service codes, service categories, and problem
 * severity levels. You use these values when you call the <a>CreateCase</a> operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Case creation, case details, and case resolution.</b> The <a>CreateCase</a>, <a>DescribeCases</a>,
 * <a>DescribeAttachment</a>, and <a>ResolveCase</a> operations create AWS Support cases, retrieve information about
 * cases, and resolve cases.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Case communication.</b> The <a>DescribeCommunications</a>, <a>AddCommunicationToCase</a>, and
 * <a>AddAttachmentsToSet</a> operations retrieve and add communications and attachments to AWS Support cases.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following list describes the operations available from the AWS Support service for Trusted Advisor:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorChecks</a> returns the list of checks that run against your AWS resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * Using the <code>checkId</code> for a specific check returned by <a>DescribeTrustedAdvisorChecks</a>, you can call
 * <a>DescribeTrustedAdvisorCheckResult</a> to obtain the results for the check that you specified.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorCheckSummaries</a> returns summarized results for one or more Trusted Advisor checks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RefreshTrustedAdvisorCheck</a> requests that Trusted Advisor rerun a specified check.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> reports the refresh status of one or more checks.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For authentication of requests, AWS Support uses <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>.
 * </p>
 * <p>
 * See <a href="https://docs.aws.amazon.com/awssupport/latest/user/Welcome.html">About the AWS Support API</a> in the
 * <i>AWS Support User Guide</i> for information about how to use this service to create and manage your support cases,
 * and how to call Trusted Advisor for results of checks on your resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSupportClient extends AmazonWebServiceClient implements AWSSupport {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSupport.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "support";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AttachmentSetIdNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.AttachmentSetIdNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CaseCreationLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.CaseCreationLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AttachmentIdNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.AttachmentIdNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AttachmentSetExpired").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.AttachmentSetExpiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AttachmentLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.AttachmentLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CaseIdNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.CaseIdNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DescribeAttachmentLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.DescribeAttachmentLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AttachmentSetSizeLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.support.model.transform.AttachmentSetSizeLimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.support.model.AWSSupportException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Support. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AWSSupportClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSSupportClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Support. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Support (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSSupportClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSupportClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Support using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSSupportClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSSupportClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSSupportClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Support using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Support (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSSupportClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSupportClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSupportClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Support using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSSupportClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Support using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Support (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSSupportClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSupportClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Support using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Support (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSSupportClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSupportClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSSupportClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSSupportClientBuilder builder() {
        return AWSSupportClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Support using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSupportClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Support using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSupportClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://support.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/support/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/support/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds one or more attachments to an attachment set.
     * </p>
     * <p>
     * An attachment set is a temporary container for attachments that you add to a case or case communication. The set
     * is available for 1 hour after it's created. The <code>expiryTime</code> returned in the response is when the set
     * expires.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addAttachmentsToSetRequest
     * @return Result of the AddAttachmentsToSet operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws AttachmentSetIdNotFoundException
     *         An attachment set with the specified ID could not be found.
     * @throws AttachmentSetExpiredException
     *         The expiration time of the attachment set has passed. The set expires 1 hour after it is created.
     * @throws AttachmentSetSizeLimitExceededException
     *         A limit for the size of an attachment set has been exceeded. The limits are three attachments and 5 MB
     *         per attachment.
     * @throws AttachmentLimitExceededException
     *         The limit for the number of attachment sets created in a short period of time has been exceeded.
     * @sample AWSSupport.AddAttachmentsToSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddAttachmentsToSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddAttachmentsToSetResult addAttachmentsToSet(AddAttachmentsToSetRequest request) {
        request = beforeClientExecution(request);
        return executeAddAttachmentsToSet(request);
    }

    @SdkInternalApi
    final AddAttachmentsToSetResult executeAddAttachmentsToSet(AddAttachmentsToSetRequest addAttachmentsToSetRequest) {

        ExecutionContext executionContext = createExecutionContext(addAttachmentsToSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddAttachmentsToSetRequest> request = null;
        Response<AddAttachmentsToSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddAttachmentsToSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addAttachmentsToSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddAttachmentsToSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddAttachmentsToSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddAttachmentsToSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. Use the <code>caseId</code> parameter to identify
     * the case to which to add communication. You can list a set of email addresses to copy on the communication by
     * using the <code>ccEmailAddresses</code> parameter. The <code>communicationBody</code> value contains the text of
     * the communication.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addCommunicationToCaseRequest
     * @return Result of the AddCommunicationToCase operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseIdNotFoundException
     *         The requested <code>caseId</code> could not be located.
     * @throws AttachmentSetIdNotFoundException
     *         An attachment set with the specified ID could not be found.
     * @throws AttachmentSetExpiredException
     *         The expiration time of the attachment set has passed. The set expires 1 hour after it is created.
     * @sample AWSSupport.AddCommunicationToCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddCommunicationToCase" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddCommunicationToCaseResult addCommunicationToCase(AddCommunicationToCaseRequest request) {
        request = beforeClientExecution(request);
        return executeAddCommunicationToCase(request);
    }

    @SdkInternalApi
    final AddCommunicationToCaseResult executeAddCommunicationToCase(AddCommunicationToCaseRequest addCommunicationToCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(addCommunicationToCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCommunicationToCaseRequest> request = null;
        Response<AddCommunicationToCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCommunicationToCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addCommunicationToCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddCommunicationToCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddCommunicationToCaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddCommunicationToCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a case in the AWS Support Center. This operation is similar to how you create a case in the AWS Support
     * Center <a href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page.
     * </p>
     * <p>
     * The AWS Support API doesn't support requesting service limit increases. You can submit a service limit increase
     * in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Submit a request from the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Service Quotas <a
     * href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_RequestServiceQuotaIncrease.html"
     * >RequestServiceQuotaIncrease</a> operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A successful <code>CreateCase</code> request returns an AWS Support case number. You can use the
     * <a>DescribeCases</a> operation and specify the case number to get existing AWS Support cases. After you create a
     * case, use the <a>AddCommunicationToCase</a> operation to add additional communication or attachments to an
     * existing case.
     * </p>
     * <p>
     * The <code>caseId</code> is separate from the <code>displayId</code> that appears in the <a
     * href="https://console.aws.amazon.com/support">AWS Support Center</a>. Use the <a>DescribeCases</a> operation to
     * get the <code>displayId</code>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createCaseRequest
     * @return Result of the CreateCase operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseCreationLimitExceededException
     *         The case creation limit for the account has been exceeded.
     * @throws AttachmentSetIdNotFoundException
     *         An attachment set with the specified ID could not be found.
     * @throws AttachmentSetExpiredException
     *         The expiration time of the attachment set has passed. The set expires 1 hour after it is created.
     * @sample AWSSupport.CreateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/CreateCase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCaseResult createCase(CreateCaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCase(request);
    }

    @SdkInternalApi
    final CreateCaseResult executeCreateCase(CreateCaseRequest createCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCaseRequest> request = null;
        Response<CreateCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCaseResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the attachment that has the specified ID. Attachments can include screenshots, error logs, or other files
     * that describe your issue. Attachment IDs are generated by the case management system when you add an attachment
     * to a case or case communication. Attachment IDs are returned in the <a>AttachmentDetails</a> objects that are
     * returned by the <a>DescribeCommunications</a> operation.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeAttachmentRequest
     * @return Result of the DescribeAttachment operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws DescribeAttachmentLimitExceededException
     *         The limit for the number of <a>DescribeAttachment</a> requests in a short period of time has been
     *         exceeded.
     * @throws AttachmentIdNotFoundException
     *         An attachment with the specified ID could not be found.
     * @sample AWSSupport.DescribeAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeAttachment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAttachmentResult describeAttachment(DescribeAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAttachment(request);
    }

    @SdkInternalApi
    final DescribeAttachmentResult executeDescribeAttachment(DescribeAttachmentRequest describeAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAttachmentRequest> request = null;
        Response<DescribeAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case IDs. You can use the <code>afterTime</code>
     * and <code>beforeTime</code> parameters to filter the cases by date. You can set values for the
     * <code>includeResolvedCases</code> and <code>includeCommunications</code> parameters to specify how much
     * information to return.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more <a
     * href="https://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">CaseDetails</a> data
     * types.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more <code>nextToken</code> values, which specify where to paginate the returned records represented by
     * the <code>CaseDetails</code> objects.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request
     * might return an error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeCasesRequest
     * @return Result of the DescribeCases operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseIdNotFoundException
     *         The requested <code>caseId</code> could not be located.
     * @sample AWSSupport.DescribeCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeCasesResult describeCases(DescribeCasesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCases(request);
    }

    @SdkInternalApi
    final DescribeCasesResult executeDescribeCases(DescribeCasesRequest describeCasesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCasesRequest> request = null;
        Response<DescribeCasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCasesResult describeCases() {
        return describeCases(new DescribeCasesRequest());
    }

    /**
     * <p>
     * Returns communications and attachments for one or more support cases. Use the <code>afterTime</code> and
     * <code>beforeTime</code> parameters to filter by date. You can use the <code>caseId</code> parameter to restrict
     * the results to a specific case.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for
     * data might cause an error.
     * </p>
     * <p>
     * You can use the <code>maxResults</code> and <code>nextToken</code> parameters to control the pagination of the
     * results. Set <code>maxResults</code> to the number of cases that you want to display on each page, and use
     * <code>nextToken</code> to specify the resumption of pagination.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeCommunicationsRequest
     * @return Result of the DescribeCommunications operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseIdNotFoundException
     *         The requested <code>caseId</code> could not be located.
     * @sample AWSSupport.DescribeCommunications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCommunications" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeCommunicationsResult describeCommunications(DescribeCommunicationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCommunications(request);
    }

    @SdkInternalApi
    final DescribeCommunicationsResult executeDescribeCommunications(DescribeCommunicationsRequest describeCommunicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCommunicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCommunicationsRequest> request = null;
        Response<DescribeCommunicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCommunicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCommunicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCommunications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCommunicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCommunicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current list of AWS services and a list of service categories for each service. You then use service
     * names and categories in your <a>CreateCase</a> requests. Each AWS service has its own set of categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that appear in the <b>Service</b> and
     * <b>Category</b> lists on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page. The values in those fields
     * don't necessarily match the service codes and categories returned by the <code>DescribeServices</code> operation.
     * Always use the service codes and categories that the <code>DescribeServices</code> operation returns, so that you
     * have the most recent set of service and category codes.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeServicesRequest
     * @return Result of the DescribeServices operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeServicesResult describeServices(DescribeServicesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServices(request);
    }

    @SdkInternalApi
    final DescribeServicesResult executeDescribeServices(DescribeServicesRequest describeServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServicesRequest> request = null;
        Response<DescribeServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeServicesResult describeServices() {
        return describeServices(new DescribeServicesRequest());
    }

    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is
     * also a field in the <a>CaseDetails</a> data type that you include for a <a>CreateCase</a> request.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeSeverityLevelsRequest
     * @return Result of the DescribeSeverityLevels operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeSeverityLevels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeSeverityLevels" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeSeverityLevelsResult describeSeverityLevels(DescribeSeverityLevelsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSeverityLevels(request);
    }

    @SdkInternalApi
    final DescribeSeverityLevelsResult executeDescribeSeverityLevels(DescribeSeverityLevelsRequest describeSeverityLevelsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSeverityLevelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSeverityLevelsRequest> request = null;
        Response<DescribeSeverityLevelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSeverityLevelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSeverityLevelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSeverityLevels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSeverityLevelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSeverityLevelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeSeverityLevelsResult describeSeverityLevels() {
        return describeSeverityLevels(new DescribeSeverityLevelsRequest());
    }

    /**
     * <p>
     * Returns the refresh status of the AWS Trusted Advisor checks that have the specified check IDs. You can get the
     * check IDs by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * Some checks are refreshed automatically, and you can't return their refresh statuses by using the
     * <code>DescribeTrustedAdvisorCheckRefreshStatuses</code> operation. If you call this operation for these checks,
     * you might see an <code>InvalidParameterValue</code> error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest
     * @return Result of the DescribeTrustedAdvisorCheckRefreshStatuses operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeTrustedAdvisorCheckRefreshStatuses
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckRefreshStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTrustedAdvisorCheckRefreshStatusesResult describeTrustedAdvisorCheckRefreshStatuses(DescribeTrustedAdvisorCheckRefreshStatusesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrustedAdvisorCheckRefreshStatuses(request);
    }

    @SdkInternalApi
    final DescribeTrustedAdvisorCheckRefreshStatusesResult executeDescribeTrustedAdvisorCheckRefreshStatuses(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckRefreshStatusesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckRefreshStatusesRequest> request = null;
        Response<DescribeTrustedAdvisorCheckRefreshStatusesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckRefreshStatusesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTrustedAdvisorCheckRefreshStatusesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrustedAdvisorCheckRefreshStatuses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrustedAdvisorCheckRefreshStatusesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeTrustedAdvisorCheckRefreshStatusesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the results of the AWS Trusted Advisor check that has the specified check ID. You can get the check IDs
     * by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckResult</a> object, which contains these three objects:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>TrustedAdvisorCategorySpecificSummary</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TrustedAdvisorResourceDetail</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TrustedAdvisorResourcesSummary</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>status</b> - The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or
     * "not_available".
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>timestamp</b> - The time of the last refresh of the check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>checkId</b> - The unique identifier for the check.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckResultRequest
     * @return Result of the DescribeTrustedAdvisorCheckResult operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeTrustedAdvisorCheckResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTrustedAdvisorCheckResultResult describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrustedAdvisorCheckResult(request);
    }

    @SdkInternalApi
    final DescribeTrustedAdvisorCheckResultResult executeDescribeTrustedAdvisorCheckResult(
            DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckResultRequest> request = null;
        Response<DescribeTrustedAdvisorCheckResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckResultRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTrustedAdvisorCheckResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrustedAdvisorCheckResult");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrustedAdvisorCheckResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTrustedAdvisorCheckResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the results for the AWS Trusted Advisor check summaries for the check IDs that you specified. You can get
     * the check IDs by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * The response contains an array of <a>TrustedAdvisorCheckSummary</a> objects.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckSummariesRequest
     * @return Result of the DescribeTrustedAdvisorCheckSummaries operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeTrustedAdvisorCheckSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTrustedAdvisorCheckSummariesResult describeTrustedAdvisorCheckSummaries(DescribeTrustedAdvisorCheckSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrustedAdvisorCheckSummaries(request);
    }

    @SdkInternalApi
    final DescribeTrustedAdvisorCheckSummariesResult executeDescribeTrustedAdvisorCheckSummaries(
            DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckSummariesRequest> request = null;
        Response<DescribeTrustedAdvisorCheckSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckSummariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTrustedAdvisorCheckSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrustedAdvisorCheckSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrustedAdvisorCheckSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTrustedAdvisorCheckSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all available AWS Trusted Advisor checks, including the name, ID, category,
     * description, and metadata. You must specify a language code. The AWS Support API currently supports English
     * ("en") and Japanese ("ja"). The response contains a <a>TrustedAdvisorCheckDescription</a> object for each check.
     * You must set the AWS Region to us-east-1.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorChecksRequest
     * @return Result of the DescribeTrustedAdvisorChecks operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeTrustedAdvisorChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorChecks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTrustedAdvisorChecksResult describeTrustedAdvisorChecks(DescribeTrustedAdvisorChecksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrustedAdvisorChecks(request);
    }

    @SdkInternalApi
    final DescribeTrustedAdvisorChecksResult executeDescribeTrustedAdvisorChecks(DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorChecksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorChecksRequest> request = null;
        Response<DescribeTrustedAdvisorChecksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorChecksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTrustedAdvisorChecksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrustedAdvisorChecks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrustedAdvisorChecksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTrustedAdvisorChecksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Refreshes the AWS Trusted Advisor check that you specify using the check ID. You can get the check IDs by calling
     * the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <note>
     * <p>
     * Some checks are refreshed automatically. If you call the <code>RefreshTrustedAdvisorCheck</code> operation to
     * refresh them, you might see the <code>InvalidParameterValue</code> error.
     * </p>
     * </note>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckRefreshStatus</a> object.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param refreshTrustedAdvisorCheckRequest
     * @return Result of the RefreshTrustedAdvisorCheck operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.RefreshTrustedAdvisorCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/RefreshTrustedAdvisorCheck"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RefreshTrustedAdvisorCheckResult refreshTrustedAdvisorCheck(RefreshTrustedAdvisorCheckRequest request) {
        request = beforeClientExecution(request);
        return executeRefreshTrustedAdvisorCheck(request);
    }

    @SdkInternalApi
    final RefreshTrustedAdvisorCheckResult executeRefreshTrustedAdvisorCheck(RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest) {

        ExecutionContext executionContext = createExecutionContext(refreshTrustedAdvisorCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshTrustedAdvisorCheckRequest> request = null;
        Response<RefreshTrustedAdvisorCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshTrustedAdvisorCheckRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(refreshTrustedAdvisorCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RefreshTrustedAdvisorCheck");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RefreshTrustedAdvisorCheckResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RefreshTrustedAdvisorCheckResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resolves a support case. This operation takes a <code>caseId</code> and returns the initial and final state of
     * the case.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param resolveCaseRequest
     * @return Result of the ResolveCase operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseIdNotFoundException
     *         The requested <code>caseId</code> could not be located.
     * @sample AWSSupport.ResolveCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/ResolveCase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResolveCaseResult resolveCase(ResolveCaseRequest request) {
        request = beforeClientExecution(request);
        return executeResolveCase(request);
    }

    @SdkInternalApi
    final ResolveCaseResult executeResolveCase(ResolveCaseRequest resolveCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(resolveCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveCaseRequest> request = null;
        Response<ResolveCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resolveCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResolveCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResolveCaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResolveCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ResolveCaseResult resolveCase() {
        return resolveCase(new ResolveCaseRequest());
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
