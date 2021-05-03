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
package com.amazonaws.services.budgets.model;

import javax.annotation.Generated;

/**
 * <p>
 * The type of a budget. It must be one of the following types:
 * </p>
 * <p>
 * <code>COST</code>, <code>USAGE</code>, <code>RI_UTILIZATION</code>, <code>RI_COVERAGE</code>,
 * <code>SAVINGS_PLANS_UTILIZATION</code>, or <code>SAVINGS_PLANS_COVERAGE</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BudgetType {

    USAGE("USAGE"),
    COST("COST"),
    RI_UTILIZATION("RI_UTILIZATION"),
    RI_COVERAGE("RI_COVERAGE"),
    SAVINGS_PLANS_UTILIZATION("SAVINGS_PLANS_UTILIZATION"),
    SAVINGS_PLANS_COVERAGE("SAVINGS_PLANS_COVERAGE");

    private String value;

    private BudgetType(String value) {
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
     * @return BudgetType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BudgetType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BudgetType enumEntry : BudgetType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
