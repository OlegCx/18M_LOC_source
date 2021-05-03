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
package com.amazonaws.services.robomaker.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SimulationJobErrorCode {

    InternalServiceError("InternalServiceError"),
    RobotApplicationCrash("RobotApplicationCrash"),
    SimulationApplicationCrash("SimulationApplicationCrash"),
    RobotApplicationHealthCheckFailure("RobotApplicationHealthCheckFailure"),
    SimulationApplicationHealthCheckFailure("SimulationApplicationHealthCheckFailure"),
    BadPermissionsRobotApplication("BadPermissionsRobotApplication"),
    BadPermissionsSimulationApplication("BadPermissionsSimulationApplication"),
    BadPermissionsS3Object("BadPermissionsS3Object"),
    BadPermissionsS3Output("BadPermissionsS3Output"),
    BadPermissionsCloudwatchLogs("BadPermissionsCloudwatchLogs"),
    SubnetIpLimitExceeded("SubnetIpLimitExceeded"),
    ENILimitExceeded("ENILimitExceeded"),
    BadPermissionsUserCredentials("BadPermissionsUserCredentials"),
    InvalidBundleRobotApplication("InvalidBundleRobotApplication"),
    InvalidBundleSimulationApplication("InvalidBundleSimulationApplication"),
    InvalidS3Resource("InvalidS3Resource"),
    ThrottlingError("ThrottlingError"),
    LimitExceeded("LimitExceeded"),
    MismatchedEtag("MismatchedEtag"),
    RobotApplicationVersionMismatchedEtag("RobotApplicationVersionMismatchedEtag"),
    SimulationApplicationVersionMismatchedEtag("SimulationApplicationVersionMismatchedEtag"),
    ResourceNotFound("ResourceNotFound"),
    RequestThrottled("RequestThrottled"),
    BatchTimedOut("BatchTimedOut"),
    BatchCanceled("BatchCanceled"),
    InvalidInput("InvalidInput"),
    WrongRegionS3Bucket("WrongRegionS3Bucket"),
    WrongRegionS3Output("WrongRegionS3Output"),
    WrongRegionRobotApplication("WrongRegionRobotApplication"),
    WrongRegionSimulationApplication("WrongRegionSimulationApplication"),
    UploadContentMismatchError("UploadContentMismatchError");

    private String value;

    private SimulationJobErrorCode(String value) {
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
     * @return SimulationJobErrorCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SimulationJobErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SimulationJobErrorCode enumEntry : SimulationJobErrorCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
