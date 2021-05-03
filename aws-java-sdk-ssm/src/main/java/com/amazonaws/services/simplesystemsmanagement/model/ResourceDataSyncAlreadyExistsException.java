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
 * A sync configuration with the same name already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncAlreadyExistsException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    private String syncName;

    /**
     * Constructs a new ResourceDataSyncAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceDataSyncAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * @param syncName
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SyncName")
    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SyncName")
    public String getSyncName() {
        return this.syncName;
    }

    /**
     * @param syncName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncAlreadyExistsException withSyncName(String syncName) {
        setSyncName(syncName);
        return this;
    }

}
