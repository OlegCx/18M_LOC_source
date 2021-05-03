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
package com.amazonaws.services.ebs.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ValidationExceptionReason {

    INVALID_CUSTOMER_KEY("INVALID_CUSTOMER_KEY"),
    INVALID_PAGE_TOKEN("INVALID_PAGE_TOKEN"),
    INVALID_BLOCK_TOKEN("INVALID_BLOCK_TOKEN"),
    INVALID_SNAPSHOT_ID("INVALID_SNAPSHOT_ID"),
    UNRELATED_SNAPSHOTS("UNRELATED_SNAPSHOTS"),
    INVALID_BLOCK("INVALID_BLOCK"),
    INVALID_CONTENT_ENCODING("INVALID_CONTENT_ENCODING"),
    INVALID_TAG("INVALID_TAG"),
    INVALID_DEPENDENCY_REQUEST("INVALID_DEPENDENCY_REQUEST"),
    INVALID_PARAMETER_VALUE("INVALID_PARAMETER_VALUE"),
    INVALID_VOLUME_SIZE("INVALID_VOLUME_SIZE");

    private String value;

    private ValidationExceptionReason(String value) {
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
     * @return ValidationExceptionReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ValidationExceptionReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ValidationExceptionReason enumEntry : ValidationExceptionReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
