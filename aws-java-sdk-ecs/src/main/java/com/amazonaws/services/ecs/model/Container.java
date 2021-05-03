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
 * A Docker container that is part of a task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Container" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Container implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     */
    private String containerArn;
    /**
     * <p>
     * The ARN of the task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The image used for the container.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The container image manifest digest.
     * </p>
     * <note>
     * <p>
     * The <code>imageDigest</code> is only returned if the container is using an image hosted in Amazon ECR, otherwise
     * it is omitted.
     * </p>
     * </note>
     */
    private String imageDigest;
    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     */
    private String runtimeId;
    /**
     * <p>
     * The last known status of the container.
     * </p>
     */
    private String lastStatus;
    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     */
    private Integer exitCode;
    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkBinding> networkBindings;
    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkInterface> networkInterfaces;
    /**
     * <p>
     * The health status of the container. If health checks are not configured for this container in its task
     * definition, then it reports the health status as <code>UNKNOWN</code>.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * The details of any Amazon ECS managed agents associated with the container.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ManagedAgent> managedAgents;
    /**
     * <p>
     * The number of CPU units set for the container. The value will be <code>0</code> if no value was specified in the
     * container definition when the task definition was registered.
     * </p>
     */
    private String cpu;
    /**
     * <p>
     * The hard limit (in MiB) of memory set for the container.
     * </p>
     */
    private String memory;
    /**
     * <p>
     * The soft limit (in MiB) of memory set for the container.
     * </p>
     */
    private String memoryReservation;
    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> gpuIds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @param containerArn
     *        The Amazon Resource Name (ARN) of the container.
     */

    public void setContainerArn(String containerArn) {
        this.containerArn = containerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container.
     */

    public String getContainerArn() {
        return this.containerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @param containerArn
     *        The Amazon Resource Name (ARN) of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withContainerArn(String containerArn) {
        setContainerArn(containerArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @return The ARN of the task.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     * 
     * @param image
     *        The image used for the container.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     * 
     * @return The image used for the container.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     * 
     * @param image
     *        The image used for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The container image manifest digest.
     * </p>
     * <note>
     * <p>
     * The <code>imageDigest</code> is only returned if the container is using an image hosted in Amazon ECR, otherwise
     * it is omitted.
     * </p>
     * </note>
     * 
     * @param imageDigest
     *        The container image manifest digest.</p> <note>
     *        <p>
     *        The <code>imageDigest</code> is only returned if the container is using an image hosted in Amazon ECR,
     *        otherwise it is omitted.
     *        </p>
     */

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The container image manifest digest.
     * </p>
     * <note>
     * <p>
     * The <code>imageDigest</code> is only returned if the container is using an image hosted in Amazon ECR, otherwise
     * it is omitted.
     * </p>
     * </note>
     * 
     * @return The container image manifest digest.</p> <note>
     *         <p>
     *         The <code>imageDigest</code> is only returned if the container is using an image hosted in Amazon ECR,
     *         otherwise it is omitted.
     *         </p>
     */

    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * <p>
     * The container image manifest digest.
     * </p>
     * <note>
     * <p>
     * The <code>imageDigest</code> is only returned if the container is using an image hosted in Amazon ECR, otherwise
     * it is omitted.
     * </p>
     * </note>
     * 
     * @param imageDigest
     *        The container image manifest digest.</p> <note>
     *        <p>
     *        The <code>imageDigest</code> is only returned if the container is using an image hosted in Amazon ECR,
     *        otherwise it is omitted.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
        return this;
    }

    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     * 
     * @param runtimeId
     *        The ID of the Docker container.
     */

    public void setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
    }

    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     * 
     * @return The ID of the Docker container.
     */

    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     * 
     * @param runtimeId
     *        The ID of the Docker container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withRuntimeId(String runtimeId) {
        setRuntimeId(runtimeId);
        return this;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the container.
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     * 
     * @return The last known status of the container.
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     * 
     * @param exitCode
     *        The exit code returned from the container.
     */

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     * 
     * @return The exit code returned from the container.
     */

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     * 
     * @param exitCode
     *        The exit code returned from the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withExitCode(Integer exitCode) {
        setExitCode(exitCode);
        return this;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) human-readable string to provide additional details about a running or
     *        stopped container.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @return A short (255 max characters) human-readable string to provide additional details about a running or
     *         stopped container.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) human-readable string to provide additional details about a running or
     *        stopped container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     * 
     * @return The network bindings associated with the container.
     */

    public java.util.List<NetworkBinding> getNetworkBindings() {
        if (networkBindings == null) {
            networkBindings = new com.amazonaws.internal.SdkInternalList<NetworkBinding>();
        }
        return networkBindings;
    }

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings associated with the container.
     */

    public void setNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        if (networkBindings == null) {
            this.networkBindings = null;
            return;
        }

        this.networkBindings = new com.amazonaws.internal.SdkInternalList<NetworkBinding>(networkBindings);
    }

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkBindings(java.util.Collection)} or {@link #withNetworkBindings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withNetworkBindings(NetworkBinding... networkBindings) {
        if (this.networkBindings == null) {
            setNetworkBindings(new com.amazonaws.internal.SdkInternalList<NetworkBinding>(networkBindings.length));
        }
        for (NetworkBinding ele : networkBindings) {
            this.networkBindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        setNetworkBindings(networkBindings);
        return this;
    }

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     * 
     * @return The network interfaces associated with the container.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<NetworkInterface>();
        }
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces associated with the container.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured for this container in its task
     * definition, then it reports the health status as <code>UNKNOWN</code>.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the container. If health checks are not configured for this container in its task
     *        definition, then it reports the health status as <code>UNKNOWN</code>.
     * @see HealthStatus
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured for this container in its task
     * definition, then it reports the health status as <code>UNKNOWN</code>.
     * </p>
     * 
     * @return The health status of the container. If health checks are not configured for this container in its task
     *         definition, then it reports the health status as <code>UNKNOWN</code>.
     * @see HealthStatus
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured for this container in its task
     * definition, then it reports the health status as <code>UNKNOWN</code>.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the container. If health checks are not configured for this container in its task
     *        definition, then it reports the health status as <code>UNKNOWN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatus
     */

    public Container withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured for this container in its task
     * definition, then it reports the health status as <code>UNKNOWN</code>.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the container. If health checks are not configured for this container in its task
     *        definition, then it reports the health status as <code>UNKNOWN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatus
     */

    public Container withHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * The details of any Amazon ECS managed agents associated with the container.
     * </p>
     * 
     * @return The details of any Amazon ECS managed agents associated with the container.
     */

    public java.util.List<ManagedAgent> getManagedAgents() {
        if (managedAgents == null) {
            managedAgents = new com.amazonaws.internal.SdkInternalList<ManagedAgent>();
        }
        return managedAgents;
    }

    /**
     * <p>
     * The details of any Amazon ECS managed agents associated with the container.
     * </p>
     * 
     * @param managedAgents
     *        The details of any Amazon ECS managed agents associated with the container.
     */

    public void setManagedAgents(java.util.Collection<ManagedAgent> managedAgents) {
        if (managedAgents == null) {
            this.managedAgents = null;
            return;
        }

        this.managedAgents = new com.amazonaws.internal.SdkInternalList<ManagedAgent>(managedAgents);
    }

    /**
     * <p>
     * The details of any Amazon ECS managed agents associated with the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedAgents(java.util.Collection)} or {@link #withManagedAgents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param managedAgents
     *        The details of any Amazon ECS managed agents associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withManagedAgents(ManagedAgent... managedAgents) {
        if (this.managedAgents == null) {
            setManagedAgents(new com.amazonaws.internal.SdkInternalList<ManagedAgent>(managedAgents.length));
        }
        for (ManagedAgent ele : managedAgents) {
            this.managedAgents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of any Amazon ECS managed agents associated with the container.
     * </p>
     * 
     * @param managedAgents
     *        The details of any Amazon ECS managed agents associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withManagedAgents(java.util.Collection<ManagedAgent> managedAgents) {
        setManagedAgents(managedAgents);
        return this;
    }

    /**
     * <p>
     * The number of CPU units set for the container. The value will be <code>0</code> if no value was specified in the
     * container definition when the task definition was registered.
     * </p>
     * 
     * @param cpu
     *        The number of CPU units set for the container. The value will be <code>0</code> if no value was specified
     *        in the container definition when the task definition was registered.
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units set for the container. The value will be <code>0</code> if no value was specified in the
     * container definition when the task definition was registered.
     * </p>
     * 
     * @return The number of CPU units set for the container. The value will be <code>0</code> if no value was specified
     *         in the container definition when the task definition was registered.
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units set for the container. The value will be <code>0</code> if no value was specified in the
     * container definition when the task definition was registered.
     * </p>
     * 
     * @param cpu
     *        The number of CPU units set for the container. The value will be <code>0</code> if no value was specified
     *        in the container definition when the task definition was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory set for the container.
     * </p>
     * 
     * @param memory
     *        The hard limit (in MiB) of memory set for the container.
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory set for the container.
     * </p>
     * 
     * @return The hard limit (in MiB) of memory set for the container.
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory set for the container.
     * </p>
     * 
     * @param memory
     *        The hard limit (in MiB) of memory set for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory set for the container.
     * </p>
     * 
     * @param memoryReservation
     *        The soft limit (in MiB) of memory set for the container.
     */

    public void setMemoryReservation(String memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory set for the container.
     * </p>
     * 
     * @return The soft limit (in MiB) of memory set for the container.
     */

    public String getMemoryReservation() {
        return this.memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory set for the container.
     * </p>
     * 
     * @param memoryReservation
     *        The soft limit (in MiB) of memory set for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withMemoryReservation(String memoryReservation) {
        setMemoryReservation(memoryReservation);
        return this;
    }

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     * 
     * @return The IDs of each GPU assigned to the container.
     */

    public java.util.List<String> getGpuIds() {
        if (gpuIds == null) {
            gpuIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return gpuIds;
    }

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     * 
     * @param gpuIds
     *        The IDs of each GPU assigned to the container.
     */

    public void setGpuIds(java.util.Collection<String> gpuIds) {
        if (gpuIds == null) {
            this.gpuIds = null;
            return;
        }

        this.gpuIds = new com.amazonaws.internal.SdkInternalList<String>(gpuIds);
    }

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGpuIds(java.util.Collection)} or {@link #withGpuIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gpuIds
     *        The IDs of each GPU assigned to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withGpuIds(String... gpuIds) {
        if (this.gpuIds == null) {
            setGpuIds(new com.amazonaws.internal.SdkInternalList<String>(gpuIds.length));
        }
        for (String ele : gpuIds) {
            this.gpuIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     * 
     * @param gpuIds
     *        The IDs of each GPU assigned to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withGpuIds(java.util.Collection<String> gpuIds) {
        setGpuIds(gpuIds);
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
        if (getContainerArn() != null)
            sb.append("ContainerArn: ").append(getContainerArn()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest()).append(",");
        if (getRuntimeId() != null)
            sb.append("RuntimeId: ").append(getRuntimeId()).append(",");
        if (getLastStatus() != null)
            sb.append("LastStatus: ").append(getLastStatus()).append(",");
        if (getExitCode() != null)
            sb.append("ExitCode: ").append(getExitCode()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getNetworkBindings() != null)
            sb.append("NetworkBindings: ").append(getNetworkBindings()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getManagedAgents() != null)
            sb.append("ManagedAgents: ").append(getManagedAgents()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getMemoryReservation() != null)
            sb.append("MemoryReservation: ").append(getMemoryReservation()).append(",");
        if (getGpuIds() != null)
            sb.append("GpuIds: ").append(getGpuIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Container == false)
            return false;
        Container other = (Container) obj;
        if (other.getContainerArn() == null ^ this.getContainerArn() == null)
            return false;
        if (other.getContainerArn() != null && other.getContainerArn().equals(this.getContainerArn()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getRuntimeId() == null ^ this.getRuntimeId() == null)
            return false;
        if (other.getRuntimeId() != null && other.getRuntimeId().equals(this.getRuntimeId()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getNetworkBindings() == null ^ this.getNetworkBindings() == null)
            return false;
        if (other.getNetworkBindings() != null && other.getNetworkBindings().equals(this.getNetworkBindings()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getManagedAgents() == null ^ this.getManagedAgents() == null)
            return false;
        if (other.getManagedAgents() != null && other.getManagedAgents().equals(this.getManagedAgents()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getMemoryReservation() == null ^ this.getMemoryReservation() == null)
            return false;
        if (other.getMemoryReservation() != null && other.getMemoryReservation().equals(this.getMemoryReservation()) == false)
            return false;
        if (other.getGpuIds() == null ^ this.getGpuIds() == null)
            return false;
        if (other.getGpuIds() != null && other.getGpuIds().equals(this.getGpuIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerArn() == null) ? 0 : getContainerArn().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getRuntimeId() == null) ? 0 : getRuntimeId().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getNetworkBindings() == null) ? 0 : getNetworkBindings().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getManagedAgents() == null) ? 0 : getManagedAgents().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getMemoryReservation() == null) ? 0 : getMemoryReservation().hashCode());
        hashCode = prime * hashCode + ((getGpuIds() == null) ? 0 : getGpuIds().hashCode());
        return hashCode;
    }

    @Override
    public Container clone() {
        try {
            return (Container) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ContainerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
