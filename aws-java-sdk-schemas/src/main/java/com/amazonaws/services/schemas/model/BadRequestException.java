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
package com.amazonaws.services.schemas.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestException extends com.amazonaws.services.schemas.model.AWSSchemasException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String code;

    /**
     * Constructs a new BadRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException withCode(String code) {
        setCode(code);
        return this;
    }

}
