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
package com.amazonaws.services.comprehendmedical;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ComprehendMedical asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain
 * insight in your documents.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSComprehendMedicalAsyncClient extends AWSComprehendMedicalClient implements AWSComprehendMedicalAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSComprehendMedicalAsyncClientBuilder asyncBuilder() {
        return AWSComprehendMedicalAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ComprehendMedical using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSComprehendMedicalAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ComprehendMedical using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSComprehendMedicalAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DescribeEntitiesDetectionV2JobResult> describeEntitiesDetectionV2JobAsync(DescribeEntitiesDetectionV2JobRequest request) {

        return describeEntitiesDetectionV2JobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntitiesDetectionV2JobResult> describeEntitiesDetectionV2JobAsync(
            final DescribeEntitiesDetectionV2JobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEntitiesDetectionV2JobRequest, DescribeEntitiesDetectionV2JobResult> asyncHandler) {
        final DescribeEntitiesDetectionV2JobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEntitiesDetectionV2JobResult>() {
            @Override
            public DescribeEntitiesDetectionV2JobResult call() throws Exception {
                DescribeEntitiesDetectionV2JobResult result = null;

                try {
                    result = executeDescribeEntitiesDetectionV2Job(finalRequest);
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
    public java.util.concurrent.Future<DescribeICD10CMInferenceJobResult> describeICD10CMInferenceJobAsync(DescribeICD10CMInferenceJobRequest request) {

        return describeICD10CMInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeICD10CMInferenceJobResult> describeICD10CMInferenceJobAsync(final DescribeICD10CMInferenceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeICD10CMInferenceJobRequest, DescribeICD10CMInferenceJobResult> asyncHandler) {
        final DescribeICD10CMInferenceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeICD10CMInferenceJobResult>() {
            @Override
            public DescribeICD10CMInferenceJobResult call() throws Exception {
                DescribeICD10CMInferenceJobResult result = null;

                try {
                    result = executeDescribeICD10CMInferenceJob(finalRequest);
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
    public java.util.concurrent.Future<DescribePHIDetectionJobResult> describePHIDetectionJobAsync(DescribePHIDetectionJobRequest request) {

        return describePHIDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePHIDetectionJobResult> describePHIDetectionJobAsync(final DescribePHIDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePHIDetectionJobRequest, DescribePHIDetectionJobResult> asyncHandler) {
        final DescribePHIDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePHIDetectionJobResult>() {
            @Override
            public DescribePHIDetectionJobResult call() throws Exception {
                DescribePHIDetectionJobResult result = null;

                try {
                    result = executeDescribePHIDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeRxNormInferenceJobResult> describeRxNormInferenceJobAsync(DescribeRxNormInferenceJobRequest request) {

        return describeRxNormInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRxNormInferenceJobResult> describeRxNormInferenceJobAsync(final DescribeRxNormInferenceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRxNormInferenceJobRequest, DescribeRxNormInferenceJobResult> asyncHandler) {
        final DescribeRxNormInferenceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRxNormInferenceJobResult>() {
            @Override
            public DescribeRxNormInferenceJobResult call() throws Exception {
                DescribeRxNormInferenceJobResult result = null;

                try {
                    result = executeDescribeRxNormInferenceJob(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest request) {

        return detectEntitiesAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(final DetectEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler) {
        final DetectEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectEntitiesResult>() {
            @Override
            public DetectEntitiesResult call() throws Exception {
                DetectEntitiesResult result = null;

                try {
                    result = executeDetectEntities(finalRequest);
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
    public java.util.concurrent.Future<DetectEntitiesV2Result> detectEntitiesV2Async(DetectEntitiesV2Request request) {

        return detectEntitiesV2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectEntitiesV2Result> detectEntitiesV2Async(final DetectEntitiesV2Request request,
            final com.amazonaws.handlers.AsyncHandler<DetectEntitiesV2Request, DetectEntitiesV2Result> asyncHandler) {
        final DetectEntitiesV2Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectEntitiesV2Result>() {
            @Override
            public DetectEntitiesV2Result call() throws Exception {
                DetectEntitiesV2Result result = null;

                try {
                    result = executeDetectEntitiesV2(finalRequest);
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
    public java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(DetectPHIRequest request) {

        return detectPHIAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(final DetectPHIRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectPHIRequest, DetectPHIResult> asyncHandler) {
        final DetectPHIRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectPHIResult>() {
            @Override
            public DetectPHIResult call() throws Exception {
                DetectPHIResult result = null;

                try {
                    result = executeDetectPHI(finalRequest);
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
    public java.util.concurrent.Future<InferICD10CMResult> inferICD10CMAsync(InferICD10CMRequest request) {

        return inferICD10CMAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InferICD10CMResult> inferICD10CMAsync(final InferICD10CMRequest request,
            final com.amazonaws.handlers.AsyncHandler<InferICD10CMRequest, InferICD10CMResult> asyncHandler) {
        final InferICD10CMRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InferICD10CMResult>() {
            @Override
            public InferICD10CMResult call() throws Exception {
                InferICD10CMResult result = null;

                try {
                    result = executeInferICD10CM(finalRequest);
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
    public java.util.concurrent.Future<InferRxNormResult> inferRxNormAsync(InferRxNormRequest request) {

        return inferRxNormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InferRxNormResult> inferRxNormAsync(final InferRxNormRequest request,
            final com.amazonaws.handlers.AsyncHandler<InferRxNormRequest, InferRxNormResult> asyncHandler) {
        final InferRxNormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InferRxNormResult>() {
            @Override
            public InferRxNormResult call() throws Exception {
                InferRxNormResult result = null;

                try {
                    result = executeInferRxNorm(finalRequest);
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
    public java.util.concurrent.Future<ListEntitiesDetectionV2JobsResult> listEntitiesDetectionV2JobsAsync(ListEntitiesDetectionV2JobsRequest request) {

        return listEntitiesDetectionV2JobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesDetectionV2JobsResult> listEntitiesDetectionV2JobsAsync(final ListEntitiesDetectionV2JobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEntitiesDetectionV2JobsRequest, ListEntitiesDetectionV2JobsResult> asyncHandler) {
        final ListEntitiesDetectionV2JobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEntitiesDetectionV2JobsResult>() {
            @Override
            public ListEntitiesDetectionV2JobsResult call() throws Exception {
                ListEntitiesDetectionV2JobsResult result = null;

                try {
                    result = executeListEntitiesDetectionV2Jobs(finalRequest);
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
    public java.util.concurrent.Future<ListICD10CMInferenceJobsResult> listICD10CMInferenceJobsAsync(ListICD10CMInferenceJobsRequest request) {

        return listICD10CMInferenceJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListICD10CMInferenceJobsResult> listICD10CMInferenceJobsAsync(final ListICD10CMInferenceJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListICD10CMInferenceJobsRequest, ListICD10CMInferenceJobsResult> asyncHandler) {
        final ListICD10CMInferenceJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListICD10CMInferenceJobsResult>() {
            @Override
            public ListICD10CMInferenceJobsResult call() throws Exception {
                ListICD10CMInferenceJobsResult result = null;

                try {
                    result = executeListICD10CMInferenceJobs(finalRequest);
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
    public java.util.concurrent.Future<ListPHIDetectionJobsResult> listPHIDetectionJobsAsync(ListPHIDetectionJobsRequest request) {

        return listPHIDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPHIDetectionJobsResult> listPHIDetectionJobsAsync(final ListPHIDetectionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPHIDetectionJobsRequest, ListPHIDetectionJobsResult> asyncHandler) {
        final ListPHIDetectionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPHIDetectionJobsResult>() {
            @Override
            public ListPHIDetectionJobsResult call() throws Exception {
                ListPHIDetectionJobsResult result = null;

                try {
                    result = executeListPHIDetectionJobs(finalRequest);
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
    public java.util.concurrent.Future<ListRxNormInferenceJobsResult> listRxNormInferenceJobsAsync(ListRxNormInferenceJobsRequest request) {

        return listRxNormInferenceJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRxNormInferenceJobsResult> listRxNormInferenceJobsAsync(final ListRxNormInferenceJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRxNormInferenceJobsRequest, ListRxNormInferenceJobsResult> asyncHandler) {
        final ListRxNormInferenceJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRxNormInferenceJobsResult>() {
            @Override
            public ListRxNormInferenceJobsResult call() throws Exception {
                ListRxNormInferenceJobsResult result = null;

                try {
                    result = executeListRxNormInferenceJobs(finalRequest);
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
    public java.util.concurrent.Future<StartEntitiesDetectionV2JobResult> startEntitiesDetectionV2JobAsync(StartEntitiesDetectionV2JobRequest request) {

        return startEntitiesDetectionV2JobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartEntitiesDetectionV2JobResult> startEntitiesDetectionV2JobAsync(final StartEntitiesDetectionV2JobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartEntitiesDetectionV2JobRequest, StartEntitiesDetectionV2JobResult> asyncHandler) {
        final StartEntitiesDetectionV2JobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartEntitiesDetectionV2JobResult>() {
            @Override
            public StartEntitiesDetectionV2JobResult call() throws Exception {
                StartEntitiesDetectionV2JobResult result = null;

                try {
                    result = executeStartEntitiesDetectionV2Job(finalRequest);
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
    public java.util.concurrent.Future<StartICD10CMInferenceJobResult> startICD10CMInferenceJobAsync(StartICD10CMInferenceJobRequest request) {

        return startICD10CMInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartICD10CMInferenceJobResult> startICD10CMInferenceJobAsync(final StartICD10CMInferenceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartICD10CMInferenceJobRequest, StartICD10CMInferenceJobResult> asyncHandler) {
        final StartICD10CMInferenceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartICD10CMInferenceJobResult>() {
            @Override
            public StartICD10CMInferenceJobResult call() throws Exception {
                StartICD10CMInferenceJobResult result = null;

                try {
                    result = executeStartICD10CMInferenceJob(finalRequest);
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
    public java.util.concurrent.Future<StartPHIDetectionJobResult> startPHIDetectionJobAsync(StartPHIDetectionJobRequest request) {

        return startPHIDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPHIDetectionJobResult> startPHIDetectionJobAsync(final StartPHIDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartPHIDetectionJobRequest, StartPHIDetectionJobResult> asyncHandler) {
        final StartPHIDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartPHIDetectionJobResult>() {
            @Override
            public StartPHIDetectionJobResult call() throws Exception {
                StartPHIDetectionJobResult result = null;

                try {
                    result = executeStartPHIDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StartRxNormInferenceJobResult> startRxNormInferenceJobAsync(StartRxNormInferenceJobRequest request) {

        return startRxNormInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRxNormInferenceJobResult> startRxNormInferenceJobAsync(final StartRxNormInferenceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRxNormInferenceJobRequest, StartRxNormInferenceJobResult> asyncHandler) {
        final StartRxNormInferenceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRxNormInferenceJobResult>() {
            @Override
            public StartRxNormInferenceJobResult call() throws Exception {
                StartRxNormInferenceJobResult result = null;

                try {
                    result = executeStartRxNormInferenceJob(finalRequest);
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
    public java.util.concurrent.Future<StopEntitiesDetectionV2JobResult> stopEntitiesDetectionV2JobAsync(StopEntitiesDetectionV2JobRequest request) {

        return stopEntitiesDetectionV2JobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopEntitiesDetectionV2JobResult> stopEntitiesDetectionV2JobAsync(final StopEntitiesDetectionV2JobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopEntitiesDetectionV2JobRequest, StopEntitiesDetectionV2JobResult> asyncHandler) {
        final StopEntitiesDetectionV2JobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopEntitiesDetectionV2JobResult>() {
            @Override
            public StopEntitiesDetectionV2JobResult call() throws Exception {
                StopEntitiesDetectionV2JobResult result = null;

                try {
                    result = executeStopEntitiesDetectionV2Job(finalRequest);
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
    public java.util.concurrent.Future<StopICD10CMInferenceJobResult> stopICD10CMInferenceJobAsync(StopICD10CMInferenceJobRequest request) {

        return stopICD10CMInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopICD10CMInferenceJobResult> stopICD10CMInferenceJobAsync(final StopICD10CMInferenceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopICD10CMInferenceJobRequest, StopICD10CMInferenceJobResult> asyncHandler) {
        final StopICD10CMInferenceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopICD10CMInferenceJobResult>() {
            @Override
            public StopICD10CMInferenceJobResult call() throws Exception {
                StopICD10CMInferenceJobResult result = null;

                try {
                    result = executeStopICD10CMInferenceJob(finalRequest);
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
    public java.util.concurrent.Future<StopPHIDetectionJobResult> stopPHIDetectionJobAsync(StopPHIDetectionJobRequest request) {

        return stopPHIDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopPHIDetectionJobResult> stopPHIDetectionJobAsync(final StopPHIDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopPHIDetectionJobRequest, StopPHIDetectionJobResult> asyncHandler) {
        final StopPHIDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopPHIDetectionJobResult>() {
            @Override
            public StopPHIDetectionJobResult call() throws Exception {
                StopPHIDetectionJobResult result = null;

                try {
                    result = executeStopPHIDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StopRxNormInferenceJobResult> stopRxNormInferenceJobAsync(StopRxNormInferenceJobRequest request) {

        return stopRxNormInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRxNormInferenceJobResult> stopRxNormInferenceJobAsync(final StopRxNormInferenceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopRxNormInferenceJobRequest, StopRxNormInferenceJobResult> asyncHandler) {
        final StopRxNormInferenceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopRxNormInferenceJobResult>() {
            @Override
            public StopRxNormInferenceJobResult call() throws Exception {
                StopRxNormInferenceJobResult result = null;

                try {
                    result = executeStopRxNormInferenceJob(finalRequest);
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
