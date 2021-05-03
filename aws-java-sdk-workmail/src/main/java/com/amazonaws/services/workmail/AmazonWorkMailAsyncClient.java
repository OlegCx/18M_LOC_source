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
package com.amazonaws.services.workmail;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon WorkMail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon WorkMail is a secure, managed business email and calendaring service with support for existing desktop and
 * mobile email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or
 * other native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory
 * and control both the keys that encrypt your data and the location in which your data is stored.
 * </p>
 * <p>
 * The WorkMail API is designed for the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Listing and describing organizations
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing users
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing groups
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing resources
 * </p>
 * </li>
 * </ul>
 * <p>
 * All WorkMail API operations are Amazon-authenticated and certificate-signed. They not only require the use of the AWS
 * SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help facilitate
 * access, trust, and permission policies. By creating a role and allowing an IAM user to access the WorkMail site, the
 * IAM user gains full administrative visibility into the entire WorkMail organization (or as set in the IAM policy).
 * This includes, but is not limited to, the ability to create, update, and delete users, groups, and resources. This
 * allows developers to perform the scenarios listed above, as well as give users the ability to grant access on a
 * selective basis using the IAM model.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkMailAsyncClient extends AmazonWorkMailClient implements AmazonWorkMailAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonWorkMailAsyncClientBuilder asyncBuilder() {
        return AmazonWorkMailAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkMail using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonWorkMailAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkMail using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonWorkMailAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateDelegateToResourceResult> associateDelegateToResourceAsync(AssociateDelegateToResourceRequest request) {

        return associateDelegateToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDelegateToResourceResult> associateDelegateToResourceAsync(final AssociateDelegateToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDelegateToResourceRequest, AssociateDelegateToResourceResult> asyncHandler) {
        final AssociateDelegateToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDelegateToResourceResult>() {
            @Override
            public AssociateDelegateToResourceResult call() throws Exception {
                AssociateDelegateToResourceResult result = null;

                try {
                    result = executeAssociateDelegateToResource(finalRequest);
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
    public java.util.concurrent.Future<AssociateMemberToGroupResult> associateMemberToGroupAsync(AssociateMemberToGroupRequest request) {

        return associateMemberToGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberToGroupResult> associateMemberToGroupAsync(final AssociateMemberToGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateMemberToGroupRequest, AssociateMemberToGroupResult> asyncHandler) {
        final AssociateMemberToGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateMemberToGroupResult>() {
            @Override
            public AssociateMemberToGroupResult call() throws Exception {
                AssociateMemberToGroupResult result = null;

                try {
                    result = executeAssociateMemberToGroup(finalRequest);
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
    public java.util.concurrent.Future<CancelMailboxExportJobResult> cancelMailboxExportJobAsync(CancelMailboxExportJobRequest request) {

        return cancelMailboxExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelMailboxExportJobResult> cancelMailboxExportJobAsync(final CancelMailboxExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelMailboxExportJobRequest, CancelMailboxExportJobResult> asyncHandler) {
        final CancelMailboxExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelMailboxExportJobResult>() {
            @Override
            public CancelMailboxExportJobResult call() throws Exception {
                CancelMailboxExportJobResult result = null;

                try {
                    result = executeCancelMailboxExportJob(finalRequest);
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
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {
        final CreateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAliasResult>() {
            @Override
            public CreateAliasResult call() throws Exception {
                CreateAliasResult result = null;

                try {
                    result = executeCreateAlias(finalRequest);
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
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(final CreateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {
        final CreateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupResult>() {
            @Override
            public CreateGroupResult call() throws Exception {
                CreateGroupResult result = null;

                try {
                    result = executeCreateGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateMobileDeviceAccessRuleResult> createMobileDeviceAccessRuleAsync(CreateMobileDeviceAccessRuleRequest request) {

        return createMobileDeviceAccessRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMobileDeviceAccessRuleResult> createMobileDeviceAccessRuleAsync(final CreateMobileDeviceAccessRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMobileDeviceAccessRuleRequest, CreateMobileDeviceAccessRuleResult> asyncHandler) {
        final CreateMobileDeviceAccessRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMobileDeviceAccessRuleResult>() {
            @Override
            public CreateMobileDeviceAccessRuleResult call() throws Exception {
                CreateMobileDeviceAccessRuleResult result = null;

                try {
                    result = executeCreateMobileDeviceAccessRule(finalRequest);
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
    public java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(CreateOrganizationRequest request) {

        return createOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(final CreateOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOrganizationRequest, CreateOrganizationResult> asyncHandler) {
        final CreateOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOrganizationResult>() {
            @Override
            public CreateOrganizationResult call() throws Exception {
                CreateOrganizationResult result = null;

                try {
                    result = executeCreateOrganization(finalRequest);
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
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest request) {

        return createResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(final CreateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler) {
        final CreateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceResult>() {
            @Override
            public CreateResourceResult call() throws Exception {
                CreateResourceResult result = null;

                try {
                    result = executeCreateResource(finalRequest);
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
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
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
    public java.util.concurrent.Future<DeleteAccessControlRuleResult> deleteAccessControlRuleAsync(DeleteAccessControlRuleRequest request) {

        return deleteAccessControlRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessControlRuleResult> deleteAccessControlRuleAsync(final DeleteAccessControlRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessControlRuleRequest, DeleteAccessControlRuleResult> asyncHandler) {
        final DeleteAccessControlRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessControlRuleResult>() {
            @Override
            public DeleteAccessControlRuleResult call() throws Exception {
                DeleteAccessControlRuleResult result = null;

                try {
                    result = executeDeleteAccessControlRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(final DeleteAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {
        final DeleteAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAliasResult>() {
            @Override
            public DeleteAliasResult call() throws Exception {
                DeleteAliasResult result = null;

                try {
                    result = executeDeleteAlias(finalRequest);
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
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {
        final DeleteGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result = null;

                try {
                    result = executeDeleteGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteMailboxPermissionsResult> deleteMailboxPermissionsAsync(DeleteMailboxPermissionsRequest request) {

        return deleteMailboxPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMailboxPermissionsResult> deleteMailboxPermissionsAsync(final DeleteMailboxPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMailboxPermissionsRequest, DeleteMailboxPermissionsResult> asyncHandler) {
        final DeleteMailboxPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMailboxPermissionsResult>() {
            @Override
            public DeleteMailboxPermissionsResult call() throws Exception {
                DeleteMailboxPermissionsResult result = null;

                try {
                    result = executeDeleteMailboxPermissions(finalRequest);
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
    public java.util.concurrent.Future<DeleteMobileDeviceAccessRuleResult> deleteMobileDeviceAccessRuleAsync(DeleteMobileDeviceAccessRuleRequest request) {

        return deleteMobileDeviceAccessRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMobileDeviceAccessRuleResult> deleteMobileDeviceAccessRuleAsync(final DeleteMobileDeviceAccessRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMobileDeviceAccessRuleRequest, DeleteMobileDeviceAccessRuleResult> asyncHandler) {
        final DeleteMobileDeviceAccessRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMobileDeviceAccessRuleResult>() {
            @Override
            public DeleteMobileDeviceAccessRuleResult call() throws Exception {
                DeleteMobileDeviceAccessRuleResult result = null;

                try {
                    result = executeDeleteMobileDeviceAccessRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(DeleteOrganizationRequest request) {

        return deleteOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(final DeleteOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOrganizationRequest, DeleteOrganizationResult> asyncHandler) {
        final DeleteOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOrganizationResult>() {
            @Override
            public DeleteOrganizationResult call() throws Exception {
                DeleteOrganizationResult result = null;

                try {
                    result = executeDeleteOrganization(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest request) {

        return deleteResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(final DeleteResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, DeleteResourceResult> asyncHandler) {
        final DeleteResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceResult>() {
            @Override
            public DeleteResourceResult call() throws Exception {
                DeleteResourceResult result = null;

                try {
                    result = executeDeleteResource(finalRequest);
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
    public java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest request) {

        return deleteRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(final DeleteRetentionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRetentionPolicyRequest, DeleteRetentionPolicyResult> asyncHandler) {
        final DeleteRetentionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRetentionPolicyResult>() {
            @Override
            public DeleteRetentionPolicyResult call() throws Exception {
                DeleteRetentionPolicyResult result = null;

                try {
                    result = executeDeleteRetentionPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
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
    public java.util.concurrent.Future<DeregisterFromWorkMailResult> deregisterFromWorkMailAsync(DeregisterFromWorkMailRequest request) {

        return deregisterFromWorkMailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterFromWorkMailResult> deregisterFromWorkMailAsync(final DeregisterFromWorkMailRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterFromWorkMailRequest, DeregisterFromWorkMailResult> asyncHandler) {
        final DeregisterFromWorkMailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterFromWorkMailResult>() {
            @Override
            public DeregisterFromWorkMailResult call() throws Exception {
                DeregisterFromWorkMailResult result = null;

                try {
                    result = executeDeregisterFromWorkMail(finalRequest);
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
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest request) {

        return describeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(final DescribeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler) {
        final DescribeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGroupResult>() {
            @Override
            public DescribeGroupResult call() throws Exception {
                DescribeGroupResult result = null;

                try {
                    result = executeDescribeGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeMailboxExportJobResult> describeMailboxExportJobAsync(DescribeMailboxExportJobRequest request) {

        return describeMailboxExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMailboxExportJobResult> describeMailboxExportJobAsync(final DescribeMailboxExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMailboxExportJobRequest, DescribeMailboxExportJobResult> asyncHandler) {
        final DescribeMailboxExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMailboxExportJobResult>() {
            @Override
            public DescribeMailboxExportJobResult call() throws Exception {
                DescribeMailboxExportJobResult result = null;

                try {
                    result = executeDescribeMailboxExportJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(DescribeOrganizationRequest request) {

        return describeOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(final DescribeOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationRequest, DescribeOrganizationResult> asyncHandler) {
        final DescribeOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationResult>() {
            @Override
            public DescribeOrganizationResult call() throws Exception {
                DescribeOrganizationResult result = null;

                try {
                    result = executeDescribeOrganization(finalRequest);
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
    public java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest request) {

        return describeResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(final DescribeResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourceRequest, DescribeResourceResult> asyncHandler) {
        final DescribeResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourceResult>() {
            @Override
            public DescribeResourceResult call() throws Exception {
                DescribeResourceResult result = null;

                try {
                    result = executeDescribeResource(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(final DescribeUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {
        final DescribeUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserResult>() {
            @Override
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;

                try {
                    result = executeDescribeUser(finalRequest);
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
    public java.util.concurrent.Future<DisassociateDelegateFromResourceResult> disassociateDelegateFromResourceAsync(
            DisassociateDelegateFromResourceRequest request) {

        return disassociateDelegateFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDelegateFromResourceResult> disassociateDelegateFromResourceAsync(
            final DisassociateDelegateFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateDelegateFromResourceRequest, DisassociateDelegateFromResourceResult> asyncHandler) {
        final DisassociateDelegateFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateDelegateFromResourceResult>() {
            @Override
            public DisassociateDelegateFromResourceResult call() throws Exception {
                DisassociateDelegateFromResourceResult result = null;

                try {
                    result = executeDisassociateDelegateFromResource(finalRequest);
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
    public java.util.concurrent.Future<DisassociateMemberFromGroupResult> disassociateMemberFromGroupAsync(DisassociateMemberFromGroupRequest request) {

        return disassociateMemberFromGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromGroupResult> disassociateMemberFromGroupAsync(final DisassociateMemberFromGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromGroupRequest, DisassociateMemberFromGroupResult> asyncHandler) {
        final DisassociateMemberFromGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMemberFromGroupResult>() {
            @Override
            public DisassociateMemberFromGroupResult call() throws Exception {
                DisassociateMemberFromGroupResult result = null;

                try {
                    result = executeDisassociateMemberFromGroup(finalRequest);
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
    public java.util.concurrent.Future<GetAccessControlEffectResult> getAccessControlEffectAsync(GetAccessControlEffectRequest request) {

        return getAccessControlEffectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessControlEffectResult> getAccessControlEffectAsync(final GetAccessControlEffectRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessControlEffectRequest, GetAccessControlEffectResult> asyncHandler) {
        final GetAccessControlEffectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccessControlEffectResult>() {
            @Override
            public GetAccessControlEffectResult call() throws Exception {
                GetAccessControlEffectResult result = null;

                try {
                    result = executeGetAccessControlEffect(finalRequest);
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
    public java.util.concurrent.Future<GetDefaultRetentionPolicyResult> getDefaultRetentionPolicyAsync(GetDefaultRetentionPolicyRequest request) {

        return getDefaultRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDefaultRetentionPolicyResult> getDefaultRetentionPolicyAsync(final GetDefaultRetentionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDefaultRetentionPolicyRequest, GetDefaultRetentionPolicyResult> asyncHandler) {
        final GetDefaultRetentionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDefaultRetentionPolicyResult>() {
            @Override
            public GetDefaultRetentionPolicyResult call() throws Exception {
                GetDefaultRetentionPolicyResult result = null;

                try {
                    result = executeGetDefaultRetentionPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetMailboxDetailsResult> getMailboxDetailsAsync(GetMailboxDetailsRequest request) {

        return getMailboxDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMailboxDetailsResult> getMailboxDetailsAsync(final GetMailboxDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMailboxDetailsRequest, GetMailboxDetailsResult> asyncHandler) {
        final GetMailboxDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMailboxDetailsResult>() {
            @Override
            public GetMailboxDetailsResult call() throws Exception {
                GetMailboxDetailsResult result = null;

                try {
                    result = executeGetMailboxDetails(finalRequest);
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
    public java.util.concurrent.Future<GetMobileDeviceAccessEffectResult> getMobileDeviceAccessEffectAsync(GetMobileDeviceAccessEffectRequest request) {

        return getMobileDeviceAccessEffectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMobileDeviceAccessEffectResult> getMobileDeviceAccessEffectAsync(final GetMobileDeviceAccessEffectRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMobileDeviceAccessEffectRequest, GetMobileDeviceAccessEffectResult> asyncHandler) {
        final GetMobileDeviceAccessEffectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMobileDeviceAccessEffectResult>() {
            @Override
            public GetMobileDeviceAccessEffectResult call() throws Exception {
                GetMobileDeviceAccessEffectResult result = null;

                try {
                    result = executeGetMobileDeviceAccessEffect(finalRequest);
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
    public java.util.concurrent.Future<ListAccessControlRulesResult> listAccessControlRulesAsync(ListAccessControlRulesRequest request) {

        return listAccessControlRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessControlRulesResult> listAccessControlRulesAsync(final ListAccessControlRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccessControlRulesRequest, ListAccessControlRulesResult> asyncHandler) {
        final ListAccessControlRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccessControlRulesResult>() {
            @Override
            public ListAccessControlRulesResult call() throws Exception {
                ListAccessControlRulesResult result = null;

                try {
                    result = executeListAccessControlRules(finalRequest);
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
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {
        final ListAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAliasesResult>() {
            @Override
            public ListAliasesResult call() throws Exception {
                ListAliasesResult result = null;

                try {
                    result = executeListAliases(finalRequest);
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
    public java.util.concurrent.Future<ListGroupMembersResult> listGroupMembersAsync(ListGroupMembersRequest request) {

        return listGroupMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembersResult> listGroupMembersAsync(final ListGroupMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupMembersRequest, ListGroupMembersResult> asyncHandler) {
        final ListGroupMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupMembersResult>() {
            @Override
            public ListGroupMembersResult call() throws Exception {
                ListGroupMembersResult result = null;

                try {
                    result = executeListGroupMembers(finalRequest);
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
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(final ListGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {
        final ListGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result = null;

                try {
                    result = executeListGroups(finalRequest);
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
    public java.util.concurrent.Future<ListMailboxExportJobsResult> listMailboxExportJobsAsync(ListMailboxExportJobsRequest request) {

        return listMailboxExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMailboxExportJobsResult> listMailboxExportJobsAsync(final ListMailboxExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMailboxExportJobsRequest, ListMailboxExportJobsResult> asyncHandler) {
        final ListMailboxExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMailboxExportJobsResult>() {
            @Override
            public ListMailboxExportJobsResult call() throws Exception {
                ListMailboxExportJobsResult result = null;

                try {
                    result = executeListMailboxExportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListMailboxPermissionsResult> listMailboxPermissionsAsync(ListMailboxPermissionsRequest request) {

        return listMailboxPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMailboxPermissionsResult> listMailboxPermissionsAsync(final ListMailboxPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMailboxPermissionsRequest, ListMailboxPermissionsResult> asyncHandler) {
        final ListMailboxPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMailboxPermissionsResult>() {
            @Override
            public ListMailboxPermissionsResult call() throws Exception {
                ListMailboxPermissionsResult result = null;

                try {
                    result = executeListMailboxPermissions(finalRequest);
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
    public java.util.concurrent.Future<ListMobileDeviceAccessRulesResult> listMobileDeviceAccessRulesAsync(ListMobileDeviceAccessRulesRequest request) {

        return listMobileDeviceAccessRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMobileDeviceAccessRulesResult> listMobileDeviceAccessRulesAsync(final ListMobileDeviceAccessRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMobileDeviceAccessRulesRequest, ListMobileDeviceAccessRulesResult> asyncHandler) {
        final ListMobileDeviceAccessRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMobileDeviceAccessRulesResult>() {
            @Override
            public ListMobileDeviceAccessRulesResult call() throws Exception {
                ListMobileDeviceAccessRulesResult result = null;

                try {
                    result = executeListMobileDeviceAccessRules(finalRequest);
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
    public java.util.concurrent.Future<ListOrganizationsResult> listOrganizationsAsync(ListOrganizationsRequest request) {

        return listOrganizationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationsResult> listOrganizationsAsync(final ListOrganizationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationsRequest, ListOrganizationsResult> asyncHandler) {
        final ListOrganizationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationsResult>() {
            @Override
            public ListOrganizationsResult call() throws Exception {
                ListOrganizationsResult result = null;

                try {
                    result = executeListOrganizations(finalRequest);
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
    public java.util.concurrent.Future<ListResourceDelegatesResult> listResourceDelegatesAsync(ListResourceDelegatesRequest request) {

        return listResourceDelegatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceDelegatesResult> listResourceDelegatesAsync(final ListResourceDelegatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceDelegatesRequest, ListResourceDelegatesResult> asyncHandler) {
        final ListResourceDelegatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceDelegatesResult>() {
            @Override
            public ListResourceDelegatesResult call() throws Exception {
                ListResourceDelegatesResult result = null;

                try {
                    result = executeListResourceDelegates(finalRequest);
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
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(final ListResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {
        final ListResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesResult>() {
            @Override
            public ListResourcesResult call() throws Exception {
                ListResourcesResult result = null;

                try {
                    result = executeListResources(finalRequest);
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
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
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
    public java.util.concurrent.Future<PutAccessControlRuleResult> putAccessControlRuleAsync(PutAccessControlRuleRequest request) {

        return putAccessControlRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccessControlRuleResult> putAccessControlRuleAsync(final PutAccessControlRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccessControlRuleRequest, PutAccessControlRuleResult> asyncHandler) {
        final PutAccessControlRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccessControlRuleResult>() {
            @Override
            public PutAccessControlRuleResult call() throws Exception {
                PutAccessControlRuleResult result = null;

                try {
                    result = executePutAccessControlRule(finalRequest);
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
    public java.util.concurrent.Future<PutMailboxPermissionsResult> putMailboxPermissionsAsync(PutMailboxPermissionsRequest request) {

        return putMailboxPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMailboxPermissionsResult> putMailboxPermissionsAsync(final PutMailboxPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMailboxPermissionsRequest, PutMailboxPermissionsResult> asyncHandler) {
        final PutMailboxPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMailboxPermissionsResult>() {
            @Override
            public PutMailboxPermissionsResult call() throws Exception {
                PutMailboxPermissionsResult result = null;

                try {
                    result = executePutMailboxPermissions(finalRequest);
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
    public java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest request) {

        return putRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(final PutRetentionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRetentionPolicyRequest, PutRetentionPolicyResult> asyncHandler) {
        final PutRetentionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRetentionPolicyResult>() {
            @Override
            public PutRetentionPolicyResult call() throws Exception {
                PutRetentionPolicyResult result = null;

                try {
                    result = executePutRetentionPolicy(finalRequest);
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
    public java.util.concurrent.Future<RegisterToWorkMailResult> registerToWorkMailAsync(RegisterToWorkMailRequest request) {

        return registerToWorkMailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterToWorkMailResult> registerToWorkMailAsync(final RegisterToWorkMailRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterToWorkMailRequest, RegisterToWorkMailResult> asyncHandler) {
        final RegisterToWorkMailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterToWorkMailResult>() {
            @Override
            public RegisterToWorkMailResult call() throws Exception {
                RegisterToWorkMailResult result = null;

                try {
                    result = executeRegisterToWorkMail(finalRequest);
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
    public java.util.concurrent.Future<ResetPasswordResult> resetPasswordAsync(ResetPasswordRequest request) {

        return resetPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetPasswordResult> resetPasswordAsync(final ResetPasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetPasswordRequest, ResetPasswordResult> asyncHandler) {
        final ResetPasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetPasswordResult>() {
            @Override
            public ResetPasswordResult call() throws Exception {
                ResetPasswordResult result = null;

                try {
                    result = executeResetPassword(finalRequest);
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
    public java.util.concurrent.Future<StartMailboxExportJobResult> startMailboxExportJobAsync(StartMailboxExportJobRequest request) {

        return startMailboxExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMailboxExportJobResult> startMailboxExportJobAsync(final StartMailboxExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMailboxExportJobRequest, StartMailboxExportJobResult> asyncHandler) {
        final StartMailboxExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMailboxExportJobResult>() {
            @Override
            public StartMailboxExportJobResult call() throws Exception {
                StartMailboxExportJobResult result = null;

                try {
                    result = executeStartMailboxExportJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateMailboxQuotaResult> updateMailboxQuotaAsync(UpdateMailboxQuotaRequest request) {

        return updateMailboxQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMailboxQuotaResult> updateMailboxQuotaAsync(final UpdateMailboxQuotaRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMailboxQuotaRequest, UpdateMailboxQuotaResult> asyncHandler) {
        final UpdateMailboxQuotaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMailboxQuotaResult>() {
            @Override
            public UpdateMailboxQuotaResult call() throws Exception {
                UpdateMailboxQuotaResult result = null;

                try {
                    result = executeUpdateMailboxQuota(finalRequest);
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
    public java.util.concurrent.Future<UpdateMobileDeviceAccessRuleResult> updateMobileDeviceAccessRuleAsync(UpdateMobileDeviceAccessRuleRequest request) {

        return updateMobileDeviceAccessRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMobileDeviceAccessRuleResult> updateMobileDeviceAccessRuleAsync(final UpdateMobileDeviceAccessRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMobileDeviceAccessRuleRequest, UpdateMobileDeviceAccessRuleResult> asyncHandler) {
        final UpdateMobileDeviceAccessRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMobileDeviceAccessRuleResult>() {
            @Override
            public UpdateMobileDeviceAccessRuleResult call() throws Exception {
                UpdateMobileDeviceAccessRuleResult result = null;

                try {
                    result = executeUpdateMobileDeviceAccessRule(finalRequest);
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
    public java.util.concurrent.Future<UpdatePrimaryEmailAddressResult> updatePrimaryEmailAddressAsync(UpdatePrimaryEmailAddressRequest request) {

        return updatePrimaryEmailAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePrimaryEmailAddressResult> updatePrimaryEmailAddressAsync(final UpdatePrimaryEmailAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePrimaryEmailAddressRequest, UpdatePrimaryEmailAddressResult> asyncHandler) {
        final UpdatePrimaryEmailAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePrimaryEmailAddressResult>() {
            @Override
            public UpdatePrimaryEmailAddressResult call() throws Exception {
                UpdatePrimaryEmailAddressResult result = null;

                try {
                    result = executeUpdatePrimaryEmailAddress(finalRequest);
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
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(final UpdateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {
        final UpdateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceResult>() {
            @Override
            public UpdateResourceResult call() throws Exception {
                UpdateResourceResult result = null;

                try {
                    result = executeUpdateResource(finalRequest);
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
