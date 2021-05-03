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
package com.amazonaws.services.personalizeruntime;

import javax.annotation.Generated;

import com.amazonaws.services.personalizeruntime.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Personalize Runtime asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPersonalizeRuntimeAsyncClient extends AmazonPersonalizeRuntimeClient implements AmazonPersonalizeRuntimeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonPersonalizeRuntimeAsyncClientBuilder asyncBuilder() {
        return AmazonPersonalizeRuntimeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Personalize Runtime using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPersonalizeRuntimeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Personalize Runtime using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonPersonalizeRuntimeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<GetPersonalizedRankingResult> getPersonalizedRankingAsync(GetPersonalizedRankingRequest request) {

        return getPersonalizedRankingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPersonalizedRankingResult> getPersonalizedRankingAsync(final GetPersonalizedRankingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPersonalizedRankingRequest, GetPersonalizedRankingResult> asyncHandler) {
        final GetPersonalizedRankingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPersonalizedRankingResult>() {
            @Override
            public GetPersonalizedRankingResult call() throws Exception {
                GetPersonalizedRankingResult result = null;

                try {
                    result = executeGetPersonalizedRanking(finalRequest);
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
    public java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest request) {

        return getRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(final GetRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecommendationsRequest, GetRecommendationsResult> asyncHandler) {
        final GetRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecommendationsResult>() {
            @Override
            public GetRecommendationsResult call() throws Exception {
                GetRecommendationsResult result = null;

                try {
                    result = executeGetRecommendations(finalRequest);
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
