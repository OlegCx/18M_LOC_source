// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueAttachmentContractInner;
import com.azure.resourcemanager.apimanagement.models.IssueAttachmentContract;

public final class IssueAttachmentContractImpl
    implements IssueAttachmentContract, IssueAttachmentContract.Definition, IssueAttachmentContract.Update {
    private IssueAttachmentContractInner innerObject;

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

    public String title() {
        return this.innerModel().title();
    }

    public String contentFormat() {
        return this.innerModel().contentFormat();
    }

    public String content() {
        return this.innerModel().content();
    }

    public IssueAttachmentContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String apiId;

    private String issueId;

    private String attachmentId;

    private String createIfMatch;

    private String updateIfMatch;

    public IssueAttachmentContractImpl withExistingIssue(
        String resourceGroupName, String serviceName, String apiId, String issueId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        this.issueId = issueId;
        return this;
    }

    public IssueAttachmentContract create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiIssueAttachments()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serviceName,
                    apiId,
                    issueId,
                    attachmentId,
                    this.innerModel(),
                    createIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public IssueAttachmentContract create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiIssueAttachments()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serviceName,
                    apiId,
                    issueId,
                    attachmentId,
                    this.innerModel(),
                    createIfMatch,
                    context)
                .getValue();
        return this;
    }

    IssueAttachmentContractImpl(
        String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new IssueAttachmentContractInner();
        this.serviceManager = serviceManager;
        this.attachmentId = name;
        this.createIfMatch = null;
    }

    public IssueAttachmentContractImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public IssueAttachmentContract apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiIssueAttachments()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serviceName,
                    apiId,
                    issueId,
                    attachmentId,
                    this.innerModel(),
                    updateIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public IssueAttachmentContract apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiIssueAttachments()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serviceName,
                    apiId,
                    issueId,
                    attachmentId,
                    this.innerModel(),
                    updateIfMatch,
                    context)
                .getValue();
        return this;
    }

    IssueAttachmentContractImpl(
        IssueAttachmentContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
        this.apiId = Utils.getValueFromIdByName(innerObject.id(), "apis");
        this.issueId = Utils.getValueFromIdByName(innerObject.id(), "issues");
        this.attachmentId = Utils.getValueFromIdByName(innerObject.id(), "attachments");
    }

    public IssueAttachmentContract refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiIssueAttachments()
                .getWithResponse(resourceGroupName, serviceName, apiId, issueId, attachmentId, Context.NONE)
                .getValue();
        return this;
    }

    public IssueAttachmentContract refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiIssueAttachments()
                .getWithResponse(resourceGroupName, serviceName, apiId, issueId, attachmentId, context)
                .getValue();
        return this;
    }

    public IssueAttachmentContractImpl withTitle(String title) {
        this.innerModel().withTitle(title);
        return this;
    }

    public IssueAttachmentContractImpl withContentFormat(String contentFormat) {
        this.innerModel().withContentFormat(contentFormat);
        return this;
    }

    public IssueAttachmentContractImpl withContent(String content) {
        this.innerModel().withContent(content);
        return this;
    }

    public IssueAttachmentContractImpl withIfMatch(String ifMatch) {
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