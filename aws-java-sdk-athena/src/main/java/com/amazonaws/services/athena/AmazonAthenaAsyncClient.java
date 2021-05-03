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

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Athena asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public class AmazonAthenaAsyncClient extends AmazonAthenaClient implements AmazonAthenaAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonAthenaAsyncClientBuilder asyncBuilder() {
        return AmazonAthenaAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Athena using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonAthenaAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Athena using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonAthenaAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<BatchGetNamedQueryResult> batchGetNamedQueryAsync(BatchGetNamedQueryRequest request) {

        return batchGetNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetNamedQueryResult> batchGetNamedQueryAsync(final BatchGetNamedQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetNamedQueryRequest, BatchGetNamedQueryResult> asyncHandler) {
        final BatchGetNamedQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetNamedQueryResult>() {
            @Override
            public BatchGetNamedQueryResult call() throws Exception {
                BatchGetNamedQueryResult result = null;

                try {
                    result = executeBatchGetNamedQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetQueryExecutionResult> batchGetQueryExecutionAsync(BatchGetQueryExecutionRequest request) {

        return batchGetQueryExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetQueryExecutionResult> batchGetQueryExecutionAsync(final BatchGetQueryExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetQueryExecutionRequest, BatchGetQueryExecutionResult> asyncHandler) {
        final BatchGetQueryExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetQueryExecutionResult>() {
            @Override
            public BatchGetQueryExecutionResult call() throws Exception {
                BatchGetQueryExecutionResult result = null;

                try {
                    result = executeBatchGetQueryExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataCatalogResult> createDataCatalogAsync(CreateDataCatalogRequest request) {

        return createDataCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataCatalogResult> createDataCatalogAsync(final CreateDataCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataCatalogRequest, CreateDataCatalogResult> asyncHandler) {
        final CreateDataCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataCatalogResult>() {
            @Override
            public CreateDataCatalogResult call() throws Exception {
                CreateDataCatalogResult result = null;

                try {
                    result = executeCreateDataCatalog(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNamedQueryResult> createNamedQueryAsync(CreateNamedQueryRequest request) {

        return createNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNamedQueryResult> createNamedQueryAsync(final CreateNamedQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNamedQueryRequest, CreateNamedQueryResult> asyncHandler) {
        final CreateNamedQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNamedQueryResult>() {
            @Override
            public CreateNamedQueryResult call() throws Exception {
                CreateNamedQueryResult result = null;

                try {
                    result = executeCreateNamedQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePreparedStatementResult> createPreparedStatementAsync(CreatePreparedStatementRequest request) {

        return createPreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePreparedStatementResult> createPreparedStatementAsync(final CreatePreparedStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePreparedStatementRequest, CreatePreparedStatementResult> asyncHandler) {
        final CreatePreparedStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePreparedStatementResult>() {
            @Override
            public CreatePreparedStatementResult call() throws Exception {
                CreatePreparedStatementResult result = null;

                try {
                    result = executeCreatePreparedStatement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWorkGroupResult> createWorkGroupAsync(CreateWorkGroupRequest request) {

        return createWorkGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkGroupResult> createWorkGroupAsync(final CreateWorkGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkGroupRequest, CreateWorkGroupResult> asyncHandler) {
        final CreateWorkGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkGroupResult>() {
            @Override
            public CreateWorkGroupResult call() throws Exception {
                CreateWorkGroupResult result = null;

                try {
                    result = executeCreateWorkGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataCatalogResult> deleteDataCatalogAsync(DeleteDataCatalogRequest request) {

        return deleteDataCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataCatalogResult> deleteDataCatalogAsync(final DeleteDataCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataCatalogRequest, DeleteDataCatalogResult> asyncHandler) {
        final DeleteDataCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataCatalogResult>() {
            @Override
            public DeleteDataCatalogResult call() throws Exception {
                DeleteDataCatalogResult result = null;

                try {
                    result = executeDeleteDataCatalog(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNamedQueryResult> deleteNamedQueryAsync(DeleteNamedQueryRequest request) {

        return deleteNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNamedQueryResult> deleteNamedQueryAsync(final DeleteNamedQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNamedQueryRequest, DeleteNamedQueryResult> asyncHandler) {
        final DeleteNamedQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNamedQueryResult>() {
            @Override
            public DeleteNamedQueryResult call() throws Exception {
                DeleteNamedQueryResult result = null;

                try {
                    result = executeDeleteNamedQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePreparedStatementResult> deletePreparedStatementAsync(DeletePreparedStatementRequest request) {

        return deletePreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePreparedStatementResult> deletePreparedStatementAsync(final DeletePreparedStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePreparedStatementRequest, DeletePreparedStatementResult> asyncHandler) {
        final DeletePreparedStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePreparedStatementResult>() {
            @Override
            public DeletePreparedStatementResult call() throws Exception {
                DeletePreparedStatementResult result = null;

                try {
                    result = executeDeletePreparedStatement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkGroupResult> deleteWorkGroupAsync(DeleteWorkGroupRequest request) {

        return deleteWorkGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkGroupResult> deleteWorkGroupAsync(final DeleteWorkGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkGroupRequest, DeleteWorkGroupResult> asyncHandler) {
        final DeleteWorkGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkGroupResult>() {
            @Override
            public DeleteWorkGroupResult call() throws Exception {
                DeleteWorkGroupResult result = null;

                try {
                    result = executeDeleteWorkGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataCatalogResult> getDataCatalogAsync(GetDataCatalogRequest request) {

        return getDataCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataCatalogResult> getDataCatalogAsync(final GetDataCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataCatalogRequest, GetDataCatalogResult> asyncHandler) {
        final GetDataCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataCatalogResult>() {
            @Override
            public GetDataCatalogResult call() throws Exception {
                GetDataCatalogResult result = null;

                try {
                    result = executeGetDataCatalog(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest request) {

        return getDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(final GetDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatabaseRequest, GetDatabaseResult> asyncHandler) {
        final GetDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatabaseResult>() {
            @Override
            public GetDatabaseResult call() throws Exception {
                GetDatabaseResult result = null;

                try {
                    result = executeGetDatabase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetNamedQueryResult> getNamedQueryAsync(GetNamedQueryRequest request) {

        return getNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNamedQueryResult> getNamedQueryAsync(final GetNamedQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNamedQueryRequest, GetNamedQueryResult> asyncHandler) {
        final GetNamedQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNamedQueryResult>() {
            @Override
            public GetNamedQueryResult call() throws Exception {
                GetNamedQueryResult result = null;

                try {
                    result = executeGetNamedQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPreparedStatementResult> getPreparedStatementAsync(GetPreparedStatementRequest request) {

        return getPreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPreparedStatementResult> getPreparedStatementAsync(final GetPreparedStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPreparedStatementRequest, GetPreparedStatementResult> asyncHandler) {
        final GetPreparedStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPreparedStatementResult>() {
            @Override
            public GetPreparedStatementResult call() throws Exception {
                GetPreparedStatementResult result = null;

                try {
                    result = executeGetPreparedStatement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQueryExecutionResult> getQueryExecutionAsync(GetQueryExecutionRequest request) {

        return getQueryExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryExecutionResult> getQueryExecutionAsync(final GetQueryExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryExecutionRequest, GetQueryExecutionResult> asyncHandler) {
        final GetQueryExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryExecutionResult>() {
            @Override
            public GetQueryExecutionResult call() throws Exception {
                GetQueryExecutionResult result = null;

                try {
                    result = executeGetQueryExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request) {

        return getQueryResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(final GetQueryResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler) {
        final GetQueryResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryResultsResult>() {
            @Override
            public GetQueryResultsResult call() throws Exception {
                GetQueryResultsResult result = null;

                try {
                    result = executeGetQueryResults(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTableMetadataResult> getTableMetadataAsync(GetTableMetadataRequest request) {

        return getTableMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableMetadataResult> getTableMetadataAsync(final GetTableMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTableMetadataRequest, GetTableMetadataResult> asyncHandler) {
        final GetTableMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTableMetadataResult>() {
            @Override
            public GetTableMetadataResult call() throws Exception {
                GetTableMetadataResult result = null;

                try {
                    result = executeGetTableMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetWorkGroupResult> getWorkGroupAsync(GetWorkGroupRequest request) {

        return getWorkGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkGroupResult> getWorkGroupAsync(final GetWorkGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkGroupRequest, GetWorkGroupResult> asyncHandler) {
        final GetWorkGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkGroupResult>() {
            @Override
            public GetWorkGroupResult call() throws Exception {
                GetWorkGroupResult result = null;

                try {
                    result = executeGetWorkGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataCatalogsResult> listDataCatalogsAsync(ListDataCatalogsRequest request) {

        return listDataCatalogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataCatalogsResult> listDataCatalogsAsync(final ListDataCatalogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataCatalogsRequest, ListDataCatalogsResult> asyncHandler) {
        final ListDataCatalogsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataCatalogsResult>() {
            @Override
            public ListDataCatalogsResult call() throws Exception {
                ListDataCatalogsResult result = null;

                try {
                    result = executeListDataCatalogs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request) {

        return listDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(final ListDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler) {
        final ListDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatabasesResult>() {
            @Override
            public ListDatabasesResult call() throws Exception {
                ListDatabasesResult result = null;

                try {
                    result = executeListDatabases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(ListEngineVersionsRequest request) {

        return listEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(final ListEngineVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEngineVersionsRequest, ListEngineVersionsResult> asyncHandler) {
        final ListEngineVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEngineVersionsResult>() {
            @Override
            public ListEngineVersionsResult call() throws Exception {
                ListEngineVersionsResult result = null;

                try {
                    result = executeListEngineVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNamedQueriesResult> listNamedQueriesAsync(ListNamedQueriesRequest request) {

        return listNamedQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNamedQueriesResult> listNamedQueriesAsync(final ListNamedQueriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNamedQueriesRequest, ListNamedQueriesResult> asyncHandler) {
        final ListNamedQueriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNamedQueriesResult>() {
            @Override
            public ListNamedQueriesResult call() throws Exception {
                ListNamedQueriesResult result = null;

                try {
                    result = executeListNamedQueries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPreparedStatementsResult> listPreparedStatementsAsync(ListPreparedStatementsRequest request) {

        return listPreparedStatementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPreparedStatementsResult> listPreparedStatementsAsync(final ListPreparedStatementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPreparedStatementsRequest, ListPreparedStatementsResult> asyncHandler) {
        final ListPreparedStatementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPreparedStatementsResult>() {
            @Override
            public ListPreparedStatementsResult call() throws Exception {
                ListPreparedStatementsResult result = null;

                try {
                    result = executeListPreparedStatements(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQueryExecutionsResult> listQueryExecutionsAsync(ListQueryExecutionsRequest request) {

        return listQueryExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueryExecutionsResult> listQueryExecutionsAsync(final ListQueryExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueryExecutionsRequest, ListQueryExecutionsResult> asyncHandler) {
        final ListQueryExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueryExecutionsResult>() {
            @Override
            public ListQueryExecutionsResult call() throws Exception {
                ListQueryExecutionsResult result = null;

                try {
                    result = executeListQueryExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTableMetadataResult> listTableMetadataAsync(ListTableMetadataRequest request) {

        return listTableMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTableMetadataResult> listTableMetadataAsync(final ListTableMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTableMetadataRequest, ListTableMetadataResult> asyncHandler) {
        final ListTableMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTableMetadataResult>() {
            @Override
            public ListTableMetadataResult call() throws Exception {
                ListTableMetadataResult result = null;

                try {
                    result = executeListTableMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkGroupsResult> listWorkGroupsAsync(ListWorkGroupsRequest request) {

        return listWorkGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkGroupsResult> listWorkGroupsAsync(final ListWorkGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkGroupsRequest, ListWorkGroupsResult> asyncHandler) {
        final ListWorkGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkGroupsResult>() {
            @Override
            public ListWorkGroupsResult call() throws Exception {
                ListWorkGroupsResult result = null;

                try {
                    result = executeListWorkGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartQueryExecutionResult> startQueryExecutionAsync(StartQueryExecutionRequest request) {

        return startQueryExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryExecutionResult> startQueryExecutionAsync(final StartQueryExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartQueryExecutionRequest, StartQueryExecutionResult> asyncHandler) {
        final StartQueryExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartQueryExecutionResult>() {
            @Override
            public StartQueryExecutionResult call() throws Exception {
                StartQueryExecutionResult result = null;

                try {
                    result = executeStartQueryExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopQueryExecutionResult> stopQueryExecutionAsync(StopQueryExecutionRequest request) {

        return stopQueryExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopQueryExecutionResult> stopQueryExecutionAsync(final StopQueryExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopQueryExecutionRequest, StopQueryExecutionResult> asyncHandler) {
        final StopQueryExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopQueryExecutionResult>() {
            @Override
            public StopQueryExecutionResult call() throws Exception {
                StopQueryExecutionResult result = null;

                try {
                    result = executeStopQueryExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDataCatalogResult> updateDataCatalogAsync(UpdateDataCatalogRequest request) {

        return updateDataCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataCatalogResult> updateDataCatalogAsync(final UpdateDataCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataCatalogRequest, UpdateDataCatalogResult> asyncHandler) {
        final UpdateDataCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataCatalogResult>() {
            @Override
            public UpdateDataCatalogResult call() throws Exception {
                UpdateDataCatalogResult result = null;

                try {
                    result = executeUpdateDataCatalog(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePreparedStatementResult> updatePreparedStatementAsync(UpdatePreparedStatementRequest request) {

        return updatePreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePreparedStatementResult> updatePreparedStatementAsync(final UpdatePreparedStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePreparedStatementRequest, UpdatePreparedStatementResult> asyncHandler) {
        final UpdatePreparedStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePreparedStatementResult>() {
            @Override
            public UpdatePreparedStatementResult call() throws Exception {
                UpdatePreparedStatementResult result = null;

                try {
                    result = executeUpdatePreparedStatement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkGroupResult> updateWorkGroupAsync(UpdateWorkGroupRequest request) {

        return updateWorkGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkGroupResult> updateWorkGroupAsync(final UpdateWorkGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkGroupRequest, UpdateWorkGroupResult> asyncHandler) {
        final UpdateWorkGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkGroupResult>() {
            @Override
            public UpdateWorkGroupResult call() throws Exception {
                UpdateWorkGroupResult result = null;

                try {
                    result = executeUpdateWorkGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
