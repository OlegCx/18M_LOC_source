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
 * Linux-specific modifications that are applied to the container, such as details for device mappings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/LinuxParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinuxParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     */
    private java.util.List<Device> devices;
    /**
     * <p>
     * If true, run an <code>init</code> process inside the container that forwards signals and reaps processes. This
     * parameter maps to the <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25 of the
     * Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     */
    private Boolean initProcessEnabled;
    /**
     * <p>
     * The value for the size (in MiB) of the <code>/dev/shm</code> volume. This parameter maps to the
     * <code>--shm-size</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     */
    private Integer sharedMemorySize;
    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     * <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     */
    private java.util.List<Tmpfs> tmpfs;
    /**
     * <p>
     * The total amount of swap memory (in MiB) a container can use. This parameter is translated to the
     * <code>--memory-swap</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a> where
     * the value is the sum of the container memory plus the <code>maxSwap</code> value. For more information, see <a
     * href="https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details">
     * <code>--memory-swap</code> details</a> in the Docker documentation.
     * </p>
     * <p>
     * If a <code>maxSwap</code> value of <code>0</code> is specified, the container doesn't use swap. Accepted values
     * are <code>0</code> or any positive integer. If the <code>maxSwap</code> parameter is omitted, the container
     * doesn't use the swap configuration for the container instance it is running on. A <code>maxSwap</code> value must
     * be set for the <code>swappiness</code> parameter to be used.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     */
    private Integer maxSwap;
    /**
     * <p>
     * This allows you to tune a container's memory swappiness behavior. A <code>swappiness</code> value of
     * <code>0</code> causes swapping not to happen unless absolutely necessary. A <code>swappiness</code> value of
     * <code>100</code> causes pages to be swapped very aggressively. Accepted values are whole numbers between
     * <code>0</code> and <code>100</code>. If the <code>swappiness</code> parameter isn't specified, a default value of
     * <code>60</code> is used. If a value isn't specified for <code>maxSwap</code> then this parameter is ignored. If
     * <code>maxSwap</code> is set to 0, the container doesn't use swap. This parameter maps to the
     * <code>--memory-swappiness</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     * run</a>.
     * </p>
     * <p>
     * Consider the following when you use a per-container swap configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Swap space must be enabled and allocated on the container instance for the containers to use.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS optimized AMIs don't have swap enabled by default. You must enable swap on the instance to use
     * this feature. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html">Instance Store Swap
     * Volumes</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> or <a
     * href="http://aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/">How do I allocate memory to
     * work as swap space in an Amazon EC2 instance by using a swap file?</a>
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The swap space parameters are only supported for job definitions using EC2 resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>maxSwap</code> and <code>swappiness</code> parameters are omitted from a job definition, each
     * container will have a default <code>swappiness</code> value of 60, and the total swap usage will be limited to
     * two times the memory reservation of the container.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     */
    private Integer swappiness;

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @return Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code>
     *         option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *         </p>
     */

    public java.util.List<Device> getDevices() {
        return devices;
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param devices
     *        Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     */

    public void setDevices(java.util.Collection<Device> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<Device>(devices);
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withDevices(Device... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<Device>(devices.length));
        }
        for (Device ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param devices
     *        Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withDevices(java.util.Collection<Device> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * If true, run an <code>init</code> process inside the container that forwards signals and reaps processes. This
     * parameter maps to the <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25 of the
     * Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param initProcessEnabled
     *        If true, run an <code>init</code> process inside the container that forwards signals and reaps processes.
     *        This parameter maps to the <code>--init</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25
     *        of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on
     *        your container instance, log into your container instance and run the following command:
     *        <code>sudo docker version | grep "Server API version"</code>
     */

    public void setInitProcessEnabled(Boolean initProcessEnabled) {
        this.initProcessEnabled = initProcessEnabled;
    }

    /**
     * <p>
     * If true, run an <code>init</code> process inside the container that forwards signals and reaps processes. This
     * parameter maps to the <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25 of the
     * Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @return If true, run an <code>init</code> process inside the container that forwards signals and reaps processes.
     *         This parameter maps to the <code>--init</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25
     *         of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on
     *         your container instance, log into your container instance and run the following command:
     *         <code>sudo docker version | grep "Server API version"</code>
     */

    public Boolean getInitProcessEnabled() {
        return this.initProcessEnabled;
    }

    /**
     * <p>
     * If true, run an <code>init</code> process inside the container that forwards signals and reaps processes. This
     * parameter maps to the <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25 of the
     * Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param initProcessEnabled
     *        If true, run an <code>init</code> process inside the container that forwards signals and reaps processes.
     *        This parameter maps to the <code>--init</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25
     *        of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on
     *        your container instance, log into your container instance and run the following command:
     *        <code>sudo docker version | grep "Server API version"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withInitProcessEnabled(Boolean initProcessEnabled) {
        setInitProcessEnabled(initProcessEnabled);
        return this;
    }

    /**
     * <p>
     * If true, run an <code>init</code> process inside the container that forwards signals and reaps processes. This
     * parameter maps to the <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25 of the
     * Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @return If true, run an <code>init</code> process inside the container that forwards signals and reaps processes.
     *         This parameter maps to the <code>--init</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.25
     *         of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on
     *         your container instance, log into your container instance and run the following command:
     *         <code>sudo docker version | grep "Server API version"</code>
     */

    public Boolean isInitProcessEnabled() {
        return this.initProcessEnabled;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <code>/dev/shm</code> volume. This parameter maps to the
     * <code>--shm-size</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param sharedMemorySize
     *        The value for the size (in MiB) of the <code>/dev/shm</code> volume. This parameter maps to the
     *        <code>--shm-size</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     */

    public void setSharedMemorySize(Integer sharedMemorySize) {
        this.sharedMemorySize = sharedMemorySize;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <code>/dev/shm</code> volume. This parameter maps to the
     * <code>--shm-size</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @return The value for the size (in MiB) of the <code>/dev/shm</code> volume. This parameter maps to the
     *         <code>--shm-size</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *         </p>
     */

    public Integer getSharedMemorySize() {
        return this.sharedMemorySize;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <code>/dev/shm</code> volume. This parameter maps to the
     * <code>--shm-size</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param sharedMemorySize
     *        The value for the size (in MiB) of the <code>/dev/shm</code> volume. This parameter maps to the
     *        <code>--shm-size</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withSharedMemorySize(Integer sharedMemorySize) {
        setSharedMemorySize(sharedMemorySize);
        return this;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     * <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @return The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     *         <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *         </p>
     */

    public java.util.List<Tmpfs> getTmpfs() {
        return tmpfs;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     * <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param tmpfs
     *        The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     *        <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     */

    public void setTmpfs(java.util.Collection<Tmpfs> tmpfs) {
        if (tmpfs == null) {
            this.tmpfs = null;
            return;
        }

        this.tmpfs = new java.util.ArrayList<Tmpfs>(tmpfs);
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     * <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTmpfs(java.util.Collection)} or {@link #withTmpfs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tmpfs
     *        The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     *        <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withTmpfs(Tmpfs... tmpfs) {
        if (this.tmpfs == null) {
            setTmpfs(new java.util.ArrayList<Tmpfs>(tmpfs.length));
        }
        for (Tmpfs ele : tmpfs) {
            this.tmpfs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     * <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param tmpfs
     *        The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the
     *        <code>--tmpfs</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withTmpfs(java.util.Collection<Tmpfs> tmpfs) {
        setTmpfs(tmpfs);
        return this;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) a container can use. This parameter is translated to the
     * <code>--memory-swap</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a> where
     * the value is the sum of the container memory plus the <code>maxSwap</code> value. For more information, see <a
     * href="https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details">
     * <code>--memory-swap</code> details</a> in the Docker documentation.
     * </p>
     * <p>
     * If a <code>maxSwap</code> value of <code>0</code> is specified, the container doesn't use swap. Accepted values
     * are <code>0</code> or any positive integer. If the <code>maxSwap</code> parameter is omitted, the container
     * doesn't use the swap configuration for the container instance it is running on. A <code>maxSwap</code> value must
     * be set for the <code>swappiness</code> parameter to be used.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param maxSwap
     *        The total amount of swap memory (in MiB) a container can use. This parameter is translated to the
     *        <code>--memory-swap</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a> where the value is the sum of the container memory plus the <code>maxSwap</code> value. For more
     *        information, see <a
     *        href="https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details">
     *        <code>--memory-swap</code> details</a> in the Docker documentation.</p>
     *        <p>
     *        If a <code>maxSwap</code> value of <code>0</code> is specified, the container doesn't use swap. Accepted
     *        values are <code>0</code> or any positive integer. If the <code>maxSwap</code> parameter is omitted, the
     *        container doesn't use the swap configuration for the container instance it is running on. A
     *        <code>maxSwap</code> value must be set for the <code>swappiness</code> parameter to be used.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     */

    public void setMaxSwap(Integer maxSwap) {
        this.maxSwap = maxSwap;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) a container can use. This parameter is translated to the
     * <code>--memory-swap</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a> where
     * the value is the sum of the container memory plus the <code>maxSwap</code> value. For more information, see <a
     * href="https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details">
     * <code>--memory-swap</code> details</a> in the Docker documentation.
     * </p>
     * <p>
     * If a <code>maxSwap</code> value of <code>0</code> is specified, the container doesn't use swap. Accepted values
     * are <code>0</code> or any positive integer. If the <code>maxSwap</code> parameter is omitted, the container
     * doesn't use the swap configuration for the container instance it is running on. A <code>maxSwap</code> value must
     * be set for the <code>swappiness</code> parameter to be used.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @return The total amount of swap memory (in MiB) a container can use. This parameter is translated to the
     *         <code>--memory-swap</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a> where the value is the sum of the container memory plus the <code>maxSwap</code> value. For more
     *         information, see <a
     *         href="https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details">
     *         <code>--memory-swap</code> details</a> in the Docker documentation.</p>
     *         <p>
     *         If a <code>maxSwap</code> value of <code>0</code> is specified, the container doesn't use swap. Accepted
     *         values are <code>0</code> or any positive integer. If the <code>maxSwap</code> parameter is omitted, the
     *         container doesn't use the swap configuration for the container instance it is running on. A
     *         <code>maxSwap</code> value must be set for the <code>swappiness</code> parameter to be used.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *         </p>
     */

    public Integer getMaxSwap() {
        return this.maxSwap;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) a container can use. This parameter is translated to the
     * <code>--memory-swap</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a> where
     * the value is the sum of the container memory plus the <code>maxSwap</code> value. For more information, see <a
     * href="https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details">
     * <code>--memory-swap</code> details</a> in the Docker documentation.
     * </p>
     * <p>
     * If a <code>maxSwap</code> value of <code>0</code> is specified, the container doesn't use swap. Accepted values
     * are <code>0</code> or any positive integer. If the <code>maxSwap</code> parameter is omitted, the container
     * doesn't use the swap configuration for the container instance it is running on. A <code>maxSwap</code> value must
     * be set for the <code>swappiness</code> parameter to be used.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param maxSwap
     *        The total amount of swap memory (in MiB) a container can use. This parameter is translated to the
     *        <code>--memory-swap</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a> where the value is the sum of the container memory plus the <code>maxSwap</code> value. For more
     *        information, see <a
     *        href="https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details">
     *        <code>--memory-swap</code> details</a> in the Docker documentation.</p>
     *        <p>
     *        If a <code>maxSwap</code> value of <code>0</code> is specified, the container doesn't use swap. Accepted
     *        values are <code>0</code> or any positive integer. If the <code>maxSwap</code> parameter is omitted, the
     *        container doesn't use the swap configuration for the container instance it is running on. A
     *        <code>maxSwap</code> value must be set for the <code>swappiness</code> parameter to be used.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withMaxSwap(Integer maxSwap) {
        setMaxSwap(maxSwap);
        return this;
    }

    /**
     * <p>
     * This allows you to tune a container's memory swappiness behavior. A <code>swappiness</code> value of
     * <code>0</code> causes swapping not to happen unless absolutely necessary. A <code>swappiness</code> value of
     * <code>100</code> causes pages to be swapped very aggressively. Accepted values are whole numbers between
     * <code>0</code> and <code>100</code>. If the <code>swappiness</code> parameter isn't specified, a default value of
     * <code>60</code> is used. If a value isn't specified for <code>maxSwap</code> then this parameter is ignored. If
     * <code>maxSwap</code> is set to 0, the container doesn't use swap. This parameter maps to the
     * <code>--memory-swappiness</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     * run</a>.
     * </p>
     * <p>
     * Consider the following when you use a per-container swap configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Swap space must be enabled and allocated on the container instance for the containers to use.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS optimized AMIs don't have swap enabled by default. You must enable swap on the instance to use
     * this feature. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html">Instance Store Swap
     * Volumes</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> or <a
     * href="http://aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/">How do I allocate memory to
     * work as swap space in an Amazon EC2 instance by using a swap file?</a>
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The swap space parameters are only supported for job definitions using EC2 resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>maxSwap</code> and <code>swappiness</code> parameters are omitted from a job definition, each
     * container will have a default <code>swappiness</code> value of 60, and the total swap usage will be limited to
     * two times the memory reservation of the container.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param swappiness
     *        This allows you to tune a container's memory swappiness behavior. A <code>swappiness</code> value of
     *        <code>0</code> causes swapping not to happen unless absolutely necessary. A <code>swappiness</code> value
     *        of <code>100</code> causes pages to be swapped very aggressively. Accepted values are whole numbers
     *        between <code>0</code> and <code>100</code>. If the <code>swappiness</code> parameter isn't specified, a
     *        default value of <code>60</code> is used. If a value isn't specified for <code>maxSwap</code> then this
     *        parameter is ignored. If <code>maxSwap</code> is set to 0, the container doesn't use swap. This parameter
     *        maps to the <code>--memory-swappiness</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <p>
     *        Consider the following when you use a per-container swap configuration.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Swap space must be enabled and allocated on the container instance for the containers to use.
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS optimized AMIs don't have swap enabled by default. You must enable swap on the instance to
     *        use this feature. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html">Instance Store
     *        Swap Volumes</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> or <a
     *        href="http://aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/">How do I allocate
     *        memory to work as swap space in an Amazon EC2 instance by using a swap file?</a>
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        The swap space parameters are only supported for job definitions using EC2 resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>maxSwap</code> and <code>swappiness</code> parameters are omitted from a job definition, each
     *        container will have a default <code>swappiness</code> value of 60, and the total swap usage will be
     *        limited to two times the memory reservation of the container.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     */

    public void setSwappiness(Integer swappiness) {
        this.swappiness = swappiness;
    }

    /**
     * <p>
     * This allows you to tune a container's memory swappiness behavior. A <code>swappiness</code> value of
     * <code>0</code> causes swapping not to happen unless absolutely necessary. A <code>swappiness</code> value of
     * <code>100</code> causes pages to be swapped very aggressively. Accepted values are whole numbers between
     * <code>0</code> and <code>100</code>. If the <code>swappiness</code> parameter isn't specified, a default value of
     * <code>60</code> is used. If a value isn't specified for <code>maxSwap</code> then this parameter is ignored. If
     * <code>maxSwap</code> is set to 0, the container doesn't use swap. This parameter maps to the
     * <code>--memory-swappiness</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     * run</a>.
     * </p>
     * <p>
     * Consider the following when you use a per-container swap configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Swap space must be enabled and allocated on the container instance for the containers to use.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS optimized AMIs don't have swap enabled by default. You must enable swap on the instance to use
     * this feature. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html">Instance Store Swap
     * Volumes</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> or <a
     * href="http://aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/">How do I allocate memory to
     * work as swap space in an Amazon EC2 instance by using a swap file?</a>
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The swap space parameters are only supported for job definitions using EC2 resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>maxSwap</code> and <code>swappiness</code> parameters are omitted from a job definition, each
     * container will have a default <code>swappiness</code> value of 60, and the total swap usage will be limited to
     * two times the memory reservation of the container.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @return This allows you to tune a container's memory swappiness behavior. A <code>swappiness</code> value of
     *         <code>0</code> causes swapping not to happen unless absolutely necessary. A <code>swappiness</code> value
     *         of <code>100</code> causes pages to be swapped very aggressively. Accepted values are whole numbers
     *         between <code>0</code> and <code>100</code>. If the <code>swappiness</code> parameter isn't specified, a
     *         default value of <code>60</code> is used. If a value isn't specified for <code>maxSwap</code> then this
     *         parameter is ignored. If <code>maxSwap</code> is set to 0, the container doesn't use swap. This parameter
     *         maps to the <code>--memory-swappiness</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *         <p>
     *         Consider the following when you use a per-container swap configuration.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Swap space must be enabled and allocated on the container instance for the containers to use.
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon ECS optimized AMIs don't have swap enabled by default. You must enable swap on the instance to
     *         use this feature. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html">Instance
     *         Store Swap Volumes</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> or <a
     *         href="http://aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/">How do I allocate
     *         memory to work as swap space in an Amazon EC2 instance by using a swap file?</a>
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         The swap space parameters are only supported for job definitions using EC2 resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the <code>maxSwap</code> and <code>swappiness</code> parameters are omitted from a job definition,
     *         each container will have a default <code>swappiness</code> value of 60, and the total swap usage will be
     *         limited to two times the memory reservation of the container.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *         </p>
     */

    public Integer getSwappiness() {
        return this.swappiness;
    }

    /**
     * <p>
     * This allows you to tune a container's memory swappiness behavior. A <code>swappiness</code> value of
     * <code>0</code> causes swapping not to happen unless absolutely necessary. A <code>swappiness</code> value of
     * <code>100</code> causes pages to be swapped very aggressively. Accepted values are whole numbers between
     * <code>0</code> and <code>100</code>. If the <code>swappiness</code> parameter isn't specified, a default value of
     * <code>60</code> is used. If a value isn't specified for <code>maxSwap</code> then this parameter is ignored. If
     * <code>maxSwap</code> is set to 0, the container doesn't use swap. This parameter maps to the
     * <code>--memory-swappiness</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     * run</a>.
     * </p>
     * <p>
     * Consider the following when you use a per-container swap configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Swap space must be enabled and allocated on the container instance for the containers to use.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS optimized AMIs don't have swap enabled by default. You must enable swap on the instance to use
     * this feature. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html">Instance Store Swap
     * Volumes</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> or <a
     * href="http://aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/">How do I allocate memory to
     * work as swap space in an Amazon EC2 instance by using a swap file?</a>
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The swap space parameters are only supported for job definitions using EC2 resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>maxSwap</code> and <code>swappiness</code> parameters are omitted from a job definition, each
     * container will have a default <code>swappiness</code> value of 60, and the total swap usage will be limited to
     * two times the memory reservation of the container.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param swappiness
     *        This allows you to tune a container's memory swappiness behavior. A <code>swappiness</code> value of
     *        <code>0</code> causes swapping not to happen unless absolutely necessary. A <code>swappiness</code> value
     *        of <code>100</code> causes pages to be swapped very aggressively. Accepted values are whole numbers
     *        between <code>0</code> and <code>100</code>. If the <code>swappiness</code> parameter isn't specified, a
     *        default value of <code>60</code> is used. If a value isn't specified for <code>maxSwap</code> then this
     *        parameter is ignored. If <code>maxSwap</code> is set to 0, the container doesn't use swap. This parameter
     *        maps to the <code>--memory-swappiness</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <p>
     *        Consider the following when you use a per-container swap configuration.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Swap space must be enabled and allocated on the container instance for the containers to use.
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS optimized AMIs don't have swap enabled by default. You must enable swap on the instance to
     *        use this feature. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html">Instance Store
     *        Swap Volumes</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> or <a
     *        href="http://aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/">How do I allocate
     *        memory to work as swap space in an Amazon EC2 instance by using a swap file?</a>
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        The swap space parameters are only supported for job definitions using EC2 resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>maxSwap</code> and <code>swappiness</code> parameters are omitted from a job definition, each
     *        container will have a default <code>swappiness</code> value of 60, and the total swap usage will be
     *        limited to two times the memory reservation of the container.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withSwappiness(Integer swappiness) {
        setSwappiness(swappiness);
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
        if (getDevices() != null)
            sb.append("Devices: ").append(getDevices()).append(",");
        if (getInitProcessEnabled() != null)
            sb.append("InitProcessEnabled: ").append(getInitProcessEnabled()).append(",");
        if (getSharedMemorySize() != null)
            sb.append("SharedMemorySize: ").append(getSharedMemorySize()).append(",");
        if (getTmpfs() != null)
            sb.append("Tmpfs: ").append(getTmpfs()).append(",");
        if (getMaxSwap() != null)
            sb.append("MaxSwap: ").append(getMaxSwap()).append(",");
        if (getSwappiness() != null)
            sb.append("Swappiness: ").append(getSwappiness());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinuxParameters == false)
            return false;
        LinuxParameters other = (LinuxParameters) obj;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getInitProcessEnabled() == null ^ this.getInitProcessEnabled() == null)
            return false;
        if (other.getInitProcessEnabled() != null && other.getInitProcessEnabled().equals(this.getInitProcessEnabled()) == false)
            return false;
        if (other.getSharedMemorySize() == null ^ this.getSharedMemorySize() == null)
            return false;
        if (other.getSharedMemorySize() != null && other.getSharedMemorySize().equals(this.getSharedMemorySize()) == false)
            return false;
        if (other.getTmpfs() == null ^ this.getTmpfs() == null)
            return false;
        if (other.getTmpfs() != null && other.getTmpfs().equals(this.getTmpfs()) == false)
            return false;
        if (other.getMaxSwap() == null ^ this.getMaxSwap() == null)
            return false;
        if (other.getMaxSwap() != null && other.getMaxSwap().equals(this.getMaxSwap()) == false)
            return false;
        if (other.getSwappiness() == null ^ this.getSwappiness() == null)
            return false;
        if (other.getSwappiness() != null && other.getSwappiness().equals(this.getSwappiness()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode + ((getInitProcessEnabled() == null) ? 0 : getInitProcessEnabled().hashCode());
        hashCode = prime * hashCode + ((getSharedMemorySize() == null) ? 0 : getSharedMemorySize().hashCode());
        hashCode = prime * hashCode + ((getTmpfs() == null) ? 0 : getTmpfs().hashCode());
        hashCode = prime * hashCode + ((getMaxSwap() == null) ? 0 : getMaxSwap().hashCode());
        hashCode = prime * hashCode + ((getSwappiness() == null) ? 0 : getSwappiness().hashCode());
        return hashCode;
    }

    @Override
    public LinuxParameters clone() {
        try {
            return (LinuxParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.LinuxParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
