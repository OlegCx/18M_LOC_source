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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The overrides that should be sent to a container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ContainerOverrides" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerOverrides implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This parameter indicates the number of vCPUs reserved for the container.It overrides the <code>vcpus</code>
     * parameter that's set in the job definition, but doesn't override any vCPU requirement specified in the
     * <code>resourceRequirement</code> structure in the job definition.
     * </p>
     * <p>
     * This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on Fargate
     * resources. For Fargate resources, you can only use <code>resourceRequirement</code>. For EC2 resources, you can
     * use either this parameter or <code>resourceRequirement</code> but not both.
     * </p>
     * <p>
     * This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that run on Fargate resources and shouldn't be provided. For jobs that
     * run on Fargate resources, you must specify the vCPU requirement for the job using
     * <code>resourceRequirements</code>.
     * </p>
     * </note>
     */
    @Deprecated
    private Integer vcpus;
    /**
     * <p>
     * This parameter indicates the amount of memory (in MiB) that's reserved for the job. It overrides the
     * <code>memory</code> parameter set in the job definition, but doesn't override any memory requirement specified in
     * the <code>ResourceRequirement</code> structure in the job definition.
     * </p>
     * <p>
     * This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on Fargate
     * resources. For these resources, use <code>resourceRequirement</code> instead.
     * </p>
     */
    @Deprecated
    private Integer memory;
    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The instance type to use for a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to single-node container jobs or for jobs running on Fargate resources and
     * shouldn't be provided.
     * </p>
     * </note>
     */
    private String instanceType;
    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     */
    private java.util.List<KeyValuePair> environment;
    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     */
    private java.util.List<ResourceRequirement> resourceRequirements;

    /**
     * <p>
     * This parameter indicates the number of vCPUs reserved for the container.It overrides the <code>vcpus</code>
     * parameter that's set in the job definition, but doesn't override any vCPU requirement specified in the
     * <code>resourceRequirement</code> structure in the job definition.
     * </p>
     * <p>
     * This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on Fargate
     * resources. For Fargate resources, you can only use <code>resourceRequirement</code>. For EC2 resources, you can
     * use either this parameter or <code>resourceRequirement</code> but not both.
     * </p>
     * <p>
     * This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that run on Fargate resources and shouldn't be provided. For jobs that
     * run on Fargate resources, you must specify the vCPU requirement for the job using
     * <code>resourceRequirements</code>.
     * </p>
     * </note>
     * 
     * @param vcpus
     *        This parameter indicates the number of vCPUs reserved for the container.It overrides the
     *        <code>vcpus</code> parameter that's set in the job definition, but doesn't override any vCPU requirement
     *        specified in the <code>resourceRequirement</code> structure in the job definition.</p>
     *        <p>
     *        This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on
     *        Fargate resources. For Fargate resources, you can only use <code>resourceRequirement</code>. For EC2
     *        resources, you can use either this parameter or <code>resourceRequirement</code> but not both.
     *        </p>
     *        <p>
     *        This parameter maps to <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that run on Fargate resources and shouldn't be provided. For jobs
     *        that run on Fargate resources, you must specify the vCPU requirement for the job using
     *        <code>resourceRequirements</code>.
     *        </p>
     */
    @Deprecated
    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    /**
     * <p>
     * This parameter indicates the number of vCPUs reserved for the container.It overrides the <code>vcpus</code>
     * parameter that's set in the job definition, but doesn't override any vCPU requirement specified in the
     * <code>resourceRequirement</code> structure in the job definition.
     * </p>
     * <p>
     * This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on Fargate
     * resources. For Fargate resources, you can only use <code>resourceRequirement</code>. For EC2 resources, you can
     * use either this parameter or <code>resourceRequirement</code> but not both.
     * </p>
     * <p>
     * This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that run on Fargate resources and shouldn't be provided. For jobs that
     * run on Fargate resources, you must specify the vCPU requirement for the job using
     * <code>resourceRequirements</code>.
     * </p>
     * </note>
     * 
     * @return This parameter indicates the number of vCPUs reserved for the container.It overrides the
     *         <code>vcpus</code> parameter that's set in the job definition, but doesn't override any vCPU requirement
     *         specified in the <code>resourceRequirement</code> structure in the job definition.</p>
     *         <p>
     *         This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on
     *         Fargate resources. For Fargate resources, you can only use <code>resourceRequirement</code>. For EC2
     *         resources, you can use either this parameter or <code>resourceRequirement</code> but not both.
     *         </p>
     *         <p>
     *         This parameter maps to <code>CpuShares</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that run on Fargate resources and shouldn't be provided. For jobs
     *         that run on Fargate resources, you must specify the vCPU requirement for the job using
     *         <code>resourceRequirements</code>.
     *         </p>
     */
    @Deprecated
    public Integer getVcpus() {
        return this.vcpus;
    }

    /**
     * <p>
     * This parameter indicates the number of vCPUs reserved for the container.It overrides the <code>vcpus</code>
     * parameter that's set in the job definition, but doesn't override any vCPU requirement specified in the
     * <code>resourceRequirement</code> structure in the job definition.
     * </p>
     * <p>
     * This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on Fargate
     * resources. For Fargate resources, you can only use <code>resourceRequirement</code>. For EC2 resources, you can
     * use either this parameter or <code>resourceRequirement</code> but not both.
     * </p>
     * <p>
     * This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that run on Fargate resources and shouldn't be provided. For jobs that
     * run on Fargate resources, you must specify the vCPU requirement for the job using
     * <code>resourceRequirements</code>.
     * </p>
     * </note>
     * 
     * @param vcpus
     *        This parameter indicates the number of vCPUs reserved for the container.It overrides the
     *        <code>vcpus</code> parameter that's set in the job definition, but doesn't override any vCPU requirement
     *        specified in the <code>resourceRequirement</code> structure in the job definition.</p>
     *        <p>
     *        This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on
     *        Fargate resources. For Fargate resources, you can only use <code>resourceRequirement</code>. For EC2
     *        resources, you can use either this parameter or <code>resourceRequirement</code> but not both.
     *        </p>
     *        <p>
     *        This parameter maps to <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that run on Fargate resources and shouldn't be provided. For jobs
     *        that run on Fargate resources, you must specify the vCPU requirement for the job using
     *        <code>resourceRequirements</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ContainerOverrides withVcpus(Integer vcpus) {
        setVcpus(vcpus);
        return this;
    }

    /**
     * <p>
     * This parameter indicates the amount of memory (in MiB) that's reserved for the job. It overrides the
     * <code>memory</code> parameter set in the job definition, but doesn't override any memory requirement specified in
     * the <code>ResourceRequirement</code> structure in the job definition.
     * </p>
     * <p>
     * This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on Fargate
     * resources. For these resources, use <code>resourceRequirement</code> instead.
     * </p>
     * 
     * @param memory
     *        This parameter indicates the amount of memory (in MiB) that's reserved for the job. It overrides the
     *        <code>memory</code> parameter set in the job definition, but doesn't override any memory requirement
     *        specified in the <code>ResourceRequirement</code> structure in the job definition.</p>
     *        <p>
     *        This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on
     *        Fargate resources. For these resources, use <code>resourceRequirement</code> instead.
     */
    @Deprecated
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * This parameter indicates the amount of memory (in MiB) that's reserved for the job. It overrides the
     * <code>memory</code> parameter set in the job definition, but doesn't override any memory requirement specified in
     * the <code>ResourceRequirement</code> structure in the job definition.
     * </p>
     * <p>
     * This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on Fargate
     * resources. For these resources, use <code>resourceRequirement</code> instead.
     * </p>
     * 
     * @return This parameter indicates the amount of memory (in MiB) that's reserved for the job. It overrides the
     *         <code>memory</code> parameter set in the job definition, but doesn't override any memory requirement
     *         specified in the <code>ResourceRequirement</code> structure in the job definition.</p>
     *         <p>
     *         This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on
     *         Fargate resources. For these resources, use <code>resourceRequirement</code> instead.
     */
    @Deprecated
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * This parameter indicates the amount of memory (in MiB) that's reserved for the job. It overrides the
     * <code>memory</code> parameter set in the job definition, but doesn't override any memory requirement specified in
     * the <code>ResourceRequirement</code> structure in the job definition.
     * </p>
     * <p>
     * This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on Fargate
     * resources. For these resources, use <code>resourceRequirement</code> instead.
     * </p>
     * 
     * @param memory
     *        This parameter indicates the amount of memory (in MiB) that's reserved for the job. It overrides the
     *        <code>memory</code> parameter set in the job definition, but doesn't override any memory requirement
     *        specified in the <code>ResourceRequirement</code> structure in the job definition.</p>
     *        <p>
     *        This parameter is supported for jobs that run on EC2 resources, but isn't supported for jobs that run on
     *        Fargate resources. For these resources, use <code>resourceRequirement</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ContainerOverrides withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * 
     * @return The command to send to the container that overrides the default command from the Docker image or the job
     *         definition.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
     *        definition.
     */

    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new java.util.ArrayList<String>(command);
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
     *        definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverrides withCommand(String... command) {
        if (this.command == null) {
            setCommand(new java.util.ArrayList<String>(command.length));
        }
        for (String ele : command) {
            this.command.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
     *        definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverrides withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to single-node container jobs or for jobs running on Fargate resources and
     * shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type to use for a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to single-node container jobs or for jobs running on Fargate resources and
     *        shouldn't be provided.
     *        </p>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to single-node container jobs or for jobs running on Fargate resources and
     * shouldn't be provided.
     * </p>
     * </note>
     * 
     * @return The instance type to use for a multi-node parallel job.</p> <note>
     *         <p>
     *         This parameter isn't applicable to single-node container jobs or for jobs running on Fargate resources
     *         and shouldn't be provided.
     *         </p>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to single-node container jobs or for jobs running on Fargate resources and
     * shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type to use for a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to single-node container jobs or for jobs running on Fargate resources and
     *        shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverrides withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @return The environment variables to send to the container. You can add new environment variables, which are
     *         added to the container at launch, or you can override the existing environment variables from the Docker
     *         image or the job definition.</p> <note>
     *         <p>
     *         Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *         variables that are set by the AWS Batch service.
     *         </p>
     */

    public java.util.List<KeyValuePair> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     */

    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new java.util.ArrayList<KeyValuePair>(environment);
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverrides withEnvironment(KeyValuePair... environment) {
        if (this.environment == null) {
            setEnvironment(new java.util.ArrayList<KeyValuePair>(environment.length));
        }
        for (KeyValuePair ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverrides withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @return The type and amount of resources to assign to a container. This overrides the settings in the job
     *         definition. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     */

    public java.util.List<ResourceRequirement> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. This overrides the settings in the job
     *        definition. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     */

    public void setResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        if (resourceRequirements == null) {
            this.resourceRequirements = null;
            return;
        }

        this.resourceRequirements = new java.util.ArrayList<ResourceRequirement>(resourceRequirements);
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequirements(java.util.Collection)} or {@link #withResourceRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. This overrides the settings in the job
     *        definition. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverrides withResourceRequirements(ResourceRequirement... resourceRequirements) {
        if (this.resourceRequirements == null) {
            setResourceRequirements(new java.util.ArrayList<ResourceRequirement>(resourceRequirements.length));
        }
        for (ResourceRequirement ele : resourceRequirements) {
            this.resourceRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. This overrides the settings in the job
     *        definition. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverrides withResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        setResourceRequirements(resourceRequirements);
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
        if (getVcpus() != null)
            sb.append("Vcpus: ").append(getVcpus()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getResourceRequirements() != null)
            sb.append("ResourceRequirements: ").append(getResourceRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerOverrides == false)
            return false;
        ContainerOverrides other = (ContainerOverrides) obj;
        if (other.getVcpus() == null ^ this.getVcpus() == null)
            return false;
        if (other.getVcpus() != null && other.getVcpus().equals(this.getVcpus()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getResourceRequirements() == null ^ this.getResourceRequirements() == null)
            return false;
        if (other.getResourceRequirements() != null && other.getResourceRequirements().equals(this.getResourceRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVcpus() == null) ? 0 : getVcpus().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public ContainerOverrides clone() {
        try {
            return (ContainerOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ContainerOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
