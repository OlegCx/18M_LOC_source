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
package com.amazonaws.services.devicefarm.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request doesn't comply with the AWS Identity and Access Management (IAM) tag policy. Correct your request and
 * then retry it.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagPolicyException extends com.amazonaws.services.devicefarm.model.AWSDeviceFarmException {
    private static final long serialVersionUID = 1L;

    private String resourceName;

    /**
     * Constructs a new TagPolicyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TagPolicyException(String message) {
        super(message);
    }

    /**
     * @param resourceName
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @param resourceName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagPolicyException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
