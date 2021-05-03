// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.implementation;

import com.azure.resourcemanager.hanaonazure.fluent.models.OperationInner;
import com.azure.resourcemanager.hanaonazure.models.Display;
import com.azure.resourcemanager.hanaonazure.models.Operation;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.hanaonazure.HanaManager serviceManager;

    OperationImpl(OperationInner innerObject, com.azure.resourcemanager.hanaonazure.HanaManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Display display() {
        return this.innerModel().display();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hanaonazure.HanaManager manager() {
        return this.serviceManager;
    }
}