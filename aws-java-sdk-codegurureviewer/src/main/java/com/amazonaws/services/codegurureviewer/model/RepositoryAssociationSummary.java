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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a repository association. The <a
 * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html">
 * <code>ListRepositoryAssociations</code> </a> operation returns a list of <code>RepositoryAssociationSummary</code>
 * objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RepositoryAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html">
     * <code>ListRepositoryAssociations</code> </a>.
     * </p>
     */
    private String associationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     * <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">
     * <code>Connection</code> </a> in the <i>AWS CodeStar Connections API Reference</i>.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, since the repository association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimeStamp;
    /**
     * <p>
     * The repository association ID.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The name of the repository association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that
     * owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * The valid repository association states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Associated</b>: The repository association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Associating</b>: CodeGuru Reviewer is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.
     * </p>
     * <note>
     * <p>
     * If your repository <code>ProviderType</code> is <code>GitHub</code>, <code>GitHub Enterprise Server</code>, or
     * <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer
     * reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Failed</b>: The repository failed to associate or disassociate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and source code
     * access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     * association with this repository if you want to review source code in it later. You can control access to code
     * reviews created in an associated repository with tags after it has been disassociated. For more information, see
     * <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html">Using
     * tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html">
     * <code>ListRepositoryAssociations</code> </a>.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *        <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html">
     *        <code>ListRepositoryAssociations</code> </a>.
     */

    public void setAssociationArn(String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html">
     * <code>ListRepositoryAssociations</code> </a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *         <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html">
     *         <code>ListRepositoryAssociations</code> </a>.
     */

    public String getAssociationArn() {
        return this.associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html">
     * <code>ListRepositoryAssociations</code> </a>.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *        <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html">
     *        <code>ListRepositoryAssociations</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withAssociationArn(String associationArn) {
        setAssociationArn(associationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     * <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">
     * <code>Connection</code> </a> in the <i>AWS CodeStar Connections API Reference</i>.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     *        <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">
     *        <code>Connection</code> </a> in the <i>AWS CodeStar Connections API Reference</i>.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     * <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">
     * <code>Connection</code> </a> in the <i>AWS CodeStar Connections API Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     *         <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">
     *         <code>Connection</code> </a> in the <i>AWS CodeStar Connections API Reference</i>.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     * <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">
     * <code>Connection</code> </a> in the <i>AWS CodeStar Connections API Reference</i>.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     *        <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">
     *        <code>Connection</code> </a> in the <i>AWS CodeStar Connections API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, since the repository association was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time, in milliseconds since the epoch, since the repository association was last updated.
     */

    public void setLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, since the repository association was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, since the repository association was last updated.
     */

    public java.util.Date getLastUpdatedTimeStamp() {
        return this.lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, since the repository association was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time, in milliseconds since the epoch, since the repository association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        setLastUpdatedTimeStamp(lastUpdatedTimeStamp);
        return this;
    }

    /**
     * <p>
     * The repository association ID.
     * </p>
     * 
     * @param associationId
     *        The repository association ID.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The repository association ID.
     * </p>
     * 
     * @return The repository association ID.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The repository association ID.
     * </p>
     * 
     * @param associationId
     *        The repository association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The name of the repository association.
     * </p>
     * 
     * @param name
     *        The name of the repository association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the repository association.
     * </p>
     * 
     * @return The name of the repository association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the repository association.
     * </p>
     * 
     * @param name
     *        The name of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that
     * owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @param owner
     *        The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account
     *        that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the
     *        username for the account that owns the repository.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that
     * owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @return The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account
     *         that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the
     *         username for the account that owns the repository.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that
     * owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @param owner
     *        The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account
     *        that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the
     *        username for the account that owns the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @return The provider type of the repository association.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public RepositoryAssociationSummary withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public RepositoryAssociationSummary withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * The valid repository association states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Associated</b>: The repository association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Associating</b>: CodeGuru Reviewer is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.
     * </p>
     * <note>
     * <p>
     * If your repository <code>ProviderType</code> is <code>GitHub</code>, <code>GitHub Enterprise Server</code>, or
     * <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer
     * reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Failed</b>: The repository failed to associate or disassociate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and source code
     * access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     * association with this repository if you want to review source code in it later. You can control access to code
     * reviews created in an associated repository with tags after it has been disassociated. For more information, see
     * <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html">Using
     * tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the repository association.</p>
     *        <p>
     *        The valid repository association states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Associated</b>: The repository association is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Associating</b>: CodeGuru Reviewer is:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer
     *        review.
     *        </p>
     *        <note>
     *        <p>
     *        If your repository <code>ProviderType</code> is <code>GitHub</code>, <code>GitHub Enterprise Server</code>
     *        , or <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru
     *        Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your
     *        repository.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Failed</b>: The repository failed to associate or disassociate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and
     *        source code access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     *        association with this repository if you want to review source code in it later. You can control access to
     *        code reviews created in an associated repository with tags after it has been disassociated. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html"
     *        >Using tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User
     *        Guide</i>.
     *        </p>
     *        </li>
     * @see RepositoryAssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * The valid repository association states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Associated</b>: The repository association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Associating</b>: CodeGuru Reviewer is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.
     * </p>
     * <note>
     * <p>
     * If your repository <code>ProviderType</code> is <code>GitHub</code>, <code>GitHub Enterprise Server</code>, or
     * <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer
     * reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Failed</b>: The repository failed to associate or disassociate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and source code
     * access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     * association with this repository if you want to review source code in it later. You can control access to code
     * reviews created in an associated repository with tags after it has been disassociated. For more information, see
     * <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html">Using
     * tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the repository association.</p>
     *         <p>
     *         The valid repository association states are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Associated</b>: The repository association is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Associating</b>: CodeGuru Reviewer is:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer
     *         review.
     *         </p>
     *         <note>
     *         <p>
     *         If your repository <code>ProviderType</code> is <code>GitHub</code>,
     *         <code>GitHub Enterprise Server</code>, or <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in
     *         your repository to trigger CodeGuru Reviewer reviews. If you delete these webhooks, reviews of code in
     *         your repository cannot be triggered.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your
     *         repository.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Failed</b>: The repository failed to associate or disassociate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and
     *         source code access.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     *         association with this repository if you want to review source code in it later. You can control access to
     *         code reviews created in an associated repository with tags after it has been disassociated. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html"
     *         >Using tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User
     *         Guide</i>.
     *         </p>
     *         </li>
     * @see RepositoryAssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * The valid repository association states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Associated</b>: The repository association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Associating</b>: CodeGuru Reviewer is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.
     * </p>
     * <note>
     * <p>
     * If your repository <code>ProviderType</code> is <code>GitHub</code>, <code>GitHub Enterprise Server</code>, or
     * <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer
     * reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Failed</b>: The repository failed to associate or disassociate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and source code
     * access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     * association with this repository if you want to review source code in it later. You can control access to code
     * reviews created in an associated repository with tags after it has been disassociated. For more information, see
     * <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html">Using
     * tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the repository association.</p>
     *        <p>
     *        The valid repository association states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Associated</b>: The repository association is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Associating</b>: CodeGuru Reviewer is:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer
     *        review.
     *        </p>
     *        <note>
     *        <p>
     *        If your repository <code>ProviderType</code> is <code>GitHub</code>, <code>GitHub Enterprise Server</code>
     *        , or <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru
     *        Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your
     *        repository.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Failed</b>: The repository failed to associate or disassociate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and
     *        source code access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     *        association with this repository if you want to review source code in it later. You can control access to
     *        code reviews created in an associated repository with tags after it has been disassociated. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html"
     *        >Using tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User
     *        Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public RepositoryAssociationSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * The valid repository association states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Associated</b>: The repository association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Associating</b>: CodeGuru Reviewer is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.
     * </p>
     * <note>
     * <p>
     * If your repository <code>ProviderType</code> is <code>GitHub</code>, <code>GitHub Enterprise Server</code>, or
     * <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer
     * reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Failed</b>: The repository failed to associate or disassociate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and source code
     * access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     * association with this repository if you want to review source code in it later. You can control access to code
     * reviews created in an associated repository with tags after it has been disassociated. For more information, see
     * <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html">Using
     * tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the repository association.</p>
     *        <p>
     *        The valid repository association states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Associated</b>: The repository association is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Associating</b>: CodeGuru Reviewer is:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer
     *        review.
     *        </p>
     *        <note>
     *        <p>
     *        If your repository <code>ProviderType</code> is <code>GitHub</code>, <code>GitHub Enterprise Server</code>
     *        , or <code>Bitbucket</code>, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru
     *        Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your
     *        repository.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Failed</b>: The repository failed to associate or disassociate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Disassociating</b>: CodeGuru Reviewer is removing the repository's pull request notifications and
     *        source code access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Disassociated</b>: CodeGuru Reviewer successfully disassociated the repository. You can create a new
     *        association with this repository if you want to review source code in it later. You can control access to
     *        code reviews created in an associated repository with tags after it has been disassociated. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/auth-and-access-control-using-tags.html"
     *        >Using tags to control access to associated repositories</a> in the <i>Amazon CodeGuru Reviewer User
     *        Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public RepositoryAssociationSummary withState(RepositoryAssociationState state) {
        this.state = state.toString();
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
        if (getAssociationArn() != null)
            sb.append("AssociationArn: ").append(getAssociationArn()).append(",");
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getLastUpdatedTimeStamp() != null)
            sb.append("LastUpdatedTimeStamp: ").append(getLastUpdatedTimeStamp()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryAssociationSummary == false)
            return false;
        RepositoryAssociationSummary other = (RepositoryAssociationSummary) obj;
        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null)
            return false;
        if (other.getAssociationArn() != null && other.getAssociationArn().equals(this.getAssociationArn()) == false)
            return false;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getLastUpdatedTimeStamp() == null ^ this.getLastUpdatedTimeStamp() == null)
            return false;
        if (other.getLastUpdatedTimeStamp() != null && other.getLastUpdatedTimeStamp().equals(this.getLastUpdatedTimeStamp()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimeStamp() == null) ? 0 : getLastUpdatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryAssociationSummary clone() {
        try {
            return (RepositoryAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RepositoryAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
