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
package com.amazonaws.services.codecommit;

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;

/**
 * Abstract implementation of {@code AWSCodeCommitAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeCommitAsync extends AbstractAWSCodeCommit implements AWSCodeCommitAsync {

    protected AbstractAWSCodeCommitAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateApprovalRuleTemplateWithRepositoryResult> associateApprovalRuleTemplateWithRepositoryAsync(
            AssociateApprovalRuleTemplateWithRepositoryRequest request) {

        return associateApprovalRuleTemplateWithRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateApprovalRuleTemplateWithRepositoryResult> associateApprovalRuleTemplateWithRepositoryAsync(
            AssociateApprovalRuleTemplateWithRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateApprovalRuleTemplateWithRepositoryRequest, AssociateApprovalRuleTemplateWithRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateApprovalRuleTemplateWithRepositoriesResult> batchAssociateApprovalRuleTemplateWithRepositoriesAsync(
            BatchAssociateApprovalRuleTemplateWithRepositoriesRequest request) {

        return batchAssociateApprovalRuleTemplateWithRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateApprovalRuleTemplateWithRepositoriesResult> batchAssociateApprovalRuleTemplateWithRepositoriesAsync(
            BatchAssociateApprovalRuleTemplateWithRepositoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateApprovalRuleTemplateWithRepositoriesRequest, BatchAssociateApprovalRuleTemplateWithRepositoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDescribeMergeConflictsResult> batchDescribeMergeConflictsAsync(BatchDescribeMergeConflictsRequest request) {

        return batchDescribeMergeConflictsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDescribeMergeConflictsResult> batchDescribeMergeConflictsAsync(BatchDescribeMergeConflictsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDescribeMergeConflictsRequest, BatchDescribeMergeConflictsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> batchDisassociateApprovalRuleTemplateFromRepositoriesAsync(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest request) {

        return batchDisassociateApprovalRuleTemplateFromRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> batchDisassociateApprovalRuleTemplateFromRepositoriesAsync(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest, BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetCommitsResult> batchGetCommitsAsync(BatchGetCommitsRequest request) {

        return batchGetCommitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetCommitsResult> batchGetCommitsAsync(BatchGetCommitsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetCommitsRequest, BatchGetCommitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(BatchGetRepositoriesRequest request) {

        return batchGetRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(BatchGetRepositoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetRepositoriesRequest, BatchGetRepositoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateApprovalRuleTemplateResult> createApprovalRuleTemplateAsync(CreateApprovalRuleTemplateRequest request) {

        return createApprovalRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApprovalRuleTemplateResult> createApprovalRuleTemplateAsync(CreateApprovalRuleTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApprovalRuleTemplateRequest, CreateApprovalRuleTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest request) {

        return createBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, CreateBranchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCommitResult> createCommitAsync(CreateCommitRequest request) {

        return createCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCommitResult> createCommitAsync(CreateCommitRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCommitRequest, CreateCommitResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestResult> createPullRequestAsync(CreatePullRequestRequest request) {

        return createPullRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestResult> createPullRequestAsync(CreatePullRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePullRequestRequest, CreatePullRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestApprovalRuleResult> createPullRequestApprovalRuleAsync(CreatePullRequestApprovalRuleRequest request) {

        return createPullRequestApprovalRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestApprovalRuleResult> createPullRequestApprovalRuleAsync(CreatePullRequestApprovalRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePullRequestApprovalRuleRequest, CreatePullRequestApprovalRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest request) {

        return createRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUnreferencedMergeCommitResult> createUnreferencedMergeCommitAsync(CreateUnreferencedMergeCommitRequest request) {

        return createUnreferencedMergeCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUnreferencedMergeCommitResult> createUnreferencedMergeCommitAsync(CreateUnreferencedMergeCommitRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUnreferencedMergeCommitRequest, CreateUnreferencedMergeCommitResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteApprovalRuleTemplateResult> deleteApprovalRuleTemplateAsync(DeleteApprovalRuleTemplateRequest request) {

        return deleteApprovalRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApprovalRuleTemplateResult> deleteApprovalRuleTemplateAsync(DeleteApprovalRuleTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApprovalRuleTemplateRequest, DeleteApprovalRuleTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest request) {

        return deleteBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBranchRequest, DeleteBranchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCommentContentResult> deleteCommentContentAsync(DeleteCommentContentRequest request) {

        return deleteCommentContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCommentContentResult> deleteCommentContentAsync(DeleteCommentContentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCommentContentRequest, DeleteCommentContentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFileResult> deleteFileAsync(DeleteFileRequest request) {

        return deleteFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileResult> deleteFileAsync(DeleteFileRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFileRequest, DeleteFileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePullRequestApprovalRuleResult> deletePullRequestApprovalRuleAsync(DeletePullRequestApprovalRuleRequest request) {

        return deletePullRequestApprovalRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePullRequestApprovalRuleResult> deletePullRequestApprovalRuleAsync(DeletePullRequestApprovalRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePullRequestApprovalRuleRequest, DeletePullRequestApprovalRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest request) {

        return deleteRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMergeConflictsResult> describeMergeConflictsAsync(DescribeMergeConflictsRequest request) {

        return describeMergeConflictsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMergeConflictsResult> describeMergeConflictsAsync(DescribeMergeConflictsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMergeConflictsRequest, DescribeMergeConflictsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePullRequestEventsResult> describePullRequestEventsAsync(DescribePullRequestEventsRequest request) {

        return describePullRequestEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePullRequestEventsResult> describePullRequestEventsAsync(DescribePullRequestEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePullRequestEventsRequest, DescribePullRequestEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateApprovalRuleTemplateFromRepositoryResult> disassociateApprovalRuleTemplateFromRepositoryAsync(
            DisassociateApprovalRuleTemplateFromRepositoryRequest request) {

        return disassociateApprovalRuleTemplateFromRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateApprovalRuleTemplateFromRepositoryResult> disassociateApprovalRuleTemplateFromRepositoryAsync(
            DisassociateApprovalRuleTemplateFromRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateApprovalRuleTemplateFromRepositoryRequest, DisassociateApprovalRuleTemplateFromRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EvaluatePullRequestApprovalRulesResult> evaluatePullRequestApprovalRulesAsync(
            EvaluatePullRequestApprovalRulesRequest request) {

        return evaluatePullRequestApprovalRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EvaluatePullRequestApprovalRulesResult> evaluatePullRequestApprovalRulesAsync(
            EvaluatePullRequestApprovalRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<EvaluatePullRequestApprovalRulesRequest, EvaluatePullRequestApprovalRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetApprovalRuleTemplateResult> getApprovalRuleTemplateAsync(GetApprovalRuleTemplateRequest request) {

        return getApprovalRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApprovalRuleTemplateResult> getApprovalRuleTemplateAsync(GetApprovalRuleTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetApprovalRuleTemplateRequest, GetApprovalRuleTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBlobResult> getBlobAsync(GetBlobRequest request) {

        return getBlobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlobResult> getBlobAsync(GetBlobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBlobRequest, GetBlobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest request) {

        return getBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCommentResult> getCommentAsync(GetCommentRequest request) {

        return getCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommentResult> getCommentAsync(GetCommentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCommentRequest, GetCommentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCommentReactionsResult> getCommentReactionsAsync(GetCommentReactionsRequest request) {

        return getCommentReactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommentReactionsResult> getCommentReactionsAsync(GetCommentReactionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCommentReactionsRequest, GetCommentReactionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCommentsForComparedCommitResult> getCommentsForComparedCommitAsync(GetCommentsForComparedCommitRequest request) {

        return getCommentsForComparedCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommentsForComparedCommitResult> getCommentsForComparedCommitAsync(GetCommentsForComparedCommitRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCommentsForComparedCommitRequest, GetCommentsForComparedCommitResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCommentsForPullRequestResult> getCommentsForPullRequestAsync(GetCommentsForPullRequestRequest request) {

        return getCommentsForPullRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommentsForPullRequestResult> getCommentsForPullRequestAsync(GetCommentsForPullRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCommentsForPullRequestRequest, GetCommentsForPullRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest request) {

        return getCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCommitRequest, GetCommitResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDifferencesResult> getDifferencesAsync(GetDifferencesRequest request) {

        return getDifferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDifferencesResult> getDifferencesAsync(GetDifferencesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDifferencesRequest, GetDifferencesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFileResult> getFileAsync(GetFileRequest request) {

        return getFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFileResult> getFileAsync(GetFileRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFileRequest, GetFileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest request) {

        return getFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFolderRequest, GetFolderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMergeCommitResult> getMergeCommitAsync(GetMergeCommitRequest request) {

        return getMergeCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMergeCommitResult> getMergeCommitAsync(GetMergeCommitRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMergeCommitRequest, GetMergeCommitResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMergeConflictsResult> getMergeConflictsAsync(GetMergeConflictsRequest request) {

        return getMergeConflictsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMergeConflictsResult> getMergeConflictsAsync(GetMergeConflictsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMergeConflictsRequest, GetMergeConflictsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMergeOptionsResult> getMergeOptionsAsync(GetMergeOptionsRequest request) {

        return getMergeOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMergeOptionsResult> getMergeOptionsAsync(GetMergeOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMergeOptionsRequest, GetMergeOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestResult> getPullRequestAsync(GetPullRequestRequest request) {

        return getPullRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestResult> getPullRequestAsync(GetPullRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPullRequestRequest, GetPullRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestApprovalStatesResult> getPullRequestApprovalStatesAsync(GetPullRequestApprovalStatesRequest request) {

        return getPullRequestApprovalStatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestApprovalStatesResult> getPullRequestApprovalStatesAsync(GetPullRequestApprovalStatesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPullRequestApprovalStatesRequest, GetPullRequestApprovalStatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestOverrideStateResult> getPullRequestOverrideStateAsync(GetPullRequestOverrideStateRequest request) {

        return getPullRequestOverrideStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestOverrideStateResult> getPullRequestOverrideStateAsync(GetPullRequestOverrideStateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPullRequestOverrideStateRequest, GetPullRequestOverrideStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest request) {

        return getRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryRequest, GetRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(GetRepositoryTriggersRequest request) {

        return getRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(GetRepositoryTriggersRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryTriggersRequest, GetRepositoryTriggersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApprovalRuleTemplatesResult> listApprovalRuleTemplatesAsync(ListApprovalRuleTemplatesRequest request) {

        return listApprovalRuleTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApprovalRuleTemplatesResult> listApprovalRuleTemplatesAsync(ListApprovalRuleTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApprovalRuleTemplatesRequest, ListApprovalRuleTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedApprovalRuleTemplatesForRepositoryResult> listAssociatedApprovalRuleTemplatesForRepositoryAsync(
            ListAssociatedApprovalRuleTemplatesForRepositoryRequest request) {

        return listAssociatedApprovalRuleTemplatesForRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedApprovalRuleTemplatesForRepositoryResult> listAssociatedApprovalRuleTemplatesForRepositoryAsync(
            ListAssociatedApprovalRuleTemplatesForRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedApprovalRuleTemplatesForRepositoryRequest, ListAssociatedApprovalRuleTemplatesForRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest request) {

        return listBranchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestsResult> listPullRequestsAsync(ListPullRequestsRequest request) {

        return listPullRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestsResult> listPullRequestsAsync(ListPullRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPullRequestsRequest, ListPullRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest request) {

        return listRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesForApprovalRuleTemplateResult> listRepositoriesForApprovalRuleTemplateAsync(
            ListRepositoriesForApprovalRuleTemplateRequest request) {

        return listRepositoriesForApprovalRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesForApprovalRuleTemplateResult> listRepositoriesForApprovalRuleTemplateAsync(
            ListRepositoriesForApprovalRuleTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesForApprovalRuleTemplateRequest, ListRepositoriesForApprovalRuleTemplateResult> asyncHandler) {

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
    public java.util.concurrent.Future<MergeBranchesByFastForwardResult> mergeBranchesByFastForwardAsync(MergeBranchesByFastForwardRequest request) {

        return mergeBranchesByFastForwardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeBranchesByFastForwardResult> mergeBranchesByFastForwardAsync(MergeBranchesByFastForwardRequest request,
            com.amazonaws.handlers.AsyncHandler<MergeBranchesByFastForwardRequest, MergeBranchesByFastForwardResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MergeBranchesBySquashResult> mergeBranchesBySquashAsync(MergeBranchesBySquashRequest request) {

        return mergeBranchesBySquashAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeBranchesBySquashResult> mergeBranchesBySquashAsync(MergeBranchesBySquashRequest request,
            com.amazonaws.handlers.AsyncHandler<MergeBranchesBySquashRequest, MergeBranchesBySquashResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MergeBranchesByThreeWayResult> mergeBranchesByThreeWayAsync(MergeBranchesByThreeWayRequest request) {

        return mergeBranchesByThreeWayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeBranchesByThreeWayResult> mergeBranchesByThreeWayAsync(MergeBranchesByThreeWayRequest request,
            com.amazonaws.handlers.AsyncHandler<MergeBranchesByThreeWayRequest, MergeBranchesByThreeWayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestByFastForwardResult> mergePullRequestByFastForwardAsync(MergePullRequestByFastForwardRequest request) {

        return mergePullRequestByFastForwardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestByFastForwardResult> mergePullRequestByFastForwardAsync(MergePullRequestByFastForwardRequest request,
            com.amazonaws.handlers.AsyncHandler<MergePullRequestByFastForwardRequest, MergePullRequestByFastForwardResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestBySquashResult> mergePullRequestBySquashAsync(MergePullRequestBySquashRequest request) {

        return mergePullRequestBySquashAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestBySquashResult> mergePullRequestBySquashAsync(MergePullRequestBySquashRequest request,
            com.amazonaws.handlers.AsyncHandler<MergePullRequestBySquashRequest, MergePullRequestBySquashResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestByThreeWayResult> mergePullRequestByThreeWayAsync(MergePullRequestByThreeWayRequest request) {

        return mergePullRequestByThreeWayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestByThreeWayResult> mergePullRequestByThreeWayAsync(MergePullRequestByThreeWayRequest request,
            com.amazonaws.handlers.AsyncHandler<MergePullRequestByThreeWayRequest, MergePullRequestByThreeWayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<OverridePullRequestApprovalRulesResult> overridePullRequestApprovalRulesAsync(
            OverridePullRequestApprovalRulesRequest request) {

        return overridePullRequestApprovalRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OverridePullRequestApprovalRulesResult> overridePullRequestApprovalRulesAsync(
            OverridePullRequestApprovalRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<OverridePullRequestApprovalRulesRequest, OverridePullRequestApprovalRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PostCommentForComparedCommitResult> postCommentForComparedCommitAsync(PostCommentForComparedCommitRequest request) {

        return postCommentForComparedCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostCommentForComparedCommitResult> postCommentForComparedCommitAsync(PostCommentForComparedCommitRequest request,
            com.amazonaws.handlers.AsyncHandler<PostCommentForComparedCommitRequest, PostCommentForComparedCommitResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PostCommentForPullRequestResult> postCommentForPullRequestAsync(PostCommentForPullRequestRequest request) {

        return postCommentForPullRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostCommentForPullRequestResult> postCommentForPullRequestAsync(PostCommentForPullRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<PostCommentForPullRequestRequest, PostCommentForPullRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PostCommentReplyResult> postCommentReplyAsync(PostCommentReplyRequest request) {

        return postCommentReplyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostCommentReplyResult> postCommentReplyAsync(PostCommentReplyRequest request,
            com.amazonaws.handlers.AsyncHandler<PostCommentReplyRequest, PostCommentReplyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutCommentReactionResult> putCommentReactionAsync(PutCommentReactionRequest request) {

        return putCommentReactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutCommentReactionResult> putCommentReactionAsync(PutCommentReactionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutCommentReactionRequest, PutCommentReactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutFileResult> putFileAsync(PutFileRequest request) {

        return putFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFileResult> putFileAsync(PutFileRequest request,
            com.amazonaws.handlers.AsyncHandler<PutFileRequest, PutFileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(PutRepositoryTriggersRequest request) {

        return putRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(PutRepositoryTriggersRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRepositoryTriggersRequest, PutRepositoryTriggersResult> asyncHandler) {

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
    public java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest request) {

        return testRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest request,
            com.amazonaws.handlers.AsyncHandler<TestRepositoryTriggersRequest, TestRepositoryTriggersResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateContentResult> updateApprovalRuleTemplateContentAsync(
            UpdateApprovalRuleTemplateContentRequest request) {

        return updateApprovalRuleTemplateContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateContentResult> updateApprovalRuleTemplateContentAsync(
            UpdateApprovalRuleTemplateContentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateContentRequest, UpdateApprovalRuleTemplateContentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateDescriptionResult> updateApprovalRuleTemplateDescriptionAsync(
            UpdateApprovalRuleTemplateDescriptionRequest request) {

        return updateApprovalRuleTemplateDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateDescriptionResult> updateApprovalRuleTemplateDescriptionAsync(
            UpdateApprovalRuleTemplateDescriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateDescriptionRequest, UpdateApprovalRuleTemplateDescriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateNameResult> updateApprovalRuleTemplateNameAsync(UpdateApprovalRuleTemplateNameRequest request) {

        return updateApprovalRuleTemplateNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateNameResult> updateApprovalRuleTemplateNameAsync(UpdateApprovalRuleTemplateNameRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateNameRequest, UpdateApprovalRuleTemplateNameResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateCommentResult> updateCommentAsync(UpdateCommentRequest request) {

        return updateCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCommentResult> updateCommentAsync(UpdateCommentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCommentRequest, UpdateCommentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest request) {

        return updateDefaultBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDefaultBranchRequest, UpdateDefaultBranchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestApprovalRuleContentResult> updatePullRequestApprovalRuleContentAsync(
            UpdatePullRequestApprovalRuleContentRequest request) {

        return updatePullRequestApprovalRuleContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestApprovalRuleContentResult> updatePullRequestApprovalRuleContentAsync(
            UpdatePullRequestApprovalRuleContentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestApprovalRuleContentRequest, UpdatePullRequestApprovalRuleContentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestApprovalStateResult> updatePullRequestApprovalStateAsync(UpdatePullRequestApprovalStateRequest request) {

        return updatePullRequestApprovalStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestApprovalStateResult> updatePullRequestApprovalStateAsync(UpdatePullRequestApprovalStateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestApprovalStateRequest, UpdatePullRequestApprovalStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestDescriptionResult> updatePullRequestDescriptionAsync(UpdatePullRequestDescriptionRequest request) {

        return updatePullRequestDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestDescriptionResult> updatePullRequestDescriptionAsync(UpdatePullRequestDescriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestDescriptionRequest, UpdatePullRequestDescriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestStatusResult> updatePullRequestStatusAsync(UpdatePullRequestStatusRequest request) {

        return updatePullRequestStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestStatusResult> updatePullRequestStatusAsync(UpdatePullRequestStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestStatusRequest, UpdatePullRequestStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestTitleResult> updatePullRequestTitleAsync(UpdatePullRequestTitleRequest request) {

        return updatePullRequestTitleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestTitleResult> updatePullRequestTitleAsync(UpdatePullRequestTitleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestTitleRequest, UpdatePullRequestTitleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(UpdateRepositoryDescriptionRequest request) {

        return updateRepositoryDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(UpdateRepositoryDescriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryDescriptionRequest, UpdateRepositoryDescriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest request) {

        return updateRepositoryNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryNameRequest, UpdateRepositoryNameResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
