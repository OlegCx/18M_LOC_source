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
package com.amazonaws.services.workspaces;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;

/**
 * Abstract implementation of {@code AmazonWorkspacesAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonWorkspacesAsync extends AbstractAmazonWorkspaces implements AmazonWorkspacesAsync {

    protected AbstractAmazonWorkspacesAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateConnectionAliasResult> associateConnectionAliasAsync(AssociateConnectionAliasRequest request) {

        return associateConnectionAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateConnectionAliasResult> associateConnectionAliasAsync(AssociateConnectionAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateConnectionAliasRequest, AssociateConnectionAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateIpGroupsResult> associateIpGroupsAsync(AssociateIpGroupsRequest request) {

        return associateIpGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateIpGroupsResult> associateIpGroupsAsync(AssociateIpGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateIpGroupsRequest, AssociateIpGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AuthorizeIpRulesResult> authorizeIpRulesAsync(AuthorizeIpRulesRequest request) {

        return authorizeIpRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeIpRulesResult> authorizeIpRulesAsync(AuthorizeIpRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<AuthorizeIpRulesRequest, AuthorizeIpRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CopyWorkspaceImageResult> copyWorkspaceImageAsync(CopyWorkspaceImageRequest request) {

        return copyWorkspaceImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyWorkspaceImageResult> copyWorkspaceImageAsync(CopyWorkspaceImageRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyWorkspaceImageRequest, CopyWorkspaceImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionAliasResult> createConnectionAliasAsync(CreateConnectionAliasRequest request) {

        return createConnectionAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionAliasResult> createConnectionAliasAsync(CreateConnectionAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionAliasRequest, CreateConnectionAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateIpGroupResult> createIpGroupAsync(CreateIpGroupRequest request) {

        return createIpGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIpGroupResult> createIpGroupAsync(CreateIpGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateIpGroupRequest, CreateIpGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceBundleResult> createWorkspaceBundleAsync(CreateWorkspaceBundleRequest request) {

        return createWorkspaceBundleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceBundleResult> createWorkspaceBundleAsync(CreateWorkspaceBundleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceBundleRequest, CreateWorkspaceBundleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest request) {

        return createWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionAliasResult> deleteConnectionAliasAsync(DeleteConnectionAliasRequest request) {

        return deleteConnectionAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionAliasResult> deleteConnectionAliasAsync(DeleteConnectionAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionAliasRequest, DeleteConnectionAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteIpGroupResult> deleteIpGroupAsync(DeleteIpGroupRequest request) {

        return deleteIpGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIpGroupResult> deleteIpGroupAsync(DeleteIpGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIpGroupRequest, DeleteIpGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceBundleResult> deleteWorkspaceBundleAsync(DeleteWorkspaceBundleRequest request) {

        return deleteWorkspaceBundleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceBundleResult> deleteWorkspaceBundleAsync(DeleteWorkspaceBundleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceBundleRequest, DeleteWorkspaceBundleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceImageResult> deleteWorkspaceImageAsync(DeleteWorkspaceImageRequest request) {

        return deleteWorkspaceImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceImageResult> deleteWorkspaceImageAsync(DeleteWorkspaceImageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceImageRequest, DeleteWorkspaceImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterWorkspaceDirectoryResult> deregisterWorkspaceDirectoryAsync(DeregisterWorkspaceDirectoryRequest request) {

        return deregisterWorkspaceDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterWorkspaceDirectoryResult> deregisterWorkspaceDirectoryAsync(DeregisterWorkspaceDirectoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterWorkspaceDirectoryRequest, DeregisterWorkspaceDirectoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(DescribeAccountRequest request) {

        return describeAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(DescribeAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountRequest, DescribeAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountModificationsResult> describeAccountModificationsAsync(DescribeAccountModificationsRequest request) {

        return describeAccountModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountModificationsResult> describeAccountModificationsAsync(DescribeAccountModificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountModificationsRequest, DescribeAccountModificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClientPropertiesResult> describeClientPropertiesAsync(DescribeClientPropertiesRequest request) {

        return describeClientPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientPropertiesResult> describeClientPropertiesAsync(DescribeClientPropertiesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClientPropertiesRequest, DescribeClientPropertiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionAliasPermissionsResult> describeConnectionAliasPermissionsAsync(
            DescribeConnectionAliasPermissionsRequest request) {

        return describeConnectionAliasPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionAliasPermissionsResult> describeConnectionAliasPermissionsAsync(
            DescribeConnectionAliasPermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionAliasPermissionsRequest, DescribeConnectionAliasPermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionAliasesResult> describeConnectionAliasesAsync(DescribeConnectionAliasesRequest request) {

        return describeConnectionAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionAliasesResult> describeConnectionAliasesAsync(DescribeConnectionAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionAliasesRequest, DescribeConnectionAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeIpGroupsResult> describeIpGroupsAsync(DescribeIpGroupsRequest request) {

        return describeIpGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIpGroupsResult> describeIpGroupsAsync(DescribeIpGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeIpGroupsRequest, DescribeIpGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest request) {

        return describeWorkspaceBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync() {

        return describeWorkspaceBundlesAsync(new DescribeWorkspaceBundlesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation with an AsyncHandler.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler) {

        return describeWorkspaceBundlesAsync(new DescribeWorkspaceBundlesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest request) {

        return describeWorkspaceDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync() {

        return describeWorkspaceDirectoriesAsync(new DescribeWorkspaceDirectoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation with an AsyncHandler.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler) {

        return describeWorkspaceDirectoriesAsync(new DescribeWorkspaceDirectoriesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceImagePermissionsResult> describeWorkspaceImagePermissionsAsync(
            DescribeWorkspaceImagePermissionsRequest request) {

        return describeWorkspaceImagePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceImagePermissionsResult> describeWorkspaceImagePermissionsAsync(
            DescribeWorkspaceImagePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceImagePermissionsRequest, DescribeWorkspaceImagePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceImagesResult> describeWorkspaceImagesAsync(DescribeWorkspaceImagesRequest request) {

        return describeWorkspaceImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceImagesResult> describeWorkspaceImagesAsync(DescribeWorkspaceImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceImagesRequest, DescribeWorkspaceImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceSnapshotsResult> describeWorkspaceSnapshotsAsync(DescribeWorkspaceSnapshotsRequest request) {

        return describeWorkspaceSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceSnapshotsResult> describeWorkspaceSnapshotsAsync(DescribeWorkspaceSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceSnapshotsRequest, DescribeWorkspaceSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest request) {

        return describeWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync() {

        return describeWorkspacesAsync(new DescribeWorkspacesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation with an AsyncHandler.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler) {

        return describeWorkspacesAsync(new DescribeWorkspacesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest request) {

        return describeWorkspacesConnectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesConnectionStatusRequest, DescribeWorkspacesConnectionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectionAliasResult> disassociateConnectionAliasAsync(DisassociateConnectionAliasRequest request) {

        return disassociateConnectionAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectionAliasResult> disassociateConnectionAliasAsync(DisassociateConnectionAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateConnectionAliasRequest, DisassociateConnectionAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateIpGroupsResult> disassociateIpGroupsAsync(DisassociateIpGroupsRequest request) {

        return disassociateIpGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateIpGroupsResult> disassociateIpGroupsAsync(DisassociateIpGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateIpGroupsRequest, DisassociateIpGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportWorkspaceImageResult> importWorkspaceImageAsync(ImportWorkspaceImageRequest request) {

        return importWorkspaceImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportWorkspaceImageResult> importWorkspaceImageAsync(ImportWorkspaceImageRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportWorkspaceImageRequest, ImportWorkspaceImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAvailableManagementCidrRangesResult> listAvailableManagementCidrRangesAsync(
            ListAvailableManagementCidrRangesRequest request) {

        return listAvailableManagementCidrRangesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableManagementCidrRangesResult> listAvailableManagementCidrRangesAsync(
            ListAvailableManagementCidrRangesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAvailableManagementCidrRangesRequest, ListAvailableManagementCidrRangesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MigrateWorkspaceResult> migrateWorkspaceAsync(MigrateWorkspaceRequest request) {

        return migrateWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MigrateWorkspaceResult> migrateWorkspaceAsync(MigrateWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<MigrateWorkspaceRequest, MigrateWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyAccountResult> modifyAccountAsync(ModifyAccountRequest request) {

        return modifyAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyAccountResult> modifyAccountAsync(ModifyAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyAccountRequest, ModifyAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyClientPropertiesResult> modifyClientPropertiesAsync(ModifyClientPropertiesRequest request) {

        return modifyClientPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClientPropertiesResult> modifyClientPropertiesAsync(ModifyClientPropertiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClientPropertiesRequest, ModifyClientPropertiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifySelfservicePermissionsResult> modifySelfservicePermissionsAsync(ModifySelfservicePermissionsRequest request) {

        return modifySelfservicePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySelfservicePermissionsResult> modifySelfservicePermissionsAsync(ModifySelfservicePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifySelfservicePermissionsRequest, ModifySelfservicePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspaceAccessPropertiesResult> modifyWorkspaceAccessPropertiesAsync(
            ModifyWorkspaceAccessPropertiesRequest request) {

        return modifyWorkspaceAccessPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspaceAccessPropertiesResult> modifyWorkspaceAccessPropertiesAsync(
            ModifyWorkspaceAccessPropertiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspaceAccessPropertiesRequest, ModifyWorkspaceAccessPropertiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspaceCreationPropertiesResult> modifyWorkspaceCreationPropertiesAsync(
            ModifyWorkspaceCreationPropertiesRequest request) {

        return modifyWorkspaceCreationPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspaceCreationPropertiesResult> modifyWorkspaceCreationPropertiesAsync(
            ModifyWorkspaceCreationPropertiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspaceCreationPropertiesRequest, ModifyWorkspaceCreationPropertiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(ModifyWorkspacePropertiesRequest request) {

        return modifyWorkspacePropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(ModifyWorkspacePropertiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspacePropertiesRequest, ModifyWorkspacePropertiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspaceStateResult> modifyWorkspaceStateAsync(ModifyWorkspaceStateRequest request) {

        return modifyWorkspaceStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspaceStateResult> modifyWorkspaceStateAsync(ModifyWorkspaceStateRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspaceStateRequest, ModifyWorkspaceStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest request) {

        return rebootWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest request) {

        return rebuildWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterWorkspaceDirectoryResult> registerWorkspaceDirectoryAsync(RegisterWorkspaceDirectoryRequest request) {

        return registerWorkspaceDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterWorkspaceDirectoryResult> registerWorkspaceDirectoryAsync(RegisterWorkspaceDirectoryRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterWorkspaceDirectoryRequest, RegisterWorkspaceDirectoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreWorkspaceResult> restoreWorkspaceAsync(RestoreWorkspaceRequest request) {

        return restoreWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreWorkspaceResult> restoreWorkspaceAsync(RestoreWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreWorkspaceRequest, RestoreWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RevokeIpRulesResult> revokeIpRulesAsync(RevokeIpRulesRequest request) {

        return revokeIpRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeIpRulesResult> revokeIpRulesAsync(RevokeIpRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeIpRulesRequest, RevokeIpRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest request) {

        return startWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<StartWorkspacesRequest, StartWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest request) {

        return stopWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<StopWorkspacesRequest, StopWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest request) {

        return terminateWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionAliasPermissionResult> updateConnectionAliasPermissionAsync(
            UpdateConnectionAliasPermissionRequest request) {

        return updateConnectionAliasPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionAliasPermissionResult> updateConnectionAliasPermissionAsync(
            UpdateConnectionAliasPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectionAliasPermissionRequest, UpdateConnectionAliasPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRulesOfIpGroupResult> updateRulesOfIpGroupAsync(UpdateRulesOfIpGroupRequest request) {

        return updateRulesOfIpGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRulesOfIpGroupResult> updateRulesOfIpGroupAsync(UpdateRulesOfIpGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRulesOfIpGroupRequest, UpdateRulesOfIpGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceBundleResult> updateWorkspaceBundleAsync(UpdateWorkspaceBundleRequest request) {

        return updateWorkspaceBundleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceBundleResult> updateWorkspaceBundleAsync(UpdateWorkspaceBundleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceBundleRequest, UpdateWorkspaceBundleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceImagePermissionResult> updateWorkspaceImagePermissionAsync(UpdateWorkspaceImagePermissionRequest request) {

        return updateWorkspaceImagePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceImagePermissionResult> updateWorkspaceImagePermissionAsync(UpdateWorkspaceImagePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceImagePermissionRequest, UpdateWorkspaceImagePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
