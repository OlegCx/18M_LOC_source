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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMaintenanceWindowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the maintenance window to update.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description for the update request.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     * Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see
     * the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     */
    private String startDate;
    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive.
     * EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
     * </p>
     */
    private String endDate;
    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate expression.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     * Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see
     * the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     */
    private String scheduleTimezone;
    /**
     * <p>
     * The number of days to wait after the date and time specified by a CRON expression before running the maintenance
     * window.
     * </p>
     * <p>
     * For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month
     * at 11:30 PM.
     * </p>
     * <p>
     * <code>cron(30 23 ? * TUE#3 *)</code>
     * </p>
     * <p>
     * If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.
     * </p>
     */
    private Integer scheduleOffset;
    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     */
    private Integer cutoff;
    /**
     * <p>
     * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
     * </p>
     */
    private Boolean allowUnassociatedTargets;
    /**
     * <p>
     * Whether the maintenance window is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     */
    private Boolean replace;

    /**
     * <p>
     * The ID of the maintenance window to update.
     * </p>
     * 
     * @param windowId
     *        The ID of the maintenance window to update.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window to update.
     * </p>
     * 
     * @return The ID of the maintenance window to update.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window to update.
     * </p>
     * 
     * @param windowId
     *        The ID of the maintenance window to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * 
     * @param name
     *        The name of the maintenance window.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * 
     * @return The name of the maintenance window.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * 
     * @param name
     *        The name of the maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description for the update request.
     * </p>
     * 
     * @param description
     *        An optional description for the update request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the update request.
     * </p>
     * 
     * @return An optional description for the update request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the update request.
     * </p>
     * 
     * @param description
     *        An optional description for the update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     * Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see
     * the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * 
     * @param startDate
     *        The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     *        Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information,
     *        see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     */

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     * Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see
     * the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * 
     * @return The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     *         Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more
     *         information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA
     *         website.
     */

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     * Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see
     * the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * 
     * @param startDate
     *        The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     *        Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information,
     *        see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withStartDate(String startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive.
     * EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
     * </p>
     * 
     * @param endDate
     *        The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become
     *        inactive. EndDate allows you to set a date and time in the future when the maintenance window will no
     *        longer run.
     */

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive.
     * EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
     * </p>
     * 
     * @return The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become
     *         inactive. EndDate allows you to set a date and time in the future when the maintenance window will no
     *         longer run.
     */

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive.
     * EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
     * </p>
     * 
     * @param endDate
     *        The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become
     *        inactive. EndDate allows you to set a date and time in the future when the maintenance window will no
     *        longer run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withEndDate(String endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate expression.
     * </p>
     * 
     * @param schedule
     *        The schedule of the maintenance window in the form of a cron or rate expression.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate expression.
     * </p>
     * 
     * @return The schedule of the maintenance window in the form of a cron or rate expression.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate expression.
     * </p>
     * 
     * @param schedule
     *        The schedule of the maintenance window in the form of a cron or rate expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     * Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see
     * the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * 
     * @param scheduleTimezone
     *        The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     *        Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information,
     *        see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     */

    public void setScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     * Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see
     * the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * 
     * @return The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     *         Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more
     *         information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA
     *         website.
     */

    public String getScheduleTimezone() {
        return this.scheduleTimezone;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     * Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see
     * the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * 
     * @param scheduleTimezone
     *        The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers
     *        Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information,
     *        see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withScheduleTimezone(String scheduleTimezone) {
        setScheduleTimezone(scheduleTimezone);
        return this;
    }

    /**
     * <p>
     * The number of days to wait after the date and time specified by a CRON expression before running the maintenance
     * window.
     * </p>
     * <p>
     * For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month
     * at 11:30 PM.
     * </p>
     * <p>
     * <code>cron(30 23 ? * TUE#3 *)</code>
     * </p>
     * <p>
     * If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.
     * </p>
     * 
     * @param scheduleOffset
     *        The number of days to wait after the date and time specified by a CRON expression before running the
     *        maintenance window.</p>
     *        <p>
     *        For example, the following cron expression schedules a maintenance window to run the third Tuesday of
     *        every month at 11:30 PM.
     *        </p>
     *        <p>
     *        <code>cron(30 23 ? * TUE#3 *)</code>
     *        </p>
     *        <p>
     *        If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.
     */

    public void setScheduleOffset(Integer scheduleOffset) {
        this.scheduleOffset = scheduleOffset;
    }

    /**
     * <p>
     * The number of days to wait after the date and time specified by a CRON expression before running the maintenance
     * window.
     * </p>
     * <p>
     * For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month
     * at 11:30 PM.
     * </p>
     * <p>
     * <code>cron(30 23 ? * TUE#3 *)</code>
     * </p>
     * <p>
     * If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.
     * </p>
     * 
     * @return The number of days to wait after the date and time specified by a CRON expression before running the
     *         maintenance window.</p>
     *         <p>
     *         For example, the following cron expression schedules a maintenance window to run the third Tuesday of
     *         every month at 11:30 PM.
     *         </p>
     *         <p>
     *         <code>cron(30 23 ? * TUE#3 *)</code>
     *         </p>
     *         <p>
     *         If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.
     */

    public Integer getScheduleOffset() {
        return this.scheduleOffset;
    }

    /**
     * <p>
     * The number of days to wait after the date and time specified by a CRON expression before running the maintenance
     * window.
     * </p>
     * <p>
     * For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month
     * at 11:30 PM.
     * </p>
     * <p>
     * <code>cron(30 23 ? * TUE#3 *)</code>
     * </p>
     * <p>
     * If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.
     * </p>
     * 
     * @param scheduleOffset
     *        The number of days to wait after the date and time specified by a CRON expression before running the
     *        maintenance window.</p>
     *        <p>
     *        For example, the following cron expression schedules a maintenance window to run the third Tuesday of
     *        every month at 11:30 PM.
     *        </p>
     *        <p>
     *        <code>cron(30 23 ? * TUE#3 *)</code>
     *        </p>
     *        <p>
     *        If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withScheduleOffset(Integer scheduleOffset) {
        setScheduleOffset(scheduleOffset);
        return this;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * 
     * @param duration
     *        The duration of the maintenance window in hours.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * 
     * @return The duration of the maintenance window in hours.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * 
     * @param duration
     *        The duration of the maintenance window in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @param cutoff
     *        The number of hours before the end of the maintenance window that Systems Manager stops scheduling new
     *        tasks for execution.
     */

    public void setCutoff(Integer cutoff) {
        this.cutoff = cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @return The number of hours before the end of the maintenance window that Systems Manager stops scheduling new
     *         tasks for execution.
     */

    public Integer getCutoff() {
        return this.cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @param cutoff
     *        The number of hours before the end of the maintenance window that Systems Manager stops scheduling new
     *        tasks for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withCutoff(Integer cutoff) {
        setCutoff(cutoff);
        return this;
    }

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
     * </p>
     * 
     * @param allowUnassociatedTargets
     *        Whether targets must be registered with the maintenance window before tasks can be defined for those
     *        targets.
     */

    public void setAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        this.allowUnassociatedTargets = allowUnassociatedTargets;
    }

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
     * </p>
     * 
     * @return Whether targets must be registered with the maintenance window before tasks can be defined for those
     *         targets.
     */

    public Boolean getAllowUnassociatedTargets() {
        return this.allowUnassociatedTargets;
    }

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
     * </p>
     * 
     * @param allowUnassociatedTargets
     *        Whether targets must be registered with the maintenance window before tasks can be defined for those
     *        targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        setAllowUnassociatedTargets(allowUnassociatedTargets);
        return this;
    }

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
     * </p>
     * 
     * @return Whether targets must be registered with the maintenance window before tasks can be defined for those
     *         targets.
     */

    public Boolean isAllowUnassociatedTargets() {
        return this.allowUnassociatedTargets;
    }

    /**
     * <p>
     * Whether the maintenance window is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether the maintenance window is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the maintenance window is enabled.
     * </p>
     * 
     * @return Whether the maintenance window is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the maintenance window is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether the maintenance window is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the maintenance window is enabled.
     * </p>
     * 
     * @return Whether the maintenance window is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @param replace
     *        If True, then all fields that are required by the CreateMaintenanceWindow action are also required for
     *        this API request. Optional fields that are not specified are set to null.
     */

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @return If True, then all fields that are required by the CreateMaintenanceWindow action are also required for
     *         this API request. Optional fields that are not specified are set to null.
     */

    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @param replace
     *        If True, then all fields that are required by the CreateMaintenanceWindow action are also required for
     *        this API request. Optional fields that are not specified are set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowRequest withReplace(Boolean replace) {
        setReplace(replace);
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @return If True, then all fields that are required by the CreateMaintenanceWindow action are also required for
     *         this API request. Optional fields that are not specified are set to null.
     */

    public Boolean isReplace() {
        return this.replace;
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getScheduleTimezone() != null)
            sb.append("ScheduleTimezone: ").append(getScheduleTimezone()).append(",");
        if (getScheduleOffset() != null)
            sb.append("ScheduleOffset: ").append(getScheduleOffset()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getCutoff() != null)
            sb.append("Cutoff: ").append(getCutoff()).append(",");
        if (getAllowUnassociatedTargets() != null)
            sb.append("AllowUnassociatedTargets: ").append(getAllowUnassociatedTargets()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getReplace() != null)
            sb.append("Replace: ").append(getReplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMaintenanceWindowRequest == false)
            return false;
        UpdateMaintenanceWindowRequest other = (UpdateMaintenanceWindowRequest) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getScheduleTimezone() == null ^ this.getScheduleTimezone() == null)
            return false;
        if (other.getScheduleTimezone() != null && other.getScheduleTimezone().equals(this.getScheduleTimezone()) == false)
            return false;
        if (other.getScheduleOffset() == null ^ this.getScheduleOffset() == null)
            return false;
        if (other.getScheduleOffset() != null && other.getScheduleOffset().equals(this.getScheduleOffset()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getCutoff() == null ^ this.getCutoff() == null)
            return false;
        if (other.getCutoff() != null && other.getCutoff().equals(this.getCutoff()) == false)
            return false;
        if (other.getAllowUnassociatedTargets() == null ^ this.getAllowUnassociatedTargets() == null)
            return false;
        if (other.getAllowUnassociatedTargets() != null && other.getAllowUnassociatedTargets().equals(this.getAllowUnassociatedTargets()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getScheduleTimezone() == null) ? 0 : getScheduleTimezone().hashCode());
        hashCode = prime * hashCode + ((getScheduleOffset() == null) ? 0 : getScheduleOffset().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getCutoff() == null) ? 0 : getCutoff().hashCode());
        hashCode = prime * hashCode + ((getAllowUnassociatedTargets() == null) ? 0 : getAllowUnassociatedTargets().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMaintenanceWindowRequest clone() {
        return (UpdateMaintenanceWindowRequest) super.clone();
    }

}
