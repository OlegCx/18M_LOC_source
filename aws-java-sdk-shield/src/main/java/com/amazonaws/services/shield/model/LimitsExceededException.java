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
package com.amazonaws.services.shield.model;

import javax.annotation.Generated;

/**
 * <p>
 * Exception that indicates that the operation would exceed a limit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LimitsExceededException extends com.amazonaws.services.shield.model.AWSShieldException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of limit that would be exceeded.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The threshold that would be exceeded.
     * </p>
     */
    private Long limit;

    /**
     * Constructs a new LimitsExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LimitsExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * The type of limit that would be exceeded.
     * </p>
     * 
     * @param type
     *        The type of limit that would be exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of limit that would be exceeded.
     * </p>
     * 
     * @return The type of limit that would be exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of limit that would be exceeded.
     * </p>
     * 
     * @param type
     *        The type of limit that would be exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LimitsExceededException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The threshold that would be exceeded.
     * </p>
     * 
     * @param limit
     *        The threshold that would be exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The threshold that would be exceeded.
     * </p>
     * 
     * @return The threshold that would be exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Limit")
    public Long getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The threshold that would be exceeded.
     * </p>
     * 
     * @param limit
     *        The threshold that would be exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LimitsExceededException withLimit(Long limit) {
        setLimit(limit);
        return this;
    }

}
