// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.TagContractInner;
import com.azure.resourcemanager.apimanagement.models.TagContract;
import com.azure.resourcemanager.apimanagement.models.TagCreateUpdateParameters;

public final class TagContractImpl implements TagContract, TagContract.Definition, TagContract.Update {
    private TagContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public TagContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String tagId;

    private String createIfMatch;

    private TagCreateUpdateParameters createParameters;

    private String updateIfMatch;

    private TagCreateUpdateParameters updateParameters;

    public TagContractImpl withExistingService(String resourceGroupName, String serviceName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        return this;
    }

    public TagContract create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTags()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, tagId, createParameters, createIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public TagContract create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTags()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, tagId, createParameters, createIfMatch, context)
                .getValue();
        return this;
    }

    TagContractImpl(String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new TagContractInner();
        this.serviceManager = serviceManager;
        this.tagId = name;
        this.createIfMatch = null;
        this.createParameters = new TagCreateUpdateParameters();
    }

    public TagContractImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new TagCreateUpdateParameters();
        return this;
    }

    public TagContract apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTags()
                .updateWithResponse(
                    resourceGroupName, serviceName, tagId, updateIfMatch, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public TagContract apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTags()
                .updateWithResponse(resourceGroupName, serviceName, tagId, updateIfMatch, updateParameters, context)
                .getValue();
        return this;
    }

    TagContractImpl(
        TagContractInner innerObject, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
        this.tagId = Utils.getValueFromIdByName(innerObject.id(), "tags");
    }

    public TagContract refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTags()
                .getWithResponse(resourceGroupName, serviceName, tagId, Context.NONE)
                .getValue();
        return this;
    }

    public TagContract refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTags()
                .getWithResponse(resourceGroupName, serviceName, tagId, context)
                .getValue();
        return this;
    }

    public TagContractImpl withDisplayName(String displayName) {
        if (isInCreateMode()) {
            this.createParameters.withDisplayName(displayName);
            return this;
        } else {
            this.updateParameters.withDisplayName(displayName);
            return this;
        }
    }

    public TagContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}