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
package com.amazonaws.services.acmpca;

import javax.annotation.Generated;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ACM-PCA asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * This is the <i>ACM Private CA API Reference</i>. It provides descriptions, syntax, and usage examples for each of the
 * actions and data types involved in creating and managing private certificate authorities (CA) for your organization.
 * </p>
 * <p>
 * The documentation for each action shows the Query API request parameters and the XML response. Alternatively, you can
 * use one of the AWS SDKs to access an API that's tailored to the programming language or platform that you're using.
 * For more information, see <a href="https://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <note>
 * <p>
 * Each ACM Private CA API action has a quota that determines the number of times the action can be called per second.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaLimits.html#PcaLimits-api">API Rate Quotas in ACM
 * Private CA</a> in the ACM Private CA user guide.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSACMPCAAsyncClient extends AWSACMPCAClient implements AWSACMPCAAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSACMPCAAsyncClientBuilder asyncBuilder() {
        return AWSACMPCAAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ACM-PCA using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSACMPCAAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ACM-PCA using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSACMPCAAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateCertificateAuthorityResult> createCertificateAuthorityAsync(CreateCertificateAuthorityRequest request) {

        return createCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateAuthorityResult> createCertificateAuthorityAsync(final CreateCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResult> asyncHandler) {
        final CreateCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCertificateAuthorityResult>() {
            @Override
            public CreateCertificateAuthorityResult call() throws Exception {
                CreateCertificateAuthorityResult result = null;

                try {
                    result = executeCreateCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<CreateCertificateAuthorityAuditReportResult> createCertificateAuthorityAuditReportAsync(
            CreateCertificateAuthorityAuditReportRequest request) {

        return createCertificateAuthorityAuditReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateAuthorityAuditReportResult> createCertificateAuthorityAuditReportAsync(
            final CreateCertificateAuthorityAuditReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCertificateAuthorityAuditReportRequest, CreateCertificateAuthorityAuditReportResult> asyncHandler) {
        final CreateCertificateAuthorityAuditReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCertificateAuthorityAuditReportResult>() {
            @Override
            public CreateCertificateAuthorityAuditReportResult call() throws Exception {
                CreateCertificateAuthorityAuditReportResult result = null;

                try {
                    result = executeCreateCertificateAuthorityAuditReport(finalRequest);
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
    public java.util.concurrent.Future<CreatePermissionResult> createPermissionAsync(CreatePermissionRequest request) {

        return createPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePermissionResult> createPermissionAsync(final CreatePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePermissionRequest, CreatePermissionResult> asyncHandler) {
        final CreatePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePermissionResult>() {
            @Override
            public CreatePermissionResult call() throws Exception {
                CreatePermissionResult result = null;

                try {
                    result = executeCreatePermission(finalRequest);
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
    public java.util.concurrent.Future<DeleteCertificateAuthorityResult> deleteCertificateAuthorityAsync(DeleteCertificateAuthorityRequest request) {

        return deleteCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateAuthorityResult> deleteCertificateAuthorityAsync(final DeleteCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResult> asyncHandler) {
        final DeleteCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCertificateAuthorityResult>() {
            @Override
            public DeleteCertificateAuthorityResult call() throws Exception {
                DeleteCertificateAuthorityResult result = null;

                try {
                    result = executeDeleteCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<DeletePermissionResult> deletePermissionAsync(DeletePermissionRequest request) {

        return deletePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePermissionResult> deletePermissionAsync(final DeletePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePermissionRequest, DeletePermissionResult> asyncHandler) {
        final DeletePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePermissionResult>() {
            @Override
            public DeletePermissionResult call() throws Exception {
                DeletePermissionResult result = null;

                try {
                    result = executeDeletePermission(finalRequest);
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
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(final DeletePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {
        final DeletePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyResult>() {
            @Override
            public DeletePolicyResult call() throws Exception {
                DeletePolicyResult result = null;

                try {
                    result = executeDeletePolicy(finalRequest);
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
    public java.util.concurrent.Future<DescribeCertificateAuthorityResult> describeCertificateAuthorityAsync(DescribeCertificateAuthorityRequest request) {

        return describeCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateAuthorityResult> describeCertificateAuthorityAsync(final DescribeCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificateAuthorityRequest, DescribeCertificateAuthorityResult> asyncHandler) {
        final DescribeCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCertificateAuthorityResult>() {
            @Override
            public DescribeCertificateAuthorityResult call() throws Exception {
                DescribeCertificateAuthorityResult result = null;

                try {
                    result = executeDescribeCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<DescribeCertificateAuthorityAuditReportResult> describeCertificateAuthorityAuditReportAsync(
            DescribeCertificateAuthorityAuditReportRequest request) {

        return describeCertificateAuthorityAuditReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateAuthorityAuditReportResult> describeCertificateAuthorityAuditReportAsync(
            final DescribeCertificateAuthorityAuditReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificateAuthorityAuditReportRequest, DescribeCertificateAuthorityAuditReportResult> asyncHandler) {
        final DescribeCertificateAuthorityAuditReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCertificateAuthorityAuditReportResult>() {
            @Override
            public DescribeCertificateAuthorityAuditReportResult call() throws Exception {
                DescribeCertificateAuthorityAuditReportResult result = null;

                try {
                    result = executeDescribeCertificateAuthorityAuditReport(finalRequest);
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
    public java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest request) {

        return getCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(final GetCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCertificateRequest, GetCertificateResult> asyncHandler) {
        final GetCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCertificateResult>() {
            @Override
            public GetCertificateResult call() throws Exception {
                GetCertificateResult result = null;

                try {
                    result = executeGetCertificate(finalRequest);
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
    public java.util.concurrent.Future<GetCertificateAuthorityCertificateResult> getCertificateAuthorityCertificateAsync(
            GetCertificateAuthorityCertificateRequest request) {

        return getCertificateAuthorityCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityCertificateResult> getCertificateAuthorityCertificateAsync(
            final GetCertificateAuthorityCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCertificateAuthorityCertificateRequest, GetCertificateAuthorityCertificateResult> asyncHandler) {
        final GetCertificateAuthorityCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCertificateAuthorityCertificateResult>() {
            @Override
            public GetCertificateAuthorityCertificateResult call() throws Exception {
                GetCertificateAuthorityCertificateResult result = null;

                try {
                    result = executeGetCertificateAuthorityCertificate(finalRequest);
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
    public java.util.concurrent.Future<GetCertificateAuthorityCsrResult> getCertificateAuthorityCsrAsync(GetCertificateAuthorityCsrRequest request) {

        return getCertificateAuthorityCsrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityCsrResult> getCertificateAuthorityCsrAsync(final GetCertificateAuthorityCsrRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCertificateAuthorityCsrRequest, GetCertificateAuthorityCsrResult> asyncHandler) {
        final GetCertificateAuthorityCsrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCertificateAuthorityCsrResult>() {
            @Override
            public GetCertificateAuthorityCsrResult call() throws Exception {
                GetCertificateAuthorityCsrResult result = null;

                try {
                    result = executeGetCertificateAuthorityCsr(finalRequest);
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
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {
        final GetPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyResult>() {
            @Override
            public GetPolicyResult call() throws Exception {
                GetPolicyResult result = null;

                try {
                    result = executeGetPolicy(finalRequest);
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
    public java.util.concurrent.Future<ImportCertificateAuthorityCertificateResult> importCertificateAuthorityCertificateAsync(
            ImportCertificateAuthorityCertificateRequest request) {

        return importCertificateAuthorityCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportCertificateAuthorityCertificateResult> importCertificateAuthorityCertificateAsync(
            final ImportCertificateAuthorityCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResult> asyncHandler) {
        final ImportCertificateAuthorityCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportCertificateAuthorityCertificateResult>() {
            @Override
            public ImportCertificateAuthorityCertificateResult call() throws Exception {
                ImportCertificateAuthorityCertificateResult result = null;

                try {
                    result = executeImportCertificateAuthorityCertificate(finalRequest);
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
    public java.util.concurrent.Future<IssueCertificateResult> issueCertificateAsync(IssueCertificateRequest request) {

        return issueCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IssueCertificateResult> issueCertificateAsync(final IssueCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<IssueCertificateRequest, IssueCertificateResult> asyncHandler) {
        final IssueCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<IssueCertificateResult>() {
            @Override
            public IssueCertificateResult call() throws Exception {
                IssueCertificateResult result = null;

                try {
                    result = executeIssueCertificate(finalRequest);
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
    public java.util.concurrent.Future<ListCertificateAuthoritiesResult> listCertificateAuthoritiesAsync(ListCertificateAuthoritiesRequest request) {

        return listCertificateAuthoritiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificateAuthoritiesResult> listCertificateAuthoritiesAsync(final ListCertificateAuthoritiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCertificateAuthoritiesRequest, ListCertificateAuthoritiesResult> asyncHandler) {
        final ListCertificateAuthoritiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCertificateAuthoritiesResult>() {
            @Override
            public ListCertificateAuthoritiesResult call() throws Exception {
                ListCertificateAuthoritiesResult result = null;

                try {
                    result = executeListCertificateAuthorities(finalRequest);
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
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request) {

        return listPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(final ListPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler) {
        final ListPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPermissionsResult>() {
            @Override
            public ListPermissionsResult call() throws Exception {
                ListPermissionsResult result = null;

                try {
                    result = executeListPermissions(finalRequest);
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
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
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
    public java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest request) {

        return putPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(final PutPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPolicyRequest, PutPolicyResult> asyncHandler) {
        final PutPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPolicyResult>() {
            @Override
            public PutPolicyResult call() throws Exception {
                PutPolicyResult result = null;

                try {
                    result = executePutPolicy(finalRequest);
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
    public java.util.concurrent.Future<RestoreCertificateAuthorityResult> restoreCertificateAuthorityAsync(RestoreCertificateAuthorityRequest request) {

        return restoreCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreCertificateAuthorityResult> restoreCertificateAuthorityAsync(final RestoreCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResult> asyncHandler) {
        final RestoreCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreCertificateAuthorityResult>() {
            @Override
            public RestoreCertificateAuthorityResult call() throws Exception {
                RestoreCertificateAuthorityResult result = null;

                try {
                    result = executeRestoreCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<RevokeCertificateResult> revokeCertificateAsync(RevokeCertificateRequest request) {

        return revokeCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeCertificateResult> revokeCertificateAsync(final RevokeCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeCertificateRequest, RevokeCertificateResult> asyncHandler) {
        final RevokeCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeCertificateResult>() {
            @Override
            public RevokeCertificateResult call() throws Exception {
                RevokeCertificateResult result = null;

                try {
                    result = executeRevokeCertificate(finalRequest);
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
    public java.util.concurrent.Future<TagCertificateAuthorityResult> tagCertificateAuthorityAsync(TagCertificateAuthorityRequest request) {

        return tagCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagCertificateAuthorityResult> tagCertificateAuthorityAsync(final TagCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagCertificateAuthorityRequest, TagCertificateAuthorityResult> asyncHandler) {
        final TagCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagCertificateAuthorityResult>() {
            @Override
            public TagCertificateAuthorityResult call() throws Exception {
                TagCertificateAuthorityResult result = null;

                try {
                    result = executeTagCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<UntagCertificateAuthorityResult> untagCertificateAuthorityAsync(UntagCertificateAuthorityRequest request) {

        return untagCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagCertificateAuthorityResult> untagCertificateAuthorityAsync(final UntagCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagCertificateAuthorityRequest, UntagCertificateAuthorityResult> asyncHandler) {
        final UntagCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagCertificateAuthorityResult>() {
            @Override
            public UntagCertificateAuthorityResult call() throws Exception {
                UntagCertificateAuthorityResult result = null;

                try {
                    result = executeUntagCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<UpdateCertificateAuthorityResult> updateCertificateAuthorityAsync(UpdateCertificateAuthorityRequest request) {

        return updateCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateAuthorityResult> updateCertificateAuthorityAsync(final UpdateCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCertificateAuthorityRequest, UpdateCertificateAuthorityResult> asyncHandler) {
        final UpdateCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCertificateAuthorityResult>() {
            @Override
            public UpdateCertificateAuthorityResult call() throws Exception {
                UpdateCertificateAuthorityResult result = null;

                try {
                    result = executeUpdateCertificateAuthority(finalRequest);
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
