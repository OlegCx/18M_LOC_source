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
 * A data volume used in a job's container properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/Volume" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Volume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container
     * instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for
     * your data volume. However, the data isn't guaranteed to persist after the containers associated with it stop
     * running.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     */
    private Host host;
    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * This parameter is specified when you are using an Amazon Elastic File System file system for job storage. Jobs
     * running on Fargate resources must specify a <code>platformVersion</code> of at least <code>1.4.0</code>.
     * </p>
     */
    private EFSVolumeConfiguration efsVolumeConfiguration;

    /**
     * <p>
     * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container
     * instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for
     * your data volume. However, the data isn't guaranteed to persist after the containers associated with it stop
     * running.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param host
     *        The contents of the <code>host</code> parameter determine whether your data volume persists on the host
     *        container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns
     *        a host path for your data volume. However, the data isn't guaranteed to persist after the containers
     *        associated with it stop running.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     */

    public void setHost(Host host) {
        this.host = host;
    }

    /**
     * <p>
     * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container
     * instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for
     * your data volume. However, the data isn't guaranteed to persist after the containers associated with it stop
     * running.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @return The contents of the <code>host</code> parameter determine whether your data volume persists on the host
     *         container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns
     *         a host path for your data volume. However, the data isn't guaranteed to persist after the containers
     *         associated with it stop running.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *         </p>
     */

    public Host getHost() {
        return this.host;
    }

    /**
     * <p>
     * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container
     * instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for
     * your data volume. However, the data isn't guaranteed to persist after the containers associated with it stop
     * running.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param host
     *        The contents of the <code>host</code> parameter determine whether your data volume persists on the host
     *        container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns
     *        a host path for your data volume. However, the data isn't guaranteed to persist after the containers
     *        associated with it stop running.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withHost(Host host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @param name
     *        The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *        allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *        <code>mountPoints</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @return The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *         <code>mountPoints</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @param name
     *        The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *        allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *        <code>mountPoints</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * This parameter is specified when you are using an Amazon Elastic File System file system for job storage. Jobs
     * running on Fargate resources must specify a <code>platformVersion</code> of at least <code>1.4.0</code>.
     * </p>
     * 
     * @param efsVolumeConfiguration
     *        This parameter is specified when you are using an Amazon Elastic File System file system for job storage.
     *        Jobs running on Fargate resources must specify a <code>platformVersion</code> of at least
     *        <code>1.4.0</code>.
     */

    public void setEfsVolumeConfiguration(EFSVolumeConfiguration efsVolumeConfiguration) {
        this.efsVolumeConfiguration = efsVolumeConfiguration;
    }

    /**
     * <p>
     * This parameter is specified when you are using an Amazon Elastic File System file system for job storage. Jobs
     * running on Fargate resources must specify a <code>platformVersion</code> of at least <code>1.4.0</code>.
     * </p>
     * 
     * @return This parameter is specified when you are using an Amazon Elastic File System file system for job storage.
     *         Jobs running on Fargate resources must specify a <code>platformVersion</code> of at least
     *         <code>1.4.0</code>.
     */

    public EFSVolumeConfiguration getEfsVolumeConfiguration() {
        return this.efsVolumeConfiguration;
    }

    /**
     * <p>
     * This parameter is specified when you are using an Amazon Elastic File System file system for job storage. Jobs
     * running on Fargate resources must specify a <code>platformVersion</code> of at least <code>1.4.0</code>.
     * </p>
     * 
     * @param efsVolumeConfiguration
     *        This parameter is specified when you are using an Amazon Elastic File System file system for job storage.
     *        Jobs running on Fargate resources must specify a <code>platformVersion</code> of at least
     *        <code>1.4.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withEfsVolumeConfiguration(EFSVolumeConfiguration efsVolumeConfiguration) {
        setEfsVolumeConfiguration(efsVolumeConfiguration);
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
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEfsVolumeConfiguration() != null)
            sb.append("EfsVolumeConfiguration: ").append(getEfsVolumeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Volume == false)
            return false;
        Volume other = (Volume) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEfsVolumeConfiguration() == null ^ this.getEfsVolumeConfiguration() == null)
            return false;
        if (other.getEfsVolumeConfiguration() != null && other.getEfsVolumeConfiguration().equals(this.getEfsVolumeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEfsVolumeConfiguration() == null) ? 0 : getEfsVolumeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Volume clone() {
        try {
            return (Volume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.VolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
