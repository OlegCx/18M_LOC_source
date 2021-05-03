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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies one range of days or times to exclude from use for training an anomaly detection model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/Range" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Range implements Serializable, Cloneable {

    /**
     * <p>
     * The start time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     * <code>2019-07-01T23:59:59</code>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     * <code>2019-07-01T23:59:59</code>.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The start time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     * <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param startTime
     *        The start time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     *        <code>2019-07-01T23:59:59</code>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     * <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @return The start time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     *         <code>2019-07-01T23:59:59</code>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     * <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param startTime
     *        The start time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     *        <code>2019-07-01T23:59:59</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     * <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param endTime
     *        The end time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     *        <code>2019-07-01T23:59:59</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     * <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @return The end time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     *         <code>2019-07-01T23:59:59</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     * <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param endTime
     *        The end time of the range to exclude. The format is <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example,
     *        <code>2019-07-01T23:59:59</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Range == false)
            return false;
        Range other = (Range) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public Range clone() {
        try {
            return (Range) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
