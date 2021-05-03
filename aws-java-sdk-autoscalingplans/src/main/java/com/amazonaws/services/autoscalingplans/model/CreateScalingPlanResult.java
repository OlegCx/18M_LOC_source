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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/CreateScalingPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScalingPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The version number of the scaling plan. This value is always <code>1</code>. Currently, you cannot have multiple
     * scaling plan versions.
     * </p>
     */
    private Long scalingPlanVersion;

    /**
     * <p>
     * The version number of the scaling plan. This value is always <code>1</code>. Currently, you cannot have multiple
     * scaling plan versions.
     * </p>
     * 
     * @param scalingPlanVersion
     *        The version number of the scaling plan. This value is always <code>1</code>. Currently, you cannot have
     *        multiple scaling plan versions.
     */

    public void setScalingPlanVersion(Long scalingPlanVersion) {
        this.scalingPlanVersion = scalingPlanVersion;
    }

    /**
     * <p>
     * The version number of the scaling plan. This value is always <code>1</code>. Currently, you cannot have multiple
     * scaling plan versions.
     * </p>
     * 
     * @return The version number of the scaling plan. This value is always <code>1</code>. Currently, you cannot have
     *         multiple scaling plan versions.
     */

    public Long getScalingPlanVersion() {
        return this.scalingPlanVersion;
    }

    /**
     * <p>
     * The version number of the scaling plan. This value is always <code>1</code>. Currently, you cannot have multiple
     * scaling plan versions.
     * </p>
     * 
     * @param scalingPlanVersion
     *        The version number of the scaling plan. This value is always <code>1</code>. Currently, you cannot have
     *        multiple scaling plan versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScalingPlanResult withScalingPlanVersion(Long scalingPlanVersion) {
        setScalingPlanVersion(scalingPlanVersion);
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
        if (getScalingPlanVersion() != null)
            sb.append("ScalingPlanVersion: ").append(getScalingPlanVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScalingPlanResult == false)
            return false;
        CreateScalingPlanResult other = (CreateScalingPlanResult) obj;
        if (other.getScalingPlanVersion() == null ^ this.getScalingPlanVersion() == null)
            return false;
        if (other.getScalingPlanVersion() != null && other.getScalingPlanVersion().equals(this.getScalingPlanVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingPlanVersion() == null) ? 0 : getScalingPlanVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateScalingPlanResult clone() {
        try {
            return (CreateScalingPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
