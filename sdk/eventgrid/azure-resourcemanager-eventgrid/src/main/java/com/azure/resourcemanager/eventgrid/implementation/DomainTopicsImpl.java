// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.DomainTopicsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainTopicInner;
import com.azure.resourcemanager.eventgrid.models.DomainTopic;
import com.azure.resourcemanager.eventgrid.models.DomainTopics;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DomainTopicsImpl implements DomainTopics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainTopicsImpl.class);

    private final DomainTopicsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public DomainTopicsImpl(
        DomainTopicsClient innerClient, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DomainTopic get(String resourceGroupName, String domainName, String domainTopicName) {
        DomainTopicInner inner = this.serviceClient().get(resourceGroupName, domainName, domainTopicName);
        if (inner != null) {
            return new DomainTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainTopic> getWithResponse(
        String resourceGroupName, String domainName, String domainTopicName, Context context) {
        Response<DomainTopicInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, domainName, domainTopicName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainTopicImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DomainTopic createOrUpdate(String resourceGroupName, String domainName, String domainTopicName) {
        DomainTopicInner inner = this.serviceClient().createOrUpdate(resourceGroupName, domainName, domainTopicName);
        if (inner != null) {
            return new DomainTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DomainTopic createOrUpdate(
        String resourceGroupName, String domainName, String domainTopicName, Context context) {
        DomainTopicInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, domainName, domainTopicName, context);
        if (inner != null) {
            return new DomainTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String domainName, String domainTopicName) {
        this.serviceClient().delete(resourceGroupName, domainName, domainTopicName);
    }

    public void delete(String resourceGroupName, String domainName, String domainTopicName, Context context) {
        this.serviceClient().delete(resourceGroupName, domainName, domainTopicName, context);
    }

    public PagedIterable<DomainTopic> listByDomain(String resourceGroupName, String domainName) {
        PagedIterable<DomainTopicInner> inner = this.serviceClient().listByDomain(resourceGroupName, domainName);
        return Utils.mapPage(inner, inner1 -> new DomainTopicImpl(inner1, this.manager()));
    }

    public PagedIterable<DomainTopic> listByDomain(
        String resourceGroupName, String domainName, String filter, Integer top, Context context) {
        PagedIterable<DomainTopicInner> inner =
            this.serviceClient().listByDomain(resourceGroupName, domainName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new DomainTopicImpl(inner1, this.manager()));
    }

    private DomainTopicsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }
}