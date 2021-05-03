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
package com.amazonaws.services.ssooidc.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that a request contains an invalid grant. This can occur if a client makes a <a>CreateToken</a> request
 * with an invalid grant type.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidGrantException extends com.amazonaws.services.ssooidc.model.AWSSSOOIDCException {
    private static final long serialVersionUID = 1L;

    private String error;

    private String error_description;

    /**
     * Constructs a new InvalidGrantException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidGrantException(String message) {
        super(message);
    }

    /**
     * @param error
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public String getError() {
        return this.error;
    }

    /**
     * @param error
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidGrantException withError(String error) {
        setError(error);
        return this;
    }

    /**
     * @param error_description
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error_description")
    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error_description")
    public String getError_description() {
        return this.error_description;
    }

    /**
     * @param error_description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidGrantException withError_description(String error_description) {
        setError_description(error_description);
        return this;
    }

}
