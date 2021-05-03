// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.CreateRunResponseInner;
import com.azure.resourcemanager.datafactory.models.CreateRunResponse;

public final class CreateRunResponseImpl implements CreateRunResponse {
    private CreateRunResponseInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    CreateRunResponseImpl(
        CreateRunResponseInner innerObject, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String runId() {
        return this.innerModel().runId();
    }

    public CreateRunResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}