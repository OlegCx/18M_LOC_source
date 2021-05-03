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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceMetricDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     */
    private java.util.List<MetricDatapoint> metricData;

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * 
     * @param metricName
     *        The name of the metric returned.
     * @see InstanceMetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * 
     * @return The name of the metric returned.
     * @see InstanceMetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * 
     * @param metricName
     *        The name of the metric returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetricName
     */

    public GetInstanceMetricDataResult withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * 
     * @param metricName
     *        The name of the metric returned.
     * @see InstanceMetricName
     */

    public void setMetricName(InstanceMetricName metricName) {
        withMetricName(metricName);
    }

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * 
     * @param metricName
     *        The name of the metric returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetricName
     */

    public GetInstanceMetricDataResult withMetricName(InstanceMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     * 
     * @return An array of objects that describe the metric data returned.
     */

    public java.util.List<MetricDatapoint> getMetricData() {
        return metricData;
    }

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     * 
     * @param metricData
     *        An array of objects that describe the metric data returned.
     */

    public void setMetricData(java.util.Collection<MetricDatapoint> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new java.util.ArrayList<MetricDatapoint>(metricData);
    }

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricData(java.util.Collection)} or {@link #withMetricData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricData
     *        An array of objects that describe the metric data returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceMetricDataResult withMetricData(MetricDatapoint... metricData) {
        if (this.metricData == null) {
            setMetricData(new java.util.ArrayList<MetricDatapoint>(metricData.length));
        }
        for (MetricDatapoint ele : metricData) {
            this.metricData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     * 
     * @param metricData
     *        An array of objects that describe the metric data returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceMetricDataResult withMetricData(java.util.Collection<MetricDatapoint> metricData) {
        setMetricData(metricData);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMetricData() != null)
            sb.append("MetricData: ").append(getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceMetricDataResult == false)
            return false;
        GetInstanceMetricDataResult other = (GetInstanceMetricDataResult) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceMetricDataResult clone() {
        try {
            return (GetInstanceMetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
