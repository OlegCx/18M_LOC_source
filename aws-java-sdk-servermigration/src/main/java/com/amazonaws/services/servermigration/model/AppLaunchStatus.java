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
package com.amazonaws.services.servermigration.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AppLaunchStatus {

    READY_FOR_CONFIGURATION("READY_FOR_CONFIGURATION"),
    CONFIGURATION_IN_PROGRESS("CONFIGURATION_IN_PROGRESS"),
    CONFIGURATION_INVALID("CONFIGURATION_INVALID"),
    READY_FOR_LAUNCH("READY_FOR_LAUNCH"),
    VALIDATION_IN_PROGRESS("VALIDATION_IN_PROGRESS"),
    LAUNCH_PENDING("LAUNCH_PENDING"),
    LAUNCH_IN_PROGRESS("LAUNCH_IN_PROGRESS"),
    LAUNCHED("LAUNCHED"),
    PARTIALLY_LAUNCHED("PARTIALLY_LAUNCHED"),
    DELTA_LAUNCH_IN_PROGRESS("DELTA_LAUNCH_IN_PROGRESS"),
    DELTA_LAUNCH_FAILED("DELTA_LAUNCH_FAILED"),
    LAUNCH_FAILED("LAUNCH_FAILED"),
    TERMINATE_IN_PROGRESS("TERMINATE_IN_PROGRESS"),
    TERMINATE_FAILED("TERMINATE_FAILED"),
    TERMINATED("TERMINATED");

    private String value;

    private AppLaunchStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return AppLaunchStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AppLaunchStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AppLaunchStatus enumEntry : AppLaunchStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
