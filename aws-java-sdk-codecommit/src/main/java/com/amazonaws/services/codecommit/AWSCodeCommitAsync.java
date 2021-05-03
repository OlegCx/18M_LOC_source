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
 * Interface for accessing CodeCommit asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codecommit.AbstractAWSCodeCommitAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS CodeCommit</fullname>
 * <p>
 * This is the <i>AWS CodeCommit API Reference</i>. This reference provides descriptions of the operations and data
 * types for AWS CodeCommit API along with usage examples.
 * </p>
 * <p>
 * You can use the AWS CodeCommit API to work with the following objects:
 * </p>
 * <p>
 * Repositories, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchGetRepositories</a>, which returns information about one or more repositories associated with your AWS
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateRepository</a>, which creates an AWS CodeCommit repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRepository</a>, which deletes an AWS CodeCommit repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRepository</a>, which returns information about a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRepositories</a>, which lists all AWS CodeCommit repositories associated with your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRepositoryDescription</a>, which sets or updates the description of the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRepositoryName</a>, which changes the name of the repository. If you change the name of a repository, no
 * other users of that repository can access it until you send them the new HTTPS or SSH URL to use.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Branches, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBranch</a>, which creates a branch in a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBranch</a>, which deletes the specified branch in a repository unless it is the default branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBranch</a>, which returns information about a specified branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBranches</a>, which lists all branches for a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateDefaultBranch</a>, which changes the default branch for a repository.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Files, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteFile</a>, which deletes the content of a specified file from a specified branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBlob</a>, which returns the base-64 encoded content of an individual Git blob object in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetFile</a>, which returns the base-64 encoded content of a specified file.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetFolder</a>, which returns the contents of a specified folder or directory.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutFile</a>, which adds or modifies a single file in a specified repository and branch.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Commits, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchGetCommits</a>, which returns information about one or more commits in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateCommit</a>, which creates a commit for changes to a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommit</a>, which returns information about a commit, including commit messages and author and committer
 * information.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetDifferences</a>, which returns information about the differences in a valid commit specifier (such as a branch,
 * tag, HEAD, commit ID, or other fully qualified reference).
 * </p>
 * </li>
 * </ul>
 * <p>
 * Merges, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchDescribeMergeConflicts</a>, which returns information about conflicts in a merge between commits in a
 * repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateUnreferencedMergeCommit</a>, which creates an unreferenced commit between two branches or commits for the
 * purpose of comparing them and identifying any potential conflicts.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMergeConflicts</a>, which returns information about merge conflicts between the base, source, and
 * destination versions of a file in a potential merge.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeCommit</a>, which returns information about the merge between a source and destination commit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeConflicts</a>, which returns information about merge conflicts between the source and destination branch
 * in a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeOptions</a>, which returns information about the available merge options between two branches or commit
 * specifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesByFastForward</a>, which merges two branches using the fast-forward merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesBySquash</a>, which merges two branches using the squash merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesByThreeWay</a>, which merges two branches using the three-way merge option.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pull requests, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePullRequest</a>, which creates a pull request in a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreatePullRequestApprovalRule</a>, which creates an approval rule for a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePullRequestApprovalRule</a>, which deletes an approval rule for a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePullRequestEvents</a>, which returns information about one or more pull request events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>EvaluatePullRequestApprovalRules</a>, which evaluates whether a pull request has met all the conditions specified
 * in its associated approval rules.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForPullRequest</a>, which returns information about comments on a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequest</a>, which returns information about a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequestApprovalStates</a>, which returns information about the approval states for a specified pull
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequestOverrideState</a>, which returns information about whether approval rules have been set aside
 * (overriden) for a pull request, and if so, the Amazon Resource Name (ARN) of the user or identity that overrode the
 * rules and their requirements for the pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPullRequests</a>, which lists all pull requests for a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestByFastForward</a>, which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the fast-forward merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestBySquash</a>, which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the squash merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestByThreeWay</a>. which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the three-way merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>OverridePullRequestApprovalRules</a>, which sets aside all approval rule requirements for a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForPullRequest</a>, which posts a comment to a pull request at the specified line, file, or request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestApprovalRuleContent</a>, which updates the structure of an approval rule for a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestApprovalState</a>, which updates the state of an approval on a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestDescription</a>, which updates the description of a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestStatus</a>, which updates the status of a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestTitle</a>, which updates the title of a pull request.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Approval rule templates, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AssociateApprovalRuleTemplateWithRepository</a>, which associates a template with a specified repository. After
 * the template is associated with a repository, AWS CodeCommit creates approval rules that match the template
 * conditions on every pull request created in the specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchAssociateApprovalRuleTemplateWithRepositories</a>, which associates a template with one or more specified
 * repositories. After the template is associated with a repository, AWS CodeCommit creates approval rules that match
 * the template conditions on every pull request created in the specified repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchDisassociateApprovalRuleTemplateFromRepositories</a>, which removes the association between a template and
 * specified repositories so that approval rules based on the template are not automatically created when pull requests
 * are created in those repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateApprovalRuleTemplate</a>, which creates a template for approval rules that can then be associated with one
 * or more repositories in your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteApprovalRuleTemplate</a>, which deletes the specified template. It does not remove approval rules on pull
 * requests already created with the template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisassociateApprovalRuleTemplateFromRepository</a>, which removes the association between a template and a
 * repository so that approval rules based on the template are not automatically created when pull requests are created
 * in the specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetApprovalRuleTemplate</a>, which returns information about an approval rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListApprovalRuleTemplates</a>, which lists all approval rule templates in the AWS Region in your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAssociatedApprovalRuleTemplatesForRepository</a>, which lists all approval rule templates that are associated
 * with a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRepositoriesForApprovalRuleTemplate</a>, which lists all repositories associated with the specified approval
 * rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateDescription</a>, which updates the description of an approval rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateName</a>, which updates the name of an approval rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateContent</a>, which updates the content of an approval rule template.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Comments in a repository, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteCommentContent</a>, which deletes the content of a comment on a commit in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetComment</a>, which returns information about a comment on a commit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentReactions</a>, which returns information about emoji reactions to comments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForComparedCommit</a>, which returns information about comments on the comparison between two commit
 * specifiers in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForComparedCommit</a>, which creates a comment on the comparison between two commit specifiers in a
 * repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentReply</a>, which creates a reply to a comment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutCommentReaction</a>, which creates or updates an emoji reaction to a comment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateComment</a>, which updates the content of a comment on a commit in a repository.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Tags used to tag resources in AWS CodeCommit (not Git tags), by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS
 * CodeCommit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in AWS CodeCommit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in AWS CodeCommit.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Triggers, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetRepositoryTriggers</a>, which returns information about triggers configured for a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutRepositoryTriggers</a>, which replaces all triggers for a repository and can be used to create or delete
 * triggers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TestRepositoryTriggers</a>, which tests the functionality of a repository trigger by sending data to the trigger
 * target.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeCommit, see the <a
 * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeCommitAsync extends AWSCodeCommit {

    /**
     * <p>
     * Creates an association between an approval rule template and a specified repository. Then, the next time a pull
     * request is created in the repository where the destination reference (if specified) matches the destination
     * reference (branch) for the pull request, an approval rule that matches the template conditions is automatically
     * created for that pull request. If no destination references are specified in the template, an approval rule that
     * matches the template contents is created for all pull requests in that repository.
     * </p>
     * 
     * @param associateApprovalRuleTemplateWithRepositoryRequest
     * @return A Java Future containing the result of the AssociateApprovalRuleTemplateWithRepository operation returned
     *         by the service.
     * @sample AWSCodeCommitAsync.AssociateApprovalRuleTemplateWithRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/AssociateApprovalRuleTemplateWithRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateApprovalRuleTemplateWithRepositoryResult> associateApprovalRuleTemplateWithRepositoryAsync(
            AssociateApprovalRuleTemplateWithRepositoryRequest associateApprovalRuleTemplateWithRepositoryRequest);

    /**
     * <p>
     * Creates an association between an approval rule template and a specified repository. Then, the next time a pull
     * request is created in the repository where the destination reference (if specified) matches the destination
     * reference (branch) for the pull request, an approval rule that matches the template conditions is automatically
     * created for that pull request. If no destination references are specified in the template, an approval rule that
     * matches the template contents is created for all pull requests in that repository.
     * </p>
     * 
     * @param associateApprovalRuleTemplateWithRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateApprovalRuleTemplateWithRepository operation returned
     *         by the service.
     * @sample AWSCodeCommitAsyncHandler.AssociateApprovalRuleTemplateWithRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/AssociateApprovalRuleTemplateWithRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateApprovalRuleTemplateWithRepositoryResult> associateApprovalRuleTemplateWithRepositoryAsync(
            AssociateApprovalRuleTemplateWithRepositoryRequest associateApprovalRuleTemplateWithRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateApprovalRuleTemplateWithRepositoryRequest, AssociateApprovalRuleTemplateWithRepositoryResult> asyncHandler);

    /**
     * <p>
     * Creates an association between an approval rule template and one or more specified repositories.
     * </p>
     * 
     * @param batchAssociateApprovalRuleTemplateWithRepositoriesRequest
     * @return A Java Future containing the result of the BatchAssociateApprovalRuleTemplateWithRepositories operation
     *         returned by the service.
     * @sample AWSCodeCommitAsync.BatchAssociateApprovalRuleTemplateWithRepositories
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchAssociateApprovalRuleTemplateWithRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateApprovalRuleTemplateWithRepositoriesResult> batchAssociateApprovalRuleTemplateWithRepositoriesAsync(
            BatchAssociateApprovalRuleTemplateWithRepositoriesRequest batchAssociateApprovalRuleTemplateWithRepositoriesRequest);

    /**
     * <p>
     * Creates an association between an approval rule template and one or more specified repositories.
     * </p>
     * 
     * @param batchAssociateApprovalRuleTemplateWithRepositoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAssociateApprovalRuleTemplateWithRepositories operation
     *         returned by the service.
     * @sample AWSCodeCommitAsyncHandler.BatchAssociateApprovalRuleTemplateWithRepositories
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchAssociateApprovalRuleTemplateWithRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateApprovalRuleTemplateWithRepositoriesResult> batchAssociateApprovalRuleTemplateWithRepositoriesAsync(
            BatchAssociateApprovalRuleTemplateWithRepositoriesRequest batchAssociateApprovalRuleTemplateWithRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateApprovalRuleTemplateWithRepositoriesRequest, BatchAssociateApprovalRuleTemplateWithRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
     * squash or three-way merge strategy.
     * </p>
     * 
     * @param batchDescribeMergeConflictsRequest
     * @return A Java Future containing the result of the BatchDescribeMergeConflicts operation returned by the service.
     * @sample AWSCodeCommitAsync.BatchDescribeMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDescribeMergeConflicts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDescribeMergeConflictsResult> batchDescribeMergeConflictsAsync(
            BatchDescribeMergeConflictsRequest batchDescribeMergeConflictsRequest);

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
     * squash or three-way merge strategy.
     * </p>
     * 
     * @param batchDescribeMergeConflictsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDescribeMergeConflicts operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.BatchDescribeMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDescribeMergeConflicts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDescribeMergeConflictsResult> batchDescribeMergeConflictsAsync(
            BatchDescribeMergeConflictsRequest batchDescribeMergeConflictsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDescribeMergeConflictsRequest, BatchDescribeMergeConflictsResult> asyncHandler);

    /**
     * <p>
     * Removes the association between an approval rule template and one or more specified repositories.
     * </p>
     * 
     * @param batchDisassociateApprovalRuleTemplateFromRepositoriesRequest
     * @return A Java Future containing the result of the BatchDisassociateApprovalRuleTemplateFromRepositories
     *         operation returned by the service.
     * @sample AWSCodeCommitAsync.BatchDisassociateApprovalRuleTemplateFromRepositories
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDisassociateApprovalRuleTemplateFromRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> batchDisassociateApprovalRuleTemplateFromRepositoriesAsync(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest batchDisassociateApprovalRuleTemplateFromRepositoriesRequest);

    /**
     * <p>
     * Removes the association between an approval rule template and one or more specified repositories.
     * </p>
     * 
     * @param batchDisassociateApprovalRuleTemplateFromRepositoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisassociateApprovalRuleTemplateFromRepositories
     *         operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.BatchDisassociateApprovalRuleTemplateFromRepositories
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDisassociateApprovalRuleTemplateFromRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> batchDisassociateApprovalRuleTemplateFromRepositoriesAsync(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest batchDisassociateApprovalRuleTemplateFromRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest, BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the contents of one or more commits in a repository.
     * </p>
     * 
     * @param batchGetCommitsRequest
     * @return A Java Future containing the result of the BatchGetCommits operation returned by the service.
     * @sample AWSCodeCommitAsync.BatchGetCommits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetCommits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCommitsResult> batchGetCommitsAsync(BatchGetCommitsRequest batchGetCommitsRequest);

    /**
     * <p>
     * Returns information about the contents of one or more commits in a repository.
     * </p>
     * 
     * @param batchGetCommitsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetCommits operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.BatchGetCommits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetCommits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCommitsResult> batchGetCommitsAsync(BatchGetCommitsRequest batchGetCommitsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetCommitsRequest, BatchGetCommitsResult> asyncHandler);

    /**
     * <p>
     * Returns information about one or more repositories.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param batchGetRepositoriesRequest
     *        Represents the input of a batch get repositories operation.
     * @return A Java Future containing the result of the BatchGetRepositories operation returned by the service.
     * @sample AWSCodeCommitAsync.BatchGetRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(BatchGetRepositoriesRequest batchGetRepositoriesRequest);

    /**
     * <p>
     * Returns information about one or more repositories.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param batchGetRepositoriesRequest
     *        Represents the input of a batch get repositories operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetRepositories operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.BatchGetRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(BatchGetRepositoriesRequest batchGetRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetRepositoriesRequest, BatchGetRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Creates a template for approval rules that can then be associated with one or more repositories in your AWS
     * account. When you associate a template with a repository, AWS CodeCommit creates an approval rule that matches
     * the conditions of the template for all pull requests that meet the conditions of the template. For more
     * information, see <a>AssociateApprovalRuleTemplateWithRepository</a>.
     * </p>
     * 
     * @param createApprovalRuleTemplateRequest
     * @return A Java Future containing the result of the CreateApprovalRuleTemplate operation returned by the service.
     * @sample AWSCodeCommitAsync.CreateApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApprovalRuleTemplateResult> createApprovalRuleTemplateAsync(
            CreateApprovalRuleTemplateRequest createApprovalRuleTemplateRequest);

    /**
     * <p>
     * Creates a template for approval rules that can then be associated with one or more repositories in your AWS
     * account. When you associate a template with a repository, AWS CodeCommit creates an approval rule that matches
     * the conditions of the template for all pull requests that meet the conditions of the template. For more
     * information, see <a>AssociateApprovalRuleTemplateWithRepository</a>.
     * </p>
     * 
     * @param createApprovalRuleTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApprovalRuleTemplate operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreateApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApprovalRuleTemplateResult> createApprovalRuleTemplateAsync(
            CreateApprovalRuleTemplateRequest createApprovalRuleTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApprovalRuleTemplateRequest, CreateApprovalRuleTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a branch in a repository and points the branch to a commit.
     * </p>
     * <note>
     * <p>
     * Calling the create branch operation does not set a repository's default branch. To do this, call the update
     * default branch operation.
     * </p>
     * </note>
     * 
     * @param createBranchRequest
     *        Represents the input of a create branch operation.
     * @return A Java Future containing the result of the CreateBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest createBranchRequest);

    /**
     * <p>
     * Creates a branch in a repository and points the branch to a commit.
     * </p>
     * <note>
     * <p>
     * Calling the create branch operation does not set a repository's default branch. To do this, call the update
     * default branch operation.
     * </p>
     * </note>
     * 
     * @param createBranchRequest
     *        Represents the input of a create branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBranch operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest createBranchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, CreateBranchResult> asyncHandler);

    /**
     * <p>
     * Creates a commit for a repository on the tip of a specified branch.
     * </p>
     * 
     * @param createCommitRequest
     * @return A Java Future containing the result of the CreateCommit operation returned by the service.
     * @sample AWSCodeCommitAsync.CreateCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCommitResult> createCommitAsync(CreateCommitRequest createCommitRequest);

    /**
     * <p>
     * Creates a commit for a repository on the tip of a specified branch.
     * </p>
     * 
     * @param createCommitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCommit operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreateCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCommitResult> createCommitAsync(CreateCommitRequest createCommitRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCommitRequest, CreateCommitResult> asyncHandler);

    /**
     * <p>
     * Creates a pull request in the specified repository.
     * </p>
     * 
     * @param createPullRequestRequest
     * @return A Java Future containing the result of the CreatePullRequest operation returned by the service.
     * @sample AWSCodeCommitAsync.CreatePullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequest" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePullRequestResult> createPullRequestAsync(CreatePullRequestRequest createPullRequestRequest);

    /**
     * <p>
     * Creates a pull request in the specified repository.
     * </p>
     * 
     * @param createPullRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePullRequest operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreatePullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequest" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePullRequestResult> createPullRequestAsync(CreatePullRequestRequest createPullRequestRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePullRequestRequest, CreatePullRequestResult> asyncHandler);

    /**
     * <p>
     * Creates an approval rule for a pull request.
     * </p>
     * 
     * @param createPullRequestApprovalRuleRequest
     * @return A Java Future containing the result of the CreatePullRequestApprovalRule operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.CreatePullRequestApprovalRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequestApprovalRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePullRequestApprovalRuleResult> createPullRequestApprovalRuleAsync(
            CreatePullRequestApprovalRuleRequest createPullRequestApprovalRuleRequest);

    /**
     * <p>
     * Creates an approval rule for a pull request.
     * </p>
     * 
     * @param createPullRequestApprovalRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePullRequestApprovalRule operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.CreatePullRequestApprovalRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequestApprovalRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePullRequestApprovalRuleResult> createPullRequestApprovalRuleAsync(
            CreatePullRequestApprovalRuleRequest createPullRequestApprovalRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePullRequestApprovalRuleRequest, CreatePullRequestApprovalRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSCodeCommitAsync.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Creates an unreferenced commit that represents the result of merging two branches using a specified merge
     * strategy. This can help you determine the outcome of a potential merge. This API cannot be used with the
     * fast-forward merge strategy because that strategy does not create a merge commit.
     * </p>
     * <note>
     * <p>
     * This unreferenced merge commit can only be accessed using the GetCommit API or through git commands such as git
     * fetch. To retrieve this commit, you must specify its commit ID or otherwise reference it.
     * </p>
     * </note>
     * 
     * @param createUnreferencedMergeCommitRequest
     * @return A Java Future containing the result of the CreateUnreferencedMergeCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.CreateUnreferencedMergeCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateUnreferencedMergeCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUnreferencedMergeCommitResult> createUnreferencedMergeCommitAsync(
            CreateUnreferencedMergeCommitRequest createUnreferencedMergeCommitRequest);

    /**
     * <p>
     * Creates an unreferenced commit that represents the result of merging two branches using a specified merge
     * strategy. This can help you determine the outcome of a potential merge. This API cannot be used with the
     * fast-forward merge strategy because that strategy does not create a merge commit.
     * </p>
     * <note>
     * <p>
     * This unreferenced merge commit can only be accessed using the GetCommit API or through git commands such as git
     * fetch. To retrieve this commit, you must specify its commit ID or otherwise reference it.
     * </p>
     * </note>
     * 
     * @param createUnreferencedMergeCommitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUnreferencedMergeCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.CreateUnreferencedMergeCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateUnreferencedMergeCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUnreferencedMergeCommitResult> createUnreferencedMergeCommitAsync(
            CreateUnreferencedMergeCommitRequest createUnreferencedMergeCommitRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUnreferencedMergeCommitRequest, CreateUnreferencedMergeCommitResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified approval rule template. Deleting a template does not remove approval rules on pull requests
     * already created with the template.
     * </p>
     * 
     * @param deleteApprovalRuleTemplateRequest
     * @return A Java Future containing the result of the DeleteApprovalRuleTemplate operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApprovalRuleTemplateResult> deleteApprovalRuleTemplateAsync(
            DeleteApprovalRuleTemplateRequest deleteApprovalRuleTemplateRequest);

    /**
     * <p>
     * Deletes a specified approval rule template. Deleting a template does not remove approval rules on pull requests
     * already created with the template.
     * </p>
     * 
     * @param deleteApprovalRuleTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApprovalRuleTemplate operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApprovalRuleTemplateResult> deleteApprovalRuleTemplateAsync(
            DeleteApprovalRuleTemplateRequest deleteApprovalRuleTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApprovalRuleTemplateRequest, DeleteApprovalRuleTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a branch from a repository, unless that branch is the default branch for the repository.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Represents the input of a delete branch operation.
     * @return A Java Future containing the result of the DeleteBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest deleteBranchRequest);

    /**
     * <p>
     * Deletes a branch from a repository, unless that branch is the default branch for the repository.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Represents the input of a delete branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBranch operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest deleteBranchRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBranchRequest, DeleteBranchResult> asyncHandler);

    /**
     * <p>
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param deleteCommentContentRequest
     * @return A Java Future containing the result of the DeleteCommentContent operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteCommentContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteCommentContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCommentContentResult> deleteCommentContentAsync(DeleteCommentContentRequest deleteCommentContentRequest);

    /**
     * <p>
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param deleteCommentContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCommentContent operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteCommentContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteCommentContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCommentContentResult> deleteCommentContentAsync(DeleteCommentContentRequest deleteCommentContentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCommentContentRequest, DeleteCommentContentResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision.
     * The file still exists in the commits earlier to the commit that contains the deletion.
     * </p>
     * 
     * @param deleteFileRequest
     * @return A Java Future containing the result of the DeleteFile operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileResult> deleteFileAsync(DeleteFileRequest deleteFileRequest);

    /**
     * <p>
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision.
     * The file still exists in the commits earlier to the commit that contains the deletion.
     * </p>
     * 
     * @param deleteFileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFile operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileResult> deleteFileAsync(DeleteFileRequest deleteFileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileRequest, DeleteFileResult> asyncHandler);

    /**
     * <p>
     * Deletes an approval rule from a specified pull request. Approval rules can be deleted from a pull request only if
     * the pull request is open, and if the approval rule was created specifically for a pull request and not generated
     * from an approval rule template associated with the repository where the pull request was created. You cannot
     * delete an approval rule from a merged or closed pull request.
     * </p>
     * 
     * @param deletePullRequestApprovalRuleRequest
     * @return A Java Future containing the result of the DeletePullRequestApprovalRule operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.DeletePullRequestApprovalRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeletePullRequestApprovalRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePullRequestApprovalRuleResult> deletePullRequestApprovalRuleAsync(
            DeletePullRequestApprovalRuleRequest deletePullRequestApprovalRuleRequest);

    /**
     * <p>
     * Deletes an approval rule from a specified pull request. Approval rules can be deleted from a pull request only if
     * the pull request is open, and if the approval rule was created specifically for a pull request and not generated
     * from an approval rule template associated with the repository where the pull request was created. You cannot
     * delete an approval rule from a merged or closed pull request.
     * </p>
     * 
     * @param deletePullRequestApprovalRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePullRequestApprovalRule operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.DeletePullRequestApprovalRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeletePullRequestApprovalRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePullRequestApprovalRuleResult> deletePullRequestApprovalRuleAsync(
            DeletePullRequestApprovalRuleRequest deletePullRequestApprovalRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePullRequestApprovalRuleRequest, DeletePullRequestApprovalRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a null repository ID is returned.
     * </p>
     * <important>
     * <p>
     * Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future
     * push calls to the deleted repository fail.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a null repository ID is returned.
     * </p>
     * <important>
     * <p>
     * Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future
     * push calls to the deleted repository fail.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler);

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
     * squash or three-way merge strategy. If the merge option for the attempted merge is specified as
     * FAST_FORWARD_MERGE, an exception is thrown.
     * </p>
     * 
     * @param describeMergeConflictsRequest
     * @return A Java Future containing the result of the DescribeMergeConflicts operation returned by the service.
     * @sample AWSCodeCommitAsync.DescribeMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribeMergeConflicts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMergeConflictsResult> describeMergeConflictsAsync(DescribeMergeConflictsRequest describeMergeConflictsRequest);

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
     * squash or three-way merge strategy. If the merge option for the attempted merge is specified as
     * FAST_FORWARD_MERGE, an exception is thrown.
     * </p>
     * 
     * @param describeMergeConflictsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMergeConflicts operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DescribeMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribeMergeConflicts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMergeConflictsResult> describeMergeConflictsAsync(DescribeMergeConflictsRequest describeMergeConflictsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMergeConflictsRequest, DescribeMergeConflictsResult> asyncHandler);

    /**
     * <p>
     * Returns information about one or more pull request events.
     * </p>
     * 
     * @param describePullRequestEventsRequest
     * @return A Java Future containing the result of the DescribePullRequestEvents operation returned by the service.
     * @sample AWSCodeCommitAsync.DescribePullRequestEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribePullRequestEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePullRequestEventsResult> describePullRequestEventsAsync(
            DescribePullRequestEventsRequest describePullRequestEventsRequest);

    /**
     * <p>
     * Returns information about one or more pull request events.
     * </p>
     * 
     * @param describePullRequestEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePullRequestEvents operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DescribePullRequestEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribePullRequestEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePullRequestEventsResult> describePullRequestEventsAsync(
            DescribePullRequestEventsRequest describePullRequestEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePullRequestEventsRequest, DescribePullRequestEventsResult> asyncHandler);

    /**
     * <p>
     * Removes the association between a template and a repository so that approval rules based on the template are not
     * automatically created when pull requests are created in the specified repository. This does not delete any
     * approval rules previously created for pull requests through the template association.
     * </p>
     * 
     * @param disassociateApprovalRuleTemplateFromRepositoryRequest
     * @return A Java Future containing the result of the DisassociateApprovalRuleTemplateFromRepository operation
     *         returned by the service.
     * @sample AWSCodeCommitAsync.DisassociateApprovalRuleTemplateFromRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DisassociateApprovalRuleTemplateFromRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateApprovalRuleTemplateFromRepositoryResult> disassociateApprovalRuleTemplateFromRepositoryAsync(
            DisassociateApprovalRuleTemplateFromRepositoryRequest disassociateApprovalRuleTemplateFromRepositoryRequest);

    /**
     * <p>
     * Removes the association between a template and a repository so that approval rules based on the template are not
     * automatically created when pull requests are created in the specified repository. This does not delete any
     * approval rules previously created for pull requests through the template association.
     * </p>
     * 
     * @param disassociateApprovalRuleTemplateFromRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateApprovalRuleTemplateFromRepository operation
     *         returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DisassociateApprovalRuleTemplateFromRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DisassociateApprovalRuleTemplateFromRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateApprovalRuleTemplateFromRepositoryResult> disassociateApprovalRuleTemplateFromRepositoryAsync(
            DisassociateApprovalRuleTemplateFromRepositoryRequest disassociateApprovalRuleTemplateFromRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateApprovalRuleTemplateFromRepositoryRequest, DisassociateApprovalRuleTemplateFromRepositoryResult> asyncHandler);

    /**
     * <p>
     * Evaluates whether a pull request has met all the conditions specified in its associated approval rules.
     * </p>
     * 
     * @param evaluatePullRequestApprovalRulesRequest
     * @return A Java Future containing the result of the EvaluatePullRequestApprovalRules operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.EvaluatePullRequestApprovalRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/EvaluatePullRequestApprovalRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EvaluatePullRequestApprovalRulesResult> evaluatePullRequestApprovalRulesAsync(
            EvaluatePullRequestApprovalRulesRequest evaluatePullRequestApprovalRulesRequest);

    /**
     * <p>
     * Evaluates whether a pull request has met all the conditions specified in its associated approval rules.
     * </p>
     * 
     * @param evaluatePullRequestApprovalRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EvaluatePullRequestApprovalRules operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.EvaluatePullRequestApprovalRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/EvaluatePullRequestApprovalRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EvaluatePullRequestApprovalRulesResult> evaluatePullRequestApprovalRulesAsync(
            EvaluatePullRequestApprovalRulesRequest evaluatePullRequestApprovalRulesRequest,
            com.amazonaws.handlers.AsyncHandler<EvaluatePullRequestApprovalRulesRequest, EvaluatePullRequestApprovalRulesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specified approval rule template.
     * </p>
     * 
     * @param getApprovalRuleTemplateRequest
     * @return A Java Future containing the result of the GetApprovalRuleTemplate operation returned by the service.
     * @sample AWSCodeCommitAsync.GetApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApprovalRuleTemplateResult> getApprovalRuleTemplateAsync(GetApprovalRuleTemplateRequest getApprovalRuleTemplateRequest);

    /**
     * <p>
     * Returns information about a specified approval rule template.
     * </p>
     * 
     * @param getApprovalRuleTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApprovalRuleTemplate operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApprovalRuleTemplateResult> getApprovalRuleTemplateAsync(GetApprovalRuleTemplateRequest getApprovalRuleTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetApprovalRuleTemplateRequest, GetApprovalRuleTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns the base-64 encoded content of an individual blob in a repository.
     * </p>
     * 
     * @param getBlobRequest
     *        Represents the input of a get blob operation.
     * @return A Java Future containing the result of the GetBlob operation returned by the service.
     * @sample AWSCodeCommitAsync.GetBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBlob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlobResult> getBlobAsync(GetBlobRequest getBlobRequest);

    /**
     * <p>
     * Returns the base-64 encoded content of an individual blob in a repository.
     * </p>
     * 
     * @param getBlobRequest
     *        Represents the input of a get blob operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBlob operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBlob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlobResult> getBlobAsync(GetBlobRequest getBlobRequest,
            com.amazonaws.handlers.AsyncHandler<GetBlobRequest, GetBlobResult> asyncHandler);

    /**
     * <p>
     * Returns information about a repository branch, including its name and the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @return A Java Future containing the result of the GetBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest getBranchRequest);

    /**
     * <p>
     * Returns information about a repository branch, including its name and the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBranch operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest getBranchRequest,
            com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler);

    /**
     * <p>
     * Returns the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a
     * count of reactions from active identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentRequest
     * @return A Java Future containing the result of the GetComment operation returned by the service.
     * @sample AWSCodeCommitAsync.GetComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommentResult> getCommentAsync(GetCommentRequest getCommentRequest);

    /**
     * <p>
     * Returns the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a
     * count of reactions from active identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComment operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommentResult> getCommentAsync(GetCommentRequest getCommentRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommentRequest, GetCommentResult> asyncHandler);

    /**
     * <p>
     * Returns information about reactions to a specified comment ID. Reactions from users who have been deleted will
     * not be included in the count.
     * </p>
     * 
     * @param getCommentReactionsRequest
     * @return A Java Future containing the result of the GetCommentReactions operation returned by the service.
     * @sample AWSCodeCommitAsync.GetCommentReactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentReactions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentReactionsResult> getCommentReactionsAsync(GetCommentReactionsRequest getCommentReactionsRequest);

    /**
     * <p>
     * Returns information about reactions to a specified comment ID. Reactions from users who have been deleted will
     * not be included in the count.
     * </p>
     * 
     * @param getCommentReactionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommentReactions operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetCommentReactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentReactions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentReactionsResult> getCommentReactionsAsync(GetCommentReactionsRequest getCommentReactionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommentReactionsRequest, GetCommentReactionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about comments made on the comparison between two commits.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a
     * count of reactions from active identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentsForComparedCommitRequest
     * @return A Java Future containing the result of the GetCommentsForComparedCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.GetCommentsForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentsForComparedCommitResult> getCommentsForComparedCommitAsync(
            GetCommentsForComparedCommitRequest getCommentsForComparedCommitRequest);

    /**
     * <p>
     * Returns information about comments made on the comparison between two commits.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a
     * count of reactions from active identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentsForComparedCommitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommentsForComparedCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.GetCommentsForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentsForComparedCommitResult> getCommentsForComparedCommitAsync(
            GetCommentsForComparedCommitRequest getCommentsForComparedCommitRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommentsForComparedCommitRequest, GetCommentsForComparedCommitResult> asyncHandler);

    /**
     * <p>
     * Returns comments made on a pull request.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a
     * count of reactions from active identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentsForPullRequestRequest
     * @return A Java Future containing the result of the GetCommentsForPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsync.GetCommentsForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentsForPullRequestResult> getCommentsForPullRequestAsync(
            GetCommentsForPullRequestRequest getCommentsForPullRequestRequest);

    /**
     * <p>
     * Returns comments made on a pull request.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a
     * count of reactions from active identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentsForPullRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommentsForPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetCommentsForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentsForPullRequestResult> getCommentsForPullRequestAsync(
            GetCommentsForPullRequestRequest getCommentsForPullRequestRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommentsForPullRequestRequest, GetCommentsForPullRequestResult> asyncHandler);

    /**
     * <p>
     * Returns information about a commit, including commit message and committer information.
     * </p>
     * 
     * @param getCommitRequest
     *        Represents the input of a get commit operation.
     * @return A Java Future containing the result of the GetCommit operation returned by the service.
     * @sample AWSCodeCommitAsync.GetCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest getCommitRequest);

    /**
     * <p>
     * Returns information about a commit, including commit message and committer information.
     * </p>
     * 
     * @param getCommitRequest
     *        Represents the input of a get commit operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommit operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest getCommitRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommitRequest, GetCommitResult> asyncHandler);

    /**
     * <p>
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID, or
     * other fully qualified reference). Results can be limited to a specified path.
     * </p>
     * 
     * @param getDifferencesRequest
     * @return A Java Future containing the result of the GetDifferences operation returned by the service.
     * @sample AWSCodeCommitAsync.GetDifferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetDifferences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDifferencesResult> getDifferencesAsync(GetDifferencesRequest getDifferencesRequest);

    /**
     * <p>
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID, or
     * other fully qualified reference). Results can be limited to a specified path.
     * </p>
     * 
     * @param getDifferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDifferences operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetDifferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetDifferences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDifferencesResult> getDifferencesAsync(GetDifferencesRequest getDifferencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDifferencesRequest, GetDifferencesResult> asyncHandler);

    /**
     * <p>
     * Returns the base-64 encoded contents of a specified file and its metadata.
     * </p>
     * 
     * @param getFileRequest
     * @return A Java Future containing the result of the GetFile operation returned by the service.
     * @sample AWSCodeCommitAsync.GetFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFileResult> getFileAsync(GetFileRequest getFileRequest);

    /**
     * <p>
     * Returns the base-64 encoded contents of a specified file and its metadata.
     * </p>
     * 
     * @param getFileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFile operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFileResult> getFileAsync(GetFileRequest getFileRequest,
            com.amazonaws.handlers.AsyncHandler<GetFileRequest, GetFileResult> asyncHandler);

    /**
     * <p>
     * Returns the contents of a specified folder in a repository.
     * </p>
     * 
     * @param getFolderRequest
     * @return A Java Future containing the result of the GetFolder operation returned by the service.
     * @sample AWSCodeCommitAsync.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest getFolderRequest);

    /**
     * <p>
     * Returns the contents of a specified folder in a repository.
     * </p>
     * 
     * @param getFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFolder operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest getFolderRequest,
            com.amazonaws.handlers.AsyncHandler<GetFolderRequest, GetFolderResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specified merge commit.
     * </p>
     * 
     * @param getMergeCommitRequest
     * @return A Java Future containing the result of the GetMergeCommit operation returned by the service.
     * @sample AWSCodeCommitAsync.GetMergeCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMergeCommitResult> getMergeCommitAsync(GetMergeCommitRequest getMergeCommitRequest);

    /**
     * <p>
     * Returns information about a specified merge commit.
     * </p>
     * 
     * @param getMergeCommitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMergeCommit operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetMergeCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMergeCommitResult> getMergeCommitAsync(GetMergeCommitRequest getMergeCommitRequest,
            com.amazonaws.handlers.AsyncHandler<GetMergeCommitRequest, GetMergeCommitResult> asyncHandler);

    /**
     * <p>
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a
     * repository.
     * </p>
     * 
     * @param getMergeConflictsRequest
     * @return A Java Future containing the result of the GetMergeConflicts operation returned by the service.
     * @sample AWSCodeCommitAsync.GetMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeConflicts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMergeConflictsResult> getMergeConflictsAsync(GetMergeConflictsRequest getMergeConflictsRequest);

    /**
     * <p>
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a
     * repository.
     * </p>
     * 
     * @param getMergeConflictsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMergeConflicts operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeConflicts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMergeConflictsResult> getMergeConflictsAsync(GetMergeConflictsRequest getMergeConflictsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMergeConflictsRequest, GetMergeConflictsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the merge options available for merging two specified branches. For details about why a
     * merge option is not available, use GetMergeConflicts or DescribeMergeConflicts.
     * </p>
     * 
     * @param getMergeOptionsRequest
     * @return A Java Future containing the result of the GetMergeOptions operation returned by the service.
     * @sample AWSCodeCommitAsync.GetMergeOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMergeOptionsResult> getMergeOptionsAsync(GetMergeOptionsRequest getMergeOptionsRequest);

    /**
     * <p>
     * Returns information about the merge options available for merging two specified branches. For details about why a
     * merge option is not available, use GetMergeConflicts or DescribeMergeConflicts.
     * </p>
     * 
     * @param getMergeOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMergeOptions operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetMergeOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeOptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMergeOptionsResult> getMergeOptionsAsync(GetMergeOptionsRequest getMergeOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMergeOptionsRequest, GetMergeOptionsResult> asyncHandler);

    /**
     * <p>
     * Gets information about a pull request in a specified repository.
     * </p>
     * 
     * @param getPullRequestRequest
     * @return A Java Future containing the result of the GetPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsync.GetPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPullRequestResult> getPullRequestAsync(GetPullRequestRequest getPullRequestRequest);

    /**
     * <p>
     * Gets information about a pull request in a specified repository.
     * </p>
     * 
     * @param getPullRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPullRequestResult> getPullRequestAsync(GetPullRequestRequest getPullRequestRequest,
            com.amazonaws.handlers.AsyncHandler<GetPullRequestRequest, GetPullRequestResult> asyncHandler);

    /**
     * <p>
     * Gets information about the approval states for a specified pull request. Approval states only apply to pull
     * requests that have one or more approval rules applied to them.
     * </p>
     * 
     * @param getPullRequestApprovalStatesRequest
     * @return A Java Future containing the result of the GetPullRequestApprovalStates operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.GetPullRequestApprovalStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequestApprovalStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPullRequestApprovalStatesResult> getPullRequestApprovalStatesAsync(
            GetPullRequestApprovalStatesRequest getPullRequestApprovalStatesRequest);

    /**
     * <p>
     * Gets information about the approval states for a specified pull request. Approval states only apply to pull
     * requests that have one or more approval rules applied to them.
     * </p>
     * 
     * @param getPullRequestApprovalStatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPullRequestApprovalStates operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.GetPullRequestApprovalStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequestApprovalStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPullRequestApprovalStatesResult> getPullRequestApprovalStatesAsync(
            GetPullRequestApprovalStatesRequest getPullRequestApprovalStatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetPullRequestApprovalStatesRequest, GetPullRequestApprovalStatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about whether approval rules have been set aside (overridden) for a pull request, and if so,
     * the Amazon Resource Name (ARN) of the user or identity that overrode the rules and their requirements for the
     * pull request.
     * </p>
     * 
     * @param getPullRequestOverrideStateRequest
     * @return A Java Future containing the result of the GetPullRequestOverrideState operation returned by the service.
     * @sample AWSCodeCommitAsync.GetPullRequestOverrideState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequestOverrideState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPullRequestOverrideStateResult> getPullRequestOverrideStateAsync(
            GetPullRequestOverrideStateRequest getPullRequestOverrideStateRequest);

    /**
     * <p>
     * Returns information about whether approval rules have been set aside (overridden) for a pull request, and if so,
     * the Amazon Resource Name (ARN) of the user or identity that overrode the rules and their requirements for the
     * pull request.
     * </p>
     * 
     * @param getPullRequestOverrideStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPullRequestOverrideState operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetPullRequestOverrideState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequestOverrideState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPullRequestOverrideStateResult> getPullRequestOverrideStateAsync(
            GetPullRequestOverrideStateRequest getPullRequestOverrideStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetPullRequestOverrideStateRequest, GetPullRequestOverrideStateResult> asyncHandler);

    /**
     * <p>
     * Returns information about a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param getRepositoryRequest
     *        Represents the input of a get repository operation.
     * @return A Java Future containing the result of the GetRepository operation returned by the service.
     * @sample AWSCodeCommitAsync.GetRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest getRepositoryRequest);

    /**
     * <p>
     * Returns information about a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param getRepositoryRequest
     *        Represents the input of a get repository operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepository operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest getRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryRequest, GetRepositoryResult> asyncHandler);

    /**
     * <p>
     * Gets information about triggers configured for a repository.
     * </p>
     * 
     * @param getRepositoryTriggersRequest
     *        Represents the input of a get repository triggers operation.
     * @return A Java Future containing the result of the GetRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsync.GetRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(GetRepositoryTriggersRequest getRepositoryTriggersRequest);

    /**
     * <p>
     * Gets information about triggers configured for a repository.
     * </p>
     * 
     * @param getRepositoryTriggersRequest
     *        Represents the input of a get repository triggers operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(GetRepositoryTriggersRequest getRepositoryTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryTriggersRequest, GetRepositoryTriggersResult> asyncHandler);

    /**
     * <p>
     * Lists all approval rule templates in the specified AWS Region in your AWS account. If an AWS Region is not
     * specified, the AWS Region where you are signed in is used.
     * </p>
     * 
     * @param listApprovalRuleTemplatesRequest
     * @return A Java Future containing the result of the ListApprovalRuleTemplates operation returned by the service.
     * @sample AWSCodeCommitAsync.ListApprovalRuleTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListApprovalRuleTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApprovalRuleTemplatesResult> listApprovalRuleTemplatesAsync(
            ListApprovalRuleTemplatesRequest listApprovalRuleTemplatesRequest);

    /**
     * <p>
     * Lists all approval rule templates in the specified AWS Region in your AWS account. If an AWS Region is not
     * specified, the AWS Region where you are signed in is used.
     * </p>
     * 
     * @param listApprovalRuleTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApprovalRuleTemplates operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListApprovalRuleTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListApprovalRuleTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApprovalRuleTemplatesResult> listApprovalRuleTemplatesAsync(
            ListApprovalRuleTemplatesRequest listApprovalRuleTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListApprovalRuleTemplatesRequest, ListApprovalRuleTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists all approval rule templates that are associated with a specified repository.
     * </p>
     * 
     * @param listAssociatedApprovalRuleTemplatesForRepositoryRequest
     * @return A Java Future containing the result of the ListAssociatedApprovalRuleTemplatesForRepository operation
     *         returned by the service.
     * @sample AWSCodeCommitAsync.ListAssociatedApprovalRuleTemplatesForRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListAssociatedApprovalRuleTemplatesForRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedApprovalRuleTemplatesForRepositoryResult> listAssociatedApprovalRuleTemplatesForRepositoryAsync(
            ListAssociatedApprovalRuleTemplatesForRepositoryRequest listAssociatedApprovalRuleTemplatesForRepositoryRequest);

    /**
     * <p>
     * Lists all approval rule templates that are associated with a specified repository.
     * </p>
     * 
     * @param listAssociatedApprovalRuleTemplatesForRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedApprovalRuleTemplatesForRepository operation
     *         returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListAssociatedApprovalRuleTemplatesForRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListAssociatedApprovalRuleTemplatesForRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedApprovalRuleTemplatesForRepositoryResult> listAssociatedApprovalRuleTemplatesForRepositoryAsync(
            ListAssociatedApprovalRuleTemplatesForRepositoryRequest listAssociatedApprovalRuleTemplatesForRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedApprovalRuleTemplatesForRepositoryRequest, ListAssociatedApprovalRuleTemplatesForRepositoryResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @return A Java Future containing the result of the ListBranches operation returned by the service.
     * @sample AWSCodeCommitAsync.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest listBranchesRequest);

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBranches operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest listBranchesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status
     * or pull request author ARN.
     * </p>
     * 
     * @param listPullRequestsRequest
     * @return A Java Future containing the result of the ListPullRequests operation returned by the service.
     * @sample AWSCodeCommitAsync.ListPullRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListPullRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPullRequestsResult> listPullRequestsAsync(ListPullRequestsRequest listPullRequestsRequest);

    /**
     * <p>
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status
     * or pull request author ARN.
     * </p>
     * 
     * @param listPullRequestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPullRequests operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListPullRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListPullRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPullRequestsResult> listPullRequestsAsync(ListPullRequestsRequest listPullRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPullRequestsRequest, ListPullRequestsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSCodeCommitAsync.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Lists all repositories associated with the specified approval rule template.
     * </p>
     * 
     * @param listRepositoriesForApprovalRuleTemplateRequest
     * @return A Java Future containing the result of the ListRepositoriesForApprovalRuleTemplate operation returned by
     *         the service.
     * @sample AWSCodeCommitAsync.ListRepositoriesForApprovalRuleTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositoriesForApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesForApprovalRuleTemplateResult> listRepositoriesForApprovalRuleTemplateAsync(
            ListRepositoriesForApprovalRuleTemplateRequest listRepositoriesForApprovalRuleTemplateRequest);

    /**
     * <p>
     * Lists all repositories associated with the specified approval rule template.
     * </p>
     * 
     * @param listRepositoriesForApprovalRuleTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositoriesForApprovalRuleTemplate operation returned by
     *         the service.
     * @sample AWSCodeCommitAsyncHandler.ListRepositoriesForApprovalRuleTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositoriesForApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesForApprovalRuleTemplateResult> listRepositoriesForApprovalRuleTemplateAsync(
            ListRepositoriesForApprovalRuleTemplateRequest listRepositoriesForApprovalRuleTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesForApprovalRuleTemplateRequest, ListRepositoriesForApprovalRuleTemplateResult> asyncHandler);

    /**
     * <p>
     * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeCommit. For a list of valid
     * resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the<i> AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCodeCommitAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeCommit. For a list of valid
     * resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the<i> AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Merges two branches using the fast-forward merge strategy.
     * </p>
     * 
     * @param mergeBranchesByFastForwardRequest
     * @return A Java Future containing the result of the MergeBranchesByFastForward operation returned by the service.
     * @sample AWSCodeCommitAsync.MergeBranchesByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeBranchesByFastForwardResult> mergeBranchesByFastForwardAsync(
            MergeBranchesByFastForwardRequest mergeBranchesByFastForwardRequest);

    /**
     * <p>
     * Merges two branches using the fast-forward merge strategy.
     * </p>
     * 
     * @param mergeBranchesByFastForwardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergeBranchesByFastForward operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.MergeBranchesByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeBranchesByFastForwardResult> mergeBranchesByFastForwardAsync(
            MergeBranchesByFastForwardRequest mergeBranchesByFastForwardRequest,
            com.amazonaws.handlers.AsyncHandler<MergeBranchesByFastForwardRequest, MergeBranchesByFastForwardResult> asyncHandler);

    /**
     * <p>
     * Merges two branches using the squash merge strategy.
     * </p>
     * 
     * @param mergeBranchesBySquashRequest
     * @return A Java Future containing the result of the MergeBranchesBySquash operation returned by the service.
     * @sample AWSCodeCommitAsync.MergeBranchesBySquash
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesBySquash"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeBranchesBySquashResult> mergeBranchesBySquashAsync(MergeBranchesBySquashRequest mergeBranchesBySquashRequest);

    /**
     * <p>
     * Merges two branches using the squash merge strategy.
     * </p>
     * 
     * @param mergeBranchesBySquashRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergeBranchesBySquash operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.MergeBranchesBySquash
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesBySquash"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeBranchesBySquashResult> mergeBranchesBySquashAsync(MergeBranchesBySquashRequest mergeBranchesBySquashRequest,
            com.amazonaws.handlers.AsyncHandler<MergeBranchesBySquashRequest, MergeBranchesBySquashResult> asyncHandler);

    /**
     * <p>
     * Merges two specified branches using the three-way merge strategy.
     * </p>
     * 
     * @param mergeBranchesByThreeWayRequest
     * @return A Java Future containing the result of the MergeBranchesByThreeWay operation returned by the service.
     * @sample AWSCodeCommitAsync.MergeBranchesByThreeWay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByThreeWay"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeBranchesByThreeWayResult> mergeBranchesByThreeWayAsync(MergeBranchesByThreeWayRequest mergeBranchesByThreeWayRequest);

    /**
     * <p>
     * Merges two specified branches using the three-way merge strategy.
     * </p>
     * 
     * @param mergeBranchesByThreeWayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergeBranchesByThreeWay operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.MergeBranchesByThreeWay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByThreeWay"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeBranchesByThreeWayResult> mergeBranchesByThreeWayAsync(MergeBranchesByThreeWayRequest mergeBranchesByThreeWayRequest,
            com.amazonaws.handlers.AsyncHandler<MergeBranchesByThreeWayRequest, MergeBranchesByThreeWayResult> asyncHandler);

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the fast-forward merge strategy. If the merge is successful, it closes the pull
     * request.
     * </p>
     * 
     * @param mergePullRequestByFastForwardRequest
     * @return A Java Future containing the result of the MergePullRequestByFastForward operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.MergePullRequestByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergePullRequestByFastForwardResult> mergePullRequestByFastForwardAsync(
            MergePullRequestByFastForwardRequest mergePullRequestByFastForwardRequest);

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the fast-forward merge strategy. If the merge is successful, it closes the pull
     * request.
     * </p>
     * 
     * @param mergePullRequestByFastForwardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergePullRequestByFastForward operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.MergePullRequestByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergePullRequestByFastForwardResult> mergePullRequestByFastForwardAsync(
            MergePullRequestByFastForwardRequest mergePullRequestByFastForwardRequest,
            com.amazonaws.handlers.AsyncHandler<MergePullRequestByFastForwardRequest, MergePullRequestByFastForwardResult> asyncHandler);

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the squash merge strategy. If the merge is successful, it closes the pull request.
     * </p>
     * 
     * @param mergePullRequestBySquashRequest
     * @return A Java Future containing the result of the MergePullRequestBySquash operation returned by the service.
     * @sample AWSCodeCommitAsync.MergePullRequestBySquash
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestBySquash"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergePullRequestBySquashResult> mergePullRequestBySquashAsync(MergePullRequestBySquashRequest mergePullRequestBySquashRequest);

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the squash merge strategy. If the merge is successful, it closes the pull request.
     * </p>
     * 
     * @param mergePullRequestBySquashRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergePullRequestBySquash operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.MergePullRequestBySquash
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestBySquash"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergePullRequestBySquashResult> mergePullRequestBySquashAsync(MergePullRequestBySquashRequest mergePullRequestBySquashRequest,
            com.amazonaws.handlers.AsyncHandler<MergePullRequestBySquashRequest, MergePullRequestBySquashResult> asyncHandler);

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the three-way merge strategy. If the merge is successful, it closes the pull
     * request.
     * </p>
     * 
     * @param mergePullRequestByThreeWayRequest
     * @return A Java Future containing the result of the MergePullRequestByThreeWay operation returned by the service.
     * @sample AWSCodeCommitAsync.MergePullRequestByThreeWay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByThreeWay"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergePullRequestByThreeWayResult> mergePullRequestByThreeWayAsync(
            MergePullRequestByThreeWayRequest mergePullRequestByThreeWayRequest);

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the three-way merge strategy. If the merge is successful, it closes the pull
     * request.
     * </p>
     * 
     * @param mergePullRequestByThreeWayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergePullRequestByThreeWay operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.MergePullRequestByThreeWay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByThreeWay"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergePullRequestByThreeWayResult> mergePullRequestByThreeWayAsync(
            MergePullRequestByThreeWayRequest mergePullRequestByThreeWayRequest,
            com.amazonaws.handlers.AsyncHandler<MergePullRequestByThreeWayRequest, MergePullRequestByThreeWayResult> asyncHandler);

    /**
     * <p>
     * Sets aside (overrides) all approval rule requirements for a specified pull request.
     * </p>
     * 
     * @param overridePullRequestApprovalRulesRequest
     * @return A Java Future containing the result of the OverridePullRequestApprovalRules operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.OverridePullRequestApprovalRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/OverridePullRequestApprovalRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<OverridePullRequestApprovalRulesResult> overridePullRequestApprovalRulesAsync(
            OverridePullRequestApprovalRulesRequest overridePullRequestApprovalRulesRequest);

    /**
     * <p>
     * Sets aside (overrides) all approval rule requirements for a specified pull request.
     * </p>
     * 
     * @param overridePullRequestApprovalRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the OverridePullRequestApprovalRules operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.OverridePullRequestApprovalRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/OverridePullRequestApprovalRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<OverridePullRequestApprovalRulesResult> overridePullRequestApprovalRulesAsync(
            OverridePullRequestApprovalRulesRequest overridePullRequestApprovalRulesRequest,
            com.amazonaws.handlers.AsyncHandler<OverridePullRequestApprovalRulesRequest, OverridePullRequestApprovalRulesResult> asyncHandler);

    /**
     * <p>
     * Posts a comment on the comparison between two commits.
     * </p>
     * 
     * @param postCommentForComparedCommitRequest
     * @return A Java Future containing the result of the PostCommentForComparedCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.PostCommentForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentForComparedCommitResult> postCommentForComparedCommitAsync(
            PostCommentForComparedCommitRequest postCommentForComparedCommitRequest);

    /**
     * <p>
     * Posts a comment on the comparison between two commits.
     * </p>
     * 
     * @param postCommentForComparedCommitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostCommentForComparedCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.PostCommentForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentForComparedCommitResult> postCommentForComparedCommitAsync(
            PostCommentForComparedCommitRequest postCommentForComparedCommitRequest,
            com.amazonaws.handlers.AsyncHandler<PostCommentForComparedCommitRequest, PostCommentForComparedCommitResult> asyncHandler);

    /**
     * <p>
     * Posts a comment on a pull request.
     * </p>
     * 
     * @param postCommentForPullRequestRequest
     * @return A Java Future containing the result of the PostCommentForPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsync.PostCommentForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentForPullRequestResult> postCommentForPullRequestAsync(
            PostCommentForPullRequestRequest postCommentForPullRequestRequest);

    /**
     * <p>
     * Posts a comment on a pull request.
     * </p>
     * 
     * @param postCommentForPullRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostCommentForPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PostCommentForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentForPullRequestResult> postCommentForPullRequestAsync(
            PostCommentForPullRequestRequest postCommentForPullRequestRequest,
            com.amazonaws.handlers.AsyncHandler<PostCommentForPullRequestRequest, PostCommentForPullRequestResult> asyncHandler);

    /**
     * <p>
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     * </p>
     * 
     * @param postCommentReplyRequest
     * @return A Java Future containing the result of the PostCommentReply operation returned by the service.
     * @sample AWSCodeCommitAsync.PostCommentReply
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentReply" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentReplyResult> postCommentReplyAsync(PostCommentReplyRequest postCommentReplyRequest);

    /**
     * <p>
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     * </p>
     * 
     * @param postCommentReplyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostCommentReply operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PostCommentReply
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentReply" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentReplyResult> postCommentReplyAsync(PostCommentReplyRequest postCommentReplyRequest,
            com.amazonaws.handlers.AsyncHandler<PostCommentReplyRequest, PostCommentReplyResult> asyncHandler);

    /**
     * <p>
     * Adds or updates a reaction to a specified comment for the user whose identity is used to make the request. You
     * can only add or update a reaction for yourself. You cannot add, modify, or delete a reaction for another user.
     * </p>
     * 
     * @param putCommentReactionRequest
     * @return A Java Future containing the result of the PutCommentReaction operation returned by the service.
     * @sample AWSCodeCommitAsync.PutCommentReaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutCommentReaction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutCommentReactionResult> putCommentReactionAsync(PutCommentReactionRequest putCommentReactionRequest);

    /**
     * <p>
     * Adds or updates a reaction to a specified comment for the user whose identity is used to make the request. You
     * can only add or update a reaction for yourself. You cannot add, modify, or delete a reaction for another user.
     * </p>
     * 
     * @param putCommentReactionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutCommentReaction operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PutCommentReaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutCommentReaction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutCommentReactionResult> putCommentReactionAsync(PutCommentReactionRequest putCommentReactionRequest,
            com.amazonaws.handlers.AsyncHandler<PutCommentReactionRequest, PutCommentReactionResult> asyncHandler);

    /**
     * <p>
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in
     * the specified branch.
     * </p>
     * 
     * @param putFileRequest
     * @return A Java Future containing the result of the PutFile operation returned by the service.
     * @sample AWSCodeCommitAsync.PutFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFileResult> putFileAsync(PutFileRequest putFileRequest);

    /**
     * <p>
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in
     * the specified branch.
     * </p>
     * 
     * @param putFileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFile operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PutFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFileResult> putFileAsync(PutFileRequest putFileRequest,
            com.amazonaws.handlers.AsyncHandler<PutFileRequest, PutFileResult> asyncHandler);

    /**
     * <p>
     * Replaces all triggers for a repository. Used to create or delete triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest
     *        Represents the input of a put repository triggers operation.
     * @return A Java Future containing the result of the PutRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsync.PutRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(PutRepositoryTriggersRequest putRepositoryTriggersRequest);

    /**
     * <p>
     * Replaces all triggers for a repository. Used to create or delete triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest
     *        Represents the input of a put repository triggers operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PutRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(PutRepositoryTriggersRequest putRepositoryTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<PutRepositoryTriggersRequest, PutRepositoryTriggersResult> asyncHandler);

    /**
     * <p>
     * Adds or updates tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see <a
     * href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCodeCommitAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see <a
     * href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is
     * available in the repository, the test sends data from the last commit. If no data is available, sample data is
     * generated.
     * </p>
     * 
     * @param testRepositoryTriggersRequest
     *        Represents the input of a test repository triggers operation.
     * @return A Java Future containing the result of the TestRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsync.TestRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TestRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest testRepositoryTriggersRequest);

    /**
     * <p>
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is
     * available in the repository, the test sends data from the last commit. If no data is available, sample data is
     * generated.
     * </p>
     * 
     * @param testRepositoryTriggersRequest
     *        Represents the input of a test repository triggers operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.TestRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TestRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest testRepositoryTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<TestRepositoryTriggersRequest, TestRepositoryTriggersResult> asyncHandler);

    /**
     * <p>
     * Removes tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCodeCommitAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the content of an approval rule template. You can change the number of required approvals, the membership
     * of the approval rule, and whether an approval pool is defined.
     * </p>
     * 
     * @param updateApprovalRuleTemplateContentRequest
     * @return A Java Future containing the result of the UpdateApprovalRuleTemplateContent operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.UpdateApprovalRuleTemplateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApprovalRuleTemplateContentResult> updateApprovalRuleTemplateContentAsync(
            UpdateApprovalRuleTemplateContentRequest updateApprovalRuleTemplateContentRequest);

    /**
     * <p>
     * Updates the content of an approval rule template. You can change the number of required approvals, the membership
     * of the approval rule, and whether an approval pool is defined.
     * </p>
     * 
     * @param updateApprovalRuleTemplateContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApprovalRuleTemplateContent operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.UpdateApprovalRuleTemplateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApprovalRuleTemplateContentResult> updateApprovalRuleTemplateContentAsync(
            UpdateApprovalRuleTemplateContentRequest updateApprovalRuleTemplateContentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateContentRequest, UpdateApprovalRuleTemplateContentResult> asyncHandler);

    /**
     * <p>
     * Updates the description for a specified approval rule template.
     * </p>
     * 
     * @param updateApprovalRuleTemplateDescriptionRequest
     * @return A Java Future containing the result of the UpdateApprovalRuleTemplateDescription operation returned by
     *         the service.
     * @sample AWSCodeCommitAsync.UpdateApprovalRuleTemplateDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApprovalRuleTemplateDescriptionResult> updateApprovalRuleTemplateDescriptionAsync(
            UpdateApprovalRuleTemplateDescriptionRequest updateApprovalRuleTemplateDescriptionRequest);

    /**
     * <p>
     * Updates the description for a specified approval rule template.
     * </p>
     * 
     * @param updateApprovalRuleTemplateDescriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApprovalRuleTemplateDescription operation returned by
     *         the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateApprovalRuleTemplateDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApprovalRuleTemplateDescriptionResult> updateApprovalRuleTemplateDescriptionAsync(
            UpdateApprovalRuleTemplateDescriptionRequest updateApprovalRuleTemplateDescriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateDescriptionRequest, UpdateApprovalRuleTemplateDescriptionResult> asyncHandler);

    /**
     * <p>
     * Updates the name of a specified approval rule template.
     * </p>
     * 
     * @param updateApprovalRuleTemplateNameRequest
     * @return A Java Future containing the result of the UpdateApprovalRuleTemplateName operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.UpdateApprovalRuleTemplateName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApprovalRuleTemplateNameResult> updateApprovalRuleTemplateNameAsync(
            UpdateApprovalRuleTemplateNameRequest updateApprovalRuleTemplateNameRequest);

    /**
     * <p>
     * Updates the name of a specified approval rule template.
     * </p>
     * 
     * @param updateApprovalRuleTemplateNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApprovalRuleTemplateName operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.UpdateApprovalRuleTemplateName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApprovalRuleTemplateNameResult> updateApprovalRuleTemplateNameAsync(
            UpdateApprovalRuleTemplateNameRequest updateApprovalRuleTemplateNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateNameRequest, UpdateApprovalRuleTemplateNameResult> asyncHandler);

    /**
     * <p>
     * Replaces the contents of a comment.
     * </p>
     * 
     * @param updateCommentRequest
     * @return A Java Future containing the result of the UpdateComment operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCommentResult> updateCommentAsync(UpdateCommentRequest updateCommentRequest);

    /**
     * <p>
     * Replaces the contents of a comment.
     * </p>
     * 
     * @param updateCommentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateComment operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCommentResult> updateCommentAsync(UpdateCommentRequest updateCommentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCommentRequest, UpdateCommentResult> asyncHandler);

    /**
     * <p>
     * Sets or changes the default branch name for the specified repository.
     * </p>
     * <note>
     * <p>
     * If you use this operation to change the default branch name to the current default branch name, a success message
     * is returned even though the default branch did not change.
     * </p>
     * </note>
     * 
     * @param updateDefaultBranchRequest
     *        Represents the input of an update default branch operation.
     * @return A Java Future containing the result of the UpdateDefaultBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdateDefaultBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateDefaultBranch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest updateDefaultBranchRequest);

    /**
     * <p>
     * Sets or changes the default branch name for the specified repository.
     * </p>
     * <note>
     * <p>
     * If you use this operation to change the default branch name to the current default branch name, a success message
     * is returned even though the default branch did not change.
     * </p>
     * </note>
     * 
     * @param updateDefaultBranchRequest
     *        Represents the input of an update default branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDefaultBranch operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateDefaultBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateDefaultBranch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest updateDefaultBranchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDefaultBranchRequest, UpdateDefaultBranchResult> asyncHandler);

    /**
     * <p>
     * Updates the structure of an approval rule created specifically for a pull request. For example, you can change
     * the number of required approvers and the approval pool for approvers.
     * </p>
     * 
     * @param updatePullRequestApprovalRuleContentRequest
     * @return A Java Future containing the result of the UpdatePullRequestApprovalRuleContent operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.UpdatePullRequestApprovalRuleContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestApprovalRuleContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestApprovalRuleContentResult> updatePullRequestApprovalRuleContentAsync(
            UpdatePullRequestApprovalRuleContentRequest updatePullRequestApprovalRuleContentRequest);

    /**
     * <p>
     * Updates the structure of an approval rule created specifically for a pull request. For example, you can change
     * the number of required approvers and the approval pool for approvers.
     * </p>
     * 
     * @param updatePullRequestApprovalRuleContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePullRequestApprovalRuleContent operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.UpdatePullRequestApprovalRuleContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestApprovalRuleContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestApprovalRuleContentResult> updatePullRequestApprovalRuleContentAsync(
            UpdatePullRequestApprovalRuleContentRequest updatePullRequestApprovalRuleContentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestApprovalRuleContentRequest, UpdatePullRequestApprovalRuleContentResult> asyncHandler);

    /**
     * <p>
     * Updates the state of a user's approval on a pull request. The user is derived from the signed-in account when the
     * request is made.
     * </p>
     * 
     * @param updatePullRequestApprovalStateRequest
     * @return A Java Future containing the result of the UpdatePullRequestApprovalState operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.UpdatePullRequestApprovalState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestApprovalState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestApprovalStateResult> updatePullRequestApprovalStateAsync(
            UpdatePullRequestApprovalStateRequest updatePullRequestApprovalStateRequest);

    /**
     * <p>
     * Updates the state of a user's approval on a pull request. The user is derived from the signed-in account when the
     * request is made.
     * </p>
     * 
     * @param updatePullRequestApprovalStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePullRequestApprovalState operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.UpdatePullRequestApprovalState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestApprovalState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestApprovalStateResult> updatePullRequestApprovalStateAsync(
            UpdatePullRequestApprovalStateRequest updatePullRequestApprovalStateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestApprovalStateRequest, UpdatePullRequestApprovalStateResult> asyncHandler);

    /**
     * <p>
     * Replaces the contents of the description of a pull request.
     * </p>
     * 
     * @param updatePullRequestDescriptionRequest
     * @return A Java Future containing the result of the UpdatePullRequestDescription operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.UpdatePullRequestDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestDescriptionResult> updatePullRequestDescriptionAsync(
            UpdatePullRequestDescriptionRequest updatePullRequestDescriptionRequest);

    /**
     * <p>
     * Replaces the contents of the description of a pull request.
     * </p>
     * 
     * @param updatePullRequestDescriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePullRequestDescription operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.UpdatePullRequestDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestDescriptionResult> updatePullRequestDescriptionAsync(
            UpdatePullRequestDescriptionRequest updatePullRequestDescriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestDescriptionRequest, UpdatePullRequestDescriptionResult> asyncHandler);

    /**
     * <p>
     * Updates the status of a pull request.
     * </p>
     * 
     * @param updatePullRequestStatusRequest
     * @return A Java Future containing the result of the UpdatePullRequestStatus operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdatePullRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestStatusResult> updatePullRequestStatusAsync(UpdatePullRequestStatusRequest updatePullRequestStatusRequest);

    /**
     * <p>
     * Updates the status of a pull request.
     * </p>
     * 
     * @param updatePullRequestStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePullRequestStatus operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdatePullRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestStatusResult> updatePullRequestStatusAsync(UpdatePullRequestStatusRequest updatePullRequestStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestStatusRequest, UpdatePullRequestStatusResult> asyncHandler);

    /**
     * <p>
     * Replaces the title of a pull request.
     * </p>
     * 
     * @param updatePullRequestTitleRequest
     * @return A Java Future containing the result of the UpdatePullRequestTitle operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdatePullRequestTitle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestTitle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestTitleResult> updatePullRequestTitleAsync(UpdatePullRequestTitleRequest updatePullRequestTitleRequest);

    /**
     * <p>
     * Replaces the title of a pull request.
     * </p>
     * 
     * @param updatePullRequestTitleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePullRequestTitle operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdatePullRequestTitle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestTitle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestTitleResult> updatePullRequestTitleAsync(UpdatePullRequestTitleRequest updatePullRequestTitleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestTitleRequest, UpdatePullRequestTitleResult> asyncHandler);

    /**
     * <p>
     * Sets or changes the comment or description for a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param updateRepositoryDescriptionRequest
     *        Represents the input of an update repository description operation.
     * @return A Java Future containing the result of the UpdateRepositoryDescription operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdateRepositoryDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest);

    /**
     * <p>
     * Sets or changes the comment or description for a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param updateRepositoryDescriptionRequest
     *        Represents the input of an update repository description operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRepositoryDescription operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateRepositoryDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryDescriptionRequest, UpdateRepositoryDescriptionResult> asyncHandler);

    /**
     * <p>
     * Renames a repository. The repository name must be unique across the calling AWS account. Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix
     * .git is prohibited. For more information about the limits on repository names, see <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">Limits</a> in the AWS CodeCommit User
     * Guide.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description operation.
     * @return A Java Future containing the result of the UpdateRepositoryName operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdateRepositoryName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest updateRepositoryNameRequest);

    /**
     * <p>
     * Renames a repository. The repository name must be unique across the calling AWS account. Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix
     * .git is prohibited. For more information about the limits on repository names, see <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">Limits</a> in the AWS CodeCommit User
     * Guide.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRepositoryName operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateRepositoryName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest updateRepositoryNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryNameRequest, UpdateRepositoryNameResult> asyncHandler);

}
