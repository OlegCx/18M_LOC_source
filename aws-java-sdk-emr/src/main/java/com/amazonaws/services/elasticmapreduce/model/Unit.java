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
package com.amazonaws.services.elasticmapreduce.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Unit {

    NONE("NONE"),
    SECONDS("SECONDS"),
    MICRO_SECONDS("MICRO_SECONDS"),
    MILLI_SECONDS("MILLI_SECONDS"),
    BYTES("BYTES"),
    KILO_BYTES("KILO_BYTES"),
    MEGA_BYTES("MEGA_BYTES"),
    GIGA_BYTES("GIGA_BYTES"),
    TERA_BYTES("TERA_BYTES"),
    BITS("BITS"),
    KILO_BITS("KILO_BITS"),
    MEGA_BITS("MEGA_BITS"),
    GIGA_BITS("GIGA_BITS"),
    TERA_BITS("TERA_BITS"),
    PERCENT("PERCENT"),
    COUNT("COUNT"),
    BYTES_PER_SECOND("BYTES_PER_SECOND"),
    KILO_BYTES_PER_SECOND("KILO_BYTES_PER_SECOND"),
    MEGA_BYTES_PER_SECOND("MEGA_BYTES_PER_SECOND"),
    GIGA_BYTES_PER_SECOND("GIGA_BYTES_PER_SECOND"),
    TERA_BYTES_PER_SECOND("TERA_BYTES_PER_SECOND"),
    BITS_PER_SECOND("BITS_PER_SECOND"),
    KILO_BITS_PER_SECOND("KILO_BITS_PER_SECOND"),
    MEGA_BITS_PER_SECOND("MEGA_BITS_PER_SECOND"),
    GIGA_BITS_PER_SECOND("GIGA_BITS_PER_SECOND"),
    TERA_BITS_PER_SECOND("TERA_BITS_PER_SECOND"),
    COUNT_PER_SECOND("COUNT_PER_SECOND");

    private String value;

    private Unit(String value) {
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
     * @return Unit corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Unit fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Unit enumEntry : Unit.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
