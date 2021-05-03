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
package com.amazonaws.services.fms;

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

import com.amazonaws.services.fms.AWSFMSClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.services.fms.model.transform.*;

/**
 * Client for accessing FMS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Firewall Manager</fullname>
 * <p>
 * This is the <i>AWS Firewall Manager API Reference</i>. This guide is for developers who need detailed information
 * about the AWS Firewall Manager API actions, data types, and errors. For detailed information about AWS Firewall
 * Manager features, see the <a href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-chapter.html">AWS
 * Firewall Manager Developer Guide</a>.
 * </p>
 * <p>
 * Some API actions require explicit resource permissions. For information, see the developer guide topic <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-api-permissions-ref.html">Firewall Manager required
 * permissions for API actions</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSFMSClient extends AmazonWebServiceClient implements AWSFMS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSFMS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "fms";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.fms.model.transform.InvalidOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.fms.model.transform.InternalErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.fms.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.fms.model.transform.InvalidTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.fms.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.fms.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.fms.model.AWSFMSException.class));

    public static AWSFMSClientBuilder builder() {
        return AWSFMSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on FMS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSFMSClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on FMS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSFMSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("fms.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/fms/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/fms/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master
     * account of your AWS organization or associated with a member account that has the appropriate permissions. If the
     * account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the
     * appropriate permissions for the given member account.
     * </p>
     * <p>
     * The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator
     * account.
     * </p>
     * 
     * @param associateAdminAccountRequest
     * @return Result of the AssociateAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.AssociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateAdminAccountResult associateAdminAccount(AssociateAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAdminAccount(request);
    }

    @SdkInternalApi
    final AssociateAdminAccountResult executeAssociateAdminAccount(AssociateAdminAccountRequest associateAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAdminAccountRequest> request = null;
        Response<AssociateAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateAdminAccountResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes an AWS Firewall Manager applications list.
     * </p>
     * 
     * @param deleteAppsListRequest
     * @return Result of the DeleteAppsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DeleteAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAppsListResult deleteAppsList(DeleteAppsListRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppsList(request);
    }

    @SdkInternalApi
    final DeleteAppsListResult executeDeleteAppsList(DeleteAppsListRequest deleteAppsListRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppsListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppsListRequest> request = null;
        Response<DeleteAppsListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppsListRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppsListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppsList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppsListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppsListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS)
     * topic that is used to record AWS Firewall Manager SNS logs.
     * </p>
     * 
     * @param deleteNotificationChannelRequest
     * @return Result of the DeleteNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DeleteNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteNotificationChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteNotificationChannelResult deleteNotificationChannel(DeleteNotificationChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNotificationChannel(request);
    }

    @SdkInternalApi
    final DeleteNotificationChannelResult executeDeleteNotificationChannel(DeleteNotificationChannelRequest deleteNotificationChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNotificationChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotificationChannelRequest> request = null;
        Response<DeleteNotificationChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotificationChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteNotificationChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNotificationChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNotificationChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteNotificationChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes an AWS Firewall Manager policy.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
     * @sample AWSFMS.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicy(request);
    }

    @SdkInternalApi
    final DeletePolicyResult executeDeletePolicy(DeletePolicyRequest deletePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<DeletePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes an AWS Firewall Manager protocols list.
     * </p>
     * 
     * @param deleteProtocolsListRequest
     * @return Result of the DeleteProtocolsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DeleteProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProtocolsListResult deleteProtocolsList(DeleteProtocolsListRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProtocolsList(request);
    }

    @SdkInternalApi
    final DeleteProtocolsListResult executeDeleteProtocolsList(DeleteProtocolsListRequest deleteProtocolsListRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProtocolsListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProtocolsListRequest> request = null;
        Response<DeleteProtocolsListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProtocolsListRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProtocolsListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProtocolsList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProtocolsListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProtocolsListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different
     * account as the administrator account, you must submit an <code>AssociateAdminAccount</code> request.
     * </p>
     * 
     * @param disassociateAdminAccountRequest
     * @return Result of the DisassociateAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DisassociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateAdminAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateAdminAccountResult disassociateAdminAccount(DisassociateAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateAdminAccount(request);
    }

    @SdkInternalApi
    final DisassociateAdminAccountResult executeDisassociateAdminAccount(DisassociateAdminAccountRequest disassociateAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAdminAccountRequest> request = null;
        Response<DisassociateAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall
     * Manager administrator.
     * </p>
     * 
     * @param getAdminAccountRequest
     * @return Result of the GetAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAdminAccountResult getAdminAccount(GetAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetAdminAccount(request);
    }

    @SdkInternalApi
    final GetAdminAccountResult executeGetAdminAccount(GetAdminAccountRequest getAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAdminAccountRequest> request = null;
        Response<GetAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified AWS Firewall Manager applications list.
     * </p>
     * 
     * @param getAppsListRequest
     * @return Result of the GetAppsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAppsListResult getAppsList(GetAppsListRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppsList(request);
    }

    @SdkInternalApi
    final GetAppsListResult executeGetAppsList(GetAppsListRequest getAppsListRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppsListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppsListRequest> request = null;
        Response<GetAppsListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppsListRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppsListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppsList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppsListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppsListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed compliance information about the specified member account. Details include resources that are in
     * and out of compliance with the specified policy. Resources are considered noncompliant for AWS WAF and Shield
     * Advanced policies if the specified policy has not been applied to them. Resources are considered noncompliant for
     * security group policies if they are in scope of the policy, they violate one or more of the policy rules, and
     * remediation is disabled or not possible. Resources are considered noncompliant for Network Firewall policies if a
     * firewall is missing in the VPC, if the firewall endpoint isn't set up in an expected Availability Zone and
     * subnet, if a subnet created by the Firewall Manager doesn't have the expected route table, and for modifications
     * to a firewall policy that violate the Firewall Manager policy's rules.
     * </p>
     * 
     * @param getComplianceDetailRequest
     * @return Result of the GetComplianceDetail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @sample AWSFMS.GetComplianceDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetComplianceDetail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetComplianceDetailResult getComplianceDetail(GetComplianceDetailRequest request) {
        request = beforeClientExecution(request);
        return executeGetComplianceDetail(request);
    }

    @SdkInternalApi
    final GetComplianceDetailResult executeGetComplianceDetail(GetComplianceDetailRequest getComplianceDetailRequest) {

        ExecutionContext executionContext = createExecutionContext(getComplianceDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceDetailRequest> request = null;
        Response<GetComplianceDetailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceDetailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getComplianceDetailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComplianceDetail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComplianceDetailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetComplianceDetailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager
     * SNS logs.
     * </p>
     * 
     * @param getNotificationChannelRequest
     * @return Result of the GetNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetNotificationChannelResult getNotificationChannel(GetNotificationChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetNotificationChannel(request);
    }

    @SdkInternalApi
    final GetNotificationChannelResult executeGetNotificationChannel(GetNotificationChannelRequest getNotificationChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getNotificationChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNotificationChannelRequest> request = null;
        Response<GetNotificationChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNotificationChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNotificationChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNotificationChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNotificationChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetNotificationChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified AWS Firewall Manager policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidTypeException
     *         The value of the <code>Type</code> parameter is invalid.
     * @sample AWSFMS.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicy(request);
    }

    @SdkInternalApi
    final GetPolicyResult executeGetPolicy(GetPolicyRequest getPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a
     * potential DDoS attack. Other policy types are currently unsupported.
     * </p>
     * 
     * @param getProtectionStatusRequest
     * @return Result of the GetProtectionStatus operation returned by the service.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetProtectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtectionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetProtectionStatusResult getProtectionStatus(GetProtectionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetProtectionStatus(request);
    }

    @SdkInternalApi
    final GetProtectionStatusResult executeGetProtectionStatus(GetProtectionStatusRequest getProtectionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getProtectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProtectionStatusRequest> request = null;
        Response<GetProtectionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProtectionStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProtectionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProtectionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProtectionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProtectionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified AWS Firewall Manager protocols list.
     * </p>
     * 
     * @param getProtocolsListRequest
     * @return Result of the GetProtocolsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetProtocolsListResult getProtocolsList(GetProtocolsListRequest request) {
        request = beforeClientExecution(request);
        return executeGetProtocolsList(request);
    }

    @SdkInternalApi
    final GetProtocolsListResult executeGetProtocolsList(GetProtocolsListRequest getProtocolsListRequest) {

        ExecutionContext executionContext = createExecutionContext(getProtocolsListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProtocolsListRequest> request = null;
        Response<GetProtocolsListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProtocolsListRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProtocolsListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProtocolsList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProtocolsListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProtocolsListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves violations for a resource based on the specified AWS Firewall Manager policy and AWS account.
     * </p>
     * 
     * @param getViolationDetailsRequest
     * @return Result of the GetViolationDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetViolationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetViolationDetails" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetViolationDetailsResult getViolationDetails(GetViolationDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetViolationDetails(request);
    }

    @SdkInternalApi
    final GetViolationDetailsResult executeGetViolationDetails(GetViolationDetailsRequest getViolationDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getViolationDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetViolationDetailsRequest> request = null;
        Response<GetViolationDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetViolationDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getViolationDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetViolationDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetViolationDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetViolationDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>AppsListDataSummary</code> objects.
     * </p>
     * 
     * @param listAppsListsRequest
     * @return Result of the ListAppsLists operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListAppsLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAppsLists" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAppsListsResult listAppsLists(ListAppsListsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppsLists(request);
    }

    @SdkInternalApi
    final ListAppsListsResult executeListAppsLists(ListAppsListsRequest listAppsListsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppsListsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppsListsRequest> request = null;
        Response<ListAppsListsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppsListsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppsListsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppsLists");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppsListsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppsListsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>PolicyComplianceStatus</code> objects. Use <code>PolicyComplianceStatus</code> to get a
     * summary of which member accounts are protected by the specified policy.
     * </p>
     * 
     * @param listComplianceStatusRequest
     * @return Result of the ListComplianceStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListComplianceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListComplianceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListComplianceStatusResult listComplianceStatus(ListComplianceStatusRequest request) {
        request = beforeClientExecution(request);
        return executeListComplianceStatus(request);
    }

    @SdkInternalApi
    final ListComplianceStatusResult executeListComplianceStatus(ListComplianceStatusRequest listComplianceStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(listComplianceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComplianceStatusRequest> request = null;
        Response<ListComplianceStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComplianceStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listComplianceStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComplianceStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComplianceStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListComplianceStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a <code>MemberAccounts</code> object that lists the member accounts in the administrator's AWS
     * organization.
     * </p>
     * <p>
     * The <code>ListMemberAccounts</code> must be submitted by the account that is set as the AWS Firewall Manager
     * administrator.
     * </p>
     * 
     * @param listMemberAccountsRequest
     * @return Result of the ListMemberAccounts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListMemberAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListMemberAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMemberAccountsResult listMemberAccounts(ListMemberAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListMemberAccounts(request);
    }

    @SdkInternalApi
    final ListMemberAccountsResult executeListMemberAccounts(ListMemberAccountsRequest listMemberAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMemberAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMemberAccountsRequest> request = null;
        Response<ListMemberAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMemberAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMemberAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMemberAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMemberAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMemberAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>PolicySummary</code> objects.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicies(request);
    }

    @SdkInternalApi
    final ListPoliciesResult executeListPolicies(ListPoliciesRequest listPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     * 
     * @param listProtocolsListsRequest
     * @return Result of the ListProtocolsLists operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListProtocolsLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListProtocolsLists" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProtocolsListsResult listProtocolsLists(ListProtocolsListsRequest request) {
        request = beforeClientExecution(request);
        return executeListProtocolsLists(request);
    }

    @SdkInternalApi
    final ListProtocolsListsResult executeListProtocolsLists(ListProtocolsListsRequest listProtocolsListsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProtocolsListsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProtocolsListsRequest> request = null;
        Response<ListProtocolsListsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProtocolsListsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProtocolsListsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProtocolsLists");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProtocolsListsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProtocolsListsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of tags for the specified AWS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @sample AWSFMS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
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
     * Creates an AWS Firewall Manager applications list.
     * </p>
     * 
     * @param putAppsListRequest
     * @return Result of the PutAppsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.PutAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutAppsListResult putAppsList(PutAppsListRequest request) {
        request = beforeClientExecution(request);
        return executePutAppsList(request);
    }

    @SdkInternalApi
    final PutAppsListResult executePutAppsList(PutAppsListRequest putAppsListRequest) {

        ExecutionContext executionContext = createExecutionContext(putAppsListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAppsListRequest> request = null;
        Response<PutAppsListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAppsListRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAppsListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAppsList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAppsListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAppsListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to
     * record SNS logs.
     * </p>
     * <p>
     * To perform this action outside of the console, you must configure the SNS topic to allow the Firewall Manager
     * role <code>AWSServiceRoleForFMS</code> to publish SNS logs. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-api-permissions-ref.html">Firewall Manager
     * required permissions for API actions</a> in the <i>AWS Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @param putNotificationChannelRequest
     * @return Result of the PutNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.PutNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutNotificationChannelResult putNotificationChannel(PutNotificationChannelRequest request) {
        request = beforeClientExecution(request);
        return executePutNotificationChannel(request);
    }

    @SdkInternalApi
    final PutNotificationChannelResult executePutNotificationChannel(PutNotificationChannelRequest putNotificationChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(putNotificationChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutNotificationChannelRequest> request = null;
        Response<PutNotificationChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutNotificationChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putNotificationChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutNotificationChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutNotificationChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutNotificationChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS Firewall Manager policy.
     * </p>
     * <p>
     * Firewall Manager provides the following types of policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An AWS WAF policy (type WAFV2), which defines rule groups to run first in the corresponding AWS WAF web ACL and
     * rule groups to run last in the web ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS WAF Classic policy (type WAF), which defines a rule group.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Shield Advanced policy, which applies Shield Advanced protection to specified accounts and resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A security group policy, which manages VPC security groups across your AWS organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Network Firewall policy, which provides firewall rules to filter network traffic in specified Amazon VPCs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each policy is specific to one of the types. If you want to enforce more than one policy type across accounts,
     * create multiple policies. You can create multiple policies for each type.
     * </p>
     * <p>
     * You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information about
     * subscribing to Shield Advanced, see <a
     * href="https://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_CreateSubscription.html"
     * >CreateSubscription</a>.
     * </p>
     * 
     * @param putPolicyRequest
     * @return Result of the PutPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidTypeException
     *         The value of the <code>Type</code> parameter is invalid.
     * @sample AWSFMS.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutPolicyResult putPolicy(PutPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutPolicy(request);
    }

    @SdkInternalApi
    final PutPolicyResult executePutPolicy(PutPolicyRequest putPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPolicyRequest> request = null;
        Response<PutPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPolicyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS Firewall Manager protocols list.
     * </p>
     * 
     * @param putProtocolsListRequest
     * @return Result of the PutProtocolsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.PutProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutProtocolsListResult putProtocolsList(PutProtocolsListRequest request) {
        request = beforeClientExecution(request);
        return executePutProtocolsList(request);
    }

    @SdkInternalApi
    final PutProtocolsListResult executePutProtocolsList(PutProtocolsListRequest putProtocolsListRequest) {

        ExecutionContext executionContext = createExecutionContext(putProtocolsListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutProtocolsListRequest> request = null;
        Response<PutProtocolsListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutProtocolsListRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putProtocolsListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutProtocolsList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutProtocolsListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutProtocolsListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to an AWS resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
     * @sample AWSFMS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
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
     * Removes one or more tags from an AWS resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the AWS Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for AWS
     *         Organizations before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @sample AWSFMS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FMS");
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
