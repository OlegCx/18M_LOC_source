// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.PoolsClient;
import com.azure.resourcemanager.netapp.fluent.models.CapacityPoolInner;
import com.azure.resourcemanager.netapp.models.CapacityPool;
import com.azure.resourcemanager.netapp.models.Pools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PoolsImpl implements Pools {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PoolsImpl.class);

    private final PoolsClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public PoolsImpl(PoolsClient innerClient, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CapacityPool> list(String resourceGroupName, String accountName) {
        PagedIterable<CapacityPoolInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new CapacityPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<CapacityPool> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<CapacityPoolInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new CapacityPoolImpl(inner1, this.manager()));
    }

    public CapacityPool get(String resourceGroupName, String accountName, String poolName) {
        CapacityPoolInner inner = this.serviceClient().get(resourceGroupName, accountName, poolName);
        if (inner != null) {
            return new CapacityPoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CapacityPool> getWithResponse(
        String resourceGroupName, String accountName, String poolName, Context context) {
        Response<CapacityPoolInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, poolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CapacityPoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String poolName) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName);
    }

    public void delete(String resourceGroupName, String accountName, String poolName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, context);
    }

    public CapacityPool getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, Context.NONE).getValue();
    }

    public Response<CapacityPool> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, context);
    }

    private PoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public CapacityPoolImpl define(String name) {
        return new CapacityPoolImpl(name, this.manager());
    }
}