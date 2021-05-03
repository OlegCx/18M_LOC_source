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
package com.amazonaws.services.athena.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that something is wrong with the input to the request. For example, a required parameter may be missing or
 * out of range.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.athena.model.AmazonAthenaException {
    private static final long serialVersionUID = 1L;

    private String athenaErrorCode;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

    /**
     * @param athenaErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("AthenaErrorCode")
    public void setAthenaErrorCode(String athenaErrorCode) {
        this.athenaErrorCode = athenaErrorCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("AthenaErrorCode")
    public String getAthenaErrorCode() {
        return this.athenaErrorCode;
    }

    /**
     * @param athenaErrorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withAthenaErrorCode(String athenaErrorCode) {
        setAthenaErrorCode(athenaErrorCode);
        return this;
    }

}
