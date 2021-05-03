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
package com.amazonaws.services.kinesisanalyticsv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * Exception thrown as a result of concurrent modifications to an application. This error can be the result of
 * attempting to modify an application without using the current application ID.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConcurrentModificationException extends com.amazonaws.services.kinesisanalyticsv2.model.AmazonKinesisAnalyticsV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConcurrentModificationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConcurrentModificationException(String message) {
        super(message);
    }

}
