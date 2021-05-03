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
package com.amazonaws.services.lexruntime;

import javax.annotation.Generated;

import com.amazonaws.services.lexruntime.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Lex Runtime Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Lex provides both build and runtime endpoints. Each endpoint provides a set of operations (API). Your
 * conversational bot uses the runtime API to understand user utterances (user input text or voice). For example,
 * suppose a user says "I want pizza", your bot sends this input to Amazon Lex using the runtime API. Amazon Lex
 * recognizes that the user request is for the OrderPizza intent (one of the intents defined in the bot). Then Amazon
 * Lex engages in user conversation on behalf of the bot to elicit required information (slot values, such as pizza size
 * and crust type), and then performs fulfillment activity (that you configured when you created the bot). You use the
 * build-time API to create and manage your Amazon Lex bot. For a list of build-time operations, see the build-time API,
 * .
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexRuntimeAsyncClient extends AmazonLexRuntimeClient implements AmazonLexRuntimeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonLexRuntimeAsyncClientBuilder asyncBuilder() {
        return AmazonLexRuntimeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lex Runtime Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonLexRuntimeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lex Runtime Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonLexRuntimeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteSessionResult> deleteSessionAsync(DeleteSessionRequest request) {

        return deleteSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSessionResult> deleteSessionAsync(final DeleteSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSessionRequest, DeleteSessionResult> asyncHandler) {
        final DeleteSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSessionResult>() {
            @Override
            public DeleteSessionResult call() throws Exception {
                DeleteSessionResult result = null;

                try {
                    result = executeDeleteSession(finalRequest);
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
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest request) {

        return getSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(final GetSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler) {
        final GetSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSessionResult>() {
            @Override
            public GetSessionResult call() throws Exception {
                GetSessionResult result = null;

                try {
                    result = executeGetSession(finalRequest);
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
    public java.util.concurrent.Future<PostContentResult> postContentAsync(PostContentRequest request) {

        return postContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostContentResult> postContentAsync(final PostContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<PostContentRequest, PostContentResult> asyncHandler) {
        final PostContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PostContentResult>() {
            @Override
            public PostContentResult call() throws Exception {
                PostContentResult result = null;

                try {
                    result = executePostContent(finalRequest);
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
    public java.util.concurrent.Future<PostTextResult> postTextAsync(PostTextRequest request) {

        return postTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostTextResult> postTextAsync(final PostTextRequest request,
            final com.amazonaws.handlers.AsyncHandler<PostTextRequest, PostTextResult> asyncHandler) {
        final PostTextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PostTextResult>() {
            @Override
            public PostTextResult call() throws Exception {
                PostTextResult result = null;

                try {
                    result = executePostText(finalRequest);
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
    public java.util.concurrent.Future<PutSessionResult> putSessionAsync(PutSessionRequest request) {

        return putSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSessionResult> putSessionAsync(final PutSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSessionRequest, PutSessionResult> asyncHandler) {
        final PutSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSessionResult>() {
            @Override
            public PutSessionResult call() throws Exception {
                PutSessionResult result = null;

                try {
                    result = executePutSession(finalRequest);
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
