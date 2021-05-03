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
package com.amazonaws.services.xray.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource was not found. Verify that the name or Amazon Resource Name (ARN) of the resource is correct.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.xray.model.AWSXRayException {
    private static final long serialVersionUID = 1L;

    private String resourceName;

    /**
     * Constructs a new ResourceNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * @param resourceName
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @param resourceName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
