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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an EC2 instance of virtual computing resources that hosts one or more game servers. In GameLift, a fleet
 * can contain zero or more instances.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>DescribeInstances</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Instance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the fleet that the instance is in.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * A unique identifier for the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * IP address that is assigned to the instance.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to GameLift that it is ready to host a game session. The instance is now considered
     * ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The fleet location of the instance, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet that the instance is in.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the instance is in.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the instance is in.
     * </p>
     * 
     * @return A unique identifier for the fleet that the instance is in.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the instance is in.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the instance is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the instance.
     * </p>
     * 
     * @param instanceId
     *        A unique identifier for the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * A unique identifier for the instance.
     * </p>
     * 
     * @return A unique identifier for the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * A unique identifier for the instance.
     * </p>
     * 
     * @param instanceId
     *        A unique identifier for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * IP address that is assigned to the instance.
     * </p>
     * 
     * @param ipAddress
     *        IP address that is assigned to the instance.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address that is assigned to the instance.
     * </p>
     * 
     * @return IP address that is assigned to the instance.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address that is assigned to the instance.
     * </p>
     * 
     * @param ipAddress
     *        IP address that is assigned to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @param dnsName
     *        The DNS identifier assigned to the instance that is running the game session. Values have the following
     *        format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *        >Amazon EC2 Instance IP Addressing</a>.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *        the IP address.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @return The DNS identifier assigned to the instance that is running the game session. Values have the following
     *         format:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *         >Amazon EC2 Instance IP Addressing</a>.)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *         the IP address.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @param dnsName
     *        The DNS identifier assigned to the instance that is running the game session. Values have the following
     *        format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *        >Amazon EC2 Instance IP Addressing</a>.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *        the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on this instance.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @return Operating system that is running on this instance.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public Instance withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on this instance.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public Instance withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @param type
     *        EC2 instance type that defines the computing resources of this instance.
     * @see EC2InstanceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @return EC2 instance type that defines the computing resources of this instance.
     * @see EC2InstanceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @param type
     *        EC2 instance type that defines the computing resources of this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public Instance withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @param type
     *        EC2 instance type that defines the computing resources of this instance.
     * @see EC2InstanceType
     */

    public void setType(EC2InstanceType type) {
        withType(type);
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @param type
     *        EC2 instance type that defines the computing resources of this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public Instance withType(EC2InstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to GameLift that it is ready to host a game session. The instance is now considered
     * ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the instance. Possible statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *        defined in the fleet's run-time configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *        successfully launched and reported back to GameLift that it is ready to host a game session. The instance
     *        is now considered ready to host game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *        during a scaling down event or to recycle resources in the event of a problem.
     *        </p>
     *        </li>
     * @see InstanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to GameLift that it is ready to host a game session. The instance is now considered
     * ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the instance. Possible statuses include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *         defined in the fleet's run-time configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *         successfully launched and reported back to GameLift that it is ready to host a game session. The instance
     *         is now considered ready to host game sessions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *         during a scaling down event or to recycle resources in the event of a problem.
     *         </p>
     *         </li>
     * @see InstanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to GameLift that it is ready to host a game session. The instance is now considered
     * ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the instance. Possible statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *        defined in the fleet's run-time configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *        successfully launched and reported back to GameLift that it is ready to host a game session. The instance
     *        is now considered ready to host game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *        during a scaling down event or to recycle resources in the event of a problem.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public Instance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to GameLift that it is ready to host a game session. The instance is now considered
     * ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the instance. Possible statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *        defined in the fleet's run-time configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *        successfully launched and reported back to GameLift that it is ready to host a game session. The instance
     *        is now considered ready to host game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *        during a scaling down event or to recycle resources in the event of a problem.
     *        </p>
     *        </li>
     * @see InstanceStatus
     */

    public void setStatus(InstanceStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to GameLift that it is ready to host a game session. The instance is now considered
     * ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the instance. Possible statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *        defined in the fleet's run-time configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *        successfully launched and reported back to GameLift that it is ready to host a game session. The instance
     *        is now considered ready to host game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *        during a scaling down event or to recycle resources in the event of a problem.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public Instance withStatus(InstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The fleet location of the instance, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location of the instance, expressed as an AWS Region code, such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fleet location of the instance, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @return The fleet location of the instance, expressed as an AWS Region code, such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fleet location of the instance, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location of the instance, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withLocation(String location) {
        setLocation(location);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.InstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
