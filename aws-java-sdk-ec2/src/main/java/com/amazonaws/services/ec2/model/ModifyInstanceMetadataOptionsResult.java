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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceMetadataOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     */
    private InstanceMetadataOptionsResponse instanceMetadataOptions;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceMetadataOptionsResult withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     * 
     * @param instanceMetadataOptions
     *        The metadata options for the instance.
     */

    public void setInstanceMetadataOptions(InstanceMetadataOptionsResponse instanceMetadataOptions) {
        this.instanceMetadataOptions = instanceMetadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     * 
     * @return The metadata options for the instance.
     */

    public InstanceMetadataOptionsResponse getInstanceMetadataOptions() {
        return this.instanceMetadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     * 
     * @param instanceMetadataOptions
     *        The metadata options for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceMetadataOptionsResult withInstanceMetadataOptions(InstanceMetadataOptionsResponse instanceMetadataOptions) {
        setInstanceMetadataOptions(instanceMetadataOptions);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceMetadataOptions() != null)
            sb.append("InstanceMetadataOptions: ").append(getInstanceMetadataOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceMetadataOptionsResult == false)
            return false;
        ModifyInstanceMetadataOptionsResult other = (ModifyInstanceMetadataOptionsResult) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceMetadataOptions() == null ^ this.getInstanceMetadataOptions() == null)
            return false;
        if (other.getInstanceMetadataOptions() != null && other.getInstanceMetadataOptions().equals(this.getInstanceMetadataOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceMetadataOptions() == null) ? 0 : getInstanceMetadataOptions().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceMetadataOptionsResult clone() {
        try {
            return (ModifyInstanceMetadataOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
