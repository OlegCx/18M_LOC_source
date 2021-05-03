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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed
 * training, you specify more than one instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the resources in a cluster used to run the processing job.
     * </p>
     */
    private ProcessingClusterConfig clusterConfig;

    /**
     * <p>
     * The configuration for the resources in a cluster used to run the processing job.
     * </p>
     * 
     * @param clusterConfig
     *        The configuration for the resources in a cluster used to run the processing job.
     */

    public void setClusterConfig(ProcessingClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * The configuration for the resources in a cluster used to run the processing job.
     * </p>
     * 
     * @return The configuration for the resources in a cluster used to run the processing job.
     */

    public ProcessingClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * The configuration for the resources in a cluster used to run the processing job.
     * </p>
     * 
     * @param clusterConfig
     *        The configuration for the resources in a cluster used to run the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingResources withClusterConfig(ProcessingClusterConfig clusterConfig) {
        setClusterConfig(clusterConfig);
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
        if (getClusterConfig() != null)
            sb.append("ClusterConfig: ").append(getClusterConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingResources == false)
            return false;
        ProcessingResources other = (ProcessingResources) obj;
        if (other.getClusterConfig() == null ^ this.getClusterConfig() == null)
            return false;
        if (other.getClusterConfig() != null && other.getClusterConfig().equals(this.getClusterConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterConfig() == null) ? 0 : getClusterConfig().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingResources clone() {
        try {
            return (ProcessingResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingResourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
