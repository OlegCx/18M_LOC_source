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
package com.amazonaws.services.iotsitewise.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceAlreadyExistsException extends com.amazonaws.services.iotsitewise.model.AWSIoTSiteWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the resource that already exists.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The ARN of the resource that already exists.
     * </p>
     */
    private String resourceArn;

    /**
     * Constructs a new ResourceAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ID of the resource that already exists.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that already exists.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource that already exists.
     * </p>
     * 
     * @return The ID of the resource that already exists.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource that already exists.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that already exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceAlreadyExistsException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that already exists.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource that already exists.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceArn")
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource that already exists.
     * </p>
     * 
     * @return The ARN of the resource that already exists.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceArn")
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource that already exists.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource that already exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceAlreadyExistsException withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

}
