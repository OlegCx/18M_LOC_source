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
package com.amazonaws.services.iot1clickdevices.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PreconditionFailedException extends com.amazonaws.services.iot1clickdevices.model.AWSIoT1ClickDevicesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * 412
     * </p>
     */
    private String code;

    /**
     * Constructs a new PreconditionFailedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public PreconditionFailedException(String message) {
        super(message);
    }

    /**
     * <p>
     * 412
     * </p>
     * 
     * @param code
     *        412
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * 412
     * </p>
     * 
     * @return 412
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * 412
     * </p>
     * 
     * @param code
     *        412
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreconditionFailedException withCode(String code) {
        setCode(code);
        return this;
    }

}
