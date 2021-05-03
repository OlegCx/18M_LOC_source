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

/**
 * <p>
 * Information about a target group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/TargetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String targetGroupArn;
    /**
     * <p>
     * The name of the target group.
     * </p>
     */
    private String targetGroupName;
    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The port on which the targets are listening. Not used if the target is a Lambda function.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The ID of the VPC for the targets.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for
     * health checks.
     * </p>
     */
    private String healthCheckProtocol;
    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     */
    private String healthCheckPort;
    /**
     * <p>
     * Indicates whether health checks are enabled.
     * </p>
     */
    private Boolean healthCheckEnabled;
    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target.
     * </p>
     */
    private Integer healthCheckIntervalSeconds;
    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check.
     * </p>
     */
    private Integer healthCheckTimeoutSeconds;
    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy.
     * </p>
     */
    private Integer healthyThresholdCount;
    /**
     * <p>
     * The number of consecutive health check failures required before considering the target unhealthy.
     * </p>
     */
    private Integer unhealthyThresholdCount;
    /**
     * <p>
     * The destination for health checks on the targets.
     * </p>
     */
    private String healthCheckPath;
    /**
     * <p>
     * The HTTP or gRPC codes to use when checking for a successful response from a target.
     * </p>
     */
    private Matcher matcher;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     * </p>
     */
    private java.util.List<String> loadBalancerArns;
    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. The possible values are
     * <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by IP address), or
     * <code>lambda</code> (register a single Lambda function as a target).
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * [HTTP/HTTPS protocol] The protocol version. The possible values are <code>GRPC</code>, <code>HTTP1</code>, and
     * <code>HTTP2</code>.
     * </p>
     */
    private String protocolVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group.
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group.
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @param targetGroupName
     *        The name of the target group.
     */

    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @return The name of the target group.
     */

    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @param targetGroupName
     *        The name of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withTargetGroupName(String targetGroupName) {
        setTargetGroupName(targetGroupName);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets.
     * @see ProtocolEnum
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @return The protocol to use for routing traffic to the targets.
     * @see ProtocolEnum
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public TargetGroup withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets.
     * @see ProtocolEnum
     */

    public void setProtocol(ProtocolEnum protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public TargetGroup withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The port on which the targets are listening. Not used if the target is a Lambda function.
     * </p>
     * 
     * @param port
     *        The port on which the targets are listening. Not used if the target is a Lambda function.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the targets are listening. Not used if the target is a Lambda function.
     * </p>
     * 
     * @return The port on which the targets are listening. Not used if the target is a Lambda function.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the targets are listening. Not used if the target is a Lambda function.
     * </p>
     * 
     * @param port
     *        The port on which the targets are listening. Not used if the target is a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the targets.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the targets.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the targets.
     * </p>
     * 
     * @return The ID of the VPC for the targets.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the targets.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for
     * health checks.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not
     *        supported for health checks.
     * @see ProtocolEnum
     */

    public void setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for
     * health checks.
     * </p>
     * 
     * @return The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not
     *         supported for health checks.
     * @see ProtocolEnum
     */

    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for
     * health checks.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not
     *        supported for health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public TargetGroup withHealthCheckProtocol(String healthCheckProtocol) {
        setHealthCheckProtocol(healthCheckProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for
     * health checks.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not
     *        supported for health checks.
     * @see ProtocolEnum
     */

    public void setHealthCheckProtocol(ProtocolEnum healthCheckProtocol) {
        withHealthCheckProtocol(healthCheckProtocol);
    }

    /**
     * <p>
     * The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for
     * health checks.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not
     *        supported for health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public TargetGroup withHealthCheckProtocol(ProtocolEnum healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @param healthCheckPort
     *        The port to use to connect with the target.
     */

    public void setHealthCheckPort(String healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @return The port to use to connect with the target.
     */

    public String getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @param healthCheckPort
     *        The port to use to connect with the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withHealthCheckPort(String healthCheckPort) {
        setHealthCheckPort(healthCheckPort);
        return this;
    }

    /**
     * <p>
     * Indicates whether health checks are enabled.
     * </p>
     * 
     * @param healthCheckEnabled
     *        Indicates whether health checks are enabled.
     */

    public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
    }

    /**
     * <p>
     * Indicates whether health checks are enabled.
     * </p>
     * 
     * @return Indicates whether health checks are enabled.
     */

    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    /**
     * <p>
     * Indicates whether health checks are enabled.
     * </p>
     * 
     * @param healthCheckEnabled
     *        Indicates whether health checks are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withHealthCheckEnabled(Boolean healthCheckEnabled) {
        setHealthCheckEnabled(healthCheckEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether health checks are enabled.
     * </p>
     * 
     * @return Indicates whether health checks are enabled.
     */

    public Boolean isHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks of an individual target.
     */

    public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target.
     * </p>
     * 
     * @return The approximate amount of time, in seconds, between health checks of an individual target.
     */

    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks of an individual target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        setHealthCheckIntervalSeconds(healthCheckIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, during which no response means a failed health check.
     */

    public void setHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check.
     * </p>
     * 
     * @return The amount of time, in seconds, during which no response means a failed health check.
     */

    public Integer getHealthCheckTimeoutSeconds() {
        return this.healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, during which no response means a failed health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        setHealthCheckTimeoutSeconds(healthCheckTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive health checks successes required before considering an unhealthy target healthy.
     */

    public void setHealthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy.
     * </p>
     * 
     * @return The number of consecutive health checks successes required before considering an unhealthy target
     *         healthy.
     */

    public Integer getHealthyThresholdCount() {
        return this.healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive health checks successes required before considering an unhealthy target healthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withHealthyThresholdCount(Integer healthyThresholdCount) {
        setHealthyThresholdCount(healthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering the target unhealthy.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive health check failures required before considering the target unhealthy.
     */

    public void setUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering the target unhealthy.
     * </p>
     * 
     * @return The number of consecutive health check failures required before considering the target unhealthy.
     */

    public Integer getUnhealthyThresholdCount() {
        return this.unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering the target unhealthy.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive health check failures required before considering the target unhealthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        setUnhealthyThresholdCount(unhealthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * The destination for health checks on the targets.
     * </p>
     * 
     * @param healthCheckPath
     *        The destination for health checks on the targets.
     */

    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * The destination for health checks on the targets.
     * </p>
     * 
     * @return The destination for health checks on the targets.
     */

    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * <p>
     * The destination for health checks on the targets.
     * </p>
     * 
     * @param healthCheckPath
     *        The destination for health checks on the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withHealthCheckPath(String healthCheckPath) {
        setHealthCheckPath(healthCheckPath);
        return this;
    }

    /**
     * <p>
     * The HTTP or gRPC codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @param matcher
     *        The HTTP or gRPC codes to use when checking for a successful response from a target.
     */

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    /**
     * <p>
     * The HTTP or gRPC codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @return The HTTP or gRPC codes to use when checking for a successful response from a target.
     */

    public Matcher getMatcher() {
        return this.matcher;
    }

    /**
     * <p>
     * The HTTP or gRPC codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @param matcher
     *        The HTTP or gRPC codes to use when checking for a successful response from a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withMatcher(Matcher matcher) {
        setMatcher(matcher);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     */

    public java.util.List<String> getLoadBalancerArns() {
        return loadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     * </p>
     * 
     * @param loadBalancerArns
     *        The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     */

    public void setLoadBalancerArns(java.util.Collection<String> loadBalancerArns) {
        if (loadBalancerArns == null) {
            this.loadBalancerArns = null;
            return;
        }

        this.loadBalancerArns = new java.util.ArrayList<String>(loadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerArns(java.util.Collection)} or {@link #withLoadBalancerArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param loadBalancerArns
     *        The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withLoadBalancerArns(String... loadBalancerArns) {
        if (this.loadBalancerArns == null) {
            setLoadBalancerArns(new java.util.ArrayList<String>(loadBalancerArns.length));
        }
        for (String ele : loadBalancerArns) {
            this.loadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     * </p>
     * 
     * @param loadBalancerArns
     *        The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withLoadBalancerArns(java.util.Collection<String> loadBalancerArns) {
        setLoadBalancerArns(loadBalancerArns);
        return this;
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. The possible values are
     * <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by IP address), or
     * <code>lambda</code> (register a single Lambda function as a target).
     * </p>
     * 
     * @param targetType
     *        The type of target that you must specify when registering targets with this target group. The possible
     *        values are <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by
     *        IP address), or <code>lambda</code> (register a single Lambda function as a target).
     * @see TargetTypeEnum
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. The possible values are
     * <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by IP address), or
     * <code>lambda</code> (register a single Lambda function as a target).
     * </p>
     * 
     * @return The type of target that you must specify when registering targets with this target group. The possible
     *         values are <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by
     *         IP address), or <code>lambda</code> (register a single Lambda function as a target).
     * @see TargetTypeEnum
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. The possible values are
     * <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by IP address), or
     * <code>lambda</code> (register a single Lambda function as a target).
     * </p>
     * 
     * @param targetType
     *        The type of target that you must specify when registering targets with this target group. The possible
     *        values are <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by
     *        IP address), or <code>lambda</code> (register a single Lambda function as a target).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetTypeEnum
     */

    public TargetGroup withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. The possible values are
     * <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by IP address), or
     * <code>lambda</code> (register a single Lambda function as a target).
     * </p>
     * 
     * @param targetType
     *        The type of target that you must specify when registering targets with this target group. The possible
     *        values are <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by
     *        IP address), or <code>lambda</code> (register a single Lambda function as a target).
     * @see TargetTypeEnum
     */

    public void setTargetType(TargetTypeEnum targetType) {
        withTargetType(targetType);
    }

    /**
     * <p>
     * The type of target that you must specify when registering targets with this target group. The possible values are
     * <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by IP address), or
     * <code>lambda</code> (register a single Lambda function as a target).
     * </p>
     * 
     * @param targetType
     *        The type of target that you must specify when registering targets with this target group. The possible
     *        values are <code>instance</code> (register targets by instance ID), <code>ip</code> (register targets by
     *        IP address), or <code>lambda</code> (register a single Lambda function as a target).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetTypeEnum
     */

    public TargetGroup withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * [HTTP/HTTPS protocol] The protocol version. The possible values are <code>GRPC</code>, <code>HTTP1</code>, and
     * <code>HTTP2</code>.
     * </p>
     * 
     * @param protocolVersion
     *        [HTTP/HTTPS protocol] The protocol version. The possible values are <code>GRPC</code>, <code>HTTP1</code>,
     *        and <code>HTTP2</code>.
     */

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    /**
     * <p>
     * [HTTP/HTTPS protocol] The protocol version. The possible values are <code>GRPC</code>, <code>HTTP1</code>, and
     * <code>HTTP2</code>.
     * </p>
     * 
     * @return [HTTP/HTTPS protocol] The protocol version. The possible values are <code>GRPC</code>, <code>HTTP1</code>
     *         , and <code>HTTP2</code>.
     */

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * <p>
     * [HTTP/HTTPS protocol] The protocol version. The possible values are <code>GRPC</code>, <code>HTTP1</code>, and
     * <code>HTTP2</code>.
     * </p>
     * 
     * @param protocolVersion
     *        [HTTP/HTTPS protocol] The protocol version. The possible values are <code>GRPC</code>, <code>HTTP1</code>,
     *        and <code>HTTP2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroup withProtocolVersion(String protocolVersion) {
        setProtocolVersion(protocolVersion);
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
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: ").append(getTargetGroupArn()).append(",");
        if (getTargetGroupName() != null)
            sb.append("TargetGroupName: ").append(getTargetGroupName()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
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
        if (getHealthCheckIntervalSeconds() != null)
            sb.append("HealthCheckIntervalSeconds: ").append(getHealthCheckIntervalSeconds()).append(",");
        if (getHealthCheckTimeoutSeconds() != null)
            sb.append("HealthCheckTimeoutSeconds: ").append(getHealthCheckTimeoutSeconds()).append(",");
        if (getHealthyThresholdCount() != null)
            sb.append("HealthyThresholdCount: ").append(getHealthyThresholdCount()).append(",");
        if (getUnhealthyThresholdCount() != null)
            sb.append("UnhealthyThresholdCount: ").append(getUnhealthyThresholdCount()).append(",");
        if (getHealthCheckPath() != null)
            sb.append("HealthCheckPath: ").append(getHealthCheckPath()).append(",");
        if (getMatcher() != null)
            sb.append("Matcher: ").append(getMatcher()).append(",");
        if (getLoadBalancerArns() != null)
            sb.append("LoadBalancerArns: ").append(getLoadBalancerArns()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getProtocolVersion() != null)
            sb.append("ProtocolVersion: ").append(getProtocolVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroup == false)
            return false;
        TargetGroup other = (TargetGroup) obj;
        if (other.getTargetGroupArn() == null ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getTargetGroupName() == null ^ this.getTargetGroupName() == null)
            return false;
        if (other.getTargetGroupName() != null && other.getTargetGroupName().equals(this.getTargetGroupName()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
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
        if (other.getHealthCheckPath() == null ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
            return false;
        if (other.getMatcher() == null ^ this.getMatcher() == null)
            return false;
        if (other.getMatcher() != null && other.getMatcher().equals(this.getMatcher()) == false)
            return false;
        if (other.getLoadBalancerArns() == null ^ this.getLoadBalancerArns() == null)
            return false;
        if (other.getLoadBalancerArns() != null && other.getLoadBalancerArns().equals(this.getLoadBalancerArns()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getProtocolVersion() == null ^ this.getProtocolVersion() == null)
            return false;
        if (other.getProtocolVersion() != null && other.getProtocolVersion().equals(this.getProtocolVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupName() == null) ? 0 : getTargetGroupName().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckProtocol() == null) ? 0 : getHealthCheckProtocol().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPort() == null) ? 0 : getHealthCheckPort().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckEnabled() == null) ? 0 : getHealthCheckEnabled().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckIntervalSeconds() == null) ? 0 : getHealthCheckIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckTimeoutSeconds() == null) ? 0 : getHealthCheckTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getHealthyThresholdCount() == null) ? 0 : getHealthyThresholdCount().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyThresholdCount() == null) ? 0 : getUnhealthyThresholdCount().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
        hashCode = prime * hashCode + ((getMatcher() == null) ? 0 : getMatcher().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerArns() == null) ? 0 : getLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getProtocolVersion() == null) ? 0 : getProtocolVersion().hashCode());
        return hashCode;
    }

    @Override
    public TargetGroup clone() {
        try {
            return (TargetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
