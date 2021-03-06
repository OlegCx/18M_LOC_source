// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.resourcemanager.iothub.IotHubManager;
import com.azure.resourcemanager.iothub.fluent.models.IotHubQuotaMetricInfoInner;
import com.azure.resourcemanager.iothub.models.IotHubQuotaMetricInfo;

public final class IotHubQuotaMetricInfoImpl implements IotHubQuotaMetricInfo {
    private IotHubQuotaMetricInfoInner innerObject;

    private final IotHubManager serviceManager;

    IotHubQuotaMetricInfoImpl(IotHubQuotaMetricInfoInner innerObject, IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Long currentValue() {
        return this.innerModel().currentValue();
    }

    public Long maxValue() {
        return this.innerModel().maxValue();
    }

    public IotHubQuotaMetricInfoInner innerModel() {
        return this.innerObject;
    }

    private IotHubManager manager() {
        return this.serviceManager;
    }
}
