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

import javax.annotation.Generated;

import com.amazonaws.services.workmailmessageflow.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon WorkMail Message Flow asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The WorkMail Message Flow API provides access to email messages as they are being sent and received by a WorkMail
 * organization.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkMailMessageFlowAsyncClient extends AmazonWorkMailMessageFlowClient implements AmazonWorkMailMessageFlowAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonWorkMailMessageFlowAsyncClientBuilder asyncBuilder() {
        return AmazonWorkMailMessageFlowAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkMail Message Flow using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonWorkMailMessageFlowAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkMail Message Flow using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonWorkMailMessageFlowAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<GetRawMessageContentResult> getRawMessageContentAsync(GetRawMessageContentRequest request) {

        return getRawMessageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRawMessageContentResult> getRawMessageContentAsync(final GetRawMessageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRawMessageContentRequest, GetRawMessageContentResult> asyncHandler) {
        final GetRawMessageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRawMessageContentResult>() {
            @Override
            public GetRawMessageContentResult call() throws Exception {
                GetRawMessageContentResult result = null;

                try {
                    result = executeGetRawMessageContent(finalRequest);
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
    public java.util.concurrent.Future<PutRawMessageContentResult> putRawMessageContentAsync(PutRawMessageContentRequest request) {

        return putRawMessageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRawMessageContentResult> putRawMessageContentAsync(final PutRawMessageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRawMessageContentRequest, PutRawMessageContentResult> asyncHandler) {
        final PutRawMessageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRawMessageContentResult>() {
            @Override
            public PutRawMessageContentResult call() throws Exception {
                PutRawMessageContentResult result = null;

                try {
                    result = executePutRawMessageContent(finalRequest);
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
