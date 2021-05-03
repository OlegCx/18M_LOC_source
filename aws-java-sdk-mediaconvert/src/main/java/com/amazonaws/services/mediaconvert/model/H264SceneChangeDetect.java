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
 * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video
 * quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for
 * further video quality improvement. For more information about QVBR, see
 * https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264SceneChangeDetect {

    DISABLED("DISABLED"),
    ENABLED("ENABLED"),
    TRANSITION_DETECTION("TRANSITION_DETECTION");

    private String value;

    private H264SceneChangeDetect(String value) {
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
     * @return H264SceneChangeDetect corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264SceneChangeDetect fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264SceneChangeDetect enumEntry : H264SceneChangeDetect.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
