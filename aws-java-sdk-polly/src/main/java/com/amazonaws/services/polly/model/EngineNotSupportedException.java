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
package com.amazonaws.services.polly.model;

import javax.annotation.Generated;

/**
 * <p>
 * This engine is not compatible with the voice that you have designated. Choose a new voice that is compatible with the
 * engine or change the engine and restart the operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineNotSupportedException extends com.amazonaws.services.polly.model.AmazonPollyException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new EngineNotSupportedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public EngineNotSupportedException(String message) {
        super(message);
    }

}
