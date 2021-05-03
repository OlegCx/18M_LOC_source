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
 * The specified sync name was not found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncNotFoundException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    private String syncName;

    private String syncType;

    /**
     * Constructs a new ResourceDataSyncNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceDataSyncNotFoundException(String message) {
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

    public ResourceDataSyncNotFoundException withSyncName(String syncName) {
        setSyncName(syncName);
        return this;
    }

    /**
     * @param syncType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SyncType")
    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SyncType")
    public String getSyncType() {
        return this.syncType;
    }

    /**
     * @param syncType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncNotFoundException withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

}
