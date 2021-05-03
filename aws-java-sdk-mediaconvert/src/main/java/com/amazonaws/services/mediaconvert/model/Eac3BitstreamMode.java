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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3
 * bitstream mode, see ATSC A/52-2012 (Annex E).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Eac3BitstreamMode {

    COMPLETE_MAIN("COMPLETE_MAIN"),
    COMMENTARY("COMMENTARY"),
    EMERGENCY("EMERGENCY"),
    HEARING_IMPAIRED("HEARING_IMPAIRED"),
    VISUALLY_IMPAIRED("VISUALLY_IMPAIRED");

    private String value;

    private Eac3BitstreamMode(String value) {
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
     * @return Eac3BitstreamMode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Eac3BitstreamMode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Eac3BitstreamMode enumEntry : Eac3BitstreamMode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
