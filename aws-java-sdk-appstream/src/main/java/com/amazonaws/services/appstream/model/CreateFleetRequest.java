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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the fleet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the image used to create the fleet.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The ARN of the public, private, or shared image to use.
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
     * The desired capacity for the fleet.
     * </p>
     */
    private ComputeCapacity computeCapacity;
    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     */
    private VpcConfig vpcConfig;
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
     * The amount of time that a streaming session remains active after users disconnect. If users try to reconnect to
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
     * The description to display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The fleet name to display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * Enables or disables default internet access for the fleet.
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
     * The tags to associate with the fleet. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before they are
     * disconnected due to inactivity. If they try to reconnect to the streaming session before the time interval
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
     * The Amazon Resource Name (ARN) of the IAM role to apply to the fleet. To assume a role, a fleet instance calls
     * the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use.
     * The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials
     * and creates the <b>appstream_machine_role</b> credential profile on the instance.
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
     * A unique name for the fleet.
     * </p>
     * 
     * @param name
     *        A unique name for the fleet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the fleet.
     * </p>
     * 
     * @return A unique name for the fleet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the fleet.
     * </p>
     * 
     * @param name
     *        A unique name for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withName(String name) {
        setName(name);
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

    public CreateFleetRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The ARN of the public, private, or shared image to use.
     * </p>
     * 
     * @param imageArn
     *        The ARN of the public, private, or shared image to use.
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The ARN of the public, private, or shared image to use.
     * </p>
     * 
     * @return The ARN of the public, private, or shared image to use.
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * <p>
     * The ARN of the public, private, or shared image to use.
     * </p>
     * 
     * @param imageArn
     *        The ARN of the public, private, or shared image to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withImageArn(String imageArn) {
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

    public CreateFleetRequest withInstanceType(String instanceType) {
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

    public CreateFleetRequest withFleetType(String fleetType) {
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public CreateFleetRequest withFleetType(FleetType fleetType) {
        this.fleetType = fleetType.toString();
        return this;
    }

    /**
     * <p>
     * The desired capacity for the fleet.
     * </p>
     * 
     * @param computeCapacity
     *        The desired capacity for the fleet.
     */

    public void setComputeCapacity(ComputeCapacity computeCapacity) {
        this.computeCapacity = computeCapacity;
    }

    /**
     * <p>
     * The desired capacity for the fleet.
     * </p>
     * 
     * @return The desired capacity for the fleet.
     */

    public ComputeCapacity getComputeCapacity() {
        return this.computeCapacity;
    }

    /**
     * <p>
     * The desired capacity for the fleet.
     * </p>
     * 
     * @param computeCapacity
     *        The desired capacity for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withComputeCapacity(ComputeCapacity computeCapacity) {
        setComputeCapacity(computeCapacity);
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

    public CreateFleetRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
     *        by a new instance.</p>
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
     *         replaced by a new instance.</p>
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
     *        by a new instance.</p>
     *        <p>
     *        Specify a value between 600 and 360000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        setMaxUserDurationInSeconds(maxUserDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect. If users try to reconnect to
     * the streaming session after a disconnection or network interruption within this time interval, they are connected
     * to their previous session. Otherwise, they are connected to a new session with a new streaming instance.
     * </p>
     * <p>
     * Specify a value between 60 and 360000.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The amount of time that a streaming session remains active after users disconnect. If users try to
     *        reconnect to the streaming session after a disconnection or network interruption within this time
     *        interval, they are connected to their previous session. Otherwise, they are connected to a new session
     *        with a new streaming instance. </p>
     *        <p>
     *        Specify a value between 60 and 360000.
     */

    public void setDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect. If users try to reconnect to
     * the streaming session after a disconnection or network interruption within this time interval, they are connected
     * to their previous session. Otherwise, they are connected to a new session with a new streaming instance.
     * </p>
     * <p>
     * Specify a value between 60 and 360000.
     * </p>
     * 
     * @return The amount of time that a streaming session remains active after users disconnect. If users try to
     *         reconnect to the streaming session after a disconnection or network interruption within this time
     *         interval, they are connected to their previous session. Otherwise, they are connected to a new session
     *         with a new streaming instance. </p>
     *         <p>
     *         Specify a value between 60 and 360000.
     */

    public Integer getDisconnectTimeoutInSeconds() {
        return this.disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect. If users try to reconnect to
     * the streaming session after a disconnection or network interruption within this time interval, they are connected
     * to their previous session. Otherwise, they are connected to a new session with a new streaming instance.
     * </p>
     * <p>
     * Specify a value between 60 and 360000.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The amount of time that a streaming session remains active after users disconnect. If users try to
     *        reconnect to the streaming session after a disconnection or network interruption within this time
     *        interval, they are connected to their previous session. Otherwise, they are connected to a new session
     *        with a new streaming instance. </p>
     *        <p>
     *        Specify a value between 60 and 360000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        setDisconnectTimeoutInSeconds(disconnectTimeoutInSeconds);
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

    public CreateFleetRequest withDescription(String description) {
        setDescription(description);
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

    public CreateFleetRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the fleet.
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     * 
     * @return Enables or disables default internet access for the fleet.
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     * 
     * @return Enables or disables default internet access for the fleet.
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

    public CreateFleetRequest withDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        setDomainJoinInfo(domainJoinInfo);
        return this;
    }

    /**
     * <p>
     * The tags to associate with the fleet. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @return The tags to associate with the fleet. A tag is a key-value pair, and the value is optional. For example,
     *         Environment=Test. If you do not specify a value, Environment=. </p>
     *         <p>
     *         If you do not specify a value, the value is set to an empty string.
     *         </p>
     *         <p>
     *         Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *         special characters:
     *         </p>
     *         <p>
     *         _ . : / = + \ - @
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *         Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the fleet. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the fleet. A tag is a key-value pair, and the value is optional. For example,
     *        Environment=Test. If you do not specify a value, Environment=. </p>
     *        <p>
     *        If you do not specify a value, the value is set to an empty string.
     *        </p>
     *        <p>
     *        Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *        special characters:
     *        </p>
     *        <p>
     *        _ . : / = + \ - @
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *        Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to associate with the fleet. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the fleet. A tag is a key-value pair, and the value is optional. For example,
     *        Environment=Test. If you do not specify a value, Environment=. </p>
     *        <p>
     *        If you do not specify a value, the value is set to an empty string.
     *        </p>
     *        <p>
     *        Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *        special characters:
     *        </p>
     *        <p>
     *        _ . : / = + \ - @
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *        Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateFleetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the <code>DisconnectTimeoutInSeconds</code> time interval begins. Users are notified before they are
     * disconnected due to inactivity. If they try to reconnect to the streaming session before the time interval
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
     *        they are disconnected due to inactivity. If they try to reconnect to the streaming session before the time
     *        interval specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their
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
     * disconnected due to inactivity. If they try to reconnect to the streaming session before the time interval
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
     *         they are disconnected due to inactivity. If they try to reconnect to the streaming session before the
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
     * disconnected due to inactivity. If they try to reconnect to the streaming session before the time interval
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
     *        they are disconnected due to inactivity. If they try to reconnect to the streaming session before the time
     *        interval specified in <code>DisconnectTimeoutInSeconds</code> elapses, they are connected to their
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

    public CreateFleetRequest withIdleDisconnectTimeoutInSeconds(Integer idleDisconnectTimeoutInSeconds) {
        setIdleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to apply to the fleet. To assume a role, a fleet instance calls
     * the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use.
     * The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials
     * and creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role to apply to the fleet. To assume a role, a fleet instance
     *        calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the
     *        role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
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
     * The Amazon Resource Name (ARN) of the IAM role to apply to the fleet. To assume a role, a fleet instance calls
     * the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use.
     * The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials
     * and creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to apply to the fleet. To assume a role, a fleet instance
     *         calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of
     *         the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves
     *         the temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the
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
     * The Amazon Resource Name (ARN) of the IAM role to apply to the fleet. To assume a role, a fleet instance calls
     * the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role to use.
     * The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials
     * and creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role to apply to the fleet. To assume a role, a fleet instance
     *        calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the
     *        role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
     *        temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the
     *        instance.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *        >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *        Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withIamRoleArn(String iamRoleArn) {
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

    public CreateFleetRequest withStreamView(String streamView) {
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamView
     */

    public CreateFleetRequest withStreamView(StreamView streamView) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getFleetType() != null)
            sb.append("FleetType: ").append(getFleetType()).append(",");
        if (getComputeCapacity() != null)
            sb.append("ComputeCapacity: ").append(getComputeCapacity()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getMaxUserDurationInSeconds() != null)
            sb.append("MaxUserDurationInSeconds: ").append(getMaxUserDurationInSeconds()).append(",");
        if (getDisconnectTimeoutInSeconds() != null)
            sb.append("DisconnectTimeoutInSeconds: ").append(getDisconnectTimeoutInSeconds()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getDomainJoinInfo() != null)
            sb.append("DomainJoinInfo: ").append(getDomainJoinInfo()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateFleetRequest == false)
            return false;
        CreateFleetRequest other = (CreateFleetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getComputeCapacity() == null ^ this.getComputeCapacity() == null)
            return false;
        if (other.getComputeCapacity() != null && other.getComputeCapacity().equals(this.getComputeCapacity()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getMaxUserDurationInSeconds() == null ^ this.getMaxUserDurationInSeconds() == null)
            return false;
        if (other.getMaxUserDurationInSeconds() != null && other.getMaxUserDurationInSeconds().equals(this.getMaxUserDurationInSeconds()) == false)
            return false;
        if (other.getDisconnectTimeoutInSeconds() == null ^ this.getDisconnectTimeoutInSeconds() == null)
            return false;
        if (other.getDisconnectTimeoutInSeconds() != null && other.getDisconnectTimeoutInSeconds().equals(this.getDisconnectTimeoutInSeconds()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getDomainJoinInfo() == null ^ this.getDomainJoinInfo() == null)
            return false;
        if (other.getDomainJoinInfo() != null && other.getDomainJoinInfo().equals(this.getDomainJoinInfo()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getFleetType() == null) ? 0 : getFleetType().hashCode());
        hashCode = prime * hashCode + ((getComputeCapacity() == null) ? 0 : getComputeCapacity().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getMaxUserDurationInSeconds() == null) ? 0 : getMaxUserDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDisconnectTimeoutInSeconds() == null) ? 0 : getDisconnectTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getDomainJoinInfo() == null) ? 0 : getDomainJoinInfo().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getIdleDisconnectTimeoutInSeconds() == null) ? 0 : getIdleDisconnectTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStreamView() == null) ? 0 : getStreamView().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetRequest clone() {
        return (CreateFleetRequest) super.clone();
    }

}
