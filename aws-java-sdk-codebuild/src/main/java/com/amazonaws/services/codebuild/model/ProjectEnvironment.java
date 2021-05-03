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
 * Information about the build environment of the build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectEnvironment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and
     * EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for this build project. Use the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;</code>. For example, in the Docker
     * repository that CodeBuild uses to manage its Docker images, this would be <code>aws/codebuild/standard:4.0</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>&lt;registry&gt;/&lt;repository&gt;@&lt;digest&gt;</code>. For example, to specify an
     * image with the digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * <code>&lt;registry&gt;/&lt;repository&gt;@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     * .
     * </p>
     * </li>
     * </ul>
     */
    private String image;
    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build Environment
     * Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * </p>
     */
    private String computeType;
    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     */
    private java.util.List<EnvironmentVariable> environmentVariables;
    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used to
     * build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your build by adding one of the following sets
     * of commands to the install phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous command does not work, add the
     * <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     */
    private Boolean privilegedMode;
    /**
     * <p>
     * The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded certificate for the
     * build project. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate"
     * >certificate</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     */
    private RegistryCredential registryCredential;
    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     */
    private String imagePullCredentialsType;

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and
     * EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of build environment to use for related builds.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *        (Sydney), and EU (Frankfurt).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     *        available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     *        (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *        US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia
     *        Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing),
     *        and China (Ningxia).
     *        </p>
     *        </li>
     * @see EnvironmentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and
     * EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of build environment to use for related builds.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *         East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *         (Sydney), and EU (Frankfurt).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code>
     *         is available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central),
     *         EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     *         (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *         US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia
     *         Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing),
     *         and China (Ningxia).
     *         </p>
     *         </li>
     * @see EnvironmentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and
     * EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of build environment to use for related builds.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *        (Sydney), and EU (Frankfurt).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     *        available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     *        (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *        US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia
     *        Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing),
     *        and China (Ningxia).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public ProjectEnvironment withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and
     * EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of build environment to use for related builds.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *        (Sydney), and EU (Frankfurt).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     *        available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     *        (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *        US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia
     *        Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing),
     *        and China (Ningxia).
     *        </p>
     *        </li>
     * @see EnvironmentType
     */

    public void setType(EnvironmentType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and
     * EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of build environment to use for related builds.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *        (Sydney), and EU (Frankfurt).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_CONTAINER</code> with compute type <code>build.general1.2xlarge</code> is
     *        available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     *        (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *        US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia
     *        Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing),
     *        and China (Ningxia).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public ProjectEnvironment withType(EnvironmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for this build project. Use the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;</code>. For example, in the Docker
     * repository that CodeBuild uses to manage its Docker images, this would be <code>aws/codebuild/standard:4.0</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>&lt;registry&gt;/&lt;repository&gt;@&lt;digest&gt;</code>. For example, to specify an
     * image with the digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * <code>&lt;registry&gt;/&lt;repository&gt;@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     * .
     * </p>
     * </li>
     * </ul>
     * 
     * @param image
     *        The image tag or image digest that identifies the Docker image to use for this build project. Use the
     *        following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an image tag: <code>&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;</code>. For example, in the Docker
     *        repository that CodeBuild uses to manage its Docker images, this would be
     *        <code>aws/codebuild/standard:4.0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an image digest: <code>&lt;registry&gt;/&lt;repository&gt;@&lt;digest&gt;</code>. For example, to
     *        specify an image with the digest
     *        "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     *        <code>&lt;registry&gt;/&lt;repository&gt;@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     *        .
     *        </p>
     *        </li>
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for this build project. Use the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;</code>. For example, in the Docker
     * repository that CodeBuild uses to manage its Docker images, this would be <code>aws/codebuild/standard:4.0</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>&lt;registry&gt;/&lt;repository&gt;@&lt;digest&gt;</code>. For example, to specify an
     * image with the digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * <code>&lt;registry&gt;/&lt;repository&gt;@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     * .
     * </p>
     * </li>
     * </ul>
     * 
     * @return The image tag or image digest that identifies the Docker image to use for this build project. Use the
     *         following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an image tag: <code>&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;</code>. For example, in the
     *         Docker repository that CodeBuild uses to manage its Docker images, this would be
     *         <code>aws/codebuild/standard:4.0</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an image digest: <code>&lt;registry&gt;/&lt;repository&gt;@&lt;digest&gt;</code>. For example, to
     *         specify an image with the digest
     *         "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     *         <code>&lt;registry&gt;/&lt;repository&gt;@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     *         .
     *         </p>
     *         </li>
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for this build project. Use the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;</code>. For example, in the Docker
     * repository that CodeBuild uses to manage its Docker images, this would be <code>aws/codebuild/standard:4.0</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>&lt;registry&gt;/&lt;repository&gt;@&lt;digest&gt;</code>. For example, to specify an
     * image with the digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * <code>&lt;registry&gt;/&lt;repository&gt;@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     * .
     * </p>
     * </li>
     * </ul>
     * 
     * @param image
     *        The image tag or image digest that identifies the Docker image to use for this build project. Use the
     *        following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an image tag: <code>&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;</code>. For example, in the Docker
     *        repository that CodeBuild uses to manage its Docker images, this would be
     *        <code>aws/codebuild/standard:4.0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an image digest: <code>&lt;registry&gt;/&lt;repository&gt;@&lt;digest&gt;</code>. For example, to
     *        specify an image with the digest
     *        "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     *        <code>&lt;registry&gt;/&lt;repository&gt;@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     *        .
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build Environment
     * Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * </p>
     * 
     * @param computeType
     *        Information about the compute resources the build project uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *        builds. This compute type supports Docker images up to 100 GB uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_LARGE</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *        NVIDIA Tesla V100 GPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        Environment Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build Environment
     * Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * </p>
     * 
     * @return Information about the compute resources the build project uses. Available values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *         environment type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *         builds. This compute type supports Docker images up to 100 GB uncompressed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use <code>BUILD_GENERAL1_LARGE</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *         NVIDIA Tesla V100 GPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *         processors for builds.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *         Environment Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build Environment
     * Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * </p>
     * 
     * @param computeType
     *        Information about the compute resources the build project uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *        builds. This compute type supports Docker images up to 100 GB uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_LARGE</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *        NVIDIA Tesla V100 GPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        Environment Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ProjectEnvironment withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build Environment
     * Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * </p>
     * 
     * @param computeType
     *        Information about the compute resources the build project uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *        builds. This compute type supports Docker images up to 100 GB uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_LARGE</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *        NVIDIA Tesla V100 GPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        Environment Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * @see ComputeType
     */

    public void setComputeType(ComputeType computeType) {
        withComputeType(computeType);
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build Environment
     * Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * </p>
     * 
     * @param computeType
     *        Information about the compute resources the build project uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *        builds. This compute type supports Docker images up to 100 GB uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_LARGE</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *        NVIDIA Tesla V100 GPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        Environment Compute Types</a> in the <i>AWS CodeBuild User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ProjectEnvironment withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @return A set of environment variables to make available to builds for this build project.
     */

    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     */

    public void setEnvironmentVariables(java.util.Collection<EnvironmentVariable> environmentVariables) {
        if (environmentVariables == null) {
            this.environmentVariables = null;
            return;
        }

        this.environmentVariables = new java.util.ArrayList<EnvironmentVariable>(environmentVariables);
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentVariables(java.util.Collection)} or {@link #withEnvironmentVariables(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withEnvironmentVariables(EnvironmentVariable... environmentVariables) {
        if (this.environmentVariables == null) {
            setEnvironmentVariables(new java.util.ArrayList<EnvironmentVariable>(environmentVariables.length));
        }
        for (EnvironmentVariable ele : environmentVariables) {
            this.environmentVariables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withEnvironmentVariables(java.util.Collection<EnvironmentVariable> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used to
     * build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your build by adding one of the following sets
     * of commands to the install phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous command does not work, add the
     * <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * 
     * @param privilegedMode
     *        Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used
     *        to build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. The
     *        default setting is <code>false</code>.</p>
     *        <p>
     *        You can initialize the Docker daemon during the install phase of your build by adding one of the following
     *        sets of commands to the install phase of your buildspec file:
     *        </p>
     *        <p>
     *        If the operating system's base image is Ubuntu Linux:
     *        </p>
     *        <p>
     *        <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *        </p>
     *        <p>
     *        <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *        </p>
     *        <p>
     *        If the operating system's base image is Alpine Linux and the previous command does not work, add the
     *        <code>-t</code> argument to <code>timeout</code>:
     *        </p>
     *        <p>
     *        <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *        </p>
     *        <p>
     *        <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     */

    public void setPrivilegedMode(Boolean privilegedMode) {
        this.privilegedMode = privilegedMode;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used to
     * build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your build by adding one of the following sets
     * of commands to the install phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous command does not work, add the
     * <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * 
     * @return Enables running the Docker daemon inside a Docker container. Set to true only if the build project is
     *         used to build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails.
     *         The default setting is <code>false</code>.</p>
     *         <p>
     *         You can initialize the Docker daemon during the install phase of your build by adding one of the
     *         following sets of commands to the install phase of your buildspec file:
     *         </p>
     *         <p>
     *         If the operating system's base image is Ubuntu Linux:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *         </p>
     *         <p>
     *         <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *         </p>
     *         <p>
     *         If the operating system's base image is Alpine Linux and the previous command does not work, add the
     *         <code>-t</code> argument to <code>timeout</code>:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *         </p>
     *         <p>
     *         <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     */

    public Boolean getPrivilegedMode() {
        return this.privilegedMode;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used to
     * build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your build by adding one of the following sets
     * of commands to the install phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous command does not work, add the
     * <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * 
     * @param privilegedMode
     *        Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used
     *        to build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. The
     *        default setting is <code>false</code>.</p>
     *        <p>
     *        You can initialize the Docker daemon during the install phase of your build by adding one of the following
     *        sets of commands to the install phase of your buildspec file:
     *        </p>
     *        <p>
     *        If the operating system's base image is Ubuntu Linux:
     *        </p>
     *        <p>
     *        <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *        </p>
     *        <p>
     *        <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *        </p>
     *        <p>
     *        If the operating system's base image is Alpine Linux and the previous command does not work, add the
     *        <code>-t</code> argument to <code>timeout</code>:
     *        </p>
     *        <p>
     *        <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *        </p>
     *        <p>
     *        <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withPrivilegedMode(Boolean privilegedMode) {
        setPrivilegedMode(privilegedMode);
        return this;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used to
     * build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your build by adding one of the following sets
     * of commands to the install phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous command does not work, add the
     * <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * 
     * @return Enables running the Docker daemon inside a Docker container. Set to true only if the build project is
     *         used to build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails.
     *         The default setting is <code>false</code>.</p>
     *         <p>
     *         You can initialize the Docker daemon during the install phase of your build by adding one of the
     *         following sets of commands to the install phase of your buildspec file:
     *         </p>
     *         <p>
     *         If the operating system's base image is Ubuntu Linux:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *         </p>
     *         <p>
     *         <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *         </p>
     *         <p>
     *         If the operating system's base image is Alpine Linux and the previous command does not work, add the
     *         <code>-t</code> argument to <code>timeout</code>:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *         </p>
     *         <p>
     *         <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     */

    public Boolean isPrivilegedMode() {
        return this.privilegedMode;
    }

    /**
     * <p>
     * The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded certificate for the
     * build project. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate"
     * >certificate</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @param certificate
     *        The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded certificate for
     *        the build project. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate"
     *        >certificate</a> in the <i>AWS CodeBuild User Guide</i>.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded certificate for the
     * build project. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate"
     * >certificate</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @return The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded certificate
     *         for the build project. For more information, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate"
     *         >certificate</a> in the <i>AWS CodeBuild User Guide</i>.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded certificate for the
     * build project. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate"
     * >certificate</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @param certificate
     *        The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded certificate for
     *        the build project. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate"
     *        >certificate</a> in the <i>AWS CodeBuild User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @param registryCredential
     *        The credentials for access to a private registry.
     */

    public void setRegistryCredential(RegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @return The credentials for access to a private registry.
     */

    public RegistryCredential getRegistryCredential() {
        return this.registryCredential;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @param registryCredential
     *        The credentials for access to a private registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withRegistryCredential(RegistryCredential registryCredential) {
        setRegistryCredential(registryCredential);
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsType
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *        use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @see ImagePullCredentialsType
     */

    public void setImagePullCredentialsType(String imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @return The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *         modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *         use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @see ImagePullCredentialsType
     */

    public String getImagePullCredentialsType() {
        return this.imagePullCredentialsType;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsType
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *        use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImagePullCredentialsType
     */

    public ProjectEnvironment withImagePullCredentialsType(String imagePullCredentialsType) {
        setImagePullCredentialsType(imagePullCredentialsType);
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsType
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *        use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @see ImagePullCredentialsType
     */

    public void setImagePullCredentialsType(ImagePullCredentialsType imagePullCredentialsType) {
        withImagePullCredentialsType(imagePullCredentialsType);
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsType
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *        use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImagePullCredentialsType
     */

    public ProjectEnvironment withImagePullCredentialsType(ImagePullCredentialsType imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType.toString();
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getPrivilegedMode() != null)
            sb.append("PrivilegedMode: ").append(getPrivilegedMode()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getRegistryCredential() != null)
            sb.append("RegistryCredential: ").append(getRegistryCredential()).append(",");
        if (getImagePullCredentialsType() != null)
            sb.append("ImagePullCredentialsType: ").append(getImagePullCredentialsType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectEnvironment == false)
            return false;
        ProjectEnvironment other = (ProjectEnvironment) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getPrivilegedMode() == null ^ this.getPrivilegedMode() == null)
            return false;
        if (other.getPrivilegedMode() != null && other.getPrivilegedMode().equals(this.getPrivilegedMode()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getRegistryCredential() == null ^ this.getRegistryCredential() == null)
            return false;
        if (other.getRegistryCredential() != null && other.getRegistryCredential().equals(this.getRegistryCredential()) == false)
            return false;
        if (other.getImagePullCredentialsType() == null ^ this.getImagePullCredentialsType() == null)
            return false;
        if (other.getImagePullCredentialsType() != null && other.getImagePullCredentialsType().equals(this.getImagePullCredentialsType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getPrivilegedMode() == null) ? 0 : getPrivilegedMode().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getRegistryCredential() == null) ? 0 : getRegistryCredential().hashCode());
        hashCode = prime * hashCode + ((getImagePullCredentialsType() == null) ? 0 : getImagePullCredentialsType().hashCode());
        return hashCode;
    }

    @Override
    public ProjectEnvironment clone() {
        try {
            return (ProjectEnvironment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectEnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
