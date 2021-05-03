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
package com.amazonaws.services.machinelearning.model;

import javax.annotation.Generated;

/**
 * <p>
 * Contains the key values of <code>DetailsMap</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PredictiveModelType</code> - Indicates the type of the <code>MLModel</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Algorithm</code> - Indicates the algorithm that was used for the <code>MLModel</code>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DetailsAttributes {

    PredictiveModelType("PredictiveModelType"),
    Algorithm("Algorithm");

    private String value;

    private DetailsAttributes(String value) {
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
     * @return DetailsAttributes corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DetailsAttributes fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DetailsAttributes enumEntry : DetailsAttributes.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
