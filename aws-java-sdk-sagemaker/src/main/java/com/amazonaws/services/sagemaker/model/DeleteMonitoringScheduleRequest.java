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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteMonitoringSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMonitoringScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitoring schedule to delete.
     * </p>
     */
    private String monitoringScheduleName;

    /**
     * <p>
     * The name of the monitoring schedule to delete.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of the monitoring schedule to delete.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule to delete.
     * </p>
     * 
     * @return The name of the monitoring schedule to delete.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule to delete.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of the monitoring schedule to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMonitoringScheduleRequest withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
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
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: ").append(getMonitoringScheduleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMonitoringScheduleRequest == false)
            return false;
        DeleteMonitoringScheduleRequest other = (DeleteMonitoringScheduleRequest) obj;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMonitoringScheduleRequest clone() {
        return (DeleteMonitoringScheduleRequest) super.clone();
    }

}
