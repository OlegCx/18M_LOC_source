// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ApiIssuesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiIssues;
import com.azure.resourcemanager.apimanagement.models.ApiIssuesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ApiIssuesGetResponse;
import com.azure.resourcemanager.apimanagement.models.IssueContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ApiIssuesImpl implements ApiIssues {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiIssuesImpl.class);

    private final ApiIssuesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ApiIssuesImpl(
        ApiIssuesClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IssueContract> listByService(String resourceGroupName, String serviceName, String apiId) {
        PagedIterable<IssueContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, apiId);
        return Utils.mapPage(inner, inner1 -> new IssueContractImpl(inner1, this.manager()));
    }

    public PagedIterable<IssueContract> listByService(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Boolean expandCommentsAttachments,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<IssueContractInner> inner =
            this
                .serviceClient()
                .listByService(
                    resourceGroupName, serviceName, apiId, filter, expandCommentsAttachments, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new IssueContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String apiId, String issueId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, apiId, issueId);
    }

    public ApiIssuesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String apiId, String issueId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, apiId, issueId, context);
    }

    public IssueContract get(String resourceGroupName, String serviceName, String apiId, String issueId) {
        IssueContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, apiId, issueId);
        if (inner != null) {
            return new IssueContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IssueContract> getWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        Boolean expandCommentsAttachments,
        Context context) {
        ApiIssuesGetResponse inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serviceName, apiId, issueId, expandCommentsAttachments, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IssueContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String apiId, String issueId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, apiId, issueId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String apiId, String issueId, String ifMatch, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serviceName, apiId, issueId, ifMatch, context);
    }

    public IssueContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String issueId = Utils.getValueFromIdByName(id, "issues");
        if (issueId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'issues'.", id)));
        }
        Boolean localExpandCommentsAttachments = null;
        return this
            .getWithResponse(
                resourceGroupName, serviceName, apiId, issueId, localExpandCommentsAttachments, Context.NONE)
            .getValue();
    }

    public Response<IssueContract> getByIdWithResponse(String id, Boolean expandCommentsAttachments, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String issueId = Utils.getValueFromIdByName(id, "issues");
        if (issueId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'issues'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, apiId, issueId, expandCommentsAttachments, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String issueId = Utils.getValueFromIdByName(id, "issues");
        if (issueId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'issues'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, apiId, issueId, localIfMatch, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String issueId = Utils.getValueFromIdByName(id, "issues");
        if (issueId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'issues'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, apiId, issueId, ifMatch, context);
    }

    private ApiIssuesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public IssueContractImpl define(String name) {
        return new IssueContractImpl(name, this.manager());
    }
}