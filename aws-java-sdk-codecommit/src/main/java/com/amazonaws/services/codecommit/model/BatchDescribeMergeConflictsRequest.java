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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDescribeMergeConflicts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeMergeConflictsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository that contains the merge conflicts you want to review.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     */
    private String destinationCommitSpecifier;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     */
    private String sourceCommitSpecifier;
    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     */
    private String mergeOption;
    /**
     * <p>
     * The maximum number of merge hunks to include in the output.
     * </p>
     */
    private Integer maxMergeHunks;
    /**
     * <p>
     * The maximum number of files to include in the output.
     * </p>
     */
    private Integer maxConflictFiles;
    /**
     * <p>
     * The path of the target files used to describe the conflicts. If not specified, the default is all conflict files.
     * </p>
     */
    private java.util.List<String> filePaths;
    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     */
    private String conflictDetailLevel;
    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     */
    private String conflictResolutionStrategy;
    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the repository that contains the merge conflicts you want to review.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the merge conflicts you want to review.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the merge conflicts you want to review.
     * </p>
     * 
     * @return The name of the repository that contains the merge conflicts you want to review.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the merge conflicts you want to review.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the merge conflicts you want to review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param destinationCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     */

    public void setDestinationCommitSpecifier(String destinationCommitSpecifier) {
        this.destinationCommitSpecifier = destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a
     *         branch name or a full commit ID).
     */

    public String getDestinationCommitSpecifier() {
        return this.destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param destinationCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsRequest withDestinationCommitSpecifier(String destinationCommitSpecifier) {
        setDestinationCommitSpecifier(destinationCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param sourceCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     */

    public void setSourceCommitSpecifier(String sourceCommitSpecifier) {
        this.sourceCommitSpecifier = sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a
     *         branch name or a full commit ID).
     */

    public String getSourceCommitSpecifier() {
        return this.sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param sourceCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsRequest withSourceCommitSpecifier(String sourceCommitSpecifier) {
        setSourceCommitSpecifier(sourceCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code.
     * @see MergeOptionTypeEnum
     */

    public void setMergeOption(String mergeOption) {
        this.mergeOption = mergeOption;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * 
     * @return The merge option or strategy you want to use to merge the code.
     * @see MergeOptionTypeEnum
     */

    public String getMergeOption() {
        return this.mergeOption;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeOptionTypeEnum
     */

    public BatchDescribeMergeConflictsRequest withMergeOption(String mergeOption) {
        setMergeOption(mergeOption);
        return this;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeOptionTypeEnum
     */

    public BatchDescribeMergeConflictsRequest withMergeOption(MergeOptionTypeEnum mergeOption) {
        this.mergeOption = mergeOption.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of merge hunks to include in the output.
     * </p>
     * 
     * @param maxMergeHunks
     *        The maximum number of merge hunks to include in the output.
     */

    public void setMaxMergeHunks(Integer maxMergeHunks) {
        this.maxMergeHunks = maxMergeHunks;
    }

    /**
     * <p>
     * The maximum number of merge hunks to include in the output.
     * </p>
     * 
     * @return The maximum number of merge hunks to include in the output.
     */

    public Integer getMaxMergeHunks() {
        return this.maxMergeHunks;
    }

    /**
     * <p>
     * The maximum number of merge hunks to include in the output.
     * </p>
     * 
     * @param maxMergeHunks
     *        The maximum number of merge hunks to include in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsRequest withMaxMergeHunks(Integer maxMergeHunks) {
        setMaxMergeHunks(maxMergeHunks);
        return this;
    }

    /**
     * <p>
     * The maximum number of files to include in the output.
     * </p>
     * 
     * @param maxConflictFiles
     *        The maximum number of files to include in the output.
     */

    public void setMaxConflictFiles(Integer maxConflictFiles) {
        this.maxConflictFiles = maxConflictFiles;
    }

    /**
     * <p>
     * The maximum number of files to include in the output.
     * </p>
     * 
     * @return The maximum number of files to include in the output.
     */

    public Integer getMaxConflictFiles() {
        return this.maxConflictFiles;
    }

    /**
     * <p>
     * The maximum number of files to include in the output.
     * </p>
     * 
     * @param maxConflictFiles
     *        The maximum number of files to include in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsRequest withMaxConflictFiles(Integer maxConflictFiles) {
        setMaxConflictFiles(maxConflictFiles);
        return this;
    }

    /**
     * <p>
     * The path of the target files used to describe the conflicts. If not specified, the default is all conflict files.
     * </p>
     * 
     * @return The path of the target files used to describe the conflicts. If not specified, the default is all
     *         conflict files.
     */

    public java.util.List<String> getFilePaths() {
        return filePaths;
    }

    /**
     * <p>
     * The path of the target files used to describe the conflicts. If not specified, the default is all conflict files.
     * </p>
     * 
     * @param filePaths
     *        The path of the target files used to describe the conflicts. If not specified, the default is all conflict
     *        files.
     */

    public void setFilePaths(java.util.Collection<String> filePaths) {
        if (filePaths == null) {
            this.filePaths = null;
            return;
        }

        this.filePaths = new java.util.ArrayList<String>(filePaths);
    }

    /**
     * <p>
     * The path of the target files used to describe the conflicts. If not specified, the default is all conflict files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilePaths(java.util.Collection)} or {@link #withFilePaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filePaths
     *        The path of the target files used to describe the conflicts. If not specified, the default is all conflict
     *        files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsRequest withFilePaths(String... filePaths) {
        if (this.filePaths == null) {
            setFilePaths(new java.util.ArrayList<String>(filePaths.length));
        }
        for (String ele : filePaths) {
            this.filePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The path of the target files used to describe the conflicts. If not specified, the default is all conflict files.
     * </p>
     * 
     * @param filePaths
     *        The path of the target files used to describe the conflicts. If not specified, the default is all conflict
     *        files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeMergeConflictsRequest withFilePaths(java.util.Collection<String> filePaths) {
        setFilePaths(filePaths);
        return this;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     * 
     * @param conflictDetailLevel
     *        The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     *        not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a
     *        conflict is considered not mergeable if the same file in both branches has differences on the same line.
     * @see ConflictDetailLevelTypeEnum
     */

    public void setConflictDetailLevel(String conflictDetailLevel) {
        this.conflictDetailLevel = conflictDetailLevel;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     * 
     * @return The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     *         not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a
     *         conflict is considered not mergeable if the same file in both branches has differences on the same line.
     * @see ConflictDetailLevelTypeEnum
     */

    public String getConflictDetailLevel() {
        return this.conflictDetailLevel;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     * 
     * @param conflictDetailLevel
     *        The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     *        not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a
     *        conflict is considered not mergeable if the same file in both branches has differences on the same line.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictDetailLevelTypeEnum
     */

    public BatchDescribeMergeConflictsRequest withConflictDetailLevel(String conflictDetailLevel) {
        setConflictDetailLevel(conflictDetailLevel);
        return this;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     * 
     * @param conflictDetailLevel
     *        The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     *        not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a
     *        conflict is considered not mergeable if the same file in both branches has differences on the same line.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictDetailLevelTypeEnum
     */

    public BatchDescribeMergeConflictsRequest withConflictDetailLevel(ConflictDetailLevelTypeEnum conflictDetailLevel) {
        this.conflictDetailLevel = conflictDetailLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     * 
     * @param conflictResolutionStrategy
     *        Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two
     *        versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the
     *        merge operation is successful.
     * @see ConflictResolutionStrategyTypeEnum
     */

    public void setConflictResolutionStrategy(String conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     * 
     * @return Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two
     *         versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the
     *         merge operation is successful.
     * @see ConflictResolutionStrategyTypeEnum
     */

    public String getConflictResolutionStrategy() {
        return this.conflictResolutionStrategy;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     * 
     * @param conflictResolutionStrategy
     *        Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two
     *        versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the
     *        merge operation is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictResolutionStrategyTypeEnum
     */

    public BatchDescribeMergeConflictsRequest withConflictResolutionStrategy(String conflictResolutionStrategy) {
        setConflictResolutionStrategy(conflictResolutionStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     * 
     * @param conflictResolutionStrategy
     *        Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two
     *        versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the
     *        merge operation is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictResolutionStrategyTypeEnum
     */

    public BatchDescribeMergeConflictsRequest withConflictResolutionStrategy(ConflictResolutionStrategyTypeEnum conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy.toString();
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

    public BatchDescribeMergeConflictsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getDestinationCommitSpecifier() != null)
            sb.append("DestinationCommitSpecifier: ").append(getDestinationCommitSpecifier()).append(",");
        if (getSourceCommitSpecifier() != null)
            sb.append("SourceCommitSpecifier: ").append(getSourceCommitSpecifier()).append(",");
        if (getMergeOption() != null)
            sb.append("MergeOption: ").append(getMergeOption()).append(",");
        if (getMaxMergeHunks() != null)
            sb.append("MaxMergeHunks: ").append(getMaxMergeHunks()).append(",");
        if (getMaxConflictFiles() != null)
            sb.append("MaxConflictFiles: ").append(getMaxConflictFiles()).append(",");
        if (getFilePaths() != null)
            sb.append("FilePaths: ").append(getFilePaths()).append(",");
        if (getConflictDetailLevel() != null)
            sb.append("ConflictDetailLevel: ").append(getConflictDetailLevel()).append(",");
        if (getConflictResolutionStrategy() != null)
            sb.append("ConflictResolutionStrategy: ").append(getConflictResolutionStrategy()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeMergeConflictsRequest == false)
            return false;
        BatchDescribeMergeConflictsRequest other = (BatchDescribeMergeConflictsRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getDestinationCommitSpecifier() == null ^ this.getDestinationCommitSpecifier() == null)
            return false;
        if (other.getDestinationCommitSpecifier() != null && other.getDestinationCommitSpecifier().equals(this.getDestinationCommitSpecifier()) == false)
            return false;
        if (other.getSourceCommitSpecifier() == null ^ this.getSourceCommitSpecifier() == null)
            return false;
        if (other.getSourceCommitSpecifier() != null && other.getSourceCommitSpecifier().equals(this.getSourceCommitSpecifier()) == false)
            return false;
        if (other.getMergeOption() == null ^ this.getMergeOption() == null)
            return false;
        if (other.getMergeOption() != null && other.getMergeOption().equals(this.getMergeOption()) == false)
            return false;
        if (other.getMaxMergeHunks() == null ^ this.getMaxMergeHunks() == null)
            return false;
        if (other.getMaxMergeHunks() != null && other.getMaxMergeHunks().equals(this.getMaxMergeHunks()) == false)
            return false;
        if (other.getMaxConflictFiles() == null ^ this.getMaxConflictFiles() == null)
            return false;
        if (other.getMaxConflictFiles() != null && other.getMaxConflictFiles().equals(this.getMaxConflictFiles()) == false)
            return false;
        if (other.getFilePaths() == null ^ this.getFilePaths() == null)
            return false;
        if (other.getFilePaths() != null && other.getFilePaths().equals(this.getFilePaths()) == false)
            return false;
        if (other.getConflictDetailLevel() == null ^ this.getConflictDetailLevel() == null)
            return false;
        if (other.getConflictDetailLevel() != null && other.getConflictDetailLevel().equals(this.getConflictDetailLevel()) == false)
            return false;
        if (other.getConflictResolutionStrategy() == null ^ this.getConflictResolutionStrategy() == null)
            return false;
        if (other.getConflictResolutionStrategy() != null && other.getConflictResolutionStrategy().equals(this.getConflictResolutionStrategy()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitSpecifier() == null) ? 0 : getDestinationCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitSpecifier() == null) ? 0 : getSourceCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getMergeOption() == null) ? 0 : getMergeOption().hashCode());
        hashCode = prime * hashCode + ((getMaxMergeHunks() == null) ? 0 : getMaxMergeHunks().hashCode());
        hashCode = prime * hashCode + ((getMaxConflictFiles() == null) ? 0 : getMaxConflictFiles().hashCode());
        hashCode = prime * hashCode + ((getFilePaths() == null) ? 0 : getFilePaths().hashCode());
        hashCode = prime * hashCode + ((getConflictDetailLevel() == null) ? 0 : getConflictDetailLevel().hashCode());
        hashCode = prime * hashCode + ((getConflictResolutionStrategy() == null) ? 0 : getConflictResolutionStrategy().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeMergeConflictsRequest clone() {
        return (BatchDescribeMergeConflictsRequest) super.clone();
    }

}
