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
 * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in
 * your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the
 * spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the
 * captions are closed caption.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BurninSubtitleTeletextSpacing {

    FIXED_GRID("FIXED_GRID"),
    PROPORTIONAL("PROPORTIONAL");

    private String value;

    private BurninSubtitleTeletextSpacing(String value) {
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
     * @return BurninSubtitleTeletextSpacing corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BurninSubtitleTeletextSpacing fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BurninSubtitleTeletextSpacing enumEntry : BurninSubtitleTeletextSpacing.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
