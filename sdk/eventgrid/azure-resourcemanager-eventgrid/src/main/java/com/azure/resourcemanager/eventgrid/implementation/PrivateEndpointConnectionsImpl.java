// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpointConnection;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpointConnections;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpointConnectionsParentType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public PrivateEndpointConnectionsImpl(
        PrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateEndpointConnection get(
        String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType,
        String parentName,
        String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().get(resourceGroupName, parentType, parentName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType,
        String parentName,
        String privateEndpointConnectionName,
        Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, parentType, parentName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection update(
        String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType,
        String parentName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    parentType,
                    parentName,
                    privateEndpointConnectionName,
                    privateEndpointConnection);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection update(
        String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType,
        String parentName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        Context context) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    parentType,
                    parentName,
                    privateEndpointConnectionName,
                    privateEndpointConnection,
                    context);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType,
        String parentName,
        String privateEndpointConnectionName) {
        this.serviceClient().delete(resourceGroupName, parentType, parentName, privateEndpointConnectionName);
    }

    public void delete(
        String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType,
        String parentName,
        String privateEndpointConnectionName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, parentType, parentName, privateEndpointConnectionName, context);
    }

    public PagedIterable<PrivateEndpointConnection> listByResource(
        String resourceGroupName, PrivateEndpointConnectionsParentType parentType, String parentName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listByResource(resourceGroupName, parentType, parentName);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> listByResource(
        String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType,
        String parentName,
        String filter,
        Integer top,
        Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listByResource(resourceGroupName, parentType, parentName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }
}