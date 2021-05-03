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
 * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the
 * default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has
 * metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and
 * the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that
 * metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input
 * HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see
 * https://docs.aws.amazon.com/console/mediaconvert/hdr.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ColorSpace {

    FOLLOW("FOLLOW"),
    REC_601("REC_601"),
    REC_709("REC_709"),
    HDR10("HDR10"),
    HLG_2020("HLG_2020");

    private String value;

    private ColorSpace(String value) {
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
     * @return ColorSpace corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ColorSpace fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ColorSpace enumEntry : ColorSpace.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
