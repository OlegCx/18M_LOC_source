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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForPullRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCommentsForPullRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was created.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was
     * made.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results. The default is 100 comments. You
     * can return up to 500 comments with a single request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @return The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForPullRequestRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the pull request.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @return The name of the repository that contains the pull request.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForPullRequestRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was created.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *        pull request was created.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was created.
     * </p>
     * 
     * @return The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *         pull request was created.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was created.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *        pull request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForPullRequestRequest withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was
     * made.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit in the source branch that was the tip of the branch at the time the
     *        comment was made.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was
     * made.
     * </p>
     * 
     * @return The full commit ID of the commit in the source branch that was the tip of the branch at the time the
     *         comment was made.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was
     * made.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit in the source branch that was the tip of the branch at the time the
     *        comment was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForPullRequestRequest withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForPullRequestRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results. The default is 100 comments. You
     * can return up to 500 comments with a single request.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results. The default is 100
     *        comments. You can return up to 500 comments with a single request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results. The default is 100 comments. You
     * can return up to 500 comments with a single request.
     * </p>
     * 
     * @return A non-zero, non-negative integer used to limit the number of returned results. The default is 100
     *         comments. You can return up to 500 comments with a single request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results. The default is 100 comments. You
     * can return up to 500 comments with a single request.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results. The default is 100
     *        comments. You can return up to 500 comments with a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForPullRequestRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getBeforeCommitId() != null)
            sb.append("BeforeCommitId: ").append(getBeforeCommitId()).append(",");
        if (getAfterCommitId() != null)
            sb.append("AfterCommitId: ").append(getAfterCommitId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommentsForPullRequestRequest == false)
            return false;
        GetCommentsForPullRequestRequest other = (GetCommentsForPullRequestRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBeforeCommitId() == null ^ this.getBeforeCommitId() == null)
            return false;
        if (other.getBeforeCommitId() != null && other.getBeforeCommitId().equals(this.getBeforeCommitId()) == false)
            return false;
        if (other.getAfterCommitId() == null ^ this.getAfterCommitId() == null)
            return false;
        if (other.getAfterCommitId() != null && other.getAfterCommitId().equals(this.getAfterCommitId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetCommentsForPullRequestRequest clone() {
        return (GetCommentsForPullRequestRequest) super.clone();
    }

}
