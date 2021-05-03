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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The name of the service to update.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon ECS spawns a task
     * with the new version of the task definition and then stops an old task after the new version is running.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the cluster, the service can be updated to use
     * one or more capacity providers as opposed to the default capacity provider strategy. However, when a service is
     * using a capacity provider strategy that is not the default capacity provider strategy, the service cannot be
     * updated to use the cluster's default capacity provider strategy.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     * <p/>
     */
    private com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem> capacityProviderStrategy;
    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     */
    private DeploymentConfiguration deploymentConfiguration;
    /**
     * <p>
     * An object representing the network configuration for the service.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * An array of task placement constraint objects to update the service to use. If no value is specified, the
     * existing placement constraints for the service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To remove all existing placement
     * constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and
     * those specified at runtime).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementConstraint> placementConstraints;
    /**
     * <p>
     * The task placement strategy objects to update the service to use. If no value is specified, the existing
     * placement strategy for the service will remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty
     * object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementStrategy> placementStrategy;
    /**
     * <p>
     * The platform version on which your tasks in the service are running. A platform version is only specified for
     * tasks using the Fargate launch type. If a platform version is not specified, the <code>LATEST</code> platform
     * version is used by default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option
     * to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to
     * use a newer Docker image with the same image/tag combination (<code>my_image:latest</code>) or to roll Fargate
     * tasks onto a newer platform version.
     * </p>
     */
    private Boolean forceNewDeployment;
    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing
     * health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the
     * Amazon ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can
     * prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come
     * up.
     * </p>
     */
    private Integer healthCheckGracePeriodSeconds;
    /**
     * <p>
     * If <code>true</code>, this enables execute command functionality on all task containers.
     * </p>
     * <p>
     * If you do not want to override the value that was set when the service was created, you can set this to
     * <code>null</code> when performing this action.
     * </p>
     */
    private Boolean enableExecuteCommand;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *        do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *         do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *        do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @param service
     *        The name of the service to update.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @return The name of the service to update.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @param service
     *        The name of the service to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the task to place and keep running in your service.
     */

    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @return The number of instantiations of the task to place and keep running in your service.
     */

    public Integer getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the task to place and keep running in your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withDesiredCount(Integer desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon ECS spawns a task
     * with the new version of the task definition and then stops an old task after the new version is running.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run in your service. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>,
     *        Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the
     *        new version is running.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon ECS spawns a task
     * with the new version of the task definition and then stops an old task after the new version is running.
     * </p>
     * 
     * @return The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *         definition to run in your service. If a <code>revision</code> is not specified, the latest
     *         <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>,
     *         Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the
     *         new version is running.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon ECS spawns a task
     * with the new version of the task definition and then stops an old task after the new version is running.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run in your service. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>,
     *        Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the
     *        new version is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the cluster, the service can be updated to use
     * one or more capacity providers as opposed to the default capacity provider strategy. However, when a service is
     * using a capacity provider strategy that is not the default capacity provider strategy, the service cannot be
     * updated to use the cluster's default capacity provider strategy.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     * <p/>
     * 
     * @return The capacity provider strategy to update the service to use.
     *         </p>
     *         <p>
     *         If the service is using the default capacity provider strategy for the cluster, the service can be
     *         updated to use one or more capacity providers as opposed to the default capacity provider strategy.
     *         However, when a service is using a capacity provider strategy that is not the default capacity provider
     *         strategy, the service cannot be updated to use the cluster's default capacity provider strategy.
     *         </p>
     *         <p>
     *         A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *         and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *         used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *         capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *         <code>UPDATING</code> status can be used.
     *         </p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *         created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *         <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *         accounts and only need to be associated with a cluster to be used.
     *         </p>
     *         <p>
     *         The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity
     *         providers for a cluster after the cluster is created.
     *         </p>
     */

    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        if (capacityProviderStrategy == null) {
            capacityProviderStrategy = new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>();
        }
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the cluster, the service can be updated to use
     * one or more capacity providers as opposed to the default capacity provider strategy. However, when a service is
     * using a capacity provider strategy that is not the default capacity provider strategy, the service cannot be
     * updated to use the cluster's default capacity provider strategy.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     * <p/>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy to update the service to use.
     *        </p>
     *        <p>
     *        If the service is using the default capacity provider strategy for the cluster, the service can be updated
     *        to use one or more capacity providers as opposed to the default capacity provider strategy. However, when
     *        a service is using a capacity provider strategy that is not the default capacity provider strategy, the
     *        service cannot be updated to use the cluster's default capacity provider strategy.
     *        </p>
     *        <p>
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     *        </p>
     *        <p>
     *        The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity
     *        providers for a cluster after the cluster is created.
     *        </p>
     */

    public void setCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        if (capacityProviderStrategy == null) {
            this.capacityProviderStrategy = null;
            return;
        }

        this.capacityProviderStrategy = new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>(capacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the cluster, the service can be updated to use
     * one or more capacity providers as opposed to the default capacity provider strategy. However, when a service is
     * using a capacity provider strategy that is not the default capacity provider strategy, the service cannot be
     * updated to use the cluster's default capacity provider strategy.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityProviderStrategy(java.util.Collection)} or
     * {@link #withCapacityProviderStrategy(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy to update the service to use.</p>
     *        <p>
     *        If the service is using the default capacity provider strategy for the cluster, the service can be updated
     *        to use one or more capacity providers as opposed to the default capacity provider strategy. However, when
     *        a service is using a capacity provider strategy that is not the default capacity provider strategy, the
     *        service cannot be updated to use the cluster's default capacity provider strategy.
     *        </p>
     *        <p>
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     *        </p>
     *        <p>
     *        The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity
     *        providers for a cluster after the cluster is created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withCapacityProviderStrategy(CapacityProviderStrategyItem... capacityProviderStrategy) {
        if (this.capacityProviderStrategy == null) {
            setCapacityProviderStrategy(new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>(capacityProviderStrategy.length));
        }
        for (CapacityProviderStrategyItem ele : capacityProviderStrategy) {
            this.capacityProviderStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the cluster, the service can be updated to use
     * one or more capacity providers as opposed to the default capacity provider strategy. However, when a service is
     * using a capacity provider strategy that is not the default capacity provider strategy, the service cannot be
     * updated to use the cluster's default capacity provider strategy.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     * <p/>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy to update the service to use.
     *        </p>
     *        <p>
     *        If the service is using the default capacity provider strategy for the cluster, the service can be updated
     *        to use one or more capacity providers as opposed to the default capacity provider strategy. However, when
     *        a service is using a capacity provider strategy that is not the default capacity provider strategy, the
     *        service cannot be updated to use the cluster's default capacity provider strategy.
     *        </p>
     *        <p>
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     *        </p>
     *        <p>
     *        The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity
     *        providers for a cluster after the cluster is created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     */

    public void setDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @return Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *         stopping and starting tasks.
     */

    public DeploymentConfiguration getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        setDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    /**
     * <p>
     * An object representing the network configuration for the service.
     * </p>
     * 
     * @param networkConfiguration
     *        An object representing the network configuration for the service.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * An object representing the network configuration for the service.
     * </p>
     * 
     * @return An object representing the network configuration for the service.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * An object representing the network configuration for the service.
     * </p>
     * 
     * @param networkConfiguration
     *        An object representing the network configuration for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * An array of task placement constraint objects to update the service to use. If no value is specified, the
     * existing placement constraints for the service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To remove all existing placement
     * constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and
     * those specified at runtime).
     * </p>
     * 
     * @return An array of task placement constraint objects to update the service to use. If no value is specified, the
     *         existing placement constraints for the service will remain unchanged. If this value is specified, it will
     *         override any existing placement constraints defined for the service. To remove all existing placement
     *         constraints, specify an empty array.</p>
     *         <p>
     *         You can specify a maximum of 10 constraints per task (this limit includes constraints in the task
     *         definition and those specified at runtime).
     */

    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        if (placementConstraints == null) {
            placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>();
        }
        return placementConstraints;
    }

    /**
     * <p>
     * An array of task placement constraint objects to update the service to use. If no value is specified, the
     * existing placement constraints for the service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To remove all existing placement
     * constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and
     * those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of task placement constraint objects to update the service to use. If no value is specified, the
     *        existing placement constraints for the service will remain unchanged. If this value is specified, it will
     *        override any existing placement constraints defined for the service. To remove all existing placement
     *        constraints, specify an empty array.</p>
     *        <p>
     *        You can specify a maximum of 10 constraints per task (this limit includes constraints in the task
     *        definition and those specified at runtime).
     */

    public void setPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints);
    }

    /**
     * <p>
     * An array of task placement constraint objects to update the service to use. If no value is specified, the
     * existing placement constraints for the service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To remove all existing placement
     * constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and
     * those specified at runtime).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        An array of task placement constraint objects to update the service to use. If no value is specified, the
     *        existing placement constraints for the service will remain unchanged. If this value is specified, it will
     *        override any existing placement constraints defined for the service. To remove all existing placement
     *        constraints, specify an empty array.</p>
     *        <p>
     *        You can specify a maximum of 10 constraints per task (this limit includes constraints in the task
     *        definition and those specified at runtime).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withPlacementConstraints(PlacementConstraint... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints.length));
        }
        for (PlacementConstraint ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of task placement constraint objects to update the service to use. If no value is specified, the
     * existing placement constraints for the service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To remove all existing placement
     * constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and
     * those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of task placement constraint objects to update the service to use. If no value is specified, the
     *        existing placement constraints for the service will remain unchanged. If this value is specified, it will
     *        override any existing placement constraints defined for the service. To remove all existing placement
     *        constraints, specify an empty array.</p>
     *        <p>
     *        You can specify a maximum of 10 constraints per task (this limit includes constraints in the task
     *        definition and those specified at runtime).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The task placement strategy objects to update the service to use. If no value is specified, the existing
     * placement strategy for the service will remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty
     * object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     * 
     * @return The task placement strategy objects to update the service to use. If no value is specified, the existing
     *         placement strategy for the service will remain unchanged. If this value is specified, it will override
     *         the existing placement strategy defined for the service. To remove an existing placement strategy,
     *         specify an empty object.</p>
     *         <p>
     *         You can specify a maximum of five strategy rules per service.
     */

    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        if (placementStrategy == null) {
            placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>();
        }
        return placementStrategy;
    }

    /**
     * <p>
     * The task placement strategy objects to update the service to use. If no value is specified, the existing
     * placement strategy for the service will remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty
     * object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     * 
     * @param placementStrategy
     *        The task placement strategy objects to update the service to use. If no value is specified, the existing
     *        placement strategy for the service will remain unchanged. If this value is specified, it will override the
     *        existing placement strategy defined for the service. To remove an existing placement strategy, specify an
     *        empty object.</p>
     *        <p>
     *        You can specify a maximum of five strategy rules per service.
     */

    public void setPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        if (placementStrategy == null) {
            this.placementStrategy = null;
            return;
        }

        this.placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy);
    }

    /**
     * <p>
     * The task placement strategy objects to update the service to use. If no value is specified, the existing
     * placement strategy for the service will remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty
     * object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementStrategy(java.util.Collection)} or {@link #withPlacementStrategy(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param placementStrategy
     *        The task placement strategy objects to update the service to use. If no value is specified, the existing
     *        placement strategy for the service will remain unchanged. If this value is specified, it will override the
     *        existing placement strategy defined for the service. To remove an existing placement strategy, specify an
     *        empty object.</p>
     *        <p>
     *        You can specify a maximum of five strategy rules per service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withPlacementStrategy(PlacementStrategy... placementStrategy) {
        if (this.placementStrategy == null) {
            setPlacementStrategy(new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy.length));
        }
        for (PlacementStrategy ele : placementStrategy) {
            this.placementStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The task placement strategy objects to update the service to use. If no value is specified, the existing
     * placement strategy for the service will remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty
     * object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     * 
     * @param placementStrategy
     *        The task placement strategy objects to update the service to use. If no value is specified, the existing
     *        placement strategy for the service will remain unchanged. If this value is specified, it will override the
     *        existing placement strategy defined for the service. To remove an existing placement strategy, specify an
     *        empty object.</p>
     *        <p>
     *        You can specify a maximum of five strategy rules per service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A platform version is only specified for
     * tasks using the Fargate launch type. If a platform version is not specified, the <code>LATEST</code> platform
     * version is used by default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which your tasks in the service are running. A platform version is only specified
     *        for tasks using the Fargate launch type. If a platform version is not specified, the <code>LATEST</code>
     *        platform version is used by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A platform version is only specified for
     * tasks using the Fargate launch type. If a platform version is not specified, the <code>LATEST</code> platform
     * version is used by default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The platform version on which your tasks in the service are running. A platform version is only specified
     *         for tasks using the Fargate launch type. If a platform version is not specified, the <code>LATEST</code>
     *         platform version is used by default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A platform version is only specified for
     * tasks using the Fargate launch type. If a platform version is not specified, the <code>LATEST</code> platform
     * version is used by default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which your tasks in the service are running. A platform version is only specified
     *        for tasks using the Fargate launch type. If a platform version is not specified, the <code>LATEST</code>
     *        platform version is used by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option
     * to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to
     * use a newer Docker image with the same image/tag combination (<code>my_image:latest</code>) or to roll Fargate
     * tasks onto a newer platform version.
     * </p>
     * 
     * @param forceNewDeployment
     *        Whether to force a new deployment of the service. Deployments are not forced by default. You can use this
     *        option to trigger a new deployment with no service definition changes. For example, you can update a
     *        service's tasks to use a newer Docker image with the same image/tag combination (
     *        <code>my_image:latest</code>) or to roll Fargate tasks onto a newer platform version.
     */

    public void setForceNewDeployment(Boolean forceNewDeployment) {
        this.forceNewDeployment = forceNewDeployment;
    }

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option
     * to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to
     * use a newer Docker image with the same image/tag combination (<code>my_image:latest</code>) or to roll Fargate
     * tasks onto a newer platform version.
     * </p>
     * 
     * @return Whether to force a new deployment of the service. Deployments are not forced by default. You can use this
     *         option to trigger a new deployment with no service definition changes. For example, you can update a
     *         service's tasks to use a newer Docker image with the same image/tag combination (
     *         <code>my_image:latest</code>) or to roll Fargate tasks onto a newer platform version.
     */

    public Boolean getForceNewDeployment() {
        return this.forceNewDeployment;
    }

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option
     * to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to
     * use a newer Docker image with the same image/tag combination (<code>my_image:latest</code>) or to roll Fargate
     * tasks onto a newer platform version.
     * </p>
     * 
     * @param forceNewDeployment
     *        Whether to force a new deployment of the service. Deployments are not forced by default. You can use this
     *        option to trigger a new deployment with no service definition changes. For example, you can update a
     *        service's tasks to use a newer Docker image with the same image/tag combination (
     *        <code>my_image:latest</code>) or to roll Fargate tasks onto a newer platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withForceNewDeployment(Boolean forceNewDeployment) {
        setForceNewDeployment(forceNewDeployment);
        return this;
    }

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option
     * to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to
     * use a newer Docker image with the same image/tag combination (<code>my_image:latest</code>) or to roll Fargate
     * tasks onto a newer platform version.
     * </p>
     * 
     * @return Whether to force a new deployment of the service. Deployments are not forced by default. You can use this
     *         option to trigger a new deployment with no service definition changes. For example, you can update a
     *         service's tasks to use a newer Docker image with the same image/tag combination (
     *         <code>my_image:latest</code>) or to roll Fargate tasks onto a newer platform version.
     */

    public Boolean isForceNewDeployment() {
        return this.forceNewDeployment;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing
     * health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the
     * Amazon ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can
     * prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come
     * up.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     *        Balancing target health checks after a task has first started. This is only valid if your service is
     *        configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic
     *        Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds.
     *        During that time, the Amazon ECS service scheduler ignores the Elastic Load Balancing health check status.
     *        This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and stopping them
     *        before they have time to come up.
     */

    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing
     * health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the
     * Amazon ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can
     * prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come
     * up.
     * </p>
     * 
     * @return The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic
     *         Load Balancing target health checks after a task has first started. This is only valid if your service is
     *         configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic
     *         Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds.
     *         During that time, the Amazon ECS service scheduler ignores the Elastic Load Balancing health check
     *         status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and
     *         stopping them before they have time to come up.
     */

    public Integer getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing
     * health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the
     * Amazon ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can
     * prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come
     * up.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     *        Balancing target health checks after a task has first started. This is only valid if your service is
     *        configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic
     *        Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds.
     *        During that time, the Amazon ECS service scheduler ignores the Elastic Load Balancing health check status.
     *        This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and stopping them
     *        before they have time to come up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        setHealthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this enables execute command functionality on all task containers.
     * </p>
     * <p>
     * If you do not want to override the value that was set when the service was created, you can set this to
     * <code>null</code> when performing this action.
     * </p>
     * 
     * @param enableExecuteCommand
     *        If <code>true</code>, this enables execute command functionality on all task containers.</p>
     *        <p>
     *        If you do not want to override the value that was set when the service was created, you can set this to
     *        <code>null</code> when performing this action.
     */

    public void setEnableExecuteCommand(Boolean enableExecuteCommand) {
        this.enableExecuteCommand = enableExecuteCommand;
    }

    /**
     * <p>
     * If <code>true</code>, this enables execute command functionality on all task containers.
     * </p>
     * <p>
     * If you do not want to override the value that was set when the service was created, you can set this to
     * <code>null</code> when performing this action.
     * </p>
     * 
     * @return If <code>true</code>, this enables execute command functionality on all task containers.</p>
     *         <p>
     *         If you do not want to override the value that was set when the service was created, you can set this to
     *         <code>null</code> when performing this action.
     */

    public Boolean getEnableExecuteCommand() {
        return this.enableExecuteCommand;
    }

    /**
     * <p>
     * If <code>true</code>, this enables execute command functionality on all task containers.
     * </p>
     * <p>
     * If you do not want to override the value that was set when the service was created, you can set this to
     * <code>null</code> when performing this action.
     * </p>
     * 
     * @param enableExecuteCommand
     *        If <code>true</code>, this enables execute command functionality on all task containers.</p>
     *        <p>
     *        If you do not want to override the value that was set when the service was created, you can set this to
     *        <code>null</code> when performing this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withEnableExecuteCommand(Boolean enableExecuteCommand) {
        setEnableExecuteCommand(enableExecuteCommand);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this enables execute command functionality on all task containers.
     * </p>
     * <p>
     * If you do not want to override the value that was set when the service was created, you can set this to
     * <code>null</code> when performing this action.
     * </p>
     * 
     * @return If <code>true</code>, this enables execute command functionality on all task containers.</p>
     *         <p>
     *         If you do not want to override the value that was set when the service was created, you can set this to
     *         <code>null</code> when performing this action.
     */

    public Boolean isEnableExecuteCommand() {
        return this.enableExecuteCommand;
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: ").append(getDesiredCount()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getCapacityProviderStrategy() != null)
            sb.append("CapacityProviderStrategy: ").append(getCapacityProviderStrategy()).append(",");
        if (getDeploymentConfiguration() != null)
            sb.append("DeploymentConfiguration: ").append(getDeploymentConfiguration()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getPlacementStrategy() != null)
            sb.append("PlacementStrategy: ").append(getPlacementStrategy()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getForceNewDeployment() != null)
            sb.append("ForceNewDeployment: ").append(getForceNewDeployment()).append(",");
        if (getHealthCheckGracePeriodSeconds() != null)
            sb.append("HealthCheckGracePeriodSeconds: ").append(getHealthCheckGracePeriodSeconds()).append(",");
        if (getEnableExecuteCommand() != null)
            sb.append("EnableExecuteCommand: ").append(getEnableExecuteCommand());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceRequest == false)
            return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getCapacityProviderStrategy() == null ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getForceNewDeployment() == null ^ this.getForceNewDeployment() == null)
            return false;
        if (other.getForceNewDeployment() != null && other.getForceNewDeployment().equals(this.getForceNewDeployment()) == false)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() == null ^ this.getHealthCheckGracePeriodSeconds() == null)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() != null
                && other.getHealthCheckGracePeriodSeconds().equals(this.getHealthCheckGracePeriodSeconds()) == false)
            return false;
        if (other.getEnableExecuteCommand() == null ^ this.getEnableExecuteCommand() == null)
            return false;
        if (other.getEnableExecuteCommand() != null && other.getEnableExecuteCommand().equals(this.getEnableExecuteCommand()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getForceNewDeployment() == null) ? 0 : getForceNewDeployment().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckGracePeriodSeconds() == null) ? 0 : getHealthCheckGracePeriodSeconds().hashCode());
        hashCode = prime * hashCode + ((getEnableExecuteCommand() == null) ? 0 : getEnableExecuteCommand().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceRequest clone() {
        return (UpdateServiceRequest) super.clone();
    }

}
