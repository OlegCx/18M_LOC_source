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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The OpsItem already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemAlreadyExistsException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    private String opsItemId;

    /**
     * Constructs a new OpsItemAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OpsItemAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * @param opsItemId
     */

    @com.fasterxml.jackson.annotation.JsonProperty("OpsItemId")
    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("OpsItemId")
    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * @param opsItemId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemAlreadyExistsException withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

}
