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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The load balancer configuration to use with a service or task set.
 * </p>
 * <p>
 * For specific notes and restrictions regarding the use of load balancers with services and task sets, see the
 * CreateService and CreateTaskSet actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/LoadBalancer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     * service or task set.
     * </p>
     * <p>
     * A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you are
     * using a Classic Load Balancer the target group ARN should be omitted.
     * </p>
     * <p>
     * For services using the <code>ECS</code> deployment controller, you can specify one or multiple target groups. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html"
     * >Registering Multiple Target Groups with a Service</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two target
     * groups for the load balancer. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html">Blue/Green
     * Deployment with CodeDeploy</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the Fargate
     * launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, when creating your
     * target groups because tasks that use the <code>awsvpc</code> network mode are associated with an elastic network
     * interface, not an Amazon EC2 instance.
     * </p>
     * </important>
     */
    private String targetGroupArn;
    /**
     * <p>
     * The name of the load balancer to associate with the Amazon ECS service or task set.
     * </p>
     * <p>
     * A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load
     * Balancer or a Network Load Balancer the load balancer name parameter should be omitted.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The port on the container to associate with the load balancer. This port must correspond to a
     * <code>containerPort</code> in the task definition the tasks in the service are using. For tasks that use the EC2
     * launch type, the container instance they are launched on must allow ingress traffic on the <code>hostPort</code>
     * of the port mapping.
     * </p>
     */
    private Integer containerPort;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     * service or task set.
     * </p>
     * <p>
     * A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you are
     * using a Classic Load Balancer the target group ARN should be omitted.
     * </p>
     * <p>
     * For services using the <code>ECS</code> deployment controller, you can specify one or multiple target groups. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html"
     * >Registering Multiple Target Groups with a Service</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two target
     * groups for the load balancer. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html">Blue/Green
     * Deployment with CodeDeploy</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the Fargate
     * launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, when creating your
     * target groups because tasks that use the <code>awsvpc</code> network mode are associated with an elastic network
     * interface, not an Amazon EC2 instance.
     * </p>
     * </important>
     * 
     * @param targetGroupArn
     *        The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     *        service or task set.</p>
     *        <p>
     *        A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If
     *        you are using a Classic Load Balancer the target group ARN should be omitted.
     *        </p>
     *        <p>
     *        For services using the <code>ECS</code> deployment controller, you can specify one or multiple target
     *        groups. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html"
     *        >Registering Multiple Target Groups with a Service</a> in the <i>Amazon Elastic Container Service
     *        Developer Guide</i>.
     *        </p>
     *        <p>
     *        For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two
     *        target groups for the load balancer. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html"
     *        >Blue/Green Deployment with CodeDeploy</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <important>
     *        <p>
     *        If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the
     *        Fargate launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, when
     *        creating your target groups because tasks that use the <code>awsvpc</code> network mode are associated
     *        with an elastic network interface, not an Amazon EC2 instance.
     *        </p>
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     * service or task set.
     * </p>
     * <p>
     * A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you are
     * using a Classic Load Balancer the target group ARN should be omitted.
     * </p>
     * <p>
     * For services using the <code>ECS</code> deployment controller, you can specify one or multiple target groups. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html"
     * >Registering Multiple Target Groups with a Service</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two target
     * groups for the load balancer. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html">Blue/Green
     * Deployment with CodeDeploy</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the Fargate
     * launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, when creating your
     * target groups because tasks that use the <code>awsvpc</code> network mode are associated with an elastic network
     * interface, not an Amazon EC2 instance.
     * </p>
     * </important>
     * 
     * @return The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with
     *         a service or task set.</p>
     *         <p>
     *         A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If
     *         you are using a Classic Load Balancer the target group ARN should be omitted.
     *         </p>
     *         <p>
     *         For services using the <code>ECS</code> deployment controller, you can specify one or multiple target
     *         groups. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html"
     *         >Registering Multiple Target Groups with a Service</a> in the <i>Amazon Elastic Container Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two
     *         target groups for the load balancer. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html"
     *         >Blue/Green Deployment with CodeDeploy</a> in the <i>Amazon Elastic Container Service Developer
     *         Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the
     *         Fargate launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, when
     *         creating your target groups because tasks that use the <code>awsvpc</code> network mode are associated
     *         with an elastic network interface, not an Amazon EC2 instance.
     *         </p>
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     * service or task set.
     * </p>
     * <p>
     * A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you are
     * using a Classic Load Balancer the target group ARN should be omitted.
     * </p>
     * <p>
     * For services using the <code>ECS</code> deployment controller, you can specify one or multiple target groups. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html"
     * >Registering Multiple Target Groups with a Service</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two target
     * groups for the load balancer. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html">Blue/Green
     * Deployment with CodeDeploy</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the Fargate
     * launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, when creating your
     * target groups because tasks that use the <code>awsvpc</code> network mode are associated with an elastic network
     * interface, not an Amazon EC2 instance.
     * </p>
     * </important>
     * 
     * @param targetGroupArn
     *        The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     *        service or task set.</p>
     *        <p>
     *        A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If
     *        you are using a Classic Load Balancer the target group ARN should be omitted.
     *        </p>
     *        <p>
     *        For services using the <code>ECS</code> deployment controller, you can specify one or multiple target
     *        groups. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html"
     *        >Registering Multiple Target Groups with a Service</a> in the <i>Amazon Elastic Container Service
     *        Developer Guide</i>.
     *        </p>
     *        <p>
     *        For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two
     *        target groups for the load balancer. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html"
     *        >Blue/Green Deployment with CodeDeploy</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <important>
     *        <p>
     *        If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the
     *        Fargate launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, when
     *        creating your target groups because tasks that use the <code>awsvpc</code> network mode are associated
     *        with an elastic network interface, not an Amazon EC2 instance.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the load balancer to associate with the Amazon ECS service or task set.
     * </p>
     * <p>
     * A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load
     * Balancer or a Network Load Balancer the load balancer name parameter should be omitted.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer to associate with the Amazon ECS service or task set.</p>
     *        <p>
     *        A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application
     *        Load Balancer or a Network Load Balancer the load balancer name parameter should be omitted.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer to associate with the Amazon ECS service or task set.
     * </p>
     * <p>
     * A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load
     * Balancer or a Network Load Balancer the load balancer name parameter should be omitted.
     * </p>
     * 
     * @return The name of the load balancer to associate with the Amazon ECS service or task set.</p>
     *         <p>
     *         A load balancer name is only specified when using a Classic Load Balancer. If you are using an
     *         Application Load Balancer or a Network Load Balancer the load balancer name parameter should be omitted.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer to associate with the Amazon ECS service or task set.
     * </p>
     * <p>
     * A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load
     * Balancer or a Network Load Balancer the load balancer name parameter should be omitted.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer to associate with the Amazon ECS service or task set.</p>
     *        <p>
     *        A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application
     *        Load Balancer or a Network Load Balancer the load balancer name parameter should be omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * </p>
     * 
     * @param containerName
     *        The name of the container (as it appears in a container definition) to associate with the load balancer.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * </p>
     * 
     * @return The name of the container (as it appears in a container definition) to associate with the load balancer.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * </p>
     * 
     * @param containerName
     *        The name of the container (as it appears in a container definition) to associate with the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The port on the container to associate with the load balancer. This port must correspond to a
     * <code>containerPort</code> in the task definition the tasks in the service are using. For tasks that use the EC2
     * launch type, the container instance they are launched on must allow ingress traffic on the <code>hostPort</code>
     * of the port mapping.
     * </p>
     * 
     * @param containerPort
     *        The port on the container to associate with the load balancer. This port must correspond to a
     *        <code>containerPort</code> in the task definition the tasks in the service are using. For tasks that use
     *        the EC2 launch type, the container instance they are launched on must allow ingress traffic on the
     *        <code>hostPort</code> of the port mapping.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port on the container to associate with the load balancer. This port must correspond to a
     * <code>containerPort</code> in the task definition the tasks in the service are using. For tasks that use the EC2
     * launch type, the container instance they are launched on must allow ingress traffic on the <code>hostPort</code>
     * of the port mapping.
     * </p>
     * 
     * @return The port on the container to associate with the load balancer. This port must correspond to a
     *         <code>containerPort</code> in the task definition the tasks in the service are using. For tasks that use
     *         the EC2 launch type, the container instance they are launched on must allow ingress traffic on the
     *         <code>hostPort</code> of the port mapping.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port on the container to associate with the load balancer. This port must correspond to a
     * <code>containerPort</code> in the task definition the tasks in the service are using. For tasks that use the EC2
     * launch type, the container instance they are launched on must allow ingress traffic on the <code>hostPort</code>
     * of the port mapping.
     * </p>
     * 
     * @param containerPort
     *        The port on the container to associate with the load balancer. This port must correspond to a
     *        <code>containerPort</code> in the task definition the tasks in the service are using. For tasks that use
     *        the EC2 launch type, the container instance they are launched on must allow ingress traffic on the
     *        <code>hostPort</code> of the port mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancer == false)
            return false;
        LoadBalancer other = (LoadBalancer) obj;
        if (other.getTargetGroupArn() == null ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancer clone() {
        try {
            return (LoadBalancer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.LoadBalancerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
