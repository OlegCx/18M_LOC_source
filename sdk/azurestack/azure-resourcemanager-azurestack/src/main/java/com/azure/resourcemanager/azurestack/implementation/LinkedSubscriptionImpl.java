// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.LinkedSubscriptionInner;
import com.azure.resourcemanager.azurestack.models.LinkedSubscription;
import com.azure.resourcemanager.azurestack.models.LinkedSubscriptionParameter;
import com.azure.resourcemanager.azurestack.models.Location;
import java.util.Collections;
import java.util.Map;

public final class LinkedSubscriptionImpl
    implements LinkedSubscription, LinkedSubscription.Definition, LinkedSubscription.Update {
    private LinkedSubscriptionInner innerObject;

    private final com.azure.resourcemanager.azurestack.AzureStackManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String linkedSubscriptionId() {
        return this.innerModel().linkedSubscriptionId();
    }

    public String registrationResourceId() {
        return this.innerModel().registrationResourceId();
    }

    public String deviceId() {
        return this.innerModel().deviceId();
    }

    public String deviceObjectId() {
        return this.innerModel().deviceObjectId();
    }

    public String deviceLinkState() {
        return this.innerModel().deviceLinkState();
    }

    public String lastConnectedTime() {
        return this.innerModel().lastConnectedTime();
    }

    public String deviceConnectionStatus() {
        return this.innerModel().deviceConnectionStatus();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public LinkedSubscriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.AzureStackManager manager() {
        return this.serviceManager;
    }

    private String resourceGroup;

    private String linkedSubscriptionName;

    private LinkedSubscriptionParameter createResource;

    private LinkedSubscriptionParameter updateResource;

    public LinkedSubscriptionImpl withExistingResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    public LinkedSubscription create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedSubscriptions()
                .createOrUpdateWithResponse(resourceGroup, linkedSubscriptionName, createResource, Context.NONE)
                .getValue();
        return this;
    }

    public LinkedSubscription create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedSubscriptions()
                .createOrUpdateWithResponse(resourceGroup, linkedSubscriptionName, createResource, context)
                .getValue();
        return this;
    }

    LinkedSubscriptionImpl(String name, com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerObject = new LinkedSubscriptionInner();
        this.serviceManager = serviceManager;
        this.linkedSubscriptionName = name;
        this.createResource = new LinkedSubscriptionParameter();
    }

    public LinkedSubscriptionImpl update() {
        this.updateResource = new LinkedSubscriptionParameter();
        return this;
    }

    public LinkedSubscription apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedSubscriptions()
                .updateWithResponse(resourceGroup, linkedSubscriptionName, updateResource, Context.NONE)
                .getValue();
        return this;
    }

    public LinkedSubscription apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedSubscriptions()
                .updateWithResponse(resourceGroup, linkedSubscriptionName, updateResource, context)
                .getValue();
        return this;
    }

    LinkedSubscriptionImpl(
        LinkedSubscriptionInner innerObject, com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroup = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.linkedSubscriptionName = Utils.getValueFromIdByName(innerObject.id(), "linkedSubscriptions");
    }

    public LinkedSubscription refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedSubscriptions()
                .getByResourceGroupWithResponse(resourceGroup, linkedSubscriptionName, Context.NONE)
                .getValue();
        return this;
    }

    public LinkedSubscription refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedSubscriptions()
                .getByResourceGroupWithResponse(resourceGroup, linkedSubscriptionName, context)
                .getValue();
        return this;
    }

    public LinkedSubscriptionImpl withLocation(Location location) {
        this.createResource.withLocation(location);
        return this;
    }

    public LinkedSubscriptionImpl withLinkedSubscriptionId(String linkedSubscriptionId) {
        if (isInCreateMode()) {
            this.createResource.withLinkedSubscriptionId(linkedSubscriptionId);
            return this;
        } else {
            this.updateResource.withLinkedSubscriptionId(linkedSubscriptionId);
            return this;
        }
    }

    public LinkedSubscriptionImpl withRegistrationResourceId(String registrationResourceId) {
        if (isInCreateMode()) {
            this.createResource.withRegistrationResourceId(registrationResourceId);
            return this;
        } else {
            this.updateResource.withRegistrationResourceId(registrationResourceId);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}