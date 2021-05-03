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
package com.amazonaws.services.simpleworkflow.model;

import javax.annotation.Generated;

/**
 * <p>
 * Returned if the domain already exists. You may get this fault if you are registering a domain that is either already
 * registered or deprecated, or if you undeprecate a domain that is currently registered.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainAlreadyExistsException extends com.amazonaws.services.simpleworkflow.model.AmazonSimpleWorkflowException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DomainAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DomainAlreadyExistsException(String message) {
        super(message);
    }

}
