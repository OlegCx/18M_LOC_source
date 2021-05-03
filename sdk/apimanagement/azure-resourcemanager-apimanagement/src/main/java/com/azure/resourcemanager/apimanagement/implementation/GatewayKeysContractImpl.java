// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.GatewayKeysContractInner;
import com.azure.resourcemanager.apimanagement.models.GatewayKeysContract;

public final class GatewayKeysContractImpl implements GatewayKeysContract {
    private GatewayKeysContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    GatewayKeysContractImpl(
        GatewayKeysContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primary() {
        return this.innerModel().primary();
    }

    public String secondary() {
        return this.innerModel().secondary();
    }

    public GatewayKeysContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}