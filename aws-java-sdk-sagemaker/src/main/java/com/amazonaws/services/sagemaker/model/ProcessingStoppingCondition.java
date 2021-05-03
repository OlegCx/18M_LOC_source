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
 * Configures conditions under which the processing job should be stopped, such as how long the processing job has been
 * running. After the condition is met, the processing job is stopped.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingStoppingCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingStoppingCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the maximum runtime in seconds.
     * </p>
     */
    private Integer maxRuntimeInSeconds;

    /**
     * <p>
     * Specifies the maximum runtime in seconds.
     * </p>
     * 
     * @param maxRuntimeInSeconds
     *        Specifies the maximum runtime in seconds.
     */

    public void setMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = maxRuntimeInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum runtime in seconds.
     * </p>
     * 
     * @return Specifies the maximum runtime in seconds.
     */

    public Integer getMaxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum runtime in seconds.
     * </p>
     * 
     * @param maxRuntimeInSeconds
     *        Specifies the maximum runtime in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingStoppingCondition withMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        setMaxRuntimeInSeconds(maxRuntimeInSeconds);
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
        if (getMaxRuntimeInSeconds() != null)
            sb.append("MaxRuntimeInSeconds: ").append(getMaxRuntimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingStoppingCondition == false)
            return false;
        ProcessingStoppingCondition other = (ProcessingStoppingCondition) obj;
        if (other.getMaxRuntimeInSeconds() == null ^ this.getMaxRuntimeInSeconds() == null)
            return false;
        if (other.getMaxRuntimeInSeconds() != null && other.getMaxRuntimeInSeconds().equals(this.getMaxRuntimeInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxRuntimeInSeconds() == null) ? 0 : getMaxRuntimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingStoppingCondition clone() {
        try {
            return (ProcessingStoppingCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingStoppingConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
