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
package com.amazonaws.services.fms;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;

/**
 * Abstract implementation of {@code AWSFMSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSFMSAsync extends AbstractAWSFMS implements AWSFMSAsync {

    protected AbstractAWSFMSAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateAdminAccountResult> associateAdminAccountAsync(AssociateAdminAccountRequest request) {

        return associateAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAdminAccountResult> associateAdminAccountAsync(AssociateAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateAdminAccountRequest, AssociateAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppsListResult> deleteAppsListAsync(DeleteAppsListRequest request) {

        return deleteAppsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppsListResult> deleteAppsListAsync(DeleteAppsListRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppsListRequest, DeleteAppsListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationChannelResult> deleteNotificationChannelAsync(DeleteNotificationChannelRequest request) {

        return deleteNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationChannelResult> deleteNotificationChannelAsync(DeleteNotificationChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationChannelRequest, DeleteNotificationChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProtocolsListResult> deleteProtocolsListAsync(DeleteProtocolsListRequest request) {

        return deleteProtocolsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProtocolsListResult> deleteProtocolsListAsync(DeleteProtocolsListRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProtocolsListRequest, DeleteProtocolsListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateAdminAccountResult> disassociateAdminAccountAsync(DisassociateAdminAccountRequest request) {

        return disassociateAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAdminAccountResult> disassociateAdminAccountAsync(DisassociateAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateAdminAccountRequest, DisassociateAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAdminAccountResult> getAdminAccountAsync(GetAdminAccountRequest request) {

        return getAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdminAccountResult> getAdminAccountAsync(GetAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAdminAccountRequest, GetAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAppsListResult> getAppsListAsync(GetAppsListRequest request) {

        return getAppsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppsListResult> getAppsListAsync(GetAppsListRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAppsListRequest, GetAppsListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailResult> getComplianceDetailAsync(GetComplianceDetailRequest request) {

        return getComplianceDetailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailResult> getComplianceDetailAsync(GetComplianceDetailRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailRequest, GetComplianceDetailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetNotificationChannelResult> getNotificationChannelAsync(GetNotificationChannelRequest request) {

        return getNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNotificationChannelResult> getNotificationChannelAsync(GetNotificationChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<GetNotificationChannelRequest, GetNotificationChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProtectionStatusResult> getProtectionStatusAsync(GetProtectionStatusRequest request) {

        return getProtectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProtectionStatusResult> getProtectionStatusAsync(GetProtectionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProtectionStatusRequest, GetProtectionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProtocolsListResult> getProtocolsListAsync(GetProtocolsListRequest request) {

        return getProtocolsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProtocolsListResult> getProtocolsListAsync(GetProtocolsListRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProtocolsListRequest, GetProtocolsListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetViolationDetailsResult> getViolationDetailsAsync(GetViolationDetailsRequest request) {

        return getViolationDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetViolationDetailsResult> getViolationDetailsAsync(GetViolationDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetViolationDetailsRequest, GetViolationDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppsListsResult> listAppsListsAsync(ListAppsListsRequest request) {

        return listAppsListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsListsResult> listAppsListsAsync(ListAppsListsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppsListsRequest, ListAppsListsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListComplianceStatusResult> listComplianceStatusAsync(ListComplianceStatusRequest request) {

        return listComplianceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComplianceStatusResult> listComplianceStatusAsync(ListComplianceStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<ListComplianceStatusRequest, ListComplianceStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest request) {

        return listMemberAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMemberAccountsRequest, ListMemberAccountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProtocolsListsResult> listProtocolsListsAsync(ListProtocolsListsRequest request) {

        return listProtocolsListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProtocolsListsResult> listProtocolsListsAsync(ListProtocolsListsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProtocolsListsRequest, ListProtocolsListsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAppsListResult> putAppsListAsync(PutAppsListRequest request) {

        return putAppsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAppsListResult> putAppsListAsync(PutAppsListRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAppsListRequest, PutAppsListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutNotificationChannelResult> putNotificationChannelAsync(PutNotificationChannelRequest request) {

        return putNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutNotificationChannelResult> putNotificationChannelAsync(PutNotificationChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<PutNotificationChannelRequest, PutNotificationChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest request) {

        return putPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPolicyRequest, PutPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutProtocolsListResult> putProtocolsListAsync(PutProtocolsListRequest request) {

        return putProtocolsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProtocolsListResult> putProtocolsListAsync(PutProtocolsListRequest request,
            com.amazonaws.handlers.AsyncHandler<PutProtocolsListRequest, PutProtocolsListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
