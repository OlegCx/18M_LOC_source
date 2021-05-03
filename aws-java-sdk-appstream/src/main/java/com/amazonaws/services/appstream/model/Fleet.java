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
 * Describes a fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Fleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Fleet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the fleet.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The fleet name to display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description to display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the image used to create the fleet.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The ARN for the public, private, or shared image.
     * </p>
     */
    private String imageArn;
    /**
     * <p>
     * The instance type to use when launching fleet instances. The following instance types are available:
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
     * The fleet type.
     * </p>
     * <dl>
     * <dt>ALWAYS_ON</dt>
     * <dd>
     * <p>
     * Provides users with instant-on access to their apps. You are charged for all running instances in your fleet,
     * even if no users are streaming apps.
     * </p>
     * </dd>
     * <dt>ON_DEMAND</dt>
     * <dd>
     * <p>
     * Provide users with access to applications after they connect, which takes one to two minutes. You are charged for
     * instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.
     * </p>
     * </dd>
     * </dl>
     */
    private String fleetType;
    /**
     * <p>
     * The capacity status for the fleet.
     * </p>
     */
    private ComputeCapacityStatus computeCapacityStatus;
    /**
     * <p>
     * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected
     * to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents
     * before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance.
     * </p>
     * <p>
     * Specify a value between 600 and 360000.
     * </p>
     */
    private Integer maxUserDurationInSeconds;
    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect. If they try to reconnect to
     * the streaming session after a disconnection or network interruption within this time interval, they are connected
     * to their previous session. Otherwise, they are connected to a new session with a new streaming instance.
     * </p>
     * <p>
     * Specify a value between 60 and 360000.
     * </p>
     */
    private Integer disconnectTimeoutInSeconds;
    /**
     * <p>
     * The current state for the fleet.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The time the fleet was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The fleet errors.
     * </p>
     */
    private java.util.List<FleetError> fleetErrors;
    /**
     * <p>
     * Indicates whether default internet access is enabled for the fleet.
     * </p>
     */
    private Boolean enableDefaultInternetAccess;
    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory
     * domain.
     * </p>
     */
    private DomainJoinInfo domainJoinInfo;
    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before they are
     * disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval
     * specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their previous session. Users
     * are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads
     * and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be
     * idle after the time interval in <code>IdleDisconnectTimeoutInSeconds</code> elapses, they are disconnected.
     * </p>
     * <p>
     * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value
     * between 60 and 3600. The default value is 0.
     * </p>
     * <note>
     * <p>
     * If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of
     * minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For
     * example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a
     * value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify
     * a value of 90, users are disconnected after 2 minutes of inactivity.
     * </p>
     * </note>
     */
    private Integer idleDisconnectTimeoutInSeconds;
    /**
     * <p>
     * The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS Security
     * Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use. The operation
     * creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates
     * the <b>appstream_machine_role</b> credential profile on the instance.
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
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When <code>APP</code> is
     * specified, only the windows of applications opened by users display. When <code>DESKTOP</code> is specified, the
     * standard desktop that is provided by the operating system displays.
     * </p>
     * <p>
     * The default value is <code>APP</code>.
     * </p>
     */
    private String streamView;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the fleet.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the fleet.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the fleet.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the fleet.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the fleet.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param name
     *        The name of the fleet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param name
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The fleet name to display.
     * </p>
     * 
     * @param displayName
     *        The fleet name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The fleet name to display.
     * </p>
     * 
     * @return The fleet name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The fleet name to display.
     * </p>
     * 
     * @param displayName
     *        The fleet name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withDisplayName(String displayName) {
        setDisplayName(displayName);
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

    public Fleet withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the image used to create the fleet.
     * </p>
     * 
     * @param imageName
     *        The name of the image used to create the fleet.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image used to create the fleet.
     * </p>
     * 
     * @return The name of the image used to create the fleet.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image used to create the fleet.
     * </p>
     * 
     * @param imageName
     *        The name of the image used to create the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The ARN for the public, private, or shared image.
     * </p>
     * 
     * @param imageArn
     *        The ARN for the public, private, or shared image.
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The ARN for the public, private, or shared image.
     * </p>
     * 
     * @return The ARN for the public, private, or shared image.
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * <p>
     * The ARN for the public, private, or shared image.
     * </p>
     * 
     * @param imageArn
     *        The ARN for the public, private, or shared image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withImageArn(String imageArn) {
        setImageArn(imageArn);
        return this;
    }

    /**
     * <p>
     * The instance type to use when launching fleet instances. The following instance types are available:
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
     *        The instance type to use when launching fleet instances. The following instance types are available:</p>
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
     * The instance type to use when launching fleet instances. The following instance types are available:
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
     * @return The instance type to use when launching fleet instances. The following instance types are available:</p>
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
     * The instance type to use when launching fleet instances. The following instance types are available:
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
     *        The instance type to use when launching fleet instances. The following instance types are available:</p>
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

    public Fleet withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The fleet type.
     * </p>
     * <dl>
     * <dt>ALWAYS_ON</dt>
     * <dd>
     * <p>
     * Provides users with instant-on access to their apps. You are charged for all running instances in your fleet,
     * even if no users are streaming apps.
     * </p>
     * </dd>
     * <dt>ON_DEMAND</dt>
     * <dd>
     * <p>
     * Provide users with access to applications after they connect, which takes one to two minutes. You are charged for
     * instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param fleetType
     *        The fleet type.</p>
     *        <dl>
     *        <dt>ALWAYS_ON</dt>
     *        <dd>
     *        <p>
     *        Provides users with instant-on access to their apps. You are charged for all running instances in your
     *        fleet, even if no users are streaming apps.
     *        </p>
     *        </dd>
     *        <dt>ON_DEMAND</dt>
     *        <dd>
     *        <p>
     *        Provide users with access to applications after they connect, which takes one to two minutes. You are
     *        charged for instance streaming when users are connected and a small hourly fee for instances that are not
     *        streaming apps.
     *        </p>
     *        </dd>
     * @see FleetType
     */

    public void setFleetType(String fleetType) {
        this.fleetType = fleetType;
    }

    /**
     * <p>
     * The fleet type.
     * </p>
     * <dl>
     * <dt>ALWAYS_ON</dt>
     * <dd>
     * <p>
     * Provides users with instant-on access to their apps. You are charged for all running instances in your fleet,
     * even if no users are streaming apps.
     * </p>
     * </dd>
     * <dt>ON_DEMAND</dt>
     * <dd>
     * <p>
     * Provide users with access to applications after they connect, which takes one to two minutes. You are charged for
     * instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The fleet type.</p>
     *         <dl>
     *         <dt>ALWAYS_ON</dt>
     *         <dd>
     *         <p>
     *         Provides users with instant-on access to their apps. You are charged for all running instances in your
     *         fleet, even if no users are streaming apps.
     *         </p>
     *         </dd>
     *         <dt>ON_DEMAND</dt>
     *         <dd>
     *         <p>
     *         Provide users with access to applications after they connect, which takes one to two minutes. You are
     *         charged for instance streaming when users are connected and a small hourly fee for instances that are not
     *         streaming apps.
     *         </p>
     *         </dd>
     * @see FleetType
     */

    public String getFleetType() {
        return this.fleetType;
    }

    /**
     * <p>
     * The fleet type.
     * </p>
     * <dl>
     * <dt>ALWAYS_ON</dt>
     * <dd>
     * <p>
     * Provides users with instant-on access to their apps. You are charged for all running instances in your fleet,
     * even if no users are streaming apps.
     * </p>
     * </dd>
     * <dt>ON_DEMAND</dt>
     * <dd>
     * <p>
     * Provide users with access to applications after they connect, which takes one to two minutes. You are charged for
     * instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param fleetType
     *        The fleet type.</p>
     *        <dl>
     *        <dt>ALWAYS_ON</dt>
     *        <dd>
     *        <p>
     *        Provides users with instant-on access to their apps. You are charged for all running instances in your
     *        fleet, even if no users are streaming apps.
     *        </p>
     *        </dd>
     *        <dt>ON_DEMAND</dt>
     *        <dd>
     *        <p>
     *        Provide users with access to applications after they connect, which takes one to two minutes. You are
     *        charged for instance streaming when users are connected and a small hourly fee for instances that are not
     *        streaming apps.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public Fleet withFleetType(String fleetType) {
        setFleetType(fleetType);
        return this;
    }

    /**
     * <p>
     * The fleet type.
     * </p>
     * <dl>
     * <dt>ALWAYS_ON</dt>
     * <dd>
     * <p>
     * Provides users with instant-on access to their apps. You are charged for all running instances in your fleet,
     * even if no users are streaming apps.
     * </p>
     * </dd>
     * <dt>ON_DEMAND</dt>
     * <dd>
     * <p>
     * Provide users with access to applications after they connect, which takes one to two minutes. You are charged for
     * instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param fleetType
     *        The fleet type.</p>
     *        <dl>
     *        <dt>ALWAYS_ON</dt>
     *        <dd>
     *        <p>
     *        Provides users with instant-on access to their apps. You are charged for all running instances in your
     *        fleet, even if no users are streaming apps.
     *        </p>
     *        </dd>
     *        <dt>ON_DEMAND</dt>
     *        <dd>
     *        <p>
     *        Provide users with access to applications after they connect, which takes one to two minutes. You are
     *        charged for instance streaming when users are connected and a small hourly fee for instances that are not
     *        streaming apps.
     *        </p>
     *        </dd>
     * @see FleetType
     */

    public void setFleetType(FleetType fleetType) {
        withFleetType(fleetType);
    }

    /**
     * <p>
     * The fleet type.
     * </p>
     * <dl>
     * <dt>ALWAYS_ON</dt>
     * <dd>
     * <p>
     * Provides users with instant-on access to their apps. You are charged for all running instances in your fleet,
     * even if no users are streaming apps.
     * </p>
     * </dd>
     * <dt>ON_DEMAND</dt>
     * <dd>
     * <p>
     * Provide users with access to applications after they connect, which takes one to two minutes. You are charged for
     * instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param fleetType
     *        The fleet type.</p>
     *        <dl>
     *        <dt>ALWAYS_ON</dt>
     *        <dd>
     *        <p>
     *        Provides users with instant-on access to their apps. You are charged for all running instances in your
     *        fleet, even if no users are streaming apps.
     *        </p>
     *        </dd>
     *        <dt>ON_DEMAND</dt>
     *        <dd>
     *        <p>
     *        Provide users with access to applications after they connect, which takes one to two minutes. You are
     *        charged for instance streaming when users are connected and a small hourly fee for instances that are not
     *        streaming apps.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public Fleet withFleetType(FleetType fleetType) {
        this.fleetType = fleetType.toString();
        return this;
    }

    /**
     * <p>
     * The capacity status for the fleet.
     * </p>
     * 
     * @param computeCapacityStatus
     *        The capacity status for the fleet.
     */

    public void setComputeCapacityStatus(ComputeCapacityStatus computeCapacityStatus) {
        this.computeCapacityStatus = computeCapacityStatus;
    }

    /**
     * <p>
     * The capacity status for the fleet.
     * </p>
     * 
     * @return The capacity status for the fleet.
     */

    public ComputeCapacityStatus getComputeCapacityStatus() {
        return this.computeCapacityStatus;
    }

    /**
     * <p>
     * The capacity status for the fleet.
     * </p>
     * 
     * @param computeCapacityStatus
     *        The capacity status for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withComputeCapacityStatus(ComputeCapacityStatus computeCapacityStatus) {
        setComputeCapacityStatus(computeCapacityStatus);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected
     * to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents
     * before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance.
     * </p>
     * <p>
     * Specify a value between 600 and 360000.
     * </p>
     * 
     * @param maxUserDurationInSeconds
     *        The maximum amount of time that a streaming session can remain active, in seconds. If users are still
     *        connected to a streaming instance five minutes before this limit is reached, they are prompted to save any
     *        open documents before being disconnected. After this time elapses, the instance is terminated and replaced
     *        by a new instance. </p>
     *        <p>
     *        Specify a value between 600 and 360000.
     */

    public void setMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        this.maxUserDurationInSeconds = maxUserDurationInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected
     * to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents
     * before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance.
     * </p>
     * <p>
     * Specify a value between 600 and 360000.
     * </p>
     * 
     * @return The maximum amount of time that a streaming session can remain active, in seconds. If users are still
     *         connected to a streaming instance five minutes before this limit is reached, they are prompted to save
     *         any open documents before being disconnected. After this time elapses, the instance is terminated and
     *         replaced by a new instance. </p>
     *         <p>
     *         Specify a value between 600 and 360000.
     */

    public Integer getMaxUserDurationInSeconds() {
        return this.maxUserDurationInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected
     * to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents
     * before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance.
     * </p>
     * <p>
     * Specify a value between 600 and 360000.
     * </p>
     * 
     * @param maxUserDurationInSeconds
     *        The maximum amount of time that a streaming session can remain active, in seconds. If users are still
     *        connected to a streaming instance five minutes before this limit is reached, they are prompted to save any
     *        open documents before being disconnected. After this time elapses, the instance is terminated and replaced
     *        by a new instance. </p>
     *        <p>
     *        Specify a value between 600 and 360000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        setMaxUserDurationInSeconds(maxUserDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect. If they try to reconnect to
     * the streaming session after a disconnection or network interruption within this time interval, they are connected
     * to their previous session. Otherwise, they are connected to a new session with a new streaming instance.
     * </p>
     * <p>
     * Specify a value between 60 and 360000.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The amount of time that a streaming session remains active after users disconnect. If they try to
     *        reconnect to the streaming session after a disconnection or network interruption within this time
     *        interval, they are connected to their previous session. Otherwise, they are connected to a new session
     *        with a new streaming instance.</p>
     *        <p>
     *        Specify a value between 60 and 360000.
     */

    public void setDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect. If they try to reconnect to
     * the streaming session after a disconnection or network interruption within this time interval, they are connected
     * to their previous session. Otherwise, they are connected to a new session with a new streaming instance.
     * </p>
     * <p>
     * Specify a value between 60 and 360000.
     * </p>
     * 
     * @return The amount of time that a streaming session remains active after users disconnect. If they try to
     *         reconnect to the streaming session after a disconnection or network interruption within this time
     *         interval, they are connected to their previous session. Otherwise, they are connected to a new session
     *         with a new streaming instance.</p>
     *         <p>
     *         Specify a value between 60 and 360000.
     */

    public Integer getDisconnectTimeoutInSeconds() {
        return this.disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect. If they try to reconnect to
     * the streaming session after a disconnection or network interruption within this time interval, they are connected
     * to their previous session. Otherwise, they are connected to a new session with a new streaming instance.
     * </p>
     * <p>
     * Specify a value between 60 and 360000.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The amount of time that a streaming session remains active after users disconnect. If they try to
     *        reconnect to the streaming session after a disconnection or network interruption within this time
     *        interval, they are connected to their previous session. Otherwise, they are connected to a new session
     *        with a new streaming instance.</p>
     *        <p>
     *        Specify a value between 60 and 360000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        setDisconnectTimeoutInSeconds(disconnectTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @param state
     *        The current state for the fleet.
     * @see FleetState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @return The current state for the fleet.
     * @see FleetState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @param state
     *        The current state for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetState
     */

    public Fleet withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @param state
     *        The current state for the fleet.
     * @see FleetState
     */

    public void setState(FleetState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @param state
     *        The current state for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetState
     */

    public Fleet withState(FleetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the fleet.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @return The VPC configuration for the fleet.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The time the fleet was created.
     * </p>
     * 
     * @param createdTime
     *        The time the fleet was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time the fleet was created.
     * </p>
     * 
     * @return The time the fleet was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time the fleet was created.
     * </p>
     * 
     * @param createdTime
     *        The time the fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The fleet errors.
     * </p>
     * 
     * @return The fleet errors.
     */

    public java.util.List<FleetError> getFleetErrors() {
        return fleetErrors;
    }

    /**
     * <p>
     * The fleet errors.
     * </p>
     * 
     * @param fleetErrors
     *        The fleet errors.
     */

    public void setFleetErrors(java.util.Collection<FleetError> fleetErrors) {
        if (fleetErrors == null) {
            this.fleetErrors = null;
            return;
        }

        this.fleetErrors = new java.util.ArrayList<FleetError>(fleetErrors);
    }

    /**
     * <p>
     * The fleet errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetErrors(java.util.Collection)} or {@link #withFleetErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fleetErrors
     *        The fleet errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withFleetErrors(FleetError... fleetErrors) {
        if (this.fleetErrors == null) {
            setFleetErrors(new java.util.ArrayList<FleetError>(fleetErrors.length));
        }
        for (FleetError ele : fleetErrors) {
            this.fleetErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The fleet errors.
     * </p>
     * 
     * @param fleetErrors
     *        The fleet errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withFleetErrors(java.util.Collection<FleetError> fleetErrors) {
        setFleetErrors(fleetErrors);
        return this;
    }

    /**
     * <p>
     * Indicates whether default internet access is enabled for the fleet.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Indicates whether default internet access is enabled for the fleet.
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Indicates whether default internet access is enabled for the fleet.
     * </p>
     * 
     * @return Indicates whether default internet access is enabled for the fleet.
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Indicates whether default internet access is enabled for the fleet.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Indicates whether default internet access is enabled for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * <p>
     * Indicates whether default internet access is enabled for the fleet.
     * </p>
     * 
     * @return Indicates whether default internet access is enabled for the fleet.
     */

    public Boolean isEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory
     * domain.
     * </p>
     * 
     * @param domainJoinInfo
     *        The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active
     *        Directory domain.
     */

    public void setDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory
     * domain.
     * </p>
     * 
     * @return The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active
     *         Directory domain.
     */

    public DomainJoinInfo getDomainJoinInfo() {
        return this.domainJoinInfo;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory
     * domain.
     * </p>
     * 
     * @param domainJoinInfo
     *        The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active
     *        Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        setDomainJoinInfo(domainJoinInfo);
        return this;
    }

    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before they are
     * disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval
     * specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their previous session. Users
     * are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads
     * and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be
     * idle after the time interval in <code>IdleDisconnectTimeoutInSeconds</code> elapses, they are disconnected.
     * </p>
     * <p>
     * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value
     * between 60 and 3600. The default value is 0.
     * </p>
     * <note>
     * <p>
     * If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of
     * minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For
     * example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a
     * value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify
     * a value of 90, users are disconnected after 2 minutes of inactivity.
     * </p>
     * </note>
     * 
     * @param idleDisconnectTimeoutInSeconds
     *        The amount of time that users can be idle (inactive) before they are disconnected from their streaming
     *        session and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before
     *        they are disconnected due to inactivity. If users try to reconnect to the streaming session before the
     *        time interval specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their
     *        previous session. Users are considered idle when they stop providing keyboard or mouse input during their
     *        streaming session. File uploads and downloads, audio in, audio out, and pixels changing do not qualify as
     *        user activity. If users continue to be idle after the time interval in
     *        <code>IdleDisconnectTimeoutInSeconds</code> elapses, they are disconnected.</p>
     *        <p>
     *        To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a
     *        value between 60 and 3600. The default value is 0.
     *        </p>
     *        <note>
     *        <p>
     *        If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole
     *        number of minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the
     *        nearest minute. For example, if you specify a value of 70, users are disconnected after 1 minute of
     *        inactivity. If you specify a value that is at the midpoint between two different minutes, the value is
     *        rounded up. For example, if you specify a value of 90, users are disconnected after 2 minutes of
     *        inactivity.
     *        </p>
     */

    public void setIdleDisconnectTimeoutInSeconds(Integer idleDisconnectTimeoutInSeconds) {
        this.idleDisconnectTimeoutInSeconds = idleDisconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before they are
     * disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval
     * specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their previous session. Users
     * are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads
     * and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be
     * idle after the time interval in <code>IdleDisconnectTimeoutInSeconds</code> elapses, they are disconnected.
     * </p>
     * <p>
     * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value
     * between 60 and 3600. The default value is 0.
     * </p>
     * <note>
     * <p>
     * If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of
     * minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For
     * example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a
     * value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify
     * a value of 90, users are disconnected after 2 minutes of inactivity.
     * </p>
     * </note>
     * 
     * @return The amount of time that users can be idle (inactive) before they are disconnected from their streaming
     *         session and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before
     *         they are disconnected due to inactivity. If users try to reconnect to the streaming session before the
     *         time interval specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their
     *         previous session. Users are considered idle when they stop providing keyboard or mouse input during their
     *         streaming session. File uploads and downloads, audio in, audio out, and pixels changing do not qualify as
     *         user activity. If users continue to be idle after the time interval in
     *         <code>IdleDisconnectTimeoutInSeconds</code> elapses, they are disconnected.</p>
     *         <p>
     *         To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a
     *         value between 60 and 3600. The default value is 0.
     *         </p>
     *         <note>
     *         <p>
     *         If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole
     *         number of minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the
     *         nearest minute. For example, if you specify a value of 70, users are disconnected after 1 minute of
     *         inactivity. If you specify a value that is at the midpoint between two different minutes, the value is
     *         rounded up. For example, if you specify a value of 90, users are disconnected after 2 minutes of
     *         inactivity.
     *         </p>
     */

    public Integer getIdleDisconnectTimeoutInSeconds() {
        return this.idleDisconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before they are
     * disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval
     * specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their previous session. Users
     * are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads
     * and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be
     * idle after the time interval in <code>IdleDisconnectTimeoutInSeconds</code> elapses, they are disconnected.
     * </p>
     * <p>
     * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value
     * between 60 and 3600. The default value is 0.
     * </p>
     * <note>
     * <p>
     * If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of
     * minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For
     * example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a
     * value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify
     * a value of 90, users are disconnected after 2 minutes of inactivity.
     * </p>
     * </note>
     * 
     * @param idleDisconnectTimeoutInSeconds
     *        The amount of time that users can be idle (inactive) before they are disconnected from their streaming
     *        session and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before
     *        they are disconnected due to inactivity. If users try to reconnect to the streaming session before the
     *        time interval specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their
     *        previous session. Users are considered idle when they stop providing keyboard or mouse input during their
     *        streaming session. File uploads and downloads, audio in, audio out, and pixels changing do not qualify as
     *        user activity. If users continue to be idle after the time interval in
     *        <code>IdleDisconnectTimeoutInSeconds</code> elapses, they are disconnected.</p>
     *        <p>
     *        To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a
     *        value between 60 and 3600. The default value is 0.
     *        </p>
     *        <note>
     *        <p>
     *        If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole
     *        number of minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the
     *        nearest minute. For example, if you specify a value of 70, users are disconnected after 1 minute of
     *        inactivity. If you specify a value that is at the midpoint between two different minutes, the value is
     *        rounded up. For example, if you specify a value of 90, users are disconnected after 2 minutes of
     *        inactivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withIdleDisconnectTimeoutInSeconds(Integer idleDisconnectTimeoutInSeconds) {
        setIdleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS Security
     * Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use. The operation
     * creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates
     * the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS
     *        Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use.
     *        The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary
     *        credentials and creates the <b>appstream_machine_role</b> credential profile on the instance.</p>
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
     * The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS Security
     * Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use. The operation
     * creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates
     * the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @return The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS
     *         Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use.
     *         The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary
     *         credentials and creates the <b>appstream_machine_role</b> credential profile on the instance.</p>
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
     * The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS Security
     * Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use. The operation
     * creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates
     * the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS
     *        Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use.
     *        The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary
     *        credentials and creates the <b>appstream_machine_role</b> credential profile on the instance.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *        >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *        Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When <code>APP</code> is
     * specified, only the windows of applications opened by users display. When <code>DESKTOP</code> is specified, the
     * standard desktop that is provided by the operating system displays.
     * </p>
     * <p>
     * The default value is <code>APP</code>.
     * </p>
     * 
     * @param streamView
     *        The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     *        <code>APP</code> is specified, only the windows of applications opened by users display. When
     *        <code>DESKTOP</code> is specified, the standard desktop that is provided by the operating system
     *        displays.</p>
     *        <p>
     *        The default value is <code>APP</code>.
     * @see StreamView
     */

    public void setStreamView(String streamView) {
        this.streamView = streamView;
    }

    /**
     * <p>
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When <code>APP</code> is
     * specified, only the windows of applications opened by users display. When <code>DESKTOP</code> is specified, the
     * standard desktop that is provided by the operating system displays.
     * </p>
     * <p>
     * The default value is <code>APP</code>.
     * </p>
     * 
     * @return The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     *         <code>APP</code> is specified, only the windows of applications opened by users display. When
     *         <code>DESKTOP</code> is specified, the standard desktop that is provided by the operating system
     *         displays.</p>
     *         <p>
     *         The default value is <code>APP</code>.
     * @see StreamView
     */

    public String getStreamView() {
        return this.streamView;
    }

    /**
     * <p>
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When <code>APP</code> is
     * specified, only the windows of applications opened by users display. When <code>DESKTOP</code> is specified, the
     * standard desktop that is provided by the operating system displays.
     * </p>
     * <p>
     * The default value is <code>APP</code>.
     * </p>
     * 
     * @param streamView
     *        The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     *        <code>APP</code> is specified, only the windows of applications opened by users display. When
     *        <code>DESKTOP</code> is specified, the standard desktop that is provided by the operating system
     *        displays.</p>
     *        <p>
     *        The default value is <code>APP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamView
     */

    public Fleet withStreamView(String streamView) {
        setStreamView(streamView);
        return this;
    }

    /**
     * <p>
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When <code>APP</code> is
     * specified, only the windows of applications opened by users display. When <code>DESKTOP</code> is specified, the
     * standard desktop that is provided by the operating system displays.
     * </p>
     * <p>
     * The default value is <code>APP</code>.
     * </p>
     * 
     * @param streamView
     *        The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     *        <code>APP</code> is specified, only the windows of applications opened by users display. When
     *        <code>DESKTOP</code> is specified, the standard desktop that is provided by the operating system
     *        displays.</p>
     *        <p>
     *        The default value is <code>APP</code>.
     * @see StreamView
     */

    public void setStreamView(StreamView streamView) {
        withStreamView(streamView);
    }

    /**
     * <p>
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When <code>APP</code> is
     * specified, only the windows of applications opened by users display. When <code>DESKTOP</code> is specified, the
     * standard desktop that is provided by the operating system displays.
     * </p>
     * <p>
     * The default value is <code>APP</code>.
     * </p>
     * 
     * @param streamView
     *        The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     *        <code>APP</code> is specified, only the windows of applications opened by users display. When
     *        <code>DESKTOP</code> is specified, the standard desktop that is provided by the operating system
     *        displays.</p>
     *        <p>
     *        The default value is <code>APP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamView
     */

    public Fleet withStreamView(StreamView streamView) {
        this.streamView = streamView.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getFleetType() != null)
            sb.append("FleetType: ").append(getFleetType()).append(",");
        if (getComputeCapacityStatus() != null)
            sb.append("ComputeCapacityStatus: ").append(getComputeCapacityStatus()).append(",");
        if (getMaxUserDurationInSeconds() != null)
            sb.append("MaxUserDurationInSeconds: ").append(getMaxUserDurationInSeconds()).append(",");
        if (getDisconnectTimeoutInSeconds() != null)
            sb.append("DisconnectTimeoutInSeconds: ").append(getDisconnectTimeoutInSeconds()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getFleetErrors() != null)
            sb.append("FleetErrors: ").append(getFleetErrors()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getDomainJoinInfo() != null)
            sb.append("DomainJoinInfo: ").append(getDomainJoinInfo()).append(",");
        if (getIdleDisconnectTimeoutInSeconds() != null)
            sb.append("IdleDisconnectTimeoutInSeconds: ").append(getIdleDisconnectTimeoutInSeconds()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getStreamView() != null)
            sb.append("StreamView: ").append(getStreamView());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Fleet == false)
            return false;
        Fleet other = (Fleet) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getFleetType() == null ^ this.getFleetType() == null)
            return false;
        if (other.getFleetType() != null && other.getFleetType().equals(this.getFleetType()) == false)
            return false;
        if (other.getComputeCapacityStatus() == null ^ this.getComputeCapacityStatus() == null)
            return false;
        if (other.getComputeCapacityStatus() != null && other.getComputeCapacityStatus().equals(this.getComputeCapacityStatus()) == false)
            return false;
        if (other.getMaxUserDurationInSeconds() == null ^ this.getMaxUserDurationInSeconds() == null)
            return false;
        if (other.getMaxUserDurationInSeconds() != null && other.getMaxUserDurationInSeconds().equals(this.getMaxUserDurationInSeconds()) == false)
            return false;
        if (other.getDisconnectTimeoutInSeconds() == null ^ this.getDisconnectTimeoutInSeconds() == null)
            return false;
        if (other.getDisconnectTimeoutInSeconds() != null && other.getDisconnectTimeoutInSeconds().equals(this.getDisconnectTimeoutInSeconds()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getFleetErrors() == null ^ this.getFleetErrors() == null)
            return false;
        if (other.getFleetErrors() != null && other.getFleetErrors().equals(this.getFleetErrors()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getDomainJoinInfo() == null ^ this.getDomainJoinInfo() == null)
            return false;
        if (other.getDomainJoinInfo() != null && other.getDomainJoinInfo().equals(this.getDomainJoinInfo()) == false)
            return false;
        if (other.getIdleDisconnectTimeoutInSeconds() == null ^ this.getIdleDisconnectTimeoutInSeconds() == null)
            return false;
        if (other.getIdleDisconnectTimeoutInSeconds() != null
                && other.getIdleDisconnectTimeoutInSeconds().equals(this.getIdleDisconnectTimeoutInSeconds()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getStreamView() == null ^ this.getStreamView() == null)
            return false;
        if (other.getStreamView() != null && other.getStreamView().equals(this.getStreamView()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getFleetType() == null) ? 0 : getFleetType().hashCode());
        hashCode = prime * hashCode + ((getComputeCapacityStatus() == null) ? 0 : getComputeCapacityStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxUserDurationInSeconds() == null) ? 0 : getMaxUserDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDisconnectTimeoutInSeconds() == null) ? 0 : getDisconnectTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getFleetErrors() == null) ? 0 : getFleetErrors().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getDomainJoinInfo() == null) ? 0 : getDomainJoinInfo().hashCode());
        hashCode = prime * hashCode + ((getIdleDisconnectTimeoutInSeconds() == null) ? 0 : getIdleDisconnectTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStreamView() == null) ? 0 : getStreamView().hashCode());
        return hashCode;
    }

    @Override
    public Fleet clone() {
        try {
            return (Fleet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.FleetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
