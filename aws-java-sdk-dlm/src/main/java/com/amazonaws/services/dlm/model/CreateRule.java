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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies when to create snapshots of EBS volumes.
 * </p>
 * <p>
 * You must specify either a Cron expression or an interval, interval unit, and start time. You cannot specify both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CreateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as the
     * source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source resource,
     * specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by default.
     * </p>
     * <p>
     * If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the source
     * resource.
     * </p>
     * <p>
     * If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the source
     * resource, or in the Region of that Outpost.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The interval unit.
     * </p>
     */
    private String intervalUnit;
    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time. If you do not specify a time, Amazon
     * DLM selects a time within the next 24 hours.
     * </p>
     */
    private java.util.List<String> times;
    /**
     * <p>
     * The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     */
    private String cronExpression;

    /**
     * <p>
     * Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as the
     * source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source resource,
     * specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by default.
     * </p>
     * <p>
     * If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the source
     * resource.
     * </p>
     * <p>
     * If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the source
     * resource, or in the Region of that Outpost.
     * </p>
     * 
     * @param location
     *        Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as
     *        the source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source
     *        resource, specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by
     *        default.</p>
     *        <p>
     *        If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the
     *        source resource.
     *        </p>
     *        <p>
     *        If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the
     *        source resource, or in the Region of that Outpost.
     * @see LocationValues
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as the
     * source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source resource,
     * specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by default.
     * </p>
     * <p>
     * If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the source
     * resource.
     * </p>
     * <p>
     * If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the source
     * resource, or in the Region of that Outpost.
     * </p>
     * 
     * @return Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as
     *         the source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source
     *         resource, specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by
     *         default.</p>
     *         <p>
     *         If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as
     *         the source resource.
     *         </p>
     *         <p>
     *         If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the
     *         source resource, or in the Region of that Outpost.
     * @see LocationValues
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as the
     * source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source resource,
     * specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by default.
     * </p>
     * <p>
     * If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the source
     * resource.
     * </p>
     * <p>
     * If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the source
     * resource, or in the Region of that Outpost.
     * </p>
     * 
     * @param location
     *        Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as
     *        the source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source
     *        resource, specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by
     *        default.</p>
     *        <p>
     *        If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the
     *        source resource.
     *        </p>
     *        <p>
     *        If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the
     *        source resource, or in the Region of that Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationValues
     */

    public CreateRule withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as the
     * source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source resource,
     * specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by default.
     * </p>
     * <p>
     * If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the source
     * resource.
     * </p>
     * <p>
     * If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the source
     * resource, or in the Region of that Outpost.
     * </p>
     * 
     * @param location
     *        Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as
     *        the source resource, specify <code>CLOUD</code>. To create snapshots on the same Outpost as the source
     *        resource, specify <code>OUTPOST_LOCAL</code>. If you omit this parameter, <code>CLOUD</code> is used by
     *        default.</p>
     *        <p>
     *        If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the
     *        source resource.
     *        </p>
     *        <p>
     *        If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the
     *        source resource, or in the Region of that Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationValues
     */

    public CreateRule withLocation(LocationValues location) {
        this.location = location.toString();
        return this;
    }

    /**
     * <p>
     * The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
     * </p>
     * 
     * @param interval
     *        The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
     * </p>
     * 
     * @return The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
     * </p>
     * 
     * @param interval
     *        The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRule withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * 
     * @param intervalUnit
     *        The interval unit.
     * @see IntervalUnitValues
     */

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * 
     * @return The interval unit.
     * @see IntervalUnitValues
     */

    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * 
     * @param intervalUnit
     *        The interval unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntervalUnitValues
     */

    public CreateRule withIntervalUnit(String intervalUnit) {
        setIntervalUnit(intervalUnit);
        return this;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * 
     * @param intervalUnit
     *        The interval unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntervalUnitValues
     */

    public CreateRule withIntervalUnit(IntervalUnitValues intervalUnit) {
        this.intervalUnit = intervalUnit.toString();
        return this;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time. If you do not specify a time, Amazon
     * DLM selects a time within the next 24 hours.
     * </p>
     * 
     * @return The time, in UTC, to start the operation. The supported format is hh:mm.</p>
     *         <p>
     *         The operation occurs within a one-hour window following the specified time. If you do not specify a time,
     *         Amazon DLM selects a time within the next 24 hours.
     */

    public java.util.List<String> getTimes() {
        return times;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time. If you do not specify a time, Amazon
     * DLM selects a time within the next 24 hours.
     * </p>
     * 
     * @param times
     *        The time, in UTC, to start the operation. The supported format is hh:mm.</p>
     *        <p>
     *        The operation occurs within a one-hour window following the specified time. If you do not specify a time,
     *        Amazon DLM selects a time within the next 24 hours.
     */

    public void setTimes(java.util.Collection<String> times) {
        if (times == null) {
            this.times = null;
            return;
        }

        this.times = new java.util.ArrayList<String>(times);
    }

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time. If you do not specify a time, Amazon
     * DLM selects a time within the next 24 hours.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimes(java.util.Collection)} or {@link #withTimes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param times
     *        The time, in UTC, to start the operation. The supported format is hh:mm.</p>
     *        <p>
     *        The operation occurs within a one-hour window following the specified time. If you do not specify a time,
     *        Amazon DLM selects a time within the next 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRule withTimes(String... times) {
        if (this.times == null) {
            setTimes(new java.util.ArrayList<String>(times.length));
        }
        for (String ele : times) {
            this.times.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time. If you do not specify a time, Amazon
     * DLM selects a time within the next 24 hours.
     * </p>
     * 
     * @param times
     *        The time, in UTC, to start the operation. The supported format is hh:mm.</p>
     *        <p>
     *        The operation occurs within a one-hour window following the specified time. If you do not specify a time,
     *        Amazon DLM selects a time within the next 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRule withTimes(java.util.Collection<String> times) {
        setTimes(times);
        return this;
    }

    /**
     * <p>
     * The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param cronExpression
     *        The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *        >Cron expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * <p>
     * The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *         >Cron expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * <p>
     * The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param cronExpression
     *        The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *        >Cron expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRule withCronExpression(String cronExpression) {
        setCronExpression(cronExpression);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getIntervalUnit() != null)
            sb.append("IntervalUnit: ").append(getIntervalUnit()).append(",");
        if (getTimes() != null)
            sb.append("Times: ").append(getTimes()).append(",");
        if (getCronExpression() != null)
            sb.append("CronExpression: ").append(getCronExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRule == false)
            return false;
        CreateRule other = (CreateRule) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getIntervalUnit() == null ^ this.getIntervalUnit() == null)
            return false;
        if (other.getIntervalUnit() != null && other.getIntervalUnit().equals(this.getIntervalUnit()) == false)
            return false;
        if (other.getTimes() == null ^ this.getTimes() == null)
            return false;
        if (other.getTimes() != null && other.getTimes().equals(this.getTimes()) == false)
            return false;
        if (other.getCronExpression() == null ^ this.getCronExpression() == null)
            return false;
        if (other.getCronExpression() != null && other.getCronExpression().equals(this.getCronExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getIntervalUnit() == null) ? 0 : getIntervalUnit().hashCode());
        hashCode = prime * hashCode + ((getTimes() == null) ? 0 : getTimes().hashCode());
        hashCode = prime * hashCode + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        return hashCode;
    }

    @Override
    public CreateRule clone() {
        try {
            return (CreateRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.CreateRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
