// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolWorkloadGroupsClient;
import com.azure.resourcemanager.synapse.fluent.models.WorkloadGroupInner;
import com.azure.resourcemanager.synapse.models.SqlPoolWorkloadGroups;
import com.azure.resourcemanager.synapse.models.WorkloadGroup;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolWorkloadGroupsImpl implements SqlPoolWorkloadGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolWorkloadGroupsImpl.class);

    private final SqlPoolWorkloadGroupsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SqlPoolWorkloadGroupsImpl(
        SqlPoolWorkloadGroupsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public WorkloadGroup get(
        String resourceGroupName, String workspaceName, String sqlPoolName, String workloadGroupName) {
        WorkloadGroupInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName);
        if (inner != null) {
            return new WorkloadGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkloadGroup> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, String workloadGroupName, Context context) {
        Response<WorkloadGroupInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkloadGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String sqlPoolName, String workloadGroupName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName);
    }

    public void delete(
        String resourceGroupName, String workspaceName, String sqlPoolName, String workloadGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName, context);
    }

    public PagedIterable<WorkloadGroup> list(String resourceGroupName, String workspaceName, String sqlPoolName) {
        PagedIterable<WorkloadGroupInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName);
        return Utils.mapPage(inner, inner1 -> new WorkloadGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkloadGroup> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        PagedIterable<WorkloadGroupInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName, context);
        return Utils.mapPage(inner, inner1 -> new WorkloadGroupImpl(inner1, this.manager()));
    }

    public WorkloadGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName, Context.NONE)
            .getValue();
    }

    public Response<WorkloadGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName, context);
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
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName, Context.NONE);
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
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName, context);
    }

    private SqlPoolWorkloadGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    public WorkloadGroupImpl define(String name) {
        return new WorkloadGroupImpl(name, this.manager());
    }
}