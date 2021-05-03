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
package com.amazonaws.services.sagemaker.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum TargetDevice {

    Lambda("lambda"),
    Ml_m4("ml_m4"),
    Ml_m5("ml_m5"),
    Ml_c4("ml_c4"),
    Ml_c5("ml_c5"),
    Ml_p2("ml_p2"),
    Ml_p3("ml_p3"),
    Ml_g4dn("ml_g4dn"),
    Ml_inf1("ml_inf1"),
    Ml_eia2("ml_eia2"),
    Jetson_tx1("jetson_tx1"),
    Jetson_tx2("jetson_tx2"),
    Jetson_nano("jetson_nano"),
    Jetson_xavier("jetson_xavier"),
    Rasp3b("rasp3b"),
    Imx8qm("imx8qm"),
    Deeplens("deeplens"),
    Rk3399("rk3399"),
    Rk3288("rk3288"),
    Aisage("aisage"),
    Sbe_c("sbe_c"),
    Qcs605("qcs605"),
    Qcs603("qcs603"),
    Sitara_am57x("sitara_am57x"),
    Amba_cv22("amba_cv22"),
    X86_win32("x86_win32"),
    X86_win64("x86_win64"),
    Coreml("coreml"),
    Jacinto_tda4vm("jacinto_tda4vm");

    private String value;

    private TargetDevice(String value) {
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
     * @return TargetDevice corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static TargetDevice fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (TargetDevice enumEntry : TargetDevice.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
