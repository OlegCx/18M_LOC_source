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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScheduledAuditRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>, <code>BIWEEKLY</code>,
     * or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. This can be <code>1</code> through <code>31</code>
     * or <code>LAST</code>. This field is required if the <code>frequency</code> parameter is set to
     * <code>MONTHLY</code>. If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     * </p>
     */
    private String dayOfMonth;
    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     * <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or <code>SAT</code>.
     * This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or <code>BIWEEKLY</code>.
     * </p>
     */
    private String dayOfWeek;
    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are enabled or
     * use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     */
    private java.util.List<String> targetCheckNames;
    /**
     * <p>
     * The name of the scheduled audit. (Max. 128 chars)
     * </p>
     */
    private String scheduledAuditName;

    /**
     * <p>
     * How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>, <code>BIWEEKLY</code>,
     * or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>,
     *        <code>BIWEEKLY</code>, or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * @see AuditFrequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>, <code>BIWEEKLY</code>,
     * or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * </p>
     * 
     * @return How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>,
     *         <code>BIWEEKLY</code>, or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * @see AuditFrequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>, <code>BIWEEKLY</code>,
     * or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>,
     *        <code>BIWEEKLY</code>, or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditFrequency
     */

    public UpdateScheduledAuditRequest withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>, <code>BIWEEKLY</code>,
     * or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place, either <code>DAILY</code>, <code>WEEKLY</code>,
     *        <code>BIWEEKLY</code>, or <code>MONTHLY</code>. The start time of each audit is determined by the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditFrequency
     */

    public UpdateScheduledAuditRequest withFrequency(AuditFrequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. This can be <code>1</code> through <code>31</code>
     * or <code>LAST</code>. This field is required if the <code>frequency</code> parameter is set to
     * <code>MONTHLY</code>. If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month on which the scheduled audit takes place. This can be <code>1</code> through
     *        <code>31</code> or <code>LAST</code>. This field is required if the <code>frequency</code> parameter is
     *        set to <code>MONTHLY</code>. If days 29-31 are specified, and the month does not have that many days, the
     *        audit takes place on the "LAST" day of the month.
     */

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. This can be <code>1</code> through <code>31</code>
     * or <code>LAST</code>. This field is required if the <code>frequency</code> parameter is set to
     * <code>MONTHLY</code>. If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     * </p>
     * 
     * @return The day of the month on which the scheduled audit takes place. This can be <code>1</code> through
     *         <code>31</code> or <code>LAST</code>. This field is required if the <code>frequency</code> parameter is
     *         set to <code>MONTHLY</code>. If days 29-31 are specified, and the month does not have that many days, the
     *         audit takes place on the "LAST" day of the month.
     */

    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. This can be <code>1</code> through <code>31</code>
     * or <code>LAST</code>. This field is required if the <code>frequency</code> parameter is set to
     * <code>MONTHLY</code>. If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month on which the scheduled audit takes place. This can be <code>1</code> through
     *        <code>31</code> or <code>LAST</code>. This field is required if the <code>frequency</code> parameter is
     *        set to <code>MONTHLY</code>. If days 29-31 are specified, and the month does not have that many days, the
     *        audit takes place on the "LAST" day of the month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledAuditRequest withDayOfMonth(String dayOfMonth) {
        setDayOfMonth(dayOfMonth);
        return this;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     * <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or <code>SAT</code>.
     * This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or <code>BIWEEKLY</code>.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     *        <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or
     *        <code>SAT</code>. This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or
     *        <code>BIWEEKLY</code>.
     * @see DayOfWeek
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     * <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or <code>SAT</code>.
     * This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or <code>BIWEEKLY</code>.
     * </p>
     * 
     * @return The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     *         <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or
     *         <code>SAT</code>. This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or
     *         <code>BIWEEKLY</code>.
     * @see DayOfWeek
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     * <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or <code>SAT</code>.
     * This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or <code>BIWEEKLY</code>.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     *        <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or
     *        <code>SAT</code>. This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or
     *        <code>BIWEEKLY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public UpdateScheduledAuditRequest withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     * <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or <code>SAT</code>.
     * This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or <code>BIWEEKLY</code>.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit takes place. This can be one of <code>SUN</code>,
     *        <code>MON</code>, <code>TUE</code>, <code>WED</code>, <code>THU</code>, <code>FRI</code>, or
     *        <code>SAT</code>. This field is required if the "frequency" parameter is set to <code>WEEKLY</code> or
     *        <code>BIWEEKLY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public UpdateScheduledAuditRequest withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are enabled or
     * use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     * 
     * @return Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     *         <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are
     *         enabled or use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     */

    public java.util.List<String> getTargetCheckNames() {
        return targetCheckNames;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are enabled or
     * use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     *        <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are
     *        enabled or use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     */

    public void setTargetCheckNames(java.util.Collection<String> targetCheckNames) {
        if (targetCheckNames == null) {
            this.targetCheckNames = null;
            return;
        }

        this.targetCheckNames = new java.util.ArrayList<String>(targetCheckNames);
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are enabled or
     * use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetCheckNames(java.util.Collection)} or {@link #withTargetCheckNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     *        <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are
     *        enabled or use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledAuditRequest withTargetCheckNames(String... targetCheckNames) {
        if (this.targetCheckNames == null) {
            setTargetCheckNames(new java.util.ArrayList<String>(targetCheckNames.length));
        }
        for (String ele : targetCheckNames) {
            this.targetCheckNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are enabled or
     * use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     *        <code>DescribeAccountAuditConfiguration</code> to see the list of all checks, including those that are
     *        enabled or use <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledAuditRequest withTargetCheckNames(java.util.Collection<String> targetCheckNames) {
        setTargetCheckNames(targetCheckNames);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled audit. (Max. 128 chars)
     * </p>
     * 
     * @param scheduledAuditName
     *        The name of the scheduled audit. (Max. 128 chars)
     */

    public void setScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit. (Max. 128 chars)
     * </p>
     * 
     * @return The name of the scheduled audit. (Max. 128 chars)
     */

    public String getScheduledAuditName() {
        return this.scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit. (Max. 128 chars)
     * </p>
     * 
     * @param scheduledAuditName
     *        The name of the scheduled audit. (Max. 128 chars)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledAuditRequest withScheduledAuditName(String scheduledAuditName) {
        setScheduledAuditName(scheduledAuditName);
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
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth()).append(",");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek()).append(",");
        if (getTargetCheckNames() != null)
            sb.append("TargetCheckNames: ").append(getTargetCheckNames()).append(",");
        if (getScheduledAuditName() != null)
            sb.append("ScheduledAuditName: ").append(getScheduledAuditName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScheduledAuditRequest == false)
            return false;
        UpdateScheduledAuditRequest other = (UpdateScheduledAuditRequest) obj;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getTargetCheckNames() == null ^ this.getTargetCheckNames() == null)
            return false;
        if (other.getTargetCheckNames() != null && other.getTargetCheckNames().equals(this.getTargetCheckNames()) == false)
            return false;
        if (other.getScheduledAuditName() == null ^ this.getScheduledAuditName() == null)
            return false;
        if (other.getScheduledAuditName() != null && other.getScheduledAuditName().equals(this.getScheduledAuditName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getTargetCheckNames() == null) ? 0 : getTargetCheckNames().hashCode());
        hashCode = prime * hashCode + ((getScheduledAuditName() == null) ? 0 : getScheduledAuditName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScheduledAuditRequest clone() {
        return (UpdateScheduledAuditRequest) super.clone();
    }

}
