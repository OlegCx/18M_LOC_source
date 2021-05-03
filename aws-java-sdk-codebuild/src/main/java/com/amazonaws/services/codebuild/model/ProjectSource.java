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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the build input source code for the build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code>: The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline ignores it. This is because
     * AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the buildspec file (for example,
     * <code>https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon S3 input bucket, one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path to the ZIP file that contains the source code (for example,
     * <code>&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The path to the folder that contains the source code (for example,
     * <code>&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/</code>).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild console to start
     * creating a build project. When you use the console to connect (or reconnect) with GitHub, on the GitHub
     * <b>Authorize application</b> page, for <b>Organization access</b>, choose <b>Request access</b> next to each
     * repository you want to allow AWS CodeBuild to have access to, and then choose <b>Authorize application</b>.
     * (After you have connected to your GitHub account, you do not need to finish creating the build project. You can
     * leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the <code>source</code>
     * object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild console to
     * start creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on the
     * Bitbucket <b>Confirm access to your account</b> page, choose <b>Grant access</b>. (After you have connected to
     * your Bitbucket account, you do not need to finish creating the build project. You can leave the AWS CodeBuild
     * console.) To instruct AWS CodeBuild to use this connection, in the <code>source</code> object, set the
     * <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String location;
    /**
     * <p>
     * Information about the Git clone depth for the build project.
     * </p>
     */
    private Integer gitCloneDepth;
    /**
     * <p>
     * Information about the Git submodules configuration for the build project.
     * </p>
     */
    private GitSubmodulesConfig gitSubmodulesConfig;
    /**
     * <p>
     * The buildspec file declaration to use for the builds in this build project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file
     * relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path to an S3
     * bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN
     * (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this value is not provided or is
     * set to an empty string, the source code must contain a buildspec file in its root directory. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     */
    private String buildspec;
    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
     * directly.
     * </p>
     */
    private SourceAuth auth;
    /**
     * <p>
     * Set to true to report the status of a build's start and finish to your source provider. This option is valid only
     * when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you use a different
     * source provider, an <code>invalidInputException</code> is thrown.
     * </p>
     * <p>
     * To be able to report the build status to the source provider, the user associated with the source provider must
     * have write access to the repo. If the user does not have write access, the build status cannot be updated. For
     * more information, see <a href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source
     * provider access</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     */
    private Boolean reportBuildStatus;
    /**
     * <p>
     * Contains information that defines how the build project reports the build status to the source provider. This
     * option is only used when the source provider is <code>GITHUB</code>, <code>GITHUB_ENTERPRISE</code>, or
     * <code>BITBUCKET</code>.
     * </p>
     */
    private BuildStatusConfig buildStatusConfig;
    /**
     * <p>
     * Enable this flag to ignore SSL warnings while connecting to the project source code.
     * </p>
     */
    private Boolean insecureSsl;
    /**
     * <p>
     * An identifier for this project source. The identifier can only contain alphanumeric characters and underscores,
     * and must be less than 128 characters in length.
     * </p>
     */
    private String sourceIdentifier;

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code>: The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_SOURCE</code>: The project does not have input source code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon S3 bucket.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code>: The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of repository that contains the source code to be built. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *         AWS CodePipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_SOURCE</code>: The project does not have input source code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: The source code is in an Amazon S3 bucket.
     *         </p>
     *         </li>
     * @see SourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code>: The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_SOURCE</code>: The project does not have input source code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon S3 bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ProjectSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code>: The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_SOURCE</code>: The project does not have input source code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon S3 bucket.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setType(SourceType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code>: The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code>: The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub or GitHub Enterprise Cloud repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB_ENTERPRISE</code>: The source code is in a GitHub Enterprise Server repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_SOURCE</code>: The project does not have input source code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon S3 bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ProjectSource withType(SourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline ignores it. This is because
     * AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the buildspec file (for example,
     * <code>https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon S3 input bucket, one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path to the ZIP file that contains the source code (for example,
     * <code>&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The path to the folder that contains the source code (for example,
     * <code>&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/</code>).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild console to start
     * creating a build project. When you use the console to connect (or reconnect) with GitHub, on the GitHub
     * <b>Authorize application</b> page, for <b>Organization access</b>, choose <b>Request access</b> next to each
     * repository you want to allow AWS CodeBuild to have access to, and then choose <b>Authorize application</b>.
     * (After you have connected to your GitHub account, you do not need to finish creating the build project. You can
     * leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the <code>source</code>
     * object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild console to
     * start creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on the
     * Bitbucket <b>Confirm access to your account</b> page, choose <b>Grant access</b>. (After you have connected to
     * your Bitbucket account, you do not need to finish creating the build project. You can leave the AWS CodeBuild
     * console.) To instruct AWS CodeBuild to use this connection, in the <code>source</code> object, set the
     * <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the location of the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *        <code>location</code> should not be specified. If it is specified, AWS CodePipeline ignores it. This is
     *        because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *        source code and the buildspec file (for example,
     *        <code>https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an Amazon S3 input bucket, one of the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The path to the ZIP file that contains the source code (for example,
     *        <code>&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The path to the folder that contains the source code (for example,
     *        <code>&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/</code>).
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and
     *        the buildspec file. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild
     *        console to start creating a build project. When you use the console to connect (or reconnect) with GitHub,
     *        on the GitHub <b>Authorize application</b> page, for <b>Organization access</b>, choose <b>Request
     *        access</b> next to each repository you want to allow AWS CodeBuild to have access to, and then choose
     *        <b>Authorize application</b>. (After you have connected to your GitHub account, you do not need to finish
     *        creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use
     *        this connection, in the <code>source</code> object, set the <code>auth</code> object's <code>type</code>
     *        value to <code>OAUTH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *        and the buildspec file. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild
     *        console to start creating a build project. When you use the console to connect (or reconnect) with
     *        Bitbucket, on the Bitbucket <b>Confirm access to your account</b> page, choose <b>Grant access</b>. (After
     *        you have connected to your Bitbucket account, you do not need to finish creating the build project. You
     *        can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the
     *        <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to
     *        <code>OAUTH</code>.
     *        </p>
     *        </li>
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline ignores it. This is because
     * AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the buildspec file (for example,
     * <code>https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon S3 input bucket, one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path to the ZIP file that contains the source code (for example,
     * <code>&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The path to the folder that contains the source code (for example,
     * <code>&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/</code>).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild console to start
     * creating a build project. When you use the console to connect (or reconnect) with GitHub, on the GitHub
     * <b>Authorize application</b> page, for <b>Organization access</b>, choose <b>Request access</b> next to each
     * repository you want to allow AWS CodeBuild to have access to, and then choose <b>Authorize application</b>.
     * (After you have connected to your GitHub account, you do not need to finish creating the build project. You can
     * leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the <code>source</code>
     * object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild console to
     * start creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on the
     * Bitbucket <b>Confirm access to your account</b> page, choose <b>Grant access</b>. (After you have connected to
     * your Bitbucket account, you do not need to finish creating the build project. You can leave the AWS CodeBuild
     * console.) To instruct AWS CodeBuild to use this connection, in the <code>source</code> object, set the
     * <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the location of the source code to be built. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *         <code>location</code> should not be specified. If it is specified, AWS CodePipeline ignores it. This is
     *         because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *         source code and the buildspec file (for example,
     *         <code>https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in an Amazon S3 input bucket, one of the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The path to the ZIP file that contains the source code (for example,
     *         <code>&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The path to the folder that contains the source code (for example,
     *         <code>&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source
     *         and the buildspec file. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild
     *         console to start creating a build project. When you use the console to connect (or reconnect) with
     *         GitHub, on the GitHub <b>Authorize application</b> page, for <b>Organization access</b>, choose
     *         <b>Request access</b> next to each repository you want to allow AWS CodeBuild to have access to, and then
     *         choose <b>Authorize application</b>. (After you have connected to your GitHub account, you do not need to
     *         finish creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to
     *         use this connection, in the <code>source</code> object, set the <code>auth</code> object's
     *         <code>type</code> value to <code>OAUTH</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *         and the buildspec file. You must connect your AWS account to your Bitbucket account. Use the AWS
     *         CodeBuild console to start creating a build project. When you use the console to connect (or reconnect)
     *         with Bitbucket, on the Bitbucket <b>Confirm access to your account</b> page, choose <b>Grant access</b>.
     *         (After you have connected to your Bitbucket account, you do not need to finish creating the build
     *         project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in
     *         the <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to
     *         <code>OAUTH</code>.
     *         </p>
     *         </li>
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline ignores it. This is because
     * AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the buildspec file (for example,
     * <code>https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon S3 input bucket, one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path to the ZIP file that contains the source code (for example,
     * <code>&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The path to the folder that contains the source code (for example,
     * <code>&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/</code>).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild console to start
     * creating a build project. When you use the console to connect (or reconnect) with GitHub, on the GitHub
     * <b>Authorize application</b> page, for <b>Organization access</b>, choose <b>Request access</b> next to each
     * repository you want to allow AWS CodeBuild to have access to, and then choose <b>Authorize application</b>.
     * (After you have connected to your GitHub account, you do not need to finish creating the build project. You can
     * leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the <code>source</code>
     * object, set the <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild console to
     * start creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on the
     * Bitbucket <b>Confirm access to your account</b> page, choose <b>Grant access</b>. (After you have connected to
     * your Bitbucket account, you do not need to finish creating the build project. You can leave the AWS CodeBuild
     * console.) To instruct AWS CodeBuild to use this connection, in the <code>source</code> object, set the
     * <code>auth</code> object's <code>type</code> value to <code>OAUTH</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the location of the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *        <code>location</code> should not be specified. If it is specified, AWS CodePipeline ignores it. This is
     *        because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *        source code and the buildspec file (for example,
     *        <code>https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an Amazon S3 input bucket, one of the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The path to the ZIP file that contains the source code (for example,
     *        <code>&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The path to the folder that contains the source code (for example,
     *        <code>&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/</code>).
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and
     *        the buildspec file. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild
     *        console to start creating a build project. When you use the console to connect (or reconnect) with GitHub,
     *        on the GitHub <b>Authorize application</b> page, for <b>Organization access</b>, choose <b>Request
     *        access</b> next to each repository you want to allow AWS CodeBuild to have access to, and then choose
     *        <b>Authorize application</b>. (After you have connected to your GitHub account, you do not need to finish
     *        creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use
     *        this connection, in the <code>source</code> object, set the <code>auth</code> object's <code>type</code>
     *        value to <code>OAUTH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *        and the buildspec file. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild
     *        console to start creating a build project. When you use the console to connect (or reconnect) with
     *        Bitbucket, on the Bitbucket <b>Confirm access to your account</b> page, choose <b>Grant access</b>. (After
     *        you have connected to your Bitbucket account, you do not need to finish creating the build project. You
     *        can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the
     *        <code>source</code> object, set the <code>auth</code> object's <code>type</code> value to
     *        <code>OAUTH</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Information about the Git clone depth for the build project.
     * </p>
     * 
     * @param gitCloneDepth
     *        Information about the Git clone depth for the build project.
     */

    public void setGitCloneDepth(Integer gitCloneDepth) {
        this.gitCloneDepth = gitCloneDepth;
    }

    /**
     * <p>
     * Information about the Git clone depth for the build project.
     * </p>
     * 
     * @return Information about the Git clone depth for the build project.
     */

    public Integer getGitCloneDepth() {
        return this.gitCloneDepth;
    }

    /**
     * <p>
     * Information about the Git clone depth for the build project.
     * </p>
     * 
     * @param gitCloneDepth
     *        Information about the Git clone depth for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withGitCloneDepth(Integer gitCloneDepth) {
        setGitCloneDepth(gitCloneDepth);
        return this;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for the build project.
     * </p>
     * 
     * @param gitSubmodulesConfig
     *        Information about the Git submodules configuration for the build project.
     */

    public void setGitSubmodulesConfig(GitSubmodulesConfig gitSubmodulesConfig) {
        this.gitSubmodulesConfig = gitSubmodulesConfig;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for the build project.
     * </p>
     * 
     * @return Information about the Git submodules configuration for the build project.
     */

    public GitSubmodulesConfig getGitSubmodulesConfig() {
        return this.gitSubmodulesConfig;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for the build project.
     * </p>
     * 
     * @param gitSubmodulesConfig
     *        Information about the Git submodules configuration for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withGitSubmodulesConfig(GitSubmodulesConfig gitSubmodulesConfig) {
        setGitSubmodulesConfig(gitSubmodulesConfig);
        return this;
    }

    /**
     * <p>
     * The buildspec file declaration to use for the builds in this build project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file
     * relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path to an S3
     * bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN
     * (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this value is not provided or is
     * set to an empty string, the source code must contain a buildspec file in its root directory. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     * 
     * @param buildspec
     *        The buildspec file declaration to use for the builds in this build project.</p>
     *        <p>
     *        If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec
     *        file relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the
     *        path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the
     *        buildspec file using its ARN (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>).
     *        If this value is not provided or is set to an empty string, the source code must contain a buildspec file
     *        in its root directory. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *        >Buildspec File Name and Storage Location</a>.
     */

    public void setBuildspec(String buildspec) {
        this.buildspec = buildspec;
    }

    /**
     * <p>
     * The buildspec file declaration to use for the builds in this build project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file
     * relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path to an S3
     * bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN
     * (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this value is not provided or is
     * set to an empty string, the source code must contain a buildspec file in its root directory. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     * 
     * @return The buildspec file declaration to use for the builds in this build project.</p>
     *         <p>
     *         If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec
     *         file relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the
     *         path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the
     *         buildspec file using its ARN (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>).
     *         If this value is not provided or is set to an empty string, the source code must contain a buildspec file
     *         in its root directory. For more information, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *         >Buildspec File Name and Storage Location</a>.
     */

    public String getBuildspec() {
        return this.buildspec;
    }

    /**
     * <p>
     * The buildspec file declaration to use for the builds in this build project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file
     * relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path to an S3
     * bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN
     * (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this value is not provided or is
     * set to an empty string, the source code must contain a buildspec file in its root directory. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     * 
     * @param buildspec
     *        The buildspec file declaration to use for the builds in this build project.</p>
     *        <p>
     *        If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec
     *        file relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the
     *        path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the
     *        buildspec file using its ARN (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>).
     *        If this value is not provided or is set to an empty string, the source code must contain a buildspec file
     *        in its root directory. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *        >Buildspec File Name and Storage Location</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withBuildspec(String buildspec) {
        setBuildspec(buildspec);
        return this;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
     * directly.
     * </p>
     * 
     * @param auth
     *        Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *        <p>
     *        This information is for the AWS CodeBuild console's use only. Your code should not get or set this
     *        information directly.
     */

    public void setAuth(SourceAuth auth) {
        this.auth = auth;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
     * directly.
     * </p>
     * 
     * @return Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *         <p>
     *         This information is for the AWS CodeBuild console's use only. Your code should not get or set this
     *         information directly.
     */

    public SourceAuth getAuth() {
        return this.auth;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
     * directly.
     * </p>
     * 
     * @param auth
     *        Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *        <p>
     *        This information is for the AWS CodeBuild console's use only. Your code should not get or set this
     *        information directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withAuth(SourceAuth auth) {
        setAuth(auth);
        return this;
    }

    /**
     * <p>
     * Set to true to report the status of a build's start and finish to your source provider. This option is valid only
     * when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you use a different
     * source provider, an <code>invalidInputException</code> is thrown.
     * </p>
     * <p>
     * To be able to report the build status to the source provider, the user associated with the source provider must
     * have write access to the repo. If the user does not have write access, the build status cannot be updated. For
     * more information, see <a href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source
     * provider access</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     * 
     * @param reportBuildStatus
     *        Set to true to report the status of a build's start and finish to your source provider. This option is
     *        valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you
     *        use a different source provider, an <code>invalidInputException</code> is thrown. </p>
     *        <p>
     *        To be able to report the build status to the source provider, the user associated with the source provider
     *        must have write access to the repo. If the user does not have write access, the build status cannot be
     *        updated. For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source provider
     *        access</a> in the <i>AWS CodeBuild User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The status of a build triggered by a webhook is always reported to your source provider.
     *        </p>
     */

    public void setReportBuildStatus(Boolean reportBuildStatus) {
        this.reportBuildStatus = reportBuildStatus;
    }

    /**
     * <p>
     * Set to true to report the status of a build's start and finish to your source provider. This option is valid only
     * when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you use a different
     * source provider, an <code>invalidInputException</code> is thrown.
     * </p>
     * <p>
     * To be able to report the build status to the source provider, the user associated with the source provider must
     * have write access to the repo. If the user does not have write access, the build status cannot be updated. For
     * more information, see <a href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source
     * provider access</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     * 
     * @return Set to true to report the status of a build's start and finish to your source provider. This option is
     *         valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you
     *         use a different source provider, an <code>invalidInputException</code> is thrown. </p>
     *         <p>
     *         To be able to report the build status to the source provider, the user associated with the source
     *         provider must have write access to the repo. If the user does not have write access, the build status
     *         cannot be updated. For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source provider
     *         access</a> in the <i>AWS CodeBuild User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The status of a build triggered by a webhook is always reported to your source provider.
     *         </p>
     */

    public Boolean getReportBuildStatus() {
        return this.reportBuildStatus;
    }

    /**
     * <p>
     * Set to true to report the status of a build's start and finish to your source provider. This option is valid only
     * when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you use a different
     * source provider, an <code>invalidInputException</code> is thrown.
     * </p>
     * <p>
     * To be able to report the build status to the source provider, the user associated with the source provider must
     * have write access to the repo. If the user does not have write access, the build status cannot be updated. For
     * more information, see <a href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source
     * provider access</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     * 
     * @param reportBuildStatus
     *        Set to true to report the status of a build's start and finish to your source provider. This option is
     *        valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you
     *        use a different source provider, an <code>invalidInputException</code> is thrown. </p>
     *        <p>
     *        To be able to report the build status to the source provider, the user associated with the source provider
     *        must have write access to the repo. If the user does not have write access, the build status cannot be
     *        updated. For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source provider
     *        access</a> in the <i>AWS CodeBuild User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The status of a build triggered by a webhook is always reported to your source provider.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withReportBuildStatus(Boolean reportBuildStatus) {
        setReportBuildStatus(reportBuildStatus);
        return this;
    }

    /**
     * <p>
     * Set to true to report the status of a build's start and finish to your source provider. This option is valid only
     * when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you use a different
     * source provider, an <code>invalidInputException</code> is thrown.
     * </p>
     * <p>
     * To be able to report the build status to the source provider, the user associated with the source provider must
     * have write access to the repo. If the user does not have write access, the build status cannot be updated. For
     * more information, see <a href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source
     * provider access</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     * 
     * @return Set to true to report the status of a build's start and finish to your source provider. This option is
     *         valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you
     *         use a different source provider, an <code>invalidInputException</code> is thrown. </p>
     *         <p>
     *         To be able to report the build status to the source provider, the user associated with the source
     *         provider must have write access to the repo. If the user does not have write access, the build status
     *         cannot be updated. For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/access-tokens.html">Source provider
     *         access</a> in the <i>AWS CodeBuild User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The status of a build triggered by a webhook is always reported to your source provider.
     *         </p>
     */

    public Boolean isReportBuildStatus() {
        return this.reportBuildStatus;
    }

    /**
     * <p>
     * Contains information that defines how the build project reports the build status to the source provider. This
     * option is only used when the source provider is <code>GITHUB</code>, <code>GITHUB_ENTERPRISE</code>, or
     * <code>BITBUCKET</code>.
     * </p>
     * 
     * @param buildStatusConfig
     *        Contains information that defines how the build project reports the build status to the source provider.
     *        This option is only used when the source provider is <code>GITHUB</code>, <code>GITHUB_ENTERPRISE</code>,
     *        or <code>BITBUCKET</code>.
     */

    public void setBuildStatusConfig(BuildStatusConfig buildStatusConfig) {
        this.buildStatusConfig = buildStatusConfig;
    }

    /**
     * <p>
     * Contains information that defines how the build project reports the build status to the source provider. This
     * option is only used when the source provider is <code>GITHUB</code>, <code>GITHUB_ENTERPRISE</code>, or
     * <code>BITBUCKET</code>.
     * </p>
     * 
     * @return Contains information that defines how the build project reports the build status to the source provider.
     *         This option is only used when the source provider is <code>GITHUB</code>, <code>GITHUB_ENTERPRISE</code>,
     *         or <code>BITBUCKET</code>.
     */

    public BuildStatusConfig getBuildStatusConfig() {
        return this.buildStatusConfig;
    }

    /**
     * <p>
     * Contains information that defines how the build project reports the build status to the source provider. This
     * option is only used when the source provider is <code>GITHUB</code>, <code>GITHUB_ENTERPRISE</code>, or
     * <code>BITBUCKET</code>.
     * </p>
     * 
     * @param buildStatusConfig
     *        Contains information that defines how the build project reports the build status to the source provider.
     *        This option is only used when the source provider is <code>GITHUB</code>, <code>GITHUB_ENTERPRISE</code>,
     *        or <code>BITBUCKET</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withBuildStatusConfig(BuildStatusConfig buildStatusConfig) {
        setBuildStatusConfig(buildStatusConfig);
        return this;
    }

    /**
     * <p>
     * Enable this flag to ignore SSL warnings while connecting to the project source code.
     * </p>
     * 
     * @param insecureSsl
     *        Enable this flag to ignore SSL warnings while connecting to the project source code.
     */

    public void setInsecureSsl(Boolean insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    /**
     * <p>
     * Enable this flag to ignore SSL warnings while connecting to the project source code.
     * </p>
     * 
     * @return Enable this flag to ignore SSL warnings while connecting to the project source code.
     */

    public Boolean getInsecureSsl() {
        return this.insecureSsl;
    }

    /**
     * <p>
     * Enable this flag to ignore SSL warnings while connecting to the project source code.
     * </p>
     * 
     * @param insecureSsl
     *        Enable this flag to ignore SSL warnings while connecting to the project source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withInsecureSsl(Boolean insecureSsl) {
        setInsecureSsl(insecureSsl);
        return this;
    }

    /**
     * <p>
     * Enable this flag to ignore SSL warnings while connecting to the project source code.
     * </p>
     * 
     * @return Enable this flag to ignore SSL warnings while connecting to the project source code.
     */

    public Boolean isInsecureSsl() {
        return this.insecureSsl;
    }

    /**
     * <p>
     * An identifier for this project source. The identifier can only contain alphanumeric characters and underscores,
     * and must be less than 128 characters in length.
     * </p>
     * 
     * @param sourceIdentifier
     *        An identifier for this project source. The identifier can only contain alphanumeric characters and
     *        underscores, and must be less than 128 characters in length.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * An identifier for this project source. The identifier can only contain alphanumeric characters and underscores,
     * and must be less than 128 characters in length.
     * </p>
     * 
     * @return An identifier for this project source. The identifier can only contain alphanumeric characters and
     *         underscores, and must be less than 128 characters in length.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * An identifier for this project source. The identifier can only contain alphanumeric characters and underscores,
     * and must be less than 128 characters in length.
     * </p>
     * 
     * @param sourceIdentifier
     *        An identifier for this project source. The identifier can only contain alphanumeric characters and
     *        underscores, and must be less than 128 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getGitCloneDepth() != null)
            sb.append("GitCloneDepth: ").append(getGitCloneDepth()).append(",");
        if (getGitSubmodulesConfig() != null)
            sb.append("GitSubmodulesConfig: ").append(getGitSubmodulesConfig()).append(",");
        if (getBuildspec() != null)
            sb.append("Buildspec: ").append(getBuildspec()).append(",");
        if (getAuth() != null)
            sb.append("Auth: ").append(getAuth()).append(",");
        if (getReportBuildStatus() != null)
            sb.append("ReportBuildStatus: ").append(getReportBuildStatus()).append(",");
        if (getBuildStatusConfig() != null)
            sb.append("BuildStatusConfig: ").append(getBuildStatusConfig()).append(",");
        if (getInsecureSsl() != null)
            sb.append("InsecureSsl: ").append(getInsecureSsl()).append(",");
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: ").append(getSourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectSource == false)
            return false;
        ProjectSource other = (ProjectSource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getGitCloneDepth() == null ^ this.getGitCloneDepth() == null)
            return false;
        if (other.getGitCloneDepth() != null && other.getGitCloneDepth().equals(this.getGitCloneDepth()) == false)
            return false;
        if (other.getGitSubmodulesConfig() == null ^ this.getGitSubmodulesConfig() == null)
            return false;
        if (other.getGitSubmodulesConfig() != null && other.getGitSubmodulesConfig().equals(this.getGitSubmodulesConfig()) == false)
            return false;
        if (other.getBuildspec() == null ^ this.getBuildspec() == null)
            return false;
        if (other.getBuildspec() != null && other.getBuildspec().equals(this.getBuildspec()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        if (other.getReportBuildStatus() == null ^ this.getReportBuildStatus() == null)
            return false;
        if (other.getReportBuildStatus() != null && other.getReportBuildStatus().equals(this.getReportBuildStatus()) == false)
            return false;
        if (other.getBuildStatusConfig() == null ^ this.getBuildStatusConfig() == null)
            return false;
        if (other.getBuildStatusConfig() != null && other.getBuildStatusConfig().equals(this.getBuildStatusConfig()) == false)
            return false;
        if (other.getInsecureSsl() == null ^ this.getInsecureSsl() == null)
            return false;
        if (other.getInsecureSsl() != null && other.getInsecureSsl().equals(this.getInsecureSsl()) == false)
            return false;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getGitCloneDepth() == null) ? 0 : getGitCloneDepth().hashCode());
        hashCode = prime * hashCode + ((getGitSubmodulesConfig() == null) ? 0 : getGitSubmodulesConfig().hashCode());
        hashCode = prime * hashCode + ((getBuildspec() == null) ? 0 : getBuildspec().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        hashCode = prime * hashCode + ((getReportBuildStatus() == null) ? 0 : getReportBuildStatus().hashCode());
        hashCode = prime * hashCode + ((getBuildStatusConfig() == null) ? 0 : getBuildStatusConfig().hashCode());
        hashCode = prime * hashCode + ((getInsecureSsl() == null) ? 0 : getInsecureSsl().hashCode());
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ProjectSource clone() {
        try {
            return (ProjectSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
