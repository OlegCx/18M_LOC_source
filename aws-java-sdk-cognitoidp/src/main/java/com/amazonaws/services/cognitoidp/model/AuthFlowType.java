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
package com.amazonaws.services.cognitoidp.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AuthFlowType {

    USER_SRP_AUTH("USER_SRP_AUTH"),
    REFRESH_TOKEN_AUTH("REFRESH_TOKEN_AUTH"),
    REFRESH_TOKEN("REFRESH_TOKEN"),
    CUSTOM_AUTH("CUSTOM_AUTH"),
    ADMIN_NO_SRP_AUTH("ADMIN_NO_SRP_AUTH"),
    USER_PASSWORD_AUTH("USER_PASSWORD_AUTH"),
    ADMIN_USER_PASSWORD_AUTH("ADMIN_USER_PASSWORD_AUTH");

    private String value;

    private AuthFlowType(String value) {
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
     * @return AuthFlowType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AuthFlowType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AuthFlowType enumEntry : AuthFlowType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
