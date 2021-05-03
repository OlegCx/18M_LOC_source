// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.fluent.CachesClient;
import com.azure.resourcemanager.storagecache.fluent.models.CacheInner;
import com.azure.resourcemanager.storagecache.models.Cache;
import com.azure.resourcemanager.storagecache.models.Caches;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CachesImpl implements Caches {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CachesImpl.class);

    private final CachesClient innerClient;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    public CachesImpl(
        CachesClient innerClient, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Cache> list() {
        PagedIterable<CacheInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new CacheImpl(inner1, this.manager()));
    }

    public PagedIterable<Cache> list(Context context) {
        PagedIterable<CacheInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new CacheImpl(inner1, this.manager()));
    }

    public PagedIterable<Cache> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CacheInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new CacheImpl(inner1, this.manager()));
    }

    public PagedIterable<Cache> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CacheInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new CacheImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String cacheName) {
        this.serviceClient().delete(resourceGroupName, cacheName);
    }

    public void delete(String resourceGroupName, String cacheName, Context context) {
        this.serviceClient().delete(resourceGroupName, cacheName, context);
    }

    public Cache getByResourceGroup(String resourceGroupName, String cacheName) {
        CacheInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, cacheName);
        if (inner != null) {
            return new CacheImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Cache> getByResourceGroupWithResponse(String resourceGroupName, String cacheName, Context context) {
        Response<CacheInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, cacheName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CacheImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void debugInfo(String resourceGroupName, String cacheName) {
        this.serviceClient().debugInfo(resourceGroupName, cacheName);
    }

    public void debugInfo(String resourceGroupName, String cacheName, Context context) {
        this.serviceClient().debugInfo(resourceGroupName, cacheName, context);
    }

    public void flush(String resourceGroupName, String cacheName) {
        this.serviceClient().flush(resourceGroupName, cacheName);
    }

    public void flush(String resourceGroupName, String cacheName, Context context) {
        this.serviceClient().flush(resourceGroupName, cacheName, context);
    }

    public void start(String resourceGroupName, String cacheName) {
        this.serviceClient().start(resourceGroupName, cacheName);
    }

    public void start(String resourceGroupName, String cacheName, Context context) {
        this.serviceClient().start(resourceGroupName, cacheName, context);
    }

    public void stop(String resourceGroupName, String cacheName) {
        this.serviceClient().stop(resourceGroupName, cacheName);
    }

    public void stop(String resourceGroupName, String cacheName, Context context) {
        this.serviceClient().stop(resourceGroupName, cacheName, context);
    }

    public void upgradeFirmware(String resourceGroupName, String cacheName) {
        this.serviceClient().upgradeFirmware(resourceGroupName, cacheName);
    }

    public void upgradeFirmware(String resourceGroupName, String cacheName, Context context) {
        this.serviceClient().upgradeFirmware(resourceGroupName, cacheName, context);
    }

    public Cache getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String cacheName = Utils.getValueFromIdByName(id, "caches");
        if (cacheName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'caches'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cacheName, Context.NONE).getValue();
    }

    public Response<Cache> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String cacheName = Utils.getValueFromIdByName(id, "caches");
        if (cacheName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'caches'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cacheName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String cacheName = Utils.getValueFromIdByName(id, "caches");
        if (cacheName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'caches'.", id)));
        }
        this.delete(resourceGroupName, cacheName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String cacheName = Utils.getValueFromIdByName(id, "caches");
        if (cacheName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'caches'.", id)));
        }
        this.delete(resourceGroupName, cacheName, context);
    }

    private CachesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }

    public CacheImpl define(String name) {
        return new CacheImpl(name, this.manager());
    }
}