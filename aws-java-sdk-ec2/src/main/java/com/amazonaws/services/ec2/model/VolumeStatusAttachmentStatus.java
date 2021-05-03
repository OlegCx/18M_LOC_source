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

/**
 * <p>
 * Information about the instances to which the volume is attached.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VolumeStatusAttachmentStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeStatusAttachmentStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum IOPS supported by the attached instance.
     * </p>
     */
    private String ioPerformance;
    /**
     * <p>
     * The ID of the attached instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The maximum IOPS supported by the attached instance.
     * </p>
     * 
     * @param ioPerformance
     *        The maximum IOPS supported by the attached instance.
     */

    public void setIoPerformance(String ioPerformance) {
        this.ioPerformance = ioPerformance;
    }

    /**
     * <p>
     * The maximum IOPS supported by the attached instance.
     * </p>
     * 
     * @return The maximum IOPS supported by the attached instance.
     */

    public String getIoPerformance() {
        return this.ioPerformance;
    }

    /**
     * <p>
     * The maximum IOPS supported by the attached instance.
     * </p>
     * 
     * @param ioPerformance
     *        The maximum IOPS supported by the attached instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusAttachmentStatus withIoPerformance(String ioPerformance) {
        setIoPerformance(ioPerformance);
        return this;
    }

    /**
     * <p>
     * The ID of the attached instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the attached instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the attached instance.
     * </p>
     * 
     * @return The ID of the attached instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the attached instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the attached instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusAttachmentStatus withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getIoPerformance() != null)
            sb.append("IoPerformance: ").append(getIoPerformance()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusAttachmentStatus == false)
            return false;
        VolumeStatusAttachmentStatus other = (VolumeStatusAttachmentStatus) obj;
        if (other.getIoPerformance() == null ^ this.getIoPerformance() == null)
            return false;
        if (other.getIoPerformance() != null && other.getIoPerformance().equals(this.getIoPerformance()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIoPerformance() == null) ? 0 : getIoPerformance().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public VolumeStatusAttachmentStatus clone() {
        try {
            return (VolumeStatusAttachmentStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
