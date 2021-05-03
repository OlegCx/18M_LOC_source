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
package com.amazonaws.services.mturk.model;

import javax.annotation.Generated;

/**
 * <p>
 * Your request is invalid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestErrorException extends com.amazonaws.services.mturk.model.AmazonMTurkException {
    private static final long serialVersionUID = 1L;

    private String turkErrorCode;

    /**
     * Constructs a new RequestErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RequestErrorException(String message) {
        super(message);
    }

    /**
     * @param turkErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("TurkErrorCode")
    public void setTurkErrorCode(String turkErrorCode) {
        this.turkErrorCode = turkErrorCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("TurkErrorCode")
    public String getTurkErrorCode() {
        return this.turkErrorCode;
    }

    /**
     * @param turkErrorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestErrorException withTurkErrorCode(String turkErrorCode) {
        setTurkErrorCode(turkErrorCode);
        return this;
    }

}
