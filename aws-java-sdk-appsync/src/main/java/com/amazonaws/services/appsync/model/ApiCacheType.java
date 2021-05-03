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
package com.amazonaws.services.appsync.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ApiCacheType {

    T2_SMALL("T2_SMALL"),
    T2_MEDIUM("T2_MEDIUM"),
    R4_LARGE("R4_LARGE"),
    R4_XLARGE("R4_XLARGE"),
    R4_2XLARGE("R4_2XLARGE"),
    R4_4XLARGE("R4_4XLARGE"),
    R4_8XLARGE("R4_8XLARGE"),
    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE"),
    XLARGE("XLARGE"),
    LARGE_2X("LARGE_2X"),
    LARGE_4X("LARGE_4X"),
    LARGE_8X("LARGE_8X"),
    LARGE_12X("LARGE_12X");

    private String value;

    private ApiCacheType(String value) {
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
     * @return ApiCacheType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ApiCacheType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ApiCacheType enumEntry : ApiCacheType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
