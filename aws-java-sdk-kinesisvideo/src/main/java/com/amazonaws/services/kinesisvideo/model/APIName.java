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
package com.amazonaws.services.kinesisvideo.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum APIName {

    PUT_MEDIA("PUT_MEDIA"),
    GET_MEDIA("GET_MEDIA"),
    LIST_FRAGMENTS("LIST_FRAGMENTS"),
    GET_MEDIA_FOR_FRAGMENT_LIST("GET_MEDIA_FOR_FRAGMENT_LIST"),
    GET_HLS_STREAMING_SESSION_URL("GET_HLS_STREAMING_SESSION_URL"),
    GET_DASH_STREAMING_SESSION_URL("GET_DASH_STREAMING_SESSION_URL"),
    GET_CLIP("GET_CLIP");

    private String value;

    private APIName(String value) {
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
     * @return APIName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static APIName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (APIName enumEntry : APIName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
