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
package com.amazonaws.services.athena;

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

import com.amazonaws.services.athena.AmazonAthenaClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.services.athena.model.transform.*;

/**
 * Client for accessing Amazon Athena. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Athena is an interactive query service that lets you use standard SQL to analyze data directly in Amazon S3.
 * You can point Athena at your data in Amazon S3 and run ad-hoc queries and get results in seconds. Athena is
 * serverless, so there is no infrastructure to set up or manage. You pay only for the queries you run. Athena scales
 * automatically—executing queries in parallel—so results are fast, even with large datasets and complex queries. For
 * more information, see <a href="http://docs.aws.amazon.com/athena/latest/ug/what-is.html">What is Amazon Athena</a> in
 * the <i>Amazon Athena User Guide</i>.
 * </p>
 * <p>
 * If you connect to Athena using the JDBC driver, use version 1.1.0 of the driver or later with the Amazon Athena API.
 * Earlier version drivers do not support the API. For more information and to download the driver, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/connect-with-jdbc.html">Accessing Amazon Athena with JDBC</a>.
 * </p>
 * <p>
 * For code samples using the AWS SDK for Java, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the <i>Amazon
 * Athena User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAthenaClient extends AmazonWebServiceClient implements AmazonAthena {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAthena.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "athena";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MetadataException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.MetadataExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.athena.model.AmazonAthenaException.class));

    public static AmazonAthenaClientBuilder builder() {
        return AmazonAthenaClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Athena using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAthenaClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Athena using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAthenaClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("athena.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/athena/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/athena/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query
     * ID strings. Requires you to have access to the workgroup in which the queries were saved. Use
     * <a>ListNamedQueriesInput</a> to get the list of named query IDs in the specified workgroup. If information could
     * not be retrieved for a submitted query ID, information about the query ID submitted is listed under
     * <a>UnprocessedNamedQueryId</a>. Named queries differ from executed queries. Use
     * <a>BatchGetQueryExecutionInput</a> to get details about each unique query execution, and
     * <a>ListQueryExecutionsInput</a> to get a list of query execution IDs.
     * </p>
     * 
     * @param batchGetNamedQueryRequest
     * @return Result of the BatchGetNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.BatchGetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetNamedQueryResult batchGetNamedQuery(BatchGetNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetNamedQuery(request);
    }

    @SdkInternalApi
    final BatchGetNamedQueryResult executeBatchGetNamedQuery(BatchGetNamedQueryRequest batchGetNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetNamedQueryRequest> request = null;
        Response<BatchGetNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an
     * array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To
     * get a list of query execution IDs, use <a>ListQueryExecutionsInput$WorkGroup</a>. Query executions differ from
     * named (saved) queries. Use <a>BatchGetNamedQueryInput</a> to get details about named queries.
     * </p>
     * 
     * @param batchGetQueryExecutionRequest
     * @return Result of the BatchGetQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.BatchGetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetQueryExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchGetQueryExecutionResult batchGetQueryExecution(BatchGetQueryExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetQueryExecution(request);
    }

    @SdkInternalApi
    final BatchGetQueryExecutionResult executeBatchGetQueryExecution(BatchGetQueryExecutionRequest batchGetQueryExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetQueryExecutionRequest> request = null;
        Response<BatchGetQueryExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetQueryExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetQueryExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetQueryExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetQueryExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetQueryExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all
     * users of the same AWS account.
     * </p>
     * 
     * @param createDataCatalogRequest
     * @return Result of the CreateDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataCatalogResult createDataCatalog(CreateDataCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataCatalog(request);
    }

    @SdkInternalApi
    final CreateDataCatalogResult executeCreateDataCatalog(CreateDataCatalogRequest createDataCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataCatalogRequest> request = null;
        Response<CreateDataCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a named query in the specified workgroup. Requires that you have access to the workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param createNamedQueryRequest
     * @return Result of the CreateNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateNamedQueryResult createNamedQuery(CreateNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNamedQuery(request);
    }

    @SdkInternalApi
    final CreateNamedQueryResult executeCreateNamedQuery(CreateNamedQueryRequest createNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(createNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNamedQueryRequest> request = null;
        Response<CreateNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a prepared statement for use with SQL queries in Athena.
     * </p>
     * 
     * @param createPreparedStatementRequest
     * @return Result of the CreatePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePreparedStatementResult createPreparedStatement(CreatePreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePreparedStatement(request);
    }

    @SdkInternalApi
    final CreatePreparedStatementResult executeCreatePreparedStatement(CreatePreparedStatementRequest createPreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(createPreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePreparedStatementRequest> request = null;
        Response<CreatePreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a workgroup with the specified name.
     * </p>
     * 
     * @param createWorkGroupRequest
     * @return Result of the CreateWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkGroupResult createWorkGroup(CreateWorkGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkGroup(request);
    }

    @SdkInternalApi
    final CreateWorkGroupResult executeCreateWorkGroup(CreateWorkGroupRequest createWorkGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkGroupRequest> request = null;
        Response<CreateWorkGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a data catalog.
     * </p>
     * 
     * @param deleteDataCatalogRequest
     * @return Result of the DeleteDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDataCatalogResult deleteDataCatalog(DeleteDataCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataCatalog(request);
    }

    @SdkInternalApi
    final DeleteDataCatalogResult executeDeleteDataCatalog(DeleteDataCatalogRequest deleteDataCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataCatalogRequest> request = null;
        Response<DeleteDataCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the named query if you have access to the workgroup in which the query was saved.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param deleteNamedQueryRequest
     * @return Result of the DeleteNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNamedQuery(request);
    }

    @SdkInternalApi
    final DeleteNamedQueryResult executeDeleteNamedQuery(DeleteNamedQueryRequest deleteNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNamedQueryRequest> request = null;
        Response<DeleteNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param deletePreparedStatementRequest
     * @return Result of the DeletePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.DeletePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeletePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePreparedStatementResult deletePreparedStatement(DeletePreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePreparedStatement(request);
    }

    @SdkInternalApi
    final DeletePreparedStatementResult executeDeletePreparedStatement(DeletePreparedStatementRequest deletePreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePreparedStatementRequest> request = null;
        Response<DeletePreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
     * </p>
     * 
     * @param deleteWorkGroupRequest
     * @return Result of the DeleteWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkGroupResult deleteWorkGroup(DeleteWorkGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkGroup(request);
    }

    @SdkInternalApi
    final DeleteWorkGroupResult executeDeleteWorkGroup(DeleteWorkGroupRequest deleteWorkGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkGroupRequest> request = null;
        Response<DeleteWorkGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the specified data catalog.
     * </p>
     * 
     * @param getDataCatalogRequest
     * @return Result of the GetDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataCatalogResult getDataCatalog(GetDataCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataCatalog(request);
    }

    @SdkInternalApi
    final GetDataCatalogResult executeGetDataCatalog(GetDataCatalogRequest getDataCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataCatalogRequest> request = null;
        Response<GetDataCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a database object for the specified database and data catalog.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return Result of the GetDatabase operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDatabaseResult getDatabase(GetDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatabase(request);
    }

    @SdkInternalApi
    final GetDatabaseResult executeGetDatabase(GetDatabaseRequest getDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatabaseRequest> request = null;
        Response<GetDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a single query. Requires that you have access to the workgroup in which the query was
     * saved.
     * </p>
     * 
     * @param getNamedQueryRequest
     * @return Result of the GetNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetNamedQueryResult getNamedQuery(GetNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeGetNamedQuery(request);
    }

    @SdkInternalApi
    final GetNamedQueryResult executeGetNamedQuery(GetNamedQueryRequest getNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(getNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNamedQueryRequest> request = null;
        Response<GetNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param getPreparedStatementRequest
     * @return Result of the GetPreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetPreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPreparedStatementResult getPreparedStatement(GetPreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeGetPreparedStatement(request);
    }

    @SdkInternalApi
    final GetPreparedStatementResult executeGetPreparedStatement(GetPreparedStatementRequest getPreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(getPreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPreparedStatementRequest> request = null;
        Response<GetPreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a single execution of a query if you have access to the workgroup in which the query
     * ran. Each time a query executes, information about the query execution is saved with a unique ID.
     * </p>
     * 
     * @param getQueryExecutionRequest
     * @return Result of the GetQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueryExecutionResult getQueryExecution(GetQueryExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryExecution(request);
    }

    @SdkInternalApi
    final GetQueryExecutionResult executeGetQueryExecution(GetQueryExecutionRequest getQueryExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryExecutionRequest> request = null;
        Response<GetQueryExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueryExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueryExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Streams the results of a single query execution specified by <code>QueryExecutionId</code> from the Athena query
     * results location in Amazon S3. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a> in the <i>Amazon Athena User
     * Guide</i>. This request does not execute the query but returns results. Use <a>StartQueryExecution</a> to run a
     * query.
     * </p>
     * <p>
     * To stream query results successfully, the IAM principal with permission to call <code>GetQueryResults</code> also
     * must have permissions to the Amazon S3 <code>GetObject</code> action for the Athena query results location.
     * </p>
     * <important>
     * <p>
     * IAM principals with permission to the Amazon S3 <code>GetObject</code> action for the query results location are
     * able to retrieve query results from Amazon S3 even if permission to the <code>GetQueryResults</code> action is
     * denied. To restrict user or role access, ensure that Amazon S3 permissions to the Athena query location are
     * denied.
     * </p>
     * </important>
     * 
     * @param getQueryResultsRequest
     * @return Result of the GetQueryResults operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryResults(request);
    }

    @SdkInternalApi
    final GetQueryResultsResult executeGetQueryResults(GetQueryResultsRequest getQueryResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryResultsRequest> request = null;
        Response<GetQueryResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryResultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueryResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueryResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns table metadata for the specified catalog, database, and table.
     * </p>
     * 
     * @param getTableMetadataRequest
     * @return Result of the GetTableMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.GetTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTableMetadataResult getTableMetadata(GetTableMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetTableMetadata(request);
    }

    @SdkInternalApi
    final GetTableMetadataResult executeGetTableMetadata(GetTableMetadataRequest getTableMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getTableMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableMetadataRequest> request = null;
        Response<GetTableMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTableMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTableMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTableMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTableMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the workgroup with the specified name.
     * </p>
     * 
     * @param getWorkGroupRequest
     * @return Result of the GetWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWorkGroupResult getWorkGroup(GetWorkGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkGroup(request);
    }

    @SdkInternalApi
    final GetWorkGroupResult executeGetWorkGroup(GetWorkGroupRequest getWorkGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkGroupRequest> request = null;
        Response<GetWorkGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the data catalogs in the current AWS account.
     * </p>
     * 
     * @param listDataCatalogsRequest
     * @return Result of the ListDataCatalogs operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListDataCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDataCatalogs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataCatalogsResult listDataCatalogs(ListDataCatalogsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataCatalogs(request);
    }

    @SdkInternalApi
    final ListDataCatalogsResult executeListDataCatalogs(ListDataCatalogsRequest listDataCatalogsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataCatalogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataCatalogsRequest> request = null;
        Response<ListDataCatalogsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataCatalogsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataCatalogsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataCatalogs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataCatalogsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataCatalogsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the databases in the specified data catalog.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDatabasesResult listDatabases(ListDatabasesRequest request) {
        request = beforeClientExecution(request);
        return executeListDatabases(request);
    }

    @SdkInternalApi
    final ListDatabasesResult executeListDatabases(ListDatabasesRequest listDatabasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatabasesRequest> request = null;
        Response<ListDatabasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatabasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatabasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatabases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatabasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatabasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of engine versions that are available to choose from, including the Auto option.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @return Result of the ListEngineVersions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEngineVersionsResult listEngineVersions(ListEngineVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListEngineVersions(request);
    }

    @SdkInternalApi
    final ListEngineVersionsResult executeListEngineVersions(ListEngineVersionsRequest listEngineVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEngineVersionsRequest> request = null;
        Response<ListEngineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEngineVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEngineVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEngineVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEngineVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have
     * access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary
     * workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listNamedQueriesRequest
     * @return Result of the ListNamedQueries operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListNamedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNamedQueries" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListNamedQueriesResult listNamedQueries(ListNamedQueriesRequest request) {
        request = beforeClientExecution(request);
        return executeListNamedQueries(request);
    }

    @SdkInternalApi
    final ListNamedQueriesResult executeListNamedQueries(ListNamedQueriesRequest listNamedQueriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNamedQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamedQueriesRequest> request = null;
        Response<ListNamedQueriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamedQueriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNamedQueriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNamedQueries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNamedQueriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNamedQueriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the prepared statements in the specfied workgroup.
     * </p>
     * 
     * @param listPreparedStatementsRequest
     * @return Result of the ListPreparedStatements operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListPreparedStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListPreparedStatements" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPreparedStatementsResult listPreparedStatements(ListPreparedStatementsRequest request) {
        request = beforeClientExecution(request);
        return executeListPreparedStatements(request);
    }

    @SdkInternalApi
    final ListPreparedStatementsResult executeListPreparedStatements(ListPreparedStatementsRequest listPreparedStatementsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPreparedStatementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPreparedStatementsRequest> request = null;
        Response<ListPreparedStatementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPreparedStatementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPreparedStatementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPreparedStatements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPreparedStatementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPreparedStatementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of available query execution IDs for the queries in the specified workgroup. If a workgroup is
     * not specified, returns a list of query execution IDs for the primary workgroup. Requires you to have access to
     * the workgroup in which the queries ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listQueryExecutionsRequest
     * @return Result of the ListQueryExecutions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListQueryExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListQueryExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQueryExecutionsResult listQueryExecutions(ListQueryExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListQueryExecutions(request);
    }

    @SdkInternalApi
    final ListQueryExecutionsResult executeListQueryExecutions(ListQueryExecutionsRequest listQueryExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueryExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueryExecutionsRequest> request = null;
        Response<ListQueryExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueryExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueryExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueryExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueryExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueryExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the metadata for the tables in the specified data catalog database.
     * </p>
     * 
     * @param listTableMetadataRequest
     * @return Result of the ListTableMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.ListTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTableMetadataResult listTableMetadata(ListTableMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeListTableMetadata(request);
    }

    @SdkInternalApi
    final ListTableMetadataResult executeListTableMetadata(ListTableMetadataRequest listTableMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(listTableMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTableMetadataRequest> request = null;
        Response<ListTableMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTableMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTableMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTableMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTableMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTableMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags associated with an Athena workgroup or data catalog resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
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
     * Lists available workgroups for the account.
     * </p>
     * 
     * @param listWorkGroupsRequest
     * @return Result of the ListWorkGroups operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListWorkGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListWorkGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkGroupsResult listWorkGroups(ListWorkGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkGroups(request);
    }

    @SdkInternalApi
    final ListWorkGroupsResult executeListWorkGroups(ListWorkGroupsRequest listWorkGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkGroupsRequest> request = null;
        Response<ListWorkGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs the SQL query statements contained in the <code>Query</code>. Requires you to have access to the workgroup
     * in which the query ran. Running queries against an external catalog requires <a>GetDataCatalog</a> permission to
     * the catalog. For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param startQueryExecutionRequest
     * @return Result of the StartQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.StartQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartQueryExecutionResult startQueryExecution(StartQueryExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartQueryExecution(request);
    }

    @SdkInternalApi
    final StartQueryExecutionResult executeStartQueryExecution(StartQueryExecutionRequest startQueryExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartQueryExecutionRequest> request = null;
        Response<StartQueryExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartQueryExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startQueryExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartQueryExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartQueryExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartQueryExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a query execution. Requires you to have access to the workgroup in which the query ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param stopQueryExecutionRequest
     * @return Result of the StopQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.StopQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopQueryExecutionResult stopQueryExecution(StopQueryExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStopQueryExecution(request);
    }

    @SdkInternalApi
    final StopQueryExecutionResult executeStopQueryExecution(StopQueryExecutionRequest stopQueryExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopQueryExecutionRequest> request = null;
        Response<StopQueryExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopQueryExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopQueryExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopQueryExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopQueryExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopQueryExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to an Athena resource. A tag is a label that you assign to a resource. In Athena, a
     * resource can be a workgroup or data catalog. Each tag consists of a key and an optional value, both of which you
     * define. For example, you can use tags to categorize Athena workgroups or data catalogs by purpose, owner, or
     * environment. Use a consistent set of tag keys to make it easier to search and filter workgroups or data catalogs
     * in your account. For best practices, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">Tagging Best Practices</a>. Tag
     * keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters.
     * Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys
     * and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate
     * them by commas.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
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
     * Removes one or more tags from a data catalog or workgroup resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
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
     * Updates the data catalog that has the specified name.
     * </p>
     * 
     * @param updateDataCatalogRequest
     * @return Result of the UpdateDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.UpdateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDataCatalogResult updateDataCatalog(UpdateDataCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataCatalog(request);
    }

    @SdkInternalApi
    final UpdateDataCatalogResult executeUpdateDataCatalog(UpdateDataCatalogRequest updateDataCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataCatalogRequest> request = null;
        Response<UpdateDataCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a prepared statement.
     * </p>
     * 
     * @param updatePreparedStatementRequest
     * @return Result of the UpdatePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.UpdatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePreparedStatementResult updatePreparedStatement(UpdatePreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePreparedStatement(request);
    }

    @SdkInternalApi
    final UpdatePreparedStatementResult executeUpdatePreparedStatement(UpdatePreparedStatementRequest updatePreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePreparedStatementRequest> request = null;
        Response<UpdatePreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
     * </p>
     * 
     * @param updateWorkGroupRequest
     * @return Result of the UpdateWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.UpdateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkGroupResult updateWorkGroup(UpdateWorkGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkGroup(request);
    }

    @SdkInternalApi
    final UpdateWorkGroupResult executeUpdateWorkGroup(UpdateWorkGroupRequest updateWorkGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkGroupRequest> request = null;
        Response<UpdateWorkGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkGroupResultJsonUnmarshaller());
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
