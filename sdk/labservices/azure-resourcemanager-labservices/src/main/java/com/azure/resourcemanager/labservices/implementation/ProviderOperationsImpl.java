// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.fluent.ProviderOperationsClient;
import com.azure.resourcemanager.labservices.fluent.models.OperationMetadataInner;
import com.azure.resourcemanager.labservices.models.OperationMetadata;
import com.azure.resourcemanager.labservices.models.ProviderOperations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProviderOperationsImpl implements ProviderOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderOperationsImpl.class);

    private final ProviderOperationsClient innerClient;

    private final com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager;

    public ProviderOperationsImpl(
        ProviderOperationsClient innerClient, com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OperationMetadata> list() {
        PagedIterable<OperationMetadataInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OperationMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationMetadata> list(Context context) {
        PagedIterable<OperationMetadataInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new OperationMetadataImpl(inner1, this.manager()));
    }

    private ProviderOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.labservices.ManagedLabsManager manager() {
        return this.serviceManager;
    }
}