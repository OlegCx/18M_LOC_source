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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateTargetGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTargetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the target group.
     * </p>
     * <p>
     * This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols
     * are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For
     * Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP
     * target group. If the target is a Lambda function, this parameter does not apply.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * [HTTP/HTTPS protocol] The protocol version. Specify <code>GRPC</code> to send requests to targets using gRPC.
     * Specify <code>HTTP2</code> to send requests to targets using HTTP/2. The default is <code>HTTP1</code>, which
     * sends requests to targets using HTTP/1.1.
     * </p>
     */
    private String protocolVersion;
    /**
     * <p>
     * The port on which the targets receive traffic. This port is used unless you specify a port override when
     * registering the target. If the target is a Lambda function, this parameter does not apply. If the protocol is
     * GENEVE, the supported port is 6081.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does not
     * apply. Otherwise, this parameter is required.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the
     * default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP. The TCP protocol is
     * not supported for health checks if the protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and
     * TCP_UDP protocols are not supported for health checks.
     * </p>
     */
    private String healthCheckProtocol;
    /**
     * <p>
     * The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS, TCP,
     * TLS, UDP, or TCP_UDP, the default is <code>traffic-port</code>, which is the port on which each target receives
     * traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
     * </p>
     */
    private String healthCheckPort;
    /**
     * <p>
     * Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     * disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>, health
     * checks are always enabled and cannot be disabled.
     * </p>
     */
    private Boolean healthCheckEnabled;
    /**
     * <p>
     * [HTTP/HTTPS health checks] The destination for health checks on the targets.
     * </p>
     * <p>
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     * </p>
     * <p>
     * [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The
     * default is /AWS.ALB/healthcheck.
     * </p>
     */
    private String healthCheckPath;
    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. If the target group
     * protocol is TCP, TLS, UDP, or TCP_UDP, the supported values are 10 and 30 seconds. If the target group protocol
     * is HTTP or HTTPS, the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds.
     * If the target type is <code>lambda</code>, the default is 35 seconds.
     * </p>
     */
    private Integer healthCheckIntervalSeconds;
    /**
     * <p>
     * The amount of time, in seconds, during which no response from a target means a failed health check. For target
     * groups with a protocol of HTTP, HTTPS, or GENEVE, the default is 5 seconds. For target groups with a protocol of
     * TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and HTTPS health checks.
     * If the target type is <code>lambda</code>, the default is 30 seconds.
     * </p>
     */
    private Integer healthCheckTimeoutSeconds;
    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy. For
     * target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a protocol of TCP, TLS,
     * or GENEVE, the default is 3. If the target type is <code>lambda</code>, the default is 5.
     * </p>
     */
    private Integer healthyThresholdCount;
    /**
     * <p>
     * The number of consecutive health check failures required before considering a target unhealthy. If the target
     * group protocol is HTTP or HTTPS, the default is 2. If the target group protocol is TCP or TLS, this value must be
     * the same as the healthy threshold count. If the target group protocol is GENEVE, the default is 3. If the target
     * type is <code>lambda</code>, the default is 2.
     * </p>
     */
    private Integer unhealthyThresholdCount;
    /**
     * <p>
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target.
     * </p>
     */
    private Matcher matcher;
    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. You can't specify
     * targets for a target group using more than one target type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance</code> - Register targets by instance ID. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the virtual
     * private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and
     * the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> - Register a single Lambda function as a target.
     * </p>
     * </li>
     * </ul>
     */
    private String targetType;
    /**
     * <p>
     * The tags to assign to the target group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the target group.
     * </p>
     * <p>
     * This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     * </p>
     * 
     * @param name
     *        The name of the target group.</p>
     *        <p>
     *        This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     *        alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * <p>
     * This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     * </p>
     * 
     * @return The name of the target group.</p>
     *         <p>
     *         This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     *         alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * <p>
     * This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     * </p>
     * 
     * @param name
     *        The name of the target group.</p>
     *        <p>
     *        This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     *        alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols
     * are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For
     * Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP
     * target group. If the target is a Lambda function, this parameter does not apply.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported
     *        protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or
     *        TCP_UDP. For Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be
     *        associated with a TCP_UDP target group. If the target is a Lambda function, this parameter does not apply.
     * @see ProtocolEnum
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols
     * are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For
     * Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP
     * target group. If the target is a Lambda function, this parameter does not apply.
     * </p>
     * 
     * @return The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported
     *         protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or
     *         TCP_UDP. For Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be
     *         associated with a TCP_UDP target group. If the target is a Lambda function, this parameter does not
     *         apply.
     * @see ProtocolEnum
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols
     * are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For
     * Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP
     * target group. If the target is a Lambda function, this parameter does not apply.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported
     *        protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or
     *        TCP_UDP. For Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be
     *        associated with a TCP_UDP target group. If the target is a Lambda function, this parameter does not apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateTargetGroupRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols
     * are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For
     * Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP
     * target group. If the target is a Lambda function, this parameter does not apply.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported
     *        protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or
     *        TCP_UDP. For Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be
     *        associated with a TCP_UDP target group. If the target is a Lambda function, this parameter does not apply.
     * @see ProtocolEnum
     */

    public void setProtocol(ProtocolEnum protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols
     * are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For
     * Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP
     * target group. If the target is a Lambda function, this parameter does not apply.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported
     *        protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or
     *        TCP_UDP. For Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be
     *        associated with a TCP_UDP target group. If the target is a Lambda function, this parameter does not apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateTargetGroupRequest withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * [HTTP/HTTPS protocol] The protocol version. Specify <code>GRPC</code> to send requests to targets using gRPC.
     * Specify <code>HTTP2</code> to send requests to targets using HTTP/2. The default is <code>HTTP1</code>, which
     * sends requests to targets using HTTP/1.1.
     * </p>
     * 
     * @param protocolVersion
     *        [HTTP/HTTPS protocol] The protocol version. Specify <code>GRPC</code> to send requests to targets using
     *        gRPC. Specify <code>HTTP2</code> to send requests to targets using HTTP/2. The default is
     *        <code>HTTP1</code>, which sends requests to targets using HTTP/1.1.
     */

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    /**
     * <p>
     * [HTTP/HTTPS protocol] The protocol version. Specify <code>GRPC</code> to send requests to targets using gRPC.
     * Specify <code>HTTP2</code> to send requests to targets using HTTP/2. The default is <code>HTTP1</code>, which
     * sends requests to targets using HTTP/1.1.
     * </p>
     * 
     * @return [HTTP/HTTPS protocol] The protocol version. Specify <code>GRPC</code> to send requests to targets using
     *         gRPC. Specify <code>HTTP2</code> to send requests to targets using HTTP/2. The default is
     *         <code>HTTP1</code>, which sends requests to targets using HTTP/1.1.
     */

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * <p>
     * [HTTP/HTTPS protocol] The protocol version. Specify <code>GRPC</code> to send requests to targets using gRPC.
     * Specify <code>HTTP2</code> to send requests to targets using HTTP/2. The default is <code>HTTP1</code>, which
     * sends requests to targets using HTTP/1.1.
     * </p>
     * 
     * @param protocolVersion
     *        [HTTP/HTTPS protocol] The protocol version. Specify <code>GRPC</code> to send requests to targets using
     *        gRPC. Specify <code>HTTP2</code> to send requests to targets using HTTP/2. The default is
     *        <code>HTTP1</code>, which sends requests to targets using HTTP/1.1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withProtocolVersion(String protocolVersion) {
        setProtocolVersion(protocolVersion);
        return this;
    }

    /**
     * <p>
     * The port on which the targets receive traffic. This port is used unless you specify a port override when
     * registering the target. If the target is a Lambda function, this parameter does not apply. If the protocol is
     * GENEVE, the supported port is 6081.
     * </p>
     * 
     * @param port
     *        The port on which the targets receive traffic. This port is used unless you specify a port override when
     *        registering the target. If the target is a Lambda function, this parameter does not apply. If the protocol
     *        is GENEVE, the supported port is 6081.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the targets receive traffic. This port is used unless you specify a port override when
     * registering the target. If the target is a Lambda function, this parameter does not apply. If the protocol is
     * GENEVE, the supported port is 6081.
     * </p>
     * 
     * @return The port on which the targets receive traffic. This port is used unless you specify a port override when
     *         registering the target. If the target is a Lambda function, this parameter does not apply. If the
     *         protocol is GENEVE, the supported port is 6081.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the targets receive traffic. This port is used unless you specify a port override when
     * registering the target. If the target is a Lambda function, this parameter does not apply. If the protocol is
     * GENEVE, the supported port is 6081.
     * </p>
     * 
     * @param port
     *        The port on which the targets receive traffic. This port is used unless you specify a port override when
     *        registering the target. If the target is a Lambda function, this parameter does not apply. If the protocol
     *        is GENEVE, the supported port is 6081.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does not
     * apply. Otherwise, this parameter is required.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does
     *        not apply. Otherwise, this parameter is required.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does not
     * apply. Otherwise, this parameter is required.
     * </p>
     * 
     * @return The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter
     *         does not apply. Otherwise, this parameter is required.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does not
     * apply. Otherwise, this parameter is required.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does
     *        not apply. Otherwise, this parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the
     * default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP. The TCP protocol is
     * not supported for health checks if the protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and
     * TCP_UDP protocols are not supported for health checks.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol the load balancer uses when performing health checks on targets. For Application Load
     *        Balancers, the default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP.
     *        The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or HTTPS.
     *        The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks.
     * @see ProtocolEnum
     */

    public void setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the
     * default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP. The TCP protocol is
     * not supported for health checks if the protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and
     * TCP_UDP protocols are not supported for health checks.
     * </p>
     * 
     * @return The protocol the load balancer uses when performing health checks on targets. For Application Load
     *         Balancers, the default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is
     *         TCP. The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or
     *         HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks.
     * @see ProtocolEnum
     */

    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the
     * default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP. The TCP protocol is
     * not supported for health checks if the protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and
     * TCP_UDP protocols are not supported for health checks.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol the load balancer uses when performing health checks on targets. For Application Load
     *        Balancers, the default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP.
     *        The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or HTTPS.
     *        The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateTargetGroupRequest withHealthCheckProtocol(String healthCheckProtocol) {
        setHealthCheckProtocol(healthCheckProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the
     * default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP. The TCP protocol is
     * not supported for health checks if the protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and
     * TCP_UDP protocols are not supported for health checks.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol the load balancer uses when performing health checks on targets. For Application Load
     *        Balancers, the default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP.
     *        The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or HTTPS.
     *        The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks.
     * @see ProtocolEnum
     */

    public void setHealthCheckProtocol(ProtocolEnum healthCheckProtocol) {
        withHealthCheckProtocol(healthCheckProtocol);
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the
     * default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP. The TCP protocol is
     * not supported for health checks if the protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and
     * TCP_UDP protocols are not supported for health checks.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol the load balancer uses when performing health checks on targets. For Application Load
     *        Balancers, the default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP.
     *        The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or HTTPS.
     *        The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateTargetGroupRequest withHealthCheckProtocol(ProtocolEnum healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS, TCP,
     * TLS, UDP, or TCP_UDP, the default is <code>traffic-port</code>, which is the port on which each target receives
     * traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
     * </p>
     * 
     * @param healthCheckPort
     *        The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS,
     *        TCP, TLS, UDP, or TCP_UDP, the default is <code>traffic-port</code>, which is the port on which each
     *        target receives traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
     */

    public void setHealthCheckPort(String healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    /**
     * <p>
     * The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS, TCP,
     * TLS, UDP, or TCP_UDP, the default is <code>traffic-port</code>, which is the port on which each target receives
     * traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
     * </p>
     * 
     * @return The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS,
     *         TCP, TLS, UDP, or TCP_UDP, the default is <code>traffic-port</code>, which is the port on which each
     *         target receives traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
     */

    public String getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * <p>
     * The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS, TCP,
     * TLS, UDP, or TCP_UDP, the default is <code>traffic-port</code>, which is the port on which each target receives
     * traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
     * </p>
     * 
     * @param healthCheckPort
     *        The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS,
     *        TCP, TLS, UDP, or TCP_UDP, the default is <code>traffic-port</code>, which is the port on which each
     *        target receives traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckPort(String healthCheckPort) {
        setHealthCheckPort(healthCheckPort);
        return this;
    }

    /**
     * <p>
     * Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     * disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>, health
     * checks are always enabled and cannot be disabled.
     * </p>
     * 
     * @param healthCheckEnabled
     *        Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     *        disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>,
     *        health checks are always enabled and cannot be disabled.
     */

    public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
    }

    /**
     * <p>
     * Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     * disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>, health
     * checks are always enabled and cannot be disabled.
     * </p>
     * 
     * @return Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     *         disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>,
     *         health checks are always enabled and cannot be disabled.
     */

    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    /**
     * <p>
     * Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     * disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>, health
     * checks are always enabled and cannot be disabled.
     * </p>
     * 
     * @param healthCheckEnabled
     *        Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     *        disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>,
     *        health checks are always enabled and cannot be disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckEnabled(Boolean healthCheckEnabled) {
        setHealthCheckEnabled(healthCheckEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     * disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>, health
     * checks are always enabled and cannot be disabled.
     * </p>
     * 
     * @return Indicates whether health checks are enabled. If the target type is <code>lambda</code>, health checks are
     *         disabled by default but can be enabled. If the target type is <code>instance</code> or <code>ip</code>,
     *         health checks are always enabled and cannot be disabled.
     */

    public Boolean isHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    /**
     * <p>
     * [HTTP/HTTPS health checks] The destination for health checks on the targets.
     * </p>
     * <p>
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     * </p>
     * <p>
     * [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The
     * default is /AWS.ALB/healthcheck.
     * </p>
     * 
     * @param healthCheckPath
     *        [HTTP/HTTPS health checks] The destination for health checks on the targets.</p>
     *        <p>
     *        [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     *        </p>
     *        <p>
     *        [GRPC protocol version] The path of a custom health check method with the format /package.service/method.
     *        The default is /AWS.ALB/healthcheck.
     */

    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * [HTTP/HTTPS health checks] The destination for health checks on the targets.
     * </p>
     * <p>
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     * </p>
     * <p>
     * [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The
     * default is /AWS.ALB/healthcheck.
     * </p>
     * 
     * @return [HTTP/HTTPS health checks] The destination for health checks on the targets.</p>
     *         <p>
     *         [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     *         </p>
     *         <p>
     *         [GRPC protocol version] The path of a custom health check method with the format /package.service/method.
     *         The default is /AWS.ALB/healthcheck.
     */

    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * <p>
     * [HTTP/HTTPS health checks] The destination for health checks on the targets.
     * </p>
     * <p>
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     * </p>
     * <p>
     * [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The
     * default is /AWS.ALB/healthcheck.
     * </p>
     * 
     * @param healthCheckPath
     *        [HTTP/HTTPS health checks] The destination for health checks on the targets.</p>
     *        <p>
     *        [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     *        </p>
     *        <p>
     *        [GRPC protocol version] The path of a custom health check method with the format /package.service/method.
     *        The default is /AWS.ALB/healthcheck.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckPath(String healthCheckPath) {
        setHealthCheckPath(healthCheckPath);
        return this;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. If the target group
     * protocol is TCP, TLS, UDP, or TCP_UDP, the supported values are 10 and 30 seconds. If the target group protocol
     * is HTTP or HTTPS, the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds.
     * If the target type is <code>lambda</code>, the default is 35 seconds.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks of an individual target. If the target
     *        group protocol is TCP, TLS, UDP, or TCP_UDP, the supported values are 10 and 30 seconds. If the target
     *        group protocol is HTTP or HTTPS, the default is 30 seconds. If the target group protocol is GENEVE, the
     *        default is 10 seconds. If the target type is <code>lambda</code>, the default is 35 seconds.
     */

    public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. If the target group
     * protocol is TCP, TLS, UDP, or TCP_UDP, the supported values are 10 and 30 seconds. If the target group protocol
     * is HTTP or HTTPS, the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds.
     * If the target type is <code>lambda</code>, the default is 35 seconds.
     * </p>
     * 
     * @return The approximate amount of time, in seconds, between health checks of an individual target. If the target
     *         group protocol is TCP, TLS, UDP, or TCP_UDP, the supported values are 10 and 30 seconds. If the target
     *         group protocol is HTTP or HTTPS, the default is 30 seconds. If the target group protocol is GENEVE, the
     *         default is 10 seconds. If the target type is <code>lambda</code>, the default is 35 seconds.
     */

    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. If the target group
     * protocol is TCP, TLS, UDP, or TCP_UDP, the supported values are 10 and 30 seconds. If the target group protocol
     * is HTTP or HTTPS, the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds.
     * If the target type is <code>lambda</code>, the default is 35 seconds.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks of an individual target. If the target
     *        group protocol is TCP, TLS, UDP, or TCP_UDP, the supported values are 10 and 30 seconds. If the target
     *        group protocol is HTTP or HTTPS, the default is 30 seconds. If the target group protocol is GENEVE, the
     *        default is 10 seconds. If the target type is <code>lambda</code>, the default is 35 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        setHealthCheckIntervalSeconds(healthCheckIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response from a target means a failed health check. For target
     * groups with a protocol of HTTP, HTTPS, or GENEVE, the default is 5 seconds. For target groups with a protocol of
     * TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and HTTPS health checks.
     * If the target type is <code>lambda</code>, the default is 30 seconds.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, during which no response from a target means a failed health check. For
     *        target groups with a protocol of HTTP, HTTPS, or GENEVE, the default is 5 seconds. For target groups with
     *        a protocol of TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and
     *        HTTPS health checks. If the target type is <code>lambda</code>, the default is 30 seconds.
     */

    public void setHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response from a target means a failed health check. For target
     * groups with a protocol of HTTP, HTTPS, or GENEVE, the default is 5 seconds. For target groups with a protocol of
     * TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and HTTPS health checks.
     * If the target type is <code>lambda</code>, the default is 30 seconds.
     * </p>
     * 
     * @return The amount of time, in seconds, during which no response from a target means a failed health check. For
     *         target groups with a protocol of HTTP, HTTPS, or GENEVE, the default is 5 seconds. For target groups with
     *         a protocol of TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and
     *         HTTPS health checks. If the target type is <code>lambda</code>, the default is 30 seconds.
     */

    public Integer getHealthCheckTimeoutSeconds() {
        return this.healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response from a target means a failed health check. For target
     * groups with a protocol of HTTP, HTTPS, or GENEVE, the default is 5 seconds. For target groups with a protocol of
     * TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and HTTPS health checks.
     * If the target type is <code>lambda</code>, the default is 30 seconds.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, during which no response from a target means a failed health check. For
     *        target groups with a protocol of HTTP, HTTPS, or GENEVE, the default is 5 seconds. For target groups with
     *        a protocol of TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and
     *        HTTPS health checks. If the target type is <code>lambda</code>, the default is 30 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        setHealthCheckTimeoutSeconds(healthCheckTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy. For
     * target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a protocol of TCP, TLS,
     * or GENEVE, the default is 3. If the target type is <code>lambda</code>, the default is 5.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive health checks successes required before considering an unhealthy target healthy.
     *        For target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a protocol of
     *        TCP, TLS, or GENEVE, the default is 3. If the target type is <code>lambda</code>, the default is 5.
     */

    public void setHealthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy. For
     * target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a protocol of TCP, TLS,
     * or GENEVE, the default is 3. If the target type is <code>lambda</code>, the default is 5.
     * </p>
     * 
     * @return The number of consecutive health checks successes required before considering an unhealthy target
     *         healthy. For target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a
     *         protocol of TCP, TLS, or GENEVE, the default is 3. If the target type is <code>lambda</code>, the default
     *         is 5.
     */

    public Integer getHealthyThresholdCount() {
        return this.healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy. For
     * target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a protocol of TCP, TLS,
     * or GENEVE, the default is 3. If the target type is <code>lambda</code>, the default is 5.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive health checks successes required before considering an unhealthy target healthy.
     *        For target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a protocol of
     *        TCP, TLS, or GENEVE, the default is 3. If the target type is <code>lambda</code>, the default is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthyThresholdCount(Integer healthyThresholdCount) {
        setHealthyThresholdCount(healthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering a target unhealthy. If the target
     * group protocol is HTTP or HTTPS, the default is 2. If the target group protocol is TCP or TLS, this value must be
     * the same as the healthy threshold count. If the target group protocol is GENEVE, the default is 3. If the target
     * type is <code>lambda</code>, the default is 2.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive health check failures required before considering a target unhealthy. If the
     *        target group protocol is HTTP or HTTPS, the default is 2. If the target group protocol is TCP or TLS, this
     *        value must be the same as the healthy threshold count. If the target group protocol is GENEVE, the default
     *        is 3. If the target type is <code>lambda</code>, the default is 2.
     */

    public void setUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering a target unhealthy. If the target
     * group protocol is HTTP or HTTPS, the default is 2. If the target group protocol is TCP or TLS, this value must be
     * the same as the healthy threshold count. If the target group protocol is GENEVE, the default is 3. If the target
     * type is <code>lambda</code>, the default is 2.
     * </p>
     * 
     * @return The number of consecutive health check failures required before considering a target unhealthy. If the
     *         target group protocol is HTTP or HTTPS, the default is 2. If the target group protocol is TCP or TLS,
     *         this value must be the same as the healthy threshold count. If the target group protocol is GENEVE, the
     *         default is 3. If the target type is <code>lambda</code>, the default is 2.
     */

    public Integer getUnhealthyThresholdCount() {
        return this.unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering a target unhealthy. If the target
     * group protocol is HTTP or HTTPS, the default is 2. If the target group protocol is TCP or TLS, this value must be
     * the same as the healthy threshold count. If the target group protocol is GENEVE, the default is 3. If the target
     * type is <code>lambda</code>, the default is 2.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive health check failures required before considering a target unhealthy. If the
     *        target group protocol is HTTP or HTTPS, the default is 2. If the target group protocol is TCP or TLS, this
     *        value must be the same as the healthy threshold count. If the target group protocol is GENEVE, the default
     *        is 3. If the target type is <code>lambda</code>, the default is 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        setUnhealthyThresholdCount(unhealthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @param matcher
     *        [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a
     *        target.
     */

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    /**
     * <p>
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @return [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a
     *         target.
     */

    public Matcher getMatcher() {
        return this.matcher;
    }

    /**
     * <p>
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @param matcher
     *        [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a
     *        target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withMatcher(Matcher matcher) {
        setMatcher(matcher);
        return this;
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. You can't specify
     * targets for a target group using more than one target type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance</code> - Register targets by instance ID. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the virtual
     * private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and
     * the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> - Register a single Lambda function as a target.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetType
     *        The type of target that you must specify when registering targets with this target group. You can't
     *        specify targets for a target group using more than one target type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance</code> - Register targets by instance ID. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the
     *        virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and
     *        192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda</code> - Register a single Lambda function as a target.
     *        </p>
     *        </li>
     * @see TargetTypeEnum
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. You can't specify
     * targets for a target group using more than one target type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance</code> - Register targets by instance ID. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the virtual
     * private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and
     * the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> - Register a single Lambda function as a target.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of target that you must specify when registering targets with this target group. You can't
     *         specify targets for a target group using more than one target type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance</code> - Register targets by instance ID. This is the default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the
     *         virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and
     *         192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP
     *         addresses.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>lambda</code> - Register a single Lambda function as a target.
     *         </p>
     *         </li>
     * @see TargetTypeEnum
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. You can't specify
     * targets for a target group using more than one target type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance</code> - Register targets by instance ID. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the virtual
     * private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and
     * the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> - Register a single Lambda function as a target.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetType
     *        The type of target that you must specify when registering targets with this target group. You can't
     *        specify targets for a target group using more than one target type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance</code> - Register targets by instance ID. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the
     *        virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and
     *        192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda</code> - Register a single Lambda function as a target.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetTypeEnum
     */

    public CreateTargetGroupRequest withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. You can't specify
     * targets for a target group using more than one target type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance</code> - Register targets by instance ID. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the virtual
     * private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and
     * the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> - Register a single Lambda function as a target.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetType
     *        The type of target that you must specify when registering targets with this target group. You can't
     *        specify targets for a target group using more than one target type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance</code> - Register targets by instance ID. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the
     *        virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and
     *        192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda</code> - Register a single Lambda function as a target.
     *        </p>
     *        </li>
     * @see TargetTypeEnum
     */

    public void setTargetType(TargetTypeEnum targetType) {
        withTargetType(targetType);
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. You can't specify
     * targets for a target group using more than one target type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance</code> - Register targets by instance ID. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the virtual
     * private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and
     * the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> - Register a single Lambda function as a target.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetType
     *        The type of target that you must specify when registering targets with this target group. You can't
     *        specify targets for a target group using more than one target type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance</code> - Register targets by instance ID. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip</code> - Register targets by IP address. You can specify IP addresses from the subnets of the
     *        virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and
     *        192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda</code> - Register a single Lambda function as a target.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetTypeEnum
     */

    public CreateTargetGroupRequest withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The tags to assign to the target group.
     * </p>
     * 
     * @return The tags to assign to the target group.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the target group.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the target group.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to assign to the target group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to the target group.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getProtocolVersion() != null)
            sb.append("ProtocolVersion: ").append(getProtocolVersion()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getHealthCheckProtocol() != null)
            sb.append("HealthCheckProtocol: ").append(getHealthCheckProtocol()).append(",");
        if (getHealthCheckPort() != null)
            sb.append("HealthCheckPort: ").append(getHealthCheckPort()).append(",");
        if (getHealthCheckEnabled() != null)
            sb.append("HealthCheckEnabled: ").append(getHealthCheckEnabled()).append(",");
        if (getHealthCheckPath() != null)
            sb.append("HealthCheckPath: ").append(getHealthCheckPath()).append(",");
        if (getHealthCheckIntervalSeconds() != null)
            sb.append("HealthCheckIntervalSeconds: ").append(getHealthCheckIntervalSeconds()).append(",");
        if (getHealthCheckTimeoutSeconds() != null)
            sb.append("HealthCheckTimeoutSeconds: ").append(getHealthCheckTimeoutSeconds()).append(",");
        if (getHealthyThresholdCount() != null)
            sb.append("HealthyThresholdCount: ").append(getHealthyThresholdCount()).append(",");
        if (getUnhealthyThresholdCount() != null)
            sb.append("UnhealthyThresholdCount: ").append(getUnhealthyThresholdCount()).append(",");
        if (getMatcher() != null)
            sb.append("Matcher: ").append(getMatcher()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTargetGroupRequest == false)
            return false;
        CreateTargetGroupRequest other = (CreateTargetGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getProtocolVersion() == null ^ this.getProtocolVersion() == null)
            return false;
        if (other.getProtocolVersion() != null && other.getProtocolVersion().equals(this.getProtocolVersion()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getHealthCheckProtocol() == null ^ this.getHealthCheckProtocol() == null)
            return false;
        if (other.getHealthCheckProtocol() != null && other.getHealthCheckProtocol().equals(this.getHealthCheckProtocol()) == false)
            return false;
        if (other.getHealthCheckPort() == null ^ this.getHealthCheckPort() == null)
            return false;
        if (other.getHealthCheckPort() != null && other.getHealthCheckPort().equals(this.getHealthCheckPort()) == false)
            return false;
        if (other.getHealthCheckEnabled() == null ^ this.getHealthCheckEnabled() == null)
            return false;
        if (other.getHealthCheckEnabled() != null && other.getHealthCheckEnabled().equals(this.getHealthCheckEnabled()) == false)
            return false;
        if (other.getHealthCheckPath() == null ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
            return false;
        if (other.getHealthCheckIntervalSeconds() == null ^ this.getHealthCheckIntervalSeconds() == null)
            return false;
        if (other.getHealthCheckIntervalSeconds() != null && other.getHealthCheckIntervalSeconds().equals(this.getHealthCheckIntervalSeconds()) == false)
            return false;
        if (other.getHealthCheckTimeoutSeconds() == null ^ this.getHealthCheckTimeoutSeconds() == null)
            return false;
        if (other.getHealthCheckTimeoutSeconds() != null && other.getHealthCheckTimeoutSeconds().equals(this.getHealthCheckTimeoutSeconds()) == false)
            return false;
        if (other.getHealthyThresholdCount() == null ^ this.getHealthyThresholdCount() == null)
            return false;
        if (other.getHealthyThresholdCount() != null && other.getHealthyThresholdCount().equals(this.getHealthyThresholdCount()) == false)
            return false;
        if (other.getUnhealthyThresholdCount() == null ^ this.getUnhealthyThresholdCount() == null)
            return false;
        if (other.getUnhealthyThresholdCount() != null && other.getUnhealthyThresholdCount().equals(this.getUnhealthyThresholdCount()) == false)
            return false;
        if (other.getMatcher() == null ^ this.getMatcher() == null)
            return false;
        if (other.getMatcher() != null && other.getMatcher().equals(this.getMatcher()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getProtocolVersion() == null) ? 0 : getProtocolVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckProtocol() == null) ? 0 : getHealthCheckProtocol().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPort() == null) ? 0 : getHealthCheckPort().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckEnabled() == null) ? 0 : getHealthCheckEnabled().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckIntervalSeconds() == null) ? 0 : getHealthCheckIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckTimeoutSeconds() == null) ? 0 : getHealthCheckTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getHealthyThresholdCount() == null) ? 0 : getHealthyThresholdCount().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyThresholdCount() == null) ? 0 : getUnhealthyThresholdCount().hashCode());
        hashCode = prime * hashCode + ((getMatcher() == null) ? 0 : getMatcher().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTargetGroupRequest clone() {
        return (CreateTargetGroupRequest) super.clone();
    }

}
