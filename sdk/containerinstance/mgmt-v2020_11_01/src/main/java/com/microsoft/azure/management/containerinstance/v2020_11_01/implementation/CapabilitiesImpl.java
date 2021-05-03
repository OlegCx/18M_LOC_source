/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01.implementation;

import com.microsoft.azure.management.containerinstance.v2020_11_01.Capabilities;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.containerinstance.v2020_11_01.CapabilitiesCapabilities;

class CapabilitiesImpl extends WrapperImpl<CapabilitiesInner> implements Capabilities {
    private final ContainerInstanceManager manager;

    CapabilitiesImpl(CapabilitiesInner inner,  ContainerInstanceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerInstanceManager manager() {
        return this.manager;
    }



    @Override
    public CapabilitiesCapabilities capabilities() {
        return this.inner().capabilities();
    }

    @Override
    public String gpu() {
        return this.inner().gpu();
    }

    @Override
    public String ipAddressType() {
        return this.inner().ipAddressType();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String osType() {
        return this.inner().osType();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

}