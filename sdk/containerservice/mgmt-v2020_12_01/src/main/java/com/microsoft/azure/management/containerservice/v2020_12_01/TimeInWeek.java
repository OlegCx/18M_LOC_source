/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Time in a week.
 */
public class TimeInWeek {
    /**
     * A day in a week. Possible values include: 'Sunday', 'Monday', 'Tuesday',
     * 'Wednesday', 'Thursday', 'Friday', 'Saturday'.
     */
    @JsonProperty(value = "day")
    private WeekDay day;

    /**
     * hour slots in a day.
     */
    @JsonProperty(value = "hourSlots")
    private List<Integer> hourSlots;

    /**
     * Get a day in a week. Possible values include: 'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'.
     *
     * @return the day value
     */
    public WeekDay day() {
        return this.day;
    }

    /**
     * Set a day in a week. Possible values include: 'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'.
     *
     * @param day the day value to set
     * @return the TimeInWeek object itself.
     */
    public TimeInWeek withDay(WeekDay day) {
        this.day = day;
        return this;
    }

    /**
     * Get hour slots in a day.
     *
     * @return the hourSlots value
     */
    public List<Integer> hourSlots() {
        return this.hourSlots;
    }

    /**
     * Set hour slots in a day.
     *
     * @param hourSlots the hourSlots value to set
     * @return the TimeInWeek object itself.
     */
    public TimeInWeek withHourSlots(List<Integer> hourSlots) {
        this.hourSlots = hourSlots;
        return this;
    }

}