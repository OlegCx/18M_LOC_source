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
package com.amazonaws.services.apigatewayv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource specified in the request was not found. See the message field for more information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotFoundException extends com.amazonaws.services.apigatewayv2.model.AmazonApiGatewayV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new NotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
