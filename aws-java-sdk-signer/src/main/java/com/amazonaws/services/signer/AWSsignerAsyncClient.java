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
package com.amazonaws.services.signer;

import javax.annotation.Generated;

import com.amazonaws.services.signer.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing signer asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Signer is a fully managed code signing service to help you ensure the trust and integrity of your code.
 * </p>
 * <p>
 * AWS Signer supports the following applications:
 * </p>
 * <p>
 * With <i>code signing for AWS Lambda</i>, you can sign AWS Lambda deployment packages. Integrated support is provided
 * for Amazon S3, Amazon CloudWatch, and AWS CloudTrail. In order to sign code, you create a signing profile and then
 * use Signer to sign Lambda zip files in S3.
 * </p>
 * <p>
 * With <i>code signing for IoT</i>, you can sign code for any IoT device that is supported by AWS. IoT code signing is
 * available for <a href="http://docs.aws.amazon.com/freertos/latest/userguide/">Amazon FreeRTOS</a> and <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/">AWS IoT Device Management</a>, and is integrated with <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager (ACM)</a>. In order to sign code, you
 * import a third-party code signing certificate using ACM, and use that to sign updates in Amazon FreeRTOS and AWS IoT
 * Device Management.
 * </p>
 * <p>
 * For more information about AWS Signer, see the <a
 * href="http://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">AWS Signer Developer Guide</a>.
 * </p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSsignerAsyncClient extends AWSsignerClient implements AWSsignerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSsignerAsyncClientBuilder asyncBuilder() {
        return AWSsignerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on signer using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSsignerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on signer using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSsignerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AddProfilePermissionResult> addProfilePermissionAsync(AddProfilePermissionRequest request) {

        return addProfilePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddProfilePermissionResult> addProfilePermissionAsync(final AddProfilePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddProfilePermissionRequest, AddProfilePermissionResult> asyncHandler) {
        final AddProfilePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddProfilePermissionResult>() {
            @Override
            public AddProfilePermissionResult call() throws Exception {
                AddProfilePermissionResult result = null;

                try {
                    result = executeAddProfilePermission(finalRequest);
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
    public java.util.concurrent.Future<CancelSigningProfileResult> cancelSigningProfileAsync(CancelSigningProfileRequest request) {

        return cancelSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSigningProfileResult> cancelSigningProfileAsync(final CancelSigningProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSigningProfileRequest, CancelSigningProfileResult> asyncHandler) {
        final CancelSigningProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSigningProfileResult>() {
            @Override
            public CancelSigningProfileResult call() throws Exception {
                CancelSigningProfileResult result = null;

                try {
                    result = executeCancelSigningProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeSigningJobResult> describeSigningJobAsync(DescribeSigningJobRequest request) {

        return describeSigningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSigningJobResult> describeSigningJobAsync(final DescribeSigningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSigningJobRequest, DescribeSigningJobResult> asyncHandler) {
        final DescribeSigningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSigningJobResult>() {
            @Override
            public DescribeSigningJobResult call() throws Exception {
                DescribeSigningJobResult result = null;

                try {
                    result = executeDescribeSigningJob(finalRequest);
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
    public java.util.concurrent.Future<GetSigningPlatformResult> getSigningPlatformAsync(GetSigningPlatformRequest request) {

        return getSigningPlatformAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSigningPlatformResult> getSigningPlatformAsync(final GetSigningPlatformRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSigningPlatformRequest, GetSigningPlatformResult> asyncHandler) {
        final GetSigningPlatformRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSigningPlatformResult>() {
            @Override
            public GetSigningPlatformResult call() throws Exception {
                GetSigningPlatformResult result = null;

                try {
                    result = executeGetSigningPlatform(finalRequest);
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
    public java.util.concurrent.Future<GetSigningProfileResult> getSigningProfileAsync(GetSigningProfileRequest request) {

        return getSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSigningProfileResult> getSigningProfileAsync(final GetSigningProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSigningProfileRequest, GetSigningProfileResult> asyncHandler) {
        final GetSigningProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSigningProfileResult>() {
            @Override
            public GetSigningProfileResult call() throws Exception {
                GetSigningProfileResult result = null;

                try {
                    result = executeGetSigningProfile(finalRequest);
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
    public java.util.concurrent.Future<ListProfilePermissionsResult> listProfilePermissionsAsync(ListProfilePermissionsRequest request) {

        return listProfilePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfilePermissionsResult> listProfilePermissionsAsync(final ListProfilePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfilePermissionsRequest, ListProfilePermissionsResult> asyncHandler) {
        final ListProfilePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfilePermissionsResult>() {
            @Override
            public ListProfilePermissionsResult call() throws Exception {
                ListProfilePermissionsResult result = null;

                try {
                    result = executeListProfilePermissions(finalRequest);
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
    public java.util.concurrent.Future<ListSigningJobsResult> listSigningJobsAsync(ListSigningJobsRequest request) {

        return listSigningJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningJobsResult> listSigningJobsAsync(final ListSigningJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSigningJobsRequest, ListSigningJobsResult> asyncHandler) {
        final ListSigningJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSigningJobsResult>() {
            @Override
            public ListSigningJobsResult call() throws Exception {
                ListSigningJobsResult result = null;

                try {
                    result = executeListSigningJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSigningPlatformsResult> listSigningPlatformsAsync(ListSigningPlatformsRequest request) {

        return listSigningPlatformsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningPlatformsResult> listSigningPlatformsAsync(final ListSigningPlatformsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSigningPlatformsRequest, ListSigningPlatformsResult> asyncHandler) {
        final ListSigningPlatformsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSigningPlatformsResult>() {
            @Override
            public ListSigningPlatformsResult call() throws Exception {
                ListSigningPlatformsResult result = null;

                try {
                    result = executeListSigningPlatforms(finalRequest);
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
    public java.util.concurrent.Future<ListSigningProfilesResult> listSigningProfilesAsync(ListSigningProfilesRequest request) {

        return listSigningProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningProfilesResult> listSigningProfilesAsync(final ListSigningProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSigningProfilesRequest, ListSigningProfilesResult> asyncHandler) {
        final ListSigningProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSigningProfilesResult>() {
            @Override
            public ListSigningProfilesResult call() throws Exception {
                ListSigningProfilesResult result = null;

                try {
                    result = executeListSigningProfiles(finalRequest);
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
    public java.util.concurrent.Future<PutSigningProfileResult> putSigningProfileAsync(PutSigningProfileRequest request) {

        return putSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSigningProfileResult> putSigningProfileAsync(final PutSigningProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSigningProfileRequest, PutSigningProfileResult> asyncHandler) {
        final PutSigningProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSigningProfileResult>() {
            @Override
            public PutSigningProfileResult call() throws Exception {
                PutSigningProfileResult result = null;

                try {
                    result = executePutSigningProfile(finalRequest);
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
    public java.util.concurrent.Future<RemoveProfilePermissionResult> removeProfilePermissionAsync(RemoveProfilePermissionRequest request) {

        return removeProfilePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveProfilePermissionResult> removeProfilePermissionAsync(final RemoveProfilePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveProfilePermissionRequest, RemoveProfilePermissionResult> asyncHandler) {
        final RemoveProfilePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveProfilePermissionResult>() {
            @Override
            public RemoveProfilePermissionResult call() throws Exception {
                RemoveProfilePermissionResult result = null;

                try {
                    result = executeRemoveProfilePermission(finalRequest);
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
    public java.util.concurrent.Future<RevokeSignatureResult> revokeSignatureAsync(RevokeSignatureRequest request) {

        return revokeSignatureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSignatureResult> revokeSignatureAsync(final RevokeSignatureRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSignatureRequest, RevokeSignatureResult> asyncHandler) {
        final RevokeSignatureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeSignatureResult>() {
            @Override
            public RevokeSignatureResult call() throws Exception {
                RevokeSignatureResult result = null;

                try {
                    result = executeRevokeSignature(finalRequest);
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
    public java.util.concurrent.Future<RevokeSigningProfileResult> revokeSigningProfileAsync(RevokeSigningProfileRequest request) {

        return revokeSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSigningProfileResult> revokeSigningProfileAsync(final RevokeSigningProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSigningProfileRequest, RevokeSigningProfileResult> asyncHandler) {
        final RevokeSigningProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeSigningProfileResult>() {
            @Override
            public RevokeSigningProfileResult call() throws Exception {
                RevokeSigningProfileResult result = null;

                try {
                    result = executeRevokeSigningProfile(finalRequest);
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
    public java.util.concurrent.Future<StartSigningJobResult> startSigningJobAsync(StartSigningJobRequest request) {

        return startSigningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSigningJobResult> startSigningJobAsync(final StartSigningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSigningJobRequest, StartSigningJobResult> asyncHandler) {
        final StartSigningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSigningJobResult>() {
            @Override
            public StartSigningJobResult call() throws Exception {
                StartSigningJobResult result = null;

                try {
                    result = executeStartSigningJob(finalRequest);
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
