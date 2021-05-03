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
 * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
 * Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any
 * value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the
 * Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
 * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Ac3DynamicRangeCompressionRf {

    FILM_STANDARD("FILM_STANDARD"),
    FILM_LIGHT("FILM_LIGHT"),
    MUSIC_STANDARD("MUSIC_STANDARD"),
    MUSIC_LIGHT("MUSIC_LIGHT"),
    SPEECH("SPEECH"),
    NONE("NONE");

    private String value;

    private Ac3DynamicRangeCompressionRf(String value) {
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
     * @return Ac3DynamicRangeCompressionRf corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Ac3DynamicRangeCompressionRf fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Ac3DynamicRangeCompressionRf enumEntry : Ac3DynamicRangeCompressionRf.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
