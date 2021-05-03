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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a virtual machine that is used to create an image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ImageBuilder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageBuilder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the image builder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN for the image builder.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of the image from which this builder was created.
     * </p>
     */
    private String imageArn;
    /**
     * <p>
     * The description to display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The image builder name to display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The VPC configuration of the image builder.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The instance type for the image builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.small
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.3xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.6xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.12xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.12xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.16xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * </ul>
     */
    private String instanceType;
    /**
     * <p>
     * The operating system platform of the image builder.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls the AWS
     * Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use. The
     * operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and
     * creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The state of the image builder.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason why the last state change occurred.
     * </p>
     */
    private ImageBuilderStateChangeReason stateChangeReason;
    /**
     * <p>
     * The time stamp when the image builder was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     */
    private Boolean enableDefaultInternetAccess;
    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active
     * Directory domain.
     * </p>
     */
    private DomainJoinInfo domainJoinInfo;

    private NetworkAccessConfiguration networkAccessConfiguration;
    /**
     * <p>
     * The image builder errors.
     * </p>
     */
    private java.util.List<ResourceError> imageBuilderErrors;
    /**
     * <p>
     * The version of the AppStream 2.0 agent that is currently being used by the image builder.
     * </p>
     */
    private String appstreamAgentVersion;
    /**
     * <p>
     * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image
     * builder only through the specified endpoints.
     * </p>
     */
    private java.util.List<AccessEndpoint> accessEndpoints;

    /**
     * <p>
     * The name of the image builder.
     * </p>
     * 
     * @param name
     *        The name of the image builder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image builder.
     * </p>
     * 
     * @return The name of the image builder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image builder.
     * </p>
     * 
     * @param name
     *        The name of the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN for the image builder.
     * </p>
     * 
     * @param arn
     *        The ARN for the image builder.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the image builder.
     * </p>
     * 
     * @return The ARN for the image builder.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the image builder.
     * </p>
     * 
     * @param arn
     *        The ARN for the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ARN of the image from which this builder was created.
     * </p>
     * 
     * @param imageArn
     *        The ARN of the image from which this builder was created.
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The ARN of the image from which this builder was created.
     * </p>
     * 
     * @return The ARN of the image from which this builder was created.
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * <p>
     * The ARN of the image from which this builder was created.
     * </p>
     * 
     * @param imageArn
     *        The ARN of the image from which this builder was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withImageArn(String imageArn) {
        setImageArn(imageArn);
        return this;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @param description
     *        The description to display.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @return The description to display.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @param description
     *        The description to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The image builder name to display.
     * </p>
     * 
     * @param displayName
     *        The image builder name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The image builder name to display.
     * </p>
     * 
     * @return The image builder name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The image builder name to display.
     * </p>
     * 
     * @param displayName
     *        The image builder name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The VPC configuration of the image builder.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration of the image builder.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration of the image builder.
     * </p>
     * 
     * @return The VPC configuration of the image builder.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration of the image builder.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration of the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The instance type for the image builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.small
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.3xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.6xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.12xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.12xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.16xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        The instance type for the image builder. The following instance types are available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        stream.standard.small
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.medium
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.3xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.6xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.12xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-desktop.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.12xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.16xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.16xlarge
     *        </p>
     *        </li>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for the image builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.small
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.3xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.6xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.12xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.12xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.16xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @return The instance type for the image builder. The following instance types are available:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         stream.standard.small
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.standard.medium
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.standard.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.z1d.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.z1d.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.z1d.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.z1d.3xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.z1d.6xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.z1d.12xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-design.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-design.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-design.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-design.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-desktop.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics.g4dn.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics.g4dn.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics.g4dn.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics.g4dn.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics.g4dn.12xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics.g4dn.16xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.16xlarge
     *         </p>
     *         </li>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for the image builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.small
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.3xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.6xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.z1d.12xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.12xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics.g4dn.16xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        The instance type for the image builder. The following instance types are available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        stream.standard.small
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.medium
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.3xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.6xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.z1d.12xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-desktop.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.12xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics.g4dn.16xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.16xlarge
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The operating system platform of the image builder.
     * </p>
     * 
     * @param platform
     *        The operating system platform of the image builder.
     * @see PlatformType
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system platform of the image builder.
     * </p>
     * 
     * @return The operating system platform of the image builder.
     * @see PlatformType
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The operating system platform of the image builder.
     * </p>
     * 
     * @param platform
     *        The operating system platform of the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public ImageBuilder withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The operating system platform of the image builder.
     * </p>
     * 
     * @param platform
     *        The operating system platform of the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public ImageBuilder withPlatform(PlatformType platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls the AWS
     * Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use. The
     * operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and
     * creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls
     *        the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role
     *        to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
     *        temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the
     *        instance.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *        >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *        Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls the AWS
     * Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use. The
     * operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and
     * creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @return The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls
     *         the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role
     *         to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
     *         temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the
     *         instance.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *         >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *         Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls the AWS
     * Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use. The
     * operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and
     * creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls
     *        the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role
     *        to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
     *        temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the
     *        instance.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *        >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *        Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The state of the image builder.
     * </p>
     * 
     * @param state
     *        The state of the image builder.
     * @see ImageBuilderState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the image builder.
     * </p>
     * 
     * @return The state of the image builder.
     * @see ImageBuilderState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the image builder.
     * </p>
     * 
     * @param state
     *        The state of the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageBuilderState
     */

    public ImageBuilder withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the image builder.
     * </p>
     * 
     * @param state
     *        The state of the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageBuilderState
     */

    public ImageBuilder withState(ImageBuilderState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason why the last state change occurred.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason why the last state change occurred.
     */

    public void setStateChangeReason(ImageBuilderStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason why the last state change occurred.
     * </p>
     * 
     * @return The reason why the last state change occurred.
     */

    public ImageBuilderStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The reason why the last state change occurred.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason why the last state change occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withStateChangeReason(ImageBuilderStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * The time stamp when the image builder was created.
     * </p>
     * 
     * @param createdTime
     *        The time stamp when the image builder was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time stamp when the image builder was created.
     * </p>
     * 
     * @return The time stamp when the image builder was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time stamp when the image builder was created.
     * </p>
     * 
     * @param createdTime
     *        The time stamp when the image builder was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the image builder.
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @return Enables or disables default internet access for the image builder.
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @return Enables or disables default internet access for the image builder.
     */

    public Boolean isEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active
     * Directory domain.
     * </p>
     * 
     * @param domainJoinInfo
     *        The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft
     *        Active Directory domain.
     */

    public void setDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active
     * Directory domain.
     * </p>
     * 
     * @return The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft
     *         Active Directory domain.
     */

    public DomainJoinInfo getDomainJoinInfo() {
        return this.domainJoinInfo;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active
     * Directory domain.
     * </p>
     * 
     * @param domainJoinInfo
     *        The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft
     *        Active Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        setDomainJoinInfo(domainJoinInfo);
        return this;
    }

    /**
     * @param networkAccessConfiguration
     */

    public void setNetworkAccessConfiguration(NetworkAccessConfiguration networkAccessConfiguration) {
        this.networkAccessConfiguration = networkAccessConfiguration;
    }

    /**
     * @return
     */

    public NetworkAccessConfiguration getNetworkAccessConfiguration() {
        return this.networkAccessConfiguration;
    }

    /**
     * @param networkAccessConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withNetworkAccessConfiguration(NetworkAccessConfiguration networkAccessConfiguration) {
        setNetworkAccessConfiguration(networkAccessConfiguration);
        return this;
    }

    /**
     * <p>
     * The image builder errors.
     * </p>
     * 
     * @return The image builder errors.
     */

    public java.util.List<ResourceError> getImageBuilderErrors() {
        return imageBuilderErrors;
    }

    /**
     * <p>
     * The image builder errors.
     * </p>
     * 
     * @param imageBuilderErrors
     *        The image builder errors.
     */

    public void setImageBuilderErrors(java.util.Collection<ResourceError> imageBuilderErrors) {
        if (imageBuilderErrors == null) {
            this.imageBuilderErrors = null;
            return;
        }

        this.imageBuilderErrors = new java.util.ArrayList<ResourceError>(imageBuilderErrors);
    }

    /**
     * <p>
     * The image builder errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageBuilderErrors(java.util.Collection)} or {@link #withImageBuilderErrors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param imageBuilderErrors
     *        The image builder errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withImageBuilderErrors(ResourceError... imageBuilderErrors) {
        if (this.imageBuilderErrors == null) {
            setImageBuilderErrors(new java.util.ArrayList<ResourceError>(imageBuilderErrors.length));
        }
        for (ResourceError ele : imageBuilderErrors) {
            this.imageBuilderErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The image builder errors.
     * </p>
     * 
     * @param imageBuilderErrors
     *        The image builder errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withImageBuilderErrors(java.util.Collection<ResourceError> imageBuilderErrors) {
        setImageBuilderErrors(imageBuilderErrors);
        return this;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent that is currently being used by the image builder.
     * </p>
     * 
     * @param appstreamAgentVersion
     *        The version of the AppStream 2.0 agent that is currently being used by the image builder.
     */

    public void setAppstreamAgentVersion(String appstreamAgentVersion) {
        this.appstreamAgentVersion = appstreamAgentVersion;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent that is currently being used by the image builder.
     * </p>
     * 
     * @return The version of the AppStream 2.0 agent that is currently being used by the image builder.
     */

    public String getAppstreamAgentVersion() {
        return this.appstreamAgentVersion;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent that is currently being used by the image builder.
     * </p>
     * 
     * @param appstreamAgentVersion
     *        The version of the AppStream 2.0 agent that is currently being used by the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withAppstreamAgentVersion(String appstreamAgentVersion) {
        setAppstreamAgentVersion(appstreamAgentVersion);
        return this;
    }

    /**
     * <p>
     * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image
     * builder only through the specified endpoints.
     * </p>
     * 
     * @return The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the
     *         image builder only through the specified endpoints.
     */

    public java.util.List<AccessEndpoint> getAccessEndpoints() {
        return accessEndpoints;
    }

    /**
     * <p>
     * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image
     * builder only through the specified endpoints.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the
     *        image builder only through the specified endpoints.
     */

    public void setAccessEndpoints(java.util.Collection<AccessEndpoint> accessEndpoints) {
        if (accessEndpoints == null) {
            this.accessEndpoints = null;
            return;
        }

        this.accessEndpoints = new java.util.ArrayList<AccessEndpoint>(accessEndpoints);
    }

    /**
     * <p>
     * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image
     * builder only through the specified endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessEndpoints(java.util.Collection)} or {@link #withAccessEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the
     *        image builder only through the specified endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withAccessEndpoints(AccessEndpoint... accessEndpoints) {
        if (this.accessEndpoints == null) {
            setAccessEndpoints(new java.util.ArrayList<AccessEndpoint>(accessEndpoints.length));
        }
        for (AccessEndpoint ele : accessEndpoints) {
            this.accessEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image
     * builder only through the specified endpoints.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the
     *        image builder only through the specified endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withAccessEndpoints(java.util.Collection<AccessEndpoint> accessEndpoints) {
        setAccessEndpoints(accessEndpoints);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getDomainJoinInfo() != null)
            sb.append("DomainJoinInfo: ").append(getDomainJoinInfo()).append(",");
        if (getNetworkAccessConfiguration() != null)
            sb.append("NetworkAccessConfiguration: ").append(getNetworkAccessConfiguration()).append(",");
        if (getImageBuilderErrors() != null)
            sb.append("ImageBuilderErrors: ").append(getImageBuilderErrors()).append(",");
        if (getAppstreamAgentVersion() != null)
            sb.append("AppstreamAgentVersion: ").append(getAppstreamAgentVersion()).append(",");
        if (getAccessEndpoints() != null)
            sb.append("AccessEndpoints: ").append(getAccessEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageBuilder == false)
            return false;
        ImageBuilder other = (ImageBuilder) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getDomainJoinInfo() == null ^ this.getDomainJoinInfo() == null)
            return false;
        if (other.getDomainJoinInfo() != null && other.getDomainJoinInfo().equals(this.getDomainJoinInfo()) == false)
            return false;
        if (other.getNetworkAccessConfiguration() == null ^ this.getNetworkAccessConfiguration() == null)
            return false;
        if (other.getNetworkAccessConfiguration() != null && other.getNetworkAccessConfiguration().equals(this.getNetworkAccessConfiguration()) == false)
            return false;
        if (other.getImageBuilderErrors() == null ^ this.getImageBuilderErrors() == null)
            return false;
        if (other.getImageBuilderErrors() != null && other.getImageBuilderErrors().equals(this.getImageBuilderErrors()) == false)
            return false;
        if (other.getAppstreamAgentVersion() == null ^ this.getAppstreamAgentVersion() == null)
            return false;
        if (other.getAppstreamAgentVersion() != null && other.getAppstreamAgentVersion().equals(this.getAppstreamAgentVersion()) == false)
            return false;
        if (other.getAccessEndpoints() == null ^ this.getAccessEndpoints() == null)
            return false;
        if (other.getAccessEndpoints() != null && other.getAccessEndpoints().equals(this.getAccessEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getDomainJoinInfo() == null) ? 0 : getDomainJoinInfo().hashCode());
        hashCode = prime * hashCode + ((getNetworkAccessConfiguration() == null) ? 0 : getNetworkAccessConfiguration().hashCode());
        hashCode = prime * hashCode + ((getImageBuilderErrors() == null) ? 0 : getImageBuilderErrors().hashCode());
        hashCode = prime * hashCode + ((getAppstreamAgentVersion() == null) ? 0 : getAppstreamAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getAccessEndpoints() == null) ? 0 : getAccessEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public ImageBuilder clone() {
        try {
            return (ImageBuilder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ImageBuilderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
