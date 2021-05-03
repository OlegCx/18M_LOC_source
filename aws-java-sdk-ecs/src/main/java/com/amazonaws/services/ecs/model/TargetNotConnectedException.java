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
package com.amazonaws.services.ecs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The target container is not properly configured with the execute command agent or the container is no longer active
 * or running.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetNotConnectedException extends com.amazonaws.services.ecs.model.AmazonECSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TargetNotConnectedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TargetNotConnectedException(String message) {
        super(message);
    }

}
