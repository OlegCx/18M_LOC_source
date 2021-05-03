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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateContainerAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContainerAgentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The container instance for which the container agent was updated.
     * </p>
     */
    private ContainerInstance containerInstance;

    /**
     * <p>
     * The container instance for which the container agent was updated.
     * </p>
     * 
     * @param containerInstance
     *        The container instance for which the container agent was updated.
     */

    public void setContainerInstance(ContainerInstance containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance for which the container agent was updated.
     * </p>
     * 
     * @return The container instance for which the container agent was updated.
     */

    public ContainerInstance getContainerInstance() {
        return this.containerInstance;
    }

    /**
     * <p>
     * The container instance for which the container agent was updated.
     * </p>
     * 
     * @param containerInstance
     *        The container instance for which the container agent was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerAgentResult withContainerInstance(ContainerInstance containerInstance) {
        setContainerInstance(containerInstance);
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
        if (getContainerInstance() != null)
            sb.append("ContainerInstance: ").append(getContainerInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContainerAgentResult == false)
            return false;
        UpdateContainerAgentResult other = (UpdateContainerAgentResult) obj;
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContainerAgentResult clone() {
        try {
            return (UpdateContainerAgentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
