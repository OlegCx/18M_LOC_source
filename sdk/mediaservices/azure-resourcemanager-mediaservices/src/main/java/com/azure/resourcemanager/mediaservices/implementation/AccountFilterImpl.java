// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.AccountFilterInner;
import com.azure.resourcemanager.mediaservices.models.AccountFilter;
import com.azure.resourcemanager.mediaservices.models.FilterTrackSelection;
import com.azure.resourcemanager.mediaservices.models.FirstQuality;
import com.azure.resourcemanager.mediaservices.models.PresentationTimeRange;
import java.util.Collections;
import java.util.List;

public final class AccountFilterImpl implements AccountFilter, AccountFilter.Definition, AccountFilter.Update {
    private AccountFilterInner innerObject;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public PresentationTimeRange presentationTimeRange() {
        return this.innerModel().presentationTimeRange();
    }

    public FirstQuality firstQuality() {
        return this.innerModel().firstQuality();
    }

    public List<FilterTrackSelection> tracks() {
        List<FilterTrackSelection> inner = this.innerModel().tracks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AccountFilterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String filterName;

    public AccountFilterImpl withExistingMediaService(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public AccountFilter create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccountFilters()
                .createOrUpdateWithResponse(resourceGroupName, accountName, filterName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AccountFilter create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccountFilters()
                .createOrUpdateWithResponse(resourceGroupName, accountName, filterName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AccountFilterImpl(String name, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = new AccountFilterInner();
        this.serviceManager = serviceManager;
        this.filterName = name;
    }

    public AccountFilterImpl update() {
        return this;
    }

    public AccountFilter apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccountFilters()
                .updateWithResponse(resourceGroupName, accountName, filterName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AccountFilter apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccountFilters()
                .updateWithResponse(resourceGroupName, accountName, filterName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AccountFilterImpl(
        AccountFilterInner innerObject, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaServices");
        this.filterName = Utils.getValueFromIdByName(innerObject.id(), "accountFilters");
    }

    public AccountFilter refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccountFilters()
                .getWithResponse(resourceGroupName, accountName, filterName, Context.NONE)
                .getValue();
        return this;
    }

    public AccountFilter refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccountFilters()
                .getWithResponse(resourceGroupName, accountName, filterName, context)
                .getValue();
        return this;
    }

    public AccountFilterImpl withPresentationTimeRange(PresentationTimeRange presentationTimeRange) {
        this.innerModel().withPresentationTimeRange(presentationTimeRange);
        return this;
    }

    public AccountFilterImpl withFirstQuality(FirstQuality firstQuality) {
        this.innerModel().withFirstQuality(firstQuality);
        return this;
    }

    public AccountFilterImpl withTracks(List<FilterTrackSelection> tracks) {
        this.innerModel().withTracks(tracks);
        return this;
    }
}