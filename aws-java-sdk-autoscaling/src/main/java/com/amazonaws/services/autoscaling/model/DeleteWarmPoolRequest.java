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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteWarmPool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWarmPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * Specifies that the warm pool is to be deleted along with all instances associated with the warm pool, without
     * waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle actions
     * associated with the warm pool instances.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWarmPoolRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies that the warm pool is to be deleted along with all instances associated with the warm pool, without
     * waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle actions
     * associated with the warm pool instances.
     * </p>
     * 
     * @param forceDelete
     *        Specifies that the warm pool is to be deleted along with all instances associated with the warm pool,
     *        without waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle
     *        actions associated with the warm pool instances.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Specifies that the warm pool is to be deleted along with all instances associated with the warm pool, without
     * waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle actions
     * associated with the warm pool instances.
     * </p>
     * 
     * @return Specifies that the warm pool is to be deleted along with all instances associated with the warm pool,
     *         without waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle
     *         actions associated with the warm pool instances.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * Specifies that the warm pool is to be deleted along with all instances associated with the warm pool, without
     * waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle actions
     * associated with the warm pool instances.
     * </p>
     * 
     * @param forceDelete
     *        Specifies that the warm pool is to be deleted along with all instances associated with the warm pool,
     *        without waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle
     *        actions associated with the warm pool instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWarmPoolRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * Specifies that the warm pool is to be deleted along with all instances associated with the warm pool, without
     * waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle actions
     * associated with the warm pool instances.
     * </p>
     * 
     * @return Specifies that the warm pool is to be deleted along with all instances associated with the warm pool,
     *         without waiting for all instances to be terminated. This parameter also deletes any outstanding lifecycle
     *         actions associated with the warm pool instances.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWarmPoolRequest == false)
            return false;
        DeleteWarmPoolRequest other = (DeleteWarmPoolRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWarmPoolRequest clone() {
        return (DeleteWarmPoolRequest) super.clone();
    }

}
