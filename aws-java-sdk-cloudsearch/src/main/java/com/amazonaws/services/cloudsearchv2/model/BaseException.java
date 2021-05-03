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
package com.amazonaws.services.cloudsearchv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * An error occurred while processing the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaseException extends com.amazonaws.services.cloudsearchv2.model.AmazonCloudSearchException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * Constructs a new BaseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BaseException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaseException withCode(String code) {
        setCode(code);
        return this;
    }

}
