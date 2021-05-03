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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateCapacityProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCapacityProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the capacity provider to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An object representing the parameters to update for the Auto Scaling group capacity provider.
     * </p>
     */
    private AutoScalingGroupProviderUpdate autoScalingGroupProvider;

    /**
     * <p>
     * The name of the capacity provider to update.
     * </p>
     * 
     * @param name
     *        The name of the capacity provider to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the capacity provider to update.
     * </p>
     * 
     * @return The name of the capacity provider to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the capacity provider to update.
     * </p>
     * 
     * @param name
     *        The name of the capacity provider to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCapacityProviderRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An object representing the parameters to update for the Auto Scaling group capacity provider.
     * </p>
     * 
     * @param autoScalingGroupProvider
     *        An object representing the parameters to update for the Auto Scaling group capacity provider.
     */

    public void setAutoScalingGroupProvider(AutoScalingGroupProviderUpdate autoScalingGroupProvider) {
        this.autoScalingGroupProvider = autoScalingGroupProvider;
    }

    /**
     * <p>
     * An object representing the parameters to update for the Auto Scaling group capacity provider.
     * </p>
     * 
     * @return An object representing the parameters to update for the Auto Scaling group capacity provider.
     */

    public AutoScalingGroupProviderUpdate getAutoScalingGroupProvider() {
        return this.autoScalingGroupProvider;
    }

    /**
     * <p>
     * An object representing the parameters to update for the Auto Scaling group capacity provider.
     * </p>
     * 
     * @param autoScalingGroupProvider
     *        An object representing the parameters to update for the Auto Scaling group capacity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCapacityProviderRequest withAutoScalingGroupProvider(AutoScalingGroupProviderUpdate autoScalingGroupProvider) {
        setAutoScalingGroupProvider(autoScalingGroupProvider);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAutoScalingGroupProvider() != null)
            sb.append("AutoScalingGroupProvider: ").append(getAutoScalingGroupProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCapacityProviderRequest == false)
            return false;
        UpdateCapacityProviderRequest other = (UpdateCapacityProviderRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAutoScalingGroupProvider() == null ^ this.getAutoScalingGroupProvider() == null)
            return false;
        if (other.getAutoScalingGroupProvider() != null && other.getAutoScalingGroupProvider().equals(this.getAutoScalingGroupProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupProvider() == null) ? 0 : getAutoScalingGroupProvider().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCapacityProviderRequest clone() {
        return (UpdateCapacityProviderRequest) super.clone();
    }

}
