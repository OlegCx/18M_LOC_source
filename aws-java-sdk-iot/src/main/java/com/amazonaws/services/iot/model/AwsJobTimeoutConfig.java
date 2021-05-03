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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job
 * execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal state
 * before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsJobTimeoutConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout interval
     * can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be updated and will
     * apply to all job executions for the job. Whenever a job execution remains in the IN_PROGRESS status for longer
     * than this interval, the job execution will fail and switch to the terminal <code>TIMED_OUT</code> status.
     * </p>
     */
    private Long inProgressTimeoutInMinutes;

    /**
     * <p>
     * Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout interval
     * can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be updated and will
     * apply to all job executions for the job. Whenever a job execution remains in the IN_PROGRESS status for longer
     * than this interval, the job execution will fail and switch to the terminal <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @param inProgressTimeoutInMinutes
     *        Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout
     *        interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be
     *        updated and will apply to all job executions for the job. Whenever a job execution remains in the
     *        IN_PROGRESS status for longer than this interval, the job execution will fail and switch to the terminal
     *        <code>TIMED_OUT</code> status.
     */

    public void setInProgressTimeoutInMinutes(Long inProgressTimeoutInMinutes) {
        this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout interval
     * can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be updated and will
     * apply to all job executions for the job. Whenever a job execution remains in the IN_PROGRESS status for longer
     * than this interval, the job execution will fail and switch to the terminal <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @return Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout
     *         interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be
     *         updated and will apply to all job executions for the job. Whenever a job execution remains in the
     *         IN_PROGRESS status for longer than this interval, the job execution will fail and switch to the terminal
     *         <code>TIMED_OUT</code> status.
     */

    public Long getInProgressTimeoutInMinutes() {
        return this.inProgressTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout interval
     * can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be updated and will
     * apply to all job executions for the job. Whenever a job execution remains in the IN_PROGRESS status for longer
     * than this interval, the job execution will fail and switch to the terminal <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @param inProgressTimeoutInMinutes
     *        Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout
     *        interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be
     *        updated and will apply to all job executions for the job. Whenever a job execution remains in the
     *        IN_PROGRESS status for longer than this interval, the job execution will fail and switch to the terminal
     *        <code>TIMED_OUT</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsJobTimeoutConfig withInProgressTimeoutInMinutes(Long inProgressTimeoutInMinutes) {
        setInProgressTimeoutInMinutes(inProgressTimeoutInMinutes);
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
        if (getInProgressTimeoutInMinutes() != null)
            sb.append("InProgressTimeoutInMinutes: ").append(getInProgressTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsJobTimeoutConfig == false)
            return false;
        AwsJobTimeoutConfig other = (AwsJobTimeoutConfig) obj;
        if (other.getInProgressTimeoutInMinutes() == null ^ this.getInProgressTimeoutInMinutes() == null)
            return false;
        if (other.getInProgressTimeoutInMinutes() != null && other.getInProgressTimeoutInMinutes().equals(this.getInProgressTimeoutInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInProgressTimeoutInMinutes() == null) ? 0 : getInProgressTimeoutInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public AwsJobTimeoutConfig clone() {
        try {
            return (AwsJobTimeoutConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AwsJobTimeoutConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
