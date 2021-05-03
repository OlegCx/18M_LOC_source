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
package com.amazonaws.services.chime.model;

import javax.annotation.Generated;

/**
 * <p>
 * The client is permanently forbidden from making the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForbiddenException extends com.amazonaws.services.chime.model.AmazonChimeException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * Constructs a new ForbiddenException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ForbiddenException(String message) {
        super(message);
    }

    /**
     * @param code
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ForbiddenException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ForbiddenException withCode(ErrorCode code) {
        this.code = code.toString();
        return this;
    }

}
