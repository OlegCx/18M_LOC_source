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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an instance's time-based auto scaling configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/TimeBasedAutoScalingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeBasedAutoScalingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A <code>WeeklyAutoScalingSchedule</code> object with the instance schedule.
     * </p>
     */
    private WeeklyAutoScalingSchedule autoScalingSchedule;

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedAutoScalingConfiguration withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A <code>WeeklyAutoScalingSchedule</code> object with the instance schedule.
     * </p>
     * 
     * @param autoScalingSchedule
     *        A <code>WeeklyAutoScalingSchedule</code> object with the instance schedule.
     */

    public void setAutoScalingSchedule(WeeklyAutoScalingSchedule autoScalingSchedule) {
        this.autoScalingSchedule = autoScalingSchedule;
    }

    /**
     * <p>
     * A <code>WeeklyAutoScalingSchedule</code> object with the instance schedule.
     * </p>
     * 
     * @return A <code>WeeklyAutoScalingSchedule</code> object with the instance schedule.
     */

    public WeeklyAutoScalingSchedule getAutoScalingSchedule() {
        return this.autoScalingSchedule;
    }

    /**
     * <p>
     * A <code>WeeklyAutoScalingSchedule</code> object with the instance schedule.
     * </p>
     * 
     * @param autoScalingSchedule
     *        A <code>WeeklyAutoScalingSchedule</code> object with the instance schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedAutoScalingConfiguration withAutoScalingSchedule(WeeklyAutoScalingSchedule autoScalingSchedule) {
        setAutoScalingSchedule(autoScalingSchedule);
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
        if (getAutoScalingSchedule() != null)
            sb.append("AutoScalingSchedule: ").append(getAutoScalingSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeBasedAutoScalingConfiguration == false)
            return false;
        TimeBasedAutoScalingConfiguration other = (TimeBasedAutoScalingConfiguration) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAutoScalingSchedule() == null ^ this.getAutoScalingSchedule() == null)
            return false;
        if (other.getAutoScalingSchedule() != null && other.getAutoScalingSchedule().equals(this.getAutoScalingSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingSchedule() == null) ? 0 : getAutoScalingSchedule().hashCode());
        return hashCode;
    }

    @Override
    public TimeBasedAutoScalingConfiguration clone() {
        try {
            return (TimeBasedAutoScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.TimeBasedAutoScalingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
