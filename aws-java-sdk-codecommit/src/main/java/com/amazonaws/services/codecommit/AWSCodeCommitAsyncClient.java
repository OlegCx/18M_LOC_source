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

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing CodeCommit asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeCommitAsyncClient extends AWSCodeCommitClient implements AWSCodeCommitAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeCommit (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeCommitAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeCommitAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCodeCommitAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeCommitAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeCommitAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCodeCommitAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeCommitAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCodeCommitAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCodeCommitAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSCodeCommitAsyncClientBuilder asyncBuilder() {
        return AWSCodeCommitAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCodeCommitAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCodeCommitAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateApprovalRuleTemplateWithRepositoryResult> associateApprovalRuleTemplateWithRepositoryAsync(
            AssociateApprovalRuleTemplateWithRepositoryRequest request) {

        return associateApprovalRuleTemplateWithRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateApprovalRuleTemplateWithRepositoryResult> associateApprovalRuleTemplateWithRepositoryAsync(
            final AssociateApprovalRuleTemplateWithRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateApprovalRuleTemplateWithRepositoryRequest, AssociateApprovalRuleTemplateWithRepositoryResult> asyncHandler) {
        final AssociateApprovalRuleTemplateWithRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateApprovalRuleTemplateWithRepositoryResult>() {
            @Override
            public AssociateApprovalRuleTemplateWithRepositoryResult call() throws Exception {
                AssociateApprovalRuleTemplateWithRepositoryResult result = null;

                try {
                    result = executeAssociateApprovalRuleTemplateWithRepository(finalRequest);
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
    public java.util.concurrent.Future<BatchAssociateApprovalRuleTemplateWithRepositoriesResult> batchAssociateApprovalRuleTemplateWithRepositoriesAsync(
            BatchAssociateApprovalRuleTemplateWithRepositoriesRequest request) {

        return batchAssociateApprovalRuleTemplateWithRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateApprovalRuleTemplateWithRepositoriesResult> batchAssociateApprovalRuleTemplateWithRepositoriesAsync(
            final BatchAssociateApprovalRuleTemplateWithRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateApprovalRuleTemplateWithRepositoriesRequest, BatchAssociateApprovalRuleTemplateWithRepositoriesResult> asyncHandler) {
        final BatchAssociateApprovalRuleTemplateWithRepositoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateApprovalRuleTemplateWithRepositoriesResult>() {
            @Override
            public BatchAssociateApprovalRuleTemplateWithRepositoriesResult call() throws Exception {
                BatchAssociateApprovalRuleTemplateWithRepositoriesResult result = null;

                try {
                    result = executeBatchAssociateApprovalRuleTemplateWithRepositories(finalRequest);
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
    public java.util.concurrent.Future<BatchDescribeMergeConflictsResult> batchDescribeMergeConflictsAsync(BatchDescribeMergeConflictsRequest request) {

        return batchDescribeMergeConflictsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDescribeMergeConflictsResult> batchDescribeMergeConflictsAsync(final BatchDescribeMergeConflictsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDescribeMergeConflictsRequest, BatchDescribeMergeConflictsResult> asyncHandler) {
        final BatchDescribeMergeConflictsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDescribeMergeConflictsResult>() {
            @Override
            public BatchDescribeMergeConflictsResult call() throws Exception {
                BatchDescribeMergeConflictsResult result = null;

                try {
                    result = executeBatchDescribeMergeConflicts(finalRequest);
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
    public java.util.concurrent.Future<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> batchDisassociateApprovalRuleTemplateFromRepositoriesAsync(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest request) {

        return batchDisassociateApprovalRuleTemplateFromRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> batchDisassociateApprovalRuleTemplateFromRepositoriesAsync(
            final BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest, BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> asyncHandler) {
        final BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult>() {
            @Override
            public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult call() throws Exception {
                BatchDisassociateApprovalRuleTemplateFromRepositoriesResult result = null;

                try {
                    result = executeBatchDisassociateApprovalRuleTemplateFromRepositories(finalRequest);
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
    public java.util.concurrent.Future<BatchGetCommitsResult> batchGetCommitsAsync(BatchGetCommitsRequest request) {

        return batchGetCommitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetCommitsResult> batchGetCommitsAsync(final BatchGetCommitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetCommitsRequest, BatchGetCommitsResult> asyncHandler) {
        final BatchGetCommitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetCommitsResult>() {
            @Override
            public BatchGetCommitsResult call() throws Exception {
                BatchGetCommitsResult result = null;

                try {
                    result = executeBatchGetCommits(finalRequest);
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
    public java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(BatchGetRepositoriesRequest request) {

        return batchGetRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(final BatchGetRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetRepositoriesRequest, BatchGetRepositoriesResult> asyncHandler) {
        final BatchGetRepositoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetRepositoriesResult>() {
            @Override
            public BatchGetRepositoriesResult call() throws Exception {
                BatchGetRepositoriesResult result = null;

                try {
                    result = executeBatchGetRepositories(finalRequest);
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
    public java.util.concurrent.Future<CreateApprovalRuleTemplateResult> createApprovalRuleTemplateAsync(CreateApprovalRuleTemplateRequest request) {

        return createApprovalRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApprovalRuleTemplateResult> createApprovalRuleTemplateAsync(final CreateApprovalRuleTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApprovalRuleTemplateRequest, CreateApprovalRuleTemplateResult> asyncHandler) {
        final CreateApprovalRuleTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApprovalRuleTemplateResult>() {
            @Override
            public CreateApprovalRuleTemplateResult call() throws Exception {
                CreateApprovalRuleTemplateResult result = null;

                try {
                    result = executeCreateApprovalRuleTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest request) {

        return createBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBranchResult> createBranchAsync(final CreateBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, CreateBranchResult> asyncHandler) {
        final CreateBranchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBranchResult>() {
            @Override
            public CreateBranchResult call() throws Exception {
                CreateBranchResult result = null;

                try {
                    result = executeCreateBranch(finalRequest);
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
    public java.util.concurrent.Future<CreateCommitResult> createCommitAsync(CreateCommitRequest request) {

        return createCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCommitResult> createCommitAsync(final CreateCommitRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCommitRequest, CreateCommitResult> asyncHandler) {
        final CreateCommitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCommitResult>() {
            @Override
            public CreateCommitResult call() throws Exception {
                CreateCommitResult result = null;

                try {
                    result = executeCreateCommit(finalRequest);
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
    public java.util.concurrent.Future<CreatePullRequestResult> createPullRequestAsync(CreatePullRequestRequest request) {

        return createPullRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestResult> createPullRequestAsync(final CreatePullRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePullRequestRequest, CreatePullRequestResult> asyncHandler) {
        final CreatePullRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePullRequestResult>() {
            @Override
            public CreatePullRequestResult call() throws Exception {
                CreatePullRequestResult result = null;

                try {
                    result = executeCreatePullRequest(finalRequest);
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
    public java.util.concurrent.Future<CreatePullRequestApprovalRuleResult> createPullRequestApprovalRuleAsync(CreatePullRequestApprovalRuleRequest request) {

        return createPullRequestApprovalRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestApprovalRuleResult> createPullRequestApprovalRuleAsync(
            final CreatePullRequestApprovalRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePullRequestApprovalRuleRequest, CreatePullRequestApprovalRuleResult> asyncHandler) {
        final CreatePullRequestApprovalRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePullRequestApprovalRuleResult>() {
            @Override
            public CreatePullRequestApprovalRuleResult call() throws Exception {
                CreatePullRequestApprovalRuleResult result = null;

                try {
                    result = executeCreatePullRequestApprovalRule(finalRequest);
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
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest request) {

        return createRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(final CreateRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler) {
        final CreateRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRepositoryResult>() {
            @Override
            public CreateRepositoryResult call() throws Exception {
                CreateRepositoryResult result = null;

                try {
                    result = executeCreateRepository(finalRequest);
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
    public java.util.concurrent.Future<CreateUnreferencedMergeCommitResult> createUnreferencedMergeCommitAsync(CreateUnreferencedMergeCommitRequest request) {

        return createUnreferencedMergeCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUnreferencedMergeCommitResult> createUnreferencedMergeCommitAsync(
            final CreateUnreferencedMergeCommitRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUnreferencedMergeCommitRequest, CreateUnreferencedMergeCommitResult> asyncHandler) {
        final CreateUnreferencedMergeCommitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUnreferencedMergeCommitResult>() {
            @Override
            public CreateUnreferencedMergeCommitResult call() throws Exception {
                CreateUnreferencedMergeCommitResult result = null;

                try {
                    result = executeCreateUnreferencedMergeCommit(finalRequest);
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
    public java.util.concurrent.Future<DeleteApprovalRuleTemplateResult> deleteApprovalRuleTemplateAsync(DeleteApprovalRuleTemplateRequest request) {

        return deleteApprovalRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApprovalRuleTemplateResult> deleteApprovalRuleTemplateAsync(final DeleteApprovalRuleTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApprovalRuleTemplateRequest, DeleteApprovalRuleTemplateResult> asyncHandler) {
        final DeleteApprovalRuleTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApprovalRuleTemplateResult>() {
            @Override
            public DeleteApprovalRuleTemplateResult call() throws Exception {
                DeleteApprovalRuleTemplateResult result = null;

                try {
                    result = executeDeleteApprovalRuleTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest request) {

        return deleteBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(final DeleteBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBranchRequest, DeleteBranchResult> asyncHandler) {
        final DeleteBranchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBranchResult>() {
            @Override
            public DeleteBranchResult call() throws Exception {
                DeleteBranchResult result = null;

                try {
                    result = executeDeleteBranch(finalRequest);
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
    public java.util.concurrent.Future<DeleteCommentContentResult> deleteCommentContentAsync(DeleteCommentContentRequest request) {

        return deleteCommentContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCommentContentResult> deleteCommentContentAsync(final DeleteCommentContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCommentContentRequest, DeleteCommentContentResult> asyncHandler) {
        final DeleteCommentContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCommentContentResult>() {
            @Override
            public DeleteCommentContentResult call() throws Exception {
                DeleteCommentContentResult result = null;

                try {
                    result = executeDeleteCommentContent(finalRequest);
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
    public java.util.concurrent.Future<DeleteFileResult> deleteFileAsync(DeleteFileRequest request) {

        return deleteFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileResult> deleteFileAsync(final DeleteFileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFileRequest, DeleteFileResult> asyncHandler) {
        final DeleteFileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFileResult>() {
            @Override
            public DeleteFileResult call() throws Exception {
                DeleteFileResult result = null;

                try {
                    result = executeDeleteFile(finalRequest);
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
    public java.util.concurrent.Future<DeletePullRequestApprovalRuleResult> deletePullRequestApprovalRuleAsync(DeletePullRequestApprovalRuleRequest request) {

        return deletePullRequestApprovalRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePullRequestApprovalRuleResult> deletePullRequestApprovalRuleAsync(
            final DeletePullRequestApprovalRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePullRequestApprovalRuleRequest, DeletePullRequestApprovalRuleResult> asyncHandler) {
        final DeletePullRequestApprovalRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePullRequestApprovalRuleResult>() {
            @Override
            public DeletePullRequestApprovalRuleResult call() throws Exception {
                DeletePullRequestApprovalRuleResult result = null;

                try {
                    result = executeDeletePullRequestApprovalRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest request) {

        return deleteRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(final DeleteRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler) {
        final DeleteRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRepositoryResult>() {
            @Override
            public DeleteRepositoryResult call() throws Exception {
                DeleteRepositoryResult result = null;

                try {
                    result = executeDeleteRepository(finalRequest);
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
    public java.util.concurrent.Future<DescribeMergeConflictsResult> describeMergeConflictsAsync(DescribeMergeConflictsRequest request) {

        return describeMergeConflictsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMergeConflictsResult> describeMergeConflictsAsync(final DescribeMergeConflictsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMergeConflictsRequest, DescribeMergeConflictsResult> asyncHandler) {
        final DescribeMergeConflictsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMergeConflictsResult>() {
            @Override
            public DescribeMergeConflictsResult call() throws Exception {
                DescribeMergeConflictsResult result = null;

                try {
                    result = executeDescribeMergeConflicts(finalRequest);
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
    public java.util.concurrent.Future<DescribePullRequestEventsResult> describePullRequestEventsAsync(DescribePullRequestEventsRequest request) {

        return describePullRequestEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePullRequestEventsResult> describePullRequestEventsAsync(final DescribePullRequestEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePullRequestEventsRequest, DescribePullRequestEventsResult> asyncHandler) {
        final DescribePullRequestEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePullRequestEventsResult>() {
            @Override
            public DescribePullRequestEventsResult call() throws Exception {
                DescribePullRequestEventsResult result = null;

                try {
                    result = executeDescribePullRequestEvents(finalRequest);
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
    public java.util.concurrent.Future<DisassociateApprovalRuleTemplateFromRepositoryResult> disassociateApprovalRuleTemplateFromRepositoryAsync(
            DisassociateApprovalRuleTemplateFromRepositoryRequest request) {

        return disassociateApprovalRuleTemplateFromRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateApprovalRuleTemplateFromRepositoryResult> disassociateApprovalRuleTemplateFromRepositoryAsync(
            final DisassociateApprovalRuleTemplateFromRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateApprovalRuleTemplateFromRepositoryRequest, DisassociateApprovalRuleTemplateFromRepositoryResult> asyncHandler) {
        final DisassociateApprovalRuleTemplateFromRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateApprovalRuleTemplateFromRepositoryResult>() {
            @Override
            public DisassociateApprovalRuleTemplateFromRepositoryResult call() throws Exception {
                DisassociateApprovalRuleTemplateFromRepositoryResult result = null;

                try {
                    result = executeDisassociateApprovalRuleTemplateFromRepository(finalRequest);
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
    public java.util.concurrent.Future<EvaluatePullRequestApprovalRulesResult> evaluatePullRequestApprovalRulesAsync(
            EvaluatePullRequestApprovalRulesRequest request) {

        return evaluatePullRequestApprovalRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EvaluatePullRequestApprovalRulesResult> evaluatePullRequestApprovalRulesAsync(
            final EvaluatePullRequestApprovalRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<EvaluatePullRequestApprovalRulesRequest, EvaluatePullRequestApprovalRulesResult> asyncHandler) {
        final EvaluatePullRequestApprovalRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EvaluatePullRequestApprovalRulesResult>() {
            @Override
            public EvaluatePullRequestApprovalRulesResult call() throws Exception {
                EvaluatePullRequestApprovalRulesResult result = null;

                try {
                    result = executeEvaluatePullRequestApprovalRules(finalRequest);
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
    public java.util.concurrent.Future<GetApprovalRuleTemplateResult> getApprovalRuleTemplateAsync(GetApprovalRuleTemplateRequest request) {

        return getApprovalRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApprovalRuleTemplateResult> getApprovalRuleTemplateAsync(final GetApprovalRuleTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApprovalRuleTemplateRequest, GetApprovalRuleTemplateResult> asyncHandler) {
        final GetApprovalRuleTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApprovalRuleTemplateResult>() {
            @Override
            public GetApprovalRuleTemplateResult call() throws Exception {
                GetApprovalRuleTemplateResult result = null;

                try {
                    result = executeGetApprovalRuleTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetBlobResult> getBlobAsync(GetBlobRequest request) {

        return getBlobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlobResult> getBlobAsync(final GetBlobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBlobRequest, GetBlobResult> asyncHandler) {
        final GetBlobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBlobResult>() {
            @Override
            public GetBlobResult call() throws Exception {
                GetBlobResult result = null;

                try {
                    result = executeGetBlob(finalRequest);
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
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest request) {

        return getBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(final GetBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler) {
        final GetBranchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBranchResult>() {
            @Override
            public GetBranchResult call() throws Exception {
                GetBranchResult result = null;

                try {
                    result = executeGetBranch(finalRequest);
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
    public java.util.concurrent.Future<GetCommentResult> getCommentAsync(GetCommentRequest request) {

        return getCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommentResult> getCommentAsync(final GetCommentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCommentRequest, GetCommentResult> asyncHandler) {
        final GetCommentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCommentResult>() {
            @Override
            public GetCommentResult call() throws Exception {
                GetCommentResult result = null;

                try {
                    result = executeGetComment(finalRequest);
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
    public java.util.concurrent.Future<GetCommentReactionsResult> getCommentReactionsAsync(GetCommentReactionsRequest request) {

        return getCommentReactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommentReactionsResult> getCommentReactionsAsync(final GetCommentReactionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCommentReactionsRequest, GetCommentReactionsResult> asyncHandler) {
        final GetCommentReactionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCommentReactionsResult>() {
            @Override
            public GetCommentReactionsResult call() throws Exception {
                GetCommentReactionsResult result = null;

                try {
                    result = executeGetCommentReactions(finalRequest);
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
    public java.util.concurrent.Future<GetCommentsForComparedCommitResult> getCommentsForComparedCommitAsync(GetCommentsForComparedCommitRequest request) {

        return getCommentsForComparedCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommentsForComparedCommitResult> getCommentsForComparedCommitAsync(final GetCommentsForComparedCommitRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCommentsForComparedCommitRequest, GetCommentsForComparedCommitResult> asyncHandler) {
        final GetCommentsForComparedCommitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCommentsForComparedCommitResult>() {
            @Override
            public GetCommentsForComparedCommitResult call() throws Exception {
                GetCommentsForComparedCommitResult result = null;

                try {
                    result = executeGetCommentsForComparedCommit(finalRequest);
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
    public java.util.concurrent.Future<GetCommentsForPullRequestResult> getCommentsForPullRequestAsync(GetCommentsForPullRequestRequest request) {

        return getCommentsForPullRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommentsForPullRequestResult> getCommentsForPullRequestAsync(final GetCommentsForPullRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCommentsForPullRequestRequest, GetCommentsForPullRequestResult> asyncHandler) {
        final GetCommentsForPullRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCommentsForPullRequestResult>() {
            @Override
            public GetCommentsForPullRequestResult call() throws Exception {
                GetCommentsForPullRequestResult result = null;

                try {
                    result = executeGetCommentsForPullRequest(finalRequest);
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
    public java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest request) {

        return getCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommitResult> getCommitAsync(final GetCommitRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCommitRequest, GetCommitResult> asyncHandler) {
        final GetCommitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCommitResult>() {
            @Override
            public GetCommitResult call() throws Exception {
                GetCommitResult result = null;

                try {
                    result = executeGetCommit(finalRequest);
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
    public java.util.concurrent.Future<GetDifferencesResult> getDifferencesAsync(GetDifferencesRequest request) {

        return getDifferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDifferencesResult> getDifferencesAsync(final GetDifferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDifferencesRequest, GetDifferencesResult> asyncHandler) {
        final GetDifferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDifferencesResult>() {
            @Override
            public GetDifferencesResult call() throws Exception {
                GetDifferencesResult result = null;

                try {
                    result = executeGetDifferences(finalRequest);
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
    public java.util.concurrent.Future<GetFileResult> getFileAsync(GetFileRequest request) {

        return getFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFileResult> getFileAsync(final GetFileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFileRequest, GetFileResult> asyncHandler) {
        final GetFileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFileResult>() {
            @Override
            public GetFileResult call() throws Exception {
                GetFileResult result = null;

                try {
                    result = executeGetFile(finalRequest);
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
    public java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest request) {

        return getFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFolderResult> getFolderAsync(final GetFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFolderRequest, GetFolderResult> asyncHandler) {
        final GetFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFolderResult>() {
            @Override
            public GetFolderResult call() throws Exception {
                GetFolderResult result = null;

                try {
                    result = executeGetFolder(finalRequest);
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
    public java.util.concurrent.Future<GetMergeCommitResult> getMergeCommitAsync(GetMergeCommitRequest request) {

        return getMergeCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMergeCommitResult> getMergeCommitAsync(final GetMergeCommitRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMergeCommitRequest, GetMergeCommitResult> asyncHandler) {
        final GetMergeCommitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMergeCommitResult>() {
            @Override
            public GetMergeCommitResult call() throws Exception {
                GetMergeCommitResult result = null;

                try {
                    result = executeGetMergeCommit(finalRequest);
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
    public java.util.concurrent.Future<GetMergeConflictsResult> getMergeConflictsAsync(GetMergeConflictsRequest request) {

        return getMergeConflictsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMergeConflictsResult> getMergeConflictsAsync(final GetMergeConflictsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMergeConflictsRequest, GetMergeConflictsResult> asyncHandler) {
        final GetMergeConflictsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMergeConflictsResult>() {
            @Override
            public GetMergeConflictsResult call() throws Exception {
                GetMergeConflictsResult result = null;

                try {
                    result = executeGetMergeConflicts(finalRequest);
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
    public java.util.concurrent.Future<GetMergeOptionsResult> getMergeOptionsAsync(GetMergeOptionsRequest request) {

        return getMergeOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMergeOptionsResult> getMergeOptionsAsync(final GetMergeOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMergeOptionsRequest, GetMergeOptionsResult> asyncHandler) {
        final GetMergeOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMergeOptionsResult>() {
            @Override
            public GetMergeOptionsResult call() throws Exception {
                GetMergeOptionsResult result = null;

                try {
                    result = executeGetMergeOptions(finalRequest);
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
    public java.util.concurrent.Future<GetPullRequestResult> getPullRequestAsync(GetPullRequestRequest request) {

        return getPullRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestResult> getPullRequestAsync(final GetPullRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPullRequestRequest, GetPullRequestResult> asyncHandler) {
        final GetPullRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPullRequestResult>() {
            @Override
            public GetPullRequestResult call() throws Exception {
                GetPullRequestResult result = null;

                try {
                    result = executeGetPullRequest(finalRequest);
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
    public java.util.concurrent.Future<GetPullRequestApprovalStatesResult> getPullRequestApprovalStatesAsync(GetPullRequestApprovalStatesRequest request) {

        return getPullRequestApprovalStatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestApprovalStatesResult> getPullRequestApprovalStatesAsync(final GetPullRequestApprovalStatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPullRequestApprovalStatesRequest, GetPullRequestApprovalStatesResult> asyncHandler) {
        final GetPullRequestApprovalStatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPullRequestApprovalStatesResult>() {
            @Override
            public GetPullRequestApprovalStatesResult call() throws Exception {
                GetPullRequestApprovalStatesResult result = null;

                try {
                    result = executeGetPullRequestApprovalStates(finalRequest);
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
    public java.util.concurrent.Future<GetPullRequestOverrideStateResult> getPullRequestOverrideStateAsync(GetPullRequestOverrideStateRequest request) {

        return getPullRequestOverrideStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestOverrideStateResult> getPullRequestOverrideStateAsync(final GetPullRequestOverrideStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPullRequestOverrideStateRequest, GetPullRequestOverrideStateResult> asyncHandler) {
        final GetPullRequestOverrideStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPullRequestOverrideStateResult>() {
            @Override
            public GetPullRequestOverrideStateResult call() throws Exception {
                GetPullRequestOverrideStateResult result = null;

                try {
                    result = executeGetPullRequestOverrideState(finalRequest);
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
    public java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest request) {

        return getRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(final GetRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryRequest, GetRepositoryResult> asyncHandler) {
        final GetRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryResult>() {
            @Override
            public GetRepositoryResult call() throws Exception {
                GetRepositoryResult result = null;

                try {
                    result = executeGetRepository(finalRequest);
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
    public java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(GetRepositoryTriggersRequest request) {

        return getRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(final GetRepositoryTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryTriggersRequest, GetRepositoryTriggersResult> asyncHandler) {
        final GetRepositoryTriggersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryTriggersResult>() {
            @Override
            public GetRepositoryTriggersResult call() throws Exception {
                GetRepositoryTriggersResult result = null;

                try {
                    result = executeGetRepositoryTriggers(finalRequest);
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
    public java.util.concurrent.Future<ListApprovalRuleTemplatesResult> listApprovalRuleTemplatesAsync(ListApprovalRuleTemplatesRequest request) {

        return listApprovalRuleTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApprovalRuleTemplatesResult> listApprovalRuleTemplatesAsync(final ListApprovalRuleTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApprovalRuleTemplatesRequest, ListApprovalRuleTemplatesResult> asyncHandler) {
        final ListApprovalRuleTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApprovalRuleTemplatesResult>() {
            @Override
            public ListApprovalRuleTemplatesResult call() throws Exception {
                ListApprovalRuleTemplatesResult result = null;

                try {
                    result = executeListApprovalRuleTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListAssociatedApprovalRuleTemplatesForRepositoryResult> listAssociatedApprovalRuleTemplatesForRepositoryAsync(
            ListAssociatedApprovalRuleTemplatesForRepositoryRequest request) {

        return listAssociatedApprovalRuleTemplatesForRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedApprovalRuleTemplatesForRepositoryResult> listAssociatedApprovalRuleTemplatesForRepositoryAsync(
            final ListAssociatedApprovalRuleTemplatesForRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociatedApprovalRuleTemplatesForRepositoryRequest, ListAssociatedApprovalRuleTemplatesForRepositoryResult> asyncHandler) {
        final ListAssociatedApprovalRuleTemplatesForRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociatedApprovalRuleTemplatesForRepositoryResult>() {
            @Override
            public ListAssociatedApprovalRuleTemplatesForRepositoryResult call() throws Exception {
                ListAssociatedApprovalRuleTemplatesForRepositoryResult result = null;

                try {
                    result = executeListAssociatedApprovalRuleTemplatesForRepository(finalRequest);
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
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest request) {

        return listBranchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(final ListBranchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler) {
        final ListBranchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBranchesResult>() {
            @Override
            public ListBranchesResult call() throws Exception {
                ListBranchesResult result = null;

                try {
                    result = executeListBranches(finalRequest);
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
    public java.util.concurrent.Future<ListPullRequestsResult> listPullRequestsAsync(ListPullRequestsRequest request) {

        return listPullRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestsResult> listPullRequestsAsync(final ListPullRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPullRequestsRequest, ListPullRequestsResult> asyncHandler) {
        final ListPullRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPullRequestsResult>() {
            @Override
            public ListPullRequestsResult call() throws Exception {
                ListPullRequestsResult result = null;

                try {
                    result = executeListPullRequests(finalRequest);
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
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest request) {

        return listRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(final ListRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler) {
        final ListRepositoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRepositoriesResult>() {
            @Override
            public ListRepositoriesResult call() throws Exception {
                ListRepositoriesResult result = null;

                try {
                    result = executeListRepositories(finalRequest);
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
    public java.util.concurrent.Future<ListRepositoriesForApprovalRuleTemplateResult> listRepositoriesForApprovalRuleTemplateAsync(
            ListRepositoriesForApprovalRuleTemplateRequest request) {

        return listRepositoriesForApprovalRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesForApprovalRuleTemplateResult> listRepositoriesForApprovalRuleTemplateAsync(
            final ListRepositoriesForApprovalRuleTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRepositoriesForApprovalRuleTemplateRequest, ListRepositoriesForApprovalRuleTemplateResult> asyncHandler) {
        final ListRepositoriesForApprovalRuleTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRepositoriesForApprovalRuleTemplateResult>() {
            @Override
            public ListRepositoriesForApprovalRuleTemplateResult call() throws Exception {
                ListRepositoriesForApprovalRuleTemplateResult result = null;

                try {
                    result = executeListRepositoriesForApprovalRuleTemplate(finalRequest);
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
    public java.util.concurrent.Future<MergeBranchesByFastForwardResult> mergeBranchesByFastForwardAsync(MergeBranchesByFastForwardRequest request) {

        return mergeBranchesByFastForwardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeBranchesByFastForwardResult> mergeBranchesByFastForwardAsync(final MergeBranchesByFastForwardRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergeBranchesByFastForwardRequest, MergeBranchesByFastForwardResult> asyncHandler) {
        final MergeBranchesByFastForwardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergeBranchesByFastForwardResult>() {
            @Override
            public MergeBranchesByFastForwardResult call() throws Exception {
                MergeBranchesByFastForwardResult result = null;

                try {
                    result = executeMergeBranchesByFastForward(finalRequest);
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
    public java.util.concurrent.Future<MergeBranchesBySquashResult> mergeBranchesBySquashAsync(MergeBranchesBySquashRequest request) {

        return mergeBranchesBySquashAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeBranchesBySquashResult> mergeBranchesBySquashAsync(final MergeBranchesBySquashRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergeBranchesBySquashRequest, MergeBranchesBySquashResult> asyncHandler) {
        final MergeBranchesBySquashRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergeBranchesBySquashResult>() {
            @Override
            public MergeBranchesBySquashResult call() throws Exception {
                MergeBranchesBySquashResult result = null;

                try {
                    result = executeMergeBranchesBySquash(finalRequest);
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
    public java.util.concurrent.Future<MergeBranchesByThreeWayResult> mergeBranchesByThreeWayAsync(MergeBranchesByThreeWayRequest request) {

        return mergeBranchesByThreeWayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeBranchesByThreeWayResult> mergeBranchesByThreeWayAsync(final MergeBranchesByThreeWayRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergeBranchesByThreeWayRequest, MergeBranchesByThreeWayResult> asyncHandler) {
        final MergeBranchesByThreeWayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergeBranchesByThreeWayResult>() {
            @Override
            public MergeBranchesByThreeWayResult call() throws Exception {
                MergeBranchesByThreeWayResult result = null;

                try {
                    result = executeMergeBranchesByThreeWay(finalRequest);
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
    public java.util.concurrent.Future<MergePullRequestByFastForwardResult> mergePullRequestByFastForwardAsync(MergePullRequestByFastForwardRequest request) {

        return mergePullRequestByFastForwardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestByFastForwardResult> mergePullRequestByFastForwardAsync(
            final MergePullRequestByFastForwardRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergePullRequestByFastForwardRequest, MergePullRequestByFastForwardResult> asyncHandler) {
        final MergePullRequestByFastForwardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergePullRequestByFastForwardResult>() {
            @Override
            public MergePullRequestByFastForwardResult call() throws Exception {
                MergePullRequestByFastForwardResult result = null;

                try {
                    result = executeMergePullRequestByFastForward(finalRequest);
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
    public java.util.concurrent.Future<MergePullRequestBySquashResult> mergePullRequestBySquashAsync(MergePullRequestBySquashRequest request) {

        return mergePullRequestBySquashAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestBySquashResult> mergePullRequestBySquashAsync(final MergePullRequestBySquashRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergePullRequestBySquashRequest, MergePullRequestBySquashResult> asyncHandler) {
        final MergePullRequestBySquashRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergePullRequestBySquashResult>() {
            @Override
            public MergePullRequestBySquashResult call() throws Exception {
                MergePullRequestBySquashResult result = null;

                try {
                    result = executeMergePullRequestBySquash(finalRequest);
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
    public java.util.concurrent.Future<MergePullRequestByThreeWayResult> mergePullRequestByThreeWayAsync(MergePullRequestByThreeWayRequest request) {

        return mergePullRequestByThreeWayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestByThreeWayResult> mergePullRequestByThreeWayAsync(final MergePullRequestByThreeWayRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergePullRequestByThreeWayRequest, MergePullRequestByThreeWayResult> asyncHandler) {
        final MergePullRequestByThreeWayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergePullRequestByThreeWayResult>() {
            @Override
            public MergePullRequestByThreeWayResult call() throws Exception {
                MergePullRequestByThreeWayResult result = null;

                try {
                    result = executeMergePullRequestByThreeWay(finalRequest);
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
    public java.util.concurrent.Future<OverridePullRequestApprovalRulesResult> overridePullRequestApprovalRulesAsync(
            OverridePullRequestApprovalRulesRequest request) {

        return overridePullRequestApprovalRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OverridePullRequestApprovalRulesResult> overridePullRequestApprovalRulesAsync(
            final OverridePullRequestApprovalRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<OverridePullRequestApprovalRulesRequest, OverridePullRequestApprovalRulesResult> asyncHandler) {
        final OverridePullRequestApprovalRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<OverridePullRequestApprovalRulesResult>() {
            @Override
            public OverridePullRequestApprovalRulesResult call() throws Exception {
                OverridePullRequestApprovalRulesResult result = null;

                try {
                    result = executeOverridePullRequestApprovalRules(finalRequest);
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
    public java.util.concurrent.Future<PostCommentForComparedCommitResult> postCommentForComparedCommitAsync(PostCommentForComparedCommitRequest request) {

        return postCommentForComparedCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostCommentForComparedCommitResult> postCommentForComparedCommitAsync(final PostCommentForComparedCommitRequest request,
            final com.amazonaws.handlers.AsyncHandler<PostCommentForComparedCommitRequest, PostCommentForComparedCommitResult> asyncHandler) {
        final PostCommentForComparedCommitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PostCommentForComparedCommitResult>() {
            @Override
            public PostCommentForComparedCommitResult call() throws Exception {
                PostCommentForComparedCommitResult result = null;

                try {
                    result = executePostCommentForComparedCommit(finalRequest);
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
    public java.util.concurrent.Future<PostCommentForPullRequestResult> postCommentForPullRequestAsync(PostCommentForPullRequestRequest request) {

        return postCommentForPullRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostCommentForPullRequestResult> postCommentForPullRequestAsync(final PostCommentForPullRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<PostCommentForPullRequestRequest, PostCommentForPullRequestResult> asyncHandler) {
        final PostCommentForPullRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PostCommentForPullRequestResult>() {
            @Override
            public PostCommentForPullRequestResult call() throws Exception {
                PostCommentForPullRequestResult result = null;

                try {
                    result = executePostCommentForPullRequest(finalRequest);
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
    public java.util.concurrent.Future<PostCommentReplyResult> postCommentReplyAsync(PostCommentReplyRequest request) {

        return postCommentReplyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostCommentReplyResult> postCommentReplyAsync(final PostCommentReplyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PostCommentReplyRequest, PostCommentReplyResult> asyncHandler) {
        final PostCommentReplyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PostCommentReplyResult>() {
            @Override
            public PostCommentReplyResult call() throws Exception {
                PostCommentReplyResult result = null;

                try {
                    result = executePostCommentReply(finalRequest);
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
    public java.util.concurrent.Future<PutCommentReactionResult> putCommentReactionAsync(PutCommentReactionRequest request) {

        return putCommentReactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutCommentReactionResult> putCommentReactionAsync(final PutCommentReactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutCommentReactionRequest, PutCommentReactionResult> asyncHandler) {
        final PutCommentReactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutCommentReactionResult>() {
            @Override
            public PutCommentReactionResult call() throws Exception {
                PutCommentReactionResult result = null;

                try {
                    result = executePutCommentReaction(finalRequest);
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
    public java.util.concurrent.Future<PutFileResult> putFileAsync(PutFileRequest request) {

        return putFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFileResult> putFileAsync(final PutFileRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFileRequest, PutFileResult> asyncHandler) {
        final PutFileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFileResult>() {
            @Override
            public PutFileResult call() throws Exception {
                PutFileResult result = null;

                try {
                    result = executePutFile(finalRequest);
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
    public java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(PutRepositoryTriggersRequest request) {

        return putRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(final PutRepositoryTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRepositoryTriggersRequest, PutRepositoryTriggersResult> asyncHandler) {
        final PutRepositoryTriggersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRepositoryTriggersResult>() {
            @Override
            public PutRepositoryTriggersResult call() throws Exception {
                PutRepositoryTriggersResult result = null;

                try {
                    result = executePutRepositoryTriggers(finalRequest);
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
    public java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest request) {

        return testRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(final TestRepositoryTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestRepositoryTriggersRequest, TestRepositoryTriggersResult> asyncHandler) {
        final TestRepositoryTriggersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestRepositoryTriggersResult>() {
            @Override
            public TestRepositoryTriggersResult call() throws Exception {
                TestRepositoryTriggersResult result = null;

                try {
                    result = executeTestRepositoryTriggers(finalRequest);
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
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateContentResult> updateApprovalRuleTemplateContentAsync(
            UpdateApprovalRuleTemplateContentRequest request) {

        return updateApprovalRuleTemplateContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateContentResult> updateApprovalRuleTemplateContentAsync(
            final UpdateApprovalRuleTemplateContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateContentRequest, UpdateApprovalRuleTemplateContentResult> asyncHandler) {
        final UpdateApprovalRuleTemplateContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApprovalRuleTemplateContentResult>() {
            @Override
            public UpdateApprovalRuleTemplateContentResult call() throws Exception {
                UpdateApprovalRuleTemplateContentResult result = null;

                try {
                    result = executeUpdateApprovalRuleTemplateContent(finalRequest);
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
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateDescriptionResult> updateApprovalRuleTemplateDescriptionAsync(
            UpdateApprovalRuleTemplateDescriptionRequest request) {

        return updateApprovalRuleTemplateDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateDescriptionResult> updateApprovalRuleTemplateDescriptionAsync(
            final UpdateApprovalRuleTemplateDescriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateDescriptionRequest, UpdateApprovalRuleTemplateDescriptionResult> asyncHandler) {
        final UpdateApprovalRuleTemplateDescriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApprovalRuleTemplateDescriptionResult>() {
            @Override
            public UpdateApprovalRuleTemplateDescriptionResult call() throws Exception {
                UpdateApprovalRuleTemplateDescriptionResult result = null;

                try {
                    result = executeUpdateApprovalRuleTemplateDescription(finalRequest);
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
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateNameResult> updateApprovalRuleTemplateNameAsync(UpdateApprovalRuleTemplateNameRequest request) {

        return updateApprovalRuleTemplateNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApprovalRuleTemplateNameResult> updateApprovalRuleTemplateNameAsync(
            final UpdateApprovalRuleTemplateNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApprovalRuleTemplateNameRequest, UpdateApprovalRuleTemplateNameResult> asyncHandler) {
        final UpdateApprovalRuleTemplateNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApprovalRuleTemplateNameResult>() {
            @Override
            public UpdateApprovalRuleTemplateNameResult call() throws Exception {
                UpdateApprovalRuleTemplateNameResult result = null;

                try {
                    result = executeUpdateApprovalRuleTemplateName(finalRequest);
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
    public java.util.concurrent.Future<UpdateCommentResult> updateCommentAsync(UpdateCommentRequest request) {

        return updateCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCommentResult> updateCommentAsync(final UpdateCommentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCommentRequest, UpdateCommentResult> asyncHandler) {
        final UpdateCommentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCommentResult>() {
            @Override
            public UpdateCommentResult call() throws Exception {
                UpdateCommentResult result = null;

                try {
                    result = executeUpdateComment(finalRequest);
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
    public java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest request) {

        return updateDefaultBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(final UpdateDefaultBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDefaultBranchRequest, UpdateDefaultBranchResult> asyncHandler) {
        final UpdateDefaultBranchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDefaultBranchResult>() {
            @Override
            public UpdateDefaultBranchResult call() throws Exception {
                UpdateDefaultBranchResult result = null;

                try {
                    result = executeUpdateDefaultBranch(finalRequest);
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
    public java.util.concurrent.Future<UpdatePullRequestApprovalRuleContentResult> updatePullRequestApprovalRuleContentAsync(
            UpdatePullRequestApprovalRuleContentRequest request) {

        return updatePullRequestApprovalRuleContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestApprovalRuleContentResult> updatePullRequestApprovalRuleContentAsync(
            final UpdatePullRequestApprovalRuleContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePullRequestApprovalRuleContentRequest, UpdatePullRequestApprovalRuleContentResult> asyncHandler) {
        final UpdatePullRequestApprovalRuleContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePullRequestApprovalRuleContentResult>() {
            @Override
            public UpdatePullRequestApprovalRuleContentResult call() throws Exception {
                UpdatePullRequestApprovalRuleContentResult result = null;

                try {
                    result = executeUpdatePullRequestApprovalRuleContent(finalRequest);
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
    public java.util.concurrent.Future<UpdatePullRequestApprovalStateResult> updatePullRequestApprovalStateAsync(UpdatePullRequestApprovalStateRequest request) {

        return updatePullRequestApprovalStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestApprovalStateResult> updatePullRequestApprovalStateAsync(
            final UpdatePullRequestApprovalStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePullRequestApprovalStateRequest, UpdatePullRequestApprovalStateResult> asyncHandler) {
        final UpdatePullRequestApprovalStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePullRequestApprovalStateResult>() {
            @Override
            public UpdatePullRequestApprovalStateResult call() throws Exception {
                UpdatePullRequestApprovalStateResult result = null;

                try {
                    result = executeUpdatePullRequestApprovalState(finalRequest);
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
    public java.util.concurrent.Future<UpdatePullRequestDescriptionResult> updatePullRequestDescriptionAsync(UpdatePullRequestDescriptionRequest request) {

        return updatePullRequestDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestDescriptionResult> updatePullRequestDescriptionAsync(final UpdatePullRequestDescriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePullRequestDescriptionRequest, UpdatePullRequestDescriptionResult> asyncHandler) {
        final UpdatePullRequestDescriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePullRequestDescriptionResult>() {
            @Override
            public UpdatePullRequestDescriptionResult call() throws Exception {
                UpdatePullRequestDescriptionResult result = null;

                try {
                    result = executeUpdatePullRequestDescription(finalRequest);
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
    public java.util.concurrent.Future<UpdatePullRequestStatusResult> updatePullRequestStatusAsync(UpdatePullRequestStatusRequest request) {

        return updatePullRequestStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestStatusResult> updatePullRequestStatusAsync(final UpdatePullRequestStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePullRequestStatusRequest, UpdatePullRequestStatusResult> asyncHandler) {
        final UpdatePullRequestStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePullRequestStatusResult>() {
            @Override
            public UpdatePullRequestStatusResult call() throws Exception {
                UpdatePullRequestStatusResult result = null;

                try {
                    result = executeUpdatePullRequestStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdatePullRequestTitleResult> updatePullRequestTitleAsync(UpdatePullRequestTitleRequest request) {

        return updatePullRequestTitleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestTitleResult> updatePullRequestTitleAsync(final UpdatePullRequestTitleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePullRequestTitleRequest, UpdatePullRequestTitleResult> asyncHandler) {
        final UpdatePullRequestTitleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePullRequestTitleResult>() {
            @Override
            public UpdatePullRequestTitleResult call() throws Exception {
                UpdatePullRequestTitleResult result = null;

                try {
                    result = executeUpdatePullRequestTitle(finalRequest);
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
    public java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(UpdateRepositoryDescriptionRequest request) {

        return updateRepositoryDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(final UpdateRepositoryDescriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRepositoryDescriptionRequest, UpdateRepositoryDescriptionResult> asyncHandler) {
        final UpdateRepositoryDescriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRepositoryDescriptionResult>() {
            @Override
            public UpdateRepositoryDescriptionResult call() throws Exception {
                UpdateRepositoryDescriptionResult result = null;

                try {
                    result = executeUpdateRepositoryDescription(finalRequest);
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
    public java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest request) {

        return updateRepositoryNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(final UpdateRepositoryNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRepositoryNameRequest, UpdateRepositoryNameResult> asyncHandler) {
        final UpdateRepositoryNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRepositoryNameResult>() {
            @Override
            public UpdateRepositoryNameResult call() throws Exception {
                UpdateRepositoryNameResult result = null;

                try {
                    result = executeUpdateRepositoryName(finalRequest);
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
