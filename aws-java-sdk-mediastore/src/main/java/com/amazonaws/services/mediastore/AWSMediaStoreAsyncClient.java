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
package com.amazonaws.services.mediastore;

import javax.annotation.Generated;

import com.amazonaws.services.mediastore.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MediaStore asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * An AWS Elemental MediaStore container is a namespace that holds folders and objects. You use a container endpoint to
 * create, read, and delete objects.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaStoreAsyncClient extends AWSMediaStoreClient implements AWSMediaStoreAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaStoreAsyncClientBuilder asyncBuilder() {
        return AWSMediaStoreAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaStore using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaStoreAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaStore using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMediaStoreAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateContainerResult> createContainerAsync(CreateContainerRequest request) {

        return createContainerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContainerResult> createContainerAsync(final CreateContainerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContainerRequest, CreateContainerResult> asyncHandler) {
        final CreateContainerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContainerResult>() {
            @Override
            public CreateContainerResult call() throws Exception {
                CreateContainerResult result = null;

                try {
                    result = executeCreateContainer(finalRequest);
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
    public java.util.concurrent.Future<DeleteContainerResult> deleteContainerAsync(DeleteContainerRequest request) {

        return deleteContainerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContainerResult> deleteContainerAsync(final DeleteContainerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContainerRequest, DeleteContainerResult> asyncHandler) {
        final DeleteContainerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContainerResult>() {
            @Override
            public DeleteContainerResult call() throws Exception {
                DeleteContainerResult result = null;

                try {
                    result = executeDeleteContainer(finalRequest);
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
    public java.util.concurrent.Future<DeleteContainerPolicyResult> deleteContainerPolicyAsync(DeleteContainerPolicyRequest request) {

        return deleteContainerPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContainerPolicyResult> deleteContainerPolicyAsync(final DeleteContainerPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContainerPolicyRequest, DeleteContainerPolicyResult> asyncHandler) {
        final DeleteContainerPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContainerPolicyResult>() {
            @Override
            public DeleteContainerPolicyResult call() throws Exception {
                DeleteContainerPolicyResult result = null;

                try {
                    result = executeDeleteContainerPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteCorsPolicyResult> deleteCorsPolicyAsync(DeleteCorsPolicyRequest request) {

        return deleteCorsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCorsPolicyResult> deleteCorsPolicyAsync(final DeleteCorsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCorsPolicyRequest, DeleteCorsPolicyResult> asyncHandler) {
        final DeleteCorsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCorsPolicyResult>() {
            @Override
            public DeleteCorsPolicyResult call() throws Exception {
                DeleteCorsPolicyResult result = null;

                try {
                    result = executeDeleteCorsPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest request) {

        return deleteLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(final DeleteLifecyclePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLifecyclePolicyRequest, DeleteLifecyclePolicyResult> asyncHandler) {
        final DeleteLifecyclePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLifecyclePolicyResult>() {
            @Override
            public DeleteLifecyclePolicyResult call() throws Exception {
                DeleteLifecyclePolicyResult result = null;

                try {
                    result = executeDeleteLifecyclePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteMetricPolicyResult> deleteMetricPolicyAsync(DeleteMetricPolicyRequest request) {

        return deleteMetricPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMetricPolicyResult> deleteMetricPolicyAsync(final DeleteMetricPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMetricPolicyRequest, DeleteMetricPolicyResult> asyncHandler) {
        final DeleteMetricPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMetricPolicyResult>() {
            @Override
            public DeleteMetricPolicyResult call() throws Exception {
                DeleteMetricPolicyResult result = null;

                try {
                    result = executeDeleteMetricPolicy(finalRequest);
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
    public java.util.concurrent.Future<DescribeContainerResult> describeContainerAsync(DescribeContainerRequest request) {

        return describeContainerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContainerResult> describeContainerAsync(final DescribeContainerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContainerRequest, DescribeContainerResult> asyncHandler) {
        final DescribeContainerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContainerResult>() {
            @Override
            public DescribeContainerResult call() throws Exception {
                DescribeContainerResult result = null;

                try {
                    result = executeDescribeContainer(finalRequest);
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
    public java.util.concurrent.Future<GetContainerPolicyResult> getContainerPolicyAsync(GetContainerPolicyRequest request) {

        return getContainerPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContainerPolicyResult> getContainerPolicyAsync(final GetContainerPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContainerPolicyRequest, GetContainerPolicyResult> asyncHandler) {
        final GetContainerPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContainerPolicyResult>() {
            @Override
            public GetContainerPolicyResult call() throws Exception {
                GetContainerPolicyResult result = null;

                try {
                    result = executeGetContainerPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetCorsPolicyResult> getCorsPolicyAsync(GetCorsPolicyRequest request) {

        return getCorsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCorsPolicyResult> getCorsPolicyAsync(final GetCorsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCorsPolicyRequest, GetCorsPolicyResult> asyncHandler) {
        final GetCorsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCorsPolicyResult>() {
            @Override
            public GetCorsPolicyResult call() throws Exception {
                GetCorsPolicyResult result = null;

                try {
                    result = executeGetCorsPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest request) {

        return getLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(final GetLifecyclePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLifecyclePolicyRequest, GetLifecyclePolicyResult> asyncHandler) {
        final GetLifecyclePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLifecyclePolicyResult>() {
            @Override
            public GetLifecyclePolicyResult call() throws Exception {
                GetLifecyclePolicyResult result = null;

                try {
                    result = executeGetLifecyclePolicy(finalRequest);
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
    public java.util.concurrent.Future<GetMetricPolicyResult> getMetricPolicyAsync(GetMetricPolicyRequest request) {

        return getMetricPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricPolicyResult> getMetricPolicyAsync(final GetMetricPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMetricPolicyRequest, GetMetricPolicyResult> asyncHandler) {
        final GetMetricPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMetricPolicyResult>() {
            @Override
            public GetMetricPolicyResult call() throws Exception {
                GetMetricPolicyResult result = null;

                try {
                    result = executeGetMetricPolicy(finalRequest);
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
    public java.util.concurrent.Future<ListContainersResult> listContainersAsync(ListContainersRequest request) {

        return listContainersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContainersResult> listContainersAsync(final ListContainersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContainersRequest, ListContainersResult> asyncHandler) {
        final ListContainersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContainersResult>() {
            @Override
            public ListContainersResult call() throws Exception {
                ListContainersResult result = null;

                try {
                    result = executeListContainers(finalRequest);
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
    public java.util.concurrent.Future<PutContainerPolicyResult> putContainerPolicyAsync(PutContainerPolicyRequest request) {

        return putContainerPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutContainerPolicyResult> putContainerPolicyAsync(final PutContainerPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutContainerPolicyRequest, PutContainerPolicyResult> asyncHandler) {
        final PutContainerPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutContainerPolicyResult>() {
            @Override
            public PutContainerPolicyResult call() throws Exception {
                PutContainerPolicyResult result = null;

                try {
                    result = executePutContainerPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutCorsPolicyResult> putCorsPolicyAsync(PutCorsPolicyRequest request) {

        return putCorsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutCorsPolicyResult> putCorsPolicyAsync(final PutCorsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutCorsPolicyRequest, PutCorsPolicyResult> asyncHandler) {
        final PutCorsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutCorsPolicyResult>() {
            @Override
            public PutCorsPolicyResult call() throws Exception {
                PutCorsPolicyResult result = null;

                try {
                    result = executePutCorsPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutLifecyclePolicyResult> putLifecyclePolicyAsync(PutLifecyclePolicyRequest request) {

        return putLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLifecyclePolicyResult> putLifecyclePolicyAsync(final PutLifecyclePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLifecyclePolicyRequest, PutLifecyclePolicyResult> asyncHandler) {
        final PutLifecyclePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLifecyclePolicyResult>() {
            @Override
            public PutLifecyclePolicyResult call() throws Exception {
                PutLifecyclePolicyResult result = null;

                try {
                    result = executePutLifecyclePolicy(finalRequest);
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
    public java.util.concurrent.Future<PutMetricPolicyResult> putMetricPolicyAsync(PutMetricPolicyRequest request) {

        return putMetricPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetricPolicyResult> putMetricPolicyAsync(final PutMetricPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMetricPolicyRequest, PutMetricPolicyResult> asyncHandler) {
        final PutMetricPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMetricPolicyResult>() {
            @Override
            public PutMetricPolicyResult call() throws Exception {
                PutMetricPolicyResult result = null;

                try {
                    result = executePutMetricPolicy(finalRequest);
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
    public java.util.concurrent.Future<StartAccessLoggingResult> startAccessLoggingAsync(StartAccessLoggingRequest request) {

        return startAccessLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAccessLoggingResult> startAccessLoggingAsync(final StartAccessLoggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAccessLoggingRequest, StartAccessLoggingResult> asyncHandler) {
        final StartAccessLoggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAccessLoggingResult>() {
            @Override
            public StartAccessLoggingResult call() throws Exception {
                StartAccessLoggingResult result = null;

                try {
                    result = executeStartAccessLogging(finalRequest);
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
    public java.util.concurrent.Future<StopAccessLoggingResult> stopAccessLoggingAsync(StopAccessLoggingRequest request) {

        return stopAccessLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAccessLoggingResult> stopAccessLoggingAsync(final StopAccessLoggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAccessLoggingRequest, StopAccessLoggingResult> asyncHandler) {
        final StopAccessLoggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopAccessLoggingResult>() {
            @Override
            public StopAccessLoggingResult call() throws Exception {
                StopAccessLoggingResult result = null;

                try {
                    result = executeStopAccessLogging(finalRequest);
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
