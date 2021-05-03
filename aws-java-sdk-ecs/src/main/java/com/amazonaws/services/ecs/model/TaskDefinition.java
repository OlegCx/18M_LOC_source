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
 * The details of a task definition which describes the container and volume definitions of an Amazon Elastic Container
 * Service task. You can specify which Docker images to use, the required resources, and other configurations related to
 * launching the task definition through an Amazon ECS service or task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/TaskDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     */
    private String taskDefinitionArn;
    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitions;
    /**
     * <p>
     * The name of a family that this task definition is registered to. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * <p>
     * A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that you
     * registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each task
     * definition that you add.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * grants containers in the task permission to call AWS APIs on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">Amazon ECS Task Role</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * IAM roles for tasks on Windows require that the <code>-EnableTaskIAMRole</code> option is set when you launch the
     * Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code in order to take
     * advantage of the feature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html">Windows IAM roles
     * for tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String taskRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent permission
     * to make AWS API calls on your behalf. The task execution IAM role is required depending on the requirements of
     * your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS task
     * execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the default is
     * <code>bridge</code>.
     * </p>
     * <p>
     * For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on Amazon
     * EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you cannot specify
     * port mappings in your container definitions, and the tasks containers do not have external connectivity. The
     * <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for containers
     * because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <important>
     * <p>
     * When using the <code>host</code> network mode, you should not run containers using the root user (UID 0). It is
     * considered best practice to use a non-root user.
     * </p>
     * </important>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     */
    private String networkMode;
    /**
     * <p>
     * The revision of the task in a particular family. The revision is a version number of a task definition in a
     * family. When you register a task definition for the first time, the revision is <code>1</code>. Each time that
     * you register a new revision of a task definition in the same family, the revision value always increases by one,
     * even if you have deregistered previous revisions in this family.
     * </p>
     */
    private Integer revision;
    /**
     * <p>
     * The list of data volume definitions for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data volumes in
     * tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Volume> volumes;
    /**
     * <p>
     * The status of the task definition.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The container instance attributes required by your task. When an Amazon EC2 instance is registered to your
     * cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply custom
     * attributes, specified as key-value pairs using the Amazon ECS console or the <a>PutAttributes</a> API. These
     * attributes are used when considering task placement for tasks hosted on Amazon EC2 instances. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     * >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Attribute> requiresAttributes;
    /**
     * <p>
     * An array of placement constraint objects to use for tasks.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint> placementConstraints;
    /**
     * <p>
     * The task launch types the task definition validated against during task definition registration. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon
     * ECS launch types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> compatibilities;
    /**
     * <p>
     * The task launch types the task definition was validated against. To determine which task launch types the task
     * definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> requiresCompatibilities;
    /**
     * <p>
     * The number of <code>cpu</code> units used by the task. If you are using the EC2 launch type, this field is
     * optional and any value can be used. If you are using the Fargate launch type, this field is required and you must
     * use one of the following values, which determines your range of valid values for the <code>memory</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     */
    private String cpu;
    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * <p>
     * If your tasks will be run on Amazon EC2 instances, you must specify either a task-level memory value or a
     * container-level memory value. This field is optional and any value can be used. If a task-level memory value is
     * specified then the container-level memory value is optional. For more information regarding container-level
     * memory and memory reservation, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html"
     * >ContainerDefinition</a>.
     * </p>
     * <p>
     * If your tasks will be run on AWS Fargate, this field is required and you must use one of the following values,
     * which determines your range of valid values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     */
    private String memory;
    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InferenceAccelerator> inferenceAccelerators;
    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same process namespace with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     */
    private String pidMode;
    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     */
    private String ipcMode;
    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least version
     * 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container instances are
     * launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private ProxyConfiguration proxyConfiguration;
    /**
     * <p>
     * The Unix timestamp for when the task definition was registered.
     * </p>
     */
    private java.util.Date registeredAt;
    /**
     * <p>
     * The Unix timestamp for when the task definition was deregistered.
     * </p>
     */
    private java.util.Date deregisteredAt;
    /**
     * <p>
     * The principal that registered the task definition.
     * </p>
     */
    private String registeredBy;
    /**
     * <p>
     * The ephemeral storage settings to use for tasks run with the task definition.
     * </p>
     */
    private EphemeralStorage ephemeralStorage;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The full Amazon Resource Name (ARN) of the task definition.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     * 
     * @return The full Amazon Resource Name (ARN) of the task definition.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The full Amazon Resource Name (ARN) of the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return A list of container definitions in JSON format that describe the different containers that make up your
     *         task. For more information about container definition parameters and defaults, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *         Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        if (containerDefinitions == null) {
            containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>();
        }
        return containerDefinitions;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task. For more information about container definition parameters and defaults, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(containerDefinitions);
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerDefinitions(java.util.Collection)} or {@link #withContainerDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task. For more information about container definition parameters and defaults, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withContainerDefinitions(ContainerDefinition... containerDefinitions) {
        if (this.containerDefinitions == null) {
            setContainerDefinitions(new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(containerDefinitions.length));
        }
        for (ContainerDefinition ele : containerDefinitions) {
            this.containerDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task. For more information about container definition parameters and defaults, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * <p>
     * A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that you
     * registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each task
     * definition that you add.
     * </p>
     * 
     * @param family
     *        The name of a family that this task definition is registered to. Up to 255 letters (uppercase and
     *        lowercase), numbers, hyphens, and underscores are allowed.</p>
     *        <p>
     *        A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that
     *        you registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each
     *        task definition that you add.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * <p>
     * A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that you
     * registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each task
     * definition that you add.
     * </p>
     * 
     * @return The name of a family that this task definition is registered to. Up to 255 letters (uppercase and
     *         lowercase), numbers, hyphens, and underscores are allowed.</p>
     *         <p>
     *         A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that
     *         you registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each
     *         task definition that you add.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * <p>
     * A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that you
     * registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each task
     * definition that you add.
     * </p>
     * 
     * @param family
     *        The name of a family that this task definition is registered to. Up to 255 letters (uppercase and
     *        lowercase), numbers, hyphens, and underscores are allowed.</p>
     *        <p>
     *        A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that
     *        you registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each
     *        task definition that you add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * grants containers in the task permission to call AWS APIs on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">Amazon ECS Task Role</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * IAM roles for tasks on Windows require that the <code>-EnableTaskIAMRole</code> option is set when you launch the
     * Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code in order to take
     * advantage of the feature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html">Windows IAM roles
     * for tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role
     *        that grants containers in the task permission to call AWS APIs on your behalf. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">Amazon ECS Task
     *        Role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
     *        <p>
     *        IAM roles for tasks on Windows require that the <code>-EnableTaskIAMRole</code> option is set when you
     *        launch the Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code in
     *        order to take advantage of the feature. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html">Windows IAM
     *        roles for tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * grants containers in the task permission to call AWS APIs on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">Amazon ECS Task Role</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * IAM roles for tasks on Windows require that the <code>-EnableTaskIAMRole</code> option is set when you launch the
     * Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code in order to take
     * advantage of the feature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html">Windows IAM roles
     * for tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role
     *         that grants containers in the task permission to call AWS APIs on your behalf. For more information, see
     *         <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">Amazon ECS Task
     *         Role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
     *         <p>
     *         IAM roles for tasks on Windows require that the <code>-EnableTaskIAMRole</code> option is set when you
     *         launch the Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code in
     *         order to take advantage of the feature. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html">Windows
     *         IAM roles for tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * grants containers in the task permission to call AWS APIs on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">Amazon ECS Task Role</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * IAM roles for tasks on Windows require that the <code>-EnableTaskIAMRole</code> option is set when you launch the
     * Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code in order to take
     * advantage of the feature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html">Windows IAM roles
     * for tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role
     *        that grants containers in the task permission to call AWS APIs on your behalf. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">Amazon ECS Task
     *        Role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
     *        <p>
     *        IAM roles for tasks on Windows require that the <code>-EnableTaskIAMRole</code> option is set when you
     *        launch the Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code in
     *        order to take advantage of the feature. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html">Windows IAM
     *        roles for tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent permission
     * to make AWS API calls on your behalf. The task execution IAM role is required depending on the requirements of
     * your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS task
     * execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent
     *        permission to make AWS API calls on your behalf. The task execution IAM role is required depending on the
     *        requirements of your task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS
     *        task execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent permission
     * to make AWS API calls on your behalf. The task execution IAM role is required depending on the requirements of
     * your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS task
     * execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent
     *         permission to make AWS API calls on your behalf. The task execution IAM role is required depending on the
     *         requirements of your task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon
     *         ECS task execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent permission
     * to make AWS API calls on your behalf. The task execution IAM role is required depending on the requirements of
     * your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS task
     * execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent
     *        permission to make AWS API calls on your behalf. The task execution IAM role is required depending on the
     *        requirements of your task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS
     *        task execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the default is
     * <code>bridge</code>.
     * </p>
     * <p>
     * For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on Amazon
     * EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you cannot specify
     * port mappings in your container definitions, and the tasks containers do not have external connectivity. The
     * <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for containers
     * because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <important>
     * <p>
     * When using the <code>host</code> network mode, you should not run containers using the root user (UID 0). It is
     * considered best practice to use a non-root user.
     * </p>
     * </important>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the
     *        default is <code>bridge</code>.</p>
     *        <p>
     *        For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on
     *        Amazon EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you
     *        cannot specify port mappings in your container definitions, and the tasks containers do not have external
     *        connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking
     *        performance for containers because they use the EC2 network stack instead of the virtualized network stack
     *        provided by the <code>bridge</code> mode.
     *        </p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <important>
     *        <p>
     *        When using the <code>host</code> network mode, you should not run containers using the root user (UID 0).
     *        It is considered best practice to use a non-root user.
     *        </p>
     *        </important>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *        must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *        Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *        package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *        </p>
     *        </note>
     *        <p>
     *        If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode. If you use the console to register a task
     *        definition with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the default is
     * <code>bridge</code>.
     * </p>
     * <p>
     * For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on Amazon
     * EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you cannot specify
     * port mappings in your container definitions, and the tasks containers do not have external connectivity. The
     * <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for containers
     * because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <important>
     * <p>
     * When using the <code>host</code> network mode, you should not run containers using the root user (UID 0). It is
     * considered best practice to use a non-root user.
     * </p>
     * </important>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @return The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *         <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the
     *         default is <code>bridge</code>.</p>
     *         <p>
     *         For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks
     *         on Amazon EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>,
     *         you cannot specify port mappings in your container definitions, and the tasks containers do not have
     *         external connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest
     *         networking performance for containers because they use the EC2 network stack instead of the virtualized
     *         network stack provided by the <code>bridge</code> mode.
     *         </p>
     *         <p>
     *         With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *         directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *         network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of
     *         dynamic host port mappings.
     *         </p>
     *         <important>
     *         <p>
     *         When using the <code>host</code> network mode, you should not run containers using the root user (UID 0).
     *         It is considered best practice to use a non-root user.
     *         </p>
     *         </important>
     *         <p>
     *         If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *         must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *         definition. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *         Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *         package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *         </p>
     *         </note>
     *         <p>
     *         If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *         single container instance when port mappings are used.
     *         </p>
     *         <p>
     *         Docker for Windows uses different network modes than Docker for Linux. When you register a task
     *         definition with Windows containers, you must not specify a network mode. If you use the console to
     *         register a task definition with Windows containers, you must choose the <code>&lt;default&gt;</code>
     *         network mode object.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.docker.com/engine/reference/run/#network-settings">Network settings</a> in the
     *         <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public String getNetworkMode() {
        return this.networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the default is
     * <code>bridge</code>.
     * </p>
     * <p>
     * For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on Amazon
     * EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you cannot specify
     * port mappings in your container definitions, and the tasks containers do not have external connectivity. The
     * <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for containers
     * because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <important>
     * <p>
     * When using the <code>host</code> network mode, you should not run containers using the root user (UID 0). It is
     * considered best practice to use a non-root user.
     * </p>
     * </important>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the
     *        default is <code>bridge</code>.</p>
     *        <p>
     *        For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on
     *        Amazon EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you
     *        cannot specify port mappings in your container definitions, and the tasks containers do not have external
     *        connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking
     *        performance for containers because they use the EC2 network stack instead of the virtualized network stack
     *        provided by the <code>bridge</code> mode.
     *        </p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <important>
     *        <p>
     *        When using the <code>host</code> network mode, you should not run containers using the root user (UID 0).
     *        It is considered best practice to use a non-root user.
     *        </p>
     *        </important>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *        must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *        Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *        package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *        </p>
     *        </note>
     *        <p>
     *        If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode. If you use the console to register a task
     *        definition with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public TaskDefinition withNetworkMode(String networkMode) {
        setNetworkMode(networkMode);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the default is
     * <code>bridge</code>.
     * </p>
     * <p>
     * For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on Amazon
     * EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you cannot specify
     * port mappings in your container definitions, and the tasks containers do not have external connectivity. The
     * <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for containers
     * because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <important>
     * <p>
     * When using the <code>host</code> network mode, you should not run containers using the root user (UID 0). It is
     * considered best practice to use a non-root user.
     * </p>
     * </important>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the
     *        default is <code>bridge</code>.</p>
     *        <p>
     *        For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on
     *        Amazon EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you
     *        cannot specify port mappings in your container definitions, and the tasks containers do not have external
     *        connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking
     *        performance for containers because they use the EC2 network stack instead of the virtualized network stack
     *        provided by the <code>bridge</code> mode.
     *        </p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <important>
     *        <p>
     *        When using the <code>host</code> network mode, you should not run containers using the root user (UID 0).
     *        It is considered best practice to use a non-root user.
     *        </p>
     *        </important>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *        must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *        Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *        package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *        </p>
     *        </note>
     *        <p>
     *        If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode. If you use the console to register a task
     *        definition with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public void setNetworkMode(NetworkMode networkMode) {
        withNetworkMode(networkMode);
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the default is
     * <code>bridge</code>.
     * </p>
     * <p>
     * For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on Amazon
     * EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you cannot specify
     * port mappings in your container definitions, and the tasks containers do not have external connectivity. The
     * <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for containers
     * because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <important>
     * <p>
     * When using the <code>host</code> network mode, you should not run containers using the root user (UID 0). It is
     * considered best practice to use a non-root user.
     * </p>
     * </important>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. If no network mode is specified, the
     *        default is <code>bridge</code>.</p>
     *        <p>
     *        For Amazon ECS tasks on Fargate, the <code>awsvpc</code> network mode is required. For Amazon ECS tasks on
     *        Amazon EC2 instances, any network mode can be used. If the network mode is set to <code>none</code>, you
     *        cannot specify port mappings in your container definitions, and the tasks containers do not have external
     *        connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking
     *        performance for containers because they use the EC2 network stack instead of the virtualized network stack
     *        provided by the <code>bridge</code> mode.
     *        </p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <important>
     *        <p>
     *        When using the <code>host</code> network mode, you should not run containers using the root user (UID 0).
     *        It is considered best practice to use a non-root user.
     *        </p>
     *        </important>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *        must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *        Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *        package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *        </p>
     *        </note>
     *        <p>
     *        If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode. If you use the console to register a task
     *        definition with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public TaskDefinition withNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode.toString();
        return this;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a version number of a task definition in a
     * family. When you register a task definition for the first time, the revision is <code>1</code>. Each time that
     * you register a new revision of a task definition in the same family, the revision value always increases by one,
     * even if you have deregistered previous revisions in this family.
     * </p>
     * 
     * @param revision
     *        The revision of the task in a particular family. The revision is a version number of a task definition in
     *        a family. When you register a task definition for the first time, the revision is <code>1</code>. Each
     *        time that you register a new revision of a task definition in the same family, the revision value always
     *        increases by one, even if you have deregistered previous revisions in this family.
     */

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a version number of a task definition in a
     * family. When you register a task definition for the first time, the revision is <code>1</code>. Each time that
     * you register a new revision of a task definition in the same family, the revision value always increases by one,
     * even if you have deregistered previous revisions in this family.
     * </p>
     * 
     * @return The revision of the task in a particular family. The revision is a version number of a task definition in
     *         a family. When you register a task definition for the first time, the revision is <code>1</code>. Each
     *         time that you register a new revision of a task definition in the same family, the revision value always
     *         increases by one, even if you have deregistered previous revisions in this family.
     */

    public Integer getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a version number of a task definition in a
     * family. When you register a task definition for the first time, the revision is <code>1</code>. Each time that
     * you register a new revision of a task definition in the same family, the revision value always increases by one,
     * even if you have deregistered previous revisions in this family.
     * </p>
     * 
     * @param revision
     *        The revision of the task in a particular family. The revision is a version number of a task definition in
     *        a family. When you register a task definition for the first time, the revision is <code>1</code>. Each
     *        time that you register a new revision of a task definition in the same family, the revision value always
     *        increases by one, even if you have deregistered previous revisions in this family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withRevision(Integer revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The list of data volume definitions for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data volumes in
     * tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @return The list of data volume definitions for the task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data
     *         volumes in tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *         <p>
     *         The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS
     *         Fargate.
     *         </p>
     */

    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new com.amazonaws.internal.SdkInternalList<Volume>();
        }
        return volumes;
    }

    /**
     * <p>
     * The list of data volume definitions for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data volumes in
     * tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param volumes
     *        The list of data volume definitions for the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data
     *        volumes in tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS
     *        Fargate.
     *        </p>
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new com.amazonaws.internal.SdkInternalList<Volume>(volumes);
    }

    /**
     * <p>
     * The list of data volume definitions for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data volumes in
     * tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        The list of data volume definitions for the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data
     *        volumes in tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS
     *        Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new com.amazonaws.internal.SdkInternalList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of data volume definitions for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data volumes in
     * tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param volumes
     *        The list of data volume definitions for the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using data
     *        volumes in tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        The <code>host</code> and <code>sourcePath</code> parameters are not supported for tasks run on AWS
     *        Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @param status
     *        The status of the task definition.
     * @see TaskDefinitionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @return The status of the task definition.
     * @see TaskDefinitionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @param status
     *        The status of the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionStatus
     */

    public TaskDefinition withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @param status
     *        The status of the task definition.
     * @see TaskDefinitionStatus
     */

    public void setStatus(TaskDefinitionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @param status
     *        The status of the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionStatus
     */

    public TaskDefinition withStatus(TaskDefinitionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The container instance attributes required by your task. When an Amazon EC2 instance is registered to your
     * cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply custom
     * attributes, specified as key-value pairs using the Amazon ECS console or the <a>PutAttributes</a> API. These
     * attributes are used when considering task placement for tasks hosted on Amazon EC2 instances. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     * >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @return The container instance attributes required by your task. When an Amazon EC2 instance is registered to
     *         your cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can
     *         apply custom attributes, specified as key-value pairs using the Amazon ECS console or the
     *         <a>PutAttributes</a> API. These attributes are used when considering task placement for tasks hosted on
     *         Amazon EC2 instances. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     *         >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *         <p>
     *         This parameter is not supported for tasks run on AWS Fargate.
     *         </p>
     */

    public java.util.List<Attribute> getRequiresAttributes() {
        if (requiresAttributes == null) {
            requiresAttributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return requiresAttributes;
    }

    /**
     * <p>
     * The container instance attributes required by your task. When an Amazon EC2 instance is registered to your
     * cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply custom
     * attributes, specified as key-value pairs using the Amazon ECS console or the <a>PutAttributes</a> API. These
     * attributes are used when considering task placement for tasks hosted on Amazon EC2 instances. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     * >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param requiresAttributes
     *        The container instance attributes required by your task. When an Amazon EC2 instance is registered to your
     *        cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply
     *        custom attributes, specified as key-value pairs using the Amazon ECS console or the <a>PutAttributes</a>
     *        API. These attributes are used when considering task placement for tasks hosted on Amazon EC2 instances.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     *        >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        This parameter is not supported for tasks run on AWS Fargate.
     *        </p>
     */

    public void setRequiresAttributes(java.util.Collection<Attribute> requiresAttributes) {
        if (requiresAttributes == null) {
            this.requiresAttributes = null;
            return;
        }

        this.requiresAttributes = new com.amazonaws.internal.SdkInternalList<Attribute>(requiresAttributes);
    }

    /**
     * <p>
     * The container instance attributes required by your task. When an Amazon EC2 instance is registered to your
     * cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply custom
     * attributes, specified as key-value pairs using the Amazon ECS console or the <a>PutAttributes</a> API. These
     * attributes are used when considering task placement for tasks hosted on Amazon EC2 instances. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     * >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiresAttributes(java.util.Collection)} or {@link #withRequiresAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param requiresAttributes
     *        The container instance attributes required by your task. When an Amazon EC2 instance is registered to your
     *        cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply
     *        custom attributes, specified as key-value pairs using the Amazon ECS console or the <a>PutAttributes</a>
     *        API. These attributes are used when considering task placement for tasks hosted on Amazon EC2 instances.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     *        >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        This parameter is not supported for tasks run on AWS Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withRequiresAttributes(Attribute... requiresAttributes) {
        if (this.requiresAttributes == null) {
            setRequiresAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(requiresAttributes.length));
        }
        for (Attribute ele : requiresAttributes) {
            this.requiresAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container instance attributes required by your task. When an Amazon EC2 instance is registered to your
     * cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply custom
     * attributes, specified as key-value pairs using the Amazon ECS console or the <a>PutAttributes</a> API. These
     * attributes are used when considering task placement for tasks hosted on Amazon EC2 instances. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     * >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param requiresAttributes
     *        The container instance attributes required by your task. When an Amazon EC2 instance is registered to your
     *        cluster, the Amazon ECS container agent assigns some standard attributes to the instance. You can apply
     *        custom attributes, specified as key-value pairs using the Amazon ECS console or the <a>PutAttributes</a>
     *        API. These attributes are used when considering task placement for tasks hosted on Amazon EC2 instances.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     *        >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        This parameter is not supported for tasks run on AWS Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withRequiresAttributes(java.util.Collection<Attribute> requiresAttributes) {
        setRequiresAttributes(requiresAttributes);
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @return An array of placement constraint objects to use for tasks.</p> <note>
     *         <p>
     *         This parameter is not supported for tasks run on AWS Fargate.
     *         </p>
     */

    public java.util.List<TaskDefinitionPlacementConstraint> getPlacementConstraints() {
        if (placementConstraints == null) {
            placementConstraints = new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>();
        }
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks.</p> <note>
     *        <p>
     *        This parameter is not supported for tasks run on AWS Fargate.
     *        </p>
     */

    public void setPlacementConstraints(java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>(placementConstraints);
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks.</p> <note>
     *        <p>
     *        This parameter is not supported for tasks run on AWS Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withPlacementConstraints(TaskDefinitionPlacementConstraint... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>(placementConstraints.length));
        }
        for (TaskDefinitionPlacementConstraint ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks.</p> <note>
     *        <p>
     *        This parameter is not supported for tasks run on AWS Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withPlacementConstraints(java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The task launch types the task definition validated against during task definition registration. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon
     * ECS launch types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The task launch types the task definition validated against during task definition registration. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS launch
     *         types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see Compatibility
     */

    public java.util.List<String> getCompatibilities() {
        if (compatibilities == null) {
            compatibilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return compatibilities;
    }

    /**
     * <p>
     * The task launch types the task definition validated against during task definition registration. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon
     * ECS launch types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param compatibilities
     *        The task launch types the task definition validated against during task definition registration. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS launch
     *        types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see Compatibility
     */

    public void setCompatibilities(java.util.Collection<String> compatibilities) {
        if (compatibilities == null) {
            this.compatibilities = null;
            return;
        }

        this.compatibilities = new com.amazonaws.internal.SdkInternalList<String>(compatibilities);
    }

    /**
     * <p>
     * The task launch types the task definition validated against during task definition registration. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon
     * ECS launch types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibilities(java.util.Collection)} or {@link #withCompatibilities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param compatibilities
     *        The task launch types the task definition validated against during task definition registration. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS launch
     *        types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public TaskDefinition withCompatibilities(String... compatibilities) {
        if (this.compatibilities == null) {
            setCompatibilities(new com.amazonaws.internal.SdkInternalList<String>(compatibilities.length));
        }
        for (String ele : compatibilities) {
            this.compatibilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The task launch types the task definition validated against during task definition registration. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon
     * ECS launch types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param compatibilities
     *        The task launch types the task definition validated against during task definition registration. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS launch
     *        types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public TaskDefinition withCompatibilities(java.util.Collection<String> compatibilities) {
        setCompatibilities(compatibilities);
        return this;
    }

    /**
     * <p>
     * The task launch types the task definition validated against during task definition registration. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon
     * ECS launch types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param compatibilities
     *        The task launch types the task definition validated against during task definition registration. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS launch
     *        types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public TaskDefinition withCompatibilities(Compatibility... compatibilities) {
        com.amazonaws.internal.SdkInternalList<String> compatibilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(compatibilities.length);
        for (Compatibility value : compatibilities) {
            compatibilitiesCopy.add(value.toString());
        }
        if (getCompatibilities() == null) {
            setCompatibilities(compatibilitiesCopy);
        } else {
            getCompatibilities().addAll(compatibilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The task launch types the task definition was validated against. To determine which task launch types the task
     * definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * </p>
     * 
     * @return The task launch types the task definition was validated against. To determine which task launch types the
     *         task definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * @see Compatibility
     */

    public java.util.List<String> getRequiresCompatibilities() {
        if (requiresCompatibilities == null) {
            requiresCompatibilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return requiresCompatibilities;
    }

    /**
     * <p>
     * The task launch types the task definition was validated against. To determine which task launch types the task
     * definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The task launch types the task definition was validated against. To determine which task launch types the
     *        task definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * @see Compatibility
     */

    public void setRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        if (requiresCompatibilities == null) {
            this.requiresCompatibilities = null;
            return;
        }

        this.requiresCompatibilities = new com.amazonaws.internal.SdkInternalList<String>(requiresCompatibilities);
    }

    /**
     * <p>
     * The task launch types the task definition was validated against. To determine which task launch types the task
     * definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiresCompatibilities(java.util.Collection)} or
     * {@link #withRequiresCompatibilities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The task launch types the task definition was validated against. To determine which task launch types the
     *        task definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public TaskDefinition withRequiresCompatibilities(String... requiresCompatibilities) {
        if (this.requiresCompatibilities == null) {
            setRequiresCompatibilities(new com.amazonaws.internal.SdkInternalList<String>(requiresCompatibilities.length));
        }
        for (String ele : requiresCompatibilities) {
            this.requiresCompatibilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The task launch types the task definition was validated against. To determine which task launch types the task
     * definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The task launch types the task definition was validated against. To determine which task launch types the
     *        task definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public TaskDefinition withRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        setRequiresCompatibilities(requiresCompatibilities);
        return this;
    }

    /**
     * <p>
     * The task launch types the task definition was validated against. To determine which task launch types the task
     * definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The task launch types the task definition was validated against. To determine which task launch types the
     *        task definition is validated for, see the <a>TaskDefinition$compatibilities</a> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public TaskDefinition withRequiresCompatibilities(Compatibility... requiresCompatibilities) {
        com.amazonaws.internal.SdkInternalList<String> requiresCompatibilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                requiresCompatibilities.length);
        for (Compatibility value : requiresCompatibilities) {
            requiresCompatibilitiesCopy.add(value.toString());
        }
        if (getRequiresCompatibilities() == null) {
            setRequiresCompatibilities(requiresCompatibilitiesCopy);
        } else {
            getRequiresCompatibilities().addAll(requiresCompatibilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units used by the task. If you are using the EC2 launch type, this field is
     * optional and any value can be used. If you are using the Fargate launch type, this field is required and you must
     * use one of the following values, which determines your range of valid values for the <code>memory</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpu
     *        The number of <code>cpu</code> units used by the task. If you are using the EC2 launch type, this field is
     *        optional and any value can be used. If you are using the Fargate launch type, this field is required and
     *        you must use one of the following values, which determines your range of valid values for the
     *        <code>memory</code> parameter:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *        6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units used by the task. If you are using the EC2 launch type, this field is
     * optional and any value can be used. If you are using the Fargate launch type, this field is required and you must
     * use one of the following values, which determines your range of valid values for the <code>memory</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of <code>cpu</code> units used by the task. If you are using the EC2 launch type, this field
     *         is optional and any value can be used. If you are using the Fargate launch type, this field is required
     *         and you must use one of the following values, which determines your range of valid values for the
     *         <code>memory</code> parameter:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *         6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *         of 1024 (1 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *         of 1024 (1 GB)
     *         </p>
     *         </li>
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units used by the task. If you are using the EC2 launch type, this field is
     * optional and any value can be used. If you are using the Fargate launch type, this field is required and you must
     * use one of the following values, which determines your range of valid values for the <code>memory</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpu
     *        The number of <code>cpu</code> units used by the task. If you are using the EC2 launch type, this field is
     *        optional and any value can be used. If you are using the Fargate launch type, this field is required and
     *        you must use one of the following values, which determines your range of valid values for the
     *        <code>memory</code> parameter:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *        6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * <p>
     * If your tasks will be run on Amazon EC2 instances, you must specify either a task-level memory value or a
     * container-level memory value. This field is optional and any value can be used. If a task-level memory value is
     * specified then the container-level memory value is optional. For more information regarding container-level
     * memory and memory reservation, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html"
     * >ContainerDefinition</a>.
     * </p>
     * <p>
     * If your tasks will be run on AWS Fargate, this field is required and you must use one of the following values,
     * which determines your range of valid values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @param memory
     *        The amount (in MiB) of memory used by the task.</p>
     *        <p>
     *        If your tasks will be run on Amazon EC2 instances, you must specify either a task-level memory value or a
     *        container-level memory value. This field is optional and any value can be used. If a task-level memory
     *        value is specified then the container-level memory value is optional. For more information regarding
     *        container-level memory and memory reservation, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html"
     *        >ContainerDefinition</a>.
     *        </p>
     *        <p>
     *        If your tasks will be run on AWS Fargate, this field is required and you must use one of the following
     *        values, which determines your range of valid values for the <code>cpu</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *        <code>cpu</code> values: 1024 (1 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        2048 (2 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        4096 (4 vCPU)
     *        </p>
     *        </li>
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * <p>
     * If your tasks will be run on Amazon EC2 instances, you must specify either a task-level memory value or a
     * container-level memory value. This field is optional and any value can be used. If a task-level memory value is
     * specified then the container-level memory value is optional. For more information regarding container-level
     * memory and memory reservation, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html"
     * >ContainerDefinition</a>.
     * </p>
     * <p>
     * If your tasks will be run on AWS Fargate, this field is required and you must use one of the following values,
     * which determines your range of valid values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The amount (in MiB) of memory used by the task.</p>
     *         <p>
     *         If your tasks will be run on Amazon EC2 instances, you must specify either a task-level memory value or a
     *         container-level memory value. This field is optional and any value can be used. If a task-level memory
     *         value is specified then the container-level memory value is optional. For more information regarding
     *         container-level memory and memory reservation, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html"
     *         >ContainerDefinition</a>.
     *         </p>
     *         <p>
     *         If your tasks will be run on AWS Fargate, this field is required and you must use one of the following
     *         values, which determines your range of valid values for the <code>cpu</code> parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *         <code>cpu</code> values: 1024 (1 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *         2048 (2 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *         4096 (4 vCPU)
     *         </p>
     *         </li>
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * <p>
     * If your tasks will be run on Amazon EC2 instances, you must specify either a task-level memory value or a
     * container-level memory value. This field is optional and any value can be used. If a task-level memory value is
     * specified then the container-level memory value is optional. For more information regarding container-level
     * memory and memory reservation, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html"
     * >ContainerDefinition</a>.
     * </p>
     * <p>
     * If your tasks will be run on AWS Fargate, this field is required and you must use one of the following values,
     * which determines your range of valid values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @param memory
     *        The amount (in MiB) of memory used by the task.</p>
     *        <p>
     *        If your tasks will be run on Amazon EC2 instances, you must specify either a task-level memory value or a
     *        container-level memory value. This field is optional and any value can be used. If a task-level memory
     *        value is specified then the container-level memory value is optional. For more information regarding
     *        container-level memory and memory reservation, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html"
     *        >ContainerDefinition</a>.
     *        </p>
     *        <p>
     *        If your tasks will be run on AWS Fargate, this field is required and you must use one of the following
     *        values, which determines your range of valid values for the <code>cpu</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *        <code>cpu</code> values: 1024 (1 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        2048 (2 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        4096 (4 vCPU)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     * 
     * @return The Elastic Inference accelerator associated with the task.
     */

    public java.util.List<InferenceAccelerator> getInferenceAccelerators() {
        if (inferenceAccelerators == null) {
            inferenceAccelerators = new com.amazonaws.internal.SdkInternalList<InferenceAccelerator>();
        }
        return inferenceAccelerators;
    }

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     * 
     * @param inferenceAccelerators
     *        The Elastic Inference accelerator associated with the task.
     */

    public void setInferenceAccelerators(java.util.Collection<InferenceAccelerator> inferenceAccelerators) {
        if (inferenceAccelerators == null) {
            this.inferenceAccelerators = null;
            return;
        }

        this.inferenceAccelerators = new com.amazonaws.internal.SdkInternalList<InferenceAccelerator>(inferenceAccelerators);
    }

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceAccelerators(java.util.Collection)} or
     * {@link #withInferenceAccelerators(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceAccelerators
     *        The Elastic Inference accelerator associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withInferenceAccelerators(InferenceAccelerator... inferenceAccelerators) {
        if (this.inferenceAccelerators == null) {
            setInferenceAccelerators(new com.amazonaws.internal.SdkInternalList<InferenceAccelerator>(inferenceAccelerators.length));
        }
        for (InferenceAccelerator ele : inferenceAccelerators) {
            this.inferenceAccelerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     * 
     * @param inferenceAccelerators
     *        The Elastic Inference accelerator associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withInferenceAccelerators(java.util.Collection<InferenceAccelerator> inferenceAccelerators) {
        setInferenceAccelerators(inferenceAccelerators);
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same process namespace with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *        the <code>host</code> PID mode on the same container instance share the same process namespace with the
     *        host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task
     *        share the same process namespace. If no value is specified, the default is a private namespace. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *        settings</a> in the <i>Docker run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *        </p>
     * @see PidMode
     */

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same process namespace with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @return The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *         <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *         the <code>host</code> PID mode on the same container instance share the same process namespace with the
     *         host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task
     *         share the same process namespace. If no value is specified, the default is a private namespace. For more
     *         information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *         settings</a> in the <i>Docker run reference</i>.</p>
     *         <p>
     *         If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *         namespace expose. For more information, see <a
     *         href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *         </p>
     * @see PidMode
     */

    public String getPidMode() {
        return this.pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same process namespace with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *        the <code>host</code> PID mode on the same container instance share the same process namespace with the
     *        host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task
     *        share the same process namespace. If no value is specified, the default is a private namespace. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *        settings</a> in the <i>Docker run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PidMode
     */

    public TaskDefinition withPidMode(String pidMode) {
        setPidMode(pidMode);
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same process namespace with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *        the <code>host</code> PID mode on the same container instance share the same process namespace with the
     *        host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task
     *        share the same process namespace. If no value is specified, the default is a private namespace. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *        settings</a> in the <i>Docker run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *        </p>
     * @see PidMode
     */

    public void setPidMode(PidMode pidMode) {
        withPidMode(pidMode);
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same process namespace with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *        the <code>host</code> PID mode on the same container instance share the same process namespace with the
     *        host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task
     *        share the same process namespace. If no value is specified, the default is a private namespace. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *        settings</a> in the <i>Docker run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PidMode
     */

    public TaskDefinition withPidMode(PidMode pidMode) {
        this.pidMode = pidMode.toString();
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the
     *        tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *        resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *        specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *        the containers of a task are private and not shared with other containers in a task or on the container
     *        instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *        setting on the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *        run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <p>
     *        If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *        the task, the following will apply to your IPC resource namespace. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *        Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *        not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *        apply to all containers within a task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *        </p>
     * @see IpcMode
     */

    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @return The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *         <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within
     *         the tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *         resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *         specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *         the containers of a task are private and not shared with other containers in a task or on the container
     *         instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *         setting on the container instance. For more information, see <a
     *         href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *         run reference</i>.</p>
     *         <p>
     *         If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *         namespace expose. For more information, see <a
     *         href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *         </p>
     *         <p>
     *         If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *         the task, the following will apply to your IPC resource namespace. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *         Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *         not supported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *         apply to all containers within a task.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *         </p>
     * @see IpcMode
     */

    public String getIpcMode() {
        return this.ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the
     *        tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *        resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *        specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *        the containers of a task are private and not shared with other containers in a task or on the container
     *        instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *        setting on the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *        run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <p>
     *        If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *        the task, the following will apply to your IPC resource namespace. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *        Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *        not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *        apply to all containers within a task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpcMode
     */

    public TaskDefinition withIpcMode(String ipcMode) {
        setIpcMode(ipcMode);
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the
     *        tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *        resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *        specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *        the containers of a task are private and not shared with other containers in a task or on the container
     *        instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *        setting on the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *        run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <p>
     *        If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *        the task, the following will apply to your IPC resource namespace. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *        Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *        not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *        apply to all containers within a task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *        </p>
     * @see IpcMode
     */

    public void setIpcMode(IpcMode ipcMode) {
        withIpcMode(ipcMode);
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     * </p>
     * </note>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the
     *        tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *        resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *        specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *        the containers of a task are private and not shared with other containers in a task or on the container
     *        instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *        setting on the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *        run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <p>
     *        If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *        the task, the following will apply to your IPC resource namespace. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *        Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *        not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *        apply to all containers within a task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on AWS Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpcMode
     */

    public TaskDefinition withIpcMode(IpcMode ipcMode) {
        this.ipcMode = ipcMode.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least version
     * 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container instances are
     * launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param proxyConfiguration
     *        The configuration details for the App Mesh proxy.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least
     *        version 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container
     *        instances are launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they
     *        contain the required versions of the container agent and <code>ecs-init</code>. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least version
     * 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container instances are
     * launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The configuration details for the App Mesh proxy.</p>
     *         <p>
     *         Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least
     *         version 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container
     *         instances are launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then
     *         they contain the required versions of the container agent and <code>ecs-init</code>. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *         ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public ProxyConfiguration getProxyConfiguration() {
        return this.proxyConfiguration;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least version
     * 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container instances are
     * launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param proxyConfiguration
     *        The configuration details for the App Mesh proxy.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least
     *        version 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container
     *        instances are launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they
     *        contain the required versions of the container agent and <code>ecs-init</code>. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        setProxyConfiguration(proxyConfiguration);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task definition was registered.
     * </p>
     * 
     * @param registeredAt
     *        The Unix timestamp for when the task definition was registered.
     */

    public void setRegisteredAt(java.util.Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task definition was registered.
     * </p>
     * 
     * @return The Unix timestamp for when the task definition was registered.
     */

    public java.util.Date getRegisteredAt() {
        return this.registeredAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task definition was registered.
     * </p>
     * 
     * @param registeredAt
     *        The Unix timestamp for when the task definition was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withRegisteredAt(java.util.Date registeredAt) {
        setRegisteredAt(registeredAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task definition was deregistered.
     * </p>
     * 
     * @param deregisteredAt
     *        The Unix timestamp for when the task definition was deregistered.
     */

    public void setDeregisteredAt(java.util.Date deregisteredAt) {
        this.deregisteredAt = deregisteredAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task definition was deregistered.
     * </p>
     * 
     * @return The Unix timestamp for when the task definition was deregistered.
     */

    public java.util.Date getDeregisteredAt() {
        return this.deregisteredAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task definition was deregistered.
     * </p>
     * 
     * @param deregisteredAt
     *        The Unix timestamp for when the task definition was deregistered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withDeregisteredAt(java.util.Date deregisteredAt) {
        setDeregisteredAt(deregisteredAt);
        return this;
    }

    /**
     * <p>
     * The principal that registered the task definition.
     * </p>
     * 
     * @param registeredBy
     *        The principal that registered the task definition.
     */

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    /**
     * <p>
     * The principal that registered the task definition.
     * </p>
     * 
     * @return The principal that registered the task definition.
     */

    public String getRegisteredBy() {
        return this.registeredBy;
    }

    /**
     * <p>
     * The principal that registered the task definition.
     * </p>
     * 
     * @param registeredBy
     *        The principal that registered the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withRegisteredBy(String registeredBy) {
        setRegisteredBy(registeredBy);
        return this;
    }

    /**
     * <p>
     * The ephemeral storage settings to use for tasks run with the task definition.
     * </p>
     * 
     * @param ephemeralStorage
     *        The ephemeral storage settings to use for tasks run with the task definition.
     */

    public void setEphemeralStorage(EphemeralStorage ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
    }

    /**
     * <p>
     * The ephemeral storage settings to use for tasks run with the task definition.
     * </p>
     * 
     * @return The ephemeral storage settings to use for tasks run with the task definition.
     */

    public EphemeralStorage getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * <p>
     * The ephemeral storage settings to use for tasks run with the task definition.
     * </p>
     * 
     * @param ephemeralStorage
     *        The ephemeral storage settings to use for tasks run with the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withEphemeralStorage(EphemeralStorage ephemeralStorage) {
        setEphemeralStorage(ephemeralStorage);
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
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: ").append(getTaskDefinitionArn()).append(",");
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: ").append(getContainerDefinitions()).append(",");
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: ").append(getTaskRoleArn()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getNetworkMode() != null)
            sb.append("NetworkMode: ").append(getNetworkMode()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequiresAttributes() != null)
            sb.append("RequiresAttributes: ").append(getRequiresAttributes()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getCompatibilities() != null)
            sb.append("Compatibilities: ").append(getCompatibilities()).append(",");
        if (getRequiresCompatibilities() != null)
            sb.append("RequiresCompatibilities: ").append(getRequiresCompatibilities()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getInferenceAccelerators() != null)
            sb.append("InferenceAccelerators: ").append(getInferenceAccelerators()).append(",");
        if (getPidMode() != null)
            sb.append("PidMode: ").append(getPidMode()).append(",");
        if (getIpcMode() != null)
            sb.append("IpcMode: ").append(getIpcMode()).append(",");
        if (getProxyConfiguration() != null)
            sb.append("ProxyConfiguration: ").append(getProxyConfiguration()).append(",");
        if (getRegisteredAt() != null)
            sb.append("RegisteredAt: ").append(getRegisteredAt()).append(",");
        if (getDeregisteredAt() != null)
            sb.append("DeregisteredAt: ").append(getDeregisteredAt()).append(",");
        if (getRegisteredBy() != null)
            sb.append("RegisteredBy: ").append(getRegisteredBy()).append(",");
        if (getEphemeralStorage() != null)
            sb.append("EphemeralStorage: ").append(getEphemeralStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskDefinition == false)
            return false;
        TaskDefinition other = (TaskDefinition) obj;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getNetworkMode() == null ^ this.getNetworkMode() == null)
            return false;
        if (other.getNetworkMode() != null && other.getNetworkMode().equals(this.getNetworkMode()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequiresAttributes() == null ^ this.getRequiresAttributes() == null)
            return false;
        if (other.getRequiresAttributes() != null && other.getRequiresAttributes().equals(this.getRequiresAttributes()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getCompatibilities() == null ^ this.getCompatibilities() == null)
            return false;
        if (other.getCompatibilities() != null && other.getCompatibilities().equals(this.getCompatibilities()) == false)
            return false;
        if (other.getRequiresCompatibilities() == null ^ this.getRequiresCompatibilities() == null)
            return false;
        if (other.getRequiresCompatibilities() != null && other.getRequiresCompatibilities().equals(this.getRequiresCompatibilities()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getInferenceAccelerators() == null ^ this.getInferenceAccelerators() == null)
            return false;
        if (other.getInferenceAccelerators() != null && other.getInferenceAccelerators().equals(this.getInferenceAccelerators()) == false)
            return false;
        if (other.getPidMode() == null ^ this.getPidMode() == null)
            return false;
        if (other.getPidMode() != null && other.getPidMode().equals(this.getPidMode()) == false)
            return false;
        if (other.getIpcMode() == null ^ this.getIpcMode() == null)
            return false;
        if (other.getIpcMode() != null && other.getIpcMode().equals(this.getIpcMode()) == false)
            return false;
        if (other.getProxyConfiguration() == null ^ this.getProxyConfiguration() == null)
            return false;
        if (other.getProxyConfiguration() != null && other.getProxyConfiguration().equals(this.getProxyConfiguration()) == false)
            return false;
        if (other.getRegisteredAt() == null ^ this.getRegisteredAt() == null)
            return false;
        if (other.getRegisteredAt() != null && other.getRegisteredAt().equals(this.getRegisteredAt()) == false)
            return false;
        if (other.getDeregisteredAt() == null ^ this.getDeregisteredAt() == null)
            return false;
        if (other.getDeregisteredAt() != null && other.getDeregisteredAt().equals(this.getDeregisteredAt()) == false)
            return false;
        if (other.getRegisteredBy() == null ^ this.getRegisteredBy() == null)
            return false;
        if (other.getRegisteredBy() != null && other.getRegisteredBy().equals(this.getRegisteredBy()) == false)
            return false;
        if (other.getEphemeralStorage() == null ^ this.getEphemeralStorage() == null)
            return false;
        if (other.getEphemeralStorage() != null && other.getEphemeralStorage().equals(this.getEphemeralStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkMode() == null) ? 0 : getNetworkMode().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequiresAttributes() == null) ? 0 : getRequiresAttributes().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getCompatibilities() == null) ? 0 : getCompatibilities().hashCode());
        hashCode = prime * hashCode + ((getRequiresCompatibilities() == null) ? 0 : getRequiresCompatibilities().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getInferenceAccelerators() == null) ? 0 : getInferenceAccelerators().hashCode());
        hashCode = prime * hashCode + ((getPidMode() == null) ? 0 : getPidMode().hashCode());
        hashCode = prime * hashCode + ((getIpcMode() == null) ? 0 : getIpcMode().hashCode());
        hashCode = prime * hashCode + ((getProxyConfiguration() == null) ? 0 : getProxyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRegisteredAt() == null) ? 0 : getRegisteredAt().hashCode());
        hashCode = prime * hashCode + ((getDeregisteredAt() == null) ? 0 : getDeregisteredAt().hashCode());
        hashCode = prime * hashCode + ((getRegisteredBy() == null) ? 0 : getRegisteredBy().hashCode());
        hashCode = prime * hashCode + ((getEphemeralStorage() == null) ? 0 : getEphemeralStorage().hashCode());
        return hashCode;
    }

    @Override
    public TaskDefinition clone() {
        try {
            return (TaskDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.TaskDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
